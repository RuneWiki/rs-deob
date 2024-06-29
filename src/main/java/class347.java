import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class347 {

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Lgm;")
    private class95 field5299;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Lwo;")
    private class303 field5292;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "Lml;")
    private class24 field5297;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
    public static boolean field5294 = false;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Lre;")
    private class446 field5301;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "[Lnh;")
    private class478[] field5298;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 3)
    public final void method2138(int arg0) {
        field5295++;
        if (arg0 < 95) {
            this.method2140(false, (class302) null, -114, (class302) null, -90);
        }
        if (this.field5298 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5298.length; var2++) {
            if (this.field5298[var2] != null) {
                this.field5298[var2].method2802((byte) 48);
            }
        }
        for (int var3 = 0; var3 < this.field5298.length; var3++) {
            if (this.field5298[var3] != null) {
                this.field5298[var3].method2809(96);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I", line = 43)
    public static int method2139(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLce;ILce;I)Lnh;", line = 60)
    private final class478 method2140(boolean arg0, class302 arg1, int arg2, class302 arg3, int arg4) {
        field5296++;
        if (this.field5301 == null) {
            throw new RuntimeException();
        }
        this.field5301.field6315 = arg2 * arg4 + 5;
        if (this.field5301.field6316.length <= this.field5301.field6315) {
            throw new RuntimeException();
        } else if (this.field5298[arg4] == null) {
            int var6 = this.field5301.method2604(35);
            int var7 = this.field5301.method2604(-125);
            class478 var8 = new class478(arg4, arg3, arg1, this.field5299, this.field5292, var6, var7, arg0);
            this.field5298[arg4] = var8;
            return var8;
        } else {
            return this.field5298[arg4];
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBIZIIIFI)[[I", line = 96)
    public static final int[][] method2141(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7, int arg8) {
        field5290++;
        int[][] var9 = new int[arg5][arg0];
        class105 var10 = new class105();
        var10.field1473 = arg2;
        var10.field1459 = arg4;
        var10.field1474 = arg8;
        var10.field1465 = arg3;
        var10.field1462 = (int) (arg7 * 4096.0F);
        var10.method653(true);
        class12.method123(arg5, (byte) -127, arg0);
        if (arg1 > -35) {
            method2141(98, (byte) -78, -4, true, 35, 110, -81, -1.7328128F, 64);
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            var10.method780(7, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 129)
    public static final void method2142(byte arg0) {
        class103.method778(class337.field5038.field3951, true);
        field5300++;
        int var1 = (class68.field922 >> 3) + (class68.field920 >> 10);
        class486.field6836 = class472.field6622.field4545 = 0;
        int var2 = (class468.field6588 >> 3) + (class200.field3027 >> 10);
        int var3 = 103 % ((60 - arg0) / 63);
        class472.field6622.method1700(8, 27348, 8);
        byte var4 = 18;
        class81.field1139 = new int[var4];
        client.field6674 = new byte[var4][];
        class184.field2792 = new int[var4];
        client.field6672 = new int[var4][4];
        class145.field2052 = new int[var4];
        class340.field5098 = new int[var4];
        class105.field1477 = new byte[var4][];
        class298.field4462 = new int[var4];
        class124.field1707 = new int[var4];
        class408.field5915 = new byte[var4][];
        class485.field6820 = new byte[var4][];
        class209.field3151 = new byte[var4][];
        int var5 = 0;
        for (int var6 = (var1 - (class379.field5642 >> 4)) / 8; var6 <= ((class379.field5642 >> 4) + var1) / 8; var6++) {
            for (int var8 = (var2 - (class456.field6477 >> 4)) / 8; var8 <= (((class456.field6477 >> 4) + var2) / 8); var8++) {
                int var9 = (var6 << 8) + var8;
                class145.field2052[var5] = var9;
                class184.field2792[var5] = class170.field2421.method2676("m" + var6 + "_" + var8, (byte) -81);
                class124.field1707[var5] = class170.field2421.method2676("l" + var6 + "_" + var8, (byte) -58);
                class340.field5098[var5] = class170.field2421.method2676("n" + var6 + "_" + var8, (byte) -41);
                class81.field1139[var5] = class170.field2421.method2676("um" + var6 + "_" + var8, (byte) -113);
                class298.field4462[var5] = class170.field2421.method2676("ul" + var6 + "_" + var8, (byte) -43);
                if (class340.field5098[var5] == -1) {
                    class184.field2792[var5] = -1;
                    class124.field1707[var5] = -1;
                    class81.field1139[var5] = -1;
                    class298.field4462[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class340.field5098.length; var7++) {
            class340.field5098[var7] = -1;
            class184.field2792[var7] = -1;
            class124.field1707[var7] = -1;
            class81.field1139[var7] = -1;
            class298.field4462[var7] = -1;
        }
        class298.method1864(var1, var2, (byte) 45, false, true);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lgm;Lwo;)V", line = 208)
    public class347(class95 arg0, class303 arg1) {
        this.field5299 = arg0;
        this.field5292 = arg1;
        if (!this.field5299.method737(4)) {
            this.field5297 = this.field5299.method742(true, (byte) 0, 255, 255, true);
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Z", line = 221)
    public final boolean method2143(byte arg0) {
        field5293++;
        if (this.field5301 != null) {
            return true;
        }
        if (this.field5297 == null) {
            if (this.field5299.method737(4)) {
                return false;
            }
            this.field5297 = this.field5299.method742(true, (byte) 0, 255, 255, true);
        }
        if (this.field5297.field5386) {
            return false;
        } else {
            this.field5301 = new class446(this.field5297.method133(-1));
            this.field5298 = new class478[(this.field5301.field6316.length - 5) / 8];
            return arg0 >= 122;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lce;BILce;)Lnh;", line = 251)
    public final class478 method2144(class302 arg0, byte arg1, int arg2, class302 arg3) {
        if (arg1 != 42) {
            this.method2138(118);
        }
        field5302++;
        return this.method2140(true, arg3, 8, arg0, arg2);
    }
}
