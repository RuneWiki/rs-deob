import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class62 extends class139 {

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
    private boolean field823 = true;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
    private boolean field824 = true;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[C")
    public static char[] field817 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "[J")
    public static long[] field821 = new long[100];

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        if (arg0 > -67) {
            return null;
        } else {
            ++field822;
            int[][] var3 = super.field1835.method999((byte) 104, arg1);
            if (super.field1835.field2395) {
                int[][] var4 = this.method882(0, this.field823 ? -arg1 + class388.field5511 : arg1, 1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field824) {
                    for (int var11 = 0; ~class356.field5147 < ~var11; ++var11) {
                        var8[var11] = var5[class414.field5822 - var11];
                        var9[var11] = var6[-var11 + class414.field5822];
                        var10[var11] = var7[-var11 + class414.field5822];
                    }
                } else {
                    for (int var12 = 0; class356.field5147 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.field823 = true;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1841 = arg0.method1701(-23121) == 1;
                }
            } else {
                this.field823 = ~arg0.method1701(-23121) == -2;
            }
        } else {
            this.field824 = arg0.method1701(-23121) == 1;
        }
        ++field825;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field820;
        class145 var7 = class441.method2598((byte) -127, arg3, arg4);
        if (var7 != null) {
            if (var7.field2037 != null) {
                class202 var8 = new class202();
                var8.field2971 = var7.field2037;
                var8.field2976 = var7;
                class290.method1818(var8);
            }
            class360.field5183 = arg1;
            class359.field5170 = var7.field2016;
            class328.field4745 = arg2;
            class413.field5811 = arg6;
            class40.field523 = arg4;
            class255.field3739 = arg3;
            class22.field282 = arg0;
            class36.field473 = arg5;
            class22.method148((byte) -78, var7);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[B")
    public static final byte[] method387(int arg0, byte arg1) {
        ++field819;
        if (arg1 < 24) {
            method390(25);
        }
        class209 var2 = (class209) class27.field368.method1524(false, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class351.method2194(28, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class209(var3);
            class27.field368.method1522((long) arg0, false, var2);
        }
        return var2.field3182;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public static final void method388(boolean arg0) {
        ++field814;
        class404.field5695 = new class36(8);
        class418.field5828 = 0;
        for (class97 var1 = (class97) class460.field6451.method1449(126); var1 != null; var1 = (class97) class460.field6451.method1450(0)) {
            var1.method557();
        }
        if (!arg0) {
            method388(false);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public static final void method389(int arg0) {
        ++field818;
        class383 var1 = null;
        if (arg0 != 116) {
            method388(false);
        }
        try {
            class366 var2 = class252.field3718.method2530(false);
            while (var2.field5253 == 0) {
                class111.method713(-77, 1L);
            }
            if (~var2.field5253 == -2) {
                var1 = (class383) var2.field5255;
                byte[] var3 = new byte[(int) var1.method2313(arg0 + -116)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2309((byte) 46, var3.length + -var4, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class326.method2067(new class276(var3), 6);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2311((byte) -127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            this.method21((class276) null, (byte) 16, -62);
        }
        ++field815;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, !this.field823 ? arg0 : class388.field5511 - arg0, 0);
            if (!this.field824) {
                class415.method2445(var4, 0, var3, 0, class356.field5147);
            } else {
                for (int var5 = 0; ~var5 > ~class356.field5147; ++var5) {
                    var3[var5] = var4[-var5 + class414.field5822];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static void method390(int arg0) {
        field821 = null;
        field817 = null;
        if (arg0 <= 87) {
            method390(-100);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B[B)Z")
    public static final boolean method391(byte arg0, byte[] arg1) {
        ++field816;
        class276 var2 = new class276(arg1);
        int var3 = var2.method1701(-23121);
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = var2.method1701(-23121) == 1;
            if (arg0 > -26) {
                field821 = null;
            }
            if (var4) {
                class195.method1197(var2, (byte) 85);
            }
            class313.method1939(65535, var2);
            return true;
        }
    }

    static {
        new class326("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
