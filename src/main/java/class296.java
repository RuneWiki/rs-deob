import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class296 extends class71 {

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    private int field4636;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    private int field4651;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lbi;")
    public static class91 field4640;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIII)Z", line = 4)
    public final boolean method2060(boolean arg0, int arg1, int arg2, int arg3) {
        field4638++;
        if (!arg0) {
            this.field4641 = 94;
        }
        return this.field4636 == arg1 && this.field4642 <= arg2 && this.field4635 >= arg2 && this.field4651 <= arg3 && arg3 <= this.field4641;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)Z", line = 22)
    public final boolean method2061(byte arg0, int arg1, int arg2) {
        field4645++;
        if (arg0 > -56) {
            this.method2066(false, -52, 99);
        }
        return this.field4642 <= arg1 && arg1 <= this.field4635 && this.field4651 <= arg2 && this.field4641 >= arg2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z", line = 42)
    public final boolean method2062(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            field4647++;
            return this.field4650 <= arg2 && this.field4649 >= arg2 && arg1 >= this.field4648 && this.field4637 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 60)
    public static void method2063(int arg0) {
        field4640 = null;
        if (arg0 != -12425) {
            method2067(122);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)[I", line = 78)
    public final int[] method2064(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4639++;
            return new int[] { this.field4643, this.field4650 + arg2 - this.field4642, arg0 - -this.field4648 + -this.field4651 };
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)Z", line = 89)
    public static final boolean method2065(int arg0, int arg1, int arg2) {
        int var3 = class93.field1443[arg0][arg1][arg2];
        if (-class247.field3937 == var3) {
            return false;
        } else if (class247.field3937 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class52.method354(var4 + 1, class84.field1282[arg0][arg1][arg2], var5 + 1) && class52.method354(var4 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg2], var5 + 1) && class52.method354(var4 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class52.method354(var4 + 1, class84.field1282[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class93.field1443[arg0][arg1][arg2] = class247.field3937;
                return true;
            } else {
                class93.field1443[arg0][arg1][arg2] = -class247.field3937;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)[I", line = 116)
    public final int[] method2066(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field4641 = 51;
        }
        field4646++;
        return new int[] { this.field4636, this.field4642 + arg2 - this.field4650, arg1 - -this.field4651 + -this.field4648 };
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 129)
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4648 = arg7;
        this.field4636 = arg0;
        this.field4643 = arg1;
        this.field4637 = arg9;
        this.field4650 = arg6;
        this.field4641 = arg5;
        this.field4635 = arg4;
        this.field4642 = arg2;
        this.field4651 = arg3;
        this.field4649 = arg8;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z", line = 147)
    public static final boolean method2067(int arg0) {
        if (arg0 != 0) {
            return false;
        }
        field4644++;
        try {
            return class58.method407((byte) -62);
        } catch (IOException var5) {
            class319.method2222((byte) 5);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class35.field459 + "," + class93.field1430 + "," + class98.field1498 + " - " + class138.field2063 + "," + (class13.field159.field1969[0] + class181.field2925) + "," + (class13.field159.field2006[0] + class24.field351) + " - ";
            for (int var4 = 0; class138.field2063 > var4 && var4 < 50; var4++) {
                var3 = var3 + class336.field5213.field3128[var4] + ",";
            }
            class314.method2186(var3, 117, var6);
            class321.method2246((byte) -128);
            return true;
        }
    }
}
