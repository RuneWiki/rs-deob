import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class301 extends class197 {

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    private int field5139;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5143 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field5145 = 0;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Lmb;")
    public static class172 field5148 = new class172(64);

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "Loh;")
    private static class258 field5151 = class153.method1046("Loaded sprites", 96);

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "Loh;")
    public static class258 field5155 = class153.method1046("zap", 108);

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "Loh;")
    public static class258 field5154 = field5151;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field5156 = 0;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "Loh;")
    public static class258 field5152 = class153.method1046("null", 93);

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "Loh;")
    private static class258 field5157 = class153.method1046("Continue", 107);

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "Loh;")
    public static class258 field5158 = class153.method1046("k", 97);

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Loh;")
    public static class258 field5150 = field5157;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "[I")
    public static int[] field5149;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "[[Lgd;")
    public static class157[][] field5159;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method2111(int arg0, int arg1, int arg2, int arg3) {
        class228 var4 = class178.field3180[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class263 var5 = var4.field3939;
        if (var5 != null) {
            var5.field4568 = var5.field4568 * arg3 / 16;
            var5.field4579 = var5.field4579 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V", line = 28)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5140++;
        int var7 = class203.method1347(class241.field4189, arg0, 1, class94.field1654);
        int var8 = class203.method1347(class241.field4189, arg3, 1, class94.field1654);
        int var9 = class203.method1347(class75.field1314, arg6, 1, class206.field3562);
        int var10 = class203.method1347(class75.field1314, arg5, 1, class206.field3562);
        int var11 = class203.method1347(class241.field4189, arg0 + arg1, 1, class94.field1654);
        int var12 = class203.method1347(class241.field4189, arg3 - arg1, 1, class94.field1654);
        for (int var13 = var7; var13 < var11; var13++) {
            class19.method126(7, arg2, class154.field2638[var13], var9, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class19.method126(7, arg2, class154.field2638[var14], var9, var10);
        }
        int var15 = class203.method1347(class75.field1314, arg1 + arg6, 1, class206.field3562);
        int var16 = class203.method1347(class75.field1314, arg5 - arg1, 1, class206.field3562);
        if (arg4 <= 82) {
            return;
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class154.field2638[var17];
            class19.method126(7, arg2, var18, var9, var15);
            class19.method126(7, arg2, var18, var16, var10);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 81)
    public static void method2113(int arg0) {
        field5148 = null;
        field5159 = (class157[][]) null;
        field5152 = null;
        field5154 = null;
        field5143 = null;
        field5149 = null;
        field5155 = null;
        field5158 = null;
        field5157 = null;
        field5151 = null;
        field5150 = null;
        if (arg0 != -1200762228) {
            field5151 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 232)
    private class301(int arg0) {
        super(0, true);
        this.field5139 = 4096;
        this.field5139 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I", line = 113)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field5144++;
        if (this.field3456.field5115) {
            class275.method1931(var3, 0, class190.field3362, this.field5139);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 130)
    public class301() {
        this(4096);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(Z)V", line = 139)
    public static final void method2114(boolean arg0) {
        field5148.method1161(83);
        if (arg0) {
            field5143 = (BigInteger) null;
        }
        field5147++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILva;I)V", line = 150)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            this.method98(64, (class235) null, 71);
        }
        field5141++;
        if (arg2 == 0) {
            this.field5139 = (arg1.method1589(arg0 - 7836) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V", line = 187)
    public static final void method2115(int arg0, int arg1, byte arg2) {
        if (class190.field3362 != arg0) {
            class166.field2822 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class166.field2822[var3] = (var3 << 12) / arg0;
            }
            class190.field3362 = arg0;
            class281.field4838 = arg0 == 64 ? 2048 : 4096;
            class48.field723 = arg0 - 1;
        }
        field5142++;
        if (arg2 < 54) {
            method2116(88, (class235) null, (class295) null, 39);
        }
        if (class214.field3723 == arg1) {
            return;
        }
        if (class190.field3362 == arg1) {
            class268.field4670 = class166.field2822;
        } else {
            class268.field4670 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class268.field4670[var4] = (var4 << 12) / arg1;
            }
        }
        class214.field3723 = arg1;
        class155.field2662 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILva;Lme;I)V", line = 267)
    public static final void method2116(int arg0, class235 arg1, class295 arg2, int arg3) {
        field5146++;
        class236 var4 = new class236();
        var4.field4129 = arg1.method1589(114);
        var4.field4123 = arg1.method1611(29);
        var4.field4125 = new int[var4.field4129];
        var4.field4121 = new class116[var4.field4129];
        var4.field4134 = new int[var4.field4129];
        var4.field4124 = new int[var4.field4129];
        var4.field4122 = new class116[var4.field4129];
        var4.field4133 = new byte[var4.field4129][][];
        for (int var5 = arg0; var5 < var4.field4129; var5++) {
            try {
                int var6 = arg1.method1589(86);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method1620(68).method1793(37));
                    String var8 = new String(arg1.method1620(arg0 + 98).method1793(37));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method1611(-85);
                    }
                    var4.field4124[var5] = var6;
                    var4.field4125[var5] = var9;
                    var4.field4121[var5] = arg2.method2077(class139.method962(arg0, 5836), var8, class45.method377(-1812135284, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method1620(103).method1793(arg0 + 37));
                    String var11 = new String(arg1.method1620(71).method1793(37));
                    int var12 = arg1.method1589(94);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method1620(81).method1793(arg0 + 37));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1611(-123);
                            var15[var16] = new byte[var17];
                            arg1.method1596(295019472, var17, var15[var16], 0);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field4124[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class45.method377(-1812135284, var13[var19]);
                    }
                    var4.field4122[var5] = arg2.method2063(class45.method377(-1812135284, var10), true, var11, var18);
                    var4.field4133[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4134[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4134[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4134[var5] = -3;
            } catch (Exception var28) {
                var4.field4134[var5] = -4;
            } catch (Throwable var29) {
                var4.field4134[var5] = -5;
            }
        }
        class155.field2652.method82(var4, (byte) -39);
    }
}
