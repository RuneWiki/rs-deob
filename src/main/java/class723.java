import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class723 {

    @OriginalMember(owner = "client!om", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10295 = new String[] { method5233(method5232("\u001bLh)s")), method5233(method5232("\u001bLh(s")), method5233(method5232("\u001bLh*s")) };

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
    public static boolean field10285 = false;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field10286 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field10292 = 0;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field10293 = 0;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field10290;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field10291;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field10294;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[Lrfa;")
    public static class202[] field10288;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static final void method5229(int arg0) {
        try {
            field10289++;
            if (!class119.field1512) {
                class403.method3165(true, class596.field8568);
                int var1 = -15 % ((55 - arg0) / 63);
                if (class105.field1377 != null) {
                    class403.method3165(true, class105.field1377);
                }
                class119.field1512 = true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10295[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public static void method5230(boolean arg0) {
        try {
            field10288 = null;
            if (arg0) {
                method5231(61);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10295[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static final void method5231(int arg0) {
        try {
            class97.method959(class543.field7943, ~arg0);
            field10287++;
            class41.field621++;
            if (class684.field9604 && class618.field8817) {
                int var1 = arg0;
                int var2 = 0;
                if (class212.field3119) {
                    var1 = class784.method5647((byte) 105);
                    var2 = class30.method328(-17233);
                }
                int var3 = var1 + class604.field8668.method2881((byte) 121);
                int var4 = var2 + class604.field8668.method2879(-237);
                int var5 = var4 - class738.field10511;
                int var6 = var3 - class527.field7667;
                if (var6 < class565.field8250) {
                    var6 = class565.field8250;
                }
                if (var6 + class543.field7943.field11295 > class565.field8250 + class198.field2936.field11295) {
                    var6 = class565.field8250 + class198.field2936.field11295 - class543.field7943.field11295;
                }
                if (class741.field10535 > var5) {
                    var5 = class741.field10535;
                }
                if ((class741.field10535 + class198.field2936.field11244) < (class543.field7943.field11244 + var5)) {
                    var5 = class198.field2936.field11244 + class741.field10535 - class543.field7943.field11244;
                }
                int var7 = class198.field2936.field11252 + var6 - class565.field8250;
                int var8 = var5 + class198.field2936.field11262 - class741.field10535;
                if (class604.field8668.method5706(339)) {
                    if (class543.field7943.field11185 < class41.field621) {
                        int var9 = var6 - class701.field9807;
                        int var10 = var5 - class479.field7065;
                        if (class543.field7943.field11273 < var9 || var9 < (-class543.field7943.field11273) || class543.field7943.field11273 < var10 || -class543.field7943.field11273 > var10) {
                            class674.field9466 = true;
                        }
                    }
                    if (class543.field7943.field11287 != null && class674.field9466) {
                        class618 var11 = new class618();
                        var11.field8812 = class543.field7943.field11287;
                        var11.field8805 = class543.field7943;
                        var11.field8810 = var8;
                        var11.field8813 = var7;
                        class158.method1334(var11);
                        return;
                    }
                } else {
                    if (class674.field9466) {
                        class598.method4410((byte) 122);
                        if (class543.field7943.field11197 != null) {
                            class618 var12 = new class618();
                            var12.field8816 = class260.field3694;
                            var12.field8812 = class543.field7943.field11197;
                            var12.field8805 = class543.field7943;
                            var12.field8813 = var7;
                            var12.field8810 = var8;
                            class158.method1334(var12);
                        }
                        if (class260.field3694 != null && client.method4969(class543.field7943) != null) {
                            class671.method4830(class260.field3694, class543.field7943, 124);
                        }
                    } else if ((class753.field10766 == 1 || class592.method4373(true)) && class72.field1049 > 2) {
                        class628.method4608(class738.field10511 + class479.field7065, class701.field9807 + class527.field7667, arg0 + 14918);
                    } else if (class559.method4184(false)) {
                        class628.method4608(class738.field10511 + class479.field7065, class701.field9807 + class527.field7667, 14918);
                    }
                    class543.field7943 = null;
                }
            } else if (class41.field621 > 1) {
                class543.field7943 = null;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10295[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!om", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5232(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!om", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5233(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
