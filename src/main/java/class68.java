import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class68 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Ltl;")
    public static class197 field1009 = null;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lff;")
    public static class47 field1008 = new class47(32);

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lve;")
    public static class255 field1014 = class87.method607(46, "::fpsoff");

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field1017 = -1;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lve;")
    private static class255 field1021 = class87.method607(65, "flash1:");

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lve;")
    public static class255 field1019 = field1021;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Lve;")
    public static class255 field1022 = field1021;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[I")
    public static int[] field1018 = new int[32];

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lve;")
    public static class255 field1020 = class87.method607(41, "name_icons");

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lwl;")
    public static class81 field1015 = new class81(20);

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Lve;")
    public static class255 field1023 = class87.method607(30, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lrg;")
    public static class88 field1013;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1024;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method411(boolean arg0, int arg1) {
        field1011++;
        class113.field1911[1] = (float) class154.method1134(255, arg1 >> 8) / 255.0F;
        class113.field1911[2] = (float) class154.method1134(arg1, 255) / 255.0F;
        class113.field1911[0] = (float) (class154.method1134(16755174, arg1) >> 16) / 255.0F;
        if (arg0) {
            method412(65, 49, -110, -49);
        }
        class85.method595(3, 0);
        class85.method595(4, 0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V", line = 29)
    public static final void method412(int arg0, int arg1, int arg2, int arg3) {
        field1007++;
        class255 var4 = class3.method14(new class255[] { class70.field1117, class215.method1532(arg1, true), class269.field4633, class215.method1532(arg2 >> 6, true), class269.field4633, class215.method1532(arg0 >> 6, true), class269.field4633, class215.method1532(arg2 & 0x3F, true), class269.field4633, class215.method1532(arg0 & 0x3F, true) }, (byte) -62);
        var4.method1749(0);
        class29.method159(var4, arg3 ^ arg3);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 48)
    public static void method413(int arg0) {
        field1013 = null;
        field1018 = null;
        field1024 = null;
        field1009 = null;
        field1023 = null;
        field1021 = null;
        int var1 = 98 % ((-arg0 - 39) / 47);
        field1008 = null;
        field1022 = null;
        field1014 = null;
        field1019 = null;
        field1015 = null;
        field1020 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 80)
    public static final void method414(byte arg0) {
        class292.field5020.method56((byte) -92);
        field1010++;
        for (int var1 = 0; var1 < 32; var1++) {
            class112.field1893[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class136.field2260[var2] = 0L;
        }
        class251.field4241 = 0;
        if (arg0 >= -72) {
            field1022 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 111)
    public static final void method415(int arg0, int arg1) {
        field1006++;
        class136.field2272--;
        if (class136.field2272 == arg0) {
            return;
        }
        class36.method212(class203.field3509, arg0 + 1, class203.field3509, arg0, class136.field2272 - arg0);
        class36.method212(class44.field684, arg0 + 1, class44.field684, arg0, class136.field2272 - arg0);
        class36.method219(class264.field4466, arg0 + 1, class264.field4466, arg0, class136.field2272 - arg0);
        class36.method213(class131.field2161, arg0 + 1, class131.field2161, arg0, class136.field2272 - arg0);
        class36.method217(class295.field5063, arg0 + 1, class295.field5063, arg0, class136.field2272 - arg0);
        class36.method217(class287.field4910, arg0 + 1, class287.field4910, arg0, class136.field2272 - arg0);
        if (arg1 != 1366) {
            method414((byte) -65);
        }
    }
}
