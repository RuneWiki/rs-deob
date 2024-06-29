import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class64 extends class155 {

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Laj;")
    public static class151 field1069;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "Lu;")
    public static class30 field1074;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Ljava/awt/Frame;")
    public static Frame field1086;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "Ljava/lang/String;")
    public String field1087;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "[C")
    public char[] field1071;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "[C")
    public char[] field1079;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "[I")
    public int[] field1077;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "[Lmd;")
    public static class273[] field1080;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IC)I")
    public final int method433(int arg0, char arg1) {
        field1076++;
        if (this.field1077 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field1077.length; var3++) {
            if (this.field1071[var3] == arg1) {
                return this.field1077[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "(I)V")
    public static void method434(int arg0) {
        field1086 = null;
        field1069 = null;
        field1074 = null;
        field1080 = null;
        if (arg0 != -14878) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IC)I")
    public final int method435(int arg0, char arg1) {
        field1085++;
        if (this.field1083 == null) {
            return -1;
        }
        if (arg0 < 49) {
            this.method441(-5, (class249) null, (byte) -98);
        }
        for (int var3 = 0; var3 < this.field1083.length; var3++) {
            if (this.field1079[var3] == arg1) {
                return this.field1083[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Lng;")
    public static final class73 method436(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class21.field379 || arg2 < 0 || arg2 >= class28.field479) {
            return null;
        }
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class73 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field2814; var7++) {
            class73 var8 = var3.field2812[var7];
            if ((var8.field1278 >> 29 & 0x3L) <= 1L && var8.field1270 == arg1 && var8.field1266 == arg2 && (var8.field1269 > var5 || var8.field1276 > var6)) {
                var4 = var8;
                var5 = var8.field1269;
                var6 = var8.field1276;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1075++;
        if (arg6 > -60) {
            method438(-35, 7, 39, -99, -9, -53);
        }
        class245[] var7 = class250.field4234;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class245 var9 = var7[var8];
            if (var9 != null && var9.field4110 == 2) {
                class263.method1863(arg0 >> 1, (var9.field4105 - class26.field462 << 7) + var9.field4121, var9.field4109 * 2, arg1, arg4, (var9.field4115 - class78.field1313 << 7) + var9.field4119, arg2 >> 1, (byte) 35);
                if (class170.field2756 > -1 && (class275.field4598 % 20) < 10) {
                    class248.field4149[var9.field4103].method652(arg5 + class170.field2756 - 12, class147.field2418 + arg3 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII)V")
    public static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -43) {
            method442((class151) null, false, (class151) null);
        }
        int var6 = arg0 - arg2;
        field1078++;
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class221.method1568(false, arg4, arg3, arg1, arg2);
            }
        } else if (var7 == 0) {
            class93.method668(arg4, arg1, arg2, arg0, (byte) -27);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 > var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg1;
                arg1 = var9;
                int var10 = arg0;
                arg0 = arg3;
                arg3 = var10;
            }
            if (arg2 > arg0) {
                int var11 = arg2;
                int var12 = arg1;
                arg1 = arg3;
                arg3 = var12;
                arg2 = arg0;
                arg0 = var11;
            }
            int var13 = arg1;
            int var14 = arg0 - arg2;
            int var15 = arg3 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg1 >= arg3 ? -1 : 1;
            if (var8) {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    class41.field630[var19][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg0; var18++) {
                    var16 += var15;
                    class41.field630[var13][var18] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILab;)V")
    public final void method439(int arg0, class249 arg1) {
        if (arg0 != 0) {
            return;
        }
        field1084++;
        while (true) {
            int var3 = arg1.method1802((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method441(var3, arg1, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "(I)V")
    public static final void method440(int arg0) {
        field1089++;
        if (class260.field4362) {
            return;
        }
        class260.field4362 = true;
        class271.field4520 = true;
        int var1 = -63 / ((arg0 - 29) / 63);
        if (class46.field814) {
            class265.field4432 = (float) ((int) class265.field4432 + 191 & 0xFFFFFF80);
        } else {
            class250.field4237 += (24.0F - class250.field4237) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILab;B)V")
    private final void method441(int arg0, class249 arg1, byte arg2) {
        int var4 = -77 % ((-arg2 - 61) / 47);
        field1072++;
        if (arg0 == 1) {
            this.field1087 = arg1.method1769(1);
        } else if (arg0 == 2) {
            int var5 = arg1.method1802((byte) 94);
            this.field1079 = new char[var5];
            this.field1083 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1083[var6] = arg1.method1821((byte) 51);
                byte var7 = arg1.method1768(74);
                this.field1079[var6] = var7 == 0 ? 0 : class1.method12(true, var7);
            }
            return;
        } else if (arg0 == 3) {
            int var8 = arg1.method1802((byte) -119);
            this.field1071 = new char[var8];
            this.field1077 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1077[var9] = arg1.method1821((byte) 51);
                byte var10 = arg1.method1768(112);
                this.field1071[var9] = var10 == 0 ? 0 : class1.method12(true, var10);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Laj;ZLaj;)V")
    public static final void method442(class151 arg0, boolean arg1, class151 arg2) {
        field1073++;
        if (arg1) {
            class253.field4288 = arg0;
            class217.field3667 = arg2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public final void method443(byte arg0) {
        int var2 = 82 / ((34 - arg0) / 60);
        field1088++;
        if (this.field1077 != null) {
            for (int var3 = 0; var3 < this.field1077.length; var3++) {
                this.field1077[var3] = class312.method2107(this.field1077[var3], 32768);
            }
        }
        if (this.field1083 != null) {
            for (int var4 = 0; var4 < this.field1083.length; var4++) {
                this.field1083[var4] = class312.method2107(this.field1083[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method444(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1070++;
        class248 var10 = (class248) class21.field387.method309(0);
        class248 var11 = null;
        while (var10 != null) {
            if (var10.field4140 == arg0 && var10.field4132 == arg8 && var10.field4146 == arg9 && var10.field4141 == arg4) {
                var11 = var10;
                break;
            }
            var10 = (class248) class21.field387.method312((byte) -102);
        }
        if (var11 == null) {
            var11 = new class248();
            var11.field4132 = arg8;
            var11.field4141 = arg4;
            var11.field4140 = arg0;
            var11.field4146 = arg9;
            class113.method871((byte) -82, var11);
            class21.field387.method311(100, var11);
        }
        if (arg1 <= 69) {
            method444(35, (byte) 39, -86, -112, 71, -42, 61, 77, -4, -115);
        }
        var11.field4154 = arg3;
        var11.field4143 = arg5;
        var11.field4142 = arg6;
        var11.field4134 = arg7;
        var11.field4145 = arg2;
    }
}
