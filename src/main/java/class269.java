import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class269 {

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[Ljava/lang/String;")
    public String[] field4251;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
    public int[] field4241;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[B")
    public byte[] field4242;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    public int[] field4243;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
    public static int[] field4238 = new int[32768];

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
    public static boolean field4244 = false;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static volatile int field4247 = 0;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[I")
    public static int[] field4246 = new int[50];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Llc;")
    public static class175 field4237;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[Lhi;")
    public static class307[] field4245;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[[[Lan;")
    public static class337[][][] field4239;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 15)
    public static void method1956(byte arg0) {
        if (arg0 <= 24) {
            method1959(34, (int[]) null);
        }
        field4238 = null;
        field4237 = null;
        field4239 = (class337[][][]) null;
        field4245 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z", line = 37)
    public final boolean method1957(int arg0, int arg1) {
        if (arg0 != 19160) {
            field4245 = (class307[]) null;
        }
        field4248++;
        return (this.field4242[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z", line = 48)
    public final boolean method1958(byte arg0, int arg1) {
        if (arg0 < 15) {
            this.field4241 = (int[]) null;
        }
        field4235++;
        return (this.field4242[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[I)[I", line = 62)
    public static final int[] method1959(int arg0, int[] arg1) {
        if (arg0 != 4) {
            return (int[]) null;
        }
        field4236++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class86.method513(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V", line = 81)
    public class269(int arg0) {
        this.field4249 = arg0;
        this.field4251 = new String[this.field4249];
        this.field4241 = new int[this.field4249];
        this.field4242 = new byte[this.field4249];
        this.field4243 = new int[this.field4249];
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(BI)Z", line = 95)
    public final boolean method1960(byte arg0, int arg1) {
        int var3 = -101 % ((-arg0 - 37) / 56);
        field4240++;
        return (this.field4242[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(BI)I", line = 110)
    public final int method1961(byte arg0, int arg1) {
        if (arg0 < 114) {
            this.method1958((byte) 60, 29);
        }
        field4250++;
        return this.field4242[arg1] & 0x3;
    }
}
