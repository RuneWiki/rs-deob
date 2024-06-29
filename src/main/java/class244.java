import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class244 extends class45 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[Lww;")
    public static class643[] field3196 = new class643[35];

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[Lnt;")
    public static class493[] field3202 = new class493[14];

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Ltt;")
    public static class338 field3201 = new class338(28, -1);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
    public static final void method1493(byte[] arg0, int arg1) {
        if (arg1 != 28) {
            method1495(-79);
        }
        field3198++;
        class157 var2 = new class157(arg0);
        while (true) {
            int var3 = var2.method930(255);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class240.field3172 = var2.method963(-119);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLio;)Ldt;")
    public static final class221 method1494(byte arg0, class157 arg1) {
        field3199++;
        return arg0 >= -66 ? null : new class221(arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method933((byte) 1), arg1.method930(255));
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1495(int arg0) {
        if (arg0 != 35) {
            field3196 = null;
        }
        field3201 = null;
        field3202 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1496(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3200++;
        if (!class611.field8479) {
            return false;
        } else if (arg2 > class469.field6278) {
            return false;
        } else if (class454.method2559(arg0, arg4, 1, arg3)) {
            int var5 = arg0 << class62.field762;
            int var6 = arg3 << class62.field762;
            if (class246.method1500(class246.field3214[arg4].method1611(arg0, true, arg3), var5, 0, class458.field6012, class458.field6012, arg1, var6)) {
                class209.field2791++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
    public class244(int arg0, int arg1) {
        this.field3203 = arg1;
        this.field3195 = arg0;
    }
}
