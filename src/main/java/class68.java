import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class68 extends class76 {

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "Z")
    public static boolean field1363 = false;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "[Lia;")
    public static class257[] field1362 = new class257[100];

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lia;")
    public static class257 field1366 = class28.method234(93, "");

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lld;")
    public static class51 field1361;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
    public static int[] field1364;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLia;I)V")
    public static final void method520(byte arg0, class257 arg1, int arg2) {
        class257 var3 = arg1.method1704(arg0 ^ -8373).method1717(-114);
        ++field1368;
        boolean var4 = false;
        for (int var5 = 0; ~var5 > ~class231.field3880; ++var5) {
            class180 var6 = class55.field1180[class132.field2362[var5]];
            if (var6 != null && var6.field3140 != null && var6.field3140.method1681((byte) 111, var3)) {
                class178.method1199(class137.field2441.field4119[0], (byte) 119, var6.field4182[0], 0, 1, 0, var6.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                var4 = true;
                if (arg2 == 1) {
                    ++class57.field1215;
                    class205.field3524.method908(false, 255);
                    class205.field3524.method1018((byte) -11, class132.field2362[var5]);
                } else if (arg2 == 4) {
                    ++class57.field1213;
                    class205.field3524.method908(false, 205);
                    class205.field3524.method1065(class132.field2362[var5], 1210792072);
                } else if (~arg2 != -7) {
                    if (~arg2 == -8) {
                        class205.field3524.method908(false, 142);
                        ++class220.field3730;
                        class205.field3524.method1054(class132.field2362[var5], 2);
                    }
                } else {
                    class205.field3524.method908(false, 46);
                    class205.field3524.method1065(class132.field2362[var5], 1210792072);
                    ++class102.field1886;
                }
                break;
            }
        }
        if (arg0 != 55) {
            field1361 = null;
        }
        if (!var4) {
            class197.method1317(-118, 0, class233.method1528(new class257[] { class238.field4088, var3 }, arg0 ^ 55), class17.field378);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field1359;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            field1362 = null;
        }
        if (super.field1467.field2980) {
            int[][] var4 = this.method565((byte) -20, 0, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; class96.field1807 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static void method521(int arg0) {
        if (arg0 != 1) {
            method522((byte) -13);
        }
        field1361 = null;
        field1364 = null;
        field1366 = null;
        field1362 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static final void method522(byte arg0) {
        if (arg0 != 114) {
            field1366 = null;
        }
        ++field1360;
        for (class34 var1 = (class34) class72.field1413.method288(26111); var1 != null; var1 = (class34) class72.field1413.method277(arg0 ^ 115)) {
            if (var1.field672 != -1) {
                var1.method254(1);
            } else {
                var1.field656 = 0;
                class25.method221(var1, (byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)I")
    public static final int method523(int arg0, int arg1) {
        ++field1369;
        return arg0 != 28305 ? -16 : arg1 & 255;
    }
}
