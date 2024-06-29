import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class584 extends class482 implements class359 {

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    private int field8038;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lpea;I[BIZ)V", line = 3)
    public class584(class641 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field8038 = arg1;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)I", line = 12)
    public final int method1110(byte arg0) {
        int var2 = -35 % ((arg0 - 22) / 32);
        ++field8036;
        return super.field6483;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "([BIII)V", line = 27)
    public final void method1109(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field8037;
        if (arg2 < 6) {
            this.field8038 = 106;
        }
        this.method2686(arg3, true, arg0);
        this.field8038 = arg1;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V", line = 39)
    public static final void method3271(int arg0, int arg1) {
        ++field8039;
        int var2 = -44 / ((30 - arg1) / 50);
        class669.field9511.method3129(arg0, 14583);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIB)I", line = 51)
    public static final int method3272(int arg0, int arg1, byte arg2) {
        if (arg2 != 96) {
            return 41;
        } else {
            ++field8034;
            int var3 = arg0 >>> 24;
            int var4 = -var3 + 255;
            int var5 = (16711680 & (65280 & arg0) * var3 | (16711935 & arg0) * var3 & -16711936) >>> 8;
            return ((-16711936 & (16711935 & arg1) * var4 | (arg1 & 65280) * var4 & 16711680) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V", line = 68)
    public final void method2685(boolean arg0) {
        ++field8035;
        super.field6487.method3536((byte) 119, this);
        if (arg0) {
            this.method1110((byte) 4);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)I", line = 79)
    public final int method1114(byte arg0) {
        ++field8032;
        return arg0 > -58 ? 94 : this.field8038;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)J", line = 90)
    public final long method1111(int arg0) {
        if (arg0 != 9677) {
            this.field8038 = -99;
        }
        ++field8033;
        return 0L;
    }
}
