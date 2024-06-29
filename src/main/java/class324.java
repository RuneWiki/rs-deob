import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class324 {

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field5065 = -1;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    private int field5067 = -1;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field5071 = -1;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field5062 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field5052 = -1;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "Z")
    public boolean field5077 = true;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[Ljava/lang/String;")
    public String[] field5063 = new String[5];

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field5059 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field5069 = -1;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field5057 = -1;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public int field5080 = -1;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    private int field5082 = -1;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public int field5081 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public int field5091 = -1;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Z")
    public boolean field5074 = false;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "Z")
    public boolean field5078 = true;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "Z")
    public boolean field5084 = true;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public int field5083 = 0;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public int field5093 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "Z")
    public static boolean field5089 = true;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lrm;")
    public static class234 field5054 = new class234(64);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field5061;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field5068;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    private int field5073;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    private int field5079;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Lne;")
    public static class172 field5075;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Ljava/lang/String;")
    public String field5058;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Ljava/lang/String;")
    public String field5070;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "[I")
    public int[] field5088;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
    public final boolean method2144(byte arg0) {
        if (arg0 > -78) {
            this.method2150(103);
        }
        field5085++;
        if (this.field5052 == -1 && this.field5069 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field5052 == -1) {
            var3 = class338.method2228(this.field5069, -123);
        } else {
            var3 = class403.field6014[this.field5052];
        }
        if (this.field5053 > var3 || var3 > this.field5055) {
            return false;
        } else if (this.field5057 == -1 && this.field5067 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field5057 == -1) {
                var5 = class338.method2228(this.field5067, -112);
            } else {
                var5 = class403.field6014[this.field5057];
            }
            return this.field5079 <= var5 && var5 <= this.field5073;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method2145(int arg0) {
        field5075 = null;
        if (arg0 == -2789) {
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)Loa;")
    public static final class413 method2146(boolean arg0) {
        if (!arg0) {
            method2147(-79, (byte) -53);
        }
        field5086++;
        try {
            return new class347();
        } catch (Throwable var2) {
            try {
                return (class413) Class.forName("tc").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class434();
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
    public static final void method2147(int arg0, byte arg1) {
        field5076++;
        class52 var2 = class381.field5758;
        synchronized (class381.field5758) {
            class381.field5758.method337(arg0, (byte) -111);
        }
        class52 var3 = class37.field464;
        synchronized (class37.field464) {
            class37.field464.method337(arg0, (byte) -110);
        }
        if (arg1 < 9) {
            method2145(51);
        }
        class52 var4 = class269.field4310;
        synchronized (class269.field4310) {
            class269.field4310.method337(arg0, (byte) -107);
        }
        class52 var5 = class43.field533;
        synchronized (class43.field533) {
            class43.field533.method337(arg0, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjg;I)V")
    private final void method2148(byte arg0, class186 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5071 = arg1.method1272((byte) -50);
        } else if (arg2 == 2) {
            this.field5065 = arg1.method1272((byte) -106);
        } else if (arg2 == 3) {
            this.field5070 = arg1.method1270(-9970);
        } else if (arg2 == 4) {
            this.field5061 = arg1.method1275(-1);
        } else if (arg2 == 5) {
            this.field5080 = arg1.method1275(-1);
        } else if (arg2 == 6) {
            this.field5083 = arg1.method1322(false);
        } else if (arg2 == 7) {
            int var6 = arg1.method1322(false);
            if ((var6 & 0x1) == 0) {
                this.field5077 = false;
            }
            if ((var6 & 0x2) == 2) {
                this.field5074 = true;
            }
        } else if (arg2 == 8) {
            this.field5078 = arg1.method1322(false) == 1;
        } else if (arg2 == 9) {
            this.field5069 = arg1.method1272((byte) -64);
            if (this.field5069 == 65535) {
                this.field5069 = -1;
            }
            this.field5052 = arg1.method1272((byte) -72);
            if (this.field5052 == 65535) {
                this.field5052 = -1;
            }
            this.field5053 = arg1.method1284(8388607);
            this.field5055 = arg1.method1284(8388607);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field5063[arg2 - 10] = arg1.method1270(-9970);
        } else if (arg2 == 15) {
            int var4 = arg1.method1322(false);
            this.field5088 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field5088[var5] = arg1.method1276((byte) -46);
            }
            this.field5064 = arg1.method1284(8388607);
            this.field5087 = arg1.method1284(8388607);
        } else if (arg2 == 16) {
            this.field5084 = false;
        } else if (arg2 == 17) {
            this.field5058 = arg1.method1270(-9970);
        } else if (arg2 == 18) {
            this.field5082 = arg1.method1272((byte) -81);
        } else if (arg2 == 19) {
            this.field5091 = arg1.method1272((byte) -82);
        } else if (arg2 == 20) {
            this.field5067 = arg1.method1272((byte) -60);
            if (this.field5067 == 65535) {
                this.field5067 = -1;
            }
            this.field5057 = arg1.method1272((byte) -106);
            if (this.field5057 == 65535) {
                this.field5057 = -1;
            }
            this.field5079 = arg1.method1284(8388607);
            this.field5073 = arg1.method1284(8388607);
        } else if (arg2 == 21) {
            this.field5066 = arg1.method1284(8388607);
        } else if (arg2 == 22) {
            this.field5056 = arg1.method1284(8388607);
        }
        field5051++;
        if (arg0 > -4) {
            this.method2151((class186) null, -45);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLe;Z)Lgl;")
    public final class356 method2149(byte arg0, class312 arg1, boolean arg2) {
        field5072++;
        int var4 = arg2 ? this.field5065 : this.field5071;
        int var5 = var4 | arg1.field4911 << 29;
        class356 var6 = (class356) class223.field3715.method331((byte) 69, (long) var5);
        if (arg0 != 107) {
            this.field5055 = -35;
        }
        if (var6 != null) {
            return var6;
        } else if (class354.field5452.method2762(arg0 ^ 0x6A, var4)) {
            class100 var7 = class100.method756(class354.field5452, var4, 0);
            if (var7 != null) {
                var6 = arg1.method641(var7, true);
                class223.field3715.method341(70, (long) var5, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method2150(int arg0) {
        field5060++;
        if (arg0 != 0) {
            this.field5091 = 35;
        }
        if (this.field5088 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5088.length; var2 += 2) {
            if (this.field5088[var2] < this.field5081) {
                this.field5081 = this.field5088[var2];
            } else if (this.field5059 < this.field5088[var2]) {
                this.field5059 = this.field5088[var2];
            }
            if (this.field5062 > this.field5088[var2 + 1]) {
                this.field5062 = this.field5088[var2 + 1];
            } else if (this.field5093 < this.field5088[var2 + 1]) {
                this.field5093 = this.field5088[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljg;I)V")
    public final void method2151(class186 arg0, int arg1) {
        field5094++;
        while (true) {
            int var3 = arg0.method1322(false);
            if (var3 == 0) {
                if (arg1 >= -63) {
                    this.method2144((byte) 84);
                    return;
                } else {
                    return;
                }
            }
            this.method2148((byte) -84, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLe;)Lgl;")
    public final class356 method2152(byte arg0, class312 arg1) {
        field5090++;
        class356 var3 = (class356) class223.field3715.method331((byte) 69, (long) (this.field5082 | 0x20000 | arg1.field4911 << 29));
        if (var3 != null) {
            return var3;
        }
        class354.field5452.method2762(1, this.field5082);
        if (arg0 != 29) {
            field5092 = 69;
        }
        class100 var4 = class100.method756(class354.field5452, this.field5082, 0);
        if (var4 != null) {
            var3 = arg1.method641(var4, true);
            class223.field3715.method341(arg0 ^ 0x23, (long) (arg1.field4911 << 29 | this.field5082 | 0x20000), var3);
        }
        return var3;
    }
}
