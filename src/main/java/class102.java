import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class102 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[Lja;")
    public static class62[] field2369 = new class62[1000];

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lja;")
    public static class62 field2378 = class30.method243(43, "null");

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lja;")
    public static class62 field2375 = class30.method243(43, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lcf;")
    public static class21 field2372;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)[B")
    public static final byte[] method816(byte[] arg0, int arg1) {
        field2377++;
        int var2 = arg0.length;
        int var3 = -48 / ((-arg1 - 85) / 40);
        byte[] var4 = new byte[var2];
        class78.method624(arg0, 0, var4, 0, var2);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIZ)Lja;")
    public static final class62 method817(byte arg0, int arg1, boolean arg2) {
        if (arg0 >= -20) {
            return null;
        } else {
            field2379++;
            return class43.method317(arg1, arg2, 10, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)I")
    public static final int method818(int arg0, byte arg1) {
        field2373++;
        return arg1 == 28 ? arg0 >> 17 & 0x7 : 107;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpd;Lja;Lja;I)[Lic;")
    public static final class58[] method819(class108 arg0, class62 arg1, class62 arg2, int arg3) {
        field2367++;
        if (arg3 == 26425) {
            int var4 = arg0.method877(80, arg2);
            int var5 = arg0.method868(arg1, (byte) 105, var4);
            return class77.method620((byte) 40, var5, var4, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method820(int arg0) {
        field2368++;
        if (arg0 != 963311) {
            method819(null, null, null, 44);
        }
        if (class13.field315 != null) {
            class118 var1 = class13.field315;
            synchronized (class13.field315) {
                class13.field315 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2369 = null;
        field2372 = null;
        field2378 = null;
        if (arg0 != 19790) {
            method816(null, -36);
        }
        field2375 = null;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)[B")
    public abstract byte[] method822(int arg0);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[B)V")
    public abstract void method823(byte arg0, byte[] arg1);
}
