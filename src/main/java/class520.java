import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class520 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lhga;")
    public static class158 field7517 = new class158(89, 10);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lvfa;")
    public abstract class623 method448(byte arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public abstract void method458(int arg0);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
    public static final int method3132(int arg0) {
        field7515++;
        class167 var1 = class627.field8857;
        boolean var2 = false;
        if (class497.field7259 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class167.method1350(0, var3, 0, null, null, 117);
            var2 = true;
        }
        long var4 = class112.method1033(-11752);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method299(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = -18 / ((-arg0 - 67) / 50);
        int var8 = (int) (class112.method1033(-11752) - var4);
        var1.method1355(0, 0, 100, 100, -16777216, 1);
        if (var2) {
            var1.method1349(1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([BZI)V")
    public static final void method3133(byte[] arg0, boolean arg1, int arg2) {
        field7516++;
        if (class381.field5919 == null) {
            class381.field5919 = new class6(20000);
        }
        class381.field5919.method80(arg2 ^ 0xF5, arg0, arg0.length, 0);
        if (arg1) {
            class310.method2128((byte) -93, class381.field5919.field96);
            class231.field3683 = new class226[class693.field9717];
            int var3 = 0;
            for (int var4 = class78.field993; var4 <= class402.field6202; var4++) {
                class226 var5 = class88.method803(-57, var4);
                if (var5 != null) {
                    class231.field3683[var3++] = var5;
                }
            }
            class685.field9606 = false;
            class535.field7835 = class112.method1033(-11752);
            class381.field5919 = null;
        }
        if (arg2 != 10) {
            method3132(-45);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z")
    public abstract boolean method460(byte arg0);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
    public abstract int method451(int arg0);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)Z")
    public abstract boolean method459(int arg0);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    public static void method3134(int arg0) {
        int var1 = 6 % ((arg0 + 75) / 42);
        field7517 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z")
    public static final boolean method3135(int arg0, int arg1) {
        field7519++;
        if (arg0 != -30134) {
            field7518 = 86;
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lri;I)V")
    public static final void method3136(class97 arg0, int arg1) {
        class314.field4939 = arg0;
        field7513++;
        if (arg1 != 0) {
            method3138(true);
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)Z")
    public abstract boolean method462(int arg0);

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
    public abstract void method447(int arg0);

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)Z")
    public final boolean method3137(int arg0) {
        int var2 = 84 % ((arg0 - 52) / 34);
        field7514++;
        return this.method459(98) || this.method460((byte) 126) || this.method462(125);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method3138(boolean arg0) {
        field7512++;
        if (class668.method3832(class682.field9564, 28100) || class471.method2924((byte) 127, class682.field9564)) {
            class66.method706(5000, (byte) 112, class412.field6318 >> 12, class675.field9521 >> 12);
        } else {
            int var1 = class567.field8141.field4264[0] >> 3;
            int var2 = class567.field8141.field4265[0] >> 3;
            if (var1 >= 0 && var1 < class275.field4426 >> 3 && var2 >= 0 && var2 < class417.field6374 >> 3) {
                class66.method706(5000, (byte) 90, var2, var1);
            } else {
                class66.method706(0, (byte) 81, class417.field6374 >> 4, class275.field4426 >> 4);
            }
        }
        class629.method3667((byte) -89);
        class566.method3353(1867386050);
        class452.method2842(459558252);
        class99.method961((byte) 114);
        if (arg0) {
            method3133(null, false, -113);
        }
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)I")
    public abstract int method454(int arg0);
}
