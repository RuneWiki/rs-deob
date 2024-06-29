import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class183 extends class30 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Lvf;")
    public class48 field3159 = new class48();

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lva;")
    public class172 field3160 = new class172();

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lub;")
    private class8 field3145;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[B")
    public static byte[] field3146 = new byte[520];

    @OriginalMember(owner = "client!de", name = "D", descriptor = "[Lac;")
    public static class188[] field3149 = new class188[256];

    @OriginalMember(owner = "client!de", name = "A", descriptor = "[J")
    public static long[] field3147 = new long[100];

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lhh;")
    public static class38 field3156;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILec;[III)V")
    private final void method1260(int arg0, int arg1, class78 arg2, int[] arg3, int arg4, int arg5) {
        int var7 = 109 / ((arg4 + 72) / 53);
        if ((this.field3145.field183[arg2.field1390] & 0x4) != 0 && arg2.field1401 < 0) {
            int var8 = this.field3145.field141[arg2.field1390] / class253.field4432;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field1395) / var8;
                if (arg1 < var9) {
                    arg2.field1395 += arg1 * var8;
                    break;
                }
                arg1 -= var9;
                int var10 = 262144 / var8;
                arg2.field1398.method56(arg3, arg0, var9);
                arg2.field1395 += var8 * var9 - 1048576;
                arg0 += var9;
                class19 var11 = arg2.field1398;
                int var12 = class253.field4432 / 100;
                if (var10 < var12) {
                    var12 = var10;
                }
                if (this.field3145.field127[arg2.field1390] == 0) {
                    arg2.field1398 = class19.method186(arg2.field1382, var11.method183(), var11.method177(), var11.method197());
                } else {
                    arg2.field1398 = class19.method186(arg2.field1382, var11.method183(), 0, var11.method197());
                    this.field3145.method60(arg2.field1388.field4031[arg2.field1374] < 0, arg2, true);
                    arg2.field1398.method208(var12, var11.method177());
                }
                if (arg2.field1388.field4031[arg2.field1374] < 0) {
                    arg2.field1398.method193(-1);
                }
                var11.method191(var12);
                var11.method56(arg3, arg0, arg5 - arg0);
                if (var11.method189()) {
                    this.field3160.method1215(var11);
                }
            }
        }
        arg2.field1398.method56(arg3, arg0, arg1);
        field3148++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()I")
    public final int method80() {
        field3158++;
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILec;I)V")
    private final void method1261(int arg0, class78 arg1, int arg2) {
        if (arg2 != 256) {
            this.field3160 = null;
        }
        field3154++;
        if ((this.field3145.field183[arg1.field1390] & 0x4) != 0 && arg1.field1401 < 0) {
            int var4 = this.field3145.field141[arg1.field1390] / class253.field4432;
            int var5 = (var4 + 1048575 - arg1.field1395) / var4;
            arg1.field1395 = arg0 * var4 + arg1.field1395 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3145.field127[arg1.field1390] == 0) {
                    arg1.field1398 = class19.method186(arg1.field1382, arg1.field1398.method183(), arg1.field1398.method177(), arg1.field1398.method197());
                } else {
                    arg1.field1398 = class19.method186(arg1.field1382, arg1.field1398.method183(), 0, arg1.field1398.method197());
                    this.field3145.method60(arg1.field1388.field4031[arg1.field1374] < 0, arg1, true);
                }
                if (arg1.field1388.field4031[arg1.field1374] < 0) {
                    arg1.field1398.method193(-1);
                }
                arg0 = arg1.field1395 / var4;
            }
        }
        arg1.field1398.method54(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ltg;Ltg;I)V")
    public static final void method1262(class75 arg0, class75 arg1, int arg2) {
        class134.field2369 = class106.method811(0, arg0, arg1, class1.field13, -18824);
        field3151++;
        class255.field4467 = (class77) class134.field2369;
        if (arg2 == 15896) {
            class23.field471 = class106.method811(0, arg0, arg1, class106.field1902, arg2 ^ 0xFFFF8860);
            class90.field1581 = class106.method811(0, arg0, arg1, class221.field3810, -18824);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([III)V")
    public final void method56(int[] arg0, int arg1, int arg2) {
        field3153++;
        this.field3160.method56(arg0, arg1, arg2);
        for (class78 var4 = (class78) this.field3159.method371((byte) 61); var4 != null; var4 = (class78) this.field3159.method370(true)) {
            if (!this.field3145.method65((byte) 62, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1386) {
                        this.method1260(var5, var6, var4, arg0, 11, var5 + var6);
                        var4.field1386 -= var6;
                        break;
                    }
                    this.method1260(var5, var4.field1386, var4, arg0, -127, var5 + var6);
                    var5 += var4.field1386;
                    var6 -= var4.field1386;
                } while (!this.field3145.method83(var6, arg0, var5, -8455, var4));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1263(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 36) {
            return;
        }
        if (arg0 >= class229.field3933 && arg1 <= class106.field1899 && arg2 >= class116.field2077 && arg3 <= class215.field3666) {
            class163.method1178(arg1, arg5, arg7, arg0, true, arg3, arg2, arg6);
        } else {
            class112.method842(arg6, arg7, arg3, arg0, -87, arg5, arg1, arg2);
        }
        field3144++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method54(int arg0) {
        this.field3160.method54(arg0);
        field3157++;
        for (class78 var2 = (class78) this.field3159.method371((byte) 61); var2 != null; var2 = (class78) this.field3159.method370(true)) {
            if (!this.field3145.method65((byte) 62, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1386 >= var3) {
                        this.method1261(var3, var2, 256);
                        var2.field1386 -= var3;
                        break;
                    }
                    this.method1261(var2.field1386, var2, 256);
                    var3 -= var2.field1386;
                } while (!this.field3145.method83(var3, (int[]) null, 0, -8455, var2));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIILq;I)V")
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, class148 arg5, int arg6) {
        field3152++;
        int var7 = arg2 * arg2 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg5.field2694 / 2, arg5.field2647 / arg6);
        if (var7 <= (var8 * var8)) {
            class254.method1758(arg2, arg3, arg1, class156.field2850[arg0], arg5, arg4, (byte) -56);
            return;
        }
        var8 -= 10;
        int var9 = class243.field4219 + class135.field2396 & 0x7FF;
        int var10 = class160.field2893[var9];
        int var11 = class160.field2890[var9];
        int var12 = var10 * 256 / (class146.field2557 + 256);
        int var13 = var11 * 256 / (class146.field2557 + 256);
        int var14 = arg2 * var13 + arg4 * var12 >> 16;
        int var15 = arg4 * var13 - (arg2 * var12) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class247) class67.field1075[arg0]).method1237(arg5.field2694 / 2 + var18 + arg3 - 10, arg1 - -(arg5.field2647 / 2) + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method1265(boolean arg0) {
        field3147 = null;
        field3156 = null;
        field3146 = null;
        if (arg0) {
            field3156 = null;
        }
        field3149 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()Lhk;")
    public final class30 method72() {
        field3155++;
        class78 var1 = (class78) this.field3159.method371((byte) 61);
        if (var1 == null) {
            return null;
        } else if (var1.field1398 == null) {
            return this.method88();
        } else {
            return var1.field1398;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()Lhk;")
    public final class30 method88() {
        field3150++;
        class78 var1;
        do {
            var1 = (class78) this.field3159.method370(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1398 == null);
        return var1.field1398;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lub;)V")
    public class183(class8 arg0) {
        this.field3145 = arg0;
    }
}
