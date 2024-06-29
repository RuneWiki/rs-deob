import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class293 extends class5 {

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4521 = "Attack";

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
    public static int[] field4524 = new int[25];

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[C")
    public static char[] field4529 = new char[128];

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Ljd;")
    public static class95 field4527;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 7)
    public static void method2024(int arg0) {
        field4529 = null;
        field4527 = null;
        field4521 = null;
        field4524 = null;
        if (arg0 != 128) {
            field4529 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V", line = 27)
    public static final void method2025(byte arg0) {
        if (class234.field3567 != null) {
            class234.field3567.method2306(true);
        }
        field4520++;
        if (class250.field3778 != null) {
            class250.field3778.method2306(true);
        }
        if (arg0 < 58) {
            method2027(-95, 110, (class95) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Lbi;", line = 47)
    public static final class215 method2026(int arg0) {
        if (arg0 != 25) {
            method2028((byte[]) null, false);
        }
        field4526++;
        try {
            return (class215) Class.forName("eb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILjd;)Ljn;", line = 64)
    public static final class327 method2027(int arg0, int arg1, class95 arg2) {
        if (arg0 != 128) {
            field4522 = 64;
        }
        field4530++;
        return class49.method371(arg2, arg1, true) ? class173.method1299((byte) 124) : null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 76)
    public class293() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V", line = 79)
    public class293(int arg0) {
        this.field4519 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BZ)[B", line = 97)
    public static final byte[] method2028(byte[] arg0, boolean arg1) {
        field4525++;
        if (arg0 == null) {
            return null;
        } else if (arg1) {
            byte[] var2 = new byte[arg0.length];
            class126.method947(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
