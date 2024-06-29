import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class685 extends class45 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field9691;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field9690;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field9685 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[I")
    public static int[] field9687 = new int[1000];

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[[[I")
    public static int[][][] field9689;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)[Llg;", line = 7)
    public static final class32[] method3878(boolean arg0) {
        if (arg0) {
            field9686++;
            return new class32[] { class210.field2802, class27.field382, class150.field2063, class26.field340, class361.field4782, class513.field7144, client.field9622, class596.field8213, class271.field3537, class81.field944, class115.field1479, class689.field9734, class253.field3317, class537.field7369 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;Lgba;II)Lhq;", line = 18)
    public static final class552 method3879(int arg0, Component arg1, class388 arg2, int arg3, int arg4) {
        field9688++;
        if (class169.field2422 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class552 var5 = (class552) Class.forName("hw").getDeclaredConstructor().newInstance();
                var5.field7528 = new int[(class59.field747 ? 2 : 1) * 256];
                var5.field7546 = arg3;
                var5.method2926(arg1);
                var5.field7554 = (arg3 & 0xFFFFFC00) - arg4;
                if (var5.field7554 > 16384) {
                    var5.field7554 = 16384;
                }
                var5.method2923(var5.field7554);
                if (class108.field1275 > 0 && class159.field2299 == null) {
                    class159.field2299 = new class372();
                    class159.field2299.field4952 = arg2;
                    arg2.method2220(class159.field2299, class108.field1275, (byte) 100);
                }
                if (class159.field2299 != null) {
                    if (class159.field2299.field4948[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class159.field2299.field4948[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class539 var6 = new class539(arg2, arg0);
                    var6.field7546 = arg3;
                    var6.field7528 = new int[(class59.field747 ? 2 : 1) * 256];
                    var6.method2926(arg1);
                    var6.field7554 = 16384;
                    var6.method2923(var6.field7554);
                    if (class108.field1275 > 0 && class159.field2299 == null) {
                        class159.field2299 = new class372();
                        class159.field2299.field4952 = arg2;
                        arg2.method2220(class159.field2299, class108.field1275, (byte) 64);
                    }
                    if (class159.field2299 != null) {
                        if (class159.field2299.field4948[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class159.field2299.field4948[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class552();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 101)
    public static void method3880(int arg0) {
        if (arg0 == 256) {
            field9689 = null;
            field9687 = null;
            field9685 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V", line = 120)
    public class685(int arg0, int arg1) {
        this.field9691 = arg1;
        this.field9690 = arg0;
    }
}
