import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class35 implements class119 {

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    private int field424 = -1;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    private int field420 = 0;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "[Leq;")
    private class513[] field439 = new class513[9];

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Ltt;")
    private class249 field428;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field418 = -60;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "Lmu;")
    public static class346 field443;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILcd;II)V")
    private final void method209(int arg0, class65 arg1, int arg2, int arg3) {
        field421++;
        if (arg2 != -11992) {
            this.method211((byte) -75, null, -56, 94);
        }
        if (this.field424 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((~var5 & this.field437) == 0) {
            this.field425 = arg1.field1027;
            this.field413 = arg1.field1026;
        } else if (this.field413 != arg1.field1026 || this.field425 != arg1.field1027) {
            throw new RuntimeException();
        }
        arg1.method436(class386.field5686[arg0], (byte) 96, this.field424, arg3);
        this.field439[arg0] = arg1;
        this.field437 |= var5;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static void method210(byte arg0) {
        field443 = null;
        if (arg0 > -77) {
            field418 = 119;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLrh;II)V")
    public final void method211(byte arg0, class32 arg1, int arg2, int arg3) {
        this.method227(arg1, arg2, 0, 0, arg3);
        if (arg0 < 88) {
            method229(null, 84);
        }
        field432++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLza;)V")
    public static final void method212(byte arg0, class299 arg1) {
        field417++;
        if (class50.field768.method297(0) == 0) {
            return;
        }
        if (class108.field1631 == 0) {
            for (class8 var2 = (class8) class50.field768.method295((byte) -22); var2 != null; var2 = (class8) class50.field768.method296(true)) {
                class300.field4608.method2087(var2.field91, arg1, var2.field92, arg1, false, var2.field99, false, 111, var2.field88 ? class116.field1781.field7460 : null, var2.field94, class532.field7770, var2.field90);
                var2.method947((byte) 126);
            }
            class80.method713(-14703);
        } else {
            if (class231.field3483 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class231.field3483 = class299.method1995(class130.field1930, 88, var3, 0, class122.field1844, 0);
                class410.field6067 = class231.field3483.method542(class367.method2334(-108, 0, class294.field4539, class312.field4754), class309.method2045(class510.field7431, class294.field4539, 0), true);
            }
            for (class8 var4 = (class8) class50.field768.method295((byte) 127); var4 != null; var4 = (class8) class50.field768.method296(true)) {
                class300.field4608.method2087(var4.field91, class231.field3483, var4.field92, arg1, false, var4.field99, false, 109, var4.field88 ? class116.field1781.field7460 : null, var4.field94, class410.field6067, var4.field90);
                var4.method947((byte) 115);
            }
        }
        if (arg0 < 87) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    public final void method213(byte arg0, int arg1) {
        field430++;
        if (this.field424 == -1) {
            throw new RuntimeException();
        }
        if (arg0 >= -82) {
            this.method228((byte) 30, null, -32);
        }
        OpenGL.glDrawBuffer(class386.field5686[arg1]);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
    public final void method214(boolean arg0, int arg1) {
        field412++;
        if (this.field424 == -1) {
            throw new RuntimeException();
        } else if (!arg0) {
            OpenGL.glReadBuffer(class386.field5686[arg1]);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method215(String arg0, int arg1) {
        field433++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class517.method3057(-127, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class517.method3057(-127, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg1 > -87) {
            method215(null, 8);
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class215.method1476(var7, 8025)) {
                char var8 = class430.method2680(var7, 88);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public final void method216(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field440);
        field435++;
        this.field420 |= 0x2;
        if (arg0 != 6177) {
            this.field420 = 2;
        }
        this.field424 = this.method225(true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Class;)Laa;")
    public static final class76 method217(int arg0, int arg1, int arg2, Class arg3) {
        class281 var4 = class348.field5192[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class21 var5 = var4.field4381; var5 != null; var5 = var5.field235) {
            class76 var6 = var5.field240;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1283 == arg1 && var6.field1277 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public final void method218(byte arg0) {
        field414++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field420 &= 0xFFFFFFFE;
        this.field424 = this.method225(true);
        if (arg0 >= -62) {
            this.method231((byte) -44, 42);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final void method219(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field440);
        field441++;
        if (arg0 != 2509) {
            this.method223(84);
        }
        this.field420 |= 0x1;
        this.field424 = this.method225(true);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z")
    public final boolean method220(int arg0) {
        field436++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field424);
        if (arg0 != -16793) {
            this.field439 = null;
        }
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final void method221(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field423++;
        if (arg0 != 11957) {
            this.field425 = -104;
        }
        this.field420 &= 0xFFFFFFFD;
        this.field424 = this.method225(true);
    }

    @OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field426++;
        this.field428.method1776(this.field440, (byte) -60);
        super.finalize();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        if (arg0) {
            this.method222(true);
        }
        field419++;
        return this.field425;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public final void method223(int arg0) {
        field415++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field420 &= 0xFFFFFFFB;
        this.field424 = this.method225(true);
        if (arg0 != -4807) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
    public static final void method224(int arg0) {
        field442++;
        class10.method51(true);
        class62.method421(22050, class40.field667.field4203, (byte) -112, 2);
        class350.field5227 = class506.method3016(class122.field1844, arg0, 0, 4189, class342.field5114);
        class350.field5227.method2817(class319.field4844, (byte) -114);
        class176.field2707 = class506.method3016(class122.field1844, 2048, 1, 4189, class342.field5114);
        class176.field2707.method2817(class503.field7313, (byte) -114);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)I")
    private final int method225(boolean arg0) {
        field427++;
        if ((this.field420 & 0x4) != 0) {
            return 36160;
        } else if ((this.field420 & 0x2) != 0) {
            return 36009;
        } else if ((this.field420 & 0x1) == 0) {
            if (!arg0) {
                this.field425 = -33;
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method226(byte arg0) {
        field422++;
        if (arg0 == 99) {
            OpenGL.glBindFramebufferEXT(36160, this.field440);
            this.field420 |= 0x4;
            this.field424 = this.method225(true);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lrh;IIII)V")
    private final void method227(class32 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            return;
        }
        field438++;
        if (this.field424 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg4;
        if ((~var6 & this.field437) == 0) {
            this.field413 = arg0.field383;
            this.field425 = arg0.field383;
        } else if (this.field413 != arg0.field383 || this.field425 != arg0.field383) {
            throw new RuntimeException();
        }
        arg0.method194(class386.field5686[arg4], arg3, arg1, (byte) -128, this.field424);
        this.field439[arg4] = arg0;
        this.field437 |= var6;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLcd;I)V")
    public final void method228(byte arg0, class65 arg1, int arg2) {
        this.method209(arg2, arg1, -11992, 0);
        field429++;
        int var4 = 100 / ((-arg0 - 56) / 50);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method229(String arg0, int arg1) {
        field416++;
        if (class433.field6436 == null) {
            return;
        }
        class110.method857(4095, class157.field2406);
        class36.field447++;
        int var2 = -35 % ((arg1 + 50) / 52);
        class312.field4752.method1381(class447.method2755(arg0, (byte) -101), (byte) 108);
        class312.field4752.method1343(arg0, (byte) -14);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ldr;ZI)V")
    public final void method230(class296 arg0, boolean arg1, int arg2) {
        field431++;
        if (this.field424 == -1) {
            throw new RuntimeException();
        }
        if (arg1) {
            method215(null, -37);
        }
        int var4 = 0x1 << arg2;
        if ((this.field437 & ~var4) == 0) {
            this.field425 = arg0.field4552;
            this.field413 = arg0.field4564;
        } else if (this.field413 != arg0.field4564 || this.field425 != arg0.field4552) {
            throw new RuntimeException();
        }
        arg0.method1975((byte) 54, this.field424, class386.field5686[arg2]);
        this.field439[arg2] = arg0;
        this.field437 |= var4;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)V")
    public final void method231(byte arg0, int arg1) {
        if (this.field439[arg1] != null) {
            this.field439[arg1].method192(-110);
        }
        field434++;
        this.field437 &= ~(0x1 << arg1);
        this.field439[arg1] = null;
        int var3 = 88 % ((-arg0 - 65) / 54);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ltt;)V")
    public class35(class249 arg0) {
        if (!arg0.field3993) {
            throw new IllegalStateException("");
        }
        this.field428 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class101.field1559, 0);
        this.field440 = class101.field1559[0];
    }
}
