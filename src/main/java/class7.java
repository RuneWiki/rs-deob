import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class362 {

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lqc;")
    public class740 field47;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
    public boolean field55;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[I")
    public static int[] field49 = new int[1000];

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    public static int[] field54 = new int[13];

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[[I")
    public static int[][] field59 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field48 = -1;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "D")
    public static double field53;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Z")
    public boolean field51;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "Z")
    public boolean field60;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
    public boolean field62;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 7)
    public static void method26(byte arg0) {
        field49 = null;
        field54 = null;
        if (arg0 != 79) {
            method30(null, 57);
        }
        field59 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method27(boolean arg0) {
        field56++;
        if (class33.field850 < 0) {
            class33.field850 = 0;
            class638.field8761 = -1;
            class606.field8321 = -1;
        }
        if (class33.field850 > class489.field6781) {
            class33.field850 = class489.field6781;
            class606.field8321 = -1;
            class638.field8761 = -1;
        }
        if (class614.field8388 < 0) {
            class606.field8321 = -1;
            class614.field8388 = 0;
            class638.field8761 = -1;
        }
        if (class614.field8388 > class489.field6789) {
            class614.field8388 = class489.field6789;
            class638.field8761 = -1;
            class606.field8321 = -1;
        }
        if (arg0) {
            field53 = 1.5874482848681375D;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILvq;)Ljava/lang/String;", line = 75)
    public static final String method28(int arg0, class462 arg1) {
        field58++;
        if (arg0 != -44) {
            method28(91, null);
        }
        return arg1.field6499 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)V", line = 88)
    public static final void method29(boolean arg0, int arg1, int arg2) {
        field57++;
        class594 var3 = class692.method3869(arg2, (byte) 105, 7);
        var3.method3378(-25490);
        if (!arg0) {
            field48 = -113;
        }
        var3.field8126 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljba;I)V", line = 106)
    public static final void method30(class400 arg0, int arg1) {
        arg0.field5903 = false;
        if (arg1 < 39) {
            return;
        }
        if (arg0.field5906 != null) {
            arg0.field5906.field8363 = 0;
        }
        field50++;
        for (class400 var2 = arg0.method103(); var2 != null; var2 = arg0.method69()) {
            method30(var2, 40);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(ILqc;IZ)V", line = 131)
    public class7(int arg0, class740 arg1, int arg2, boolean arg3) {
        this.field61 = arg2;
        this.field47 = arg1;
        this.field52 = arg0;
        this.field55 = arg3;
    }
}
