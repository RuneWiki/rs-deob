import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class213 extends class333 {

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lsb;")
    public static class305 field2589 = new class305(65, 7);

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Z")
    public static boolean field2597 = false;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Z")
    public static boolean field2600 = false;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "J")
    public static long field2596;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lwp;")
    public class452 field2592;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lwp;")
    public class452 field2593;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Ljava/lang/String;")
    public String field2599;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Z")
    public boolean field2590;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field2587;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 8)
    public static void method1261(int arg0) {
        field2589 = null;
        if (arg0 != -19616) {
            method1262(88, null);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILoh;)I", line = 18)
    public static final int method1262(int arg0, class600 arg1) {
        field2588++;
        class210 var2 = arg1.field8461;
        if (var2.field2492 != null) {
            var2 = var2.method1247((byte) 85, class628.field8859);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = -127 % ((arg0 - 31) / 43);
        int var4 = var2.field2487;
        class543 var5 = arg1.method3737((byte) 65);
        if (arg1.field9473) {
            var4 = var2.field2516;
        } else if (arg1.field9487 == var5.field7662 || arg1.field9487 == var5.field7641 || arg1.field9487 == var5.field7647 || arg1.field9487 == var5.field7680) {
            var4 = var2.field2495;
        } else if (arg1.field9487 == var5.field7663 || arg1.field9487 == var5.field7644 || arg1.field9487 == var5.field7642 || arg1.field9487 == var5.field7643) {
            var4 = var2.field2510;
        }
        return var4;
    }
}
