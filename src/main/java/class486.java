import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class486 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field6034 = 0;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field6038 = 0;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
    private boolean field6050 = false;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field6035;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    private int field6043;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field6048;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "J")
    public long field6041;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILji;)V")
    private final void method2640(int arg0, int arg1, class572 arg2) {
        if (arg1 == 1) {
            this.field6043 = arg2.method3031(arg0 ^ 0x6007);
        } else if (arg1 == 2) {
            arg2.method3097((byte) 12);
        } else if (arg1 == 3) {
            this.field6037 = arg2.method3064(arg0 - 2031066880);
            this.field6048 = arg2.method3064(arg0 ^ 0x790F9F00);
            this.field6051 = arg2.method3064(-2031091464);
        } else if (arg1 == 4) {
            this.field6045 = arg2.method3097((byte) 12);
            this.field6040 = arg2.method3064(-2031091464);
        } else if (arg1 == 6) {
            this.field6042 = arg2.method3097((byte) 12);
        } else if (arg1 == 8) {
            this.field6038 = 1;
        } else if (arg1 == 9) {
            this.field6034 = 1;
        } else if (arg1 == 10) {
            this.field6050 = true;
        }
        field6039++;
        if (arg0 != -24584) {
            this.method2640(-63, -98, null);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method2641(int arg0) {
        class292.field3710 = null;
        class638.field8652 = null;
        class94.field1201 = null;
        class678.field9231 = null;
        class240.field3111 = null;
        class711.field9937 = null;
        class216.field2533 = null;
        class590.field7923 = null;
        class616.field8348 = null;
        class597.field8019 = null;
        if (arg0 < 48) {
            return;
        }
        class38.field551 = null;
        class131.field1595 = null;
        class336.field4143 = null;
        field6046++;
        class294.field3738 = null;
        class87.field1136 = null;
        class657.field8940 = null;
        class627.field8514 = null;
        class194.field2291 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method2642(int arg0) {
        this.field6035 = class243.field3128[this.field6043 << 3];
        field6036++;
        this.field6047 = (int) Math.sqrt((double) (this.field6048 * this.field6048 + (this.field6037 * this.field6037 + (this.field6051 * this.field6051))));
        if (arg0 != 1) {
            return;
        }
        if (this.field6040 == 0) {
            this.field6040 = 1;
        }
        if (this.field6045 == 0) {
            this.field6041 = 2147483647L;
        } else if (this.field6045 == 1) {
            this.field6041 = (this.field6047 * 8 / this.field6040);
            this.field6041 *= this.field6041;
        } else if (this.field6045 == 2) {
            this.field6041 = (this.field6047 * 8 / this.field6040);
        }
        if (this.field6050) {
            this.field6047 *= -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lji;B)V")
    public final void method2643(class572 arg0, byte arg1) {
        field6049++;
        if (arg1 < 89) {
            return;
        }
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method2640(-24584, var3, arg0);
        }
    }
}
