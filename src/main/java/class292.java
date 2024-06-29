import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class292 extends class487 {

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field4157 = 0;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Liv;")
    public static class64 field4152 = new class64(29, 6);

    @OriginalMember(owner = "client!q", name = "r", descriptor = "F")
    public static float field4158;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZLmq;)V")
    public static final void method1842(int arg0, boolean arg1, class350 arg2) {
        ++field4160;
        int var3 = ~arg2.field5371 != -1 ? arg2.field5371 : arg2.field5329;
        if (arg0 < 89) {
            method1843(-12);
        }
        int var4 = arg2.field5221 != 0 ? arg2.field5221 : arg2.field5269;
        class21.method177(arg1, var3, var4, arg2.field5322, class22.field438[arg2.field5322 >> 16], -16207);
        if (arg2.field5291 != null) {
            class21.method177(arg1, var3, var4, arg2.field5322, arg2.field5291, -16207);
        }
        class352 var5 = (class352) class162.field2507.method171((byte) -110, (long) arg2.field5322);
        if (var5 != null) {
            class116.method859(var4, var5.field5391, (byte) 127, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)V")
    public final void method519(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field4155 = 72;
        }
        ++field4159;
        int var4 = this.field4155 * arg1 >> 12;
        int var5 = this.field4154 * arg1 >> 12;
        int var6 = this.field4151 * arg0 >> 12;
        int var7 = this.field4156 * arg0 >> 12;
        class2.method11(var7, var4, -96, var6, var5, super.field7214);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIII)V")
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4155 = arg0;
        this.field4151 = arg1;
        this.field4154 = arg2;
        this.field4156 = arg3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1843(int arg0) {
        if (arg0 == 16777215) {
            field4152 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V")
    public final void method515(int arg0, byte arg1, int arg2) {
        ++field4161;
        if (arg1 != 12) {
            this.method516(-31, -36, 18);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        ++field4153;
        int var4 = this.field4155 * arg0 >> 12;
        if (arg2 > 41) {
            int var5 = this.field4154 * arg0 >> 12;
            int var6 = this.field4151 * arg1 >> 12;
            int var7 = this.field4156 * arg1 >> 12;
            class250.method1608(var7, var6, super.field7214, var4, var5, super.field7216, super.field7217, -243968799);
        }
    }
}
