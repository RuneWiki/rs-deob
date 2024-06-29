import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class262 extends class300 {

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Z")
    public static boolean field4256 = false;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field4258 = 50;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "[I")
    public static int[] field4254 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "[I")
    public static int[] field4249 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "[I")
    public static int[] field4255 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "[Lkg;")
    public static class69[] field4257 = new class69[50];

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
    public static int[] field4260 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field4265 = new String[field4258];

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "[I")
    public static int[] field4263 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "[I")
    public static int[] field4261 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "[I")
    public static int[] field4262 = new int[field4258];

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Lnj;")
    public static class215 field4250;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
    public static void method1842(byte arg0) {
        field4260 = null;
        field4257 = null;
        if (arg0 == -53) {
            field4255 = null;
            field4265 = null;
            field4250 = null;
            field4254 = null;
            field4261 = null;
            field4263 = null;
            field4262 = null;
            field4249 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
    public class262(int arg0) {
        super(0, true);
        this.field4259 = 4096;
        this.field4259 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field4253;
        int[] var3 = super.field4797.method217(arg0, true);
        if (arg1 != -957953300) {
            field4263 = null;
        }
        if (super.field4797.field470) {
            class103.method695(var3, 0, class180.field2826, this.field4259);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4259 = (arg0.method1218(-34) << 12) / 255;
        }
        ++field4251;
        if (arg1 >= -43) {
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
    public static final void method1843(int arg0, int arg1) {
        class181 var2 = class95.method652(arg1, (byte) 34, arg0);
        ++field4264;
        var2.method1283(arg1 + 182);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class262() {
        this(4096);
    }
}
