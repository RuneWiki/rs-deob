import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class25 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public int field442 = 0;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field446 = 2048;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public int field443 = 2048;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public int field452 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field445 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field453 = "Started 3d Library";

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
    public static boolean field449;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class140.field1797.field5049 = 0;
        field444++;
        class140.field1797.method2204(20, 8);
        class140.field1797.method2204(arg1, 8);
        class140.field1797.method2204(arg0, 8);
        class140.field1797.method2250(false, arg2);
        class140.field1797.method2250(false, arg3);
        if (arg4 < 91) {
            method219(44, -29, -40, 94, -91);
        }
        class8.field111 = -3;
        class86.field1195 = 0;
        class40.field603 = 0;
        class17.field279 = 1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILfb;I)V")
    public final void method220(int arg0, class341 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2233((byte) 104);
            if (var4 == 0) {
                if (arg2 != -331) {
                    field448 = -64;
                }
                field447++;
                return;
            }
            this.method222(arg0, var4, -128, arg1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method221(int arg0) {
        if (arg0 != -1) {
            method219(-87, 100, 55, -35, 49);
        }
        field445 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILfb;)V")
    private final void method222(int arg0, int arg1, int arg2, class341 arg3) {
        if (arg1 == 1) {
            this.field452 = arg3.method2233((byte) 104);
        } else if (arg1 == 2) {
            this.field446 = arg3.method2239(-1076227960);
        } else if (arg1 == 3) {
            this.field443 = arg3.method2239(-1076227960);
        } else if (arg1 == 4) {
            this.field442 = arg3.method2212(-2);
        }
        if (arg2 <= -99) {
            field450++;
        }
    }
}
