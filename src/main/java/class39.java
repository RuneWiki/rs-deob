import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 extends class42 {

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Z")
    public boolean field601;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Ljava/lang/String;")
    public String field589;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
    public boolean field592;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljava/lang/String;")
    public String field594;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "J")
    public long field596;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Z")
    public static boolean field597 = false;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
    public static final void method291(boolean arg0, int arg1) {
        field599++;
        if (arg0) {
            if (class474.field6555 != -1) {
                class98.method702(arg1 + 11, class474.field6555);
            }
            for (class301 var2 = (class301) class27.field457.method181((byte) -70); var2 != null; var2 = (class301) class27.field457.method179(1)) {
                if (!var2.method302(-25575)) {
                    var2 = (class301) class27.field457.method181((byte) -70);
                    if (var2 == null) {
                        break;
                    }
                }
                class347.method2023(var2, false, true, (byte) -128);
            }
            class474.field6555 = -1;
            class27.field457 = new class18(8);
            class77.method492((byte) -118);
            class474.field6555 = class506.field7024;
            class329.method1899(11153, false);
            class260.method1570(118);
            class122.method897(class474.field6555);
        }
        class46.method333(-1);
        class16.field285 = -1;
        class278.method1653(false, class385.field5243);
        class385.field5232 = new class515();
        class385.field5232.field584 = class12.field251 * 128 / 2;
        class385.field5232.field6261[0] = class12.field251 / 2;
        class385.field5232.field574 = class289.field3782 * 128 / 2;
        class385.field5232.field6266[0] = class289.field3782 / 2;
        class168.field2438 = 0;
        class430.field5888 = 0;
        if (class42.field623 == 2) {
            class430.field5888 = class202.field2799 << 7;
            class168.field2438 = class438.field6001 << 7;
        } else {
            class406.method2360(arg1 - 1);
        }
        class489.method2809(0);
        if (~class430.field5888 == arg1 || class168.field2438 == 0) {
            class507.method2898(1, 10);
        } else {
            class224.method1404((byte) 111);
            class507.method2898(1, 28);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILem;)V")
    public static final void method292(int arg0, int arg1, class149 arg2) {
        field595++;
        if (class32.field526) {
            class32.field526 = false;
            arg1 = 0;
        }
        if (arg0 != -28648) {
            method291(true, 115);
        }
        if (class444.field6089 != null && class444.field6089.method1030(arg2, (byte) 3)) {
            return;
        }
        class444.field6089 = arg2;
        class73.field1109 = class498.method2854(-114);
        class435.field5980 = arg1;
        class282.field3701 = arg1;
        if (class282.field3701 == 0) {
            class206.method1320(false);
            return;
        }
        class207.field2853 = class155.field2275;
        class285.field3728 = class381.field5206;
        class40.field605 = class402.field5395;
        class352.field4762 = class51.field807;
        class224.field3019 = class372.field5008;
        class392.field5311 = class374.field5068;
        class516.field7654 = class482.field6721;
        class123.field1809 = class97.field1468;
        class46.field697 = class154.field2241;
        class135.field1939 = class326.field4287;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class39(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field601 = arg9;
        this.field602 = arg2;
        this.field589 = arg0;
        this.field598 = arg6;
        this.field591 = arg4;
        this.field592 = arg8;
        this.field594 = arg1;
        this.field590 = arg3;
        this.field596 = arg5;
        this.field600 = arg7;
    }
}
