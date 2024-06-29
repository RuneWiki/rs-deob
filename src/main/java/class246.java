import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class246 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[I")
    public static int[] field4264 = new int[25];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4260 = new CRC32();

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Ldf;")
    public static class51 field4271 = class46.method233("Ausw-=hlen", 100);

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ldf;")
    private static class51 field4272 = class46.method233("shake:", 100);

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Ldf;")
    public static class51 field4270 = field4272;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Ldf;")
    public static class51 field4273 = field4272;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[Z")
    public static boolean[] field4274;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method1673(byte arg0) {
        if (arg0 != 106) {
            method1674(-67, 114, -30, -96, -60, (class93) null);
        }
        field4263++;
        if (class42.field664 != null) {
            class244 var1 = class42.field664;
            synchronized (class42.field664) {
                class42.field664 = null;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIILoa;)V")
    public static final void method1674(int arg0, int arg1, int arg2, int arg3, int arg4, class93 arg5) {
        field4262++;
        if (arg0 != 40) {
            field4273 = null;
        }
        if (arg5.field1534 == -1 && arg5.field1545 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg5.field1555) {
            var6 += arg3 - arg5.field1555;
        } else if (arg5.field1536 > arg3) {
            var6 += arg5.field1536 - arg3;
        }
        if (arg1 > arg5.field1553) {
            var6 += arg1 - arg5.field1553;
        } else if (arg1 < arg5.field1558) {
            var6 += arg5.field1558 - arg1;
        }
        if (arg5.field1548 == 0 || arg5.field1548 < (var6 - 64) || class218.field3801 == 0 || arg5.field1543 != arg2) {
            if (arg5.field1552 != null) {
                class166.field2709.method488(arg5.field1552);
                arg5.field1552 = null;
            }
            if (arg5.field1537 != null) {
                class166.field2709.method488(arg5.field1537);
                arg5.field1537 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field1548 - var6) * class218.field3801 / arg5.field1548;
        if (arg5.field1552 != null) {
            arg5.field1552.method599(var7);
        } else if (arg5.field1534 >= 0) {
            class117 var8 = class117.method852(class176.field2883, arg5.field1534, 0);
            if (var8 != null) {
                class224 var9 = var8.method853().method1544(client.field2450);
                class81 var10 = class81.method628(var9, 100, var7);
                var10.method600(-1);
                class166.field2709.method495(var10);
                arg5.field1552 = var10;
            }
        }
        if (arg5.field1537 != null) {
            arg5.field1537.method599(var7);
            if (!arg5.field1537.method768(-1)) {
                arg5.field1537 = null;
            }
        } else if (arg5.field1545 != null && (arg5.field1539 -= arg4) <= 0) {
            int var11 = (int) (Math.random() * (double) arg5.field1545.length);
            class117 var12 = class117.method852(class176.field2883, arg5.field1545[var11], 0);
            if (var12 != null) {
                class224 var13 = var12.method853().method1544(client.field2450);
                class81 var14 = class81.method628(var13, 100, var7);
                var14.method600(0);
                class166.field2709.method495(var14);
                arg5.field1539 = arg5.field1550 + ((int) ((double) (arg5.field1549 - arg5.field1550) * Math.random()));
                arg5.field1537 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method1675(int arg0) {
        field4268++;
        if (arg0 > ~class78.field1252) {
            class42.method216(104);
        } else {
            class50.field796 = class204.field3415;
            class204.field3415 = null;
            class100.method734(true, 40);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1676(int arg0, Component arg1) {
        int var2 = -95 % ((arg0 - 7) / 47);
        field4269++;
        arg1.addMouseListener(class42.field664);
        arg1.addMouseMotionListener(class42.field664);
        arg1.addFocusListener(class42.field664);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method1677(byte arg0) {
        field4272 = null;
        field4264 = null;
        field4270 = null;
        field4274 = null;
        field4273 = null;
        field4260 = null;
        field4271 = null;
        if (arg0 != -76) {
            field4272 = null;
        }
    }
}
