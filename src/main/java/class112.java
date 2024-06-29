import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class112 {

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
    public static long field1556 = 0L;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lde;")
    public static class533 field1557 = new class533();

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1564 = -1;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field1565 = -1;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public static final void method835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1562++;
        if (arg2 <= 107) {
            method839(1, null, -42, null, 117, (byte) -85);
        }
        class748.method4177(-21727, arg6, 0, arg8, arg0, arg1, arg5, arg4, arg7, arg3);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V", line = 15)
    public static final void method836(String arg0, boolean arg1, int arg2, String arg3) {
        class572.field8088 = arg1;
        class100.field1424 = arg3;
        class273.field3888 = arg0;
        field1559++;
        if (!class572.field8088 && class100.field1424.equals("") || class273.field3888.equals("")) {
            class610.method3539(3, true);
            return;
        }
        if (class654.field9174 != 1) {
            class284.field4038 = 0;
            class194.field2941 = -1;
        }
        class439.field6504 = false;
        class610.method3539(-3, true);
        class716.field10076 = arg2;
        class233.field3400 = 1;
        class50.field719 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLvt;)V", line = 43)
    public static final void method837(byte arg0, class304 arg1) {
        field1561++;
        arg1.method3695(class603.field8537.method202((byte) -86), 255);
        arg1.method3695(class373.field5544.method202((byte) -86), 255);
        arg1.method3695(class734.field10278.method202((byte) -86), 255);
        arg1.method3695(class326.field4658.method202((byte) -86), 255);
        arg1.method3695(class756.field10584.method202((byte) -86), 255);
        arg1.method3695(class111.field1553.method202((byte) -86), 255);
        arg1.method3695(class299.field4244.method202((byte) -86), 255);
        arg1.method3695(class169.field2651.method202((byte) -86), 255);
        arg1.method3695(class640.field8990.method202((byte) -86), 255);
        arg1.method3695(class457.field6748.method202((byte) -86), 255);
        arg1.method3695(class201.field3014.method202((byte) -86), 255);
        arg1.method3695(class79.field1115.method202((byte) -86), 255);
        arg1.method3695(class248.field3606.method202((byte) -86), 255);
        arg1.method3695(class338.field4915.method202((byte) -86), 255);
        arg1.method3695(class555.field7932.method202((byte) -86), 255);
        arg1.method3695(class69.field977.method202((byte) -86), 255);
        arg1.method3695(class588.field8343.method202((byte) -86), 255);
        if (arg0 < 16) {
            method837((byte) -23, null);
        }
        arg1.method3695(class421.field6286.method202((byte) -86), 255);
        arg1.method3695(class411.field6187.method202((byte) -86), 255);
        arg1.method3695(class259.field3698.method202((byte) -86), 255);
        arg1.method3695(class134.field1791.method202((byte) -86), 255);
        arg1.method3695(class565.field8034.method202((byte) -86), 255);
        arg1.method3695(class574.field8114.method202((byte) -86), 255);
        arg1.method3695(class564.field8027.method202((byte) -86), 255);
        arg1.method3695(class87.field1245.method202((byte) -86), 255);
        arg1.method3695(class636.field8936.method202((byte) -86), 255);
        arg1.method3695(class538.field7687.method202((byte) -86), 255);
        arg1.method3695(class596.field8446.method202((byte) -86), 255);
        arg1.method3695(class597.field8455.method202((byte) -86), 255);
        arg1.method3695(class265.field3796.method202((byte) -86), 255);
        arg1.method3695(class135.field1809.method202((byte) -86), 255);
        arg1.method3695(class492.field7019.method202((byte) -86), 255);
        arg1.method3695(class407.method2590((byte) 106), 255);
        arg1.method3695(class110.method831(false), 255);
        arg1.method3695(class661.field9246.method202((byte) -86), 255);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(CZ)V", line = 92)
    public final void method838(char arg0, boolean arg1) {
        field1563++;
        OpenGL.glCallList(this.field1560 + arg0);
        if (!arg1) {
            this.method840(46);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILha;ILsu;IB)V", line = 105)
    public static final void method839(int arg0, class60 arg1, int arg2, class211 arg3, int arg4, byte arg5) {
        field1555++;
        class643 var6 = class581.field8249.method4122(arg3.field3132, (byte) -121);
        if (var6.field9017 == -1) {
            return;
        }
        int var8;
        if (arg3.field3124) {
            int var7 = arg3.field3101 + arg2;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class536 var9 = var6.method3685(arg1, (byte) 108, var8, arg3.field3103);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field3164;
        int var11 = arg3.field3152;
        if ((var8 & 0x1) == 1) {
            var10 = arg3.field3152;
            var11 = arg3.field3164;
        }
        int var12 = var9.method1504();
        int var13 = var9.method1514();
        if (var6.field9022) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (arg5 > -90) {
            return;
        }
        if (var6.field9023 == 0) {
            var9.method3149(arg4, arg0 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method3144(arg4, arg0 - ((var11 - 1) * 4), var12, var13, 0, var6.field9023 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 160)
    public final void method840(int arg0) {
        field1558++;
        int var2 = 93 % ((68 - arg0) / 36);
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V", line = 171)
    public final void method841(int arg0, int arg1) {
        field1554++;
        OpenGL.glNewList(this.field1560 + arg1, 4864);
        int var3 = -82 % ((arg0 + 48) / 46);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 181)
    public static void method842(int arg0) {
        if (arg0 != 3162) {
            field1565 = -22;
        }
        field1557 = null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lwh;I)V", line = 201)
    public class112(class148 arg0, int arg1) {
        this.field1560 = OpenGL.glGenLists(arg1);
    }
}
