import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class304 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field4736;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public int[] field4737;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 13)
    public static final void method2189(byte arg0) {
        field4734++;
        if (class279.field4312 < 128.0F) {
            class279.field4312 = 128.0F;
        }
        if (class279.field4312 > 383.0F) {
            class279.field4312 = 383.0F;
        }
        int var1 = class231.field3609 >> 7;
        int var2 = class226.field3519 >> 7;
        while (class313.field4846 >= 2048.0F) {
            class313.field4846 -= 2048.0F;
        }
        while (class313.field4846 < 0.0F) {
            class313.field4846 += 2048.0F;
        }
        int var3 = class193.method1469(class226.field3519, class231.field3609, (byte) -47, class119.field1826);
        int var4 = 0;
        if (arg0 > -78) {
            field4735 = -66;
        }
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class119.field1826;
                    if (var7 < 3 && (class146.field2386[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class109.field1672[var7][var5][var6] & 0xFF) * 8 + var3 - class277.field4290[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class66.field1004 < var9) {
            class66.field1004 += (var9 - class66.field1004) / 24;
        } else if (var9 < class66.field1004) {
            class66.field1004 += (var9 - class66.field1004) / 80;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 94)
    public final void method2190(int arg0) {
        field4728++;
        if (arg0 == 1) {
            class60.method595(this.field4737, this.field4730, this.field4733);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 110)
    public static final void method2191(int arg0) {
        if (arg0 != -19234) {
            field4735 = -74;
        }
        field4731++;
        if (class87.field1246 == 0) {
            return;
        }
        try {
            if ((++class114.field1757) > 1500) {
                if (class188.field2950 != null) {
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                }
                if (class301.field4669 >= 1) {
                    class248.field3849 = -5;
                    class87.field1246 = 0;
                    return;
                }
                class87.field1246 = 1;
                class114.field1757 = 0;
                class301.field4669++;
                if (class42.field663 == class147.field2393) {
                    class147.field2393 = class258.field3948;
                } else {
                    class147.field2393 = class42.field663;
                }
            }
            if (class87.field1246 == 1) {
                class207.field3180 = class340.field5234.method2288(class23.field361, class147.field2393, -126);
                class87.field1246 = 2;
            }
            if (class87.field1246 == 2) {
                if (class207.field3180.field1447 == 2) {
                    throw new IOException();
                }
                if (class207.field3180.field1447 != 1) {
                    return;
                }
                class188.field2950 = new class344((Socket) class207.field3180.field1446, class340.field5234);
                class207.field3180 = null;
                class188.field2950.method2426(0, -28332, class99.field1491.field448, class99.field1491.field397);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(arg0 ^ 0xFFFFB4DE);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                int var1 = class188.field2950.method2423(false);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                if (var1 != 101) {
                    class87.field1246 = 0;
                    class248.field3849 = var1;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
                class87.field1246 = 3;
            }
            if (class87.field1246 == 3) {
                if (class188.field2950.method2424((byte) 21) < 2) {
                    return;
                }
                int var2 = class188.field2950.method2423(false) << 8 | class188.field2950.method2423(false);
                class294.method2124(var2, true);
                if (class207.field3196 == -1) {
                    class248.field3849 = 6;
                    class87.field1246 = 0;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
                class87.field1246 = 0;
                class188.field2950.method2429(false);
                class188.field2950 = null;
                class317.method2235((byte) -113);
                return;
            }
        } catch (IOException var4) {
            if (class188.field2950 != null) {
                class188.field2950.method2429(false);
                class188.field2950 = null;
            }
            if (class301.field4669 < 1) {
                class301.field4669++;
                class114.field1757 = 0;
                if (class42.field663 == class147.field2393) {
                    class147.field2393 = class258.field3948;
                } else {
                    class147.field2393 = class42.field663;
                }
                class87.field1246 = 1;
            } else {
                class87.field1246 = 0;
                class248.field3849 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 259)
    protected class304() {
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method970(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method973(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method976(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
