import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class43 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    private int[] field907;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lcd;")
    public static class23 field913 = class54.method414("Unerwartete Antwort vom Anmelde)2Server)3", -1);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lsa;")
    public static class162 field909 = new class162(100);

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field915 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lcd;")
    public static class23 field917 = class54.method414("::rect_debug", -1);

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lcd;")
    public static class23 field918 = class54.method414("Bitte geben Sie Ihr Passwort ein)3", -1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lhe;")
    public static class68 field910;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
    public static final boolean method341(int arg0, int arg1, int arg2) {
        field906++;
        class104 var3 = class65.method486(arg0, (byte) -66);
        int var4 = 28 / ((48 - arg2) / 52);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method686((byte) 110, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field917 = null;
        field913 = null;
        field910 = null;
        field909 = null;
        int var1 = -12 % ((-arg0 - 63) / 54);
        field918 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I")
    public final int method343(byte arg0, int arg1) {
        int var3 = (this.field907.length >> 1) - 1;
        if (arg0 < 95) {
            field915 = -113;
        }
        int var4 = var3 & arg1;
        field908++;
        while (true) {
            int var5 = this.field907[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field907[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZI)V")
    public static final void method344(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field905++;
        if (class58.field1349 == arg3 && class84.field1787 == arg0 && (class28.field614 == arg2 || !class193.field3810)) {
            return;
        }
        class58.field1349 = arg3;
        class28.field614 = arg2;
        class84.field1787 = arg0;
        if (!class193.field3810) {
            class28.field614 = 0;
        }
        class48.method379(25, (byte) 18);
        class193.method1249(true, -17570, class21.field443);
        int var6 = class155.field3099;
        class155.field3099 = (arg3 - 6) * 8;
        int var7 = class94.field1989;
        int var8 = class155.field3099 - var6;
        int var9 = class155.field3099;
        class94.field1989 = arg0 * 8 - 48;
        int var10 = class94.field1989 - var7;
        int var11 = class94.field1989;
        for (int var12 = 0; var12 < 32768; var12++) {
            class182 var28 = class91.field1944[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field219[var29] -= var8;
                    var28.field230[var29] -= var10;
                }
                var28.field277 -= var10 * 128;
                var28.field215 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class57 var26 = class95.field2007[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field219[var27] -= var8;
                    var26.field230[var27] -= var10;
                }
                var26.field215 -= var8 * 128;
                var26.field277 -= var10 * 128;
            }
        }
        class59.field1385 = arg2;
        byte var14 = 0;
        class134.field2790.method70(arg5, (byte) 124, false, arg1);
        byte var15 = 1;
        byte var16 = 104;
        byte var17 = 104;
        byte var18 = 1;
        if (var8 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var19 = 0;
        if (var10 < 0) {
            var18 = -1;
            var19 = 103;
            var17 = -1;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var19; var22 != var17; var22 += var18) {
                int var23 = var10 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class150.field3006[var25][var20][var22] = class150.field3006[var25][var24][var23];
                    } else {
                        class150.field3006[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class153 var21 = (class153) class178.field3534.method188((byte) 54); var21 != null; var21 = (class153) class178.field3534.method185((byte) -102)) {
            var21.field3053 -= var8;
            var21.field3059 -= var10;
            if (var21.field3053 < 0 || var21.field3059 < 0 || var21.field3053 >= 104 || var21.field3059 >= 104) {
                var21.method1018(15789);
            }
        }
        class119.field2448 = -1;
        if (class121.field2517 != 0) {
            class121.field2517 -= var8;
            field915 -= var10;
        }
        class181.field3575 = arg4;
        class51.field1216 = 0;
        class202.field3984.method190((byte) 87);
        class89.field1924.method190((byte) 90);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLkh;Lkh;Lwb;Lkh;)Z")
    public static final boolean method345(boolean arg0, class97 arg1, class97 arg2, class199 arg3, class97 arg4) {
        class203.field4001 = arg3;
        class201.field3974 = arg4;
        class145.field2960 = arg1;
        field914++;
        if (arg0) {
            field913 = null;
        }
        class2.field23 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([I)V")
    public class43(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field907 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field907[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field907[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field907[var5 + var5] = arg0[var4];
            this.field907[var5 + var5 + 1] = var4++;
        }
    }
}
