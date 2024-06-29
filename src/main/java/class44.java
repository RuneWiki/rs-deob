import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lkh;")
    public static class117 field957 = class224.method1450((byte) -80, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lkh;")
    public static class117 field963 = null;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lkh;")
    public static class117 field962 = class224.method1450((byte) -73, "::autoshadow on");

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
    public static int[][] field965 = new int[104][104];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method367(byte arg0) {
        field965 = null;
        field962 = null;
        field963 = null;
        field957 = null;
        int var1 = -33 % ((arg0 - 8) / 35);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method368(int arg0) {
        if (arg0 != -14092) {
            field964 = 79;
        }
        class228.field4116.method503(arg0 ^ 0xFFFFC8FE);
        field961++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lah;III)V")
    public static final void method369(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field248 == 0) {
            arg0.field227 = arg0.field163;
        } else if (arg0.field248 == 1) {
            arg0.field227 = (arg1 - arg0.field207) / 2 + arg0.field163;
        } else if (arg0.field248 == 2) {
            arg0.field227 = arg1 - arg0.field163 - arg0.field207;
        } else if (arg0.field248 == 3) {
            arg0.field227 = arg0.field163 * arg1 >> 14;
        } else if (arg0.field248 == 4) {
            arg0.field227 = (arg0.field163 * arg1 >> 14) + (arg1 - arg0.field207) / 2;
        } else {
            arg0.field227 = arg1 - arg0.field207 - (arg0.field163 * arg1 >> 14);
        }
        field959++;
        if (arg0.field276 == 0) {
            arg0.field283 = arg0.field258;
        } else if (arg0.field276 == 1) {
            arg0.field283 = (arg3 - arg0.field256) / 2 + arg0.field258;
        } else if (arg0.field276 == 2) {
            arg0.field283 = arg3 - arg0.field258 - arg0.field256;
        } else if (arg0.field276 == 3) {
            arg0.field283 = arg0.field258 * arg3 >> 14;
        } else if (arg0.field276 == 4) {
            arg0.field283 = (arg3 - arg0.field256) / 2 + (arg0.field258 * arg3 >> 14);
        } else {
            arg0.field283 = arg3 - arg0.field256 - (arg0.field258 * arg3 >> 14);
        }
        int var4 = 83 % ((arg2 + 61) / 51);
        if (!class103.field1882 || class187.method1269(arg0, (byte) 16) == 0 && arg0.field225 != 0) {
            return;
        }
        if (arg0.field227 < 0) {
            arg0.field227 = 0;
        } else if (arg0.field227 + arg0.field207 > arg1) {
            arg0.field227 = arg1 - arg0.field207;
        }
        if (arg0.field283 < 0) {
            arg0.field283 = 0;
        } else if (arg3 < arg0.field283 + arg0.field256) {
            arg0.field283 = arg3 - arg0.field256;
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLai;)V")
    public static final void method370(byte arg0, class10 arg1) {
        class139.field2542 = arg1;
        if (arg0 == 99) {
            field958++;
        }
    }
}
