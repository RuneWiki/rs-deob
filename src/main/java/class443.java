import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class443 extends class780 {

    @OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
    public int field6226;

    @OriginalMember(owner = "client!mja", name = "k", descriptor = "Ljda;")
    public static class239 field6227 = new class239(4);

    @OriginalMember(owner = "client!mja", name = "m", descriptor = "[I")
    public static int[] field6229 = new int[2];

    @OriginalMember(owner = "client!mja", name = "n", descriptor = "[Lbs;")
    public static class717[] field6230 = new class717[14];

    @OriginalMember(owner = "client!mja", name = "h", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!mja", name = "i", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIII)V")
    public static final void method2664(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 7) {
            return;
        }
        if (arg1 >= class174.field2335 && class751.field10402 >= arg1) {
            int var5 = class573.method3204(arg0, class523.field7178, 124915076, class495.field6845);
            int var6 = class573.method3204(arg4, class523.field7178, 124915076, class495.field6845);
            class289.method1836(var6, true, arg2, arg1, var5);
        }
        field6228++;
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(ILur;Lcf;III)V")
    public class443(int arg0, class564 arg1, class631 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6226 = arg5;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lgaa;II)V")
    public static final void method2665(class315 arg0, int arg1, int arg2) {
        field6224++;
        class697.field9766 = 0;
        class283.field4180 = false;
        if (arg2 != 1442) {
            return;
        }
        class477.method2787(arg0, (byte) 38);
        class493.method2863((byte) -65, arg0);
        if (class283.field4180) {
            System.out.println("---endgpp---");
        }
        if (arg0.field5459 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field5459 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)Lhv;")
    public final class546 method1557(byte arg0) {
        if (arg0 >= -35) {
            method2665(null, -81, 102);
        }
        field6225++;
        return class59.field818;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V")
    public static void method2666(boolean arg0) {
        field6229 = null;
        if (!arg0) {
            field6230 = null;
        }
        field6227 = null;
        field6230 = null;
    }
}
