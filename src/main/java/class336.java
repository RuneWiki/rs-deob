import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class336 {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Ltf;")
    private class524 field4860;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4871 = new String[] { method2706(method2705("kQ9G*")), method2706(method2705("kQ9F*")), method2706(method2705("mS{o")), method2706(method2705("x\b9-\u007f")), method2706(method2705("kQ9A*")), method2706(method2705("kQ9E*")), method2706(method2705("kQ9K*")), method2706(method2705("kQ9B*")), method2706(method2705("kQ9?kmOc=*")), method2706(method2705("kQ9@*")), method2706(method2705("kQ9D*")) };

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "[I")
    public static int[] field4867 = new int[200];

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4865 = new Hashtable();

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field4869 = 1;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "Lhj;")
    public static class671 field4868 = new class671(2, 4, 4, 0);

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "Lwb;")
    private class578 field4863;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "[Llq;")
    public static class728[] field4870;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method2697(int arg0) {
        try {
            field4867 = null;
            field4865 = null;
            field4870 = null;
            field4868 = null;
            if (arg0 != 28802) {
                method2702(-117, 112, -4, (byte) -2, 106, -9, -122);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4871[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILtf;)V")
    public final void method2698(int arg0, class524 arg1) {
        try {
            field4864++;
            this.field4860 = arg1;
            if (arg0 != 19770) {
                this.method2704(88);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4871[1] + arg0 + ',' + (arg1 == null ? field4871[2] : field4871[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2699(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            if (class451.field6612.field9106.method2498(3) != 0 && arg4 != 0 && class347.field5048 < 50 && arg1 != -1) {
                class759.field10834[class347.field5048++] = new class441((byte) 1, arg1, arg4, arg3, arg2, 0, arg0, null);
            }
            if (!arg5) {
                field4865 = null;
            }
            field4857++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4871[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field4861++;
            int var6 = arg4;
            if (arg0 != 14300) {
                return false;
            }
            while (arg2 >= var6) {
                for (int var7 = arg5; var7 <= arg3; var7++) {
                    if (class613.field8771[var6][var7] == arg1 && class674.field9463[var6][var7] <= 1) {
                        return true;
                    }
                }
                var6++;
            }
            return false;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4871[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
    public static final boolean method2701(int arg0, int arg1) {
        try {
            if (arg1 < 93) {
                return true;
            } else {
                field4858++;
                return arg0 >= 12 && arg0 <= 17;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4871[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
    public class336() {
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2702(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        try {
            field4859++;
            int var7 = arg0 - arg1;
            int var8 = arg1 + arg2;
            for (int var9 = arg2; var9 < var8; var9++) {
                class576.method4282(-7, arg6, arg4, class529.field7682[var9], arg5);
            }
            int var10 = arg5 - arg1;
            for (int var11 = arg0; var11 > var7; var11--) {
                class576.method4282(-7, arg6, arg4, class529.field7682[var11], arg5);
            }
            int var12 = arg1 + arg6;
            if (arg3 >= -81) {
                method2697(122);
            }
            for (int var13 = var8; var13 <= var7; var13++) {
                int[] var14 = class529.field7682[var13];
                class576.method4282(-7, arg6, arg4, var14, var12);
                class576.method4282(-7, var10, arg4, var14, arg5);
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field4871[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Lwb;")
    public final class578 method2703(byte arg0) {
        try {
            if (arg0 != 32) {
                return null;
            }
            field4862++;
            class578 var2 = this.field4860.field7630.field8373;
            if (this.field4860.field7630 == var2) {
                this.field4863 = null;
                return null;
            } else {
                this.field4863 = var2.field8373;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4871[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Ltf;)V")
    public class336(class524 arg0) {
        try {
            this.field4860 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4871[8] + (arg0 == null ? field4871[2] : field4871[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)Lwb;")
    public final class578 method2704(int arg0) {
        try {
            field4866++;
            class578 var2 = this.field4863;
            if (this.field4860.field7630 == var2) {
                this.field4863 = null;
                return null;
            }
            if (arg0 != 0) {
                this.method2703((byte) 100);
            }
            this.field4863 = var2.field8373;
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4871[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2705(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2706(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
