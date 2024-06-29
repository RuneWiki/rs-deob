import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 extends class161 {

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Lp;")
    private static class280 field858 = class18.method140((byte) -120, "Discard");

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lp;")
    public static class280 field853 = field858;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Lp;")
    public static class280 field861 = class18.method140((byte) -125, "cyan:");

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Ltg;")
    public static class180 field862;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BJ)V")
    public static final void method381(byte arg0, long arg1) {
        field857++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 > -91) {
            field861 = null;
        }
        for (int var3 = 0; var3 < class273.field4753; var3++) {
            if (class76.field1248[var3] == arg1) {
                class19.field340++;
                class273.field4753--;
                for (int var4 = var3; var4 < class273.field4753; var4++) {
                    class76.field1248[var4] = class76.field1248[var4 + 1];
                    class11.field237[var4] = class11.field237[var4 + 1];
                }
                class259.field4597 = class237.field4118;
                class34.field627.method551(61, true);
                class34.field627.method219(arg1, -124);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILp;)V")
    public static final void method382(int arg0, class280 arg1) {
        if (arg0 >= 38) {
            field855++;
            class100.method710(5147, false);
            class273.method1818(-120, arg1);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)Z")
    public final boolean method383(byte arg0, int arg1, int arg2) {
        if (arg0 <= 91) {
            field853 = null;
        }
        field850++;
        return arg1 >= this.field860 && this.field851 >= arg1 && arg2 >= this.field849 && arg2 <= this.field852;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lp;")
    public static final class280 method384(byte arg0, int arg1) {
        field856++;
        class280 var2 = new class280();
        var2.field4907 = new byte[arg1];
        var2.field4908 = 0;
        int var3 = 77 / ((arg0 - 42) / 57);
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static final void method385(int arg0) {
        field859++;
        int var1 = class20.field367.method547(8, (byte) 61);
        if (class205.field3554 > var1) {
            for (int var2 = var1; var2 < class205.field3554; var2++) {
                class113.field1991[class24.field443++] = class250.field4376[var2];
            }
        }
        if (var1 > class205.field3554) {
            throw new RuntimeException("gppov1");
        }
        class205.field3554 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class250.field4376[var3];
            class142 var5 = class280.field4940[var4];
            int var6 = class20.field367.method547(1, (byte) 127);
            if (var6 == 0) {
                class250.field4376[class205.field3554++] = var4;
                var5.field4848 = class117.field2104;
            } else {
                int var7 = class20.field367.method547(2, (byte) 55);
                if (var7 == 0) {
                    class250.field4376[class205.field3554++] = var4;
                    var5.field4848 = class117.field2104;
                    class192.field3359[class204.field3543++] = var4;
                } else if (var7 == 1) {
                    class250.field4376[class205.field3554++] = var4;
                    var5.field4848 = class117.field2104;
                    int var8 = class20.field367.method547(3, (byte) 63);
                    var5.method1842(var8, 110, false);
                    int var9 = class20.field367.method547(1, (byte) 54);
                    if (var9 == 1) {
                        class192.field3359[class204.field3543++] = var4;
                    }
                } else if (var7 == 2) {
                    class250.field4376[class205.field3554++] = var4;
                    var5.field4848 = class117.field2104;
                    int var10 = class20.field367.method547(3, (byte) 105);
                    var5.method1842(var10, 113, true);
                    int var11 = class20.field367.method547(3, (byte) 36);
                    var5.method1842(var11, 68, true);
                    int var12 = class20.field367.method547(1, (byte) 45);
                    if (var12 == 1) {
                        class192.field3359[class204.field3543++] = var4;
                    }
                } else if (var7 == 3) {
                    class113.field1991[class24.field443++] = var4;
                }
            }
        }
        if (arg0 >= -88) {
            field853 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public static void method386(int arg0) {
        field858 = null;
        if (arg0 != 4) {
            field858 = null;
        }
        field861 = null;
        field853 = null;
        field862 = null;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static final void method387(int arg0) {
        if (arg0 >= -118) {
            method381((byte) -101, 110L);
        }
        field854++;
        if (class133.field2366 == 0) {
            return;
        }
        try {
            if ((++class154.field2664) > 2000) {
                if (class44.field727 != null) {
                    class44.field727.method1532(97);
                    class44.field727 = null;
                }
                if (class235.field4096 >= 1) {
                    class133.field2366 = 0;
                    class120.field2128 = -5;
                    return;
                }
                if (class238.field4132 == class152.field2637) {
                    class152.field2637 = class74.field1218;
                } else {
                    class152.field2637 = class238.field4132;
                }
                class235.field4096++;
                class133.field2366 = 1;
                class154.field2664 = 0;
            }
            if (class133.field2366 == 1) {
                class83.field1372 = class118.field2117.method1358(class152.field2637, -107, class54.field895);
                class133.field2366 = 2;
            }
            if (class133.field2366 == 2) {
                if (class83.field1372.field3025 == 2) {
                    throw new IOException();
                }
                if (class83.field1372.field3025 != 1) {
                    return;
                }
                class44.field727 = new class227((Socket) class83.field1372.field3028, class118.field2117);
                class83.field1372 = null;
                class44.field727.method1526(class34.field627.field481, 40, 0, class34.field627.field475);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                int var1 = class44.field727.method1529(0);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                if (var1 != 21) {
                    class133.field2366 = 0;
                    class120.field2128 = var1;
                    class44.field727.method1532(62);
                    class44.field727 = null;
                    return;
                }
                class133.field2366 = 3;
            }
            if (class133.field2366 == 3) {
                if (class44.field727.method1525(5000) < 1) {
                    return;
                }
                class13.field271 = new class280[class44.field727.method1529(0)];
                class133.field2366 = 4;
            }
            if (class133.field2366 == 4 && class44.field727.method1525(5000) >= (class13.field271.length * 8)) {
                class20.field367.field481 = 0;
                class44.field727.method1528(0, class13.field271.length * 8, (byte) 114, class20.field367.field475);
                for (int var2 = 0; var2 < class13.field271.length; var2++) {
                    class13.field271[var2] = class152.method1071(-88, class20.field367.method218(true));
                }
                class133.field2366 = 0;
                class120.field2128 = 21;
                class44.field727.method1532(95);
                class44.field727 = null;
            }
        } catch (IOException var3) {
            if (class44.field727 != null) {
                class44.field727.method1532(64);
                class44.field727 = null;
            }
            if (class235.field4096 < 1) {
                class235.field4096++;
                if (class238.field4132 == class152.field2637) {
                    class152.field2637 = class74.field1218;
                } else {
                    class152.field2637 = class238.field4132;
                }
                class154.field2664 = 0;
                class133.field2366 = 1;
            } else {
                class120.field2128 = -4;
                class133.field2366 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3) {
        this.field852 = arg3;
        this.field860 = arg0;
        this.field851 = arg2;
        this.field849 = arg1;
    }
}
