import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class47 extends class240 {

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    private int field777 = 1024;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    private int field785 = 2048;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    private int field782 = 3072;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "[[Z")
    public static boolean[][] field780 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    public static int[] field771 = new int[100];

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Lcd;")
    public static class64 field774 = class44.method335((byte) 71, "underlay");

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "Lcd;")
    private static class64 field783 = class44.method335((byte) 71, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!we", name = "U", descriptor = "[J")
    public static long[] field776 = new long[200];

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "Lcd;")
    public static class64 field788 = field783;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lcd;")
    private static class64 field784 = class44.method335((byte) 71, "green:");

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Lcd;")
    public static class64 field772 = field784;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "Lcd;")
    public static class64 field789 = class44.method335((byte) 71, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Lcd;")
    public static class64 field787 = field784;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lqm;")
    public static class222 field773;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "Lja;")
    public static class60 field790;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 6)
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 15)
    public static void method351(boolean arg0) {
        field784 = null;
        field771 = null;
        field789 = null;
        field787 = null;
        field774 = null;
        field783 = null;
        field773 = null;
        field788 = null;
        field772 = null;
        if (!arg0) {
            method352(-32, -90);
        }
        field780 = (boolean[][]) null;
        field776 = null;
        field790 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Lpb;", line = 54)
    public static final class71 method352(int arg0, int arg1) {
        class71 var2 = (class71) class115.field2114.method329((long) arg0, (byte) -63);
        field786++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class1.field2.method1580(0, arg0, 1);
        } else {
            var3 = class184.field3148.method1580(arg1 - 32767, arg0 & 0x7FFF, 1);
        }
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method585(-8482, new class13(var3));
        }
        if (arg0 >= 32768) {
            var4.method584(true);
        }
        if (arg1 != 32767) {
            method352(20, 5);
        }
        class115.field2114.method331((long) arg0, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILkh;)V", line = 91)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field791++;
        if (arg0 != 2) {
            field784 = (class64) null;
        }
        if (arg1 == 0) {
            this.field777 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field782 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field4113 = arg2.method152((byte) -83) == 1;
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V", line = 135)
    public final void method288(int arg0) {
        if (arg0 != 17772) {
            field781 = 45;
        }
        field792++;
        this.field785 = this.field782 - this.field777;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)[[I", line = 176)
    public final int[][] method286(byte arg0, int arg1) {
        int[][] var3 = this.field4095.method1797(arg1, -54);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(101, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                var8[var11] = this.field777 + (var5[var11] * this.field785 >> 12);
                var10[var11] = this.field777 + (var6[var11] * this.field785 >> 12);
                var9[var11] = (var7[var11] * this.field785 >> 12) + this.field777;
            }
        }
        if (arg0 <= 34) {
            this.field782 = 100;
        }
        field775++;
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I", line = 223)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            this.method286((byte) -121, -84);
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field778++;
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 113);
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                var3[var5] = (var4[var5] * this.field785 >> 12) + this.field777;
            }
        }
        return var3;
    }
}
