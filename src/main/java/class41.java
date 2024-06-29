import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class41 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lve;")
    public static class255 field641 = class87.method607(102, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[I")
    public static int[] field640 = new int[1000];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lfj;")
    public static class228 field647;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[Lve;")
    public static class255[] field637;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 6)
    public static final void method252(byte arg0) {
        field643++;
        if (arg0 > -78) {
            method253(-45, -10, (byte) 25);
        }
        class160.field2692.method1515(7);
        int var1 = class160.field2692.method1513((byte) 45, 8);
        if (var1 < class282.field4858) {
            for (int var2 = var1; var2 < class282.field4858; var2++) {
                class87.field1413[class103.field1731++] = class84.field1356[var2];
            }
        }
        if (class282.field4858 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class282.field4858 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class84.field1356[var3];
            class186 var5 = class82.field1334[var4];
            int var6 = class160.field2692.method1513((byte) 45, 1);
            if (var6 == 0) {
                class84.field1356[class282.field4858++] = var4;
                var5.field5122 = class277.field4768;
            } else {
                int var7 = class160.field2692.method1513((byte) 45, 2);
                if (var7 == 0) {
                    class84.field1356[class282.field4858++] = var4;
                    var5.field5122 = class277.field4768;
                    class10.field145[class118.field1985++] = var4;
                } else if (var7 == 1) {
                    class84.field1356[class282.field4858++] = var4;
                    var5.field5122 = class277.field4768;
                    int var8 = class160.field2692.method1513((byte) 45, 3);
                    var5.method2100(false, true, var8);
                    int var9 = class160.field2692.method1513((byte) 45, 1);
                    if (var9 == 1) {
                        class10.field145[class118.field1985++] = var4;
                    }
                } else if (var7 == 2) {
                    class84.field1356[class282.field4858++] = var4;
                    var5.field5122 = class277.field4768;
                    int var10 = class160.field2692.method1513((byte) 45, 3);
                    var5.method2100(true, true, var10);
                    int var11 = class160.field2692.method1513((byte) 45, 3);
                    var5.method2100(true, true, var11);
                    int var12 = class160.field2692.method1513((byte) 45, 1);
                    if (var12 == 1) {
                        class10.field145[class118.field1985++] = var4;
                    }
                } else if (var7 == 3) {
                    class87.field1413[class103.field1731++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)Z", line = 109)
    public static final boolean method253(int arg0, int arg1, byte arg2) {
        field646++;
        class145 var3 = class289.method2046(arg2 - 12458, arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg2 == 5) {
            if (arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method1090(arg1, 126);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 135)
    public static final void method254(int arg0, int arg1) {
        field642++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class93.method696(true);
        } else if (arg0 == 2) {
            class70.method478(true);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != -6402) {
            method256(false, 22, false, -32, 3);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 161)
    public static void method255(byte arg0) {
        field641 = null;
        if (arg0 < 78) {
            method254(-24, -72);
        }
        field640 = null;
        field647 = null;
        field637 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZII)V", line = 183)
    public static final void method256(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field644++;
        if (!arg0) {
            method253(102, 114, (byte) 43);
        }
        if (class225.method1570((byte) -96, arg4)) {
            class274.method1924(arg2, -1, class297.field5087[arg4], arg3, (byte) 95, arg1);
        }
    }
}
