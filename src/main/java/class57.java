import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class57 {

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Llb;")
    private class106 field1152 = new class106();

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
    public static int[] field1147 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lrf;")
    public static class163 field1143 = class53.method392(117, "Ausw-=hlen");

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lrf;")
    public static class163 field1151 = class53.method392(88, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1153 = 0;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lrf;")
    private static class163 field1157 = class53.method392(-66, "Loaded fonts");

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lrf;")
    public static class163 field1150 = field1157;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1145 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[Lei;")
    public static class50[] field1159 = new class50[4];

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lig;")
    public static class84 field1162;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
    public static int[] field1158;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
    public static int[] field1161;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (arg0 != 0) {
            method411(-88);
        }
        field1155++;
        for (int var1 = -1; var1 < class112.field2377; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class27.field504[var1];
            }
            class38 var3 = class121.field2553[var2];
            if (var3 != null) {
                class48.method291((byte) -125, var3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILs;Ls;IIJ)V")
    public static final void method412(int arg0, int arg1, int arg2, int arg3, class166 arg4, class166 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class72 var10 = new class72();
        var10.field1520 = arg8;
        var10.field1511 = arg1 * 128 + 64;
        var10.field1512 = arg2 * 128 + 64;
        var10.field1521 = arg3;
        var10.field1502 = arg4;
        var10.field1504 = arg5;
        var10.field1506 = arg6;
        var10.field1513 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class97.field2054[var11][arg1][arg2] == null) {
                class97.field2054[var11][arg1][arg2] = new class111(var11, arg1, arg2);
            }
        }
        class97.field2054[arg0][arg1][arg2].field2345 = var10;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lrf;III)Lrf;")
    public static final class163 method413(class163[] arg0, int arg1, int arg2, int arg3) {
        field1146++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class136.field2793;
            }
            var4 += arg0[arg2 + var5].field3341;
        }
        if (arg3 <= 67) {
            field1160 = -2;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class163 var10 = arg0[arg2 + var8];
            class123.method830(var10.field3320, 0, var6, var7, var10.field3341);
            var7 += var10.field3341;
        }
        class163 var9 = new class163();
        var9.field3320 = var6;
        var9.field3341 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
    public static final void method414(int arg0, int arg1, int arg2, int arg3) {
        field1148++;
        if (arg2 != 4100) {
            method413(null, 72, -58, -44);
        }
        class84 var4 = class48.method298(arg3, arg1, 0);
        if (var4 != null && var4.field1765 != null) {
            class118 var5 = new class118();
            var5.field2500 = var4;
            var5.field2502 = var4.field1765;
            class64.method458((byte) -80, var5);
        }
        class118.field2508 = arg1;
        class189.field3766 = true;
        class181.field3627 = arg3;
        class112.field2362 = arg0;
        class194.method1295((byte) -118, var4);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1158 = null;
        field1161 = null;
        field1143 = null;
        field1145 = null;
        field1147 = null;
        field1151 = null;
        field1162 = null;
        field1157 = null;
        field1159 = null;
        field1150 = null;
        if (arg0 != 0) {
            field1160 = 107;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method416(byte arg0) {
        if (arg0 != 61) {
            method411(-35);
        }
        for (int var1 = 0; var1 < class181.field3638; var1++) {
            int var2 = class52.field1088[var1];
            class70 var3 = class187.field3723[var2];
            int var4 = class105.field2195.method344(255);
            if ((var4 & 0x80) != 0) {
                int var5 = class105.field2195.method378(false);
                int var6 = class105.field2195.method344(arg0 ^ 0xC2);
                var3.method231(class51.field1023, var6, 64, var5);
            }
            if ((var4 & 0x2) != 0) {
                var3.field740 = class105.field2195.method390((byte) 93);
                if (var3.field740 == 65535) {
                    var3.field740 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class105.field2195.method338((byte) 125);
                int var8 = class105.field2195.method344(255);
                var3.method231(class51.field1023, var8, arg0 ^ 0xC, var7);
                var3.field726 = class51.field1023 + 300;
                var3.field680 = class105.field2195.method338((byte) 67);
            }
            if ((var4 & 0x20) != 0) {
                var3.field674 = class105.field2195.method387((byte) 88);
                var3.field708 = class105.field2195.method367(75);
            }
            if ((var4 & 0x1) != 0) {
                var3.field686 = class105.field2195.method363(19047);
                var3.field672 = 100;
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class105.field2195.method390((byte) 93);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class105.field2195.method344(255);
                if (var3.field730 == var9 && var9 != -1) {
                    int var11 = class97.method668(var9, (byte) 44).field3265;
                    if (var11 == 1) {
                        var3.field694 = 0;
                        var3.field715 = var10;
                        var3.field733 = 0;
                        var3.field676 = 0;
                    }
                    if (var11 == 2) {
                        var3.field733 = 0;
                    }
                } else if (var9 == -1 || var3.field730 == -1 || class97.method668(var9, (byte) 44).field3275 >= class97.method668(var3.field730, (byte) 44).field3275) {
                    var3.field715 = var10;
                    var3.field676 = 0;
                    var3.field733 = 0;
                    var3.field694 = 0;
                    var3.field730 = var9;
                    var3.field724 = var3.field706;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1482 = class43.method262(18354, class105.field2195.method387((byte) 88));
                var3.field719 = var3.field1482.field2669;
                var3.field709 = var3.field1482.field2659;
                var3.field684 = var3.field1482.field2644;
                var3.field725 = var3.field1482.field2648;
                var3.field732 = var3.field1482.field2663;
                var3.field681 = var3.field1482.field2653;
                var3.field721 = var3.field1482.field2650;
                var3.field717 = var3.field1482.field2681;
                var3.field707 = var3.field1482.field2671;
            }
            if ((var4 & 0x10) != 0) {
                var3.field741 = class105.field2195.method390((byte) 97);
                int var12 = class105.field2195.method376((byte) 113);
                var3.field720 = 0;
                var3.field722 = var12 >> 16;
                if (var3.field741 == 65535) {
                    var3.field741 = -1;
                }
                var3.field723 = (var12 & 0xFFFF) + class51.field1023;
                var3.field703 = 0;
                if (class51.field1023 < var3.field723) {
                    var3.field703 = -1;
                }
            }
        }
        field1149++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Llb;")
    public final class106 method417(int arg0) {
        field1142++;
        class106 var2 = this.field1152.field2199;
        if (this.field1152 == var2) {
            return null;
        } else {
            if (arg0 != 25630) {
                method414(-106, -62, 47, 111);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILlb;)V")
    public final void method418(int arg0, class106 arg1) {
        if (arg1.field2201 != null) {
            arg1.method722((byte) 67);
        }
        if (arg0 != 0) {
            this.method419((byte) 0);
        }
        field1141++;
        arg1.field2199 = this.field1152;
        arg1.field2201 = this.field1152.field2201;
        arg1.field2201.field2199 = arg1;
        arg1.field2199.field2201 = arg1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Llb;")
    public final class106 method419(byte arg0) {
        field1144++;
        class106 var2 = this.field1152.field2199;
        if (this.field1152 == var2) {
            return null;
        } else if (arg0 == 121) {
            var2.method722((byte) 63);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(ILlb;)V")
    public final void method420(int arg0, class106 arg1) {
        if (arg1.field2201 != null) {
            arg1.method722((byte) 101);
        }
        field1154++;
        arg1.field2199 = this.field1152.field2199;
        arg1.field2201 = this.field1152;
        arg1.field2201.field2199 = arg1;
        if (arg0 == 0) {
            arg1.field2199.field2201 = arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class57() {
        this.field1152.field2201 = this.field1152;
        this.field1152.field2199 = this.field1152;
    }
}
