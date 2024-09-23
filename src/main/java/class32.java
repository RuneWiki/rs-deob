import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LEBPILPF")
public class class32 {

    @OriginalMember(owner = "LEBPILPF", name = "a", descriptor = "B")
    private byte field964 = 44;

    @OriginalMember(owner = "LEBPILPF", name = "b", descriptor = "Z")
    private boolean field965 = true;

    @OriginalMember(owner = "LEBPILPF", name = "c", descriptor = "Z")
    private boolean field966 = true;

    @OriginalMember(owner = "LEBPILPF", name = "i", descriptor = "I")
    public int field972 = 65000;

    @OriginalMember(owner = "LEBPILPF", name = "h", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "LEBPILPF", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field969;

    @OriginalMember(owner = "LEBPILPF", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field970;

    @OriginalMember(owner = "LEBPILPF", name = "e", descriptor = "[B")
    public static byte[] field968 = new byte[520];

    @OriginalMember(owner = "LEBPILPF", name = "d", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "LEBPILPF", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;I)V")
    public class32(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field971 = arg4;
        this.field969 = arg1;
        if (arg2 != 6) {
            throw new NullPointerException();
        }
        this.field970 = arg3;
        this.field972 = arg0;
    }

    @OriginalMember(owner = "LEBPILPF", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method291(byte arg0, int arg1) {
        if (this.field964 != arg0) {
            this.field966 = !this.field966;
        }
        try {
            this.method294(this.field970, arg1 * 6, true);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field970.read(field968, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field968[2] & 0xFF) + ((field968[0] & 0xFF) << 16) + ((field968[1] & 0xFF) << 8);
            int var6 = (field968[5] & 0xFF) + ((field968[3] & 0xFF) << 16) + ((field968[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field972) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field969.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method294(this.field969, var6 * 520, true);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field969.read(field968, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field968[0] & 0xFF) << 8) + (field968[1] & 0xFF);
                    int var14 = ((field968[2] & 0xFF) << 8) + (field968[3] & 0xFF);
                    int var15 = (field968[6] & 0xFF) + ((field968[4] & 0xFF) << 16) + ((field968[5] & 0xFF) << 8);
                    int var16 = field968[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field971 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field969.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field968[var17 + 8];
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

    @OriginalMember(owner = "LEBPILPF", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method292(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 3) {
            this.field967 = 34;
        }
        boolean var5 = this.method293(true, arg0, arg1, arg3, 7851);
        if (!var5) {
            var5 = this.method293(false, arg0, arg1, arg3, 7851);
        }
        return var5;
    }

    @OriginalMember(owner = "LEBPILPF", name = "a", descriptor = "(ZI[BII)Z")
    private synchronized boolean method293(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg4 != 7851) {
            this.field967 = -485;
        }
        try {
            int var8;
            if (arg0) {
                this.method294(this.field970, arg3 * 6, true);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field970.read(field968, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field968[5] & 0xFF) + ((field968[3] & 0xFF) << 16) + ((field968[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field969.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field969.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field968[0] = (byte) (arg1 >> 16);
            field968[1] = (byte) (arg1 >> 8);
            field968[2] = (byte) arg1;
            field968[3] = (byte) (var8 >> 16);
            field968[4] = (byte) (var8 >> 8);
            field968[5] = (byte) var8;
            this.method294(this.field970, arg3 * 6, true);
            this.field970.write(field968, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg0) {
                    this.method294(this.field969, var8 * 520, true);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field969.read(field968, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field968[0] & 0xFF) << 8) + (field968[1] & 0xFF);
                            int var15 = ((field968[2] & 0xFF) << 8) + (field968[3] & 0xFF);
                            var11 = (field968[6] & 0xFF) + ((field968[4] & 0xFF) << 16) + ((field968[5] & 0xFF) << 8);
                            int var16 = field968[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field971 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field969.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg0 = false;
                    var11 = (int) ((this.field969.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg1 - var9 <= 512) {
                    var11 = 0;
                }
                field968[0] = (byte) (arg3 >> 8);
                field968[1] = (byte) arg3;
                field968[2] = (byte) (var10 >> 8);
                field968[3] = (byte) var10;
                field968[4] = (byte) (var11 >> 16);
                field968[5] = (byte) (var11 >> 8);
                field968[6] = (byte) var11;
                field968[7] = (byte) this.field971;
                this.method294(this.field969, var8 * 520, true);
                this.field969.write(field968, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field969.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "LEBPILPF", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IZ)V")
    public synchronized void method294(RandomAccessFile arg0, int arg1, boolean arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
        if (!arg2) {
            this.field967 = 3;
        }
    }
}
