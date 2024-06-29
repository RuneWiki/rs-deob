import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class171 {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lck;")
    private class221 field2252;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "J")
    public long field2250;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
    public static boolean field2246 = false;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lga;")
    public static class70 field2248 = new class70("LIVE", "", "", 0);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBI)V", line = 3)
    public static final void method1066(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (class389 var5 = (class389) class326.field4157.method3111(116); var5 != null; var5 = (class389) class326.field4157.method3116(-123)) {
            class109.method749(arg4, arg0, (byte) -123, arg1, arg2, var5);
        }
        field2247++;
        for (class389 var6 = (class389) class204.field2596.method3111(101); var6 != null; var6 = (class389) class204.field2596.method3116(-54)) {
            byte var12 = 1;
            class459 var13 = var6.field5428.method249(arg3 - 17);
            if (var6.field5428.field332 == -1 || var6.field5428.field313) {
                var12 = 0;
            } else if (var6.field5428.field332 == var13.field6425 || var6.field5428.field332 == var13.field6459 || var6.field5428.field332 == var13.field6418 || var6.field5428.field332 == var13.field6430) {
                var12 = 2;
            } else if (var6.field5428.field332 == var13.field6447 || var6.field5428.field332 == var13.field6463 || var6.field5428.field332 == var13.field6450 || var6.field5428.field332 == var13.field6415) {
                var12 = 3;
            }
            if (var6.field5413 != var12) {
                int var14 = class519.method2982(var6.field5428, -1);
                class155 var15 = var6.field5428.field1486;
                if (var15.field1929 != null) {
                    var15 = var15.method968((byte) -76, class461.field6637);
                }
                if (var15 == null || var14 == -1) {
                    var6.field5425 = -1;
                    var6.field5417 = false;
                    var6.field5413 = var12;
                } else if (var6.field5425 == var14 && var6.field5417 == var15.field1904) {
                    var6.field5413 = var12;
                    var6.field5403 = var15.field1956;
                } else {
                    boolean var16 = false;
                    if (var6.field5419 == null) {
                        var16 = true;
                    } else {
                        var6.field5403 -= 512;
                        if (var6.field5403 <= 0) {
                            class668.field9148.method664(var6.field5419);
                            var16 = true;
                            var6.field5419 = null;
                        }
                    }
                    if (var16) {
                        var6.field5400 = null;
                        var6.field5417 = var15.field1904;
                        var6.field5413 = var12;
                        var6.field5403 = var15.field1956;
                        var6.field5421 = null;
                        var6.field5425 = var14;
                    }
                }
            }
            var6.field5409 = var6.field5428.field5790;
            var6.field5431 = var6.field5428.field5790 + (var6.field5428.method253((byte) -27) << 8);
            var6.field5416 = var6.field5428.field5784;
            var6.field5427 = var6.field5428.field5784 + (var6.field5428.method253((byte) -27) << 8);
            class109.method749(arg4, arg0, (byte) -123, arg1, arg2, var6);
        }
        for (class389 var7 = (class389) class297.field3854.method3245(false); var7 != null; var7 = (class389) class297.field3854.method3252(12938)) {
            byte var8 = 1;
            class459 var9 = var7.field5408.method249(-75);
            if (var7.field5408.field332 == -1 || var7.field5408.field313) {
                var8 = 0;
            } else if (var7.field5408.field332 == var9.field6425 || var7.field5408.field332 == var9.field6459 || var7.field5408.field332 == var9.field6418 || var7.field5408.field332 == var9.field6430) {
                var8 = 2;
            } else if (var7.field5408.field332 == var9.field6447 || var7.field5408.field332 == var9.field6463 || var7.field5408.field332 == var9.field6450 || var7.field5408.field332 == var9.field6415) {
                var8 = 3;
            }
            if (var7.field5413 != var8) {
                int var10 = class62.method478(var7.field5408, arg3 + 62);
                if (var7.field5425 == var10 && var7.field5408.field7699 == var7.field5417) {
                    var7.field5413 = var8;
                    var7.field5403 = var7.field5408.field7672;
                } else {
                    boolean var11 = false;
                    if (var7.field5419 == null) {
                        var11 = true;
                    } else {
                        var7.field5403 -= 512;
                        if (var7.field5403 <= 0) {
                            class668.field9148.method664(var7.field5419);
                            var11 = true;
                            var7.field5419 = null;
                        }
                    }
                    if (var11) {
                        var7.field5403 = var7.field5408.field7672;
                        var7.field5400 = null;
                        var7.field5421 = null;
                        var7.field5413 = var8;
                        var7.field5425 = var10;
                        var7.field5417 = var7.field5408.field7699;
                    }
                }
            }
            var7.field5409 = var7.field5408.field5790;
            var7.field5431 = var7.field5408.field5790 + (var7.field5408.method253((byte) -27) << 8);
            var7.field5416 = var7.field5408.field5784;
            var7.field5427 = var7.field5408.field5784 + (var7.field5408.method253((byte) -27) << 8);
            class109.method749(arg4, arg0, (byte) -125, arg1, arg2, var7);
        }
        if (arg3 != -63) {
            field2246 = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 179)
    public static void method1067(boolean arg0) {
        if (!arg0) {
            method1066(102, 87, 20, (byte) -114, 84);
        }
        field2248 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 190)
    public static final void method1068(int arg0) {
        if (arg0 == -25089) {
            class3.field26.method3251(false);
            field2251++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILnga;Ljava/awt/Frame;)V", line = 205)
    public static final void method1069(int arg0, class256 arg1, Frame arg2) {
        field2245++;
        if (arg0 >= -117) {
            return;
        }
        while (true) {
            class435 var3 = arg1.method1561(arg2, (byte) 52);
            while (var3.field6124 == 0) {
                class517.method2965(10L, -98);
            }
            if (var3.field6124 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class517.method2965(100L, -84);
        }
    }

    @OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V", line = 233)
    protected final void finalize() throws Throwable {
        this.field2252.method1382(this.field2250, -4042);
        field2249++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lck;J[Lju;)V", line = 248)
    public class171(class221 arg0, long arg1, class373[] arg2) {
        this.field2252 = arg0;
        this.field2250 = arg1;
    }
}
