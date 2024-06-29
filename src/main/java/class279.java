import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class279 extends class67 {

    @OriginalMember(owner = "client!og", name = "Lb", descriptor = "I")
    public static int field4863 = 0;

    @OriginalMember(owner = "client!og", name = "Jb", descriptor = "I")
    public static int field4861 = 0;

    @OriginalMember(owner = "client!og", name = "Ob", descriptor = "Lke;")
    public static class256 field4866 = class316.method2202("Memory after cleanup=", 27626);

    @OriginalMember(owner = "client!og", name = "Gb", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!og", name = "Hb", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!og", name = "Kb", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!og", name = "Mb", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!og", name = "Nb", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!og", name = "Qb", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!og", name = "Pb", descriptor = "Lhd;")
    public static class319 field4867;

    @OriginalMember(owner = "client!og", name = "Ib", descriptor = "Lvb;")
    public class74 field4860;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 4)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
        field4859++;
        if (this.field4860 == null) {
            return;
        }
        class117 var13 = this.field1202 != -1 && this.field1196 == 0 ? class250.method1682(this.field1202, true) : null;
        class117 var14 = this.field1236 == -1 || this.field1238 == this.field1236 && var13 != null ? null : class250.method1682(this.field1236, true);
        class26 var15 = this.field4860.method551(this.field1208, var13, var14, true, this.field1231);
        if (var15 == null) {
            return;
        }
        this.field1250 = var15.method154();
        class74 var16 = this.field4860;
        if (var16.field1381 != null) {
            var16 = var16.method553(4175);
        }
        if (class181.field3216 && var16.field1364) {
            class26 var17 = class173.method1254(this.field1197, this.field4860.field1361, var14 == null ? this.field1231 : this.field1208, this.field4860.field1388, var14 == null ? var13 : var14, this.field1226, this.field4860.field1386, (byte) -26, var15, this.field4860.field1418, arg0, this.field4860.field1389, this.field1192, this.field1243);
            if (class253.field4323) {
                float var18 = class253.method1710();
                float var19 = class253.method1706();
                class253.method1709();
                class253.method1739(var18, var19 - 150.0F);
                var17.method150(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1244);
                class253.method1728();
                class253.method1739(var18, var19);
            } else {
                var17.method150(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1244);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field4860.field1401 != 0 || this.field4860.field1367 != 0) {
            int var23 = class136.field2372[arg0];
            int var24 = class136.field2366[arg0];
            short var25 = this.field4860.field1401;
            short var26 = this.field4860.field1367;
            int var27 = -var25 / 2;
            int var28 = -var26 / 2;
            int var29 = var24 * var28 + (var23 * var27) >> 16;
            int var30 = var23 * var28 - (var24 * var27) >> 16;
            int var31 = var25 / 2;
            int var32 = class297.method2080(this.field1192 + var29, 127, class255.field4377, this.field1197 + var30);
            int var33 = -var25 / 2;
            int var34 = -var26 / 2;
            int var35 = var23 * var31 + var24 * var34 >> 16;
            int var36 = var23 * var34 - (var24 * var31) >> 16;
            int var37 = var26 / 2;
            int var38 = class297.method2080(this.field1192 + var35, 111, class255.field4377, this.field1197 + var36);
            int var39 = var23 * var33 + var24 * var37 >> 16;
            int var40 = var23 * var37 - (var24 * var33) >> 16;
            int var41 = class297.method2080(this.field1192 + var39, 116, class255.field4377, this.field1197 + var40);
            int var42 = var25 / 2;
            int var43 = var26 / 2;
            int var44 = var23 * var42 + var24 * var43 >> 16;
            int var45 = var23 * var43 - (var24 * var42) >> 16;
            int var46 = class297.method2080(this.field1192 + var44, 106, class255.field4377, this.field1197 + var45);
            int var47 = var32 + var46;
            int var48 = var38 > var32 ? var32 : var38;
            int var49 = var38 < var46 ? var38 : var46;
            if (var47 > (var38 + var41)) {
                var47 = var38 + var41;
            }
            int var50 = var32 >= var41 ? var41 : var32;
            int var51 = var41 < var46 ? var41 : var46;
            if (var26 != 0) {
                var20 = (int) (Math.atan2((double) (var48 - var51), (double) var26) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method173(var20);
                }
            }
            if (var25 != 0) {
                var21 = (int) (Math.atan2((double) (var50 - var49), (double) var25) * 325.95D) & 0x7FF;
                if (var21 != 0) {
                    var15.method177(var21);
                }
            }
            var22 = (var47 >> 1) - this.field1243;
            if (var22 != 0) {
                var15.method166(0, var22, 0);
            }
        }
        class26 var52 = null;
        if (this.field1253 != -1 && this.field1201 != -1) {
            class203 var53 = class302.method2113(true, this.field1253);
            var52 = var53.method1440(this.field1201, (byte) 11);
            if (var52 != null) {
                var52.method166(0, -this.field1221, 0);
                if (var53.field3679) {
                    if (var20 != 0) {
                        var52.method173(var20);
                    }
                    if (var21 != 0) {
                        var52.method177(var21);
                    }
                    if (var22 != 0) {
                        var52.method166(0, var22, 0);
                    }
                }
            }
        }
        if (!class253.field4323) {
            if (var52 != null) {
                var15 = ((class89) var15).method662(var52);
            }
            if (this.field4860.field1418 == 1) {
                var15.field331 = true;
            }
            var15.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1244);
            return;
        }
        if (this.field4860.field1418 == 1) {
            var15.field331 = true;
        }
        var15.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1244);
        if (var52 != null) {
            if (this.field4860.field1418 == 1) {
                var52.field331 = true;
            }
            var52.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1244);
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z", line = 207)
    public final boolean method519(int arg0) {
        if (arg0 < 99) {
            return true;
        } else {
            field4858++;
            return this.field4860 != null;
        }
    }

    @OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V", line = 224)
    protected final void finalize() {
        field4864++;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V", line = 239)
    public static void method1959(int arg0) {
        field4867 = null;
        field4866 = null;
        if (arg0 != 2) {
            method1959(-52);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()I", line = 250)
    public final int method154() {
        field4862++;
        return this.field1250;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V", line = 272)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4865++;
        if (this.field4860 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILvb;)V", line = 294)
    public final void method1960(int arg0, class74 arg1) {
        field4868++;
        this.field4860 = arg1;
        if (this.field1244 != null) {
            this.field1244.method1981();
        }
        if (arg0 != -1403) {
            field4863 = -111;
        }
    }
}
