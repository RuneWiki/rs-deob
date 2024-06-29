import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lib;")
    private class95 field1064 = new class95();

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lcc;")
    private class252 field1071 = new class252();

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lof;")
    private class242 field1072;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lsf;")
    public static class108 field1074 = class140.method973(255, ")2");

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lof;")
    public static class242 field1075 = new class242(512);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
    public static int[] field1077 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lsf;")
    public static class108 field1078 = class140.method973(255, "leuchten3:");

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lsf;")
    public static class108 field1080 = class140.method973(255, ")4");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lik;")
    public static class262 field1079;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 8)
    public final void method461(boolean arg0) {
        this.field1071.method1785(0);
        this.field1072.method1679(arg0);
        this.field1064 = new class95();
        field1069++;
        this.field1073 = this.field1070;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z", line = 32)
    public static final boolean method462(byte arg0, int arg1) {
        int var2 = 18 % ((arg0 - 62) / 51);
        field1076++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lmc;", line = 57)
    public final class184 method463(int arg0) {
        field1066++;
        return arg0 == 512 ? this.field1072.method1678(126) : (class184) null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Lmc;", line = 68)
    public final class184 method464(byte arg0) {
        if (arg0 <= 53) {
            this.field1072 = (class242) null;
        }
        field1068++;
        return this.field1072.method1672(0);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 86)
    public static void method465(int arg0) {
        field1075 = null;
        if (arg0 != 11686) {
            return;
        }
        field1077 = null;
        field1080 = null;
        field1079 = null;
        field1074 = null;
        field1078 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)Lib;", line = 102)
    public final class95 method466(long arg0, int arg1) {
        if (arg1 != 1) {
            field1080 = (class108) null;
        }
        field1062++;
        class95 var4 = (class95) this.field1072.method1676(arg0, (byte) -112);
        if (var4 != null) {
            this.field1071.method1784(var4, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V", line = 183)
    public class69(int arg0) {
        this.field1070 = arg0;
        this.field1073 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1072 = new class242(var2);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I", line = 135)
    public static final int method467(int arg0, int arg1) {
        if (arg1 != 90) {
            method465(97);
        }
        field1067++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JBLib;)V", line = 147)
    public final void method468(long arg0, byte arg1, class95 arg2) {
        if (this.field1073 == 0) {
            class95 var5 = this.field1071.method1786(5807);
            var5.method1325(0);
            var5.method648(26562);
            if (this.field1064 == var5) {
                class95 var6 = this.field1071.method1786(5807);
                var6.method1325(0);
                var6.method648(26562);
            }
        } else {
            this.field1073--;
        }
        field1065++;
        this.field1072.method1681(1, arg2, arg0);
        this.field1071.method1784(arg2, true);
        if (arg1 >= -109) {
            method465(-117);
        }
    }
}
