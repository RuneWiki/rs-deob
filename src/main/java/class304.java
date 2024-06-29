import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class304 extends class57 {

    @OriginalMember(owner = "client!c", name = "W", descriptor = "Lna;")
    private static class26 field5235 = class69.method505(" has logged in)3", (byte) -120);

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "Lna;")
    public static class26 field5238 = field5235;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Lna;")
    public static class26 field5237 = class69.method505("Mem:", (byte) -128);

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Z")
    public static boolean field5246 = false;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "Lge;")
    public class153 field5236;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "[B")
    public byte[] field5239;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[Lec;")
    public static class39[] field5240;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)[B", line = 4)
    public final byte[] method415(boolean arg0) {
        field5247++;
        if (arg0) {
            field5246 = true;
        }
        if (this.field930) {
            throw new RuntimeException();
        }
        return this.field5239;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z", line = 23)
    public static final boolean method2133(int arg0) {
        field5248++;
        class22 var1 = class320.field5503;
        synchronized (class320.field5503) {
            if (class33.field558 == class287.field4803) {
                return false;
            }
            class33.field562 = class271.field4530[class33.field558];
            class309.field5319 = class53.field846[class33.field558];
            class33.field558 = class33.field558 + 1 & 0x7F;
            if (arg0 < 58) {
                method2133(68);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V", line = 48)
    public static void method2134(byte arg0) {
        field5240 = null;
        field5237 = null;
        if (arg0 > 33) {
            field5238 = null;
            field5235 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Frame;ZLll;)V", line = 65)
    public static final void method2135(Frame arg0, boolean arg1, class156 arg2) {
        if (!arg1) {
            method2136(110, 94);
        }
        field5244++;
        while (true) {
            class180 var3 = arg2.method1067(arg0, 86);
            while (var3.field2811 == 0) {
                class126.method862(10L, 64);
            }
            if (var3.field2811 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class126.method862(100L, 64);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)I", line = 108)
    public final int method414(boolean arg0) {
        field5245++;
        if (arg0) {
            this.field5236 = (class153) null;
        }
        return this.field930 ? 0 : 100;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)V", line = 131)
    public static final void method2136(int arg0, int arg1) {
        if (arg0 < 83) {
            method2134((byte) 122);
        }
        class244.field4009.method1985(-127, arg1);
        field5242++;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II)V", line = 149)
    public static final void method2137(int arg0, int arg1) {
        if (arg1 > 108) {
            field5233++;
            class153.field2390.method1985(-128, arg0);
            class205.field3200.method1985(-125, arg0);
        }
    }
}
