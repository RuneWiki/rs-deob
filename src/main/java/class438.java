import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class438 {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "S")
    public short field5830;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "B")
    public byte field5837;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field5841;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public int field5842;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field5839;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
    public boolean field5832;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "S")
    public short field5829;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "S")
    public short field5831;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lvea;")
    public static class277 field5836;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field5834;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public static final void method2492(int arg0, int arg1, int arg2) {
        boolean var3 = class197.field2689[0][arg1][arg2] != null && class197.field2689[0][arg1][arg2].field282 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class197.field2689[var4][arg1][arg2] == null) {
                class14 var5 = class197.field2689[var4][arg1][arg2] = new class14(var4);
                if (var3) {
                    var5.field288++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 == -9336) {
            field5834 = null;
            field5836 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIZLha;)Lda;")
    public static final class61 method2494(int arg0, int arg1, boolean arg2, class60 arg3) {
        field5833++;
        int var4 = -46 % ((arg1 - 76) / 49);
        class270 var5 = class690.method3871((byte) -38, arg0, arg2, arg3);
        return var5 == null ? null : var5.field3397;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5838 = arg11;
        this.field5830 = (short) arg4;
        this.field5837 = (byte) arg8;
        this.field5840 = arg1;
        this.field5841 = arg3;
        this.field5842 = arg0;
        this.field5839 = arg2;
        this.field5832 = arg10;
        this.field5829 = (short) arg5;
        this.field5831 = (short) arg6;
    }
}
