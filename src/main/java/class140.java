import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "[I")
    private int[] field2098 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Lhq;")
    public static class108 field2104;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Ljt;")
    public class67 field2105;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    private int[] field2097;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[S")
    private short[] field2093;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[S")
    private short[] field2095;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "[S")
    private short[] field2101;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[S")
    private short[] field2107;

    static {
        new class475("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)Lqc;", line = 8)
    public final class521 method927(boolean arg0) {
        field2100++;
        if (this.field2097 == null) {
            return null;
        }
        class521[] var2 = new class521[this.field2097.length];
        class491 var3 = this.field2105.field1029;
        synchronized (this.field2105.field1029) {
            int var4 = 0;
            while (true) {
                if (this.field2097.length <= var4) {
                    break;
                }
                var2[var4] = class99.method612(this.field2105.field1029, 0, this.field2097[var4], (byte) -50);
                var4++;
            }
        }
        int var5 = 0;
        if (!arg0) {
            field2103 = -105;
        }
        while (this.field2097.length > var5) {
            if (var2[var5].field7677 < 13) {
                var2[var5].method3091(-2, 0);
            }
            var5++;
        }
        class521 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class521(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2093 != null) {
            for (int var7 = 0; var7 < this.field2093.length; var7++) {
                var6.method3089(true, this.field2101[var7], this.field2093[var7]);
            }
        }
        if (this.field2095 != null) {
            for (int var8 = 0; var8 < this.field2095.length; var8++) {
                var6.method3086(this.field2095[var8], this.field2107[var8], 0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILdh;)V", line = 83)
    private final void method928(int arg0, int arg1, class209 arg2) {
        if (arg1 != 3) {
            field2103 = 25;
        }
        if (arg0 == 1) {
            arg2.method1428(32122);
        } else if (arg0 == 2) {
            int var8 = arg2.method1428(32122);
            this.field2097 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2097[var9] = arg2.method1450((byte) 126);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method1428(32122);
                this.field2101 = new short[var6];
                this.field2093 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2093[var7] = (short) arg2.method1450((byte) 50);
                    this.field2101[var7] = (short) arg2.method1450((byte) 61);
                }
            } else if (arg0 == 41) {
                int var4 = arg2.method1428(32122);
                this.field2107 = new short[var4];
                this.field2095 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2095[var5] = (short) arg2.method1450((byte) 28);
                    this.field2107[var5] = (short) arg2.method1450((byte) 126);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field2098[arg0 - 60] = arg2.method1450((byte) 55);
            }
        }
        field2106++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ldh;Z)V", line = 164)
    public final void method929(class209 arg0, boolean arg1) {
        field2109++;
        if (arg1) {
            this.field2098 = null;
        }
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                return;
            }
            this.method928(var3, 3, arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLqa;)V", line = 185)
    public static final void method930(boolean arg0, class162 arg1) {
        field2096++;
        int var2 = class25.field267;
        int var3 = class11.field148;
        int var4 = class85.field1299;
        if (!arg0) {
            field2104 = null;
        }
        int var5 = class61.field928;
        int var6 = -10660793;
        arg1.method1087(var3, var2, 127, var5, var6, var4);
        arg1.method1087(var3 + 1, var2 - -1, 123, 16, -16777216, var4 - 2);
        arg1.method1045(var2 + 1, var3 + 18, var5 - 19, 1, var4 - 2, -16777216);
        class294.field4202.method2899(var2 + 3, var3 + 14, -1, class397.field5946.method2838(false, class143.field2137), -16777216, var6);
        int var7 = class54.field838.method1751(32);
        int var8 = class54.field838.method1749((byte) -123);
        int var9 = 0;
        for (class118 var10 = (class118) class312.field4467.method816(120); var10 != null; var10 = (class118) class312.field4467.method812(119)) {
            int var11 = ((class450.field6706 - var9 - 1) * 16) + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field1787) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class208.method1398(var10.field1781, true)) {
                var13 = class294.field4196.method453(0, (int) var10.field1775).field4805;
            } else if (var10.field1779 != -1) {
                var13 = class294.field4196.method453(0, var10.field1779).field4805;
            } else if (class169.method1170(var10.field1781, -124)) {
                class167 var16 = class193.field2821[(int) var10.field1775];
                if (var16 != null) {
                    class342 var17 = var16.field2472;
                    if (var17.field4938 != null) {
                        var17 = var17.method2094(-121, class49.field796);
                    }
                    if (var17 != null) {
                        var13 = var17.field4872;
                    }
                }
            } else if (class253.method1701(var10.field1781, (byte) -121)) {
                Object var14 = null;
                class519 var15;
                if (var10.field1781 == 1006) {
                    var15 = class252.field3743.method2686((int) var10.field1775, (byte) 127);
                } else {
                    var15 = class252.field3743.method2686((int) (var10.field1775 >>> 32 & 0x7FFFFFFFL), (byte) 126);
                }
                if (var15.field7596 != null) {
                    var15 = var15.method3067(class49.field796, -13012);
                }
                if (var15 != null) {
                    var13 = var15.field7650;
                }
            }
            String var18 = class195.method1313((byte) 127, var10);
            if (var13 != null) {
                var18 = var18 + class474.method2833(-1, var13);
            }
            class294.field4202.method2916(var18, class337.field4733, var11, 24382, var2 + 3, class187.field2784, 0, var12);
            var9++;
            if (var10.field1777) {
                class475.field6994.method3121(class163.field2401.method1797(false, var18) + (var2 + 5), var11 + -12);
            }
        }
        class50.method311(-80, class61.field928, class11.field148, class85.field1299, class25.field267);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 301)
    public static void method931(int arg0) {
        if (arg0 != 3) {
            field2104 = null;
        }
        field2104 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 311)
    public static final Class method932(int arg0, String arg1) throws ClassNotFoundException {
        field2102++;
        if (arg0 != -1) {
            return null;
        } else if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z", line = 351)
    public final boolean method933(int arg0) {
        if (arg0 > -28) {
            return false;
        }
        field2092++;
        boolean var2 = true;
        class491 var3 = this.field2105.field1029;
        synchronized (this.field2105.field1029) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2098[var4] != -1 && !this.field2105.field1029.method2922(0, this.field2098[var4], true)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Z", line = 378)
    public final boolean method934(byte arg0) {
        field2099++;
        if (this.field2097 == null) {
            return true;
        }
        boolean var2 = true;
        class491 var3 = this.field2105.field1029;
        synchronized (this.field2105.field1029) {
            int var4 = 0;
            while (true) {
                if (this.field2097.length <= var4) {
                    break;
                }
                if (!this.field2105.field1029.method2922(0, this.field2097[var4], true)) {
                    var2 = false;
                }
                var4++;
            }
        }
        int var5 = 64 % ((43 - arg0) / 55);
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)Lqc;", line = 423)
    public final class521 method935(byte arg0) {
        int var2 = 63 / ((-arg0 - 65) / 50);
        field2094++;
        class521[] var3 = new class521[5];
        int var4 = 0;
        class491 var5 = this.field2105.field1029;
        synchronized (this.field2105.field1029) {
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field2098[var6] != -1) {
                    var3[var4++] = class99.method612(this.field2105.field1029, 0, this.field2098[var6], (byte) -100);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var3[var7] != null && var3[var7].field7677 < 13) {
                var3[var7].method3091(-2, 0);
            }
        }
        class521 var8 = new class521(var3, var4);
        if (this.field2093 != null) {
            for (int var9 = 0; var9 < this.field2093.length; var9++) {
                var8.method3089(true, this.field2101[var9], this.field2093[var9]);
            }
        }
        if (this.field2095 != null) {
            for (int var10 = 0; var10 < this.field2095.length; var10++) {
                var8.method3086(this.field2095[var10], this.field2107[var10], 0);
            }
        }
        return var8;
    }
}
