import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class18 extends class16 {

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "I")
    public int field286 = 0;

    @OriginalMember(owner = "mapview!ia", name = "s", descriptor = "[B")
    public byte[] field288;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "Lh;")
    public static class15 field283 = class26.method190(true, "Archery Shop");

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "I")
    public static volatile int field285 = 0;

    @OriginalMember(owner = "mapview!ia", name = "u", descriptor = "Lh;")
    public static class15 field290 = class26.method190(true, "Vegetable Store");

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "[Z")
    public static boolean[] field287 = new boolean[112];

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Lh;")
    public static class15 field284 = class26.method190(true, "75(U");

    @OriginalMember(owner = "mapview!ia", name = "v", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "mapview!ia", name = "t", descriptor = "Z")
    public static boolean field289;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)Lh;", line = 16)
    public final class15 method147(int arg0) {
        if (arg0 != -1992) {
            this.method147(-36);
        }
        int var2 = this.field286;
        while (this.field288[this.field286++] != 0) {
        }
        return class21.method163(var2, this.field286 - var2 - 1, false, this.field288);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(B)I", line = 30)
    public final int method148(byte arg0) {
        return arg0 <= 77 ? 16 : this.field288[this.field286++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IBI[B)V", line = 65)
    public final void method149(int arg0, byte arg1, int arg2, byte[] arg3) {
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field288[this.field286++];
        }
        if (arg1 >= -97) {
            field291 = 87;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(I)B", line = 84)
    public final byte method150(int arg0) {
        if (arg0 != -128) {
            method151((byte) 26);
        }
        return this.field288[this.field286++];
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(B)V", line = 96)
    public static void method151(byte arg0) {
        field287 = null;
        field284 = null;
        field290 = null;
        if (arg0 >= -49) {
            method155(null, 76);
        }
        field283 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II[IB)V", line = 112)
    public final void method152(int arg0, int arg1, int[] arg2, byte arg3) {
        int var5 = this.field286;
        this.field286 = arg0;
        int var6 = (arg1 - arg0) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method156(127);
            int var9 = this.method156(127);
            int var10 = -1640531527;
            int var11 = -957401312;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ var11 - -arg2[var11 >>> 11 & 0x3];
                var11 -= var10;
                var8 -= arg2[var11 & 0x3] + var11 ^ (var9 << 4 ^ var9 >>> 5) + var9;
            }
            this.field286 -= 8;
            this.method154((byte) 102, var8);
            this.method154((byte) 96, var9);
        }
        int var13 = -114 / ((-arg3 - 2) / 46);
        this.field286 = var5;
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(I)I", line = 164)
    public final int method153(int arg0) {
        this.field286 += 3;
        if (arg0 != -15076) {
            this.method152(41, -116, null, (byte) 115);
        }
        return ((this.field288[this.field286 - 3] & 0xFF) << 16) + (((this.field288[this.field286 - 2] & 0xFF) << 8) + (this.field288[this.field286 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BI)V", line = 175)
    public final void method154(byte arg0, int arg1) {
        this.field288[this.field286++] = (byte) (arg1 >> 24);
        this.field288[this.field286++] = (byte) (arg1 >> 16);
        if (arg0 <= 56) {
            this.method158(-65, 40);
        }
        this.field288[this.field286++] = (byte) (arg1 >> 8);
        this.field288[this.field286++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(I)V", line = 209)
    public class18(int arg0) {
        this.field288 = class26.method191(19607, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 219)
    public static final void method155(Component arg0, int arg1) {
        arg0.removeKeyListener(class26.field354);
        arg0.removeFocusListener(class26.field354);
        if (arg1 != 255) {
            method155(null, -42);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "(I)I", line = 248)
    public final int method156(int arg0) {
        this.field286 += 4;
        if (arg0 != 127) {
            this.method152(83, 36, null, (byte) 37);
        }
        return ((this.field288[this.field286 - 2] & 0xFF) << 8) + (this.field288[this.field286 - 4] << 24 & 0xFF000000) + ((this.field288[this.field286 + -3] & 0xFF) << 16) + (this.field288[this.field286 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "(I)I", line = 281)
    public final int method157(int arg0) {
        if (arg0 != -1) {
            field289 = true;
        }
        this.field286 += 2;
        return ((this.field288[this.field286 - 2] & 0xFF) << 8) + (this.field288[this.field286 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(II)V", line = 297)
    public final void method158(int arg0, int arg1) {
        this.field288[this.field286++] = (byte) arg0;
        if (arg1 != 24594) {
            this.field286 = 13;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([B)V", line = 309)
    public class18(byte[] arg0) {
        this.field288 = arg0;
    }
}
