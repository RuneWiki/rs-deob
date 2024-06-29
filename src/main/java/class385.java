import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class385 extends class134 {

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "Lfc;")
    public static class262 field5412 = new class262(50);

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "[F")
    public static float[] field5413 = new float[16384];

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "[F")
    public static float[] field5415 = new float[16384];

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "[I")
    public static int[] field5414;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field5413[var2] = (float) Math.sin((double) var2 * var0);
            field5415[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V", line = 4)
    public final void method60(byte arg0) {
        if (super.field1712.field5503.method744(true) && !class555.method3148(false, super.field1712.field5503.method741((byte) 124))) {
            super.field1708 = 0;
        }
        ++field5410;
        if (~super.field1708 > -1 || super.field1708 > 1) {
            super.field1708 = this.method58(0);
        }
        if (arg0 <= 118) {
            field5412 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V", line = 21)
    public final void method55(int arg0, int arg1) {
        ++field5416;
        super.field1708 = arg1;
        int var3 = 60 / ((arg0 - -26) / 41);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I", line = 31)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            this.method57(-22, 33);
        }
        ++field5417;
        return 0;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(ILkda;)V", line = 45)
    public class385(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)I", line = 48)
    public final int method57(int arg0, int arg1) {
        ++field5408;
        if (!class555.method3148(false, super.field1712.field5503.method741((byte) 125))) {
            return 3;
        } else {
            if (arg1 != 29053) {
                field5414 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lkda;)V", line = 64)
    public class385(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V", line = 67)
    public static void method2256(boolean arg0) {
        field5414 = null;
        if (!arg0) {
            method2256(true);
        }
        field5413 = null;
        field5415 = null;
        field5412 = null;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I", line = 88)
    public final int method2257(byte arg0) {
        if (arg0 <= 119) {
            return -44;
        } else {
            ++field5409;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)Z", line = 120)
    public final boolean method2258(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field5411;
            return class555.method3148(false, super.field1712.field5503.method741((byte) 124));
        }
    }
}
