import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class142 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Z")
    public boolean field2574 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lud;")
    public static class279 field2580 = class130.method1024(" GMT", 255);

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public static int[] field2582 = new int[2];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[Z")
    public static boolean[] field2573;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvh;II)V", line = 16)
    public final void method1088(class53 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method483(-120);
            if (var4 == 0) {
                if (arg2 > -11) {
                    this.method1088((class53) null, 6, 24);
                }
                field2575++;
                return;
            }
            this.method1093(arg1, var4, arg0, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lg;", line = 33)
    public final class158 method1089(int arg0, int arg1) {
        field2583++;
        class158 var3 = (class158) class132.field2409.method1336((long) (arg1 << 16 | this.field2576), 0);
        if (arg0 < 72) {
            field2579 = -77;
        }
        if (var3 != null) {
            return var3;
        }
        class130.field2387.method1186(this.field2576, -22698);
        class158 var4 = class8.method54(this.field2576, -3, class130.field2387, 0);
        if (var4 != null) {
            var4.method1242(class140.field2553, class230.field4008, class209.field3677);
            var4.field1033 = var4.field1027;
            var4.field1036 = var4.field1041;
            for (int var5 = 0; var5 < arg1; var5++) {
                var4.method1243();
            }
            class132.field2409.method1331(var4, 30237, (long) (arg1 << 16 | this.field2576));
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 73)
    public static void method1090(int arg0) {
        field2582 = null;
        field2573 = null;
        int var1 = 71 % ((arg0 - 75) / 36);
        field2580 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvh;I)V", line = 90)
    public static final void method1091(class53 arg0, int arg1) {
        field2571++;
        int var2 = arg0.method472((byte) 127);
        class229.field3983 = new class265[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class229.field3983[var3] = new class265();
            class229.field3983[var3].field4769 = arg0.method472((byte) 78);
            class229.field3983[var3].field4768 = arg0.method460((byte) -126);
        }
        if (arg1 != 20661) {
            return;
        }
        class162.field2919 = arg0.method472((byte) 75);
        class239.field4194 = arg0.method472((byte) 122);
        class57.field1212 = arg0.method472((byte) 84);
        class251.field4485 = new class42[class239.field4194 + 1 - class162.field2919];
        for (int var4 = 0; var4 < class57.field1212; var4++) {
            int var5 = arg0.method472((byte) 77);
            class42 var6 = class251.field4485[var5] = new class42();
            var6.field2594 = arg0.method483(-124);
            var6.field2591 = arg0.method453(1);
            var6.field884 = class162.field2919 + var5;
            var6.field882 = arg0.method460((byte) -71);
            var6.field883 = arg0.method460((byte) -86);
        }
        class248.field4416 = arg0.method453(1);
        class143.field2584 = true;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 139)
    public static final void method1092(int arg0) {
        field2578++;
        class39.field860.method260(-22746);
        int var1 = 0;
        int var2 = 5 / ((arg0 + 36) / 63);
        while (var1 < 32) {
            class80.field1556[var1] = 0L;
            var1++;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class249.field4448[var3] = 0L;
        }
        class284.field5076 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILvh;B)V", line = 171)
    private final void method1093(int arg0, int arg1, class53 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field2576 = arg2.method468(28214);
        } else if (arg1 == 2) {
            this.field2581 = arg2.method461((byte) -28);
        } else if (arg1 == 3) {
            this.field2574 = true;
        } else if (arg1 == 4) {
            this.field2576 = -1;
        }
        if (arg3 != -48) {
            method1092(76);
        }
        field2572++;
    }
}
