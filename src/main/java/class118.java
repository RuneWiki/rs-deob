import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class118 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lrc;")
    public static class105 field2749 = class43.method374("Ung-Ultige Session)2ID)3", 0);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lrc;")
    private static class105 field2761 = class43.method374(" has logged in)3", 0);

    @OriginalMember(owner = "client!td", name = "o", descriptor = "[I")
    public static int[] field2762 = new int[5];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lrc;")
    public static class105 field2758 = field2761;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lrc;")
    public static class105 field2752 = class43.method374("Mitteilung", 0);

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lrc;")
    private static class105 field2757 = class43.method374("Your account is already logged in)3", 0);

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lrc;")
    private static class105 field2764 = class43.method374("Classic", 0);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lrc;")
    public static class105 field2748 = field2764;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lrc;")
    public static class105 field2755 = field2757;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lrc;")
    public static class105 field2754 = class43.method374("::clientdrop", 0);

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lrc;")
    private static class105 field2759 = class43.method374("Unexpected loginserver response)3", 0);

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field2768 = 500;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lrc;")
    public static class105 field2767 = field2759;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lle;")
    public static class71 field2766 = new class71(30);

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lbd;")
    public static class11 field2760;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 5)
    public static void method954(byte arg0) {
        field2761 = null;
        field2767 = null;
        field2748 = null;
        field2752 = null;
        field2757 = null;
        field2749 = null;
        field2758 = null;
        field2762 = null;
        field2766 = null;
        field2755 = null;
        if (arg0 != -18) {
            method954((byte) 11);
        }
        field2764 = null;
        field2759 = null;
        field2760 = null;
        field2754 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 58)
    public static final void method955(int arg0, int arg1) {
        if (arg1 == 3819) {
            class113.method930(arg0, (byte) 58);
            field2751++;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lod;", line = 76)
    public static final class88 method956(int arg0, int arg1) {
        field2763++;
        class88 var2 = (class88) class125.field3043.method601((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field1190.method766(arg0, (byte) -45, 13);
        class88 var4 = new class88();
        var4.field1993 = arg0;
        if (var3 != null) {
            var4.method725(29647, new class7(var3));
        }
        if (arg1 == 19452) {
            class125.field3043.method608((long) arg0, var4, (byte) 124);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)I", line = 108)
    public static final int method957(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 - 1 & arg1;
        if (arg3 > -75) {
            field2748 = null;
        }
        int var5 = arg1 / arg0;
        field2765++;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg2 / arg0;
        int var8 = class119.method958((byte) -111, var7, var5);
        int var9 = class119.method958((byte) -111, var7, var5 + 1);
        int var10 = class119.method958((byte) -111, var7 + 1, var5);
        int var11 = class119.method958((byte) -111, var7 + 1, var5 - -1);
        int var12 = class42.method372(var4, var9, var8, arg0, 1710581040);
        int var13 = class42.method372(var4, var11, var10, arg0, 1710581040);
        return class42.method372(var6, var13, var12, arg0, 1710581040);
    }
}
