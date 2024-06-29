import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class407 extends class36 {

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Leea;")
    public static class114 field6140 = new class114();

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public int field6134;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Lfj;")
    public class572 field6131;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Ljava/lang/String;")
    public String field6143;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
    public int[] field6129;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[I")
    public int[] field6137;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "[Lsd;")
    public class80[] field6133;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field6135;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2576(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field6132++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg2 != 2843) {
                field6140 = null;
            }
            return var4 == 2 ? 7 - arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;)I", line = 33)
    public static final int method2577(int arg0, String arg1) {
        field6141++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 < 120) {
            method2579(102, true, 114, null, 78);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 58)
    public static final void method2578(byte arg0) {
        for (class588 var1 = (class588) class278.field3884.method719(false); var1 != null; var1 = (class588) class278.field3884.method716(14)) {
            if (var1.field8460) {
                var1.method3437(-113);
            }
        }
        field6138++;
        for (class588 var2 = (class588) field6140.method719(false); var2 != null; var2 = (class588) field6140.method716(14)) {
            if (var2.field8460) {
                var2.method3437(-115);
            }
        }
        if (arg0 > -114) {
            field6140 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILjava/lang/String;I)V", line = 95)
    public static final void method2579(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
        class239.method1597(arg4, arg3, false, arg2, (byte) 110, arg1, null);
        field6136++;
        if (arg0 != 1549) {
            field6140 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 113)
    public static void method2580(byte arg0) {
        field6140 = null;
        if (arg0 != -120) {
            field6140 = null;
        }
    }
}
