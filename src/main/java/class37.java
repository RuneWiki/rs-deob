import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1014 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lkd;")
    public static class73 field1017 = class126.method1070((byte) -66, "mapedge");

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field1024 = 127;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lkd;")
    private static class73 field1022 = class126.method1070((byte) -66, "Loading ignore list");

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lkd;")
    public static class73 field1023 = field1022;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lpb;")
    public static class106 field1020;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lua;")
    public static class137 field1012;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
    public static final void method294(byte arg0, int arg1) {
        int var2 = 82 % ((-arg0 - 15) / 59);
        field1025++;
        class2 var3 = (class2) class70.field1768.method1099(88, (long) arg1);
        if (var3 != null) {
            var3.method1147((byte) -60);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method295(int arg0, int arg1) {
        field1011++;
        if (arg0 == -1 || !class70.field1781[arg0]) {
            return;
        }
        class48.field1270.method906((byte) 83, arg0);
        if (class120.field3066[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class120.field3066[arg0].length; var3++) {
            if (class120.field3066[arg0][var3] != null) {
                if (class120.field3066[arg0][var3].field81 == 2) {
                    var2 = false;
                } else {
                    class120.field3066[arg0][var3] = null;
                }
            }
        }
        int var4 = -46 % ((-arg1 - 8) / 57);
        if (var2) {
            class120.field3066[arg0] = null;
        }
        class70.field1781[arg0] = false;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lmf;II)V")
    public static final void method296(class89 arg0, int arg1, int arg2) {
        field1016++;
        if (arg2 > 49) {
            class83.method701(arg0.field2264, arg0.field2277, arg1, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method297(byte arg0) {
        field1022 = null;
        field1023 = null;
        field1012 = null;
        if (arg0 <= 93) {
            field1017 = null;
        }
        field1014 = null;
        field1017 = null;
        field1020 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZII)V")
    public static final void method298(boolean arg0, int arg1, int arg2) {
        field1018++;
        int[] var3 = new int[4];
        int var4 = 1;
        var3[0] = arg1;
        int[] var5 = new int[4];
        var5[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class143.field3554[var6] != arg1) {
                var3[var4] = class143.field3554[var6];
                var5[var4] = class119.field3053[var6];
                var4++;
            }
        }
        if (!arg0) {
            field1019 = 11;
        }
        class143.field3554 = var3;
        class119.field3053 = var5;
        class24.method196(class119.field3053, class143.field3554, class99.field2500.length - 1, 0, 60, class99.field2500);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILa;)La;")
    public static final class1 method299(int arg0, class1 arg1) {
        int var2 = class126.method1062((byte) 22, class153.method1225(arg1, arg0 ^ 0xFFFFF223));
        field1013++;
        if (var2 == 0) {
            return null;
        }
        if (arg0 != 3490) {
            field1022 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class45.method335(arg1.field101, -118);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lfa;)V")
    public class37(class37 arg0) {
        this.field1015 = arg0.field1015;
        this.field1009 = arg0.field1009;
        this.field1010 = arg0.field1010;
        this.field1021 = arg0.field1021;
    }
}
