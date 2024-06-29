import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class348 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "[Lpf;")
    public class447[] field4919 = new class447[100];

    @OriginalMember(owner = "client!br", name = "d", descriptor = "[I")
    public int[] field4922 = new int[3];

    @OriginalMember(owner = "client!br", name = "g", descriptor = "[Lhs;")
    public class420[] field4925 = new class420[8];

    @OriginalMember(owner = "client!br", name = "f", descriptor = "[I")
    public int[] field4924 = new int[100];

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lmb;")
    public static class258 field4926;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4920;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILja;IBLcj;)V", line = 12)
    public static final void method2240(int arg0, int arg1, int arg2, class90 arg3, int arg4, byte arg5, class181 arg6) {
        if (class358.field5117 < 100) {
            class239.method1741(arg3, arg6, (byte) 109);
        }
        field4921++;
        arg3.method752(arg0, arg4, arg0 + arg2, arg4 - -arg1);
        if (class358.field5117 < 100) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg0;
            arg3.method681(arg0, arg4, arg2, arg1, -16777216, 0);
            int var9 = arg1 / 2 + arg4 - var7 - 18;
            arg3.method711(var8 - 152, var9, 304, 34, class277.field4163[class307.field4490].getRGB(), 0);
            arg3.method681(var8 - 150, var9 + 2, class358.field5117 * 3, 30, class360.field5130[class307.field4490].getRGB(), 0);
            class250.field3620.method1670(class407.field5932[class307.field4490].getRGB(), var8, class40.field617, arg5 - 32116, -1, var9 + var7);
            return;
        }
        int var10 = class110.field1797 - ((int) ((float) arg2 / class272.field4078));
        int var11 = (int) ((float) arg1 / class272.field4078) + class373.field5295;
        int var12 = class110.field1797 + ((int) ((float) arg2 / class272.field4078));
        int var13 = class373.field5295 - (int) ((float) arg1 / class272.field4078);
        class354.field5036 = class373.field5295 - (int) ((float) arg1 / class272.field4078);
        if (arg5 != 107) {
            field4926 = null;
        }
        class51.field820 = (int) ((float) (arg2 * 2) / class272.field4078);
        class413.field6000 = class110.field1797 - ((int) ((float) arg2 / class272.field4078));
        class441.field6407 = (int) ((float) (arg1 * 2) / class272.field4078);
        class272.method1937(class272.field4096 + var10, class272.field4088 + var11, var12 + class272.field4096, class272.field4088 + var13, arg0, arg4, arg0 + arg2, arg1 + arg4 + 1);
        class272.method1939(arg3);
        class22 var14 = class272.method1946(arg3);
        class129.method1085(var14, 0, arg3, 0, false);
        if (class351.field4992 > 0) {
            class319.field4609--;
            if (class319.field4609 == 0) {
                class351.field4992--;
                class319.field4609 = 20;
            }
        }
        if (!class153.field2337) {
            return;
        }
        int var15 = arg2 + arg0 - 5;
        int var16 = arg1 + arg4 - 8;
        class107.field1763.method1673(var15, "Fps:" + class60.field970, -1, 16776960, -111, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class107.field1763.method1673(var15, "Mem:" + var18 + "k", -1, var19, arg5 ^ 0xFFFFFFFD, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 100)
    public static void method2241(boolean arg0) {
        field4926 = null;
        if (!arg0) {
            field4926 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 113)
    public static final void method2242(int arg0) {
        field4923++;
        if (arg0 != 0) {
            return;
        }
        class184 var1 = null;
        try {
            class131 var2 = class188.field2783.method1367((byte) -124);
            while (var2.field2121 == 0) {
                class134.method1106(1L, arg0 + 10);
            }
            if (var2.field2121 == 1) {
                var1 = (class184) var2.field2125;
                byte[] var3 = new byte[(int) var1.method1435(~arg0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1434(var3.length - var4, arg0 + 93, var3, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class369.method2349(new class37(var3), -50);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1431(-1);
            }
        } catch (Exception var6) {
        }
    }
}
