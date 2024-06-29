import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class37 {

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    private int field21 = 3072;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    private int field30 = 1024;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    private int field20 = 2048;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Lce;")
    public static class26 field17 = new class26(new byte[5000]);

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "Ldd;")
    public static class35 field32 = class180.method1196((byte) -19, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
    public static int[] field28 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Ldd;")
    public static class35 field24 = class180.method1196((byte) -64, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "Ldd;")
    public static class35 field26 = class180.method1196((byte) -93, "hint_mapedge");

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "Ldd;")
    public static class35 field35 = class180.method1196((byte) 126, ":duelfriend:");

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "Ldd;")
    private static class35 field37 = class180.method1196((byte) 126, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Z")
    public static boolean field29 = false;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "[I")
    public static int[] field33 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "Ldd;")
    public static class35 field39 = class180.method1196((byte) 4, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Ldd;")
    public static class35 field36 = class180.method1196((byte) 126, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Ldd;")
    public static class35 field25 = field37;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "[Lbg;")
    public static class18[] field34;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
    public static void method10(byte arg0) {
        if (arg0 > -82) {
            method13(-109, -112, -31, 69, true);
        }
        field37 = null;
        field35 = null;
        field24 = null;
        field26 = null;
        field36 = null;
        field34 = null;
        field25 = null;
        field33 = null;
        field17 = null;
        field28 = null;
        field39 = null;
        field32 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            field39 = null;
        }
        ++field19;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 124);
            for (int var5 = 0; ~var5 > ~class72.field1719; ++var5) {
                var3[var5] = (var4[var5] * this.field20 >> 12) + this.field30;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        if (!arg0) {
            ++field41;
            this.field20 = -this.field30 + this.field21;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)Z")
    public static final boolean method12(int arg0) {
        ++field23;
        class61 var1 = class111.field2443;
        synchronized (class111.field2443) {
            if (class184.field3777 == class176.field3593) {
                return false;
            } else {
                class42.field926 = class105.field2354[class184.field3777];
                class150.field3123 = class38.field837[class184.field3777];
                class184.field3777 = class184.field3777 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field825 = arg2.method221(-89) == 1;
                    }
                } else {
                    this.field21 = arg2.method256((byte) -78);
                }
            } else {
                this.field30 = arg2.method256((byte) -78);
            }
            ++field16;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZ)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class110.field2427 == 1) {
            class115.field2588[class113.field2535 / 100].method115(class170.field3399 - 8, class131.field2833 + -8);
        }
        ++field38;
        if (~class110.field2427 == -3) {
            class115.field2588[class113.field2535 / 100 + 4].method115(class170.field3399 + -8, class131.field2833 - 8);
        }
        class72.method576((byte) -71);
        if (class181.field3692) {
            int var5 = arg1 - -512 + -5;
            int var6 = arg0 + 20;
            int var7 = 16776960;
            class26.field574.method1323(class63.method529(new class35[] { class207.field4118, class3.method19(class69.field1675, -29578) }, (byte) 66), var5, var6, 16776960, -1);
            int var10 = var6 + 15;
            Runtime var8 = Runtime.getRuntime();
            int var9 = (int) ((var8.totalMemory() + -var8.freeMemory()) / 1024L);
            if (~var9 < -32769 && class35.field781) {
                var7 = 16711680;
            }
            if (~var9 < -65537 && !class35.field781) {
                var7 = 16711680;
            }
            class26.field574.method1323(class63.method529(new class35[] { class136.field2919, class3.method19(var9, -29578), class170.field3407 }, (byte) 80), var5, var10, var7, -1);
            var6 = var10 + 15;
        }
        if (!arg4) {
            method15((class8) null, -70);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int[][] var4 = this.method370(arg0, 0, 3);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class72.field1719 < ~var11; ++var11) {
                var7[var11] = (var6[var11] * this.field20 >> 12) + this.field30;
                var9[var11] = (var5[var11] * this.field20 >> 12) + this.field30;
                var10[var11] = (var8[var11] * this.field20 >> 12) + this.field30;
            }
        }
        if (arg1 < 5) {
            return null;
        } else {
            ++field15;
            return var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lag;I)V")
    public static final void method15(class8 arg0, int arg1) {
        class82.field1910 = arg0;
        ++field18;
        if (arg1 != 6726) {
            method15((class8) null, 104);
        }
    }
}
