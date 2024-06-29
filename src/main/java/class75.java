import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class75 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field1736 = 0;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1732 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lrd;")
    public static class114 field1723 = class84.method656("Zu viele Verbindungen von Ihrer Adresse)3", (byte) 122);

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Z")
    public static boolean field1738 = false;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lrd;")
    public static class114 field1731 = class84.method656("sich mit einer anderen Welt zu verbinden)3", (byte) 121);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lrd;")
    private static class114 field1744 = class84.method656("Loading interfaces )2 ", (byte) 121);

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lrd;")
    public static class114 field1745 = field1744;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lrd;")
    public static class114 field1740 = class84.method656(" weitere Optionen", (byte) 120);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lrd;")
    private static class114 field1742 = class84.method656("Loading fonts )2 ", (byte) 117);

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lrd;")
    public static class114 field1733 = field1742;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lha;")
    public class50 field1746;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lhe;")
    public static final class54 method608(byte arg0) {
        field1730++;
        class54 var1 = new class54();
        var1.field1131 = class1.field14;
        var1.field1130 = class120.field2814[0];
        var1.field1128 = class111.field2594[0];
        var1.field1132 = class78.field1776;
        var1.field1133 = class140.field3328[0];
        var1.field1127 = class29.field599[0];
        byte[] var2 = class140.field3346[0];
        int var3 = var1.field1133 * var1.field1128;
        var1.field1129 = new int[var3];
        if (arg0 != 99) {
            field1744 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1129[var4] = class31.field630[class96.method737(var2[var4], 255)];
        }
        class34.method246(-1958111762);
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method609(int arg0) {
        field1742 = null;
        field1723 = null;
        field1745 = null;
        field1740 = null;
        field1744 = null;
        if (arg0 >= -86) {
            field1743 = 93;
        }
        field1731 = null;
        field1733 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILg;Lid;)V")
    public static final void method610(byte arg0, int arg1, class43 arg2, class60 arg3) {
        if (arg0 != -116) {
            field1723 = null;
        }
        field1734++;
        class120 var4 = new class120();
        var4.field2793 = arg3.method462((byte) 116);
        var4.field2787 = arg3.method442((byte) -107);
        var4.field2812 = new byte[var4.field2793][][];
        var4.field2809 = new int[var4.field2793];
        var4.field2807 = new class81[var4.field2793];
        var4.field2801 = new int[var4.field2793];
        var4.field2805 = new int[var4.field2793];
        var4.field2797 = new class81[var4.field2793];
        for (int var5 = 0; var5 < var4.field2793; var5++) {
            try {
                int var6 = arg3.method462((byte) 116);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method456(arg0 + 115).method873((byte) -28));
                    String var18 = new String(arg3.method456(-1).method873((byte) -28));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method442((byte) -46);
                    }
                    var4.field2805[var5] = var6;
                    var4.field2801[var5] = var19;
                    var4.field2807[var5] = arg2.method306(class25.method183(false, var17), (byte) -73, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method456(-1).method873((byte) -28));
                    String var8 = new String(arg3.method456(arg0 ^ 0x73).method873((byte) -28));
                    int var9 = arg3.method462((byte) 116);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method456(class120.method939(arg0, 115)).method873((byte) -28));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method442((byte) -105);
                            var12[var13] = new byte[var14];
                            arg3.method471(var14, var12[var13], (byte) 66, 0);
                        }
                    }
                    var4.field2805[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class25.method183(false, var10[var16]);
                    }
                    var4.field2797[var5] = arg2.method301(var15, var8, -123, class25.method183(false, var7));
                    var4.field2812[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2809[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2809[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2809[var5] = -3;
            } catch (Exception var23) {
                var4.field2809[var5] = -4;
            } catch (Throwable var24) {
                var4.field2809[var5] = -5;
            }
        }
        class61.field1292.method645(var4, (byte) 100);
    }
}
