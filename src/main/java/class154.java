import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class154 extends class220 {

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    private int field2019;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "[I")
    public static int[] field2015 = new int[128];

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "J")
    public static long field2021 = 0L;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2020 = "Loaded interfaces";

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V", line = 3)
    public class154(int arg0) {
        super(0, true);
        this.field2019 = 4096;
        this.field2019 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLil;)V", line = 13)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 == 0) {
            this.field2019 = (arg2.method1697(108) << 12) / 255;
        }
        if (arg1 == -49) {
            ++field2016;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)[I", line = 43)
    public final int[] method43(int arg0, int arg1) {
        ++field2014;
        int[] var3 = super.field3125.method2005(arg1, (byte) 121);
        if (arg0 != -11543) {
            this.field2019 = -60;
        }
        if (super.field3125.field4676) {
            class111.method769(var3, 0, class344.field5043, this.field2019);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 65)
    public class154() {
        this(4096);
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V", line = 70)
    public static void method995(int arg0) {
        field2015 = null;
        if (arg0 < -3) {
            field2020 = null;
        }
    }
}
