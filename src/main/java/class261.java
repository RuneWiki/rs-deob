import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class261 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Loa;")
    private class276 field4534 = new class276(256);

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Loa;")
    private class276 field4541 = new class276(256);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lma;")
    private class105 field4529;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lma;")
    private class105 field4533;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lda;")
    public static class275 field4540 = class255.method1672(93, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field4544 = 0;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lne;")
    public static class137 field4538 = new class137(64);

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lda;")
    public static class275 field4546 = class255.method1672(118, "welle:");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[Lrk;")
    public static class20[] field4545;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IZI)Lgj;")
    public final class128 method1703(int[] arg0, boolean arg1, int arg2) {
        field4536++;
        if (arg1) {
            this.field4541 = null;
        }
        if (this.field4533.method773(true) == 1) {
            return this.method1708(-1879044097, arg2, 0, arg0);
        } else if (this.field4533.method779((byte) -71, arg2) == 1) {
            return this.method1708(-1879044097, 0, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1704(int arg0) {
        if (arg0 > -70) {
            field4546 = null;
        }
        field4546 = null;
        field4538 = null;
        field4540 = null;
        field4545 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static int method1705(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method1706(int arg0, int arg1) {
        field4539++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class19.field275 += arg0 * 128;
        if (class19.field275 > class209.field3531.length) {
            class19.field275 -= class209.field3531.length;
            int var3 = (int) (Math.random() * 12.0D);
            class238.method1575(1321836711, field4545[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class205.field3475[var4 + var5] - (class209.field3531[var4 + class19.field275 & class209.field3531.length - 1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class205.field3475[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class205.field3475[var24 + var23] = 255;
                } else {
                    class205.field3475[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class42.field732[var9] = class42.field732[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class42.field732[var10] = (int) (Math.sin((double) class106.field1842 / 14.0D) * 16.0D + Math.sin((double) class106.field1842 / 15.0D) * 14.0D + Math.sin((double) class106.field1842 / 16.0D) * 12.0D);
            class106.field1842++;
        }
        class152.field2666 += arg0;
        int var11 = ((class35.field576 & 0x1) + arg0) / 2;
        if (arg1 > -34 || var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class152.field2666; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class205.field3475[(var22 << 7) + var21] = 192;
        }
        class152.field2666 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class205.field3475[var20 + var18 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var19 -= class205.field3475[var20 + var18 - var11 - 1];
                }
                if (var20 >= 0) {
                    class141.field2496[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var11 + var16 < var2) {
                    var15 += class141.field2496[var11 * 128 + var17 + var14];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class141.field2496[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class205.field3475[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Z")
    public static final boolean method1707(int arg0, int arg1) {
        if (arg1 != -4774) {
            method1712(-24, -74, (class275) null);
        }
        field4535++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III[I)Lgj;")
    private final class128 method1708(int arg0, int arg1, int arg2, int[] arg3) {
        field4532++;
        int var5 = (arg2 >>> 12 | (arg0 & arg2) << 4) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class128 var9 = (class128) this.field4541.method1871(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class2 var10 = class2.method8(this.field4533, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class128 var11 = var10.method5();
            this.field4541.method1867(true, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field2260.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)Lfd;")
    public static final class229 method1709(int arg0, int arg1) {
        field4543++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 >= -89) {
            method1712(-117, 40, (class275) null);
        }
        if (class173.field3005[var2] == null || class173.field3005[var2][var3] == null) {
            boolean var4 = class267.method1755(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class173.field3005[var2][var3];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([III)Lgj;")
    public final class128 method1710(int[] arg0, int arg1, int arg2) {
        field4542++;
        if (arg1 >= -93) {
            return null;
        } else if (this.field4529.method773(true) == 1) {
            return this.method1711(arg2, 0, -6, arg0);
        } else if (this.field4529.method779((byte) -53, arg2) == 1) {
            return this.method1711(0, arg2, -6, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III[I)Lgj;")
    private final class128 method1711(int arg0, int arg1, int arg2, int[] arg3) {
        field4537++;
        int var5 = (arg1 >>> 12 | (arg1 & 0x20000FFF) << 4) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class128 var9 = (class128) this.field4541.method1871(arg2 ^ 0xFFFFFFFA, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class140 var10 = (class140) this.field4534.method1871(arg2 ^ arg2, var7);
            if (var10 == null) {
                var10 = class140.method1013(this.field4529, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4534.method1867(true, var7, var10);
            }
            class128 var11 = var10.method1007(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method741(3);
                this.field4541.method1867(true, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lma;Lma;)V")
    public class261(class105 arg0, class105 arg1) {
        this.field4529 = arg1;
        this.field4533 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILda;)V")
    public static final void method1712(int arg0, int arg1, class275 arg2) {
        field4530++;
        class275 var3 = arg2.method1841(-3708).method1850(97);
        boolean var4 = false;
        for (int var5 = arg1; var5 < class32.field486; var5++) {
            class109 var6 = class16.field238[class149.field2595[var5]];
            if (var6 != null && var6.field1910 != null && var6.field1910.method1844(90, var3)) {
                class67.method453(1, 0, 0, class66.field1094.field1752[0], var6.field1722[0], 1, -12782, 0, 2, class66.field1094.field1722[0], false, var6.field1752[0]);
                if (arg0 == 1) {
                    class149.field2597.method526((byte) -106, 154);
                    class25.field413++;
                    class149.field2597.method600(class149.field2595[var5], (byte) 62);
                } else if (arg0 == 4) {
                    class149.field2597.method526((byte) -49, 215);
                    class149.field2597.method602(class149.field2595[var5], false);
                    class229.field3918++;
                } else if (arg0 == 5) {
                    class245.field4295++;
                    class149.field2597.method526((byte) -103, 71);
                    class149.field2597.method606(arg1 + 2102840648, class149.field2595[var5]);
                } else if (arg0 == 6) {
                    class211.field3579++;
                    class149.field2597.method526((byte) -45, 199);
                    class149.field2597.method600(class149.field2595[var5], (byte) 71);
                } else if (arg0 == 7) {
                    class149.field2597.method526((byte) -118, 157);
                    class149.field2597.method582(class149.field2595[var5], true);
                    class262.field4549++;
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class277.method1874(class197.method1291(new class275[] { class123.field2198, var3 }, -30025), class79.field1301, 0, true);
        }
    }
}
