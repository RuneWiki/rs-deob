import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class93 extends class242 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
    public static boolean field1677 = false;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "J")
    public static long field1676 = 0L;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Ljf;")
    private static class229 field1681 = class212.method1457((byte) 111, "Loaded config");

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Ljf;")
    public static class229 field1682 = field1681;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Lni;")
    public static class24 field1685 = new class24(260);

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "S")
    public static short field1686 = 205;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZ)V", line = 13)
    public static final void method648(int arg0, int arg1, int arg2, boolean arg3) {
        field1679++;
        class229 var4 = class142.method989(new class229[] { class318.field5361, class84.method607(126, arg0), class22.field387, class84.method607(-46, arg2 >> 6), class22.field387, class84.method607(-75, arg1 >> 6), class22.field387, class84.method607(102, arg2 & 0x3F), class22.field387, class84.method607(118, arg1 & 0x3F) }, -121);
        var4.method1622(arg3);
        class260.method1852((byte) 107, var4);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V", line = 23)
    public static final void method649(int arg0, int arg1, int arg2) {
        class10.field115 = true;
        class80.field1457 = arg0;
        class115.field2075 = arg1;
        class29.field508 = arg2;
        class270.field4630 = -1;
        class273.field4678 = -1;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 36)
    public static void method650(int arg0) {
        if (arg0 < -47) {
            field1682 = null;
            field1685 = null;
            field1681 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)I", line = 52)
    public static final int method651(byte arg0, int arg1) {
        if (arg0 != 108) {
            field1681 = (class229) null;
        }
        field1680++;
        return (arg1 & 0x3FEE0) >> 11;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V", line = 65)
    public static final void method652(int arg0, byte arg1) {
        class26.field469.method231((byte) 113, arg0);
        field1684++;
        int var2 = -22 % ((14 - arg1) / 57);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Z", line = 82)
    public static final boolean method653(int arg0, int arg1) {
        if (arg0 > -33) {
            field1676 = -3L;
        }
        field1683++;
        return ((arg1 & 0x59610DF1) >> 30) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 92)
    public class93() {
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V", line = 96)
    public class93(int arg0) {
        this.field1678 = arg0;
    }
}
