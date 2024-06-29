import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class243 extends class214 {

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Llm;")
    public static class84 field3440 = new class84("", 11);

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Z")
    public static boolean field3446 = false;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Lfn;")
    public static class52 field3444 = new class52(72, -2);

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lfc;")
    public static class343 field3445;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field3443;
        if (arg1 != 92) {
            field3446 = false;
        }
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class399.field5585; ++var7) {
                var4[var7] = this.field3433;
                var5[var7] = this.field3439;
                var6[var7] = this.field3434;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lms;Z)Ljava/lang/String;")
    public static final String method1518(class363 arg0, boolean arg1) {
        ++field3441;
        if (client.method2321(arg0).method474((byte) -32) == 0) {
            return null;
        } else if (arg0.field5177 != null && ~arg0.field5177.trim().length() != -1) {
            if (arg1) {
                method1520('V', (byte) 41);
            }
            return arg0.field5177;
        } else {
            return class443.field6112 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBII)V")
    public static final void method1519(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg2 << 3;
        int var6 = arg0 << 3;
        ++field3436;
        class418.field5750 = (float) var5;
        if (~class375.field5312 == -3) {
            class259.field3618 = var4;
            class160.field2306 = var6;
            class200.field2873 = var5;
        }
        class356.field4959 = (float) var6;
        if (arg1 != -125) {
            field3445 = null;
        }
        class84.method580((byte) 123);
        class343.field4704 = true;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    private class243(int arg0) {
        super(0, false);
        this.method1521(92, arg0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(CB)Z")
    public static final boolean method1520(char arg0, byte arg1) {
        ++field3435;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class54.method420(arg1 ^ 12, arg0)) {
            return true;
        } else {
            if (arg1 != 47) {
                field3446 = true;
            }
            char[] var2 = class238.field3362;
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class102.field1458;
            for (int var5 = 0; var4.length > var5; ++var5) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 >= -114) {
            method1520('\u000f', (byte) 4);
        }
        ++field3437;
        if (arg2 == 0) {
            this.method1521(94, arg0.method2498(3));
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    private final void method1521(int arg0, int arg1) {
        this.field3433 = (16711680 & arg1) >> 12;
        ++field3438;
        int var3 = 111 / ((arg0 - -20) / 36);
        this.field3434 = (255 & arg1) << 4;
        this.field3439 = 4080 & arg1 >> 4;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class243() {
        this(0);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method1522(int arg0) {
        if (arg0 != 10123) {
            method1522(11);
        }
        field3445 = null;
        field3440 = null;
        field3444 = null;
    }
}
