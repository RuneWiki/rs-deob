import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class482 extends class337 {

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lie;")
    public static class6 field6927 = new class6("LIVE", 0);

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lob;")
    public static class521 field6930 = new class521(77, 6);

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Lob;")
    public static class521 field6935 = new class521(16, 1);

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    private int field6928;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    private int field6931;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    private int field6934;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Lod;BI)Lam;")
    public static final class449 method2889(String arg0, class352 arg1, byte arg2, int arg3) {
        ++field6926;
        if (arg2 < 58) {
            method2891((byte) 60);
        }
        if (~arg3 == -1) {
            return arg1.method2201(arg0, -92);
        } else if (~arg3 == -2) {
            try {
                class513.method3041("openjs", new Object[] { (new URL(arg1.field5199.getCodeBase(), arg0)).toString() }, arg1.field5199, -128);
                class449 var4 = new class449();
                var4.field6570 = 1;
                return var4;
            } catch (Throwable var10) {
                class449 var5 = new class449();
                var5.field6570 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                arg1.field5199.getAppletContext().showDocument(new URL(arg1.field5199.getCodeBase(), arg0), "_blank");
                class449 var6 = new class449();
                var6.field6570 = 1;
                return var6;
            } catch (Exception var11) {
                class449 var7 = new class449();
                var7.field6570 = 2;
                return var7;
            }
        } else if (~arg3 == -4) {
            try {
                class513.method3040("loggedout", arg1.field5199, 1360);
            } catch (Throwable var13) {
            }
            try {
                arg1.field5199.getAppletContext().showDocument(new URL(arg1.field5199.getCodeBase(), arg0), "_top");
                class449 var8 = new class449();
                var8.field6570 = 1;
                return var8;
            } catch (Exception var12) {
                class449 var9 = new class449();
                var9.field6570 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Z")
    public static final boolean method2890(int arg0, int arg1) {
        ++field6929;
        if (arg0 != -9108) {
            field6935 = null;
        }
        return ~arg1 == -3 || ~arg1 == -4 || ~arg1 == -5 || arg1 == 5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field6932;
        if (~arg1 == -1) {
            this.method2892(119, arg2.method1548(31529));
        }
        int var5 = -94 % ((82 - arg0) / 40);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method2891(byte arg0) {
        field6935 = null;
        if (arg0 > -11) {
            field6930 = null;
        }
        field6927 = null;
        field6930 = null;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
    private final void method2892(int arg0, int arg1) {
        this.field6934 = 4080 & arg1 >> 12;
        ++field6933;
        this.field6928 = (65280 & arg1) >> 4;
        if (arg0 <= 105) {
            field6927 = null;
        }
        this.field6931 = (arg1 & 255) << 4;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class482() {
        this(0);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
    private class482(int arg0) {
        super(0, false);
        this.method2892(109, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field6925;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class402.field5977 > var7; ++var7) {
                var4[var7] = this.field6934;
                var5[var7] = this.field6928;
                var6[var7] = this.field6931;
            }
        }
        int var8 = -50 / ((arg1 - -41) / 49);
        return var3;
    }
}
