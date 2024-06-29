import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class365 {

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field5368 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2205(int arg0) {
        class399.field5816.method1460(-22512);
        field5364++;
        class359.field5323.method1425(3);
        class56.field933.method945(3);
        class128.field2070.method910(arg0 ^ 0xFFFF82D5);
        class433.field6358.method2695((byte) -119);
        class288.field4362.method3026(21632);
        class429.field6302.method109((byte) 127);
        class201.field3192.method1254((byte) 79);
        class117.field1962.method1380((byte) -125);
        class368.field5407.method1055(false);
        class511.field7740.method1409(true);
        class164.field2542.method1028(arg0 + 3);
        class22.field281.method1843((byte) -123);
        class156.field2465.method1704(91);
        class76.field1364.method1269(-76);
        class466.field7155.method2555(arg0 - 1);
        class507.field7670.method2569(true);
        class193.field3050.method1499((byte) -80);
        class466.field7153.method763(arg0 - 32);
        class318.field4791.method1663(-37);
        class433.method2532(arg0 - 24632);
        class261.method1586(true);
        class123.method848(-8229);
        class8.method46(arg0);
        class145.field2351.method1749((byte) -30);
        class255.field3889.method1749((byte) 127);
        class129.field2073.method1749((byte) 0);
        class500.field7587.method1749((byte) -66);
        class94.field1695.method1749((byte) -37);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLha;)V", line = 42)
    public final void method2206(byte arg0, class40 arg1) {
        field5367++;
        if (arg0 != -97) {
            return;
        }
        while (true) {
            int var3 = arg1.method257((byte) 125);
            if (var3 == 0) {
                return;
            }
            this.method2207(var3, 70, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILha;)V", line = 63)
    private final void method2207(int arg0, int arg1, class40 arg2) {
        if (arg1 < 34) {
            this.method2207(-45, -9, null);
        }
        field5369++;
        if (arg0 == 5) {
            this.field5368 = arg2.method254((byte) -78);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 81)
    public static final void method2208(byte arg0) {
        field5365++;
        if (class201.field3190 != null) {
            return;
        }
        int var1 = class483.field7376;
        if (arg0 >= -60) {
            return;
        }
        int var2 = class411.field5963;
        int var3 = class135.field2212 - class482.field7368 - var1;
        int var4 = class292.field4453 - class147.field2384 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class174.field2726 == null) {
                var5 = class7.field86.field3929;
            } else {
                var5 = class174.field2726;
            }
            int var6 = 0;
            int var7 = 0;
            if (class174.field2726 == var5) {
                Insets var8 = class174.field2726.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class292.field4453);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class135.field2212, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class135.field2212 - var3, var7, var3, class292.field4453);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class292.field4453 + var7 - var4, class135.field2212, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZI)I", line = 149)
    public static final int method2209(int arg0, boolean arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1) {
            method2205(-107);
        }
        field5362++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZII)Llt;", line = 177)
    public static final class458 method2210(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5361++;
        class319 var5 = null;
        if (class462.field7100 != null) {
            var5 = new class319(arg1, class462.field7100, class146.field2368[arg1], 1000000);
        }
        class99.field1791[arg1] = class23.field305.method323(-128, arg1, class473.field7234, var5);
        if (arg4 > -99) {
            return null;
        } else {
            if (arg0) {
                class99.field1791[arg1].method2324(true);
            }
            return new class458(class99.field1791[arg1], arg2, arg3);
        }
    }
}
