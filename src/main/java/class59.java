import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class59 extends class130 {

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "[Lgd;")
    public class59[] field1214;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Z")
    public boolean field1216;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lsd;")
    public static class166 field1208 = class135.method935("<col=ff3000>", 0);

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lsd;")
    private static class166 field1225 = class135.method935("button near the top of that page)3", 0);

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lsd;")
    public static class166 field1213 = class135.method935("Ein kostenloses Spielkonto erstellen)3", 0);

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lsd;")
    public static class166 field1209 = field1225;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lsd;")
    private static class166 field1228 = class135.method935("Too many incorrect logins from your address)3", 0);

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lsd;")
    public static class166 field1217 = field1228;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lre;")
    public static class158 field1215;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lgh;")
    public class63 field1207;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Lkb;")
    public class92 field1219;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "[Lkf;")
    public static class96[] field1222;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[[I")
    public final int[][] method498(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method287(-3);
        }
        field1210++;
        if (this.field1214[arg2].field1216) {
            int[] var4 = this.field1214[arg2].method36(arg0, (byte) -125);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1214[arg2].method37(true, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public void method287(int arg0) {
        field1205++;
        if (arg0 != 23459) {
            method504(49, (byte) 78, -94, 105, -79, -11);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)[I")
    public final int[] method499(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field1230++;
            return this.field1214[arg2].field1216 ? this.field1214[arg2].method36(arg1, (byte) -126) : this.field1214[arg2].method37(true, arg1)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Z")
    public static final boolean method500(int arg0, byte arg1) {
        if (arg1 < 114) {
            method500(-1, (byte) -87);
        }
        field1229++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lff;BI)V")
    public void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            this.field1216 = false;
        }
        field1206++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
    public int method501(byte arg0) {
        field1223++;
        return arg0 == 78 ? -1 : 92;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1222 = null;
        field1213 = null;
        field1208 = null;
        field1215 = null;
        if (arg0 != -21659) {
            method502(101);
        }
        field1217 = null;
        field1225 = null;
        field1209 = null;
        field1228 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V")
    public final void method503(int arg0, int arg1, int arg2) {
        if (arg1 != 19284) {
            this.method41(null, (byte) 5, -47);
        }
        field1204++;
        int var4 = this.field1220 == 255 ? arg0 : this.field1220;
        if (this.field1216) {
            this.field1219 = new class92(var4, arg0, arg2);
        } else {
            this.field1207 = new class63(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIII)V")
    public static final void method504(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1221++;
        if (class29.field531 == arg4 && class60.field1233 == arg5 && (class37.field682 == arg2 || !class97.field1858)) {
            return;
        }
        class60.field1233 = arg5;
        class37.field682 = arg2;
        class29.field531 = arg4;
        if (!class97.field1858) {
            class37.field682 = 0;
        }
        class88.method695((byte) -125, 25);
        class116.method838(250, true, class146.field2880);
        int var6 = class170.field3279;
        class170.field3279 = arg4 * 8 - 48;
        int var7 = class170.field3279 - var6;
        int var8 = class170.field3279;
        int var9 = class147.field2901;
        class147.field2901 = (arg5 - 6) * 8;
        int var10 = class147.field2901 - var9;
        int var11 = class147.field2901;
        for (int var12 = 0; var12 < 32768; var12++) {
            class154 var28 = class124.field2434[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3554[var29] -= var7;
                    var28.field3521[var29] -= var10;
                }
                var28.field3513 -= var10 * 128;
                var28.field3526 -= var7 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class123 var26 = class182.field3451[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3554[var27] -= var7;
                    var26.field3521[var27] -= var10;
                }
                var26.field3526 -= var7 * 128;
                var26.field3513 -= var10 * 128;
            }
        }
        byte var14 = 0;
        class165.field3130 = arg2;
        class41.field728.method1242(arg0, arg1 ^ 0xFFFFFFAA, false, arg3);
        if (arg1 != -39) {
            field1213 = null;
        }
        byte var15 = 1;
        byte var16 = 104;
        if (var7 < 0) {
            var14 = 103;
            var16 = -1;
            var15 = -1;
        }
        byte var17 = 104;
        byte var18 = 1;
        byte var19 = 0;
        if (var10 < 0) {
            var18 = -1;
            var17 = -1;
            var19 = 103;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var19; var22 != var17; var22 += var18) {
                int var23 = var7 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class111.field2144[var25][var20][var22] = class111.field2144[var25][var23][var24];
                    } else {
                        class111.field2144[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class46 var21 = (class46) class32.field588.method1109((byte) -61); var21 != null; var21 = (class46) class32.field588.method1115((byte) -90)) {
            var21.field828 -= var7;
            var21.field826 -= var10;
            if (var21.field828 < 0 || var21.field826 < 0 || var21.field828 >= 104 || var21.field826 >= 104) {
                var21.method915(0);
            }
        }
        class38.field691 = 0;
        if (class16.field276 != 0) {
            class16.field276 -= var7;
            class32.field595 -= var10;
        }
        class102.field2016 = -1;
        class25.field446 = false;
        class134.field2596.method1104(91);
        class106.field2075.method1104(arg1 ^ 0x76);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
    public int method505(byte arg0) {
        field1224++;
        return arg0 == 66 ? -1 : -82;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method506(boolean arg0) {
        if (this.field1216) {
            this.field1219.method717(4096);
            this.field1219 = null;
        } else {
            this.field1207.method530(74);
            this.field1207 = null;
        }
        field1211++;
        if (!arg0) {
            field1209 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IZ)V")
    public class59(int arg0, boolean arg1) {
        this.field1214 = new class59[arg0];
        this.field1216 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)[[I")
    public int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            field1228 = null;
        }
        field1218++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)[I")
    public int[] method36(int arg0, byte arg1) {
        field1212++;
        if (arg1 > -124) {
            field1228 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
