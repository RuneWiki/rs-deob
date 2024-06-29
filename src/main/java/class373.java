import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class373 implements class181 {

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lce;")
    private class345 field5300 = new class345(256);

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ldp;")
    private class174 field5299;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Ldp;")
    private class174 field5307;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[Lgf;")
    private class200[] field5296;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Z")
    public static boolean field5302 = false;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBIFIZ)[I", line = 8)
    public final int[] method1411(int arg0, byte arg1, int arg2, float arg3, int arg4, boolean arg5) {
        field5293++;
        if (arg1 != -90) {
            this.method2378(51, 63);
        }
        return this.method2378(arg0, -87).method844(arg4, this, arg2, this.field5299, (double) arg3, this.field5296[arg0].field2921, (byte) -110);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIZFI)[F", line = 19)
    public final float[] method1414(int arg0, boolean arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (!arg3) {
            method2377(97);
        }
        field5294++;
        return this.method2378(arg0, -117).method848(this, arg2, this.field5296[arg0].field2921, this.field5299, (byte) 127, arg5);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lgf;", line = 30)
    public final class200 method1412(int arg0, byte arg1) {
        field5304++;
        if (arg1 >= -65) {
            this.field5300 = null;
        }
        return this.field5296[arg0];
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)V", line = 47)
    public static final void method2374(byte arg0, int arg1) {
        field5305++;
        class18 var2 = class234.field3395;
        synchronized (class234.field3395) {
            class234.field3395.method106((byte) -125);
            class234.field3395 = new class18(arg1);
        }
        if (arg0 > -14) {
            method2377(-106);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Lba;", line = 61)
    public static final class270 method2375(int arg0, int arg1) {
        field5297++;
        if (arg0 < 23) {
            field5306 = 2;
        }
        if (arg1 == 0) {
            return new class392();
        } else if (arg1 == 1) {
            return new class182();
        } else if (arg1 == 2) {
            return new class310();
        } else if (arg1 == 3) {
            return new class328();
        } else if (arg1 == 4) {
            return new class93();
        } else if (arg1 == 5) {
            return new class333();
        } else if (arg1 == 6) {
            return new class157();
        } else if (arg1 == 7) {
            return new class223();
        } else if (arg1 == 8) {
            return new class48();
        } else if (arg1 == 9) {
            return new class329();
        } else if (arg1 == 10) {
            return new class429();
        } else if (arg1 == 11) {
            return new class28();
        } else if (arg1 == 12) {
            return new class111();
        } else if (arg1 == 13) {
            return new class369();
        } else if (arg1 == 14) {
            return new class247();
        } else if (arg1 == 15) {
            return new class443();
        } else if (arg1 == 16) {
            return new class416();
        } else if (arg1 == 17) {
            return new class176();
        } else if (arg1 == 18) {
            return new class152();
        } else if (arg1 == 19) {
            return new class275();
        } else if (arg1 == 20) {
            return new class113();
        } else if (arg1 == 21) {
            return new class151();
        } else if (arg1 == 22) {
            return new class175();
        } else if (arg1 == 23) {
            return new class40();
        } else if (arg1 == 24) {
            return new class268();
        } else if (arg1 == 25) {
            return new class55();
        } else if (arg1 == 26) {
            return new class336();
        } else if (arg1 == 27) {
            return new class409();
        } else if (arg1 == 28) {
            return new class60();
        } else if (arg1 == 29) {
            return new class250();
        } else if (arg1 == 30) {
            return new class376();
        } else if (arg1 == 31) {
            return new class230();
        } else if (arg1 == 32) {
            return new class12();
        } else if (arg1 == 33) {
            return new class407();
        } else if (arg1 == 34) {
            return new class423();
        } else if (arg1 == 35) {
            return new class47();
        } else if (arg1 == 36) {
            return new class27();
        } else if (arg1 == 37) {
            return new class85();
        } else if (arg1 == 38) {
            return new class285();
        } else if (arg1 == 39) {
            return new class19();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBZLjava/lang/String;)I", line = 379)
    public static final int method2376(int arg0, byte arg1, boolean arg2, String arg3) {
        field5292++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 != -58) {
            method2375(-53, 116);
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 460)
    public static final void method2377(int arg0) {
        class18 var1 = class180.field2678;
        synchronized (class180.field2678) {
            class180.field2678.method112(0);
        }
        if (arg0 != -34) {
            method2380(6, (String) null);
        }
        field5290++;
        class18 var2 = class39.field600;
        synchronized (class39.field600) {
            class39.field600.method112(0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)Z", line = 477)
    public final boolean method1415(byte arg0, int arg1) {
        if (arg0 < 90) {
            method2381(-35);
        }
        field5301++;
        class102 var3 = this.method2378(arg1, -104);
        return var3 != null && var3.method841(this, this.field5299, -706298236);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Laf;", line = 493)
    private final class102 method2378(int arg0, int arg1) {
        field5298++;
        class179 var3 = this.field5300.method2228(-1, (long) arg0);
        if (var3 != null) {
            return (class102) var3;
        }
        byte[] var4 = this.field5307.method1336(-105, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 > -62) {
            this.field5299 = null;
        }
        class102 var5 = new class102(new class37(var4));
        this.field5300.method2226((long) arg0, var5, (byte) -108);
        return var5;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I", line = 519)
    public static final int method2379(int arg0, int arg1) {
        return class28.field412 == null ? 0 : class28.field412[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 522)
    public static final void method2380(int arg0, String arg1) {
        if (arg0 == 19380) {
            field5303++;
            class202.method1540(0, "", arg1, true, "", 0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIFZZ)[I", line = 536)
    public final int[] method1413(int arg0, int arg1, int arg2, float arg3, boolean arg4, boolean arg5) {
        field5289++;
        return arg5 ? null : this.method2378(arg1, -71).method838(this, arg0, arg4, arg2, (double) arg3, -7983, this.field5296[arg1].field2921, this.field5299);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 547)
    public static final void method2381(int arg0) {
        class18 var1 = class180.field2678;
        synchronized (class180.field2678) {
            class180.field2678.method106((byte) -107);
        }
        field5288++;
        class18 var2 = class39.field600;
        synchronized (class39.field600) {
            class39.field600.method106((byte) -114);
            if (arg0 < 62) {
                field5306 = 91;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ldp;Ldp;Ldp;)V", line = 571)
    public class373(class174 arg0, class174 arg1, class174 arg2) {
        this.field5299 = arg2;
        this.field5307 = arg1;
        class37 var4 = new class37(arg0.method1355(0, -12607, 0));
        int var5 = var4.method320((byte) -87);
        this.field5296 = new class200[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method271((byte) 127) == 1) {
                this.field5296[var6] = new class200();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5296[var7] != null) {
                this.field5296[var7].field2922 = var4.method271((byte) 101) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5296[var8] != null) {
                this.field5296[var8].field2914 = var4.method271((byte) 108) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5296[var9] != null) {
                this.field5296[var9].field2931 = var4.method271((byte) 118) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5296[var10] != null) {
                this.field5296[var10].field2920 = var4.method271((byte) 104) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5296[var11] != null) {
                this.field5296[var11].field2934 = var4.method291(0);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5296[var12] != null) {
                this.field5296[var12].field2917 = var4.method291(0);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5296[var13] != null) {
                this.field5296[var13].field2930 = var4.method291(0);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5296[var14] != null) {
                this.field5296[var14].field2912 = var4.method291(0);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5296[var15] != null) {
                this.field5296[var15].field2918 = (short) var4.method320((byte) -87);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5296[var16] != null) {
                this.field5296[var16].field2911 = var4.method291(0);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5296[var17] != null) {
                this.field5296[var17].field2929 = var4.method291(0);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5296[var18] != null) {
                this.field5296[var18].field2910 = var4.method271((byte) 122) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5296[var19] != null) {
                this.field5296[var19].field2921 = var4.method271((byte) 126) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5296[var20] != null) {
                this.field5296[var20].field2926 = var4.method291(0);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5296[var21] != null) {
                this.field5296[var21].field2915 = var4.method271((byte) 107) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5296[var22] != null) {
                this.field5296[var22].field2923 = var4.method271((byte) 124) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5296[var23] != null) {
                this.field5296[var23].field2927 = var4.method271((byte) 100) == 1;
            }
        }
    }
}
