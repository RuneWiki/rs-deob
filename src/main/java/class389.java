import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class389 extends class514 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lgl;")
    public class627 field5340;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lvl;")
    public static class15 field5343 = new class15(74, 6);

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field5347 = new String[200];

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lim;")
    public static class598 field5344 = new class598("game4", 3);

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
    public static int[] field5345;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lha;II)Lnf;")
    public static final class604 method2361(class66 arg0, int arg1, int arg2) {
        field5341++;
        if (arg1 != 200) {
            field5342 = 18;
        }
        class430 var3 = (class430) class524.field7128.method337((long) arg2, arg1 ^ 0xC9);
        if (var3 != null) {
            class68 var4 = var3.field5868.method708(-32624);
            var3.field5864 = true;
            if (var4 != null) {
                return var4.method616(arg0, 94);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method2362(int arg0) {
        field5344 = null;
        field5347 = null;
        if (arg0 == 3) {
            field5343 = null;
            field5345 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsf;II[B)V")
    public class389(class551 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5340 = arg0.method3154(class485.field6566, arg2, (byte) 69, arg1, arg3, false);
        this.field5340.method2679(false, false, -17383);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsf;II[I)V")
    public class389(class551 arg0, int arg1, int arg2, int[] arg3) {
        this.field5340 = arg0.method3139(false, arg2, false, arg1, arg3);
        this.field5340.method2679(false, false, -17383);
    }
}
