import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class280 {

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "Lwp;")
    public static class453 field3506 = new class453(102, 12);

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3509 = new String[100];

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "F")
    public static float field3512 = 1.0F;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "Lwp;")
    public static class453 field3515 = new class453(46, 4);

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "Lwl;")
    public static class679 field3517 = new class679("RC", 1);

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "[F")
    public static float[] field3519 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3518 = new String[8];

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "Lwp;")
    public static class453 field3520 = new class453(59, 8);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "Lpl;")
    public static class612 field3511;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Liw;")
    public static final class532 method1587(int arg0) {
        field3508++;
        if (class523.field7118 < class68.field930.length) {
            return class68.field930[class523.field7118++];
        } else {
            int var1 = 15 / ((arg0 + 35) / 36);
            return null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lpl;IB)Lsa;")
    public static final class595 method1588(class612 arg0, int arg1, byte arg2) {
        if (arg2 == 32) {
            field3513++;
            byte[] var3 = arg0.method3344(103, arg1);
            return var3 == null ? null : new class595(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1589(String[] arg0, int arg1, int arg2, int arg3) {
        field3521++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            if (arg2 != 4) {
                return null;
            }
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)I")
    public final int method1590(int arg0) {
        if (arg0 < 68) {
            return 38;
        } else {
            field3507++;
            return this.field3510;
        }
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
    public static void method1591(int arg0) {
        field3509 = null;
        field3511 = null;
        field3518 = null;
        if (arg0 != 27598) {
            field3515 = null;
        }
        field3517 = null;
        field3506 = null;
        field3519 = null;
        field3515 = null;
        field3520 = null;
    }

    @OriginalMember(owner = "client!rga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3514++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(II)V")
    public class280(int arg0, int arg1) {
        this.field3516 = arg1;
        this.field3510 = arg0;
    }
}
