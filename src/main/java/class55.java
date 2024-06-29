import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class55 extends class12 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    private int field901 = 128;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    private int field902 = 0;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    private int field916 = 128;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public int field907 = -1;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field912 = 0;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    private int field923 = 0;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Lkb;")
    public static class93 field903 = class76.method390("", 0);

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lkb;")
    public static class93 field900 = class76.method390("da dieser Computer gegen unsere ", 0);

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "Lkb;")
    public static class93 field908 = class76.method390("Einloggen", 0);

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "Lkb;")
    private static class93 field917 = class76.method390("This world is running a closed Beta)3", 0);

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Lkb;")
    public static class93 field922 = field917;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "Lkb;")
    public static class93 field910 = class76.method390("Mitglieder)2Welt", 0);

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "[S")
    private short[] field904;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "[S")
    private short[] field905;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "[S")
    private short[] field913;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "[S")
    private short[] field921;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;IILqd;I)Leh;")
    public static final class47 method297(Component arg0, int arg1, int arg2, class149 arg3, int arg4) {
        field906++;
        if (class170.field3385 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class47 var5 = (class47) Class.forName("bi").getDeclaredConstructor().newInstance();
                var5.field748 = new int[(class3.field46 ? 2 : 1) * 256];
                var5.field769 = arg4;
                var5.method124(arg0);
                var5.field778 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field778 > 16384) {
                    var5.field778 = 16384;
                }
                var5.method121(var5.field778);
                if (class8.field129 > 0 && class102.field1882 == null) {
                    class102.field1882 = new class73();
                    class102.field1882.field1328 = arg3;
                    arg3.method909(-5836, class102.field1882, class8.field129);
                }
                if (class102.field1882 != null) {
                    if (class102.field1882.field1343[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class102.field1882.field1343[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class187 var6 = new class187(arg3, arg1);
                    var6.field748 = new int[(class3.field46 ? 2 : 1) * 256];
                    if (arg2 <= 24) {
                        method303(false);
                    }
                    var6.field769 = arg4;
                    var6.method124(arg0);
                    var6.field778 = 16384;
                    var6.method121(var6.field778);
                    if (class8.field129 > 0 && class102.field1882 == null) {
                        class102.field1882 = new class73();
                        class102.field1882.field1328 = arg3;
                        arg3.method909(-5836, class102.field1882, class8.field129);
                    }
                    if (class102.field1882 != null) {
                        if (class102.field1882.field1343[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class102.field1882.field1343[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class47();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)Lfd;")
    public final class52 method298(boolean arg0, int arg1) {
        field919++;
        if (arg0) {
            field917 = null;
        }
        class52 var3 = (class52) class112.field2086.method680((long) this.field918, (byte) -53);
        if (var3 == null) {
            class132 var4 = class132.method780(class107.field1950, this.field915, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field921 != null) {
                for (int var5 = 0; var5 < this.field921.length; var5++) {
                    var4.method790(this.field921[var5], this.field904[var5]);
                }
            }
            if (this.field905 != null) {
                for (int var6 = 0; var6 < this.field905.length; var6++) {
                    var4.method769(this.field905[var6], this.field913[var6]);
                }
            }
            var3 = var4.method774(this.field902 + 64, this.field912 + 850, -30, -50, -30, true, true);
            class112.field2086.method678(true, var3, (long) this.field918);
        }
        class52 var7;
        if (this.field907 == -1 || arg1 == -1) {
            var7 = var3.method277(true);
        } else {
            var7 = class39.method213(-10639, this.field907).method202(arg1, true, var3);
        }
        if (this.field901 != 128 || this.field916 != 128) {
            var7.method283(this.field901, this.field916, this.field901);
        }
        if (this.field923 != 0) {
            if (this.field923 == 90) {
                var7.method270();
            }
            if (this.field923 == 180) {
                var7.method270();
                var7.method270();
            }
            if (this.field923 == 270) {
                var7.method270();
                var7.method270();
                var7.method270();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZILob;)V")
    public static final void method299(int arg0, int arg1, int arg2, boolean arg3, int arg4, class129 arg5) {
        field920++;
        if (arg3) {
            method303(false);
        }
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 4225 || var6 >= 90000) {
            class183.method1191(arg5, (byte) 61, arg2, arg4, arg0, arg1);
            return;
        }
        int var7 = class93.field1707 + class30.field510 & 0x7FF;
        int var8 = class150.field2896[var7];
        int var9 = class150.field2888[var7];
        int var10 = var9 * 256 / (class193.field3749 + 256);
        int var11 = var8 * 256 / (class193.field3749 + 256);
        int var12 = arg1 * var10 - arg2 * var11 >> 16;
        int var13 = arg1 * var11 + arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var13, (double) var12);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class26.field399.method732(arg0 + var16 + 94 - 6, arg4 + 83 + -var17 + -20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lrd;II)V")
    private final void method300(class158 arg0, int arg1, int arg2) {
        field911++;
        if (arg2 == 1) {
            this.field915 = arg0.method1071(28101);
        } else if (arg2 == 2) {
            this.field907 = arg0.method1071(28101);
        } else if (arg2 == 4) {
            this.field901 = arg0.method1071(28101);
        } else if (arg2 == 5) {
            this.field916 = arg0.method1071(28101);
        } else if (arg2 == 6) {
            this.field923 = arg0.method1071(28101);
        } else if (arg2 == 7) {
            this.field902 = arg0.method1054(128);
        } else if (arg2 == 8) {
            this.field912 = arg0.method1054(128);
        } else if (arg2 == 40) {
            int var4 = arg0.method1054(128);
            this.field921 = new short[var4];
            this.field904 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field921[var5] = (short) arg0.method1071(arg1 + 22936);
                this.field904[var5] = (short) arg0.method1071(arg1 + 22936);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1054(128);
            this.field905 = new short[var6];
            this.field913 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field905[var7] = (short) arg0.method1071(class29.method159(arg1, 31208));
                this.field913[var7] = (short) arg0.method1071(28101);
            }
        }
        if (arg1 != 5165) {
            method303(true);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lrd;I)V")
    public final void method301(class158 arg0, int arg1) {
        field909++;
        while (true) {
            int var3 = arg0.method1054(128);
            if (var3 == 0) {
                if (arg1 > -80) {
                    this.field912 = -62;
                    return;
                } else {
                    return;
                }
            }
            this.method300(arg0, 5165, var3);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method302(int arg0) {
        field914++;
        class91 var1 = (class91) class206.field4027.method692(false);
        if (arg0 != -129) {
            return;
        }
        while (var1 != null) {
            if (class114.field2145 != var1.field1662 || var1.field1658) {
                var1.method235(false);
            } else if (var1.field1659 <= class21.field338) {
                var1.method478(class24.field363, -77);
                if (var1.field1658) {
                    var1.method235(false);
                } else {
                    class175.field3458.method841(var1.field1662, var1.field1674, var1.field1668, var1.field1669, 60, var1, 0, -1, false);
                }
            }
            var1 = (class91) class206.field4027.method695(512);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static void method303(boolean arg0) {
        field903 = null;
        field910 = null;
        field917 = null;
        if (arg0) {
            field900 = null;
            field922 = null;
            field908 = null;
        }
    }
}
