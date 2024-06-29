import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class class21 extends class13 {

    @OriginalMember(owner = "client!qia", name = "w", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!qia", name = "B", descriptor = "Lmu;")
    public static class303 field330 = new class303(109, 7);

    @OriginalMember(owner = "client!qia", name = "E", descriptor = "Lmu;")
    public static class303 field332 = new class303(72, 0);

    @OriginalMember(owner = "client!qia", name = "F", descriptor = "Lej;")
    public static class124 field333 = new class124(36, 7);

    @OriginalMember(owner = "client!qia", name = "H", descriptor = "S")
    public static short field335 = 1;

    @OriginalMember(owner = "client!qia", name = "x", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!qia", name = "y", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!qia", name = "A", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!qia", name = "C", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!qia", name = "G", descriptor = "Ljava/lang/String;")
    public static String field334;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method165(int arg0);

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIB)Z")
    public static final boolean method166(int arg0, int arg1, byte arg2) {
        field331++;
        if (arg2 <= 118) {
            method168(122, -41);
        }
        return false;
    }

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "(I)Z")
    public abstract boolean method167(int arg0);

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(II)Z")
    public static final boolean method168(int arg0, int arg1) {
        if (arg1 >= -39) {
            return false;
        } else {
            field326++;
            return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(I)V")
    public class21(int arg0) {
        this.field325 = arg0;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)Z")
    public static final boolean method169(int arg0, byte arg1) {
        field329++;
        if (arg1 != 56) {
            field332 = null;
        }
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZB)V")
    public static final void method170(boolean arg0, byte arg1) {
        field327++;
        if (arg1 != -45) {
            field335 = -74;
        }
        if (arg0) {
            if (class184.field2784 != -1) {
                class747.method4171(class184.field2784, (byte) -113);
            }
            for (class432 var2 = (class432) class323.field4473.method1469(0); var2 != null; var2 = (class432) class323.field4473.method1467(0)) {
                if (!var2.method2311((byte) 4)) {
                    var2 = (class432) class323.field4473.method1469(arg1 ^ 0xFFFFFFD3);
                    if (var2 == null) {
                        break;
                    }
                }
                class422.method2587(true, false, var2, 2533);
            }
            class184.field2784 = -1;
            class323.field4473 = new class213(8);
            class196.method1401((byte) 11);
            class184.field2784 = class539.field7449;
            class212.method1455(false, 520);
            class299.method1955(100);
            class83.method786(class184.field2784);
        }
        class426.field6128 = false;
        class463.field6510 = "";
        class624.field8547 = "";
        class637.method3622(-56);
        class130.field2184 = -1;
        class529.method3057(arg1 + 45, class421.field6075);
        class58.field1147 = new class598();
        class58.field1147.field5922 = class376.field5325 * 512 / 2;
        class58.field1147.field5746[0] = class376.field5325 / 2;
        class58.field1147.field5933 = class175.field2711 * 512 / 2;
        class58.field1147.field5743[0] = class175.field2711 / 2;
        class275.field3870 = 0;
        class108.field1896 = 0;
        if (class438.field6252 == 2) {
            class108.field1896 = class113.field1950 << 9;
            class275.field3870 = class197.field2897 << 9;
        } else {
            class710.method3947((byte) 62);
        }
        class440.method2652(true);
    }

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "(I)V")
    public static void method171(int arg0) {
        field330 = null;
        if (arg0 < 17) {
            method168(60, -85);
        }
        field332 = null;
        field333 = null;
        field334 = null;
    }
}
