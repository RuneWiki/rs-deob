import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class70 extends class525 {

    @OriginalMember(owner = "client!er", name = "G", descriptor = "[B")
    public byte[] field1152;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "Lbd;")
    public static class44 field1148 = new class44("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "[I")
    public static int[] field1151 = new int[32];

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field1153;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1151[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lci;BLci;Lqa;)V", line = 6)
    public static final void method543(class320 arg0, byte arg1, class320 arg2, class167 arg3) {
        class199.field3053 = class159.method1115(arg0, 0, -4, class102.field1585);
        field1154++;
        class521.field7593 = arg3.method279(class199.field3053, class104.method760(arg2, class102.field1585, 0), true);
        class218.field3334 = class159.method1115(arg0, 0, -4, class470.field6816);
        class406.field5775 = arg3.method279(class218.field3334, class104.method760(arg2, class470.field6816, 0), true);
        class425.field6028 = class159.method1115(arg0, 0, -4, class17.field188);
        class270.field4072 = arg3.method279(class425.field6028, class104.method760(arg2, class17.field188, 0), true);
        int var4 = -84 % ((80 - arg1) / 41);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILki;Liu;II)V", line = 23)
    public static final void method544(int arg0, class510 arg1, class415 arg2, int arg3, int arg4) {
        field1147++;
        if ((arg3 & 0x1) != 0) {
            arg1.field7394 = arg2.method3081(arg4 + 24083);
            if (arg1.field333 == 0) {
                arg1.method134((byte) -113, arg1.field7394);
                arg1.field7394 = -1;
            }
        }
        byte var5 = -1;
        if ((arg3 & 0x40) != 0) {
            int var6 = arg2.method3064(-2);
            if (var6 == 65535) {
                var6 = -1;
            }
            arg1.field260 = var6;
        }
        if ((arg3 & 0x200) != 0) {
            int var7 = arg2.method3065((byte) -127);
            int var8 = arg2.method3022(-119);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var9 = arg2.method3072((byte) -120);
            arg1.method132(false, var9, (byte) -12, var7, var8);
        }
        if ((arg3 & 0x100) != 0) {
            int var10 = class24.field349;
            int var11 = arg2.method3033(arg4 ^ 0x2E0E);
            int var12 = arg2.method3076(arg4);
            arg1.method124((byte) -9, var11, var10, var12);
        }
        if ((arg3 & 0x8) != 0) {
            int var13 = arg2.method3033(11790);
            int var14 = arg2.method3072((byte) -119);
            arg1.method124((byte) -9, var13, class24.field349, var14);
            arg1.field319 = class24.field349 + 300;
            arg1.field241 = arg2.method3060(-23438);
        }
        if ((arg3 & 0x40000) != arg4) {
            arg1.field276 = arg2.method3026(-124);
            arg1.field268 = arg2.method3063((byte) -21);
            arg1.field253 = arg2.method3034((byte) 101);
            arg1.field265 = (byte) arg2.method3076(0);
            arg1.field257 = class24.field349 + arg2.method3081(arg4 ^ 0x5E13);
            arg1.field296 = class24.field349 + arg2.method3064(arg4 - 2);
        }
        if ((arg3 & 0x10000) != 0) {
            int var15 = arg2.method3081(24083);
            int var16 = arg2.method3038((byte) -125);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var17 = arg2.method3072((byte) -124);
            arg1.method132(true, var17, (byte) -12, var15, var16);
        }
        if ((arg3 & 0x2) != 0) {
            int var18 = arg2.method3076(arg4);
            byte[] var19 = new byte[var18];
            class519 var20 = new class519(var19);
            arg2.method3069(var18, arg4 + 255, var19, 0);
            class138.field2148[arg0] = var20;
            arg1.method2967(-35, var20);
        }
        if ((arg3 & 0x80) != 0) {
            class319.field4736[arg0] = arg2.method3063((byte) -21);
        }
        if ((arg3 & 0x800) != 0) {
            var5 = arg2.method3034((byte) 70);
        }
        if ((arg3 & 0x20) != 0) {
            int var21 = arg2.method3064(arg4 ^ 0xFFFFFFFE);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg2.method3060(-23438);
            class483.method2849(var21, arg1, var22, (byte) -67);
        }
        if ((arg3 & 0x4) != 0) {
            int var23 = arg2.method3065((byte) -128);
            int var24 = arg2.method3075(16);
            int var25 = arg2.method3075(1);
            int var26 = arg2.field7558;
            boolean var27 = (var23 & 0x8000) != 0;
            if (arg1.field7363 != null && arg1.field7403 != null) {
                boolean var28 = false;
                if (var24 <= 1) {
                    if (!var27 && (class10.field88 && !class78.field1274 || class317.field4710)) {
                        var28 = true;
                    } else if (class163.method1179(arg1.field7363, (byte) 8)) {
                        var28 = true;
                    }
                }
                if (!var28 && class174.field2601 == 0) {
                    class295.field4417.field7558 = 0;
                    arg2.method3030(class295.field4417.field7545, 10690, 0, var25);
                    class295.field4417.field7558 = 0;
                    int var29 = -1;
                    String var31;
                    if (var27) {
                        var23 &= 0x7FFF;
                        class258 var30 = class182.method1260(0, class295.field4417);
                        var29 = var30.field3822;
                        var31 = var30.field3824.method1721(0, class295.field4417);
                    } else {
                        var31 = class374.method2280(class472.method2797(32767, class295.field4417), true);
                    }
                    arg1.field239 = var31.trim();
                    arg1.field312 = var23 & 0xFF;
                    arg1.field249 = var23 >> 8;
                    arg1.field306 = 150;
                    int var32;
                    if (var24 == 1 || var24 == 2) {
                        var32 = var27 ? 17 : 1;
                    } else {
                        var32 = var27 ? 17 : 2;
                    }
                    if (var24 == 2) {
                        class267.method1716(99, "<img=1>" + arg1.method2972(false, -125), var31, 0, "<img=1>" + arg1.method2973(true, true), null, var29, var32);
                    } else if (var24 == 1) {
                        class267.method1716(99, "<img=0>" + arg1.method2972(false, -123), var31, 0, "<img=0>" + arg1.method2973(true, true), null, var29, var32);
                    } else {
                        class267.method1716(99, arg1.method2972(false, arg4 ^ 0x49), var31, 0, arg1.method2973(true, true), null, var29, var32);
                    }
                }
            }
            arg2.field7558 = var25 + var26;
        }
        if ((arg3 & 0x400) != 0) {
            int var33 = arg2.method3018(arg4 ^ 0x21CB9838);
            arg1.field291 = arg2.method3072((byte) -121);
            arg1.field263 = arg2.method3072((byte) -120);
            arg1.field304 = var33 & 0x7FFF;
            arg1.field272 = (var33 & 0x8000) != 0;
            arg1.field310 = class24.field349 + arg1.field304 + arg1.field291;
        }
        if ((arg3 & 0x20000) != 0) {
            int var34 = arg2.method3060(-23438);
            int[] var35 = new int[var34];
            int[] var36 = new int[var34];
            int[] var37 = new int[var34];
            for (int var38 = 0; var38 < var34; var38++) {
                int var39 = arg2.method3081(24083);
                if (var39 == 65535) {
                    var39 = -1;
                }
                var35[var38] = var39;
                var36[var38] = arg2.method3060(-23438);
                var37[var38] = arg2.method3018(566990904);
            }
            class431.method2552(var35, -1, var37, var36, arg1);
        }
        if ((arg3 & 0x1000) != 0) {
            arg1.field7375 = arg2.method3072((byte) -124) == 1;
        }
        if ((arg3 & 0x8000) != 0) {
            arg1.field236 = arg2.method3034((byte) -45);
            arg1.field279 = arg2.method3034((byte) -54);
            arg1.field325 = arg2.method3034((byte) 101);
            arg1.field278 = arg2.method3036((byte) 99);
            arg1.field308 = arg2.method3065((byte) -127) + class24.field349;
            arg1.field314 = arg2.method3018(566990904) + class24.field349;
            arg1.field266 = arg2.method3075(90);
            if (arg1.field7382) {
                arg1.field325 += arg1.field7379;
                arg1.field333 = 0;
                arg1.field236 += arg1.field7379;
                arg1.field279 += arg1.field7372;
                arg1.field278 += arg1.field7372;
            } else {
                arg1.field278 += arg1.field344[0];
                arg1.field236 += arg1.field343[0];
                arg1.field325 += arg1.field343[0];
                arg1.field279 += arg1.field344[0];
                arg1.field333 = 1;
            }
            arg1.field335 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            arg1.field239 = arg2.method3082((byte) 78);
            if (arg1.field239.charAt(0) == '~') {
                arg1.field239 = arg1.field239.substring(1);
                class10.method52(arg1.method2973(true, true), 108, 2, arg1.field239, arg1.method2972(false, 5), 0);
            } else if (class364.field5293 == arg1) {
                class10.method52(arg1.method2973(true, true), arg4 ^ 0x46, 2, arg1.field239, arg1.method2972(false, -120), 0);
            }
            arg1.field249 = 0;
            arg1.field312 = 0;
            arg1.field306 = 150;
        }
        if (!arg1.field7382) {
            return;
        }
        if (var5 == 127) {
            arg1.method2965(arg1.field7379, (byte) 44, arg1.field7372);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class319.field4736[arg0];
        } else {
            var40 = var5;
        }
        arg1.method2969(var40, arg1.field7372, arg1.field7379, (byte) 122);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V", line = 361)
    public static void method545(int arg0) {
        field1148 = null;
        if (arg0 >= 113) {
            field1153 = null;
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "([B)V", line = 376)
    public class70(byte[] arg0) {
        this.field1152 = arg0;
    }
}
