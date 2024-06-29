import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class205 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3093 = "Loaded wordpack";

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3102 = 50;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public static int[] field3097 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
    public static int[] field3099 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3096 = new String[field3102];

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[I")
    public static int[] field3105 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    public static int[] field3101 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field3103 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[I")
    public static int[] field3106 = new int[25];

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
    public static int[] field3111 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    public static int[] field3091 = new int[field3102];

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public static boolean field3107 = false;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "S")
    public static short field3109 = 1;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lfm;")
    public static class200 field3110;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 60)
    public static final void method1376(int arg0) {
        class192.method1310((byte) -110);
        class165.method1125((byte) -99);
        class85.method583(arg0 ^ 0x50);
        class242.method1647(1082299393);
        field3098++;
        class72.method516(192);
        class19.method150(-59);
        class253.method1706(0);
        class90.method618(-28104);
        class95.method647(true);
        class37.method263(-256);
        class235.method1601(arg0 ^ 0xFFFFFFB8);
        class15.method121((byte) 121);
        class87.method593(arg0 ^ arg0);
        class181.method1255(-1506);
        class82.method570((byte) -122);
        class109.method740(64);
        class342.method2385(-1);
        class93.method636(true);
        if (class165.field2534 != 0) {
            for (int var1 = 0; var1 < class117.field1814.length; var1++) {
                class117.field1814[var1] = null;
            }
            class222.field3548 = 0;
        }
        class204.method1373(false);
        class222.method1485((byte) 32);
        class68.field1023.method1298((byte) 110);
        if (!class333.field5166) {
            ((class97) class12.field126).method672(arg0 - 108);
        }
        class138.field2140.method351(0);
        class231.field3728.method2082(0);
        class199.field2990.method2082(0);
        class36.field455.method2082(0);
        class311.field4935.method2082(0);
        class297.field4554.method2082(0);
        class211.field3353.method2082(0);
        class54.field762.method2082(arg0 ^ 0x0);
        class121.field1859.method2082(0);
        class81.field1201.method2082(0);
        class269.field4142.method2082(0);
        class236.field3795.method2082(0);
        class166.field2555.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 123)
    public static void method1377(int arg0) {
        field3093 = null;
        field3106 = null;
        field3096 = null;
        field3111 = null;
        field3097 = null;
        field3091 = null;
        field3103 = null;
        field3105 = null;
        field3110 = null;
        field3101 = null;
        field3099 = null;
        int var1 = 94 % ((arg0 - 25) / 52);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lpe;", line = 195)
    public static final class345 method1378(int arg0, int arg1) {
        field3092++;
        class345 var2 = (class345) class265.field4088.method1294((long) arg0, 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4153.method2103(0, class240.method1643(arg0, false), class175.method1188((byte) -26, arg0));
        if (arg1 != -29934) {
            return (class345) null;
        }
        class345 var4 = new class345();
        if (var3 != null) {
            var4.method2399((byte) -77, new class303(var3));
        }
        class265.field4088.method1292((long) arg0, -94, var4);
        return var4;
    }
}
