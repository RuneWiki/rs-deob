import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class170 extends class307 {

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "J")
    public long field2791;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 3)
    public class170() {
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIIIIZIIII)Z", line = 12)
    public static final boolean method1263(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field2795++;
        if (!arg2) {
            method1263(-100, 124, false, -100, 90, 99, 125, false, -24, 63, -32, 80);
        }
        if (class255.field4233.method666(24207) == 2) {
            return class236.method1634((byte) -112, arg4, arg0, arg10, arg5, arg6, arg8, arg7, arg3, arg11, arg9, arg1);
        } else if (class255.field4233.method666(24207) > 2) {
            return class23.method171(arg5, arg4, arg9, arg0, 19661118, arg3, arg8, arg1, arg7, arg6, arg11, class255.field4233.method666(24207), arg10);
        } else {
            return class239.method1681(arg1, arg11, -17, arg10, arg9, arg3, arg0, arg4, arg5, arg8, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(J)V", line = 29)
    public class170(long arg0) {
        this.field2791 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 40)
    public static final void method1264(int arg0) {
        field2792++;
        class312.method2157();
        for (int var1 = 0; var1 < 4; var1++) {
            class255.field4247[var1].method415(arg0 + 132);
        }
        if (arg0 != -5) {
            field2794 = -89;
        }
        System.gc();
    }
}
