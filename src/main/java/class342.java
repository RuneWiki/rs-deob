import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class342 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lv;")
    public class77 field5295 = new class77();

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5281 = "Please remove ";

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field5282 = 50;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field5289 = new int[14];

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5284 = new String[field5282];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
    public static int[] field5291 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public static int[] field5279 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field5285 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field5287 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    public static int[] field5294 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
    public static int[] field5297 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[I")
    public static int[] field5288 = new int[field5282];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lv;")
    private class77 field5296;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnf;ILsb;)V", line = 10)
    public static final void method2384(int arg0, class61 arg1, int arg2, class190 arg3) {
        class144 var4 = new class144();
        field5277++;
        var4.field2082 = arg3.method1319(255);
        var4.field2079 = arg3.method1371(arg2 - 8);
        var4.field2086 = new class210[var4.field2082];
        var4.field2075 = new int[var4.field2082];
        var4.field2083 = new byte[var4.field2082][][];
        var4.field2077 = new int[var4.field2082];
        var4.field2080 = new int[var4.field2082];
        var4.field2076 = new class210[var4.field2082];
        for (int var5 = 0; var5 < var4.field2082; var5++) {
            try {
                int var6 = arg3.method1319(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1329((byte) 59);
                    String var8 = arg3.method1329((byte) 59);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1371(-4);
                    }
                    var4.field2080[var5] = var6;
                    var4.field2075[var5] = var9;
                    var4.field2076[var5] = arg1.method501((byte) -114, var8, class144.method1036((byte) 98, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1329((byte) 59);
                    String var11 = arg3.method1329((byte) 59);
                    int var12 = arg3.method1319(arg2 + 251);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1329((byte) 59);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1371(-4);
                            var15[var16] = new byte[var17];
                            arg3.method1309(var17, 0, var15[var16], -21941);
                        }
                    }
                    var4.field2080[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class144.method1036((byte) 116, var13[var19]);
                    }
                    var4.field2086[var5] = arg1.method478(class144.method1036((byte) 110, var10), 0, var18, var11);
                    var4.field2083[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2077[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2077[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2077[var5] = -3;
            } catch (Exception var28) {
                var4.field2077[var5] = -4;
            } catch (Throwable var29) {
                var4.field2077[var5] = -5;
            }
        }
        class312.field4646.method106(var4, -127);
        if (arg2 != 4) {
            field5284 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lv;I)V", line = 136)
    public final void method2385(class77 arg0, int arg1) {
        if (arg0.field1124 != null) {
            arg0.method627(0);
        }
        arg0.field1127 = this.field5295;
        field5286++;
        arg0.field1124 = this.field5295.field1124;
        if (arg1 != 14) {
            this.method2386((byte) -90);
        }
        arg0.field1124.field1127 = arg0;
        arg0.field1127.field1124 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lv;", line = 156)
    public final class77 method2386(byte arg0) {
        field5280++;
        class77 var2 = this.field5295.field1127;
        if (this.field5295 == var2) {
            this.field5296 = null;
            return null;
        }
        this.field5296 = var2.field1127;
        if (arg0 > -26) {
            field5291 = (int[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z", line = 177)
    public static final boolean method2387(int arg0, int arg1) {
        int var2 = 15 / ((-arg1 - 40) / 32);
        field5278++;
        if (class331.field5042 == arg0) {
            return false;
        }
        class208.field3040 = new int[104][104];
        class17.field283 = new int[104][104];
        class8.field152 = new int[104][104];
        class255.field3815 = new int[4][13][13];
        class86.field1209 = new int[104][104];
        for (int var3 = 0; var3 < 4; var3++) {
            class92.field1269[var3] = new class96(104, 104);
        }
        class230.field3491 = new byte[4][104][104];
        class252.field3762 = new class16[4][104][104];
        class170.field2456 = new byte[4][104][104];
        if (class141.field2031) {
            class268.method1977(4, 104, 104);
            class24.method148(104, 104);
            class73.field1070 = new class2[13][13];
        }
        class331.field5042 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lv;", line = 221)
    public final class77 method2388(byte arg0) {
        class77 var2 = this.field5296;
        field5290++;
        if (this.field5295 == var2) {
            this.field5296 = null;
            return null;
        }
        this.field5296 = var2.field1127;
        if (arg0 != -92) {
            field5285 = (int[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 241)
    public final int method2389(int arg0) {
        field5292++;
        if (arg0 <= 107) {
            method2384(-54, (class61) null, 119, (class190) null);
        }
        int var2 = 0;
        for (class77 var3 = this.field5295.field1127; var3 != this.field5295; var3 = var3.field1127) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Lv;", line = 269)
    public final class77 method2390(byte arg0) {
        class77 var2 = this.field5295.field1127;
        field5293++;
        if (this.field5295 == var2) {
            return null;
        }
        if (arg0 < 91) {
            method2387(72, -87);
        }
        var2.method627(0);
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 289)
    public static void method2391(int arg0) {
        field5288 = null;
        field5297 = null;
        field5289 = null;
        field5279 = null;
        field5294 = null;
        field5284 = null;
        field5281 = null;
        if (arg0 < 26) {
            method2384(-60, (class61) null, 17, (class190) null);
        }
        field5287 = null;
        field5291 = null;
        field5285 = null;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V", line = 315)
    public final void method2392(byte arg0) {
        while (true) {
            class77 var2 = this.field5295.field1127;
            if (this.field5295 == var2) {
                field5283++;
                int var3 = 55 % ((11 - arg0) / 52);
                this.field5296 = null;
                return;
            }
            var2.method627(0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 360)
    public class342() {
        this.field5295.field1127 = this.field5295;
        this.field5295.field1124 = this.field5295;
    }
}
