import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class279 extends class260 {

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Z")
    public boolean field4019;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "F")
    public float field4026;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "F")
    public float field4017;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "[J")
    public static long[] field4025;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "F")
    public static float field4024;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lic;")
    public static class491 field4018;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lab;")
    public static final class472 method1819(boolean arg0, Canvas arg1) {
        ++field4023;
        try {
            Class var2 = Class.forName("wg");
            class472 var3 = (class472) var2.newInstance();
            var3.method960(arg1, arg0);
            return var3;
        } catch (Throwable var5) {
            class146 var4 = new class146();
            var4.method960(arg1, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIIIIIZ)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4019 = false;
        this.field4021 = arg3;
        this.field4026 = (float) arg4 / (float) arg6;
        this.field4020 = arg4;
        this.field4017 = (float) arg3 / (float) arg5;
        this.method1730(false, 10497, false);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIIIZ[BI)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4020 = arg4;
        if (super.field6633 != 34037) {
            this.field4019 = true;
            this.field4017 = this.field4026 = 1.0F;
        } else {
            this.field4017 = (float) arg3;
            this.field4019 = false;
            this.field4026 = (float) arg4;
        }
        this.field4021 = arg3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIIII[BI)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4020 = arg3;
        this.field4021 = arg2;
        this.method1723(0, arg6, arg3, arg2, arg7, (byte) -115, 0, 0, 0, true);
        this.field4017 = (float) arg2 / (float) arg4;
        this.field4019 = false;
        this.field4026 = (float) arg3 / (float) arg5;
        this.method1730(false, 10497, false);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIIZ[I)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (~super.field6633 != -34038) {
            this.field4019 = true;
            this.field4017 = this.field4026 = 1.0F;
        } else {
            this.field4019 = false;
            this.field4017 = (float) arg2;
            this.field4026 = (float) arg3;
        }
        this.field4021 = arg2;
        this.field4020 = arg3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIII[I)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4020 = arg2;
        this.field4021 = arg1;
        this.method1728(0, arg2, true, 0, 0, 0, arg5, 3, arg1);
        this.field4019 = false;
        this.field4026 = (float) arg2 / (float) arg4;
        this.field4017 = (float) arg1 / (float) arg3;
        this.method1730(false, 10497, false);
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V")
    public static void method1820(int arg0) {
        field4018 = null;
        if (arg0 == 0) {
            field4025 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lod;IIIIIZ)V")
    public class279(class349 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field6633 == 34037) {
            this.field4019 = false;
            this.field4017 = (float) arg4;
            this.field4026 = (float) arg5;
        } else {
            this.field4019 = true;
            this.field4017 = this.field4026 = 1.0F;
        }
        this.field4021 = arg4;
        this.field4020 = arg5;
    }

    static {
        new class475("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field4025 = new long[256];
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((var1 & 1L) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field4025[var0] = var1;
        }
    }
}
