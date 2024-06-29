import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class75 extends class152 {

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    private int field1207 = -1;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "Lml;")
    public static class160 field1208 = new class160(64);

    @OriginalMember(owner = "client!tj", name = "gb", descriptor = "Lce;")
    private static class126 field1219 = class206.method1445(-7923, "Loading sprites )2 ");

    @OriginalMember(owner = "client!tj", name = "fb", descriptor = "Lce;")
    public static class126 field1218 = field1219;

    @OriginalMember(owner = "client!tj", name = "hb", descriptor = "Z")
    public static boolean field1220 = false;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!tj", name = "eb", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "[I")
    private int[] field1206;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V", line = 5)
    public static void method541(byte arg0) {
        field1219 = null;
        field1218 = null;
        if (arg0 <= 96) {
            field1218 = (class126) null;
        }
        field1208 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILbb;)V", line = 17)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field1211++;
        if (arg1 == 0) {
            this.field1207 = arg2.method942(true);
        }
        if (arg0 != 8) {
            field1220 = true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)V", line = 44)
    public static final void method542(int arg0, int arg1, int arg2) {
        class245 var3 = class139.method1022(arg2, (byte) -97, arg1);
        var3.method1683(0);
        var3.field4154 = arg0;
        field1216++;
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 56)
    public static final void method543(int arg0) {
        class4.field32 = null;
        class218.field3659 = null;
        class122.field2036 = (byte[][][]) null;
        field1204++;
        class259.field4347 = null;
        class17.field238 = (byte[][][]) null;
        class119.field2003 = (int[][][]) null;
        if (arg0 != 0) {
            method545((byte) 111);
        }
        class259.field4354 = null;
        class65.field1103 = (byte[][][]) null;
        class294.field4906 = null;
        class122.field2042 = (byte[][][]) null;
        class172.field3048 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 80)
    public final void method544(int arg0) {
        super.method544(arg0);
        field1215++;
        this.field1206 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 175)
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(B)V", line = 94)
    public static final void method545(byte arg0) {
        field1210++;
        while (class227.field3834.method1237(class315.field5404, false) >= 27) {
            int var1 = class227.field3834.method1241(15, -114);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class199.field3391[var1] == null) {
                class199.field3391[var1] = new class89();
                var2 = true;
            }
            class89 var3 = class199.field3391[var1];
            class279.field4639[class30.field425++] = var1;
            var3.field2447 = class249.field4174;
            if (var3.field1389 != null && var3.field1389.method2045(-1)) {
                class102.method697((byte) -124, var3);
            }
            int var4 = class227.field3834.method1241(5, 99);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class227.field3834.method1241(5, -2);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class55.field838[class227.field3834.method1241(3, -118)];
            if (var2) {
                var3.field2444 = var3.field2483 = var6;
            }
            var3.method625(class54.method344(class227.field3834.method1241(14, 23), (byte) -127), 18);
            int var7 = class227.field3834.method1241(1, -113);
            if (var7 == 1) {
                class139.field2526[class206.field3528++] = var1;
            }
            int var8 = class227.field3834.method1241(1, 109);
            var3.method1015(11380, var3.field1389.field5109);
            var3.field2465 = var3.field1389.field5098;
            var3.field2458 = var3.field1389.field5086;
            var3.field2496 = var3.field1389.field5054;
            if (var3.field2465 == 0) {
                var3.field2483 = 0;
            }
            var3.field2441 = var3.field1389.field5115;
            var3.field2474 = var3.field1389.field5084;
            var3.field2442 = var3.field1389.field5066;
            var3.field2494 = var3.field1389.field5068;
            var3.field2506 = var3.field1389.field5056;
            var3.method1008(var8 == 1, class286.field4744.field2471[0] + var5, class286.field4744.field2460[0] + var4, var3.method1013(false), (byte) -40);
            if (var3.field1389.method2045(-1)) {
                class53.method336(128, 0, var3, (class265) null, var3.field2460[0], (class301) null, class131.field2250, var3.field2471[0]);
            }
        }
        class227.field3834.method1243(-29800);
        int var9 = -63 / ((19 - arg0) / 52);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)[[I", line = 182)
    public final int[][] method26(int arg0, int arg1) {
        field1209++;
        int[][] var3 = this.field2775.method319(122, arg1);
        if (this.field2775.field775 && this.method546(-104)) {
            int var4 = (class143.field2599 == this.field1214 ? arg1 : this.field1214 * arg1 / class143.field2599) * this.field1217;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class244.field4133 == this.field1217) {
                for (int var8 = 0; var8 < class244.field4133; var8++) {
                    int var9 = this.field1206[var4++];
                    var6[var8] = class47.method289(255, var9) << 4;
                    var7[var8] = class47.method289(65280, var9) >> 4;
                    var5[var8] = class47.method289(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class244.field4133; var10++) {
                    int var11 = this.field1217 * var10 / class244.field4133;
                    int var12 = this.field1206[var4 + var11];
                    var6[var10] = class47.method289(255, var12) << 4;
                    var7[var10] = class47.method289(65280, var12) >> 4;
                    var5[var10] = class47.method289(4080, var12 >> 12);
                }
            }
        }
        return arg0 == 0 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)Z", line = 256)
    private final boolean method546(int arg0) {
        field1205++;
        if (arg0 > -81) {
            return false;
        } else if (this.field1206 != null) {
            return true;
        } else if (this.field1207 >= 0) {
            int var2 = class244.field4133;
            int var3 = class143.field2599;
            int var4 = class47.field721.method600(200, this.field1207) ? 64 : 128;
            this.field1206 = class47.field721.method606(-11820, this.field1207);
            this.field1217 = var4;
            this.field1214 = var4;
            class320.method2228(var3, var2, -56);
            return this.field1206 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)I", line = 286)
    public final int method547(int arg0) {
        field1213++;
        if (arg0 < 72) {
            this.field1206 = (int[]) null;
        }
        return this.field1207;
    }
}
