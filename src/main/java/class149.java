import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class149 implements class226 {

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Loa;")
    private class101 field2333 = new class101(256);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ldk;")
    private class251 field2323;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Ldk;")
    private class251 field2334;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[Lgb;")
    private class69[] field2331;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[Lwl;")
    public static class304[] field2332 = new class304[14];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lvb;")
    public static class140 field2325;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lph;")
    public static class217 field2329;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
    public static int[] field2336;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFZI)[I")
    public final int[] method1033(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        field2330++;
        return arg5 > -112 ? null : this.method102(64, arg1).method449(this.field2323, this, this.field2331[arg1].field1150, arg0, arg4, (double) arg3, arg2, (byte) 109);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)Lmh;")
    public class64 method102(int arg0, int arg1) {
        class137 var3 = this.field2333.method694((long) arg1, false);
        field2328++;
        if (var3 != null) {
            return (class64) var3;
        }
        byte[] var4 = this.field2334.method1689(arg1, -124);
        if (var4 == null) {
            return null;
        }
        class64 var5 = new class64(new class162(var4));
        if (arg0 != 64) {
            field2325 = null;
        }
        this.field2333.method693((long) arg1, arg0 ^ 0xFFFFFFF4, var5);
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lgb;")
    public final class69 method1034(int arg0, int arg1) {
        if (arg1 != -1) {
            field2335 = 84;
        }
        field2324++;
        return this.field2331[arg0];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILbc;II)V")
    public static final void method1035(int arg0, int arg1, class299 arg2, int arg3, int arg4) {
        field2326++;
        if (class239.field3829 == arg2 || class83.field1384 >= 400) {
            return;
        }
        String var11;
        if (arg2.field4797 == 0) {
            boolean var5 = true;
            if (class239.field3829.field4791 != -1 && arg2.field4791 != -1) {
                int var6 = arg2.field4790 < class239.field3829.field4790 ? class239.field3829.field4790 : arg2.field4790;
                int var7 = class239.field3829.field4791 < arg2.field4791 ? class239.field3829.field4791 : arg2.field4791;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class239.field3829.field4790 - arg2.field4790;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class299.field4792 == 1 ? class146.field2307 : class262.field4212;
            if (arg2.field4774 <= arg2.field4790) {
                var11 = arg2.method1979(true, true) + (var5 ? class228.method1546(0, class239.field3829.field4790, arg2.field4790) : "<col=ffffff>") + " (" + var10 + arg2.field4790 + ")";
            } else {
                var11 = arg2.method1979(true, true) + (var5 ? class228.method1546(0, class239.field3829.field4790, arg2.field4790) : "<col=ffffff>") + " (" + var10 + arg2.field4790 + "+" + (arg2.field4774 - arg2.field4790) + ")";
            }
        } else {
            var11 = arg2.method1979(true, true) + " (" + class238.field3816 + arg2.field4797 + ")";
        }
        if (class46.field778 == 1) {
            class245.field3893++;
            class266.method1789(class14.field159 + " -> <col=ffffff>" + var11, arg4, arg1, class100.field1625, (long) arg3, class161.field2557, 126, (short) 57);
        } else if (!class139.field2211) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class61.field999[var12] != null) {
                    class146.field2296++;
                    short var14 = 0;
                    if (class299.field4792 == 0 && class61.field999[var12].equalsIgnoreCase(class203.field3240)) {
                        if (arg2.field4790 > class239.field3829.field4790) {
                            var14 = 2000;
                        }
                        if (class239.field3829.field4781 != 0 && arg2.field4781 != 0) {
                            if (class239.field3829.field4781 == arg2.field4781) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class267.field4300[var12]) {
                        var14 = 2000;
                    }
                    boolean var15 = false;
                    short var16 = class145.field2292[var12];
                    short var17 = (short) (var14 + var16);
                    class266.method1789("<col=ffffff>" + var11, arg4, arg1, class61.field999[var12], (long) arg3, class247.field3937[var12], -76, var17);
                }
            }
        } else if ((class258.field4168 & 0x8) != 0) {
            class69.field1144++;
            class266.method1789(class203.field3235 + " -> <col=ffffff>" + var11, arg4, arg1, class19.field230, (long) arg3, class143.field2268, 126, (short) 37);
        }
        if (arg0 != 7920) {
            field2336 = null;
        }
        for (int var13 = 0; var13 < class83.field1384; var13++) {
            if (class192.field3103[var13] == 50) {
                class269.field4343[var13] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Z")
    public final boolean method1036(byte arg0, int arg1) {
        field2327++;
        if (arg0 > -79) {
            this.field2334 = null;
        }
        class64 var3 = this.method102(64, arg1);
        return var3 != null && var3.method446(this.field2323, this, -92);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field2329 = null;
        field2325 = null;
        field2336 = null;
        if (arg0 < 47) {
            method1037((byte) 1);
        }
        field2332 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ldk;Ldk;Ldk;)V")
    public class149(class251 arg0, class251 arg1, class251 arg2) {
        this.field2323 = arg2;
        this.field2334 = arg1;
        class162 var4 = new class162(arg0.method1680(0, 0, -90));
        int var5 = var4.method1142(-18970);
        this.field2331 = new class69[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1133((byte) 53) == 1) {
                this.field2331[var6] = new class69();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2331[var7] != null) {
                this.field2331[var7].field1143 = var4.method1133((byte) 53) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2331[var8] != null) {
                this.field2331[var8].field1149 = var4.method1133((byte) 53) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2331[var9] != null) {
                this.field2331[var9].field1142 = var4.method1133((byte) 53) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2331[var10] != null) {
                var4.method1133((byte) 53);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2331[var11] != null) {
                var4.method1107((byte) -115);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2331[var12] != null) {
                var4.method1107((byte) -124);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2331[var13] != null) {
                var4.method1107((byte) -90);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2331[var14] != null) {
                var4.method1107((byte) -114);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2331[var15] != null) {
                this.field2331[var15].field1147 = (short) var4.method1142(-18970);
            }
        }
        if (var4.field2568 < var4.field2573.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2331[var16] != null) {
                    var4.method1107((byte) -99);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2331[var17] != null) {
                    var4.method1107((byte) -106);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2331[var18] != null) {
                    var4.method1133((byte) 53);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2331[var19] != null) {
                    this.field2331[var19].field1150 = var4.method1133((byte) 53) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2331[var20] != null) {
                    var4.method1107((byte) -80);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2331[var21] != null) {
                    var4.method1133((byte) 53);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2331[var22] != null) {
                    var4.method1133((byte) 53);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2331[var23] != null) {
                    var4.method1133((byte) 53);
                }
            }
        }
    }
}
