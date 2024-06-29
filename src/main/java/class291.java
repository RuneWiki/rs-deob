import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class291 {

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    public static int[] field4645 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private int field4639;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lwh;")
    public static class9 field4643;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILhi;I)V")
    public final void method1945(int arg0, class264 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1779(arg0 ^ 0xFFFFBC53);
            if (var4 == 0) {
                if (arg0 != 17371) {
                    this.field4642 = 115;
                }
                field4640++;
                return;
            }
            this.method1947(-62, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjj;I)Lol;")
    public static final class209 method1946(int arg0, class134 arg1, int arg2) {
        if (arg2 != -10258) {
            method1951(53);
        }
        field4638++;
        return class72.method555((byte) -91, arg0, arg1) ? class48.method374(arg2 + 10191) : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILhi;I)V")
    private final void method1947(int arg0, int arg1, class264 arg2, int arg3) {
        if (arg3 == 1) {
            this.field4639 = arg2.method1777(-85);
        } else if (arg3 == 2) {
            this.field4644 = arg2.method1779(-49);
            this.field4642 = arg2.method1779(-81);
        }
        field4637++;
        int var5 = -59 % ((31 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Lwe;")
    public final class43 method1948(byte arg0) {
        field4641++;
        class43 var2 = (class43) class85.field1163.method1839((byte) 30, (long) this.field4639);
        if (var2 != null) {
            return var2;
        }
        class43 var3 = class204.method1370(-68, 0, this.field4639, class73.field995);
        if (arg0 < 25) {
            this.method1947(-75, 31, (class264) null, -94);
        }
        if (var3 != null) {
            class85.field1163.method1830((long) this.field4639, -74, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public static final void method1949(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class269.field4361; var3++) {
            for (int var4 = 0; var4 < class236.field3769; var4++) {
                for (int var5 = 0; var5 < class77.field1061; var5++) {
                    class99 var6 = class273.field4415[var3][var4][var5];
                    if (var6 != null) {
                        class233 var7 = var6.field1502;
                        if (var7 != null && var7.field3709.method1092()) {
                            class183.method1256(var7.field3709, var3, var4, var5, 1, 1);
                            if (var7.field3716 != null && var7.field3716.method1092()) {
                                class183.method1256(var7.field3716, var3, var4, var5, 1, 1);
                                var7.field3709.method1069(var7.field3716, 0, 0, 0, false);
                                var7.field3716 = var7.field3716.method1091(arg0, arg1, arg2);
                            }
                            var7.field3709 = var7.field3709.method1091(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1503; var8++) {
                            class138 var10 = var6.field1496[var8];
                            if (var10 != null && var10.field2291.method1092()) {
                                class183.method1256(var10.field2291, var3, var4, var5, var10.field2289 + 1 - var10.field2272, var10.field2285 - var10.field2284 + 1);
                                var10.field2291 = var10.field2291.method1091(arg0, arg1, arg2);
                            }
                        }
                        class16 var9 = var6.field1491;
                        if (var9 != null && var9.field185.method1092()) {
                            class201.method1353(var9.field185, var3, var4, var5);
                            var9.field185 = var9.field185.method1091(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1950(int arg0) {
        if (arg0 > -126) {
            method1951(84);
        }
        class12.field166.method1831(-114);
        field4636++;
        class147.field2366.method1831(-115);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method1951(int arg0) {
        if (arg0 >= 24) {
            field4645 = null;
            field4643 = null;
        }
    }
}
