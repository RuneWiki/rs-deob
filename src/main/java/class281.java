import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class281 extends class28 {

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field4339 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4334 = "Select";

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4336 = "yellow:";

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "[B")
    private byte[] field4345;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 4)
    public final void method188(int arg0) {
        this.field4346 = 0;
        this.field4351 = 0;
        if (arg0 != 200) {
            this.method189(119, 40, 1);
        }
        field4350++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)V", line = 19)
    public static final void method2003(long arg0, int arg1) {
        field4340++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class319.field4971; var3++) {
            if (class110.field1824[var3] == arg0) {
                class319.field4971--;
                for (int var4 = var3; var4 < class319.field4971; var4++) {
                    class329.field5082[var4] = class329.field5082[var4 + 1];
                    class204.field3246[var4] = class204.field3246[var4 + 1];
                    class70.field1102[var4] = class70.field1102[var4 + 1];
                    class110.field1824[var4] = class110.field1824[var4 + 1];
                    class274.field4265[var4] = class274.field4265[var4 + 1];
                    class28.field461[var4] = class28.field461[var4 + 1];
                }
                class169.field2625 = class200.field3157;
                class96.field1575++;
                class269.field4191.method246(false, 232);
                class269.field4191.method760(arg0, true);
                break;
            }
        }
        if (arg1 != 1) {
            field4336 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V", line = 65)
    public void method2004(int arg0, byte arg1) {
        this.field4345[arg0] = arg1;
        field4342++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 77)
    public final void method189(int arg0, int arg1, int arg2) {
        field4337++;
        if (arg1 != -2097549204) {
            return;
        }
        if (arg2 == 0) {
            this.field4349 = 4096;
            this.field4335 = this.field4347 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4335 = this.field4335 * this.field4335 >> 12;
            this.field4346 = this.field4335;
            return;
        }
        this.field4349 = this.field4341 * this.field4335 >> 12;
        if (this.field4349 < 0) {
            this.field4349 = 0;
        } else if (this.field4349 > 4096) {
            this.field4349 = 4096;
        }
        this.field4335 = this.field4347 - (arg0 < 0 ? -arg0 : arg0);
        this.field4335 = this.field4335 * this.field4335 >> 12;
        this.field4335 = this.field4349 * this.field4335 >> 12;
        this.field4346 += this.field4343 * this.field4335 >> 12;
        this.field4343 = this.field4348 * this.field4343 >> 12;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 114)
    public static void method2005(int arg0) {
        field4336 = null;
        field4334 = null;
        if (arg0 != -13482) {
            field4334 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIFFF)V", line = 125)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4341 = (int) (arg7 * 4096.0F);
        this.field4347 = (int) (arg6 * 4096.0F);
        this.field4343 = this.field4348 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V", line = 143)
    public final void method187(byte arg0) {
        this.field4343 = this.field4348;
        field4344++;
        this.field4346 >>= 0x4;
        if (this.field4346 < 0) {
            this.field4346 = 0;
        } else if (this.field4346 > 255) {
            this.field4346 = 255;
        }
        if (arg0 > 81) {
            this.method2004(this.field4351++, (byte) this.field4346);
            this.field4346 = 0;
        }
    }
}
