import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class224 extends class126 {

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    private int field2833 = 0;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "Lida;")
    public static class215 field2836 = new class215();

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "Lqo;")
    public static class21 field2837 = new class21();

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2834;
        class492[] var7 = class81.field863;
        if (arg3 != 2) {
            field2837 = null;
        }
        for (int var8 = 0; var7.length > var8; ++var8) {
            class492 var9 = var7[var8];
            if (var9 != null && var9.field7141 == 2) {
                class73.method464(var9.field7138, arg6, arg5 >> 1, var9.field7139, var9.field7140 * 2, arg4 >> 1, arg1, (byte) 67, var9.field7144);
                if (class377.field4913[0] > -1 && class469.field6549 % 20 < 10) {
                    class2.field20[var9.field7135].method2612(arg2 - -class377.field4913[0] + -12, arg0 + -28 - -class377.field4913[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Ljo;Lwo;)V")
    public class224(class303 arg0, class677 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)V")
    public static void method1315(int arg0) {
        if (arg0 != 0) {
            field2836 = null;
        }
        field2836 = null;
        field2837 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)V")
    public final void method725(boolean arg0, int arg1) {
        ++field2835;
        int var3 = super.field1431.field1366.method1281((byte) -109, class466.field6460, super.field1427.method418()) + super.field1431.field1369;
        if (arg1 == -2536) {
            int var4 = super.field1431.field1367.method1586(class137.field1567, super.field1427.method408(), (byte) 125) + super.field1431.field1362;
            super.field1427.method2609((float) (var3 - -(super.field1427.method418() / 2)), (float) (var4 + super.field1427.method408() / 2), 4096, this.field2833);
            this.field2833 += ((class677) super.field1431).field9590;
        }
    }
}
