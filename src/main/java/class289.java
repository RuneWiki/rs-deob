import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class289 extends class73 {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field4886 = -1;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    private int field4887 = -32768;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    private int field4893 = 0;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    private int field4907 = 0;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "Z")
    public boolean field4912 = false;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Luj;")
    private class141 field4891;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Lwm;")
    public static class152 field4883 = class157.method1048("scrollbar", 127);

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lwm;")
    public static class152 field4890 = class157.method1048("Wordpack geladen)3", 124);

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "[[I")
    public static int[][] field4903 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "Lwm;")
    public static class152 field4905 = class157.method1048(":allyreq:", 116);

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Z")
    public static boolean field4906 = true;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lmf;")
    private class47 field4899;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "[[Z")
    public static boolean[][] field4895;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 19)
    public final void method1941(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field4893 = -109;
        }
        field4909++;
        if (this.field4912) {
            return;
        }
        this.field4893 += arg0;
        while (this.field4893 > this.field4891.field2150[this.field4907]) {
            this.field4893 -= this.field4891.field2150[this.field4907];
            this.field4907++;
            if (this.field4907 >= this.field4891.field2177.length) {
                this.field4912 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V", line = 55)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4892++;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 63)
    public static final void method1942(int arg0) {
        field4910++;
        if (arg0 != -14981) {
            method1943(-43, 74, 9);
        }
        class59.field900.method1613(arg0 ^ 0x6223);
        class191.field3015.method1613(-22696);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V", line = 303)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4888 = arg2;
        this.field4897 = arg0;
        this.field4898 = arg1;
        this.field4889 = arg4;
        this.field4896 = arg5 + arg6;
        this.field4884 = arg3;
        int var8 = class189.method1255(this.field4897, (byte) -127).field5170;
        if (var8 == -1) {
            this.field4912 = true;
        } else {
            this.field4912 = false;
            this.field4891 = class133.method851(var8, -112);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)Lcc;", line = 85)
    public static final class248 method1943(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field579; var4++) {
            class248 var5 = var3.field580[var4];
            if ((var5.field4156 >> 29 & 0x3L) == 2L && var5.field4157 == arg1 && var5.field4151 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V", line = 107)
    public static void method1944(byte arg0) {
        if (arg0 != -65) {
            return;
        }
        field4905 = null;
        field4895 = (boolean[][]) null;
        field4903 = (int[][]) null;
        field4883 = null;
        field4890 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 141)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        class271 var13 = this.method1947(-124);
        field4911++;
        if (var13 != null) {
            var13.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4899);
            this.field4887 = var13.method22();
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()I", line = 156)
    public final int method22() {
        field4885++;
        return this.field4887;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(SB)Z", line = 168)
    public static final boolean method1945(short arg0, byte arg1) {
        field4900++;
        if (arg0 == 15 || arg0 == 31 || arg0 == 1 || arg0 == 47 || arg0 == 9 || arg0 == 16 || arg0 == 11 || arg0 == 48) {
            return true;
        }
        if (arg1 < 77) {
            field4895 = (boolean[][]) ((boolean[][]) null);
        }
        if (arg0 == 36 || arg0 == 21 || arg0 == 1006 || arg0 == 1002) {
            return true;
        } else if (arg0 == 29 || arg0 == 33 || arg0 == 51 || arg0 == 18 || arg0 == 39) {
            return true;
        } else {
            return arg0 == 46 || arg0 == 43 || arg0 == 41 || arg0 == 12 || arg0 == 10 || arg0 == 19;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILhi;)V", line = 199)
    public static final void method1946(int arg0, class291 arg1) {
        field4901++;
        int var2 = 119 % ((arg0 + 45) / 33);
        byte[] var3 = new byte[24];
        if (class156.field2474 != null) {
            try {
                class156.field2474.method2265(-2, 0L);
                class156.field2474.method2266(-118, var3);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var6 = 0; var6 < 24; var6++) {
                    var3[var6] = -1;
                }
            }
        }
        arg1.method1989(var3, 0, (byte) 127, 24);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)Lw;", line = 246)
    private final class271 method1947(int arg0) {
        class299 var2 = class189.method1255(this.field4897, (byte) -126);
        field4902++;
        if (arg0 > -95) {
            return (class271) null;
        }
        class271 var3;
        if (this.field4912) {
            var3 = var2.method2093(-30505, -1, 0, -1);
        } else {
            var3 = var2.method2093(-30505, this.field4886, this.field4893, this.field4907);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIII)V", line = 284)
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class137.field2096 = arg3;
        field4904++;
        class277.field4743 = arg4;
        class131.field1997 = arg1;
        class62.field943 = arg2;
        class280.field4784 = arg0;
        if (arg5 <= 95) {
            field4890 = (class152) null;
        }
    }
}
