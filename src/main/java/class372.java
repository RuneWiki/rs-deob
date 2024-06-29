import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class372 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field5437 = 127;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field5439 = 0;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "J")
    public static long field5441 = 0L;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
    public static int[] field5440 = new int[14];

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)[Lvq;")
    public static final class24[] method2362(boolean arg0) {
        field5442++;
        if (!arg0) {
            field5440 = null;
        }
        return new class24[] { class249.field3662, class67.field889, class35.field502, class395.field5754, class402.field5805, class330.field4906, class202.field2856, class382.field5611, class291.field4261, class366.field5294, class329.field4897, class124.field1649, class83.field1016, class390.field5685, class159.field2130, class441.field6417, class214.field3030, class202.field2858, class386.field5639, class14.field232, class236.field3522, class152.field2058, class1.field12, class303.field4436, class226.field3386, class431.field6279, class236.field3520, class435.field6335, class67.field890, class354.field5168, class17.field261, class191.field2670, class202.field2844, class75.field957, class463.field6830, class380.field5585, class243.field3610, class387.field5658, class159.field2131, class466.field6855, class357.field5182, class323.field4769, class180.field2551, class58.field778, class432.field6299, class32.field446, class93.field1156, class129.field1709, class328.field4890, class29.field417, class435.field6355, class31.field434, class37.field521, class47.field610, class213.field2996, class456.field6748, class432.field6297, class72.field936, class343.field5050, class55.field671, class135.field1848, class52.field651, class125.field1662, class104.field1361, class309.field4556, class440.field6406, class180.field2549, class383.field5614, class31.field425, class200.field2825, class366.field5300, class4.field58, class56.field689, class113.field1549, class271.field4012, class253.field3717, class244.field3619, class72.field940, class420.field6087, class311.field4582, class234.field3504, class296.field4318, class120.field1604, class26.field382, class322.field4758, class260.field3847, class139.field1910, class189.field2642, class363.field5239, class337.field4976, class29.field416, class397.field5768, class245.field3624, class440.field6412, class376.field5489, class247.field3643, class233.field3498, class124.field1647, class167.field2199, class86.field1054, class83.field1021, class125.field1661, class311.field4587, class216.field3081, class328.field4889 };
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public static final void method2363(byte arg0) {
        field5443++;
        if (class359.field5222 != null) {
            return;
        }
        Container var1;
        if (class279.field4116 == null) {
            var1 = class267.field3963.field5023;
        } else {
            var1 = class279.field4116;
        }
        class266.field3946 = var1.getSize().width;
        class252.field3699 = var1.getSize().height;
        if (class279.field4116 == var1) {
            Insets var2 = class279.field4116.getInsets();
            class252.field3699 -= var2.top + var2.bottom;
            class266.field3946 -= var2.left + var2.right;
        }
        if (class329.method2151(arg0 + 50) == 1) {
            class214.field3016 = class60.field800;
            class31.field433 = (class266.field3946 - class60.field800) / 2;
            class375.field5473 = class366.field5302;
            class263.field3898 = 0;
        } else if (class451.field6661 < 96 && class118.field1594 == 0) {
            int var3 = class266.field3946 > 1024 ? 1024 : class266.field3946;
            class214.field3016 = var3;
            class31.field433 = (class266.field3946 - var3) / 2;
            int var4 = class252.field3699 > 768 ? 768 : class252.field3699;
            class263.field3898 = 0;
            class375.field5473 = var4;
        } else {
            class214.field3016 = class266.field3946;
            class31.field433 = 0;
            class375.field5473 = class252.field3699;
            class263.field3898 = 0;
        }
        if (class373.field5452 != 0) {
            boolean var10000;
            if (class214.field3016 < 1024 && class375.field5473 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class270.field4004.setSize(class214.field3016, class375.field5473);
        if (class74.field942 != null) {
            class74.field942.method83();
        }
        if (arg0 != -50) {
            method2362(true);
        }
        if (class279.field4116 == var1) {
            Insets var5 = class279.field4116.getInsets();
            class270.field4004.setLocation(class31.field433 + var5.left, class263.field3898 + var5.top);
        } else {
            class270.field4004.setLocation(class31.field433, class263.field3898);
        }
        if (class318.field4672 != -1) {
            class298.method1981(true, (byte) -41);
        }
        class422.method2602(false);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
    public static void method2364(byte arg0) {
        field5440 = null;
        if (arg0 >= -114) {
            method2364((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
    public static final void method2365(boolean arg0, int arg1) {
        field5436++;
        if (!arg0) {
            method2362(true);
        }
        class125 var2 = class56.method428(arg1, 5, -3636);
        var2.method847(75);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lct;B)V")
    public static final void method2366(class104 arg0, byte arg1) {
        if (arg1 == -39) {
            class318.field4666 = arg0;
            field5435++;
        }
    }
}
