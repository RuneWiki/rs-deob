import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class565 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lcba;")
    public static class471 field7817 = new class471(91, 6);

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "Lej;")
    public static class104 field7818 = new class104("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
    public static final void method3218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7816++;
        if (arg0 != 1247) {
            return;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class646.method3722(arg1 + arg4, class326.field4387, class596.field8621, false);
        int var10 = class646.method3722(arg1 - arg4, class326.field4387, class596.field8621, false);
        class266.method1742(26844, class182.field2580[arg2], var9, arg3, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class264.field3687 <= var12 && class591.field8435 >= var11) {
                    int var13 = class646.method3722(arg1 + var5, class326.field4387, class596.field8621, false);
                    int var14 = class646.method3722(arg1 - var5, class326.field4387, class596.field8621, false);
                    if (var12 <= class591.field8435) {
                        class266.method1742(arg0 ^ 0x6C03, class182.field2580[var12], var13, arg3, var14);
                    }
                    if (var11 >= class264.field3687) {
                        class266.method1742(arg0 + 25597, class182.field2580[var11], var13, arg3, var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class264.field3687 && class591.field8435 >= var15) {
                int var17 = class646.method3722(arg1 + var6, class326.field4387, class596.field8621, false);
                int var18 = class646.method3722(arg1 - var6, class326.field4387, class596.field8621, false);
                if (var16 <= class591.field8435) {
                    class266.method1742(26844, class182.field2580[var16], var17, arg3, var18);
                }
                if (class264.field3687 <= var15) {
                    class266.method1742(26844, class182.field2580[var15], var17, arg3, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method3219(int arg0) {
        field7817 = null;
        if (arg0 >= -94) {
            method3219(87);
        }
        field7818 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
    public static final void method3220(int arg0, int arg1) {
        class47.field903 = 0;
        class5.field70 = -1;
        if (arg1 != -30488) {
            method3220(93, 77);
        }
        field7819++;
        class503.field6996 = false;
        class291.field4011 = null;
        class587.field8397 = arg0;
        class112.field1726 = 1;
        class467.field6585 = -1;
    }
}
