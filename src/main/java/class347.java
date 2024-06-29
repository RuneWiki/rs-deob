import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class347 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lac;")
    private class381 field5158 = null;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    private int field5156 = 0;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field5163 = 0;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field5166 = 0;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lda;")
    private class44 field5161;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lai;")
    private class428 field5169;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[Lgo;")
    private class446[] field5167;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lod;")
    public class353 field5164;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Ls;")
    public static class186 field5162 = new class186(0, -1);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lo;")
    public static class24 field5168;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZZ)V", line = 5)
    public final void method2166(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        field5159++;
        if (arg0 != Integer.MAX_VALUE) {
            return;
        }
        boolean var7 = arg5 & this.field5161.method329();
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg1 = arg2;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg4) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field5163 != arg3) {
            if (this.field5163 != 0) {
                this.field5167[Integer.MAX_VALUE & this.field5163].method688(arg0 ^ 0x7FFFFF88);
            }
            if (arg3 != 0) {
                this.field5167[arg3 & Integer.MAX_VALUE].method696(arg4, (byte) 42);
                this.field5167[Integer.MAX_VALUE & arg3].method695((byte) -33, arg4);
                this.field5167[arg3 & Integer.MAX_VALUE].method689(arg0 ^ Integer.MIN_VALUE, arg2, arg1);
            }
            this.field5166 = arg2;
            this.field5163 = arg3;
            this.field5158 = null;
            this.field5156 = arg1;
        } else if (this.field5163 != 0) {
            this.field5167[this.field5163 & Integer.MAX_VALUE].method695((byte) -33, arg4);
            if (this.field5166 != arg2 || this.field5156 != arg1) {
                this.field5167[Integer.MAX_VALUE & this.field5163].method689(arg0 ^ Integer.MIN_VALUE, arg2, arg1);
                this.field5156 = arg1;
                this.field5166 = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lda;)V", line = 300)
    public class347(class44 arg0) {
        this.field5161 = arg0;
        this.field5169 = new class428(arg0);
        this.field5167 = new class446[10];
        this.field5167[1] = new class128(arg0);
        this.field5167[2] = new class314(arg0, this.field5169);
        this.field5167[4] = new class432(arg0, this.field5169);
        this.field5167[5] = new class226(arg0, this.field5169);
        this.field5167[6] = new class77(arg0);
        this.field5167[7] = new class503(arg0);
        this.field5167[3] = this.field5164 = new class353(arg0);
        this.field5167[8] = new class516(arg0, this.field5169);
        this.field5167[9] = new class287(arg0, this.field5169);
        if (!this.field5167[8].method691((byte) -93)) {
            this.field5167[8] = this.field5167[4];
        }
        if (!this.field5167[9].method691((byte) -93)) {
            this.field5167[9] = this.field5167[8];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lac;II)Z", line = 71)
    public final boolean method2167(class381 arg0, int arg1, int arg2) {
        field5165++;
        if (this.field5163 == 0) {
            return false;
        }
        if (this.field5158 != arg0) {
            this.field5167[Integer.MAX_VALUE & this.field5163].method694(arg1, arg2 ^ 0x1, arg0);
            this.field5158 = arg0;
        }
        if (arg2 != 1) {
            this.method2167(null, -69, -116);
        }
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 96)
    public static void method2168(int arg0) {
        field5168 = null;
        field5162 = null;
        if (arg0 != 0) {
            method2168(-85);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZBLig;)V", line = 111)
    public static final void method2169(boolean arg0, byte arg1, class163 arg2) {
        field5160++;
        if (class332.field5041 >= 400) {
            return;
        }
        class51 var3 = arg2.field2613;
        if (var3.field1038 != null) {
            var3 = var3.method475(class402.field6080, -1);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1062) {
            return;
        }
        if (arg1 <= 15) {
            field5168 = null;
        }
        String var4 = var3.field1069;
        if (var3.field1035 != 0) {
            String var5 = class424.field6366 == class209.field3343 ? class42.field583.method1977(class146.field2452, -85) : class181.field2930.method1977(class146.field2452, 94);
            var4 = var4 + class12.method77(-103, var3.field1035, class15.field266.field5362) + " (" + var5 + var3.field1035 + ")";
        }
        if (!class233.field3597) {
            if (!arg0) {
                String[] var7 = var3.field1039;
                if (class420.field6336) {
                    var7 = class106.method910((byte) 52, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field1026 == 0 || !var7[var8].equalsIgnoreCase(class215.field3404.method1977(class146.field2452, -36)))) {
                            byte var9 = 0;
                            int var10 = class10.field139;
                            if (var8 == 0) {
                                var9 = 51;
                            }
                            if (var8 == 1) {
                                var9 = 9;
                            }
                            if (var8 == 2) {
                                var9 = 6;
                            }
                            if (var8 == 3) {
                                var9 = 22;
                            }
                            if (var3.field1068 == var8) {
                                var10 = var3.field1025;
                            }
                            if (var8 == 4) {
                                var9 = 20;
                            }
                            if (var3.field1080 == var8) {
                                var10 = var3.field1033;
                            }
                            class525.field7635++;
                            class274.method1739(var7[var8], 102, var9, (long) arg2.field7789, 0, false, var7[var8].equalsIgnoreCase(class215.field3404.method1977(class146.field2452, 94)) ? var3.field1010 : var10, "<col=ffff00>" + var4, true, -1, 0);
                        }
                    }
                }
                if (var3.field1026 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class215.field3404.method1977(class146.field2452, -87))) {
                            short var12 = 0;
                            if (class15.field266.field5362 < var3.field1035) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 51;
                            }
                            if (var11 == 1) {
                                var13 = 9;
                            }
                            if (var11 == 2) {
                                var13 = 6;
                            }
                            if (var11 == 3) {
                                var13 = 22;
                            }
                            if (var11 == 4) {
                                var13 = 20;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class270.field4092++;
                            class274.method1739(var7[var11], 75, var13, (long) arg2.field7789, 0, false, var3.field1010, "<col=ffff00>" + var4, true, -1, 0);
                        }
                    }
                }
            }
            class265.field4033++;
            class274.method1739(class44.field697.method1977(class146.field2452, -48), 84, 1012, (long) arg2.field7789, 0, arg0, class18.field297, "<col=ffff00>" + var4, true, -1, 0);
        } else if (!arg0) {
            class247 var6 = class352.field5194 == -1 ? null : class453.field6727.method460(class352.field5194, -18297);
            if ((class364.field5326 & 0x2) != 0) {
                if (var6 == null || var3.method478(var6.field3809, -10957, class352.field5194) != var6.field3809) {
                    class516.field7490++;
                    class274.method1739(class101.field1932, 39, 11, (long) arg2.field7789, 0, false, class220.field3455, class373.field5465 + " -> <col=ffff00>" + var4, true, -1, 0);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Z", line = 279)
    public final boolean method2170(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            field5157++;
            return this.field5167[arg1].method691((byte) -93);
        }
    }
}
