import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class245 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Z")
    public static boolean field4499 = false;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field4504 = -1;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lrc;")
    public static class188 field4502;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[[I")
    public static int[][] field4498;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
    public static final void method1604(int arg0, int arg1, int arg2, int arg3) {
        class52 var4 = class29.field489[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class64 var5 = var4.field956;
        if (var5 != null) {
            var5.field1169 = var5.field1169 * arg3 / 16;
            var5.field1167 = var5.field1167 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        field4498 = null;
        field4502 = null;
        if (arg0 > -35) {
            method1607(-22);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method1606(int arg0) {
        field4501++;
        int var1 = class126.field2332 - (int) ((double) class90.field1707.field3382 / class59.field1110);
        int var2 = class157.field3035 - (int) ((double) class90.field1707.field3424 / class59.field1110);
        int var3 = class126.field2332 + (int) ((double) class90.field1707.field3382 / class59.field1110);
        if (arg0 > var1) {
            class126.field2332 = (int) ((double) class90.field1707.field3382 / class59.field1110);
            class189.field3661 = -1;
            class34.field594 = -1;
        }
        if (class109.field1990 < var3) {
            class126.field2332 = class109.field1990 - (int) ((double) class90.field1707.field3382 / class59.field1110);
            class34.field594 = -1;
            class189.field3661 = -1;
        }
        int var4 = (int) ((double) class90.field1707.field3424 / class59.field1110) + class157.field3035;
        if (var2 < 0) {
            class157.field3035 = (int) ((double) class90.field1707.field3424 / class59.field1110);
            class189.field3661 = -1;
            class34.field594 = -1;
        }
        if (var4 > class44.field760) {
            class157.field3035 = class44.field760 - (int) ((double) class90.field1707.field3424 / class59.field1110);
            class189.field3661 = -1;
            class34.field594 = -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static final void method1607(int arg0) {
        field4505++;
        if (!class108.field1960) {
            class53.field994[0] = 1007;
            class66.field1191[0] = class6.field76;
            class203.field3864 = 1;
            class201.field3838[0] = class174.field3455;
        }
        if (class43.field723 != -1) {
            class217.method1473(class43.field723, -126);
        }
        for (int var1 = 0; var1 < class206.field3925; var1++) {
            if (class225.field4230[var1]) {
                class211.field4007[var1] = true;
            }
            class113.field2045[var1] = class225.field4230[var1];
            class225.field4230[var1] = false;
        }
        class225.field4231 = null;
        class58.field1101 = -1;
        class110.field2020 = class117.field2115;
        class133.field2489 = -1;
        if (class43.field723 != -1) {
            class206.field3925 = 0;
            class53.method393(class145.field2727, class43.field723, (byte) -39, 0, -1, 0, 0, 0, class222.field4194);
        }
        class72.method479();
        class22.method118(28360);
        if (class108.field1960) {
            class39.method258(92);
        } else if (class58.field1101 != -1) {
            class97.method681(15573, class133.field2489, class58.field1101);
        }
        if (class134.field2505 == 3) {
            for (int var2 = 0; var2 < class206.field3925; var2++) {
                if (class113.field2045[var2]) {
                    class72.method497(class81.field1455[var2], class132.field2473[var2], class133.field2487[var2], class80.field1447[var2], 16711935, 128);
                } else if (class211.field4007[var2]) {
                    class72.method497(class81.field1455[var2], class132.field2473[var2], class133.field2487[var2], class80.field1447[var2], 16711680, 128);
                }
            }
        }
        class15.method73(class240.field4458.field4123, class17.field261, class240.field4458.field4138, class149.field2909, (byte) 6);
        class17.field261 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIII)I")
    public static final int method1608(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4500++;
        if (~var4 == arg0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }
}
