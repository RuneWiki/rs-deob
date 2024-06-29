import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class14 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    private int field198 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    private int field200 = -1;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lpj;")
    private class284 field201 = new class284();

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Z")
    public boolean field211 = false;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[[[I")
    private int[][][] field204;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lla;")
    private class167[] field206;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/lang/String;")
    public static String field203 = "Loading...";

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
    public static boolean field207 = true;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lji;")
    public static class256 field205;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
    public final int[][] method91(int arg0, int arg1) {
        field212++;
        int var3 = -4 / ((arg0 + 38) / 59);
        if (this.field208 == this.field195) {
            this.field211 = this.field206[arg1] == null;
            this.field206[arg1] = class175.field2560;
            return this.field204[arg1];
        } else if (this.field195 == 1) {
            this.field211 = this.field200 != arg1;
            this.field200 = arg1;
            return this.field204[0];
        } else {
            class167 var4 = this.field206[arg1];
            if (var4 == null) {
                this.field211 = true;
                if (this.field198 < this.field195) {
                    var4 = new class167(arg1, this.field198);
                    this.field198++;
                } else {
                    class167 var5 = (class167) this.field201.method1890(-10963);
                    var4 = new class167(arg1, var5.field2462);
                    this.field206[var5.field2456] = null;
                    var5.method1193(119);
                }
                this.field206[arg1] = var4;
            } else {
                this.field211 = false;
            }
            this.field201.method1882((byte) 58, var4);
            return this.field204[var4.field2462];
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public final void method92(int arg0) {
        field202++;
        for (int var2 = 0; var2 < this.field195; var2++) {
            this.field204[var2][0] = null;
            this.field204[var2][1] = null;
            this.field204[var2][2] = null;
            this.field204[var2] = null;
        }
        int var3 = -66 / ((64 - arg0) / 44);
        this.field206 = null;
        this.field204 = null;
        this.field201.method1891(43);
        this.field201 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method93(int arg0) {
        field199++;
        if (this.field208 != this.field195) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field195; var2++) {
            this.field206[var2] = class175.field2560;
        }
        return this.field204;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
    public static final boolean method94(boolean arg0) {
        field210++;
        if (!arg0) {
            method94(false);
        }
        if (class150.field2183) {
            try {
                if ((Boolean) class238.method1634("showingVideoAd", (byte) -96, class217.field3338.field505)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method95(int arg0) {
        field205 = null;
        field203 = null;
        if (arg0 != 0) {
            method94(true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field196++;
        class184 var10 = null;
        for (class184 var11 = (class184) class269.field4183.method1894((byte) -90); var11 != null; var11 = (class184) class269.field4183.method1886(-49)) {
            if (var11.field2671 == arg2 && var11.field2674 == arg3 && var11.field2669 == arg0 && var11.field2681 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class184();
            var10.field2671 = arg2;
            var10.field2669 = arg0;
            var10.field2681 = arg6;
            var10.field2674 = arg3;
            class27.method195((byte) 13, var10);
            class269.field4183.method1881(var10, (byte) -56);
        }
        var10.field2673 = arg8;
        var10.field2680 = arg9;
        var10.field2666 = arg1;
        var10.field2670 = arg4;
        var10.field2682 = arg5;
        if (arg7 != 0) {
            field209 = -102;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
    public class14(int arg0, int arg1, int arg2) {
        this.field195 = arg0;
        this.field208 = arg1;
        this.field204 = new int[this.field195][3][arg2];
        this.field206 = new class167[this.field208];
    }
}
