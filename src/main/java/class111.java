import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 extends class115 {

    @OriginalMember(owner = "client!q", name = "Kc", descriptor = "Lwd;")
    public static class157 field2600 = new class157();

    @OriginalMember(owner = "client!q", name = "Oc", descriptor = "Lec;")
    public static class32 field2604 = class73.method594("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", true);

    @OriginalMember(owner = "client!q", name = "Qc", descriptor = "Lec;")
    public static class32 field2606 = class73.method594("Benutzen", true);

    @OriginalMember(owner = "client!q", name = "Pc", descriptor = "Lec;")
    public static class32 field2605 = class73.method594("Hidden)2", true);

    @OriginalMember(owner = "client!q", name = "Sc", descriptor = "I")
    public static int field2608 = -1;

    @OriginalMember(owner = "client!q", name = "Wc", descriptor = "[Lec;")
    public static class32[] field2612 = new class32[100];

    @OriginalMember(owner = "client!q", name = "Tc", descriptor = "Lec;")
    public static class32 field2609 = class73.method594("sl_stars", true);

    @OriginalMember(owner = "client!q", name = "Uc", descriptor = "Lec;")
    public static class32 field2610 = class73.method594("Verbindung konnte nicht hergestellt werden)3", true);

    @OriginalMember(owner = "client!q", name = "Rc", descriptor = "Lec;")
    public static class32 field2607 = class73.method594("Lade Konfiguration )2 ", true);

    @OriginalMember(owner = "client!q", name = "Dc", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!q", name = "Ec", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!q", name = "Fc", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!q", name = "Gc", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!q", name = "Ic", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!q", name = "Jc", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!q", name = "Lc", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!q", name = "Mc", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!q", name = "Xc", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!q", name = "Hc", descriptor = "Lo;")
    public class97 field2597;

    @OriginalMember(owner = "client!q", name = "Vc", descriptor = "[Lfa;")
    public static class37[] field2611;

    @OriginalMember(owner = "client!q", name = "Nc", descriptor = "[Lh;")
    public static class49[] field2603;

    @OriginalMember(owner = "client!q", name = "Yc", descriptor = "[[[B")
    public static byte[][][] field2614;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "(I)Z")
    public final boolean method579(int arg0) {
        ++field2594;
        if (this.field2597 == null) {
            return false;
        } else {
            return arg0 == 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        ++field2596;
        if (this.field2597 == null) {
            return null;
        } else {
            class149 var2 = ~super.field2714 != 0 && super.field2717 == 0 ? class97.method762((byte) 120, super.field2714) : null;
            if (arg0 != 109) {
                method876(80, (class66) null, 28, (class25) null);
            }
            class149 var3 = super.field2710 == -1 || super.field2710 == super.field2689 && var2 != null ? null : class97.method762((byte) 87, super.field2710);
            class101 var4 = this.field2597.method763(var3, super.field2727, var2, (byte) 90, super.field2730);
            if (var4 == null) {
                return null;
            } else {
                var4.method806();
                super.field2690 = var4.field470;
                if (super.field2733 != -1 && super.field2756 != -1) {
                    class101 var5 = class38.method317(super.field2733, 127).method1019(123, super.field2756);
                    if (var5 != null) {
                        var5.method819(0, -super.field2729, 0);
                        class101[] var6 = new class101[] { var4, var5 };
                        var4 = new class101(var6, 2);
                    }
                }
                if (~this.field2597.field2198 == -2) {
                    var4.field2324 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjd;ILdc;)V")
    public static final void method876(int arg0, class66 arg1, int arg2, class25 arg3) {
        int var4 = -42 % ((-43 - arg2) / 48);
        class29 var5 = new class29();
        var5.field535 = arg1.method533(255);
        var5.field518 = arg1.method539(true);
        var5.field534 = new class18[var5.field535];
        var5.field524 = new int[var5.field535];
        ++field2599;
        var5.field533 = new byte[var5.field535][][];
        var5.field526 = new int[var5.field535];
        var5.field532 = new int[var5.field535];
        var5.field529 = new class18[var5.field535];
        for (int var6 = 0; ~var5.field535 < ~var6; ++var6) {
            try {
                int var7 = arg1.method533(255);
                if (var7 != 0 && var7 != 1 && ~var7 != -3) {
                    if (var7 == 3 || ~var7 == -5) {
                        String var8 = new String(arg1.method556(1347418632).method255(122));
                        String var9 = new String(arg1.method556(1347418632).method255(122));
                        int var10 = arg1.method533(255);
                        String[] var11 = new String[var10];
                        for (int var12 = 0; ~var12 > ~var10; ++var12) {
                            var11[var12] = new String(arg1.method556(1347418632).method255(122));
                        }
                        byte[][] var13 = new byte[var10][];
                        if (~var7 == -4) {
                            for (int var14 = 0; ~var14 > ~var10; ++var14) {
                                int var15 = arg1.method539(true);
                                var13[var14] = new byte[var15];
                                arg1.method558(var15, 0, false, var13[var14]);
                            }
                        }
                        Class[] var16 = new Class[var10];
                        var5.field532[var6] = var7;
                        for (int var17 = 0; ~var10 < ~var17; ++var17) {
                            var16[var17] = class45.method347(var11[var17], -73);
                        }
                        var5.field534[var6] = arg3.method179(var16, var9, 8, class45.method347(var8, -79));
                        var5.field533[var6] = var13;
                    }
                } else {
                    String var18 = new String(arg1.method556(1347418632).method255(122));
                    String var19 = new String(arg1.method556(1347418632).method255(122));
                    int var20 = 0;
                    if (~var7 == -2) {
                        var20 = arg1.method539(true);
                    }
                    var5.field532[var6] = var7;
                    var5.field526[var6] = var20;
                    var5.field529[var6] = arg3.method173(true, class45.method347(var18, -67), var19);
                }
            } catch (ClassNotFoundException var21) {
                var5.field524[var6] = -1;
            } catch (SecurityException var22) {
                var5.field524[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field524[var6] = -3;
            } catch (Exception var24) {
                var5.field524[var6] = -4;
            } catch (Throwable var25) {
                var5.field524[var6] = -5;
            }
        }
        class112.field2629.method1216(var5, (byte) 79);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static final void method877(byte arg0) {
        ++field2593;
        Object var1 = class92.field2105;
        synchronized (class92.field2105) {
            if (~class146.field3325 == -1) {
                class154.field3518.method175(5, new class137(), 112);
            }
            class146.field3325 = 600;
        }
        if (arg0 != -53) {
            method880(true, -58);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLec;)Z")
    public static final boolean method878(byte arg0, class32 arg1) {
        ++field2601;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 > -83) {
                method880(false, -94);
            }
            while (~class106.field2506 < ~var2) {
                if (arg1.method271((byte) 104, class71.field1686[var2])) {
                    return true;
                }
                ++var2;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public static void method879(byte arg0) {
        field2605 = null;
        field2609 = null;
        field2604 = null;
        field2612 = null;
        int var1 = 50 / ((arg0 - -31) / 52);
        field2603 = null;
        field2611 = null;
        field2600 = null;
        field2610 = null;
        field2606 = null;
        field2607 = null;
        field2614 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)Lec;")
    public static final class32 method880(boolean arg0, int arg1) {
        ++field2595;
        if (!arg0) {
            method880(true, 42);
        }
        return ~class56.field1296[arg1].method240((byte) 39) < -1 ? class52.method403(new class32[] { class109.field2577[arg1], class114.field2653, class56.field1296[arg1] }, (byte) -20) : class109.field2577[arg1];
    }
}
