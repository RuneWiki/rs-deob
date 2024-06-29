import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public boolean field2127 = true;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2129 = new Object();

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public int[] field2139 = new int[500];

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field2140 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "[I")
    public int[] field2141 = new int[500];

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lrd;")
    private static class117 field2130 = class95.method812(" has logged in)3", (byte) 8);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lrd;")
    public static class117 field2125 = class95.method812("M", (byte) 8);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lrd;")
    public static class117 field2126 = class95.method812("invback", (byte) 8);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lrd;")
    public static class117 field2135 = field2130;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lmb;")
    public static class85 field2128 = new class85(20);

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lrd;")
    public static class117 field2144 = class95.method812("mapback", (byte) 8);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lra;")
    public static class114 field2143;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZLge;)Lcd;")
    public static final class19 method745(int arg0, int arg1, boolean arg2, class47 arg3) {
        if (arg2) {
            return null;
        } else {
            field2133++;
            return class90.method790(arg0, arg3, 16711680, arg1) ? class52.method567(-29807) : null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
    public final void run() {
        field2138++;
        while (this.field2127) {
            Object var1 = this.field2129;
            synchronized (this.field2129) {
                if (this.field2140 < 500) {
                    this.field2139[this.field2140] = class121.field2961;
                    this.field2141[this.field2140] = class66.field1878;
                    this.field2140++;
                }
            }
            class60.method611(50L, true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
    public static final void method746(int arg0, byte arg1, int arg2) {
        class7.field157++;
        class25.field754.method739(false, 242);
        field2132++;
        class25.field754.method149(arg0, -20912);
        class25.field754.method130(87, arg2);
        if (arg1 <= 108) {
            method748((byte) -17, -37, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method747(byte arg0) {
        field2128 = null;
        field2144 = null;
        if (arg0 < 59) {
            return;
        }
        field2135 = null;
        field2125 = null;
        field2143 = null;
        field2126 = null;
        field2130 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIZ)Lrd;")
    public static final class117 method748(byte arg0, int arg1, boolean arg2) {
        field2134++;
        return arg0 > -64 ? null : class61.method620(arg1, arg2, -17485, 10);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILjava/awt/Component;)Lga;")
    public static final class44 method749(int arg0, int arg1, int arg2, Component arg3) {
        field2137++;
        try {
            if (arg1 != -325) {
                method745(80, 9, true, null);
            }
            Class var4 = Class.forName("le");
            class44 var5 = (class44) var4.getDeclaredConstructor().newInstance();
            var5.method486(arg2, (byte) 122, arg3, arg0);
            return var5;
        } catch (Throwable var7) {
            class90 var6 = new class90();
            var6.method486(arg2, (byte) 127, arg3, arg0);
            return var6;
        }
    }
}
