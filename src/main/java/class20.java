import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field303 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lv;")
    public static class146 field307 = class159.method1226((byte) -37, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lv;")
    private static class146 field305 = class159.method1226((byte) -37, "Walk here");

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lv;")
    public static class146 field308 = field305;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)[Lue;")
    public static final class144[] method110(byte arg0) {
        class144[] var1 = new class144[class3.field86];
        field301++;
        if (arg0 >= -120) {
            field303 = 82;
        }
        for (int var2 = 0; var2 < class3.field86; var2++) {
            class144 var3 = var1[var2] = new class144();
            var3.field3281 = class67.field1538;
            var3.field3285 = class22.field373;
            var3.field3284 = class37.field833[var2];
            var3.field3282 = class122.field2840[var2];
            var3.field3280 = class41.field935[var2];
            var3.field3287 = class30.field617[var2];
            var3.field3283 = class59.field1358;
            var3.field3286 = class46.field1063[var2];
        }
        class69.method492(81);
        return var1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lv;Lv;ILv;)V")
    public static final void method111(class146 arg0, class146 arg1, int arg2, class146 arg3) {
        if (arg2 > -115) {
            field312 = 20;
        }
        class134.field3062 = arg3;
        class134.field3070 = arg0;
        class134.field3066 = arg1;
        field302++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILla;)Lwd;")
    public static final class157 method112(boolean arg0, int arg1, class77 arg2) {
        field309++;
        byte[] var3 = arg2.method586(arg1, -80);
        if (var3 == null) {
            return null;
        } else {
            if (!arg0) {
                field305 = null;
            }
            return new class157(var3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILef;I)V")
    public static final void method113(int arg0, class35 arg1, int arg2) {
        if (arg2 != -5865) {
            field303 = -94;
        }
        field304++;
        class34.method228(arg1.field790, arg1.field757, arg0, 1990945680);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method114(int arg0) {
        if (arg0 != -105) {
            field308 = null;
        }
        field307 = null;
        field305 = null;
        field308 = null;
    }
}
