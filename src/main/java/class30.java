import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JXARNXDE")
public class class30 {

    @OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "I")
    private int field1068 = 697;

    @OriginalMember(owner = "client!JXARNXDE", name = "b", descriptor = "Z")
    private boolean field1069 = true;

    @OriginalMember(owner = "client!JXARNXDE", name = "d", descriptor = "I")
    private int field1071 = -817;

    @OriginalMember(owner = "client!JXARNXDE", name = "i", descriptor = "I")
    public int field1076 = 65000;

    @OriginalMember(owner = "client!JXARNXDE", name = "h", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!JXARNXDE", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1073;

    @OriginalMember(owner = "client!JXARNXDE", name = "c", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!JXARNXDE", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1074;

    @OriginalMember(owner = "client!JXARNXDE", name = "e", descriptor = "[B")
    public static byte[] field1072 = new byte[520];

    @OriginalMember(owner = "client!JXARNXDE", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public class30(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        this.field1075 = arg3;
        this.field1073 = arg4;
        if (arg1 != 0) {
            this.field1070 = -151;
        }
        this.field1074 = arg2;
        this.field1076 = arg0;
    }

    @OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method300(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1070 = -71;
        }
        try {
            this.method303(this.field1074, arg0 * 6, this.field1069);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1074.read(field1072, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1072[2] & 0xFF) + ((field1072[0] & 0xFF) << 16) + ((field1072[1] & 0xFF) << 8);
            int var6 = (field1072[5] & 0xFF) + ((field1072[3] & 0xFF) << 16) + ((field1072[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1076) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1073.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method303(this.field1073, var6 * 520, this.field1069);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1073.read(field1072, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1072[0] & 0xFF) << 8) + (field1072[1] & 0xFF);
                    int var14 = ((field1072[2] & 0xFF) << 8) + (field1072[3] & 0xFF);
                    int var15 = (field1072[6] & 0xFF) + ((field1072[4] & 0xFF) << 16) + ((field1072[5] & 0xFF) << 8);
                    int var16 = field1072[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1075 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1073.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1072[var17 + 8];
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

    @OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(III[B)Z")
    public synchronized boolean method301(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var5 = this.method302((byte) 0, arg3, arg0, true, arg2);
        int var6 = 96 / arg1;
        if (!var5) {
            var5 = this.method302((byte) 0, arg3, arg0, false, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(B[BIZI)Z")
    private synchronized boolean method302(byte arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 != 0) {
            this.field1071 = 90;
        }
        try {
            int var8;
            if (arg3) {
                this.method303(this.field1074, arg2 * 6, this.field1069);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1074.read(field1072, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1072[5] & 0xFF) + ((field1072[3] & 0xFF) << 16) + ((field1072[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1073.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1073.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1072[0] = (byte) (arg4 >> 16);
            field1072[1] = (byte) (arg4 >> 8);
            field1072[2] = (byte) arg4;
            field1072[3] = (byte) (var8 >> 16);
            field1072[4] = (byte) (var8 >> 8);
            field1072[5] = (byte) var8;
            this.method303(this.field1074, arg2 * 6, this.field1069);
            this.field1074.write(field1072, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg3) {
                    this.method303(this.field1073, var8 * 520, this.field1069);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1073.read(field1072, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1072[0] & 0xFF) << 8) + (field1072[1] & 0xFF);
                            int var15 = ((field1072[2] & 0xFF) << 8) + (field1072[3] & 0xFF);
                            var11 = (field1072[6] & 0xFF) + ((field1072[4] & 0xFF) << 16) + ((field1072[5] & 0xFF) << 8);
                            int var16 = field1072[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field1075 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1073.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field1073.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg4 - var9 <= 512) {
                    var11 = 0;
                }
                field1072[0] = (byte) (arg2 >> 8);
                field1072[1] = (byte) arg2;
                field1072[2] = (byte) (var10 >> 8);
                field1072[3] = (byte) var10;
                field1072[4] = (byte) (var11 >> 16);
                field1072[5] = (byte) (var11 >> 8);
                field1072[6] = (byte) var11;
                field1072[7] = (byte) this.field1075;
                this.method303(this.field1073, var8 * 520, this.field1069);
                this.field1073.write(field1072, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1073.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!JXARNXDE", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IZ)V")
    public synchronized void method303(RandomAccessFile arg0, int arg1, boolean arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
        if (arg2) {
            ;
        }
    }
}
