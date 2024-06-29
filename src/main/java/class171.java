import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class171 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2666 = 0;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[Llj;")
    public static class289[] field2664;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[[[Ljo;")
    public static class150[][][] field2668;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 8)
    public static final void method1179() {
        if (class353.field5620 != null) {
            for (int var0 = 0; var0 < class353.field5620.length; var0++) {
                for (int var1 = 0; var1 < class263.field4155; var1++) {
                    for (int var2 = 0; var2 < class163.field2590; var2++) {
                        class353.field5620[var0][var1][var2] = null;
                    }
                }
            }
        }
        class308.field5020 = (class226[][]) null;
        if (class275.field4546 != null) {
            for (int var3 = 0; var3 < class275.field4546.length; var3++) {
                for (int var4 = 0; var4 < class263.field4155; var4++) {
                    for (int var5 = 0; var5 < class163.field2590; var5++) {
                        class275.field4546[var3][var4][var5] = null;
                    }
                }
            }
        }
        class121.field1808 = (class226[][]) null;
        class197.field3038 = 0;
        if (class325.field5327 != null) {
            for (int var6 = 0; var6 < class197.field3038; var6++) {
                class325.field5327[var6] = null;
            }
        }
        if (class48.field695 != null) {
            for (int var7 = 0; var7 < class61.field931; var7++) {
                class48.field695[var7] = null;
            }
            class61.field931 = 0;
        }
        if (class72.field1108 != null) {
            for (int var8 = 0; var8 < class72.field1108.length; var8++) {
                class72.field1108[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnm;I)V", line = 113)
    public static final void method1180(class221 arg0, int arg1) {
        int var2 = 13 / ((arg1 + 35) / 42);
        class39.field580 = arg0;
        field2673++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V", line = 123)
    public static final void method1181(byte arg0, int arg1) {
        class211 var2 = class17.method115(7, arg1, 4086);
        field2671++;
        var2.method1435((byte) -2);
        if (arg0 != 90) {
            field2665 = 76;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 135)
    public static void method1182(byte arg0) {
        field2668 = (class150[][][]) null;
        field2664 = null;
        int var1 = -71 / ((arg0 - 53) / 57);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V", line = 156)
    public static final void method1183(int arg0, byte arg1) {
        field2670++;
        if (arg1 <= -10 && class31.method266(arg0, 1)) {
            class59.method435(-1, class167.field2627[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V", line = 176)
    public class171(int arg0, int arg1, int arg2) {
        this.field2667 = arg0;
        this.field2663 = arg2;
        this.field2672 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
    public abstract void method244(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
    public abstract void method236(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)V")
    public abstract void method242(int arg0, int arg1, byte arg2);
}
