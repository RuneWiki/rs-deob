import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class231 extends Canvas {

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field3806;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Z")
    public static boolean field3808 = false;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[S")
    public static short[] field3804;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIII)V")
    public static final void method1614(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3797++;
        if (arg1 != -107) {
            field3804 = null;
        }
        int var6 = class51.method393(arg2, 0, class161.field2561, class51.field896);
        int var7 = class51.method393(arg3, 0, class161.field2561, class51.field896);
        int var8 = class51.method393(arg0, 0, class255.field4055, class9.field128);
        int var9 = class51.method393(arg4, 0, class255.field4055, class9.field128);
        for (int var10 = var6; var10 <= var7; var10++) {
            class56.method420(class29.field452[var10], arg5, -7, var8, var9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;Lj;III)Lbc;")
    public static final class175 method1615(Component arg0, class165 arg1, int arg2, int arg3, int arg4) {
        field3805++;
        if (class99.field1621 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class175 var5 = (class175) Class.forName("ua").getDeclaredConstructor().newInstance();
                var5.field2761 = arg3;
                var5.field2747 = new int[(class133.field2128 ? 2 : 1) * 256];
                var5.method837(arg0);
                var5.field2768 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2768 > 16384) {
                    var5.field2768 = 16384;
                }
                var5.method838(var5.field2768);
                if (class72.field1170 > 0 && class281.field4453 == null) {
                    class281.field4453 = new class183();
                    class281.field4453.field2868 = arg1;
                    arg1.method1133(class72.field1170, class281.field4453, (byte) 116);
                }
                if (class281.field4453 != null) {
                    if (class281.field4453.field2877[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class281.field4453.field2877[arg2] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class171 var6 = new class171(arg1, arg2);
                    var6.field2761 = arg3;
                    var6.field2747 = new int[(class133.field2128 ? 2 : 1) * 256];
                    int var7 = 36 % ((arg4 - 34) / 41);
                    var6.method837(arg0);
                    var6.field2768 = 16384;
                    var6.method838(var6.field2768);
                    if (class72.field1170 > 0 && class281.field4453 == null) {
                        class281.field4453 = new class183();
                        class281.field4453.field2868 = arg1;
                        arg1.method1133(class72.field1170, class281.field4453, (byte) 93);
                    }
                    if (class281.field4453 != null) {
                        if (class281.field4453.field2877[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class281.field4453.field2877[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class175();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3802++;
        this.field3806.paint(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public static final int method1616(int arg0) {
        field3796++;
        if (class153.field2479 == null) {
            return -1;
        } else if (arg0 == -1) {
            while (class153.field2479.field275 > class8.field97) {
                if (class153.field2479.method129(-119, class8.field97)) {
                    return class8.field97++;
                }
                class8.field97++;
            }
            return -1;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static final void method1617(int arg0) {
        class193.field3095.method481(false);
        class227.field3757.method481(false);
        field3801++;
        int var1 = 17 % ((70 - arg0) / 45);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BC)Z")
    public static final boolean method1618(byte arg0, char arg1) {
        field3799++;
        if (arg0 <= 62) {
            field3798 = -101;
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field3804 = null;
        if (arg0 != -1) {
            field3798 = 116;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/Object;Lj;)V")
    public static final void method1620(byte arg0, Object arg1, class165 arg2) {
        field3803++;
        if (arg2.field2622 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 68) {
            field3808 = true;
        }
        while (var3 < 50 && arg2.field2622.peekEvent() != null) {
            class43.method358(1L, false);
            var3++;
        }
        if (arg1 != null) {
            arg2.field2622.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method1621(int arg0, int arg1, int arg2) {
        field3810++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class135 var3 = class209.method1447(arg2, -6653);
        if (arg1 > -103) {
            method1617(-83);
        }
        return var3.method954(arg0, (byte) 9);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class231(Component arg0) {
        this.field3806 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        class68.field1113.method534((byte) -6, 1);
        class68.field1113.method1502((byte) 122, 0L);
        if (arg0 != 20) {
            method1620((byte) 46, (Object) null, (class165) null);
        }
        class275.field4348++;
        field3807++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBII)V")
    public static final void method1623(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class68.field1113.field3655 = 0;
        if (arg2 != -64) {
            return;
        }
        field3809++;
        class68.field1113.method1548(-494964184, 20);
        class68.field1113.method1548(-494964184, arg1);
        class68.field1113.method1548(-494964184, arg0);
        class68.field1113.method1554(arg4, (byte) 89);
        class68.field1113.method1554(arg3, (byte) 89);
        class138.field2264 = 1;
        class273.field4310 = 0;
        class145.field2330 = -3;
        class70.field1154 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3806.update(arg0);
        field3800++;
    }
}
