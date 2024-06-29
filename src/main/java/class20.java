import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    public static int[] field327 = new int[2];

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lqk;")
    private static class207 field323 = class24.method212(255, "level: ");

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lqk;")
    public static class207 field331 = field323;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lqk;")
    public static class207 field333 = class24.method212(255, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lwc;")
    public static class229 field326;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method115(boolean arg0) {
        if (arg0) {
            class82.field1498 = class270.field4782;
            class163.field2881 = class252.field4536;
        } else {
            class82.field1498 = class173.field3087;
            class163.field2881 = class3.field47;
        }
        class100.field1801 = class82.field1498.length;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)J")
    public static final long method116(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 == null || var3.field3136 == null ? 0L : var3.field3136.field3710;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method117(int arg0, int arg1) {
        field321++;
        if (arg0 != -31663) {
            return 22;
        }
        class244 var2 = class202.method1401(arg1, 31252);
        int var3 = var2.field4432;
        int var4 = var2.field4433;
        int var5 = var2.field4423;
        int var6 = class172.field3046[var4 - var5];
        return var6 & class83.field1535[var3] >> var5;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lv;ZILwc;)V")
    public static final void method118(class149 arg0, boolean arg1, int arg2, class229 arg3) {
        field324++;
        class31 var4 = new class31();
        var4.field636 = arg0.method1045((byte) -83);
        if (!arg1) {
            field323 = null;
        }
        var4.field621 = arg0.method1076(65280);
        var4.field631 = new class96[var4.field636];
        var4.field640 = new class96[var4.field636];
        var4.field637 = new int[var4.field636];
        var4.field635 = new int[var4.field636];
        var4.field634 = new byte[var4.field636][][];
        var4.field628 = new int[var4.field636];
        for (int var5 = 0; var5 < var4.field636; var5++) {
            try {
                int var6 = arg0.method1045((byte) -118);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method1034(-27220).method1451(35));
                    String var18 = new String(arg0.method1034(-27220).method1451(72));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1076(65280);
                    }
                    var4.field628[var5] = var6;
                    var4.field637[var5] = var19;
                    var4.field640[var5] = arg3.method1628(class280.method1905((byte) -51, var17), var18, 6921);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method1034(-27220).method1451(60));
                    String var8 = new String(arg0.method1034(-27220).method1451(43));
                    int var9 = arg0.method1045((byte) 76);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method1034(-27220).method1451(-127));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method1076(65280);
                            var12[var13] = new byte[var14];
                            arg0.method1053((byte) 33, 0, var14, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field628[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class280.method1905((byte) -51, var10[var16]);
                    }
                    var4.field631[var5] = arg3.method1631(class280.method1905((byte) -51, var7), var15, var8, 0);
                    var4.field634[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field635[var5] = -1;
            } catch (SecurityException var21) {
                var4.field635[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field635[var5] = -3;
            } catch (Exception var23) {
                var4.field635[var5] = -4;
            } catch (Throwable var24) {
                var4.field635[var5] = -5;
            }
        }
        class125.field2178.method931(var4, 127);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpk;IBI)Ldg;")
    public static final class139 method119(class99 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -45) {
            field330++;
            return class78.method594(arg3, arg0, -87, arg1) ? class82.method615(12339) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field331 = null;
        field323 = null;
        field327 = null;
        field333 = null;
        if (arg0 < 55) {
            method118((class149) null, false, 78, (class229) null);
        }
        field326 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JB)Lqk;")
    public static final class207 method121(long arg0, byte arg1) {
        field332++;
        class207.field3664.setTime(new Date(arg0));
        int var3 = -22 / (-arg1 / 58);
        int var4 = class207.field3664.get(7);
        int var5 = class207.field3664.get(5);
        int var6 = class207.field3664.get(2);
        int var7 = class207.field3664.get(1);
        int var8 = class207.field3664.get(11);
        int var9 = class207.field3664.get(12);
        int var10 = class207.field3664.get(13);
        return class105.method757(false, new class207[] { class234.field4323[var4 - 1], class193.field3400, class262.method1815(var5 / 10, (byte) 123), class262.method1815(var5 % 10, (byte) 50), class171.field3036, class75.field1380[var6], class171.field3036, class262.method1815(var7, (byte) -104), class85.field1544, class262.method1815(var8 / 10, (byte) 18), class262.method1815(var8 % 10, (byte) -127), class236.field4359, class262.method1815(var9 / 10, (byte) 86), class262.method1815(var9 % 10, (byte) 9), class236.field4359, class262.method1815(var10 / 10, (byte) 79), class262.method1815(var10 % 10, (byte) 71), class164.field2896 });
    }
}
