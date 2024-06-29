import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class548 implements class630 {

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lrq;")
    public class482 field7725;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field7732;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field7721;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
    public String field7724;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lvfa;")
    public class92 field7729;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field7720;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lmr;")
    public static class613 field7717;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[Lcw;")
    public static class21[] field7728;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 3)
    public static void method3272(byte arg0) {
        field7728 = null;
        if (arg0 < 79) {
            field7728 = null;
        }
        field7717 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Component;IILmr;I)Lhh;", line = 19)
    public static final class529 method3273(Component arg0, int arg1, int arg2, class613 arg3, int arg4) {
        field7730++;
        if (class757.field10509 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class529 var5 = (class529) Class.forName("gl").getDeclaredConstructor().newInstance();
                var5.field7407 = arg1;
                var5.field7387 = new int[(class379.field5336 ? 2 : 1) * 256];
                var5.method2400(arg0);
                var5.field7405 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field7405 > 16384) {
                    var5.field7405 = 16384;
                }
                var5.method2402(var5.field7405);
                if (class602.field8612 > 0 && class349.field4430 == null) {
                    class349.field4430 = new class179();
                    class349.field4430.field2530 = arg3;
                    arg3.method3580(class349.field4430, 110, class602.field8612);
                }
                if (class349.field4430 != null) {
                    if (class349.field4430.field2533[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class349.field4430.field2533[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class444 var6 = new class444(arg3, arg2);
                    var6.field7407 = arg1;
                    var6.field7387 = new int[(class379.field5336 ? 2 : 1) * 256];
                    var6.method2400(arg0);
                    var6.field7405 = 16384;
                    var6.method2402(var6.field7405);
                    if (class602.field8612 > 0 && class349.field4430 == null) {
                        class349.field4430 = new class179();
                        class349.field4430.field2530 = arg3;
                        arg3.method3580(class349.field4430, 118, class602.field8612);
                    }
                    if (arg4 >= -24) {
                        method3272((byte) -8);
                    }
                    if (class349.field4430 != null) {
                        if (class349.field4430.field2533[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class349.field4430.field2533[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class529();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Lag;", line = 112)
    public final class214 method210(int arg0) {
        if (arg0 == 7288) {
            field7726++;
            return class399.field5523;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;Lvfa;Lrq;IIIIIIIIII)V", line = 133)
    public class548(String arg0, class92 arg1, class482 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7725 = arg2;
        this.field7732 = arg5;
        this.field7721 = arg3;
        this.field7724 = arg0;
        this.field7723 = arg8;
        this.field7729 = arg1;
        this.field7731 = arg11;
        this.field7718 = arg9;
        this.field7720 = arg7;
        this.field7733 = arg10;
        this.field7727 = arg12;
        this.field7719 = arg6;
        this.field7722 = arg4;
    }
}
