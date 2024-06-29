import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class366 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lhn;")
    private class509 field4992 = new class509(128);

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lfo;")
    private class361 field4997;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Lsr;")
    public static class167 field4995 = new class167();

    @OriginalMember(owner = "client!um", name = "t", descriptor = "Z")
    public static boolean field5009;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[I")
    public static int[] field5001;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
    public static int[] field5004;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
    public static int[] field5003;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "[I")
    public static int[] field5005;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[I")
    public static int[] field5008;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "[I")
    public static int[] field5006;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field5007;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Lho;")
    public static class103 field5002;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Z")
    public static final boolean method2174(boolean arg0) {
        for (int var1 = class12.field127; var1 < class478.field7065; var1++) {
            class498[][] var2 = class186.field2421[var1];
            for (int var3 = -class349.field4645; var3 <= 0; var3++) {
                int var4 = class151.field1977 + var3;
                int var5 = class151.field1977 - var3;
                if (var4 >= class259.field3462 || var5 < class410.field5874) {
                    for (int var6 = -class349.field4645; var6 <= 0; var6++) {
                        int var7 = class122.field1577 + var6;
                        int var8 = class122.field1577 - var6;
                        if (var4 >= class259.field3462) {
                            if (var7 >= class176.field2275) {
                                class498 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7258) {
                                    class262.field3512 = arg0;
                                    class429.field6242.method204(var9, (byte) 30);
                                    class429.field6242.method205(0);
                                }
                            }
                            if (var8 < class69.field814) {
                                class498 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7258) {
                                    class262.field3512 = arg0;
                                    class429.field6242.method204(var10, (byte) 30);
                                    class429.field6242.method205(0);
                                }
                            }
                        }
                        if (var5 < class410.field5874) {
                            if (var7 >= class176.field2275) {
                                class498 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7258) {
                                    class262.field3512 = arg0;
                                    class429.field6242.method204(var11, (byte) 30);
                                    class429.field6242.method205(0);
                                }
                            }
                            if (var8 < class69.field814) {
                                class498 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7258) {
                                    class262.field3512 = arg0;
                                    class429.field6242.method204(var12, (byte) 30);
                                    class429.field6242.method205(0);
                                }
                            }
                        }
                        if (class258.field3443 == 0) {
                            if (class372.field5053) {
                                class429.field6242.method201(1, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
    public final void method2175(int arg0, int arg1) {
        field4999++;
        class509 var3 = this.field4992;
        synchronized (this.field4992) {
            int var4 = -109 / ((arg1 + 21) / 50);
            this.field4992.method3036(arg0, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public final void method2176(byte arg0) {
        field4998++;
        class509 var2 = this.field4992;
        synchronized (this.field4992) {
            this.field4992.method3045(48);
        }
        int var3 = 62 % ((arg0 - 46) / 56);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public static void method2177(byte arg0) {
        field5001 = null;
        field5007 = null;
        field4995 = null;
        field5008 = null;
        field5004 = null;
        field5002 = null;
        field5003 = null;
        if (arg0 < 9) {
            field5003 = null;
        }
        field5006 = null;
        field5005 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public final void method2178(int arg0) {
        class509 var2 = this.field4992;
        synchronized (this.field4992) {
            this.field4992.method3034((byte) 69);
        }
        if (arg0 == 51) {
            field4994++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
    public static final void method2179(int arg0, byte arg1) {
        field4990++;
        int var2 = class532.field7836 - class533.field7852;
        if (var2 >= 100) {
            class47.field491 = 1;
            return;
        }
        int var3 = (int) class199.field2650;
        if (class14.field151 >> 8 > var3) {
            var3 = class14.field151 >> 8;
        }
        if (class462.field6896[4] && class89.field1065[4] + 128 > var3) {
            var3 = class89.field1065[4] + 128;
        }
        int var4 = (int) class143.field1907 + class321.field4284 & 0x3FFF;
        class161.method951(var3, class412.field5886, class470.method2868(-3, class210.field2808, class96.field1170.field3704, class96.field1170.field3694) - 50, (byte) -90, var4, arg0, class492.field7214, ((var3 >> 3) * 3) + 600 << 0);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class267.field3572 = (int) ((float) (class267.field3572 - class510.field7405) * var5 + (float) class510.field7405);
        class238.field3171 = (int) ((float) (class238.field3171 - class520.field7661) * var5 + (float) class520.field7661);
        class65.field739 = (int) ((float) (class65.field739 - class385.field5598) * var5 + (float) class385.field5598);
        int var6 = 80 / ((arg1 + 36) / 62);
        class139.field1857 = (int) ((float) (class139.field1857 - class287.field3774) * var5 + (float) class287.field3774);
        int var7 = class9.field110 - class430.field6259;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class9.field110 = (int) ((float) var7 * var5 + (float) class430.field6259);
        class9.field110 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class366(class104 arg0, int arg1, class361 arg2) {
        this.field4997 = arg2;
        this.field4997.method2136(-15, 1);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IB)Lgj;")
    public final class451 method2180(int arg0, byte arg1) {
        field4996++;
        class509 var3 = this.field4992;
        class451 var4;
        synchronized (this.field4992) {
            var4 = (class451) this.field4992.method3032(3589, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field4997;
        byte[] var6;
        synchronized (this.field4997) {
            var6 = this.field4997.method2130(1, arg0, -93);
        }
        class451 var7 = new class451();
        if (var6 != null) {
            var7.method2795(new class396(var6), 16407);
        }
        int var8 = 102 / ((arg1 + 63) / 37);
        class509 var9 = this.field4992;
        synchronized (this.field4992) {
            this.field4992.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    static {
        new class305("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field5009 = false;
        field5000 = 50;
        field5001 = new int[field5000];
        field5004 = new int[field5000];
        field5003 = new int[field5000];
        field5005 = new int[field5000];
        field5008 = new int[field5000];
        field5006 = new int[field5000];
        field5007 = new String[field5000];
        field5002 = new class103(51, 8);
    }
}
