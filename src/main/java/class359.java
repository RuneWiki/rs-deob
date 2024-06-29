import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class359 {

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Luu;")
    private class191 field5518;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[F")
    public static float[] field5517 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field5513 = 0;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[[B")
    public static byte[][] field5520 = new byte[250][];

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lwi;")
    public static class330 field5512 = new class330(4);

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
    public static int[] field5521 = new int[3];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Luu;")
    public static class191 field5509;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Luu;")
    public static class191 field5511;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Luu;")
    public static class191 field5514;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZ)B", line = 10)
    public static final byte method2293(int arg0, int arg1, boolean arg2) {
        field5515++;
        if (!arg2) {
            field5521 = null;
        }
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z", line = 29)
    public static final boolean method2294(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field5521 = null;
        }
        field5519++;
        return (arg1 & 0x70000) != 0 | class307.method1928(arg0, arg1, 33) || class418.method2556(-128, arg1, arg0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZBI)V", line = 47)
    public static final void method2295(boolean arg0, byte arg1, int arg2) {
        field5508++;
        class67.field955 = arg2;
        class445.field6688 = 3;
        if (arg1 != -62) {
            field5521 = null;
        }
        class289.method1852(class501.field7397.field2603, arg1 + 167, class501.field7397.field2602);
        if (arg0) {
            class340.method2196("", "", true);
        } else {
            class170.method1156(false);
            class340.method2196(class109.field1537, class33.field512, true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 72)
    public static void method2296(int arg0) {
        field5520 = null;
        field5514 = null;
        field5517 = null;
        field5512 = null;
        field5511 = null;
        int var1 = 11 / ((arg0 - 63) / 40);
        field5521 = null;
        field5509 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILdq;)I", line = 98)
    public static final int method2297(int arg0, int arg1, class500 arg2) {
        if (arg1 != 992) {
            method2295(false, (byte) 107, -53);
        }
        field5516++;
        return -1;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Liv;ILuu;)V", line = 124)
    public class359(class65 arg0, int arg1, class191 arg2) {
        new class330(64);
        this.field5518 = arg2;
        this.field5510 = this.field5518.method1290(false, 15);
    }
}
