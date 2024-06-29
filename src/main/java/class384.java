import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class384 extends class372 {

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    private int field5512;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    private int field5509;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    private int field5501;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    private int field5511;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "Lfg;")
    public static class18 field5499 = new class18(64);

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    private int field5500;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    private int field5504;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    private int field5505;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    private int field5506;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "[B")
    private byte[] field5508;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIFFF)V", line = 6)
    public class384(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5512 = (int) (arg6 * 4096.0F);
        this.field5509 = (int) (arg7 * 4096.0F);
        this.field5511 = this.field5501 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V", line = 17)
    public final void method2104(byte arg0, int arg1, int arg2) {
        if (arg0 != 109) {
            this.field5511 = 100;
        }
        if (arg2 == 0) {
            this.field5505 = this.field5512 - (arg1 >= 0 ? arg1 : -arg1);
            this.field5506 = 4096;
            this.field5505 = this.field5505 * this.field5505 >> 12;
            this.field5500 = this.field5505;
        } else {
            this.field5506 = this.field5509 * this.field5505 >> 12;
            if (this.field5506 < 0) {
                this.field5506 = 0;
            } else if (this.field5506 > 4096) {
                this.field5506 = 4096;
            }
            this.field5505 = this.field5512 - (arg1 < 0 ? -arg1 : arg1);
            this.field5505 = this.field5505 * this.field5505 >> 12;
            this.field5505 = this.field5506 * this.field5505 >> 12;
            this.field5500 += this.field5511 * this.field5505 >> 12;
            this.field5511 = this.field5511 * this.field5501 >> 12;
        }
        field5513++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V", line = 57)
    public final void method2109(boolean arg0) {
        field5502++;
        this.field5511 = this.field5501;
        this.field5500 >>= 0x4;
        if (!arg0) {
            this.field5512 = -51;
        }
        if (this.field5500 < 0) {
            this.field5500 = 0;
        } else if (this.field5500 > 255) {
            this.field5500 = 255;
        }
        this.method2434(this.field5504++, (byte) this.field5500);
        this.field5500 = 0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V", line = 88)
    public void method2434(int arg0, byte arg1) {
        this.field5508[arg0] = arg1;
        field5503++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 98)
    public static final String method2435(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 119) {
            method2438(-85, 113, 61);
        }
        field5507++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class115.field1830[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V", line = 140)
    public static final void method2436(boolean arg0) {
        class371.field5247 = 0;
        class176.field2619 = 0;
        field5498++;
        class441.method2746(0);
        class30.method230(73);
        class33.method241((byte) -127);
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < class371.field5247) {
            int var3 = class336.field4806[var1];
            if (class267.field4002 != class447.field6512[var3].field5627) {
                if (class447.field6512[var3].field1545.method71(!arg0)) {
                    class7.method46((byte) 95, class447.field6512[var3]);
                }
                class447.field6512[var3].method817((class11) null, 17671);
                class447.field6512[var3] = null;
            }
            var1++;
        }
        if (class51.field824 != class268.field4020.field565) {
            throw new RuntimeException("gnp1 pos:" + class268.field4020.field565 + " psize:" + class51.field824);
        }
        for (int var2 = 0; var2 < class156.field2376; var2++) {
            if (class447.field6512[class416.field6027[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class156.field2376);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 194)
    public static void method2437(int arg0) {
        field5499 = null;
        if (arg0 <= 116) {
            method2435(-29, (byte[]) null, -113, -10);
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V", line = 206)
    public final void method2105(byte arg0) {
        this.field5500 = 0;
        field5514++;
        if (arg0 > -115) {
            method2438(73, 108, -97);
        }
        this.field5504 = 0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V", line = 221)
    public static final void method2438(int arg0, int arg1, int arg2) {
        if (arg1 != -5196) {
            field5515 = -101;
        }
        field5510++;
        class221 var3 = class447.method2795(13, (byte) -49, arg2);
        var3.method1692(0);
        var3.field3297 = arg0;
    }
}
