import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class495 extends class702 {

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7005;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
    public static int[] field6999 = new int[2];

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[Lrj;")
    public static class747[] field7001 = new class747[14];

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "F")
    public static float field7000;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[[[Lfu;")
    public static class73[][][] field7002;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 5)
    public final void method2876(byte arg0) {
        int var2 = 105 % ((arg0 - 54) / 33);
        this.field7005.method2220();
        field7004++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lmb;III)V", line = 15)
    public static final void method2877(class410 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class90.field1142) {
            class73 var4 = field7002[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field966 != null && var4.field966.method516((byte) -117)) {
                arg0.method514(true, 12473, var4.field966, class618.field8660, class431.field6109, 0, 0);
            }
        }
        if (arg3 < class90.field1142) {
            class73 var5 = field7002[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field966 != null && var5.field966.method516((byte) -101)) {
                arg0.method514(true, 12473, var5.field966, class618.field8660, 0, class431.field6109, 0);
            }
        }
        if (arg2 < class90.field1142 && arg3 < class665.field9107) {
            class73 var6 = field7002[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field966 != null && var6.field966.method516((byte) -117)) {
                arg0.method514(true, 12473, var6.field966, class618.field8660, class431.field6109, class431.field6109, 0);
            }
        }
        if (arg2 < class90.field1142 && arg3 > 0) {
            class73 var7 = field7002[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field966 != null && var7.field966.method516((byte) -109)) {
                arg0.method514(true, 12473, var7.field966, class618.field8660, class431.field6109, -class431.field6109, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 63)
    public static void method2878(int arg0) {
        field7002 = null;
        field7001 = null;
        int var1 = 79 / ((-arg0 - 42) / 51);
        field6999 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Ljava/lang/String;", line = 80)
    public static final String method2879(byte arg0) {
        if (arg0 != 74) {
            field7000 = 0.13418713F;
        }
        field7003++;
        String var1 = "www";
        if (class389.field5423 == class323.field4120) {
            var1 = "www-wtrc";
        } else if (class323.field4120 == class172.field2258) {
            var1 = "www-wtqa";
        } else if (class462.field6702 == class323.field4120) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class371.field5224 != null) {
            var2 = "/p=" + class371.field5224;
        }
        return "http://" + var1 + "." + class702.field9902.field3631 + ".com/l=" + class416.field5920 + "/a=" + class718.field10135 + var2 + "/";
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V", line = 112)
    public class495(int arg0) {
        this.field7005 = new NativeHeap(arg0);
    }
}
