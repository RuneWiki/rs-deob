import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class546 {

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lh;")
    private class571 field7563 = new class571(64);

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "Lan;")
    private class21 field7569;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[[I")
    public static int[][] field7558 = new int[128][128];

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "[I")
    public static int[] field7565 = new int[2];

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7570 = 1406;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIZII)Lan;")
    public static final class21 method3112(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7559++;
        if (arg1 != 1000000) {
            method3117(-14, 69, 118);
        }
        class219 var5 = null;
        if (class401.field5722 != null) {
            var5 = new class219(arg4, class401.field5722, class43.field814[arg4], 1000000);
        }
        class223.field3188[arg4] = class555.field7656.method2391(var5, false, arg4, class516.field7250);
        if (arg2) {
            class223.field3188[arg4].method1719(0);
        }
        return new class21(class223.field3188[arg4], arg0, arg3);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public final void method3113(int arg0) {
        if (arg0 != 128) {
            field7565 = null;
        }
        field7564++;
        class571 var2 = this.field7563;
        synchronized (this.field7563) {
            this.field7563.method3246(false);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
    public final void method3114(int arg0, int arg1) {
        field7568++;
        int var3 = -16 % ((arg1 - 41) / 36);
        class571 var4 = this.field7563;
        synchronized (this.field7563) {
            this.field7563.method3253(arg0, -126);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Lnc;")
    public final class22 method3115(int arg0, int arg1) {
        field7562++;
        class571 var3 = this.field7563;
        class22 var4;
        synchronized (this.field7563) {
            var4 = (class22) this.field7563.method3252((long) arg1, (byte) 88);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 128) {
            method3116(-101, 107, (byte) 53);
        }
        class21 var5 = this.field7569;
        byte[] var6;
        synchronized (this.field7569) {
            var6 = this.field7569.method240(11, arg1, (byte) -124);
        }
        class22 var7 = new class22();
        if (var6 != null) {
            var7.method253(new class11(var6), true);
        }
        class571 var8 = this.field7563;
        synchronized (this.field7563) {
            this.field7563.method3243(var7, (long) arg1, 111);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3116(int arg0, int arg1, byte arg2) {
        field7566++;
        if (arg2 < 7) {
            method3117(88, 72, 40);
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V")
    public static final void method3117(int arg0, int arg1, int arg2) {
        field7560++;
        class314 var3 = class483.method2819(14, arg0, 21303);
        var3.method1959(19793);
        var3.field4227 = arg2;
        if (arg1 != -1) {
            method3116(-97, 113, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public final void method3118(byte arg0) {
        field7567++;
        class571 var2 = this.field7563;
        synchronized (this.field7563) {
            if (arg0 != 50) {
                field7558 = null;
            }
            this.field7563.method3248(0);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V")
    public static void method3119(byte arg0) {
        field7558 = null;
        int var1 = -80 / ((arg0 + 22) / 39);
        field7565 = null;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class546(class111 arg0, int arg1, class21 arg2) {
        this.field7569 = arg2;
        if (this.field7569 != null) {
            this.field7569.method231(11, -117);
        }
    }
}
