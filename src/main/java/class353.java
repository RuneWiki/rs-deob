import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class class353 {

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "[I")
    public static int[] field5113 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Lqk;")
    public static class1 field5114 = new class1(44, 11);

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "Lho;")
    public static class318 field5119;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "Ldw;")
    public static class587 field5116;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
    public static int[] field5111;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([BB)V")
    public abstract void method2219(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2220(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Laa;ILho;Lsha;IBII)V")
    public static final void method2221(class87 arg0, int arg1, class318 arg2, class115 arg3, int arg4, byte arg5, int arg6, int arg7) {
        field5112++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (class695.field9691 == 4) {
            var8 = (int) class702.field9790 & 0x3FFF;
        } else {
            var8 = (int) class702.field9790 + class703.field9795 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field1560 / 2, arg3.field1517 / 2) + 10;
        int var10 = arg6 * arg6 + (arg1 * arg1);
        if (arg5 <= 6) {
            field5113 = null;
        }
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class448.field6265[var8];
        int var12 = class448.field6270[var8];
        if (class695.field9691 != 4) {
            var11 = var11 * 256 / (class686.field9577 + 256);
            var12 = var12 * 256 / (class686.field9577 + 256);
        }
        int var13 = arg1 * var11 + (arg6 * var12) >> 14;
        int var14 = arg1 * var12 - (arg6 * var11) >> 14;
        arg2.method747(arg4 + (arg3.field1560 / 2) + var13 - (arg2.method749() / 2), -var14 + (arg3.field1517 / 2 + arg7 - arg2.method736() / 2), arg0, arg4, arg7);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method2222(int arg0, int arg1, int arg2, byte[] arg3) {
        field5117++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg3[arg1 + var5];
            }
        } else {
            var4 = arg3;
        }
        class292 var6 = new class292();
        var6.method1934(true);
        var6.method1933((byte) -102, (long) (arg0 * 8), var4);
        if (arg2 == 64) {
            byte[] var7 = new byte[64];
            var6.method1930(var7, 0, -19134);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2223(int arg0);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)V")
    public static final void method2224(int arg0, int arg1) {
        field5115++;
        class39 var2 = class4.field26;
        synchronized (class4.field26) {
            class4.field26.method308(-1, arg1);
        }
        if (arg0 >= -108) {
            field5111 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
    public static void method2225(byte arg0) {
        field5111 = null;
        field5113 = null;
        field5114 = null;
        field5116 = null;
        field5119 = null;
        if (arg0 < 72) {
            method2224(46, -103);
        }
    }
}
