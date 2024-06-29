import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class150 {

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "B")
    public byte field2382;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lpi;")
    public static class342 field2378 = new class342("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Loe;")
    public class133 field2386;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Lbq;")
    public class189 field2385;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lvi;")
    public class375 field2381;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lgn;")
    public class493 field2390;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1147(boolean arg0) {
        if (!arg0) {
            field2378 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIII)Z", line = 26)
    public static final boolean method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class504.field7445[arg0][var8][var14] == -class183.field2743) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class426.field6345) + 1;
            int var10 = (arg3 << class426.field6345) + 2;
            int var11 = class88.field1546[arg0].method376(arg1, arg3) + arg5;
            if (!class14.method91(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class426.field6345) - 1;
            if (!class14.method91(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class426.field6345) - 1;
            if (!class14.method91(var9, var11, var13)) {
                return false;
            } else if (class14.method91(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class341.method2177(arg0, arg1, arg3)) {
            int var6 = arg1 << class426.field6345;
            int var7 = arg3 << class426.field6345;
            return class14.method91(var6 + 1, class88.field1546[arg0].method376(arg1, arg3) + arg5, var7 + 1) && class14.method91(class177.field2697 + var6 - 1, class88.field1546[arg0].method376(arg1 + 1, arg3) + arg5, var7 + 1) && class14.method91(class177.field2697 + var6 - 1, class88.field1546[arg0].method376(arg1 + 1, arg3 + 1) + arg5, class177.field2697 + var7 - 1) && class14.method91(var6 + 1, class88.field1546[arg0].method376(arg1, arg3 + 1) + arg5, class177.field2697 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 86)
    public static final void method1149(byte arg0) {
        class272.field3928.method488(-3);
        field2388++;
        class283.field4047.method488(-3);
        class132.field2081.method488(-3);
        int var1 = 31 % ((-arg0 - 55) / 38);
        class420.field6276.method488(-3);
        class259.field3762.method488(-3);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(BIIIII)V", line = 105)
    public class150(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2384 = arg4;
        this.field2383 = arg5;
        this.field2380 = arg3;
        this.field2379 = arg1;
        this.field2389 = arg2;
        this.field2382 = arg0;
    }
}
