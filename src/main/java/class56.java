import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class56 extends class88 {

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field716 = 0;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "[Z")
    public static boolean[] field718 = new boolean[8];

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[[[I")
    public static int[][][] field725 = new int[2][][];

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Leh;")
    public static class137 field724;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lml;")
    public static final class148 method313(int arg0, int arg1, int arg2) {
        int var3 = 14 / ((arg1 - 66) / 37);
        field715++;
        for (class148 var4 = (class148) class170.field2693.method710((byte) -53); var4 != null; var4 = (class148) class170.field2693.method709(false)) {
            if (var4.field2335 && var4.method1021(arg0, arg2, (byte) 124)) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)V")
    public abstract void method314(int arg0, int arg1);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(II)V")
    public abstract void method315(int arg0, int arg1);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public abstract void method316(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(II)V")
    public static final void method317(int arg0, int arg1) {
        field714++;
        int var2 = class74.field932;
        int var3 = class252.field4114;
        int var4 = class36.field465;
        int var5 = class242.field3986;
        int var6 = class23.field311;
        int var7 = (int) class238.field3933;
        int var8 = (int) class226.field3639 + class91.field1136 & 0x7FF;
        if (class171.field2706 / 256 > var7) {
            var7 = class171.field2706 / 256;
        }
        if (class272.field4341[4] && class9.field109[4] + 128 > var7) {
            var7 = class9.field109[4] + 128;
        }
        class196.method1378(var7, class166.method1148(class244.field4011, class286.field4571.field3818, class286.field4571.field3820, (byte) -72) - 50, class200.field3172, var8, arg0, (var7 * 3) + 600, class83.field1031, 334);
        if (class74.field932 == var2 && class252.field4114 == var3 && class36.field465 == var4 && class242.field3986 == var5 && class23.field311 == var6) {
            class283.field4513 = 1;
            return;
        }
        class292.field4634 = 10;
        class269.field4299 = arg1;
        class144.field2286 = 10;
        int var9 = class23.field311 - var6;
        if (var5 < class242.field3986) {
            var5 += (class242.field3986 - var5) * class269.field4299 / 1000 + class292.field4634;
            if (var5 < class242.field3986) {
                class242.field3986 = var5;
            }
        }
        if (class242.field3986 < var5) {
            int var10 = var5 - ((var5 - class242.field3986) * class269.field4299 / 1000 + class292.field4634);
            if (class242.field3986 < var10) {
                class242.field3986 = var10;
            }
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        class276.field4405 = 10;
        if (class252.field4114 > var3) {
            var3 += (class252.field4114 - var3) * class276.field4405 / 1000 + class144.field2286;
            if (class252.field4114 > var3) {
                class252.field4114 = var3;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (class36.field465 > var4) {
            var4 += (class36.field465 - var4) * class276.field4405 / 1000 + class144.field2286;
            if (class36.field465 > var4) {
                class36.field465 = var4;
            }
        }
        if (class74.field932 > var2) {
            var2 += (class74.field932 - var2) * class276.field4405 / 1000 + class144.field2286;
            if (class74.field932 > var2) {
                class74.field932 = var2;
            }
        }
        if (var3 > class252.field4114) {
            int var11 = var3 - ((var3 - class252.field4114) * class276.field4405 / 1000 + class144.field2286);
            if (var11 > class252.field4114) {
                class252.field4114 = var11;
            }
        }
        if (var9 > 0) {
            int var12 = class292.field4634 + (class269.field4299 * var9 / 1000) + var6;
            var6 = var12 & 0x7FF;
        }
        if (var9 < 0) {
            int var13 = var6 - (class292.field4634 + (-var9 * class269.field4299 / 1000));
            var6 = var13 & 0x7FF;
        }
        int var14 = class23.field311 - var6;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var2 > class74.field932) {
            int var15 = var2 - ((var2 - class74.field932) * class276.field4405 / 1000 + class144.field2286);
            if (class74.field932 < var15) {
                class74.field932 = var15;
            }
        }
        if (var4 > class36.field465) {
            int var16 = var4 - ((var4 - class36.field465) * class276.field4405 / 1000 + class144.field2286);
            if (var16 > class36.field465) {
                class36.field465 = var16;
            }
        }
        if (var14 >= 0 || var9 <= 0 || var14 > 0 && var9 < 0) {
            class23.field311 = var6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class88.field1076 * 128) {
            arg0 = class88.field1076 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class59.field752 * 128) {
            arg2 = class59.field752 * 128 - 1;
        }
        class126.field2019 = class174.field2753[arg3];
        class247.field4073 = class174.field2759[arg3];
        class208.field3318 = class174.field2753[arg4];
        class282.field4472 = class174.field2759[arg4];
        class230.field3789 = arg0;
        class57.field735 = arg1;
        class236.field3909 = arg2;
        class259.field4198 = arg0 / 128;
        class99.field1326 = arg2 / 128;
        class253.field4125 = class259.field4198 - class194.field3111;
        if (class253.field4125 < 0) {
            class253.field4125 = 0;
        }
        class110.field1579 = class99.field1326 - class194.field3111;
        if (class110.field1579 < 0) {
            class110.field1579 = 0;
        }
        class17.field207 = class259.field4198 + class194.field3111;
        if (class17.field207 > class88.field1076) {
            class17.field207 = class88.field1076;
        }
        class107.field1438 = class99.field1326 + class194.field3111;
        if (class107.field1438 > class59.field752) {
            class107.field1438 = class59.field752;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class194.field3111 + class194.field3111 + 2; var16++) {
            for (int var19 = 0; var19 < class194.field3111 + class194.field3111 + 2; var19++) {
                int var20 = (var16 - class194.field3111 << 7) - (class230.field3789 & 0x7F);
                int var21 = (var19 - class194.field3111 << 7) - (class236.field3909 & 0x7F);
                int var22 = class259.field4198 + var16 - class194.field3111;
                int var23 = class99.field1326 + var19 - class194.field3111;
                if (var22 >= 0 && var23 >= 0 && var22 < class88.field1076 && var23 < class59.field752) {
                    int var24;
                    if (class172.field2739 == null) {
                        var24 = class25.field348[0][var22][var23] + 128 - class57.field735;
                    } else {
                        var24 = class172.field2739[0][var22][var23] + 128 - class57.field735;
                    }
                    int var25 = class25.field348[3][var22][var23] - class57.field735 - 1000;
                    class9.field110[var16][var19] = class35.method188(var20, var25, var24, var21, var15);
                } else {
                    class9.field110[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class194.field3111 + class194.field3111 + 1; var17++) {
            for (int var18 = 0; var18 < class194.field3111 + class194.field3111 + 1; var18++) {
                class162.field2588[var17][var18] = class9.field110[var17][var18] || class9.field110[var17 + 1][var18] || class9.field110[var17][var18 + 1] || class9.field110[var17 + 1][var18 + 1];
            }
        }
        class294.field4665 = arg6;
        class127.field2041 = arg7;
        class39.field482 = arg8;
        class123.field1847 = arg9;
        class294.field4658 = arg10;
        class296.method1987();
        if (class75.field943 != null) {
            class127.method862(true);
            class16.method85(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class127.method862(false);
        }
        class16.method85(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        class70.field869 = -1;
        class118.field1672 = 1;
        class50.field650 = -3;
        class289.field4601 = false;
        class89.field1102 = 0;
        class206.field3299 = 0;
        class73.field913 = 0;
        int var1 = -65 / ((arg0 + 46) / 47);
        field723++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBII)V")
    public final void method321(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field713++;
        int var6 = this.field717 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field721 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        if (arg2 < -70) {
            this.method327(var8, var6, var9, var7, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(II)V")
    public abstract void method322(int arg0, int arg1);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static final void method323(int arg0) {
        class247.method1715(1);
        field712++;
        class271.method1820((byte) 6);
        class3.method17((byte) 83);
        class201.method1403(6188);
        class41.method224((byte) -105);
        class112.method722(1);
        class278.method1856((byte) 77);
        class154.method1056((byte) 93);
        if (arg0 > -47) {
            field718 = null;
        }
        class294.method1972(-88);
        class68.method388((byte) 105);
        class105.method637(14);
        class184.method1284((byte) 123);
        class28.method166(-7531);
        class52.method302((byte) 21);
        class213.method1494((byte) -120);
        class5.method24(true);
        class165.method1143(false);
        class18.method100(-83);
        class106.method645(-115);
        class4.method21(true);
        class104.field1401.method1701((byte) 118);
        class253.field4118.method1701((byte) 89);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BC)Z")
    public static final boolean method324(byte arg0, char arg1) {
        field722++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class170.field2695;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        if (arg0 != 67) {
            field716 = -52;
        }
        return false;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public abstract void method325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method326(int arg0) {
        if (arg0 != 256) {
            field718 = null;
        }
        field718 = null;
        field724 = null;
        field725 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
