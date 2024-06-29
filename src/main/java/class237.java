import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class237 {

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1647(int arg0, int arg1) {
        field3444++;
        String var2 = Integer.toString(arg1);
        if (arg0 >= -109) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class497.field6924.method2936(class607.field8336, 544) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class497.field6926.method2936(class607.field8336, 544) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method1648(int arg0, byte[] arg1) {
        field3441++;
        if (arg1.length == 100 && class314.field4354 < 1000) {
            class477.field6659[class314.field4354++] = arg1;
            return;
        }
        if (arg0 != 0) {
            method1650(-119, -101);
        }
        if (arg1.length == 5000 && class438.field6250 < 250) {
            class405.field5944[class438.field6250++] = arg1;
        } else if (arg1.length == 30000 && class498.field6956 < 50) {
            class492.field6816[class498.field6956++] = arg1;
        } else if (class525.field7270 != null) {
            for (int var2 = 0; var2 < class275.field3869.length; var2++) {
                if (class275.field3869[var2] == arg1.length && class525.field7270[var2].length > class387.field5621[var2]) {
                    class525.field7270[var2][class387.field5621[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -29494) {
            field3446 = 32;
        }
        if (class693.field9368.field4469.method820(-32350) != 0 && arg0 != 0 && class649.field8920 < 50 && arg5 != -1) {
            class429.field6148[class649.field8920++] = new class456((byte) 1, arg5, arg0, arg2, arg3, arg1, arg4, null);
        }
        field3440++;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method1650(int arg0, int arg1) {
        field3443++;
        if (arg0 == 100 && class314.field4354 > 0) {
            byte[] var2 = class477.field6659[--class314.field4354];
            class477.field6659[class314.field4354] = null;
            return var2;
        } else if (arg0 == 5000 && class438.field6250 > 0) {
            byte[] var3 = class405.field5944[--class438.field6250];
            class405.field5944[class438.field6250] = null;
            return var3;
        } else {
            if (arg1 != -1) {
                method1650(-88, -45);
            }
            if (arg0 == 30000 && class498.field6956 > 0) {
                byte[] var4 = class492.field6816[--class498.field6956];
                class492.field6816[class498.field6956] = null;
                return var4;
            }
            if (class525.field7270 != null) {
                for (int var5 = 0; var5 < class275.field3869.length; var5++) {
                    if (class275.field3869[var5] == arg0 && class387.field5621[var5] > 0) {
                        byte[] var6 = class525.field7270[var5][--class387.field5621[var5]];
                        class525.field7270[var5][class387.field5621[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }
}
