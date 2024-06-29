import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class187 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "[I")
    public static int[] field2440 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
    public static int[] field2443 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
    public static int[] field2445 = new int[64];

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "[Lwg;")
    public static class295[] field2446 = new class295[32768];

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2444 = 205;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Ldq;")
    public static class493 field2447 = new class493(22, -2);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[Lkv;")
    public static class177[] field2441;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILtf;I)V")
    public static final void method1172(int arg0, class194 arg1, int arg2) {
        field2448++;
        class149.field1880 = false;
        class409.field5845 = arg2;
        class502.method3025(-117, arg1);
        class208.method1288(-20715, arg1);
        if (class149.field1880) {
            System.out.println("---endgpp---");
        }
        if (arg1.field6631 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field6631 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method1173(int arg0) {
        field2447 = null;
        field2441 = null;
        field2443 = null;
        field2440 = null;
        field2446 = null;
        field2445 = null;
        if (arg0 != 64) {
            field2446 = null;
        }
    }
}
