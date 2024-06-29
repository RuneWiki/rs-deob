import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class252 extends class278 {

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "[I")
    private final int[] field4382 = new int[this.field4799];

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "Lcd;")
    public static class64 field4386 = class44.method335((byte) 71, " )2> ");

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field4383 = -1;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "Lcd;")
    private static class64 field4397 = class44.method335((byte) 71, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lcd;")
    public static class64 field4393 = class44.method335((byte) 71, ")4l=");

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lcd;")
    public static class64 field4387 = class44.method335((byte) 71, "(U4");

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "Lcd;")
    public static class64 field4390 = field4397;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "[B")
    private byte[] field4385;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class252(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4799; var7++) {
            this.field4382[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 34)
    public final void method348(int arg0, int arg1, int arg2) {
        int var4 = 88 / ((arg0 - 71) / 41);
        this.field4389 += this.field4382[arg2] * arg1 >> 12;
        field4392++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)V", line = 43)
    public void method1805(int arg0, byte arg1) {
        this.field4385[this.field4388++] = (byte) ((class224.method1614(arg1, 255) >> 1) + 127);
        field4391++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[B", line = 52)
    public static final byte[] method1806(int arg0, int arg1) {
        class218 var2 = (class218) class19.field360.method329((long) arg0, (byte) -63);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class206.method1439(var4, (byte) 124, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class218(var3);
            class19.field360.method331((long) arg0, var2, (byte) -118);
        }
        if (arg1 != 255) {
            field4386 = (class64) null;
        }
        field4384++;
        return var2.field3695;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 106)
    public final void method342(byte arg0) {
        field4396++;
        this.field4389 = Math.abs(this.field4389);
        if (this.field4389 >= 4096) {
            this.field4389 = 4095;
        }
        this.method1805(this.field4388++, (byte) (this.field4389 >> 4));
        if (arg0 == 55) {
            this.field4389 = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 125)
    public final void method344(byte arg0) {
        this.field4389 = 0;
        if (arg0 >= -83) {
            method1806(-11, -117);
        }
        field4394++;
        this.field4388 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V", line = 147)
    public static final void method1807(int arg0, int arg1) {
        field4395++;
        class292 var2 = class163.field2873;
        synchronized (class163.field2873) {
            if (arg0 != -12965) {
                method1806(-127, -120);
            }
            class245.field4260 = arg1;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 164)
    public static void method1808(boolean arg0) {
        if (arg0) {
            field4383 = -55;
        }
        field4390 = null;
        field4397 = null;
        field4393 = null;
        field4386 = null;
        field4387 = null;
    }
}
