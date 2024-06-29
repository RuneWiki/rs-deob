import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class543 implements class245 {

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public int field7939;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7944 = new String[] { method4100(method4099("Qu\u0004K@\u000f")), method4100(method4099("Qu\u0004KB\u000f")), method4100(method4099("Qu\u0004KD\u000f")), method4100(method4099("Qu\u0004KE\u000f")), method4100(method4099("Qu\u0004KC\u000f")), method4100(method4099("Qu\u0004K=Nz\f\u0011?\u000f")) };

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lvo;")
    public static class782 field7943 = null;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field7942;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZB)V", line = 3)
    public static final void method4095(boolean arg0, byte arg1) {
        try {
            if (arg1 < 65) {
                field7943 = null;
            }
            field7937++;
            if (class298.field4155 == null) {
                class353.method2821((byte) -62);
            }
            if (arg0) {
                class298.field4155.method2230(1);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7944[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I)V", line = 26)
    public class543(int arg0) {
        try {
            this.field7939 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7944[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Luu;", line = 34)
    public final class240 method482(int arg0) {
        try {
            if (arg0 != 0) {
                method4097((byte) -67, (char) 65460);
            }
            field7941++;
            return class679.field9540;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7944[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBIII)V", line = 45)
    public static final void method4096(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            class134.field1683 = arg0;
            class711.field10000 = arg3;
            if (arg1 != -1) {
                field7943 = null;
            }
            field7940++;
            class422.field6043 = arg2;
            class335.field4854 = arg4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7944[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BC)Z", line = 60)
    public static final boolean method4097(byte arg0, char arg1) {
        try {
            field7938++;
            if (Character.isISOControl(arg1)) {
                return false;
            } else if (class248.method2024(arg1, (byte) 49)) {
                return true;
            } else {
                char[] var2 = class740.field10524;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
                if (arg0 != -100) {
                    method4095(false, (byte) -92);
                }
                char[] var5 = class627.field8950;
                for (int var6 = 0; var6 < var5.length; var6++) {
                    char var7 = var5[var6];
                    if (arg1 == var7) {
                        return true;
                    }
                }
                return false;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field7944[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 108)
    public static void method4098(int arg0) {
        try {
            int var1 = -40 / ((arg0 + 5) / 59);
            field7943 = null;
            field7942 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7944[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4099(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4100(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
