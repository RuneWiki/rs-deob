import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class242 extends class155 {

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public int field3547 = -1;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public int field3557 = 12800;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public int field3544 = 12800;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public int field3550 = -1;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public int field3561 = 0;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "Z")
    public boolean field3546 = true;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    public int field3564 = 0;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "Ljava/lang/String;")
    public String field3554;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "Ljava/lang/String;")
    public String field3560;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Lie;")
    public class2 field3555;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "Lpi;")
    public static class201 field3548 = new class201(64);

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "Ljava/lang/String;")
    public static String field3569 = "wave2:";

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "Llc;")
    public static class270 field3566;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[III)Z")
    public final boolean method1652(int arg0, int[] arg1, int arg2, int arg3) {
        field3563++;
        if (arg0 != 6) {
            field3549 = -80;
        }
        for (class82 var5 = (class82) this.field3555.method8(arg0 ^ 0xFFFFFFA4); var5 != null; var5 = (class82) this.field3555.method12((byte) 69)) {
            if (var5.method616(arg2, -24061, arg3)) {
                var5.method613(arg3, true, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(Z)V")
    public final void method1653(boolean arg0) {
        this.field3561 = 0;
        this.field3544 = 12800;
        this.field3557 = 12800;
        if (!arg0) {
            this.method1652(18, (int[]) null, 117, 0);
        }
        this.field3564 = 0;
        field3545++;
        for (class82 var2 = (class82) this.field3555.method8(-66); var2 != null; var2 = (class82) this.field3555.method12((byte) 69)) {
            if (this.field3557 > var2.field1307) {
                this.field3557 = var2.field1307;
            }
            if (var2.field1308 < this.field3544) {
                this.field3544 = var2.field1308;
            }
            if (this.field3561 < var2.field1312) {
                this.field3561 = var2.field1312;
            }
            if (this.field3564 < var2.field1303) {
                this.field3564 = var2.field1303;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method1654(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field3567++;
        class263 var5 = class34.method219(arg3, 19, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field4117 != null) {
            class234 var6 = new class234();
            var6.field3414 = arg2;
            var6.field3423 = var5;
            var6.field3425 = arg0;
            var6.field3419 = var5.field4117;
            class224.method1557((byte) 89, var6);
        }
        boolean var7 = true;
        if (var5.field4179 > 0) {
            var7 = class229.method1592(var5, (byte) 104);
        }
        if (!var7 || !client.method903(var5).method1732(arg0 - 1, (byte) 17)) {
            return;
        }
        if (arg0 == 1) {
            class144.field2338.method683(true, 94);
            class302.field4886++;
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 2) {
            class187.field2786++;
            class144.field2338.method683(true, 201);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 3) {
            class115.field1902++;
            class144.field2338.method683(true, 30);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 4) {
            class308.field4969++;
            class144.field2338.method683(true, 61);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg4 != 16730) {
            method1661(120, 57, (short[]) null, 13, (String[]) null);
        }
        if (arg0 == 5) {
            class194.field2859++;
            class144.field2338.method683(true, 66);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 6) {
            class183.field2742++;
            class144.field2338.method683(true, 7);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 7) {
            class34.field426++;
            class144.field2338.method683(true, 108);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 8) {
            class144.field2338.method683(true, 255);
            class238.field3487++;
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
        if (arg0 == 9) {
            class144.field2338.method683(true, 97);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
            class9.field100++;
        }
        if (arg0 == 10) {
            class47.field654++;
            class144.field2338.method683(true, 10);
            class144.field2338.method385(arg3, 455748840);
            class144.field2338.method376(arg1, false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public static final void method1655(int arg0, int arg1) {
        field3565++;
        class269.field4330.method1416(arg1, 0);
        class289.field4618.method1416(arg1, 0);
        if (arg0 > -20) {
            method1655(12, 119);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIII[I)Z")
    public final boolean method1656(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3551++;
        class82 var6 = (class82) this.field3555.method8(-118);
        int var7 = -73 % ((9 - arg0) / 35);
        while (var6 != null) {
            if (var6.method614(arg3, arg2, 8004, arg1)) {
                var6.method613(arg3, true, arg1, arg4);
                return true;
            }
            var6 = (class82) this.field3555.method12((byte) 69);
        }
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLmh;I)I")
    public static final int method1657(byte arg0, class263 arg1, int arg2) {
        field3552++;
        int var3 = -117 % ((arg0 - 89) / 35);
        if (arg1.field4226 == null || arg2 >= arg1.field4226.length) {
            return -2;
        }
        try {
            int[] var4 = arg1.field4226[arg2];
            int var5 = 0;
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = var4[var6++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 1) {
                    var9 = class52.field724[var4[var6++]];
                }
                if (var8 == 2) {
                    var9 = class185.field2761[var4[var6++]];
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 3) {
                    var9 = class140.field2269[var4[var6++]];
                }
                if (var8 == 4) {
                    int var11 = var4[var6++] << 16;
                    int var12 = var11 + var4[var6++];
                    class263 var13 = class144.method1078(var12, 8534);
                    int var14 = var4[var6++];
                    if (var14 != -1 && (!class12.method88(var14, 27838).field364 || class255.field3857)) {
                        for (int var15 = 0; var15 < var13.field4132.length; var15++) {
                            if (var14 + 1 == var13.field4132[var15]) {
                                var9 += var13.field4214[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class303.field4900[var4[var6++]];
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 6) {
                    var9 = class185.field2766[class185.field2761[var4[var6++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class303.field4900[var4[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class213.field3139.field3068;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class241.field3535[var16]) {
                            var9 += class185.field2761[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var4[var6++] << 16;
                    int var18 = var17 + var4[var6++];
                    class263 var19 = class144.method1078(var18, 8534);
                    int var20 = var4[var6++];
                    if (var20 != -1 && (!class12.method88(var20, 27838).field364 || class255.field3857)) {
                        for (int var21 = 0; var21 < var19.field4132.length; var21++) {
                            if (var20 + 1 == var19.field4132[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class45.field589;
                }
                if (var8 == 12) {
                    var9 = class305.field4933;
                }
                if (var8 == 13) {
                    int var22 = class303.field4900[var4[var6++]];
                    int var23 = var4[var6++];
                    var9 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var4[var6++];
                    var9 = class137.method1034((byte) -17, var24);
                }
                if (var8 == 18) {
                    var9 = (class213.field3139.field3660 >> 7) + class163.field2520;
                }
                if (var8 == 19) {
                    var9 = (class213.field3139.field3753 >> 7) + class149.field2390;
                }
                if (var8 == 20) {
                    var9 = var4[var6++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var5 += var9;
                    }
                    if (var7 == 1) {
                        var5 -= var9;
                    }
                    if (var7 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var7 == 3) {
                        var5 *= var9;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)Z")
    public final boolean method1658(int arg0, int arg1, int arg2, int[] arg3) {
        field3559++;
        for (class82 var5 = (class82) this.field3555.method8(-65); var5 != null; var5 = (class82) this.field3555.method12((byte) 69)) {
            if (var5.method612(arg1, 64, arg0)) {
                var5.method617(arg0, arg2 ^ 0xFFFFCDF8, arg3, arg1);
                return true;
            }
        }
        if (arg2 != 7) {
            this.field3547 = 115;
        }
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLki;III)Llf;")
    public static final class94 method1659(int arg0, int arg1, boolean arg2, class298 arg3, int arg4, int arg5, int arg6) {
        field3558++;
        int var8 = (arg6 << 19) + (arg2 ? 65536 : 0) + (arg1 << 17) + arg0;
        long var9 = (long) arg4 * 3147483667L + (long) var8 * 3849834839L;
        class94 var11 = (class94) class287.field4595.method1418(var9, 0);
        if (var11 != null) {
            return var11;
        }
        if (arg5 != 3) {
            method1660((byte) -6);
        }
        class244.field3599 = false;
        class94 var12 = class120.method898(arg6, arg1, (byte) -127, arg0, arg4, false, false, arg2, arg3);
        if (var12 != null && !class244.field3599) {
            class287.field4595.method1421(var9, var12, (byte) -121);
        }
        return var12;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
    public static void method1660(byte arg0) {
        field3566 = null;
        field3548 = null;
        field3569 = null;
        if (arg0 >= -122) {
            field3549 = -92;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[SI[Ljava/lang/String;)V")
    public static final void method1661(int arg0, int arg1, short[] arg2, int arg3, String[] arg4) {
        field3556++;
        if (arg3 != 2) {
            method1654(-55, 56, (String) null, 60, -10);
        }
        if (arg1 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        String var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                String var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method1661(var6 - 1, arg1, arg2, 2, arg4);
        method1661(arg0, var6 + 1, arg2, 2, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Z")
    public final boolean method1662(int arg0, int arg1, int arg2) {
        field3568++;
        if (arg1 != -21089) {
            method1660((byte) -87);
        }
        for (class82 var4 = (class82) this.field3555.method8(-122); var4 != null; var4 = (class82) this.field3555.method12((byte) 69)) {
            if (var4.method616(arg0, -24061, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class242(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3562 = arg0;
        this.field3553 = arg3;
        this.field3554 = arg1;
        this.field3546 = arg5;
        this.field3550 = arg6;
        if (this.field3550 == 255) {
            this.field3550 = 0;
        }
        this.field3560 = arg2;
        this.field3547 = arg4;
        this.field3555 = new class2();
    }
}
