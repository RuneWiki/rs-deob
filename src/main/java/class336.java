import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class336 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lfha;")
    private class378 field4677;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "J")
    public long field4675;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lqfa;")
    public static class98 field4676 = new class98(78, 11);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field4682 = 0;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4683 = 104;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lhaa;")
    public static class80 field4680;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Loia;")
    public static class88 field4684;

    @OriginalMember(owner = "client!rd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4679++;
        this.field4677.method2369(this.field4675, (byte) -111);
        super.finalize();
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lfha;J[Lpl;)V")
    public class336(class378 arg0, long arg1, class649[] arg2) {
        this.field4677 = arg0;
        this.field4675 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2182(int arg0, String arg1, String arg2, int arg3, String arg4, String arg5, int arg6) {
        field4685++;
        class172.method1107(arg1, arg6, arg3, true, null, -1, arg5, arg4, arg2);
        if (arg0 > -69) {
            method2183(-46);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method2183(int arg0) {
        field4676 = null;
        field4680 = null;
        field4684 = null;
        if (arg0 != 0) {
            field4683 = 93;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[Ljb;IIZI)V")
    public static final void method2184(byte arg0, class493[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4674++;
        if (arg0 >= -83) {
            field4684 = null;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class493 var7 = arg1[var6];
            if (var7 != null && var7.field7078 == arg3) {
                class661.method3627(var7, arg2, (byte) 126, arg5, arg4);
                class196.method1208(126, arg2, var7, arg5);
                if (var7.field7046 > var7.field7007 - var7.field7095) {
                    var7.field7046 = var7.field7007 - var7.field7095;
                }
                if ((var7.field6969 - var7.field7031) < var7.field7073) {
                    var7.field7073 = var7.field6969 - var7.field7031;
                }
                if (var7.field7046 < 0) {
                    var7.field7046 = 0;
                }
                if (var7.field7073 < 0) {
                    var7.field7073 = 0;
                }
                if (var7.field7016 == 0) {
                    class107.method765(arg4, true, var7);
                }
            }
        }
    }
}
