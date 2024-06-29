import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class53 extends class134 {

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
    public static int[] field927 = new int[500];

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Lmb;")
    private static class96 field926 = class243.method1708("level: ", (byte) 120);

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "[I")
    public static int[] field922 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lmb;")
    public static class96 field929 = class243.method1708("showVideoAd", (byte) 93);

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "Lmb;")
    public static class96 field933 = field926;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "Lrg;")
    public static class239 field934 = new class239(new byte[5000]);

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "Lce;")
    public static class111 field935;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Lnh;")
    public class276 field923;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "[B")
    public byte[] field921;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public static final void method401(int arg0, int arg1, int arg2, int arg3) {
        class187 var4 = class259.field4487[arg0][arg1][arg2];
        if (var4 != null) {
            class105 var5 = var4.field3269;
            if (var5 != null) {
                var5.field1755 = var5.field1755 * arg3 / 16;
                var5.field1762 = var5.field1762 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V")
    public static void method402(byte arg0) {
        field933 = null;
        field935 = null;
        field929 = null;
        field926 = null;
        if (arg0 < -82) {
            field934 = null;
            field927 = null;
            field922 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILw;)V")
    public static final void method403(int arg0, class107 arg1) {
        if (class215.field3695 == arg1.field1923) {
            class176.field3059[arg1.field1975] = true;
        }
        ++field931;
        if (arg0 >= -56) {
            field929 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)[B")
    public final byte[] method397(int arg0) {
        ++field924;
        if (super.field2403) {
            throw new RuntimeException();
        } else {
            int var2 = 30 / ((65 - arg0) / 44);
            return this.field921;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)I")
    public final int method394(int arg0) {
        ++field928;
        int var2 = -45 % ((-82 - arg0) / 42);
        return super.field2403 ? 0 : 100;
    }
}
