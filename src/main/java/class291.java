import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class291 extends class112 {

    @OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!vja", name = "p", descriptor = "Lhj;")
    public static class596 field3503 = new class596(128, -1);

    @OriginalMember(owner = "client!vja", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vja", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!vja", name = "n", descriptor = "J")
    public static long field3501;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V", line = 6)
    public static void method1699(int arg0) {
        field3503 = null;
        if (arg0 > -87) {
            method1699(56);
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)[Liga;", line = 16)
    public static final class482[] method1700(int arg0) {
        if (arg0 == -31550) {
            field3504++;
            return new class482[] { class307.field3785, class307.field3786, class307.field3787, class307.field3788, class307.field3789, class307.field3790, class307.field3791, class307.field3792, class307.field3793, class307.field3794, class307.field3795, class307.field3796, class307.field3797 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)I", line = 30)
    public static final int method1701(int arg0, int arg1) {
        field3500++;
        int var2 = 97 % ((-arg1 - 27) / 63);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(I)V", line = 44)
    public class291(int arg0) {
        this.field3502 = arg0;
    }

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(II)V", line = 54)
    public static final void method1702(int arg0, int arg1) {
        field3505++;
        class714 var2 = class350.method2072((long) arg1, 11, (byte) 127);
        var2.method4044((byte) -128);
        if (arg0 != -21058) {
            method1700(-15);
        }
    }
}
