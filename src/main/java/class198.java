import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class198 {

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2895 = new String[200];

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lbg;")
    public static class324 field2891 = new class324(107, -1);

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lbg;")
    public static class324 field2897 = new class324(103, 6);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lke;")
    public static class422 field2896;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lya;I)V")
    public static final void method1396(class38 arg0, int arg1) {
        field2893++;
        if (arg1 != 8) {
            method1396(null, 3);
        }
        arg0.method380(0, 0, class94.field1278, 350);
        arg0.method386(0, 0, class94.field1278, 350, class380.field5618 << 24 | 0x332277, 1);
        int var2 = 350 / class303.field4325;
        if (class209.field3033 > 0) {
            int var3 = 346 - class303.field4325 - 4;
            int var4 = var2 * var3 / (class209.field3033 + var2 - 1);
            int var5 = 4;
            if (class209.field3033 > 1) {
                var5 += (class209.field3033 - class7.field88 - 1) * (var3 - var4) / (class209.field3033 - 1);
            }
            arg0.method386(class94.field1278 - 16, var5, 12, var4, class380.field5618 << 24 | 0x332277, 2);
            for (int var6 = class7.field88; var6 < (class7.field88 + var2) && var6 < class209.field3033; var6++) {
                String[] var7 = class92.method817((byte) -87, class474.field6989[var6], '\b');
                int var8 = (class94.field1278 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method380(var10, 0, var10 + var8 - 8, 350);
                    class396.field5802.method1958(-16777216, -1, var7[var9], 350 - class319.field4518 - class307.field4366.field4488 - ((-class7.field88 + var6) * class303.field4325) - 2, var10, 0);
                }
            }
        }
        arg0.method380(0, 0, class94.field1278, 350);
        arg0.method316(class94.field1278, -126, 350 - class319.field4518, 0, -1);
        class466.field6840.method1958(-16777216, -1, "--> " + class282.field4109, 350 - class387.field5731.field4488 - 1, 10, 0);
        int var11 = -1;
        if (class263.field3867 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method294(0, 350 - class387.field5731.field4488 - 11, 12, class387.field5731.method1969(-1, "--> " + class282.field4109.substring(0, class172.field2450)) + 10, var11);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field2891 = null;
        field2896 = null;
        field2897 = null;
        if (arg0 != -16777216) {
            field2897 = null;
        }
        field2895 = null;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        field2892++;
        class175.field2486 = null;
        class228.field3319 = false;
        int var1 = 70 % ((-arg0 - 41) / 48);
        class448.method2716(-11712);
    }
}
