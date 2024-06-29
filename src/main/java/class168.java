import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class168 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2012 = new Hashtable();

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field2013 = -1;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "F")
    public static float field2014;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "Lfq;")
    public static class185 field2010;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "[Lbi;")
    public static class438[] field2015;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)I")
    public static final int method1004(int arg0, int arg1, int arg2) {
        field2011++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1 != -1) {
            method1005(16, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILd;)V")
    public static final void method1005(int arg0, class137 arg1) {
        class628.field8912[arg0] = arg1;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
    public static void method1006(boolean arg0) {
        field2010 = null;
        field2015 = null;
        if (!arg0) {
            field2012 = null;
        }
    }
}
