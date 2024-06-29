import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class134 extends class259 {

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Z")
    public static boolean field1967 = true;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1965 = "wave2:";

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Lpk;")
    public static class237 field1960;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lji;")
    public static class256 field1970;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ldb;")
    private class39 field1959;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[[[I")
    public static int[][][] field1963;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I")
    public final int method919(int arg0, int arg1, byte arg2) {
        if (arg2 != 126) {
            return -45;
        }
        field1972++;
        if (this.field1959 == null) {
            return arg0;
        } else {
            class135 var4 = (class135) this.field1959.method306((long) arg1, 16216);
            return var4 == null ? arg0 : var4.field1975;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static void method920(int arg0) {
        field1965 = null;
        if (arg0 != -32280) {
            method920(49);
        }
        field1963 = null;
        field1960 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILca;)V")
    private final void method921(int arg0, int arg1, class54 arg2) {
        field1968++;
        if (arg0 == 249) {
            int var4 = arg2.method407(255);
            if (this.field1959 == null) {
                int var5 = class239.method1637(var4, arg1 ^ 0xFFFFF591);
                this.field1959 = new class39(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method407(255) == 1;
                int var8 = arg2.method408(8);
                class181 var9;
                if (var7) {
                    var9 = new class83(arg2.method439((byte) 99));
                } else {
                    var9 = new class135(arg2.method420((byte) 109));
                }
                this.field1959.method309((byte) -8, var9, (long) var8);
            }
        }
        if (arg1 != -2671) {
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lpk;B)I")
    public static final int method922(class237 arg0, byte arg1) {
        int var2 = 14 % ((arg1 - 76) / 44);
        field1958++;
        int var3 = 0;
        if (arg0.method1629(class136.field1983, 0)) {
            var3++;
        }
        if (arg0.method1629(class171.field2511, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(II)I")
    public static final int method923(int arg0, int arg1) {
        field1971++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            int var2 = -41 / ((arg0 - 32) / 37);
            return 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lca;I)V")
    public final void method924(class54 arg0, int arg1) {
        if (arg1 != 0) {
            method922((class237) null, (byte) -47);
        }
        field1966++;
        while (true) {
            int var3 = arg0.method407(arg1 ^ 0xFF);
            if (var3 == 0) {
                return;
            }
            this.method921(var3, -2671, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method925(int arg0, int arg1, String arg2) {
        field1969++;
        if (this.field1959 == null) {
            return arg2;
        }
        class83 var4 = (class83) this.field1959.method306((long) arg1, 16216);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 < 73) {
                method922((class237) null, (byte) 110);
            }
            return var4.field1275;
        }
    }
}
