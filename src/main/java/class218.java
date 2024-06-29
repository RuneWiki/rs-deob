import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class218 {

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field3145 = 0;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Lhda;")
    public static class752 field3144 = new class752(42, 0);

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "Lli;")
    public static class433 field3147;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3143;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method1409(int arg0) {
        if (arg0 != 63) {
            field3145 = -79;
        }
        field3144 = null;
        field3147 = null;
        field3143 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[BII)Z")
    public static final boolean method1410(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field3146++;
        boolean var6 = true;
        class677 var7 = new class677(arg3);
        int var8 = 111 / ((-arg4 - 16) / 42);
        int var9 = -1;
        label56: while (true) {
            int var10 = var7.method3803(34);
            if (var10 == 0) {
                return var6;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                while (!var12) {
                    int var14 = var7.method3790((byte) 22);
                    if (var14 == 0) {
                        continue label56;
                    }
                    var11 += var14 - 1;
                    int var15 = var11 & 0x3F;
                    int var16 = (var11 & 0xFC0) >> 6;
                    int var17 = var7.method3821((byte) -34) >> 2;
                    int var18 = arg1 + var16;
                    int var19 = arg2 + var15;
                    if (var18 > 0 && var19 > 0 && var18 < (arg0 - 1) && var19 < arg5 - 1) {
                        class100 var20 = class462.field6333.method2008((byte) -29, var9);
                        if (var17 != 22 || class411.field5711.field3904.method1631(true) != 0 || var20.field1363 != 0 || var20.field1351 == 1 || var20.field1349) {
                            if (!var20.method747((byte) 127)) {
                                var6 = false;
                                class613.field8162++;
                            }
                            var12 = true;
                        }
                    }
                }
                int var13 = var7.method3790((byte) 22);
                if (var13 == 0) {
                    break;
                }
                var7.method3821((byte) 91);
            }
        }
    }
}
