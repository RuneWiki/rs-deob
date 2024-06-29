import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class68 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Z")
    public static boolean field959 = true;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field962 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/String;")
    public static String field963 = "purple:";

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lnh;")
    public static class305 field958;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)I")
    public abstract int method384(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
    public static final void method449(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field965++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -1;
        int var8 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 + arg4);
        int var9 = -arg4;
        if (arg3 < 75) {
            return;
        }
        int var10 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 - arg4);
        class129.method822(class247.field3876[arg1], var10, -2426, arg2, var8);
        while (var6 > var5) {
            var7 += 2;
            var9 += var7;
            if (var9 > 0) {
                var6--;
                var9 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (class271.field4322 <= var12 && var11 <= class311.field5001) {
                    int var13 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 + var5);
                    int var14 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 - var5);
                    if (var12 <= class311.field5001) {
                        class129.method822(class247.field3876[var12], var14, -2426, arg2, var13);
                    }
                    if (class271.field4322 <= var11) {
                        class129.method822(class247.field3876[var11], var14, -2426, arg2, var13);
                    }
                }
            }
            var5++;
            int var15 = arg1 + var5;
            int var16 = arg1 - var5;
            if (class271.field4322 <= var15 && var16 <= class311.field5001) {
                int var17 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 + var6);
                int var18 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 - var6);
                if (class311.field5001 >= var15) {
                    class129.method822(class247.field3876[var15], var18, -2426, arg2, var17);
                }
                if (var16 >= class271.field4322) {
                    class129.method822(class247.field3876[var16], var18, -2426, arg2, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public abstract void method381(byte arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        if (arg0 == -13380) {
            field963 = null;
            field958 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)J")
    public abstract long method382(byte arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI)V")
    public static final void method451(int arg0, byte arg1, int arg2) {
        field961++;
        if (class311.method2104(105, arg2)) {
            class190.method1201(-1, class262.field4214[arg2], arg0);
            if (arg1 != -107) {
                field959 = false;
            }
        }
    }
}
