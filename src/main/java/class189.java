import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class189 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lns;")
    public static class55 field2830 = new class55(0, 4);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lwl;")
    public static class452 field2836 = new class452(15, 8);

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[Z")
    public static boolean[] field2837 = new boolean[200];

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Ljg;")
    public static class241 field2838 = new class241(64);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field2839 = -1;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Ljk;")
    public static class119 field2840 = new class119(5000);

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
    public static boolean field2841 = false;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field2837 = null;
        field2830 = null;
        field2838 = null;
        if (arg0 != -22) {
            field2837 = null;
        }
        field2836 = null;
        field2840 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BC)Z")
    public static final boolean method1148(byte arg0, char arg1) {
        field2832++;
        if (arg0 < 34) {
            method1148((byte) -57, '>');
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class112.field1477;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public static final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2833++;
        field2840.field5666 = 0;
        field2840.method2366(class386.field5695.field6435, true);
        field2840.method2366(arg1, true);
        field2840.method2366(arg2, true);
        field2840.method2377(arg0, -47);
        field2840.method2377(arg4, arg3 ^ 0x67);
        class121.field1595 = 0;
        class426.field6269 = 1;
        class98.field1353 = arg3;
        class350.field5201 = 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        field2829++;
        if (class34.field423) {
            return;
        }
        if (class212.field3193) {
            class188.field2811 = (float) ((int) class188.field2811 - 17 & 0xFFFFFFF0);
        } else {
            class228.field3472 += (-class228.field3472 - 12.0F) / 2.0F;
        }
        if (arg0 == 0) {
            class34.field423 = true;
            class424.field6235 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIB)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -94) {
            return;
        }
        if (class465.field6842 != 0 && arg3 != 0 && class5.field64 < 50 && arg1 != -1) {
            class177.field2688[class5.field64] = arg1;
            class174.field2664[class5.field64] = arg3;
            class38.field469[class5.field64] = arg2;
            class278.field4230[class5.field64] = null;
            class20.field272[class5.field64] = 0;
            class438.field6445[class5.field64] = arg0;
            class5.field64++;
        }
        field2834++;
    }
}
