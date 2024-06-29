import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 {

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "B")
    public byte field680;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lvd;")
    public class36 field690;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "B")
    public byte field677;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "S")
    public short field684;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lqaa;")
    public static class26 field681 = new class26();

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
    public static int[] field686 = new int[14];

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field685 = 2;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lri;")
    public static class97 field682;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lri;")
    public static class97 field688;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILer;I[I[II)Lmba;")
    public static final class385 method576(int arg0, class92 arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        field687++;
        byte[] var6 = new byte[arg0 * arg2];
        if (arg5 != -2440) {
            method577(67, -88);
        }
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg0 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class385(arg1, arg0, arg2, var6);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method577(int arg0, int arg1) {
        field678++;
        if (arg1 <= 123) {
            method580(66, -49, -13);
        }
        if (!class107.method1016(arg0, (byte) 118)) {
            return;
        }
        class665[] var2 = class564.field8105[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class665 var4 = var2[var3];
            if (var4 != null) {
                var4.field9387 = 0;
                var4.field9299 = 0;
                var4.field9383 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[Lhl;")
    public static final class489[] method578(int arg0) {
        field683++;
        int var1 = -116 % ((arg0 + 63) / 50);
        return new class489[] { class434.field6597, class434.field6600, class434.field6601, class434.field6602, class434.field6603, class434.field6604, class434.field6605, class434.field6606, class434.field6607, class434.field6608, class434.field6609, class434.field6610, class434.field6611, class434.field6612 };
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
    public static final void method579(byte arg0, int arg1) {
        field676++;
        if (arg0 < 95) {
            method578(-71);
        }
        class544.field7918 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z")
    public static final boolean method580(int arg0, int arg1, int arg2) {
        field679++;
        if (arg0 != -1) {
            field691 = 73;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field681 = null;
        field688 = null;
        if (arg0 != 85) {
            method580(-90, 16, -42);
        }
        field682 = null;
        field686 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvd;III)V")
    public class51(class36 arg0, int arg1, int arg2, int arg3) {
        this.field680 = (byte) arg3;
        this.field690 = arg0;
        this.field677 = (byte) arg2;
        this.field684 = (short) arg1;
    }
}
