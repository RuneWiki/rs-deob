import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class346 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field5163 = new int[32];

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method2251(int arg0) {
        field5163 = null;
        if (arg0 != 6888) {
            method2251(-66);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Luk;B)Luk;")
    public abstract class239 method2252(class239 arg0, byte arg1);

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5163[var1] = var0 - 1;
            var0 += var0;
        }
        field5164 = 0;
    }
}
