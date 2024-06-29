import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class23 {

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[S")
    public short[] field396;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[B")
    public byte[] field399;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[Lma;")
    public class5[] field397;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
    public short[] field395;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
    public int[] field398;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[I")
    public static int[] field392 = new int[5];

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lma;")
    public static class5 field400 = class12.method119("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 100);

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public static boolean field402 = false;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[[I")
    public static int[][] field401 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lma;")
    public static class5 field405 = null;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Ltj;")
    public static class73 field404 = new class73(5);

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 11)
    public static final void method182(int arg0, int arg1) {
        field393++;
        int var2 = 126 % ((17 - arg0) / 35);
        class171.field2634 = -1;
        class171.field2634 = -1;
        if (arg1 == 37) {
            class168.field2557 = 3.0F;
        } else if (arg1 == 50) {
            class168.field2557 = 4.0F;
        } else if (arg1 == 75) {
            class168.field2557 = 6.0F;
        } else {
            class168.field2557 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)Z", line = 39)
    public final boolean method183(int arg0, int arg1) {
        int var3 = 71 % ((arg1 - 64) / 52);
        field391++;
        return (this.field399[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 62)
    public static void method184(byte arg0) {
        field400 = null;
        field404 = null;
        field401 = (int[][]) null;
        if (arg0 <= 80) {
            field407 = 19;
        }
        field392 = null;
        field405 = null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)I", line = 86)
    public final int method185(int arg0, int arg1) {
        if (arg1 != -18321) {
            method182(81, 77);
        }
        field394++;
        return this.field399[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 105)
    public class23(int arg0) {
        this.field403 = arg0;
        this.field396 = new short[this.field403];
        this.field399 = new byte[this.field403];
        this.field397 = new class5[this.field403];
        this.field395 = new short[this.field403];
        this.field398 = new int[this.field403];
    }
}
