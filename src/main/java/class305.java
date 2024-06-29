import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class305 extends class89 {

    @OriginalMember(owner = "client!hk", name = "qc", descriptor = "Ljava/lang/String;")
    public static String field4779 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!hk", name = "oc", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!hk", name = "rc", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!hk", name = "sc", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!hk", name = "tc", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!hk", name = "uc", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!hk", name = "vc", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!hk", name = "wc", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!hk", name = "xc", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!hk", name = "yc", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!hk", name = "zc", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!hk", name = "Ac", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!hk", name = "Bc", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!hk", name = "pc", descriptor = "Lo;")
    public class208 field4778;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 4)
    public static final void method2109(byte arg0) {
        if (class325.field5045.toLowerCase().indexOf("microsoft") == -1) {
            class260.field4041[92] = 74;
            class260.field4041[47] = 73;
            class260.field4041[59] = 57;
            class260.field4041[93] = 43;
            class260.field4041[45] = 26;
            class260.field4041[44] = 71;
            class260.field4041[46] = 72;
            class260.field4041[91] = 42;
            if (class325.field5053 == null) {
                class260.field4041[192] = 58;
                class260.field4041[222] = 59;
            } else {
                class260.field4041[520] = 59;
                class260.field4041[222] = 58;
                class260.field4041[192] = 28;
            }
            class260.field4041[61] = 27;
        } else {
            class260.field4041[192] = 58;
            class260.field4041[223] = 28;
            class260.field4041[219] = 42;
            class260.field4041[191] = 73;
            class260.field4041[188] = 71;
            class260.field4041[221] = 43;
            class260.field4041[187] = 27;
            class260.field4041[190] = 72;
            class260.field4041[189] = 26;
            class260.field4041[220] = 74;
            class260.field4041[222] = 59;
            class260.field4041[186] = 57;
        }
        int var1 = -43 / ((arg0 + 69) / 50);
        field4781++;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 53)
    public static void method2110(byte arg0) {
        if (arg0 >= 126) {
            field4779 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIII)I", line = 63)
    public static final int method2111(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        field4783++;
        if (!arg1) {
            return 90;
        }
        int var8 = arg3 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 - (arg2 + arg5 - 1);
        } else {
            return 1 + 7 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V", line = 99)
    protected final void finalize() {
        field4790++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 108)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4789++;
        if (this.field4778 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I", line = 122)
    public final int method207() {
        field4786++;
        return this.field1392;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lo;B)V", line = 130)
    public final void method2112(class208 arg0, byte arg1) {
        this.field4778 = arg0;
        if (this.field1454 != null) {
            this.field1454.method369();
        }
        if (arg1 != 119) {
            method2110((byte) -110);
        }
        field4784++;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)Z", line = 150)
    public final boolean method199(int arg0) {
        field4780++;
        if (arg0 == 58) {
            return this.field4778 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V", line = 171)
    public static final void method2113(byte arg0) {
        field4782++;
        int var1 = class275.field4271 + class19.field356.field1369;
        if (arg0 != -10) {
            field4779 = (String) null;
        }
        int var2 = class18.field353 + class19.field356.field1442;
        if (class316.field4927 - var2 < -500 || class316.field4927 - var2 > 500 || (class86.field1294 - var1) < -500 || (class86.field1294 - var1) > 500) {
            class316.field4927 = var2;
            class86.field1294 = var1;
        }
        if (class86.field1294 != var1) {
            class86.field1294 += (var1 - class86.field1294) / 16;
        }
        if (class316.field4927 != var2) {
            class316.field4927 += (var2 - class316.field4927) / 16;
        }
        if (class39.field707) {
            for (int var3 = 0; var3 < class279.field4325; var3++) {
                int var4 = class141.field2247[var3];
                if (var4 == 98) {
                    class143.field2254 = class143.field2254 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class143.field2254 = class143.field2254 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class248.field3833 = class248.field3833 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class248.field3833 = class248.field3833 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class108.field1795[96]) {
                class189.field3010 += (-class189.field3010 - 24) / 2;
            } else if (class108.field1795[97]) {
                class189.field3010 += (24 - class189.field3010) / 2;
            } else {
                class189.field3010 /= 2;
            }
            if (class108.field1795[98]) {
                class210.field3349 += (12 - class210.field3349) / 2;
            } else if (class108.field1795[99]) {
                class210.field3349 += (-class210.field3349 - 12) / 2;
            } else {
                class210.field3349 /= 2;
            }
            class143.field2254 += class210.field3349 / 2;
            class248.field3833 += class189.field3010 / 2;
        }
        class51.method382(-107);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 253)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field4785++;
        if (this.field4778 == null) {
            return;
        }
        class269 var13 = this.field1458 != -1 && this.field1398 == 0 ? class6.method28(this.field1458, 2) : null;
        class269 var14 = this.field1453 == -1 || this.field1453 == this.method640(123).field970 && var13 != null ? null : class6.method28(this.field1453, 2);
        class199 var15 = this.field4778.method1511(this.field1401, this.field1422, this.field1373, this.field1438, 16576, this.field1414, var13, this.field1385, var14, this.field1430);
        if (var15 == null) {
            return;
        }
        this.field1392 = var15.method207();
        class208 var16 = this.field4778;
        if (var16.field3313 != null) {
            var16 = var16.method1518(-4841);
        }
        if (class11.field219 && var16.field3335) {
            class199 var17 = class169.method1234(this.field4778.field3287, -108, var14 == null ? this.field1414 : this.field1438, var14 == null ? var13 : var14, this.field4778.field3291, this.field4778.field3292, arg0, this.field1425, this.field1369, var15, this.field4778.field3336, this.field1442, this.field4778.field3311, this.field1450);
            if (class265.field4126) {
                float var18 = class265.method1911();
                float var19 = class265.method1902();
                class265.method1908();
                class265.method1881(var18, var19 - 150.0F);
                var17.method203(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1454);
                class265.method1897();
                class265.method1881(var18, var19);
            } else {
                var17.method203(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1454);
            }
        }
        class199 var20 = null;
        this.method631(-25822, var15);
        this.method641(arg0, (byte) -100, var15);
        if (this.field1417 != -1 && this.field1449 != -1) {
            class90 var21 = class136.method1042((byte) -21, this.field1417);
            var20 = var21.method652(2026, this.field1449, this.field1440, this.field1370);
            if (var20 != null) {
                var20.method1119(0, -this.field1446, 0);
                if (var21.field1483) {
                    if (class74.field1139 != 0) {
                        var20.method1132(class74.field1139);
                    }
                    if (class249.field3845 != 0) {
                        var20.method1129(class249.field3845);
                    }
                    if (class267.field4141 != 0) {
                        var20.method1119(0, class267.field4141, 0);
                    }
                }
            }
        }
        if (!class265.field4126) {
            if (var20 != null) {
                var15 = ((class146) var15).method1138(var20);
            }
            if (this.field4778.field3292 == 1) {
                var15.field3145 = true;
            }
            var15.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
            return;
        }
        if (this.field4778.field3292 == 1) {
            var15.field3145 = true;
        }
        var15.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
        if (var20 != null) {
            if (this.field4778.field3292 == 1) {
                var20.field3145 = true;
            }
            var20.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1454);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)J", line = 367)
    public static final long method2114(byte arg0, String arg1) {
        if (arg0 <= 52) {
            method2114((byte) 69, (String) null);
        }
        int var2 = arg1.length();
        field4787++;
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)I", line = 390)
    public final int method198(int arg0) {
        if (arg0 != 499) {
            return -26;
        }
        field4788++;
        if (class141.field2241 != 0 && this.field4778.field3313 != null) {
            class208 var2 = this.field4778.method1518(-4841);
            if (var2 != null && var2.field3276 != -1) {
                return var2.field3276;
            }
        }
        return this.field1405;
    }
}
