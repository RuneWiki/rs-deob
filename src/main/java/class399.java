import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class399 extends class46 {

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    private int field5648;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    private int field5641;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    private int field5654;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field5643;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    private int field5653;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    private int field5650;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field5638;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    private int field5647;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Z")
    public static boolean field5649 = false;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5642 = 328;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5635 = 0;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field5645 = 0;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 3)
    public final void method300(int arg0, int arg1, int arg2) {
        int var4 = -23 / ((arg1 - -7) / 42);
        ++field5640;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V", line = 19)
    public final void method301(boolean arg0, int arg1, int arg2) {
        ++field5636;
        if (arg0) {
            this.method301(true, 114, -93);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 32)
    public class399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5648 = arg4;
        this.field5641 = arg5;
        this.field5654 = arg3;
        this.field5643 = arg7;
        this.field5653 = arg1;
        this.field5650 = arg0;
        this.field5638 = arg6;
        this.field5647 = arg2;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)Z", line = 47)
    public static final boolean method2493(int arg0, int arg1, int arg2) {
        ++field5646;
        if (arg1 != -129767092) {
            field5649 = true;
        }
        return (52 & arg2) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 60)
    public static final String method2494(int arg0, String arg1) {
        int var2 = -59 % ((arg0 - -16) / 40);
        ++field5652;
        String var3 = null;
        int var4 = arg1.indexOf("--> ");
        if (~var4 <= -1) {
            var3 = arg1.substring(0, var4 + 4);
            arg1 = arg1.substring(var4 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var5 = arg1.indexOf(" ", "directlogin ".length());
            if (~var5 <= -1) {
                int var6 = arg1.length();
                arg1 = arg1.substring(0, var5) + " ";
                for (int var7 = var5 - -1; var7 < var6; ++var7) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var3 != null ? var3 + arg1 : arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 116)
    public static final String method2495(boolean arg0) {
        ++field5637;
        String var1 = "www";
        if (class277.field3922 != class271.field3885) {
            if (class713.field9915 != class277.field3922) {
                if (class440.field6257 == class277.field3922) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
        } else {
            var1 = "www-wtrc";
        }
        String var2 = "";
        if (class614.field8594 != null) {
            var2 = "/p=" + class614.field8594;
        }
        return !arg0 ? null : "http://" + var1 + "." + class633.field8733.field4514 + ".com/l=" + class549.field7669 + "/a=" + class638.field8771 + var2 + "/";
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V", line = 149)
    public final void method303(int arg0, int arg1, int arg2) {
        ++field5651;
        int var4 = this.field5650 * arg2 >> 12;
        int var5 = this.field5653 * arg0 >> 12;
        int var6 = this.field5647 * arg2 >> 12;
        int var7 = this.field5654 * arg0 >> 12;
        int var8 = this.field5648 * arg2 >> 12;
        int var9 = this.field5641 * arg0 >> 12;
        int var10 = this.field5638 * arg2 >> 12;
        int var11 = this.field5643 * arg0 >> 12;
        if (arg1 != -12939) {
            method2495(false);
        }
        class707.method3968(var11, var8, var6, super.field545, -3, var9, var7, var5, var4, var10);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)V", line = 185)
    public static final void method2496(long arg0, int arg1) {
        if (arg1 == 52) {
            ++field5639;
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }
}
