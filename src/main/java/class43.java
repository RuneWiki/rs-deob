import java.awt.Component;
import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class43 extends InputStream {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public static int[] field616 = new int[2500];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[J")
    public static long[] field615 = new long[32];

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    public static int[] field613 = new int[14];

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/lang/String;")
    public static String field627 = "Prepared sound engine";

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field617 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lrf;")
    public static class241 field624;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method293(byte arg0) {
        if (arg0 != 74) {
            return;
        }
        field625++;
        if (class259.field3922 != null) {
            class99.method666(arg0 ^ 0xFFFFFFE4, class259.field3922);
            class259.field3922 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIILtk;IJZ)Z")
    public static final boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, class219 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class191.method1228(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    public static final boolean method295(int arg0, int arg1) {
        field620++;
        class55 var2 = class10.method90(arg1, true);
        if (var2 == null) {
            return false;
        } else if (class83.field1286 == 1 || class83.field1286 == 2 || class180.field2579 == 2) {
            class29.field415 = var2.field838;
            if (class180.field2579 != 0) {
                class39.field581 = class29.field415 + 40000;
                class132.field1939 = class29.field415 + 50000;
                class224.field3349 = class39.field581;
            }
            class60.field910 = var2.field844;
            return true;
        } else {
            String var3 = "";
            if (class180.field2579 != 0) {
                var3 = ":" + (var2.field838 + 7000);
            }
            if (arg0 <= 58) {
                return true;
            }
            String var4 = "";
            if (class39.field585 != null) {
                var4 = "/p=" + class39.field585;
            }
            String var5 = "http://" + var2.field844 + var3 + "/l=" + class149.field2135 + "/a=" + class76.field1177 + var4 + "/j" + (class272.field4303 ? "1" : "0") + ",o" + (class173.field2475 ? "1" : "0") + ",a2,m" + (class182.field2604 ? "1" : "0");
            try {
                class80.field1237.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "read", descriptor = "()I")
    public final int read() {
        field623++;
        class98.method660(30000L, -77);
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static void method296(byte arg0) {
        if (arg0 != -122) {
            field616 = null;
        }
        field616 = null;
        field615 = null;
        field613 = null;
        field627 = null;
        field624 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILca;Ljava/awt/Component;II)Lu;")
    public static final class223 method297(int arg0, class83 arg1, Component arg2, int arg3, int arg4) {
        field626++;
        if (class276.field4426 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class223 var5 = (class223) Class.forName("ge").getDeclaredConstructor().newInstance();
                var5.field3344 = arg0;
                var5.field3330 = new int[arg3 * (class24.field323 ? 2 : 1)];
                var5.method45(arg2);
                var5.field3337 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3337 > 16384) {
                    var5.field3337 = 16384;
                }
                var5.method43(var5.field3337);
                if (class108.field1565 > 0 && class286.field4546 == null) {
                    class286.field4546 = new class10();
                    class286.field4546.field172 = arg1;
                    arg1.method553(class286.field4546, false, class108.field1565);
                }
                if (class286.field4546 != null) {
                    if (class286.field4546.field167[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class286.field4546.field167[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class3 var6 = new class3(arg1, arg4);
                    var6.field3330 = new int[(class24.field323 ? 2 : 1) * 256];
                    var6.field3344 = arg0;
                    var6.method45(arg2);
                    var6.field3337 = 16384;
                    var6.method43(var6.field3337);
                    if (class108.field1565 > 0 && class286.field4546 == null) {
                        class286.field4546 = new class10();
                        class286.field4546.field172 = arg1;
                        arg1.method553(class286.field4546, false, class108.field1565);
                    }
                    if (class286.field4546 != null) {
                        if (class286.field4546.field167[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class286.field4546.field167[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class223();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lve;ILve;)V")
    public static final void method298(class233 arg0, int arg1, class233 arg2) {
        field621++;
        if (arg1 < 21) {
            method297(-99, (class83) null, (Component) null, -123, -73);
        }
        class156.field2282 = arg0;
        class192.field2739 = arg2;
    }
}
