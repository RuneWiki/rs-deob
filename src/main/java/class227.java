import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class227 extends class113 {

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    private int field3095 = 0;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    private int field3087 = -1;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Z")
    public boolean field3091 = false;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    private int field3105 = -32768;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    private int field3093 = 0;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lbb;")
    private class182 field3086;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public static int[] field3102 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "F")
    public static float field3096;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lpl;")
    private class389 field3098;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILen;I)Lmj;")
    private final class393 method1458(int arg0, class174 arg1, int arg2) {
        if (arg0 != 2) {
            this.field3091 = false;
        }
        ++field3106;
        class377 var4 = class251.method1571(this.field3099, (byte) 90);
        return !this.field3091 ? var4.method2375(arg2, arg1, this.field3095, this.field3087, (byte) 84, this.field3093) : var4.method2375(arg2, arg1, 0, -1, (byte) 83, -1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        if (!arg2) {
            return false;
        } else {
            ++field3094;
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)I")
    public final int method222(int arg0) {
        if (arg0 != 26841) {
            field3102 = null;
        }
        ++field3090;
        return this.field3105;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    public final void method1459(int arg0, int arg1) {
        ++field3085;
        if (!this.field3091) {
            this.field3095 += arg0;
            while (~this.field3086.field2513[this.field3093] > ~this.field3095) {
                this.field3095 -= this.field3086.field2513[this.field3093];
                ++this.field3093;
                if (~this.field3086.field2493.length >= ~this.field3093) {
                    this.field3091 = true;
                    break;
                }
            }
            if (arg1 >= -27) {
                this.method222(111);
            }
            if (!this.field3091) {
                class424.method2628(this.field3093, super.field1304, this.field3086, 0, super.field1311, false);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3101;
        if (this.field3098 != null) {
            this.field3098.method2491();
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3099 = arg0;
        this.field3104 = arg1 + arg2;
        int var12 = class251.method1571(this.field3099, (byte) 90).field5536;
        if (~var12 != 0) {
            this.field3091 = false;
            this.field3086 = class437.method2717(var12, (byte) -103);
        } else {
            this.field3091 = true;
        }
        if (~this.field3104 == ~arg2) {
            class424.method2628(this.field3093, super.field1304, this.field3086, 0, super.field1311, false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Len;Lmj;B)V")
    private final void method1460(class174 arg0, class393 arg1, byte arg2) {
        ++field3097;
        int var4 = 119 / ((arg2 - -50) / 59);
        class35[] var5 = arg1.method768();
        class382[] var6 = arg1.method725();
        if ((this.field3098 == null || this.field3098.field5704) && (var5 != null || var6 != null)) {
            this.field3098 = new class389(class221.field3033);
        }
        if (this.field3098 != null) {
            this.field3098.method2485(arg0, (long) class221.field3033, var5, var6, false);
            this.field3098.method2483(super.field1308, super.field1316, super.field1298, super.field1305, super.field1299);
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        int var2 = 34 % ((arg0 - -60) / 37);
        ++field3108;
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        ++field3100;
        if (arg3 != -42) {
            this.field3098 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method1461(int arg0) {
        if (this.field3098 != null) {
            this.field3098.method2491();
        }
        if (arg0 <= -101) {
            ++field3092;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        ++field3088;
        class393 var3 = this.method1458(2, arg0, arg1);
        if (var3 != null) {
            this.method1460(arg0, var3, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        int var2 = 69 / ((52 - arg0) / 46);
        ++field3107;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1462(String arg0, int arg1, int arg2) {
        ++class342.field5033;
        class169.field2360.method809(58, -28022);
        if (arg1 == 2) {
            ++field3103;
            class169.field2360.method1396(21375, 1 + class233.method1488(-19285, arg0));
            class169.field2360.method1345(0, arg2);
            class169.field2360.method1359((byte) 0, arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1463(int arg0) {
        if (arg0 == 10581) {
            field3102 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field3089;
        if (arg0 > -5) {
            this.method206(-28, (class174) null, -116, (byte) 41, (class330) null, -83, true);
        }
        class393 var3 = this.method1458(2, arg1, 1024);
        if (var3 == null) {
            return null;
        } else {
            class71 var4 = arg1.method1015();
            var4.method123(super.field1304, super.field1310, super.field1311);
            if (this.field3098 == null) {
                var3.method775(var4, (class127) null, 0);
            } else {
                class271 var5 = this.field3098.method2492();
                arg1.method964(var3, var5, var4, (class127) null, 0);
            }
            this.field3105 = var3.method731();
            this.method1460(arg1, var3, (byte) 99);
            return null;
        }
    }
}
