import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class164 extends class84 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Z")
    private boolean field2277 = true;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public int field2271 = -1;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lbb;")
    private class200 field2278;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Z")
    public static boolean field2275 = false;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 6)
    public final void method956(int arg0) {
        if (arg0 != 2) {
            this.field2277 = false;
        }
        field2280++;
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 18)
    public final void method957(int arg0) {
        field2272++;
        if (arg0 != 29457) {
            method959(-33, 73);
        }
        this.field2277 = false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILml;Ljava/awt/Component;I)Ltg;", line = 31)
    public static final class140 method958(byte arg0, int arg1, class241 arg2, Component arg3, int arg4) {
        field2270++;
        if (class165.field2290 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class140 var5 = (class140) Class.forName("vb").getDeclaredConstructor().newInstance();
                var5.field2032 = arg4;
                var5.field2017 = new int[(class267.field3526 ? 2 : 1) * 256];
                var5.method740(arg3);
                var5.field2038 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2038 > 16384) {
                    var5.field2038 = 16384;
                }
                var5.method739(var5.field2038);
                if (class490.field6835 > 0 && class12.field167 == null) {
                    class12.field167 = new class481();
                    class12.field167.field6646 = arg2;
                    arg2.method1351(class490.field6835, 7000, class12.field167);
                }
                if (class12.field167 != null) {
                    if (class12.field167.field6643[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class12.field167.field6643[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class198 var6 = new class198(arg2, arg1);
                    var6.field2032 = arg4;
                    var6.field2017 = new int[(class267.field3526 ? 2 : 1) * 256];
                    if (arg0 != -72) {
                        method958((byte) -44, 90, (class241) null, (Component) null, 37);
                    }
                    var6.method740(arg3);
                    var6.field2038 = 16384;
                    var6.method739(var6.field2038);
                    if (class490.field6835 > 0 && class12.field167 == null) {
                        class12.field167 = new class481();
                        class12.field167.field6646 = arg2;
                        arg2.method1351(class490.field6835, arg0 + 7072, class12.field167);
                    }
                    if (class12.field167 != null) {
                        if (class12.field167.field6643[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class12.field167.field6643[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class140();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 120)
    public static final int method959(int arg0, int arg1) {
        if (arg1 != 255) {
            field2275 = true;
        }
        field2276++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        while (this.field2277) {
            this.field2278.method1141(this, 0);
        }
        field2279++;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lbb;)V", line = 158)
    public class164(class200 arg0) {
        this.field2278 = arg0;
    }
}
