import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class478 extends class578 {

    @OriginalMember(owner = "client!fka", name = "s", descriptor = "I")
    public int field7050 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fka", name = "m", descriptor = "I")
    public int field7053 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fka", name = "q", descriptor = "I")
    public int field7049 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fka", name = "p", descriptor = "I")
    public int field7055 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fka", name = "k", descriptor = "I")
    public int field7051 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fka", name = "l", descriptor = "I")
    public int field7057 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fka", name = "n", descriptor = "I")
    public int field7059 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fka", name = "j", descriptor = "I")
    public int field7056 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fka", name = "u", descriptor = "Liga;")
    public class353 field7052;

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7060 = new String[] { method3707(method3706("pY~\tj")), method3707(method3706("m\u001c1\t+b\u00199S)#")), method3707(method3706("e\u0002<K")), method3707(method3706("m\u001c1\tV#")), method3707(method3706("m\u001c1\tU#")) };

    @OriginalMember(owner = "client!fka", name = "r", descriptor = "I")
    public static int field7058 = 0;

    @OriginalMember(owner = "client!fka", name = "o", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!fka", name = "t", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Liga;)V", line = 155)
    public class478(class353 arg0) {
        try {
            this.field7052 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7060[1] + (arg0 == null ? field7060[2] : field7060[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lrfa;)V", line = 14)
    public static final void method3703(class202 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class202 var2 = null;
            for (class202 var3 = class563.field8239[var1]; var3 != null; var3 = var3.field2977) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class563.field8239[var1] = var3.field2977;
                    } else {
                        var2.field2977 = var3.field2977;
                    }
                    class710.field9925 = true;
                    return;
                }
                var2 = var3;
            }
            class202 var4 = null;
            for (class202 var5 = class210.field3050[var1]; var5 != null; var5 = var5.field2977) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class210.field3050[var1] = var5.field2977;
                    } else {
                        var4.field2977 = var5.field2977;
                    }
                    class710.field9925 = true;
                    return;
                }
                var4 = var5;
            }
            class202 var6 = null;
            for (class202 var7 = class391.field5707[var1]; var7 != null; var7 = var7.field2977) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class391.field5707[var1] = var7.field2977;
                    } else {
                        var6.field2977 = var7.field2977;
                    }
                    class710.field9925 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z", line = 100)
    public static final boolean method3704(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != -1557) {
                method3704(66, -50, -3);
            }
            field7047++;
            if (class452.method3501(arg0, 0, arg2)) {
                return class349.method2787(arg0, -28272, arg2) | (arg0 & 0x9000) != 0 | class529.method4008(-1, arg0, arg2) ? true : (arg2 & 0x37) == 0 & (class750.method5428(arg2, arg0, -67) | (arg0 & 0x2000) != 0 | class798.method5757(arg2, arg0, (byte) 107));
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7060[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(III)Z", line = 130)
    public final boolean method3705(int arg0, int arg1, int arg2) {
        try {
            field7054++;
            if (this.field7056 <= arg0 && this.field7053 >= arg0 && arg1 >= this.field7050 && this.field7059 >= arg1) {
                return true;
            } else if (arg0 >= this.field7049 && this.field7057 >= arg0 && arg1 >= this.field7051 && arg1 <= this.field7055) {
                return true;
            } else {
                int var4 = 12 % ((-arg2 - 47) / 47);
                return false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7060[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3706(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3707(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
