import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class160 extends class86 {

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[Lpg;")
    public class202[] field2386;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[I")
    public static int[] field2381 = new int[1000];

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2385 = -1;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lpe;")
    public static class100 field2379 = class258.method1797((byte) 109);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "[I")
    public static int[] field2387 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!e", name = "x", descriptor = "F")
    public static float field2383;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IB)V", line = 5)
    public static final void method1148(int arg0, byte arg1) {
        field2380++;
        if (arg1 < 105) {
            field2383 = -1.0660409F;
        }
        class147 var2 = class92.method731(-29125, arg0, 2);
        var2.method1099(-81);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)Z", line = 19)
    public final boolean method1149(int arg0, boolean arg1) {
        if (!arg1) {
            method1148(-101, (byte) 118);
        }
        field2384++;
        return this.field2386[arg0].field3208;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Z", line = 40)
    public final boolean method1150(int arg0, int arg1) {
        field2382++;
        return arg0 == 2 ? this.field2386[arg1].field3209 : false;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V", line = 56)
    public static void method1151(byte arg0) {
        field2387 = null;
        field2379 = null;
        field2381 = null;
        int var1 = -47 / ((-arg0 - 16) / 62);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Llb;Llb;IZ)V", line = 75)
    public class160(class211 arg0, class211 arg1, int arg2, boolean arg3) {
        class128 var5 = new class128();
        int var6 = arg0.method1523(9271, arg2);
        this.field2386 = new class202[var6];
        int[] var7 = arg0.method1508(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1507(var7[var8], (byte) 92, arg2);
            class112 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class112 var12 = (class112) var5.method986(false); var12 != null; var12 = (class112) var5.method982(14877)) {
                if (var12.field1763 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1504(0, var11, 0);
                } else {
                    var13 = arg1.method1504(var11, 0, 0);
                }
                var10 = new class112(var11, var13);
                var5.method977(4, var10);
            }
            this.field2386[var7[var8]] = new class202(var9, var10);
        }
    }
}
