import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class312 extends class78 {

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "[Lin;")
    public class153[] field4901;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "[I")
    public static int[] field4902 = new int[256];

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Lja;")
    public static class64 field4905;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V", line = 8)
    public static void method2152(int arg0) {
        field4902 = null;
        field4905 = null;
        int var1 = -61 / ((arg0 + 24) / 47);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V", line = 19)
    public static final void method2153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4907++;
        if (arg4 == arg5) {
            class159.method1189(arg1, arg2, arg0, arg4, (byte) -82);
            return;
        }
        if (class319.field4965 <= arg2 - arg4 && class116.field1888 >= (arg2 + arg4) && class188.field2995 <= arg1 - arg5 && class195.field3108 >= arg1 + arg5) {
            class124.method933(1, arg4, arg1, arg2, arg0, arg5);
        } else {
            class200.method1452(arg1, false, arg0, arg4, arg5, arg2);
        }
        if (arg3 != -28395) {
            method2152(23);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Z", line = 49)
    public final boolean method2154(int arg0, int arg1) {
        if (arg1 > -72) {
            field4900 = 81;
        }
        field4898++;
        return this.field4901[arg0].field2465;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lff;", line = 61)
    public static final class52 method2155(Throwable arg0, String arg1) {
        field4906++;
        class52 var2;
        if (arg0 instanceof class52) {
            var2 = (class52) arg0;
            var2.field819 = var2.field819 + ' ' + arg1;
        } else {
            var2 = new class52(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Z", line = 80)
    public final boolean method2156(int arg0, int arg1) {
        int var3 = 40 / ((arg1 - 76) / 37);
        field4899++;
        return this.field4901[arg0].field2457;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lja;Lja;IZ)V", line = 92)
    public class312(class64 arg0, class64 arg1, int arg2, boolean arg3) {
        class204 var5 = new class204();
        int var6 = arg0.method465(arg2, 0);
        this.field4901 = new class153[var6];
        int[] var7 = arg0.method477(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method467(var7[var8], 115, arg2);
            int var10 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            class2 var11 = null;
            for (class2 var12 = (class2) var5.method1490(200); var12 != null; var12 = (class2) var5.method1487((byte) 117)) {
                if (var12.field5 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method485(0, (byte) -122, var10);
                } else {
                    var13 = arg1.method485(var10, (byte) -128, 0);
                }
                var11 = new class2(var10, var13);
                var5.method1493(-99, var11);
            }
            this.field4901[var7[var8]] = new class153(var9, var11);
        }
    }
}
