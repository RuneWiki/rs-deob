import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class124 extends class178 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lqe;")
    public static class179 field2286 = class206.method1380("<img=0>", (byte) -128);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[B")
    public static byte[] field2285 = new byte[520];

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lqe;")
    public static class179 field2291 = class206.method1380("rect_debug=", (byte) 12);

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lqe;")
    public static class179 field2296 = class206.method1380("null", (byte) -126);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "[I")
    public static int[] field2292;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILeh;IZ)[Llg;")
    public static final class126[] method779(int arg0, class52 arg1, int arg2, boolean arg3) {
        if (arg3) {
            return null;
        } else {
            field2295++;
            return class77.method495(20480, arg0, arg2, arg1) ? class50.method331(255) : null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILra;)Lvi;")
    public static final class233 method780(int arg0, class185 arg1) {
        if (arg0 >= -105) {
            return null;
        } else {
            field2294++;
            return new class233(arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1244(-27523), arg1.method1244(-27523), arg1.method1243(3));
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public static final void method781(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class155.field2793; var3++) {
            for (int var4 = 0; var4 < class39.field834; var4++) {
                for (int var5 = 0; var5 < class33.field719; var5++) {
                    class197 var6 = class229.field4232[var3][var4][var5];
                    if (var6 != null) {
                        class237 var7 = var6.field3680;
                        if (var7 != null && var7.field4382.method1261()) {
                            class50.method334(var7.field4382, var3, var4, var5, 1, 1);
                            if (var7.field4362 != null && var7.field4362.method1261()) {
                                class50.method334(var7.field4362, var3, var4, var5, 1, 1);
                                var7.field4382.method1259(var7.field4362, 0, 0, 0, false);
                                var7.field4362 = var7.field4362.method1260(arg0, arg1, arg2);
                            }
                            var7.field4382 = var7.field4382.method1260(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3662; var8++) {
                            class167 var10 = var6.field3672[var8];
                            if (var10 != null && var10.field3010.method1261()) {
                                class50.method334(var10.field3010, var3, var4, var5, var10.field3011 + 1 - var10.field3006, var10.field3023 - var10.field3018 + 1);
                                var10.field3010 = var10.field3010.method1260(arg0, arg1, arg2);
                            }
                        }
                        class47 var9 = var6.field3681;
                        if (var9 != null && var9.field1028.method1261()) {
                            class85.method575(var9.field1028, var3, var4, var5);
                            var9.field1028 = var9.field1028.method1260(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Z")
    public static final boolean method782(int arg0, boolean arg1) {
        field2290++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return true;
        } else {
            if (arg1) {
                method786(-8);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method783(int arg0) {
        field2291 = null;
        field2285 = null;
        field2286 = null;
        field2292 = null;
        if (arg0 != 0) {
            field2285 = null;
        }
        field2296 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
    public static final void method784(int arg0, boolean arg1) {
        field2293++;
        class218.method1422(3516);
        class88.field1681++;
        if (class88.field1681 < 50 && !arg1) {
            return;
        }
        class88.field1681 = 0;
        if (arg0 != 10687 || (class4.field57 || class199.field3714 == null)) {
            return;
        }
        class162.field2927++;
        class81.field1564.method70((byte) -62, 155);
        try {
            class199.field3714.method307(arg0 ^ 0xFFFFD661, 0, class81.field1564.field3397, class81.field1564.field3432);
            class81.field1564.field3432 = 0;
        } catch (IOException var2) {
            class4.field57 = true;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(ILra;)V")
    public static final void method785(int arg0, class185 arg1) {
        field2284++;
        byte[] var2 = new byte[24];
        if (class171.field3066 != null) {
            try {
                class171.field3066.method980((byte) 90, 0L);
                int var3 = 0;
                class171.field3066.method972(var2, (byte) -126);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 <= -110) {
            arg1.method1248(var2, 115, 24, 0);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public static final void method786(int arg0) {
        class102.field1961 = 0;
        class202.field3742 = 0;
        class225.method1477((byte) -117);
        field2289++;
        class81.method508((byte) 105);
        class60.method408((byte) -98);
        for (int var1 = 0; var1 < class102.field1961; var1++) {
            int var3 = class29.field640[var1];
            if (class13.field322 != class53.field1152[var3].field3152) {
                class53.field1152[var3].field3496 = null;
                class53.field1152[var3] = null;
            }
        }
        if (class150.field2705 != class36.field789.field3432) {
            throw new RuntimeException("gnp1 pos:" + class36.field789.field3432 + " psize:" + class150.field2705);
        }
        for (int var2 = 0; var2 < class186.field3456; var2++) {
            if (class53.field1152[class233.field4297[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class186.field3456);
            }
        }
        if (arg0 <= 91) {
            field2286 = null;
        }
    }
}
