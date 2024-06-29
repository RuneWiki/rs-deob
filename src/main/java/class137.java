import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class137 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Loh;")
    private static class258 field2337 = class153.method1046("Tue", 122);

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Loh;")
    public static class258 field2333 = class153.method1046("::tele ", 115);

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Loh;")
    private static class258 field2341 = class153.method1046("Thu", 112);

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Loh;")
    private static class258 field2343 = class153.method1046("Sun", 91);

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Loh;")
    public static class258 field2340 = class153.method1046("_labels", 126);

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Loh;")
    public static class258 field2335 = class153.method1046("Cabbage", 111);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Loh;")
    private static class258 field2332 = class153.method1046("Sat", 110);

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Loh;")
    private static class258 field2347 = class153.method1046("Mon", 125);

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Loh;")
    private static class258 field2342 = class153.method1046("Wed", 104);

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[I")
    public static int[] field2346 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Loh;")
    private static class258 field2350 = class153.method1046("Fri", 102);

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[Loh;")
    public static class258[] field2344 = new class258[] { field2343, field2347, field2337, field2342, field2341, field2350, field2332 };

    @OriginalMember(owner = "client!am", name = "g", descriptor = "F")
    public static float field2338;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 44)
    public static void method953(int arg0) {
        field2341 = null;
        field2346 = null;
        field2342 = null;
        field2337 = null;
        field2340 = null;
        field2335 = null;
        field2350 = null;
        field2344 = null;
        field2333 = null;
        field2332 = null;
        field2343 = null;
        field2347 = null;
        if (arg0 != 6) {
            field2349 = 41;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 88)
    public static final void method954(Component arg0, int arg1) {
        field2339++;
        Method var2 = class295.field5077;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class215.field3729);
        arg0.addFocusListener(class215.field3729);
        if (arg1 != 26406) {
            method955(true);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 112)
    public static final void method955(boolean arg0) {
        int var1 = (class285.field4906 >> 10) + (class229.field3955 >> 3);
        int var2 = (class61.field1086 >> 10) + (class311.field5271 >> 3);
        field2334++;
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class276.field4764 = new int[var5];
        byte var6 = 8;
        class243.field4217 = new int[var5];
        class191.field3383 = new byte[var5][];
        class146.field2482 = new byte[var5][];
        class84.field1427 = new byte[var5][];
        class268.field4668 = new int[var5];
        class132.field2302 = new byte[var5][];
        class1.field8 = new int[var5][4];
        class144.field2427 = new int[var5];
        class32.field383 = new int[var5];
        class231.field3990 = new int[var5];
        class58.field925 = new byte[var5][];
        int var7 = 0;
        if (arg0) {
            return;
        }
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class231.field3990[var7] = var10;
                class268.field4668[var7] = class114.field2011.method1451(-127, class100.method755(-6, new class258[] { class93.field1642, class218.method1481(-83, var8), class255.field4374, class218.method1481(-106, var9) }));
                class276.field4764[var7] = class114.field2011.method1451(-126, class100.method755(-6, new class258[] { class220.field3806, class218.method1481(-41, var8), class255.field4374, class218.method1481(-110, var9) }));
                class32.field383[var7] = class114.field2011.method1451(-125, class100.method755(-6, new class258[] { class311.field5283, class218.method1481(85, var8), class255.field4374, class218.method1481(-51, var9) }));
                class144.field2427[var7] = class114.field2011.method1451(-124, class100.method755(-6, new class258[] { class232.field4020, class218.method1481(-74, var8), class255.field4374, class218.method1481(101, var9) }));
                class243.field4217[var7] = class114.field2011.method1451(-123, class100.method755(-6, new class258[] { class83.field1412, class218.method1481(117, var8), class255.field4374, class218.method1481(93, var9) }));
                if (class32.field383[var7] == -1) {
                    class268.field4668[var7] = -1;
                    class276.field4764[var7] = -1;
                    class144.field2427[var7] = -1;
                    class243.field4217[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class32.field383.length; var11++) {
            class32.field383[var11] = -1;
            class268.field4668[var11] = -1;
            class276.field4764[var11] = -1;
            class144.field2427[var11] = -1;
            class243.field4217[var11] = -1;
        }
        class201.method1334(var4, var1, var3, var6, true, 81, var2);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIBI)V", line = 196)
    public static final void method956(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class176.field3163 = class225.field3870 * arg4 / arg1;
        field2348++;
        class165.field2784 = class57.field907 * arg0 / arg2;
        class218.field3782 = -1;
        int var5 = -111 % ((-arg3 - 20) / 60);
        class299.field5122 = -1;
        class178.method1222(false);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public abstract void method435(int arg0);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)I")
    public abstract int method432(byte arg0, int arg1, int arg2);
}
