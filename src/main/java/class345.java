import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class345 extends class320 {

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lgo;")
    public class31 field5493;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "[I")
    public static int[] field5495 = new int[2048];

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field5499 = 0;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field5481 = -1;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field5484;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "Lrn;")
    public static class18 field5498;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2430(boolean arg0) {
        field5488++;
        if (class20.field321) {
            return;
        }
        if (class278.field4292) {
            class313.field4846 = (float) ((int) class313.field4846 - 65 & 0xFFFFFF80);
        } else {
            class101.field1531 += (-24.0F - class101.field1531) / 2.0F;
        }
        class78.field1138 = arg0;
        class20.field321 = true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBLrn;IIZI)V", line = 26)
    public static final void method2431(int arg0, byte arg1, class18 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class110.field1693 = arg4;
        class62.field952 = arg3;
        class287.field4447 = arg5;
        class150.field2450 = arg6;
        class37.field573 = arg0;
        class337.field5185 = arg2;
        class42.field671 = 1;
        field5496++;
        if (arg1 != 115) {
            method2438(false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)Lqg;", line = 56)
    public static final class316 method2432(int arg0, byte arg1) {
        field5500++;
        if (class339.field5220 && arg0 >= class76.field1120 && class168.field2671 >= arg0) {
            if (arg1 != -25) {
                method2437(false);
            }
            return class85.field1217[arg0 - class76.field1120];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 73)
    public static final void method2433(byte arg0) {
        field5485++;
        if (arg0 < 92) {
            method2437(true);
        }
        int[] var1 = new int[class310.field4791];
        int var2 = 0;
        for (int var3 = 0; var3 < class310.field4791; var3++) {
            class263 var4 = class48.method469(10, var3);
            if (var4.field4022 >= 0 || var4.field4035 >= 0) {
                var1[var2++] = var3;
            }
        }
        class116.field1773 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class116.field1773[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZI)V", line = 109)
    public final void method2434(int arg0, int arg1, boolean arg2, int arg3) {
        this.field5486 = arg1;
        this.field5490 = arg3;
        if (!arg2) {
            method2435((byte) -4);
        }
        this.field5491 = arg0;
        field5489++;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V", line = 123)
    public static final void method2435(byte arg0) {
        field5483++;
        class83.method749();
        int var1 = 0;
        if (arg0 != 114) {
            return;
        }
        while (var1 < 4) {
            class57.field905[var1].method2097(2097152);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 145)
    public static void method2436(int arg0) {
        if (arg0 >= 67) {
            field5495 = null;
            field5498 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V", line = 159)
    public static final void method2437(boolean arg0) {
        field5480++;
        if (class236.field3674 != null) {
            class223 var1 = class236.field3674;
            synchronized (class236.field3674) {
                class236.field3674 = null;
            }
        }
        if (!arg0) {
            method2435((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 177)
    public static final void method2438(boolean arg0) {
        class130.field2176 = 0;
        field5497++;
        class120.field1861 = 0;
        class118.method1002((byte) 94);
        class190.method1454(arg0);
        class268.method1966((byte) 32);
        for (int var1 = 0; var1 < class130.field2176; var1++) {
            int var2 = class318.field4903[var1];
            if (class360.field5718 != class110.field1683[var2].field1385) {
                if (class110.field1683[var2].field3802.method1118(125)) {
                    class197.method1495((byte) -21, class110.field1683[var2]);
                }
                class110.field1683[var2].method1840((class130) null, 256);
                class110.field1683[var2] = null;
            }
        }
        if (class122.field1945 != class244.field3803.field397) {
            throw new RuntimeException("gnp1 pos:" + class244.field3803.field397 + " psize:" + class122.field1945);
        }
        for (int var3 = 0; var3 < class6.field80; var3++) {
            if (class110.field1683[class126.field2114[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class6.field80);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lgo;Lem;)V", line = 230)
    public class345(class31 arg0, class273 arg1) {
        this.field5493 = arg0;
    }
}
