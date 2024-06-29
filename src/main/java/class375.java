import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class375 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "[I")
    public int[] field5274;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "[I")
    public int[] field5275;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lkr;")
    public static class602 field5273 = new class602(6, 4);

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5277 = -1;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 8)
    public static void method2353(int arg0) {
        field5273 = null;
        if (arg0 != -1988482175) {
            method2353(-14);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V", line = 21)
    public class375(int arg0) {
        this.field5276 = arg0;
        this.field5274 = new int[this.field5276];
        this.field5275 = new int[this.field5276];
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)I", line = 31)
    public static final int method2354(int arg0, byte arg1) {
        int var2 = 16 % ((-arg1 - 46) / 38);
        field5272++;
        int var3 = arg0 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg0 & ~var8;
    }
}
