import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class137 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    private int field2736 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2735 = -1;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lbg;")
    private class18 field2752 = new class18();

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
    public boolean field2757 = false;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lbi;")
    private class20[] field2745;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[[I")
    private int[][] field2751;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
    public static int[] field2741 = new int[500];

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2748 = -1;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljd;")
    private static class92 field2740 = class202.method1325((byte) 90, "Username: ");

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Ljd;")
    public static class92 field2756 = class202.method1325((byte) 90, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljd;")
    private static class92 field2738 = class202.method1325((byte) 90, "Unable to connect)3");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Ljd;")
    public static class92 field2746 = field2740;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Ljd;")
    public static class92 field2755 = field2738;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Ljd;")
    public static class92 field2758 = field2738;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
    public static boolean field2743;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method912(int arg0) {
        field2738 = null;
        field2741 = null;
        field2755 = null;
        field2756 = null;
        int var1 = 66 / ((arg0 - 59) / 47);
        field2740 = null;
        field2758 = null;
        field2746 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)[[I")
    public final int[][] method913(int arg0) {
        field2753++;
        if (this.field2749 != this.field2747) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2749; var2++) {
            this.field2745[var2] = class31.field702;
        }
        return this.field2751;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public final void method914(boolean arg0) {
        for (int var2 = 0; var2 < this.field2749; var2++) {
            this.field2751[var2] = null;
        }
        if (!arg0) {
            field2738 = null;
        }
        field2754++;
        this.field2745 = null;
        this.field2751 = null;
        this.field2752.method109(65);
        this.field2752 = null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method915(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class208.field4003; var1++) {
            int var2 = class135.field2710[var1];
            class129 var3 = class107.field2187[var2];
            int var4 = class185.field3497.method443(255);
            if ((var4 & 0x10) != 0) {
                var3.field238 = class185.field3497.method465(255);
                int var5 = class185.field3497.method433(-3);
                var3.field203 = (var5 & 0xFFFF) + class158.field3150;
                var3.field240 = 0;
                var3.field191 = 0;
                if (class158.field3150 < var3.field203) {
                    var3.field240 = -1;
                }
                var3.field214 = var5 >> 16;
                if (var3.field238 == 65535) {
                    var3.field238 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field2592 = class117.method786((byte) 112, class185.field3497.method465(255));
                var3.field247 = var3.field2592.field1939;
                var3.field201 = var3.field2592.field1947;
                var3.field205 = var3.field2592.field1985;
                var3.field224 = var3.field2592.field1983;
                var3.field217 = var3.field2592.field1936;
                var3.field195 = var3.field2592.field1976;
                var3.field197 = var3.field2592.field1952;
                var3.field192 = var3.field2592.field1958;
                var3.field211 = var3.field2592.field1963;
            }
            if ((var4 & 0x4) != 0) {
                var3.field223 = class185.field3497.method437((byte) 91);
                var3.field239 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field204 = class185.field3497.method425((byte) -101);
                if (var3.field204 == 65535) {
                    var3.field204 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var6 = class185.field3497.method414((byte) -16);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class185.field3497.method443(255);
                if (var3.field215 == var6 && var6 != -1) {
                    class22 var8 = class153.method978(var6, -113);
                    int var9 = var8.field522;
                    if (var9 == 1) {
                        var3.field219 = 0;
                        var3.field254 = var7;
                        var3.field260 = 0;
                        var3.field251 = 0;
                        class212.method1376(var8, var3.field260, false, var3.field208, 7330, var3.field246);
                    }
                    if (var9 == 2) {
                        var3.field219 = 0;
                    }
                } else if (var6 == -1 || var3.field215 == -1 || class153.method978(var6, -112).field524 >= class153.method978(var3.field215, -102).field524) {
                    var3.field251 = 0;
                    var3.field260 = 0;
                    var3.field219 = 0;
                    var3.field250 = var3.field235;
                    var3.field215 = var6;
                    var3.field254 = var7;
                    if (var3.field215 != -1) {
                        class212.method1376(class153.method978(var3.field215, -106), var3.field260, false, var3.field208, 7330, var3.field246);
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class185.field3497.method443(arg0 ^ 0xFFFFFF00);
                int var11 = class185.field3497.method418(93);
                var3.method26(var10, 123, class158.field3150, var11);
            }
            if ((var4 & 0x20) != 0) {
                var3.field225 = class185.field3497.method442(arg0 - 21350);
                var3.field194 = class185.field3497.method425((byte) -101);
            }
            if ((var4 & 0x8) != 0) {
                int var12 = class185.field3497.method461(-1);
                int var13 = class185.field3497.method443(255);
                var3.method26(var12, arg0 + 30, class158.field3150, var13);
                var3.field245 = class158.field3150 + 300;
                var3.field261 = class185.field3497.method461(arg0);
            }
        }
        field2744++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
    public final int[] method916(int arg0, int arg1) {
        field2737++;
        if (arg1 >= -4) {
            this.field2735 = -44;
        }
        if (this.field2749 == this.field2747) {
            this.field2757 = this.field2745[arg0] == null;
            this.field2745[arg0] = class31.field702;
            return this.field2751[arg0];
        } else if (this.field2749 == 1) {
            this.field2757 = this.field2735 != arg0;
            this.field2735 = arg0;
            return this.field2751[0];
        } else {
            class20 var3 = this.field2745[arg0];
            if (this.field2757 = var3 == null) {
                if (this.field2749 <= this.field2736) {
                    class20 var4 = (class20) this.field2752.method104(false);
                    var3 = new class20(arg0, var4.field483);
                    this.field2745[var4.field486] = null;
                    var4.method1370(22);
                } else {
                    var3 = new class20(arg0, this.field2736);
                    this.field2736++;
                }
                this.field2745[arg0] = var3;
            }
            this.field2752.method102((byte) 74, var3);
            return this.field2751[var3.field483];
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/Object;Lrh;)V")
    public static final void method917(int arg0, Object arg1, class169 arg2) {
        field2742++;
        if (arg2.field3294 == null) {
            return;
        }
        int var3 = -86 / ((arg0 - 3) / 63);
        for (int var4 = 0; var4 < 50 && arg2.field3294.peekEvent() != null; var4++) {
            class58.method357(-24534, 1L);
        }
        if (arg1 != null) {
            arg2.field3294.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(III)V")
    public class137(int arg0, int arg1, int arg2) {
        this.field2745 = new class20[arg1];
        this.field2747 = arg1;
        this.field2749 = arg0;
        this.field2751 = new int[arg0][arg2];
    }
}
