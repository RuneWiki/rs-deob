import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class561 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ljo;")
    public static class353 field7973 = new class353(16);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljo;")
    public static class353 field7977 = new class353(8);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "J")
    public static long field7978 = -1L;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field7979 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method3312(byte arg0) {
        field7977 = null;
        field7973 = null;
        if (arg0 >= -33) {
            field7978 = 53L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method3313(boolean arg0) {
        if (!arg0) {
            field7979 = -116;
        }
        field7975++;
        class565.field8020 = 0;
        class262.field3842 = new class481[50];
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)Lgn;")
    public static final class729 method3314(byte arg0) {
        field7972++;
        class23 var1 = null;
        class729 var2 = new class729(class60.field734, 0);
        try {
            class141 var3 = class519.field7328.method2839(true, "", 0);
            while (var3.field2089 == 0) {
                class107.method828(1L, (byte) 69);
            }
            if (var3.field2089 == 1) {
                var1 = (class23) var3.field2092;
                byte[] var4 = new byte[(int) var1.method235((byte) 80)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method229(var4, (byte) -88, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class729(new class494(var4), class60.field734, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 != -25) {
                field7977 = null;
            }
            if (var1 != null) {
                var1.method230((byte) 127);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method3315(int arg0) {
        class263.field3855.method1519(64);
        field7971++;
        for (int var1 = 0; var1 < 32; var1++) {
            class454.field6360[var1] = 0L;
        }
        if (arg0 != -15168) {
            field7979 = 52;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class740.field10199[var2] = 0L;
        }
        class485.field6821 = 0;
    }
}
