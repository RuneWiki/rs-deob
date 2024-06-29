import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class247 extends class4 {

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "[Lkc;")
    public static class279[] field3931 = new class279[28];

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3933 = "Allocating memory";

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "[I")
    public static int[] field3946 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Lvj;")
    public static class115 field3937 = new class115();

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3950 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "Lqj;")
    public static class147 field3938;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Ljava/lang/String;")
    public String field3945;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "[C")
    public char[] field3939;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[C")
    public char[] field3941;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "[I")
    public int[] field3935;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "[I")
    public int[] field3943;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "[Lia;")
    public static class226[] field3947;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILog;)V")
    private final void method1691(int arg0, int arg1, class221 arg2) {
        field3944++;
        if (arg1 == 1) {
            this.field3945 = arg2.method1539(arg0 - 108);
        } else if (arg1 == 2) {
            int var7 = arg2.method1517((byte) -96);
            this.field3939 = new char[var7];
            this.field3943 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3943[var8] = arg2.method1521((byte) 113);
                byte var9 = arg2.method1535((byte) -86);
                this.field3939[var8] = var9 == 0 ? 0 : class61.method439(16, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1517((byte) -96);
            this.field3941 = new char[var4];
            this.field3935 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3935[var5] = arg2.method1521((byte) 113);
                byte var6 = arg2.method1535((byte) -122);
                this.field3941[var5] = var6 == 0 ? 0 : class61.method439(class91.method687(arg0, 105), var6);
            }
        }
        if (arg0 != 0) {
            this.method1693(118);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBILnb;III)V")
    public static final void method1692(int arg0, byte arg1, int arg2, class207 arg3, int arg4, int arg5, int arg6) {
        field3936++;
        class245.method1685(arg5, (byte) 124, arg0, arg4, arg2, arg3.field3341, arg6, arg3.field3389);
        int var7 = 41 % ((arg1 - 29) / 57);
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public final void method1693(int arg0) {
        if (arg0 <= 28) {
            field3933 = null;
        }
        field3949++;
        if (this.field3935 != null) {
            for (int var2 = 0; var2 < this.field3935.length; var2++) {
                this.field3935[var2] = class220.method1495(this.field3935[var2], 32768);
            }
        }
        if (this.field3943 != null) {
            for (int var3 = 0; var3 < this.field3943.length; var3++) {
                this.field3943[var3] = class220.method1495(this.field3943[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V")
    public static void method1694(int arg0) {
        field3933 = null;
        field3937 = null;
        field3931 = null;
        field3946 = null;
        field3947 = null;
        field3938 = null;
        field3950 = null;
        if (arg0 > -77) {
            method1694(25);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(CI)I")
    public final int method1695(char arg0, int arg1) {
        field3934++;
        if (this.field3943 == null) {
            return -1;
        }
        if (arg1 >= -114) {
            this.method1691(19, -118, (class221) null);
        }
        for (int var3 = 0; var3 < this.field3943.length; var3++) {
            if (this.field3939[var3] == arg0) {
                return this.field3943[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZBI)I")
    public static final int method1696(int arg0, boolean arg1, byte arg2, int arg3) {
        field3942++;
        class239 var4 = (class239) class214.field3502.method1400((long) arg3, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg2 >= -91) {
            method1692(-5, (byte) -57, -111, (class207) null, -15, 127, -75);
        }
        for (int var6 = 0; var6 < var4.field3880.length; var6++) {
            if (var4.field3880[var6] >= 0 && var4.field3880[var6] < class136.field2254) {
                class12 var7 = class83.method595(var4.field3880[var6], -120);
                if (var7.field182 != null) {
                    class10 var8 = (class10) var7.field182.method1400((long) arg0, true);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field3879[var6] * var8.field143;
                        } else {
                            var5 += var8.field143;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(CI)I")
    public final int method1697(char arg0, int arg1) {
        field3932++;
        if (this.field3935 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field3935.length; var3++) {
            if (this.field3941[var3] == arg0) {
                return this.field3935[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Log;I)V")
    public final void method1698(class221 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1517((byte) -96);
            if (var3 == 0) {
                if (arg1 != -4159) {
                    return;
                }
                field3948++;
                return;
            }
            this.method1691(0, var3, arg0);
        }
    }
}
