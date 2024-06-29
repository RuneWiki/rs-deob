import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class244 {

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3649 = -1;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3655 = "Loading - please wait.";

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[Llm;")
    public static class55[] field3652 = new class55[50];

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Lwd;")
    public static class88 field3656;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3646;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1719(int arg0, int arg1, int arg2) {
        if (class31.field491 != arg1) {
            class251.field3705 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class251.field3705[var3] = (var3 << 12) / arg1;
            }
            class257.field3813 = arg1 - 1;
            class149.field2426 = arg1 * 32;
            class31.field491 = arg1;
        }
        field3648++;
        if (arg2 != 128) {
            method1721((class120) null, 15);
        }
        if (class164.field2670 == arg0) {
            return;
        }
        if (class31.field491 == arg0) {
            class264.field3901 = class251.field3705;
        } else {
            class264.field3901 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class264.field3901[var4] = (var4 << 12) / arg0;
            }
        }
        class175.field2801 = arg0 - 1;
        class164.field2670 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILaj;)Ljl;", line = 50)
    public static final class280 method1720(int arg0, class1 arg1) {
        field3650++;
        return arg0 == 1 ? new class280(arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method4(true), arg1.method15((byte) -97)) : (class280) null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lpk;I)V", line = 61)
    public static final void method1721(class120 arg0, int arg1) {
        class342.field5299 = arg0;
        field3647++;
        if (arg1 <= 8) {
            method1722((String) null, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 74)
    public static final void method1722(String arg0, byte arg1) {
        field3653++;
        if (arg1 >= -34) {
            field3657 = 82;
        }
        System.out.println("Error: " + class213.method1544("%0a", 45, "\n", arg0));
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 87)
    public static final int method1723(String arg0, int arg1, char arg2) {
        field3651++;
        int var3 = arg0.length();
        if (arg1 >= -79) {
            field3655 = (String) null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 134)
    public static void method1724(boolean arg0) {
        if (!arg0) {
            field3657 = -39;
        }
        field3655 = null;
        field3646 = null;
        field3656 = null;
        field3652 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public static final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class47 var7 = new class47();
        var7.field718 = arg1 / 128;
        var7.field721 = arg2 / 128;
        var7.field732 = arg3 / 128;
        var7.field715 = arg4 / 128;
        var7.field730 = arg0;
        var7.field713 = arg1;
        var7.field717 = arg2;
        var7.field723 = arg3;
        var7.field735 = arg4;
        var7.field724 = arg5;
        var7.field728 = arg6;
        class118.field1909[class55.field844++] = var7;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
    public abstract int method1667(int arg0);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1668(Component arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1669(int arg0, Component arg1);
}
