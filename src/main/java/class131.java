import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class131 extends Canvas {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field1934;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
    public static boolean field1926 = false;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[Z")
    public static boolean[] field1927 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[Z")
    public static boolean[] field1939 = new boolean[8];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method890(boolean arg0) {
        field1938++;
        if (class124.field1855 == null) {
            return;
        }
        if (class334.field5182 < 10) {
            if (!class274.field4348.method260(-21568, class124.field1855.field4926)) {
                class334.field5182 = class42.field588.method264(class124.field1855.field4926, (byte) -75) / 10;
                return;
            }
            class74.method491((byte) 22);
            class334.field5182 = 10;
        }
        if (class334.field5182 == 10) {
            class161.field2636 = class124.field1855.field4945 >> 6 << 6;
            class287.field4528 = class124.field1855.field4938 >> 6 << 6;
            class331.field5158 = (class124.field1855.field4942 >> 6 << 6) + 64 - class161.field2636;
            class240.field3815 = (class124.field1855.field4936 >> 6 << 6) + 64 - class287.field4528;
            int[] var1 = class124.field1855.method2213(class148.field2209, 46, (class13.field159.field1944 >> 7) + class24.field351, class181.field2925 - -(class13.field159.field1980 >> 7));
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var3 = class331.field5158 - (var1[2] + -class161.field2636) - 1;
                var2 = var1[1] - class287.field4528;
            }
            if (var2 >= 0 && class240.field3815 > var2 && var3 >= 0 && var3 < class331.field5158) {
                int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
                class231.field3698 = var4;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class242.field3841 = var5;
            } else if (class340.field5297 == -1 || class185.field2969 == -1) {
                int[] var7 = class124.field1855.method2217(false, class124.field1855.field4944 & 0x3FFF, class124.field1855.field4944 >> 14 & 0x3FFF);
                class242.field3841 = var7[1] - class287.field4528;
                class231.field3698 = class331.field5158 - (var7[2] + -class161.field2636) - 1;
            } else {
                int[] var6 = class124.field1855.method2217(false, class185.field2969, class340.field5297);
                if (var6 != null) {
                    class242.field3841 = var6[1] - class287.field4528;
                    class231.field3698 = class161.field2636 - (var6[2] - (class331.field5158 - 1));
                }
                class185.field2969 = -1;
                class340.field5297 = -1;
            }
            if (class124.field1855.field4947 == 37) {
                class42.field584 = 3.0F;
                class71.field918 = 3.0F;
            } else if (class124.field1855.field4947 == 50) {
                class42.field584 = 4.0F;
                class71.field918 = 4.0F;
            } else if (class124.field1855.field4947 == 75) {
                class42.field584 = 6.0F;
                class71.field918 = 6.0F;
            } else if (class124.field1855.field4947 == 100) {
                class42.field584 = 8.0F;
                class71.field918 = 8.0F;
            } else if (class124.field1855.field4947 == 200) {
                class42.field584 = 16.0F;
                class71.field918 = 16.0F;
            } else {
                class42.field584 = 8.0F;
                class71.field918 = 8.0F;
            }
            class319.method2235((byte) -107);
            int var8 = class240.field3815 >> 6;
            int var9 = class331.field5158 >> 6;
            class209.field3423 = new int[class92.field1424 + 1];
            class16.field210 = new byte[var8][var9][];
            class254.field4030 = new int[var8][var9][];
            class41.field578 = new byte[var8][var9][];
            class145.field2163 = new byte[var8][var9][];
            class325.field5074 = new byte[var8][var9][];
            class308.field4814 = new int[var8][var9][];
            class34.field456 = new int[var8][var9][];
            class334.field5185 = new byte[var8][var9][];
            int var10 = class188.field3049 >> 1;
            int var11 = class89.field1358 >> 2 << 10;
            class114.method791(var11, -13732, var10);
            class334.field5182 = 20;
        } else if (class334.field5182 == 20) {
            class15.method101(new class192(class274.field4348.method258(-23260, class124.field1855.field4926, "underlay")), (byte) 81);
            class334.field5182 = 30;
            class48.method339(true, -12095);
            class170.method1167((byte) -94);
        } else if (class334.field5182 == 30) {
            class142.method988(14078, new class192(class274.field4348.method258(-23260, class124.field1855.field4926, "overlay")));
            class334.field5182 = 40;
            class170.method1167((byte) 73);
        } else if (class334.field5182 == 40) {
            class258.method1825(new class192(class274.field4348.method258(-23260, class124.field1855.field4926, "overlay2")), (byte) 92);
            class334.field5182 = 50;
            class170.method1167((byte) 105);
        } else if (class334.field5182 == 50) {
            class99.method700(new class192(class274.field4348.method258(-23260, class124.field1855.field4926, "loc")), 125);
            class334.field5182 = 60;
            class48.method339(true, -12095);
            class170.method1167((byte) -93);
        } else if (class334.field5182 == 60) {
            if (class274.field4348.method269(-87, class124.field1855.field4926 + "_labels")) {
                if (!class274.field4348.method260(-21568, class124.field1855.field4926 + "_labels")) {
                    return;
                }
                class193.field3167 = class81.method598(0, class274.field4348, class124.field1855.field4926 + "_labels");
            } else {
                class193.field3167 = new class315(0);
            }
            class334.field5182 = 70;
            class170.method1167((byte) -105);
        } else if (class334.field5182 == 70) {
            class119.field1833 = new class53(11, true, class338.field5247);
            class334.field5182 = 73;
            class48.method339(true, -12095);
            class170.method1167((byte) -108);
        } else if (class334.field5182 == 73) {
            class35.field463 = new class53(12, true, class338.field5247);
            class334.field5182 = 76;
            class48.method339(true, -12095);
            class170.method1167((byte) 79);
        } else if (class334.field5182 == 76) {
            class18.field253 = new class53(14, true, class338.field5247);
            class334.field5182 = 79;
            class48.method339(true, -12095);
            class170.method1167((byte) -123);
        } else if (class334.field5182 == 79) {
            class244.field3884 = new class53(17, true, class338.field5247);
            class334.field5182 = 82;
            class48.method339(true, -12095);
            class170.method1167((byte) -94);
        } else if (class334.field5182 == 82) {
            class101.field1549 = new class53(19, true, class338.field5247);
            class334.field5182 = 85;
            class48.method339(true, -12095);
            class170.method1167((byte) -94);
        } else if (class334.field5182 == 85) {
            class77.field1168 = new class53(22, true, class338.field5247);
            class334.field5182 = 88;
            class48.method339(true, -12095);
            class170.method1167((byte) -98);
        } else if (class334.field5182 == 88) {
            class282.field4433 = new class53(26, true, class338.field5247);
            class334.field5182 = 91;
            class48.method339(true, -12095);
            class170.method1167((byte) -125);
        } else {
            class139.field2082 = new class53(30, true, class338.field5247);
            class334.field5182 = 100;
            class48.method339(arg0, -12095);
            class170.method1167((byte) -102);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ld", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 249)
    public final void paint(Graphics arg0) {
        field1928++;
        this.field1934.paint(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 273)
    public class131(Component arg0) {
        this.field1934 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 284)
    public static final void method891(int arg0) {
        field1925++;
        class127.field1899.method1623(arg0 ^ 0x17);
        class283.field4471.method1623(1);
        class246.field3900.method1623(1);
        if (arg0 != 22) {
            field1939 = (boolean[]) null;
        }
        class331.field5155.method1623(1);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 298)
    public static void method892(int arg0) {
        if (arg0 == -80) {
            field1927 = null;
            field1939 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 309)
    public static final void method893(int arg0) {
        field1929++;
        class127.field1899.method1615(65);
        class283.field4471.method1615(47);
        class246.field3900.method1615(47);
        class331.field5155.method1615(51);
        if (arg0 != 40) {
            method893(-45);
        }
    }

    @OriginalMember(owner = "client!ld", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 329)
    public final void update(Graphics arg0) {
        this.field1934.update(arg0);
        field1930++;
    }
}
