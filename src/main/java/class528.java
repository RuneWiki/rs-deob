import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class528 {

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field7446 = -1;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field7443 = false;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lbu;")
    public class142 field7445;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public int[] field7441;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field7442;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lwp;III)V")
    public static final void method2972(class452 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            return;
        }
        if (arg0.field6440 == 0) {
            arg0.field6357 = arg0.field6329;
        } else if (arg0.field6440 == 1) {
            arg0.field6357 = (arg3 - arg0.field6483) / 2 + arg0.field6329;
        } else if (arg0.field6440 == 2) {
            arg0.field6357 = arg3 - arg0.field6329 - arg0.field6483;
        } else if (arg0.field6440 == 3) {
            arg0.field6357 = arg0.field6329 * arg3 >> 14;
        } else if (arg0.field6440 == 4) {
            arg0.field6357 = (arg3 - arg0.field6483) / 2 + (arg0.field6329 * arg3 >> 14);
        } else {
            arg0.field6357 = arg3 - (arg0.field6329 * arg3 >> 14) - arg0.field6483;
        }
        if (arg0.field6469 == 0) {
            arg0.field6459 = arg0.field6348;
        } else if (arg0.field6469 == 1) {
            arg0.field6459 = (arg2 - arg0.field6443) / 2 + arg0.field6348;
        } else if (arg0.field6469 == 2) {
            arg0.field6459 = arg2 - arg0.field6443 - arg0.field6348;
        } else if (arg0.field6469 == 3) {
            arg0.field6459 = arg0.field6348 * arg2 >> 14;
        } else if (arg0.field6469 == 4) {
            arg0.field6459 = (arg0.field6348 * arg2 >> 14) + (arg2 - arg0.field6443) / 2;
        } else {
            arg0.field6459 = arg2 - (arg0.field6348 * arg2 >> 14) - arg0.field6443;
        }
        field7444++;
        if (!class590.field8339) {
            return;
        }
        if (client.method3750(arg0).field3898 == 0 && arg0.field6471 != 0) {
            return;
        }
        if (arg0.field6357 < 0) {
            arg0.field6357 = 0;
        } else if ((arg0.field6483 + arg0.field6357) > arg3) {
            arg0.field6357 = arg3 - arg0.field6483;
        }
        if (arg0.field6459 < 0) {
            arg0.field6459 = 0;
            return;
        }
        if ((arg0.field6459 + arg0.field6443) > arg2) {
            arg0.field6459 = arg2 - arg0.field6443;
            return;
        }
    }
}
