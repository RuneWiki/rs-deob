import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class398 extends class338 {

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field5728 = 0;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
    public static boolean field5732 = false;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lph;")
    public static class114 field5730 = new class114(8);

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static volatile int field5742 = -1;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field5743 = 0;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
    public static boolean field5748 = false;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field5720;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field5721;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field5723;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field5724;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field5725;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public int field5731;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field5734;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field5738;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public int field5739;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public int field5746;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lnl;")
    public class143 field5737;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Lgm;")
    public class336 field5733;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Lwo;")
    public class52 field5750;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lqc;")
    public class94 field5740;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
    public static int[] field5736;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "[[[B")
    public static byte[][][] field5751;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static void method2486(boolean arg0) {
        field5751 = null;
        if (!arg0) {
            field5736 = null;
            field5730 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method2487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field5718++;
        int var8 = arg5 + arg7;
        int var9 = arg1 - arg7;
        if (arg6 != 45) {
            field5751 = null;
        }
        for (int var10 = arg5; var10 < var8; var10++) {
            class296.method1740(arg2, class153.field1932[var10], (byte) 81, arg0, arg3);
        }
        int var11 = arg3 - arg7;
        int var12 = arg2 + arg7;
        for (int var13 = arg1; var13 > var9; var13--) {
            class296.method1740(arg2, class153.field1932[var13], (byte) 81, arg0, arg3);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class153.field1932[var14];
            class296.method1740(arg2, var15, (byte) 81, arg0, var12);
            class296.method1740(var12, var15, (byte) 81, arg4, var11);
            class296.method1740(var11, var15, (byte) 81, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
    public static final void method2488(int arg0, byte arg1) {
        class114 var2 = client.field3456;
        synchronized (client.field3456) {
            client.field3456.method614(-121, arg0);
        }
        if (arg1 != 57) {
            method2491((String) null, 98);
        }
        field5747++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)B")
    public static final byte method2489(byte arg0, int arg1, int arg2) {
        if (arg0 > -85) {
            return -95;
        }
        field5727++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public final void method2490(int arg0) {
        field5735++;
        this.field5737 = null;
        this.field5750 = null;
        this.field5733 = null;
        if (arg0 != 8) {
            this.field5720 = 119;
        }
        this.field5740 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2491(String arg0, int arg1) {
        field5729++;
        if (arg0 == null) {
            return false;
        } else if (arg1 <= 115) {
            return true;
        } else {
            for (int var2 = 0; var2 < class452.field6573; var2++) {
                if (arg0.equalsIgnoreCase(class414.field5959[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class80.field893[var2])) {
                    return true;
                }
            }
            return false;
        }
    }
}
