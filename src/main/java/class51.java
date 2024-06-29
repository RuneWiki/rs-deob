import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class51 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field716 = 255;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[J")
    public static long[] field717 = new long[500];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lhd;")
    private class128 field722;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lsc;")
    private class166 field718;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lnh;")
    public static class305 field723;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[[I")
    public static int[][] field726;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[[[B")
    public static byte[][][] field724;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsc;B)V")
    public final void method310(class166 arg0, byte arg1) {
        this.field718 = arg0;
        if (arg1 != -127) {
            this.method313(122);
        }
        field719++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Lhd;")
    public final class128 method311(boolean arg0) {
        if (arg0) {
            field723 = null;
        }
        class128 var2 = this.field722;
        field715++;
        if (this.field718.field2352 == var2) {
            this.field722 = null;
            return null;
        } else {
            this.field722 = var2.field1789;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)J")
    public static final long method312(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 == null || var3.field1334 == null ? 0L : var3.field1334.field2737;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lhd;")
    public final class128 method313(int arg0) {
        if (arg0 >= -88) {
            return null;
        }
        field720++;
        class128 var2 = this.field718.field2352.field1789;
        if (this.field718.field2352 == var2) {
            this.field722 = null;
            return null;
        } else {
            this.field722 = var2.field1789;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)V")
    public static final void method314(byte arg0, int arg1, int arg2) {
        field721++;
        class58 var3 = class78.field1088[class166.field2364][arg2][arg1];
        if (var3 == null) {
            class144.method904(class166.field2364, arg2, arg1);
            return;
        }
        class199 var4 = null;
        int var5 = -99999999;
        for (class199 var6 = (class199) var3.method369((byte) -99); var6 != null; var6 = (class199) var3.method362(false)) {
            class10 var13 = class281.method1822((byte) -102, var6.field3036.field12);
            int var14 = var13.field153;
            if (var13.field150 == 1) {
                var14 = (var6.field3036.field8 + 1) * var14;
            }
            if (var14 > var5) {
                var5 = var14;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class144.method904(class166.field2364, arg2, arg1);
            return;
        }
        class2 var7 = null;
        var3.method368((byte) -1, var4);
        if (arg0 != -27) {
            return;
        }
        class2 var8 = null;
        for (class199 var9 = (class199) var3.method369((byte) -84); var9 != null; var9 = (class199) var3.method362(false)) {
            class2 var12 = var9.field3036;
            if (var4.field3036.field12 != var12.field12) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field12 != var12.field12 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) (arg2 + (arg1 << 7) + 1610612736);
        class191.method1207(class166.field2364, arg2, arg1, class58.method360(arg1 * 128 + 64, arg2 * 128 + 64, false, class166.field2364), var4.field3036, var10, var7, var8);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public static void method315(boolean arg0) {
        field717 = null;
        field724 = null;
        if (!arg0) {
            method315(false);
        }
        field726 = null;
        field723 = null;
    }
}
