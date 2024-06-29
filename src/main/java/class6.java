import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lv;")
    public static class122 field146 = class55.method425(-77, "blinken3:");

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
    public static int[] field149 = new int[50];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field155 = -1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lv;")
    public static class122 field154 = class55.method425(-107, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lqd;")
    public static class100 field152 = null;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lv;")
    private static class122 field156 = class55.method425(-53, "Connection timed out)3");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lv;")
    public static class122 field153 = class55.method425(-118, ":tradereq:");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lv;")
    public static class122 field150 = field156;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lkd;II)Lv;", line = 3)
    public static final class122 method72(class64 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field156 = null;
        }
        field145++;
        try {
            class122 var3 = new class122();
            var3.field2971 = arg0.method486(98);
            if (var3.field2971 > arg1) {
                var3.field2971 = arg1;
            }
            var3.field2923 = new byte[var3.field2971];
            arg0.field1617 += class19.field482.method383(arg0.field1679, 0, arg0.field1617, var3.field2971, (byte) -12, var3.field2923);
            return var3;
        } catch (Exception var4) {
            return class80.field2096;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 33)
    public static void method73(boolean arg0) {
        if (arg0) {
            field155 = 72;
        }
        field156 = null;
        field150 = null;
        field153 = null;
        field146 = null;
        field154 = null;
        field149 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljc;Lkd;II)V", line = 94)
    public static final void method74(class57 arg0, class64 arg1, int arg2, int arg3) {
        field143++;
        if (class80.field2093) {
            return;
        }
        class63 var4 = new class63();
        var4.field1607 = arg1.method520(-121);
        var4.field1614 = arg1.method487(128);
        if (arg2 > -85) {
            method75(-2, -19, null, -7);
        }
        var4.field1599 = new class98[var4.field1607];
        var4.field1612 = new int[var4.field1607];
        var4.field1596 = new byte[var4.field1607][][];
        var4.field1595 = new int[var4.field1607];
        var4.field1611 = new class98[var4.field1607];
        var4.field1603 = new int[var4.field1607];
        for (int var5 = 0; var5 < var4.field1607; var5++) {
            try {
                int var6 = arg1.method520(-127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg1.method490(-99).method956(-15382));
                    String var18 = new String(arg1.method490(-117).method956(-15382));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method487(128);
                    }
                    var4.field1612[var5] = var6;
                    var4.field1603[var5] = var19;
                    var4.field1599[var5] = arg0.method448(class125.method991(var17, -105), (byte) -95, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg1.method490(-113).method956(-15382));
                    String var8 = new String(arg1.method490(-48).method956(-15382));
                    int var9 = arg1.method520(-115);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg1.method490(-62).method956(-15382));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method487(128);
                            var12[var13] = new byte[var14];
                            arg1.method484(0, var12[var13], true, var14);
                        }
                    }
                    var4.field1612[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class125.method991(var10[var16], -123);
                    }
                    var4.field1611[var5] = arg0.method449(class125.method991(var7, 114), -70, var8, var15);
                    var4.field1596[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1595[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1595[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1595[var5] = -3;
            } catch (Exception var23) {
                var4.field1595[var5] = -4;
            } catch (Throwable var24) {
                var4.field1595[var5] = -5;
            }
        }
        class118.field2848.method312(false, var4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILmb;I)Lab;", line = 216)
    public static final class3 method75(int arg0, int arg1, class74 arg2, int arg3) {
        field147++;
        if (arg1 != 0) {
            method75(-124, 19, null, -44);
        }
        return class21.method226(arg2, arg0, 0, arg3) ? class8.method85(0) : null;
    }
}
