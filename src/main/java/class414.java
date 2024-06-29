import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class414 extends class476 {

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Lrb;")
    public static class283 field5905 = new class283(111, 4);

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field5910 = -1;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field5892;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field5898;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field5902;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public int field5908;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Lvu;")
    public static class155 field5894;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "Lwg;")
    public static class41 field5911;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lat;")
    public class444 field5896;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Lat;")
    public class444 field5899;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Ljava/lang/String;")
    public String field5901;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Z")
    public boolean field5893;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field5900;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5903;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIB)V", line = 9)
    public static final void method2434(int arg0, int arg1, int arg2, byte arg3) {
        class27.field379 = new byte[arg0][arg2][arg1];
        if (arg3 != -3) {
            method2434(102, 110, 124, (byte) -95);
        }
        field5906++;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V", line = 21)
    public static void method2435(byte arg0) {
        if (arg0 != -70) {
            field5905 = null;
        }
        field5894 = null;
        field5905 = null;
        field5903 = null;
        field5911 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z", line = 35)
    public static final boolean method2436(byte arg0, int arg1) {
        field5909++;
        int var2 = 3 / ((-arg0 - 29) / 54);
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method2437(int arg0, byte arg1) {
        field5895++;
        int var2 = 69 / ((-arg1 - 48) / 44);
        class314 var3 = class177.method1213(false, 10, arg0);
        var3.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZ)V", line = 70)
    public static final void method2438(int arg0, int arg1, boolean arg2) {
        if (arg0 != -1) {
            return;
        }
        field5904++;
        class412 var3 = class379.method2261(arg0 + 3598, arg2, arg1);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field5865.length; var4++) {
                var3.field5865[var4] = -1;
                var3.field5866[var4] = 0;
            }
        }
    }
}
