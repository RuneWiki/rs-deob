import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class639 {

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Lmf;")
    private class382 field9020 = new class382(256);

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "Lfa;")
    private class209 field9028;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lhea;")
    private class387 field9026;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field9019 = 0;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[[[Z")
    public static boolean[][][] field9024;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIJ)V")
    public static final void method3554(int arg0, int arg1, int arg2, long arg3) {
        field9017++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        if (arg2 != -713589548) {
            return;
        }
        int var6 = ((int) arg3 & 0x325513) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class229.method1580(arg0, 0, var5, arg1, true, 0, var6, (byte) 51, 0);
            return;
        }
        class550 var8 = class101.field1572.method2617((byte) -117, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field7752;
            var10 = var8.field7733;
        } else {
            var9 = var8.field7733;
            var10 = var8.field7752;
        }
        int var11 = var8.field7766;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class229.method1580(arg0, var10, 0, arg1, true, var9, 0, (byte) 51, var11);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII)I")
    public static final int method3555(int arg0, int arg1, int arg2, int arg3) {
        field9022++;
        if (arg0 < 32) {
            method3555(110, -23, 106, 61);
        }
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg2 >> 1) + (((arg3 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7));
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZI)V")
    public static final void method3556(boolean arg0, int arg1) {
        int var2 = -93 / ((-arg1 - 48) / 34);
        while (class523.field7392.method311((byte) -31, class418.field6098) >= 15) {
            int var3 = class523.field7392.method309((byte) 57, 15);
            if (var3 == 32767) {
                break;
            }
            boolean var4 = false;
            class16 var5 = (class16) class189.field2723.method1405((long) var3, (byte) -64);
            if (var5 == null) {
                class577 var6 = new class577();
                var6.field6216 = var3;
                var5 = new class16(var6);
                class189.field2723.method1403((byte) -18, var5, (long) var3);
                class261.field3968[class428.field6288++] = var5;
                var4 = true;
            }
            class577 var7 = var5.field174;
            class85.field1396[class217.field3042++] = var3;
            var7.field6170 = class564.field7962;
            if (var7.field8121 != null && var7.field8121.method3349(-1337255088)) {
                class84.method742((byte) 14, var7);
            }
            int var8 = class523.field7392.method309((byte) 57, 1);
            if (var8 == 1) {
                class242.field3762[class426.field6275++] = var3;
            }
            int var9;
            if (arg0) {
                var9 = class523.field7392.method309((byte) 57, 8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class523.field7392.method309((byte) 57, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = class523.field7392.method309((byte) 57, 3) + 4 << 11 & 0x3A15;
            var7.method3275(class393.field5824.method362(class523.field7392.method309((byte) 57, 14), (byte) 82), (byte) 97);
            int var11 = class523.field7392.method309((byte) 57, 2);
            int var12;
            if (arg0) {
                var12 = class523.field7392.method309((byte) 57, 8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = class523.field7392.method309((byte) 57, 5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            int var13 = class523.field7392.method309((byte) 57, 1);
            var7.method2548(0, var7.field8121.field8345);
            var7.field6195 = var7.field8121.field8312 << 3;
            if (var4) {
                var7.method2554(var10, (byte) 85, true);
            }
            var7.method3273(class648.field9106.field6271[0] + var12, var7.method2553((byte) 77), var13 == 1, class648.field9106.field6262[0] + var9, var11, false);
            if (var7.field8121.method3349(-1337255088)) {
                class83.method738(var7.field6271[0], var7, var7.field3019, var7.field6262[0], null, -25535, 0, null);
            }
        }
        field9027++;
        class523.field7392.method317(8);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Lvg;")
    public static final class49 method3557(int arg0, int arg1, int arg2) {
        field9023++;
        class49 var3 = class534.method3038(arg2 ^ 0xFFFFFF8C, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1014 == null || arg1 >= var3.field1014.length) {
            return null;
        } else {
            if (arg2 != 1) {
                field9018 = 69;
            }
            return var3.field1014[arg1];
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method3558(byte arg0) {
        field9025++;
        this.field9020.method2290(false, 5);
        if (arg0 >= -38) {
            method3559((byte) 57);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method3559(byte arg0) {
        if (arg0 == 81) {
            field9024 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Loi;")
    public final class65 method3560(byte arg0, int arg1) {
        field9029++;
        Object var3 = this.field9020.method2287(1, (long) arg1);
        if (var3 != null) {
            return (class65) var3;
        } else if (arg0 < 32) {
            return null;
        } else if (this.field9028.method1383(arg1, -28)) {
            class159 var4 = this.field9028.method1386(arg1, -6514);
            int var5 = var4.field2304 ? 64 : this.field9026.field5668;
            class65 var7;
            if (var4.field2287 && this.field9026.method127()) {
                float[] var6 = this.field9028.method1385(var5, false, 0.7F, arg1, 104, var5);
                var7 = this.field9026.method2329(class75.field1306, var5, var6, (byte) 82, var5, var4.field2296 != 0);
            } else {
                int[] var8 = !var4.field2295 && class232.method1598(var4.field2300, (byte) 78) ? this.field9028.method1381(var5, arg1, 0.7F, var5, -96, true) : this.field9028.method1384(false, var5, var5, arg1, 0.7F, (byte) 125);
                var7 = this.field9026.method2363(var5, 0, var4.field2296 != 0, var8, var5);
            }
            var7.method663((byte) -102, var4.field2301, var4.field2285);
            this.field9020.method2291(var7, (long) arg1, 1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method3561(int arg0) {
        field9021++;
        int var2 = 56 % ((arg0 - 30) / 57);
        this.field9020.method2285((byte) -113);
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lhea;Lfa;)V")
    public class639(class387 arg0, class209 arg1) {
        this.field9028 = arg1;
        this.field9026 = arg0;
    }
}
