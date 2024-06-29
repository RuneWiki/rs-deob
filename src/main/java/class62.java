import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class62 extends class95 {

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "Z")
    public volatile boolean field986 = true;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "Z")
    public static boolean field989 = false;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "Lsf;")
    public static class108 field990 = class140.method973(255, "cyan:");

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "Lsf;")
    private static class108 field1001 = class140.method973(255, "Continue");

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "Lsf;")
    public static class108 field998 = field1001;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "Lel;")
    public static class119 field995 = new class119(0, 0);

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "[I")
    public static int[] field1004 = new int[50];

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "Lik;")
    public static class262 field993;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "Lik;")
    public static class262 field994;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "Z")
    public boolean field988;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "Z")
    public boolean field999;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "[I")
    public static int[] field991;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILsf;Lsf;JSI)V", line = 7)
    public static final void method428(int arg0, int arg1, class108 arg2, class108 arg3, long arg4, short arg5, int arg6) {
        field997++;
        if (field989 || arg1 >= -111 || class311.field5374 >= 500) {
            return;
        }
        class186.field3411[class311.field5374] = arg2;
        class317.field5454[class311.field5374] = arg3;
        class305.field5299[class311.field5374] = arg5;
        class131.field2244[class311.field5374] = arg4;
        class313.field5405[class311.field5374] = arg0;
        class94.field1506[class311.field5374] = arg6;
        class311.field5374++;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)V", line = 31)
    public static final void method429(int arg0, int arg1) {
        field1000++;
        if (arg1 != 16) {
            method434((class139) null, (byte) -88);
        }
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class156.field2809 += arg0 * 128;
        if (class156.field2809 > class282.field4943.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class156.field2809 -= class282.field4943.length;
            class283.method2034(false, class313.field5408[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class17.field235[var4 + var6] - (class282.field4943[class282.field4943.length - 1 & class156.field2809 + var6] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class17.field235[var6++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class17.field235[var11 + var10] = 255;
                } else {
                    class17.field235[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg0); var13++) {
            class331.field5650[var13] = class331.field5650[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class331.field5650[var14] = (int) (Math.sin((double) class128.field2191 / 14.0D) * 16.0D + Math.sin((double) class128.field2191 / 15.0D) * 14.0D + Math.sin((double) class128.field2191 / 16.0D) * 12.0D);
            class128.field2191++;
        }
        class90.field1422 += arg0;
        int var15 = ((class116.field2000 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class90.field1422; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class17.field235[(var18 << 7) + var17] = 192;
        }
        class90.field1422 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var22 + var15) < 128) {
                    var20 += class17.field235[var22 - (-var15 - var21)];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class17.field235[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class19.field282[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class19.field282[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class19.field282[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    class17.field235[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 204)
    public static final String method430(Throwable arg0, int arg1) throws IOException {
        field1003++;
        String var3;
        if (arg0 instanceof class265) {
            class265 var2 = (class265) arg0;
            arg0 = var2.field4671;
            var3 = var2.field4672 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    int var18 = 100 / ((-arg1 - 43) / 51);
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V", line = 282)
    public static void method431(byte arg0) {
        field995 = null;
        field1004 = null;
        field994 = null;
        if (arg0 != -40) {
            method429(6, 0);
        }
        field1001 = null;
        field993 = null;
        field991 = null;
        field998 = null;
        field990 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B[Lca;I)V", line = 331)
    public static final void method432(byte arg0, class98[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class98 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1677 == 0) {
                    if (var4.field1636 != null) {
                        method432((byte) 124, var4.field1636, arg2);
                    }
                    class158 var5 = (class158) class191.field3456.method1676((long) var4.field1649, (byte) -87);
                    if (var5 != null) {
                        class302.method2121((byte) 95, var5.field2845, arg2);
                    }
                }
                if (arg2 == 0 && var4.field1665 != null) {
                    class286 var6 = new class286();
                    var6.field5006 = var4;
                    var6.field4993 = var4.field1665;
                    class287.method2053(var6, 21);
                }
                if (arg2 == 1 && var4.field1635 != null) {
                    if (var4.field1583 >= 0) {
                        class98 var7 = class168.method1173(var4.field1649, -1456948048);
                        if (var7 == null || var7.field1636 == null || var7.field1636.length <= var4.field1583 || var7.field1636[var4.field1583] != var4) {
                            continue;
                        }
                    }
                    class286 var8 = new class286();
                    var8.field5006 = var4;
                    var8.field4993 = var4.field1635;
                    class287.method2053(var8, 31);
                }
            }
        }
        if (arg0 < 92) {
            method429(127, 120);
        }
        field1002++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lla;B)[Lli;", line = 410)
    public static final class222[] method434(class139 arg0, byte arg1) {
        field987++;
        int var2 = -40 / ((arg1 - 2) / 60);
        if (!arg0.method969((byte) 9)) {
            return new class222[0];
        }
        class205 var3 = arg0.method961(-20288);
        while (var3.field3686 == 0) {
            class83.method556(10L, 126);
        }
        if (var3.field3686 == 2) {
            return new class222[0];
        }
        int[] var4 = (int[]) ((int[]) var3.field3685);
        class222[] var5 = new class222[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class222 var7 = new class222();
            var5[var6] = var7;
            var7.field3940 = var4[var6 << 2];
            var7.field3944 = var4[(var6 << 2) + 1];
            var7.field3941 = var4[(var6 << 2) + 2];
            var7.field3939 = var4[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)Z", line = 456)
    public static final boolean method435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class61.field980 * arg0 + class195.field3522 * arg3 >> 16;
        int var6 = class61.field980 * arg3 - class195.field3522 * arg0 >> 16;
        int var7 = class273.field4803 * var6 + class109.field1912 * arg1 >> 16;
        int var8 = class273.field4803 * arg1 - class109.field1912 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class273.field4803 * var6 + class109.field1912 * arg2 >> 16;
        int var12 = class273.field4803 * arg2 - class109.field1912 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class21.field308 && var13 < class21.field308) {
            return false;
        } else if (var9 > class64.field1022 && var13 > class64.field1022) {
            return false;
        } else if (var10 < class122.field2080 && var14 < class122.field2080) {
            return false;
        } else {
            return var10 <= class299.field5216 || var14 <= class299.field5216;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)I")
    public abstract int method427(int arg0);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)[B")
    public abstract byte[] method433(int arg0);
}
