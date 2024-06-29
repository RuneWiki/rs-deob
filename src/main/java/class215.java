import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class215 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field3079 = 16777215;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field3085 = 8;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3078 = new String[100];

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3080 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Z")
    public boolean field3084;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILlf;I)V", line = 4)
    private final void method1501(int arg0, int arg1, class130 arg2, int arg3) {
        field3094++;
        if (arg0 <= 61) {
            return;
        }
        if (arg1 == 1) {
            this.field3085 = arg2.method798(false);
        } else if (arg1 == 2) {
            this.field3084 = true;
        } else if (arg1 == 3) {
            this.field3077 = arg2.method844(698527688);
            this.field3086 = arg2.method844(698527688);
            this.field3096 = arg2.method844(698527688);
            return;
        } else if (arg1 == 4) {
            this.field3087 = arg2.method837(true);
            return;
        } else if (arg1 == 5) {
            this.field3091 = arg2.method798(false);
            return;
        } else if (arg1 == 6) {
            this.field3079 = arg2.method839((byte) -92);
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I", line = 52)
    public static final int method1502(int arg0, byte arg1) {
        field3089++;
        if (arg1 > -61) {
            method1510(-16, -59);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 63)
    public static final void method1503(int arg0) {
        field3090++;
        class405.field5681.method102((byte) -87);
        if (arg0 <= -98) {
            class83.field1056.method102((byte) -105);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 85)
    public static void method1504(int arg0) {
        if (arg0 < 60) {
            field3081 = 104;
        }
        field3078 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 101)
    public static final int method1505(int arg0, int arg1) {
        if (arg0 == -715567576) {
            field3093++;
            return arg1 >>> 8;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 112)
    public static final String method1506(byte arg0, String arg1) {
        field3092++;
        if (arg0 > -90) {
            method1509(true, 81, (class219) null, -73, (Component) null);
        }
        String var2 = class141.method1065((byte) -85, class407.method2561(arg1, 76));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLlf;)V", line = 129)
    public final void method1507(int arg0, byte arg1, class130 arg2) {
        field3088++;
        while (true) {
            int var4 = arg2.method837(true);
            if (var4 == 0) {
                if (arg1 == -116) {
                    return;
                } else {
                    this.field3084 = true;
                    return;
                }
            }
            this.method1501(88, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 153)
    public static final void method1508(int arg0) {
        field3082++;
        if (class415.field5926 == 0) {
            return;
        }
        try {
            if (++class103.field1332 > 2000) {
                if (class199.field2847 != null) {
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                }
                if (class429.field6100 >= 1) {
                    class44.field599 = -5;
                    class415.field5926 = 0;
                    return;
                }
                class415.field5926 = 1;
                class429.field6100++;
                if (class30.field371 == class291.field4234) {
                    class291.field4234 = class150.field2246;
                } else {
                    class291.field4234 = class30.field371;
                }
                class103.field1332 = 0;
            }
            if (class415.field5926 == 1) {
                class398.field5596 = class401.field5628.method1536(class291.field4234, class220.field3162, 2099);
                class415.field5926 = 2;
            }
            if (class415.field5926 == 2) {
                if (class398.field5596.field2298 == 2) {
                    throw new IOException();
                }
                if (class398.field5596.field2298 != 1) {
                    return;
                }
                class199.field2847 = new class148((Socket) class398.field5596.field2295, class401.field5628);
                class398.field5596 = null;
                class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-116);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-128);
                }
                int var1 = class199.field2847.method1098((byte) 22);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-110);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-92);
                }
                if (var1 != 21) {
                    class415.field5926 = 0;
                    class44.field599 = var1;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    return;
                }
                class415.field5926 = 3;
            }
            if (class415.field5926 == 3) {
                if (class199.field2847.method1089((byte) 114) < 1) {
                    return;
                }
                class253.field3754 = new String[class199.field2847.method1098((byte) 22)];
                class415.field5926 = 4;
            }
            if (class415.field5926 == 4) {
                if (class199.field2847.method1089((byte) -79) >= class253.field3754.length * 8) {
                    class352.field5114.field1880 = 0;
                    class199.field2847.method1096(class253.field3754.length * 8, class352.field5114.field1851, -1, 0);
                    for (int var2 = 0; var2 < class253.field3754.length; var2++) {
                        class253.field3754[var2] = class228.method1586(class352.field5114.method804(893309448), (byte) -80);
                    }
                    class44.field599 = 21;
                    class415.field5926 = 0;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                }
            } else if (arg0 != 6165) {
                field3080 = -115;
            }
        } catch (IOException var3) {
            if (class199.field2847 != null) {
                class199.field2847.method1093(false);
                class199.field2847 = null;
            }
            if (class429.field6100 < 1) {
                class415.field5926 = 1;
                class429.field6100++;
                if (class30.field371 == class291.field4234) {
                    class291.field4234 = class150.field2246;
                } else {
                    class291.field4234 = class30.field371;
                }
                class103.field1332 = 0;
            } else {
                class44.field599 = -4;
                class415.field5926 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILml;ILjava/awt/Component;)Lng;", line = 313)
    public static final class190 method1509(boolean arg0, int arg1, class219 arg2, int arg3, Component arg4) {
        field3095++;
        if (class246.field3671 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class190 var5 = (class190) Class.forName("hp").getDeclaredConstructor().newInstance();
                var5.field2763 = arg1;
                var5.field2727 = new int[(class46.field615 ? 2 : 1) * 256];
                var5.method1287(arg4);
                var5.field2753 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field2753 > 16384) {
                    var5.field2753 = 16384;
                }
                var5.method1290(var5.field2753);
                if (class320.field4681 > 0 && class357.field5164 == null) {
                    class357.field5164 = new class153();
                    class357.field5164.field2272 = arg2;
                    arg2.method1538(class320.field4681, 82, class357.field5164);
                }
                if (class357.field5164 != null) {
                    if (class357.field5164.field2269[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class357.field5164.field2269[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class274 var6 = new class274(arg2, arg3);
                    var6.field2763 = arg1;
                    var6.field2727 = new int[(class46.field615 ? 2 : 1) * 256];
                    var6.method1287(arg4);
                    var6.field2753 = 16384;
                    var6.method1290(var6.field2753);
                    if (class320.field4681 > 0 && class357.field5164 == null) {
                        class357.field5164 = new class153();
                        class357.field5164.field2272 = arg2;
                        arg2.method1538(class320.field4681, 54, class357.field5164);
                    }
                    if (class357.field5164 != null) {
                        if (class357.field5164.field2269[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class357.field5164.field2269[arg3] = var6;
                    }
                    if (arg0) {
                        field3078 = null;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class190();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V", line = 396)
    public static final void method1510(int arg0, int arg1) {
        field3083++;
        if (class403.field5651 == null || class403.field5651.length < arg0) {
            class403.field5651 = new int[arg0];
        }
        if (arg1 != -11397) {
            field3080 = -71;
        }
    }
}
