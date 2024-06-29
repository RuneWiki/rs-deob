import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class39 implements class61 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lnh;")
    private class312 field507 = new class312(256);

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Llc;")
    private class270 field516;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Llc;")
    private class270 field519;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[Lmj;")
    private class276[] field517;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field514 = 1;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field521 = -1;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[I")
    public static int[] field523 = new int[256];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Llc;")
    public static class270 field513;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
    public static int[] field515;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
    public final boolean method241(byte arg0, int arg1) {
        field509++;
        if (arg0 >= -39) {
            this.field507 = null;
        }
        class19 var3 = this.method245(arg1, (byte) 66);
        return var3 != null && var3.method131(this.field519, -122, this);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)Lmj;")
    public final class276 method242(boolean arg0, int arg1) {
        field511++;
        if (arg0) {
            method243(27, 75, (class270) null, -30);
        }
        return this.field517[arg1];
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILlc;I)[Llf;")
    public static final class94[] method243(int arg0, int arg1, class270 arg2, int arg3) {
        field512++;
        if (class144.method1079(arg1, arg2, arg0, (byte) 59)) {
            return arg3 == 13759 ? class160.method1164((byte) -109) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method244(byte arg0) {
        field510++;
        for (int var1 = 0; var1 < class51.field701; var1++) {
            class139 var2 = class161.method1169(var1, 16);
            if (var2 != null && var2.field2264 == 0) {
                class9.field103[var1] = 0;
                class303.field4900[var1] = 0;
            }
        }
        if (arg0 != 111) {
            method244((byte) -61);
        }
        class170.field2574 = new class143(16);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Lvd;")
    public class19 method245(int arg0, byte arg1) {
        class155 var3 = this.field507.method2099((byte) 125, (long) arg0);
        field518++;
        if (var3 != null) {
            return (class19) var3;
        }
        byte[] var4 = this.field516.method1886(arg0, false);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 66) {
            method246(-104);
        }
        class19 var5 = new class19(new class53(var4));
        this.field507.method2103(var5, -1, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method246(int arg0) {
        field513 = null;
        if (arg0 != 0) {
            field514 = 103;
        }
        field523 = null;
        field515 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Llc;Llc;Llc;)V")
    public class39(class270 arg0, class270 arg1, class270 arg2) {
        this.field516 = arg1;
        this.field519 = arg2;
        class53 var4 = new class53(arg0.method1868(0, 0, 1));
        int var5 = var4.method331(-125);
        this.field517 = new class276[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method366(-16505) == 1) {
                this.field517[var6] = new class276();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field517[var7] != null) {
                this.field517[var7].field4459 = var4.method366(-16505) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field517[var8] != null) {
                this.field517[var8].field4468 = var4.method366(-16505) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field517[var9] != null) {
                this.field517[var9].field4465 = var4.method366(-16505) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field517[var10] != null) {
                var4.method366(-16505);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field517[var11] != null) {
                var4.method335((byte) 26);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field517[var12] != null) {
                var4.method335((byte) 26);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field517[var13] != null) {
                var4.method335((byte) 26);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field517[var14] != null) {
                var4.method335((byte) 26);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field517[var15] != null) {
                this.field517[var15].field4460 = (short) var4.method331(-118);
            }
        }
        if (var4.field758.length > var4.field735) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field517[var16] != null) {
                    var4.method335((byte) 26);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field517[var17] != null) {
                    var4.method335((byte) 26);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field517[var18] != null) {
                    var4.method366(-16505);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field517[var19] != null) {
                    this.field517[var19].field4469 = var4.method366(-16505) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field517[var20] != null) {
                    var4.method335((byte) 26);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field517[var21] != null) {
                    var4.method366(-16505);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field517[var22] != null) {
                    var4.method366(-16505);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field517[var23] != null) {
                    var4.method366(-16505);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field520++;
        class279 var5 = class111.method844(arg4, arg1, -1780180960);
        var5.method1928(false);
        var5.field4488 = arg2;
        var5.field4505 = arg0;
        var5.field4489 = arg3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIFZ)[I")
    public final int[] method248(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5) {
        field522++;
        if (arg3 > -40) {
            this.method245(-87, (byte) 34);
        }
        return this.method245(arg2, (byte) 66).method133((double) arg4, arg5, 1, arg0, this, this.field519, arg1, this.field517[arg2].field4469);
    }
}
