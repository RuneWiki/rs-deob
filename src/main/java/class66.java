import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lo;")
    public static class175 field1073 = null;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "S")
    public static short field1080 = 256;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[I")
    public static int[] field1072;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lpd;")
    public static class48[] field1078;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLo;)Z")
    public static final boolean method467(byte arg0, class175 arg1) {
        field1074++;
        if (arg1.field3067 == 205) {
            class263.field4583 = 250;
            return true;
        } else {
            if (arg0 != 122) {
                field1080 = -20;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method468(Component arg0, int arg1) {
        field1071++;
        arg0.addMouseListener(class46.field726);
        arg0.addMouseMotionListener(class46.field726);
        if (arg1 != -8087) {
            method472(82);
        }
        arg0.addFocusListener(class46.field726);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lo;ZI)V")
    public static final void method469(class175 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field2933 == 0 ? arg0.field3057 : arg0.field2933;
        int var4 = arg0.field3033 == 0 ? arg0.field3041 : arg0.field3033;
        class116.method773(class208.field3563[arg0.field2987 >> 16], arg1, arg0.field2987, var4, -25117, var3);
        if (arg2 != 268100240) {
            field1078 = null;
        }
        field1070++;
        if (arg0.field3066 != null) {
            class116.method773(arg0.field3066, arg1, arg0.field2987, var4, -25117, var3);
        }
        class228 var5 = (class228) class165.field2807.method1424(true, (long) arg0.field2987);
        if (var5 != null) {
            class253.method1724(var3, var5.field3913, arg1, 1490393848, var4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method470(boolean arg0) {
        field1072 = null;
        field1078 = null;
        if (arg0) {
            method471(-90, true, -121, -51, 95, (class90) null, (byte) 126);
        }
        field1073 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIIILdg;B)V")
    public static final void method471(int arg0, boolean arg1, int arg2, int arg3, int arg4, class90 arg5, byte arg6) {
        field1077++;
        long var7 = (long) ((arg4 << 16) + arg2);
        class232 var9 = (class232) class242.field4206.method1424(true, var7);
        if (var9 != null) {
            return;
        }
        class232 var10 = (class232) class132.field2188.method1424(true, var7);
        if (var10 != null) {
            return;
        }
        class232 var11 = (class232) class164.field2793.method1424(true, var7);
        if (var11 == null) {
            if (!arg1) {
                class232 var12 = (class232) class172.field2877.method1424(true, var7);
                if (var12 != null) {
                    return;
                }
            }
            class232 var13 = new class232();
            var13.field4066 = arg5;
            if (arg0 < 99) {
                field1080 = -39;
            }
            var13.field4061 = arg3;
            var13.field4060 = arg6;
            if (arg1) {
                class242.field4206.method1422(var7, var13, -1);
                class74.field1180++;
            } else {
                class25.field442.method633(var13, -121);
                class164.field2793.method1422(var7, var13, -1);
                class19.field348++;
            }
        } else if (arg1) {
            var11.method1128((byte) 20);
            class242.field4206.method1422(var7, var11, -1);
            class19.field348--;
            class74.field1180++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "run", descriptor = "()V")
    public final void run() {
        field1079++;
        try {
            while (true) {
                class247 var1 = class194.field3398;
                class131 var2;
                synchronized (class194.field3398) {
                    var2 = (class131) class194.field3398.method1686((byte) -83);
                }
                if (var2 == null) {
                    class95.method632(true, 100L);
                    Object var3 = class159.field2715;
                    synchronized (class159.field2715) {
                        if (class115.field1880 <= 1) {
                            class115.field1880 = 0;
                            class159.field2715.notifyAll();
                            return;
                        }
                        class115.field1880--;
                    }
                } else {
                    if (var2.field2164 == 0) {
                        var2.field2168.method1333((int) var2.field606, var2.field2165, var2.field2165.length, 124);
                        class247 var4 = class194.field3398;
                        synchronized (class194.field3398) {
                            var2.method290((byte) -48);
                        }
                    } else if (var2.field2164 == 1) {
                        var2.field2165 = var2.field2168.method1329((int) var2.field606, (byte) -126);
                        class247 var5 = class194.field3398;
                        synchronized (class194.field3398) {
                            class217.field3724.method1689(var2, 87);
                        }
                    }
                    Object var6 = class159.field2715;
                    synchronized (class159.field2715) {
                        if (class115.field1880 <= 1) {
                            class115.field1880 = 0;
                            class159.field2715.notifyAll();
                            return;
                        }
                        class115.field1880 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class83.method565(var17, (String) null, 124);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method472(int arg0) {
        field1075++;
        if (arg0 <= 84) {
            method469((class175) null, true, -106);
        }
        class203.field3485 = new class247();
    }
}
