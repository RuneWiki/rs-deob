import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class294 extends class252 {

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "[Lf;")
    public class38[] field4801;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field4795 = 0;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4799 = "slide:";

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "[I")
    public static int[] field4798;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    public static final void method2019(int arg0) {
        field4796++;
        int var1 = 0;
        if (arg0 != -25488) {
            method2019(30);
        }
        while (var1 < 5) {
            class12.field217[var1] = false;
            var1++;
        }
        class311.field5026 = -1;
        class231.field3613 = 1;
        class74.field1189 = 0;
        class251.field4132 = 0;
        class22.field424 = -1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static final void method2020(boolean arg0) {
        if (arg0) {
            class307.field4991 = class111.field1711;
            class166.field2746 = class199.field3192;
        } else {
            class307.field4991 = class48.field710;
            class166.field2746 = class300.field4915;
        }
        class284.field4608 = class307.field4991.length;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
    public static void method2021(int arg0) {
        field4798 = null;
        if (arg0 <= 51) {
            method2019(38);
        }
        field4799 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method2022(boolean arg0, Object arg1, int arg2) {
        field4800++;
        if (arg2 != 65280) {
            field4798 = null;
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class202.method1412(var3, arg2 - 65377) : var3;
        } else if (arg1 instanceof class68) {
            class68 var4 = (class68) arg1;
            return var4.method86(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Z")
    public final boolean method2023(int arg0, int arg1) {
        if (arg1 != 0) {
            field4798 = null;
        }
        field4797++;
        return this.field4801[arg0].field597;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lgi;Lgi;IZ)V")
    public class294(class164 arg0, class164 arg1, int arg2, boolean arg3) {
        class223 var5 = new class223();
        int var6 = arg0.method1145((byte) 110, arg2);
        this.field4801 = new class38[var6];
        int[] var7 = arg0.method1162(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class182 var9 = null;
            byte[] var10 = arg0.method1156(arg2, var7[var8], (byte) -16);
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            for (class182 var12 = (class182) var5.method1553(true); var12 != null; var12 = (class182) var5.method1551(0)) {
                if (var12.field3020 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1139(var11, (byte) 77, 0);
                } else {
                    var13 = arg1.method1139(0, (byte) 100, var11);
                }
                var9 = new class182(var11, var13);
                var5.method1554(5257, var9);
            }
            this.field4801[var7[var8]] = new class38(var10, var9);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Z")
    public final boolean method2024(int arg0, int arg1) {
        field4802++;
        if (arg1 != 0) {
            this.field4801 = null;
        }
        return this.field4801[arg0].field598;
    }
}
