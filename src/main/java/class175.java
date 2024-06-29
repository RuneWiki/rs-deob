import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class175 {

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "F")
    public float field2924;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "F")
    public float field2938;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "F")
    public float field2921;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[I")
    public static int[] field2922 = new int[100];

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
    public static int[] field2929 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lok;")
    public static class146 field2923 = class235.method1724(-12908, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field2937 = -1;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[Lan;")
    public static class315[] field2926;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 5)
    public static void method1346(int arg0) {
        if (arg0 != -60) {
            method1348((class15) null, 127, (byte) -49);
        }
        field2929 = null;
        field2926 = null;
        field2923 = null;
        field2922 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2930++;
        class158 var5 = class206.method1564(arg1, 8, -112);
        var5.method1236(-13730);
        if (arg4 > 90) {
            var5.field2663 = arg3;
            var5.field2662 = arg2;
            var5.field2672 = arg0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Loh;IB)Lrg;", line = 61)
    public static final class92 method1348(class15 arg0, int arg1, byte arg2) {
        field2935++;
        byte[] var3 = arg0.method119(0, arg1);
        int var4 = -7 / ((-arg2 - 33) / 54);
        return var3 == null ? null : new class92(var3);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 95)
    public class175() {
        this.field2927 = -50;
        this.field2924 = 1.1523438F;
        this.field2928 = class231.field3859;
        this.field2933 = 0;
        this.field2938 = 1.2F;
        this.field2925 = -60;
        this.field2921 = 0.69921875F;
        this.field2931 = class231.field3861;
        this.field2934 = -50;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lwe;)V", line = 110)
    public class175(class47 arg0) {
        int var2 = arg0.method368(85);
        if ((var2 & 0x1) == 0) {
            this.field2931 = class231.field3861;
        } else {
            this.field2931 = arg0.method373((byte) 36);
        }
        if ((var2 & 0x2) == 0) {
            this.field2924 = 1.1523438F;
        } else {
            this.field2924 = (float) arg0.method379(-2) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2921 = 0.69921875F;
        } else {
            this.field2921 = (float) arg0.method379(-2) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2938 = 1.2F;
        } else {
            this.field2938 = (float) arg0.method379(-2) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2927 = -50;
            this.field2925 = -60;
            this.field2934 = -50;
        } else {
            this.field2934 = arg0.method343(26167);
            this.field2925 = arg0.method343(26167);
            this.field2927 = arg0.method343(26167);
        }
        if ((var2 & 0x20) == 0) {
            this.field2928 = class231.field3859;
        } else {
            this.field2928 = arg0.method373((byte) 36);
        }
        if ((var2 & 0x40) == 0) {
            this.field2933 = 0;
        } else {
            this.field2933 = arg0.method379(-2);
        }
    }
}
