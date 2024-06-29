import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class284 extends class170 {

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "Ljb;")
    public class427 field3863;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "[I")
    public static int[] field3858 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field3860 = 0;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lhc;")
    public static class368 field3859 = new class368("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "[I")
    public static int[] field3867 = new int[50];

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field3868 = 0;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Lnf;")
    public static class258 field3866;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 5)
    public static void method1773(int arg0) {
        if (arg0 != -21225) {
            method1774(-54, (class366) null, (byte) 74);
        }
        field3867 = null;
        field3859 = null;
        field3858 = null;
        field3866 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILrg;B)Ljava/lang/String;", line = 21)
    public static final String method1774(int arg0, class366 arg1, byte arg2) {
        field3861++;
        try {
            int var3 = arg1.method2251(-116);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (arg2 != 5) {
                field3859 = null;
            }
            arg1.field5048 += class129.field1951.method313(var3, arg1.field5076, var4, 0, 0, arg1.field5048);
            return class140.method1027((byte) 124, var4, var3, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljb;)V", line = 55)
    public class284(class427 arg0) {
        this.field3863 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V", line = 67)
    public static final void method1775(boolean arg0, int arg1) {
        if (arg0) {
            field3864++;
            class447.field6346 = arg1;
            class343.field4628.method2530((byte) -101);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lea;)V", line = 81)
    public static final void method1776(class58 arg0) {
        for (int var1 = class214.field3003; var1 < class409.field5706; var1++) {
            for (int var2 = 0; var2 < field3862; var2++) {
                for (int var3 = 0; var3 < class354.field4768; var3++) {
                    class63 var4 = class341.field4617[var1][var2][var3];
                    if (var4 != null) {
                        class403 var5 = var4.field867;
                        class403 var6 = var4.field863;
                        if (var5 != null && var5.method697(120)) {
                            class372.method2329(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method697(125)) {
                                class372.method2329(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method699(22546, 0, arg0, var5, false, 0, 0);
                                var6.method702((byte) 46);
                            }
                            var5.method702((byte) 46);
                        }
                        for (class48 var7 = var4.field853; var7 != null; var7 = var7.field608) {
                            class5 var9 = var7.field617;
                            if (var9 != null && var9.method697(120)) {
                                class372.method2329(arg0, var9, var1, var2, var3, var9.field47 + 1 - var9.field52, var9.field41 - var9.field55 + 1);
                                var9.method702((byte) 46);
                            }
                        }
                        class301 var8 = var4.field854;
                        if (var8 != null && var8.method697(116)) {
                            class271.method1723(arg0, var8, var1, var2, var3);
                            var8.method702((byte) 46);
                        }
                    }
                }
            }
        }
    }
}
