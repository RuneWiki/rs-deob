import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class61 extends class183 {

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Ljava/lang/String;")
    public static String field812 = "rating: ";

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lpn;")
    public static class170 field809;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 4)
    public static void method409(int arg0) {
        field809 = null;
        field812 = null;
        if (arg0 != 31332) {
            field809 = (class170) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V", line = 18)
    public static final void method410(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class121.field1644[var1] = true;
        }
        if (arg0 < 126) {
            field812 = (String) null;
        }
        field808++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V", line = 41)
    public static final void method411() {
        if (class251.field3605 != null) {
            for (int var0 = 0; var0 < class251.field3605.length; var0++) {
                for (int var1 = 0; var1 < class245.field3524; var1++) {
                    for (int var2 = 0; var2 < class99.field1356; var2++) {
                        class251.field3605[var0][var1][var2] = null;
                    }
                }
            }
        }
        class125.field1693 = (class268[][]) null;
        if (class113.field1545 != null) {
            for (int var3 = 0; var3 < class113.field1545.length; var3++) {
                for (int var4 = 0; var4 < class245.field3524; var4++) {
                    for (int var5 = 0; var5 < class99.field1356; var5++) {
                        class113.field1545[var3][var4][var5] = null;
                    }
                }
            }
        }
        class288.field4283 = (class268[][]) null;
        class22.field285 = 0;
        if (class190.field2621 != null) {
            for (int var6 = 0; var6 < class22.field285; var6++) {
                class190.field2621[var6] = null;
            }
        }
        if (class226.field3242 != null) {
            for (int var7 = 0; var7 < class342.field5127; var7++) {
                class226.field3242[var7] = null;
            }
            class342.field5127 = 0;
        }
        if (class136.field1875 != null) {
            for (int var8 = 0; var8 < class136.field1875.length; var8++) {
                class136.field1875[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIBI)V", line = 148)
    public static final void method412(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field814++;
        if (class269.method1854((byte) -97, arg4)) {
            class63.method424(arg0, class241.field3419[arg4], -1, arg2, (byte) 86, arg1);
            if (arg3 != 23) {
                method412(79, false, -61, (byte) -44, 49);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lqk;", line = 165)
    public static final class65 method413(int arg0, int arg1, int arg2) {
        class65 var3 = new class65();
        if (arg2 != 12695) {
            field809 = (class170) null;
        }
        for (class297 var4 = (class297) class122.field1656.method110(0); var4 != null; var4 = (class297) class122.field1656.method115(0)) {
            if (var4.field4398 && var4.method2022(0, arg1, arg0)) {
                var3.method443(true, var4);
            }
        }
        field816++;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V", line = 197)
    public class61(int arg0, int arg1) {
        this.field815 = arg1;
        this.field811 = arg0;
    }
}
