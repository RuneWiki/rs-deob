import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class110 extends class90 {

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Lbm;")
    public static class204 field1556 = new class204("RC", 1);

    @OriginalMember(owner = "client!un", name = "A", descriptor = "Lsh;")
    public static class472 field1560 = new class472(85, 1);

    @OriginalMember(owner = "client!un", name = "C", descriptor = "Lqa;")
    public static class122 field1562 = new class122();

    @OriginalMember(owner = "client!un", name = "E", descriptor = "[I")
    public static int[] field1564 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "Ldp;")
    public static class319 field1563;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "[Laf;")
    public class113[] field1557;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "[[B")
    private byte[][] field1559;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 5)
    public static final void method803() {
        for (int var0 = 0; var0 < class270.field3992; var0++) {
            class305 var1 = class166.field2343[var0];
            class389.method2347(var1);
            class166.field2343[var0] = null;
        }
        class270.field3992 = 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z", line = 18)
    public final boolean method804(byte arg0) {
        field1558++;
        if (this.field1557 != null) {
            return true;
        }
        if (this.field1559 == null) {
            if (!class170.field2429.method2670(this.field1555, (byte) 79)) {
                return false;
            }
            int[] var2 = class170.field2429.method2689(this.field1555, -111);
            this.field1559 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1559[var3] = class170.field2429.method2691(var2[var3], this.field1555, 0);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1559.length; var5++) {
            byte[] var14 = this.field1559[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class83.field1179.method2672(var15, 23775);
        }
        if (!var4) {
            return false;
        }
        if (arg0 < 97) {
            field1562 = null;
        }
        class412 var6 = new class412();
        int var7 = class170.field2429.method2662(this.field1555, (byte) -7);
        this.field1557 = new class113[var7];
        int[] var8 = class170.field2429.method2689(this.field1555, 93);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1559[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class191 var12 = null;
            for (class191 var13 = (class191) var6.method2456(32101); var13 != null; var13 = (class191) var6.method2461(301)) {
                if (var13.field2931 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class191(var11, class83.field1179.method2667((byte) -115, var11));
                var6.method2453((byte) -101, var12);
            }
            this.field1557[var8[var9]] = new class113(var10, var12);
        }
        this.field1559 = null;
        return true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ltq;Z)V", line = 118)
    public static final void method805(class63 arg0, boolean arg1) {
        arg0.method500(0, 0, class342.field5115, 350);
        field1553++;
        if (arg1) {
            return;
        }
        arg0.method508(0, 0, class342.field5115, 350, class321.field4796 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class245.field3502[var2];
            int var14 = class285.field4359[var2];
            arg0.method508(var13, var14, 2, 2, class35.field441[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class25.field324;
        if (class186.field2831 > 0) {
            int var4 = 346 - class25.field324 - 4;
            int var5 = var3 * var4 / (var3 + class186.field2831 - 1);
            int var6 = 4;
            if (class186.field2831 > 1) {
                var6 += (class186.field2831 - class230.field3391 - 1) * (var4 - var5) / (class186.field2831 - 1);
            }
            arg0.method508(class342.field5115 - 16, var6, 12, var5, class321.field4796 << 24 | 0x332277, 2);
            for (int var7 = class230.field3391; var7 < class230.field3391 + var3 && class186.field2831 > var7; var7++) {
                String[] var8 = class3.method17(class362.field5480[var7], 11205, '\b');
                int var9 = (class342.field5115 - 24) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg0.method500(var11, 0, var11 + var9 - 8, 350);
                    class310.field4690.method1497(-16777216, var8[var10], var11, (byte) -40, -1, 350 - class27.field341 - (class267.field3960.field6 + 2) - ((-class230.field3391 + var7) * class25.field324));
                }
            }
        }
        arg0.method500(0, 0, class342.field5115, 350);
        arg0.method582(350 - class27.field341, class342.field5115, -1, 0, -15118);
        class462.field6513.method1497(-16777216, "--> " + class394.field5805, 10, (byte) -64, -1, 350 - class131.field1828.field6 - 1);
        int var12 = -1;
        if (class452.field6418 % 30 > 15) {
            var12 = 16777215;
        }
        arg0.method549(48, var12, 12, 350 - class131.field1828.field6 - 11, 10 - -class131.field1828.method3("--> " + class394.field5805.substring(0, class122.field1687), (byte) 92));
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 194)
    public static void method806(int arg0) {
        field1556 = null;
        field1563 = null;
        field1560 = null;
        field1562 = null;
        if (arg0 == 1) {
            field1564 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)Z", line = 208)
    public final boolean method807(boolean arg0, int arg1) {
        if (!arg0) {
            field1562 = null;
        }
        field1561++;
        return this.field1557[arg1].field1588;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z", line = 222)
    public final boolean method808(int arg0, int arg1) {
        int var3 = -78 % ((29 - arg0) / 58);
        field1554++;
        return this.field1557[arg1].field1573;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V", line = 236)
    public static final void method809(byte arg0) {
        field1552++;
        if (!class432.field6152) {
            return;
        }
        class178 var1 = class331.method2032(class65.field898, class467.field6570, -1);
        if (arg0 >= -100) {
            return;
        }
        if (var1 != null && var1.field2623 != null) {
            class415 var2 = new class415();
            var2.field5990 = var1;
            var2.field5989 = var1.field2623;
            class477.method2797(var2);
        }
        class261.field3873 = -1;
        class335.field5024 = -1;
        class432.field6152 = false;
        if (var1 != null) {
            class205.method1396(112, var1);
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V", line = 268)
    public class110(int arg0) {
        this.field1555 = arg0;
    }
}
