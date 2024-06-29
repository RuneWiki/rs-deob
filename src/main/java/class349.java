import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class349 extends class438 implements class688 {

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "Lds;")
    private class73 field4264;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Luw;")
    public static class208 field4268 = new class208(95, -1);

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "[I")
    public static int[] field4272 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field4271 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4274 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "F")
    public static float field4273;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
    public final int method287(int arg0) {
        if (arg0 != 128) {
            return -19;
        } else {
            ++field4265;
            return super.method287(128);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljc;Lds;Z)V")
    public class349(class179 arg0, class73 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4264 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2014(boolean arg0, boolean arg1) {
        ++field4269;
        if (!arg1) {
            this.method284((byte) -27);
        }
        return super.method2510(arg0, 67, super.field5752.field2437);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lds;")
    public final class73 method2015(int arg0) {
        ++field4263;
        if (arg0 != 18603) {
            field4273 = -0.8751058F;
        }
        return this.field4264;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public final void method2016(int arg0, int arg1) {
        super.method2016(this.field4264.field987 * arg0, -62);
        int var3 = -50 / ((24 - arg1) / 59);
        ++field4266;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Z")
    public final boolean method2017(int arg0) {
        if (arg0 != 28359) {
            return false;
        } else {
            ++field4270;
            return super.method2504(super.field5752.field2437, -1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public static void method2018(int arg0) {
        field4272 = null;
        field4268 = null;
        field4274 = null;
        if (arg0 > -117) {
            field4272 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V")
    public static final void method2019(int arg0) {
        ++field4267;
        if (class651.field8307 == null) {
            class100 var1 = new class100();
            byte[] var2 = var1.method577(16, 128, 23483, 128);
            class651.field8307 = class287.method1743(99999999, false, var2);
        }
        if (class464.field6026 == null) {
            class636 var3 = new class636();
            byte[] var4 = var3.method3431(128, 112, 16, 128);
            class464.field6026 = class287.method1743(99999999, false, var4);
        }
        int var5 = -82 / ((68 - arg0) / 50);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final void method284(byte arg0) {
        super.method284((byte) 55);
        ++field4262;
        if (arg0 < 33) {
            field4272 = null;
        }
    }
}
