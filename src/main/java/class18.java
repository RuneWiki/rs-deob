import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HOAULYFF")
public class class18 {

    @OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "I")
    private int field753 = 3;

    @OriginalMember(owner = "client!HOAULYFF", name = "b", descriptor = "Z")
    private boolean field754 = true;

    @OriginalMember(owner = "client!HOAULYFF", name = "c", descriptor = "Z")
    private boolean field755 = false;

    @OriginalMember(owner = "client!HOAULYFF", name = "h", descriptor = "I")
    public int field760 = 65000;

    @OriginalMember(owner = "client!HOAULYFF", name = "g", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!HOAULYFF", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field757;

    @OriginalMember(owner = "client!HOAULYFF", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field758;

    @OriginalMember(owner = "client!HOAULYFF", name = "d", descriptor = "[B")
    public static byte[] field756 = new byte[520];

    @OriginalMember(owner = "client!HOAULYFF", name = "<init>", descriptor = "(IIBLjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
    public class18(int arg0, int arg1, byte arg2, RandomAccessFile arg3, RandomAccessFile arg4) {
        this.field759 = arg1;
        this.field757 = arg3;
        this.field758 = arg4;
        this.field760 = arg0;
        if (arg2 != 7) {
            throw new NullPointerException();
        }
        boolean var6 = false;
    }

    @OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method219(int arg0, int arg1) {
        if (arg0 != 5) {
            this.field754 = !this.field754;
        }
        try {
            this.method222(this.field758, (byte) 4, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field758.read(field756, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field756[2] & 0xFF) + ((field756[0] & 0xFF) << 16) + ((field756[1] & 0xFF) << 8);
            int var6 = (field756[5] & 0xFF) + ((field756[3] & 0xFF) << 16) + ((field756[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field760) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field757.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method222(this.field757, (byte) 4, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field757.read(field756, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field756[0] & 0xFF) << 8) + (field756[1] & 0xFF);
                    int var14 = ((field756[2] & 0xFF) << 8) + (field756[3] & 0xFF);
                    int var15 = (field756[6] & 0xFF) + ((field756[4] & 0xFF) << 16) + ((field756[5] & 0xFF) << 8);
                    int var16 = field756[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field759 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field757.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field756[var17 + 8];
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

    @OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(ZII[B)Z")
    public synchronized boolean method220(boolean arg0, int arg1, int arg2, byte[] arg3) {
        boolean var5 = this.method221(arg1, arg3, arg2, 3, true);
        if (arg0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method221(arg1, arg3, arg2, 3, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(I[BIIZ)Z")
    private synchronized boolean method221(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 < this.field753 || arg3 > this.field753) {
            this.field755 = !this.field755;
        }
        try {
            int var8;
            if (arg4) {
                this.method222(this.field758, (byte) 4, arg2 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field758.read(field756, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field756[5] & 0xFF) + ((field756[3] & 0xFF) << 16) + ((field756[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field757.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field757.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field756[0] = (byte) (arg0 >> 16);
            field756[1] = (byte) (arg0 >> 8);
            field756[2] = (byte) arg0;
            field756[3] = (byte) (var8 >> 16);
            field756[4] = (byte) (var8 >> 8);
            field756[5] = (byte) var8;
            this.method222(this.field758, (byte) 4, arg2 * 6);
            this.field758.write(field756, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg4) {
                    this.method222(this.field757, (byte) 4, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field757.read(field756, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label122: {
                            int var14 = ((field756[0] & 0xFF) << 8) + (field756[1] & 0xFF);
                            int var15 = ((field756[2] & 0xFF) << 8) + (field756[3] & 0xFF);
                            var11 = (field756[6] & 0xFF) + ((field756[4] & 0xFF) << 16) + ((field756[5] & 0xFF) << 8);
                            int var16 = field756[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field759 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field757.length() / 520L) {
                                    break label122;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field757.length() + 519L) / 520L);
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
                field756[0] = (byte) (arg2 >> 8);
                field756[1] = (byte) arg2;
                field756[2] = (byte) (var10 >> 8);
                field756[3] = (byte) var10;
                field756[4] = (byte) (var11 >> 16);
                field756[5] = (byte) (var11 >> 8);
                field756[6] = (byte) var11;
                field756[7] = (byte) this.field759;
                this.method222(this.field757, (byte) 4, var8 * 520);
                this.field757.write(field756, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field757.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!HOAULYFF", name = "a", descriptor = "(Ljava/io/RandomAccessFile;BI)V")
    public synchronized void method222(RandomAccessFile arg0, byte arg1, int arg2) throws IOException {
        if (arg1 == 4) {
            boolean var4 = false;
        } else {
            this.field753 = -444;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg2);
    }
}
