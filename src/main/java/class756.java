import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class756 extends class392 {

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Ljava/lang/String;")
    public String field10550;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lns;")
    public class406 field10553;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "J")
    public static long field10548 = 0L;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Llga;")
    public static class712 field10555 = new class712(0, 8);

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Z")
    public static boolean field10558 = false;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public int field10556;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field10559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!f", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field10560;

    // $FF: synthetic method
    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4212(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lgg;III)V", line = 5)
    public static final void method4203(class176 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class68.field743) {
            class624 var4 = class77.field947[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field8736 != null && var4.field8736.method157((byte) -84)) {
                arg0.method162(var4.field8736, (byte) -94, true, class601.field8373, class22.field158, 0, 0);
            }
        }
        if (arg3 < class68.field743) {
            class624 var5 = class77.field947[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field8736 != null && var5.field8736.method157((byte) -97)) {
                arg0.method162(var5.field8736, (byte) 115, true, 0, class22.field158, 0, class601.field8373);
            }
        }
        if (arg2 < class68.field743 && arg3 < class480.field6629) {
            class624 var6 = class77.field947[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field8736 != null && var6.field8736.method157((byte) -88)) {
                arg0.method162(var6.field8736, (byte) 117, true, class601.field8373, class22.field158, 0, class601.field8373);
            }
        }
        if (arg2 < class68.field743 && arg3 > 0) {
            class624 var7 = class77.field947[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field8736 != null && var7.field8736.method157((byte) -118)) {
                arg0.method162(var7.field8736, (byte) 88, true, class601.field8373, class22.field158, 0, -class601.field8373);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method4204(int arg0, int arg1, int arg2) {
        field10547++;
        if (arg1 != 22251) {
            method4204(113, 12, -12);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILem;)Z", line = 66)
    public final boolean method4205(int arg0, class227 arg1) {
        field10549++;
        boolean var3 = true;
        arg1.method2287((byte) -90);
        if (arg0 < 68) {
            this.field10553 = null;
        }
        class227 var4 = (class227) this.field10553.method2348(-1);
        while (var4 != null) {
            if (class375.method2205((byte) 93, arg1.field2948, var4.field2948)) {
                class311.method1869(83, var4, arg1);
                this.field10556++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class227) this.field10553.method2343(0);
            var3 = false;
        }
        this.field10553.method2341(arg1, -30);
        this.field10556++;
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Leda;", line = 101)
    public static final class103 method4206(boolean arg0) {
        field10546++;
        class103 var1 = class652.method3682(-1);
        var1.field1378 = null;
        if (arg0) {
            method4204(39, 118, -15);
        }
        var1.field1382 = 0;
        var1.field1379 = new class481(5000);
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLem;)Z", line = 117)
    public final boolean method4207(byte arg0, class227 arg1) {
        field10554++;
        int var3 = this.method4209(75);
        arg1.method2287((byte) -90);
        this.field10556--;
        if (arg0 >= -65) {
            this.field10553 = null;
        }
        if (this.field10556 != 0) {
            return var3 != this.method4209(123);
        }
        this.method315(73);
        this.method2287((byte) -90);
        class331.field4464--;
        class452.field6304.method1574(arg1.field2949, this, (byte) -80);
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLov;)V", line = 142)
    public static final void method4208(byte arg0, class189 arg1) {
        field10557++;
        if (class77.field947 == null) {
            return;
        }
        class722 var2 = null;
        if (arg1.field2275 == 0) {
            var2 = (class722) class537.method2958(arg1.field2273, arg1.field2269, arg1.field2270);
        }
        if (arg0 != 109) {
            field10558 = false;
        }
        if (arg1.field2275 == 1) {
            var2 = (class722) class278.method1659(arg1.field2273, arg1.field2269, arg1.field2270);
        }
        if (arg1.field2275 == 2) {
            var2 = (class722) class300.method1797(arg1.field2273, arg1.field2269, arg1.field2270, field10560 == null ? (field10560 = method4212("rl")) : field10560);
        }
        if (arg1.field2275 == 3) {
            var2 = (class722) class531.method2936(arg1.field2273, arg1.field2269, arg1.field2270);
        }
        if (var2 == null) {
            arg1.field2278 = 0;
            arg1.field2276 = -1;
            arg1.field2272 = 0;
        } else {
            arg1.field2276 = var2.method680(30472);
            arg1.field2272 = var2.method686((byte) 20);
            arg1.field2278 = var2.method685(4657);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I", line = 185)
    public final int method4209(int arg0) {
        if (arg0 <= 73) {
            field10548 = 94L;
        }
        field10551++;
        return this.field10553.field5735.field5555 == this.field10553.field5735 ? -1 : ((class227) this.field10553.field5735.field5555).field2948;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 201)
    public static void method4210(byte arg0) {
        if (arg0 >= 43) {
            field10555 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;I)V", line = 213)
    public static final void method4211(class60 arg0, int arg1) {
        field10552++;
        if (arg1 != -256) {
            field10559 = 112;
        }
        int var2 = 0;
        int var3 = 0;
        if (class247.field3206) {
            var2 = class63.method488((byte) 42);
            var3 = class231.method1364(false);
        }
        int var4 = -10660793;
        class616.method3469(class116.field1526, class475.field6566 + var3, arg0, -16777216, var4, class33.field341, 8516, class729.field10174 + var2);
        class214.field2575.method475((byte) -73, class475.field6566 + var3 + 14, class755.field10504.method4201(class723.field10095, (byte) 25), var4, -1, var2 + class729.field10174 + 3);
        int var5 = class427.field6034.method528(68) + var2;
        int var6 = class427.field6034.method521((byte) 90) + var3;
        if (class148.field1903) {
            int var7 = 0;
            for (class756 var8 = (class756) class526.field7066.method2348(-1); var8 != null; var8 = (class756) class526.field7066.method2343(0)) {
                int var12 = var7 * 16 + class475.field6566 + var3 + 31;
                var7++;
                if (var8.field10556 == 1) {
                    class30.method133(class116.field1526, (class227) var8.field10553.field5735.field5555, -256, class33.field341, var12, class475.field6566 + var3, var5, arg0, var6, 0, -1, class729.field10174 + var2);
                } else {
                    class88.method635(var8, -1, var5, class116.field1526, var6, class729.field10174 + var2, arg0, var12, -256, 0, class33.field341, class475.field6566 + var3);
                }
            }
            if (class659.field9197 != null) {
                class616.method3469(class638.field8859, class746.field10362, arg0, -16777216, var4, class438.field6139, 8516, class596.field8309);
                class214.field2575.method475((byte) -50, class746.field10362 + 14, class659.field9197.field10550, var4, -1, class596.field8309 + 3);
                int var9 = 0;
                for (class227 var10 = (class227) class659.field9197.field10553.method2348(arg1 + 255); var10 != null; var10 = (class227) class659.field9197.field10553.method2343(0)) {
                    int var11 = var9 * 16 + class746.field10362 + 31;
                    class30.method133(class638.field8859, var10, -256, class438.field6139, var11, class746.field10362, var5, arg0, var6, 0, -1, class596.field8309);
                    var9++;
                }
                class363.method2080(class638.field8859, -8, class596.field8309, class438.field6139, class746.field10362);
            }
        } else {
            int var13 = 0;
            for (class227 var14 = (class227) class139.field1783.method724(arg1 ^ 0xFFFFFF20); var14 != null; var14 = (class227) class139.field1783.method723(109)) {
                int var15 = class475.field6566 + var3 + ((-var13 + -1 + class43.field470) * 16) + 31;
                class30.method133(class116.field1526, var14, -256, class33.field341, var15, class475.field6566 + var3, var5, arg0, var6, 0, -1, class729.field10174 + var2);
                var13++;
            }
        }
        class363.method2080(class116.field1526, arg1 ^ 0xF8, class729.field10174 + var2, class33.field341, class475.field6566 + var3);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 306)
    public class756(String arg0) {
        this.field10550 = arg0;
        this.field10553 = new class406();
    }
}
