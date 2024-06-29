import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class214 extends class86 {

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
    public static boolean field2929 = false;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            field2929 = false;
        }
        ++field2932;
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field2933;
        return arg0 != 0 ? 43 : 0;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (~super.field1200 != -2 && super.field1200 != 0) {
            super.field1200 = this.method73(arg0 + 65);
        }
        if (arg0 == -65) {
            ++field2927;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
    public final int method1417(boolean arg0) {
        ++field2928;
        if (arg0) {
            this.method72(54, -82);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ILsf;)V")
    public class214(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Z")
    public static final boolean method1418(int arg0) {
        if (arg0 != 1) {
            return false;
        } else {
            ++field2931;
            if (class87.field1218) {
                try {
                    class586.method3137(8259, "showVideoAd", class80.field1134);
                    return true;
                } catch (Throwable var1) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field2929 = false;
        }
        ++field2930;
        return 1;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lsf;)V")
    public class214(class551 arg0) {
        super(arg0);
    }
}
