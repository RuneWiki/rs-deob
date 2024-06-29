import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class227 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public int field2892 = 0;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field2894 = 0;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lwg;")
    private class58 field2896 = new class58(64);

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Luc;")
    private class259 field2907 = null;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Lkr;")
    private class329 field2898;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Lkr;")
    private class329 field2906;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Luv;")
    public static class3 field2897 = new class3(37, 7);

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field2905 = -1;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "Luv;")
    public static class3 field2908;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field2904;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field2911;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[[S")
    public static short[][] field2910;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V")
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class558.field7819 != null) {
            class558.field7819[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class599.field8649 != null) {
            class599.field8649[arg0][arg1] = (short) arg3;
        }
        if (class596.field8593 != null) {
            class596.field8593[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IC)Z")
    public static final boolean method1435(int arg0, char arg1) {
        field2904++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != -2618) {
            method1436(-114, null, -27);
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILqa;I)Z")
    public static final boolean method1436(int arg0, class167 arg1, int arg2) {
        field2901++;
        int var3 = (class139.field1760 - 104) / 2;
        int var4 = (class369.field5135 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class68.method387(var58, var57, var6, 0, arg2)) {
                        int var59 = var58;
                        if (class291.method1786(var57, (byte) -2, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class260.method1551(var59, var57, (byte) -57, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class179.field2313 = arg1.method976(var7, 0, 512, 512, 512);
        class10.method41((byte) 95);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D))) | 0xFF000000;
        if (arg0 <= 48) {
            return false;
        }
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class257.field3198 + 1][class257.field3198 + 1];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class257.field3198) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class257.field3198) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class257.field3198 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class257.field3198;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method977(0, 0, class257.field3198 * 4 + var37, var38 - -(class257.field3198 * 4));
                arg1.method949(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class257.field3198; var50++) {
                        for (int var56 = 0; var56 <= class257.field3198; var56++) {
                            var12[var50][var56] = class68.method387(var43, var40 + var56, var39 + var50, 0, arg2);
                        }
                    }
                    class50.field672[var43].method885(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class35.field544) {
                        for (int var51 = -4; var51 < class257.field3198; var51++) {
                            for (int var52 = -4; var52 < class257.field3198; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class68.method387(var43, var54, var53, 0, arg2)) {
                                    int var55 = var43;
                                    if (class291.method1786(var54, (byte) -118, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class427.method2504(arg1, var10, var37 + (var51 * 4), var54, var53, var38 + ((class257.field3198 - var52) * 4) - 4, var55, var9, 24762);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class35.field544) {
                    class143 var44 = class15.field154[arg2];
                    for (int var45 = 0; var45 < class257.field3198; var45++) {
                        for (int var46 = 0; var46 < class257.field3198; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field1833[var47 - var44.field1822][var48 - var44.field1839];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method974(-1713569622, 1, 4, var45 * 4 + var37, 4, (class257.field3198 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method967(var38 + ((class257.field3198 - var46) * 4) - 4, -1713569622, -119, var37 + (var45 * 4), 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method998(-1713569622, -32192, 4, var45 * 4 + var37 + 3, var38 - -((class257.field3198 - var46) * 4) - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method967(var38 + ((class257.field3198 - var46) * 4) + 3 - 4, -1713569622, -114, var45 * 4 + var37, 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method998(-1713569622, -32192, 4, var45 * 4 + var37, var38 + -4 - -((-var46 + class257.field3198) * 4));
                            }
                        }
                    }
                }
                arg1.method997(var37, var38, class257.field3198 * 4, class257.field3198 * 4, var11, 2);
                class179.field2313.method620(((var13 - var3) * 4) + 48, 464 - ((-var4 + var36) * 4 + class257.field3198 * 4), class257.field3198 * 4, class257.field3198 * 4, var37, var38);
            }
        }
        arg1.method962();
        arg1.method949(-16777215);
        class145.method794((byte) 123);
        class541.field7568 = 0;
        class344.field4774.method3178(-8299);
        if (!class35.field544) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= (arg2 + 1) && var21 <= 3; var21++) {
                        if (class68.method387(var21, var20, var14, 0, arg2)) {
                            class246 var22 = (class246) class380.method2313(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class246) class49.method273(var21, var14, var20, field2911 == null ? (field2911 = method1441("vaa")) : field2911);
                            }
                            if (var22 == null) {
                                var22 = (class246) class146.method798(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class246) class234.method1474(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class137 var23 = class626.field9084.method1093(0, var22.method52(-17817));
                                if (!var23.field1744 || class502.field6984) {
                                    int var24 = var23.field1699;
                                    if (var23.field1719 != null) {
                                        for (int var25 = 0; var25 < var23.field1719.length; var25++) {
                                            if (var23.field1719[var25] != -1) {
                                                class137 var26 = class626.field9084.method1093(0, var23.field1719[var25]);
                                                if (var26.field1699 >= 0) {
                                                    var24 = var26.field1699;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class297 var28 = class494.field6893.method1544(36, var24);
                                            if (var28 != null && var28.field3896) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class15.field154[var21].field1833;
                                            int var32 = class15.field154[var21].field1822;
                                            int var33 = class15.field154[var21].field1839;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 103 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class199.field2604[class541.field7568] = var23.field1679;
                                        class130.field1607[class541.field7568] = var29;
                                        class207.field2694[class541.field7568] = var30;
                                        class541.field7568++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class438.field5988 != null) {
                class544.field7588.field4528 = 1;
                class494.field6893.method1542(64, false, 1024);
                for (int var15 = 0; var15 < class438.field5988.field1371; var15++) {
                    int var16 = class438.field5988.field1374[var15];
                    if ((var16 >> 28) == class147.field1899.field6358) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class525.field7310;
                        int var18 = (var16 & 0x3FFF) - class58.field786;
                        if (var17 >= 0 && var17 < class139.field1760 && var18 >= 0 && class369.field5135 > var18) {
                            class344.field4774.method3181(new class147(var15), true);
                        } else {
                            class297 var19 = class494.field6893.method1544(36, class438.field5988.field1373[var15]);
                            if (var19.field3858 != null && (var19.field3873 + var17) >= 0 && (var19.field3856 + var17) < class139.field1760 && var18 + var19.field3888 >= 0 && var19.field3887 + var18 < class369.field5135) {
                                class344.field4774.method3181(new class147(var15), true);
                            }
                        }
                    }
                }
                class494.field6893.method1542(64, false, 128);
                class544.field7588.field4528 = 2;
                class544.field7588.method2062(-127);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field2910 = null;
        field2897 = null;
        int var1 = -13 / ((84 - arg0) / 32);
        field2908 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Llda;")
    public final class192 method1438(int arg0, int arg1) {
        field2899++;
        if (arg1 != 2) {
            field2903 = 38;
        }
        class192 var3 = (class192) this.field2896.method323((long) arg0, arg1 ^ 0xFFFFB298);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field2906.method2054(true, 1, arg0);
        } else {
            var4 = this.field2898.method2054(true, 1, arg0 & 0x7FFF);
        }
        class192 var5 = new class192();
        var5.field2486 = this;
        if (var4 != null) {
            var5.method1236(new class551(var4), -1);
        }
        if (arg0 >= 32768) {
            var5.method1234(16568);
        }
        this.field2896.method316((long) arg0, (byte) -112, var5);
        return var5;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lbn;[IJB)Ljava/lang/String;")
    public final String method1439(class371 arg0, int[] arg1, long arg2, byte arg3) {
        field2895++;
        if (arg3 != -75) {
            method1436(113, null, 1);
        }
        if (this.field2907 != null) {
            String var6 = this.field2907.method1550(arg0, arg2, arg1, (byte) 106);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1440(long arg0, int arg1) {
        class345.field4778.setTime(new Date(arg0));
        field2893++;
        if (arg1 != -28715) {
            return null;
        }
        int var3 = class345.field4778.get(7);
        int var4 = class345.field4778.get(5);
        int var5 = class345.field4778.get(2);
        int var6 = class345.field4778.get(1);
        int var7 = class345.field4778.get(11);
        int var8 = class345.field4778.get(12);
        int var9 = class345.field4778.get(13);
        return class319.field4405[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class80.field1077[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILkr;Lkr;Luc;)V")
    public class227(int arg0, class329 arg1, class329 arg2, class259 arg3) {
        this.field2907 = arg3;
        this.field2898 = arg2;
        this.field2906 = arg1;
        if (this.field2906 != null) {
            this.field2892 = this.field2906.method2064(0, 1);
        }
        if (this.field2898 != null) {
            this.field2894 = this.field2898.method2064(0, 1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1441(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class344("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field2909 = 999999;
        field2908 = new class3(6, 4);
    }
}
