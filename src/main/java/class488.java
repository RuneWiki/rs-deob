import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class488 extends class472 {

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    private int field6869;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    private int field6877;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    private int field6870;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    private int field6884;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    private int field6873;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    private int field6875;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "[S")
    public static short[] field6876 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "S")
    public static short field6874 = 32767;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method2858(int arg0) {
        if (arg0 == 8741) {
            field6876 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)V")
    public final void method15(int arg0, byte arg1, int arg2) {
        ++field6878;
        if (arg1 >= -35) {
            this.field6870 = -37;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6869 = arg7;
        this.field6881 = arg0;
        this.field6883 = arg5;
        this.field6877 = arg3;
        this.field6870 = arg6;
        this.field6884 = arg1;
        this.field6873 = arg2;
        this.field6875 = arg4;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        ++field6872;
        if (arg2 != -6196) {
            method2858(75);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZII)V")
    public final void method16(boolean arg0, int arg1, int arg2) {
        ++field6868;
        int var4 = this.field6881 * arg1 >> 12;
        int var5 = this.field6884 * arg2 >> 12;
        int var6 = this.field6873 * arg1 >> 12;
        int var7 = this.field6877 * arg2 >> 12;
        int var8 = this.field6875 * arg1 >> 12;
        if (!arg0) {
            this.field6883 = -88;
        }
        int var9 = this.field6883 * arg2 >> 12;
        int var10 = this.field6870 * arg1 >> 12;
        int var11 = this.field6869 * arg2 >> 12;
        class103.method581(3, var6, var8, var11, var10, super.field6640, var7, var4, var9, var5);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z")
    public static final boolean method2859(int arg0, int arg1) {
        ++field6871;
        class42 var2 = class76.method442(arg0, 0);
        if (var2 == null) {
            return false;
        } else if (~class430.field6023 != -4) {
            class262.field3840 = var2.field617;
            class185.field2746 = var2.field620;
            if (class394.field5599 != class356.field5143) {
                class2.field24 = class185.field2746 + 40000;
                class202.field2979 = 50000 - -class185.field2746;
                class89.field1102 = class2.field24;
            }
            return true;
        } else {
            String var3 = "";
            if (class394.field5599 != class356.field5143) {
                var3 = ":" + (var2.field620 + 7000);
            }
            String var4 = "";
            if (arg1 != 32767) {
                field6874 = 75;
            }
            if (class347.field5028 != null) {
                var4 = "/p=" + class347.field5028;
            }
            String var5 = "http://" + var2.field617 + var3 + "/l=" + class326.field4711 + "/a=" + class36.field466 + var4 + "/j" + (!class370.field5341 ? "0" : "1") + ",o" + (!class144.field1910 ? "0" : "1") + ",a2";
            try {
                class76.field936.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V")
    public static final void method2860(int arg0, int arg1, int arg2) {
        if (class356.field5147 != arg0) {
            class216.field3245 = new int[arg0];
            for (int var3 = 0; var3 < arg0; ++var3) {
                class216.field3245[var3] = (var3 << 12) / arg0;
            }
            class356.field5147 = arg0;
            class414.field5822 = arg0 + -1;
            class476.field6685 = arg0 * 32;
        }
        ++field6882;
        if (class241.field3615 != arg2) {
            if (~class356.field5147 == ~arg2) {
                class237.field3559 = class216.field3245;
            } else {
                class237.field3559 = new int[arg2];
                for (int var4 = 0; ~var4 > ~arg2; ++var4) {
                    class237.field3559[var4] = (var4 << 12) / arg2;
                }
            }
            class241.field3615 = arg2;
            class388.field5511 = arg2 + -1;
        }
        if (arg1 != -1) {
            field6874 = 110;
        }
    }
}
