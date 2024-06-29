import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class290 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field4657;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[B")
    public byte[] field4653;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[B")
    public byte[] field4658;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILdk;)Z")
    public static final boolean method1932(int arg0, int arg1, int arg2, class251 arg3) {
        field4654++;
        byte[] var4 = arg3.method1680(arg2, arg1, -78);
        if (var4 == null) {
            return false;
        } else {
            class241.method1621((byte) -68, var4);
            int var5 = -43 / ((arg0 - 76) / 34);
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Lim;")
    public static final class179 method1933(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2357; var4++) {
            class179 var5 = var3.field2347[var4];
            if ((var5.field2933 >> 29 & 0x3L) == 2L && var5.field2931 == arg1 && var5.field2915 == arg2) {
                class124.method870(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lrl;")
    public static final class310 method1934(int arg0, int arg1) {
        if (arg1 >= -11) {
            return null;
        }
        class310 var2 = (class310) class136.field2145.method1261(0, (long) arg0);
        field4650++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field274.method1680(arg0, 3, -96);
        class310 var4 = new class310();
        if (var3 != null) {
            var4.method2079(new class162(var3), -75);
        }
        class136.field2145.method1264(-1, (long) arg0, var4);
        return var4;
    }
}
