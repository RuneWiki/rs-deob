import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class360 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Z")
    public boolean field5695 = false;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5696 = 0;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lvh;")
    public static class62 field5700 = new class62(64);

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field5703 = -1;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static volatile int field5706 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field5702;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "J")
    public long field5699;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Lkf;")
    public static class249 field5701;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lio;")
    public class294 field5697;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)Lkh;", line = 20)
    public static final class18 method2518(boolean arg0, int arg1) {
        field5693++;
        class18 var2 = (class18) class238.field3655.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class6.field74.method100(31, arg1, (byte) -107);
            class18 var4 = new class18();
            if (var3 != null) {
                var4.method131((byte) 124, arg1, new class143(var3));
            }
            class238.field3655.method377((long) arg1, var4, -1);
            return var4;
        } else {
            return (class18) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 47)
    public static void method2519(int arg0) {
        if (arg0 < 87) {
            method2518(false, -85);
        }
        field5701 = null;
        field5700 = null;
    }
}
