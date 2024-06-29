import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class444 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Z")
    public static boolean field6477 = true;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "[Lih;")
    public static class416[] field6480 = new class416[50];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 4)
    public static final String[] method2749(int arg0, String[] arg1) {
        field6473++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0 > -11) {
            field6479 = -16;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I", line = 31)
    public static final int method2750(int arg0, int arg1) {
        field6478++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != 726390668) {
            method2752((class375) null, -6, -57, -99);
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V", line = 57)
    public static final void method2751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6476++;
        int var6 = class21.method153(arg3, (byte) -100, class396.field5925, class99.field1378);
        int var7 = class21.method153(arg0, (byte) -76, class396.field5925, class99.field1378);
        int var8 = class21.method153(arg5, (byte) -88, class185.field3005, class406.field6033);
        int var9 = class21.method153(arg2, (byte) -113, class185.field3005, class406.field6033);
        if (arg4 != 5) {
            field6480 = null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class256.method1769(var9, class277.field4414[var10], (byte) 70, arg1, var8);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lsn;III)V", line = 84)
    public static final void method2752(class375 arg0, int arg1, int arg2, int arg3) {
        class136.field2139[arg2][arg1] = arg0;
        field6472++;
        if (arg3 != 19015) {
            method2754(false);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)I", line = 97)
    public static final int method2753(int arg0, byte arg1) {
        field6475++;
        if (arg1 > -17) {
            field6480 = null;
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 109)
    public static void method2754(boolean arg0) {
        field6480 = null;
        if (arg0) {
            method2751(46, 66, -110, 86, 70, -8);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLii;)Lii;")
    public abstract class328 method857(byte arg0, class328 arg1);
}
