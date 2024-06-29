import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class158 extends class232 {

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lok;")
    public static class146 field2657 = class235.method1724(-12908, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
    public static int[] field2658 = new int[5];

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Lok;")
    public static class146 field2660 = class235.method1724(-12908, "::rect_debug");

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Llc;")
    public static class160 field2667 = new class160();

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Z")
    public static boolean field2675 = false;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lok;")
    public class146 field2659;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 17)
    public final void method1236(int arg0) {
        field2665++;
        this.field3874 |= Long.MIN_VALUE;
        if (arg0 == -13730 && this.method1244((byte) 85) == 0L) {
            class230.field3847.method1195((byte) -93, this);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)I", line = 32)
    public final int method1237(int arg0) {
        field2673++;
        return arg0 == 0 ? (int) this.field2883 : -79;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 44)
    public final void method1238(int arg0) {
        int var2 = 34 % ((arg0 - 66) / 57);
        this.field3874 = class67.method501(-120) + 500L | Long.MIN_VALUE & this.field3874;
        class168.field2845.method1195((byte) -93, this);
        field2674++;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V", line = 54)
    public static void method1239(byte arg0) {
        if (arg0 != -44) {
            field2667 = (class160) null;
        }
        field2658 = null;
        field2667 = null;
        field2660 = null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 73)
    public static final Object method1240(boolean arg0, int arg1, byte[] arg2) {
        if (arg1 > -40) {
            return (Object) null;
        }
        field2671++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class70.field1151) {
            try {
                class238 var3 = (class238) Class.forName("cd").getDeclaredConstructor().newInstance();
                var3.method495(0, arg2);
                return var3;
            } catch (Throwable var5) {
                class70.field1151 = true;
            }
        }
        return arg0 ? class277.method2015(arg2, 0) : arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwe;I)Ljh;", line = 118)
    public static final class262 method1241(class47 arg0, int arg1) {
        if (arg1 < 108) {
            return (class262) null;
        }
        arg0.method368(-124);
        field2661++;
        int var2 = arg0.method368(-114);
        class262 var3 = client.method1798(12, var2);
        var3.field4356 = arg0.method368(87);
        int var4 = arg0.method368(-103);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method368(-103);
            var3.method40(arg0, 2048, var6);
        }
        var3.method43(-2);
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILbf;IJ)Z", line = 152)
    public static final boolean method1242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class322 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class148.method1138(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)I", line = 172)
    public final int method1243(int arg0) {
        field2669++;
        return arg0 == -1 ? (int) (this.field2883 >>> 32 & 0xFFL) : -71;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V", line = 187)
    public class158(int arg0, int arg1) {
        this.field2883 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)J", line = 206)
    public final long method1244(byte arg0) {
        field2664++;
        if (arg0 != 85) {
            method1241((class47) null, -38);
        }
        return Long.MAX_VALUE & this.field3874;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 221)
    public static final void method1245(int arg0, int arg1) {
        field2666++;
        if (arg0 != 11522) {
            return;
        }
        class258 var2 = (class258) class115.field1854.method810((byte) -116, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4293.length; var3++) {
                var2.field4293[var3] = -1;
                var2.field4284[var3] = 0;
            }
        }
    }
}
