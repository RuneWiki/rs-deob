import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class14 {

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public int field172 = 128;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public int field163 = 128;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "F")
    public static float field170;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLvi;)[I", line = 7)
    public static final int[] method168(byte arg0, class302 arg1) {
        field173++;
        class431 var2 = new class431(518);
        int[] var3 = new int[4];
        int var4 = 69 % ((arg0 - 43) / 58);
        for (int var5 = 0; var5 < 4; var5++) {
            var3[var5] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method2524(false, 10);
        var2.method2548(var3[0], (byte) -105);
        var2.method2548(var3[1], (byte) -101);
        var2.method2548(var3[2], (byte) -112);
        var2.method2548(var3[3], (byte) -117);
        for (int var6 = 0; var6 < 10; var6++) {
            var2.method2548((int) (Math.random() * 9.9999999E7D), (byte) -117);
        }
        var2.method2546(true, (int) (Math.random() * 9.9999999E7D));
        var2.method2554(class97.field1382, false, class144.field2333);
        arg1.field4341.method2514(var2.field6002, var2.field5983, (byte) -125, 0);
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Luw;", line = 45)
    public final class14 method169(int arg0) {
        field165++;
        if (arg0 < 102) {
            field170 = 1.6978937F;
        }
        return new class14(this.field164, this.field172, this.field163, this.field166, this.field169, this.field168);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)V", line = 56)
    public static final void method170(int arg0, byte arg1) {
        if (arg1 == -110) {
            class438.field6084 = arg0;
            field175++;
            class580.field8354.method2881((byte) -63);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Luw;B)V", line = 73)
    public final void method171(class14 arg0, byte arg1) {
        this.field164 = arg0.field164;
        if (arg1 != -48) {
            this.method169(51);
        }
        this.field169 = arg0.field169;
        this.field166 = arg0.field166;
        this.field168 = arg0.field168;
        this.field172 = arg0.field172;
        this.field163 = arg0.field163;
        field171++;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(I)V", line = 99)
    public class14(int arg0) {
        this.field164 = arg0;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIII)V", line = 106)
    private class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field166 = arg3;
        this.field163 = arg2;
        this.field168 = arg5;
        this.field164 = arg0;
        this.field169 = arg4;
        this.field172 = arg1;
    }
}
