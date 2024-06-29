import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class288 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Loj;")
    public static class246 field4611 = new class246();

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[SB[Ljava/lang/String;I)V")
    public static final void method1915(int arg0, short[] arg1, byte arg2, String[] arg3, int arg4) {
        field4613++;
        if (arg2 >= -121 || arg0 >= arg4) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg4) / 2;
        String var7 = arg3[var6];
        arg3[var6] = arg3[arg4];
        arg3[arg4] = var7;
        short var8 = arg1[var6];
        arg1[var6] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                String var10 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg3[arg4] = arg3[var5];
        arg3[var5] = var7;
        arg1[arg4] = arg1[var5];
        arg1[var5] = var8;
        method1915(arg0, arg1, (byte) -125, arg3, var5 - 1);
        method1915(var5 + 1, arg1, (byte) -128, arg3, arg4);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILdk;)V")
    public static final void method1916(int arg0, class251 arg1) {
        field4612++;
        class307.field4916 = arg1.method1699(0, "titlebg");
        if (arg0 == 1) {
            class29.field351 = arg1.method1699(0, "logo");
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLdk;)V")
    public static final void method1917(byte arg0, class251 arg1) {
        class223.field3625 = class137.method962(arg1, true, 0, class192.field3120);
        field4609++;
        class233.field3739 = class137.method962(arg1, true, 0, class292.field4680);
        class28.field348 = class137.method962(arg1, true, 0, class95.field1539);
        class306.field4889 = class137.method962(arg1, true, 0, class137.field2159);
        class259.field4177 = class137.method962(arg1, true, 0, class84.field1394);
        class241.field3845 = class137.method962(arg1, true, 0, class304.field4862);
        class308.field4927 = class130.method920(0, true, arg1, class272.field4365);
        class173.field2821 = class130.method920(0, true, arg1, class182.field2992);
        class309.field4940 = class130.method920(0, true, arg1, class212.field3506);
        class126.field1985 = class253.method1712((byte) -100, arg1, class97.field1561, 0);
        class42.field611 = class253.method1712((byte) -110, arg1, class282.field4500, 0);
        class78.field1311.method649(class42.field611, (int[]) null);
        class88.field1443.method649(class42.field611, (int[]) null);
        class59.field967.method649(class42.field611, (int[]) null);
        class232 var2 = class30.method162(arg1, 50, class11.field111, 0);
        var2.method1564();
        class123.field1962 = var2;
        class232[] var3 = class60.method407(arg1, class78.field1302, (byte) 111, 0);
        if (arg0 == -48) {
            for (int var4 = 0; var4 < var3.length; var4++) {
                var3[var4].method1564();
            }
            class78.field1312 = var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1918(int arg0, int arg1, byte[] arg2, int arg3) {
        field4608++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg0 != 160) {
            field4611 = null;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class209.field3319[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0 + arg5;
        int var9 = arg7 - arg0;
        int var10 = arg1 + arg0;
        field4610++;
        if (arg3 != 0) {
            field4611 = null;
        }
        for (int var11 = arg1; var11 < var10; var11++) {
            class73.method494(arg6, class204.field3253[var11], arg3 ^ 0xFBC, arg7, arg5);
        }
        int var12 = arg2 - arg0;
        for (int var13 = arg2; var13 > var12; var13--) {
            class73.method494(arg6, class204.field3253[var13], 4028, arg7, arg5);
        }
        for (int var14 = var10; var14 <= var12; var14++) {
            int[] var15 = class204.field3253[var14];
            class73.method494(arg6, var15, arg3 ^ 0xFBC, var8, arg5);
            class73.method494(arg4, var15, arg3 + 4028, var9, var8);
            class73.method494(arg6, var15, 4028, arg7, var9);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static void method1920(boolean arg0) {
        if (!arg0) {
            field4611 = null;
        }
    }
}
