import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class72 implements class26 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lke;")
    private class106 field1063 = new class106(256);

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lvl;")
    private class73 field1064;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lvl;")
    private class73 field1057;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[Lem;")
    private class10[] field1061;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lol;")
    public static class220 field1066 = new class220();

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "S")
    public static short field1070 = 1;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[I")
    public static int[] field1074 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Z")
    public static boolean field1073 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lvl;")
    public static class73 field1071;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BC)C")
    public static final char method475(byte arg0, char arg1) {
        if (arg0 > -118) {
            field1072 = 18;
        }
        field1059++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lvl;I)V")
    public static final void method476(class73 arg0, int arg1) {
        if (arg1 < -33) {
            field1056++;
            class111.field1615 = arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)Lqd;")
    public class40 method477(int arg0, int arg1) {
        if (arg1 >= -86) {
            this.field1057 = null;
        }
        field1068++;
        class59 var3 = this.field1063.method707((long) arg0, (byte) -109);
        if (var3 != null) {
            return (class40) var3;
        }
        byte[] var4 = this.field1064.method507(-2, arg0);
        if (var4 == null) {
            return null;
        } else {
            class40 var5 = new class40(new class170(var4));
            this.field1063.method712(false, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method478(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        field1058++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class148.field2202; var6++) {
            class162 var9 = class104.method696((byte) -26, var6);
            if ((!arg0 || var9.field2451) && var9.field2490 == -1 && var9.field2472 == -1 && var9.field2446 == 0 && var9.field2425.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class312.field4998 = -1;
                    class28.field340 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg2 != -10358) {
            return;
        }
        class3.field42 = 0;
        class312.field4998 = var5;
        String[] var7 = new String[class312.field4998];
        class28.field340 = var4;
        for (int var8 = 0; var8 < class312.field4998; var8++) {
            var7[var8] = class104.method696((byte) -26, var4[var8]).field2425;
        }
        class220.method1550(true, class28.field340, var7);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method479(byte arg0) {
        field1071 = null;
        if (arg0 > 58) {
            field1074 = null;
            field1066 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
    public final boolean method134(int arg0, int arg1) {
        field1065++;
        class40 var3 = this.method477(arg0, -93);
        if (arg1 != 1) {
            field1069 = -104;
        }
        return var3 != null && var3.method230(this.field1057, 0, this);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FIBZII)[I")
    public final int[] method136(float arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 != 23) {
            this.method134(-123, 47);
        }
        field1067++;
        return this.method477(arg1, -115).method232(this, this.field1061[arg1].field163, this.field1057, arg5, arg3, arg4, (double) arg0, false);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)Lem;")
    public final class10 method135(int arg0, int arg1) {
        field1062++;
        return arg0 == 1714 ? this.field1061[arg1] : null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lvl;Lvl;Lvl;)V")
    public class72(class73 arg0, class73 arg1, class73 arg2) {
        this.field1064 = arg1;
        this.field1057 = arg2;
        class170 var4 = new class170(arg0.method501(-2, 0, 0));
        int var5 = var4.method1186((byte) -115);
        this.field1061 = new class10[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1218(61) == 1) {
                this.field1061[var6] = new class10();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1061[var7] != null) {
                this.field1061[var7].field147 = var4.method1218(90) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1061[var8] != null) {
                this.field1061[var8].field162 = var4.method1218(-70) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1061[var9] != null) {
                this.field1061[var9].field156 = var4.method1218(61) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1061[var10] != null) {
                var4.method1218(-126);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1061[var11] != null) {
                var4.method1215(128);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1061[var12] != null) {
                var4.method1215(128);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1061[var13] != null) {
                var4.method1215(128);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1061[var14] != null) {
                var4.method1215(128);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1061[var15] != null) {
                this.field1061[var15].field160 = (short) var4.method1186((byte) -104);
            }
        }
        if (var4.field2676 < var4.field2650.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1061[var16] != null) {
                    var4.method1215(128);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1061[var17] != null) {
                    var4.method1215(128);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1061[var18] != null) {
                    var4.method1218(121);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1061[var19] != null) {
                    this.field1061[var19].field163 = var4.method1218(83) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1061[var20] != null) {
                    var4.method1215(128);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1061[var21] != null) {
                    var4.method1218(111);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1061[var22] != null) {
                    var4.method1218(111);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1061[var23] != null) {
                    var4.method1218(-84);
                }
            }
        }
    }
}
