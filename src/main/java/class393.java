import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class393 extends class5 {

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[Z")
    public boolean[] field6008;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[[I")
    public int[][] field6009;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
    public int[] field6014;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
    public int[] field6011;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field6007 = -1;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lnv;")
    public static class292 field6015 = class222.method1498(false);

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field6017 = 0;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Luo;Luo;IIZIZ)I", line = 4)
    public static final int method2448(class412 arg0, class412 arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field6010++;
        int var7 = class281.method1799(arg1, arg5, (byte) -54, arg6, arg0);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg2 == arg3) {
            return 0;
        } else {
            int var8 = class281.method1799(arg1, arg3, (byte) -117, arg4, arg0);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZ)V", line = 37)
    public static final void method2449(byte arg0, boolean arg1) {
        field6012++;
        if (arg0 > -63) {
            return;
        }
        class83.field1211++;
        class424.method2582(class377.field5765, -1);
        for (class436 var2 = (class436) class312.field4570.method1743(false); var2 != null; var2 = (class436) class312.field4570.method1742(125)) {
            if (!var2.method24(-25618)) {
                var2 = (class436) class312.field4570.method1743(false);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6603 == 0) {
                class486.method2910(var2, arg1, true, 0);
            }
        }
        if (class201.field2705 != null) {
            class206.method1385(2, class201.field2705);
            class201.field2705 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 77)
    public static void method2450(int arg0) {
        field6015 = null;
        if (arg0 < 88) {
            method2448(null, null, -57, 109, false, 40, true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I[B)V", line = 99)
    public class393(int arg0, byte[] arg1) {
        this.field6013 = arg0;
        class164 var3 = new class164(arg1);
        this.field6006 = var3.method1087(false);
        this.field6008 = new boolean[this.field6006];
        this.field6009 = new int[this.field6006][];
        this.field6014 = new int[this.field6006];
        this.field6011 = new int[this.field6006];
        for (int var4 = 0; var4 < this.field6006; var4++) {
            this.field6011[var4] = var3.method1087(false);
        }
        for (int var5 = 0; var5 < this.field6006; var5++) {
            this.field6008[var5] = var3.method1087(false) == 1;
        }
        for (int var6 = 0; var6 < this.field6006; var6++) {
            this.field6014[var6] = var3.method1074(-635989152);
        }
        for (int var7 = 0; var7 < this.field6006; var7++) {
            this.field6009[var7] = new int[var3.method1087(false)];
        }
        for (int var8 = 0; var8 < this.field6006; var8++) {
            for (int var9 = 0; var9 < this.field6009[var8].length; var9++) {
                this.field6009[var8][var9] = var3.method1087(false);
            }
        }
    }
}
