import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class127 extends class43 {

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Z")
    public boolean field1788 = false;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
    public boolean field1780 = false;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1782 = -1;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1784 = "M";

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    public static int[] field1791 = new int[13];

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static final void method845(boolean arg0) {
        field1785++;
        if (class350.field4884) {
            return;
        }
        class350.field4884 = true;
        if (arg0) {
            method851(-20, -23, -79, -20, 68, -123);
        }
        class366.field5124 = true;
        if (class188.field2609) {
            class140.field2007 = (float) ((int) class140.field2007 + 47 & 0xFFFFFFF0);
        } else {
            class10.field143 += (12.0F - class10.field143) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
    public static final void method846(int arg0, int arg1) {
        if (arg0 >= 100) {
            field1779++;
            class399 var2 = class269.method1655(14, arg1, -51);
            var2.method2582(0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public static void method847(int arg0) {
        field1784 = null;
        if (arg0 == 453195655) {
            field1791 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public static final void method848(int arg0, int arg1, int arg2) {
        field1781++;
        class244.field3368++;
        class442.field6400.method158((byte) 7, 4);
        class442.field6400.method2430(arg2, -84);
        if (arg0 != -1) {
            field1782 = -97;
        }
        class442.field6400.method2407(arg1, arg0 ^ 0x7B);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V")
    public static final void method849(int arg0, int arg1) {
        field1789++;
        if (arg1 != -11392) {
            field1784 = null;
        }
        for (class376 var2 = class287.field3986.method1413(30381); var2 != null; var2 = class287.field3986.method1420((byte) 63)) {
            if ((var2.field5363 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method2459(198);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
    public static final void method850(int arg0, byte arg1) {
        class35.field545 = -1;
        class448.field6472 = arg0;
        field1792++;
        class35.field545 = -1;
        class245.method1536((byte) 24);
        int var2 = -38 / ((-arg1 - 9) / 62);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)I")
    public static final int method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1786++;
        if (class249.field3456 == null) {
            return 0;
        }
        if (arg0 != -83753049) {
            field1784 = null;
        }
        if (arg3 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg5 >> 7;
            if (arg4 < 0 || arg2 < 0 || arg4 > class432.field6220 - 1 || arg2 > class267.field3646 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class432.field6220 - 1) || var7 > (class267.field3646 - 1)) {
                return 0;
            }
            boolean var8 = (class221.field2910[1][arg1 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class221.field2910[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var10 = (class221.field2910[1][var6][arg5 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class221.field2910[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var11 = (class221.field2910[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class221.field2910[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class221.field2910[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        return class249.field3456[arg3].method278(arg1, arg5);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIZZ)V")
    public class127(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1783 = arg2;
        this.field1780 = arg4;
        this.field1790 = arg1;
        this.field1788 = arg3;
        this.field1787 = arg0;
    }
}
