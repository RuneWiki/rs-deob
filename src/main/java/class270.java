import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class270 extends class35 {

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Z")
    public boolean field4055;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "[Lba;")
    public class270[] field4063;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field4049 = -1;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4058 = " from your friend list first.";

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4062 = "wave2:";

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[[I")
    public static int[][] field4064 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[I")
    public static int[] field4065 = new int[13];

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lfg;")
    public static class18 field4054 = new class18(64);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Ldp;")
    public static class174 field4043;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lwq;")
    public class33 field4046;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lna;")
    public class50 field4053;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 11)
    public void method219(int arg0, int arg1, int arg2) {
        field4061++;
        int var4 = this.field4059 == 255 ? arg1 : this.field4059;
        if (this.field4055) {
            this.field4053 = new class50(var4, arg1, arg0);
        } else {
            this.field4046 = new class33(var4, arg1, arg0);
        }
        if (arg2 != 0) {
            this.field4053 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 35)
    public static void method1926(int arg0) {
        field4054 = null;
        field4043 = null;
        field4065 = null;
        field4058 = null;
        field4062 = null;
        if (arg0 != 5658) {
            field4043 = null;
        }
        field4064 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)[[I", line = 54)
    public int[][] method123(boolean arg0, int arg1) {
        if (!arg0) {
            this.method83(true);
        }
        field4045++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)[I", line = 65)
    public final int[] method1927(int arg0, int arg1, int arg2) {
        field4052++;
        if (arg0 != 0) {
            this.method123(false, -27);
        }
        return this.field4063[arg1].field4055 ? this.field4063[arg1].method81((byte) 85, arg2) : this.field4063[arg1].method123(true, arg2)[0];
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I", line = 87)
    public int method128(int arg0) {
        int var2 = -16 / ((arg0 - 41) / 43);
        field4042++;
        return -1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 99)
    public void method83(boolean arg0) {
        field4051++;
        if (!arg0) {
            method1926(-102);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIZI)V", line = 112)
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            class394.method2507(2048);
        }
        field4048++;
        if (class315.field4585 != null && (arg0 != 3 || class331.field4757 != arg2 || class7.field99 != arg3)) {
            class89.method664(class315.field4585, class188.field2783, -1);
            class315.field4585 = null;
        }
        if (arg0 == 3 && class315.field4585 == null) {
            class315.field4585 = class310.method2115(class188.field2783, arg2, 0, arg3, (byte) -110, 0);
            if (class315.field4585 != null) {
                class331.field4757 = arg2;
                class7.field99 = arg3;
                class119.method1002(0, class188.field2783);
            }
        }
        if (arg0 == 3 && class315.field4585 == null) {
            method1928(class62.field1007, arg1, -1, -1, true, 126);
            return;
        }
        Container var6;
        if (class315.field4585 != null) {
            var6 = class315.field4585;
            class311.field4526 = arg3;
            class349.field4962 = arg2;
        } else if (class239.field3443 == null) {
            var6 = class188.field2783.field2639;
            class349.field4962 = var6.getSize().width;
            class311.field4526 = var6.getSize().height;
        } else {
            Insets var7 = class239.field3443.getInsets();
            int var10001 = var7.right + var7.left;
            class349.field4962 = class239.field3443.getSize().width - var10001;
            class311.field4526 = class239.field3443.getSize().height - var7.bottom - var7.top;
            var6 = class239.field3443;
        }
        if (arg0 == 1) {
            class277.field4170 = 503;
            class358.field5107 = (class349.field4962 - 765) / 2;
            class284.field4259 = 0;
            class113.field1819 = 765;
        } else if (class75.field1288 < 96 && class288.field4303 == 0) {
            int var8 = class349.field4962 <= 1024 ? class349.field4962 : 1024;
            class358.field5107 = (class349.field4962 - var8) / 2;
            int var9 = class311.field4526 > 768 ? 768 : class311.field4526;
            class113.field1819 = var8;
            class277.field4170 = var9;
            class284.field4259 = 0;
        } else {
            class358.field5107 = 0;
            class113.field1819 = class349.field4962;
            class277.field4170 = class311.field4526;
            class284.field4259 = 0;
        }
        if (class360.field5124 != 0) {
            boolean var10000;
            if (class113.field1819 < 1024 && class277.field4170 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class322.method2145(class288.field4303, false);
        } else {
            class33.field475.setSize(class113.field1819, class277.field4170);
            if (class73.field1235 != null) {
                class73.field1235.method684();
            }
            if (class239.field3443 == var6) {
                Insets var10 = class239.field3443.getInsets();
                class33.field475.setLocation(class358.field5107 + var10.left, class284.field4259 + var10.top);
            } else {
                class33.field475.setLocation(class358.field5107, class284.field4259);
            }
        }
        if (arg0 >= 2) {
            class28.field414 = true;
        } else {
            class28.field414 = false;
        }
        if (class321.field4642 != -1) {
            class93.method787((byte) 48, true);
        }
        if (class124.field2028 != null && (class240.field3463 == 30 || class240.field3463 == 25)) {
            class8.method57(44);
        }
        if (arg5 <= 123) {
            field4062 = null;
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class254.field3685[var11] = true;
        }
        class188.field2786 = true;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 262)
    public void method122(byte arg0) {
        field4044++;
        if (arg0 != -26) {
            field4064 = null;
        }
        if (this.field4055) {
            this.field4053.method397(12196);
            this.field4053 = null;
        } else {
            this.field4046.method238(0);
            this.field4046 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 288)
    public static final void method1929(int arg0) {
        for (int var1 = arg0; var1 < class278.field4176.length; var1++) {
            for (int var2 = 0; var2 < class278.field4176[0].length; var2++) {
                for (int var3 = 0; var3 < class278.field4176[0][0].length; var3++) {
                    class278.field4176[var1][var2][var3] = 0;
                }
            }
        }
        field4060++;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)I", line = 325)
    public int method220(byte arg0) {
        field4050++;
        return arg0 == 73 ? -1 : -95;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[I", line = 342)
    public int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            return null;
        } else {
            field4056++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLec;I)V", line = 367)
    public void method78(byte arg0, class37 arg1, int arg2) {
        field4057++;
        if (arg0 != 108) {
            this.method81((byte) -48, -96);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IZ)V", line = 377)
    public class270(int arg0, boolean arg1) {
        this.field4055 = arg1;
        this.field4063 = new class270[arg0];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)[[I", line = 405)
    public final int[][] method1930(int arg0, int arg1, byte arg2) {
        if (arg2 != -75) {
            field4058 = null;
        }
        field4047++;
        if (this.field4063[arg1].field4055) {
            int[] var4 = this.field4063[arg1].method81((byte) 70, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4063[arg1].method123(true, arg0);
        }
    }
}
