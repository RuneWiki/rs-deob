import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class519 extends class388 {

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[[S")
    public short[][] field7478;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "D")
    public double field7475;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7476 = class690.method3903(4, 1600);

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field7483 = new String[200];

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Llc;")
    public static class435 field7480 = new class435(116, 6);

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field7487 = new String[200];

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7485 = 0;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Lgr;")
    public static class530 field7486 = new class530(68, 3);

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
    public static int[] field7479;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3154(int arg0, String arg1) {
        field7477++;
        int var2 = 0;
        if (arg0 <= 122) {
            field7486 = null;
        }
        while (var2 < class683.field9695.length) {
            if (class683.field9695[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(JI)V")
    public static final void method3155(long arg0, int arg1) {
        if (arg1 != 6) {
            return;
        }
        field7481++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)J")
    public final long method3156(byte arg0) {
        field7482++;
        if (arg0 != -24) {
            this.field7475 = -1.6620739757621947D;
        }
        return (long) (this.field7478.length << 0 | this.field7478[0].length);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Z)V")
    public static void method3157(boolean arg0) {
        field7483 = null;
        field7480 = null;
        field7487 = null;
        field7486 = null;
        field7479 = null;
        if (!arg0) {
            field7480 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([[SD)V")
    public class519(short[][] arg0, double arg1) {
        this.field7478 = arg0;
        this.field7475 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
    public static final void method3158(byte arg0, int arg1) {
        field7484++;
        if (arg0 != 53) {
            return;
        }
        class39.field672 = 2;
        class544.field7903 = arg1;
        long var2 = 0L;
        if (client.field6418 == null) {
            class743.method4134(true, 35);
        } else {
            class479 var4 = new class479(class517.method3147(class265.method1749(client.field6418, (byte) -125), (byte) -20));
            long var5 = var4.method2907(79);
            class499.field7171 = var4.method2907(-120);
            class715.method4014((byte) 7, class71.method622((byte) 29, var5), true, "");
        }
    }
}
