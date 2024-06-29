import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class112 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Z")
    public static boolean field2154 = true;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2149 = -1;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[I")
    public static int[] field2153;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field2153 = null;
        if (arg0 != 1) {
            method756(-128, -96, 87, -108, -32, -125);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public static final void method755(int arg0, byte arg1) {
        if (arg1 >= -66) {
            field2154 = true;
        }
        field2152++;
        if (class244.field4258 == arg0) {
            return;
        }
        if (class244.field4258 == 0) {
            class198.method1295((byte) -79);
        }
        if (arg0 == 40) {
            class125.method863(class85.field1675, 104, class85.field1674, class166.field2988);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class61.field1027 != null) {
            class61.field1027.method1277(-23);
            class61.field1027 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class199.field3434 = 0;
            class96.field1842 = 1;
            class38.field568 = 1;
            class28.field426 = 0;
            class63.field1248 = 0;
            class163.method1102((byte) 108);
        }
        if (arg0 == 5) {
            class189.method1246(-10509, class242.field4238);
        } else {
            class138.method953(20);
        }
        boolean var3 = class244.field4258 == 5 || class244.field4258 == 10 || class244.field4258 == 28;
        if (var3 != var2) {
            if (var2) {
                class67.field1350 = class187.field3234;
                if (class164.field2936 == 0) {
                    class99.method678(2, (byte) 125);
                } else {
                    class257.method1721(false, 0, 2, class187.field3234, class28.field405, false, 255);
                }
                class91.method637(false, false);
            } else {
                class99.method678(2, (byte) 127);
                class91.method637(true, false);
            }
        }
        class244.field4258 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII)V")
    public static final void method756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2155++;
        int var8 = arg2 + 1;
        class194.method1266(arg3, (byte) -17, arg1, class15.field183[arg2], arg0);
        int var9 = arg4 - 1;
        class194.method1266(arg3, (byte) -17, arg1, class15.field183[arg4], arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class15.field183[var6];
            var7[arg3] = var7[arg0] = arg1;
        }
        if (arg5 < 12) {
            field2153 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBILr;I)V")
    public static final void method757(int arg0, byte arg1, int arg2, class66 arg3, int arg4) {
        class63 var5 = class218.method1401(arg0, false, arg4);
        field2151++;
        if (var5 == null) {
            return;
        }
        if (var5.field1179 != null) {
            class237 var6 = new class237();
            var6.field4115 = arg3;
            var6.field4120 = var5;
            var6.field4118 = var5.field1179;
            var6.field4127 = arg2;
            class8.method34(var6, 16);
        }
        boolean var7 = true;
        if (var5.field1131 > 0) {
            var7 = class51.method354(var5, 29905);
        }
        if (arg1 <= 38) {
            method756(21, 24, -15, -70, -12, 109);
        }
        if (!var7 || !class182.method1214(arg2 - 1, client.method592(var5), -32276)) {
            return;
        }
        if (arg2 == 1) {
            class89.field1731++;
            class28.field412.method578(104, 233);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 2) {
            class25.field321++;
            class28.field412.method578(95, 21);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 3) {
            class178.field3116++;
            class28.field412.method578(116, 169);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 4) {
            class28.field412.method578(-114, 214);
            class83.field1600++;
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 5) {
            class140.field2594++;
            class28.field412.method578(82, 173);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 6) {
            class68.field1355++;
            class28.field412.method578(119, 232);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 7) {
            class4.field50++;
            class28.field412.method578(-85, 133);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 8) {
            class28.field412.method578(-72, 102);
            class163.field2924++;
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 9) {
            class28.field412.method578(-94, 226);
            class27.field360++;
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
        if (arg2 == 10) {
            class264.field4624++;
            class28.field412.method578(124, 90);
            class28.field412.method1666(544537784, arg0);
            class28.field412.method1650(false, arg4);
        }
    }
}
