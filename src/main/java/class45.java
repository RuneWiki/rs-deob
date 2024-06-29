import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field1085 = 32;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "J")
    private long field1065 = class120.method945(20794);

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[Lsd;")
    private class129[] field1093 = new class129[8];

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field1090 = 0;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    private int field1096 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "J")
    private long field1094 = 0L;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[Lsd;")
    private class129[] field1091 = new class129[8];

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    private int field1100 = 0;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "J")
    private long field1099 = 0L;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Z")
    private boolean field1101 = true;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    private int field1097 = 0;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lr;")
    private static class118 field1070 = class153.method1136(107, "Free world");

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lr;")
    public static class118 field1067 = class153.method1136(101, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    public static int[] field1071 = new int[5];

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[I")
    public static int[] field1080 = new int[256];

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lr;")
    public static class118 field1077 = field1070;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lr;")
    public static class118 field1075 = class153.method1136(85, "");

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lr;")
    public static class118 field1087 = class153.method1136(126, "gelb:");

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
    public static boolean field1088 = false;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1089 = -1;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lsd;")
    private class129 field1064;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public int[] field1060;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILke;I)I")
    public static final int method371(int arg0, class74 arg1, int arg2) {
        field1062++;
        if (arg1.field1768 == null || arg1.field1768.length <= arg2) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field1768[arg2];
            int var5 = arg0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var8 = class139.field3173[var4[var5++]];
                }
                if (var7 == 2) {
                    var8 = class25.field617[var4[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 3) {
                    var8 = class115.field2704[var4[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class74 var12 = class99.method770(arg0 ^ 0xFFFFECE2, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class131.method1013(-12582, var13).field2027 || class61.field1410)) {
                        for (int var14 = 0; var14 < var12.field1816.length; var14++) {
                            if (var13 + 1 == var12.field1816[var14]) {
                                var8 += var12.field1743[var14];
                            }
                        }
                    }
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 5) {
                    var8 = class92.field2193[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class46.field1107[class25.field617[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class92.field2193[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class89.field2150.field2995;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class158.field3648[var15]) {
                            var8 += class25.field617[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class74 var18 = class99.method770(-4894, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class131.method1013(arg0 - 12582, var19).field2027 || class61.field1410)) {
                        for (int var20 = 0; var20 < var18.field1816.length; var20++) {
                            if (var19 + 1 == var18.field1816[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class31.field796;
                }
                if (var7 == 12) {
                    var8 = class120.field2777;
                }
                if (var7 == 13) {
                    int var21 = class92.field2193[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class131.method1012(3233, var23);
                }
                if (var7 == 18) {
                    var8 = (class89.field2150.field760 >> 7) + client.field524;
                }
                if (var7 == 19) {
                    var8 = (class89.field2150.field712 >> 7) + class27.field646;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    private final void method372(int arg0, int arg1) {
        this.field1090 -= arg0;
        field1076++;
        if (this.field1090 < arg1) {
            this.field1090 = 0;
        }
        if (this.field1064 != null) {
            this.field1064.method114(arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method373(int arg0) {
        field1081++;
        this.field1101 = true;
        if (arg0 != 17176) {
            method376((byte) 77, null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public final synchronized void method374(byte arg0) {
        field1084++;
        if (this.field1060 == null) {
            return;
        }
        long var2 = class120.method945(20794);
        try {
            if (this.field1094 != 0L) {
                if (var2 < this.field1094) {
                    return;
                }
                this.method171(this.field1095);
                this.field1094 = 0L;
                this.field1101 = true;
            }
            int var4 = this.method175();
            if (this.field1096 - var4 > this.field1100) {
                this.field1100 = this.field1096 - var4;
            }
            int var5 = this.field1092 + this.field1098;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1095) {
                this.field1095 += 1024;
                if (this.field1095 > 16384) {
                    this.field1095 = 16384;
                }
                var4 = 0;
                this.method170();
                this.method171(this.field1095);
                if (this.field1095 < var5 + 256) {
                    var5 = this.field1095 - 256;
                    this.field1098 = var5 - this.field1092;
                }
                this.field1101 = true;
            }
            while (var4 < var5) {
                this.method378(this.field1060, 256);
                var4 += 256;
                this.method174();
            }
            if (this.field1099 < var2) {
                if (this.field1101) {
                    this.field1101 = false;
                } else if (this.field1100 == 0 && this.field1097 == 0) {
                    this.method170();
                    this.field1094 = var2 + 2000L;
                    return;
                } else {
                    this.field1098 = Math.min(this.field1097, this.field1100);
                    this.field1097 = this.field1100;
                }
                this.field1099 = var2 + 2000L;
                this.field1100 = 0;
            }
            this.field1096 = var4;
        } catch (Exception var7) {
            this.method170();
            this.field1094 = var2 + 2000L;
        }
        try {
            if (arg0 == -74) {
                if (this.field1065 + 500000L < var2) {
                    var2 = this.field1065;
                }
                while (var2 > this.field1065 + 5000L) {
                    this.method372(256, 0);
                    this.field1065 += 256000 / class85.field2084;
                }
            }
        } catch (Exception var6) {
            this.field1065 = var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public void method171(int arg0) throws Exception {
        field1083++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILsd;)V")
    public final synchronized void method375(int arg0, class129 arg1) {
        this.field1064 = arg1;
        if (arg0 <= -8) {
            field1078++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLea;)V")
    public static final void method376(byte arg0, class30 arg1) {
        field1063++;
        if (arg1.field729 == 0) {
            return;
        }
        if (arg1.field731 != -1 && arg1.field731 < 32768) {
            class83 var2 = class74.field1833[arg1.field731];
            if (var2 != null) {
                int var3 = arg1.field760 - var2.field760;
                int var4 = arg1.field712 - var2.field712;
                if (var3 != 0 || var4 != 0) {
                    arg1.field756 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field731 >= 32768) {
            int var5 = arg1.field731 - 32768;
            if (class94.field2240 == var5) {
                var5 = 2047;
            }
            class132 var6 = class108.field2526[var5];
            if (var6 != null) {
                int var7 = arg1.field760 - var6.field760;
                int var8 = arg1.field712 - var6.field712;
                if (var7 != 0 || var8 != 0) {
                    arg1.field756 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field780 != 0 || arg1.field772 != 0) && (arg1.field726 == 0 || arg1.field736 > 0)) {
            int var9 = arg1.field712 - (arg1.field772 - class27.field646 - class27.field646) * 64;
            int var10 = arg1.field760 - (arg1.field780 - client.field524 - client.field524) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field756 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field772 = 0;
            arg1.field780 = 0;
        }
        if (arg0 <= 122) {
            field1088 = true;
        }
        int var11 = arg1.field756 - arg1.field768 & 0x7FF;
        if (var11 == 0) {
            arg1.field708 = 0;
            return;
        }
        arg1.field708++;
        if (var11 > 1024) {
            arg1.field768 -= arg1.field729;
            boolean var12 = true;
            if (var11 < arg1.field729 || 2048 - arg1.field729 < var11) {
                var12 = false;
                arg1.field768 = arg1.field756;
            }
            if (arg1.field766 == arg1.field765 && (arg1.field708 > 25 || var12)) {
                if (arg1.field714 == -1) {
                    arg1.field765 = arg1.field764;
                } else {
                    arg1.field765 = arg1.field714;
                }
            }
        } else {
            arg1.field768 += arg1.field729;
            boolean var13 = true;
            if (arg1.field729 > var11 || var11 > 2048 - arg1.field729) {
                arg1.field768 = arg1.field756;
                var13 = false;
            }
            if (arg1.field766 == arg1.field765 && (arg1.field708 > 25 || var13)) {
                if (arg1.field716 == -1) {
                    arg1.field765 = arg1.field764;
                } else {
                    arg1.field765 = arg1.field716;
                }
            }
        }
        arg1.field768 &= 0x7FF;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method172(Component arg0) throws Exception {
        field1072++;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final synchronized void method377(int arg0) {
        if (arg0 < 62) {
            method379(-32, null, 109, -25, -35, -38);
        }
        if (class68.field1586 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class68.field1586.field3175[var3] == this) {
                    class68.field1586.field3175[var3] = null;
                }
                if (class68.field1586.field3175[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class68.field1586.field3166 = true;
                while (class68.field1586.field3172) {
                    class139.method1042(-60, 50L);
                }
                class68.field1586 = null;
            }
        }
        field1066++;
        this.method170();
        this.field1060 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([II)V")
    private final void method378(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class41.field972) {
            var3 = arg1 << 1;
        }
        class57.method503(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1064 != null && this.field1090 <= 0) {
            this.field1090 += class85.field2084 >> 4;
            class4.method17(-7695, this.field1064);
            this.method382(this.field1064.method419(), this.field1064, 1024);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class129 var10 = null;
                        class129 var11 = this.field1091[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class119 var12 = var11.field2959;
                                if (var12 == null || var12.field2776 <= var8) {
                                    var11.field2960 = true;
                                    int var13 = var11.method133();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2776 += var13;
                                    }
                                    if (var4 >= this.field1085) {
                                        break label107;
                                    }
                                    class129 var14 = var11.method122();
                                    if (var14 != null) {
                                        int var15 = var11.field2962;
                                        while (var14 != null) {
                                            this.method382(var15 * var14.method419() >> 8, var14, 1024);
                                            var14 = var11.method102();
                                        }
                                    }
                                    class129 var16 = var11.field2961;
                                    var11.field2961 = null;
                                    if (var10 == null) {
                                        this.field1091[var7] = var16;
                                    } else {
                                        var10.field2961 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1093[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2961;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class129 var18 = this.field1091[var17];
                this.field1091[var17] = this.field1093[var17] = null;
                while (var18 != null) {
                    class129 var19 = var18.field2961;
                    var18.field2961 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1064 != null) {
            this.field1064.method132(arg0, 0, arg1);
        }
        this.field1065 = class120.method945(20794);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public void method174() throws Exception {
        field1068++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILvb;IIII)V")
    public static final void method379(int arg0, class148 arg1, int arg2, int arg3, int arg4, int arg5) {
        class10 var6 = new class10();
        var6.field235 = arg0 * 128;
        var6.field240 = arg3 * arg4;
        var6.field219 = arg1.field3309;
        var6.field242 = arg1.field3272 * 128;
        var6.field232 = arg1.field3326;
        field1082++;
        var6.field229 = arg1.field3335;
        var6.field223 = arg1.field3301;
        var6.field222 = arg5;
        int var7 = arg1.field3279;
        int var8 = arg1.field3287;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg1.field3279;
            var7 = arg1.field3287;
        }
        var6.field234 = (arg4 + var8) * 128;
        var6.field245 = (arg0 + var7) * 128;
        if (arg1.field3310 != null) {
            var6.field221 = arg1;
            var6.method80(arg3 ^ 0x80);
        }
        class132.field3011.method883(var6, -26866);
        if (var6.field219 != null) {
            var6.field236 = var6.field229 + (int) (Math.random() * (double) (var6.field223 - var6.field229));
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static void method380(int arg0) {
        field1070 = null;
        field1077 = null;
        field1067 = null;
        field1087 = null;
        field1080 = null;
        if (arg0 != 2) {
            field1071 = null;
        }
        field1075 = null;
        field1071 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
    public void method173() throws Exception {
        field1074++;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public final synchronized void method381(int arg0) {
        this.field1101 = true;
        field1086++;
        try {
            this.method173();
            if (arg0 != -13834) {
                this.method170();
            }
        } catch (Exception var2) {
            this.method170();
            this.field1094 = class120.method945(20794) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
    public int method175() throws Exception {
        field1069++;
        return this.field1095;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
    public void method170() {
        field1061++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILsd;I)V")
    private final void method382(int arg0, class129 arg1, int arg2) {
        field1073++;
        if (arg2 != 1024) {
            field1087 = null;
        }
        int var4 = arg0 >> 5;
        class129 var5 = this.field1093[var4];
        if (var5 == null) {
            this.field1091[var4] = arg1;
        } else {
            var5.field2961 = arg1;
        }
        this.field1093[var4] = arg1;
        arg1.field2962 = arg0;
    }
}
