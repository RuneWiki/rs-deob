import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class595 extends class134 {

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "S")
    public short field8395;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "[I")
    public static int[] field8399 = new int[3];

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method3395(int arg0, int arg1, byte arg2) {
        if (arg2 != 109) {
            method3397(95, null);
        }
        field8396++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 18)
    public static void method3396(byte arg0) {
        field8399 = null;
        if (arg0 != -91) {
            field8399 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILoh;)I", line = 28)
    public static final int method3397(int arg0, class404 arg1) {
        field8398++;
        int var2 = 0;
        if (arg1.method2463((byte) 102, class418.field6080)) {
            var2++;
        }
        if (arg1.method2463((byte) 106, class222.field2552)) {
            var2++;
        }
        if (arg1.method2463((byte) 104, class270.field3335)) {
            var2++;
        }
        if (arg1.method2463((byte) 115, class683.field9666)) {
            var2++;
        }
        if (arg1.method2463((byte) 113, class745.field10408)) {
            var2++;
        }
        if (arg1.method2463((byte) 102, class449.field6487)) {
            var2++;
        }
        if (arg1.method2463((byte) 101, class148.field1645)) {
            var2++;
        }
        if (arg1.method2463((byte) 103, class354.field4543)) {
            var2++;
        }
        if (arg1.method2463((byte) 111, class711.field10017)) {
            var2++;
        }
        if (arg1.method2463((byte) 95, class603.field8586)) {
            var2++;
        }
        if (arg1.method2463((byte) 115, class645.field9218)) {
            var2++;
        }
        if (arg1.method2463((byte) 95, class322.field4115)) {
            var2++;
        }
        if (arg1.method2463((byte) 109, class713.field10033)) {
            var2++;
        }
        if (arg1.method2463((byte) 117, class119.field1234)) {
            var2++;
        }
        if (arg1.method2463((byte) 110, class753.field10526)) {
            var2++;
        }
        if (arg0 < 29) {
            method3395(87, 4, (byte) 55);
        }
        if (arg1.method2463((byte) 123, class280.field3433)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V", line = 102)
    public class595() {
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIII[BI)Z", line = 105)
    public static final boolean method3398(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field8397++;
        int var7 = arg3 % arg0;
        int var8;
        if (~var7 == arg4) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg0);
        int var10 = -((arg3 + arg0 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg2] == 0) {
                    return true;
                }
                arg2 += arg0;
            }
            int var13 = arg2 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(S)V", line = 153)
    public class595(short arg0) {
        this.field8395 = arg0;
    }
}
