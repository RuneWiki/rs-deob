import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class523 extends class35 {

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7600;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field7601 = -2;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBIIIIIIIII)V")
    public static final void method3088(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field7602++;
        if (class435.field6449 == null) {
            return;
        }
        class191 var14 = null;
        if (arg7 < 0) {
            int var15 = -arg7 - 1;
            if (class244.field3460 == var15) {
                var14 = class439.field6548;
            } else {
                var14 = class142.field1749[var15];
            }
        } else {
            int var16 = arg7 - 1;
            class411 var17 = (class411) class42.field456.method524((byte) 98, (long) var16);
            if (var17 != null) {
                var14 = var17.field6254;
            }
        }
        if (var14 == null) {
            return;
        }
        if (arg4 >= -18) {
            field7601 = -35;
        }
        class385 var18 = class575.field8301.method1499(-7532, arg3);
        int var19;
        int var20;
        if (arg8 == 1 || arg8 == 3) {
            var20 = var18.field5858;
            var19 = var18.field5860;
        } else {
            var19 = var18.field5858;
            var20 = var18.field5860;
        }
        int var21 = arg6 + (var20 >> 1);
        int var22 = arg6 + (var20 + 1 >> 1);
        int var23 = (var19 >> 1) + arg0;
        int var24 = arg0 + (var19 + 1 >> 1);
        class132 var25 = class435.field6449[arg2];
        int var26 = var25.method259(var21, var23) + var25.method259(var22, var23) + (var25.method259(var21, var24) - -var25.method259(var22, var24)) >> 2;
        class560 var27 = new class560();
        if (arg10 > arg12) {
            int var28 = arg10;
            arg10 = arg12;
            arg12 = var28;
        }
        var27.field7985 = var14.field1757;
        var27.field7970 = arg8;
        var27.field7987 = class287.field3982 + arg5;
        var27.field7977 = arg0;
        var27.field7986 = class287.field3982 + arg9;
        var27.field7973 = arg6;
        var27.field7981 = arg3;
        var27.field7976 = arg11;
        var27.field7975 = arg6 + arg12;
        if (arg1 > arg13) {
            int var29 = arg1;
            arg1 = arg13;
            arg13 = var29;
        }
        var27.field7974 = arg6 + arg10;
        var27.field7969 = arg0 + arg13;
        var27.field7968 = var26;
        var27.field7983 = (var27.field7973 << 9) + (var20 << 8);
        var27.field7971 = arg0 + arg1;
        var27.field7980 = (var27.field7977 << 9) + (var19 << 8);
        class283.field3931.method706(var27, true);
        var14.field2522 = var27;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method3089(int arg0) {
        field7599++;
        this.field7600.method3410();
        if (arg0 != -1966801983) {
            this.method3089(-70);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
    public class523(int arg0) {
        this.field7600 = new NativeHeap(arg0);
    }
}
