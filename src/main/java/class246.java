import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class246 extends class198 {

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    private int field3922 = 2000;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    private int field3924 = 0;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field3920 = 4096;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    private int field3928 = 16;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    private int field3933 = 0;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
    public static boolean field3927 = false;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3926 = -1;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "[I")
    public static int[] field3925;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field3929;
        if (!arg0) {
            method1722(-95, -60);
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = this.field3920 >> 1;
            int[][] var5 = super.field3134.method35(-17218);
            Random var6 = new Random((long) this.field3924);
            for (int var7 = 0; var7 < this.field3922; ++var7) {
                int var8 = this.field3920 > 0 ? this.field3933 + class79.method524(this.field3920, 88, var6) + -var4 : this.field3933;
                int var9 = 255 & var8 >> 4;
                int var10 = class79.method524(class42.field590, 63, var6);
                int var11 = class79.method524(class258.field4243, 94, var6);
                int var12 = (class67.field984[var9] * this.field3928 >> 12) + var11;
                int var13 = (class179.field2790[var9] * this.field3928 >> 12) + var10;
                int var14 = -var11 + var12;
                int var15 = var13 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var10;
                        var13 = var12;
                        var10 = var11;
                        var12 = var17;
                        var11 = var18;
                    }
                    if (~var10 < ~var13) {
                        int var19 = var11;
                        var11 = var12;
                        int var20 = var10;
                        var10 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var13;
                    int var23 = -var11 + var12;
                    int var24 = 2048 / var22;
                    int var25 = 1024 - (class79.method524(4096, 120, var6) >> 2);
                    int var26 = -var22 / 2;
                    int var27 = var11 < var12 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var13 < ~var28; ++var28) {
                        var26 += var23;
                        int var29 = 1024 - -((-var10 + var28) * var24) + var25;
                        int var30 = var28 & class227.field3594;
                        int var31 = class52.field704 & var21;
                        if (var26 > 0) {
                            var21 += var27;
                            var26 += -var22;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;I)V")
    public static final void method1721(String arg0, int arg1, String arg2, byte arg3, String arg4, int arg5) {
        if (arg3 >= -63) {
            method1721((String) null, -80, (String) null, (byte) -40, (String) null, -106);
        }
        class74.method481(arg2, 99, arg4, arg1, arg0, -1, (String) null, arg5);
        ++field3930;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field3932;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field3920 = arg1.method1419(64);
                        }
                    } else {
                        this.field3933 = arg1.method1419(99);
                    }
                } else {
                    this.field3928 = arg1.method1420((byte) 0);
                }
            } else {
                this.field3922 = arg1.method1419(125);
            }
        } else {
            this.field3924 = arg1.method1420((byte) 0);
        }
        int var5 = 51 / ((arg0 - 60) / 61);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I")
    public static final int method1722(int arg0, int arg1) {
        ++field3923;
        if (class103.field1551 != null) {
            class103.field1551.method1277(false);
            class103.field1551 = null;
        }
        ++class53.field716;
        if (arg1 != -30044) {
            method1722(-116, -89);
        }
        if (class53.field716 > 4) {
            class7.field61 = 0;
            class53.field716 = 0;
            return arg0;
        } else {
            if (class58.field795 != class137.field2129) {
                class137.field2129 = class58.field795;
            } else {
                class137.field2129 = class249.field3962;
            }
            class7.field61 = 0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        int var2 = 8 / ((arg0 - -46) / 47);
        ++field3921;
        class217.method1516((byte) 79);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public static void method1723(byte arg0) {
        if (arg0 <= 100) {
            method1723((byte) 57);
        }
        field3925 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class246() {
        super(0, true);
    }
}
