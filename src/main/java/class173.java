import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class173 extends class223 {

    @OriginalMember(owner = "client!en", name = "B", descriptor = "[I")
    private int[] field2874 = new int[this.field3718];

    @OriginalMember(owner = "client!en", name = "C", descriptor = "[I")
    public static int[] field2875 = new int[1000];

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field2887 = 10;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field2882 = 0;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2891 = "shake:";

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    private int field2880;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    private int field2890;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "Lpg;")
    public static class435 field2878;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "Lmo;")
    public static class447 field2883;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "[B")
    private byte[] field2876;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IJ)V")
    public static final void method1207(int arg0, long arg1) {
        if (class423.field6252 != null) {
            if (class13.field194 != 1 && class13.field194 != 5) {
                if (~class13.field194 == -5) {
                    class57.method378(true, arg1);
                }
            } else {
                class422.method2623((byte) 124, arg1);
            }
        }
        ++field2889;
        class183.method1254(class284.field4547, (long) class183.field2987, true);
        if (arg0 != 5) {
            method1207(68, -42L);
        }
        if (~class306.field4847 != 0) {
            class11.method108(class306.field4847, (byte) -87);
        }
        for (int var3 = 0; class125.field1929 > var3; ++var3) {
            if (class267.field4296[var3]) {
                class239.field3976[var3] = true;
            }
            class27.field310[var3] = class267.field4296[var3];
            class267.field4296[var3] = false;
        }
        class291.field4642 = class183.field2987;
        if (class284.field4547.method711()) {
            class281.field4511 = true;
        }
        class369.field5614 = null;
        if (~class306.field4847 != 0) {
            class125.field1929 = 0;
            class41.method274((byte) 6);
        }
        class284.field4547.method609();
        class104.method791(class284.field4547, (byte) 124);
        int var4 = class417.method2607(-128);
        if (var4 == -1) {
            var4 = class216.field3506;
        }
        class67.method425(arg0 + -1, var4);
        class31.method213(96, class261.field4201.field724, class266.field4286, class62.field807, class261.field4201.field722);
        class62.field807 = 0;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        if (class232.field3877 == null || class183.field2986 == null) {
            class232.field3877 = new int[256];
            class183.field2986 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class232.field3877[var1] = (int) (4096.0D * Math.sin(var2));
                class183.field2986[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        if (arg0 == 4096) {
            ++field2884;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V")
    public void method159(int arg0, byte arg1) {
        this.field2876[this.field2890++] = (byte) ((class37.method242(255, arg1) >> 1) + 127);
        ++field2881;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public final void method1209(int arg0) {
        this.field2880 = 0;
        if (arg0 <= 18) {
            this.field2876 = null;
        }
        this.field2890 = 0;
        ++field2873;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public final void method1210(boolean arg0) {
        ++field2885;
        this.field2880 = Math.abs(this.field2880);
        if (this.field2880 >= 4096) {
            this.field2880 = 4095;
        }
        this.method159(this.field2890++, (byte) (this.field2880 >> 4));
        this.field2880 = 0;
        if (!arg0) {
            this.method1209(1);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIF)V")
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field3718; ++var7) {
            this.field2874[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI)I")
    public static final int method1211(int arg0, boolean arg1, int arg2) {
        ++field2877;
        if (arg0 != 4 && ~arg0 != -6) {
            if (!arg1) {
                method1208(122);
            }
            return 256;
        } else {
            return class367.field5553[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)V")
    public final void method1212(int arg0, int arg1, byte arg2) {
        this.field2880 += this.field2874[arg0] * arg1 >> 12;
        ++field2888;
        int var4 = 43 % ((-51 - arg2) / 51);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        field2875 = null;
        if (!arg0) {
            field2883 = null;
            field2891 = null;
            field2878 = null;
        }
    }
}
