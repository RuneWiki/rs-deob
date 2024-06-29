import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class153 {

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field3791 = 0;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lka;")
    private class70[] field3771;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3768 = 0;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "[[B")
    public static byte[][] field3772 = new byte[1000][];

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lqf;")
    private static class117 field3784 = class72.method514(117, "Cancel");

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3786 = -1;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lqf;")
    public static class117 field3781 = field3784;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Leb;")
    public static class31 field3785 = new class31(64);

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[I")
    public static int[] field3789 = new int[256];

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lqf;")
    public static class117 field3790 = class72.method514(109, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Leb;")
    public static class31 field3792;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[Z")
    public static boolean[] field3794;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Lqf;")
    public static class117 field3793;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Lqf;")
    public static class117 field3797;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lqf;")
    public static class117 field3795;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lqf;")
    public static class117 field3798;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "J")
    private long field3770;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lr;")
    public static class118 field3776;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lr;")
    public static class118 field3796;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lka;")
    private class70 field3769;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lka;")
    private class70 field3787;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "[I")
    public static int[] field3780;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lka;")
    public final class70 method1216(byte arg0) {
        if (arg0 != -79) {
            field3798 = null;
        }
        field3766++;
        if (this.field3791 > 0 && this.field3771[this.field3791 - 1] != this.field3787) {
            class70 var2 = this.field3787;
            this.field3787 = var2.field1483;
            return var2;
        }
        while (this.field3791 < this.field3774) {
            class70 var3 = this.field3771[this.field3791++].field1483;
            if (this.field3771[this.field3791 - 1] != var3) {
                this.field3787 = var3.field1483;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3796 = null;
        field3785 = null;
        field3780 = null;
        field3784 = null;
        field3795 = null;
        field3790 = null;
        field3789 = null;
        field3798 = null;
        field3776 = null;
        field3792 = null;
        field3781 = null;
        int var1 = -63 / ((arg0 - 42) / 46);
        field3794 = null;
        field3772 = null;
        field3793 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
    public static final void method1218(int arg0, boolean arg1) {
        field3775++;
        class120.method964(1);
        class22.field407++;
        if (class22.field407 < 50 && !arg1) {
            return;
        }
        class22.field407 = arg0;
        if (class76.field1682 || class125.field2957 == null) {
            return;
        }
        class99.field2373.method961(183, arg0 ^ 0xFFFFFB52);
        class148.field3637++;
        try {
            class125.field2957.method736((byte) 42, class99.field2373.field1748, class99.field2373.field1691, 0);
            class99.field2373.field1691 = 0;
        } catch (IOException var2) {
            class76.field1682 = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lka;BJ)V")
    public final void method1219(class70 arg0, byte arg1, long arg2) {
        field3773++;
        if (arg0.field1487 != null) {
            arg0.method495(-72);
        }
        class70 var5 = this.field3771[(int) (arg2 & (long) (this.field3774 - 1))];
        arg0.field1483 = var5;
        arg0.field1487 = var5.field1487;
        int var6 = 16 / ((-arg1 - 25) / 55);
        arg0.field1487.field1483 = arg0;
        arg0.field1483.field1487 = arg0;
        arg0.field1495 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lka;")
    public final class70 method1220(boolean arg0) {
        field3767++;
        if (arg0) {
            this.method1216((byte) -88);
        }
        if (this.field3769 == null) {
            return null;
        }
        class70 var2 = this.field3771[(int) (this.field3770 & (long) (this.field3774 - 1))];
        while (this.field3769 != var2) {
            if (this.field3769.field1495 == this.field3770) {
                class70 var3 = this.field3769;
                this.field3769 = this.field3769.field1483;
                return var3;
            }
            this.field3769 = this.field3769.field1483;
        }
        this.field3769 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IJ)Lka;")
    public final class70 method1221(int arg0, long arg1) {
        this.field3770 = arg1;
        field3779++;
        class70 var4 = this.field3771[(int) (arg1 & (long) (this.field3774 - 1))];
        if (arg0 <= 4) {
            field3783 = -105;
        }
        for (this.field3769 = var4.field1483; this.field3769 != var4; this.field3769 = this.field3769.field1483) {
            if (this.field3769.field1495 == arg1) {
                class70 var5 = this.field3769;
                this.field3769 = this.field3769.field1483;
                return var5;
            }
        }
        this.field3769 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lka;")
    public final class70 method1222(int arg0) {
        this.field3791 = arg0;
        field3782++;
        return this.method1216((byte) -79);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class153(int arg0) {
        this.field3771 = new class70[arg0];
        this.field3774 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class70 var3 = this.field3771[var2] = new class70();
            var3.field1483 = var3;
            var3.field1487 = var3;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3789[var0] = var1;
        }
        field3792 = new class31(30);
        field3794 = new boolean[5];
        field3793 = class72.method514(123, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");
        field3797 = class72.method514(104, "gr-Un:");
        field3795 = class72.method514(125, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
        field3798 = class72.method514(98, "Untersuchen");
    }
}
