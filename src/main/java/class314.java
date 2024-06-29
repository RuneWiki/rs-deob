import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class314 extends class287 {

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field4247 = -50;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
    public static int[] field4252 = new int[2];

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lkc;")
    public static class157 field4251 = new class157("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[I")
    public static int[] field4260 = new int[5];

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "J")
    public static long field4256;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljava/lang/String;")
    public String field4244;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static final void method1805(int arg0) {
        ++field4245;
        for (class65 var1 = (class65) class463.field6690.method3137(arg0); var1 != null; var1 = (class65) class463.field6690.method3132(0)) {
            if (~var1.field940 != 0) {
                var1.method2791((byte) 112);
            } else {
                var1.field937 = 0;
                if (var1.field931 >= 0 && ~var1.field929 <= -1 && class9.field111 > var1.field931 && class192.field2809 > var1.field929) {
                    class288.method1651((byte) 37, var1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I")
    public final int method1806(int arg0) {
        ++field4254;
        return arg0 != 0 ? 100 : (int) super.field6883;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)J")
    public final long method1807(int arg0) {
        if (arg0 != 2) {
            return -81L;
        } else {
            ++field4250;
            return Long.MAX_VALUE & super.field3883;
        }
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V")
    public final void method1808(int arg0) {
        ++field4249;
        super.field3883 |= Long.MIN_VALUE;
        if (arg0 == -7412) {
            if (~this.method1807(2) == -1L) {
                class50.field725.method3150(16711680, this);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)I")
    public final int method1809(int arg0) {
        if (arg0 != -5532) {
            this.method1807(91);
        }
        ++field4255;
        return (int) (super.field6883 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1810(int arg0, byte arg1, int arg2) {
        if (arg1 != -78) {
            method1812((byte) -54);
        }
        ++field4258;
        if (!(class463.method2689((byte) -120, arg2, arg0) | ~(arg0 & 65536) != -1) && !class24.method145(arg2, arg0, (byte) -31)) {
            return (arg2 & 55) == 0 && class391.method2317(true, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public final void method1811(byte arg0) {
        ++field4248;
        if (arg0 != 86) {
            this.method1809(-89);
        }
        super.field3883 = class254.method1522((byte) -51) + 500L | super.field3883 & Long.MIN_VALUE;
        class248.field3367.method3150(16711680, this);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        if (arg0 == 54) {
            field4260 = null;
            field4252 = null;
            field4251 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
    public class314(int arg0, int arg1) {
        super.field6883 = (long) arg1 | (long) arg0 << 32;
    }
}
