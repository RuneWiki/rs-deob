import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class289 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lin;")
    public static class168 field4497 = null;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Z")
    public static boolean field4503 = true;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4496 = "Hidden";

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field4502 = 255;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field4505 = 10;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lba;")
    public static class53 field4506 = new class53(16);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field4507 = 3;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field4509 = 2;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4510 = "Prepared sound engine";

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field4508 = 1;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lnf;")
    public class59 field4501;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public int[] field4499;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIII)V", line = 6)
    public static final void method1985(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4498++;
        class117.field1783 = 0L;
        boolean var5 = false;
        int var6 = class256.method1759(94);
        int var7 = 53 / ((arg2 - 24) / 43);
        if (arg3 == 3 || var6 == 3) {
            arg1 = true;
        }
        if (class180.field2719.startsWith("mac") && arg3 > 0) {
            arg1 = true;
        }
        if (arg3 > 0 != var6 > 0) {
            var5 = true;
        }
        if (arg1 && arg3 > 0) {
            var5 = true;
        }
        class312.method2117(arg0, arg4, var6, arg1, arg3, 100, var5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 39)
    public static void method1986(byte arg0) {
        field4506 = null;
        if (arg0 > -72) {
            method1987(-116);
        }
        field4496 = null;
        field4510 = null;
        field4497 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lwj;", line = 72)
    public static final class270 method1987(int arg0) {
        field4500++;
        byte[] var1 = class306.field4757[0];
        int var2 = class75.field1215[0] * class73.field1201[0];
        int[] var3 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            var3[var4] = class63.field1002[class270.method1860(255, var1[var4])];
        }
        class270 var5;
        if (class94.field1516) {
            var5 = new class86(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], var3);
        } else {
            var5 = new class249(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], var3);
        }
        class7.method56((byte) 59);
        return var5;
    }
}
