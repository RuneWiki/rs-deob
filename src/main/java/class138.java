import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class138 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lpj;")
    public static class237 field2382 = class33.method353("rot:", 67);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lpj;")
    public static class237 field2381 = class33.method353(" zuerst von Ihrer Freunde)2Liste(Q", 103);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lci;")
    public static class233 field2380 = new class233(64);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lpj;")
    public static class237 field2388 = class33.method353("Stufe:", 61);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lpj;")
    public static class237 field2391 = class33.method353(":", 72);

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
    public static int[] field2392 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lpj;")
    private static class237 field2393 = class33.method353("Loaded config", 110);

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lpj;")
    public static class237 field2390 = field2393;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field2389;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method953(int arg0) {
        field2393 = null;
        if (arg0 > -49) {
            field2382 = null;
        }
        field2389 = null;
        field2382 = null;
        field2388 = null;
        field2380 = null;
        field2381 = null;
        field2391 = null;
        field2390 = null;
        field2392 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method954(int arg0) {
        class108.field1923.method934((byte) 62);
        field2384++;
        if (arg0 != 12543016) {
            field2386 = 74;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLna;)Lna;")
    public abstract class31 method408(boolean arg0, class31 arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)I")
    public static final int method955(int arg0, boolean arg1) {
        if (arg1) {
            field2383++;
            return arg0 & 0xFF;
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2387++;
        for (int var5 = arg2; var5 < class68.field1348; var5++) {
            if (arg4 < (class260.field4458[var5] + class115.field2023[var5]) && arg0 + arg4 > class260.field4458[var5] && (class249.field4324[var5] + class183.field3215[var5]) > arg3 && (arg1 + arg3) > class183.field3215[var5]) {
                class114.field2008[var5] = true;
            }
        }
    }
}
