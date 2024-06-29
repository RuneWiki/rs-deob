import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class180 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    private int field2807 = -1;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Ljo;")
    private class150 field2796 = new class150();

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Z")
    public boolean field2808 = false;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[[I")
    private int[][] field2799;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[Lpn;")
    private class358[] field2798;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lui;")
    public static class98 field2792 = new class98(64);

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
    public static int[] field2803 = new int[] { 6, 0, 0, 0, 0, 0, 0, 14, 0, 7, 2, 0, 0, 15, 0, 0, -2, 10, 0, 0, 7, 20, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 9, -2, 12, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 10, 0, 5, 3, 0, 0, 2, 0, 2, 0, -1, 10, 0, 0, 0, 0, 0, -1, 12, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 0, 8, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, -1, -1, 0, 6, -1, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 1, 3, 0, 0, 6, 0, 0, 0, 0, 2, -2, 0, 12, 5, 0, 6, 28, 4, 0, -2, 0, 0, 11, 0, 0, -2, 0, 2, -1, 5, 6, 0, 0, 12, 0, 0, 0, 6, 0, 17, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 6, 0, 14, 0, -1, 0, -1, 4, 10, 0, 8, 8, 0, 7, -2, 2, 0, 0, 0, -2, 0, 0, 0, 0, 7, 8, -2, 0, 0, 3, 0, -2, 2, 0, 0, 6, 8, 0, 0, 8, 4, 0, -2, 0, 0, 15, 3, -1, 0, 0, 0, 8, 0, 0, 0 };

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lnm;")
    public static class221 field2801;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[[[B")
    public static byte[][][] field2806;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1255(int arg0) {
        class159.field2552.method255(8);
        int var1 = class159.field2552.method246(8, 1);
        field2802++;
        if (var1 == 0) {
            return;
        }
        int var2 = class159.field2552.method246(8, 2);
        if (arg0 >= -99) {
            field2803 = (int[]) null;
        }
        if (var2 == 0) {
            class166.field2611[class99.field1440++] = 2047;
        } else if (var2 == 1) {
            int var3 = class159.field2552.method246(8, 3);
            class329.field5388.method2036(1, 90, var3);
            int var4 = class159.field2552.method246(8, 1);
            if (var4 == 1) {
                class166.field2611[class99.field1440++] = 2047;
            }
        } else if (var2 == 2) {
            if (class159.field2552.method246(8, 1) == 1) {
                int var10 = class159.field2552.method246(8, 3);
                class329.field5388.method2036(2, 107, var10);
                int var11 = class159.field2552.method246(8, 3);
                class329.field5388.method2036(2, 123, var11);
            } else {
                int var9 = class159.field2552.method246(8, 3);
                class329.field5388.method2036(0, 101, var9);
            }
            int var12 = class159.field2552.method246(8, 1);
            if (var12 == 1) {
                class166.field2611[class99.field1440++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class159.field2552.method246(8, 1);
            if (var5 == 1) {
                class166.field2611[class99.field1440++] = 2047;
            }
            int var6 = class159.field2552.method246(8, 7);
            int var7 = class159.field2552.method246(8, 1);
            int var8 = class159.field2552.method246(8, 7);
            class120.field1779 = class159.field2552.method246(8, 2);
            class329.field5388.method317(var7 == 1, 0, var8, var6);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z", line = 92)
    public static final boolean method1256(int arg0, int arg1) {
        field2800++;
        class201 var2 = class161.method1138(arg1, 2);
        if (var2 == null) {
            return false;
        } else if (class274.field4509 == 1 || class274.field4509 == 2 || class290.field4818 == 2) {
            class242.field3811 = var2.field3087;
            class203.field3111 = var2.field3097;
            if (class290.field4818 != 0) {
                class273.field4500 = class203.field3111 + 50000;
                class21.field248 = class203.field3111 + 40000;
                class285.field4669 = class21.field248;
            }
            return true;
        } else if (arg0 == 40000) {
            String var3 = "";
            if (class290.field4818 != 0) {
                var3 = ":" + (var2.field3097 + 7000);
            }
            String var4 = "";
            if (class219.field3370 != null) {
                var4 = "/p=" + class219.field3370;
            }
            String var5 = "http://" + var2.field3087 + var3 + "/l=" + class334.field5418 + "/a=" + class289.field4807 + var4 + "/j" + (class5.field60 ? "1" : "0") + ",o" + (class228.field3597 ? "1" : "0") + ",a2,m" + (class219.field3371 ? "1" : "0");
            try {
                class96.field1394.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 146)
    public static void method1257(int arg0) {
        field2806 = (byte[][][]) null;
        field2801 = null;
        field2803 = null;
        field2792 = null;
        int var1 = -86 / ((arg0 + 69) / 35);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(III)V", line = 314)
    public class180(int arg0, int arg1, int arg2) {
        this.field2793 = arg0;
        this.field2799 = new int[this.field2793][arg2];
        this.field2791 = arg1;
        this.field2798 = new class358[this.field2791];
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[I", line = 174)
    public final int[] method1258(int arg0, int arg1) {
        field2795++;
        if (arg1 != 0) {
            field2806 = (byte[][][]) ((byte[][][]) null);
        }
        if (this.field2793 == this.field2791) {
            this.field2808 = this.field2798[arg0] == null;
            this.field2798[arg0] = class223.field3448;
            return this.field2799[arg0];
        } else if (this.field2793 == 1) {
            this.field2808 = this.field2807 != arg0;
            this.field2807 = arg0;
            return this.field2799[0];
        } else {
            class358 var3 = this.field2798[arg0];
            if (var3 == null) {
                this.field2808 = true;
                if (this.field2794 < this.field2793) {
                    var3 = new class358(arg0, this.field2794);
                    this.field2794++;
                } else {
                    class358 var4 = (class358) this.field2796.method1086(27627);
                    var3 = new class358(arg0, var4.field5672);
                    this.field2798[var4.field5673] = null;
                    var4.method1131(arg1 ^ 0x8);
                }
                this.field2798[arg0] = var3;
            } else {
                this.field2808 = false;
            }
            this.field2796.method1078(var3, (byte) 115);
            return this.field2799[var3.field5672];
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)[[I", line = 243)
    public final int[][] method1259(int arg0) {
        int var2 = 25 / ((-arg0 - 13) / 39);
        field2805++;
        if (this.field2793 != this.field2791) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field2793; var3++) {
            this.field2798[var3] = class223.field3448;
        }
        return this.field2799;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V", line = 263)
    public static final void method1260(int arg0, byte arg1) {
        if (arg1 != 24) {
            field2801 = (class221) null;
        }
        class181.field2820.method645(arg0, (byte) -45);
        field2797++;
        class195.field2988.method645(arg0, (byte) -61);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 277)
    public final void method1261(int arg0) {
        for (int var2 = 0; var2 < this.field2793; var2++) {
            this.field2799[var2] = null;
        }
        int var3 = -49 % ((arg0 - 42) / 44);
        this.field2799 = (int[][]) null;
        field2804++;
        this.field2798 = null;
        this.field2796.method1082(64);
        this.field2796 = null;
    }
}
