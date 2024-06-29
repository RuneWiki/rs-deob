import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class33 extends class29 {

    @OriginalMember(owner = "mapview!s", name = "u", descriptor = "[B")
    public byte[] field418;

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "mapview!s", name = "q", descriptor = "Lj;")
    public static class17 field414 = class30.method190(-128, "Potters Wheel");

    @OriginalMember(owner = "mapview!s", name = "p", descriptor = "I")
    public static int field413 = -1;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "Lj;")
    public static class17 field409 = class30.method190(-119, " map");

    @OriginalMember(owner = "mapview!s", name = "s", descriptor = "Lj;")
    public static class17 field416 = class30.method190(-126, "");

    @OriginalMember(owner = "mapview!s", name = "o", descriptor = "I")
    public static volatile int field412 = 0;

    @OriginalMember(owner = "mapview!s", name = "w", descriptor = "[Z")
    public static boolean[] field420 = new boolean[112];

    @OriginalMember(owner = "mapview!s", name = "y", descriptor = "Lj;")
    public static class17 field422 = class30.method190(-113, "mapscene");

    @OriginalMember(owner = "mapview!s", name = "x", descriptor = "I")
    public static int field421 = 500;

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field411;

    @OriginalMember(owner = "mapview!s", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field419;

    @OriginalMember(owner = "mapview!s", name = "t", descriptor = "[Lla;")
    public static class22[] field417;

    @OriginalMember(owner = "mapview!s", name = "r", descriptor = "[[B")
    public static byte[][] field415;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "[[[I")
    public static int[][][] field408;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 9)
    public static final void method209(byte arg0, Component arg1) {
        Method var2 = class7.field150;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 != -35) {
            field414 = null;
        }
        arg1.addKeyListener(class28.field364);
        arg1.addFocusListener(class28.field364);
    }

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "(I)I", line = 47)
    private final int method210(int arg0) {
        this.field410 += 3;
        int var2 = -53 / ((arg0 + 31) / 52);
        return ((this.field418[this.field410 - 3] & 0xFF) << 16) + (this.field418[this.field410 - 2] << 8 & 0xFF00) + (this.field418[this.field410 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[B)V", line = 59)
    public static final void method211(int arg0, byte[] arg1) {
        class33 var2 = new class33(arg1);
        var2.field410 = arg1.length - 2;
        class16.field254 = var2.method218(810291624);
        mapview.field2 = new int[class16.field254];
        class26.field334 = new int[class16.field254];
        class1.field68 = new int[class16.field254];
        class29.field375 = new int[class16.field254];
        field415 = new byte[class16.field254][];
        var2.field410 = arg1.length - class16.field254 * 8 - 7;
        class1.field69 = var2.method218(810291624);
        class12.field229 = var2.method218(arg0 + 810291625);
        int var3 = (var2.method212(4) & 0xFF) + 1;
        for (int var4 = 0; var4 < class16.field254; var4++) {
            class1.field68[var4] = var2.method218(810291624);
        }
        for (int var5 = 0; var5 < class16.field254; var5++) {
            class29.field375[var5] = var2.method218(810291624);
        }
        for (int var6 = 0; var6 < class16.field254; var6++) {
            mapview.field2[var6] = var2.method218(810291624);
        }
        for (int var7 = 0; var7 < class16.field254; var7++) {
            class26.field334[var7] = var2.method218(810291624);
        }
        var2.field410 = arg1.length - class16.field254 * 8 - (arg0 + var3) * 3 - 7;
        class31.field396 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class31.field396[var8] = var2.method210(-126);
            if (class31.field396[var8] == 0) {
                class31.field396[var8] = 1;
            }
        }
        var2.field410 = 0;
        for (int var9 = 0; var9 < class16.field254; var9++) {
            int var10 = class26.field334[var9];
            int var11 = mapview.field2[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            field415[var9] = var13;
            int var14 = var2.method212(63);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method224((byte) -106);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var15 + var11 * var16] = var2.method224((byte) -106);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "(I)I", line = 182)
    public final int method212(int arg0) {
        int var2 = 10 % ((-arg0 - 65) / 34);
        return this.field418[this.field410++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([IIII)V", line = 212)
    public final void method213(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 - arg2) / 8;
        int var6 = this.field410;
        this.field410 = arg2;
        if (arg1 != -1902385208) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method219(0);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            int var12 = this.method219(arg1 + 1902385208);
            while (var11-- > 0) {
                var12 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg0[var9 >>> 11 & 0x59400003] + var9;
                var9 -= var10;
                var8 -= arg0[var9 & 0x3] + var9 ^ (var12 << 4 ^ var12 >>> 5) + var12;
            }
            this.field410 -= 8;
            this.method220(var8, false);
            this.method220(var12, false);
        }
        this.field410 = var6;
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(B)V", line = 254)
    public static final void method214(byte arg0) {
        if (arg0 < 87) {
            field408 = null;
        }
        if (class7.field141.toLowerCase().indexOf("microsoft") != -1) {
            class13.field239[186] = 57;
            class13.field239[187] = 27;
            class13.field239[188] = 71;
            class13.field239[189] = 26;
            class13.field239[190] = 72;
            class13.field239[191] = 73;
            class13.field239[192] = 58;
            class13.field239[219] = 42;
            class13.field239[220] = 74;
            class13.field239[221] = 43;
            class13.field239[222] = 59;
            class13.field239[223] = 28;
            return;
        }
        class13.field239[44] = 71;
        class13.field239[45] = 26;
        class13.field239[46] = 72;
        class13.field239[47] = 73;
        class13.field239[59] = 57;
        class13.field239[61] = 27;
        class13.field239[91] = 42;
        class13.field239[92] = 74;
        class13.field239[93] = 43;
        if (class7.field150 == null) {
            class13.field239[192] = 58;
            class13.field239[222] = 59;
        } else {
            class13.field239[192] = 28;
            class13.field239[222] = 58;
            class13.field239[520] = 59;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(III[B)V", line = 314)
    public final void method215(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = arg2;
        if (arg1 != -8361) {
            field422 = null;
        }
        while (var5 < arg2 + arg0) {
            arg3[var5] = this.field418[this.field410++];
            var5++;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(Z)V", line = 328)
    public static void method216(boolean arg0) {
        field415 = null;
        field411 = null;
        field417 = null;
        field416 = null;
        if (arg0) {
            method209((byte) 6, null);
        }
        field419 = null;
        field414 = null;
        field408 = null;
        field420 = null;
        field409 = null;
        field422 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(II)V", line = 349)
    public final void method217(int arg0, int arg1) {
        this.field418[this.field410++] = (byte) arg0;
        int var3 = -65 / ((-arg1 - 66) / 42);
    }

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "(I)I", line = 372)
    public final int method218(int arg0) {
        if (arg0 != 810291624) {
            this.method213(null, -53, 72, 63);
        }
        this.field410 += 2;
        return ((this.field418[this.field410 - 2] & 0xFF) << 8) + (this.field418[this.field410 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "(I)I", line = 393)
    public final int method219(int arg0) {
        this.field410 += 4;
        if (arg0 != 0) {
            method211(117, null);
        }
        return ((this.field418[this.field410 - 4] & 0xFF) << 24) + ((this.field418[this.field410 - 3] & 0xFF) << 16) + (this.field418[this.field410 + -1] & 0xFF) + ((this.field418[this.field410 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IZ)V", line = 409)
    public final void method220(int arg0, boolean arg1) {
        if (!arg1) {
            this.field418[this.field410++] = (byte) (arg0 >> 24);
            this.field418[this.field410++] = (byte) (arg0 >> 16);
            this.field418[this.field410++] = (byte) (arg0 >> 8);
            this.field418[this.field410++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "(I)Lj;", line = 432)
    public final class17 method221(int arg0) {
        if (arg0 == -598525000) {
            int var2 = this.field410;
            while (this.field418[this.field410++] != 0) {
            }
            return class32.method208(this.field418, this.field410 - var2 - 1, 0, var2);
        } else {
            return (class17) null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "(I)V", line = 451)
    public static final void method222(int arg0) {
        if (arg0 != -1393530170) {
            field409 = null;
        }
        if (++class27.field352 >= 64) {
            class23.field305++;
            class27.field352 = 0;
            if (class3.field90 >> 6 > class23.field305) {
                class24.method161(arg0 ^ 0x530F9555);
            }
        }
        class13.field234 = (class27.field352 << 6) + class23.field304;
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(I)V", line = 487)
    public class33(int arg0) {
        this.field418 = class35.method239(11, arg0);
        this.field410 = 0;
    }

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "(I)[Lla;", line = 503)
    public static final class22[] method223(int arg0) {
        class22[] var1 = new class22[class16.field254];
        for (int var2 = 0; var2 < class16.field254; var2++) {
            class22 var3 = var1[var2] = new class22();
            var3.field294 = class1.field68[var2];
            var3.field295 = class29.field375[var2];
            var3.field296 = mapview.field2[var2];
            var3.field298 = class26.field334[var2];
            int var4 = var3.field298 * var3.field296;
            byte[] var5 = field415[var2];
            var3.field297 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field297[var6] = class31.field396[class32.method205(255, var5[var6])];
            }
        }
        if (arg0 == 255) {
            class3.method28(11793);
            return var1;
        } else {
            return (class22[]) null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(B)B", line = 552)
    private final byte method224(byte arg0) {
        if (arg0 != -106) {
            field421 = -37;
        }
        return this.field418[this.field410++];
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "([B)V", line = 562)
    public class33(byte[] arg0) {
        this.field418 = arg0;
        this.field410 = 0;
    }
}
