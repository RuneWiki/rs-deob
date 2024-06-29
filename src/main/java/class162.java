import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class162 extends class221 {

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Liu;")
    public static class390 field2100 = new class390(76, 7);

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lwt;")
    public static class194 field2102 = new class194(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lhe;")
    public static class239 field2103;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 3)
    public final void method224(int arg0) {
        if (arg0 != 0) {
            method1027((class262) null, 9);
        }
        ++field2106;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lrl;II[BI)V", line = 19)
    public class162(class487 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2104 = arg2;
        super.field3112.method2883(this, -104);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3116, 0, super.field3119, this.field2104, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1357(true, (byte) 85);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZB)V", line = 34)
    public final void method1022(boolean arg0, byte arg1) {
        if (arg1 != 116) {
            method1027((class262) null, -37);
        }
        ++field2099;
        super.field3112.method2883(this, 79);
        OpenGL.glTexParameteri(super.field3116, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[BII)V", line = 48)
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        ++field2101;
        if (arg2 > 0 && !class403.method2418(arg2, (byte) 119)) {
            throw new IllegalArgumentException("");
        } else if (~arg1 < -1 && !class403.method2418(arg1, (byte) 117)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class90.method568(arg0, (byte) 124);
            int var8 = 0;
            int var9 = arg1 > arg2 ? arg2 : arg1;
            int var10 = arg2 >> 1;
            int var11 = arg1 >> 1;
            if (arg5 > 20) {
                byte[] var12 = arg4;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg6, var8, arg3, arg2, arg1, 0, arg0, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg2 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; ~var16 > ~var7; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var11 > var20; ++var20) {
                            for (int var21 = 0; ~var10 < ~var21; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg2 = var10;
                    arg1 = var11;
                    var12 = var15;
                    ++var8;
                    var10 >>= 1;
                    var11 >>= 1;
                    var9 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(Z)V", line = 146)
    public static void method1024(boolean arg0) {
        field2102 = null;
        if (arg0) {
            method1025(-57);
        }
        field2100 = null;
        field2103 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 161)
    public static final void method1025(int arg0) {
        if (arg0 <= 10) {
            method1025(-79);
        }
        class30[] var1 = class325.field4752;
        synchronized (class325.field4752) {
            int var2 = 0;
            while (true) {
                if (class325.field4752.length <= var2) {
                    break;
                }
                class325.field4752[var2] = new class30();
                class242.field3481[var2] = 0;
                ++var2;
            }
        }
        ++field2107;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)B", line = 184)
    public static final byte method1026(int arg0, int arg1, byte arg2) {
        int var3 = 42 / ((-30 - arg2) / 52);
        ++field2105;
        if (arg1 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg0) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ltb;I)Ljava/lang/String;", line = 202)
    public static final String method1027(class262 arg0, int arg1) {
        if (arg1 != 0) {
            method1024(true);
        }
        ++field2108;
        return arg0.field3732 != null && arg0.field3732.length() > 0 ? arg0.field3738 + class171.field2321.method1220(2969, class81.field1122) + arg0.field3732 : arg0.field3738;
    }
}
