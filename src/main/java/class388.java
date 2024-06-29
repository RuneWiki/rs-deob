import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class388 {

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    private int[] field5463;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5458 = 20;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lik;")
    public static class410 field5462 = new class410(5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lbi;")
    public static class139 field5461;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILcc;)V")
    public static final void method2398(int arg0, class338 arg1) {
        if (arg0 != 7727) {
            field5462 = null;
        }
        field5459++;
        class417 var2 = (class417) class218.field3018.method614(arg0 ^ 0xFFFFE1AF, (long) arg1.field4957);
        if (var2 == null) {
            class199.method1410((class127) null, arg1.field5005[0], class69.field1046, arg1, (class372) null, arg0 ^ 0x1E2E, arg1.field4998[0], 0);
        } else {
            var2.method2584((byte) 94);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method2399(int arg0) {
        field5462 = null;
        field5461 = null;
        if (arg0 != 0) {
            method2400(true, 73);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([I)V")
    public class388(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field5463 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5463[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5463[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field5463[var5 + var5] = arg0[var4];
            this.field5463[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
    public static final void method2400(boolean arg0, int arg1) {
        if (arg1 != -28390) {
            method2398(113, (class338) null);
        }
        class179.field2627 = arg0;
        field5460++;
        if (!class179.field2627) {
            int var2 = class417.field5851.method1828((byte) -68);
            int var3 = class417.field5851.method1873(arg1 ^ 0x4E3D);
            boolean var4 = class417.field5851.method1840((byte) -44) == 1;
            int var5 = class417.field5851.method1853(-26);
            int var6 = class417.field5851.method1825(-65);
            int var7 = class417.field5851.method1861((byte) -72);
            int var8 = class417.field5851.method1852((byte) -21);
            int var9 = (class213.field2961 - class417.field5851.field3938) / 16;
            class392.field5495 = new int[var9][4];
            for (int var10 = 0; var10 < var9; var10++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class392.field5495[var10][var16] = class417.field5851.method1832(arg1 + 28286);
                }
            }
            class316.method2015(29770, var7);
            class213.field2962 = new int[var9];
            class276.field3714 = null;
            class431.field6130 = new int[var9];
            class438.field6251 = new int[var9];
            class192.field2760 = new byte[var9][];
            class150.field2296 = new int[var9];
            class329.field4474 = new byte[var9][];
            class101.field1500 = new int[var9];
            class360.field4894 = new byte[var9][];
            class227.field3138 = null;
            class263.field3536 = new byte[var9][];
            boolean var11 = false;
            if (((var6 / 8) == 48 || (var6 / 8) == 49) && var3 / 8 == 48) {
                var11 = true;
            }
            if ((var6 / 8) == 48 && var3 / 8 == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var6 - (class116.field1621 >> 4)) / 8; var13 <= ((class116.field1621 >> 4) + var6) / 8; var13++) {
                for (int var14 = (var3 - (class385.field5425 >> 4)) / 8; var14 <= ((class385.field5425 >> 4) + var3) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class101.field1500[var12] = var15;
                        class213.field2962[var12] = -1;
                        class438.field6251[var12] = -1;
                        class150.field2296[var12] = -1;
                        class431.field6130[var12] = -1;
                    } else {
                        class101.field1500[var12] = var15;
                        class213.field2962[var12] = class23.field417.method2643("m" + var13 + "_" + var14, -1);
                        class438.field6251[var12] = class23.field417.method2643("l" + var13 + "_" + var14, -1);
                        class150.field2296[var12] = class23.field417.method2643("um" + var13 + "_" + var14, -1);
                        class431.field6130[var12] = class23.field417.method2643("ul" + var13 + "_" + var14, class331.method2109(arg1, 28389));
                    }
                    var12++;
                }
            }
            class257.method1673(var5, false, var4, var3, true, var6, var8, var2);
            return;
        }
        int var17 = class417.field5851.method1853(-87);
        int var18 = class417.field5851.method1828((byte) -89);
        boolean var19 = class417.field5851.method1840((byte) -97) == 1;
        int var20 = class417.field5851.method1840((byte) -81);
        int var21 = class417.field5851.method1828((byte) -40);
        int var22 = class417.field5851.method1853(arg1 ^ 0x6ED5);
        int var23 = class417.field5851.method1829(arg1 + 52575);
        class316.method2015(arg1 ^ 0xFFFFE550, var20);
        class417.field5851.method1810(111);
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var39 = 0; var39 < (class116.field1621 >> 3); var39++) {
                for (int var40 = 0; var40 < class385.field5425 >> 3; var40++) {
                    int var41 = class417.field5851.method1808(1, -11904);
                    if (var41 == 1) {
                        class39.field602[var24][var39][var40] = class417.field5851.method1808(26, -11904);
                    } else {
                        class39.field602[var24][var39][var40] = -1;
                    }
                }
            }
        }
        class417.field5851.method1807(16855);
        int var25 = (class213.field2961 - class417.field5851.field3938) / 16;
        class392.field5495 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var38 = 0; var38 < 4; var38++) {
                class392.field5495[var26][var38] = class417.field5851.method1856((byte) 22);
            }
        }
        class150.field2296 = new int[var25];
        class192.field2760 = new byte[var25][];
        class263.field3536 = new byte[var25][];
        class360.field4894 = new byte[var25][];
        class227.field3138 = null;
        class101.field1500 = new int[var25];
        class438.field6251 = new int[var25];
        class329.field4474 = new byte[var25][];
        class431.field6130 = new int[var25];
        class276.field3714 = null;
        class213.field2962 = new int[var25];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < class116.field1621 >> 3; var29++) {
                for (int var30 = 0; var30 < class385.field5425 >> 3; var30++) {
                    int var31 = class39.field602[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFC02C) >> 14;
                        int var33 = (var31 & 0x3FFC) >> 3;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class101.field1500[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class101.field1500[var27] = var34;
                            int var36 = (var34 & 0xFF2B) >> 8;
                            int var37 = var34 & 0xFF;
                            class213.field2962[var27] = class23.field417.method2643("m" + var36 + "_" + var37, -1);
                            class438.field6251[var27] = class23.field417.method2643("l" + var36 + "_" + var37, -1);
                            class150.field2296[var27] = class23.field417.method2643("um" + var36 + "_" + var37, arg1 + 28389);
                            class431.field6130[var27] = class23.field417.method2643("ul" + var36 + "_" + var37, -1);
                            var27++;
                        }
                    }
                }
            }
        }
        class257.method1673(var22, false, var19, var17, true, var18, var23, var21);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public final int method2401(int arg0, int arg1) {
        int var3 = 124 % ((39 - arg0) / 35);
        field5457++;
        int var4 = (this.field5463.length >> 1) - 1;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field5463[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field5463[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }
}
