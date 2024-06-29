import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class87 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field1462 = 0;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Z")
    public boolean field1464 = true;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field1460 = -1;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field1469 = -1;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1457 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1468 = "shake:";

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lam;")
    public static class180 field1466 = new class180();

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lhc;")
    public static class235 field1461;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1461 = null;
        field1468 = null;
        field1466 = null;
        int var1 = -6 / ((-arg0 - 29) / 45);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILai;II)V")
    private final void method617(int arg0, class88 arg1, int arg2, int arg3) {
        if (arg3 >= -124) {
            return;
        }
        if (arg0 == 1) {
            this.field1462 = class17.method167((byte) -32, arg1.method671(116));
        } else if (arg0 == 2) {
            this.field1469 = arg1.method633(106);
        } else if (arg0 == 3) {
            this.field1469 = arg1.method645(11596);
            if (this.field1469 == 65535) {
                this.field1469 = -1;
            }
        } else if (arg0 == 5) {
            this.field1464 = false;
        } else if (arg0 == 7) {
            this.field1460 = class17.method167((byte) -19, arg1.method671(112));
        } else if (arg0 == 8) {
            class162.field2541 = arg2;
        } else if (arg0 == 9) {
            arg1.method645(11596);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg1.method633(52);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg1.method671(108);
                } else if (arg0 == 14) {
                    arg1.method633(102);
                }
            }
        }
        field1470++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILjava/awt/Component;I)Lff;")
    public static final class19 method618(byte arg0, int arg1, Component arg2, int arg3) {
        field1463++;
        try {
            Class var4 = Class.forName("el");
            int var5 = 24 % ((-arg0 - 74) / 37);
            class19 var6 = (class19) var4.getDeclaredConstructor().newInstance();
            var6.method180(arg1, arg2, arg3, false);
            return var6;
        } catch (Throwable var8) {
            class133 var7 = new class133();
            var7.method180(arg1, arg2, arg3, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static int method619(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(CB)Z")
    public static final boolean method620(char arg0, byte arg1) {
        field1459++;
        if (arg1 != 79) {
            field1461 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILai;)V")
    public final void method621(boolean arg0, int arg1, class88 arg2) {
        if (arg0) {
            this.field1464 = false;
        }
        while (true) {
            int var4 = arg2.method633(84);
            if (var4 == 0) {
                field1467++;
                return;
            }
            this.method617(var4, arg2, arg1, -126);
        }
    }
}
