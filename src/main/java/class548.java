import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class548 extends class108 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/String;")
    public String field7624;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[[I")
    public static int[][] field7626 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[S")
    public static short[] field7625 = new short[] { 25, 51, 19, 13, 59, 48, 44, 45 };

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field7627 = 1337;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field7628 = 0;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lbn;")
    public static class371 field7630 = new class371(11, 0, 1, 2);

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lvt;")
    public static class344 field7631 = new class344("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lbo;")
    public static class227 field7632;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3024(int arg0) {
        field7630 = null;
        field7626 = null;
        field7632 = null;
        field7631 = null;
        field7625 = null;
        if (arg0 != 300) {
            field7625 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
    public static final int method3025(int arg0, int arg1, int arg2) {
        if (arg1 > -93) {
            field7631 = null;
        }
        field7629++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class548() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class548(String arg0, int arg1) {
        this.field7624 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILdg;ILjj;)V")
    public static final void method3026(int arg0, int arg1, class20 arg2, int arg3, class66 arg4) {
        field7623++;
        byte var5 = -1;
        if ((arg3 & 0x2) != 0) {
            int var6 = arg4.method3090(-82);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg4.method3064((byte) -89);
            class69.method397(-122, arg2, var6, var7);
        }
        if ((arg3 & 0x20000) != 0) {
            int var8 = class7.field61;
            int var9 = arg4.method3059(102);
            int var10 = arg4.method3041((byte) 116);
            arg2.method139(true, var8, var10, var9);
        }
        if ((arg3 & 0x200) != 0) {
            int var11 = arg4.method3041((byte) 115);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = arg4.method3037(true);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = arg4.method3035(-957401312);
                var14[var15] = arg4.method3090(-105);
            }
            class275.method1701(var14, 1, arg2, var13, var12);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field262 = arg4.method3090(-122);
            if (arg2.field421 == 0) {
                arg2.method130(-102, arg2.field262);
                arg2.field262 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var17 = arg4.method3037(true);
            if (var17 == 65535) {
                var17 = -1;
            }
            arg2.field399 = var17;
        }
        if ((arg3 & 0x4) != 0) {
            int var18 = arg4.method3039((byte) 127);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = arg4.method3078(16711680);
            int var20 = arg4.method3064((byte) -126);
            arg2.method140(-114, var19, false, var18, var20);
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field330 = arg4.method3067(0);
            arg2.field353 = arg4.method3067(0);
            arg2.field382 = arg4.method3051((byte) -52);
            arg2.field395 = arg4.method3051((byte) 109);
            arg2.field397 = arg4.method3039((byte) 127) + class7.field61;
            arg2.field345 = arg4.method3066((byte) 101) + class7.field61;
            arg2.field336 = arg4.method3035(-957401312);
            arg2.field424 = 0;
            if (arg2.field276) {
                arg2.field353 += arg2.field263;
                arg2.field395 += arg2.field263;
                arg2.field421 = 0;
                arg2.field330 += arg2.field244;
                arg2.field382 += arg2.field244;
            } else {
                arg2.field421 = 1;
                arg2.field395 += arg2.field417[0];
                arg2.field330 += arg2.field419[0];
                arg2.field353 += arg2.field417[0];
                arg2.field382 += arg2.field419[0];
            }
        }
        if (arg1 <= 108) {
            method3024(108);
        }
        if ((arg3 & 0x10) != 0) {
            int var21 = arg4.method3059(96);
            int var22 = arg4.method3041((byte) 88);
            arg2.method139(true, class7.field61, var22, var21);
            arg2.field346 = class7.field61 + 300;
            arg2.field384 = arg4.method3035(-957401312);
        }
        if ((arg3 & 0x800) != 0) {
            int var23 = arg4.method3090(-88);
            int var24 = arg4.method3048(-4);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var25 = arg4.method3064((byte) -73);
            arg2.method140(-117, var24, true, var23, var25);
        }
        if ((arg3 & 0x400) != 0) {
            var5 = arg4.method3034(18351);
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field271 = arg4.method3041((byte) 124) == 1;
        }
        if ((arg3 & 0x1) != 0) {
            int var26 = arg4.method3045(-128);
            byte[] var27 = new byte[var26];
            class551 var28 = new class551(var27);
            arg4.method3086(0, var27, true, var26);
            class601.field8697[arg0] = var28;
            arg2.method108(var28, -548);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field385 = arg4.method3077(-20739);
            if (arg2.field385.charAt(0) == '~') {
                arg2.field385 = arg2.field385.substring(1);
                class392.method2365(arg2.field385, (byte) -108, 0, arg2.method110(-1, true), 2, arg2.method106(-1, false));
            } else if (class147.field1899 == arg2) {
                class392.method2365(arg2.field385, (byte) 115, 0, arg2.method110(-1, true), 2, arg2.method106(-1, false));
            }
            arg2.field333 = 0;
            arg2.field409 = 150;
            arg2.field412 = 0;
        }
        if ((arg3 & 0x10000) != 0) {
            arg2.field322 = arg4.method3051((byte) -119);
            arg2.field406 = arg4.method3067(0);
            arg2.field371 = arg4.method3034(18351);
            arg2.field362 = (byte) arg4.method3064((byte) -119);
            arg2.field323 = class7.field61 + arg4.method3066((byte) 101);
            arg2.field402 = class7.field61 + arg4.method3037(true);
        }
        if ((arg3 & 0x8) != 0) {
            class635.field9236[arg0] = arg4.method3033((byte) 104);
        }
        if ((arg3 & 0x1000) != 0) {
            int var29 = arg4.method3039((byte) 127);
            arg2.field343 = arg4.method3041((byte) 96);
            arg2.field370 = arg4.method3064((byte) -84);
            arg2.field396 = var29 & 0x7FFF;
            arg2.field375 = (var29 & 0x8000) != 0;
            arg2.field347 = class7.field61 + arg2.field343 + arg2.field396;
        }
        if (!arg2.field276) {
            return;
        }
        if (var5 == 127) {
            arg2.method117(arg2.field244, -23813, arg2.field263);
            return;
        }
        byte var30;
        if (var5 == -1) {
            var30 = class635.field9236[arg0];
        } else {
            var30 = var5;
        }
        arg2.method115(arg2.field244, (byte) 13, var30, arg2.field263);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
    public static final int method3027(int arg0) {
        field7622++;
        if (arg0 != 65535) {
            method3025(-11, 38, 119);
        }
        return class618.field8918++;
    }
}
