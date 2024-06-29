import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class406 {

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Ltja;")
    private class288 field5339 = new class288(256);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Lpc;")
    private class700 field5337;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Ld;")
    private class162 field5340;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field5342 = 0;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field5343 = -1;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "[[B")
    public static byte[][] field5335;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)I", line = 8)
    public static final int method2434(int arg0, int arg1) {
        field5334++;
        int var2 = -33 / ((-arg1 - 59) / 39);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 18)
    public final void method2435(int arg0) {
        if (arg0 != 25410) {
            field5342 = 101;
        }
        this.field5339.method1694(5, -63);
        field5338++;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lpc;Ld;)V", line = 36)
    public class406(class700 arg0, class162 arg1) {
        this.field5337 = arg0;
        this.field5340 = arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)Lld;", line = 50)
    public final class182 method2436(byte arg0, int arg1) {
        field5336++;
        Object var3 = this.field5339.method1684((long) arg1, -359);
        if (var3 != null) {
            return (class182) var3;
        } else if (this.field5340.method1137(12429, arg1)) {
            class359 var4 = this.field5340.method1138(arg1, 83);
            if (arg0 > -116) {
                return null;
            }
            int var5 = var4.field4451 ? 64 : this.field5337.field9711;
            class182 var7;
            if (var4.field4465 && this.field5337.method54()) {
                float[] var6 = this.field5340.method1136(var5, arg1, var5, 0.7F, false, -116);
                var7 = new class182(this.field5337, 3553, 34842, var5, var5, var4.field4453 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4457 != 2 && class16.method203(var4.field4459, (byte) 55)) {
                    var8 = this.field5340.method1135(arg1, 0.7F, true, var5, var5, (byte) -26);
                } else {
                    var8 = this.field5340.method1139(arg1, 11196, false, var5, var5, 0.7F);
                }
                var7 = new class182(this.field5337, 3553, 6408, var5, var5, var4.field4453 != 0, var8, 0, 0, false);
            }
            var7.method1221(var4.field4460, -1, var4.field4447);
            this.field5339.method1686(-25638, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 99)
    public final void method2437(int arg0) {
        field5341++;
        this.field5339.method1690(0);
        if (arg0 != -4466) {
            this.field5340 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 111)
    public static void method2438(int arg0) {
        if (arg0 == 0) {
            field5335 = null;
        }
    }
}
