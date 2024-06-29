import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class219 extends class190 {

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    private int field3364;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "F")
    public static float field3373 = 0.0F;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    private int field3372;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "[B")
    private byte[] field3375;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 4)
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3367 = (int) (arg6 * 4096.0F);
        this.field3364 = (int) (arg7 * 4096.0F);
        this.field3362 = this.field3366 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 25)
    public final void method770(byte arg0) {
        this.field3362 = this.field3366;
        field3370++;
        this.field3372 >>= 0x4;
        if (this.field3372 < 0) {
            this.field3372 = 0;
        } else if (this.field3372 > 255) {
            this.field3372 = 255;
        }
        if (arg0 == -95) {
            this.method1340((byte) this.field3372, 77, this.field3376++);
            this.field3372 = 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 47)
    public final void method773(int arg0, int arg1, int arg2) {
        field3361++;
        if (arg1 != -15478) {
            return;
        }
        if (arg2 == 0) {
            this.field3360 = this.field3367 - (arg0 < 0 ? -arg0 : arg0);
            this.field3363 = 4096;
            this.field3360 = this.field3360 * this.field3360 >> 12;
            this.field3372 = this.field3360;
            return;
        }
        this.field3363 = this.field3364 * this.field3360 >> 12;
        this.field3360 = this.field3367 - (arg0 >= 0 ? arg0 : -arg0);
        if (this.field3363 < 0) {
            this.field3363 = 0;
        } else if (this.field3363 > 4096) {
            this.field3363 = 4096;
        }
        this.field3360 = this.field3360 * this.field3360 >> 12;
        this.field3360 = this.field3363 * this.field3360 >> 12;
        this.field3372 += this.field3362 * this.field3360 >> 12;
        this.field3362 = this.field3366 * this.field3362 >> 12;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 86)
    public final void method772(int arg0) {
        this.field3372 = 0;
        if (arg0 == 1690691948) {
            this.field3376 = 0;
            field3359++;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V", line = 102)
    public void method1340(byte arg0, int arg1, int arg2) {
        field3371++;
        int var4 = 10 / ((arg1 - 9) / 60);
        this.field3375[arg2] = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lja;II)V", line = 113)
    public static final void method1341(class174 arg0, int arg1, int arg2) {
        if (class279.field4243) {
            arg2 = 0;
            class279.field4243 = false;
        }
        field3374++;
        if (class223.field3441 == null || !class223.field3441.method1095(arg0, 89)) {
            class223.field3441 = arg0;
            class487.field7421 = class344.method2111((byte) -16);
            class23.field297 = arg2;
            class415.field6011 = arg2;
            if (class415.field6011 == 0) {
                class450.method2686(914352296);
            } else {
                class110.field1897 = class116.field1956;
                class107.field1867 = class52.field797;
                class169.field2631 = class400.field5826;
                class13.field148 = class162.field2533;
                class212.field3291 = class207.field3250;
                class476.field7274 = class329.field4933;
                class110.field1896 = class73.field1311;
                class350.field5154 = class238.field3593;
                class299.field4529 = class86.field1499;
                class9.field123 = class349.field5150;
            }
        }
        if (arg1 != 0) {
            field3373 = -0.0061810752F;
        }
    }
}
