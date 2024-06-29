import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class305 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lec;")
    private class129 field4218 = new class129(256);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lec;")
    private class129 field4219 = new class129(256);

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Lnq;")
    private class268 field4216;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lnq;")
    private class268 field4204;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4207 = -1;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "F")
    public static float field4209 = 0.0F;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[Lsg;")
    public static class226[] field4210;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lkr;II)Lem;", line = 3)
    public static final class123 method1964(class447 arg0, int arg1, int arg2) {
        field4214++;
        class123 var3;
        if (class183.field2498 == null) {
            var3 = new class123();
        } else {
            var3 = class183.field2498;
            class183.field2498 = class183.field2498.field1711;
            var3.field1711 = null;
            class69.field1022--;
        }
        if (arg1 != 1073745919) {
            field4208 = 39;
        }
        var3.field1709 = arg0;
        var3.field1708 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[IB)Lvj;", line = 27)
    private final class256 method1965(int arg0, int arg1, int[] arg2, byte arg3) {
        field4215++;
        int var5 = ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class256 var9 = (class256) this.field4219.method886(var7, 25651);
        if (var9 != null) {
            return var9;
        }
        int var10 = -80 % ((arg3 - 66) / 35);
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class4 var11 = (class4) this.field4218.method886(var7, 25651);
        if (var11 == null) {
            var11 = class4.method22(this.field4216, arg1, arg0);
            if (var11 == null) {
                return null;
            }
            this.field4218.method883((byte) -54, var7, var11);
        }
        class256 var12 = var11.method20(arg2);
        if (var12 == null) {
            return null;
        } else {
            var11.method2467((byte) 106);
            this.field4219.method883((byte) -54, var7, var12);
            return var12;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V", line = 69)
    public static final void method1966(int arg0, int arg1) {
        class378.field5404 = arg1;
        field4206++;
        class131 var2 = class158.field2222;
        synchronized (class158.field2222) {
            if (arg0 < 66) {
                field4213 = -79;
            }
            class158.field2222.method905((byte) 30);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[B", line = 83)
    public static final byte[] method1967(int arg0, int arg1) {
        field4212++;
        class450 var2 = (class450) class39.field562.method2637((long) arg1, 18620);
        if (arg0 >= -6) {
            method1964((class447) null, -47, 86);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class26.method299(var7, (byte) -17, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class450(var3);
            class39.field562.method2633((byte) -120, var2, (long) arg1);
        }
        return var2.field6296;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[II)Lvj;", line = 136)
    public final class256 method1968(int arg0, int[] arg1, int arg2) {
        field4211++;
        if (this.field4204.method1742(arg2) == 1) {
            return this.method1970(0, (byte) 6, arg0, arg1);
        } else if (this.field4204.method1739(126, arg0) == 1) {
            return this.method1970(arg0, (byte) 6, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 157)
    public static void method1969(int arg0) {
        if (arg0 < 58) {
            method1966(106, 85);
        }
        field4210 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI[I)Lvj;", line = 184)
    private final class256 method1970(int arg0, byte arg1, int arg2, int[] arg3) {
        field4217++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class256 var9 = (class256) this.field4219.method886(var7, 25651);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class330 var10 = class330.method2128(this.field4204, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            if (arg1 != 6) {
                this.field4204 = null;
            }
            class256 var11 = var10.method2131();
            this.field4219.method883((byte) -54, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3590.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I[II)Lvj;", line = 229)
    public final class256 method1971(int arg0, int[] arg1, int arg2) {
        field4205++;
        if (this.field4216.method1742(-1) == 1) {
            return this.method1965(arg2, 0, arg1, (byte) -14);
        } else if (this.field4216.method1739(108, arg2) == 1) {
            return this.method1965(0, arg2, arg1, (byte) -117);
        } else {
            if (arg0 < 100) {
                field4213 = -80;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lnq;Lnq;)V", line = 258)
    public class305(class268 arg0, class268 arg1) {
        this.field4216 = arg1;
        this.field4204 = arg0;
    }
}
