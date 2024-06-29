import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 extends class745 {

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field338 = (int) (class459.method2731(100) / 1000L);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/lang/String;")
    public String field337;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "S")
    public short field342;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lfba;")
    public static class27 field335 = new class27(11, 3);

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lbu;")
    public static class21 field341 = new class21(92, -2);

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lbu;")
    public static class21 field343 = new class21(106, 4);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lvv;")
    public static class343 field339;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 3)
    public static void method216(int arg0) {
        field339 = null;
        field341 = null;
        field343 = null;
        field335 = null;
        if (arg0 != -21585) {
            field341 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)Z", line = 21)
    public static final boolean method217(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field336++;
            return (arg2 & 0x800) != 0 | class434.method2602(arg0, (byte) 8, arg2) || class26.method240(10420, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lgj;", line = 37)
    public static final class660 method218(int arg0, int arg1) {
        int var2 = -10 % ((arg1 + 40) / 42);
        field340++;
        if (arg0 == 0) {
            if ((double) class117.field1796 == 3.0D) {
                return class109.field1610;
            }
            if ((double) class117.field1796 == 4.0D) {
                return class695.field9708;
            }
            if ((double) class117.field1796 == 6.0D) {
                return class139.field2068;
            }
            if ((double) class117.field1796 >= 8.0D) {
                return class244.field3627;
            }
        } else if (arg0 == 1) {
            if ((double) class117.field1796 == 3.0D) {
                return class139.field2068;
            }
            if ((double) class117.field1796 == 4.0D) {
                return class244.field3627;
            }
            if ((double) class117.field1796 == 6.0D) {
                return class704.field9814;
            }
            if ((double) class117.field1796 >= 8.0D) {
                return class375.field5183;
            }
        } else if (arg0 == 2) {
            if ((double) class117.field1796 == 3.0D) {
                return class704.field9814;
            }
            if ((double) class117.field1796 == 4.0D) {
                return class375.field5183;
            }
            if ((double) class117.field1796 == 6.0D) {
                return class276.field4019;
            }
            if ((double) class117.field1796 >= 8.0D) {
                return class193.field2977;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 108)
    public class20(String arg0, int arg1) {
        this.field337 = arg0;
        this.field342 = (short) arg1;
    }
}
