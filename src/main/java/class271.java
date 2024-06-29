import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class271 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
    public static int[] field4733 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
    public static int[] field4734 = new int[2500];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lsf;")
    public static class108 field4735 = class140.method973(255, "<img=1>");

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lsf;")
    public static class108 field4745 = class140.method973(255, "<col=ffffff>");

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[Lsf;")
    public static class108[] field4736;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BB)[B", line = 11)
    public static final byte[] method1953(byte[] arg0, byte arg1) {
        field4743++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -103) {
            method1955((byte) 121, -63);
        }
        byte[] var2 = new byte[arg0.length];
        class23.method156(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[B)Lf;", line = 45)
    public static final class250 method1954(int arg0, byte[] arg1) {
        field4741++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 0) {
            method1959(-48);
        }
        class250 var2 = new class250(arg1, class154.field2775, class88.field1383, class155.field2780, class273.field4795, class94.field1512);
        class15.method100(arg0 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V", line = 63)
    public static final void method1955(byte arg0, int arg1) {
        field4740++;
        if (arg0 < 12) {
            method1958((byte) -62, (class108) null, false);
        }
        class120 var2 = class248.method1704(11, 77, arg1);
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 86)
    public static void method1956(int arg0) {
        field4733 = null;
        field4736 = null;
        field4734 = null;
        field4735 = null;
        field4745 = null;
        if (arg0 < 0) {
            field4736 = (class108[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 103)
    public static final void method1957(int arg0) {
        int var1 = 65 / ((arg0 - 22) / 51);
        class240.field4185.method639(-100);
        field4739++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLsf;Z)V", line = 118)
    public static final void method1958(byte arg0, class108 arg1, boolean arg2) {
        field4737++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class158.field2850.method535(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class158.field2850.method546(arg1, 250) * 13;
        if (class231.field4051) {
            class50.method348(var4 - var3, -var3 + var6, var5 + var3 + var3, var3 + var7 + var3, 0);
            class50.method353(var4 - var3, -var3 + var6, var5 + var3 + var3, var3 + var7 - -var3, 16777215);
        } else {
            class28.method193(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var3 + var7, 0);
            class28.method183(var4 - var3, -var3 + var6, var3 + var3 + var5, var7 - -var3 + var3, 16777215);
        }
        class158.field2850.method531(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class101.method702(-1, var4 - var3, var5 - -var3 - -var3, var6 - var3, var7 - -var3 + var3);
        if (!arg2) {
            class171.method1186(31962, var5, var7, var4, var6);
        } else if (class231.field4051) {
            class231.method1598();
        } else {
            try {
                Graphics var8 = class13.field158.getGraphics();
                class216.field3833.method262(0, var8, -8278, 0);
            } catch (Exception var10) {
                class13.field158.repaint();
            }
        }
        if (arg0 < 100) {
            field4745 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 177)
    public static final void method1959(int arg0) {
        if (class246.field4264 == null || class256.field4505 == null) {
            class246.field4264 = new int[256];
            class256.field4505 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class246.field4264[var1] = (int) (Math.sin(var2) * 4096.0D);
                class256.field4505[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 == 1) {
            field4742++;
        }
    }
}
