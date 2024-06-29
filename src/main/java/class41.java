import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class41 {

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "J")
    public long field795 = 0L;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field785 = "Loaded interfaces";

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field792 = "glow1:";

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lab;")
    public static class279 field787 = new class279(32);

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lsc;")
    public class19 field788;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lsc;")
    public class19 field796;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Log;")
    public static class225 field797;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method315(boolean arg0) {
        class317.method2183((byte) -7, class289.field4445);
        field791++;
        class212.field3412++;
        if (class42.field812 && class313.field4754) {
            int var1 = class120.field2083;
            if (arg0) {
                int var2 = class9.field196;
                int var3 = var2 - class159.field2603;
                if (class342.field5316 > var3) {
                    var3 = class342.field5316;
                }
                int var4 = var1 - class21.field451;
                if ((class289.field4445.field1414 + var3) > (class342.field5316 + class1.field26.field1414)) {
                    var3 = class1.field26.field1414 + class342.field5316 - class289.field4445.field1414;
                }
                int var5 = var3 - class191.field3111;
                if (class302.field4579 > var4) {
                    var4 = class302.field4579;
                }
                int var6 = class289.field4445.field1382;
                if ((class289.field4445.field1416 + var4) > (class302.field4579 + class1.field26.field1416)) {
                    var4 = class302.field4579 + class1.field26.field1416 - class289.field4445.field1416;
                }
                int var7 = var4 - class215.field3445;
                int var8 = class1.field26.field1288 + var4 - class302.field4579;
                int var9 = class1.field26.field1419 + var3 - class342.field5316;
                if (class289.field4445.field1287 < class212.field3412 && (var7 > var6 || var7 < (-var6) || var5 > var6 || var5 < -var6)) {
                    class136.field2289 = true;
                }
                if (class289.field4445.field1445 != null && class136.field2289) {
                    class106 var10 = new class106();
                    var10.field1841 = class289.field4445.field1445;
                    var10.field1824 = var9;
                    var10.field1823 = class289.field4445;
                    var10.field1831 = var8;
                    class156.method1008(true, var10);
                }
                if (class335.field5140 == 0) {
                    if (class136.field2289) {
                        if (class289.field4445.field1352 != null) {
                            class106 var11 = new class106();
                            var11.field1841 = class289.field4445.field1352;
                            var11.field1824 = var9;
                            var11.field1823 = class289.field4445;
                            var11.field1842 = class179.field2874;
                            var11.field1831 = var8;
                            class156.method1008(arg0, var11);
                        }
                        if (class179.field2874 != null && client.method358(class289.field4445) != null) {
                            class14.field263.method80(156, (byte) 110);
                            class208.field3362++;
                            class14.field263.method1359(16705, class289.field4445.field1284);
                            class14.field263.method1313(class289.field4445.field1365, -376480);
                            class14.field263.method1324(class179.field2874.field1365, 1734336648);
                            class14.field263.method1320(class179.field2874.field1284, (byte) 72);
                        }
                    } else if ((class227.field3592 == 1 || class133.method870(false, class48.field999 - 1)) && class48.field999 > 2) {
                        class324.method2245(0);
                    } else if (class48.field999 > 0) {
                        class66.method511(2);
                    }
                    class289.field4445 = null;
                }
            }
        } else if (class212.field3412 > 1) {
            class289.field4445 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 148)
    public static void method316(int arg0) {
        int var1 = 100 / ((-arg0 - 69) / 43);
        field785 = null;
        field792 = null;
        field787 = null;
        field797 = null;
    }
}
