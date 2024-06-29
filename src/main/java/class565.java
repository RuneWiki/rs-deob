import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class565 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[S")
    public static short[] field8019 = new short[] { 46, 60, 6, 18, 59, 44, 22, 20 };

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lpca;")
    public static class714 field8027 = new class714(10);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lqfa;")
    public static class98 field8028 = new class98(66, 8);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field8018;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field8024;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Lsda;")
    public class257[] field8021;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLg;Lee;)Lsda;")
    private final class257 method3255(byte arg0, class153 arg1, class675 arg2) {
        field8020++;
        if (class509.field7293 == arg1) {
            return class571.method3281(arg2, (byte) 96);
        } else if (class59.field723 == arg1) {
            return class66.method547((byte) 48, arg2);
        } else if (class456.field6439 == arg1) {
            return class312.method2025((byte) 22, arg2);
        } else if (class516.field7358 == arg1) {
            return class24.method152((byte) -104, arg2);
        } else if (class626.field8698 == arg1) {
            return class531.method3096(false, arg2);
        } else {
            if (arg0 <= 69) {
                method3260(null, -41, 37);
            }
            if (class481.field6798 == arg1) {
                return class251.method1618(arg2, (byte) 120);
            } else if (class522.field7399 == arg1) {
                return class172.method1111(94, arg2);
            } else if (class252.field3689 == arg1) {
                return class401.method2507(arg2, true);
            } else if (class219.field2852 == arg1) {
                return class374.method2355(-1, arg2);
            } else if (class513.field7320 == arg1) {
                return class474.method2834(-68, arg2);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
    public static final void method3256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8022++;
        int var6 = arg3;
        if (arg0 >= -19) {
            method3260(null, 26, 86);
        }
        while (arg2 >= var6) {
            class643.method3557(arg1, class445.field6320[var6], (byte) 111, arg4, arg5);
            var6++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method3257(int arg0) {
        field8028 = null;
        field8027 = null;
        if (arg0 != 1) {
            method3260(null, 60, -8);
        }
        field8019 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Z")
    public static final boolean method3258(byte arg0, int arg1) {
        field8023++;
        if (arg0 >= -24) {
            return false;
        } else {
            return arg1 != 1 && arg1 != 7;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILee;)V")
    public final void method3259(int arg0, class675 arg1) {
        this.field8024 = arg1.method3756(false);
        field8025++;
        this.field8018 = arg1.method3757((byte) -65);
        this.field8021 = new class257[arg1.method3750((byte) 35)];
        class153[] var3 = class513.method3023((byte) 113);
        if (arg0 > -111) {
            this.field8021 = null;
        }
        for (int var4 = 0; var4 < this.field8021.length; var4++) {
            this.field8021[var4] = this.method3255((byte) 101, var3[arg1.method3750((byte) 35)], arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([Lkba;II)V")
    public static final void method3260(class105[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class105 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field1260;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field1260 > (var7 & 0x1) + var6) {
                class105 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3260(arg0, arg1, var4 - 1);
        method3260(arg0, var4 + 1, arg2);
    }
}
