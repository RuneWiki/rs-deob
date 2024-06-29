import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class200 implements Runnable {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
    public boolean field2789 = true;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field2787 = new Object();

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[I")
    public int[] field2792 = new int[500];

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public int field2791 = 0;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public int[] field2790 = new int[500];

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2781 = null;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2786 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Ld;")
    public static class244 field2784;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[[[I")
    public static int[][][] field2788;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z")
    public static final boolean method1273(int arg0, int arg1) {
        field2783++;
        if (class116.field1644 == arg0) {
            return false;
        }
        class279.field4324 = new int[104][arg1];
        class239.field3652 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class122.field1703[var2] = new class276(104, 104);
        }
        class116.field1644 = arg0;
        class86.field1176 = new byte[4][104][104];
        class230.field3489 = new byte[4][104][104];
        class297.field4690 = new class148[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILse;)V")
    public static final void method1274(int arg0, class211 arg1) {
        if (arg0 != 0) {
            field2784 = null;
        }
        field2782++;
        int var2 = arg1.field3062;
        if (var2 == 324) {
            if (class107.field1497 == -1) {
                class40.field604 = arg1.field3125;
                class107.field1497 = arg1.field3174;
            }
            if (class150.field2068.field2015) {
                arg1.field3174 = class107.field1497;
            } else {
                arg1.field3174 = class40.field604;
            }
        } else if (var2 == 325) {
            if (class107.field1497 == -1) {
                class40.field604 = arg1.field3125;
                class107.field1497 = arg1.field3174;
            }
            if (class150.field2068.field2015) {
                arg1.field3174 = class40.field604;
            } else {
                arg1.field3174 = class107.field1497;
            }
        } else if (var2 == 327) {
            arg1.field3040 = 150;
            arg1.field3041 = (int) (Math.sin((double) class52.field740 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3027 = 5;
            arg1.field3075 = -1;
        } else if (var2 == 328) {
            if (class217.field3280.field1217 == null) {
                arg1.field3075 = 0;
            } else {
                arg1.field3040 = 150;
                arg1.field3041 = (int) (Math.sin((double) class52.field740 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3027 = 5;
                arg1.field3075 = ((int) class73.method465((byte) -69, class217.field3280.field1217) << 11) + 2047;
                arg1.field3051 = 0;
                arg1.field3083 = class217.field3280.field4050;
                arg1.field3074 = class217.field3280.field4066;
                arg1.field3021 = class217.field3280.field4048;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2789) {
            Object var1 = this.field2787;
            synchronized (this.field2787) {
                if (this.field2791 < 500) {
                    this.field2790[this.field2791] = class12.field124;
                    this.field2792[this.field2791] = class287.field4543;
                    this.field2791++;
                }
            }
            class28.method182(50L, 123);
        }
        field2779++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field2781 = null;
        if (arg0 != 0) {
            field2788 = null;
        }
        field2784 = null;
        field2788 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lmi;I)V")
    public static final void method1276(class266 arg0, int arg1) {
        field2785++;
        int var2 = arg0.field4012 - class52.field740;
        int var3 = arg0.field4065 * 128 + arg0.method561(-1) * 64;
        int var4 = arg0.field4075 * 128 + arg0.method561(-1) * 64;
        arg0.field4019 += (var3 - arg0.field4019) / var2;
        arg0.field4021 = 0;
        if (arg0.field4072 == 0) {
            arg0.field4009 = 1024;
        }
        if (arg0.field4072 == 1) {
            arg0.field4009 = 1536;
        }
        arg0.field4085 += (var4 - arg0.field4085) / var2;
        if (arg0.field4072 == 2) {
            arg0.field4009 = 0;
        }
        if (~arg0.field4072 == arg1) {
            arg0.field4009 = 512;
        }
    }
}
