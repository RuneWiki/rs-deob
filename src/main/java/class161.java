import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class161 extends class282 {

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Z")
    public boolean field2722 = true;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public int field2734 = 12800;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public int field2731 = 12800;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public int field2737 = 0;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public int field2741 = -1;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Ljf;")
    public class229 field2726;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Ljf;")
    public class229 field2723;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "Ljg;")
    public class303 field2743;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Ljf;")
    public static class229 field2724 = class212.method1457((byte) 109, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[I")
    public static int[] field2730 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Z")
    public static boolean field2735 = false;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "[[B")
    public static byte[][] field2739 = new byte[250][];

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "Li;")
    public static class217 field2728;

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljf;Ljf;IIIZ)V", line = 473)
    public class161(class229 arg0, class229 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2726 = arg1;
        this.field2723 = arg0;
        this.field2741 = arg4;
        this.field2722 = arg5;
        this.field2742 = arg2;
        this.field2733 = arg3;
        this.field2743 = new class303();
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V", line = 15)
    public final void method1081(byte arg0) {
        this.field2731 = 12800;
        this.field2734 = 12800;
        this.field2725 = 0;
        field2727++;
        this.field2737 = 0;
        class64 var2 = (class64) this.field2743.method2078(-105);
        if (arg0 > 0) {
            return;
        }
        while (var2 != null) {
            if (this.field2725 < var2.field1105) {
                this.field2725 = var2.field1105;
            }
            if (var2.field1108 > this.field2737) {
                this.field2737 = var2.field1108;
            }
            if (var2.field1102 < this.field2734) {
                this.field2734 = var2.field1102;
            }
            if (var2.field1100 < this.field2731) {
                this.field2731 = var2.field1100;
            }
            var2 = (class64) this.field2743.method2080(5);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)Z", line = 53)
    public final boolean method1082(int arg0, int arg1, int arg2) {
        if (arg0 > -70) {
            method1085(124, 56, (byte) -54, 18, true, 11, 121);
        }
        field2736++;
        if (this.field2734 > arg2 || this.field2725 < arg2 || this.field2731 > arg1 || this.field2737 < arg1) {
            return false;
        }
        for (class64 var4 = (class64) this.field2743.method2078(-117); var4 != null; var4 = (class64) this.field2743.method2080(5)) {
            if (var4.method481(arg2, arg1, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)V", line = 82)
    public static final void method1083(int arg0, int arg1, byte arg2) {
        int var3 = 104 / ((arg2 - 39) / 33);
        field2740++;
        class33.field618++;
        class84.field1608.method1397(35, 0);
        class84.field1608.method87(-1649217712, arg1);
        class84.field1608.method106(arg0, (byte) 54);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V", line = 100)
    public static final void method1084(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2724 = (class229) null;
        }
        field2721++;
        if (class27.field487 != 0 && arg0 != -1) {
            class127.method901(class29.field505, false, arg0, class27.field487, 0, true);
            class269.field4620 = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBIZII)V", line = 143)
    public static final void method1085(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2738++;
        if (class184.field3188 == arg5 && class70.field1339 == arg3 && class225.field3852 == arg6 || class110.method781((byte) 126)) {
            return;
        }
        class70.field1339 = arg3;
        if (arg2 != -122) {
            return;
        }
        class184.field3188 = arg5;
        class225.field3852 = arg6;
        if (class110.method781((byte) 127)) {
            class225.field3852 = 0;
        }
        if (arg4) {
            class186.method1295(28, (byte) 84);
        } else {
            class186.method1295(25, (byte) 84);
        }
        class18.method178(true, (byte) -4, class47.field856);
        int var7 = class258.field4503;
        int var8 = class213.field3649;
        class213.field3649 = (arg3 - 6) * 8;
        class258.field4503 = arg5 * 8 - 48;
        class123.field2172 = class282.method1987(class184.field3188 * 8, (byte) -68, class70.field1339 * 8);
        int var9 = class213.field3649 - var8;
        class60.field1039 = null;
        int var10 = class258.field4503 - var7;
        int var11 = class258.field4503;
        int var12 = class213.field3649;
        if (arg4) {
            class126.field2238 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class331 var14 = class331.field5637[var13];
                if (var14 != null) {
                    var14.field1983 -= var10 * 128;
                    var14.field2028 -= var9 * 128;
                    if (var14.field1983 >= 0 && var14.field1983 <= 13184 && var14.field2028 >= 0 && var14.field2028 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2018[var15] -= var10;
                            var14.field2017[var15] -= var9;
                        }
                        class283.field4858[class126.field2238++] = var13;
                    } else {
                        class331.field5637[var13].field5631 = null;
                        class331.field5637[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class331 var17 = class331.field5637[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field2018[var18] -= var10;
                        var17.field2017[var18] -= var9;
                    }
                    var17.field1983 -= var10 * 128;
                    var17.field2028 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class33 var20 = class192.field3334[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field2018[var21] -= var10;
                    var20.field2017[var21] -= var9;
                }
                var20.field2028 -= var9 * 128;
                var20.field1983 -= var10 * 128;
            }
        }
        class16.field254 = arg6;
        class301.field5124.method301(false, arg1, false, arg0);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var9 < 0) {
            var27 = -1;
            var26 = -1;
            var25 = 103;
        }
        if (var10 < 0) {
            var22 = 103;
            var23 = -1;
            var24 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var10 + var28;
                int var31 = var9 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class105.field1822[var32][var28][var29] = class105.field1822[var32][var30][var31];
                    } else {
                        class105.field1822[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class89 var33 = (class89) class83.field1532.method2078(-94); var33 != null; var33 = (class89) class83.field1532.method2080(5)) {
            var33.field1633 -= var9;
            var33.field1641 -= var10;
            if (var33.field1641 < 0 || var33.field1633 < 0 || var33.field1641 >= 104 || var33.field1633 >= 104) {
                var33.method1747((byte) -45);
            }
        }
        if (arg4) {
            class61.field1048 -= var9;
            class150.field2593 -= var9;
            class97.field1721 -= var10 * 128;
            class243.field4301 -= var9 * 128;
            class104.field1808 -= var10;
            class84.field1602 -= var10;
        } else {
            class74.field1405 = 1;
        }
        if (class23.field418 != 0) {
            class73.field1395 -= var9;
            class23.field418 -= var10;
        }
        class131.field2313 = 0;
        if (class108.field1900 && arg4 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class185.method1258((byte) -74);
        }
        class308.field5211 = -1;
        class282.field4844.method2073(true);
        class48.field870.method2073(true);
        class164.method1128();
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V", line = 388)
    public static void method1086(byte arg0) {
        field2728 = null;
        field2739 = (byte[][]) null;
        int var1 = 17 % ((arg0) / 49);
        field2724 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 418)
    public static final void method1087(int arg0) {
        int var1 = -124 % ((arg0 + 65) / 45);
        class217.field3735 = (byte[][][]) null;
        class160.field2717 = null;
        class169.field2914 = null;
        class100.field1766 = null;
        field2744++;
        class260.field4515 = (byte[][][]) null;
        class220.field3760 = (int[][][]) null;
        class70.field1334 = (byte[][][]) null;
        class115.field2083 = (byte[][][]) null;
        class236.field4084 = (byte[][][]) null;
        class56.field992 = null;
        class279.field4779 = null;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V", line = 451)
    public static final void method1088(byte arg0) {
        if (arg0 > -124) {
            method1083(-46, -8, (byte) 92);
        }
        field2729++;
        if (!class110.method781((byte) 127) && class225.field3852 != class16.field254) {
            method1085(class301.field5124.field2018[0], class301.field5124.field2017[0], (byte) -122, class70.field1339, false, class184.field3188, class16.field254);
        } else if (class308.field5211 != class16.field254) {
            class308.field5211 = class16.field254;
            class29.method251(2, class16.field254);
            class122.method867(1104);
        }
    }
}
