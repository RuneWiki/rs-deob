import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class226 extends class418 {

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method1464(int arg0) {
        if (arg0 != 45) {
            this.method1464(-3);
        }
        field3113++;
        return (this.field3108 & 0x1F53F76C) >> 28 != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method1465(byte arg0) {
        field3114++;
        if (arg0 < 80) {
            method1471((byte) -103, (class185) null, (class185) null);
        }
        return (this.field3108 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I", line = 25)
    public final int method1466(byte arg0) {
        field3110++;
        int var2 = 123 / ((arg0 - 41) / 52);
        return (this.field3108 & 0x1CDB81) >> 18;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z", line = 35)
    public static final boolean method1467(int arg0) {
        field3115++;
        return class397.field5796 == arg0 ? class236.field3294 : true;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z", line = 49)
    public final boolean method1468(int arg0) {
        if (arg0 <= 58) {
            this.method1464(43);
        }
        field3121++;
        return (this.field3108 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)I", line = 60)
    public final int method1469(int arg0) {
        if (arg0 != -2703) {
            this.field3118 = 41;
        }
        field3111++;
        return class429.method2680(this.field3108, 85);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z", line = 71)
    public final boolean method1470(byte arg0, int arg1) {
        field3112++;
        if (arg0 != 65) {
            this.field3108 = -119;
        }
        return (this.field3108 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLir;Lir;)V", line = 91)
    public static final void method1471(byte arg0, class185 arg1, class185 arg2) {
        class276.field4052 = arg2;
        class236.field3286 = arg1;
        if (arg0 == 56) {
            field3117++;
            class276.field4052.method1225(36, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;IZ)Z", line = 108)
    public static final boolean method1472(byte arg0, String arg1, int arg2, boolean arg3) {
        field3119++;
        if (arg0 >= -84) {
            return true;
        } else if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg2) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if ((var10 / arg2) != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)Z", line = 182)
    public final boolean method1473(int arg0) {
        field3122++;
        if (arg0 != -425613281) {
            this.method1473(-82);
        }
        return (this.field3108 & 0x52EFC86C) >> 30 != 0;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)Z", line = 196)
    public final boolean method1474(int arg0) {
        if (arg0 == -32400) {
            field3116++;
            return (this.field3108 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V", line = 208)
    public class226(int arg0, int arg1) {
        this.field3108 = arg0;
        this.field3118 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)Z", line = 218)
    public final boolean method1475(int arg0) {
        if (arg0 == 1891201) {
            field3120++;
            return (this.field3108 & 0x76A1A6) >> 22 != 0;
        } else {
            return true;
        }
    }
}
