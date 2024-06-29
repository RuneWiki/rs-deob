import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class307 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private int[] field4602;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    public static int[] field4594 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field4598 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lkm;")
    public static class133 field4595;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[[[B")
    public static byte[][][] field4599;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I", line = 17)
    public final int method2083(int arg0, int arg1) {
        field4603++;
        if (arg0 != 1) {
            method2084((byte) -110);
        }
        int var3 = (this.field4602.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4602[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4602[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2084(byte arg0) {
        field4596++;
        class13.field139.method717((byte) 42);
        if (arg0 != -61) {
            field4595 = (class133) null;
        }
        class106.field1430.method717((byte) 47);
        class333.field5014.method717((byte) 56);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([I)V", line = 56)
    public class307(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4602 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4602[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4602[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4602[var5 + var5] = arg0[var4];
            this.field4602[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BIIZI[Lla;III)V", line = 92)
    public static final void method2085(int arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5, int arg6, class72[] arg7, int arg8, int arg9, int arg10) {
        field4600++;
        class316 var11 = new class316(arg2);
        int var12 = -1;
        if (arg8 >= 0) {
            field4597 = 41;
        }
        while (true) {
            int var13 = var11.method2185((byte) 117);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method2193(49152);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method2219(16448);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var16 && var18 >= arg9 && (arg9 + 8) > var18 && var17 >= arg10 && var17 < arg10 + 8) {
                    class302 var22 = class153.method1106(var12, (byte) -82);
                    int var23 = class136.method986(arg0, var21, var22.field4520, var17 & 0x7, var18 & 0x7, var22.field4479, 87) + arg1;
                    int var24 = arg6 + class160.method1156(var22.field4520, -75, var18 & 0x7, var21, var17 & 0x7, var22.field4479, arg0);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class72 var25 = null;
                        if (!arg5) {
                            int var26 = arg4;
                            if ((class240.field3406[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class108.method794(arg0 + var21 & 0x3, arg4, var25, var20, !arg5, arg4, arg5, var12, var24, var23, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 173)
    public static void method2086(int arg0) {
        field4599 = (byte[][][]) null;
        field4595 = null;
        if (arg0 == 155) {
            field4594 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 185)
    public static final void method2087(byte arg0) {
        field4601++;
        class148.field2053.method724(0);
        class257.field3796.method724(0);
        if (arg0 <= 108) {
            method2086(53);
        }
    }
}
