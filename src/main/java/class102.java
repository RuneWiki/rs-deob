import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class102 extends class195 {

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field1552 = 7759444;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "Lck;")
    public static class119 field1550 = class298.method1987((byte) 126, "<col=00ffff>");

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lck;")
    public static class119 field1554 = class298.method1987((byte) 24, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "S")
    public static short field1553 = 32767;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "[Lpc;")
    public static class31[] field1555 = new class31[50];

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lfj;")
    public static class3 field1557;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "[Lmd;")
    public static class88[] field1558;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLtb;Lva;Lva;Z)V", line = 14)
    public static final void method673(byte arg0, class290 arg1, class36 arg2, class36 arg3, boolean arg4) {
        class229.field3716 = arg4;
        class261.field4195 = arg3;
        class108.field1648 = arg2;
        int var5 = class108.field1648.method258(-20811) - 1;
        if (arg0 >= 5) {
            field1551++;
            class106.field1637 = class108.field1648.method263(var5, 100) + var5 * 256;
            class49.field765 = arg1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[[I", line = 38)
    public final int[][] method9(byte arg0, int arg1) {
        field1549++;
        int[][] var3 = this.field3126.method603(arg1, -127);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, -10072);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return arg0 == 3 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfj;II)V", line = 98)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 <= -117) {
            field1548++;
            if (arg2 == 0) {
                this.field3127 = arg0.method64((byte) -103) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 128)
    public static void method674(int arg0) {
        field1558 = null;
        field1554 = null;
        field1555 = null;
        field1557 = null;
        if (arg0 == 0) {
            field1550 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)[I", line = 146)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            method673((byte) -88, (class290) null, (class36) null, (class36) null, false);
        }
        field1547++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 103, arg0);
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 183)
    public class102() {
        super(1, false);
    }
}
