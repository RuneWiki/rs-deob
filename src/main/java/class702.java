import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class702 {

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    private int field9301;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[[I")
    private int[][] field9295;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    private int field9293;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Ljb;")
    public static class519 field9297 = new class519(25, 8);

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "J")
    public static long field9305 = -1L;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "[F")
    public static float[] field9304 = new float[4];

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "F")
    public static float field9306;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[S)[S", line = 4)
    public final short[] method3827(int arg0, short[] arg1) {
        if (this.field9295 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9301 / (long) this.field9293) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field9295[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field9301 + var6;
                int var14 = var13 / this.field9293;
                var5 += var14;
                var6 = var13 - this.field9293 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg1[var8] = (short) var9;
                } else {
                    arg1[var8] = 32767;
                }
            }
        }
        if (arg0 != 0) {
            method3829(-100, 0, -35, 2);
        }
        field9298++;
        return arg1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILtd;II)V", line = 72)
    public static final void method3828(int arg0, class478 arg1, int arg2, int arg3) {
        field9294++;
        if (arg0 != 2) {
            field9303 = -82;
        }
        if (arg1 == null || class645.field8695.field1194 == arg1) {
            return;
        }
        int var4 = arg1.field6712;
        int var5 = arg1.field6713;
        int var6 = arg1.field6718;
        int var7 = (int) arg1.field6719;
        long var8 = arg1.field6719;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 21) {
            class758 var10 = class84.field1204[var7];
            if (var10 != null) {
                class153.field2062 = 0;
                class82.field1160++;
                class523.field7269 = arg3;
                class269.field3922 = arg2;
                class780.field10713 = 2;
                class43 var11 = class492.method2903(class309.field4382, arg0 ^ 0x2, class73.field983);
                var11.field457.method1713((byte) -102, var7);
                var11.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, 113);
                class409.method2457((byte) -100, var11);
                class307.method1985(-2, var10.field6198[0], var10.method2563(-12840), var10.method2563(arg0 ^ 0xFFFFCDDA), 0, true, 0, var10.field6197[0], true);
            }
        }
        if (var6 == 48) {
            class758 var12 = class84.field1204[var7];
            if (var12 != null) {
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class24.field243++;
                class43 var13 = class492.method2903(class201.field2620, 0, class73.field983);
                var13.field457.method1718((byte) -34, var7);
                var13.field457.method1681((byte) -110, class235.field3128.method983(101, 82) ? 1 : 0);
                class409.method2457((byte) -100, var13);
                class307.method1985(-2, var12.field6198[0], var12.method2563(-12840), var12.method2563(-12840), 0, true, 0, var12.field6197[0], true);
            }
        }
        if (var6 == 1012) {
            class523.field7269 = arg3;
            class780.field10713 = 2;
            class437.field6318++;
            class153.field2062 = 0;
            class269.field3922 = arg2;
            class43 var14 = class492.method2903(class76.field1048, 0, class73.field983);
            var14.field457.method1733(var7, -32466);
            class409.method2457((byte) -100, var14);
        }
        if (var6 == 11) {
            class523.field7269 = arg3;
            class153.field2062 = 0;
            class780.field10713 = 2;
            class777.field10676++;
            class269.field3922 = arg2;
            class43 var15 = class492.method2903(class177.field2339, arg0 ^ 0x2, class73.field983);
            var15.field457.method1718((byte) -34, var7);
            var15.field457.method1713((byte) -61, class259.field3849 + var5);
            var15.field457.method1718((byte) -34, class120.field1625 + var4);
            var15.field457.method1715(arg0 ^ 0xFFFFFF82, class235.field3128.method983(101, 82) ? 1 : 0);
            class409.method2457((byte) -100, var15);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 4) {
            class523.field7269 = arg3;
            class269.field3922 = arg2;
            class543.field7515++;
            class153.field2062 = 0;
            class780.field10713 = 2;
            class43 var16 = class492.method2903(class434.field6260, 0, class73.field983);
            var16.field457.method1697(class259.field3849 + var5, true);
            var16.field457.method1733(var4 + class120.field1625, -32466);
            var16.field457.method1686(-92, class294.field4170);
            var16.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -125);
            var16.field457.method1713((byte) -58, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var16.field457.method1697(class658.field8875, true);
            var16.field457.method1697(class634.field8567, true);
            class409.method2457((byte) -100, var16);
            class250.method1633(var8, var4, var5, 0);
        }
        if (var6 == 3) {
            class153.field2062 = 0;
            class780.field10713 = 1;
            class455.field6517++;
            class269.field3922 = arg2;
            class523.field7269 = arg3;
            class43 var17 = class492.method2903(class198.field2562, 0, class73.field983);
            var17.field457.method1690(-516533072, class294.field4170);
            var17.field457.method1713((byte) -75, class634.field8567);
            var17.field457.method1697(class658.field8875, true);
            var17.field457.method1697(class259.field3849 + var5, true);
            var17.field457.method1697(class120.field1625 + var4, true);
            class409.method2457((byte) -100, var17);
            class307.method1985(-4, var4, 1, 1, 0, true, 0, var5, true);
        }
        if (var6 == 44) {
            class758 var18 = class84.field1204[var7];
            if (var18 != null) {
                class269.field3922 = arg2;
                class153.field2062 = 0;
                class780.field10713 = 2;
                class523.field7269 = arg3;
                class706.field9651++;
                class43 var19 = class492.method2903(class723.field9818, arg0 ^ 0x2, class73.field983);
                var19.field457.method1713((byte) -124, var7);
                var19.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -128);
                class409.method2457((byte) -100, var19);
                class307.method1985(-2, var18.field6198[0], var18.method2563(-12840), var18.method2563(arg0 - 12842), 0, true, 0, var18.field6197[0], true);
            }
        }
        if (var6 == 6) {
            class780.field10713 = 2;
            class282.field4072++;
            class153.field2062 = 0;
            class523.field7269 = arg3;
            class269.field3922 = arg2;
            class43 var20 = class492.method2903(class408.field5777, 0, class73.field983);
            var20.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -123);
            var20.field457.method1697(class120.field1625 + var4, true);
            var20.field457.method1713((byte) -113, var5 + class259.field3849);
            var20.field457.method1713((byte) -62, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class409.method2457((byte) -100, var20);
            class250.method1633(var8, var4, var5, 0);
        }
        if (var6 == 1003) {
            class523.field7269 = arg3;
            class269.field3922 = arg2;
            class74.field1009++;
            class153.field2062 = 0;
            class780.field10713 = 2;
            class43 var21 = class492.method2903(class291.field4155, 0, class73.field983);
            var21.field457.method1733(var7, -32466);
            class409.method2457((byte) -100, var21);
        }
        if (var6 == 10) {
            class153.field2062 = 0;
            class523.field7269 = arg3;
            class780.field10713 = 2;
            class426.field6203++;
            class269.field3922 = arg2;
            class43 var22 = class492.method2903(class737.field10004, 0, class73.field983);
            var22.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, 37);
            var22.field457.method1686(arg0 + 54, class294.field4170);
            var22.field457.method1733(class658.field8875, -32466);
            var22.field457.method1718((byte) -34, class625.field8475.field6146);
            var22.field457.method1697(class634.field8567, true);
            class409.method2457((byte) -100, var22);
        }
        if (var6 == 53) {
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class338.field4743++;
            class153.field2062 = 0;
            class523.field7269 = arg3;
            class43 var23 = class492.method2903(class254.field3733, 0, class73.field983);
            var23.field457.method1733((int) (var8 >>> 32) & Integer.MAX_VALUE, -32466);
            var23.field457.method1733(var4 + class120.field1625, -32466);
            var23.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -128);
            var23.field457.method1718((byte) -34, class259.field3849 + var5);
            class409.method2457((byte) -100, var23);
            class250.method1633(var8, var4, var5, arg0 ^ 0x2);
        }
        if (var6 == 47) {
            class758 var24 = class84.field1204[var7];
            if (var24 != null) {
                class82.field1160++;
                class269.field3922 = arg2;
                class780.field10713 = 2;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class43 var25 = class492.method2903(class770.field10598, 0, class73.field983);
                var25.field457.method1713((byte) -106, var7);
                var25.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, 110);
                class409.method2457((byte) -100, var25);
                class307.method1985(-2, var24.field6198[0], var24.method2563(-12840), var24.method2563(-12840), 0, true, 0, var24.field6197[0], true);
            }
        }
        if (var6 == 1006 || var6 == 1007 || var6 == 1010 || var6 == 1011 || var6 == 1001) {
            class520.method3028(var7, arg0 ^ 0xFFFFFC0F, var4, var6);
        }
        if (var6 == 50) {
            class316 var26 = (class316) class176.field2326.method1248(arg0 ^ 0x54, (long) var7);
            if (var26 != null) {
                class269.field3922 = arg2;
                class523.field7269 = arg3;
                class22 var27 = var26.field4455;
                class780.field10713 = 2;
                class153.field2062 = 0;
                class420.field6051++;
                class43 var28 = class492.method2903(class586.field7975, 0, class73.field983);
                var28.field457.method1713((byte) -56, var7);
                var28.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -126);
                class409.method2457((byte) -100, var28);
                class307.method1985(-2, var27.field6198[0], var27.method2563(-12840), var27.method2563(-12840), 0, true, 0, var27.field6197[0], true);
            }
        }
        if (var6 == 45) {
            class316 var29 = (class316) class176.field2326.method1248(arg0 + 108, (long) var7);
            if (var29 != null) {
                class22 var30 = var29.field4455;
                class523.field7269 = arg3;
                class269.field3922 = arg2;
                class153.field2062 = 0;
                class780.field10713 = 2;
                class276.field3999++;
                class43 var31 = class492.method2903(class489.field6821, arg0 - 2, class73.field983);
                var31.field457.method1697(var7, true);
                var31.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, arg0 ^ 0x6E);
                class409.method2457((byte) -100, var31);
                class307.method1985(-2, var30.field6198[0], var30.method2563(-12840), var30.method2563(-12840), 0, true, 0, var30.field6197[0], true);
            }
        }
        if (var6 == 9) {
            if (class479.field6726 > 0 && class235.field3128.method983(101, 82) && class235.field3128.method983(101, 81)) {
                class537.method3117(class625.field8475.field2813, class120.field1625 + var4, -15913, class259.field3849 + var5);
            } else {
                class153.field2062 = 0;
                class73.field982++;
                class523.field7269 = arg3;
                class269.field3922 = arg2;
                class780.field10713 = 1;
                class43 var32 = class492.method2903(class148.field1988, 0, class73.field983);
                var32.field457.method1718((byte) -34, class120.field1625 + var4);
                var32.field457.method1697(class259.field3849 + var5, true);
                class409.method2457((byte) -100, var32);
            }
        }
        if (var6 == 57) {
            class347 var33 = class90.method717(var5, var4, (byte) -42);
            if (var33 != null) {
                class318.method2060(arg0 ^ 0xFFFFFFFD, var33);
            }
        }
        if (var6 == 59) {
            class758 var34 = class84.field1204[var7];
            if (var34 != null) {
                class585.field7971++;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class43 var35 = class492.method2903(class709.field9698, 0, class73.field983);
                var35.field457.method1681((byte) -105, class235.field3128.method983(101, 82) ? 1 : 0);
                var35.field457.method1713((byte) -75, var7);
                class409.method2457((byte) -100, var35);
                class307.method1985(-2, var34.field6198[0], var34.method2563(-12840), var34.method2563(-12840), 0, true, 0, var34.field6197[0], true);
            }
        }
        if (var6 == 8) {
            if (class479.field6726 > 0 && class235.field3128.method983(101, 82) && class235.field3128.method983(101, 81)) {
                class537.method3117(class625.field8475.field2813, class120.field1625 + var4, -15913, class259.field3849 + var5);
            } else {
                class43 var36 = class279.method1826(var5, arg0 ^ 0xFFFF8BE3, var4, var7);
                if (var7 == 1) {
                    var36.field457.method1725(-1, 117);
                    var36.field457.method1725(-1, 60);
                    var36.field457.method1733((int) class514.field7144, -32466);
                    var36.field457.method1725(57, arg0 + 59);
                    var36.field457.method1725(class551.field7614, arg0 ^ 0x3E);
                    var36.field457.method1725(class767.field10544, 77);
                    var36.field457.method1725(89, 114);
                    var36.field457.method1733(class625.field8475.field2802, -32466);
                    var36.field457.method1733(class625.field8475.field2810, arg0 - 32468);
                    var36.field457.method1725(63, 81);
                } else {
                    class523.field7269 = arg3;
                    class269.field3922 = arg2;
                    class153.field2062 = 0;
                    class780.field10713 = 1;
                }
                class409.method2457((byte) -100, var36);
                class307.method1985(-4, var4, 1, 1, 0, true, 0, var5, true);
            }
        }
        if (var6 == 13) {
            class316 var37 = (class316) class176.field2326.method1248(120, (long) var7);
            if (var37 != null) {
                class22 var38 = var37.field4455;
                class153.field2062 = 0;
                class269.field3922 = arg2;
                class536.field7434++;
                class523.field7269 = arg3;
                class780.field10713 = 2;
                class43 var39 = class492.method2903(class618.field8334, arg0 ^ 0x2, class73.field983);
                var39.field457.method1713((byte) -70, class658.field8875);
                var39.field457.method1718((byte) -34, var7);
                var39.field457.method1715(arg0 ^ 0xFFFFFF82, class235.field3128.method983(101, 82) ? 1 : 0);
                var39.field457.method1690(-516533072, class294.field4170);
                var39.field457.method1713((byte) -83, class634.field8567);
                class409.method2457((byte) -100, var39);
                class307.method1985(-2, var38.field6198[0], var38.method2563(-12840), var38.method2563(arg0 - 12842), 0, true, 0, var38.field6197[0], true);
            }
        }
        if (var6 == 49) {
            class523.field7269 = arg3;
            class269.field3922 = arg2;
            class780.field10713 = 2;
            class153.field2062 = 0;
            class325.field4614++;
            class43 var40 = class492.method2903(class239.field3166, 0, class73.field983);
            var40.field457.method1713((byte) -100, var5 + class259.field3849);
            var40.field457.method1697(class658.field8875, true);
            var40.field457.method1697(var7, true);
            var40.field457.method1718((byte) -34, class634.field8567);
            var40.field457.method1685(class294.field4170, (byte) 119);
            var40.field457.method1681((byte) -98, class235.field3128.method983(101, 82) ? 1 : 0);
            var40.field457.method1733(class120.field1625 + var4, -32466);
            class409.method2457((byte) -100, var40);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 51) {
            class153.field2062 = 0;
            class523.field7269 = arg3;
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class173.field2290++;
            class43 var41 = class492.method2903(class540.field7478, 0, class73.field983);
            var41.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -119);
            var41.field457.method1713((byte) -66, class120.field1625 + var4);
            var41.field457.method1718((byte) -34, class259.field3849 + var5);
            var41.field457.method1718((byte) -34, var7);
            class409.method2457((byte) -100, var41);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 1008) {
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class153.field2062 = 0;
            class440.field6331++;
            class523.field7269 = arg3;
            class43 var42 = class492.method2903(class784.field10787, 0, class73.field983);
            var42.field457.method1733(var4 + class120.field1625, -32466);
            var42.field457.method1681((byte) -91, class235.field3128.method983(101, 82) ? 1 : 0);
            var42.field457.method1718((byte) -34, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var42.field457.method1713((byte) -106, var5 + class259.field3849);
            class409.method2457((byte) -100, var42);
            class250.method1633(var8, var4, var5, 0);
        }
        if (var6 == 46) {
            class758 var43 = class84.field1204[var7];
            if (var43 != null) {
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class269.field3922 = arg2;
                class780.field10713 = 2;
                class414.field5953++;
                class43 var44 = class492.method2903(class584.field7957, 0, class73.field983);
                var44.field457.method1713((byte) -66, var7);
                var44.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -118);
                class409.method2457((byte) -100, var44);
                class307.method1985(-2, var43.field6198[0], var43.method2563(-12840), var43.method2563(-12840), 0, true, 0, var43.field6197[0], true);
            }
        }
        if (var6 == 23) {
            class523.field7269 = arg3;
            class464.field6580++;
            class269.field3922 = arg2;
            class153.field2062 = 0;
            class780.field10713 = 2;
            class43 var45 = class492.method2903(class549.field7579, arg0 ^ 0x2, class73.field983);
            var45.field457.method1733(var7, -32466);
            var45.field457.method1718((byte) -34, class259.field3849 + var5);
            var45.field457.method1681((byte) -103, class235.field3128.method983(101, 82) ? 1 : 0);
            var45.field457.method1713((byte) -103, class120.field1625 + var4);
            class409.method2457((byte) -100, var45);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 2) {
            class758 var46 = class84.field1204[var7];
            if (var46 != null) {
                class641.field8638++;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class43 var47 = class492.method2903(class397.field5691, 0, class73.field983);
                var47.field457.method1713((byte) -86, var7);
                var47.field457.method1681((byte) -80, class235.field3128.method983(101, 82) ? 1 : 0);
                class409.method2457((byte) -100, var47);
                class307.method1985(-2, var46.field6198[0], var46.method2563(-12840), var46.method2563(-12840), 0, true, 0, var46.field6197[0], true);
            }
        }
        if (var6 == 1009) {
            class269.field3922 = arg2;
            class780.field10713 = 2;
            class523.field7269 = arg3;
            class153.field2062 = 0;
            class316 var48 = (class316) class176.field2326.method1248(104, (long) var7);
            if (var48 != null) {
                class22 var49 = var48.field4455;
                class304 var50 = var49.field217;
                if (var50.field4295 != null) {
                    var50 = var50.method1968(class480.field6740, -1);
                }
                if (var50 != null) {
                    class183.field2410++;
                    class43 var51 = class492.method2903(class261.field3860, arg0 - 2, class73.field983);
                    var51.field457.method1733(var50.field4272, -32466);
                    class409.method2457((byte) -100, var51);
                }
            }
        }
        if (var6 == 20) {
            class316 var52 = (class316) class176.field2326.method1248(103, (long) var7);
            if (var52 != null) {
                class22 var53 = var52.field4455;
                class54.field640++;
                class523.field7269 = arg3;
                class780.field10713 = 2;
                class153.field2062 = 0;
                class269.field3922 = arg2;
                class43 var54 = class492.method2903(class107.field1508, arg0 - 2, class73.field983);
                var54.field457.method1733(var7, -32466);
                var54.field457.method1681((byte) -89, class235.field3128.method983(101, 82) ? 1 : 0);
                class409.method2457((byte) -100, var54);
                class307.method1985(-2, var53.field6198[0], var53.method2563(-12840), var53.method2563(-12840), 0, true, 0, var53.field6197[0], true);
            }
        }
        if (var6 == 30) {
            class758 var55 = class84.field1204[var7];
            if (var55 != null) {
                class153.field2062 = 0;
                class780.field10713 = 2;
                class426.field6203++;
                class269.field3922 = arg2;
                class523.field7269 = arg3;
                class43 var56 = class492.method2903(class737.field10004, 0, class73.field983);
                var56.field457.method1725(class235.field3128.method983(101, 82) ? 1 : 0, 112);
                var56.field457.method1686(87, class294.field4170);
                var56.field457.method1733(class658.field8875, -32466);
                var56.field457.method1718((byte) -34, var7);
                var56.field457.method1697(class634.field8567, true);
                class409.method2457((byte) -100, var56);
                class307.method1985(-2, var55.field6198[0], var55.method2563(-12840), var55.method2563(-12840), 0, true, 0, var55.field6197[0], true);
            }
        }
        if (var6 == 16 && class186.field2440 == null) {
            class45.method301(var5, (byte) -72, var4);
            class186.field2440 = class90.method717(var5, var4, (byte) -42);
            class151.method1062((byte) -111, class186.field2440);
        }
        if (var6 == 58) {
            class316 var57 = (class316) class176.field2326.method1248(arg0 + 112, (long) var7);
            if (var57 != null) {
                class22 var58 = var57.field4455;
                class351.field5118++;
                class269.field3922 = arg2;
                class780.field10713 = 2;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class43 var59 = class492.method2903(class597.field8123, arg0 ^ 0x2, class73.field983);
                var59.field457.method1713((byte) -101, var7);
                var59.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -108);
                class409.method2457((byte) -100, var59);
                class307.method1985(-2, var58.field6198[0], var58.method2563(-12840), var58.method2563(arg0 ^ 0xFFFFCDDA), 0, true, 0, var58.field6197[0], true);
            }
        }
        if (var6 == 18) {
            class153.field2062 = 0;
            class283.field4081++;
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class523.field7269 = arg3;
            class43 var60 = class492.method2903(class710.field9706, 0, class73.field983);
            var60.field457.method1733(var4 + class120.field1625, -32466);
            var60.field457.method1733(class259.field3849 + var5, -32466);
            var60.field457.method1697(var7, true);
            var60.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -126);
            class409.method2457((byte) -100, var60);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 52) {
            class758 var61 = class84.field1204[var7];
            if (var61 != null) {
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class182.field2388++;
                class153.field2062 = 0;
                class523.field7269 = arg3;
                class43 var62 = class492.method2903(class132.field1817, 0, class73.field983);
                var62.field457.method1733(var7, -32466);
                var62.field457.method1681((byte) -128, class235.field3128.method983(101, 82) ? 1 : 0);
                class409.method2457((byte) -100, var62);
                class307.method1985(-2, var61.field6198[0], var61.method2563(-12840), var61.method2563(arg0 ^ 0xFFFFCDDA), 0, true, 0, var61.field6197[0], true);
            }
        }
        if (var6 == 17) {
            class347 var63 = class90.method717(var5, var4, (byte) -42);
            if (var63 != null) {
                class579.method3278(-1);
                class327 var64 = client.method2055(var63);
                class485.method2839(var64.field4640, var63, (byte) -107, var64.method2114(-117));
                class385.field5594 = class87.method699(arg0 ^ 0xFFFFB61A, var63);
                if (class385.field5594 == null) {
                    class385.field5594 = "Null";
                }
                class545.field7534 = var63.field5036 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 60) {
            class780.field10713 = 2;
            class546.field7541++;
            class153.field2062 = 0;
            class269.field3922 = arg2;
            class523.field7269 = arg3;
            class43 var65 = class492.method2903(class647.field8724, 0, class73.field983);
            var65.field457.method1733(class259.field3849 + var5, -32466);
            var65.field457.method1681((byte) -111, class235.field3128.method983(101, 82) ? 1 : 0);
            var65.field457.method1718((byte) -34, class120.field1625 + var4);
            var65.field457.method1733((int) (var8 >>> 32) & Integer.MAX_VALUE, -32466);
            class409.method2457((byte) -100, var65);
            class250.method1633(var8, var4, var5, 0);
        }
        if (var6 == 25) {
            class107.field1499++;
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class523.field7269 = arg3;
            class153.field2062 = 0;
            class43 var66 = class492.method2903(class166.field2198, 0, class73.field983);
            var66.field457.method1697((int) (var8 >>> 32) & Integer.MAX_VALUE, true);
            var66.field457.method1718((byte) -34, class259.field3849 + var5);
            var66.field457.method1713((byte) -71, class120.field1625 + var4);
            var66.field457.method1732(class235.field3128.method983(101, 82) ? 1 : 0, (byte) -109);
            class409.method2457((byte) -100, var66);
            class250.method1633(var8, var4, var5, 0);
        }
        if (var6 == 22) {
            class316 var67 = (class316) class176.field2326.method1248(107, (long) var7);
            if (var67 != null) {
                class435.field6268++;
                class22 var68 = var67.field4455;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class43 var69 = class492.method2903(class562.field7699, 0, class73.field983);
                var69.field457.method1715(-128, class235.field3128.method983(101, 82) ? 1 : 0);
                var69.field457.method1697(var7, true);
                class409.method2457((byte) -100, var69);
                class307.method1985(-2, var68.field6198[0], var68.method2563(-12840), var68.method2563(-12840), 0, true, 0, var68.field6197[0], true);
            }
        }
        if (var6 == 12) {
            class153.field2062 = 0;
            class780.field10713 = 2;
            class269.field3922 = arg2;
            class462.field6568++;
            class523.field7269 = arg3;
            class43 var70 = class492.method2903(class211.field2709, 0, class73.field983);
            var70.field457.method1715(-128, class235.field3128.method983(101, 82) ? 1 : 0);
            var70.field457.method1718((byte) -34, class120.field1625 + var4);
            var70.field457.method1713((byte) -57, var7);
            var70.field457.method1733(class259.field3849 + var5, -32466);
            class409.method2457((byte) -100, var70);
            class251.method1648((byte) 82, var4, var5);
        }
        if (var6 == 19 || var6 == 1002) {
            class711.method3947(arg0 ^ 0x5A, var4, var5, arg1.field6720, var7);
        }
        if (var6 == 15) {
            class758 var71 = class84.field1204[var7];
            if (var71 != null) {
                class777.field10679++;
                class523.field7269 = arg3;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class153.field2062 = 0;
                class43 var72 = class492.method2903(class770.field10601, 0, class73.field983);
                var72.field457.method1697(var7, true);
                var72.field457.method1681((byte) -63, class235.field3128.method983(101, 82) ? 1 : 0);
                class409.method2457((byte) -100, var72);
                class307.method1985(-2, var71.field6198[0], var71.method2563(-12840), var71.method2563(-12840), 0, true, 0, var71.field6197[0], true);
            }
        }
        if (var6 == 5) {
            class758 var73 = class84.field1204[var7];
            if (var73 != null) {
                class82.field1160++;
                class523.field7269 = arg3;
                class153.field2062 = 0;
                class780.field10713 = 2;
                class269.field3922 = arg2;
                class43 var74 = class492.method2903(class107.field1503, 0, class73.field983);
                var74.field457.method1681((byte) -117, class235.field3128.method983(101, 82) ? 1 : 0);
                var74.field457.method1733(var7, arg0 - 32468);
                class409.method2457((byte) -100, var74);
                class307.method1985(-2, var73.field6198[0], var73.method2563(-12840), var73.method2563(arg0 - 12842), 0, true, 0, var73.field6197[0], true);
            }
        }
        if (class506.field7094) {
            class579.method3278(-1);
        }
        if (class676.field9054 != null && class562.field7700 == 0) {
            class151.method1062((byte) -105, class676.field9054);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)I", line = 917)
    public static final int method3829(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field9300++;
        if (var4 == 0) {
            return arg1;
        } else if (~var4 == arg0) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[B)[B", line = 940)
    public final byte[] method3830(int arg0, byte[] arg1) {
        if (arg0 != -7977) {
            this.method3830(-26, null);
        }
        if (this.field9295 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9301 / (long) this.field9293) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field9295[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field9301 + var6;
                int var14 = var13 / this.field9293;
                var5 += var14;
                var6 = var13 - this.field9293 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field9299++;
        return arg1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 1015)
    public static final void method3831(byte arg0) {
        field9296++;
        int var1 = 0;
        if (arg0 < 89) {
            return;
        }
        while (class10.field118 > var1) {
            label161: {
                class183 var3 = class642.field8649[var1];
                boolean var4 = false;
                if (var3.field2396 == null) {
                    var3.field2402--;
                    if (var3.field2402 >= (var3.method1238(0) ? -1500 : -10)) {
                        if (var3.field2412 == 1 && var3.field2404 == null) {
                            var3.field2404 = class633.method3490(class54.field643, var3.field2398, 0);
                            if (var3.field2404 == null) {
                                break label161;
                            }
                            var3.field2402 += var3.field2404.method3493();
                        } else if (var3.method1238(0) && (var3.field2409 == null || var3.field2403 == null)) {
                            if (var3.field2409 == null) {
                                var3.field2409 = class590.method3321(class8.field74, var3.field2398);
                            }
                            if (var3.field2409 == null) {
                                break label161;
                            }
                            if (var3.field2403 == null) {
                                var3.field2403 = var3.field2409.method3315(new int[] { 22050 });
                                if (var3.field2403 == null) {
                                    break label161;
                                }
                            }
                        }
                        if (var3.field2402 < 0) {
                            int var5 = 8192;
                            int var7;
                            if (var3.field2401 == 0) {
                                var7 = var3.field2407 * (var3.field2412 == 3 ? class125.field1721.field5138.method1871(43) : class125.field1721.field5176.method1871(43)) >> 2;
                            } else {
                                int var6 = (var3.field2401 & 0x35BBD89) >> 24;
                                if (class625.field8475.field2813 == var6) {
                                    int var8 = (var3.field2401 & 0xFF) << 9;
                                    int var9 = class625.field8475.method2563(-12840) << 8;
                                    int var10 = (var3.field2401 & 0xFFC735) >> 16;
                                    int var11 = (var10 << 9) + var9 + 256 - class625.field8475.field2802;
                                    int var12 = (var3.field2401 & 0xFF7E) >> 8;
                                    int var13 = (var12 << 9) - (-var9 - 256) - class625.field8475.field2810;
                                    int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                    if (var8 < var14) {
                                        var3.field2402 = -99999;
                                        break label161;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var7 = (var8 - var14) * class125.field1721.field5169.method1871(43) * var3.field2407 / var8 >> 2;
                                    if (var3.field2399 != null && var3.field2399 instanceof class539) {
                                        class539 var15 = (class539) var3.field2399;
                                        short var16 = var15.field7467;
                                        short var17 = var15.field7466;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = -class41.field442 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                        if (var18 > 8192) {
                                            var18 = 16384 - var18;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (var14 < 4096) {
                                            var19 = (8192 - var14) / 4096 + 8192;
                                        } else {
                                            var19 = 16384;
                                        }
                                        var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                    }
                                } else {
                                    var7 = 0;
                                }
                            }
                            if (var7 > 0) {
                                class78 var20 = null;
                                if (var3.field2412 == 1) {
                                    var20 = var3.field2404.method3492().method631(class548.field7564);
                                } else if (var3.method1238(0)) {
                                    var20 = var3.field2403;
                                }
                                class296 var21 = var3.field2396 = class296.method1925(var20, var3.field2395, var7, var5);
                                var21.method1907(var3.field2408 - 1);
                                class701.field9285.method21(var21);
                            }
                        }
                    } else {
                        var4 = true;
                    }
                } else if (!var3.field2396.method1104(3)) {
                    var4 = true;
                }
                if (var4) {
                    class10.field118--;
                    for (int var22 = var1; var22 < class10.field118; var22++) {
                        class642.field8649[var22] = class642.field8649[var22 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        if (class72.field973 && !class81.method647(-3610)) {
            if (class125.field1721.field5173.method1871(43) != 0 && class264.field3886 != -1) {
                if (class757.field10247 == null) {
                    class414.method2491(0, class66.field917, false, 11889, class125.field1721.field5173.method1871(43), class264.field3886);
                } else {
                    class281.method1835(class757.field10247, -23703, class125.field1721.field5173.method1871(43), false, class264.field3886, class66.field917, 0);
                }
            }
            class757.field10247 = null;
            class72.field973 = false;
        } else if (class125.field1721.field5173.method1871(43) != 0 && class264.field3886 != -1 && !class81.method647(-3610)) {
            class655.field8840++;
            class43 var2 = class492.method2903(class192.field2496, 0, class73.field983);
            var2.field457.method1686(-114, class264.field3886);
            class409.method2457((byte) -100, var2);
            class264.field3886 = -1;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 1233)
    public static void method3832(int arg0) {
        field9304 = null;
        if (arg0 != 0) {
            method3828(64, null, -8, -92);
        }
        field9297 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I", line = 1244)
    public final int method3833(int arg0, boolean arg1) {
        if (!arg1) {
            method3832(-37);
        }
        if (this.field9295 != null) {
            arg0 = (int) ((long) this.field9301 * (long) arg0 / (long) this.field9293);
        }
        field9292++;
        return arg0;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V", line = 1260)
    public class702(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class97.method763(arg1, 20222, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field9301 = var5;
            this.field9295 = new int[var4][14];
            this.field9293 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field9295[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)I", line = 1321)
    public final int method3834(int arg0, byte arg1) {
        if (this.field9295 != null) {
            arg0 = (int) ((long) this.field9301 * (long) arg0 / (long) this.field9293) + 6;
        }
        int var3 = 56 % ((arg1 + 1) / 59);
        field9302++;
        return arg0;
    }
}
