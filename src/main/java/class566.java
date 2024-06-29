import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class566 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILdfa;)V", line = 5)
    public static final void method3192(int arg0, int arg1, class757 arg2) {
        if (arg0 != 16238) {
            return;
        }
        class2.field8 = 0;
        class173.field2266 = false;
        field7913++;
        class187.method1195(arg2, arg0 - 16244);
        class154.method960(-106, arg2);
        if (class173.field2266) {
            System.out.println("---endgpp---");
        }
        if (arg2.field2354 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field2354 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIILkha;)Lid;", line = 26)
    public static final class415 method3193(boolean arg0, int arg1, int arg2, class687 arg3) {
        field7912++;
        byte[] var4 = arg3.method3810(arg2, -23360, arg1);
        if (arg0) {
            return var4 == null ? null : new class415(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lr;III[Z)V", line = 46)
    public static final void method3194(class108 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class517.field7282 == class109.field1341) {
            return;
        }
        int var5 = class716.field10106[arg1].method2382((byte) 19, arg3, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class402 var7 = class716.field10106[var6];
                if (var7 != null) {
                    var7.method551(arg0, arg2, var5 - var7.method2382((byte) 19, arg3, arg2), arg3, 0, false);
                }
            }
        }
    }
}
