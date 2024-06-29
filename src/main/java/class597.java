import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class597 extends class488 {

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "S")
    public short field8397;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([Lgga;I)I")
    public final int method785(class332[] arg0, int arg1) {
        ++field8396;
        int var3 = super.field6461 >> class52.field775;
        int var4 = 74 % ((arg1 - -87) / 32);
        int var5 = super.field6464 >> class52.field775;
        int var6 = 0;
        if (~class516.field7041 == ~var3) {
            ++var6;
        } else if (~class516.field7041 > ~var3) {
            var6 += 2;
        }
        if (class204.field2599 == var5) {
            var6 += 3;
        } else if (class204.field2599 > var5) {
            var6 += 6;
        }
        int var7 = class677.field9503[var6];
        if (~(var7 & this.field8397) != -1) {
            return this.method2640((byte) 122, arg0, var3, var5);
        } else if (~this.field8397 == -2 && ~var3 < -1) {
            return this.method2640((byte) 70, arg0, var3 + -1, var5);
        } else if (this.field8397 == 4 && class429.field5383 >= var3) {
            return this.method2640((byte) 111, arg0, var3 - -1, var5);
        } else if (this.field8397 == 8 && var5 > 0) {
            return this.method2640((byte) 98, arg0, var3, var5 + -1);
        } else if (~this.field8397 == -3 && class37.field508 >= var5) {
            return this.method2640((byte) 67, arg0, var3, var5 + 1);
        } else if (~this.field8397 == -17 && ~var3 < -1 && var5 <= class37.field508) {
            return this.method2640((byte) 111, arg0, var3 + -1, var5 + 1);
        } else if (~this.field8397 == -33 && var3 <= class429.field5383 && ~var5 >= ~class37.field508) {
            return this.method2640((byte) 104, arg0, var3 + 1, var5 + 1);
        } else if (this.field8397 == 128 && ~var3 < -1 && ~var5 < -1) {
            return this.method2640((byte) 124, arg0, var3 - 1, var5 + -1);
        } else if (~this.field8397 == -65 && ~class429.field5383 <= ~var3 && var5 > 0) {
            return this.method2640((byte) 62, arg0, var3 - -1, var5 + -1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)Z")
    public final boolean method787(int arg0) {
        ++field8398;
        if (arg0 != 4095) {
            this.field8397 = -97;
        }
        return class354.field4511[(super.field6461 >> class52.field775) + -class516.field7041 + class479.field6372][(super.field6464 >> class52.field775) + -class204.field2599 + class479.field6372];
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(B)Z")
    public final boolean method786(byte arg0) {
        ++field8395;
        return arg0 < 111 ? true : class493.method2655(super.field6456, super.field6464 >> class52.field775, super.field6461 >> class52.field775, this, true);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method3284(int arg0, String arg1, String arg2, String arg3) {
        ++field8394;
        if (arg0 != 0) {
            return null;
        } else {
            for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, var4 + arg3.length())) {
                arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg2.length() + var4);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "(I)[Lbaa;")
    public static final class593[] method3285(int arg0) {
        int var1 = 72 / ((61 - arg0) / 60);
        ++field8393;
        return new class593[] { class497.field6553, client.field9533, class145.field1863, class257.field3134, class462.field5886, class538.field7225, class260.field3211, class404.field5069, class380.field4798, class205.field2610, class77.field1068, class262.field3231, class523.field7101, class480.field6381 };
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIIII)V")
    public class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field6458 = arg1;
        super.field6464 = arg2;
        super.field6470 = (byte) arg3;
        this.field8397 = (short) arg5;
        super.field6461 = arg0;
        super.field6456 = (byte) arg4;
    }
}
