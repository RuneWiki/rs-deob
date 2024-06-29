import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class276 {

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
    public static int[] field4857 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lbg;")
    public static class237 field4852 = new class237(16);

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
    public static int[] field4861 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field4864 = 0;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Loa;")
    public static class99 field4859 = class221.method1463(2844, "<br>(X");

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Loa;")
    private static class99 field4862 = class221.method1463(2844, "slide:");

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Loa;")
    public static class99 field4863 = field4862;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Loa;")
    public static class99 field4858 = field4862;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ltg;")
    public static class182 field4860;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lvh;")
    public class276 field4851;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lvh;")
    public class276 field4854;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field4852 = null;
        field4862 = null;
        field4859 = null;
        field4863 = null;
        field4861 = null;
        field4858 = null;
        if (arg0 == -29234) {
            field4857 = null;
            field4860 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[Ltf;I)V")
    public static final void method1827(int arg0, class107[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class107 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1814 == 0) {
                    if (var4.field1837 != null) {
                        method1827(-2, var4.field1837, arg2);
                    }
                    class2 var5 = (class2) class57.field959.method1550(true, (long) var4.field1873);
                    if (var5 != null) {
                        class220.method1460(arg2, (byte) 127, var5.field12);
                    }
                }
                if (arg2 == 0 && var4.field1783 != null) {
                    class260 var6 = new class260();
                    var6.field4553 = var4;
                    var6.field4543 = var4.field1783;
                    class56.method385(200000, var6);
                }
                if (arg2 == 1 && var4.field1893 != null) {
                    if (var4.field1922 >= 0) {
                        class107 var7 = class22.method131(var4.field1873, 1538872048);
                        if (var7 == null || var7.field1837 == null || var7.field1837.length <= var4.field1922 || var7.field1837[var4.field1922] != var4) {
                            continue;
                        }
                    }
                    class260 var8 = new class260();
                    var8.field4553 = var4;
                    var8.field4543 = var4.field1893;
                    class56.method385(200000, var8);
                }
            }
        }
        if (arg0 != -2) {
            field4859 = null;
        }
        field4850++;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method1828(int arg0) {
        field4849++;
        if (this.field4854 == null) {
            return;
        }
        this.field4854.field4851 = this.field4851;
        this.field4851.field4854 = this.field4854;
        this.field4851 = null;
        if (arg0 != -1072) {
            this.method1828(-3);
        }
        this.field4854 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
    public static final void method1829(byte arg0, boolean arg1) {
        field4856++;
        if (arg0 != -103) {
            return;
        }
        byte var2 = 4;
        byte[][] var3 = class117.field2077;
        for (int var4 = 0; var4 < var2; var4++) {
            class225.method1485(0);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class119.field2106[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3828179) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class171.field3042.length; var13++) {
                                if (class171.field3042[var13] == var12 && var3[var13] != null) {
                                    class152.method1014((var11 & 0x7) * 8, var4, (var10 & 0x7) * 8, var6 * 8, var3[var13], class177.field3091, var5 * 8, var8, (byte) -116, arg1, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IJIB)Z")
    public static final boolean method1830(int arg0, long arg1, int arg2, byte arg3) {
        field4853++;
        int var5 = ((int) arg1 & 0x7EA53) >> 14;
        if (arg3 != 79) {
            method1826(11);
        }
        int var6 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        int var7 = (int) arg1 >> 20 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class153 var8 = class247.method1601(26012, var6);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field2704;
                var10 = var8.field2717;
            } else {
                var9 = var8.field2717;
                var10 = var8.field2704;
            }
            int var11 = var8.field2683;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class95.method637(0, 0, var10, var11, 2, arg2, var9, class168.field3006.field1259[0], arg0, 2, true, class168.field3006.field1317[0]);
        } else {
            class95.method637(var5 + 1, var7, 0, 0, 2, arg2, 0, class168.field3006.field1259[0], arg0, 2, true, class168.field3006.field1317[0]);
        }
        class209.field3616 = 0;
        class263.field4658 = class122.field2133;
        class43.field730 = class11.field97;
        class268.field4716 = 2;
        return true;
    }
}
