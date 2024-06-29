import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class20 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field343 = "Loading wordpack - ";

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "F")
    public static float field340;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method139(byte arg0) {
        int var1 = -12 / ((arg0 + 17) / 60);
        field343 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZB)V")
    public static final void method140(boolean arg0, byte arg1) {
        if (arg0) {
            if (class184.field2677 != -1) {
                class181.method1189(class184.field2677, 14670);
            }
            for (class123 var2 = (class123) class124.field1833.method315((byte) 6); var2 != null; var2 = (class123) class124.field1833.method310(-74)) {
                class102.method743(true, 100, var2);
            }
            class184.field2677 = -1;
            class124.field1833 = new class39(8);
            class162.method1092(4);
            class184.field2677 = class265.field4143;
            class178.method1177(false, false);
            class205.method1357(1);
            class62.method510(583304259, class184.field2677);
        }
        field345++;
        class181.field2642 = -1;
        class292.method1931(class240.field3725, (byte) -16);
        class185.field2687 = new class224();
        class185.field2687.field425 = 3000;
        if (arg1 > -20) {
            method139((byte) -56);
        }
        class185.field2687.field455 = 3000;
        if (class246.field3836 == 0) {
            class130.method892(1000, class36.field637);
            class88.method668(true, 10);
            return;
        }
        if (class133.field1954 == 2) {
            class90.field1377 = class44.field776 << 7;
            class209.field3127 = class178.field2607 << 7;
        } else {
            class103.method753(2);
        }
        class81.method632(true);
        class88.method668(true, 28);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Ljd;")
    private static final class227 method141(int arg0) {
        field346++;
        if (arg0 < 99) {
            return null;
        } else {
            class46 var1 = new class46(client.field729, class126.field1857, class135.field1973[0], class5.field69[0], class27.field525[0], class173.field2530[0], class209.field3125[0], class15.field221);
            class293.method1936(-101);
            return var1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILpk;I)Ljd;")
    public static final class227 method142(int arg0, class237 arg1, int arg2) {
        if (arg0 == 3000) {
            field344++;
            return class125.method878(arg2, arg1, -1) ? method141(104) : null;
        } else {
            return null;
        }
    }
}
