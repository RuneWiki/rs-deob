import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class537 extends class293 {

    @OriginalMember(owner = "client!wba", name = "Q", descriptor = "I")
    private int field7866 = 0;

    @OriginalMember(owner = "client!wba", name = "S", descriptor = "I")
    private int field7868 = -1;

    @OriginalMember(owner = "client!wba", name = "X", descriptor = "I")
    private int field7873 = 0;

    @OriginalMember(owner = "client!wba", name = "L", descriptor = "Z")
    private boolean field7861 = false;

    @OriginalMember(owner = "client!wba", name = "Z", descriptor = "Z")
    public boolean field7875 = false;

    @OriginalMember(owner = "client!wba", name = "db", descriptor = "I")
    private int field7879 = 0;

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
    private int field7858 = 0;

    @OriginalMember(owner = "client!wba", name = "N", descriptor = "I")
    private int field7863 = 0;

    @OriginalMember(owner = "client!wba", name = "fb", descriptor = "I")
    private int field7881;

    @OriginalMember(owner = "client!wba", name = "gb", descriptor = "I")
    public int field7882;

    @OriginalMember(owner = "client!wba", name = "rb", descriptor = "Lhq;")
    private class47 field7893;

    @OriginalMember(owner = "client!wba", name = "M", descriptor = "I")
    public static int field7862 = 0;

    @OriginalMember(owner = "client!wba", name = "kb", descriptor = "[C")
    public static char[] field7886 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!wba", name = "P", descriptor = "[S")
    public static short[] field7865 = new short[256];

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!wba", name = "O", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!wba", name = "T", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!wba", name = "U", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!wba", name = "V", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!wba", name = "W", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!wba", name = "Y", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!wba", name = "ab", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!wba", name = "bb", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!wba", name = "cb", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!wba", name = "eb", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!wba", name = "hb", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!wba", name = "ib", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!wba", name = "jb", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!wba", name = "lb", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!wba", name = "nb", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!wba", name = "ob", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!wba", name = "qb", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!wba", name = "mb", descriptor = "Lkv;")
    private class16 field7888;

    @OriginalMember(owner = "client!wba", name = "R", descriptor = "Lmv;")
    public static class295 field7867;

    @OriginalMember(owner = "client!wba", name = "pb", descriptor = "Lfa;")
    public static class615 field7891;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        ++field7884;
        if (arg0 <= 101) {
            this.field7861 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method3095(int arg0) {
        field7891 = null;
        field7865 = null;
        if (arg0 >= -16) {
            field7871 = -35;
        }
        field7867 = null;
        field7886 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lq;Lr;ILda;)V")
    private final void method3096(class151 arg0, class98 arg1, int arg2, class395 arg3) {
        ++field7864;
        arg3.method1032(arg0);
        class30[] var5 = arg3.method1057();
        if (arg2 != -28603) {
            method3095(-61);
        }
        class586[] var6 = arg3.method1058();
        if ((this.field7888 == null || this.field7888.field339) && (var5 != null || var6 != null)) {
            this.field7888 = class16.method120(class45.field685, true);
        }
        if (this.field7888 != null) {
            this.field7888.method110(arg1, (long) class45.field685, var5, var6, false);
            this.field7888.method109(super.field7905, super.field4299, super.field4294, super.field4300, super.field4305);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7881 = arg0;
        this.field7882 = arg2 - -arg1;
        this.field7866 = arg12;
        class525 var14 = class134.field1945.method3082((byte) 50, this.field7881);
        int var15 = var14.field7457;
        if (~var15 == 0) {
            this.field7875 = true;
        } else {
            this.field7893 = class203.field2769.method2971(-63, var15);
            this.field7875 = false;
        }
        if (~this.field7882 == ~arg2) {
            class620.method3567(this, this.field7863, this.field7893, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field7892;
        if (arg2) {
            field7865 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        ++field7857;
        if (arg5 < 24) {
            this.method261(-53, -79, true, (class98) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public final void method3097(byte arg0) {
        if (this.field7888 != null) {
            this.field7888.method108();
        }
        if (arg0 < 85) {
            this.method315((byte) 89);
        }
        ++field7885;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILmv;)Luw;")
    public static final class12 method3098(int arg0, int arg1, class295 arg2) {
        if (arg1 <= 7) {
            method3098(-124, -7, (class295) null);
        }
        ++field7877;
        byte[] var3 = arg2.method1830(false, arg0);
        return var3 == null ? null : new class12(var3);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lr;III)Lda;")
    private final class395 method3099(class98 arg0, int arg1, int arg2, int arg3) {
        ++field7860;
        class525 var5 = class134.field1945.method3082((byte) 50, arg1);
        int var6 = 76 % ((11 - arg2) / 61);
        class682 var7 = class262.field3404[super.field7905];
        class682 var8 = ~super.field7900 <= -4 ? null : class262.field3404[super.field7900 + 1];
        return !this.field7875 ? var5.method2981(arg0, super.field7895, this.field7858, arg3, -26718, super.field7896, true, this.field7863, super.field7894, var8, this.field7868, var7, class203.field2769) : var5.method2981(arg0, super.field7895, 0, arg3, -26718, super.field7896, true, -1, super.field7894, var8, -1, var7, class203.field2769);
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        ++field7869;
        return !arg0;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
    public final void method3100(int arg0, int arg1) {
        ++field7876;
        if (!this.field7875) {
            int var3 = -76 % ((5 - arg1) / 63);
            this.field7858 += arg0;
            while (~this.field7858 < ~this.field7893.field729[this.field7863]) {
                this.field7858 -= this.field7893.field729[this.field7863];
                ++this.field7863;
                if (~this.field7893.field732.length >= ~this.field7863) {
                    this.field7875 = true;
                    break;
                }
            }
            if (!this.field7875) {
                class620.method3567(this, this.field7863, this.field7893, (byte) -48);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
    public static final void method3101(boolean arg0, int arg1) {
        if (arg1 != 3531) {
            method3095(-14);
        }
        ++field7874;
        class353.method2193(class454.field6538, 17068, class567.field8270, arg0, class425.field6218);
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        ++field7878;
        if (arg1 != 0) {
            this.field7879 = 48;
        }
        return null;
    }

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field7859;
        return arg0 > -42 ? false : false;
    }

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field7883;
        if (arg0 != -1) {
            this.method274(121);
        }
        return this.field7879;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        if (arg0) {
            this.field7873 = 78;
        }
        ++field7872;
        return this.field7873;
    }

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        ++field7870;
        if (arg0 != -1510217528) {
            this.field7875 = false;
        }
        return this.field7861;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        ++field7880;
        class395 var3 = this.method3099(arg0, this.field7881, 87, 0);
        if (var3 != null) {
            class151 var4 = arg0.method682();
            var4.method883(super.field7895, super.field7894, super.field7896);
            this.method3096(var4, arg0, -28603, var3);
        }
        if (arg1 != 11771) {
            method3098(91, -70, (class295) null);
        }
    }

    @OriginalMember(owner = "client!wba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7888 != null) {
            this.field7888.method108();
        }
        ++field7890;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field7887;
        class395 var3 = this.method3099(arg0, this.field7881, arg1 + 88, (~this.field7866 == arg1 ? 0 : 5) | 2048);
        if (var3 == null) {
            return null;
        } else {
            if (this.field7866 != 0) {
                var3.method1042(this.field7866 * 2048);
            }
            class151 var4 = arg0.method682();
            var4.method883(super.field7895, super.field7894, super.field7896);
            this.method3096(var4, arg0, -28603, var3);
            if (!class384.field5767) {
                var3.method1054(var4, (class67) null, 0);
            } else {
                var3.method1030(var4, (class67) null, class515.field7222, 0);
            }
            if (this.field7888 != null) {
                class620 var5 = this.field7888.method112();
                if (class384.field5767) {
                    arg0.method708(var5, class515.field7222);
                } else {
                    arg0.method679(var5);
                }
            }
            this.field7861 = var3.method1024();
            this.field7873 = var3.method1007();
            this.field7879 = var3.method1018();
            return null;
        }
    }
}
