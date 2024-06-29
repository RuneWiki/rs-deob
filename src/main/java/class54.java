import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Laf;")
    private static class7 field1322 = class48.method406(40, "You can(Wt add yourself to your own ignore list");

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Laf;")
    public static class7 field1320 = field1322;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Laf;")
    public static class7 field1326 = class48.method406(40, "(U4");

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Laf;")
    public static class7 field1329 = class48.method406(40, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lpe;")
    public static class109 field1323;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field1324;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    public static int[] field1325;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public static final void method435(int arg0, boolean arg1) {
        field1318++;
        if (class2.field16 == null) {
            return;
        }
        try {
            if (arg0 <= 120) {
                field1326 = null;
            }
            class122 var2 = new class122(4);
            var2.method959(arg1 ? 2 : 3, (byte) -120);
            var2.method982(0, (byte) 58);
            class2.field16.method1178(4, (byte) -84, 0, var2.field2895);
        } catch (IOException var4) {
            try {
                class2.field16.method1172((byte) 10);
            } catch (Exception var3) {
            }
            class142.field3338++;
            class2.field16 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        class141.field3332.method136(25593);
        for (int var1 = 0; var1 < 32; var1++) {
            class96.field2285[var1] = 0L;
        }
        field1327++;
        if (arg0 >= -55) {
            method435(22, false);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class153.field3579[var2] = 0L;
        }
        class49.field1180 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILkb;ZI)Lfd;")
    public static final class40 method437(int arg0, class71 arg1, boolean arg2, int arg3) {
        field1321++;
        if (class67.method541(arg0, arg3, -95, arg1)) {
            if (!arg2) {
                method438(123);
            }
            return class73.method621(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method438(int arg0) {
        field1326 = null;
        field1323 = null;
        field1320 = null;
        int var1 = -91 % ((arg0 + 64) / 51);
        field1324 = null;
        field1329 = null;
        field1325 = null;
        field1322 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Laf;")
    public static final class7 method439(int arg0, int arg1) {
        field1328++;
        if (arg0 < 66) {
            return null;
        } else if (arg1 < 100000) {
            return class116.method905(new class7[] { class9.field254, class51.method421((byte) 121, arg1), class103.field2444 }, 1);
        } else if (arg1 < 10000000) {
            return class116.method905(new class7[] { class21.field540, class51.method421((byte) -29, arg1 / 1000), class66.field1438, class103.field2444 }, 1);
        } else {
            return class116.method905(new class7[] { class149.field3513, class51.method421((byte) 26, arg1 / 1000000), class122.field2890, class103.field2444 }, 1);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method440(int arg0) {
        field1319++;
        if (!class50.field1206) {
            return;
        }
        class103 var1 = class19.method177(class96.field2289, (byte) -80, class21.field534);
        if (var1 != null && var1.field2539 != null) {
            class39 var2 = new class39();
            var2.field967 = var1;
            var2.field962 = var1.field2539;
            class80.method675(arg0 ^ 0xFFFF8D52, var2);
        }
        class50.field1206 = false;
        class141.method1151(15569, var1);
        if (arg0 != 30077) {
            method435(127, true);
        }
    }
}
