import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class306 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lna;")
    public static class26 field5273 = class69.method505("(U(Y", (byte) -117);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lna;")
    public static class26 field5275 = class69.method505("Ausw-=hlen", (byte) -117);

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field5280 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lve;")
    public static class266 field5278;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lcb;")
    public class281 field5277;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    public int[] field5279;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)[Lmm;", line = 8)
    public static final class256[] method2144(boolean arg0) {
        class256[] var1 = new class256[class313.field5350];
        if (!arg0) {
            method2145((byte) 127, -18);
        }
        for (int var2 = 0; var2 < class313.field5350; var2++) {
            int var3 = class98.field1596[var2] * class141.field2149[var2];
            byte[] var4 = class205.field3203[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class190.field2975[class4.method23(255, var4[var6])];
            }
            var1[var2] = new class256(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], var5);
        }
        class160.method1088((byte) 113);
        field5276++;
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V", line = 65)
    public static final void method2145(byte arg0, int arg1) {
        class186 var2 = (class186) class55.field876.method1827((long) arg1, 0);
        field5272++;
        if (var2 == null) {
            return;
        }
        if (arg0 != 114) {
            field5278 = (class266) null;
        }
        for (int var3 = 0; var3 < var2.field2887.length; var3++) {
            var2.field2887[var3] = -1;
            var2.field2892[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 98)
    public static void method2146(int arg0) {
        field5273 = null;
        field5275 = null;
        if (arg0 != 0) {
            field5273 = (class26) null;
        }
        field5278 = null;
    }
}
