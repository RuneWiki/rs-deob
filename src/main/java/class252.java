import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class252 extends class137 {

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field4139 = 0;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "J")
    public long field4135;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lal;")
    public class252 field4140;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lal;")
    public class252 field4142;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public final void method1708(byte arg0) {
        field4138++;
        if (arg0 != 90) {
            method1710(-107, -11, (class91) null, 8, false, 65);
        }
        if (this.field4142 != null) {
            this.field4142.field4140 = this.field4140;
            this.field4140.field4142 = this.field4142;
            this.field4140 = null;
            this.field4142 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)Z")
    public final boolean method1709(int arg0) {
        if (arg0 != 192) {
            method1710(8, 12, (class91) null, -16, true, -79);
        }
        field4137++;
        return this.field4142 != null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILai;IZI)V")
    public static final void method1710(int arg0, int arg1, class91 arg2, int arg3, boolean arg4, int arg5) {
        field4143++;
        if (class162.field2647 >= 50 || arg2 == null || arg2.field1456 == null || arg2.field1456.length <= arg0 || arg2.field1456[arg0] == null) {
            return;
        }
        int var6 = arg2.field1456[arg0][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0x1F;
        int var9 = var6 >> 5 & 0x7;
        if (arg2.field1456[arg0].length > 1) {
            int var10 = (int) ((double) arg2.field1456[arg0].length * Math.random());
            if (var10 > 0) {
                var7 = arg2.field1456[arg0][var10];
            }
        }
        if (var8 == 0) {
            if (arg4) {
                class60.method385(var9, (byte) 98, 0, var7, 255);
            }
        } else if (class66.field1067 != 0) {
            class233.field3647[class162.field2647] = var7;
            int var11 = (arg1 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class68.field1087[class162.field2647] = var9;
            class199.field3193[class162.field2647] = 0;
            class4.field98[class162.field2647] = null;
            class188.field3085[class162.field2647] = 255;
            class12.field229[class162.field2647] = (var11 << 8) + (var12 << 16) + var8;
            if (arg5 <= 44) {
                method1710(-50, 108, (class91) null, 123, false, 94);
            }
            class162.field2647++;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public static final void method1711(int arg0) {
        if (arg0 >= -125) {
            field4139 = 76;
        }
        if (class69.field1097.toLowerCase().indexOf("microsoft") == -1) {
            class43.field643[92] = 74;
            if (class69.field1115 == null) {
                class43.field643[192] = 58;
                class43.field643[222] = 59;
            } else {
                class43.field643[520] = 59;
                class43.field643[192] = 28;
                class43.field643[222] = 58;
            }
            class43.field643[44] = 71;
            class43.field643[61] = 27;
            class43.field643[93] = 43;
            class43.field643[59] = 57;
            class43.field643[91] = 42;
            class43.field643[46] = 72;
            class43.field643[47] = 73;
            class43.field643[45] = 26;
        } else {
            class43.field643[223] = 28;
            class43.field643[188] = 71;
            class43.field643[189] = 26;
            class43.field643[186] = 57;
            class43.field643[220] = 74;
            class43.field643[222] = 59;
            class43.field643[192] = 58;
            class43.field643[190] = 72;
            class43.field643[219] = 42;
            class43.field643[221] = 43;
            class43.field643[191] = 73;
            class43.field643[187] = 27;
        }
        field4136++;
    }
}
