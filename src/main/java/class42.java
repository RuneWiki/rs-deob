import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class42 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lbe;")
    private class116 field707 = new class116();

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lrb;")
    private class196 field728 = new class196();

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Loa;")
    private class276 field727;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field709 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lda;")
    private static class275 field717 = class255.method1672(108, "K");

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lda;")
    public static class275 field714 = field717;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lda;")
    public static class275 field715 = class255.method1672(109, "mapflag");

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lda;")
    public static class275 field705 = field717;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lsg;")
    public static class159 field720 = new class159();

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lda;")
    public static class275 field725 = class255.method1672(124, "settings=");

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lda;")
    public static class275 field722 = class255.method1672(106, "Wordpack geladen)3");

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "[I")
    public static int[] field732 = new int[256];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "B")
    public static byte field711;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lda;")
    public static class275[] field713;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lki;")
    public final class103 method242(byte arg0) {
        field716++;
        if (arg0 != 116) {
            method249((byte) -55);
        }
        return this.field727.method1869(-1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLma;ILma;)V")
    public static final void method243(boolean arg0, class105 arg1, int arg2, class105 arg3) {
        class99.field1669 = arg0;
        class25.field410 = arg1;
        field718++;
        if (arg2 != -6906) {
            method245((byte) 35);
        }
        class204.field3470 = arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public static final void method244(byte arg0, int arg1) {
        field726++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class52.method325(0);
        } else if (arg1 == 2) {
            class116.method846((byte) 86);
        } else {
            throw new RuntimeException();
        }
        if (arg0 > -43) {
            method244((byte) -34, 6);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method245(byte arg0) {
        field720 = null;
        field705 = null;
        field713 = null;
        field717 = null;
        field714 = null;
        field715 = null;
        int var1 = -45 % ((arg0 - 62) / 51);
        field732 = null;
        field722 = null;
        field725 = null;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public final void method246(byte arg0) {
        this.field728.method1279((byte) -29);
        field712++;
        this.field727.method1865(-104);
        if (arg0 == 74) {
            this.field707 = new class116();
            this.field730 = this.field729;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLma;)V")
    public static final void method247(byte arg0, class105 arg1) {
        field706++;
        int var2 = 45 / ((-arg0 - 8) / 57);
        class151.field2648 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field719++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        if (arg0 != 12847) {
            method253((byte) -104, -107, 4);
        }
        int var12 = arg7;
        if (var8 != 0) {
            int var13 = class223.field3769[var8];
            var11 = -arg7 * var13 >> 16;
            int var14 = class223.field3760[var8];
            var12 = arg7 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class223.field3769[var9];
            int var16 = class223.field3760[var9];
            var10 = var12 * var15 >> 16;
            var12 = var12 * var16 >> 16;
        }
        class251.field4454 = arg4;
        class83.field1349 = arg1 - var11;
        class195.field3335 = arg6 - var12;
        class224.field3800 = arg3;
        class123.field2204 = arg5 - var10;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static final void method249(byte arg0) {
        field721++;
        if (arg0 >= -17) {
            field715 = null;
        }
        for (class8 var1 = (class8) class22.field336.method550(-17); var1 != null; var1 = (class8) class22.field336.method545(104)) {
            if (var1.field132 == -1) {
                var1.field125 = 0;
                class125.method908(var1, (byte) -128);
            } else {
                var1.method741(3);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)Lki;")
    public final class103 method250(byte arg0) {
        field708++;
        return arg0 > -34 ? null : this.field727.method1864((byte) -98);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lbe;BJ)V")
    public final void method251(class116 arg0, byte arg1, long arg2) {
        int var5 = -33 / ((15 - arg1) / 38);
        if (this.field730 == 0) {
            class116 var6 = this.field728.method1273((byte) -110);
            var6.method741(3);
            var6.method843(22610);
            if (this.field707 == var6) {
                class116 var7 = this.field728.method1273((byte) -30);
                var7.method741(3);
                var7.method843(22610);
            }
        } else {
            this.field730--;
        }
        this.field727.method1867(true, arg2, arg0);
        this.field728.method1282(arg0, (byte) 15);
        field723++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZJ)Lbe;")
    public final class116 method252(boolean arg0, long arg1) {
        class116 var4 = (class116) this.field727.method1871(0, arg1);
        field731++;
        if (var4 != null) {
            this.field728.method1282(var4, (byte) 15);
        }
        return arg0 ? var4 : null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V")
    public static final void method253(byte arg0, int arg1, int arg2) {
        class218.field3698[arg1] = arg2;
        field710++;
        class190 var3 = (class190) class107.field1862.method1871(0, (long) arg1);
        int var4 = 14 % ((arg0 + 45) / 36);
        if (var3 == null) {
            class190 var5 = new class190(class121.method888((byte) -119) + 500L);
            class107.field1862.method1867(true, (long) arg1, var5);
        } else {
            var3.field3271 = class121.method888((byte) -119) + 500L;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field730 = arg0;
        this.field729 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field727 = new class276(var2);
    }
}
