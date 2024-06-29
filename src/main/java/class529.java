import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class529 {

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "Ljr;")
    private class112 field7310 = new class112(128);

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Lin;")
    private class91 field7308;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)Lnd;", line = 7)
    public final class544 method3056(boolean arg0, int arg1) {
        field7307++;
        class112 var3 = this.field7310;
        class544 var4;
        synchronized (this.field7310) {
            var4 = (class544) this.field7310.method992((long) arg1, 111);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7308.method863(-1860, class629.method3596(-107, arg1), class498.method2941(arg1, arg0));
        class544 var6 = new class544();
        if (var5 != null) {
            var6.method3142(0, new class215(var5));
        }
        class112 var7 = this.field7310;
        synchronized (this.field7310) {
            this.field7310.method991(var6, (long) arg1, (byte) -102);
            return var6;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V", line = 33)
    public static final void method3057(int arg0, int arg1) {
        if (arg0 == class693.field9368.field4450.method3809(-32350)) {
            arg1 = -1;
        }
        field7306++;
        if (class716.field9753 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class260 var2 = class212.field3015.method4038((byte) -104, arg1);
            class267 var3 = var2.method1751((byte) 71);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class689.field9299.method1212(var3.method1781(), var3.method1775(), 17, new Point(var2.field3723, var2.field3730), class458.field6458, var3.method1769());
                class716.field9753 = arg1;
            }
        }
        if (arg1 == -1 && class716.field9753 != -1) {
            class689.field9299.method1212(-1, null, arg0 + 17, new Point(), class458.field6458, -1);
            class716.field9753 = -1;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II[BIII)V", line = 69)
    public static final void method3058(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field7311++;
        if (arg1 >= arg5) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg5 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                if (arg4 != 1354705384) {
                    return;
                }
                int var8 = arg5 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 124)
    public class529(class460 arg0, int arg1, class91 arg2) {
        this.field7308 = arg2;
        if (this.field7308 != null) {
            int var4 = this.field7308.method867(-1) - 1;
            this.field7308.method860(0, var4);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)I", line = 108)
    public static final int method3059(int arg0, byte arg1) {
        field7309++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 == 108) {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 34;
        }
    }
}
