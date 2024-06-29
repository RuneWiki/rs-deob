import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class35 extends class3 {

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lqc;")
    public class160 field518;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Lok;")
    public static class41 field521 = class137.method956("; version=1; path=)4; domain=", 45);

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "Z")
    public static boolean field519 = false;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "Lok;")
    public static class41 field528 = class137.method956("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 45);

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "[Lwd;")
    public static class162[] field529 = new class162[4];

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Lok;")
    public static class41 field525 = class137.method956("overlay", 45);

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lak;")
    public static class20 field527 = new class20(64);

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Lok;")
    public static class41 field531 = class137.method956(" )2> ", 45);

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "Lak;")
    public static class20 field532 = new class20(64);

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "F")
    public static float field520;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lmh;")
    public static class65 field524;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "[Lka;")
    public static class279[] field530;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 12)
    public static final void method233(int arg0) {
        field522++;
        if (arg0 != 2108607824) {
            field521 = (class41) null;
        }
        for (int var1 = 0; var1 < class85.field1239; var1++) {
            int var2 = class241.field3853[var1];
            class50 var3 = class216.field3471[var2];
            int var4 = class164.field2597.method792(2);
            if ((var4 & 0x80) != 0) {
                var3.field4289 = class164.field2597.method775(-115);
                int var5 = class164.field2597.method782((byte) -112);
                var3.field4320 = 0;
                var3.field4330 = 0;
                var3.field4279 = (var5 & 0xFFFF) + class18.field234;
                if (var3.field4289 == 65535) {
                    var3.field4289 = -1;
                }
                var3.field4287 = var5 >> 16;
                if (var3.field4279 > class18.field234) {
                    var3.field4320 = -1;
                }
                if (var3.field4289 != -1 && class18.field234 == var3.field4279) {
                    int var6 = class5.method15(var3.field4289, false).field3545;
                    if (var6 != -1) {
                        class205 var7 = class285.method2000(var6, 4442);
                        if (var7 != null && var7.field3323 != null) {
                            class148.method1026(var3.field4311, 0, var3.field4280, var7, -102, false);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class164.field2597.method810(26873);
                int var9 = class164.field2597.method793(-85);
                var3.method1905(var9, 19191, class18.field234, var8);
                var3.field4329 = class18.field234 + 300;
                var3.field4340 = class164.field2597.method793(-90);
            }
            if ((var4 & 0x8) != 0) {
                var3.field4327 = class164.field2597.method798((byte) 104);
                var3.field4319 = class164.field2597.method775(97);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field758.method1011(121)) {
                    class112.method773((byte) -3, var3);
                }
                var3.field758 = class165.method1156(class164.field2597.method775(89), (byte) -126);
                var3.method1904(var3.field758.field2251, -28);
                var3.field4277 = var3.field758.field2283;
                var3.field4298 = var3.field758.field2255;
                var3.field4321 = var3.field758.field2266;
                var3.field4271 = var3.field758.field2270;
                var3.field4324 = var3.field758.field2239;
                var3.field4282 = var3.field758.field2245;
                var3.field4339 = var3.field758.field2287;
                var3.field4313 = var3.field758.field2273;
                if (var3.field758.method1011(121)) {
                    class74.method546(class55.field807, 5559, (class171) null, var3, 0, var3.field4306[0], var3.field4341[0], (class245) null);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field4275 = class164.field2597.method763(true);
                var3.field4283 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class164.field2597.method815(255);
                int var11 = class164.field2597.method793(-93);
                var3.method1905(var11, arg0 - 2108588633, class18.field234, var10);
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class164.field2597.method808(255);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class164.field2597.method810(26873);
                class119.method852(var3, var12, var13, 33);
            }
            if ((var4 & 0x10) != 0) {
                var3.field4335 = class164.field2597.method759((byte) -69);
                if (var3.field4335 == 65535) {
                    var3.field4335 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 167)
    public static void method234(int arg0) {
        field527 = null;
        field528 = null;
        field532 = null;
        field529 = null;
        if (arg0 != 4) {
            field520 = 0.037170894F;
        }
        field531 = null;
        field524 = null;
        field521 = null;
        field530 = null;
        field525 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Llb;Lag;ZI)V", line = 199)
    public static final void method235(class112 arg0, class211 arg1, boolean arg2, int arg3) {
        class33 var4 = new class33();
        field523++;
        var4.field500 = arg0.method792(2);
        var4.field503 = arg0.method779(-27100);
        var4.field509 = new int[var4.field500];
        var4.field502 = new int[var4.field500];
        var4.field489 = new int[var4.field500];
        var4.field504 = new byte[var4.field500][][];
        var4.field495 = new class182[var4.field500];
        var4.field494 = new class182[var4.field500];
        if (arg2) {
            field520 = 1.4276478F;
        }
        for (int var5 = 0; var5 < var4.field500; var5++) {
            try {
                int var6 = arg0.method792(2);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method763(true).method317(false));
                    String var8 = new String(arg0.method763(!arg2).method317(false));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method779(-27100);
                    }
                    var4.field489[var5] = var6;
                    var4.field502[var5] = var9;
                    var4.field495[var5] = arg1.method1485(var8, class73.method543(-1, var7), 988);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method763(true).method317(false));
                    String var11 = new String(arg0.method763(true).method317(false));
                    int var12 = arg0.method792(2);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method763(true).method317(arg2));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method779(-27100);
                            var15[var16] = new byte[var17];
                            arg0.method807(var17, var15[var16], (byte) 109, 0);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field489[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class73.method543(-1, var13[var19]);
                    }
                    var4.field494[var5] = arg1.method1474(class73.method543(-1, var10), var18, var11, (byte) -51);
                    var4.field504[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field509[var5] = -1;
            } catch (SecurityException var26) {
                var4.field509[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field509[var5] = -3;
            } catch (Exception var28) {
                var4.field509[var5] = -4;
            } catch (Throwable var29) {
                var4.field509[var5] = -5;
            }
        }
        class160.field2508.method1503(var4, (byte) -114);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lqc;)V", line = 313)
    public class35(class160 arg0) {
        this.field518 = arg0;
    }
}
