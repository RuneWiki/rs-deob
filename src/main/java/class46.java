import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class31 {

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public int field1209 = -1;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public int field1221 = -1;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field1199 = 5;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public int field1206 = 99;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    public int field1224 = -1;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public int field1202 = -1;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public int field1208 = 2;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lid;")
    public static class60 field1203 = class11.method72("sich mit einer anderen Welt zu verbinden)3", (byte) 121);

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1207 = 50;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lid;")
    private static class60 field1214 = class11.method72("Login server offline)3", (byte) 111);

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lid;")
    public static class60 field1213 = class11.method72("b12_full", (byte) -110);

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lid;")
    public static class60 field1226 = field1214;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lid;")
    public static class60 field1210 = class11.method72("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", (byte) -39);

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lpa;")
    public static class105 field1211;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "[I")
    public int[] field1196;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "[I")
    private int[] field1198;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "[I")
    private int[] field1204;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "[I")
    public int[] field1218;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "[I")
    public int[] field1219;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIII)Z")
    public static final boolean method355(byte arg0, int arg1, int arg2, int arg3) {
        field1212++;
        int var4 = arg3 >> 14 & 0x7FFF;
        int var5 = class43.field1151.method577(field1222, arg1, arg2, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class148 var8 = class31.method238(-29628, var4);
            int var9 = var8.field3336;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field3306;
                var11 = var8.field3330;
            } else {
                var10 = var8.field3330;
                var11 = var8.field3306;
            }
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            class78.method634(class107.field2640.field827[0], 0, var10, class107.field2640.field841[0], 2, arg1, true, var9, arg2, -75, 0, var11);
        } else {
            class78.method634(class107.field2640.field827[0], var6 + 1, 0, class107.field2640.field841[0], 2, arg1, true, 0, arg2, -105, var7, 0);
        }
        if (arg0 > -56) {
            method363((byte) -83);
        }
        class121.field2792 = class139.field3174;
        class10.field177 = 0;
        class11.field196 = 2;
        class148.field3369 = class140.field3185;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILof;I)V")
    private final void method356(int arg0, class103 arg1, int arg2) {
        if (arg2 != -5) {
            return;
        }
        field1227++;
        if (arg0 == 1) {
            int var11 = arg1.method808(arg2 ^ 0x4E51);
            this.field1196 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1196[var12] = arg1.method808(-20054);
            }
            this.field1218 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field1218[var13] = arg1.method808(-20054);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field1218[var14] = (arg1.method808(-20054) << 16) + this.field1218[var14];
            }
        } else if (arg0 == 2) {
            this.field1209 = arg1.method808(-20054);
        } else if (arg0 == 3) {
            int var4 = arg1.method829((byte) 117);
            this.field1204 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1204[var5] = arg1.method829((byte) 94);
            }
            this.field1204[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field1201 = true;
        } else if (arg0 == 5) {
            this.field1199 = arg1.method829((byte) 122);
        } else if (arg0 == 6) {
            this.field1224 = arg1.method808(-20054);
        } else if (arg0 == 7) {
            this.field1221 = arg1.method808(-20054);
        } else if (arg0 == 8) {
            this.field1206 = arg1.method829((byte) 125);
        } else if (arg0 == 9) {
            this.field1202 = arg1.method829((byte) 93);
            return;
        } else if (arg0 == 10) {
            this.field1217 = arg1.method829((byte) 101);
            return;
        } else if (arg0 == 11) {
            this.field1208 = arg1.method829((byte) -98);
            return;
        } else if (arg0 == 12) {
            int var6 = arg1.method829((byte) -74);
            this.field1198 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1198[var7] = arg1.method808(-20054);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1198[var8] = (arg1.method808(arg2 - 20049) << 16) + this.field1198[var8];
            }
            return;
        } else if (arg0 == 13) {
            int var9 = arg1.method829((byte) 82);
            this.field1219 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1219[var10] = arg1.method805(3);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILka;)Lka;")
    public final class70 method357(int arg0, int arg1, class70 arg2) {
        field1223++;
        int var4 = this.field1218[arg1];
        class47 var5 = class38.method302(-105, var4 >> 16);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg2.method539(true);
        } else {
            class70 var7 = arg2.method539(!var5.method372(var6, false));
            var7.method540(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lid;")
    public static final class60 method358(int arg0, byte arg1) {
        field1197++;
        class60 var2 = class98.method774((byte) -121, arg0);
        for (int var3 = var2.method447((byte) 39) - 3; var3 > 0; var3 -= 3) {
            var2 = class104.method853(-100, new class60[] { var2.method427(var3, -86, 0), class40.field1010, var2.method421(var3, 0) });
        }
        if (arg1 != 65) {
            field1211 = null;
        }
        if (var2.method447((byte) 39) > 9) {
            return class104.method853(arg1 - 192, new class60[] { class102.field2475, var2.method427(var2.method447((byte) 39) + -8, -51, 0), class45.field1193, class128.field2936, var2, class41.field1094 });
        } else if (var2.method447((byte) 39) > 6) {
            return class104.method853(arg1 ^ 0xFFFFFFDB, new class60[] { class69.field1654, var2.method427(var2.method447((byte) 39) - 4, -44, 0), class74.field1791, class128.field2936, var2, class41.field1094 });
        } else {
            return class104.method853(-105, new class60[] { class141.field3215, var2, class100.field2443 });
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)V")
    public static final void method359(int arg0, byte arg1) {
        field1220++;
        short var2 = 256;
        class157.field3603 += arg0 * 128;
        if (class48.field1263.length < class157.field3603) {
            class157.field3603 -= class48.field1263.length;
            int var3 = (int) (Math.random() * 12.0D);
            class112.method902(false, class146.field3288[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class54.field1357[var4 + var5] - class48.field1263[class157.field3603 + var4 & class48.field1263.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class54.field1357[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class54.field1357[var24 + var25] = 255;
                } else {
                    class54.field1357[var24 + var25] = 0;
                }
            }
        }
        if (class43.field1157 > 0) {
            class43.field1157 -= arg0 * 4;
        }
        if (class128.field2921 > 0) {
            class128.field2921 -= arg0 * 4;
        }
        if (class43.field1157 == 0 && class128.field2921 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 0) {
                class43.field1157 = 1024;
            }
            if (var9 == 1) {
                class128.field2921 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class109.field2657[var10] = class109.field2657[arg0 + var10];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class109.field2657[var11] = (int) (Math.sin((double) class15.field355 / 14.0D) * 16.0D + Math.sin((double) class15.field355 / 15.0D) * 14.0D + Math.sin((double) class15.field355 / 16.0D) * 12.0D);
            class15.field355++;
        }
        class11.field197 += arg0;
        int var12 = ((class82.field2065 & 0x1) + arg0) / 2;
        if (arg1 != 123 || var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class11.field197 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class54.field1357[(var23 << 7) + var22] = 192;
        }
        class11.field197 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class54.field1357[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class54.field1357[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class87.field2188[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class87.field2188[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class87.field2188[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class54.field1357[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLka;I)Lka;")
    public final class70 method360(byte arg0, class70 arg1, int arg2) {
        if (arg0 != 16) {
            field1210 = null;
        }
        field1229++;
        int var4 = this.field1218[arg2];
        class47 var5 = class38.method302(arg0 - 80, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method526(true);
        } else {
            class70 var7 = arg1.method526(!var5.method372(var6, false));
            var7.method540(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lka;IIB)Lka;")
    public final class70 method361(class70 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 57) {
            return null;
        }
        int var5 = this.field1218[arg2];
        field1225++;
        class47 var6 = class38.method302(-79, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method539(true);
        }
        int var8 = arg1 & 0x3;
        class70 var9 = arg0.method539(!var6.method372(var7, false));
        if (var8 == 1) {
            var9.method530();
        } else if (var8 == 2) {
            var9.method532();
        } else if (var8 == 3) {
            var9.method522();
        }
        var9.method540(var6, var7);
        if (var8 == 1) {
            var9.method522();
        } else if (var8 == 2) {
            var9.method532();
        } else if (var8 == 3) {
            var9.method530();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBLka;)Lka;")
    public final class70 method362(int arg0, byte arg1, class70 arg2) {
        field1230++;
        int var4 = this.field1218[arg0];
        class47 var5 = class38.method302(-80, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method539(true);
        }
        int var7 = 0;
        class47 var8 = null;
        if (this.field1198 != null && this.field1198.length > arg0) {
            int var9 = this.field1198[arg0];
            var8 = class38.method302(-70, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        int var10 = 107 / ((-arg1 - 15) / 35);
        if (var8 == null || var7 == 65535) {
            class70 var12 = arg2.method539(!var5.method372(var6, false));
            var12.method540(var5, var6);
            return var12;
        } else {
            class70 var11 = arg2.method539(!var5.method372(var6, false) & !var8.method372(var7, false));
            var11.method540(var5, var6);
            var11.method540(var8, var7);
            return var11;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static void method363(byte arg0) {
        field1226 = null;
        field1211 = null;
        field1214 = null;
        if (arg0 > -52) {
            field1213 = null;
        }
        field1210 = null;
        field1213 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (this.field1202 == -1) {
            if (this.field1204 == null) {
                this.field1202 = 0;
            } else {
                this.field1202 = 2;
            }
        }
        if (this.field1217 == -1) {
            if (this.field1204 == null) {
                this.field1217 = 0;
            } else {
                this.field1217 = 2;
            }
        }
        field1215++;
        if (arg0 < 26) {
            this.field1209 = 70;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLka;Lgd;)Lka;")
    public final class70 method365(int arg0, int arg1, byte arg2, class70 arg3, class46 arg4) {
        if (arg2 <= 15) {
            return null;
        }
        int var6 = this.field1218[arg0];
        field1228++;
        class47 var7 = class38.method302(-71, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method357(65535, arg1, arg3);
        }
        int var9 = arg4.field1218[arg1];
        class47 var10 = class38.method302(-119, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class70 var12 = arg3.method539(!var7.method372(var8, false));
            var12.method540(var7, var8);
            return var12;
        } else {
            class70 var13 = arg3.method539(!var7.method372(var8, false) & !var10.method372(var11, false));
            var13.method533(var7, var8, var10, var11, this.field1204);
            return var13;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZBZIZ)Lpa;")
    public static final class105 method366(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        class59 var5 = null;
        if (arg1 != -85) {
            return null;
        }
        field1205++;
        if (class67.field1640 != null) {
            var5 = new class59(arg3, class67.field1640, class5.field85[arg3], 1000000);
        }
        return new class105(var5, class133.field3035, arg3, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILof;)V")
    public final void method367(int arg0, class103 arg1) {
        field1216++;
        while (true) {
            int var3 = arg1.method829((byte) 39);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method359(-78, (byte) 84);
                    return;
                }
            }
            this.method356(var3, arg1, -5);
        }
    }
}
