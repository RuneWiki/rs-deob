import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class246 {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lhh;")
    public static class163 field4332 = class137.method1065("settings=", 17);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4337 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
    public static int[] field4340 = new int[2048];

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "J")
    public static long field4343;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lvg;")
    public static class262 field4334;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)I")
    public static final int method1691(int arg0, int arg1, boolean arg2) {
        field4339++;
        if (arg2) {
            method1694(109, 125);
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhh;I)Lhh;")
    public static final class163 method1692(class163 arg0, int arg1) {
        field4338++;
        int var2 = class229.method1594(arg1 ^ arg1, arg0);
        return var2 == -1 ? client.field2005 : class127.field2469.field4098[var2];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public static final int method1693(int arg0, int arg1) {
        field4336++;
        int var2 = -13 / ((arg0 - 21) / 49);
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
    public static final int method1694(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public abstract void method42(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)V")
    public abstract void method44(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1695(int arg0) {
        field4340 = null;
        if (arg0 == 17798) {
            field4332 = null;
            field4334 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLgj;)V")
    public static final void method1696(byte arg0, class126 arg1) {
        if (arg0 != 77) {
            return;
        }
        class247 var2 = (class247) class39.field649.method1743(arg1.field2424.method1193((byte) 84), false);
        field4341++;
        if (var2 == null) {
            class175.method1300(class20.field323, (class35) null, arg1.field3629[0], false, (class2) null, 0, arg1, arg1.field3614[0]);
        } else {
            var2.method1702(arg0 - 19690);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
    public abstract void method46(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
    public class246(int arg0, int arg1, int arg2) {
        this.field4342 = arg1;
        this.field4335 = arg2;
        this.field4333 = arg0;
    }
}
