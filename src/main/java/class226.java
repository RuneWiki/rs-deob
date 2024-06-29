import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class226 extends class81 {

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field3620;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "[I")
    public static int[] field3616 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3622 = "wave2:";

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field3624 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "Loi;")
    public static class319 field3621 = null;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "Lja;")
    public static class64 field3611;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Lja;")
    public static class64 field3612;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -1) {
            method1632(94, 25, -58, -123, -21, -92);
        }
        for (int var6 = arg1; var6 <= arg0; var6++) {
            class86.method614(arg2, -24891, arg3, arg4, class102.field1729[var6]);
        }
        field3617++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)I", line = 24)
    public static final int method1633(int arg0, String arg1) {
        field3614++;
        if (class43.field763 == null || arg1.length() == 0) {
            return -1;
        }
        int var2 = -84 / ((arg0 + 58) / 41);
        for (int var3 = 0; var3 < class43.field763.field3136; var3++) {
            if (class20.method158(95, class229.method1659(" ", class43.field763.field3131[var3], "<br>", -20263), arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V", line = 56)
    public static void method1634(int arg0) {
        if (arg0 != 31308) {
            field3622 = (String) null;
        }
        field3622 = null;
        field3616 = null;
        field3611 = null;
        field3612 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z", line = 71)
    public final boolean method585(byte arg0) {
        field3623++;
        if (arg0 != 78) {
            method1634(17);
        }
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V", line = 82)
    public static final void method1635(int arg0) {
        if (class148.field2386 == null || class123.field1971 == null) {
            class148.field2386 = new int[256];
            class123.field1971 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class148.field2386[var1] = (int) (Math.sin(var2) * 4096.0D);
                class123.field1971[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3619++;
        if (arg0 != 4096) {
            field3621 = (class319) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 116)
    public class226(Object arg0) {
        this.field3620 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V", line = 130)
    public static final void method1636(int arg0, int arg1, int arg2) {
        class278 var3 = class94.method672(arg2, 0);
        int var4 = var3.field4294;
        int var5 = var3.field4299;
        int var6 = var3.field4295;
        int var7 = class61.field949[var4 - var5];
        field3613++;
        if (arg1 > arg0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class48.method372(arg0 << var5 & var8 | class118.field1907[var6] & ~var8, (byte) -120, var6);
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 161)
    public final Object method589(int arg0) {
        field3615++;
        return arg0 >= -100 ? (Object) null : this.field3620;
    }
}
