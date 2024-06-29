import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class209 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field3616 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lr;")
    public static class66 field3613 = class93.method641(43, "rot:");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static volatile int field3614 = 0;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lr;")
    private static class66 field3620 = class93.method641(43, "Sat");

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lr;")
    private static class66 field3612 = class93.method641(43, "Thu");

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lr;")
    private static class66 field3622 = class93.method641(43, "Fri");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lr;")
    private static class66 field3621 = class93.method641(43, "Tue");

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3623 = 0;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lr;")
    private static class66 field3618 = class93.method641(43, "Wed");

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lr;")
    private static class66 field3624 = class93.method641(43, "Sun");

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lr;")
    private static class66 field3619 = class93.method641(43, "Mon");

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lr;")
    public static class66[] field3615 = new class66[] { field3624, field3619, field3621, field3618, field3612, field3622, field3620 };

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lqc;")
    public static class245 field3626 = new class245(50);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[[[B")
    public static byte[][][] field3627;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3618 = null;
        field3612 = null;
        field3626 = null;
        field3619 = null;
        field3621 = null;
        field3624 = null;
        field3615 = null;
        field3627 = null;
        if (arg0 != -5) {
            method1358((byte) 49, (class102) null, (class102) null);
        }
        field3622 = null;
        field3620 = null;
        field3613 = null;
        field3616 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lik;Llh;IB)V")
    public static final void method1357(class117 arg0, class249 arg1, int arg2, byte arg3) {
        int var4 = -54 % ((-arg3 - 40) / 34);
        field3625++;
        class35 var5 = new class35();
        var5.field519 = arg1.method1677(-6677);
        var5.field532 = arg1.method1652(-5528);
        var5.field528 = new int[var5.field519];
        var5.field524 = new int[var5.field519];
        var5.field516 = new byte[var5.field519][][];
        var5.field529 = new class232[var5.field519];
        var5.field523 = new int[var5.field519];
        var5.field533 = new class232[var5.field519];
        for (int var6 = 0; var6 < var5.field519; var6++) {
            try {
                int var7 = arg1.method1677(-6677);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = new String(arg1.method1637(127).method445((byte) -115));
                    String var9 = new String(arg1.method1637(127).method445((byte) -82));
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg1.method1652(-5528);
                    }
                    var5.field524[var6] = var7;
                    var5.field528[var6] = var10;
                    var5.field533[var6] = arg0.method773(30810, var9, class122.method829(var8, -1));
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg1.method1637(127).method445((byte) -88));
                    String var12 = new String(arg1.method1637(127).method445((byte) -86));
                    int var13 = arg1.method1677(-6677);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg1.method1637(127).method445((byte) -113));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg1.method1652(-5528);
                            var16[var17] = new byte[var18];
                            arg1.method1665(0, 0, var18, var16[var17]);
                        }
                    }
                    Class[] var19 = new Class[var13];
                    var5.field524[var6] = var7;
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class122.method829(var14[var20], -1);
                    }
                    var5.field529[var6] = arg0.method776(var19, 0, var12, class122.method829(var11, -1));
                    var5.field516[var6] = var16;
                }
            } catch (ClassNotFoundException var21) {
                var5.field523[var6] = -1;
            } catch (SecurityException var22) {
                var5.field523[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field523[var6] = -3;
            } catch (Exception var24) {
                var5.field523[var6] = -4;
            } catch (Throwable var25) {
                var5.field523[var6] = -5;
            }
        }
        class91.field1754.method866(var5, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLpe;Lpe;)V")
    public static final void method1358(byte arg0, class102 arg1, class102 arg2) {
        field3617++;
        if (arg1.field1992 != null) {
            arg1.method704((byte) 73);
        }
        arg1.field1992 = arg2;
        arg1.field1997 = arg2.field1997;
        if (arg0 == -74) {
            arg1.field1992.field1997 = arg1;
            arg1.field1997.field1992 = arg1;
        }
    }
}
