import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class47 extends class481 implements class522 {

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Ltr;")
    public static class296 field988 = new class296();

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "[C")
    private static char[] field998 = new char[64];

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "Ldb;")
    public static class324 field999;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "Lpc;")
    public static class670 field992;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "Lin;")
    public static class91 field996;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V")
    public final void method548(int arg0) {
        ++field993;
        super.field6714.method316(1, this);
        if (arg0 >= -78) {
            field992 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
    public final int method447(int arg0) {
        ++field991;
        if (arg0 != -5711) {
            this.method448((byte[]) null, -82, 99, -89);
        }
        return this.field990;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BIII)V")
    public final void method448(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 18) {
            this.method2822(arg0, 0, arg3);
            ++field986;
            this.field990 = arg1;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field988 = null;
        field992 = null;
        int var1 = -29 / ((arg0 - -49) / 43);
        field996 = null;
        field998 = null;
        field999 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
    public final int method444(int arg0) {
        if (arg0 != -23923) {
            this.method448((byte[]) null, -47, -115, -72);
        }
        ++field989;
        return super.field6716;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II[III)V")
    public static final void method550(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        --arg3;
        ++field994;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        if (arg0 == -27) {
            while (var5 > arg3) {
                int var7 = arg3 + 1;
                arg2[var7] = arg4;
                int var8 = var7 + 1;
                arg2[var8] = arg4;
                int var9 = var8 + 1;
                arg2[var9] = arg4;
                int var10 = var9 + 1;
                arg2[var10] = arg4;
                int var11 = var10 + 1;
                arg2[var11] = arg4;
                int var12 = var11 + 1;
                arg2[var12] = arg4;
                int var13 = var12 + 1;
                arg2[var13] = arg4;
                arg3 = var13 + 1;
                arg2[arg3] = arg4;
            }
            while (var6 > arg3) {
                ++arg3;
                arg2[arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)V")
    public static final void method551(int arg0, byte arg1) {
        if (arg1 < -77) {
            class640.field8799 = 2;
            ++field987;
            class274.field3850 = arg0;
            long var2 = 0L;
            if (class199.field2906 != null) {
                class215 var4 = new class215(class266.method1767(class420.method2580(class199.field2906, true), -126));
                long var5 = var4.method1513(-456577760);
                class607.field8335 = var4.method1513(-456577760);
                class58.method613(class581.method3331(var5, -95), true, "", (byte) 79);
            } else {
                class204.method1420(35, (byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)J")
    public final long method445(byte arg0) {
        if (arg0 < 76) {
            field988 = null;
        }
        ++field995;
        return 0L;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lqo;I[BIZ)V")
    public class47(class22 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field990 = arg1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Z")
    public static final boolean method552(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field992 = null;
        }
        ++field997;
        return ~(arg2 & 384) != -1;
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field998[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field998[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field998[var2] = (char) (var2 + -4);
        }
        field998[63] = '-';
        field998[62] = '*';
    }
}
