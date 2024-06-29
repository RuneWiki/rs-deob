import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class165 extends class268 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Ljd;")
    public static class86 field3087 = class122.method868("::rebuild", true);

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Ljd;")
    public static class86 field3089 = class122.method868("(U0a )2 in: ", true);

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Luk;")
    public static class96 field3088 = new class96(100);

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Ljd;")
    public static class86 field3096 = class122.method868("; Max)2Age=", true);

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Ljd;")
    public static class86 field3095 = class122.method868("::tele ", true);

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field3089 = null;
        field3087 = null;
        if (arg0 <= -55) {
            field3088 = null;
            field3095 = null;
            field3096 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public static final void method1191(boolean arg0, int arg1) {
        for (class14 var2 = (class14) class258.field4574.method1737((byte) 74); var2 != null; var2 = (class14) class258.field4574.method1740(-8843)) {
            if (var2.field420 != null) {
                class2.field18.method366(var2.field420);
                var2.field420 = null;
            }
            if (var2.field424 != null) {
                class2.field18.method366(var2.field424);
                var2.field424 = null;
            }
            var2.method1477(1);
        }
        field3092++;
        if (arg0) {
            for (class14 var3 = (class14) class82.field1613.method1737((byte) 74); var3 != null; var3 = (class14) class82.field1613.method1740(-8843)) {
                if (var3.field420 != null) {
                    class2.field18.method366(var3.field420);
                    var3.field420 = null;
                }
                var3.method1477(1);
            }
            for (class14 var4 = (class14) class149.field2774.method1709(-68); var4 != null; var4 = (class14) class149.field2774.method1704(-105)) {
                if (var4.field420 != null) {
                    class2.field18.method366(var4.field420);
                    var4.field420 = null;
                }
                var4.method1477(1);
            }
        }
        int var5 = -48 / ((arg1 + 69) / 35);
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)[Lod;")
    public static final class90[] method1192(int arg0) {
        field3090++;
        class90[] var1 = new class90[class64.field1270];
        for (int var2 = 0; var2 < class64.field1270; var2++) {
            int var3 = class24.field592[var2] * class191.field3393[var2];
            byte[] var4 = class213.field3857[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class268.field4718[class1.method5(255, var4[var6])];
            }
            var1[var2] = new class167(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], var5);
        }
        if (arg0 == 255) {
            class127.method894((byte) 20);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
    public static final void method1193(int arg0, int arg1) {
        field3091++;
        class16.field463--;
        if (class16.field463 == arg0) {
            return;
        }
        class250.method1692(class46.field1022, arg0 + 1, class46.field1022, arg0, class16.field463 - arg0);
        class250.method1692(class188.field3332, arg0 + 1, class188.field3332, arg0, class16.field463 - arg0);
        class250.method1690(class273.field4784, arg0 + 1, class273.field4784, arg0, class16.field463 - arg0);
        class250.method1689(class68.field1333, arg0 + 1, class68.field1333, arg0, class16.field463 - arg0);
        class250.method1693(class241.field4321, arg0 + 1, class241.field4321, arg0, class16.field463 - arg0);
        if (arg1 == 10120) {
            class250.method1693(class137.field2612, arg0 + 1, class137.field2612, arg0, class16.field463 - arg0);
        }
    }
}
