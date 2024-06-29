import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class class470 {

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public int field6611;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public int field6612;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public int field6609;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lfca;")
    public static class74 field6608 = new class74("", 17);

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Lcba;")
    public static class471 field6613 = new class471(63, 7);

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "[I")
    public static int[] field6615 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)V")
    public static final void method2738(int arg0, byte arg1) {
        if (arg0 == 37) {
            class413.field5812 = 3.0F;
        } else if (arg0 == 50) {
            class413.field5812 = 4.0F;
        } else if (arg0 == 75) {
            class413.field5812 = 6.0F;
        } else if (arg0 == 100) {
            class413.field5812 = 8.0F;
        } else if (arg0 == 200) {
            class413.field5812 = 16.0F;
        }
        field6614++;
        class315.field4241 = -1;
        if (arg1 == -44) {
            class315.field4241 = -1;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IBI)V")
    public abstract void method313(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)Lpg;")
    public static final class625 method2739(int arg0) {
        if (arg0 != 4876) {
            field6615 = null;
        }
        field6607++;
        try {
            return (class625) Class.forName("wm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method2740(byte arg0) {
        field6608 = null;
        int var1 = -84 / ((-arg0 - 10) / 38);
        field6615 = null;
        field6613 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIB)V")
    public abstract void method309(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static final void method2741(int arg0) {
        field6610++;
        if (class56.field1005 == -1) {
            return;
        }
        int var1 = class602.field8697.method2153((byte) 91);
        int var2 = class602.field8697.method2152(0);
        if (arg0 != -16727) {
            return;
        }
        class32 var3 = (class32) class623.field8998.method456((byte) -125);
        if (var3 != null) {
            var1 = var3.method328((byte) -115);
            var2 = var3.method324(-5);
        }
        class84.method641(0, class56.field1005, 0, var2, class134.field2128, 0, var1, class387.field5196, (byte) -116, 0);
        if (class319.field4326 != null) {
            class119.method832(var2, var1, 10084);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
    public abstract void method310(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(III)V")
    public class470(int arg0, int arg1, int arg2) {
        this.field6611 = arg1;
        this.field6612 = arg2;
        this.field6609 = arg0;
    }
}
