import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lai;")
    public static class10 field266 = class44.method278("Anmelde)2Zeitlimit -Uberschritten)3", 101);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lai;")
    public static class10 field265 = class44.method278("headicons_hint", 116);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public static int[] field262;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    public static int[] field263;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field264;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JB)V")
    public static final void method124(long arg0, byte arg1) {
        field267++;
        if (arg0 == 0L) {
            return;
        }
        if (class78.field1375 >= 100) {
            class6.method20(0, class124.field2383, (byte) 117, class10.field119);
            return;
        }
        class10 var3 = class56.method381(arg0, (byte) 100).method39(-94);
        for (int var4 = 0; var4 < class78.field1375; var4++) {
            if (class153.field2935[var4] == arg0) {
                class6.method20(0, class67.method440(arg1, new class10[] { var3, class186.field3530 }), (byte) 117, class10.field119);
                return;
            }
        }
        for (int var5 = 0; var5 < class124.field2380; var5++) {
            if (class115.field2205[var5] == arg0) {
                class6.method20(0, class67.method440(0, new class10[] { class4.field43, var3, class148.field2821 }), (byte) 117, class10.field119);
                return;
            }
        }
        if (var3.method64(105, class145.field2767.field602)) {
            class6.method20(0, class117.field2269, (byte) 117, class10.field119);
            return;
        }
        class165.field3156++;
        class153.field2935[class78.field1375] = arg0;
        if (arg1 != 0) {
            field263 = null;
        }
        class11.field178[class78.field1375++] = class56.method381(arg0, (byte) 110);
        class98.field1812 = class7.field78;
        class76.field1323.method635((byte) -54, 32);
        class76.field1323.method783(arg0, arg1 - 88);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public static final int method125(int arg0) {
        field268++;
        int var1 = class145.method1003((byte) -88, class119.field2294, class34.field520, class42.field687);
        return var1 - class14.field226 >= arg0 || (class185.field3527[class42.field687][class119.field2294 >> 7][class34.field520 >> 7] & 0x4) == 0 ? 3 : class42.field687;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method126(int arg0) {
        field266 = null;
        if (arg0 != 3) {
            field262 = null;
        }
        field262 = null;
        field263 = null;
        field264 = null;
        field265 = null;
    }
}
