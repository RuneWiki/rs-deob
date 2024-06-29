import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class348 extends class687 {

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Z")
    public boolean field5011 = false;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "S")
    public short field5008;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "[[Z")
    public static boolean[][] field5012 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!es", name = "r", descriptor = "[I")
    public static int[] field5018 = new int[5];

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Lpj;")
    public static class132 field5019;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "[I")
    public static int[] field5016;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgu;")
    public static final class531 method2070(Throwable arg0, String arg1) {
        field5017++;
        class531 var2;
        if (arg0 instanceof class531) {
            var2 = (class531) arg0;
            var2.field7238 = var2.field7238 + ' ' + arg1;
        } else {
            var2 = new class531(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!es", name = "h", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field5012 = null;
        field5019 = null;
        field5016 = null;
        if (arg0 != -23899) {
            field5018 = null;
        }
        field5018 = null;
    }

    @OriginalMember(owner = "client!es", name = "i", descriptor = "(I)V")
    private static final void method2072(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class130.field1786[var1] = null;
        }
        if (arg0 != -26936) {
            field5019 = null;
        }
        field5013++;
        class85.field1170 = 0;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIZZ)V")
    public class348(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field5011 = arg5;
        this.field5010 = arg1;
        this.field5015 = arg0;
        this.field5009 = arg2;
        this.field5008 = (short) arg3;
    }

    @OriginalMember(owner = "client!es", name = "j", descriptor = "(I)V")
    public static final void method2073(int arg0) {
        class258.field3685.method3508((byte) 68);
        field5014++;
        if (arg0 < 93) {
            field5016 = null;
        }
        class288.field4014.field1301 = 0;
        class182.field2681 = null;
        class522.field7092 = null;
        class602.field8356.field1301 = 0;
        class324.field4794 = null;
        class77.field1062 = 0;
        class220.field3192 = 0;
        method2072(-26936);
        class372.field5293 = 0;
        class539.field7312 = 0;
        class473.field6605 = 0;
        class604.field8392 = null;
        class623.field8674 = null;
    }
}
