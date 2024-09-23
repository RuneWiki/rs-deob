import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private int field881 = 18717;

    @OriginalMember(owner = "wb", name = "b", descriptor = "Z")
    private boolean field882 = true;

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    public int field887 = 65000;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field884;

    @OriginalMember(owner = "wb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field885;

    @OriginalMember(owner = "wb", name = "c", descriptor = "[B")
    public static byte[] field883 = new byte[520];

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public FileStream(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        this.field886 = arg3;
        this.field884 = arg2;
        this.field885 = arg4;
        this.field887 = arg1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method301(int arg0, byte arg1) {
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        try {
            this.method304(18717, arg0 * 6, this.field885);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field885.read(field883, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field883[2] & 0xFF) + ((field883[0] & 0xFF) << 16) + ((field883[1] & 0xFF) << 8);
            int var6 = (field883[5] & 0xFF) + ((field883[3] & 0xFF) << 16) + ((field883[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field887) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field884.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method304(18717, var6 * 520, this.field884);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field884.read(field883, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field883[0] & 0xFF) << 8) + (field883[1] & 0xFF);
                    int var14 = ((field883[2] & 0xFF) << 8) + (field883[3] & 0xFF);
                    int var15 = (field883[6] & 0xFF) + ((field883[4] & 0xFF) << 16) + ((field883[5] & 0xFF) << 8);
                    int var16 = field883[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field886 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field884.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field883[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II[BZ)Z")
    public synchronized boolean method302(int arg0, int arg1, byte[] arg2, boolean arg3) {
        boolean var5 = this.method303(arg0, arg1, 8, true, arg2);
        if (!arg3) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method303(arg0, arg1, 8, false, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IIIZ[B)Z")
    private synchronized boolean method303(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg2 != 8) {
            this.field882 = !this.field882;
        }
        try {
            int var8;
            if (arg3) {
                this.method304(18717, arg1 * 6, this.field885);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field885.read(field883, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field883[5] & 0xFF) + ((field883[3] & 0xFF) << 16) + ((field883[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field884.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field884.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field883[0] = (byte) (arg0 >> 16);
            field883[1] = (byte) (arg0 >> 8);
            field883[2] = (byte) arg0;
            field883[3] = (byte) (var8 >> 16);
            field883[4] = (byte) (var8 >> 8);
            field883[5] = (byte) var8;
            this.method304(18717, arg1 * 6, this.field885);
            this.field885.write(field883, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg3) {
                    this.method304(18717, var8 * 520, this.field884);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field884.read(field883, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field883[0] & 0xFF) << 8) + (field883[1] & 0xFF);
                            int var15 = ((field883[2] & 0xFF) << 8) + (field883[3] & 0xFF);
                            var11 = (field883[6] & 0xFF) + ((field883[4] & 0xFF) << 16) + ((field883[5] & 0xFF) << 8);
                            int var16 = field883[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field886 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field884.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field884.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg0 - var9 <= 512) {
                    var11 = 0;
                }
                field883[0] = (byte) (arg1 >> 8);
                field883[1] = (byte) arg1;
                field883[2] = (byte) (var10 >> 8);
                field883[3] = (byte) var10;
                field883[4] = (byte) (var11 >> 16);
                field883[5] = (byte) (var11 >> 8);
                field883[6] = (byte) var11;
                field883[7] = (byte) this.field886;
                this.method304(18717, var8 * 520, this.field884);
                this.field884.write(field883, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field884.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method304(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (this.field881 != arg0) {
            return;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
    }
}
