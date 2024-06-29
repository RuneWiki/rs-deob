import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class249 extends class295 {

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Lae;")
    public class276 field3405;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Laa;")
    public class275 field3404;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lik;")
    public static class410 field3410 = new class410(20);

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Lpe;")
    public static class391 field3415;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 6)
    public static void method1619(int arg0) {
        field3410 = null;
        field3415 = null;
        if (arg0 != 0) {
            field3414 = -89;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V", line = 21)
    public static final void method1620(int arg0, byte arg1, int arg2) {
        field3417++;
        class116 var3 = class150.field2295[arg2][arg0];
        if (var3 != null) {
            class75.field1120 = var3.field1624;
            class228.field3173 = var3.field1634;
            class276.field3712 = var3.field1620;
        }
        int var4 = -100 / ((49 - arg1) / 43);
        class348.method2201(-6120);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[ILqo;[II)V", line = 45)
    public static final void method1621(int[] arg0, int[] arg1, class127 arg2, int[] arg3, int arg4) {
        field3406++;
        for (int var5 = arg4; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field4990.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4990[var9] = null;
                    } else {
                        class209 var10 = class288.method1819(var6, (byte) 105);
                        int var11 = var10.field2917;
                        class291 var12 = arg2.field4990[var9];
                        if (var12 != null) {
                            if (var12.field3955 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field4990[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3946 = 0;
                                    var12.field3948 = 1;
                                    var12.field3945 = 0;
                                    var12.field3951 = 0;
                                    var12.field3952 = var8;
                                    class232.method1547(arg4 + 13238, var10, arg2.field3167, false, 0, arg2.field3176);
                                } else if (var11 == 2) {
                                    var12.field3951 = 0;
                                }
                            } else if (var10.field2906 >= class288.method1819(var12.field3955, (byte) 105).field2906) {
                                var12 = arg2.field4990[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class291 var13 = arg2.field4990[var9] = new class291();
                            var13.field3955 = var6;
                            var13.field3945 = 0;
                            var13.field3952 = var8;
                            var13.field3946 = 0;
                            var13.field3948 = 1;
                            var13.field3951 = 0;
                            class232.method1547(13238, var10, arg2.field3167, false, 0, arg2.field3176);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 144)
    public final void method1622(int arg0) {
        this.field3411 = this.field3405.field3718;
        this.field3413 = this.field3405.field3727;
        field3409++;
        this.field3416 = this.field3405.field3721;
        if (this.field3405.field3711 != null) {
            this.field3405.field3711.method315(this.field3404.field3684, this.field3404.field3704, this.field3404.field3691, class190.field2731);
        }
        this.field3408 = class190.field2731[2];
        this.field3407 = class190.field2731[0];
        if (arg0 != 1) {
            this.field3408 = 52;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(DZ)V", line = 172)
    public static final void method1623(double arg0, boolean arg1) {
        if (class59.field934 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class282.field3772[var3] = var4 <= 255 ? var4 : 255;
            }
            class59.field934 = arg0;
        }
        if (!arg1) {
            field3410 = null;
        }
        field3412++;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lae;Lha;)V", line = 199)
    public class249(class276 arg0, class48 arg1) {
        this.field3405 = arg0;
        this.field3404 = class23.method288(5, arg0.field3715);
        this.method1622(1);
    }
}
