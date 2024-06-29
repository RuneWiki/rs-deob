import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class262 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lgh;")
    private class315 field3774 = new class315();

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lap;")
    public static class310 field3771 = new class310(7, 8);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lch;")
    public static class151 field3779 = new class151("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lcf;")
    public static class92 field3780 = new class92();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lgh;")
    private class315 field3778;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lgf;")
    public static class39 field3781;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1761(int arg0) {
        field3773++;
        if (arg0 != 1) {
            method1762(-60, (String) null);
        }
        return this.field3774.field4451 == this.field3774;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 19)
    public static final void method1762(int arg0, String arg1) {
        field3763++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class472.method2799(31, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg0; var3 < class222.field3201; var3++) {
            String var4 = class379.field5204[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class472.method2799(arg0 ^ 0x1E, var4);
            if (var5 != null && var5.equals(var2)) {
                class222.field3201--;
                for (int var6 = var3; var6 < class222.field3201; var6++) {
                    class379.field5204[var6] = class379.field5204[var6 + 1];
                    class318.field4494[var6] = class318.field4494[var6 + 1];
                    class276.field3985[var6] = class276.field3985[var6 + 1];
                    class41.field542[var6] = class41.field542[var6 + 1];
                    class450.field6408[var6] = class450.field6408[var6 + 1];
                }
                class33.field341 = class86.field1217;
                class320.field4508++;
                class336.method2111(class196.field2909, 109);
                class311.field4403.method1180((byte) -110, class345.method2147(arg1, (byte) 110));
                class311.field4403.method1184((byte) 89, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lgh;", line = 79)
    public final class315 method1763(byte arg0) {
        field3765++;
        class315 var2 = this.field3774.field4451;
        if (this.field3774 == var2) {
            this.field3778 = null;
            return null;
        }
        if (arg0 >= -32) {
            field3779 = null;
        }
        this.field3778 = var2.field4451;
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)[Lha;", line = 101)
    public static final class294[] method1764(boolean arg0) {
        field3775++;
        if (!arg0) {
            field3781 = null;
        }
        return new class294[] { class397.field5453, class116.field1616, class175.field2665 };
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILgh;)V", line = 112)
    public final void method1765(int arg0, class315 arg1) {
        if (arg1.field4452 != null) {
            arg1.method2003(1);
        }
        field3777++;
        arg1.field4451 = this.field3774;
        arg1.field4452 = this.field3774.field4452;
        arg1.field4452.field4451 = arg1;
        if (arg0 > 116) {
            arg1.field4451.field4452 = arg1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Lgh;", line = 129)
    public final class315 method1766(byte arg0) {
        field3767++;
        class315 var2 = this.field3774.field4452;
        if (this.field3774 == var2) {
            this.field3778 = null;
            return null;
        } else {
            this.field3778 = var2.field4452;
            return arg0 == 112 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)Lgh;", line = 155)
    public final class315 method1767(boolean arg0) {
        field3770++;
        class315 var2 = this.field3778;
        if (this.field3774 == var2) {
            this.field3778 = null;
            return null;
        }
        if (!arg0) {
            method1762(50, (String) null);
        }
        this.field3778 = var2.field4451;
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Lgh;", line = 175)
    public final class315 method1768(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field3769++;
        class315 var2 = this.field3774.field4451;
        if (this.field3774 == var2) {
            return null;
        } else {
            var2.method2003(arg0 - 6);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 200)
    public static final void method1769(int arg0) {
        class305.field4337.method164(8192);
        field3768++;
        class110.field1541.method1930((byte) -121);
        class353.field4854.method2226(3);
        class468.field6599.method509((byte) -112);
        class363.field5001.method1995(-1);
        class373.field5128.method1652((byte) 14);
        class386.field5289.method1857(true);
        class371.field5108.method1661(2519);
        class97.field1365.method2324(true);
        class31.field332.method2461(false);
        class382.field5247.method1779((byte) -44);
        class449.field6390.method841(51);
        class53.field788.method2315(0);
        class93.field1312.method1971(false);
        class422.field5847.method1634(arg0 ^ 0xFFFFB255);
        class97.field1377.method696((byte) -63);
        class39.field534.method1513((byte) -87);
        class84.field1213.method2446(false);
        if (arg0 != -19881) {
            field3772 = 22;
        }
        class82.field1180.method2673(65);
        class407.field5577.method177((byte) -14);
        class422.method2518(true);
        class136.method1005(94);
        class24.method171((byte) 105);
        if (class480.field6799 != class389.field5379) {
            for (int var1 = 0; var1 < class198.field2930.length; var1++) {
                class198.field2930[var1] = null;
            }
            class20.field214 = 0;
        }
        class323.method2041(4135);
        class273.method1850((byte) 127);
        class239.method1671(arg0 + 47144);
        class204.method1405(102);
        class196.method1365((byte) 102);
        class457.field6467.method2109(-1);
        class374.field5152.method450();
        class185.field2788.method920(-51);
        class21.method152((byte) -120);
        class379.field5215.method2651(1);
        class19.field207.method2651(1);
        class69.field1009.method2651(arg0 + 19882);
        class173.field2642.method2651(1);
        class74.field1070.method2651(1);
        class280.field4026.method2651(1);
        class38.field473.method2651(1);
        class15.field131.method2651(1);
        class454.field6440.method2651(1);
        class247.field3589.method2651(1);
        class444.field6306.method2651(1);
        class233.field3399.method2651(arg0 ^ 0xFFFFB256);
        class291.field4126.method2651(1);
        class294.field4150.method2651(1);
        class388.field5327.method2651(1);
        class130.field1776.method2651(1);
        class25.field264.method2651(1);
        class432.field6114.method2651(1);
        class35.field379.method2651(arg0 ^ 0xFFFFB256);
        class443.field6301.method2651(1);
        class442.field6291.method2651(1);
        class202.field2992.method2651(1);
        class433.field6134.method2651(1);
        class261.field3750.method2651(1);
        class363.field5003.method2651(1);
        class67.field985.method2651(1);
        class450.field6404.method2651(1);
        class36.field391.method2651(1);
        class8.field53.method2651(arg0 ^ 0xFFFFB256);
        class365.field5015.method2109(arg0 + 19880);
        class285.field4079.method2109(-1);
        class239.field3506.method2109(-1);
        class424.field5869.method2109(-1);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 288)
    public static void method1770(int arg0) {
        if (arg0 == 0) {
            field3779 = null;
            field3781 = null;
            field3771 = null;
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I", line = 303)
    public final int method1771(int arg0) {
        field3764++;
        int var2 = arg0;
        class315 var3 = this.field3774.field4451;
        while (this.field3774 != var3) {
            var3 = var3.field4451;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 321)
    public final void method1772(byte arg0) {
        field3766++;
        if (arg0 < 89) {
            return;
        }
        while (true) {
            class315 var2 = this.field3774.field4451;
            if (this.field3774 == var2) {
                this.field3778 = null;
                return;
            }
            var2.method2003(1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 358)
    public class262() {
        this.field3774.field4452 = this.field3774;
        this.field3774.field4451 = this.field3774;
    }
}
