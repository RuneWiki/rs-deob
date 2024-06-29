import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class279 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[Lwm;")
    public class152[] field4766;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[B")
    public byte[] field4779;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
    public int[] field4764;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[S")
    public short[] field4768;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[S")
    public short[] field4774;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lwm;")
    public static class152 field4775 = null;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4767 = -1;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lwm;")
    public static class152 field4780 = class157.method1048("Forced tweening ENABLED(Q", 126);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 16)
    public static void method1898(int arg0) {
        int var1 = -125 / ((arg0 - 48) / 43);
        field4775 = null;
        field4780 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)I", line = 26)
    public final int method1899(boolean arg0, int arg1) {
        if (!arg0) {
            field4769 = 42;
        }
        field4778++;
        return this.field4779[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[B)[B", line = 45)
    public static final byte[] method1900(byte arg0, byte[] arg1) {
        if (arg0 != -109) {
            field4767 = -56;
        }
        field4772++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class187.method1243(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z", line = 68)
    public final boolean method1901(byte arg0, int arg1) {
        field4771++;
        if (arg0 != -24) {
            method1900((byte) -120, (byte[]) null);
        }
        return (this.field4779[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Z", line = 82)
    public final boolean method1902(int arg0, boolean arg1) {
        if (arg1) {
            method1900((byte) 36, (byte[]) null);
        }
        field4777++;
        return (this.field4779[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z", line = 102)
    public final boolean method1903(int arg0, byte arg1) {
        if (arg1 == -62) {
            field4776++;
            return (this.field4779[arg0] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 112)
    public class279(int arg0) {
        this.field4773 = arg0;
        this.field4766 = new class152[this.field4773];
        this.field4779 = new byte[this.field4773];
        this.field4764 = new int[this.field4773];
        this.field4768 = new short[this.field4773];
        this.field4774 = new short[this.field4773];
    }
}
