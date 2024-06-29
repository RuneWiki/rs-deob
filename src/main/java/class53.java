import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class53 extends class376 {

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
    public static int[] field782 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "J")
    public static long field779;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 5)
    public static final void method357(int arg0) {
        if (class8.method59(arg0 + 23091)) {
            if (class173.field2458 == null) {
                class289.method1863((byte) 35);
            }
            class184.field2570 = new int[100];
            class309.field4241 = new boolean[100];
            class378.field5394 = true;
            class294.field4059 = new int[100];
            class247.field3423 = new int[100];
            class60.field848 = 0;
            for (int var1 = 0; var1 < 100; var1++) {
                class247.field3423[var1] = (int) ((double) class194.field2696 * Math.random());
                class294.field4059[var1] = (int) (Math.random() * 350.0D);
                class184.field2570[var1] = (int) (Math.random() * 102.0D);
                class309.field4241[var1] = Math.random() < 0.5D;
            }
            try {
                class261.field3576 = class331.field4489.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        field783++;
        if (arg0 != 100) {
            field782 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V", line = 51)
    public static final void method358(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class396.field5788 != 0 && arg3 != 0 && class145.field2115 < 50 && arg1 != -1) {
            class337.field4592[class145.field2115] = arg1;
            class270.field3681[class145.field2115] = arg3;
            class61.field935[class145.field2115] = arg4;
            class423.field6076[class145.field2115] = null;
            class4.field66[class145.field2115] = 0;
            class27.field438[class145.field2115] = arg0;
            class145.field2115++;
        }
        field784++;
        if (arg2 < 38) {
            field782 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 74)
    public static final void method359(int arg0, int arg1) {
        class165.field2359 = -1;
        field780++;
        class35.field545 = -1;
        if (arg0 != 24931) {
            field779 = 120L;
        }
        class339.field4742 = arg1;
        class245.method1536((byte) 54);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 90)
    public static void method360(byte arg0) {
        int var1 = -68 / ((12 - arg0) / 33);
        field782 = null;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V", line = 102)
    public static final void method361(byte arg0) {
        field778++;
        for (class308 var1 = (class308) class430.field6190.method1312((byte) 25); var1 != null; var1 = (class308) class430.field6190.method1304(-84)) {
            if (var1.field4223 == -1) {
                var1.field4215 = 0;
                class365.method2344(3, var1);
            } else {
                var1.method2459(198);
            }
        }
        if (arg0 >= -47) {
            field779 = -31L;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V", line = 127)
    public class53(int arg0, int arg1) {
        this.field785 = arg0;
        this.field781 = arg1;
    }
}
