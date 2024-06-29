import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class543 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field8118;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public int field8121;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field8119;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field8111 = new String[100];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
    public static int[] field8117 = new int[3];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1322(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method3189(byte arg0) {
        if (arg0 != -122) {
            field8111 = null;
        }
        field8111 = null;
        field8117 = null;
    }

    @OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1320(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
    public abstract void method1321();

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1314(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method1330(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
    public abstract int method1323(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method3190(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field8115++;
        if (class481.field7303) {
            return;
        }
        if (class94.field1158.field301) {
            class591.field8752 = ((int) class591.field8752 - 65 & 0xFFFFFF80);
        } else {
            class74.field860 += (-24.0F - class74.field860) / 2.0F;
        }
        class120.field1561 = true;
        class481.field7303 = true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILps;)V")
    public static final void method3191(int arg0, int arg1, class428 arg2) {
        field8113++;
        if (arg0 != 0) {
            field8117 = null;
        }
        if (class550.field8201 == null) {
            return;
        }
        try {
            class550.field8201.method1619(0L, (byte) 65);
            class550.field8201.method1611(24, -116, arg2.field6162, arg1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILk;)Lk;")
    public abstract class88 method1329(int arg0, int arg1, class88 arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method3192(int arg0, boolean arg1, String arg2) {
        field8112++;
        int var3 = class264.field3925;
        int[] var4 = class533.field7895;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class179 var7 = class383.field5604[var4[var6]];
            if (var7 != null && class239.field3493 != var7 && var7.field2718 != null && var7.field2718.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class165.method1046(-3466, class213.field3123);
                    class185.field2809++;
                    class221.field3268.method2608(var4[var6], (byte) 45);
                    class221.field3268.method2611(-29133, 0);
                } else if (arg0 == 4) {
                    class165.method1046(-3466, class224.field3316);
                    class251.field3645++;
                    class221.field3268.method2603(0, 1812160144);
                    class221.field3268.method2619(var4[var6], 1420669333);
                } else if (arg0 == 5) {
                    class46.field549++;
                    class165.method1046(-3466, class516.field7673);
                    class221.field3268.method2563(-13021, 0);
                    class221.field3268.method2608(var4[var6], (byte) 93);
                } else if (arg0 == 6) {
                    class165.method1046(-3466, class406.field5827);
                    class257.field3750++;
                    class221.field3268.method2611(-29133, 0);
                    class221.field3268.method2619(var4[var6], 1420669333);
                } else if (arg0 == 7) {
                    class165.method1046(-3466, class436.field6412);
                    class264.field3903++;
                    class221.field3268.method2611(-29133, 0);
                    class221.field3268.method2577(var4[var6], -45066936);
                }
                var5 = true;
                break;
            }
        }
        if (!arg1) {
            method3192(89, false, null);
        }
        if (!var5) {
            class62.method389(class115.field1514.method2953(3181, class77.field889) + arg2, 0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public abstract boolean method1325(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1318(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
    public abstract int method1319(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
    public abstract void method1317(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lat;[I)V")
    public abstract void method1328(class535 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class543(int arg0, int arg1, int arg2) {
        this.field8118 = arg1;
        this.field8121 = arg0;
        while (arg2 > 1) {
            this.field8119++;
            arg2 >>= 0x1;
        }
        this.field8116 = 0x1 << this.field8119;
    }
}
