import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lbm;")
    private class130 field704 = new class130();

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lcc;")
    private class237 field710 = new class237();

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Ldh;")
    private class159 field712;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lcd;")
    public static class64 field695 = class44.method335((byte) 71, "::replacecanvas");

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static volatile int field698 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[I")
    public static int[] field699 = new int[32];

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lcd;")
    public static class64 field708 = null;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Z")
    public static boolean field696 = false;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lmf;")
    public static class43 field706 = new class43(128);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lub;")
    public static class20 field703;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JB)Lbm;", line = 16)
    public final class130 method329(long arg0, byte arg1) {
        if (arg1 != -63) {
            return (class130) null;
        }
        field705++;
        class130 var4 = (class130) this.field712.method1151(arg0, 0);
        if (var4 != null) {
            this.field710.method1694(var4, arg1 ^ 0xFFFFFFC1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 51)
    public static void method330(boolean arg0) {
        if (!arg0) {
            return;
        }
        field703 = null;
        field708 = null;
        field706 = null;
        field695 = null;
        field699 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JLbm;B)V", line = 77)
    public final void method331(long arg0, class130 arg1, byte arg2) {
        field697++;
        if (this.field713 == 0) {
            class130 var5 = this.field710.method1697(69);
            var5.method232(128);
            var5.method938(0);
            if (this.field704 == var5) {
                class130 var6 = this.field710.method1697(76);
                var6.method232(128);
                var6.method938(0);
            }
        } else {
            this.field713--;
        }
        this.field712.method1149(arg1, arg0, -60);
        int var7 = -92 / ((arg2 + 1) / 55);
        this.field710.method1694(arg1, 0);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Lna;", line = 108)
    public final class25 method332(boolean arg0) {
        if (arg0) {
            field708 = (class64) null;
        }
        field701++;
        return this.field712.method1147((byte) 18);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lna;", line = 128)
    public final class25 method333(byte arg0) {
        field707++;
        if (arg0 != 54) {
            this.method329(-58L, (byte) -106);
        }
        return this.field712.method1143(arg0 - 54);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)V", line = 140)
    public final void method334(boolean arg0) {
        if (arg0) {
            this.method332(false);
        }
        this.field710.method1696(26846);
        field702++;
        this.field712.method1142(27467);
        this.field704 = new class130();
        this.field713 = this.field711;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V", line = 181)
    public class43(int arg0) {
        this.field713 = arg0;
        this.field711 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field712 = new class159(var2);
    }
}
