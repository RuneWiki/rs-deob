import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class363 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lfc;")
    private class174 field5185 = new class174(64);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Loi;")
    private class53 field5193;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
    public static boolean field5189 = false;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lam;")
    public static class455 field5190 = new class455();

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Ldv;")
    public static class477 field5198 = new class477();

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5200 = new String[200];

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Loi;")
    public static class53 field5188;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 5)
    public final void method2138(int arg0) {
        field5194++;
        class174 var2 = this.field5185;
        synchronized (this.field5185) {
            if (arg0 != 160) {
                field5199 = -120;
            }
            this.field5185.method1096((byte) 115);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 21)
    public final void method2139(byte arg0) {
        field5197++;
        class174 var2 = this.field5185;
        synchronized (this.field5185) {
            if (arg0 < 12) {
                method2141(-87, null);
            }
            this.field5185.method1095(0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)Z", line = 41)
    public static final boolean method2140(char arg0, int arg1) {
        field5186++;
        int var2 = -121 / ((arg1 - 28) / 60);
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjg;)V", line = 62)
    public static final void method2141(int arg0, class228 arg1) {
        field5187++;
        int var2 = arg1.field3319 - class390.field5481;
        int var3 = arg1.field3304 * 128 + (arg1.method125((byte) -80) * 64);
        int var4 = arg1.field3351 * 128 + arg1.method125((byte) -92) * 64;
        if (arg0 != -10578) {
            return;
        }
        arg1.field1899 += (var4 - arg1.field1899) / var2;
        arg1.field3377 = 0;
        arg1.field1896 += (var3 - arg1.field1896) / var2;
        if (arg1.field3305 == 0) {
            arg1.method1400(8192, true);
        }
        if (arg1.field3305 == 1) {
            arg1.method1400(12288, true);
        }
        if (arg1.field3305 == 2) {
            arg1.method1400(0, true);
        }
        if (arg1.field3305 == 3) {
            arg1.method1400(4096, true);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([BI)Z", line = 100)
    public static final boolean method2142(byte[] arg0, int arg1) {
        field5195++;
        class403 var2 = new class403(arg0);
        int var3 = var2.method2357((byte) 105);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = arg1 == var2.method2357((byte) 127);
        if (var4) {
            class35.method199((byte) 118, var2);
        }
        class108.method742(arg1 ^ 0x38, var2);
        return true;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Lji;", line = 124)
    public final class442 method2143(int arg0, byte arg1) {
        int var3 = 62 % ((arg1 + 6) / 49);
        field5196++;
        class174 var4 = this.field5185;
        class442 var5;
        synchronized (this.field5185) {
            var5 = (class442) this.field5185.method1088((long) arg0, (byte) 27);
        }
        if (var5 != null) {
            return var5;
        }
        class53 var6 = this.field5193;
        byte[] var7;
        synchronized (this.field5193) {
            var7 = this.field5193.method426(31, (byte) 9, arg0);
        }
        class442 var8 = new class442();
        if (var7 != null) {
            var8.method2590(new class403(var7), 26936);
        }
        class174 var9 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method1097(19627, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 154)
    public final void method2144(int arg0, int arg1) {
        field5192++;
        class174 var3 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method1087(1, arg0);
            if (arg1 < 9) {
                field5189 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 167)
    public static void method2145(boolean arg0) {
        field5190 = null;
        field5200 = null;
        field5198 = null;
        field5188 = null;
        if (arg0) {
            method2140((char) 65488, 43);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 185)
    public class363(class205 arg0, int arg1, class53 arg2) {
        this.field5193 = arg2;
        this.field5193.method435(31, 0);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 203)
    public static final void method2146(byte arg0) {
        field5191++;
        class100.field1337 = new class455();
        if (arg0 < 123) {
            field5198 = null;
        }
    }
}
