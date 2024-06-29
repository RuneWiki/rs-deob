import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class85 extends class18 {

    @OriginalMember(owner = "client!dha", name = "x", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client!dha", name = "B", descriptor = "Lfja;")
    public static class783 field1163 = new class783(87, -2);

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field1167 = 0;

    @OriginalMember(owner = "client!dha", name = "D", descriptor = "[I")
    public static int[] field1165 = new int[14];

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "Lcja;")
    public static class46 field1166 = new class46(32);

    @OriginalMember(owner = "client!dha", name = "w", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!dha", name = "y", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!dha", name = "A", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!dha", name = "C", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "(I)V")
    public static final void method681(int arg0) {
        int var1 = 37 % ((arg0 - 62) / 41);
        if (class18.field437 != null) {
            for (int var2 = 0; ~var2 > ~class3.field39; ++var2) {
                class18.field437[var2] = null;
            }
            class18.field437 = null;
        }
        ++field1162;
        if (class557.field7860 != null) {
            for (int var3 = 0; ~var3 > ~class250.field3524; ++var3) {
                class557.field7860[var3] = null;
            }
            class557.field7860 = null;
        }
        if (class262.field3687 != null) {
            for (int var4 = 0; ~class660.field9144 < ~var4; ++var4) {
                class262.field3687[var4] = null;
            }
            class262.field3687 = null;
        }
        class168.field2704 = null;
        class336.field4533 = null;
        class339.field4581 = null;
        class322.field4421 = -1;
        class679.field9453 = -1;
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(B)V")
    public static void method682(byte arg0) {
        field1163 = null;
        field1166 = null;
        field1165 = null;
        if (arg0 >= -113) {
            field1165 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZZ)V")
    public final void method683(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method129(12);
        }
        super.field434.method939(this, 8448);
        ++field1161;
        OpenGL.glTexParameteri(super.field430, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V")
    public final void method129(int arg0) {
        ++field1164;
        if (arg0 >= -44) {
            this.field1159 = 68;
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lhk;II[BI)V")
    public class85(class111 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1159 = arg2;
        super.field434.method939(this, 8448);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field430, 0, super.field427, this.field1159, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIII)I")
    public static final int method684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1160;
        if (arg5 < 100) {
            return 87;
        } else if (class745.field10286 == null) {
            return 0;
        } else {
            if (arg4 < 3) {
                int var6 = arg2 >> 9;
                int var7 = arg3 >> 9;
                if (~arg0 > -1 || ~arg1 > -1 || ~(class483.field6515 + -1) > ~arg0 || ~(class65.field926 + -1) > ~arg1) {
                    return 0;
                }
                if (~var6 > -2 || var7 < 1 || ~(class483.field6515 + -1) > ~var6 || ~var7 < ~(class65.field926 + -1)) {
                    return 0;
                }
                boolean var8 = ~(class554.field7832[1][arg2 >> 9][arg3 >> 9] & 2) != -1;
                if ((511 & arg2) == 0) {
                    boolean var9 = ~(2 & class554.field7832[1][var6 + -1][arg3 >> 9]) != -1;
                    boolean var10 = ~(2 & class554.field7832[1][var6][arg3 >> 9]) != -1;
                    if (!var10 == var9) {
                        var8 = (class554.field7832[1][arg0][arg1] & 2) != 0;
                    }
                }
                if ((511 & arg3) == 0) {
                    boolean var11 = ~(class554.field7832[1][arg2 >> 9][var7 - 1] & 2) != -1;
                    boolean var12 = ~(class554.field7832[1][arg2 >> 9][var7] & 2) != -1;
                    if (!var11 != !var12) {
                        var8 = ~(2 & class554.field7832[1][arg0][arg1]) != -1;
                    }
                }
                if (var8) {
                    ++arg4;
                }
            }
            return class745.field10286[arg4].method1907(arg2, (byte) -69, arg3);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBII)V")
    public static final void method685(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 120) {
            field1167 = 121;
        }
        ++field1158;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 63) + "," + (arg3 & 63);
        System.out.println(var4);
        class117.method1035((byte) 79, var4, false, true);
    }
}
