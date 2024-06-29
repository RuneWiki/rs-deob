import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class32 extends class88 {

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!e", name = "yb", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!e", name = "Ib", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!e", name = "wb", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!e", name = "Ab", descriptor = "Lle;")
    private class81 field774;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "Loc;")
    private static class99 field756 = class48.method402((byte) -104, "Please reload this page)3");

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "Z")
    public static boolean field758 = false;

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "Loc;")
    private static class99 field765 = class48.method402((byte) -104, "Connecting to update server");

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "Loc;")
    public static class99 field764 = field756;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Loc;")
    private static class99 field757 = class48.method402((byte) -104, "Drop");

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "Loc;")
    public static class99 field766 = null;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "Loc;")
    public static class99 field759 = class48.method402((byte) -104, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!e", name = "xb", descriptor = "Loc;")
    public static class99 field771 = field765;

    @OriginalMember(owner = "client!e", name = "Bb", descriptor = "Loc;")
    private static class99 field775 = class48.method402((byte) -104, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!e", name = "Cb", descriptor = "Loc;")
    public static class99 field776 = field775;

    @OriginalMember(owner = "client!e", name = "Db", descriptor = "I")
    public static int field777 = 0;

    @OriginalMember(owner = "client!e", name = "Gb", descriptor = "Loc;")
    public static class99 field780 = field757;

    @OriginalMember(owner = "client!e", name = "vb", descriptor = "Loc;")
    public static class99 field769 = class48.method402((byte) -104, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!e", name = "Hb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!e", name = "zb", descriptor = "Ldc;")
    public static class24 field773;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "[I")
    public static int[] field761;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZBZIZ)Lef;")
    public static final class35 method274(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field781++;
        if (arg1 != -127) {
            method275(-121, (byte) -86, -60);
        }
        class144 var5 = null;
        if (class36.field920 != null) {
            var5 = new class144(arg3, class36.field920, class25.field594[arg3], 1000000);
        }
        return new class35(var5, class81.field2000, arg3, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)I")
    public static final int method275(int arg0, byte arg1, int arg2) {
        field752++;
        class36 var3 = (class36) class14.field327.method1001((long) arg2, (byte) 121);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            int var6 = 87 / ((arg1 - 51) / 52);
            while (var3.field917.length > var5) {
                if (var3.field923[var5] == arg0) {
                    var4 += var3.field917[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)Ldd;")
    public final class26 method276(byte arg0) {
        if (this.field774 != null) {
            int var2 = class101.field2444 - this.field760;
            if (var2 > 100 && this.field774.field2008 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field774.field2016[this.field763] >= var2) {
                            break label42;
                        }
                        var2 -= this.field774.field2016[this.field763];
                        this.field763++;
                    } while (this.field763 < this.field774.field2026.length);
                    this.field763 -= this.field774.field2008;
                } while (this.field763 >= 0 && this.field763 < this.field774.field2026.length);
                this.field774 = null;
            }
            this.field760 = class101.field2444 - var2;
        }
        if (arg0 != 19) {
            field756 = null;
        }
        field767++;
        class16 var3 = class83.method717(6, this.field755);
        if (var3.field404 != null) {
            var3 = var3.method157((byte) 126);
        }
        return var3 == null ? null : var3.method162(this.field770, this.field753, 12185, this.field768, this.field772, this.field778, this.field782, this.field774, this.field763);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
    public static void method277(byte arg0) {
        field775 = null;
        field769 = null;
        field765 = null;
        field756 = null;
        if (arg0 != -41) {
            method275(3, (byte) -41, 33);
        }
        field759 = null;
        field773 = null;
        field771 = null;
        field757 = null;
        field761 = null;
        field780 = null;
        field776 = null;
        field766 = null;
        field764 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIZLme;)V")
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class88 arg9) {
        this.field753 = arg5;
        this.field778 = arg4;
        this.field772 = arg3;
        this.field768 = arg6;
        this.field782 = arg1;
        this.field770 = arg2;
        this.field755 = arg0;
        if (arg7 != -1) {
            this.field774 = class142.method1163(-118, arg7);
            this.field763 = 0;
            this.field760 = class101.field2444 - 1;
            if (this.field774.field2015 == 0 && arg9 != null && arg9 instanceof class32) {
                class32 var11 = (class32) arg9;
                if (this.field774 == var11.field774) {
                    this.field763 = var11.field763;
                    this.field760 = var11.field760;
                    return;
                }
            }
            if (arg8 && this.field774.field2008 != -1) {
                this.field763 = (int) ((double) this.field774.field2026.length * Math.random());
                this.field760 -= (int) ((double) this.field774.field2016[this.field763] * Math.random());
                return;
            }
        }
    }
}
