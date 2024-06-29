import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class414 extends class589 {

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field5482 = 0;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5483 = new String[5];

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lhv;")
    public static class151 field5484 = new class151();

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lwm;")
    public static class30 field5480;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2395(int arg0) {
        field5481++;
        int var1 = class20.field189;
        int[] var2 = class503.field6451;
        for (int var3 = 0; var3 < var1; var3++) {
            class33 var9 = class263.field3508[var2[var3]];
            if (var9 != null && var9.field4664 > 0) {
                var9.field4664--;
                if (var9.field4664 == 0) {
                    var9.field4709 = null;
                }
            }
        }
        int var4 = 0;
        if (arg0 <= 12) {
            return;
        }
        while (var4 < class349.field4271) {
            long var5 = (long) class88.field1224[var4];
            class232 var7 = (class232) class444.field5811.method2616(var5, (byte) 127);
            if (var7 != null) {
                class727 var8 = var7.field3125;
                if (var8.field4664 > 0) {
                    var8.field4664--;
                    if (var8.field4664 == 0) {
                        var8.field4709 = null;
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 70)
    public static void method2396(int arg0) {
        field5480 = null;
        if (arg0 == 5) {
            field5483 = null;
            field5484 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Llha;")
    public abstract class445 method579(int arg0);
}
