import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 extends class154 {

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public int field486 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public int field484 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field487 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public int field488 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public int field492 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public int field491 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field490 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public int field489 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Lbi;")
    public class508 field485;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Lfja;")
    public static class783 field493 = new class783(92, -1);

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IBI)Z")
    public final boolean method161(int arg0, byte arg1, int arg2) {
        if (arg1 != 41) {
            this.field489 = 115;
        }
        field483++;
        if (arg2 >= this.field484 && arg2 <= this.field491 && arg0 >= this.field490 && arg0 <= this.field486) {
            return true;
        } else {
            return arg2 >= this.field488 && this.field489 >= arg2 && this.field492 <= arg0 && this.field487 >= arg0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILjava/lang/String;)Lgd;")
    public static final class360 method162(byte arg0, int arg1, String arg2) {
        field482++;
        class360 var3;
        try {
            if (arg0 > -65) {
                return null;
            }
            var3 = (class360) Class.forName("bs").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class105();
        }
        var3.field4918 = arg2;
        var3.field4915 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public static final void method163(int arg0, int arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            method162((byte) 85, -97, null);
        }
        class664.field9220++;
        field481++;
        class537 var3 = class476.method2729(class434.field5902, (byte) -46, class551.field7498);
        var3.field7295.method791(-550441944, arg0);
        var3.field7295.method738(arg1, (byte) -118);
        class173.method1314(false, var3);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        field493 = null;
        if (arg0 < 35) {
            method163(3, 33, 23);
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lbi;)V")
    public class24(class508 arg0) {
        this.field485 = arg0;
    }
}
