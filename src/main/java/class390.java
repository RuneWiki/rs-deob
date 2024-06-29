import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class390 extends class467 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Z")
    public static boolean field5913 = true;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "J")
    public static long field5919;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "[I")
    public static int[] field5918;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "F")
    public static float field5917;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field5910;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public int field5915;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
    public int[] field5908;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    public int[] field5912;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
    public int[] field5914;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lhh;")
    public class125[] field5909;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[Lhh;")
    public class125[] field5911;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[[[B")
    public byte[][][] field5920;

    static {
        new class375("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5919 = 0L;
        field5918 = new int[13];
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 8)
    public static void method2403(byte arg0) {
        if (arg0 >= -98) {
            method2403((byte) 6);
        }
        field5918 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lci;", line = 19)
    public static final class479 method2404(int arg0, int arg1) {
        field5916++;
        class479 var2 = (class479) class193.field2736.method2211((long) arg0, -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class501.field7486.method2650(0, -21, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class479 var4 = class403.method2474(var3, (byte) -49);
        class193.field2736.method2216(var4, (long) arg0, -25431);
        if (arg1 != 13696) {
            field5917 = -0.6194275F;
        }
        return var4;
    }
}
