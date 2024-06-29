import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class184 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public int field2853 = -1;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public int field2858 = 0;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public int field2857 = 1190717;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "Z")
    public boolean field2864 = true;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public int field2867 = 512;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public int field2865 = -1;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public int field2861 = 127;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Z")
    public boolean field2860 = true;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public int field2859 = 64;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public int field2869 = 8;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "Z")
    public boolean field2866 = false;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "[[I")
    public static int[][] field2868 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2862 = "";

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Lud;")
    public class39 field2863;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILfca;I)V", line = 5)
    private final void method1369(int arg0, class93 arg1, int arg2) {
        field2870++;
        if (arg2 == 1) {
            this.field2858 = class450.method2610(arg1.method767((byte) -125), (byte) -65);
        } else if (arg2 == 2) {
            this.field2865 = arg1.method793((byte) 81);
        } else if (arg2 == 3) {
            this.field2865 = arg1.method763(arg0 + 96);
            if (this.field2865 == 65535) {
                this.field2865 = -1;
            }
        } else if (arg2 == 5) {
            this.field2864 = false;
        } else if (arg2 == 7) {
            this.field2853 = class450.method2610(arg1.method767((byte) -125), (byte) -47);
        } else if (arg2 == 8) {
            this.field2863.field656 = this.field2854;
        } else if (arg2 == 9) {
            this.field2867 = arg1.method763(arg0 + 109) << 2;
        } else if (arg2 == 10) {
            this.field2860 = false;
        } else if (arg2 == 11) {
            this.field2869 = arg1.method793((byte) 44);
        } else if (arg2 == 12) {
            this.field2866 = true;
        } else if (arg2 == 13) {
            this.field2857 = arg1.method767((byte) -118);
        } else if (arg2 == 14) {
            this.field2859 = arg1.method793((byte) 82) << 2;
        } else if (arg2 == 16) {
            this.field2861 = arg1.method793((byte) 22);
        }
        if (arg0 != -1) {
            this.method1369(81, null, -124);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILfca;)V", line = 75)
    public final void method1370(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 51);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.method1369(-85, null, -118);
                }
                field2855++;
                return;
            }
            this.method1369(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IZZ)V", line = 110)
    public static final void method1371(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -2526) {
            method1372(119);
        }
        if (arg2) {
            class313.field4287++;
            class576.method3324(-122);
        }
        field2871++;
        if (arg1) {
            class382.field5192++;
            class752.method4167(-17941);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 136)
    public static void method1372(int arg0) {
        field2862 = null;
        field2868 = null;
        if (arg0 != 0) {
            method1371(-126, true, true);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V", line = 148)
    public final void method1373(byte arg0) {
        field2856++;
        if (arg0 != -103) {
            this.field2854 = -125;
        }
        this.field2869 = this.field2854 | this.field2869 << 8;
    }
}
