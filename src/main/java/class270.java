import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class270 extends OutputStream {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lvf;")
    public static class265 field4814 = class87.method582(-46, "OK");

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lvf;")
    public static class265 field4820 = class87.method582(-46, "::pcachesize");

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lvf;")
    public static class265 field4816 = class87.method582(-46, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lvf;")
    public static class265 field4822 = class87.method582(-46, "");

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lod;")
    public static class21 field4818;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLfl;Lfl;)I")
    public static final int method1853(byte arg0, class192 arg1, class192 arg2) {
        field4817++;
        int var3 = 0;
        if (arg2.method1330(class111.field1935, (byte) -85)) {
            var3++;
        }
        if (arg2.method1330(class56.field1136, (byte) -119)) {
            var3++;
        }
        if (arg0 >= -62) {
            return 51;
        }
        if (arg2.method1330(class223.field3978, (byte) -98)) {
            var3++;
        }
        if (arg1.method1330(class111.field1935, (byte) -72)) {
            var3++;
        }
        if (arg1.method1330(class56.field1136, (byte) -101)) {
            var3++;
        }
        if (arg1.method1330(class223.field3978, (byte) -118)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1854(int arg0) {
        field4816 = null;
        field4820 = null;
        if (arg0 < 61) {
            field4816 = null;
        }
        field4814 = null;
        field4822 = null;
        field4818 = null;
    }

    @OriginalMember(owner = "client!tg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4815++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method1855(int arg0) {
        if (class197.field3520 != null) {
            class197.field3520.method990(arg0 + 9);
            class197.field3520 = null;
        }
        class225.method1522(true);
        field4813++;
        class272.method1864();
        for (int var1 = 0; var1 < 4; var1++) {
            class130.field2279[var1].method1691((byte) -118);
        }
        class145.method1007(false, 179);
        System.gc();
        if (arg0 != -5) {
            method1854(7);
        }
        class123.method832(2, -26);
        class112.field1964 = false;
        class44.field980 = -1;
        class210.method1445(-125, true);
        class64.field1248 = 0;
        class45.field1006 = 0;
        class190.field3414 = false;
        class105.field1850 = 0;
        class231.field4073 = 0;
        for (int var2 = 0; var2 < class30.field771.length; var2++) {
            class30.field771[var2] = null;
        }
        class19.field520 = 0;
        class48.field1027 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class209.field3766[var3] = null;
            class36.field834[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class4.field67[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class210.field3768[var5][var6][var7] = null;
                }
            }
        }
        class39.method328((byte) -82);
        class126.field2262 = 0;
        class203.method1393((byte) -93);
        class166.method1096(true, -107);
    }
}
