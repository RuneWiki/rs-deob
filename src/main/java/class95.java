import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class95 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Z")
    public boolean field1461 = true;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1448 = new Object();

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public int[] field1464 = new int[500];

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "[I")
    public int[] field1465 = new int[500];

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field1466 = 0;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field1455 = new int[200];

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field1451 = new int[32];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 7)
    public static final void method645(byte arg0) {
        field1463++;
        class320.field5008 = class322.method2179(0.4F, 4, 35, true, 2048, 8, 8, false);
        if (arg0 != -85) {
            field1455 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 19)
    public static final void method646(int arg0) {
        class126.field1970++;
        class265.field4095.method2064(255, 83);
        class265.field4095.method2034(arg0 - 113, class166.method1132(false));
        class265.field4095.method2044(1247686728, class334.field5203);
        field1459++;
        if (arg0 != 0) {
            field1451 = (int[]) null;
        }
        class265.field4095.method2044(1247686728, class174.field2644);
        class265.field4095.method2034(arg0 ^ 0xFFFFFF8A, class10.field95);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method647(boolean arg0) {
        field1450++;
        if (arg0) {
            class265.field4088.method1298((byte) 110);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 53)
    public static final void method648(int arg0, int arg1) {
        if (arg1 < 114) {
            method646(49);
        }
        field1454++;
        if (!class104.field1609) {
            arg0 = -1;
        }
        if (class155.field2425 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class90 var2 = class206.method1380((byte) -14, arg0);
            class178 var3 = var2.method619(118);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class89.field1359.method1511(var3.method1212(), 106, new Point(var2.field1380, var2.field1368), var3.field3842, var3.field3849, class302.field4665);
                class155.field2425 = arg0;
            }
        }
        if (arg0 == -1 && class155.field2425 != -1) {
            class89.field1359.method1511((int[]) null, 57, new Point(), -1, -1, class302.field4665);
            class155.field2425 = -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 94)
    public static final void method649(int arg0) {
        if (arg0 != -14227) {
            field1455 = (int[]) null;
        }
        int var1 = class143.field2278;
        int var2 = class128.field1996;
        field1457++;
        int var3 = class312.field4943 - class334.field5203 - var1;
        int var4 = class136.field2112 - class174.field2644 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class63.field919 != null) {
                var6 = class63.field919;
            } else if (class261.field4045 == null) {
                var6 = class89.field1359.field3569;
            } else {
                var6 = class261.field4045;
            }
            int var7 = 0;
            if (class261.field4045 == var6) {
                Insets var8 = class261.field4045.getInsets();
                var5 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, class136.field2112);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class312.field4943, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var5 + class312.field4943 - var3, var7, var3, class136.field2112);
            }
            if (var4 > 0) {
                var9.fillRect(var5, class136.field2112 + var7 - var4, class312.field4943, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lei;I)V", line = 161)
    public static final void method650(class208 arg0, int arg1) {
        field1456++;
        long var2 = 0L;
        int var4 = -1;
        if (arg0.field3314 == 0) {
            var2 = class126.method848(arg0.field3305, arg0.field3316, arg0.field3322);
        }
        if (arg0.field3314 == arg1) {
            var2 = class159.method1103(arg0.field3305, arg0.field3316, arg0.field3322);
        }
        int var5 = 0;
        if (arg0.field3314 == 2) {
            var2 = class97.method668(arg0.field3305, arg0.field3316, arg0.field3322);
        }
        if (arg0.field3314 == 3) {
            var2 = class338.method2341(arg0.field3305, arg0.field3316, arg0.field3322);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
            var5 = ((int) var2 & 0x7E2D3) >> 14;
        }
        arg0.field3319 = var6;
        arg0.field3308 = var4;
        arg0.field3315 = var5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Luc;ZLuc;ZZII)I", line = 200)
    public static final int method651(class130 arg0, boolean arg1, class130 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field1460++;
        int var7 = class36.method258(arg0, 112, arg3, arg2, arg5);
        if (var7 == 0) {
            if (arg1) {
                field1451 = (int[]) null;
            }
            if (arg6 == -1) {
                return 0;
            } else {
                int var8 = class36.method258(arg0, 121, arg4, arg2, arg6);
                return arg4 ? -var8 : var8;
            }
        } else if (arg3) {
            return -var7;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V", line = 231)
    public static final void method652(int arg0, byte arg1) {
        field1458++;
        if (arg1 >= -63) {
            method646(101);
        }
        class205.field3110 = (class200) class207.field3164.method1558((long) arg0, false);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 246)
    public static final void method653(boolean arg0) {
        if (arg0) {
            class90.field1375 = class10.field94;
            client.field2034 = class46.field655;
            class136.field2118 = class274.field4222;
        } else {
            class90.field1375 = class2.field15;
            client.field2034 = class193.field2911;
            class136.field2118 = class126.field1962;
        }
        class322.field5024 = class90.field1375.length;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Z)V", line = 269)
    public static void method654(boolean arg0) {
        if (!arg0) {
            field1455 = (int[]) null;
        }
        field1455 = null;
        field1451 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLwe;Ljava/awt/Frame;)V", line = 284)
    public static final void method655(boolean arg0, class224 arg1, Frame arg2) {
        field1449++;
        while (true) {
            class252 var3 = arg1.method1526(7, arg2);
            while (var3.field3931 == 0) {
                class96.method657(10L, (byte) -115);
            }
            if (var3.field3931 == 1) {
                if (!arg0) {
                    field1451 = (int[]) null;
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class96.method657(100L, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V", line = 322)
    public final void run() {
        field1462++;
        while (this.field1461) {
            Object var1 = this.field1448;
            synchronized (this.field1448) {
                if (this.field1466 < 500) {
                    this.field1464[this.field1466] = class199.field2985;
                    this.field1465[this.field1466] = class107.field1636;
                    this.field1466++;
                }
            }
            class96.method657(50L, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Lvb;", line = 345)
    public static final class84 method656(int arg0, int arg1) {
        field1453++;
        class84 var2 = (class84) class34.field438.method1294((long) arg1, 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class273.field4189.method2103(0, arg0, arg1);
        class84 var4 = new class84();
        if (var3 != null) {
            var4.method576(new class303(var3), arg1, (byte) -108);
        }
        class34.field438.method1292((long) arg1, 48, var4);
        return var4;
    }
}
