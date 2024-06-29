import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class436 extends class376 {

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[Lfm;")
    public class436[] field6270;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Z")
    public boolean field6256;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6255 = "Unable to find ";

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "F")
    public static float field6266;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Lmi;")
    public class286 field6259;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Lhn;")
    public class427 field6258;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Z")
    public static boolean field6253;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILeb;)V")
    public static final void method2728(int arg0, class371 arg1) {
        field6263++;
        if (arg1.field5258.length - arg1.field5273 < 1) {
            return;
        }
        int var2 = arg1.method2429(0);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field5258.length - arg1.field5273 < var3) {
            return;
        }
        class326.field4453 = arg1.method2429(0);
        if (class326.field4453 < 1) {
            class326.field4453 = 1;
        } else if (class326.field4453 > 4) {
            class326.field4453 = 4;
        }
        class141.method962(97, arg1.method2429(0) == 1);
        class231.field3098 = arg1.method2429(0) == 1;
        class21.field280 = arg1.method2429(0) == 1;
        class313.field4316 = arg1.method2429(0) == 1;
        class207.field2795 = arg1.method2429(arg0 + 2) == 1 ? 1 : 0;
        class366.field5126 = arg0 == ~arg1.method2429(0);
        class427.field6127 = arg1.method2429(0) == 1;
        class57.field813 = arg1.method2429(0) == 1;
        class410.field5956 = arg1.method2429(0);
        if (class410.field5956 > 2) {
            class410.field5956 = 2;
        }
        if (var2 >= 2) {
            class412.field5977 = arg1.method2429(arg0 ^ 0xFFFFFFFE) == 1;
        } else {
            class412.field5977 = arg1.method2429(0) == 1;
            arg1.method2429(0);
        }
        class406.field5904 = arg1.method2429(0) == 1;
        class72.field1114 = arg1.method2429(0) == 1;
        class410.field5960 = arg1.method2429(0);
        if (class410.field5960 > 2) {
            class410.field5960 = 2;
        }
        class67.field1056 = class410.field5960;
        class267.field3639 = arg1.method2429(0) == 1;
        class396.field5788 = arg1.method2429(0);
        if (class396.field5788 > 127) {
            class396.field5788 = 127;
        }
        class276.field3750 = arg1.method2429(0);
        class406.field5895 = arg1.method2429(arg0 + 2);
        if (class406.field5895 > 127) {
            class406.field5895 = 127;
        }
        if (var2 >= 1) {
            class308.field4227 = arg1.method2403((byte) 84);
            class29.field457 = arg1.method2403((byte) 72);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2429(0);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2429(0);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class275.field3730 < 96) {
                var4 = 0;
            }
            class132.method901(-32190, var4);
        }
        if (var2 >= 5) {
            class323.field4428 = arg1.method2413((byte) -30);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class152.field2153 = var5 = arg1.method2429(0);
        }
        if (class152.field2153 != 1 && class152.field2153 != 2) {
            class152.field2153 = 2;
        }
        if (var2 >= 7) {
            class198.field2742 = arg1.method2429(0) == 1;
        }
        if (var2 >= 8) {
            class188.field2609 = arg1.method2429(arg0 + 2) == 1;
        }
        if (var2 >= 9) {
            class129.field1800 = arg1.method2429(0);
        }
        if (class129.field1800 < 0 || class129.field1800 > 3) {
            class129.field1800 = 0;
        }
        if (var2 >= 10) {
            class233.field3156 = arg1.method2429(0) != 0;
        }
        if (var2 >= 11) {
            class48.field732 = arg1.method2429(0) != 0;
        }
        if (var2 >= 12) {
            class207.field2795 = arg1.method2429(0);
        }
        if (class207.field2795 < 0 || class207.field2795 > 2) {
            class207.field2795 = 1;
        }
        if (var2 >= 13) {
            class10.field147 = arg1.method2429(0) == 1;
        }
        if (var2 >= 14) {
            class28.field448 = arg1.method2429(0);
        } else if (var5 == 0) {
            class28.field448 = 2;
        } else {
            class28.field448 = 1;
        }
        if (class28.field448 < 0 || class28.field448 > 3) {
            class28.field448 = 2;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)[I")
    public final int[] method2729(int arg0, int arg1, int arg2) {
        field6257++;
        if (arg1 != 0) {
            field6266 = -0.075065166F;
        }
        return this.field6270[arg0].field6256 ? this.field6270[arg0].method14(arg2, 18338) : this.field6270[arg0].method85(-13348, arg2)[0];
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public void method1668(int arg0) {
        if (this.field6256) {
            this.field6258.method2691((byte) 17);
            this.field6258 = null;
        } else {
            this.field6259.method1849((byte) 1);
            this.field6259 = null;
        }
        field6269++;
        if (arg0 != 14) {
            this.method14(101, -40);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
    public void method2684(int arg0, byte arg1, int arg2) {
        if (arg1 >= -21) {
            this.method85(11, -76);
        }
        field6265++;
        int var4 = this.field6261 == 255 ? arg2 : this.field6261;
        if (this.field6256) {
            this.field6258 = new class427(var4, arg2, arg0);
        } else {
            this.field6259 = new class286(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)I")
    public int method2682(byte arg0) {
        field6268++;
        return arg0 == 98 ? -1 : 75;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V")
    public static final void method2730(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -20 % ((45 - arg2) / 56);
        class31.field485 = arg4;
        class23.field310 = arg1;
        class450.field6530 = arg3;
        class368.field5164 = arg0;
        field6272++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZI)[[I")
    public final int[][] method2731(int arg0, boolean arg1, int arg2) {
        field6264++;
        if (arg1) {
            this.method85(127, 55);
        }
        if (this.field6270[arg2].field6256) {
            int[] var4 = this.field6270[arg2].method14(arg0, 18338);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field6270[arg2].method85(-13348, arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILeb;)V")
    public void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            this.field6261 = -25;
        }
        field6260++;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    public void method44(int arg0) {
        if (arg0 != -14) {
            field6253 = false;
        }
        field6267++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
    public int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            method2732((byte) 44);
        }
        field6271++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)I")
    public int method1667(int arg0) {
        if (arg0 != -1) {
            this.field6259 = null;
        }
        field6254++;
        return -1;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IZ)V")
    public class436(int arg0, boolean arg1) {
        this.field6270 = new class436[arg0];
        this.field6256 = arg1;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[[I")
    public int[][] method85(int arg0, int arg1) {
        field6262++;
        if (arg0 != -13348) {
            this.field6258 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(B)V")
    public static void method2732(byte arg0) {
        if (arg0 < 14) {
            method2728(78, (class371) null);
        }
        field6255 = null;
    }
}
