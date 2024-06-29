import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class20 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field272 = " ";

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field276 = new int[2500];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method154(int arg0, int arg1) {
        if (arg1 == 16) {
            class270 var2 = class190.method1213(arg1 + 25686, arg0, 1);
            var2.method1806(-8173);
            field275++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfj;")
    public static final class209 method155(Throwable arg0, String arg1) {
        field277++;
        class209 var2;
        if (arg0 instanceof class209) {
            var2 = (class209) arg0;
            var2.field3008 = var2.field3008 + ' ' + arg1;
        } else {
            var2 = new class209(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Lai;")
    public static final class108 method156(int arg0, int arg1) {
        field274++;
        class108 var2 = (class108) class202.field2917.method263((byte) 118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class204.field2958.method1538(16, arg1, (byte) 102);
        class108 var4 = new class108();
        if (var3 != null) {
            var4.method708(new class114(var3), 90);
        }
        class202.field2917.method255((long) arg1, var4, (byte) -127);
        if (arg0 != 31539) {
            field273 = -120;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field276 = null;
        field272 = null;
        int var1 = -19 % ((arg0 + 16) / 46);
    }
}
