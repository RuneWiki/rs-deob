import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class280 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field4308 = -1;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field4310 = -1;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    public static int[] field4307 = new int[32];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[S")
    public static short[] field4317;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    public int[] field4306;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
    public static int[] field4316;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[[[Lql;")
    public static class87[][][] field4315;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4307[var1] = var0 - 1;
            var0 += var0;
        }
        field4317 = new short[256];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 11)
    public static void method1916(int arg0) {
        field4316 = null;
        field4315 = (class87[][][]) null;
        field4307 = null;
        field4317 = null;
        if (arg0 != 30141) {
            field4317 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Z", line = 28)
    public static final boolean method1917(byte arg0, int arg1) {
        field4314++;
        if (class43.field691 == arg1) {
            return false;
        }
        if (arg0 != -71) {
            field4317 = (short[]) null;
        }
        class240.field3833 = new int[104][104];
        class315.field4897 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class224.field3570[var2] = new class303(104, 104);
        }
        class294.field4555 = new byte[4][104][104];
        class92.field1468 = new byte[4][104][104];
        field4315 = new class87[4][104][104];
        if (class94.field1516) {
            class183.method1304(4, 104, 104);
            class6.method42(104, 104);
            class98.field1568 = new class51[13][13];
        }
        class43.field691 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 69)
    public static final void method1918(int arg0) {
        class11.field177 = null;
        if (arg0 >= -12) {
            method1916(-60);
        }
        field4313++;
        class334.method2327();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lkh;III)V", line = 81)
    private final void method1919(class166 arg0, int arg1, int arg2, int arg3) {
        field4312++;
        if (arg1 >= -104) {
            this.method1919((class166) null, 66, -37, 56);
        }
        if (arg2 == 1) {
            this.field4310 = arg0.method1151(-69);
        } else if (arg2 == 2) {
            this.field4306 = new int[arg0.method1178(0)];
            for (int var5 = 0; var5 < this.field4306.length; var5++) {
                this.field4306[var5] = arg0.method1151(-64);
            }
        } else if (arg2 == 3) {
            this.field4308 = arg0.method1178(0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILkh;I)V", line = 116)
    public final void method1920(int arg0, class166 arg1, int arg2) {
        if (arg0 <= 7) {
            return;
        }
        while (true) {
            int var4 = arg1.method1178(0);
            if (var4 == 0) {
                field4309++;
                return;
            }
            this.method1919(arg1, -118, var4, arg2);
        }
    }
}
