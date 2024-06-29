import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class334 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4715 = null;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field4717;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[BI)Z", line = 3)
    public static final boolean method2132(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4714++;
        boolean var6 = true;
        class63 var7 = new class63(arg4);
        int var8 = -1;
        int var9 = 39 / ((arg0 + 16) / 54);
        label70: while (true) {
            int var10 = var7.method459(0);
            if (var10 == 0) {
                return var6;
            }
            var8 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                int var16;
                class220 var19;
                do {
                    int var17;
                    int var18;
                    do {
                        do {
                            do {
                                do {
                                    while (var12) {
                                        int var20 = var7.method478(-108);
                                        if (var20 == 0) {
                                            continue label70;
                                        }
                                        var7.method505((byte) -119);
                                    }
                                    int var13 = var7.method478(-126);
                                    if (var13 == 0) {
                                        continue label70;
                                    }
                                    var11 += var13 - 1;
                                    int var14 = var11 & 0x3F;
                                    int var15 = var11 >> 6 & 0x3F;
                                    var16 = var7.method505((byte) -119) >> 2;
                                    var17 = var15 + arg3;
                                    var18 = var14 + arg2;
                                } while (var17 <= 0);
                            } while (var18 <= 0);
                        } while (var17 >= (arg5 - 1));
                    } while (var18 >= arg1 - 1);
                    var19 = class20.field192.method716(6, var8);
                } while (var16 == 22 && class332.field4707.field4779.method1162(0) == 0 && var19.field2948 == 0 && var19.field2884 != 1 && !var19.field2904);
                if (!var19.method1288((byte) 76)) {
                    var6 = false;
                    class693.field9626++;
                }
                var12 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 94)
    public static void method2133(boolean arg0) {
        if (arg0) {
            method2133(true);
        }
        field4715 = null;
        field4717 = null;
    }
}
