import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class103 {

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Lqw;")
    private class387 field1416;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "Lth;")
    private class290 field1422;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1417;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1415;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "Lch;")
    private class39 field1414;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1412 = 1;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Lfn;")
    public static class233 field1419;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "Ldc;")
    private class63 field1406;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[Lrt;")
    private class489[] field1418;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZILkv;Lkv;)Lrt;")
    private final class489 method680(int arg0, boolean arg1, int arg2, class684 arg3, class684 arg4) {
        field1407++;
        int var6 = -25 / ((arg2 + 44) / 32);
        if (this.field1406 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field1418.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field1418[arg0] == null) {
            this.field1406.field956 = arg0 * 72 + 6;
            int var7 = this.field1406.method457(-14532);
            int var8 = this.field1406.method457(-14532);
            byte[] var9 = new byte[64];
            this.field1406.method449(0, 64, var9, (byte) -112);
            class489 var10 = new class489(arg0, arg4, arg3, this.field1422, this.field1416, var7, var9, var8, arg1);
            this.field1418[arg0] = var10;
            return var10;
        } else {
            return this.field1418[arg0];
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILkv;ILkv;)Lrt;")
    public final class489 method681(int arg0, class684 arg1, int arg2, class684 arg3) {
        field1420++;
        if (arg2 != 9108) {
            this.method686(true);
        }
        return this.method680(arg0, true, -92, arg1, arg3);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
    public static final boolean method682(int arg0, int arg1, int arg2) {
        field1411++;
        if (arg0 >= -25) {
            field1419 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BLmfa;I)V")
    public static final void method683(byte arg0, class409 arg1, int arg2) {
        class385.field5530 = 0;
        field1408++;
        class537.field7445 = false;
        class240.method1617(-1, arg1);
        class616.method3488((byte) 97, arg1);
        if (class537.field7445) {
            System.out.println("---endgpp---");
        }
        int var3 = -60 % ((arg0 - 39) / 58);
        if (arg1.field956 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field956 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        if (arg0 != 6) {
            method684(-88);
        }
        field1419 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z")
    public final boolean method685(byte arg0) {
        field1421++;
        if (this.field1406 != null) {
            return true;
        }
        if (this.field1414 == null) {
            if (this.field1422.method1929(13585)) {
                return false;
            }
            this.field1414 = this.field1422.method1924(255, true, 255, (byte) 0, (byte) -101);
        }
        if (this.field1414.field9191) {
            return false;
        }
        class63 var2 = new class63(this.field1414.method214((byte) -90));
        var2.field956 = 5;
        if (arg0 != 95) {
            field1412 = -94;
        }
        int var3 = var2.method505((byte) -119);
        var2.field956 += var3 * 72;
        byte[] var4 = new byte[var2.field954.length - var2.field956];
        var2.method449(0, var4.length, var4, (byte) -126);
        byte[] var7;
        if (this.field1417 == null || this.field1415 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field1417, this.field1415);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class383.method2407((byte) -113, 5, var2.field954, var2.field956 - var4.length - 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field1418 = new class489[var3];
        this.field1406 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public final void method686(boolean arg0) {
        field1413++;
        if (this.field1418 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1418.length; var2++) {
            if (this.field1418[var2] != null) {
                this.field1418[var2].method2969(111);
            }
        }
        for (int var3 = 0; var3 < this.field1418.length; var3++) {
            if (this.field1418[var3] != null) {
                this.field1418[var3].method2967(-1);
            }
        }
        if (arg0) {
            field1412 = -11;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lth;Lqw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class103(class290 arg0, class387 arg1, BigInteger arg2, BigInteger arg3) {
        this.field1416 = arg1;
        this.field1422 = arg0;
        this.field1417 = arg2;
        this.field1415 = arg3;
        if (!this.field1422.method1929(13585)) {
            this.field1414 = this.field1422.method1924(255, true, 255, (byte) 0, (byte) -109);
        }
    }
}
