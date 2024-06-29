import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class34 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lad;")
    private class5 field825 = new class5();

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lce;")
    private class18 field830 = new class18();

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Ldb;")
    private class21 field833;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lhb;")
    public static class44 field822 = class102.method810("Geben Sie Ihren Benutzernamen", -28606);

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lhb;")
    private static class44 field827 = class102.method810("Login attempts exceeded)3", -28606);

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
    public static int[] field835 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lhb;")
    private static class44 field841 = class102.method810("level)2", -28606);

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lhb;")
    public static class44 field836 = field827;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lhb;")
    public static class44 field829 = field841;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field843 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lee;")
    public static class30 field820;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lhc;")
    public static class45 field824;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lmc;")
    public static class75 field837;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 3)
    public static void method329(byte arg0) {
        field820 = null;
        field837 = null;
        field836 = null;
        field824 = null;
        field829 = null;
        field841 = null;
        field827 = null;
        field822 = null;
        field835 = null;
        if (arg0 != 12) {
            method329((byte) 124);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)Lad;", line = 30)
    public final class5 method330(long arg0, int arg1) {
        field826++;
        class5 var4 = (class5) this.field833.method154(arg1, arg0);
        if (arg1 != -1) {
            field843 = 6;
        }
        if (var4 != null) {
            this.field830.method125((byte) -113, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 57)
    public static final void method331(int arg0) {
        field838++;
        if (arg0 == -12190 && class86.field2202 == 2) {
            class31.method311((class94.field2384 - class104.field2666 << 7) + class14.field277, (-class120.field2936 + class43.field1009 << 7) + class53.field1311, class22.field455 * 2, arg0 ^ 0xFFFFD0C5);
            if (class31.field763 > -1 && class2.field73 % 20 < 10) {
                class22.field451[0].method428(class31.field763 - 12, class90.field2300 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lad;IJ)V", line = 80)
    public final void method332(class5 arg0, int arg1, long arg2) {
        field823++;
        if (this.field842 == arg1) {
            class5 var5 = this.field830.method126(-47);
            var5.method948(-120);
            var5.method39(1);
            if (this.field825 == var5) {
                class5 var6 = this.field830.method126(-14);
                var6.method948(arg1 ^ 0x74);
                var6.method39(arg1 + 1);
            }
        } else {
            this.field842--;
        }
        this.field833.method158(arg2, arg0, arg1 - 22711);
        this.field830.method125((byte) -107, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V", line = 116)
    public final void method333(int arg0, long arg1) {
        if (arg0 != 1280) {
            field835 = null;
        }
        field832++;
        class5 var4 = (class5) this.field833.method154(-1, arg1);
        if (var4 != null) {
            var4.method948(-118);
            var4.method39(1);
            this.field842++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 136)
    public static final void method334(int arg0) {
        field828++;
        try {
            if (arg0 != 1024) {
                method329((byte) 52);
            }
            Graphics var1 = class22.field483.getGraphics();
            class105.field2669.method143(4, var1, arg0 - 11190, 4);
        } catch (Exception var2) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V", line = 248)
    public class34(int arg0) {
        this.field842 = arg0;
        this.field831 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field833 = new class21(var2);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 179)
    public final void method335(byte arg0) {
        field839++;
        while (true) {
            class5 var2 = this.field830.method126(-67);
            if (var2 == null) {
                int var3 = 111 % ((arg0 + 76) / 47);
                this.field842 = this.field831;
                return;
            }
            var2.method948(81);
            var2.method39(1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ltd;Z)V", line = 238)
    public static final void method336(class116 arg0, boolean arg1) {
        field821++;
        if (!arg1) {
            class97.field2469 = arg0;
        }
    }
}
