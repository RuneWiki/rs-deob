import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class563 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public int field7705 = 2048;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public int field7711 = 0;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public int field7704 = 2048;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public int field7710 = 0;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "[I")
    public static int[] field7713 = new int[14];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Lmw;")
    public static class517 field7703 = new class517(74, 2);

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field7714 = 0;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "Ljb;")
    public static class519 field7715 = new class519(55, 2);

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "[I")
    public static int[] field7716 = new int[8];

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method3204(int arg0) {
        field7713 = null;
        if (arg0 >= -48) {
            field7717 = 26;
        }
        field7716 = null;
        field7715 = null;
        field7703 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLdt;I)V")
    private final void method3205(byte arg0, class254 arg1, int arg2) {
        field7708++;
        if (arg2 == 1) {
            this.field7711 = arg1.method1731((byte) 64);
        } else if (arg2 == 2) {
            this.field7705 = arg1.method1728((byte) 76);
        } else if (arg2 == 3) {
            this.field7704 = arg1.method1728((byte) 110);
        } else if (arg2 == 4) {
            this.field7710 = arg1.method1695(423951304);
        }
        if (arg0 < 105) {
            this.field7704 = 81;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([J[Ljava/lang/Object;ZII)V")
    public static final void method3206(long[] arg0, Object[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg3; var11++) {
                if (arg0[var11] < (long) (var10 & var11) + var7) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method3206(arg0, arg1, false, var6 - 1, arg4);
            method3206(arg0, arg1, false, arg3, var6 + 1);
        }
        if (!arg2) {
            field7709++;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
    public static final boolean method3207(byte arg0) {
        field7712++;
        if (class138.field1863 == null) {
            return false;
        }
        if (class138.field1863.field6718 >= 2000) {
            class138.field1863.field6718 -= 2000;
        }
        if (class138.field1863.field6718 == 1002) {
            return true;
        } else {
            int var1 = -31 % ((25 - arg0) / 58);
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLdt;)V")
    public final void method3208(byte arg0, class254 arg1) {
        field7706++;
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                if (arg0 > -92) {
                    field7715 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method3205((byte) 115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public static final void method3209(int arg0) {
        field7707++;
        class2 var1 = null;
        try {
            class621 var2 = class786.field10800.method1547((byte) 25, "2", true);
            while (var2.field8405 == 0) {
                class171.method1152(1L, false);
            }
            if (var2.field8405 == 1) {
                var1 = (class2) var2.field8403;
                byte[] var3 = new byte[(int) var1.method12(-10565)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method7(var3.length - var4, var4, var3, 0);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class153.method1067(new class254(var3), true);
            }
        } catch (Exception var7) {
        }
        if (arg0 != -1) {
            field7717 = 30;
        }
        try {
            if (var1 != null) {
                var1.method6(59);
            }
        } catch (Exception var6) {
        }
    }
}
