import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class387 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[[B")
    public static byte[][] field5782 = new byte[50][];

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field5786 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5787 = "yellow:";

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    public static int[] field5780 = new int[5];

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public static boolean field5789 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[[B")
    public static byte[][] field5785;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILnr;II)Z")
    public abstract boolean method159(int arg0, class437 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lnr;Z)Lg;")
    public abstract class433 method145(class437 arg0, boolean arg1);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)Z")
    public abstract boolean method151(byte arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLqj;)V")
    public static final void method2526(byte arg0, class238 arg1) {
        class333.field4911 = arg1;
        field5779++;
        if (arg0 <= 54) {
            field5781 = -73;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
    public static final int method2527(int arg0) {
        field5784++;
        return arg0 == -1 ? class368.field5476 : 10;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method2528(int arg0) {
        for (int var1 = 0; var1 < class439.field6430; var1++) {
            int var2 = class159.field2085[var1];
            class194 var3 = class125.field1664[var2];
            int var4 = class114.field1556.method1697(117);
            if ((var4 & 0x1) != 0) {
                var4 += class114.field1556.method1697(-63) << 8;
            }
            class175.method1069((byte) 77, var4, var3, var2);
        }
        if (arg0 != -1) {
            field5780 = null;
        }
        field5783++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public abstract void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lnr;I)V")
    public abstract void method161(class437 arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static void method2529(int arg0) {
        field5782 = null;
        if (arg0 != -22215) {
            field5786 = null;
        }
        field5780 = null;
        field5785 = null;
        field5787 = null;
        field5786 = null;
    }
}
