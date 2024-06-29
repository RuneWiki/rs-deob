import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class79 extends class116 {

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[Leg;")
    public class242[] field1302;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field1298 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lda;")
    public static class275 field1301 = class255.method1672(127, "");

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "[I")
    public static int[] field1303 = new int[25];

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lda;")
    public static class275 field1297 = class255.method1672(126, "null");

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Lda;")
    public static class275 field1299 = field1301;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lda;")
    public static class275 field1296 = field1301;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lda;")
    public static class275 field1305 = class255.method1672(111, ")1a2)1m");

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public static void method513(int arg0) {
        field1305 = null;
        field1296 = null;
        field1303 = null;
        field1297 = null;
        field1301 = null;
        field1299 = null;
        if (arg0 != -16) {
            field1299 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lma;Lma;IZ)V")
    public class79(class105 arg0, class105 arg1, int arg2, boolean arg3) {
        class84 var5 = new class84();
        int var6 = arg0.method779((byte) -57, arg2);
        this.field1302 = new class242[var6];
        int[] var7 = arg0.method761(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method775(arg2, var7[var8], -24799);
            class6 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class6 var12 = (class6) var5.method550(-75); var12 != null; var12 = (class6) var5.method545(104)) {
                if (var12.field76 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method780((byte) 109, 0, var11);
                } else {
                    var13 = arg1.method780((byte) -126, var11, 0);
                }
                var10 = new class6(var11, var13);
                var5.method547(104, var10);
            }
            this.field1302[var7[var8]] = new class242(var9, var10);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
    public final boolean method514(int arg0, int arg1) {
        field1304++;
        if (arg0 != 0) {
            method513(79);
        }
        return this.field1302[arg1].field4236;
    }
}
