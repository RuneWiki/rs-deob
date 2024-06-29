import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class564 {

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Lraa;")
    public static class520 field8287 = new class520();

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8289 = 0;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lkca;")
    public static class71 field8288 = new class71(0, 0);

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Lrg;")
    public static class548 field8290 = new class548(26, 7);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Ldn;")
    public static class438 field8291;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 5)
    public static final String method3290(byte arg0, long arg1) {
        class622.field8968.setTime(new Date(arg1));
        field8284++;
        int var3 = class622.field8968.get(7);
        int var4 = class622.field8968.get(5);
        int var5 = class622.field8968.get(2);
        int var6 = class622.field8968.get(1);
        int var7 = class622.field8968.get(11);
        if (arg0 < 124) {
            return null;
        } else {
            int var8 = class622.field8968.get(12);
            int var9 = class622.field8968.get(13);
            return class360.field4730[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class22.field147[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Los;I)V", line = 37)
    public static final void method3291(class374 arg0, int arg1) {
        field8286++;
        int var2 = arg0.method2122(false);
        class156.field1904 = new class429[var2];
        for (int var3 = arg1; var3 < var2; var3++) {
            class156.field1904[var3] = new class429();
            class156.field1904[var3].field5822 = arg0.method2122(false);
            class156.field1904[var3].field5823 = arg0.method2098(-15);
        }
        class90.field1119 = arg0.method2122(false);
        class204.field2443 = arg0.method2122(false);
        class415.field5392 = arg0.method2122(false);
        class341.field4400 = new class29[class204.field2443 + 1 - class90.field1119];
        for (int var4 = 0; var4 < class415.field5392; var4++) {
            int var5 = arg0.method2122(false);
            class29 var6 = class341.field4400[var5] = new class29();
            var6.field131 = arg0.method2129(-102);
            var6.field137 = arg0.method2123(false);
            var6.field196 = class90.field1119 + var5;
            var6.field197 = arg0.method2098(arg1 ^ 0xFFFFFFE7);
            var6.field194 = arg0.method2098(-57);
        }
        class11.field86 = arg0.method2123(false);
        class125.field1537 = true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z", line = 81)
    public static final boolean method3292(int arg0, int arg1) {
        field8285++;
        if (arg0 == 21 || arg0 == 17 || arg0 == 59 || arg0 == 23 || arg0 == 45) {
            return true;
        } else {
            return ~arg0 == arg1 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 99)
    public static void method3293(int arg0) {
        field8287 = null;
        field8290 = null;
        field8288 = null;
        int var1 = -45 % ((arg0 + 50) / 50);
        field8291 = null;
    }
}
