import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class25 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lpd;")
    public static class94 field681 = class28.method249(-118, "backvmid1");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lpd;")
    private static class94 field677 = class28.method249(-109, "Public chat");

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lpd;")
    public static class94 field679 = class28.method249(-77, " (X");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lpd;")
    public static class94 field684 = field677;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lpd;")
    private static class94 field685 = class28.method249(72, "skill)2");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field680 = -1;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lpd;")
    public static class94 field687 = field685;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    public static int[] field682 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lpd;")
    public static class94 field692 = class28.method249(66, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field690 = 1;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Ltd;")
    public static class118 field689;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Luc;")
    public static class122 field678;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 3)
    public static final void method223(byte arg0) {
        int var1 = -57 / ((arg0 - 32) / 48);
        field683++;
        class102.field2572 = null;
        class121.field3023 = null;
        class66.field1614 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIB)I", line = 65)
    public static final int method226(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -31) {
            return -7;
        }
        field688++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class108.field2679[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var8) * class41.field1049[var6][var4][var5 + 1] + class41.field1049[var6][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class41.field1049[var6][var4][var5] + class41.field1049[var6][var4 + 1][var5] * var8 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 107)
    public static void method227(boolean arg0) {
        if (!arg0) {
            return;
        }
        field685 = null;
        field678 = null;
        field679 = null;
        field687 = null;
        field681 = null;
        field677 = null;
        field692 = null;
        field689 = null;
        field682 = null;
        field684 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ls;Lc;IZLs;)V", line = 134)
    public static final void method229(class111 arg0, class16 arg1, int arg2, boolean arg3, class111 arg4) {
        field686++;
        class4.field78 = arg0;
        class90.field2329 = arg4;
        if (arg2 != 127) {
            method226(25, -100, -8, (byte) -80);
        }
        class21.field568 = arg3;
        class80.field2034 = class4.field78.method825(true, 10);
        class26.field707 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public abstract void method224(byte arg0);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public abstract void method225(byte arg0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public abstract int method228(int arg0, int arg1, int arg2);
}
