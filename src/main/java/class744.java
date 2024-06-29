import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class744 extends class182 {

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    private int field10374;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    private int field10369;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    private int field10379;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    private int field10377;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    private int field10368;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    private int field10370;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    private int field10371;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    private int field10373;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "[B")
    private byte[] field10372;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    public final void method1220(int arg0) {
        this.field10370 = 0;
        field10366++;
        this.field10368 = 0;
        if (arg0 >= -40) {
            this.method1214(122, 103, 2);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)V")
    public void method1074(int arg0, int arg1, byte arg2) {
        this.field10372[arg0] = arg2;
        if (arg1 != 4096) {
            method4146(121, -51, 120);
        }
        field10378++;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class744(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field10374 = (int) (arg7 * 4096.0F);
        this.field10369 = (int) (arg6 * 4096.0F);
        this.field10377 = this.field10379 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILfw;Lfw;)V")
    public static final void method4145(int arg0, int arg1, int arg2, class217 arg3, class217 arg4) {
        class38 var5 = class617.method3623(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field539 = arg3;
        var5.field540 = arg4;
        int var6 = class52.field741 == class435.field5969 ? 1 : 0;
        if (!arg3.method277(3)) {
            class140.field1931[var6][class609.field8671[var6]++] = arg3;
        } else if (arg3.method283((byte) -124)) {
            class160.field2206[var6][class352.field4548[var6]++] = arg3;
        } else {
            class261.field3566[var6][class269.field3635[var6]++] = arg3;
            class380.field5357 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method277(3)) {
            if (arg4.method283((byte) -84)) {
                class160.field2206[var6][class352.field4548[var6]++] = arg4;
                return;
            }
            class261.field3566[var6][class269.field3635[var6]++] = arg4;
            class380.field5357 = true;
            return;
        }
        class140.field1931[var6][class609.field8671[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
    public final void method1214(int arg0, int arg1, int arg2) {
        if (arg2 < 109) {
            method4146(12, -72, 120);
        }
        if (arg1 == 0) {
            this.field10373 = this.field10369 - (arg0 >= 0 ? arg0 : -arg0);
            this.field10373 = this.field10373 * this.field10373 >> 12;
            this.field10371 = 4096;
            this.field10370 = this.field10373;
        } else {
            this.field10371 = this.field10374 * this.field10373 >> 12;
            if (this.field10371 < 0) {
                this.field10371 = 0;
            } else if (this.field10371 > 4096) {
                this.field10371 = 4096;
            }
            this.field10373 = this.field10369 - (arg0 >= 0 ? arg0 : -arg0);
            this.field10373 = this.field10373 * this.field10373 >> 12;
            this.field10373 = this.field10373 * this.field10371 >> 12;
            this.field10370 += this.field10377 * this.field10373 >> 12;
            this.field10377 = this.field10379 * this.field10377 >> 12;
        }
        field10376++;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Lcea;")
    public static final class95 method4146(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field542;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method1215(int arg0) {
        field10367++;
        this.field10370 >>= 0x4;
        int var2 = 123 / ((arg0 - 54) / 38);
        this.field10377 = this.field10379;
        if (this.field10370 < 0) {
            this.field10370 = 0;
        } else if (this.field10370 > 255) {
            this.field10370 = 255;
        }
        this.method1074(this.field10368++, 4096, (byte) this.field10370);
        this.field10370 = 0;
    }
}
