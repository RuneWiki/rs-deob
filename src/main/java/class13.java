import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class13 {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[Lda;")
    public static class275[] field195 = new class275[100];

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[J")
    public static long[] field200 = new long[500];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field197 = 10;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[I")
    public static int[] field196 = new int[500];

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lda;")
    public static class275 field211 = class255.method1672(102, "::noclip");

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[Lij;")
    public static class85[] field208 = new class85[2048];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Lma;")
    public static class105 field207;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[[I")
    public static int[][] field202;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method58(int arg0, int arg1) {
        field206++;
        if (class83.field1347 == 0) {
            class6.field92.method1543(true, arg1);
        } else {
            class238.field4185 = arg1;
        }
        if (arg0 != -1048) {
            field207 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method59(int arg0) {
        class9.field146.method993(arg0 ^ 0x878);
        class123.field2202.method993(112);
        class104.field1732.method993(109);
        if (arg0 == 2048) {
            field203++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method60(byte arg0) {
        field196 = null;
        field207 = null;
        field211 = null;
        field200 = null;
        field195 = null;
        field202 = null;
        int var1 = -101 / ((28 - arg0) / 49);
        field208 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLma;)V")
    public static final void method61(byte arg0, class105 arg1) {
        if (arg0 < 33) {
            method61((byte) 19, (class105) null);
        }
        field193++;
        class5.field64 = arg1.method767(524287, class200.field3424);
        class262.field4550 = arg1.method767(524287, class107.field1849);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public abstract void method62(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public abstract void method63(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILma;)Lkb;")
    public static final class259 method64(int arg0, int arg1, class105 arg2) {
        if (arg0 == -4862) {
            field204++;
            return class181.method1213((byte) 110, arg2, arg1) ? class122.method890(arg0 + 1340082218) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method65(byte arg0) {
        field191++;
        if (arg0 == 45) {
            class118.field2125 = new class276(32);
        }
    }
}
