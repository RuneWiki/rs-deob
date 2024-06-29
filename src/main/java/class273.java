import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class273 extends class210 {

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "F")
    public float field4036;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Z")
    public boolean field4037;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "F")
    public float field4042;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "[[[I")
    public static int[][][] field4040;

    static {
        new class487("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)Z", line = 5)
    public static final boolean method1725(int arg0, byte arg1) {
        ++field4041;
        if (arg1 <= 42) {
            field4040 = null;
        }
        return ~arg0 == -1 || ~arg0 == -2;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIIIIIZ)V", line = 16)
    public class273(class468 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4035 = arg3;
        this.field4036 = (float) arg4 / (float) arg6;
        this.field4037 = false;
        this.field4042 = (float) arg3 / (float) arg5;
        this.field4043 = arg4;
        this.method1359(10497, false, false);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 29)
    public static void method1726(int arg0) {
        field4040 = null;
        int var1 = 70 % ((arg0 - 40) / 58);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIIZ[I)V", line = 38)
    public class273(class468 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4035 = arg2;
        this.field4043 = arg3;
        if (super.field8096 != 34037) {
            this.field4042 = this.field4036 = 1.0F;
            this.field4037 = true;
        } else {
            this.field4042 = (float) arg2;
            this.field4036 = (float) arg3;
            this.field4037 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)J", line = 59)
    public static final long method1727(int arg0, String arg1) {
        ++field4038;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = arg0; var4 > var5; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (-64 - -var6);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var2 += (long) (var6 + -96);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (27 - -var6 + -48);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
        }
        while (~(var2 % 37L) == -1L && ~var2 != -1L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIIII[BI)V", line = 107)
    public class273(class468 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4035 = arg2;
        this.field4043 = arg3;
        this.method1366(0, arg2, true, arg6, 0, true, arg7, arg3, 0, 0);
        this.field4042 = (float) arg2 / (float) arg4;
        this.field4036 = (float) arg3 / (float) arg5;
        this.field4037 = false;
        this.method1359(10497, false, false);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIIIIZ)V", line = 122)
    public class273(class468 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4043 = arg5;
        if (super.field8096 == 34037) {
            this.field4036 = (float) arg5;
            this.field4042 = (float) arg4;
            this.field4037 = false;
        } else {
            this.field4042 = this.field4036 = 1.0F;
            this.field4037 = true;
        }
        this.field4035 = arg4;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIIIZ[BI)V", line = 143)
    public class273(class468 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field8096 != -34038) {
            this.field4042 = this.field4036 = 1.0F;
            this.field4037 = true;
        } else {
            this.field4036 = (float) arg4;
            this.field4042 = (float) arg3;
            this.field4037 = false;
        }
        this.field4035 = arg3;
        this.field4043 = arg4;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)I", line = 166)
    public static final int method1728(int arg0, int arg1, int arg2, int arg3) {
        ++field4034;
        if (class436.field6426 < 100) {
            return -2;
        } else {
            if (arg2 != -29335) {
                field4040 = null;
            }
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class113.field1445 + arg3;
            int var7 = -class113.field1434 + arg0;
            for (class385 var8 = (class385) class113.field1428.method2496((byte) 63); var8 != null; var8 = (class385) class113.field1428.method2494(41)) {
                if (var8.field5633 == arg1) {
                    int var9 = var8.field5630;
                    int var10 = var8.field5627;
                    int var11 = var10 - -class113.field1434 | var9 - -class113.field1445 << 14;
                    int var12 = (-var9 + var6) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (~var4 > -1 || ~var12 > ~var5) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILwaa;)V", line = 220)
    public static final void method1729(int arg0, int arg1, int arg2, class33 arg3) {
        class415 var4 = class240.method1542(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5976 = arg3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Los;IIII[I)V", line = 229)
    public class273(class468 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4043 = arg2;
        this.field4035 = arg1;
        this.method1362(0, 0, arg1, arg5, true, -109, 0, 0, arg2);
        this.field4037 = false;
        this.field4036 = (float) arg2 / (float) arg4;
        this.field4042 = (float) arg1 / (float) arg3;
        this.method1359(10497, false, false);
    }
}
