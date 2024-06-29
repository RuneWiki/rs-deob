import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class214 extends class29 {

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Ljava/lang/String;")
    private String field3014 = "null";

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field3021 = -1;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "Lbn;")
    public static class160 field3029 = new class160(40, 3);

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "Lvq;")
    public static class24 field3030 = new class24(16, -2);

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "C")
    public char field3023;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "C")
    public char field3025;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "Ldq;")
    private class90 field3017;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "Ldq;")
    public class90 field3018;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "[Lae;")
    public static class285[] field3022;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Ljava/lang/String;", line = 14)
    public final String method1464(int arg0, int arg1) {
        if (arg0 <= 20) {
            this.method1464(-36, 112);
        }
        field3012++;
        if (this.field3018 == null) {
            return this.field3014;
        } else {
            class82 var3 = (class82) this.field3018.method609((long) arg1, 63);
            return var3 == null ? this.field3014 : var3.field1011;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)I", line = 39)
    public final int method1465(int arg0, int arg1) {
        field3013++;
        if (this.field3018 == null) {
            return this.field3019;
        }
        if (arg0 != 0) {
            this.field3014 = null;
        }
        class13 var3 = (class13) this.field3018.method609((long) arg1, 71);
        return var3 == null ? this.field3019 : var3.field214;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lat;II)V", line = 59)
    private final void method1466(class256 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3025 = class141.method934((byte) 114, arg0.method1728((byte) 101));
        } else if (arg1 == 2) {
            this.field3023 = class141.method934((byte) 32, arg0.method1728((byte) 108));
        } else if (arg1 == 3) {
            this.field3014 = arg0.method1715(true);
        } else if (arg1 == 4) {
            this.field3019 = arg0.method1746(arg2 ^ 0xFFFFAE17);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1767(arg2 + 1930493581);
            this.field3018 = new class90(class289.method1938((byte) 25, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1746(20972);
                class264 var7;
                if (arg1 == 5) {
                    var7 = new class82(arg0.method1715(true));
                } else {
                    var7 = new class13(arg0.method1746(arg2 ^ 0xFFFFAE17));
                }
                this.field3018.method606(1, var7, (long) var6);
            }
        }
        field3026++;
        if (arg2 != -5) {
            this.method1466((class256) null, 95, -11);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 113)
    public static void method1467(boolean arg0) {
        field3030 = null;
        field3029 = null;
        if (arg0) {
            method1467(true);
        }
        field3022 = null;
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V", line = 129)
    private final void method1468(int arg0) {
        this.field3017 = new class90(this.field3018.method602(true));
        field3015++;
        for (class13 var2 = (class13) this.field3018.method608((byte) 122); var2 != null; var2 = (class13) this.field3018.method604(arg0 - 101)) {
            class13 var3 = new class13((int) var2.field3907);
            this.field3017.method606(1, var3, (long) var2.field214);
        }
        if (arg0 != 5) {
            method1467(true);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 154)
    public final boolean method1469(String arg0, boolean arg1) {
        field3024++;
        if (this.field3018 == null) {
            return false;
        }
        if (this.field3017 == null) {
            this.method1470(-66);
        }
        for (class106 var3 = (class106) this.field3017.method609(client.method1808((byte) -107, arg0), 119); var3 != null; var3 = (class106) this.field3017.method611(-85)) {
            if (var3.field1430.equals(arg0)) {
                return true;
            }
        }
        if (!arg1) {
            this.method1468(-25);
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V", line = 184)
    private final void method1470(int arg0) {
        this.field3017 = new class90(this.field3018.method602(true));
        field3020++;
        for (class82 var2 = (class82) this.field3018.method608((byte) 122); var2 != null; var2 = (class82) this.field3018.method604(-123)) {
            class106 var3 = new class106(var2.field1011, (int) var2.field3907);
            this.field3017.method606(1, var3, client.method1808((byte) -123, var2.field1011));
        }
        if (arg0 > -23) {
            this.method1466((class256) null, 69, -125);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lat;Z)V", line = 209)
    public final void method1471(class256 arg0, boolean arg1) {
        if (arg1) {
            this.method1470(-92);
        }
        while (true) {
            int var3 = arg0.method1738((byte) -116);
            if (var3 == 0) {
                field3028++;
                return;
            }
            this.method1466(arg0, var3, -5);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)Z", line = 231)
    public final boolean method1472(byte arg0, int arg1) {
        field3011++;
        if (this.field3018 == null) {
            return false;
        }
        if (this.field3017 == null) {
            this.method1468(5);
        }
        if (arg0 != 23) {
            this.field3019 = 122;
        }
        class13 var3 = (class13) this.field3017.method609((long) arg1, 93);
        return var3 != null;
    }
}
