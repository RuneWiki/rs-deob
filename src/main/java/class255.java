import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class255 extends class222 {

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "F")
    public static float field3307 = 1024.0F;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "[Lufa;")
    public static class680[] field3305;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V", line = 7)
    public final void method1268(int arg0, int arg1, int arg2) {
        ++field3301;
        int var4 = 41 / ((arg0 - -3) / 32);
        int var5 = this.field3304 * arg1 >> 12;
        int var6 = this.field3302 * arg1 >> 12;
        int var7 = this.field3303 * arg2 >> 12;
        int var8 = this.field3309 * arg2 >> 12;
        class513.method2840(var7, var5, var6, 16977, var8, super.field2872);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 30)
    public final void method1264(int arg0, int arg1, int arg2) {
        ++field3299;
        int var4 = this.field3304 * arg0 >> 12;
        int var5 = this.field3302 * arg0 >> 12;
        if (arg2 == -5515) {
            int var6 = this.field3303 * arg1 >> 12;
            int var7 = this.field3309 * arg1 >> 12;
            class416.method2395(var5, super.field2871, var7, var6, super.field2868, var4, super.field2872, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(FI)F", line = 50)
    public static final float method1516(float arg0, int arg1) {
        ++field3306;
        if (arg1 != 1024) {
            method1518(-15, -6);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V", line = 62)
    public static void method1517(byte arg0) {
        field3305 = null;
        if (arg0 != -1) {
            method1518(-110, 15);
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V", line = 72)
    public class255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3304 = arg0;
        this.field3309 = arg3;
        this.field3302 = arg2;
        this.field3303 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V", line = 83)
    public final void method1269(byte arg0, int arg1, int arg2) {
        ++field3308;
        int var4 = -102 / ((50 - arg0) / 38);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 92)
    public static final void method1518(int arg0, int arg1) {
        class251.field3238 = arg1;
        ++field3300;
        int var2 = 127 % ((69 - arg0) / 49);
        class572.field8051 = -1;
        class41.field420 = 3;
        class354.field4718 = 100;
    }
}
