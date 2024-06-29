import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class762 extends class518 {

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    private int field10872 = 0;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    private int field10875 = 4096;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field10878 = new String[] { method5524(method5523(":3JW%")), method5524(method5523(":3JR%")), method5524(method5523("4sJ>p")), method5524(method5523(":3JS%")), method5524(method5523("!(\b|")) };

    @OriginalMember(owner = "client!un", name = "F", descriptor = "Lui;")
    public static class251 field10876 = new class251(64);

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field10877 = 0;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field10873;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field10874;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 3)
    public class762() {
        super(1, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V", line = 7)
    public static void method5522(boolean arg0) {
        try {
            if (arg0) {
                method5522(false);
            }
            field10876 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10878[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I", line = 18)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field10873;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -96 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(arg0, 0, (byte) 73);
                for (int var6 = 0; var6 < class110.field1436; ++var6) {
                    int var7 = var5[var6];
                    var3[var6] = ~this.field10872 >= ~var7 && ~this.field10875 <= ~var7 ? 4096 : 0;
                }
            }
            return var3;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10878[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjc;I)V", line = 56)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field10875 = arg1.method5116((byte) -121);
                }
            } else {
                this.field10872 = arg1.method5116((byte) -118);
            }
            ++field10874;
            if (arg2 != -3) {
                this.field10872 = 103;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10878[3] + arg0 + ',' + (arg1 != null ? field10878[2] : field10878[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5523(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!un", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5524(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
