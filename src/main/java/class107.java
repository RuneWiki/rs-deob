import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class107 extends class244 implements class670 {

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "Lkv;")
    public class244 field1243;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
    public static int field1246 = -1;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "F")
    public static float field1236;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "Lqq;")
    public static class434 field1241;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        if (arg1 == 1) {
            field1240++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        field1235++;
        int var2 = 47 / ((arg0 + 82) / 37);
        return 0;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        if (arg1 != 0) {
            this.method446(null, (byte) -50);
        }
        field1238++;
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 >= -20) {
            return null;
        } else {
            field1230++;
            return null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        field1239++;
        int var2 = 25 / ((7 - arg0) / 46);
        return 0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        field1242++;
        if (arg1 >= -126) {
            method673(-73, null, -102);
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIILkv;)V")
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, class244 arg5) {
        super(arg2, arg3, arg4, class35.method191(arg1, 0, arg0));
        this.field1243 = arg5;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method673(int arg0, String arg1, int arg2) {
        if (arg0 != -1) {
            method673(-111, null, -9);
        }
        field1247++;
        return class655.method3698(true, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        field1249++;
        if (arg2) {
            field1244 = 56;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method674(String arg0, int arg1, char arg2) {
        field1232++;
        int var3 = class329.method1857((byte) -45, arg2, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 1) {
            method674(null, -36, 'q');
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 == -126) {
            field1233++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(B)V")
    public static void method675(byte arg0) {
        field1241 = null;
        if (arg0 < 84) {
            field1236 = -0.634382F;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 == 29877) {
            field1237++;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        field1251++;
        int var3 = -77 % ((47 - arg0) / 34);
        return this.field1243.method450(13, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        field1250++;
        if (arg1 < 97) {
            this.method447((byte) -19);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        field1234++;
        if (arg0 < 49) {
            field1244 = -43;
        }
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        field1245++;
        if (arg1 != 31055) {
            field1244 = 30;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        field1231++;
        if (arg0 != -91) {
            field1246 = -17;
        }
        return 0;
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        field1248++;
        int var2 = 19 / ((12 - arg0) / 56);
    }
}
