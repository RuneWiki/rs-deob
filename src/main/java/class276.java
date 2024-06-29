import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class276 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    private int field3921 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field3928 = 0;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    private int field3930 = 0;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Llr;")
    private class538 field3923 = null;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lnq;")
    private class325 field3933;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lhl;")
    private class373 field3929;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[Lhw;")
    private class86[] field3919;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lcs;")
    public class230 field3922;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lla;")
    public static class319 field3931 = new class319(60, 7);

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lpa;")
    public static class254 field3937 = new class254(13, 5);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1774(boolean arg0) {
        field3925++;
        class20.field310 = 0;
        if (arg0) {
            field3937 = null;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class391.field5980[var1] = null;
            class487.field7212[var1] = 1;
            class95.field1383[var1] = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Llr;II)Z", line = 27)
    public final boolean method1775(class538 arg0, int arg1, int arg2) {
        int var4 = -2 / ((arg2 - 77) / 32);
        field3927++;
        if (this.field3930 == 0) {
            return false;
        }
        if (this.field3923 != arg0) {
            this.field3919[this.field3930 & Integer.MAX_VALUE].method236(true, arg0, arg1);
            this.field3923 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z", line = 50)
    public final boolean method1776(int arg0, int arg1) {
        field3935++;
        return arg1 > -100 ? true : this.field3919[arg0].method238((byte) -13);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZZII)V", line = 63)
    public final void method1777(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg2 & this.field3933.method797();
        field3934++;
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg0 = arg5;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg3) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field3930 != arg1) {
            if (this.field3930 != 0) {
                this.field3919[Integer.MAX_VALUE & this.field3930].method237(arg4 ^ 0x6C15);
            }
            if (arg1 != 0) {
                this.field3919[Integer.MAX_VALUE & arg1].method241(arg4 - 3, arg3);
                this.field3919[arg1 & Integer.MAX_VALUE].method235(arg3, (byte) 112);
                this.field3919[Integer.MAX_VALUE & arg1].method239(arg0, (byte) -108, arg5);
            }
            this.field3930 = arg1;
            this.field3923 = null;
            this.field3921 = arg5;
            this.field3928 = arg0;
        } else if (this.field3930 != 0) {
            this.field3919[this.field3930 & Integer.MAX_VALUE].method235(arg3, (byte) 112);
            if (this.field3921 != arg5 || this.field3928 != arg0) {
                this.field3919[Integer.MAX_VALUE & this.field3930].method239(arg0, (byte) 75, arg5);
                this.field3928 = arg0;
                this.field3921 = arg5;
            }
        }
        if (arg4 != 3) {
            this.method1777(66, 107, false, true, -73, -111);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lnq;)V", line = 324)
    public class276(class325 arg0) {
        this.field3933 = arg0;
        this.field3929 = new class373(arg0);
        this.field3919 = new class86[10];
        this.field3919[1] = new class26(arg0);
        this.field3919[2] = new class385(arg0, this.field3929);
        this.field3919[4] = new class410(arg0, this.field3929);
        this.field3919[5] = new class528(arg0, this.field3929);
        this.field3919[6] = new class44(arg0);
        this.field3919[7] = new class418(arg0);
        this.field3919[3] = this.field3922 = new class230(arg0);
        this.field3919[8] = new class411(arg0, this.field3929);
        this.field3919[9] = new class273(arg0, this.field3929);
        if (!this.field3919[8].method238((byte) -106)) {
            this.field3919[8] = this.field3919[4];
        }
        if (!this.field3919[9].method238((byte) -85)) {
            this.field3919[9] = this.field3919[8];
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 125)
    public static void method1778(int arg0) {
        field3937 = null;
        if (arg0 != 0) {
            field3936 = 71;
        }
        field3931 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Ldq;II)Low;", line = 136)
    public static final class234 method1779(String arg0, class500 arg1, int arg2, int arg3) {
        field3924++;
        if (arg2 == arg3) {
            return arg1.method2996((byte) -83, arg0);
        } else if (arg2 == 1) {
            try {
                class305.method1919("openjs", new Object[] { (new URL(arg1.field7381.getCodeBase(), arg0)).toString() }, -106, arg1.field7381);
                class234 var4 = new class234();
                var4.field3322 = 1;
                return var4;
            } catch (Throwable var10) {
                class234 var5 = new class234();
                var5.field3322 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg1.field7381.getAppletContext().showDocument(new URL(arg1.field7381.getCodeBase(), arg0), "_blank");
                class234 var6 = new class234();
                var6.field3322 = 1;
                return var6;
            } catch (Exception var11) {
                class234 var7 = new class234();
                var7.field3322 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class305.method1920(arg1.field7381, "loggedout", 21694);
            } catch (Throwable var13) {
            }
            try {
                arg1.field7381.getAppletContext().showDocument(new URL(arg1.field7381.getCodeBase(), arg0), "_top");
                class234 var8 = new class234();
                var8.field3322 = 1;
                return var8;
            } catch (Exception var12) {
                class234 var9 = new class234();
                var9.field3322 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[Lga;I)V", line = 212)
    public static final void method1780(byte arg0, class282[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class282 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4103 == 0) {
                    if (var4.field4108 != null) {
                        method1780((byte) -45, var4.field4108, arg2);
                    }
                    class436 var5 = (class436) class312.field4570.method1747((long) var4.field4029, false);
                    if (var5 != null) {
                        class480.method2853(false, var5.field6598, arg2);
                    }
                }
                if (arg2 == 0 && var4.field4044 != null) {
                    class143 var6 = new class143();
                    var6.field1912 = var4.field4044;
                    var6.field1903 = var4;
                    class343.method2227(var6);
                }
                if (arg2 == 1 && var4.field4098 != null) {
                    if (var4.field4031 >= 0) {
                        class282 var7 = class21.method194(-107, var4.field4029);
                        if (var7 == null || var7.field4108 == null || var4.field4031 >= var7.field4108.length || var7.field4108[var4.field4031] != var4) {
                            continue;
                        }
                    }
                    class143 var8 = new class143();
                    var8.field1912 = var4.field4098;
                    var8.field1903 = var4;
                    class343.method2227(var8);
                }
            }
        }
        if (arg0 != -45) {
            method1780((byte) 109, null, -22);
        }
        field3920++;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V", line = 291)
    public static final void method1781(int arg0, int arg1) {
        field3932++;
        if (arg0 < 11) {
            method1779(null, null, -13, 56);
        }
        class177 var2 = class344.method2229(2, arg1, (byte) 102);
        var2.method1194(-89);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 309)
    public static final void method1782(int arg0) {
        class139.field1850 = false;
        if (arg0 > -97) {
            method1780((byte) -73, null, -63);
        }
        field3926++;
        class431.method2635(class428.field6504, (byte) 127, class194.field2594, class392.field5988, class54.field756);
    }
}
