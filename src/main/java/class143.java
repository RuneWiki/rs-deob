import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class143 extends class66 {

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public int field2408 = -1;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "Z")
    public boolean field2410 = false;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field2402 = -1;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method1214(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class587.field8346 == class493.field7208) {
            return;
        }
        int var5 = class491.field7187[arg1].method477(-1, arg3, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class37 var7 = class491.field7187[var6];
                if (var7 != null) {
                    var7.method475(arg0, arg2, var5 - var7.method477(-1, arg3, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)Lui;")
    public static final class210 method1215(boolean arg0, int arg1) {
        field2409++;
        class210[] var2 = class304.method2115((byte) -127);
        if (arg0) {
            method1214(null, -119, 7, -128, null);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3501 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILri;IBZI)V")
    public static final void method1216(int arg0, class97 arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field2405++;
        class174.method1415(arg4, arg1, 0L, (byte) -38, arg5, arg0, arg2);
        if (arg3 <= 94) {
            field2402 = -114;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
    public static final void method1217(int arg0, int arg1) {
        class338.field5487 = false;
        if (arg1 != -21411) {
            return;
        }
        field2403++;
        class386.field6000 = null;
        class20.field332 = 1;
        class419.field6421 = -1;
        class206.field3453 = arg0;
        class474.field7018 = null;
        class20.field326 = -1;
        class490.field7168 = 0;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field2408 = arg0;
    }
}
