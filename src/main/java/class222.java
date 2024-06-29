import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class222 extends class470 {

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    private int field3166;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "Lan;")
    public static class21 field3175;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "[I")
    public static int[] field3172;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3172 = null;
        if (arg0 != 3198) {
            field3175 = null;
        }
        field3175 = null;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
    public static final void method1422(int arg0) {
        ++field3168;
        if (class209.field2952 != null) {
            class209.field2952.method2235(121);
        }
        if (class170.field2459 != null) {
            class170.field2459.method2235(arg0 ^ -18413);
        }
        if (arg0 != 18320) {
            method1423(true, false);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZZ)V")
    public static final void method1423(boolean arg0, boolean arg1) {
        while (true) {
            if (~class343.field4627.method1235(class403.field5730, (byte) -48) <= -16) {
                int var2 = class343.field4627.method1237(592256579, 15);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    class576 var4 = (class576) class278.field3837.method1242(0, (long) var2);
                    if (var4 == null) {
                        class109 var5 = new class109();
                        var5.field607 = var2;
                        var4 = new class576(var5);
                        class278.field3837.method1241(var4, (long) var2, -115);
                        var3 = true;
                        class342.field4610[class204.field2859++] = var4;
                    }
                    class109 var6 = var4.field7929;
                    class586.field8386[class480.field6764++] = var2;
                    var6.field549 = class405.field5763;
                    if (var6.field1669 != null && var6.field1669.method3509((byte) -87)) {
                        class175.method1115(var6, -13);
                    }
                    int var7 = class343.field4627.method1237(592256579, 1);
                    if (~var7 == -2) {
                        class615.field8829[class188.field2666++] = var2;
                    }
                    int var8;
                    if (arg1) {
                        var8 = class343.field4627.method1237(592256579, 8);
                        if (~var8 < -128) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = class343.field4627.method1237(592256579, 5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9;
                    if (arg1) {
                        var9 = class343.field4627.method1237(592256579, 8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class343.field4627.method1237(592256579, 5);
                        if (~var9 < -16) {
                            var9 -= 32;
                        }
                    }
                    int var10 = 4 + class343.field4627.method1237(592256579, 3) << 11 & 15333;
                    var6.method770(class516.field7253.method3263(class343.field4627.method1237(592256579, 14), (byte) -103), true);
                    int var11 = class343.field4627.method1237(592256579, 2);
                    int var12 = class343.field4627.method1237(592256579, 1);
                    var6.method346(var6.field1669.field8597, (byte) -114);
                    var6.field610 = var6.field1669.field8547 << 3;
                    if (var3) {
                        var6.method341(true, var10, -122);
                    }
                    var6.method765(var12 == 1, class645.field9372.field616[0] + var9, 65, class645.field9372.field618[0] + var8, var11, var6.method337(0));
                    if (var6.field1669.method3509((byte) -68)) {
                        class434.method2578((class188) null, var6.field616[0], 0, var6, var6.field6035, var6.field618[0], 279765095, (class364) null);
                    }
                    continue;
                }
            }
            if (!arg0) {
                field3175 = null;
            }
            ++field3169;
            class343.field4627.method1239(8);
            return;
        }
    }

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "(I)V")
    public static final void method1424(int arg0) {
        if (class489.field6847 == 1 || ~class489.field6847 == -4 || ~class489.field6847 != ~class147.field2264 && (class489.field6847 == 0 || class147.field2264 == 0)) {
            class204.field2859 = 0;
            class480.field6764 = 0;
            class278.field3837.method1247(0);
        }
        ++field3167;
        class147.field2264 = class489.field6847;
        if (arg0 >= -104) {
            method1421(73);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        ++field3174;
        int var4 = this.field3166 * arg2 >> 12;
        int var5 = this.field3176 * arg2 >> 12;
        int var6 = this.field3170 * arg1 >> 12;
        int var7 = this.field3173 * arg1 >> 12;
        int var8 = -125 / ((-1 - arg0) / 39);
        class538.method3087(super.field6612, var6, var7, var4, (byte) 62, var5, super.field6611);
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(IIIIIII)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3166 = arg0;
        this.field3176 = arg2;
        this.field3170 = arg1;
        this.field3173 = arg3;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBI)V")
    public final void method313(int arg0, byte arg1, int arg2) {
        ++field3177;
        int var4 = this.field3166 * arg2 >> 12;
        int var5 = this.field3176 * arg2 >> 12;
        if (arg1 <= -99) {
            int var6 = this.field3170 * arg0 >> 12;
            int var7 = this.field3173 * arg0 >> 12;
            class537.method3085(596174632, var4, var6, var7, super.field6609, var5);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        ++field3171;
        if (arg2 > -95) {
            method1424(-50);
        }
        int var4 = this.field3166 * arg1 >> 12;
        int var5 = this.field3176 * arg1 >> 12;
        int var6 = this.field3170 * arg0 >> 12;
        int var7 = this.field3173 * arg0 >> 12;
        class562.method3207(var7, 116, var5, super.field6609, var6, super.field6611, super.field6612, var4);
    }

    static {
        new class104("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
