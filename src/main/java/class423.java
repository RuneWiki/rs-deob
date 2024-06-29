import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class423 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
    public static boolean field6109 = false;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Ljm;")
    public static class167 field6111 = new class167("", 15);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lfr;")
    public static class105 field6115;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lsa;")
    public class423 field6112;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lsa;")
    public class423 field6114;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2606(boolean arg0) {
        class363 var1 = class160.field2146;
        synchronized (class160.field2146) {
            class160.field2146.method2307(109);
            if (arg0) {
                method2609((class110) null, 85);
            }
        }
        field6110++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBI)I", line = 20)
    public static final int method2607(int arg0, int arg1, byte arg2, int arg3) {
        field6107++;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 - 1;
        int var6 = arg3 / arg0;
        int var7 = arg3 & arg0 - 1;
        int var8 = class147.method1017((byte) 116, var6, var4);
        if (arg2 != 87) {
            field6115 = null;
        }
        int var9 = class147.method1017((byte) 117, var6, var4 + 1);
        int var10 = class147.method1017((byte) 120, var6 + 1, var4);
        int var11 = class147.method1017((byte) 115, var6 + 1, var4 + 1);
        int var12 = class440.method2699(var5, arg0, false, var8, var9);
        int var13 = class440.method2699(var5, arg0, false, var10, var11);
        return class440.method2699(var7, arg0, false, var12, var13);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 51)
    public static final void method2608(byte arg0) {
        class237.field3532 = 0;
        field6118++;
        class138.field1885.method2477(-14221);
        class138.field1885.method2484(0, class278.field4110);
        class237.field3532++;
        if (arg0 != -81) {
            field6111 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ltd;I)Z", line = 68)
    public static final boolean method2609(class110 arg0, int arg1) {
        field6116++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field1522) {
            return false;
        } else if (!arg0.method788((byte) -123)) {
            return false;
        } else if (arg1 != 27402) {
            return true;
        } else if (class188.field2633.method609((long) arg0.field1506, 76) == null) {
            return class465.field6847.method609((long) arg0.field1530, 48) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 98)
    public static void method2610(byte arg0) {
        field6111 = null;
        if (arg0 != -38) {
            field6111 = null;
        }
        field6115 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 111)
    public final void method2611(int arg0) {
        field6113++;
        if (this.field6114 != null && arg0 == -1) {
            this.field6114.field6112 = this.field6112;
            this.field6112.field6114 = this.field6114;
            this.field6112 = null;
            this.field6114 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIII)I", line = 130)
    public static final int method2612(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6108++;
        if (class215.field3069 == null) {
            return 0;
        } else if (arg0) {
            if (arg4 < 3) {
                int var6 = arg5 >> 7;
                int var7 = arg1 >> 7;
                if (arg3 < 0 || arg2 < 0 || (class195.field2745 - 1) < arg3 || (class78.field984 - 1) < arg2) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || class195.field2745 - 1 < var6 || var7 > class78.field984 - 1) {
                    return 0;
                }
                boolean var8 = (class131.field1790[1][arg5 >> 7][arg1 >> 7] & 0x2) != 0;
                if ((arg5 & 0x7F) == 0) {
                    boolean var9 = (class131.field1790[1][var6 - 1][arg1 >> 7] & 0x2) != 0;
                    boolean var10 = (class131.field1790[1][var6][arg1 >> 7] & 0x2) != 0;
                    if (var10 != var9) {
                        var8 = (class131.field1790[1][arg3][arg2] & 0x2) != 0;
                    }
                }
                if ((arg1 & 0x7F) == 0) {
                    boolean var11 = (class131.field1790[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class131.field1790[1][arg5 >> 7][var7] & 0x2) != 0;
                    if (var12 != var11) {
                        var8 = (class131.field1790[1][arg3][arg2] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg4++;
                }
            }
            return class215.field3069[arg4].method1427(arg5, arg1);
        } else {
            return -22;
        }
    }
}
