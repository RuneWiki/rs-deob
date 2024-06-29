import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class407 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    private int field5421;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lmca;")
    public static class29 field5419;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2209(int arg0, int arg1, int arg2) {
        field5424++;
        if (class513.method2941(arg0, arg2, -103)) {
            return (arg2 & arg1) != 0 | class170.method1013((byte) -126, arg2, arg0) | class577.method3262(false, arg0, arg2) ? true : (class529.method3020(false, arg0, arg2) | class518.method2956(arg2, true, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field5418++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lfp;B)I", line = 30)
    public static final int method2210(class292 arg0, byte arg1) {
        field5425++;
        if (arg1 < 14) {
            field5419 = null;
        }
        if (arg0.field3792 == 0) {
            return 0;
        }
        if (arg0.field3803 != -1) {
            class292 var2 = null;
            if (arg0.field3803 < 32768) {
                class443 var3 = (class443) class392.field5223.method3234((byte) -68, (long) arg0.field3803);
                if (var3 != null) {
                    var2 = var3.field6107;
                }
            } else if (arg0.field3803 >= 32768) {
                var2 = class362.field4726[arg0.field3803 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field4641 - var2.field4641;
                int var5 = arg0.field4647 - var2.field4647;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1657((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, -10652);
                }
            }
        }
        if (arg0 instanceof class455) {
            class455 var6 = (class455) arg0;
            if (var6.field6326 != -1 && (var6.field3835 == 0 || var6.field3837 > 0)) {
                var6.method1657(var6.field6326, -10652);
                var6.field6326 = -1;
            }
        } else if (arg0 instanceof class625) {
            class625 var7 = (class625) arg0;
            if (var7.field8848 != -1 && (var7.field3835 == 0 || var7.field3837 > 0)) {
                int var8 = var7.field4641 - ((var7.field8848 - class682.field9685 - class682.field9685) * 256);
                int var9 = var7.field4647 - ((var7.field8854 - class146.field1642 - class146.field1642) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method1657((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, -10652);
                }
                var7.field8848 = -1;
            }
        }
        return arg0.method1663(112);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 112)
    public static final void method2211(int arg0) {
        class480.method2802(class194.field2334, arg0 + 16751);
        class318.field4121++;
        field5423++;
        class334.field4314.method2525(arg0, -81849);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[Lep;I)V", line = 125)
    public static final void method2212(int arg0, class382[] arg1, int arg2) {
        field5422++;
        if (arg0 <= 124) {
            method2209(28, -58, -57);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class382 var4 = arg1[var3];
            if (var4 != null && var4.field5108 == arg2 && !client.method1526(var4)) {
                if (var4.field5112 == 0) {
                    method2212(126, arg1, var4.field5055);
                    if (var4.field4989 != null) {
                        method2212(125, var4.field4989, var4.field5055);
                    }
                    class454 var5 = (class454) class234.field2982.method3234((byte) -125, (long) var4.field5055);
                    if (var5 != null) {
                        class511.method2929(var5.field6291, 255);
                    }
                }
                if (var4.field5112 == 6 && var4.field5048 != -1) {
                    class576 var6 = class618.field8696.method124(24006, var4.field5048);
                    if (var6 != null) {
                        var4.field4956 += class233.field2978;
                        while (var6.field8208[var4.field5027] < var4.field4956) {
                            var4.field4956 -= var6.field8208[var4.field5027];
                            var4.field5027++;
                            if (var6.field8216.length <= var4.field5027) {
                                var4.field5027 -= var6.field8227;
                                if (var4.field5027 < 0 || var6.field8216.length <= var4.field5027) {
                                    var4.field5027 = 0;
                                }
                            }
                            var4.field5061 = var4.field5027 + 1;
                            if (var4.field5061 >= var6.field8216.length) {
                                var4.field5061 -= var6.field8227;
                                if (var4.field5061 < 0 || var6.field8216.length <= var4.field5061) {
                                    var4.field5061 = -1;
                                }
                            }
                            class567.method3207((byte) -69, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(II)V", line = 212)
    public class407(int arg0, int arg1) {
        this.field5420 = arg1;
        this.field5421 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I", line = 221)
    public final int method2213(int arg0) {
        int var2 = -5 % ((-arg0 - 15) / 48);
        field5426++;
        return this.field5421;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 235)
    public static void method2214(byte arg0) {
        if (arg0 <= -77) {
            field5419 = null;
        }
    }
}
