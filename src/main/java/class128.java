import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class128 extends class46 {

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[I")
    public static int[] field2004 = new int[25];

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2015 = "green:";

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2022 = "Loading config - ";

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lkk;")
    public static class121 field2008 = new class121();

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[I")
    public static int[] field2009;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "[[B")
    public static byte[][] field2027;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ll;I)V", line = 4)
    public static final void method925(class133 arg0, int arg1) {
        field2012++;
        class55.field922 = class244.method1693(client.field736, arg0, -1511306100);
        class205.field3085 = new int[256];
        for (int var2 = arg1; var2 < 3; var2++) {
            float var3 = (float) ((class316.field4931[var2] & 0xFF0000) >> 16);
            int var4 = class316.field4931[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            int var6 = class316.field4931[var2 + 1] >> 8 & 0xFF;
            float var7 = (float) (class316.field4931[var2] >> 8 & 0xFF);
            float var8 = (float) (class316.field4931[var2] & 0xFF);
            float var9 = ((float) var6 - var7) / 64.0F;
            int var10 = class316.field4931[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class205.field3085[var2 * 64 + var12] = class222.method1577(class222.method1577((int) var7 << 8, (int) var3 << 16), (int) var8);
                var3 += var5;
                var7 += var9;
                var8 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class205.field3085[var13] = class316.field4931[3];
        }
        class163.field2449 = new int[32768];
        class52.field885 = new int[32768];
        class92.method664((class168) null, (byte) -15);
        class50.field818 = new int[32768];
        class273.field4232 = new int[32768];
        class338.field5287 = new class249(128, 254);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 64)
    public static final long method926(String arg0, byte arg1) {
        field2016++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg1 > -45) {
            method927(-7);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 110)
    public static void method927(int arg0) {
        field2004 = null;
        field2009 = null;
        if (arg0 != 0) {
            method927(23);
        }
        field2015 = null;
        field2022 = null;
        field2008 = null;
        field2027 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V", line = 128)
    public static final void method928(int arg0, boolean arg1) {
        field2011++;
        if (arg1 && class115.field1766 == arg0 && arg0 != 0) {
            class246 var2 = class11.field177[arg0];
            var2.method457(class244.field3905);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I", line = 162)
    public static final int method929(int arg0, int arg1) {
        if (arg0 != 4101) {
            method928(-49, true);
        }
        field2002++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIII)V", line = 173)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2021++;
        if (arg3 != -65) {
            method927(105);
        }
        if (arg4 >= class206.field3170 && class12.field184 >= arg4 && arg9 >= class206.field3170 && arg9 <= class12.field184 && arg8 >= class206.field3170 && arg8 <= class12.field184 && class206.field3170 <= arg5 && class12.field184 >= arg5 && arg0 >= class119.field1817 && class141.field2187 >= arg0 && arg2 >= class119.field1817 && arg2 <= class141.field2187 && class119.field1817 <= arg7 && class141.field2187 >= arg7 && arg1 >= class119.field1817 && arg1 <= class141.field2187) {
            class294.method1998(arg5, arg7, arg8, arg2, true, arg9, arg1, arg0, arg4, arg6);
        } else {
            client.method389(arg6, arg9, arg2, arg7, arg1, arg5, true, arg0, arg4, arg8);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 206)
    public static final int method931(int arg0, byte arg1) {
        if (arg1 != -74) {
            method926((String) null, (byte) 34);
        }
        field2025++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 223)
    public static final void method932(String arg0, boolean arg1) {
        field2020++;
        if (arg1) {
            field2024 = 61;
        }
        if (class52.field853 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class7.method62((byte) 8);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class29.method252("mem=" + var4 + "k", (String) null, true, 0);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class7.method62((byte) 36);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class29.method252("Memory before cleanup=" + var7 + "k", (String) null, !arg1, 0);
                class165.method1118((byte) 126);
                class7.method62((byte) 98);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class29.method252("Memory after cleanup=" + var9 + "k", (String) null, true, 0);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class29.method252("Number of player models in cache:" + class160.method1091(127), (String) null, !arg1, 0);
            }
            if (class94.field1516 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class198.field2962);
                System.out.println("oncard_2d:" + class198.field2964);
                System.out.println("oncard_texture:" + class198.field2961);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class233.method1640((byte) -56);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class339.field5299.method25(98);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class339.field5299.method30((byte) 82);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class32.field471.method1281(arg1);
                class295.field4568.method369((byte) -66);
                class339.field5299.method22(-76);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class48.field780 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class88.method640(25, (byte) 49);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class306.field4758 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class306.field4758 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class289.method1985(-1, false, 93, 0, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class289.method1985(-1, false, -69, 1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class289.method1985(-1, false, -116, 2, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class289.method1985(768, false, 92, 3, 1024);
            }
            if (arg0.startsWith("::setba")) {
                class331.field5144 = class112.method832(false, arg0.substring(8));
                class331.method2300((byte) -106, class32.field471);
                class107.field1663 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class64.method490(class112.method832(false, arg0.substring(15)));
                class331.method2300((byte) -106, class32.field471);
                class107.field1663 = false;
            }
            if (arg0.startsWith("::fps ") && class60.field967 != 0) {
                class306.method2093(class112.method832(false, arg0.substring(6)), 0);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class190.field2854 = class112.method832(false, arg0.substring(12).trim());
                class29.method252("rect_debug=" + class190.field2854, (String) null, !arg1, 0);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class175.field2653 = true;
            }
            if (arg0.startsWith("::hdr") && class94.field1516 && !class174.method1254((byte) -114, !class277.method1895())) {
                class29.method252("Failed to enable hdr", (String) null, true, 0);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class244.field3904) {
                    class244.field3904 = false;
                    class29.method252("Forced tweening disabled.", (String) null, true, 0);
                } else {
                    class244.field3904 = true;
                    class29.method252("Forced tweening ENABLED!", (String) null, true, 0);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class12.field181) {
                    System.out.println("Shift-click disabled.");
                    class12.field181 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class12.field181 = true;
                }
            }
        }
        class106.field1642.method753(-87, 236);
        class16.field219++;
        class106.field1642.method1132((byte) 29, arg0.length() - 1);
        class106.field1642.method1121(-1, arg0.substring(2));
    }
}
