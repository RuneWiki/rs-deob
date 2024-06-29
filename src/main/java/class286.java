import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class286 extends class179 {

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field4558 = -1;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4548 = "glow3:";

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Lul;")
    public static class51 field4562 = new class51(50);

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "B")
    public byte field4554;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "Lpi;")
    public class336 field4560;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "[I")
    public static int[] field4563;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 7)
    public static void method1951(byte arg0) {
        if (arg0 == -116) {
            field4562 = null;
            field4563 = null;
            field4548 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)I", line = 19)
    public final int method3(int arg0) {
        field4551++;
        if (arg0 == 0) {
            return this.field4560 == null ? 0 : this.field4560.field5353 * 100 / (this.field4560.field5342.length - this.field4554);
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)[B", line = 35)
    public final byte[] method4(int arg0) {
        if (arg0 != 0) {
            this.method4(24);
        }
        field4555++;
        if (this.field3029 || (this.field4560.field5342.length - this.field4554) > this.field4560.field5353) {
            throw new RuntimeException();
        }
        return this.field4560.field5342;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)I", line = 56)
    public static final int method1952(int arg0, int arg1) {
        field4553++;
        if (arg1 != 20624) {
            field4548 = (String) null;
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 108)
    public static final void method1953() {
        GL var0 = class43.field651;
        var0.glDisableClientState(32886);
        class43.method352(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class43.method354();
        for (int var1 = 0; var1 < class124.field2147[0].length; var1++) {
            class337 var2 = class124.field2147[0][var1];
            if (var2.field5389 >= 0 && class68.method653(-126, class62.field953.method1206((byte) -24, var2.field5389))) {
                var0.glColor4fv(class102.method877(var2.field5377, (byte) -85), 0);
                float var3 = 201.5F - (var2.field5399 ? 1.0F : 0.5F);
                var2.method2383(class279.field4430, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class43.method362();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class43.method376();
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V", line = 141)
    public static final void method1954(int arg0) {
        class230.field3836.method470(12);
        if (arg0 != -1) {
            field4548 = (String) null;
        }
        field4549++;
        class213.field3582.method470(12);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILuk;Luk;IIJ)V", line = 154)
    public static final void method1955(int arg0, int arg1, int arg2, int arg3, class104 arg4, class104 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class297 var10 = new class297();
        var10.field4732 = arg8;
        var10.field4735 = arg1 * 128 + 64;
        var10.field4743 = arg2 * 128 + 64;
        var10.field4742 = arg3;
        var10.field4741 = arg4;
        var10.field4744 = arg5;
        var10.field4734 = arg6;
        var10.field4739 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class279.field4430[var11][arg1][arg2] == null) {
                class279.field4430[var11][arg1][arg2] = new class257(var11, arg1, arg2);
            }
        }
        class279.field4430[arg0][arg1][arg2].field4146 = var10;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 181)
    public static final void method1956(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field4550 = 105;
        }
        field4552++;
        if (class79.field1280 == 0 || arg4 == 0 || class131.field2256 >= 50 || arg2 == -1) {
            return;
        }
        class123.field2135[class131.field2256] = arg2;
        class4.field62[class131.field2256] = arg4;
        class271.field4320[class131.field2256] = arg3;
        class133.field2272[class131.field2256] = null;
        class329.field5241[class131.field2256] = 0;
        class170.field2941[class131.field2256] = arg0;
        class131.field2256++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V", line = 205)
    public static final void method1957(byte arg0, int arg1) {
        class304.field4811.method469(-11815, arg1);
        if (arg0 < 39) {
            method1954(-37);
        }
        field4556++;
    }
}
