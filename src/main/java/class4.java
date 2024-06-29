import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class4 extends class133 {

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "Z")
    public boolean field112;

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "F")
    public float field111;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "F")
    public float field109;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "[F")
    public static float[] field115 = new float[4];

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ar", name = "U", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIII)V", line = 3)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field112 = false;
        this.field116 = arg2;
        this.field111 = (float) arg2 / (float) arg4;
        this.field109 = (float) arg3 / (float) arg5;
        this.field110 = arg3;
        this.method774(false, (byte) -43, false);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIIZ[BI)V", line = 16)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field116 = arg3;
        this.field110 = arg4;
        if (super.field8638 != 34037) {
            this.field111 = this.field109 = 1.0F;
            this.field112 = true;
        } else {
            this.field112 = false;
            this.field111 = (float) arg3;
            this.field109 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIIIIZ)V", line = 38)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field116 = arg3;
        this.field110 = arg4;
        this.field109 = (float) arg4 / (float) arg6;
        this.field112 = false;
        this.field111 = (float) arg3 / (float) arg5;
        this.method774(false, (byte) -72, false);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIII)V", line = 51)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field110 = arg4;
        this.field116 = arg3;
        if (super.field8638 == 34037) {
            this.field112 = false;
            this.field111 = (float) arg3;
            this.field109 = (float) arg4;
        } else {
            this.field111 = this.field109 = 1.0F;
            this.field112 = true;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIZ[I)V", line = 75)
    public class4(class548 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field110 = arg3;
        this.field116 = arg2;
        if (~super.field8638 == -34038) {
            this.field111 = (float) arg2;
            this.field109 = (float) arg3;
            this.field112 = false;
        } else {
            this.field112 = true;
            this.field111 = this.field109 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIII[BI)V", line = 96)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field116 = arg2;
        this.field110 = arg3;
        this.method768(0, arg7, 0, 0, true, arg3, 3314, 0, arg6, arg2);
        this.field111 = (float) arg2 / (float) arg4;
        this.field112 = false;
        this.field109 = (float) arg3 / (float) arg5;
        this.method774(false, (byte) -96, false);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIIIIZ)V", line = 112)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field116 = arg4;
        if (~super.field8638 == -34038) {
            this.field112 = false;
            this.field111 = (float) arg4;
            this.field109 = (float) arg5;
        } else {
            this.field111 = this.field109 = 1.0F;
            this.field112 = true;
        }
        this.field110 = arg5;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lqj;IIII[I)V", line = 135)
    public class4(class548 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field110 = arg2;
        this.field116 = arg1;
        this.method770(88, 0, 0, arg1, true, arg2, 0, arg5, 0);
        this.field112 = false;
        this.field109 = (float) arg2 / (float) arg4;
        this.field111 = (float) arg1 / (float) arg3;
        this.method774(false, (byte) -31, false);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(BLjava/lang/String;)J", line = 149)
    public static final long method34(byte arg0, String arg1) {
        ++field117;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 > -113) {
            method34((byte) -80, (String) null);
        }
        for (int var5 = 0; var2 > var5; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V", line = 172)
    public static void method35(int arg0) {
        field115 = null;
        if (arg0 != 0) {
            method36(62, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)Z", line = 183)
    public static final boolean method36(int arg0, byte arg1) {
        if (arg1 != 98) {
            method36(96, (byte) -98);
        }
        ++field114;
        return ~(-arg0 & arg0) == ~arg0;
    }
}
