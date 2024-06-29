import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lcd;")
    private class19 field3 = new class19();

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11 = 3353893;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lkc;")
    public static class67 field13 = class19.method144("Diese Welt ist voll)3", 109);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
    public static int[] field16 = new int[128];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lnd;")
    public static class86 field15;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    public static int[] field2;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1(boolean arg0) {
        field13 = null;
        field2 = null;
        if (!arg0) {
            method4((byte) -84);
        }
        field15 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 169)
    public class1() {
        this.field3.field389 = this.field3;
        this.field3.field383 = this.field3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLcd;)V", line = 33)
    public final void method2(boolean arg0, class19 arg1) {
        field1++;
        if (arg1.field383 != null) {
            arg1.method152(-128);
        }
        arg1.field389 = this.field3.field389;
        arg1.field383 = this.field3;
        arg1.field383.field389 = arg1;
        if (!arg0) {
            arg1.field389.field383 = arg1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lcd;", line = 72)
    public final class19 method3(int arg0) {
        class19 var2 = this.field3.field389;
        field14++;
        if (this.field3 == var2) {
            return null;
        } else {
            if (arg0 != 0) {
                field11 = -92;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 96)
    public static final void method4(byte arg0) {
        if (arg0 >= -46) {
            return;
        }
        field9++;
        try {
            Graphics var1 = class129.field3020.getGraphics();
            class114.field2687.method162(-1, 550, var1, 4);
        } catch (Exception var2) {
            class129.field3020.repaint();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lcd;I)V", line = 113)
    public final void method5(class19 arg0, int arg1) {
        if (arg0.field383 != null) {
            arg0.method152(-128);
        }
        arg0.field383 = this.field3.field383;
        arg0.field389 = this.field3;
        if (arg1 == 550) {
            field5++;
            arg0.field383.field389 = arg0;
            arg0.field389.field383 = arg0;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)Lcd;", line = 138)
    public final class19 method6(boolean arg0) {
        field6++;
        class19 var2 = this.field3.field389;
        if (this.field3 == var2) {
            return null;
        } else {
            var2.method152(-128);
            return arg0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lc;IBZ)Z", line = 183)
    public static final boolean method7(class15 arg0, int arg1, byte arg2, boolean arg3) {
        field10++;
        if (!class76.method615(arg3, arg0, (byte) 85)) {
            return false;
        } else if (arg2 == 108) {
            if (arg1 > 0) {
                class11.field243 = new class44(arg1);
            }
            return true;
        } else {
            return true;
        }
    }
}
