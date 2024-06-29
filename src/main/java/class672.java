import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class672 extends class644 {

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Lkg;")
    public static class275 field9411 = new class275(85, 6);

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public int field9403;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field9404;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field9405;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field9408;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lsf;")
    public class526 field9415;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Ljava/lang/String;")
    public String field9414;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    public int[] field9406;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[I")
    public int[] field9407;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "[Ltba;")
    public class165[] field9413;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field9412;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsl;Lqg;BI)V")
    public static final void method3775(class461 arg0, class465 arg1, byte arg2, int arg3) {
        field9409++;
        class254 var4 = new class254();
        var4.field3246 = arg0.method2600((byte) -126);
        if (arg2 >= -72) {
            return;
        }
        var4.field3240 = arg0.method2622(-539564808);
        var4.field3242 = new class181[var4.field3246];
        var4.field3239 = new byte[var4.field3246][][];
        var4.field3238 = new int[var4.field3246];
        var4.field3241 = new class181[var4.field3246];
        var4.field3245 = new int[var4.field3246];
        var4.field3243 = new int[var4.field3246];
        for (int var5 = 0; var5 < var4.field3246; var5++) {
            try {
                int var6 = arg0.method2600((byte) -128);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method2574(-1);
                    String var8 = arg0.method2574(-1);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method2622(-539564808);
                    }
                    var4.field3238[var5] = var6;
                    var4.field3245[var5] = var9;
                    var4.field3241[var5] = arg1.method2652(var8, (byte) 105, class512.method2988(var7, 0));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method2574(-1);
                    String var11 = arg0.method2574(-1);
                    int var12 = arg0.method2600((byte) -123);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method2574(-1);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method2622(-539564808);
                            var15[var16] = new byte[var17];
                            arg0.method2573(var15[var16], (byte) -77, var17, 0);
                        }
                    }
                    var4.field3238[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class512.method2988(var13[var19], 0);
                    }
                    var4.field3242[var5] = arg1.method2645((byte) 89, class512.method2988(var10, 0), var18, var11);
                    var4.field3239[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3243[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3243[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3243[var5] = -3;
            } catch (Exception var23) {
                var4.field3243[var5] = -4;
            } catch (Throwable var24) {
                var4.field3243[var5] = -5;
            }
        }
        class660.field9187.method3671(var4, false);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsl;I)V")
    public static final void method3776(class461 arg0, int arg1) {
        field9410++;
        int var2 = arg0.method2594(3340);
        class264.field3336 = new class761[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class264.field3336[var3] = new class761();
            class264.field3336[var3].field10611 = arg0.method2594(3340);
            class264.field3336[var3].field10617 = arg0.method2625(-116);
        }
        class227.field3004 = arg0.method2594(3340);
        class461.field6215 = arg0.method2594(3340);
        class163.field2243 = arg0.method2594(3340);
        class444.field5900 = new class138[class461.field6215 + 1 - class227.field3004];
        for (int var4 = 0; var4 < class163.field2243; var4++) {
            int var5 = arg0.method2594(3340);
            class138 var6 = class444.field5900[var5] = new class138();
            var6.field2095 = arg0.method2600((byte) -123);
            var6.field2102 = arg0.method2622(-539564808);
            var6.field1979 = class227.field3004 + var5;
            var6.field1975 = arg0.method2625(-119);
            var6.field1977 = arg0.method2625(-93);
        }
        if (arg1 <= 121) {
            method3776(null, 127);
        }
        class167.field2323 = arg0.method2622(-539564808);
        class609.field8451 = true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method3777(int arg0) {
        int var1 = -33 % ((7 - arg0) / 38);
        field9411 = null;
    }
}
