import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class192 extends class204 {

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2384 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!cka", name = "m", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(ILfs;)V")
    public class192(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lfs;)V")
    public class192(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        ++field2387;
        if (arg1 > -105) {
            this.method1189((byte) 3);
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
    public static void method1188(boolean arg0) {
        if (arg0) {
            method1188(false);
        }
        field2384 = null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field2385;
        if (super.field2853.method3513((byte) -70).method4273((byte) 85) > 1) {
            return 4;
        } else {
            if (arg0 < 83) {
                this.method486(44);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)I")
    public final int method1189(byte arg0) {
        ++field2382;
        if (arg0 != -98) {
            field2384 = null;
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field2386;
        int var3 = 22 % ((-57 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (arg0 == -4591) {
            if (super.field2852 < 0 && super.field2852 > 4) {
                super.field2852 = this.method490((byte) 119);
            }
            ++field2383;
        }
    }
}
