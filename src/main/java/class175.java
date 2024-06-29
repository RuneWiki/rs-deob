import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class175 extends class513 {

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[Ltga;")
    public static class257[] field2382 = new class257[2048];

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljf;")
    public static class640 field2381 = new class640(0, 4);

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lgca;")
    public static class209 field2386 = new class209(16);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field2389 = 0;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lfg;")
    public static class436 field2390;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[Lcw;")
    public static class21[] field2385;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[[B")
    public static byte[][] field2387;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 5)
    public static void method1100(byte arg0) {
        field2390 = null;
        field2381 = null;
        field2386 = null;
        if (arg0 == 82) {
            field2385 = null;
            field2387 = null;
            field2382 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 25)
    public static final void method1101(int arg0, int arg1, int arg2) {
        int var3 = 117 % ((86 - arg1) / 36);
        field2388++;
        class118 var4 = class126.method814(true, arg2, 12);
        var4.method771(-30559);
        var4.field1636 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V", line = 42)
    public class175(int arg0, int arg1) {
        this.field2383 = arg1;
        this.field2379 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Z", line = 53)
    public static final boolean method1102(int arg0, int arg1, int arg2) {
        field2380++;
        if (arg1 == 0) {
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB[B)[B", line = 68)
    public static final byte[] method1103(int arg0, int arg1, byte arg2, byte[] arg3) {
        field2384++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg3[arg1 + var5];
            }
        } else {
            var4 = arg3;
        }
        class383 var6 = new class383();
        if (arg2 < 3) {
            return null;
        }
        var6.method2341(-104);
        var6.method2340(var4, (long) (arg0 * 8), (byte) 116);
        byte[] var7 = new byte[64];
        var6.method2342(var7, 0, (byte) -16);
        return var7;
    }
}
