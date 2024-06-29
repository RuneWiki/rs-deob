import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class177 {

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "B")
    public byte field2663;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "[I")
    public int[] field2672;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "[I")
    public int[] field2665;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "B")
    public byte field2674;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "[I")
    public int[] field2670;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "S")
    public short field2661;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "S")
    public short field2669;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "S")
    public short field2673;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "[S")
    public short[] field2676;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "[S")
    public short[] field2667;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "[S")
    public short[] field2662;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "S")
    public short field2677;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2664 = 2;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2666 = -1;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V", line = 26)
    public static final void method1232(boolean arg0, int arg1) {
        field2668++;
        if (arg0) {
            return;
        }
        class107 var2 = (class107) class1.field12.method2135((long) arg1, (byte) 31);
        if (var2 != null) {
            var2.field1457 = !var2.field1457;
            var2.field1452.method1591(var2.field1457, -119);
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 45)
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2663 = (byte) arg0;
        this.field2672 = new int[4];
        this.field2665 = new int[4];
        this.field2674 = (byte) arg1;
        this.field2670 = new int[4];
        this.field2672[1] = arg3;
        this.field2672[2] = arg4;
        this.field2672[0] = arg2;
        this.field2672[3] = arg5;
        this.field2670[1] = arg7;
        this.field2670[3] = arg9;
        this.field2670[0] = arg6;
        this.field2670[2] = arg8;
        this.field2665[0] = arg10;
        this.field2665[2] = arg12;
        this.field2661 = (short) (arg2 >> class140.field2224);
        this.field2665[3] = arg13;
        this.field2665[1] = arg11;
        this.field2669 = (short) (arg4 >> class140.field2224);
        this.field2673 = (short) (arg10 >> class140.field2224);
        this.field2676 = new short[4];
        this.field2667 = new short[4];
        this.field2662 = new short[4];
        this.field2677 = (short) (arg12 >> class140.field2224);
    }
}
