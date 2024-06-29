import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class72 extends class297 {

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Lnn;")
    public static class214 field1356 = new class214(13, 6);

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field1358 = 328;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[B")
    private byte[] field1346;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "[Lqp;")
    public static class585[] field1359;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)V", line = 3)
    public void method702(int arg0, byte arg1, int arg2) {
        this.field1346[arg2] = arg1;
        if (arg0 == 16567) {
            field1345++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 24)
    public final void method703(int arg0) {
        field1349++;
        if (arg0 != 4095) {
            this.field1353 = 54;
        }
        this.field1355 = 0;
        this.field1348 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLp;I)J", line = 36)
    public static final long method704(int arg0, byte arg1, class231 arg2, int arg3) {
        field1344++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class370 var10 = class552.field7819.method2890(0, arg2.method264(arg1 - 25844));
        long var11 = (long) (arg0 << 7 | arg3 | arg2.method269(-13265) << 14 | arg2.method258((byte) -36) << 20 | 0x40000000);
        if (var10.field5276 == 0) {
            var11 |= var8;
        }
        if (var10.field5317 == 1) {
            var11 |= var4;
        }
        if (var10.field5297) {
            var11 |= var6;
        }
        long var13 = var11 | (long) arg2.method264(-25792) << 32;
        if (arg1 != 52) {
            method704(56, (byte) 121, null, 82);
        }
        return var13;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 70)
    public static void method705(int arg0) {
        if (arg0 != 26856) {
            field1358 = 17;
        }
        field1359 = null;
        field1356 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 85)
    public final void method706(int arg0, int arg1, int arg2) {
        if (arg2 <= 7) {
            this.field1346 = null;
        }
        field1352++;
        if (arg1 == 0) {
            this.field1353 = this.field1343 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1353 = this.field1353 * this.field1353 >> 12;
            this.field1347 = 4096;
            this.field1355 = this.field1353;
            return;
        }
        this.field1347 = this.field1357 * this.field1353 >> 12;
        if (this.field1347 < 0) {
            this.field1347 = 0;
        } else if (this.field1347 > 4096) {
            this.field1347 = 4096;
        }
        this.field1353 = this.field1343 - (arg0 < 0 ? -arg0 : arg0);
        this.field1353 = this.field1353 * this.field1353 >> 12;
        this.field1353 = this.field1353 * this.field1347 >> 12;
        this.field1355 += this.field1353 * this.field1351 >> 12;
        this.field1351 = this.field1351 * this.field1350 >> 12;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 120)
    public final void method707(int arg0) {
        field1354++;
        this.field1351 = this.field1350;
        this.field1355 >>= 0x4;
        if (arg0 > this.field1355) {
            this.field1355 = 0;
        } else if (this.field1355 > 255) {
            this.field1355 = 255;
        }
        this.method702(16567, (byte) this.field1355, this.field1348++);
        this.field1355 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 144)
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1357 = (int) (arg7 * 4096.0F);
        this.field1343 = (int) (arg6 * 4096.0F);
        this.field1351 = this.field1350 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
