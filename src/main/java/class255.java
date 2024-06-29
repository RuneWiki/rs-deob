import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class255 extends class443 {

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3715 = "green:";

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field3722 = 0;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "[I")
    public static int[] field3723;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "[Lci;")
    public class218[] field3717;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[Ll;")
    public static class315[] field3720;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "[[B")
    private byte[][] field3713;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public static void method1648(int arg0) {
        field3723 = null;
        field3720 = null;
        if (arg0 < 52) {
            field3720 = null;
        }
        field3715 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Z")
    public final boolean method1649(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1650(-35);
        }
        field3716++;
        return this.field3717[arg0].field3039;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z")
    public final boolean method1650(int arg0) {
        field3724++;
        if (this.field3717 != null) {
            return true;
        }
        if (this.field3713 == null) {
            if (!class269.field3990.method1200(this.field3721, 107)) {
                return false;
            }
            int[] var2 = class269.field3990.method1208(this.field3721, (byte) 109);
            this.field3713 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field3713[var3] = class269.field3990.method1235(this.field3721, false, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field3713.length; var5++) {
            byte[] var14 = this.field3713[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class24.field436.method1205((byte) -48, var15);
        }
        if (!var4) {
            return false;
        }
        class242 var6 = new class242();
        int var7 = class269.field3990.method1225(this.field3721, (byte) 27);
        this.field3717 = new class218[var7];
        int[] var8 = class269.field3990.method1208(this.field3721, (byte) 122);
        for (int var9 = arg0; var9 < var8.length; var9++) {
            byte[] var10 = this.field3713[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class328 var12 = null;
            for (class328 var13 = (class328) var6.method1575(0); var13 != null; var13 = (class328) var6.method1573((byte) -128)) {
                if (var13.field4845 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class328(var11, class24.field436.method1234(var11, (byte) 76));
                var6.method1560(-104, var12);
            }
            this.field3717[var8[var9]] = new class218(var10, var12);
        }
        this.field3713 = null;
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)Z")
    public final boolean method1651(int arg0, int arg1) {
        field3714++;
        if (arg1 != -26945) {
            this.field3713 = null;
        }
        return this.field3717[arg0].field3048;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
    public class255(int arg0) {
        this.field3721 = arg0;
    }
}
