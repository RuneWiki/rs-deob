import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class495 extends class154 {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lfja;")
    public static class783 field6781 = new class783(46, 6);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lmu;")
    public static class318 field6783;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method2839(byte arg0) {
        if (arg0 != 88) {
            method2839((byte) -104);
        }
        field6780++;
        class205.field3095.method480(((float) class111.field1911.field6726.method53((byte) 86) * 0.1F + 0.7F) * 1.1523438F);
        class205.field3095.method590(client.field4353, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class205.field3095.method499(class625.field8718, -1, 0);
        class205.field3095.method596(class346.field4666);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static final int method2840(int arg0, int arg1) {
        field6784++;
        int var2 = arg1 & 0x3F;
        int var3 = 88 % ((-arg0 - 50) / 46);
        int var4 = (arg1 & 0xD5) >> 6;
        if (var2 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public static final void method2841(int arg0, int arg1, int arg2) {
        if (class469.field6348 != 0) {
            if (arg0 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class427.field5834[var3] = arg2;
                }
            } else {
                class427.field5834[arg0] = arg2;
            }
        }
        if (arg1 != 16) {
            method2842(85);
        }
        field6778++;
        class500.field6844.method3215((byte) -98, arg2, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2842(int arg0) {
        if (arg0 != 213) {
            field6783 = null;
        }
        field6781 = null;
        field6783 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
    public class495(int arg0, int arg1) {
        this.field6779 = arg0;
        this.field6782 = arg1;
    }
}
