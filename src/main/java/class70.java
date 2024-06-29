import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class70 implements class24 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field966 = -60;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    public static int[] field964 = new int[200];

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[Lnb;")
    public static class181[] field969 = new class181[14];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
    public final String method141(int arg0, long arg1, int[] arg2, int arg3) {
        field965++;
        int var6 = -39 % ((-arg0 - 25) / 55);
        if (arg3 == 0) {
            class12 var7 = class76.field1028.method1741(arg2[0], (byte) 86);
            return var7.method79((int) arg1, 20);
        } else if (arg3 == 1 || arg3 == 10) {
            class443 var8 = class175.field2385.method1557((int) arg1, 21992);
            return var8.field5996;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class76.field1028.method1741(arg2[0], (byte) 66).method79((int) arg1, 20);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field969 = null;
        field964 = null;
        if (arg0 != -7710) {
            field963 = 121;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static final void method459(byte arg0) {
        if (arg0 < 66) {
            method458(28);
        }
        field967++;
        class294.method1651(false, 64);
        if (class447.field6086 >= 0 && class447.field6086 != 0) {
            class107.method664(class447.field6086, (byte) 122);
            class447.field6086 = -1;
        }
    }
}
