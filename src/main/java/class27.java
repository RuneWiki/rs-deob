import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public int field438 = 0;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field439 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lwm;")
    private class399 field440 = new class399(64);

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljm;")
    private class489 field447 = null;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lph;")
    private class459 field436;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lph;")
    private class459 field442;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/lang/String;")
    public static String field437 = null;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Z")
    public static boolean field443 = false;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[Z")
    public static boolean[] field444 = new boolean[8];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lwi;")
    public static class328 field446;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 5)
    public static void method192(int arg0) {
        field437 = null;
        if (arg0 == 32767) {
            field446 = null;
            field444 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z", line = 23)
    public static final boolean method193(int arg0, boolean arg1) {
        if (arg0 != 0) {
            return false;
        }
        field445++;
        boolean var2 = class262.field4006.method334();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class262.field4006.method333();
        } else if (!class262.field4006.method396()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class186.field2990.field2530 = arg1;
            class186.field2990.method1787((byte) 108, class497.field7305);
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILph;Lph;Ljm;)V", line = 151)
    public class27(int arg0, class459 arg1, class459 arg2, class489 arg3) {
        this.field436 = arg1;
        this.field442 = arg2;
        this.field447 = arg3;
        if (this.field436 != null) {
            this.field438 = this.field436.method2763(1, -3);
        }
        if (this.field442 != null) {
            this.field439 = this.field442.method2763(1, -3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JILje;[I)Ljava/lang/String;", line = 66)
    public final String method194(long arg0, int arg1, class278 arg2, int[] arg3) {
        field435++;
        if (arg1 != 32768) {
            method193(-41, false);
        }
        if (this.field447 != null) {
            String var6 = this.field447.method452(arg2, arg0, (byte) 121, arg3);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lnl;", line = 86)
    public final class389 method195(int arg0, int arg1) {
        field441++;
        class389 var3 = (class389) this.field440.method2478(arg1 + 32770, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field442.method2757(1, arg0 & 0x7FFF, (byte) -119);
        } else {
            var4 = this.field436.method2757(1, arg0, (byte) -120);
        }
        class389 var5 = new class389();
        var5.field5849 = this;
        if (arg1 != -32769) {
            this.field438 = -57;
        }
        if (var4 != null) {
            var5.method2402(-12925, new class289(var4));
        }
        if (arg0 >= 32768) {
            var5.method2397((byte) 102);
        }
        this.field440.method2472(-85, var5, (long) arg0);
        return var5;
    }
}
