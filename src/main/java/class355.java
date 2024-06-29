import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class355 {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    private int[] field4777;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4774 = new BigInteger("b4f39e1b3c4d34abaca0b1771ce88db6bb88be4c31da26bdfad5ecc85e1deff5088ac7ce6cf768a7b123322223e740cd833376e4bb8f78021ff8271542ec220d78e1fead53541924d77d02dc461d073f46d8970d6c1c903e146dc60b2f38a53240ff2ad64092e9562cb138a919e9f2044dcb79382afe492386206b88208af03387a581d134073bd98e52a24f013805ef2380595b045a44f7b555d57028bcf656c06615b9e8cf79efb92f9dadbb50a48f030ac99d89ae3d7fa50ba3d3f7e195012aa6042b6e049a56ba6ad3cc5179af9e0973dd7bdbce1faac67153bd76747896ae1d02ade0dd19093780f9c6f12d77127fa28bc9bc5202528a110339a898bb660bca91b54084e999f5a9fe561afa68e98f19a8fef6c479086ebb71bff30e844b86854443debae2bea98341b804c8ef00fa69b351b60a997b2678e5a4182c8e1c6ca65e6bfd43dc6db752df99bd3c9d28e40f8841e2d89d7b2c825bce45b8e9b96c1cf7c33ea652b50998a5da497da91f1d6d2894dfed6713f4dff69246ec22c94907f049bb7916c893725e022362b856b0e7b96484394fce05df25111cb00d46dbf592ea9980f7a1763b3a2182b72312e20b2d3de5200698bba3fb2cbe17c89eba1c1fcf976893d3379fafa0cc9ed47f6421d7dafcba416bc234aafe46502e4369675ad0ce523d4140b635e736d9e3377dd22e557a69b34729bb931b547737dd", 16);

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lkf;")
    public static class287 field4776 = new class287();

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I", line = 5)
    public final int method2094(int arg0, int arg1) {
        field4773++;
        int var3 = (this.field4777.length >> 1) - 1;
        if (arg0 != -28135) {
            return -90;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field4777[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4777[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 36)
    public static void method2095(int arg0) {
        field4776 = null;
        if (arg0 <= 78) {
            field4774 = null;
        }
        field4774 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CB)C", line = 47)
    public static final char method2096(char arg0, byte arg1) {
        field4772++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            if (arg1 > -108) {
                method2096((char) 65411, (byte) 8);
            }
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 81)
    public static final void method2097(byte arg0) {
        field4775++;
        class5 var1 = null;
        try {
            var1 = class464.method2679("2", 5000);
            int var2 = -54 / ((arg0 + 19) / 35);
            class115 var3 = new class115(class638.field9019 * 6 + 3);
            var3.method658(1, (byte) 55);
            var3.method645(-672168216, class638.field9019);
            for (int var4 = 0; var4 < class371.field5066.length; var4++) {
                if (class588.field8319[var4]) {
                    var3.method645(-672168216, var4);
                    var3.method660((byte) 53, class371.field5066[var4]);
                }
            }
            var1.method38(31, var3.field1218, 0, var3.field1269);
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method37(-1);
            }
        } catch (Exception var5) {
        }
        class415.field5562 = class557.method3157(-108);
        class537.field7555 = false;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I)V", line = 129)
    public class355(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4777 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4777[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4777[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4777[var5 + var5] = arg0[var4];
            this.field4777[var5 + var5 + 1] = var4++;
        }
    }
}
