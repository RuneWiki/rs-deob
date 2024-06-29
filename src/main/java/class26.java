import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public int field337 = -1;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public int field343 = 128;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    private int field344 = 0;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Z")
    public boolean field336 = true;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lwj;")
    public static class270 field333 = new class270(7, 12);

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "Lwj;")
    public static class270 field346 = new class270(44, 6);

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "[I")
    public static int[] field351 = new int[1000];

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Lqp;")
    public static class466 field348 = new class466("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "[I")
    public static int[] field352 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 7)
    public static void method147(int arg0) {
        field352 = null;
        field333 = null;
        if (arg0 > -124) {
            field347 = 69;
        }
        field346 = null;
        field351 = null;
        field348 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V", line = 22)
    private final void method148(int arg0, int arg1) {
        field349++;
        double var3 = (double) ((arg0 & 0xFFF8B2) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (arg1 >= -62) {
            method149(null, null, (byte) 5);
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field335 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field342 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field339 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field339 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field335 < 0) {
            this.field335 = 0;
        } else if (this.field335 > 255) {
            this.field335 = 255;
        }
        if (this.field342 < 0) {
            this.field342 = 0;
        } else if (this.field342 > 255) {
            this.field342 = 255;
        }
        if (this.field339 < 1) {
            this.field339 = 1;
        }
        this.field334 = (int) ((double) this.field339 * var19);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lya;Lmg;B)V", line = 114)
    public static final void method149(class38 arg0, class101 arg1, byte arg2) {
        field340++;
        if (class46.field559) {
            return;
        }
        arg0.method246(0);
        class506.field7454 = arg0.method265(class4.method19(arg1, class128.field1892), true);
        class506.field7454.method85((class117.field1754 - class506.field7454.method84()) / 2, (class27.field359 - class506.field7454.method93()) / 2);
        if (arg2 == 15) {
            class291.field4029 = arg0.method265(class4.method19(arg1, class165.field2476), true);
            class291.field4029.method85((class117.field1754 - class291.field4029.method84()) / 2, 18);
            class46.field559 = true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lem;III)V", line = 134)
    public static final void method150(class150 arg0, int arg1, int arg2, int arg3) {
        field345++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field2168 != null) {
            class437 var4 = new class437();
            var4.field6390 = arg0;
            var4.field6389 = arg0.field2168;
            class429.method2537(var4);
        }
        class352.field5167 = arg0.field2224;
        class226.field3209 = arg0.field2219;
        class59.field720 = true;
        class11.field171 = arg0.field2237;
        class250.field3462 = arg0.field2277;
        class214.field2994 = arg0.field2248;
        class292.field4043 = arg3;
        class13.field199 = arg2;
        if (arg1 != -8605) {
            method149(null, null, (byte) 36);
        }
        class370.method2222(0, arg0);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZBZ)V", line = 182)
    public static final void method151(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        field338++;
        class240.method1461(class393.field5757.length - 1, -1, arg1, 0, arg4, arg0, arg2);
        if (arg3 != -64) {
            method151(-113, -112, true, (byte) 34, false);
        }
        class445.field6562 = 0;
        class128.field1895 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lsi;I)V", line = 195)
    public final void method152(class391 arg0, int arg1) {
        field341++;
        int var3 = -104 / ((-arg1 - 50) / 37);
        while (true) {
            int var4 = arg0.method2348(-2);
            if (var4 == 0) {
                return;
            }
            this.method153(var4, (byte) -79, arg0);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBLsi;)V", line = 223)
    private final void method153(int arg0, byte arg1, class391 arg2) {
        if (arg0 == 1) {
            this.field344 = arg2.method2338(true);
            this.method148(this.field344, -125);
        } else if (arg0 == 2) {
            this.field337 = arg2.method2353((byte) 67);
            if (this.field337 == 65535) {
                this.field337 = -1;
            }
        } else if (arg0 == 3) {
            this.field343 = arg2.method2353((byte) 115) << 0;
        } else if (arg0 == 4) {
            this.field336 = false;
        }
        field350++;
        if (arg1 != -79) {
            this.method152(null, -87);
        }
    }
}
