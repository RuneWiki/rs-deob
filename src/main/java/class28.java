import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class28 extends class216 {

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Z")
    private boolean field415 = false;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public int field432 = 0;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public int field449 = 0;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "B")
    public byte field462 = 0;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[I")
    public int[] field430;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
    public int[] field426;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "[I")
    public int[] field446;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "[I")
    public int[] field442;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "[I")
    public int[] field440;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "[I")
    public int[] field459;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "[I")
    public int[] field445;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "[B")
    public byte[] field453;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "[B")
    public byte[] field443;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[B")
    public byte[] field418;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[S")
    public short[] field420;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "[S")
    public short[] field457;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "[B")
    public byte[] field461;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
    public int[] field455;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "[B")
    public byte[] field436;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[S")
    public short[] field419;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[S")
    public short[] field427;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[S")
    public short[] field422;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[S")
    public short[] field433;

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "[S")
    public short[] field464;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[S")
    public short[] field425;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "[B")
    public byte[] field450;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[B")
    public byte[] field416;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[B")
    public byte[] field435;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "[B")
    public byte[] field451;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "[B")
    public byte[] field438;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lgg;")
    public class138[] field428;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "[Lik;")
    public class330[] field454;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "[[I")
    public int[][] field437;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "[[I")
    public int[][] field448;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "[Lld;")
    public class288[] field460;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "[Lah;")
    public class119[] field465;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[Lld;")
    public class288[] field429;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "S")
    public short field441;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "S")
    public short field431;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    private static int field417 = 0;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[I")
    private static int[] field421 = new int[10000];

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
    private static int[] field434 = new int[10000];

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "[I")
    private static int[] field444 = class310.field5197;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "[I")
    private static int[] field447 = class310.field5199;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "S")
    private short field423;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "S")
    private short field424;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "S")
    private short field439;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "S")
    private short field452;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "S")
    private short field456;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "S")
    private short field463;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhi;IS)I", line = 4)
    private final int method191(class28 arg0, int arg1, short arg2) {
        int var4 = arg0.field430[arg1];
        int var5 = arg0.field426[arg1];
        int var6 = arg0.field446[arg1];
        for (int var7 = 0; var7 < this.field432; var7++) {
            if (this.field430[var7] == var4 && this.field426[var7] == var5 && this.field446[var7] == var6) {
                return var7;
            }
        }
        this.field430[this.field432] = var4;
        this.field426[this.field432] = var5;
        this.field446[this.field432] = var6;
        if (arg0.field442 != null) {
            this.field442[this.field432] = arg0.field442[arg1];
        }
        return this.field432++;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V", line = 31)
    private final void method192() {
        this.field460 = null;
        this.field429 = null;
        this.field465 = null;
        this.field415 = false;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIII)Lv;", line = 38)
    public final class286 method193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class99.field1675) {
            class322 var6 = new class322(this, arg0, arg1, true);
            var6.method2190();
            return var6;
        } else {
            return new class246(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 2032)
    private class28() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V", line = 2034)
    private class28(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method208(arg0);
        } else {
            this.method202(arg0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(III)V", line = 2041)
    public class28(int arg0, int arg1, int arg2) {
        this.field430 = new int[arg0];
        this.field426 = new int[arg0];
        this.field446 = new int[arg0];
        this.field442 = new int[arg0];
        this.field440 = new int[arg1];
        this.field459 = new int[arg1];
        this.field445 = new int[arg1];
        this.field453 = new byte[arg1];
        this.field443 = new byte[arg1];
        this.field418 = new byte[arg1];
        this.field420 = new short[arg1];
        this.field457 = new short[arg1];
        this.field461 = new byte[arg1];
        this.field455 = new int[arg1];
        if (arg2 > 0) {
            this.field436 = new byte[arg2];
            this.field419 = new short[arg2];
            this.field427 = new short[arg2];
            this.field422 = new short[arg2];
            this.field433 = new short[arg2];
            this.field464 = new short[arg2];
            this.field425 = new short[arg2];
            this.field450 = new byte[arg2];
            this.field416 = new byte[arg2];
            this.field435 = new byte[arg2];
            this.field451 = new byte[arg2];
            this.field438 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([Lhi;I)V", line = 2074)
    public class28(class28[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field432 = 0;
        this.field449 = 0;
        this.field458 = 0;
        int var9 = 0;
        int var10 = 0;
        this.field462 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class28 var12 = arg0[var11];
            if (var12 != null) {
                this.field432 += var12.field432;
                this.field449 += var12.field449;
                this.field458 += var12.field458;
                if (var12.field443 == null) {
                    if (this.field462 == -1) {
                        this.field462 = var12.field462;
                    }
                    if (this.field462 != var12.field462) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field453 != null;
                var5 |= var12.field418 != null;
                var6 |= var12.field455 != null;
                var7 |= var12.field457 != null;
                var8 |= var12.field461 != null;
                if (var12.field428 != null) {
                    var9 += var12.field428.length;
                }
                if (var12.field454 != null) {
                    var10 += var12.field454.length;
                }
            }
        }
        this.field430 = new int[this.field432];
        this.field426 = new int[this.field432];
        this.field446 = new int[this.field432];
        this.field442 = new int[this.field432];
        this.field440 = new int[this.field449];
        this.field459 = new int[this.field449];
        this.field445 = new int[this.field449];
        if (var3) {
            this.field453 = new byte[this.field449];
        }
        if (var4) {
            this.field443 = new byte[this.field449];
        }
        if (var5) {
            this.field418 = new byte[this.field449];
        }
        if (var6) {
            this.field455 = new int[this.field449];
        }
        if (var7) {
            this.field457 = new short[this.field449];
        }
        if (var8) {
            this.field461 = new byte[this.field449];
        }
        if (var9 > 0) {
            this.field428 = new class138[var9];
        }
        if (var10 > 0) {
            this.field454 = new class330[var10];
        }
        this.field420 = new short[this.field449];
        if (this.field458 > 0) {
            this.field436 = new byte[this.field458];
            this.field419 = new short[this.field458];
            this.field427 = new short[this.field458];
            this.field422 = new short[this.field458];
            this.field433 = new short[this.field458];
            this.field464 = new short[this.field458];
            this.field425 = new short[this.field458];
            this.field450 = new byte[this.field458];
            this.field416 = new byte[this.field458];
            this.field435 = new byte[this.field458];
            this.field451 = new byte[this.field458];
            this.field438 = new byte[this.field458];
        }
        this.field432 = 0;
        this.field449 = 0;
        this.field458 = 0;
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class28 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field449; var18++) {
                    if (var3 && var17.field453 != null) {
                        this.field453[this.field449] = var17.field453[var18];
                    }
                    if (var4) {
                        if (var17.field443 == null) {
                            this.field443[this.field449] = var17.field462;
                        } else {
                            this.field443[this.field449] = var17.field443[var18];
                        }
                    }
                    if (var5 && var17.field418 != null) {
                        this.field418[this.field449] = var17.field418[var18];
                    }
                    if (var6 && var17.field455 != null) {
                        this.field455[this.field449] = var17.field455[var18];
                    }
                    if (var7) {
                        if (var17.field457 == null) {
                            this.field457[this.field449] = -1;
                        } else {
                            this.field457[this.field449] = var17.field457[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field461 == null || var17.field461[var18] == -1) {
                            this.field461[this.field449] = -1;
                        } else {
                            this.field461[this.field449] = (byte) (var17.field461[var18] + this.field458);
                        }
                    }
                    this.field420[this.field449] = var17.field420[var18];
                    this.field440[this.field449] = this.method191(var17, var17.field440[var18], var16);
                    this.field459[this.field449] = this.method191(var17, var17.field459[var18], var16);
                    this.field445[this.field449] = this.method191(var17, var17.field445[var18], var16);
                    this.field449++;
                }
                for (int var19 = 0; var19 < var17.field458; var19++) {
                    byte var20 = this.field436[this.field458] = var17.field436[var19];
                    if (var20 == 0) {
                        this.field419[this.field458] = (short) this.method191(var17, var17.field419[var19], var16);
                        this.field427[this.field458] = (short) this.method191(var17, var17.field427[var19], var16);
                        this.field422[this.field458] = (short) this.method191(var17, var17.field422[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field419[this.field458] = var17.field419[var19];
                        this.field427[this.field458] = var17.field427[var19];
                        this.field422[this.field458] = var17.field422[var19];
                        this.field433[this.field458] = var17.field433[var19];
                        this.field464[this.field458] = var17.field464[var19];
                        this.field425[this.field458] = var17.field425[var19];
                        this.field450[this.field458] = var17.field450[var19];
                        this.field416[this.field458] = var17.field416[var19];
                        this.field435[this.field458] = var17.field435[var19];
                    }
                    if (var20 == 2) {
                        this.field451[this.field458] = var17.field451[var19];
                        this.field438[this.field458] = var17.field438[var19];
                    }
                    this.field458++;
                }
                if (var17.field428 != null) {
                    for (int var21 = 0; var21 < var17.field428.length; var21++) {
                        int var22 = this.method191(var17, var17.field428[var21].field2234, var16);
                        int var23 = this.method191(var17, var17.field428[var21].field2229, var16);
                        int var24 = this.method191(var17, var17.field428[var21].field2241, var16);
                        this.field428[var13] = new class138(var17.field428[var21].field2231, var22, var23, var24);
                        var13++;
                    }
                }
                if (var17.field454 != null) {
                    for (int var25 = 0; var25 < var17.field454.length; var25++) {
                        int var26 = this.method191(var17, var17.field454[var25].field5626, var16);
                        this.field454[var14] = new class330(var17.field454[var25].field5624, var26);
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lhi;ZZZZ)V", line = 2347)
    public class28(class28 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field432 = arg0.field432;
        this.field449 = arg0.field449;
        this.field458 = arg0.field458;
        if (arg1) {
            this.field430 = arg0.field430;
            this.field426 = arg0.field426;
            this.field446 = arg0.field446;
        } else {
            this.field430 = new int[this.field432];
            this.field426 = new int[this.field432];
            this.field446 = new int[this.field432];
            for (int var6 = 0; var6 < this.field432; var6++) {
                this.field430[var6] = arg0.field430[var6];
                this.field426[var6] = arg0.field426[var6];
                this.field446[var6] = arg0.field446[var6];
            }
        }
        if (arg2) {
            this.field420 = arg0.field420;
        } else {
            this.field420 = new short[this.field449];
            for (int var7 = 0; var7 < this.field449; var7++) {
                this.field420[var7] = arg0.field420[var7];
            }
        }
        if (arg3 || arg0.field457 == null) {
            this.field457 = arg0.field457;
        } else {
            this.field457 = new short[this.field449];
            for (int var8 = 0; var8 < this.field449; var8++) {
                this.field457[var8] = arg0.field457[var8];
            }
        }
        if (arg4) {
            this.field418 = arg0.field418;
        } else {
            this.field418 = new byte[this.field449];
            if (arg0.field418 == null) {
                for (int var9 = 0; var9 < this.field449; var9++) {
                    this.field418[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field449; var10++) {
                    this.field418[var10] = arg0.field418[var10];
                }
            }
        }
        this.field440 = arg0.field440;
        this.field459 = arg0.field459;
        this.field445 = arg0.field445;
        this.field453 = arg0.field453;
        this.field443 = arg0.field443;
        this.field461 = arg0.field461;
        this.field462 = arg0.field462;
        this.field436 = arg0.field436;
        this.field419 = arg0.field419;
        this.field427 = arg0.field427;
        this.field422 = arg0.field422;
        this.field433 = arg0.field433;
        this.field464 = arg0.field464;
        this.field425 = arg0.field425;
        this.field450 = arg0.field450;
        this.field416 = arg0.field416;
        this.field435 = arg0.field435;
        this.field451 = arg0.field451;
        this.field438 = arg0.field438;
        this.field442 = arg0.field442;
        this.field455 = arg0.field455;
        this.field437 = arg0.field437;
        this.field448 = arg0.field448;
        this.field460 = arg0.field460;
        this.field465 = arg0.field465;
        this.field429 = arg0.field429;
        this.field441 = arg0.field441;
        this.field431 = arg0.field431;
        this.field428 = arg0.field428;
        this.field454 = arg0.field454;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[III)I", line = 60)
    private static final int method194(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(SS)V", line = 79)
    public final void method195(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field449; var3++) {
            if (this.field420[var3] == arg0) {
                this.field420[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()V", line = 96)
    public final void method196() {
        for (int var1 = 0; var1 < this.field432; var1++) {
            int var2 = this.field430[var1];
            this.field430[var1] = this.field446[var1];
            this.field446[var1] = -var2;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V", line = 111)
    public final void method197(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field432; var4++) {
            this.field430[var4] += arg0;
            this.field426[var4] += arg1;
            this.field446[var4] += arg2;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()V", line = 127)
    public final void method198() {
        for (int var1 = 0; var1 < this.field432; var1++) {
            int var2 = this.field446[var1];
            this.field446[var1] = this.field430[var1];
            this.field430[var1] = -var2;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)I", line = 143)
    public final int method199(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field432; var4++) {
            if (this.field430[var4] == arg0 && this.field426[var4] == arg1 && this.field446[var4] == arg2) {
                return var4;
            }
        }
        this.field430[this.field432] = arg0;
        this.field426[this.field432] = arg1;
        this.field446[this.field432] = arg2;
        return this.field432++;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "()V", line = 159)
    public static void method200() {
        field421 = null;
        field434 = null;
        field447 = null;
        field444 = null;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(III)V", line = 170)
    public final void method201(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field432; var4++) {
            this.field430[var4] = this.field430[var4] * arg0 / 128;
            this.field426[var4] = this.field426[var4] * arg1 / 128;
            this.field446[var4] = this.field446[var4] * arg2 / 128;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([B)V", line = 183)
    private final void method202(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class164 var4 = new class164(arg0);
        class164 var5 = new class164(arg0);
        class164 var6 = new class164(arg0);
        class164 var7 = new class164(arg0);
        class164 var8 = new class164(arg0);
        var4.field2670 = arg0.length - 18;
        int var9 = var4.method1161(true);
        int var10 = var4.method1161(true);
        int var11 = var4.method1178(8);
        int var12 = var4.method1178(8);
        int var13 = var4.method1178(8);
        int var14 = var4.method1178(8);
        int var15 = var4.method1178(8);
        int var16 = var4.method1178(8);
        int var17 = var4.method1161(true);
        int var18 = var4.method1161(true);
        int var19 = var4.method1161(true);
        int var20 = var4.method1161(true);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field432 = var9;
        this.field449 = var10;
        this.field458 = var11;
        this.field430 = new int[var9];
        this.field426 = new int[var9];
        this.field446 = new int[var9];
        this.field440 = new int[var10];
        this.field459 = new int[var10];
        this.field445 = new int[var10];
        if (var11 > 0) {
            this.field436 = new byte[var11];
            this.field419 = new short[var11];
            this.field427 = new short[var11];
            this.field422 = new short[var11];
        }
        if (var16 == 1) {
            this.field442 = new int[var9];
        }
        if (var12 == 1) {
            this.field453 = new byte[var10];
            this.field461 = new byte[var10];
            this.field457 = new short[var10];
        }
        if (var13 == 255) {
            this.field443 = new byte[var10];
        } else {
            this.field462 = (byte) var13;
        }
        if (var14 == 1) {
            this.field418 = new byte[var10];
        }
        if (var15 == 1) {
            this.field455 = new int[var10];
        }
        this.field420 = new short[var10];
        var4.field2670 = var21;
        var5.field2670 = var36;
        var6.field2670 = var38;
        var7.field2670 = var40;
        var8.field2670 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1178(8);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1167(40);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1167(38);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1167(110);
            }
            this.field430[var46] = var43 + var48;
            this.field426[var46] = var44 + var49;
            this.field446[var46] = var45 + var50;
            var43 = this.field430[var46];
            var44 = this.field426[var46];
            var45 = this.field446[var46];
            if (var16 == 1) {
                this.field442[var46] = var8.method1178(8);
            }
        }
        var4.field2670 = var32;
        var5.field2670 = var28;
        var6.field2670 = var26;
        var7.field2670 = var30;
        var8.field2670 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field420[var51] = (short) var4.method1161(true);
            if (var12 == 1) {
                int var52 = var5.method1178(8);
                if ((var52 & 0x1) == 1) {
                    this.field453[var51] = 1;
                    var2 = true;
                } else {
                    this.field453[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field461[var51] = (byte) (var52 >> 2);
                    this.field457[var51] = this.field420[var51];
                    this.field420[var51] = 127;
                    if (this.field457[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field461[var51] = -1;
                    this.field457[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field443[var51] = var6.method1163(864348104);
            }
            if (var14 == 1) {
                this.field418[var51] = var7.method1163(864348104);
            }
            if (var15 == 1) {
                this.field455[var51] = var8.method1178(8);
            }
        }
        var4.field2670 = var25;
        var5.field2670 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1178(8);
            if (var58 == 1) {
                var53 = var4.method1167(119) + var56;
                var54 = var4.method1167(31) + var53;
                var55 = var4.method1167(82) + var54;
                var56 = var55;
                this.field440[var57] = var53;
                this.field459[var57] = var54;
                this.field445[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1167(75) + var56;
                var56 = var55;
                this.field440[var57] = var53;
                this.field459[var57] = var54;
                this.field445[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1167(93) + var56;
                var56 = var55;
                this.field440[var57] = var53;
                this.field459[var57] = var54;
                this.field445[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1167(51) + var56;
                var56 = var55;
                this.field440[var57] = var53;
                this.field459[var57] = var61;
                this.field445[var57] = var55;
            }
        }
        var4.field2670 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field436[var62] = 0;
            this.field419[var62] = (short) var4.method1161(true);
            this.field427[var62] = (short) var4.method1161(true);
            this.field422[var62] = (short) var4.method1161(true);
        }
        if (this.field461 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field461[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field419[var65] & 0xFFFF) == this.field440[var64] && (this.field427[var65] & 0xFFFF) == this.field459[var64] && (this.field422[var65] & 0xFFFF) == this.field445[var64]) {
                        this.field461[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field461 = null;
            }
        }
        if (!var3) {
            this.field457 = null;
        }
        if (!var2) {
            this.field453 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(SS)V", line = 523)
    public final void method203(short arg0, short arg1) {
        if (this.field457 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field449; var3++) {
            if (this.field457[var3] == arg0) {
                this.field457[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(IIIII)Ln;", line = 546)
    public final class246 method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class246(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 550)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 552)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 561)
    public final void method205(int arg0) {
        int var2 = field447[arg0];
        int var3 = field444[arg0];
        for (int var4 = 0; var4 < this.field432; var4++) {
            int var5 = this.field446[var4] * var2 + this.field430[var4] * var3 >> 16;
            this.field446[var4] = this.field446[var4] * var3 - this.field430[var4] * var2 >> 16;
            this.field430[var4] = var5;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "()V", line = 579)
    public final void method206() {
        if (this.field460 != null) {
            return;
        }
        this.field460 = new class288[this.field432];
        for (int var1 = 0; var1 < this.field432; var1++) {
            this.field460[var1] = new class288();
        }
        for (int var2 = 0; var2 < this.field449; var2++) {
            int var3 = this.field440[var2];
            int var4 = this.field459[var2];
            int var5 = this.field445[var2];
            int var6 = this.field430[var4] - this.field430[var3];
            int var7 = this.field426[var4] - this.field426[var3];
            int var8 = this.field446[var4] - this.field446[var3];
            int var9 = this.field430[var5] - this.field430[var3];
            int var10 = this.field426[var5] - this.field426[var3];
            int var11 = this.field446[var5] - this.field446[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field453 == null) {
                var19 = 0;
            } else {
                var19 = this.field453[var2];
            }
            if (var19 == 0) {
                class288 var20 = this.field460[var3];
                var20.field4725 += var16;
                var20.field4724 += var17;
                var20.field4733 += var18;
                var20.field4732++;
                class288 var21 = this.field460[var4];
                var21.field4725 += var16;
                var21.field4724 += var17;
                var21.field4733 += var18;
                var21.field4732++;
                class288 var22 = this.field460[var5];
                var22.field4725 += var16;
                var22.field4724 += var17;
                var22.field4733 += var18;
                var22.field4732++;
            } else if (var19 == 1) {
                if (this.field465 == null) {
                    this.field465 = new class119[this.field449];
                }
                class119 var23 = this.field465[var2] = new class119();
                var23.field1993 = var16;
                var23.field1992 = var17;
                var23.field1997 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[[I[[IIIIZZ)Lhi;", line = 680)
    public final class28 method207(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method221();
        int var10 = this.field423 + arg4;
        int var11 = this.field463 + arg4;
        int var12 = this.field452 + arg6;
        int var13 = this.field439 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class28 var18;
        if (arg7) {
            var18 = new class28();
            var18.field432 = this.field432;
            var18.field449 = this.field449;
            var18.field458 = this.field458;
            var18.field440 = this.field440;
            var18.field459 = this.field459;
            var18.field445 = this.field445;
            var18.field453 = this.field453;
            var18.field443 = this.field443;
            var18.field418 = this.field418;
            var18.field461 = this.field461;
            var18.field420 = this.field420;
            var18.field457 = this.field457;
            var18.field462 = this.field462;
            var18.field436 = this.field436;
            var18.field419 = this.field419;
            var18.field427 = this.field427;
            var18.field422 = this.field422;
            var18.field433 = this.field433;
            var18.field464 = this.field464;
            var18.field425 = this.field425;
            var18.field450 = this.field450;
            var18.field416 = this.field416;
            var18.field435 = this.field435;
            var18.field451 = this.field451;
            var18.field438 = this.field438;
            var18.field442 = this.field442;
            var18.field455 = this.field455;
            var18.field437 = this.field437;
            var18.field448 = this.field448;
            var18.field441 = this.field441;
            var18.field431 = this.field431;
            var18.field460 = this.field460;
            var18.field465 = this.field465;
            var18.field429 = this.field429;
            var18.field428 = this.field428;
            var18.field454 = this.field454;
            if (arg0 == 3) {
                var18.field430 = class299.method2011(this.field430, -27018);
                var18.field426 = class299.method2011(this.field426, -27018);
                var18.field446 = class299.method2011(this.field446, -27018);
            } else {
                var18.field430 = this.field430;
                var18.field426 = new int[var18.field432];
                var18.field446 = this.field446;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field432; var19++) {
                int var20 = this.field430[var19] + arg4;
                int var21 = this.field446[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field426[var19] = this.field426[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field432; var29++) {
                int var30 = (this.field426[var29] << 16) / this.field424;
                if (var30 < arg1) {
                    int var31 = this.field430[var29] + arg4;
                    int var32 = this.field446[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field426[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field426[var29];
                } else {
                    var18.field426[var29] = this.field426[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method220(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field456 - this.field424;
            for (int var43 = 0; var43 < this.field432; var43++) {
                int var44 = this.field430[var43] + arg4;
                int var45 = this.field446[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field426[var43] = var52 + this.field426[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field456 - this.field424;
            for (int var54 = 0; var54 < this.field432; var54++) {
                int var55 = this.field430[var54] + arg4;
                int var56 = this.field446[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field426[var54] = ((this.field426[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method192();
        } else {
            this.field415 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "([B)V", line = 949)
    private final void method208(byte[] arg0) {
        class164 var2 = new class164(arg0);
        class164 var3 = new class164(arg0);
        class164 var4 = new class164(arg0);
        class164 var5 = new class164(arg0);
        class164 var6 = new class164(arg0);
        class164 var7 = new class164(arg0);
        class164 var8 = new class164(arg0);
        var2.field2670 = arg0.length - 23;
        int var9 = var2.method1161(true);
        int var10 = var2.method1161(true);
        int var11 = var2.method1178(8);
        int var12 = var2.method1178(8);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method1178(8);
        int var16 = var2.method1178(8);
        int var17 = var2.method1178(8);
        int var18 = var2.method1178(8);
        int var19 = var2.method1178(8);
        int var20 = var2.method1161(true);
        int var21 = var2.method1161(true);
        int var22 = var2.method1161(true);
        int var23 = var2.method1161(true);
        int var24 = var2.method1161(true);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field436 = new byte[var11];
            var2.field2670 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field436[var28] = var2.method1163(864348104);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field432 = var9;
        this.field449 = var10;
        this.field458 = var11;
        this.field430 = new int[var9];
        this.field426 = new int[var9];
        this.field446 = new int[var9];
        this.field440 = new int[var10];
        this.field459 = new int[var10];
        this.field445 = new int[var10];
        if (var19 == 1) {
            this.field442 = new int[var9];
        }
        if (var13) {
            this.field453 = new byte[var10];
        }
        if (var15 == 255) {
            this.field443 = new byte[var10];
        } else {
            this.field462 = (byte) var15;
        }
        if (var16 == 1) {
            this.field418 = new byte[var10];
        }
        if (var17 == 1) {
            this.field455 = new int[var10];
        }
        if (var18 == 1) {
            this.field457 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field461 = new byte[var10];
        }
        this.field420 = new short[var10];
        if (var11 > 0) {
            this.field419 = new short[var11];
            this.field427 = new short[var11];
            this.field422 = new short[var11];
            if (var26 > 0) {
                this.field433 = new short[var26];
                this.field464 = new short[var26];
                this.field425 = new short[var26];
                this.field450 = new byte[var26];
                this.field416 = new byte[var26];
                this.field435 = new byte[var26];
            }
            if (var27 > 0) {
                this.field451 = new byte[var27];
                this.field438 = new byte[var27];
            }
        }
        var2.field2670 = var11;
        var3.field2670 = var46;
        var4.field2670 = var48;
        var5.field2670 = var50;
        var6.field2670 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method1178(8);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method1167(41);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method1167(78);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method1167(109);
            }
            this.field430[var69] = var66 + var71;
            this.field426[var69] = var67 + var72;
            this.field446[var69] = var68 + var73;
            var66 = this.field430[var69];
            var67 = this.field426[var69];
            var68 = this.field446[var69];
            if (var19 == 1) {
                this.field442[var69] = var6.method1178(8);
            }
        }
        var2.field2670 = var44;
        var3.field2670 = var33;
        var4.field2670 = var36;
        var5.field2670 = var39;
        var6.field2670 = var37;
        var7.field2670 = var42;
        var8.field2670 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field420[var74] = (short) var2.method1161(true);
            if (var13) {
                this.field453[var74] = var3.method1163(864348104);
            }
            if (var15 == 255) {
                this.field443[var74] = var4.method1163(864348104);
            }
            if (var16 == 1) {
                this.field418[var74] = var5.method1163(864348104);
            }
            if (var17 == 1) {
                this.field455[var74] = var6.method1178(8);
            }
            if (var18 == 1) {
                this.field457[var74] = (short) (var7.method1161(true) - 1);
            }
            if (this.field461 != null) {
                if (this.field457[var74] == -1) {
                    this.field461[var74] = -1;
                } else {
                    this.field461[var74] = (byte) (var8.method1178(8) - 1);
                }
            }
        }
        var2.field2670 = var35;
        var3.field2670 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method1178(8);
            if (var80 == 1) {
                var75 = var2.method1167(43) + var78;
                var76 = var2.method1167(120) + var75;
                var77 = var2.method1167(82) + var76;
                var78 = var77;
                this.field440[var79] = var75;
                this.field459[var79] = var76;
                this.field445[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method1167(87) + var78;
                var78 = var77;
                this.field440[var79] = var75;
                this.field459[var79] = var76;
                this.field445[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method1167(84) + var78;
                var78 = var77;
                this.field440[var79] = var75;
                this.field459[var79] = var76;
                this.field445[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method1167(74) + var78;
                var78 = var77;
                this.field440[var79] = var75;
                this.field459[var79] = var83;
                this.field445[var79] = var77;
            }
        }
        var2.field2670 = var52;
        var3.field2670 = var54;
        var4.field2670 = var56;
        var5.field2670 = var58;
        var6.field2670 = var60;
        var7.field2670 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field436[var84] & 0xFF;
            if (var85 == 0) {
                this.field419[var84] = (short) var2.method1161(true);
                this.field427[var84] = (short) var2.method1161(true);
                this.field422[var84] = (short) var2.method1161(true);
            }
            if (var85 == 1) {
                this.field419[var84] = (short) var3.method1161(true);
                this.field427[var84] = (short) var3.method1161(true);
                this.field422[var84] = (short) var3.method1161(true);
                this.field433[var84] = (short) var4.method1161(true);
                this.field464[var84] = (short) var4.method1161(true);
                this.field425[var84] = (short) var4.method1161(true);
                this.field450[var84] = var5.method1163(864348104);
                this.field416[var84] = var6.method1163(864348104);
                this.field435[var84] = var7.method1163(864348104);
            }
            if (var85 == 2) {
                this.field419[var84] = (short) var3.method1161(true);
                this.field427[var84] = (short) var3.method1161(true);
                this.field422[var84] = (short) var3.method1161(true);
                this.field433[var84] = (short) var4.method1161(true);
                this.field464[var84] = (short) var4.method1161(true);
                this.field425[var84] = (short) var4.method1161(true);
                this.field450[var84] = var5.method1163(864348104);
                this.field416[var84] = var6.method1163(864348104);
                this.field435[var84] = var7.method1163(864348104);
                this.field451[var84] = var7.method1163(864348104);
                this.field438[var84] = var7.method1163(864348104);
            }
            if (var85 == 3) {
                this.field419[var84] = (short) var3.method1161(true);
                this.field427[var84] = (short) var3.method1161(true);
                this.field422[var84] = (short) var3.method1161(true);
                this.field433[var84] = (short) var4.method1161(true);
                this.field464[var84] = (short) var4.method1161(true);
                this.field425[var84] = (short) var4.method1161(true);
                this.field450[var84] = var5.method1163(864348104);
                this.field416[var84] = var6.method1163(864348104);
                this.field435[var84] = var7.method1163(864348104);
            }
        }
        if (!var14) {
            return;
        }
        var2.field2670 = var64;
        int var86 = var2.method1178(8);
        if (var86 > 0) {
            this.field428 = new class138[var86];
            for (int var87 = 0; var87 < var86; var87++) {
                int var88 = var2.method1161(true);
                int var89 = var2.method1161(true);
                this.field428[var87] = new class138(var88, this.field440[var89], this.field459[var89], this.field445[var89]);
            }
        }
        int var90 = var2.method1178(8);
        if (var90 > 0) {
            this.field454 = new class330[var90];
            for (int var91 = 0; var91 < var90; var91++) {
                this.field454[var91] = new class330(var2.method1161(true), var2.method1161(true));
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 1415)
    private final void method209(int arg0) {
        int var2 = field447[arg0];
        int var3 = field444[arg0];
        for (int var4 = 0; var4 < this.field432; var4++) {
            int var5 = this.field430[var4] * var3 + this.field426[var4] * var2 >> 16;
            this.field426[var4] = this.field426[var4] * var3 - this.field430[var4] * var2 >> 16;
            this.field430[var4] = var5;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "()V", line = 1443)
    public final void method210() {
        for (int var1 = 0; var1 < this.field432; var1++) {
            this.field446[var1] = -this.field446[var1];
        }
        for (int var2 = 0; var2 < this.field449; var2++) {
            int var3 = this.field440[var2];
            this.field440[var2] = this.field445[var2];
            this.field445[var2] = var3;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I", line = 1471)
    public final int method182() {
        if (!this.field415) {
            this.method221();
        }
        return this.field424;
    }

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "()Lhi;", line = 1480)
    public final class28 method211() {
        class28 var1 = new class28();
        if (this.field453 != null) {
            var1.field453 = new byte[this.field449];
            for (int var2 = 0; var2 < this.field449; var2++) {
                var1.field453[var2] = this.field453[var2];
            }
        }
        var1.field432 = this.field432;
        var1.field449 = this.field449;
        var1.field458 = this.field458;
        var1.field430 = this.field430;
        var1.field426 = this.field426;
        var1.field446 = this.field446;
        var1.field440 = this.field440;
        var1.field459 = this.field459;
        var1.field445 = this.field445;
        var1.field443 = this.field443;
        var1.field418 = this.field418;
        var1.field461 = this.field461;
        var1.field420 = this.field420;
        var1.field457 = this.field457;
        var1.field462 = this.field462;
        var1.field436 = this.field436;
        var1.field419 = this.field419;
        var1.field427 = this.field427;
        var1.field422 = this.field422;
        var1.field433 = this.field433;
        var1.field464 = this.field464;
        var1.field425 = this.field425;
        var1.field450 = this.field450;
        var1.field416 = this.field416;
        var1.field435 = this.field435;
        var1.field451 = this.field451;
        var1.field438 = this.field438;
        var1.field442 = this.field442;
        var1.field455 = this.field455;
        var1.field437 = this.field437;
        var1.field448 = this.field448;
        var1.field460 = this.field460;
        var1.field465 = this.field465;
        var1.field441 = this.field441;
        var1.field431 = this.field431;
        var1.field428 = this.field428;
        var1.field454 = this.field454;
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lrk;IIIZ)V", line = 1541)
    public final void method212(class216 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class28 var6 = (class28) arg0;
        var6.method221();
        var6.method206();
        field417++;
        int var7 = 0;
        int[] var8 = var6.field430;
        int var9 = var6.field432;
        for (int var10 = 0; var10 < this.field432; var10++) {
            class288 var11 = this.field460[var10];
            if (var11.field4732 != 0) {
                int var12 = this.field426[var10] - arg2;
                if (var12 >= var6.field424 && var12 <= var6.field456) {
                    int var13 = this.field430[var10] - arg1;
                    if (var13 >= var6.field423 && var13 <= var6.field463) {
                        int var14 = this.field446[var10] - arg3;
                        if (var14 >= var6.field452 && var14 <= var6.field439) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class288 var16 = var6.field460[var15];
                                if (var8[var15] == var13 && var6.field446[var15] == var14 && var6.field426[var15] == var12 && var16.field4732 != 0) {
                                    if (this.field429 == null) {
                                        this.field429 = new class288[this.field432];
                                    }
                                    if (var6.field429 == null) {
                                        var6.field429 = new class288[var9];
                                    }
                                    class288 var17 = this.field429[var10];
                                    if (var17 == null) {
                                        var17 = this.field429[var10] = new class288(var11);
                                    }
                                    class288 var18 = var6.field429[var15];
                                    if (var18 == null) {
                                        var18 = var6.field429[var15] = new class288(var16);
                                    }
                                    var17.field4725 += var16.field4725;
                                    var17.field4724 += var16.field4724;
                                    var17.field4733 += var16.field4733;
                                    var17.field4732 += var16.field4732;
                                    var18.field4725 += var11.field4725;
                                    var18.field4724 += var11.field4724;
                                    var18.field4733 += var11.field4733;
                                    var18.field4732 += var11.field4732;
                                    var7++;
                                    field421[var10] = field417;
                                    field434[var15] = field417;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field449; var19++) {
            if (field421[this.field440[var19]] == field417 && field421[this.field459[var19]] == field417 && field421[this.field445[var19]] == field417) {
                if (this.field453 == null) {
                    this.field453 = new byte[this.field449];
                }
                this.field453[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field449; var20++) {
            if (field434[var6.field440[var20]] == field417 && field434[var6.field459[var20]] == field417 && field434[var6.field445[var20]] == field417) {
                if (var6.field453 == null) {
                    var6.field453 = new byte[var6.field449];
                }
                var6.field453[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lrk;", line = 1664)
    public final class216 method213(int arg0, int arg1, int arg2) {
        return this.method193(this.field441, this.field431, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lsi;II)Lhi;", line = 1673)
    public static final class28 method214(class66 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method523(-78, arg2, arg1);
        return var3 == null ? null : new class28(var3);
    }

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "()V", line = 1682)
    public final void method215() {
        for (int var1 = 0; var1 < this.field432; var1++) {
            this.field430[var1] = -this.field430[var1];
            this.field446[var1] = -this.field446[var1];
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "()V", line = 1694)
    public final void method216() {
        int var10002;
        if (this.field442 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field432; var3++) {
                int var4 = this.field442[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field437 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field437[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field432) {
                int var7 = this.field442[var6];
                this.field437[var7][var1[var7]++] = var6++;
            }
            this.field442 = null;
        }
        if (this.field455 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field449; var10++) {
            int var11 = this.field455[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field448 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field448[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field449) {
            int var14 = this.field455[var13];
            this.field448[var14][var8[var14]++] = var13++;
        }
        this.field455 = null;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 1787)
    private final void method217(int arg0) {
        int var2 = field447[arg0];
        int var3 = field444[arg0];
        for (int var4 = 0; var4 < this.field432; var4++) {
            int var5 = this.field426[var4] * var3 - this.field446[var4] * var2 >> 16;
            this.field446[var4] = this.field446[var4] * var3 + this.field426[var4] * var2 >> 16;
            this.field426[var4] = var5;
        }
        this.method192();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIBSB)I", line = 1810)
    public final int method218(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field440[this.field449] = arg0;
        this.field459[this.field449] = arg1;
        this.field445[this.field449] = arg2;
        this.field453[this.field449] = arg3;
        this.field461[this.field449] = -1;
        this.field420[this.field449] = arg4;
        this.field457[this.field449] = -1;
        this.field418[this.field449] = arg5;
        return this.field449++;
    }

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "()V", line = 1823)
    public final void method219() {
        this.field442 = null;
        this.field455 = null;
        this.field437 = (int[][]) null;
        this.field448 = (int[][]) null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([[IIIIII)V", line = 1834)
    private final void method220(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method194(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method194(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method194(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method194(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method217(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method209(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method197(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "()V", line = 1904)
    private final void method221() {
        if (this.field415) {
            return;
        }
        this.field415 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field432; var7++) {
            int var8 = this.field430[var7];
            int var9 = this.field426[var7];
            int var10 = this.field446[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field423 = (short) var1;
        this.field463 = (short) var4;
        this.field424 = (short) var2;
        this.field456 = (short) var5;
        this.field452 = (short) var3;
        this.field439 = (short) var6;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()Z", line = 1963)
    public final boolean method222() {
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(III)V", line = 1968)
    public final void method223(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field447[arg2];
            int var5 = field444[arg2];
            for (int var6 = 0; var6 < this.field432; var6++) {
                int var7 = this.field430[var6] * var5 + this.field426[var6] * var4 >> 16;
                this.field426[var6] = this.field426[var6] * var5 - this.field430[var6] * var4 >> 16;
                this.field430[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field447[arg0];
            int var9 = field444[arg0];
            for (int var10 = 0; var10 < this.field432; var10++) {
                int var11 = this.field426[var10] * var9 - this.field446[var10] * var8 >> 16;
                this.field446[var10] = this.field446[var10] * var9 + this.field426[var10] * var8 >> 16;
                this.field426[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field447[arg1];
        int var13 = field444[arg1];
        for (int var14 = 0; var14 < this.field432; var14++) {
            int var15 = this.field446[var14] * var12 + this.field430[var14] * var13 >> 16;
            this.field446[var14] = this.field446[var14] * var13 - this.field430[var14] * var12 >> 16;
            this.field430[var14] = var15;
        }
    }
}
