import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class354 extends class299 {

    @OriginalMember(owner = "client!on", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5709 = new String[] { method2938(method2937("+C]\u0019-")), method2938(method2937("+C]\u001c-")), method2938(method2937("+C]\u001d-")), method2938(method2937("+C]\u001b-")), method2938(method2937("+C]\u001e-")), method2938(method2937("+C]\u001f-")), method2938(method2937("+C]\u001a-")) };

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lbea;")
    public static class233 field5706;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field5703;
            if (!arg1) {
                super.field4849 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5709[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILes;)V", line = 15)
    public class354(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I", line = 19)
    public final int method852(int arg0, int arg1) {
        try {
            ++field5705;
            if (arg0 != 1) {
                this.method2936(-117);
            }
            return !class752.method5455(124, super.field4850.field6379.method4132(true)) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5709[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Les;)V", line = 34)
    public class354(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I", line = 37)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                field5706 = null;
            }
            ++field5704;
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5709[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 48)
    public final void method848(int arg0) {
        try {
            if (arg0 != -20456) {
                field5706 = null;
            }
            ++field5708;
            if (super.field4850.field6379.method4133(true) && !class752.method5455(arg0 + 20580, super.field4850.field6379.method4132(true))) {
                super.field4849 = 0;
            }
            if (super.field4849 < 0 || ~super.field4849 < -2) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5709[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 64)
    public static void method2934(int arg0) {
        try {
            int var1 = -91 / ((17 - arg0) / 51);
            field5706 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5709[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)I", line = 74)
    public final int method2935(boolean arg0) {
        try {
            ++field5707;
            if (!arg0) {
                this.method848(123);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5709[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Z", line = 89)
    public final boolean method2936(int arg0) {
        try {
            ++field5702;
            if (!class752.method5455(arg0 + 122, super.field4850.field6379.method4132(true))) {
                return false;
            } else {
                if (arg0 != 3) {
                    this.method852(-83, -117);
                }
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5709[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2937(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!on", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2938(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
