import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class279 extends class80 {

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
    public static int[] field3950 = new int[13];

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Lqe;")
    public static class469 field3947 = new class469(31, -2);

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3948;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 3)
    public static void method1780(int arg0) {
        if (arg0 != 19855) {
            method1780(89);
        }
        field3948 = null;
        field3947 = null;
        field3950 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 15)
    public static final void method1781(boolean arg0, int arg1, String arg2) {
        field3951++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class31.field325.field3851 : class31.field325.field3846) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class554 var11 = class31.field325.method1720(var8, 1);
            if (var11.field7916 && var11.method3237((byte) 109).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class109.field1518 = -1;
                    class355.field5164 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class671.field9361 = 0;
        class109.field1518 = var5;
        class355.field5164 = var4;
        String[] var9 = new String[class109.field1518];
        for (int var10 = 0; var10 < class109.field1518; var10++) {
            var9[var10] = class31.field325.method1720(var4[var10], 1).method3237((byte) 109);
        }
        class237.method1574(var9, arg1 + 1, class355.field5164);
        if (arg1 != -2) {
            method1781(false, -125, null);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lio;", line = 88)
    public final class439 method69(byte arg0) {
        field3949++;
        int var2 = -84 % ((arg0 + 69) / 39);
        return class575.field8145;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(ILog;Lega;III)V", line = 100)
    public class279(int arg0, class651 arg1, class713 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3952 = arg5;
    }
}
