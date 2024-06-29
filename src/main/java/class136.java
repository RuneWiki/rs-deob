import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class136 {

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field2099 = -1;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "[I")
    public static int[] field2107;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "[I")
    public static int[] field2108;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lvj;")
    public static class256 field2096;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field2096 = null;
        field2108 = null;
        field2107 = null;
        int var1 = 5 % ((-arg0 - 17) / 47);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lvq;B)V")
    public static final void method1046(class269 arg0, byte arg1) {
        field2103++;
        if (!(class381.field5412 >= 2 || class269.field3935) || class327.field4749 != null || arg1 != 104) {
            return;
        }
        String var2;
        if (class269.field3935 && class381.field5412 < 2) {
            var2 = class285.field4153 + client.field2331.method2284((byte) -117, class309.field4497) + class106.field1363 + " ->";
        } else if (class56.field746 && class16.field247.method1758(-501, 81) && class381.field5412 > 2) {
            var2 = class239.method1631((byte) 28, (class382) class228.field3392.field6329.field6072.field6072);
        } else {
            class382 var3 = (class382) class228.field3392.field6329.field6072;
            var2 = class239.method1631((byte) 28, var3);
            int[] var4 = null;
            if (class411.method2601(arg1 - 107, var3.field5420)) {
                var4 = class167.method1202(true, (int) var3.field5421).field5807;
            } else if (class126.method762(var3.field5420, false)) {
                class446 var5 = class442.field6317[(int) var3.field5421];
                if (var5 != null) {
                    var4 = var5.field6375.field4985;
                }
            } else if (class204.method1426(var3.field5420, false)) {
                if (var3.field5420 == 1004) {
                    var4 = class398.method2496(arg1 ^ 0xFFFFFFEB, (int) var3.field5421).field4073;
                } else {
                    var4 = class398.method2496(-119, (int) (var3.field5421 >>> 32 & 0x7FFFFFFFL)).field4073;
                }
            }
            if (var4 != null) {
                var2 = var2 + class291.method1971(70, var4);
            }
        }
        if (class381.field5412 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class381.field5412 - 2) + class185.field2644.method2284((byte) 100, class309.field4497);
        }
        if (class246.field3664 != null) {
            class335 var7 = class246.field3664.method1561(93, arg0);
            if (var7 == null) {
                var7 = class154.field2285;
            }
            var7.method2195(class278.field4000, class246.field3664.field3198, 111, class262.field3869, class376.field5361, class246.field3664.field3250, class246.field3664.field3228, class110.field1426, class88.field1157, class221.field3174, class246.field3664.field3219, class246.field3664.field3332, class127.field1765, class246.field3664.field3282, var2);
            class198.method1404(class221.field3174[3], class221.field3174[1], class221.field3174[0], class221.field3174[2], false);
        } else if (class247.field3697 != null && class317.field4656 == 0) {
            int var6 = class154.field2285.method2207(var2, class278.field4000, class110.field1426, class376.field5361, class376.field5362 + 4, class127.field1765, 16777215, class299.field4345 + 16, arg1 + -225, 0);
            class198.method1404(16, class299.field4345, class376.field5362 + 4, var6 + class70.field934.method1309((byte) 125, var2), false);
            return;
        }
    }

    static {
        new class349("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field2107 = new int[32];
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2107[var1] = var0 - 1;
            var0 += var0;
        }
        field2108 = new int[500];
    }
}
