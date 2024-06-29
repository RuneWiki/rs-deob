import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class103 {

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1235;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "Lkf;")
    private class215 field1241;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "Ljq;")
    private class443 field1238;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1232;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Lbm;")
    private class96 field1231;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "Lbg;")
    public static class400 field1237 = new class400(1);

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "F")
    public static float field1242;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "Lrt;")
    private class194 field1233;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "Loa;")
    public static class605 field1228;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "[Lpb;")
    private class571[] field1239;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZILls;Lls;I)Lpb;", line = 4)
    private final class571 method639(boolean arg0, int arg1, class121 arg2, class121 arg3, int arg4) {
        field1240++;
        if (this.field1233 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || this.field1239.length <= arg4) {
            throw new RuntimeException();
        } else if (this.field1239[arg4] == null) {
            this.field1233.field2610 = arg4 * 72 + 6;
            int var6 = this.field1233.method1178(-230315992);
            int var7 = this.field1233.method1178(-230315992);
            byte[] var8 = new byte[64];
            if (arg1 != 2174) {
                this.method640(null, 18, false, null);
            }
            this.field1233.method1200(var8, (byte) 33, 0, 64);
            class571 var9 = new class571(arg4, arg2, arg3, this.field1238, this.field1241, var6, var8, var7, arg0);
            this.field1239[arg4] = var9;
            return var9;
        } else {
            return this.field1239[arg4];
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lls;IZLls;)Lpb;", line = 49)
    public final class571 method640(class121 arg0, int arg1, boolean arg2, class121 arg3) {
        if (arg2) {
            this.method643(false);
        }
        field1236++;
        return this.method639(true, 2174, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V", line = 63)
    public static void method641(int arg0) {
        field1228 = null;
        field1237 = null;
        if (arg0 >= -88) {
            field1243 = 11;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V", line = 74)
    public final void method642(int arg0) {
        field1234++;
        if (this.field1239 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1239.length; var2++) {
            if (this.field1239[var2] != null) {
                this.field1239[var2].method3319((byte) 1);
            }
        }
        for (int var3 = arg0; var3 < this.field1239.length; var3++) {
            if (this.field1239[var3] != null) {
                this.field1239[var3].method3318(61);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)Z", line = 108)
    public final boolean method643(boolean arg0) {
        field1230++;
        if (this.field1233 != null) {
            return true;
        }
        if (this.field1231 == null) {
            if (this.field1238.method2773(103)) {
                return false;
            }
            this.field1231 = this.field1238.method2760(255, (byte) 0, 0, 255, true);
        }
        if (this.field1231.field9009) {
            return false;
        }
        class194 var2 = new class194(this.field1231.method603((byte) 118));
        var2.field2610 = 5;
        int var3 = var2.method1177(255);
        var2.field2610 += var3 * 72;
        byte[] var4 = new byte[var2.field2622.length - var2.field2610];
        var2.method1200(var4, (byte) -97, 0, var4.length);
        byte[] var7;
        if (this.field1235 == null || this.field1232 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field1235, this.field1232);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class408.method2585(var2.field2610 - var4.length - 5, var2.field2622, 5, 109);
        if (!arg0) {
            this.method643(false);
        }
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field1239 = new class571[var3];
        this.field1233 = var2;
        return true;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ljq;Lkf;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 190)
    public class103(class443 arg0, class215 arg1, BigInteger arg2, BigInteger arg3) {
        this.field1235 = arg2;
        this.field1241 = arg1;
        this.field1238 = arg0;
        this.field1232 = arg3;
        if (!this.field1238.method2773(91)) {
            this.field1231 = this.field1238.method2760(255, (byte) 0, 0, 255, true);
        }
    }
}
