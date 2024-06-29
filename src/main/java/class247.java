import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class247 extends class418 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field3477 = -1;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "F")
    public static float field3479 = 0.0F;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lbo;")
    public static class453 field3476 = new class453(8);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lir;")
    public static class185 field3480;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method1612(int arg0) {
        int var1 = 110 / ((-arg0 - 51) / 54);
        field3480 = null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        class27.field471.method1839((byte) 95);
        field3481++;
        int var1 = class27.field471.method1832(1, (byte) -58);
        if (var1 == 0 || arg0 > -105) {
            return;
        }
        int var2 = class27.field471.method1832(2, (byte) -88);
        if (var2 == 0) {
            class298.field4500[class421.field6124++] = 2047;
        } else if (var2 == 1) {
            int var3 = class27.field471.method1832(3, (byte) -60);
            class383.field5609.method1085(1, 0, var3);
            int var4 = class27.field471.method1832(1, (byte) -92);
            if (var4 == 1) {
                class298.field4500[class421.field6124++] = 2047;
            }
        } else if (var2 == 2) {
            if (class27.field471.method1832(1, (byte) -54) == 1) {
                int var5 = class27.field471.method1832(3, (byte) -124);
                class383.field5609.method1085(2, 0, var5);
                int var6 = class27.field471.method1832(3, (byte) -97);
                class383.field5609.method1085(2, 0, var6);
            } else {
                int var7 = class27.field471.method1832(3, (byte) -47);
                class383.field5609.method1085(0, 0, var7);
            }
            int var8 = class27.field471.method1832(1, (byte) -116);
            if (var8 == 1) {
                class298.field4500[class421.field6124++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class27.field471.method1832(7, (byte) -40);
            int var10 = class27.field471.method1832(7, (byte) -93);
            int var11 = class27.field471.method1832(1, (byte) -63);
            if (var11 == 1) {
                class298.field4500[class421.field6124++] = 2047;
            }
            int var12 = class27.field471.method1832(1, (byte) -79);
            class268.field3973 = class27.field471.method1832(2, (byte) -74);
            class383.field5609.method2076(var10, 47, var9, class268.field3973, var12 == 1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLir;I)Lbm;")
    public static final class101 method1614(byte arg0, class185 arg1, int arg2) {
        field3478++;
        byte[] var3 = arg1.method1234(arg2, (byte) 76);
        if (arg0 != 34) {
            field3480 = null;
        }
        return var3 == null ? null : new class101(var3);
    }
}
