import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class391 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lba;")
    public static class351 field5794;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 17)
    public static void method2405(int arg0) {
        field5794 = null;
        if (arg0 <= 60) {
            field5794 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I", line = 29)
    public static final int method2406(int arg0) {
        field5797++;
        if (class243.field3788 == 0) {
            class114.field1717.method895(new class572("jaclib"), 1);
            if (class114.field1717.method891(3).method640(11442) != 100) {
                return 1;
            }
            if (!((class572) class114.field1717.method891(3)).method3252((byte) 106)) {
                class565.field7967.method2515(0);
            }
            class243.field3788 = 1;
        }
        if (class243.field3788 == arg0) {
            class493.field7010 = class114.method890(10);
            class114.field1710.method895(new class148(class656.field9201), 1);
            class114.field1720.method895(new class572("jaggl"), 1);
            class114.field1722.method895(new class572("jagdx"), 1);
            class114.field1725.method895(new class572("jagmisc"), arg0);
            class114.field1726.method895(new class572("sw3d"), 1);
            class114.field1727.method895(new class572("hw3d"), 1);
            class114.field1728.method895(new class148(class231.field3600), 1);
            class114.field1729.method895(new class148(class544.field7656), 1);
            class114.field1730.method895(new class148(class94.field1498), 1);
            class114.field1731.method895(new class148(class656.field9196), 1);
            class114.field1732.method895(new class148(class206.field2904), 1);
            class114.field1733.method895(new class148(class149.field2168), 1);
            class114.field1734.method895(new class148(class386.field5439), 1);
            class114.field1735.method895(new class148(class316.field4675), arg0);
            class114.field1736.method895(new class148(class264.field4005), 1);
            class114.field1737.method895(new class148(class27.field395), 1);
            class114.field1738.method895(new class148(class651.field9121), 1);
            class114.field1739.method895(new class148(class462.field6660), arg0);
            class114.field1740.method895(new class148(class23.field318), 1);
            class114.field1741.method895(new class148(class677.field9579), arg0);
            class114.field1742.method895(new class60(class580.field8170, "huffman"), 1);
            class114.field1743.method895(new class148(class695.field9786), 1);
            class114.field1744.method895(new class148(class518.field7311), 1);
            class114.field1745.method895(new class148(class81.field1363), arg0);
            class114.field1746.method895(new class466(class75.field1310, "details"), 1);
            for (int var1 = 0; var1 < class493.field7010.length; var1++) {
                if (class493.field7010[var1].method891(3) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class114[] var3 = class493.field7010;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class114 var5 = var3[var4];
                int var6 = var5.method888(37);
                int var7 = var5.method891(arg0 + 2).method640(11442);
                var2 += var6 * var7 / 100;
            }
            class243.field3788 = 2;
            class411.field5994 = var2;
        }
        if (class493.field7010 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class114[] var11 = class493.field7010;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class114 var16 = var11[var12];
            int var17 = var16.method888(37);
            int var18 = var16.method891(3).method640(arg0 + 11441);
            var9 += var17 * var18 / 100;
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
        }
        if (var10) {
            if (!((class572) class114.field1725.method891(arg0 + 2)).method3252((byte) 121)) {
                class565.field7967.method2510(-49);
            }
            class493.field7010 = null;
        }
        int var13 = var9 - class411.field5994;
        int var14 = var8 - class411.field5994;
        int var15 = var14 > 0 ? var13 * 100 / var14 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILvg;Z)V", line = 165)
    public static final void method2407(int arg0, class49 arg1, boolean arg2) {
        field5793++;
        int var3 = arg1.field1021 == 0 ? arg1.field967 : arg1.field1021;
        int var4 = arg1.field921 == arg0 ? arg1.field877 : arg1.field921;
        class697.method3892(var3, class181.field2558[arg1.field977 >> 16], (byte) 116, arg2, arg1.field977, var4);
        if (arg1.field1014 != null) {
            class697.method3892(var3, arg1.field1014, (byte) 115, arg2, arg1.field977, var4);
        }
        class320 var5 = (class320) class654.field9178.method1405((long) arg1.field977, (byte) -40);
        if (var5 != null) {
            class508.method2919((byte) -114, arg2, var4, var5.field4703, var3);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILpu;)I", line = 194)
    public static final int method2408(int arg0, class522 arg1) {
        field5795++;
        int var2 = arg0;
        if (arg1.method2997((byte) -95, class366.field5235)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2997((byte) -95, class125.field1872)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class356.field5113)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class705.field9920)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class665.field9389)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class577.field8132)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class313.field4632)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class583.field8195)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class104.field1621)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class455.field6533)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class228.field3304)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class688.field9690)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class216.field3031)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class639.field9018)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class46.field722)) {
            var2++;
        }
        if (arg1.method2997((byte) -95, class232.field3614)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method249(int arg0);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method270(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method274(class391 arg0);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method256(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class391 method251();

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method245(int arg0);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method252(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method248(int arg0);

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method236(int[] arg0);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method258(int arg0);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method272(int arg0);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method238(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method239(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method271();
}
