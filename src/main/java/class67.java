import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class67 {

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lcq;")
    public static class72 field807 = new class72("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 17)
    public static void method387(byte arg0) {
        field807 = null;
        if (arg0 < 31) {
            method390(true, 106);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 31)
    public static final void method388(int arg0) {
        class365 var1 = class347.field4723;
        synchronized (class347.field4723) {
            class347.field4723.method2298(0);
        }
        if (arg0 >= -8) {
            field805 = 44;
        }
        field804++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 48)
    public static final void method389(int arg0) {
        field806++;
        int[] var1 = new int[class126.field1413];
        int var2 = 0;
        int var3 = 0;
        int var4 = 105 / ((-arg0 - 43) / 53);
        while (var3 < class126.field1413) {
            class59 var6 = class131.method843((byte) 5, var3);
            if (var6.field715 >= 0 || var6.field676 >= 0) {
                var1[var2++] = var3;
            }
            var3++;
        }
        class301.field4015 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class301.field4015[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V", line = 84)
    public static final void method390(boolean arg0, int arg1) {
        field801++;
        class94.method589(-127);
        if (class174.field2017 != 30 && class174.field2017 != 25) {
            return;
        }
        class72.field898++;
        if (class72.field898 < 50 && !arg0) {
            return;
        }
        class72.field898 = arg1;
        if (!class420.field5755 && class181.field2107 != null) {
            class427.field5837.method2162(false, 95);
            class314.field4228++;
            try {
                class181.field2107.method2464((byte) 108, 0, class427.field5837.field3211, class427.field5837.field3188);
                class427.field5837.field3211 = 0;
            } catch (IOException var2) {
                class420.field5755 = true;
            }
        }
        class94.method589(-116);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Ljn;", line = 120)
    public static final class352 method391(int arg0, boolean arg1) {
        field803++;
        class352 var2 = (class352) class264.field3401.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field805 = 89;
        }
        byte[] var3 = class234.field3081.method1794(5860, 4, arg0);
        class352 var4 = new class352();
        if (var3 != null) {
            var4.method2235((byte) -106, new class242(var3), arg0);
        }
        var4.method2240(false, arg0);
        class264.field3401.method2294(var4, (byte) 119, (long) arg0);
        return var4;
    }
}
