import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class69 {

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lei;")
    private class172 field1219 = new class172();

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lid;")
    public static class149 field1204 = class60.method382("<col=c0ff00>", (byte) 74);

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lid;")
    public static class149 field1200 = class60.method382("scrollen:", (byte) 124);

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[[[B")
    public static byte[][][] field1215 = new byte[4][104][104];

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lmg;")
    public static class264 field1210 = new class264();

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[I")
    public static int[] field1220 = new int[14];

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lid;")
    public static class149 field1222 = class60.method382("(Y", (byte) 28);

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lid;")
    public static class149 field1223 = class60.method382("overlay", (byte) 27);

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lid;")
    public static class149 field1221 = class60.method382(" s(West d-Bconnect-B)3", (byte) 116);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lei;")
    private class172 field1224;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field1203;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[[B")
    public static byte[][] field1199;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[[[I")
    public static int[][][] field1218;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lei;")
    public final class172 method426(int arg0) {
        field1209++;
        class172 var2 = this.field1219.field3172;
        if (this.field1219 == var2) {
            this.field1224 = null;
            return null;
        } else if (arg0 == 104) {
            this.field1224 = var2.field3172;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lei;")
    public final class172 method427(byte arg0) {
        int var2 = -32 / ((arg0 + 61) / 49);
        field1196++;
        class172 var3 = this.field1219.field3172;
        if (this.field1219 == var3) {
            return null;
        } else {
            var3.method1230(24120);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
    public final int method428(int arg0) {
        if (arg0 != -19462) {
            method432(-122);
        }
        field1216++;
        int var2 = 0;
        for (class172 var3 = this.field1219.field3172; var3 != this.field1219; var3 = var3.field3172) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1207++;
        int var7 = arg2;
        int var8 = 0;
        int var9 = arg2 - arg3;
        class253.method1749(arg2, false);
        int var10 = -1;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = -arg2;
        int var12 = var9;
        int var13 = -var9;
        int var14 = -1;
        int[] var15 = class15.field220[arg6];
        if (!arg5) {
            method434((byte) -25, (class149) null, (short) -16, (class149) null, 126, -3, 110L, 36);
        }
        int var16 = arg1 - var9;
        int var17 = arg1 + var9;
        class141.method987(2, arg1 - arg2, var15, var16, arg0);
        class141.method987(2, var16, var15, var17, arg4);
        class141.method987(2, var17, var15, arg1 + arg2, arg0);
        while (var8 < var7) {
            var14 += 2;
            var10 += 2;
            var13 += var10;
            var11 += var14;
            if (var13 >= 0 && var12 >= 1) {
                class73.field1267[var12] = var8;
                var12--;
                var13 -= var12 << 1;
            }
            var8++;
            if (var11 >= 0) {
                var7--;
                if (var9 <= var7) {
                    int[] var18 = class15.field220[arg6 + var7];
                    int[] var19 = class15.field220[arg6 - var7];
                    int var20 = arg1 + var8;
                    int var21 = arg1 - var8;
                    class141.method987(2, var21, var18, var20, arg0);
                    class141.method987(2, var21, var19, var20, arg0);
                } else {
                    int[] var22 = class15.field220[arg6 + var7];
                    int var23 = arg1 + var8;
                    int var24 = arg1 - var8;
                    int var25 = class73.field1267[var7];
                    int var26 = arg1 - var25;
                    int[] var27 = class15.field220[arg6 - var7];
                    int var28 = arg1 + var25;
                    class141.method987(2, var24, var22, var26, arg0);
                    class141.method987(2, var26, var22, var28, arg4);
                    class141.method987(2, var28, var22, var23, arg0);
                    class141.method987(2, var24, var27, var26, arg0);
                    class141.method987(2, var26, var27, var28, arg4);
                    class141.method987(2, var28, var27, var23, arg0);
                }
                var11 -= var7 << 1;
            }
            int[] var29 = class15.field220[arg6 + var8];
            int[] var30 = class15.field220[arg6 - var8];
            int var31 = arg1 + var7;
            int var32 = arg1 - var7;
            if (var9 <= var8) {
                class141.method987(2, var32, var29, var31, arg0);
                class141.method987(2, var32, var30, var31, arg0);
            } else {
                int var33 = var8 <= var12 ? var12 : class73.field1267[var8];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class141.method987(2, var32, var29, var35, arg0);
                class141.method987(2, var35, var29, var34, arg4);
                class141.method987(2, var34, var29, var31, arg0);
                class141.method987(2, var32, var30, var35, arg0);
                class141.method987(2, var35, var30, var34, arg4);
                class141.method987(2, var34, var30, var31, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
    public static final int method430(int arg0, int arg1) {
        field1197++;
        return arg0 == -12457 ? arg1 & 0xFF : -55;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBII)V")
    public static final void method431(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1212++;
        if (arg3 != 8) {
            field1210 = null;
        }
        if (arg0 >= class257.field4496 && arg4 <= class192.field3449 && arg2 >= class224.field3940 && class94.field1655 >= arg1) {
            class168.method1219(arg4, arg2, (byte) 92, arg5, arg1, arg0);
        } else {
            class63.method394(arg0, arg2, arg4, arg1, (byte) 63, arg5);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method432(int arg0) {
        field1206++;
        if (class279.field4987 || class236.field4132 == 2) {
            return;
        }
        try {
            class242.field4261.method1027(class140.field2578, (byte) 55);
        } catch (Throwable var1) {
        }
        if (arg0 != 0) {
            method432(89);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lei;I)V")
    public final void method433(class172 arg0, int arg1) {
        if (arg0.field3178 != null) {
            arg0.method1230(24120);
        }
        arg0.field3172 = this.field1219;
        arg0.field3178 = this.field1219.field3178;
        if (arg1 != -225) {
            field1203 = null;
        }
        arg0.field3178.field3172 = arg0;
        field1198++;
        arg0.field3172.field3178 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLid;SLid;IIJI)V")
    public static final void method434(byte arg0, class149 arg1, short arg2, class149 arg3, int arg4, int arg5, long arg6, int arg7) {
        field1214++;
        if (arg0 < 108) {
            field1205 = 15;
        }
        if (class32.field481 || class60.field1092 >= 500) {
            return;
        }
        class138.field2517[class60.field1092] = arg3;
        class78.field1456[class60.field1092] = arg1;
        class224.field3941[class60.field1092] = arg7 == -1 ? class169.field3134 : arg7;
        class284.field5032[class60.field1092] = arg2;
        class260.field4584[class60.field1092] = arg6;
        class152.field2767[class60.field1092] = arg4;
        class287.field5097[class60.field1092] = arg5;
        class60.field1092++;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public final void method435(byte arg0) {
        if (arg0 > -34) {
            return;
        }
        field1201++;
        while (true) {
            class172 var2 = this.field1219.field3172;
            if (this.field1219 == var2) {
                this.field1224 = null;
                return;
            }
            var2.method1230(24120);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lek;")
    public static final class164 method436(int arg0, int arg1) {
        field1202++;
        class164 var2 = (class164) class171.field3150.method1293((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3324.method1562(arg1 - 809612633, class143.method994(arg1 ^ 0xFFFF9EE6, arg0), class200.method1369(arg0, 1393598983));
        class164 var4 = new class164();
        var4.field3034 = arg0;
        if (var3 != null) {
            var4.method1206((byte) 124, new class74(var3));
        }
        var4.method1202(107);
        if (arg1 != -32) {
            field1222 = null;
        }
        class171.field3150.method1295((long) arg0, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)I")
    public static final int method437(int arg0, byte arg1) {
        if (arg1 >= -116) {
            method437(94, (byte) 112);
        }
        field1208++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Lei;")
    public final class172 method438(boolean arg0) {
        field1213++;
        class172 var2 = this.field1224;
        if (this.field1219 == var2) {
            this.field1224 = null;
            return null;
        }
        if (!arg0) {
            method430(46, 36);
        }
        this.field1224 = var2.field3172;
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static void method439(int arg0) {
        field1215 = null;
        field1203 = null;
        field1199 = null;
        field1200 = null;
        field1221 = null;
        field1220 = null;
        field1218 = null;
        field1204 = null;
        field1223 = null;
        int var1 = 107 / ((1 - arg0) / 57);
        field1222 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class69() {
        this.field1219.field3172 = this.field1219;
        this.field1219.field3178 = this.field1219;
    }
}
