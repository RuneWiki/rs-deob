import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class240 implements class409 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lsm;")
    public static class387 field3552 = new class387("", 17);

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field3555 = 104;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Llc;")
    public static class435 field3560 = new class435(65, 6);

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "[Lgba;")
    public static class700[] field3561 = new class700[14];

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "D")
    public static double field3559;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
    public static boolean field3557;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILl;)I", line = 3)
    public static final int method1658(int arg0, class639 arg1) {
        field3556++;
        int var2 = arg1.field9086;
        class83 var3 = arg1.method2052(arg0 - 35769);
        if (arg1.field4575 == -1 || arg1.field4595) {
            var2 = arg1.field9064;
        } else if (arg1.field4575 == var3.field1228 || arg1.field4575 == var3.field1235 || arg1.field4575 == var3.field1227 || arg1.field4575 == var3.field1222) {
            var2 = arg1.field9063;
        } else if (arg1.field4575 == var3.field1206 || arg1.field4575 == var3.field1205 || arg1.field4575 == var3.field1223 || arg1.field4575 == var3.field1226) {
            var2 = arg1.field9067;
        }
        if (arg0 != 30200) {
            field3557 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lhr;", line = 31)
    public final class57 method478(int arg0) {
        field3558++;
        return arg0 <= 30 ? null : class165.field2341;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V", line = 47)
    public class240(int arg0) {
        this.field3553 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 68)
    public static void method1659(int arg0) {
        if (arg0 != 65) {
            field3555 = 31;
        }
        field3561 = null;
        field3552 = null;
        field3560 = null;
    }
}
