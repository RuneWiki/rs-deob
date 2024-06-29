import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class50 extends class199 {

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lica;")
    public class579 field532;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field531 = -1;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lea;")
    public static class474 field536 = new class474("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lqf;")
    public static class593 field537;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 3)
    public static final void method278(byte arg0, String arg1, int arg2) {
        field533++;
        int var3 = class88.field1018;
        int var4 = 116 / ((15 - arg0) / 35);
        int[] var5 = class457.field6839;
        boolean var6 = false;
        for (int var7 = 0; var7 < var3; var7++) {
            class655 var8 = class142.field1749[var5[var7]];
            if (var8 != null && class439.field6548 != var8 && var8.field9452 != null && var8.field9452.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class308.method2044(class280.field3913, -7434);
                    class119.field1497++;
                    class468.field6960.method1229(var5[var7], 30364);
                    class468.field6960.method1231((byte) -93, 0);
                } else if (arg2 == 4) {
                    class510.field7465++;
                    class308.method2044(class70.field750, -7434);
                    class468.field6960.method1216(var5[var7], -13119);
                    class468.field6960.method1202((byte) 84, 0);
                } else if (arg2 == 5) {
                    class172.field2113++;
                    class308.method2044(class141.field1744, -7434);
                    class468.field6960.method1235(var5[var7], (byte) 11);
                    class468.field6960.method1222(0, true);
                } else if (arg2 == 6) {
                    class93.field1097++;
                    class308.method2044(class445.field6663, -7434);
                    class468.field6960.method1229(var5[var7], 30364);
                    class468.field6960.method1231((byte) -93, 0);
                } else if (arg2 == 7) {
                    class528.field7645++;
                    class308.method2044(class247.field3504, -7434);
                    class468.field6960.method1229(var5[var7], 30364);
                    class468.field6960.method1205((byte) -69, 0);
                }
                var6 = true;
                break;
            }
        }
        if (!var6) {
            class163.method945(true, class332.field4778.method2902(class35.field396, -20139) + arg1, 4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ltu;II[B)V", line = 90)
    public class50(class294 arg0, int arg1, int arg2, byte[] arg3) {
        this.field532 = arg0.method1948(class562.field8019, arg3, arg2, arg1, false, true);
        this.field532.method476(false, false, (byte) 122);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ltu;II[I)V", line = 105)
    public class50(class294 arg0, int arg1, int arg2, int[] arg3) {
        this.field532 = arg0.method1947(123, arg3, false, arg1, arg2);
        this.field532.method476(false, false, (byte) 124);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIFFF)F", line = 118)
    public static final float method279(int arg0, int arg1, float arg2, float arg3, float arg4) {
        field535++;
        float[] var5 = class607.field8871[arg0];
        if (arg1 != 0) {
            method280((byte) -100);
        }
        return var5[2] * arg4 + var5[0] * arg3 + var5[1] * arg2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 132)
    public static void method280(byte arg0) {
        field536 = null;
        int var1 = 26 % ((arg0 - 91) / 33);
        field537 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V", line = 146)
    public static final void method281(byte arg0) {
        field534++;
        if (class375.field5714 != null) {
            return;
        }
        Container var1;
        if (class114.field1430 != null) {
            var1 = class114.field1430;
        } else if (class635.field9135 == null) {
            var1 = class385.field5811;
        } else {
            var1 = class635.field9135;
        }
        class477.field7037 = var1.getSize().width;
        class434.field6446 = var1.getSize().height;
        if (class114.field1430 == var1) {
            Insets var2 = class114.field1430.getInsets();
            class477.field7037 -= var2.right + var2.left;
            class434.field6446 -= var2.top + var2.bottom;
        }
        if (arg0 >= -12) {
            method281((byte) -99);
        }
        if (class562.method3250(-32068) == 1) {
            class59.field674 = 0;
            class298.field4407 = class629.field9079;
            class324.field4678 = (class477.field7037 - class492.field7169) / 2;
            class581.field8366 = class492.field7169;
        } else {
            class23.method146(1024);
        }
        if (class646.field9321 != class197.field2667) {
            boolean var10000;
            if (class581.field8366 < 1024 && class298.field4407 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class30.field348.setSize(class581.field8366, class298.field4407);
        if (class413.field6264 != null) {
            class413.field6264.method347(class30.field348);
        }
        if (class114.field1430 == var1) {
            Insets var3 = class114.field1430.getInsets();
            class30.field348.setLocation(class324.field4678 + var3.left, class59.field674 + var3.top);
        } else {
            class30.field348.setLocation(class324.field4678, class59.field674);
        }
        if (class518.field7542 != -1) {
            class599.method3480(-108, true);
        }
        class112.method692(-17);
    }
}
