import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class334 extends class324 {

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "Ljava/lang/Object;")
    private Object field4975;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "J")
    public static long field4980 = 0L;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "Lpf;")
    public static class425 field4974 = new class425(34, 7);

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    public static int field4981 = 500;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V")
    public static void method2043(int arg0) {
        if (arg0 != 1) {
            method2043(-19);
        }
        field4974 = null;
    }

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)V")
    public static final void method2044(int arg0) {
        field4972++;
        if (class28.field363) {
            return;
        }
        class254.method1562(class17.field251, (byte) -89);
        if (arg0 < 117) {
            field4974 = null;
        }
        if (class103.field1393 != null) {
            class254.method1562(class103.field1393, (byte) -108);
        }
        class28.field363 = true;
    }

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "(I)I")
    public static final int method2045(int arg0) {
        field4973++;
        return arg0 == -2073204108 ? ((class438.field6450 == 0 ? 0 : 1) << 21) + (class109.field1445 << 17) + ((class244.field3651 ? 1 : 0) << 15) + ((class451.field6650 ? 1 : 0) << 13) + ((class52.field684 ? 1 : 0) << 10) + ((class39.field477 ? 1 : 0) << 6) + ((class345.field5157 ? 1 : 0) << 5) + ((class71.field935 ? 1 : 0) << 3) + (class105.field1410 & 0x7) + ((class213.field3198 ? 1 : 0) << 4) + (((class424.field6237 ? 1 : 0) << 8) + ((class151.field2090 ? 1 : 0) << 9) - (-(class97.field1334 & 0x3 << 11) - (((class431.field6332 ? 1 : 0) << 16) - -((class1.field12 ? 1 : 0) << 19)))) + ((class465.field6842 == 0 ? 0 : 1) << 20) - (-((client.field6666 == 0 ? 0 : 1) << 22) + -(class390.method2405(arg0 ^ 0x7B92A06A) << 23) + -(class452.field6683 << 25) + -((class341.field5111 ? 1 : 0) << 27) + -(class14.field176 << 28)) : 97;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)I")
    public static final int method2046(int arg0, int arg1) {
        if (arg1 == 0) {
            field4976++;
            return arg0 >>> 10;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lur;Ljava/lang/Object;I)V")
    public class334(class260 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4975 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)Z")
    public final boolean method1993(int arg0) {
        field4977++;
        return arg0 == -29135 ? false : false;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1994(byte arg0) {
        if (arg0 >= -47) {
            field4981 = 108;
        }
        field4979++;
        return this.field4975;
    }
}
