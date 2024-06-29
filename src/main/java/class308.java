import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class308 extends class431 {

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4641 = new String[100];

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Lob;")
    public static class521 field4640 = new class521(40, 16);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Z")
    public static boolean field4644 = false;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field4648 = 50;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "[I")
    public static int[] field4651 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[I")
    public static int[] field4645 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
    public static int[] field4647 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "J")
    public static long field4652 = -1L;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
    public static int[] field4642 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "[I")
    public static int[] field4650 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "[I")
    public static int[] field4646 = new int[field4648];

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4649 = new String[field4648];

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[Llq;")
    public static class389[] field4643;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)Lkk;", line = 3)
    public static final class129 method1973(int arg0, int arg1, int arg2, int arg3) {
        field4639++;
        class138 var4 = client.field3311[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class129 var5 = null;
        int var6 = -1;
        if (arg3 != 100) {
            field4640 = null;
        }
        for (class327 var7 = var4.field2118; var7 != null; var7 = var7.field4922) {
            class389 var8 = var7.field4921;
            if (var8 instanceof class129) {
                class129 var9 = (class129) var8;
                int var10 = (var9.method953(arg3 - 177) - 1) * 64 + 60;
                int var11 = var9.field5837 - var10 >> 7;
                int var12 = var9.field5833 - var10 >> 7;
                int var13 = var9.field5837 + var10 >> 7;
                int var14 = var9.field5833 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg0 && var13 >= arg1 && var14 >= arg0) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 68)
    public static void method1974(int arg0) {
        field4642 = null;
        field4645 = null;
        field4643 = null;
        field4641 = null;
        field4647 = null;
        field4649 = null;
        field4651 = null;
        if (arg0 != 100) {
            field4641 = null;
        }
        field4646 = null;
        field4640 = null;
        field4650 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 86)
    public class308() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V", line = 88)
    public class308(int arg0) {
        this.field4638 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZBIZI)Lul;", line = 96)
    public static final class406 method1975(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field4637++;
        class196 var5 = null;
        if (class494.field7130 != null) {
            var5 = new class196(arg4, class494.field7130, class467.field6758[arg4], 1000000);
        }
        class468.field6770[arg4] = class378.field5707.method690(var5, arg4, (byte) -120, class477.field6882);
        if (arg1 != 122) {
            field4651 = null;
        }
        if (arg0) {
            class468.field6770[arg4].method3121(100);
        }
        return new class406(class468.field6770[arg4], arg3, arg2);
    }
}
