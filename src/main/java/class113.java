import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class113 extends class118 {

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public int field2966 = 1000;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Lfc;")
    public static class39 field2963 = class90.method774(" loggt sich ein)3", -124);

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Lfc;")
    private static class39 field2967 = class90.method774("Attack", -92);

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "Lfc;")
    public static class39 field2969 = field2967;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lfc;")
    private static class39 field2961 = class90.method774("skill)2", -119);

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lfc;")
    public static class39 field2971 = field2961;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lfc;")
    public static class39 field2972 = class90.method774("Lade Konfiguration )2 ", -113);

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lfc;")
    public static class39 field2973 = class90.method774("Bitte warten Sie eine Minute", -89);

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Lb;")
    public static class8 field2960;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 12)
    public static final void method986(byte arg0) {
        field2970++;
        if (arg0 >= -23) {
            method987((byte) -125);
        }
        try {
            if (class101.field2547 == 1) {
                int var1 = class103.field2582.method191(19426);
                if (var1 > 0 && class103.field2582.method183(true)) {
                    int var2 = var1 - class1.field2;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class103.field2582.method187((byte) -87, var2);
                } else {
                    class103.field2582.method161(-16257);
                    class103.field2582.method182(2002216710);
                    class142.field3567 = null;
                    if (class61.field1497 == null) {
                        class101.field2547 = 0;
                    } else {
                        class101.field2547 = 2;
                    }
                    class115.field3018 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class103.field2582.method161(-16257);
            class61.field1497 = null;
            class142.field3567 = null;
            class101.field2547 = 0;
            class115.field3018 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V", line = 76)
    public static void method987(byte arg0) {
        field2971 = null;
        field2969 = null;
        field2961 = null;
        field2963 = null;
        field2973 = null;
        field2960 = null;
        field2967 = null;
        field2972 = null;
        if (arg0 != -84) {
            field2972 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lob;BI)I", line = 97)
    public static final int method988(class99 arg0, byte arg1, int arg2) {
        field2962++;
        if (arg0.field2351 == null || arg2 >= arg0.field2351.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field2351[arg2];
            if (arg1 <= 9) {
                method987((byte) 69);
            }
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class17.field494[var3[var6++]];
                }
                if (var7 == 2) {
                    var8 = class58.field1443[var3[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class142.field3574[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class99 var12 = class54.method567(68, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class37.method421(true, var13).field2739 || class26.field743)) {
                        for (int var14 = 0; var14 < var12.field2340.length; var14++) {
                            if (var13 + 1 == var12.field2340[var14]) {
                                var8 += var12.field2422[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class110.field2834[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class117.field3075[class58.field1443[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class110.field2834[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class94.field2197.field3550;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class153.field3773[var15]) {
                            var8 += class58.field1443[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class99 var18 = class54.method567(45, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class37.method421(true, var19).field2739 || class26.field743)) {
                        for (int var20 = 0; var20 < var18.field2340.length; var20++) {
                            if (var19 + 1 == var18.field2340[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class55.field1377;
                }
                if (var7 == 12) {
                    var8 = class44.field1200;
                }
                if (var7 == 13) {
                    int var21 = class110.field2834[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class57.method583((byte) 89, var23);
                }
                if (var7 == 18) {
                    var8 = (class94.field2197.field2916 >> 7) + class54.field1341;
                }
                if (var7 == 19) {
                    var8 = (class94.field2197.field2909 >> 7) + class55.field1382;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)V", line = 307)
    public void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class23 var10 = this.method153(64);
        if (var10 != null) {
            this.field2966 = var10.field2966;
            var10.method272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        field2974++;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lda;", line = 356)
    public class23 method153(int arg0) {
        field2964++;
        return arg0 == 64 ? null : null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII)V", line = 372)
    public static final void method989(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class39.field1103[0].method1155(arg1, arg4);
        class39.field1103[1].method1155(arg1, arg4 + arg5 - 16);
        int var6 = (arg5 - 32) * arg5 / arg2;
        field2965++;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg0 / (arg2 - arg5);
        class152.method1209(arg1, arg4 + 16, 16, arg5 - 32, class142.field3583);
        class152.method1209(arg1, arg4 + var7 + 16, 16, var6, class127.field3218);
        class152.method1221(arg1, arg4 + var7 + 16, var6, class96.field2220);
        class152.method1221(arg1 + 1, arg4 - -16 + var7, var6, class96.field2220);
        class152.method1218(arg1, arg4 + var7 + 16, 16, class96.field2220);
        class152.method1218(arg1, arg4 + var7 + 17, 16, class96.field2220);
        class152.method1221(arg1 + 15, arg4 + 16 + var7, var6, class18.field508);
        class152.method1221(arg1 + 14, var7 + 17 + arg4, var6 - 1, class18.field508);
        class152.method1218(arg1, arg4 + var6 + var7 + 15, 16, class18.field508);
        if (arg3 != -42) {
            field2969 = null;
        }
        class152.method1218(arg1 + 1, arg4 + var6 - (-14 - var7), 15, class18.field508);
    }
}
