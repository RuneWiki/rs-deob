import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Z")
    public static boolean field489 = true;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    public static int[] field493 = new int[25];

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ljm;")
    public static class485 field491 = new class485(51, -1);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field498 = new String[100];

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lbj;")
    public static class159 field499 = new class159(16);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lrs;")
    public static class462 field500;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I")
    public static final int method220(int arg0) {
        field490++;
        try {
            if (class527.field7736 == 0) {
                if (class66.field915 > class333.method1850(-3562) - 5000L) {
                    return 0;
                }
                class67.field957 = class282.field3804.method2281(true, class414.field6081, class36.field503);
                class497.field7316 = class333.method1850(-3562);
                class527.field7736 = 1;
            }
            if (class333.method1850(-3562) > class497.field7316 + 30000L) {
                return class7.method38(1000, arg0 - 25352);
            }
            if (class527.field7736 == 1) {
                if (class67.field957.field5652 == 2) {
                    return class7.method38(1001, -25350);
                }
                if (class67.field957.field5652 != 1) {
                    return -1;
                }
                class117.field1578 = new class95((Socket) class67.field957.field5654, class282.field3804);
                class67.field957 = null;
                int var1 = 0;
                if (class510.field7494) {
                    var1 = class344.field4738;
                }
                class244.field3395.field5069 = 0;
                class244.field3395.method2084(class255.field3547.field3043, false);
                class244.field3395.method2074(false, var1);
                class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                class362.method2026(-2757);
                int var2 = class117.field1578.method650((byte) -70);
                class362.method2026(-2757);
                if (var2 != 0) {
                    return class7.method38(var2, -25350);
                }
                class527.field7736 = 2;
            }
            if (class527.field7736 == arg0) {
                if (class117.field1578.method645((byte) -120) < 2) {
                    return -1;
                }
                class356.field4866 = class117.field1578.method650((byte) -122);
                class356.field4866 <<= 0x8;
                class356.field4866 += class117.field1578.method650((byte) -124);
                class527.field7736 = 3;
                class152.field2136 = 0;
                class284.field3817 = new byte[class356.field4866];
            }
            if (class527.field7736 != 3) {
                return -1;
            }
            int var3 = class117.field1578.method645((byte) -111);
            if (var3 < 1) {
                return -1;
            }
            if ((class356.field4866 - class152.field2136) < var3) {
                var3 = class356.field4866 - class152.field2136;
            }
            class117.field1578.method649(var3, false, class152.field2136, class284.field3817);
            class152.field2136 += var3;
            if (class152.field2136 < class356.field4866) {
                return -1;
            } else if (class20.method144(22461, class284.field3817)) {
                class1.field10 = new class320[class91.field1227];
                int var4 = 0;
                for (int var5 = class407.field5643; var5 <= class14.field171; var5++) {
                    class320 var6 = class210.method1272(var5, (byte) -26);
                    if (var6 != null) {
                        class1.field10[var4++] = var6;
                    }
                }
                class97.field1337 = 0;
                class367.field5150 = null;
                class117.field1578.method644(-120);
                class284.field3817 = null;
                class493.field7285 = 0;
                class527.field7736 = 0;
                class117.field1578 = null;
                class66.field915 = class333.method1850(arg0 - 3564);
                return 0;
            } else {
                return class7.method38(1002, -25350);
            }
        } catch (IOException var7) {
            return class7.method38(1003, arg0 ^ 0xFFFF9CF8);
        }
    }

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method221(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method223(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class378 method224(int arg0, int arg1, class378 arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method225(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method226(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method227(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method229(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method230(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method232(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lpe;[I)V")
    public abstract void method233(class432 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field500 = null;
        field491 = null;
        field498 = null;
        if (arg0 != -96) {
            method220(85);
        }
        field499 = null;
        field493 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field492++;
        }
        this.field495 = arg0;
        this.field497 = arg1;
        this.field494 = 0x1 << this.field492;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method235();
}
