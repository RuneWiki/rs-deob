import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class206 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lid;")
    public static class92 field3922 = new class92(100);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Li;")
    public static class88 field3923 = class208.method1425(105, "Mem:");

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Li;")
    public static class88 field3924 = class208.method1425(105, ")3runescape)3com");

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method1418(int arg0) {
        int[] var1 = new int[class202.field3857];
        field3920++;
        int var2 = arg0;
        for (int var3 = 0; var3 < class202.field3857; var3++) {
            class149 var5 = class71.method472(var3, (byte) -88);
            if (var5.field2890 >= 0 || var5.field2855 >= 0) {
                var1[var2++] = var3;
            }
        }
        class89.field1699 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class89.field1699[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1419(byte arg0) {
        field3923 = null;
        field3924 = null;
        field3922 = null;
        int var1 = 97 / ((-arg0 - 3) / 59);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)J")
    public static final synchronized long method1420(boolean arg0) {
        field3921++;
        long var1 = System.currentTimeMillis();
        if (var1 < class156.field3006) {
            class54.field1002 += class156.field3006 - var1;
        }
        class156.field3006 = var1;
        if (arg0) {
            field3923 = null;
        }
        return var1 + class54.field1002;
    }
}
