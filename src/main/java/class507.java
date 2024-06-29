import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class507 {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public int field7215 = 1;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field7209 = 100;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lmga;")
    public static class738 field7214 = new class738();

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "C")
    public char field7211;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field7210;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 10)
    public static void method3038(int arg0) {
        field7214 = null;
        if (arg0 != 11029) {
            method3038(-74);
        }
        field7210 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILes;)V", line = 23)
    private final void method3039(int arg0, int arg1, class403 arg2) {
        field7217++;
        if (arg0 <= 25) {
            this.method3039(54, 83, null);
        }
        if (arg1 == 1) {
            this.field7211 = class625.method3550(arg2.method2392(-35), (byte) 117);
        } else if (arg1 == 2) {
            this.field7215 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Les;I)V", line = 52)
    public final void method3040(class403 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field7216++;
        while (true) {
            int var3 = arg0.method2396((byte) -81);
            if (var3 == 0) {
                return;
            }
            this.method3039(arg1 + 113, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 75)
    public static final void method3041(int arg0) {
        field7212++;
        class573 var1 = null;
        if (arg0 < 2) {
            method3038(-113);
        }
        try {
            class561 var2 = class521.field7389.method3792(true, false, "2");
            while (var2.field7769 == 0) {
                class594.method3405(1L, 16711680);
            }
            if (var2.field7769 == 1) {
                var1 = (class573) var2.field7768;
                byte[] var3 = new byte[(int) var1.method3321(30971)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3322(var4, var3.length - var4, var3, -11433);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class648.method3655(new class403(var3), false);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3319(126);
            }
        } catch (Exception var6) {
        }
    }
}
