import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class660 extends class104 {

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field9370 = new String[] { method4790(method4789("\u0012o;a6")), method4790(method4789("\u0012o;t6")), method4790(method4789("\u0012o;g6")), method4790(method4789("\u0012o;c6")), method4790(method4789("\u0012o;u6")), method4790(method4789("\u0012o;`6")), method4790(method4789("\u0012o;l6")), method4790(method4789("\u0012o;o6")), method4790(method4789("\u000f\";\bc")), method4790(method4789("\u001ayyJ")), method4790(method4789("\u0012o;d_\\")), method4790(method4789("\u0012o;j6")), method4790(method4789("\u0012o;b6")), method4790(method4789("\u0012o;w6")), method4790(method4789("\u0012o;c_\\")), method4790(method4789("\u0012o;d6")), method4790(method4789("\u0012o;a_\\")), method4790(method4789("\u0012o;e6")), method4790(method4789("\u0012o;k6")), method4790(method4789("\u0012o;e_\\")), method4790(method4789("\u0012o;\u001aw\u001aea\u00186")), method4790(method4789("\u0012o;n6")) };

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Llf;")
    public static class260 field9367 = new class260(6, 3);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "F")
    public float field9340;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "F")
    public float field9342;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
    public float field9345;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "F")
    public float field9347;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "F")
    public float field9348;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "F")
    public float field9349;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "F")
    public float field9353;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "F")
    public float field9357;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "F")
    public float field9359;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "F")
    public float field9360;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
    public float field9362;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "F")
    public float field9363;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III[I)V", line = 15)
    public final void method732(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            int var9 = (int) ((float) arg2 - this.field9347);
            int var7 = (int) ((float) arg0 - this.field9348);
            field9361++;
            int var8 = (int) ((float) arg1 - this.field9359);
            arg3[1] = (int) ((float) var9 * this.field9357 + (float) var7 * this.field9345 + (float) var8 * this.field9363);
            arg3[0] = (int) ((float) var9 * this.field9360 + (float) var7 * this.field9340 + (float) var8 * this.field9349);
            arg3[2] = (int) ((float) var9 * this.field9362 + (float) var7 * this.field9342 + (float) var8 * this.field9353);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9370[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9370[9] : field9370[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()Lqa;", line = 29)
    public final class104 method737() {
        try {
            field9350++;
            class660 var1 = new class660();
            var1.field9345 = this.field9345;
            var1.field9363 = this.field9363;
            var1.field9349 = this.field9349;
            var1.field9360 = this.field9360;
            var1.field9342 = this.field9342;
            var1.field9353 = this.field9353;
            var1.field9362 = this.field9362;
            var1.field9340 = this.field9340;
            var1.field9348 = this.field9348;
            var1.field9347 = this.field9347;
            var1.field9359 = this.field9359;
            var1.field9357 = this.field9357;
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9370[12] + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V", line = 58)
    public final void method739(int arg0, int arg1, int arg2) {
        try {
            field9364++;
            this.field9347 = arg2;
            this.field9349 = this.field9360 = this.field9345 = this.field9357 = this.field9342 = this.field9353 = 0.0F;
            this.field9359 = arg1;
            this.field9348 = arg0;
            this.field9340 = this.field9363 = this.field9362 = 1.0F;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9370[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)V", line = 70)
    public final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field9343++;
            float var7 = class705.field9857[arg3 & 0x3FFF];
            float var8 = class705.field9848[arg3 & 0x3FFF];
            float var9 = class705.field9857[arg4 & 0x3FFF];
            float var10 = class705.field9848[arg4 & 0x3FFF];
            float var11 = class705.field9857[arg5 & 0x3FFF];
            float var12 = class705.field9848[arg5 & 0x3FFF];
            float var13 = var8 * var11;
            float var14 = var8 * var12;
            this.field9362 = var7 * var9;
            this.field9340 = var9 * var11 + var10 * var14;
            this.field9357 = -var8;
            this.field9363 = var7 * var11;
            this.field9345 = var7 * var12;
            this.field9353 = var9 * var13 + var10 * var12;
            this.field9349 = -var9 * var12 + var10 * var13;
            this.field9342 = -var10 * var11 + var9 * var14;
            this.field9360 = var7 * var10;
            this.field9347 = (float) (-arg0) * this.field9360 - (float) arg1 * this.field9357 - (float) arg2 * this.field9362;
            this.field9359 = (float) (-arg0) * this.field9349 - ((float) arg1 * this.field9363) - ((float) arg2 * this.field9353);
            this.field9348 = (float) (-arg0) * this.field9340 - ((float) arg1 * this.field9345) - ((float) arg2 * this.field9342);
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field9370[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 105)
    public final void method736(int arg0) {
        try {
            field9365++;
            float var2 = class705.field9857[arg0 & 0x3FFF];
            float var3 = class705.field9848[arg0 & 0x3FFF];
            float var4 = this.field9340;
            float var5 = this.field9345;
            float var6 = this.field9342;
            this.field9340 = this.field9360 * var3 + var2 * var4;
            float var7 = this.field9348;
            this.field9345 = this.field9357 * var3 + var2 * var5;
            this.field9360 = this.field9360 * var2 - (var3 * var4);
            this.field9357 = this.field9357 * var2 - (var3 * var5);
            this.field9342 = this.field9362 * var3 + var2 * var6;
            this.field9362 = this.field9362 * var2 - (var3 * var6);
            this.field9348 = this.field9347 * var3 + var2 * var7;
            this.field9347 = this.field9347 * var2 - (var3 * var7);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9370[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V", line = 135)
    public final void method721(int arg0, int arg1, int arg2) {
        try {
            this.field9348 += arg0;
            this.field9359 += arg1;
            field9354++;
            this.field9347 += arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9370[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(III[I)V", line = 145)
    public final void method718(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[0] = (int) ((float) arg2 * this.field9342 + (float) arg0 * this.field9340 + (float) arg1 * this.field9345);
            arg3[2] = (int) ((float) arg2 * this.field9362 + (float) arg0 * this.field9360 + (float) arg1 * this.field9357);
            arg3[1] = (int) ((float) arg2 * this.field9353 + (float) arg0 * this.field9349 + (float) arg1 * this.field9363);
            field9366++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9370[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9370[9] : field9370[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 162)
    public final void method729(int arg0) {
        try {
            this.field9362 = 1.0F;
            field9369++;
            this.field9340 = this.field9363 = class705.field9857[arg0 & 0x3FFF];
            this.field9349 = class705.field9848[arg0 & 0x3FFF];
            this.field9345 = -this.field9349;
            this.field9342 = this.field9348 = this.field9353 = this.field9359 = this.field9360 = this.field9357 = this.field9347 = 0.0F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9370[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 174)
    public final void method719(int arg0) {
        try {
            field9355++;
            this.field9363 = 1.0F;
            this.field9340 = this.field9362 = class705.field9857[arg0 & 0x3FFF];
            this.field9342 = class705.field9848[arg0 & 0x3FFF];
            this.field9360 = -this.field9342;
            this.field9345 = this.field9348 = this.field9349 = this.field9353 = this.field9359 = this.field9357 = this.field9347 = 0.0F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9370[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqa;)V", line = 188)
    public final void method733(class104 arg0) {
        try {
            field9356++;
            class660 var2 = (class660) arg0;
            this.field9357 = var2.field9357;
            this.field9340 = var2.field9340;
            this.field9359 = var2.field9359;
            this.field9348 = var2.field9348;
            this.field9347 = var2.field9347;
            this.field9363 = var2.field9363;
            this.field9345 = var2.field9345;
            this.field9360 = var2.field9360;
            this.field9342 = var2.field9342;
            this.field9353 = var2.field9353;
            this.field9349 = var2.field9349;
            this.field9362 = var2.field9362;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9370[7] + (arg0 == null ? field9370[9] : field9370[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 220)
    public static void method4786(byte arg0) {
        try {
            if (arg0 < 56) {
                field9367 = null;
            }
            field9367 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9370[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[I)V", line = 230)
    public final void method740(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[0] = (int) ((float) arg2 * this.field9342 + (float) arg0 * this.field9340 + (float) arg1 * this.field9345 + this.field9348);
            arg3[2] = (int) ((float) arg2 * this.field9362 + (float) arg0 * this.field9360 + (float) arg1 * this.field9357 + this.field9347);
            field9346++;
            arg3[1] = (int) ((float) arg2 * this.field9353 + (float) arg0 * this.field9349 + (float) arg1 * this.field9363 + this.field9359);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9370[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9370[9] : field9370[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 240)
    public final void method741(int arg0) {
        try {
            field9344++;
            float var2 = class705.field9857[arg0 & 0x3FFF];
            float var3 = class705.field9848[arg0 & 0x3FFF];
            float var4 = this.field9349;
            float var5 = this.field9363;
            float var6 = this.field9353;
            float var7 = this.field9359;
            this.field9349 = var2 * var4 - this.field9360 * var3;
            this.field9360 = this.field9360 * var2 + var3 * var4;
            this.field9363 = var2 * var5 - (this.field9357 * var3);
            this.field9353 = var2 * var6 - (this.field9362 * var3);
            this.field9357 = this.field9357 * var2 + var3 * var5;
            this.field9359 = var2 * var7 - this.field9347 * var3;
            this.field9362 = this.field9362 * var2 + var3 * var6;
            this.field9347 = this.field9347 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9370[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 267)
    public final void method724(int arg0) {
        try {
            field9358++;
            float var2 = class705.field9857[arg0 & 0x3FFF];
            float var3 = class705.field9848[arg0 & 0x3FFF];
            float var4 = this.field9340;
            float var5 = this.field9345;
            float var6 = this.field9342;
            float var7 = this.field9348;
            this.field9340 = var2 * var4 - this.field9349 * var3;
            this.field9349 = this.field9349 * var2 + var3 * var4;
            this.field9345 = var2 * var5 - this.field9363 * var3;
            this.field9363 = this.field9363 * var2 + var3 * var5;
            this.field9342 = var2 * var6 - (this.field9353 * var3);
            this.field9353 = this.field9353 * var2 + var3 * var6;
            this.field9348 = var2 * var7 - this.field9359 * var3;
            this.field9359 = this.field9359 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9370[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V", line = 295)
    public static final void method4787(int arg0) {
        try {
            if (arg0 != 0) {
                field9367 = null;
            }
            if (class482.method3724(1027279812)) {
                if (class789.field11405 == null) {
                    class744.method5387(arg0 + 1);
                }
                class451.field6614 = true;
                class55.field760 = 0;
            }
            field9352++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9370[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([I)V", line = 317)
    public final void method743(int[] arg0) {
        try {
            field9339++;
            float var2 = (float) arg0[0] - this.field9348;
            float var3 = (float) arg0[1] - this.field9359;
            float var4 = (float) arg0[2] - this.field9347;
            arg0[1] = (int) (this.field9357 * var4 + this.field9363 * var3 + this.field9345 * var2);
            arg0[0] = (int) (this.field9360 * var4 + this.field9349 * var3 + this.field9340 * var2);
            arg0[2] = (int) (this.field9362 * var4 + this.field9353 * var3 + this.field9342 * var2);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9370[16] + (arg0 == null ? field9370[9] : field9370[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 340)
    public class660() {
        try {
            this.method735();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9370[20] + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()V", line = 353)
    public final void method735() {
        try {
            this.field9340 = this.field9363 = this.field9362 = 1.0F;
            field9368++;
            this.field9349 = this.field9360 = this.field9345 = this.field9357 = this.field9342 = this.field9353 = this.field9348 = this.field9359 = this.field9347 = 0.0F;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9370[2] + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 362)
    public final void method742(int arg0) {
        try {
            field9351++;
            this.field9340 = 1.0F;
            this.field9363 = this.field9362 = class705.field9857[arg0 & 0x3FFF];
            this.field9357 = class705.field9848[arg0 & 0x3FFF];
            this.field9353 = -this.field9357;
            this.field9345 = this.field9342 = this.field9348 = this.field9349 = this.field9359 = this.field9360 = this.field9347 = 0.0F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9370[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)I", line = 374)
    public static final int method4788(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field9341++;
            int var5 = arg1 & 0xF;
            if (arg0 != -120) {
                method4786((byte) -53);
            }
            int var6 = var5 < 8 ? arg4 : arg2;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg3) : arg2;
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9370[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4789(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4790(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
