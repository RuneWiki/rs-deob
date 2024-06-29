import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class414 extends class184 {

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "Ltk;")
    public static class230 field5893 = new class230();

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "[Ljv;")
    public static class56[] field5899 = new class56[30];

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "F")
    public static float field5898;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method6(int arg0, int arg1) {
        ++field5892;
        int[] var3 = super.field2409.method248(arg0, arg1 + 16776382);
        if (arg1 != 578) {
            return null;
        } else {
            if (super.field2409.field436) {
                for (int var4 = 0; ~class245.field3167 < ~var4; ++var4) {
                    this.method2446(121, var4, arg0);
                    int[] var5 = this.method1159(110, class429.field6082, 0);
                    var3[var4] = var5[class466.field6717];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILfh;)V", line = 40)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 114 % ((-13 - arg0) / 51);
        ++field5890;
        if (arg1 == 0) {
            super.field2406 = arg2.method2737(false) == 1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 52)
    public static void method2445(int arg0) {
        field5893 = null;
        field5899 = null;
        if (arg0 != 1) {
            method2447((class463) null, -36);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)[[I", line = 65)
    public final int[][] method13(int arg0, int arg1) {
        if (arg1 != 1) {
            field5898 = -1.0938809F;
        }
        ++field5895;
        int[][] var3 = super.field2416.method3031(arg1 + -28527, arg0);
        if (super.field2416.field7271) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class245.field3167 < ~var7; ++var7) {
                this.method2446(-1, var7, arg0);
                int[][] var8 = this.method1163(1, class429.field6082, 0);
                var4[var7] = var8[0][class466.field6717];
                var5[var7] = var8[1][class466.field6717];
                var6[var7] = var8[2][class466.field6717];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(III)V", line = 113)
    private final void method2446(int arg0, int arg1, int arg2) {
        ++field5891;
        int var4 = -5 % ((54 - arg0) / 42);
        int var5 = class347.field4461[arg1];
        int var6 = class334.field4218[arg2];
        float var7 = (float) Math.atan2((double) (var5 + -2048), (double) (var6 + -2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class429.field6082 = arg2;
            class466.field6717 = arg1;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class466.field6717 = arg2;
            class429.field6082 = arg1;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class466.field6717 = -arg2 + class245.field3167;
            class429.field6082 = arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class429.field6082 = -arg2 + class79.field1026;
            class466.field6717 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class429.field6082 = -arg2 + class79.field1026;
            class466.field6717 = -arg1 + class245.field3167;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class466.field6717 = class245.field3167 - arg2;
            class429.field6082 = -arg1 + class79.field1026;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class466.field6717 = arg2;
            class429.field6082 = -arg1 + class79.field1026;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class429.field6082 = arg2;
            class466.field6717 = -arg1 + class245.field3167;
        }
        class466.field6717 &= class421.field5961;
        class429.field6082 &= class501.field7240;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lfh;I)V", line = 186)
    public static final void method2447(class463 arg0, int arg1) {
        ++field5894;
        for (int var2 = 0; ~var2 > ~class289.field3685; ++var2) {
            int var3 = arg0.method2763(-514944944);
            int var4 = arg0.method2758((byte) 91);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class66.field850[var3] != null) {
                class66.field850[var3].field2700 = var4;
            }
        }
        if (arg1 < 6) {
            field5893 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 215)
    public class414() {
        super(1, false);
    }
}
