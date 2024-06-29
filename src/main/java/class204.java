import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class204 extends class12 {

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public int field3949 = 0;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[Z")
    public static boolean[] field3938 = new boolean[8];

    @OriginalMember(owner = "client!we", name = "L", descriptor = "[I")
    public static int[] field3946 = new int[1000];

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field3947 = 1;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lme;")
    public static class114 field3952;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "Ljg;")
    public static class89 field3935;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
    public static int[] field3953;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "[Lob;")
    public static class129[] field3951;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3952 = null;
        if (arg0 >= -120) {
            field3946 = null;
        }
        field3935 = null;
        field3951 = null;
        field3938 = null;
        field3946 = null;
        field3953 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;BII)Lug;")
    public static final class188 method1323(Component arg0, byte arg1, int arg2, int arg3) {
        field3934++;
        try {
            Class var4 = Class.forName("dc");
            class188 var5 = (class188) var4.getDeclaredConstructor().newInstance();
            var5.method88(arg0, arg2, arg3, (byte) 109);
            return arg1 > -17 ? null : var5;
        } catch (Throwable var7) {
            class15 var6 = new class15();
            var6.method88(arg0, arg2, arg3, (byte) 58);
            return var6;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lrd;B)V")
    public final void method1324(class158 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1054(128);
            if (var3 == 0) {
                if (arg1 >= -120) {
                    method1330((byte) -86);
                }
                field3943++;
                return;
            }
            this.method1332(var3, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lh;")
    public static final class65 method1325(int arg0, int arg1) {
        field3948++;
        int var2 = arg1 & arg0;
        int var3 = arg1 >> 16;
        if (class28.field460[var3] == null || class28.field460[var3][var2] == null) {
            boolean var4 = class67.method352(2, var3);
            if (!var4) {
                return null;
            }
        }
        return class28.field460[var3][var2];
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method1326(int arg0) {
        field3939++;
        int var1 = class59.field942.method42(8, -46);
        if (class205.field3966 > var1) {
            for (int var2 = var1; var2 < class205.field3966; var2++) {
                class171.field3397[class161.field3222++] = class144.field2818[var2];
            }
        }
        if (var1 > class205.field3966) {
            throw new RuntimeException("gppov1");
        }
        class205.field3966 = 0;
        int var3 = 0;
        if (arg0 != 1) {
            method1325(80, 51);
        }
        while (var1 > var3) {
            int var4 = class144.field2818[var3];
            class34 var5 = class206.field4035[var4];
            int var6 = class59.field942.method42(1, arg0 - 90);
            if (var6 == 0) {
                class144.field2818[class205.field3966++] = var4;
                var5.field2073 = class21.field338;
            } else {
                int var7 = class59.field942.method42(2, -92);
                if (var7 == 0) {
                    class144.field2818[class205.field3966++] = var4;
                    var5.field2073 = class21.field338;
                    class14.field243[class124.field2313++] = var4;
                } else if (var7 == 1) {
                    class144.field2818[class205.field3966++] = var4;
                    var5.field2073 = class21.field338;
                    int var8 = class59.field942.method42(3, -90);
                    var5.method604(false, true, var8);
                    int var9 = class59.field942.method42(1, arg0 ^ 0xFFFFFFA5);
                    if (var9 == 1) {
                        class14.field243[class124.field2313++] = var4;
                    }
                } else if (var7 == 2) {
                    class144.field2818[class205.field3966++] = var4;
                    var5.field2073 = class21.field338;
                    int var10 = class59.field942.method42(3, arg0 - 42);
                    var5.method604(true, true, var10);
                    int var11 = class59.field942.method42(3, -115);
                    var5.method604(true, true, var11);
                    int var12 = class59.field942.method42(1, -47);
                    if (var12 == 1) {
                        class14.field243[class124.field2313++] = var4;
                    }
                } else if (var7 == 3) {
                    class171.field3397[class161.field3222++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public static final void method1327(int arg0, int arg1, int arg2) {
        field3944++;
        long var3 = (long) ((arg0 << 16) + arg1);
        class161 var5 = (class161) class46.field733.method616(var3, arg2 - 1);
        if (var5 != null && arg2 == 0) {
            class92.field1678.method80(var5, true);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BB)Lef;")
    public static final class45 method1328(byte[] arg0, byte arg1) {
        if (arg1 != 119) {
            field3951 = null;
        }
        field3945++;
        if (arg0 == null) {
            return null;
        } else {
            class45 var2 = new class45(arg0, class153.field2993, class82.field1513, class64.field1010, class100.field1844, class103.field1895, class35.field577);
            class206.method1340(-23557);
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljg;Ljg;ILjg;Ljg;)V")
    public static final void method1329(class89 arg0, class89 arg1, int arg2, class89 arg3, class89 arg4) {
        class195.field3820 = arg4;
        class15.field276 = arg0;
        class120.field2217 = arg3;
        field3940++;
        class18.field305 = arg1;
        class28.field460 = new class65[class18.field305.method462((byte) -78)][];
        if (arg2 >= -78) {
            method1329(null, null, -81, null, null);
        }
        class140.field2730 = new boolean[class18.field305.method462((byte) -78)];
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static final void method1330(byte arg0) {
        field3936++;
        class154 var1 = class177.field3509;
        synchronized (class177.field3509) {
            if (arg0 == 0) {
                class66.field1186 = class65.field1104;
                class97.field1826 = class167.field3339;
                class170.field3380 = class6.field112;
                class144.field2798 = class148.field2854;
                class88.field1592 = class205.field3983;
                class57.field928 = class205.field3964;
                class63.field998 = class169.field3371;
                class148.field2854 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIII)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = class113.method621(arg0, arg2, arg1 - 9);
        if (var4 != null && var4.field1158 != null) {
            class104 var5 = new class104();
            var5.field1924 = var4.field1158;
            var5.field1919 = var4;
            class82.method421(var5, false);
        }
        class103.field1905 = true;
        class148.field2855 = arg2;
        class75.field1360 = arg3;
        if (arg1 == 8) {
            class188.field3693 = arg0;
            class160.method1095(0, var4);
            field3937++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILrd;I)V")
    private final void method1332(int arg0, class158 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field3949 = arg1.method1071(arg2 ^ 0x6DC0);
        }
        field3941++;
    }
}
