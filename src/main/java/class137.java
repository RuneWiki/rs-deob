import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class137 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lvl;", line = 13)
    public static final class35 method994(int arg0, int arg1) {
        field1890++;
        class35 var2 = (class35) class157.field2173.method365((long) arg1, 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class266.field3876.method955(26, arg1, -21853);
        if (arg0 <= 30) {
            field1888 = -78;
        }
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method199(new class316(var3), true);
        }
        class157.field2173.method369(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public abstract void method652(byte arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
    public abstract int method651(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)J")
    public abstract long method654(int arg0);
}
