import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class412 extends class83 {

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Z")
    private boolean field5951 = true;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "Z")
    private boolean field5949 = true;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
    public static final void method2565(int arg0) {
        ++field5956;
        class55 var1 = null;
        try {
            class304 var2 = class159.field2055.method2779(12178);
            while (var2.field4123 == 0) {
                class370.method2235(1L, 10);
            }
            if (var2.field4123 == 1) {
                var1 = (class55) var2.field4126;
                byte[] var3 = new byte[(int) var1.method283(-1)];
                int var5;
                for (int var4 = 0; ~var3.length < ~var4; var4 += var5) {
                    var5 = var1.method284(var3, var4, var3.length + -var4, (byte) 90);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class92.method505((byte) 53, new class250(var3));
            }
        } catch (Exception var8) {
        }
        try {
            int var6 = 82 / ((45 - arg0) / 38);
            if (var1 != null) {
                var1.method285(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class412() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIILvm;IIIILjn;I)Ljn;")
    public static final class396 method2566(int arg0, boolean arg1, int arg2, int arg3, class322 arg4, int arg5, int arg6, int arg7, int arg8, class396 arg9, int arg10) {
        ++field5950;
        long var11 = (long) arg8;
        class396 var13 = (class396) class88.field995.method616(-103, var11);
        short var14 = 1031;
        if (var13 == null) {
            class390 var15 = class208.method1122(class382.field5449, 0, -83, arg8);
            if (var15 == null) {
                return null;
            }
            var13 = arg4.method1651(var15, var14, class40.field414, 64, 768);
            class88.field995.method615((byte) -120, var11, var13);
        }
        if (arg1) {
            return null;
        } else {
            class396 var16 = var13.method2297((byte) 2, var14, true);
            if (~arg10 != -1) {
                var16.method2269(arg10);
            }
            if (~arg5 != -1) {
                var16.method2317(arg5);
            }
            if (~arg7 != -1) {
                var16.method2266(arg7);
            }
            if (arg0 != 0) {
                var16.method2286(0, arg0, 0);
            }
            return var16;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -81 / ((-27 - arg1) / 50);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field924 = ~arg2.method1350(31351) == -2;
                }
            } else {
                this.field5951 = arg2.method1350(31351) == 1;
            }
        } else {
            this.field5949 = ~arg2.method1350(31351) == -2;
        }
        ++field5955;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field5948;
        int[][] var3 = super.field927.method1774((byte) 127, arg1);
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, true, this.field5951 ? class109.field1348 - arg1 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field5949) {
                for (int var11 = 0; class420.field6139 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class420.field6139 > var12; ++var12) {
                    var8[var12] = var5[class213.field2881 - var12];
                    var9[var12] = var6[-var12 + class213.field2881];
                    var10[var12] = var7[-var12 + class213.field2881];
                }
            }
        }
        if (!arg0) {
            this.method21(false, 42);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field5954;
        int[] var3 = super.field916.method1813(arg1, (byte) -112);
        if (arg0 != 2) {
            this.method37(62, 41);
        }
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 122, this.field5951 ? class109.field1348 - arg1 : arg1);
            if (this.field5949) {
                for (int var5 = 0; class420.field6139 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class213.field2881];
                }
            } else {
                class358.method2184(var4, 0, var3, 0, class420.field6139);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLam;Lam;)V")
    public static final void method2567(boolean arg0, class286 arg1, class286 arg2) {
        ++field5947;
        class318.field4234 = arg2;
        class109.field1341 = arg1;
        class109.field1341.method1691(34, 0);
        if (!arg0) {
            method2566(-98, true, 107, -94, (class322) null, -23, -9, -41, -71, (class396) null, -32);
        }
    }
}
