import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class300 {

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[B")
    public byte[] field4701;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[I")
    public int[] field4690;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[I")
    public int[] field4698;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field4693;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
    public static boolean field4691 = true;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[S")
    public static short[] field4695 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
    public static int[] field4689;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Z", line = 18)
    public final boolean method2045(int arg0, int arg1) {
        if (arg1 != 31883) {
            this.field4693 = (String[]) null;
        }
        field4700++;
        return (this.field4701[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZIIIIZ)V", line = 32)
    public static final void method2046(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 > arg3) {
            int var7 = (arg3 + arg4) / 2;
            class341 var8 = class119.field1825[var7];
            int var9 = arg3;
            class119.field1825[var7] = class119.field1825[arg4];
            class119.field1825[arg4] = var8;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (class251.method1739(arg0, arg1, class119.field1825[var10], arg6, arg2, var8, (byte) -64) <= 0) {
                    class341 var11 = class119.field1825[var10];
                    class119.field1825[var10] = class119.field1825[var9];
                    class119.field1825[var9++] = var11;
                }
            }
            class119.field1825[arg4] = class119.field1825[var9];
            class119.field1825[var9] = var8;
            method2046(arg0, arg1, arg2, arg3, var9 - 1, arg5, arg6);
            method2046(arg0, arg1, arg2, var9 + 1, arg4, -339, arg6);
        }
        field4697++;
        if (arg5 != -339) {
            method2049(71, -127);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)I", line = 75)
    public final int method2047(int arg0, byte arg1) {
        if (arg1 != -121) {
            this.field4690 = (int[]) null;
        }
        field4702++;
        return this.field4701[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 87)
    public static void method2048(int arg0) {
        field4695 = null;
        field4689 = null;
        if (arg0 != 9171) {
            method2052(-2, -119, 16, -7);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)V", line = 112)
    public static final void method2049(int arg0, int arg1) {
        field4685++;
        if (arg0 == -4204) {
            class338 var2 = class195.method1391(2, (byte) -92, arg1);
            var2.method2347(true);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(IB)Z", line = 125)
    public final boolean method2050(int arg0, byte arg1) {
        field4688++;
        if (arg1 != 42) {
            field4687 = 8;
        }
        return (this.field4701[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Z", line = 138)
    public final boolean method2051(byte arg0, int arg1) {
        if (arg0 >= -20) {
            field4695 = (short[]) null;
        }
        field4699++;
        return (this.field4701[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)I", line = 150)
    public static final int method2052(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4694++;
        if (arg2 != -1) {
            return 44;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V", line = 172)
    public class300(int arg0) {
        this.field4696 = arg0;
        this.field4701 = new byte[this.field4696];
        this.field4690 = new int[this.field4696];
        this.field4698 = new int[this.field4696];
        this.field4693 = new String[this.field4696];
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(CI)Z", line = 186)
    public static final boolean method2053(char arg0, int arg1) {
        field4684++;
        int var2 = 4 / ((56 - arg1) / 59);
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }
}
