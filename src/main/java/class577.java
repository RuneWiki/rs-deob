import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class577 extends class102 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "B")
    public byte field8494;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field8502;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "B")
    public byte field8501;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "S")
    public short field8508;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "S")
    public short field8504;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "S")
    public short field8499;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
    public boolean field8495;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field8496;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "S")
    public short field8509;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field8500;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
    public static int[] field8497 = new int[3];

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lh;")
    public static class572 field8505 = new class572("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Llu;")
    public static class610 field8512 = new class610(52, 6);

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Lh;")
    public static class572 field8513 = new class572("K", "T", "K", "K");

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field8498;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lmt;")
    public static class336 field8514;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 5)
    public void method943(int arg0) {
        if (arg0 <= 30) {
            method3433((byte) 67);
        }
        field8506++;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)V", line = 22)
    public static final void method3433(byte arg0) {
        field8511++;
        if (arg0 <= 74) {
            method3433((byte) 23);
        }
        class402.method2367(class22.field213, (byte) 97);
        class190.field2829++;
        class112.field1589.method1049(-1, class609.method3580(true));
        class112.field1589.method1027(255, class165.field2605);
        class112.field1589.method1027(255, class47.field562);
        class112.field1589.method1049(-1, class56.field668.field6831);
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V", line = 46)
    public static void method3434(int arg0) {
        field8513 = null;
        if (arg0 >= 92) {
            field8514 = null;
            field8505 = null;
            field8512 = null;
            field8497 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V", line = 63)
    public static final void method3435(byte arg0) {
        field8507++;
        class129.field1796.method1102(96);
        if (arg0 < -84) {
            class219.field3190 = 1;
            class514.field7343 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(B)Z", line = 86)
    public static final boolean method3436(byte arg0) {
        int var1 = 67 % ((arg0 + 44) / 42);
        field8510++;
        try {
            if (class219.field3190 == 2) {
                if (class33.field403 == null) {
                    class33.field403 = class81.method613(class514.field7343, class624.field9191, class271.field3841);
                    if (class33.field403 == null) {
                        return false;
                    }
                }
                if (class518.field7392 == null) {
                    class518.field7392 = new class453(class371.field5102, class390.field5379);
                }
                if (class129.field1796.method1105(class336.field4652, true, class518.field7392, 22050, class33.field403)) {
                    class129.field1796.method1093(31);
                    class129.field1796.method1107(class511.field7276, 16384);
                    class129.field1796.method1109((byte) -116, class33.field403, class271.field3843);
                    class518.field7392 = null;
                    class514.field7343 = null;
                    class33.field403 = null;
                    class219.field3190 = 0;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class129.field1796.method1102(64);
            class219.field3190 = 0;
            class514.field7343 = null;
            class33.field403 = null;
            class518.field7392 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 136)
    public class577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field8494 = arg9;
        this.field8502 = arg2;
        this.field8501 = (byte) arg0;
        this.field8508 = (short) arg5;
        this.field8504 = (short) arg4;
        this.field8499 = (short) arg7;
        this.field8495 = arg8;
        this.field8496 = arg1;
        this.field8509 = (short) arg6;
        this.field8500 = arg3;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)I")
    public abstract int method177(byte arg0);
}
