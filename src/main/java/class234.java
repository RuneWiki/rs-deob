import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class234 extends class263 {

    @OriginalMember(owner = "client!qi", name = "wc", descriptor = "I")
    public static int field3758 = -1;

    @OriginalMember(owner = "client!qi", name = "sc", descriptor = "Lgi;")
    public static class109 field3754 = new class109(16);

    @OriginalMember(owner = "client!qi", name = "ic", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!qi", name = "jc", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!qi", name = "kc", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!qi", name = "lc", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!qi", name = "nc", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!qi", name = "oc", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qi", name = "pc", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!qi", name = "rc", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!qi", name = "tc", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!qi", name = "uc", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!qi", name = "vc", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!qi", name = "xc", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!qi", name = "zc", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!qi", name = "mc", descriptor = "Lak;")
    public static class172 field3748;

    @OriginalMember(owner = "client!qi", name = "qc", descriptor = "Lbo;")
    public class256 field3752;

    @OriginalMember(owner = "client!qi", name = "yc", descriptor = "[Lbf;")
    public static class58[] field3760;

    @OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() {
        field3761++;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 19)
    public static final void method1691(byte arg0) {
        field3746++;
        if (arg0 == -45) {
            class158.field2613.method702((byte) 126);
            class112.field1708.method702((byte) 124);
            class51.field727.method702((byte) 124);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method1692(byte arg0, int arg1) {
        field3757++;
        class111 var2 = (class111) class76.field1064.method451((long) arg1, (byte) 100);
        if (var2 != null) {
            var2.method1212((byte) 115);
            if (arg0 != 122) {
                method1691((byte) -76);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)V", line = 48)
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3750++;
        int var5 = -36 % ((arg4 - 69) / 46);
        for (int var6 = 0; var6 < class20.field291; var6++) {
            if (arg0 < class81.field1146[var6] + class197.field3215[var6] && class81.field1146[var6] < (arg0 + arg3) && class213.field3481[var6] + class323.field5013[var6] > arg2 && class213.field3481[var6] < arg1 + arg2) {
                class127.field1991[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 73)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3756++;
        if (this.field3752 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V", line = 86)
    public static void method1694(byte arg0) {
        if (arg0 >= -53) {
            method1696(59, (class172) null);
        }
        field3748 = null;
        field3760 = null;
        field3754 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 99)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        field3745++;
        if (this.field3752 == null) {
            return;
        }
        class202 var13 = this.field4268 != -1 && this.field4190 == 0 ? class325.method2274(this.field4268, -108) : null;
        class202 var14 = this.field4232 == -1 || this.field4232 == this.method1876((byte) 125).field200 && var13 != null ? null : class325.method2274(this.field4232, -108);
        class262 var15 = this.field3752.method1831(this.field4274, this.field4195, this.field4212, var14, this.field4237, this.field4201, this.field4265, this.field4191, var13, false);
        if (var15 == null) {
            return;
        }
        this.field4272 = var15.method33();
        class256 var16 = this.field3752;
        if (var16.field4080 != null) {
            var16 = var16.method1843(-1);
        }
        if (class180.field2984 && var16.field4054) {
            class262 var17 = class307.method2179(arg0, var14 == null ? this.field4265 : this.field4212, this.field4247, this.field4264, this.field3752.field4063, var15, (byte) -122, this.field3752.field4089, this.field4255, var14 == null ? var13 : var14, this.field3752.field4051, this.field3752.field4085, this.field4219, this.field3752.field4112);
            if (class232.field3690) {
                float var18 = class232.method1646();
                float var19 = class232.method1642();
                class232.method1673();
                class232.method1680(var18, var19 - 150.0F);
                var17.method38(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4205);
                class232.method1681();
                class232.method1680(var18, var19);
            } else {
                var17.method38(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4205);
            }
        }
        this.method1877(true, var15);
        class262 var20 = null;
        this.method1884(var15, arg0, (byte) 124);
        if (this.field4278 != -1 && this.field4276 != -1) {
            class323 var21 = class215.method1545(this.field4278, 1);
            var20 = var21.method2265(-84, this.field4211, this.field4267, this.field4276);
            if (var20 != null) {
                var20.method1189(0, -this.field4206, 0);
                if (var21.field5018) {
                    if (class101.field1476 != 0) {
                        var20.method1163(class101.field1476);
                    }
                    if (class278.field4480 != 0) {
                        var20.method1186(class278.field4480);
                    }
                    if (class34.field462 != 0) {
                        var20.method1189(0, class34.field462, 0);
                    }
                }
            }
        }
        if (!class232.field3690) {
            if (var20 != null) {
                var15 = ((class250) var15).method1778(var20);
            }
            if (this.field3752.field4051 == 1) {
                var15.field4178 = true;
            }
            var15.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
            return;
        }
        if (this.field3752.field4051 == 1) {
            var15.field4178 = true;
        }
        var15.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
        if (var20 != null) {
            if (this.field3752.field4051 == 1) {
                var20.field4178 = true;
            }
            var20.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Z", line = 214)
    public final boolean method1695(int arg0) {
        if (arg0 == 29082) {
            field3759++;
            return this.field3752 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILak;)V", line = 229)
    public static final void method1696(int arg0, class172 arg1) {
        field3749++;
        class316.field4900 = arg1.method1298((byte) -75, "runes");
        if (arg0 != 0) {
            method1693(46, -70, -95, 13, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILbo;)V", line = 246)
    public final void method1697(int arg0, class256 arg1) {
        this.field3752 = arg1;
        if (this.field4205 != null) {
            this.field4205.method2105();
        }
        if (arg0 == 3734) {
            field3744++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I", line = 263)
    public final int method1698(boolean arg0) {
        if (arg0) {
            this.method39(14, 68, 30, 90, -51);
        }
        field3753++;
        if (class15.field169 != 0 && this.field3752.field4080 != null) {
            class256 var2 = this.field3752.method1843(-1);
            if (var2 != null && var2.field4103 != -1) {
                return var2.field4103;
            }
        }
        return this.field4234;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILei;III)Lei;", line = 291)
    public static final class262 method1699(int arg0, int arg1, int arg2, class262 arg3, int arg4, int arg5, int arg6) {
        field3747++;
        if (arg6 != -3514) {
            return (class262) null;
        }
        long var7 = (long) arg1;
        class262 var9 = (class262) class62.field909.method704((byte) 98, var7);
        if (var9 == null) {
            class134 var10 = class134.method997(class126.field1967, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method988(64, 768, -50, -10, -50);
            class62.field909.method703(var9, var7, (byte) 55);
        }
        int var11 = arg3.method1187();
        int var12 = arg3.method1180();
        int var13 = arg3.method1152();
        int var14 = arg3.method1158();
        class262 var15 = var9.method1191(true, true, true);
        if (arg4 != 0) {
            var15.method1159(arg4);
        }
        if (class232.field3690) {
            class163 var18 = (class163) var15;
            if (class123.method889(arg6 + 3515, class49.field698, arg2 + var11, arg0 + var13) != arg5 || class123.method889(1, class49.field698, arg2 + var12, arg0 - -var14) != arg5) {
                for (int var19 = 0; var19 < var18.field2694; var19++) {
                    var18.field2704[var19] += class123.method889(1, class49.field698, var18.field2669[var19] + arg2, var18.field2676[var19] + arg0) - arg5;
                }
                var18.field2684.field402 = false;
                var18.field2687.field3874 = false;
            }
        } else {
            class250 var16 = (class250) var15;
            if (class123.method889(1, class49.field698, arg2 + var11, arg0 + var13) != arg5 || arg5 != class123.method889(1, class49.field698, arg2 + var12, arg0 + var14)) {
                for (int var17 = 0; var17 < var16.field3921; var17++) {
                    var16.field3924[var17] += class123.method889(1, class49.field698, var16.field3936[var17] + arg2, var16.field3932[var17] + arg0) - arg5;
                }
                var16.field3928 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()I", line = 374)
    public final int method33() {
        field3755++;
        return this.field4272;
    }
}
