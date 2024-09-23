import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XGQETHKV")
public class class59 {

    @OriginalMember(owner = "XGQETHKV", name = "a", descriptor = "Z")
    private boolean field1607 = true;

    @OriginalMember(owner = "XGQETHKV", name = "b", descriptor = "Z")
    private boolean field1608 = false;

    @OriginalMember(owner = "XGQETHKV", name = "h", descriptor = "I")
    public int field1613 = 65000;

    @OriginalMember(owner = "XGQETHKV", name = "g", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "XGQETHKV", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1610;

    @OriginalMember(owner = "XGQETHKV", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1611;

    @OriginalMember(owner = "XGQETHKV", name = "c", descriptor = "[B")
    public static byte[] field1609 = new byte[520];

    @OriginalMember(owner = "XGQETHKV", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
    public class59(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field1612 = arg2;
        this.field1610 = arg3;
        if (arg1 != 40916) {
            this.field1607 = !this.field1607;
        }
        this.field1611 = arg0;
        this.field1613 = arg4;
    }

    @OriginalMember(owner = "XGQETHKV", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] method550(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        try {
            this.method553((byte) 88, this.field1611, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1611.read(field1609, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1609[2] & 0xFF) + ((field1609[0] & 0xFF) << 16) + ((field1609[1] & 0xFF) << 8);
            int var6 = (field1609[5] & 0xFF) + ((field1609[3] & 0xFF) << 16) + ((field1609[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1613) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1610.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method553((byte) 88, this.field1610, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1610.read(field1609, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1609[0] & 0xFF) << 8) + (field1609[1] & 0xFF);
                    int var14 = ((field1609[2] & 0xFF) << 8) + (field1609[3] & 0xFF);
                    int var15 = (field1609[6] & 0xFF) + ((field1609[4] & 0xFF) << 16) + ((field1609[5] & 0xFF) << 8);
                    int var16 = field1609[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1612 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1610.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1609[var17 + 8];
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

    @OriginalMember(owner = "XGQETHKV", name = "a", descriptor = "(IZ[BI)Z")
    public synchronized boolean method551(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            throw new NullPointerException();
        }
        boolean var5 = this.method552(true, arg0, arg2, 988, arg3);
        if (!var5) {
            var5 = this.method552(false, arg0, arg2, 988, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "XGQETHKV", name = "a", descriptor = "(ZI[BII)Z")
    private synchronized boolean method552(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        int var6 = 26 / arg3;
        try {
            int var9;
            if (arg0) {
                this.method553((byte) 88, this.field1611, arg4 * 6);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1611.read(field1609, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1609[5] & 0xFF) + ((field1609[3] & 0xFF) << 16) + ((field1609[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1610.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1610.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1609[0] = (byte) (arg1 >> 16);
            field1609[1] = (byte) (arg1 >> 8);
            field1609[2] = (byte) arg1;
            field1609[3] = (byte) (var9 >> 16);
            field1609[4] = (byte) (var9 >> 8);
            field1609[5] = (byte) var9;
            this.method553((byte) 88, this.field1611, arg4 * 6);
            this.field1611.write(field1609, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg1) {
                int var12 = 0;
                if (arg0) {
                    this.method553((byte) 88, this.field1610, var9 * 520);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1610.read(field1609, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field1609[0] & 0xFF) << 8) + (field1609[1] & 0xFF);
                            int var16 = ((field1609[2] & 0xFF) << 8) + (field1609[3] & 0xFF);
                            var12 = (field1609[6] & 0xFF) + ((field1609[4] & 0xFF) << 16) + ((field1609[5] & 0xFF) << 8);
                            int var17 = field1609[7] & 0xFF;
                            if (arg4 == var15 && var11 == var16 && this.field1612 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1610.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg0 = false;
                    var12 = (int) ((this.field1610.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg1 - var10 <= 512) {
                    var12 = 0;
                }
                field1609[0] = (byte) (arg4 >> 8);
                field1609[1] = (byte) arg4;
                field1609[2] = (byte) (var11 >> 8);
                field1609[3] = (byte) var11;
                field1609[4] = (byte) (var12 >> 16);
                field1609[5] = (byte) (var12 >> 8);
                field1609[6] = (byte) var12;
                field1609[7] = (byte) this.field1612;
                this.method553((byte) 88, this.field1610, var9 * 520);
                this.field1610.write(field1609, 0, 8);
                int var18 = arg1 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1610.write(arg2, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "XGQETHKV", name = "a", descriptor = "(BLjava/io/RandomAccessFile;I)V")
    public synchronized void method553(byte arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
        if (arg0 != 88) {
            this.field1608 = !this.field1608;
        }
    }
}
