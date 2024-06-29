import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class452 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public int field6649 = -1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lfa;")
    public static class156 field6648 = new class156(8);

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
    public static int[] field6656 = new int[2];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field6645;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field6646;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field6647;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public int field6652;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public int field6653;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field6655;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public int field6657;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lfs;")
    public static class387 field6644;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2725(byte[] arg0, int arg1) {
        field6654++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class201.method1412(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
    public static final void method2726(int arg0, boolean arg1) {
        field6651++;
        if (!arg1) {
            field6656 = null;
        }
        class215 var2 = class171.method1208(arg0, (byte) 116, 7);
        var2.method1469((byte) -106);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method2727(int arg0) {
        field6644 = null;
        field6656 = null;
        field6648 = null;
        if (arg0 != 14958) {
            method2726(87, false);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lba;III[Z)Z")
    public static final boolean method2728(class263 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class52.field578 != class131.field1899) {
            int var6 = class283.field4115[arg1].method426(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class142 var8 = class283.field4115[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method426(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method428(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method415(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
