import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class316 extends class86 {

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    public int field4821 = -1;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public int field4817 = 0;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "Z")
    public boolean field4830 = true;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public int field4818 = -1;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public int field4819 = 0;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
    public int field4834 = 12800;

    @OriginalMember(owner = "client!rt", name = "T", descriptor = "I")
    public int field4837 = 12800;

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "Ljava/lang/String;")
    public String field4831;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "Ljava/lang/String;")
    public String field4823;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "Lvr;")
    public class306 field4835;

    @OriginalMember(owner = "client!rt", name = "V", descriptor = "[I")
    public static int[] field4839;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!rt", name = "U", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "Lbf;")
    public static class504 field4824;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "[Lf;")
    public static class191[] field4825;

    static {
        new class375("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        new class375("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field4839 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z", line = 12)
    public final boolean method2045(int arg0, int arg1, int arg2) {
        field4826++;
        for (class193 var4 = (class193) this.field4835.method1970(64); var4 != null; var4 = (class193) this.field4835.method1960(24)) {
            if (var4.method1361(0, arg2, arg0)) {
                return true;
            }
        }
        return arg1 != 12800;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)V", line = 36)
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= -101) {
            field4832++;
            if (class96.field1399.field5216 != 0 && arg0 != 0 && class240.field3386 < 50 && arg3 != -1) {
                class19.field284[class240.field3386++] = new class491((byte) 1, arg3, arg0, arg2, arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ltl;I)Lnr;", line = 53)
    public static final class16 method2047(class91 arg0, int arg1) {
        field4827++;
        if (arg1 > -68) {
            field4839 = null;
        }
        return new class16(arg0.method643((byte) 124), arg0.method643((byte) 109), arg0.method643((byte) 114), arg0.method643((byte) 123), arg0.method641(32455), arg0.method641(32455), arg0.method618((byte) 100));
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 240)
    public class316(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4818 = arg6;
        this.field4830 = arg5;
        this.field4831 = arg1;
        this.field4833 = arg0;
        this.field4836 = arg3;
        this.field4823 = arg2;
        this.field4821 = arg4;
        if (this.field4818 == 255) {
            this.field4818 = 0;
        }
        this.field4835 = new class306();
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V", line = 74)
    public final void method2048(int arg0) {
        field4828++;
        this.field4817 = 0;
        this.field4834 = 12800;
        this.field4819 = 0;
        this.field4837 = 12800;
        for (class193 var2 = (class193) this.field4835.method1970(64); var2 != null; var2 = (class193) this.field4835.method1960(24)) {
            if (var2.field2727 > this.field4819) {
                this.field4819 = var2.field2727;
            }
            if (var2.field2728 < this.field4837) {
                this.field4837 = var2.field2728;
            }
            if (var2.field2742 > this.field4817) {
                this.field4817 = var2.field2742;
            }
            if (this.field4834 > var2.field2726) {
                this.field4834 = var2.field2726;
            }
        }
        if (arg0 <= 83) {
            field4838 = 93;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III[I)Z", line = 114)
    public final boolean method2049(int arg0, int arg1, int arg2, int[] arg3) {
        field4820++;
        if (arg0 != 155) {
            this.method2051(121, -47, -10, -77, null);
        }
        for (class193 var5 = (class193) this.field4835.method1970(64); var5 != null; var5 = (class193) this.field4835.method1960(arg0 ^ 0x83)) {
            if (var5.method1361(0, arg2, arg1)) {
                var5.method1358(arg3, arg2, (byte) 4, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[IB)Z", line = 150)
    public final boolean method2050(int arg0, int arg1, int[] arg2, byte arg3) {
        field4822++;
        if (arg3 != -69) {
            field4824 = null;
        }
        for (class193 var5 = (class193) this.field4835.method1970(64); var5 != null; var5 = (class193) this.field4835.method1960(24)) {
            if (var5.method1362(arg0, 1, arg1)) {
                var5.method1363(arg1, arg0, arg2, 0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII[I)Z", line = 180)
    public final boolean method2051(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4829++;
        if (arg0 != 0) {
            method2052((byte) -26);
        }
        for (class193 var6 = (class193) this.field4835.method1970(64); var6 != null; var6 = (class193) this.field4835.method1960(24)) {
            if (var6.method1359(17747, arg1, arg2, arg3)) {
                var6.method1358(arg4, arg3, (byte) 122, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V", line = 205)
    public static void method2052(byte arg0) {
        field4839 = null;
        if (arg0 != 115) {
            method2052((byte) 111);
        }
        field4824 = null;
        field4825 = null;
    }
}
