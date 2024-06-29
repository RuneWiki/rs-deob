import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class268 {

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    private int field4608 = 0;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[Lfj;")
    public class242[] field4603;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field4599;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Ljf;")
    private static class229 field4596 = class212.method1457((byte) 108, "flash1:");

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljf;")
    public static class229 field4589 = field4596;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljf;")
    public static class229 field4591 = field4596;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljf;")
    public static class229 field4593 = class212.method1457((byte) 106, "settings=");

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "J")
    private long field4594;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lfj;")
    private class242 field4587;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Lfj;")
    private class242 field4606;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Lfj;", line = 4)
    public final class242 method1883(byte arg0) {
        field4597++;
        if (this.field4587 == null) {
            return null;
        } else if (arg0 == 32) {
            class242 var2 = this.field4603[(int) ((long) (this.field4599 - 1) & this.field4594)];
            while (this.field4587 != var2) {
                if (this.field4587.field4265 == this.field4594) {
                    class242 var3 = this.field4587;
                    this.field4587 = this.field4587.field4273;
                    return var3;
                }
                this.field4587 = this.field4587.field4273;
            }
            this.field4587 = null;
            return null;
        } else {
            return (class242) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Lfj;", line = 44)
    public final class242 method1884(byte arg0) {
        field4607++;
        int var2 = 36 / ((55 - arg0) / 59);
        this.field4608 = 0;
        return this.method1886(-119);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JLfj;B)V", line = 58)
    public final void method1885(long arg0, class242 arg1, byte arg2) {
        if (arg1.field4264 != null) {
            arg1.method1747((byte) -117);
        }
        field4595++;
        class242 var5 = this.field4603[(int) ((long) (this.field4599 - 1) & arg0)];
        arg1.field4265 = arg0;
        if (arg2 < -60) {
            arg1.field4264 = var5.field4264;
            arg1.field4273 = var5;
            arg1.field4264.field4273 = arg1;
            arg1.field4273.field4264 = arg1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lfj;", line = 78)
    public final class242 method1886(int arg0) {
        field4601++;
        if (this.field4608 > 0 && this.field4603[this.field4608 - 1] != this.field4606) {
            class242 var2 = this.field4606;
            this.field4606 = var2.field4273;
            return var2;
        }
        class242 var3;
        do {
            if (this.field4599 <= this.field4608) {
                if (arg0 > -117) {
                    field4596 = (class229) null;
                }
                return null;
            }
            var3 = this.field4603[this.field4608++].field4273;
        } while (this.field4603[this.field4608 - 1] == var3);
        this.field4606 = var3.field4273;
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V", line = 118)
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4590++;
        if (arg1 != 23605) {
            field4602 = -2;
        }
        int var8 = arg3 + 1;
        class34.method306(arg4, class173.field3021[arg3], (byte) 115, arg2, arg0);
        int var9 = arg5 - 1;
        class34.method306(arg4, class173.field3021[arg5], (byte) 118, arg2, arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class173.field3021[var6];
            var7[arg4] = var7[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 142)
    public static void method1888(int arg0) {
        field4593 = null;
        field4596 = null;
        field4589 = null;
        int var1 = 41 % ((36 - arg0) / 41);
        field4591 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z", line = 154)
    public static final boolean method1889(int arg0, int arg1, int arg2) {
        int var3 = class41.field743[arg0][arg1][arg2];
        if (-class31.field535 == var3) {
            return false;
        } else if (class31.field535 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class47.method404(var4 + 1, class132.field2328[arg0][arg1][arg2], var5 + 1) && class47.method404(var4 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg2], var5 + 1) && class47.method404(var4 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class47.method404(var4 + 1, class132.field2328[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class41.field743[arg0][arg1][arg2] = class31.field535;
                return true;
            } else {
                class41.field743[arg0][arg1][arg2] = -class31.field535;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)Lfj;", line = 185)
    public final class242 method1890(long arg0, int arg1) {
        if (arg1 > -84) {
            field4589 = (class229) null;
        }
        field4592++;
        this.field4594 = arg0;
        class242 var4 = this.field4603[(int) ((long) (this.field4599 - 1) & arg0)];
        for (this.field4587 = var4.field4273; this.field4587 != var4; this.field4587 = this.field4587.field4273) {
            if (this.field4587.field4265 == arg0) {
                class242 var5 = this.field4587;
                this.field4587 = this.field4587.field4273;
                return var5;
            }
        }
        this.field4587 = null;
        return null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I", line = 217)
    public final int method1891(int arg0) {
        field4598++;
        if (arg0 != 0) {
            method1888(127);
        }
        return this.field4599;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V", line = 232)
    public final void method1892(byte arg0) {
        int var2 = -2 % ((33 - arg0) / 48);
        for (int var3 = 0; var3 < this.field4599; var3++) {
            class242 var4 = this.field4603[var3];
            while (true) {
                class242 var5 = var4.field4273;
                if (var4 == var5) {
                    break;
                }
                var5.method1747((byte) -36);
            }
        }
        this.field4587 = null;
        this.field4606 = null;
        field4604++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLae;Lae;)V", line = 261)
    public static final void method1893(boolean arg0, class282 arg1, class282 arg2) {
        if (arg1.field4832 != null) {
            arg1.method1986((byte) 86);
        }
        arg1.field4837 = arg2.field4837;
        field4600++;
        if (arg0) {
            arg1.field4832 = arg2;
            arg1.field4832.field4837 = arg1;
            arg1.field4837.field4832 = arg1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Lfj;Z)I", line = 288)
    public final int method1894(class242[] arg0, boolean arg1) {
        field4588++;
        if (!arg1) {
            this.field4594 = -81L;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4599; var4++) {
            class242 var5 = this.field4603[var4];
            for (class242 var6 = var5.field4273; var6 != var5; var6 = var6.field4273) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V", line = 322)
    public class268(int arg0) {
        this.field4603 = new class242[arg0];
        this.field4599 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class242 var3 = this.field4603[var2] = new class242();
            var3.field4264 = var3;
            var3.field4273 = var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I", line = 344)
    public final int method1895(int arg0) {
        field4605++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field4599; var3++) {
            class242 var4 = this.field4603[var3];
            for (class242 var5 = var4.field4273; var5 != var4; var5 = var5.field4273) {
                var2++;
            }
        }
        return var2;
    }
}
