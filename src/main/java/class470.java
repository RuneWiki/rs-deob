import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class470 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lwn;")
    public static class585 field6527 = new class585("", 15);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Ljn;")
    public static class324 field6529 = new class324(0, 2, 2, 1);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLuv;II)V")
    public static final void method2862(byte arg0, class755 arg1, int arg2, int arg3) {
        field6528++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field10496 != null) {
            class142 var4 = new class142();
            var4.field2024 = arg1.field10496;
            var4.field2020 = arg1;
            class546.method3233(var4);
        }
        class160.field2235 = true;
        class41.field505 = arg2;
        if (arg0 < 33) {
            field6527 = null;
        }
        class623.field8403 = arg3;
        class721.field10028 = arg1.field10467;
        class442.field6137 = arg1.field10469;
        class222.field3007 = arg1.field10462;
        class209.field2732 = arg1.field10441;
        class401.field5748 = arg1.field10445;
        class27.method159((byte) -105, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static void method2863(int arg0) {
        if (arg0 != -25873) {
            method2864(-74, -85, -79);
        }
        field6527 = null;
        field6529 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)I")
    public static final int method2864(int arg0, int arg1, int arg2) {
        field6526++;
        if (class32.field411 == -1) {
            return 1;
        }
        if (class332.field4707.field4789.method963(0) != arg1) {
            class240.method1621(arg1, true, class155.field2132.method978(class120.field1576, (byte) -121), true);
            if (class332.field4707.field4789.method963(0) != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class570.field7875.getSize();
            class743.method4138(true, class272.field3950, class155.field2132.method978(class120.field1576, (byte) -107), class524.field7280, class129.field1802, (byte) 52);
            class133 var4 = class214.method1266(class186.field2537, 0, class32.field411, 0);
            long var5 = class97.method664((byte) -50);
            class129.field1802.method1437();
            class243.field3618.method905(0, class292.field4190, 0);
            class129.field1802.method1444(class243.field3618);
            class129.field1802.method1421(var3.width / 2, var3.height / 2, 512, 512);
            class129.field1802.method1457(1.0F);
            class129.field1802.method1498(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class284 var7 = class129.field1802.method1463(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class129.field1802.method273(0);
                class129.field1802.method346();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class723.field10036.method905((int) (((float) var11 - (float) var10 / 2.0F) * (float) class368.field5213), 0, (var10 + 1) * class368.field5213);
                        var8++;
                        var7.method1686(class723.field10036, null, 0);
                        if (class97.method664((byte) -50) - var5 >= (long) arg0) {
                            break label45;
                        }
                    }
                }
            }
            class129.field1802.method290();
            long var12 = (long) (var8 * 1000) / (class97.method664((byte) -50) - var5);
            if (arg2 != 2048) {
                method2863(73);
            }
            class129.field1802.method273(0);
            class129.field1802.method346();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
