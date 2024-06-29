import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class488 extends class435 {

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field7162;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field7161 = 0;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
    public static int[] field7159 = new int[13];

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
    public static int[] field7163 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "J")
    public static long field7160;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Li;III[Z)V")
    public static final void method2957(class31 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class378.field5470 == class152.field1993) {
            return;
        }
        int var5 = class14.field152[arg1].method216(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class38 var7 = class14.field152[var6];
                if (var7 != null) {
                    var7.method209(arg0, arg2, var5 - var7.method216(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
    public static void method2958(int arg0) {
        field7159 = null;
        field7163 = null;
        if (arg0 != 104) {
            method2958(107);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class488() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
    public class488(int arg0) {
        this.field7162 = arg0;
    }
}
