import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class74 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    public static int[] field816 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field815 = 1;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[BI)Z", line = 4)
    public static final boolean method418(int arg0, int arg1, byte[] arg2, int arg3) {
        field817++;
        if (arg1 != 26482) {
            field815 = -21;
        }
        boolean var4 = true;
        class250 var5 = new class250(arg2);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1369((byte) 47);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1383(255);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = (var8 & 0xFD9) >> 6;
                    int var14 = var5.method1350(arg1 + 4869) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < (class315.field4214 - 1) && var16 < (class340.field4549 - 1)) {
                        class225 var17 = class281.method1655((byte) -28, var6);
                        if (var14 != 22 || class216.field2905 || var17.field3027 != 0 || var17.field3057 == 1 || var17.field3064) {
                            if (!var17.method1215(arg1 - 26364)) {
                                class424.field6223++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1383(255);
                if (var10 == 0) {
                    break;
                }
                var5.method1350(31351);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 103)
    public static void method419(int arg0) {
        field816 = null;
        if (arg0 > -112) {
            field816 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V", line = 113)
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -2) {
            method420(-120, -119, 77, -104, 21);
        }
        field818++;
        float var5 = (float) class443.field6465 / (float) class443.field6472;
        int var6 = arg2;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg2 - var6) / 2;
        int var9 = arg4 - (arg1 - var7) / 2;
        class98.field1165 = class443.field6472 * var8 / var6;
        class158.field2027 = class443.field6465 - class443.field6465 * var9 / var7;
        class68.field715 = -1;
        class428.field6284 = -1;
        class176.method925(true);
    }
}
