import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class600 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lfc;")
    private class262 field8353 = new class262(64);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lni;")
    private class522 field8355;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lea;")
    public static class547 field8357 = new class547(35, -1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lkba;")
    public static class108 field8354;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8359;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3320(byte arg0) {
        if (arg0 == -109) {
            field8359 = null;
            field8357 = null;
            field8354 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Llm;")
    public final class500 method3321(int arg0, int arg1) {
        field8356++;
        class262 var3 = this.field8353;
        class500 var4;
        synchronized (this.field8353) {
            var4 = (class500) this.field8353.method1571(arg0 - 133, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field8355;
        byte[] var6;
        synchronized (this.field8355) {
            var6 = this.field8355.method2885(arg1, 5, false);
        }
        class500 var7 = new class500();
        if (var6 != null) {
            var7.method2792(new class611(var6), -125);
        }
        class262 var8 = this.field8353;
        synchronized (this.field8353) {
            this.field8353.method1574((long) arg1, var7, (byte) -80);
        }
        if (arg0 != 9) {
            method3322(-13, null, 80, -89);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILsba;II)V")
    public static final void method3322(int arg0, class218 arg1, int arg2, int arg3) {
        field8360++;
        if (class595.field8291) {
            class135 var4 = class77.field944 == -1 ? null : class482.field6654.method296((byte) 31, class77.field944);
            if (client.method1835(arg1).method3966((byte) 74) && (class372.field5190 & 0x20) != 0 && (var4 == null || arg1.method1239(arg0 ^ 0x56DA, var4.field1718, class77.field944) != var4.field1718)) {
                class271.field3574++;
                class218.method1237(false, true, 0L, class387.field5461, arg1.field2769, class719.field10067 + " -> " + arg1.field2683, false, arg1.field2708, 59, (long) (arg1.field2769 << 0 | arg1.field2708), arg1.field2771, false, class702.field9857);
            }
        }
        if (arg0 != 59) {
            return;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class729.method4093(arg1, (byte) 66, var5);
            if (var9 != null) {
                class579.field8120++;
                class218.method1237(false, true, (long) (var5 + 1), class459.method2553(arg1, -127, var5), arg1.field2769, arg1.field2683, false, arg1.field2708, 1006, (long) (arg1.field2708 | arg1.field2769 << 0), arg1.field2771, false, var9);
            }
        }
        String var6 = class117.method771(-1, arg1);
        if (var6 != null) {
            class218.method1237(false, true, 0L, arg1.field2714, arg1.field2769, arg1.field2683, false, arg1.field2708, 21, (long) (arg1.field2769 << 0 | arg1.field2708), arg1.field2771, false, var6);
            class669.field9302++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class729.method4093(arg1, (byte) 65, var7);
            if (var8 != null) {
                class579.field8120++;
                class218.method1237(false, true, (long) (var7 + 1), class459.method2553(arg1, arg0 ^ 0xFFFFFFB6, var7), arg1.field2769, arg1.field2683, false, arg1.field2708, 49, (long) (arg1.field2708 | arg1.field2769 << 0), arg1.field2771, false, var8);
            }
        }
        if (!client.method1835(arg1).method3968(1964468)) {
            return;
        }
        class641.field8919++;
        if (arg1.field2809 == null) {
            class218.method1237(false, true, 0L, -1, arg1.field2769, "", false, arg1.field2708, 9, (long) (arg1.field2708 | arg1.field2769 << 0), arg1.field2771, false, class755.field10489.method4201(class723.field10095, (byte) 25));
        } else {
            class218.method1237(false, true, 0L, -1, arg1.field2769, "", false, arg1.field2708, 9, (long) (arg1.field2708 | arg1.field2769 << 0), arg1.field2771, false, arg1.field2809);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method3323(boolean arg0) {
        class751.field10414 = false;
        field8358++;
        class340.method2004(2);
        if (!arg0) {
            field8357 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
    public static final boolean method3324(boolean arg0) {
        field8352++;
        if (arg0) {
            field8354 = null;
        }
        return class226.field2934 == 0 ? class68.field755.method4023(-3619) : true;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class600(class242 arg0, int arg1, class522 arg2) {
        this.field8355 = arg2;
        this.field8355.method2901(0, 5);
    }
}
