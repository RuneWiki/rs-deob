import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class97 extends class508 {

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Lnr;")
    public static class42 field1262 = new class42();

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "[B")
    private byte[] field1275;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V", line = 11)
    public final void method554(int arg0, int arg1, byte arg2) {
        if (arg2 > -106) {
            this.method559(32);
        }
        field1268++;
        if (arg0 == 0) {
            this.field1264 = this.field1273 - (arg1 >= 0 ? arg1 : -arg1);
            this.field1269 = 4096;
            this.field1264 = this.field1264 * this.field1264 >> 12;
            this.field1266 = this.field1264;
            return;
        }
        this.field1269 = this.field1265 * this.field1264 >> 12;
        if (this.field1269 < 0) {
            this.field1269 = 0;
        } else if (this.field1269 > 4096) {
            this.field1269 = 4096;
        }
        this.field1264 = this.field1273 - (arg1 < 0 ? -arg1 : arg1);
        this.field1264 = this.field1264 * this.field1264 >> 12;
        this.field1264 = this.field1269 * this.field1264 >> 12;
        this.field1266 += this.field1271 * this.field1264 >> 12;
        this.field1271 = this.field1272 * this.field1271 >> 12;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)V", line = 45)
    public static final void method555(byte arg0) {
        field1274++;
        if (arg0 != 26) {
            method558(-100);
        }
        class476.field7043.method3045(48);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 56)
    public final void method556(byte arg0) {
        if (arg0 > 41) {
            field1267++;
            this.field1261 = 0;
            this.field1266 = 0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(IIB)V", line = 68)
    public void method557(int arg0, int arg1, byte arg2) {
        field1276++;
        if (arg1 != -22513) {
            method558(72);
        }
        this.field1275[arg0] = arg2;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIIIFFF)V", line = 79)
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1265 = (int) (arg7 * 4096.0F);
        this.field1273 = (int) (arg6 * 4096.0F);
        this.field1271 = this.field1272 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V", line = 90)
    public static void method558(int arg0) {
        field1262 = null;
        if (arg0 != -1) {
            field1260 = -10;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 101)
    public final void method559(int arg0) {
        this.field1266 >>= 0x4;
        this.field1271 = this.field1272;
        field1270++;
        if (this.field1266 < 0) {
            this.field1266 = 0;
        } else if (this.field1266 > 255) {
            this.field1266 = 255;
        }
        if (arg0 != -4096) {
            this.method559(-42);
        }
        this.method557(this.field1261++, -22513, (byte) this.field1266);
        this.field1266 = 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Lu;", line = 139)
    public static final class54 method560(boolean arg0) {
        if (arg0) {
            method560(true);
        }
        field1263++;
        class370.field5036 = 0;
        return class362.method2159(123);
    }
}
