import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class133 extends class312 {

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    private int field2191 = -32768;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2197++;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
    public final int method860() {
        field2195++;
        return this.field2191;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10) {
        field2198++;
        class242 var13 = class13.method75(false, this.field2193).method496((class284) null, this.field2199, (class163) null, 0, true, 0, -1);
        if (var13 != null) {
            var13.method852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2191 = var13.method860();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILhg;ZBI)V")
    public static final void method991(int arg0, class207 arg1, boolean arg2, byte arg3, int arg4) {
        int var5 = arg1.field3484;
        if (arg1.field3345 == 0) {
            arg1.field3484 = arg1.field3480;
        } else if (arg1.field3345 == 1) {
            arg1.field3484 = arg0 - arg1.field3480;
        } else if (arg1.field3345 == 2) {
            arg1.field3484 = arg1.field3480 * arg0 >> 14;
        } else if (arg1.field3345 == 3) {
            if (arg1.field3376 == 2) {
                arg1.field3484 = (arg1.field3480 - 1) * arg1.field3457 + arg1.field3480 * 32;
            } else if (arg1.field3376 == 7) {
                arg1.field3484 = (arg1.field3480 - 1) * arg1.field3457 + arg1.field3480 * 115;
            }
        }
        field2196++;
        if (arg3 > -29) {
            return;
        }
        int var6 = arg1.field3481;
        if (arg1.field3373 == 0) {
            arg1.field3481 = arg1.field3386;
        } else if (arg1.field3373 == 1) {
            arg1.field3481 = arg4 - arg1.field3386;
        } else if (arg1.field3373 == 2) {
            arg1.field3481 = arg1.field3386 * arg4 >> 14;
        } else if (arg1.field3373 == 3) {
            if (arg1.field3376 == 2) {
                arg1.field3481 = (arg1.field3386 - 1) * arg1.field3466 + arg1.field3386 * 32;
            } else if (arg1.field3376 == 7) {
                arg1.field3481 = (arg1.field3386 - 1) * arg1.field3466 + arg1.field3386 * 12;
            }
        }
        if (arg1.field3345 == 4) {
            arg1.field3484 = arg1.field3481 * arg1.field3404 / arg1.field3490;
        }
        if (arg1.field3373 == 4) {
            arg1.field3481 = arg1.field3490 * arg1.field3484 / arg1.field3404;
        }
        if (class45.field701 && (client.method732(arg1).field371 != 0 || arg1.field3376 == 0)) {
            if (arg1.field3481 < 5 && arg1.field3484 < 5) {
                arg1.field3481 = 5;
                arg1.field3484 = 5;
            } else {
                if (arg1.field3484 <= 0) {
                    arg1.field3484 = 5;
                }
                if (arg1.field3481 <= 0) {
                    arg1.field3481 = 5;
                }
            }
        }
        if (arg1.field3495 == 1337) {
            class159.field2603 = arg1;
        }
        if (arg2 && arg1.field3422 != null && arg1.field3484 != var5 || arg1.field3481 != var6) {
            class303 var7 = new class303();
            var7.field4935 = arg1.field3422;
            var7.field4931 = arg1;
            class300.field4904.method311(98, var7);
        }
    }
}
