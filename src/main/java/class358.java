import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class358 extends class433 {

    @OriginalMember(owner = "client!re", name = "Sc", descriptor = "Ljava/lang/String;")
    public static String field5232 = "Loaded world list data";

    @OriginalMember(owner = "client!re", name = "Jc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!re", name = "Kc", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!re", name = "Lc", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!re", name = "Mc", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!re", name = "Nc", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!re", name = "Oc", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!re", name = "Qc", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!re", name = "Rc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!re", name = "Tc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!re", name = "Uc", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!re", name = "Vc", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!re", name = "Wc", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!re", name = "Xc", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!re", name = "Yc", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!re", name = "Zc", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!re", name = "ad", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!re", name = "Pc", descriptor = "Lwm;")
    public class335 field5229;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZFZII)[I")
    public static final int[] method2279(int arg0, int arg1, int arg2, boolean arg3, float arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            return null;
        } else {
            ++field5238;
            int[] var8 = new int[arg1];
            class186 var9 = new class186();
            var9.field2528 = arg0;
            var9.field2539 = (int) (arg4 * 4096.0F);
            var9.field2534 = arg7;
            var9.field2537 = arg3;
            var9.field2532 = arg2;
            var9.field2541 = arg6;
            var9.method140(0);
            class215.method1407(arg1, 1, (byte) 23);
            var9.method1194(var8, 4095, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        int var2 = 24 / ((52 - arg0) / 46);
        ++field5240;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "(I)Z")
    public final boolean method2280(int arg0) {
        if (arg0 != 255) {
            return false;
        } else {
            ++field5224;
            return this.field5229 != null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
    public final int method791(int arg0) {
        ++field5237;
        if (this.field5229.field4984 != null) {
            class335 var2 = this.field5229.method2162(0);
            if (var2 != null && ~var2.field4977 != 0) {
                return var2.field4977;
            }
        }
        return arg0 > -32 ? 51 : this.field5229.field4977;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        ++field5226;
        int var2 = -30 % ((arg0 - -60) / 37);
        return false;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)I")
    public final int method792(boolean arg0) {
        ++field5234;
        if (arg0) {
            method2279(51, -122, -19, true, -2.338267F, true, 72, -58);
        }
        if (this.field5229.field4984 != null) {
            class335 var2 = this.field5229.method2162(0);
            if (var2 != null && var2.field4978 != -1) {
                return var2.field4978;
            }
        }
        return this.field5229.field4978;
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "(I)V")
    public static void method2281(int arg0) {
        if (arg0 != -14075) {
            method2281(-82);
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field5235;
        if (this.field5229 != null && this.method2283(1024, true, arg1)) {
            if (arg0 > -5) {
                this.field5229 = null;
            }
            class71 var3 = arg1.method1015();
            int var4 = super.field6289.method2776(126);
            var3.method117(var4);
            var3.method124(super.field1304, super.field1310, super.field1311);
            class270 var5 = this.method2697((byte) 93);
            class335 var6 = this.field5229.field4984 == null ? this.field5229 : this.field5229.method2162(0);
            if (class41.field487 && var6.field4954 && var5.field3791) {
                class182 var7 = super.field6312 != -1 && ~super.field6250 == -1 ? class437.method2717(super.field6312, (byte) -103) : null;
                class182 var8 = super.field6265 == -1 || super.field6335 && var7 != null ? null : class437.method2717(super.field6265, (byte) -103);
                class393 var9 = class63.method384(super.field6252, var4, this.field5229.field4982, (byte) -75, var8 == null ? var7 : var8, this.field5229.field4949 & 255, super.field6300, this.field5229.field4974 & 65535, arg1, super.field6333, this.field5229.field4940 & 65535, 255 & this.field5229.field4923, var8 != null ? super.field6255 : super.field6277, super.field6247, super.field6340[0]);
                if (var9 != null) {
                    float var10 = arg1.method936();
                    float var11 = arg1.method1019();
                    arg1.method956(false);
                    arg1.method1017(var10, var11 - 150.0F);
                    var9.method775(var3, (class127) null, 0);
                    arg1.method1017(var10, var11);
                    arg1.method956(true);
                }
            }
            class19 var12 = null;
            if (this.method2284(-88)) {
                var12 = method2286(true, super.field6340.length);
            }
            if (super.field6349 == null) {
                arg1.method984(super.field6340, var3, var12 == null ? null : var12.field197, 0);
            } else {
                class271 var13 = super.field6349.method2492();
                arg1.method943(super.field6340, var13, var3, var12 != null ? var12.field197 : null, 0);
            }
            this.method2693(super.field6340, arg1, false, 1);
            if (super.field6340[2] != null) {
                if (var4 != 0) {
                    super.field6340[2].method723(var4);
                }
                super.field6340[2].method758(-super.field6357 + super.field1304, -super.field6354 + super.field1310, super.field1311 - super.field6356);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        ++field5239;
        if (this.field5229 != null) {
            if (super.field6344 || this.method2283(0, true, arg0)) {
                this.method2693(super.field6340, arg0, super.field6344, 1);
                if (arg1 != 0) {
                    this.method2283(-36, false, (class174) null);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lwm;B)V")
    public final void method2282(class335 arg0, byte arg1) {
        this.field5229 = arg0;
        ++field5227;
        if (super.field6349 != null) {
            super.field6349.method2488();
        }
        int var3 = 76 % ((arg1 - 38) / 40);
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)I")
    public final int method222(int arg0) {
        if (arg0 != 26841) {
            this.method2284(-89);
        }
        ++field5225;
        return super.field6263;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field5231;
        if (this.field5229 != null && this.method2283(65536, arg2, arg3)) {
            class71 var5 = arg3.method1015();
            int var6 = super.field6289.method2776(-104);
            var5.method117(var6);
            var5.method123(super.field1304, super.field1310, super.field1311);
            for (int var7 = 0; ~var7 > ~super.field6340.length; ++var7) {
                if (super.field6340[var7] != null) {
                    return super.field6340[var7].method724(arg0, arg1, var5, ~this.field5229.field4982 == -2);
                }
            }
            if (!arg2) {
                this.field5229 = null;
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLen;)Z")
    private final boolean method2283(int arg0, boolean arg1, class174 arg2) {
        if (!arg1) {
            this.field5229 = null;
        }
        ++field5236;
        int var4 = arg0;
        class270 var5 = this.method2697((byte) 93);
        class182 var6 = super.field6312 != -1 && super.field6250 == 0 ? class437.method2717(super.field6312, (byte) -103) : null;
        class182 var7 = super.field6265 == -1 || super.field6335 && var6 != null ? null : class437.method2717(super.field6265, (byte) -103);
        int var8 = var5.field3830;
        int var9 = var5.field3820;
        if (var8 != 0 || var9 != 0 || ~var5.field3819 != -1 || var5.field3840 != 0) {
            arg0 |= 7;
        }
        class393 var10 = super.field6340[0] = this.field5229.method2154(super.field6322, super.field6269, arg0, super.field6255, super.field6296, super.field6295, super.field6277, arg2, var6, 34, super.field6272, var7);
        if (var10 == null) {
            return false;
        } else {
            super.field6263 = var10.method731();
            this.method2690(-1, var10);
            int var11 = super.field6289.method2776(122);
            super.field6252 = 0;
            super.field6333 = 0;
            super.field6247 = 0;
            if (~var8 == -1 && var9 == 0) {
                this.method2682(this.method786((byte) 70) << 7, var11, this.method786((byte) 70) << 7, 1280);
            } else {
                this.method2682(var8, var11, var9, 1280);
                if (super.field6333 != 0) {
                    super.field6340[0].method737(super.field6333);
                }
                if (~super.field6252 != -1) {
                    super.field6340[0].method767(super.field6252);
                }
                if (~super.field6247 != -1) {
                    super.field6340[0].method758(0, super.field6247, 0);
                }
            }
            super.field6340[1] = null;
            if (~super.field6256 != 0 && ~super.field6315 != 0) {
                class377 var12 = class251.method1571(super.field6256, (byte) 90);
                class393 var13 = var12.method2375((var12.field5522 ? 7 : 2) | var4, arg2, super.field6332, super.field6270, (byte) 89, super.field6315);
                if (var13 != null) {
                    var13.method758(0, -super.field6319, 0);
                    if (var12.field5522 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field6333 != -1) {
                            var13.method737(super.field6333);
                        }
                        if (~super.field6252 != -1) {
                            var13.method767(super.field6252);
                        }
                        if (~super.field6247 != -1) {
                            var13.method758(0, super.field6247, 0);
                        }
                    }
                    super.field6340[1] = var13;
                }
            }
            super.field6340[2] = null;
            if (super.field6343 != null) {
                if (~class221.field3033 <= ~super.field6346) {
                    super.field6343 = null;
                }
                if (~super.field6341 >= ~class221.field3033 && class221.field3033 < super.field6346) {
                    class393 var14 = super.field6343.method209((byte) 58, 7 | var4, arg2);
                    if (var14 != null) {
                        var14.method758(-super.field1304 + super.field6357, -super.field1310 + super.field6354, super.field6356 - super.field1311);
                        if (~var11 != -1) {
                            var14.method723(var11);
                        }
                        super.field6340[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "(I)Z")
    private final boolean method2284(int arg0) {
        if (arg0 >= -58) {
            return true;
        } else {
            ++field5230;
            return this.field5229.field4921;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
    public final int method2285(int arg0) {
        ++field5233;
        if (arg0 != -1) {
            this.field5229 = null;
        }
        if (this.field5229.field4984 != null) {
            class335 var2 = this.field5229.method2162(0);
            if (var2 != null && var2.field4967 != -1) {
                return var2.field4967;
            }
        }
        return ~this.field5229.field4967 != 0 ? this.field5229.field4967 : super.method2285(arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        ++field5223;
        if (arg3 != -42) {
            this.method791(-39);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)Lir;")
    public static final class19 method2286(boolean arg0, int arg1) {
        ++field5228;
        class257[] var2 = class160.field2268;
        synchronized (class160.field2268) {
            class19 var3;
            if (~arg1 > ~class160.field2268.length && !class160.field2268[arg1].method1611(-127)) {
                var3 = (class19) class160.field2268[arg1].method1607(16239);
                var3.method96(3);
                int var10002 = class111.field1281[arg1]--;
            } else {
                var3 = new class19();
                var3.field197 = new class127[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    var3.field197[var4] = new class127();
                }
            }
            if (!arg0) {
                field5232 = null;
            }
            return var3;
        }
    }
}
