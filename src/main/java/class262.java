import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class262 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
    private int[] field3983 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
    public boolean field3991 = false;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public int field3990 = -1;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[[Z")
    public static boolean[][] field3995 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "[I")
    private int[] field3994;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "[S")
    private short[] field3980;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[S")
    public static short[] field3981;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[S")
    private short[] field3985;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[S")
    private short[] field3987;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
    private short[] field3992;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1937(int arg0) {
        field3996++;
        if (this.field3994 == null) {
            return true;
        }
        int var2 = -25 / ((arg0 + 36) / 59);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3994.length; var4++) {
            if (!class133.field1947.method2536(-19052, 0, this.field3994[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Z", line = 35)
    public final boolean method1938(int arg0) {
        field3997++;
        if (arg0 <= 10) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3983[var3] != -1 && !class133.field1947.method2536(-19052, 0, this.field3983[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Ltk;", line = 61)
    public final class46 method1939(boolean arg0) {
        field3989++;
        if (this.field3994 == null) {
            return null;
        }
        class46[] var2 = new class46[this.field3994.length];
        int var3 = 0;
        if (arg0) {
            this.method1941((class190) null, 2);
        }
        while (this.field3994.length > var3) {
            var2[var3] = class46.method377(class133.field1947, this.field3994[var3], 0);
            var3++;
        }
        class46 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class46(var2, var2.length);
        }
        if (this.field3992 != null) {
            for (int var5 = 0; var5 < this.field3992.length; var5++) {
                var4.method372(this.field3992[var5], this.field3987[var5]);
            }
        }
        if (this.field3980 != null) {
            for (int var6 = 0; var6 < this.field3980.length; var6++) {
                var4.method369(this.field3980[var6], this.field3985[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)Ltk;", line = 118)
    public final class46 method1940(boolean arg0) {
        field3982++;
        if (!arg0) {
            method1946(-10, 74);
        }
        class46[] var2 = new class46[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3983[var4] != -1) {
                var2[var3++] = class46.method377(class133.field1947, this.field3983[var4], 0);
            }
        }
        class46 var5 = new class46(var2, var3);
        if (this.field3992 != null) {
            for (int var6 = 0; var6 < this.field3992.length; var6++) {
                var5.method372(this.field3992[var6], this.field3987[var6]);
            }
        }
        if (this.field3980 != null) {
            for (int var7 = 0; var7 < this.field3980.length; var7++) {
                var5.method369(this.field3980[var7], this.field3985[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsb;I)V", line = 183)
    public final void method1941(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1319(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field3978++;
                return;
            }
            this.method1943(arg0, 3134, var3);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 203)
    public static final void method1942(String arg0, byte arg1) {
        field3984++;
        if (arg0 == null) {
            return;
        }
        String var2 = class19.method117(20563, arg0);
        if (arg1 <= 124) {
            field3995 = (boolean[][]) ((boolean[][]) null);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class110.field1608; var3++) {
            String var4 = class19.method117(20563, class109.field1585[var3]);
            if (var4 != null && var4.equals(var2)) {
                class110.field1608--;
                class165.field2357++;
                for (int var5 = var3; var5 < class110.field1608; var5++) {
                    class109.field1585[var5] = class109.field1585[var5 + 1];
                    class50.field761[var5] = class50.field761[var5 + 1];
                    class284.field4294[var5] = class284.field4294[var5 + 1];
                    class119.field1684[var5] = class119.field1684[var5 + 1];
                    class32.field459[var5] = class32.field459[var5 + 1];
                    class313.field4661[var5] = class313.field4661[var5 + 1];
                }
                class348.field5376 = class68.field989;
                class107.field1533.method1915(true, 101);
                class107.field1533.method1355((byte) -126, class225.method1646(-89, arg0));
                class107.field1533.method1343(arg0, 0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsb;II)V", line = 265)
    private final void method1943(class190 arg0, int arg1, int arg2) {
        field3979++;
        if (arg1 != 3134) {
            method1946(51, -60);
        }
        if (arg2 == 1) {
            this.field3990 = arg0.method1319(255);
        } else if (arg2 == 2) {
            int var4 = arg0.method1319(arg1 - 2879);
            this.field3994 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3994[var5] = arg0.method1317((byte) 104);
            }
        } else if (arg2 == 3) {
            this.field3991 = true;
        } else if (arg2 == 40) {
            int var8 = arg0.method1319(255);
            this.field3987 = new short[var8];
            this.field3992 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3992[var9] = (short) arg0.method1317((byte) 120);
                this.field3987[var9] = (short) arg0.method1317((byte) 20);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1319(255);
            this.field3985 = new short[var6];
            this.field3980 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3980[var7] = (short) arg0.method1317((byte) 124);
                this.field3985[var7] = (short) arg0.method1317((byte) 126);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3983[arg2 - 60] = arg0.method1317((byte) 19);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V", line = 342)
    public static final void method1944(boolean arg0, int arg1) {
        field3993++;
        if (arg1 != -1476502141) {
            return;
        }
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (class141.field2031 && arg0) {
            var3 = 1;
            var4 = class208.field3041;
        } else {
            var4 = class178.field2560;
            var3 = 4;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class32.method228(0);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class255.field3815[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x30B251B) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = (var9 & 0xFFED7B) >> 14;
                            int var13 = (var9 & 0x3FFF) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class85.field1201.length; var15++) {
                                if (class85.field1201[var15] == var14 && var4[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class208.method1521(var10, var4[var15], var12, var7 * 8, arg0, var11, (byte) 103, var13, var6 * 8, var5, class92.field1269);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class330.method2310(var5, arg1 + 1476502234, var7 * 8, 8, var6 * 8, 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class284.field4291 = -1;
            return;
        }
        class99.field1412 = var2[3];
        class214.field3082 = var2[4];
        class303.field4535 = var2[1];
        class284.field4291 = var2[0];
        class110.field1595 = var2[2];
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 456)
    public static final void method1945(byte arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class243.field3620 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
            if (arg0 >= -47) {
                field3981 = (short[]) null;
            }
        } catch (Exception var7) {
        }
        field3986++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lea;", line = 487)
    public static final class12 method1946(int arg0, int arg1) {
        field3988++;
        class12 var2 = (class12) class104.field1491.method461((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 103) {
            method1946(-123, 5);
        }
        byte[] var3 = class96.field1355.method2520(16, arg0, (byte) -25);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method70(new class190(var3), 765);
        }
        class104.field1491.method460(var4, -26089, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V", line = 512)
    public static void method1947(boolean arg0) {
        if (arg0) {
            field3995 = (boolean[][]) ((boolean[][]) null);
        }
        field3981 = null;
        field3995 = (boolean[][]) null;
    }
}
