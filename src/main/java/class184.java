import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class184 extends class270 {

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    private int field2946 = 0;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "I")
    private int field2953 = 1;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    private int field2947 = 0;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "Lmh;")
    public static class62 field2942 = class201.method1405(true, " loggt sich ein)3");

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "[Lmh;")
    public static class62[] field2952 = new class62[100];

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    public static int field2954 = -1;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "Lsk;")
    public static class199 field2941 = new class199(64);

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "Lmh;")
    public static class62 field2956 = class201.method1405(true, "name_icons");

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "[I")
    public static int[] field2940;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZI)Ld;", line = 7)
    public static final class146 method1288(int arg0, int arg1, boolean arg2, int arg3) {
        field2937++;
        class146 var4 = new class146();
        var4.field2309 = arg3;
        var4.field2312 = arg1;
        class214.field3632.method309(var4, (long) arg0, 1);
        class137.method1034(112, arg1);
        class191 var5 = class1.method2(arg0, (byte) -37);
        if (var5 != null) {
            class250.method1744(var5, (byte) 84);
        }
        if (class81.field1354 != null) {
            class250.method1744(class81.field1354, (byte) -126);
            class81.field1354 = null;
        }
        int var6 = class195.field3293;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class53.method344(19, class286.field4892[var7])) {
                class309.method2106(var7, 1);
            }
        }
        if (!arg2) {
            method1290((byte) -52, -59);
        }
        if (class195.field3293 == 1) {
            class80.field1341 = false;
            class267.method1840(class206.field3498, class276.field4751, class162.field2632, 0, class250.field4246);
        } else {
            class267.method1840(class206.field3498, class276.field4751, class162.field2632, 0, class250.field4246);
            int var8 = class296.field5047.method2040(class57.field837);
            for (int var9 = 0; var9 < class195.field3293; var9++) {
                int var10 = class296.field5047.method2040(class2.method14(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class276.field4751 = class195.field3293 * 15 + 22;
            class250.field4246 = var8 + 8;
        }
        if (var5 != null) {
            class192.method1347(-1908822544, false, var5);
        }
        class309.method2105(arg1, arg2);
        if (class301.field5183 != -1) {
            class108.method832(1, 0, class301.field5183);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lmi;II)V", line = 96)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field2944++;
        if (arg1 == 0) {
            this.field2947 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field2946 = arg0.method702(-1);
        } else if (arg1 == 3) {
            this.field2953 = arg0.method702(-1);
        }
        int var5 = 59 % ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Frame;Lgi;B)V", line = 139)
    public static final void method1289(Frame arg0, class285 arg1, byte arg2) {
        field2948++;
        if (arg2 < 83) {
            return;
        }
        while (true) {
            class147 var3 = arg1.method1939(true, arg0);
            while (var3.field2322 == 0) {
                class99.method792(-1, 10L);
            }
            if (var3.field2322 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class99.method792(-1, 100L);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I", line = 173)
    public final int[] method6(int arg0, int arg1) {
        field2949++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class109.field1770; var6++) {
                int var7 = class283.field4840[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field2947 == 0) {
                    var9 = (var7 - var4) * this.field2953;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2953 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field2946 == 0) {
                    var12 = class269.field4563[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2946 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != 18693) {
            method1293(-62, -82, -72, -76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)V", line = 243)
    public final void method231(byte arg0) {
        field2938++;
        if (arg0 == 90) {
            class96.method767((byte) -72);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 253)
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V", line = 262)
    public static final void method1290(byte arg0, int arg1) {
        field2943++;
        if (arg0 != 69) {
            method1293(-8, 88, -72, 38);
        }
        class1.field2.method1390(arg1, -60);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 300)
    public static void method1291(boolean arg0) {
        field2941 = null;
        field2940 = null;
        field2942 = null;
        if (!arg0) {
            field2956 = null;
            field2952 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 326)
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2939++;
        class170.field2772.field1476 = 0;
        class170.field2772.method717(1, 171);
        class170.field2772.method717(1, arg2);
        class170.field2772.method717(1, arg4);
        class170.field2772.method738((byte) 90, arg3);
        class170.field2772.method738((byte) -115, arg1);
        int var5 = -1 / ((21 - arg0) / 49);
        class243.field4131 = -3;
        class80.field1340 = 0;
        class265.field4466 = 1;
        class176.field2817 = 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V", line = 348)
    public static final void method1293(int arg0, int arg1, int arg2, int arg3) {
        class151 var4 = class165.method1194((byte) 1, 9, arg0);
        if (arg1 != 25119) {
            field2950 = 25;
        }
        var4.method1088(123);
        field2945++;
        var4.field2388 = arg3;
        var4.field2395 = arg2;
    }
}
