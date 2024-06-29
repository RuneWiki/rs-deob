import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class74 extends class56 {

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public static int field974 = -2;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZI)V", line = 3)
    public static final void method601(int arg0, boolean arg1, int arg2) {
        class625.field8690 = -class678.field9294 + arg2;
        ++field975;
        if (!arg1) {
            method602((byte[]) null, false, 61, 74);
        }
        class206.field2719 = arg0 - class678.field9304;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([BZII)I", line = 15)
    public static final int method602(byte[] arg0, boolean arg1, int arg2, int arg3) {
        ++field978;
        int var4 = -1;
        if (!arg1) {
            field974 = -63;
        }
        for (int var5 = arg3; arg2 > var5; ++var5) {
            var4 = var4 >>> 8 ^ class209.field2754[(arg0[var5] ^ var4) & 255];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V", line = 38)
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "(I)[Lrq;", line = 43)
    public static final class350[] method603(int arg0) {
        ++field977;
        if (arg0 != 12686) {
            field974 = -15;
        }
        return new class350[] { class186.field2504, class105.field1257, class622.field8663 };
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)[I", line = 54)
    public final int[] method24(int arg0, boolean arg1) {
        ++field976;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                class255.method1691(var3, 0, class328.field4576, class720.field10000[arg0]);
            }
            return var3;
        }
    }
}
