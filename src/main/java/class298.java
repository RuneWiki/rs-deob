import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class298 implements class105 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lti;")
    private class5 field4860 = new class5(256);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lgi;")
    private class164 field4863;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lgi;")
    private class164 field4861;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Lqc;")
    private class65[] field4868;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "J")
    public static long field4864;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lgi;")
    public static class164 field4859;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Lgi;")
    public static class164 field4869;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
    public static final void method2043(int arg0, int arg1, int arg2) {
        class68.field1090[arg1] = arg0;
        if (arg2 != 0) {
            return;
        }
        class199 var3 = (class199) class265.field4318.method371(65, (long) arg1);
        field4865++;
        if (var3 == null) {
            class199 var4 = new class199(class264.method1778(6573) + 500L);
            class265.field4318.method368((long) arg1, var4, -77);
        } else {
            var3.field3190 = class264.method1778(arg2 + 6573) + 500L;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(CI)Z")
    public static final boolean method2044(char arg0, int arg1) {
        field4872++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != -29292) {
                method2044('=', -30);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lqc;")
    public final class65 method746(int arg0, int arg1) {
        if (arg1 == -8213) {
            field4858++;
            return this.field4868[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIIFII)[I")
    public final int[] method747(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg5 != 1536) {
            method2047(23);
        }
        field4870++;
        return this.method1497(arg4, (byte) -115).method1416(this.field4868[arg4].field1042, this, (double) arg3, this.field4863, arg2, arg0, 4329, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)Z")
    public final boolean method748(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4860 = null;
        }
        field4871++;
        class202 var3 = this.method1497(arg1, (byte) -77);
        return var3 != null && var3.method1413(this.field4863, this, 127);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lvb;I)V")
    public static final void method2045(class62 arg0, int arg1) {
        field4874++;
        int var2 = arg0.field912 - class274.field4472;
        if (arg1 < 43) {
            return;
        }
        int var3 = arg0.field960 * 128 + arg0.method101(false) * 64;
        int var4 = arg0.field985 * 128 + (arg0.method101(false) * 64);
        if (arg0.field953 == 0) {
            arg0.field963 = 1024;
        }
        arg0.field931 = 0;
        arg0.field929 += (var4 - arg0.field929) / var2;
        arg0.field994 += (var3 - arg0.field994) / var2;
        if (arg0.field953 == 1) {
            arg0.field963 = 1536;
        }
        if (arg0.field953 == 2) {
            arg0.field963 = 0;
        }
        if (arg0.field953 == 3) {
            arg0.field963 = 512;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method2046(int arg0, int arg1, int arg2) {
        field4873++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (arg0 != 376) {
                field4859 = null;
            }
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lgi;Lgi;Lgi;)V")
    public class298(class164 arg0, class164 arg1, class164 arg2) {
        this.field4863 = arg2;
        this.field4861 = arg1;
        class274 var4 = new class274(arg0.method1156(0, 0, (byte) -16));
        int var5 = var4.method1837(252);
        this.field4868 = new class65[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1849(255) == 1) {
                this.field4868[var6] = new class65();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4868[var7] != null) {
                this.field4868[var7].field1050 = var4.method1849(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4868[var8] != null) {
                this.field4868[var8].field1049 = var4.method1849(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4868[var9] != null) {
                this.field4868[var9].field1057 = var4.method1849(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4868[var10] != null) {
                var4.method1849(255);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4868[var11] != null) {
                var4.method1830((byte) -89);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4868[var12] != null) {
                var4.method1830((byte) -102);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4868[var13] != null) {
                var4.method1830((byte) 83);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4868[var14] != null) {
                var4.method1830((byte) 114);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4868[var15] != null) {
                this.field4868[var15].field1045 = (short) var4.method1837(252);
            }
        }
        if (var4.field4458 < var4.field4441.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field4868[var16] != null) {
                    var4.method1830((byte) -86);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field4868[var17] != null) {
                    var4.method1830((byte) 106);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field4868[var18] != null) {
                    var4.method1849(255);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field4868[var19] != null) {
                    this.field4868[var19].field1042 = var4.method1849(255) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field4868[var20] != null) {
                    var4.method1830((byte) 118);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field4868[var21] != null) {
                    var4.method1849(255);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field4868[var22] != null) {
                    var4.method1849(255);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field4868[var23] != null) {
                    var4.method1849(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4859 = null;
        if (arg0 != -14000) {
            method2044('j', -93);
        }
        field4869 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lma;")
    public class202 method1497(int arg0, byte arg1) {
        field4862++;
        class252 var3 = this.field4860.method61(97, (long) arg0);
        if (var3 != null) {
            return (class202) var3;
        }
        byte[] var4 = this.field4861.method1142(arg0, -10363);
        if (arg1 >= -75) {
            this.method1497(74, (byte) 89);
        }
        if (var4 == null) {
            return null;
        } else {
            class202 var5 = new class202(new class274(var4));
            this.field4860.method59(var5, (long) arg0, 5);
            return var5;
        }
    }
}
