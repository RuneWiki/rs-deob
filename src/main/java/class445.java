import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class445 extends class5 {

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Luu;")
    public static class191 field6686;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 6)
    public static void method2695(int arg0) {
        field6686 = null;
        int var1 = -54 / ((-arg0 - 1) / 53);
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)Z", line = 15)
    public final boolean method2696(int arg0) {
        field6682++;
        if (arg0 == 1) {
            return (this.field6684 & 0x3753E4) >> 21 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V", line = 31)
    public class445(int arg0, int arg1) {
        this.field6681 = arg1;
        this.field6684 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Luu;II)Lju;", line = 40)
    public static final class82 method2697(class191 arg0, int arg1, int arg2) {
        if (arg1 == 1237020604) {
            field6680++;
            byte[] var3 = arg0.method1289(arg2, 126);
            return var3 == null ? null : new class82(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)Z", line = 59)
    public final boolean method2698(int arg0) {
        field6679++;
        if (arg0 != 1661101682) {
            this.method2702(60, -62);
        }
        return (this.field6684 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)I", line = 71)
    public final int method2699(int arg0) {
        field6683++;
        if (arg0 != 1661101682) {
            field6686 = null;
        }
        return class33.method276(false, this.field6684);
    }

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "(I)I", line = 83)
    public final int method2700(int arg0) {
        field6690++;
        if (arg0 != 2063986) {
            field6686 = null;
        }
        return (this.field6684 & 0x1F7E72) >> 18;
    }

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "(I)Z", line = 97)
    public final boolean method2701(int arg0) {
        field6687++;
        if (arg0 != 1) {
            this.method2700(-9);
        }
        return (this.field6684 & 0x7C4CD2) >> 22 != 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z", line = 108)
    public final boolean method2702(int arg0, int arg1) {
        if (arg1 >= -87) {
            this.method2698(-34);
        }
        field6689++;
        return (this.field6684 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lbr;BIII)V", line = 119)
    public static final void method2703(class274 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6685++;
        long var5 = (long) (arg4 | arg3 << 28 | arg2 << 14);
        class247 var7 = (class247) class392.field6005.method1747(var5, false);
        if (var7 == null) {
            class247 var8 = new class247();
            class392.field6005.method1751(var5, -102, var8);
            var8.field3448.method453((byte) 112, arg0);
            return;
        }
        class74 var9 = class103.field1489.method1603((byte) -99, arg0.field3810);
        int var10 = var9.field1057;
        if (var9.field1032 == 1) {
            var10 = (arg0.field3808 + 1) * var10;
        }
        if (arg1 <= 35) {
            method2695(59);
        }
        for (class274 var11 = (class274) var7.field3448.method445(33); var11 != null; var11 = (class274) var7.field3448.method451(false)) {
            class74 var12 = class103.field1489.method1603((byte) -99, var11.field3810);
            int var13 = var12.field1057;
            if (var12.field1032 == 1) {
                var13 = (var11.field3808 + 1) * var13;
            }
            if (var10 > var13) {
                class535.method3164(13, arg0, var11);
                return;
            }
        }
        var7.field3448.method453((byte) 121, arg0);
    }
}
