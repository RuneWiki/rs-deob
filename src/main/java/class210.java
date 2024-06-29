import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class210 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3554 = "flash1:";

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    public static int[] field3555 = new int[128];

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
    public static int[] field3561 = new int[2000];

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lbn;")
    public static class74 field3559;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I", line = 8)
    public static final int method1562(int arg0, int arg1, int arg2) {
        if (arg1 > -23) {
            return -59;
        } else {
            field3556++;
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 27)
    public static void method1563(byte arg0) {
        field3559 = null;
        field3554 = null;
        field3555 = null;
        if (arg0 != 115) {
            field3561 = (int[]) null;
        }
        field3561 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V", line = 43)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class317.method2184(arg1 + arg4, (byte) 125, class64.field1007[arg0], arg3, arg1 - arg4);
        int var5 = 0;
        field3558++;
        if (arg2 != 10132) {
            method1565(-84);
        }
        int var6 = -arg4;
        int var7 = arg4;
        int var8 = -1;
        while (var7 > var5) {
            var5++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                var6 -= var7 << 1;
                int[] var9 = class64.field1007[arg0 - var7];
                int var10 = arg1 + var5;
                int[] var11 = class64.field1007[arg0 + var7];
                int var12 = arg1 - var5;
                class317.method2184(var10, (byte) 117, var11, arg3, var12);
                class317.method2184(var10, (byte) -59, var9, arg3, var12);
            }
            int[] var13 = class64.field1007[arg0 + var5];
            int[] var14 = class64.field1007[arg0 - var5];
            int var15 = arg1 - var7;
            int var16 = arg1 + var7;
            class317.method2184(var16, (byte) 101, var13, arg3, var15);
            class317.method2184(var16, (byte) 92, var14, arg3, var15);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 95)
    public static final void method1565(int arg0) {
        field3560++;
        if (arg0 == 0) {
            class257.field4133.method466(-1);
            class342.field5447.method466(arg0 - 1);
            class85.field1359.method466(~arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 112)
    public static final void method1566(Component arg0, byte arg1) {
        field3557++;
        arg0.removeMouseListener(class119.field2062);
        arg0.removeMouseMotionListener(class119.field2062);
        arg0.removeFocusListener(class119.field2062);
        class293.field4683 = 0;
        int var2 = 43 / ((-arg1 - 46) / 35);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BI)V")
    public abstract void method1356(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1355(byte arg0);
}
