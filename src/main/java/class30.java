import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 {

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "Lpca;")
    private class714 field407 = new class714(64);

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "Lfp;")
    private class323 field401;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "[Lhd;")
    public static class740[] field399 = new class740[1024];

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "Lbw;")
    public static class687 field404;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iha", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field410;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lav;Z)V")
    public static final void method173(class639 arg0, boolean arg1) {
        field402++;
        if (!arg1 || class553.field7776 == null) {
            return;
        }
        class706 var2 = null;
        if (arg0.field8781 == 0) {
            var2 = (class706) class252.method1672(arg0.field8787, arg0.field8774, arg0.field8773);
        }
        if (arg0.field8781 == 1) {
            var2 = (class706) class258.method1696(arg0.field8787, arg0.field8774, arg0.field8773);
        }
        if (arg0.field8781 == 2) {
            var2 = (class706) class243.method1557(arg0.field8787, arg0.field8774, arg0.field8773, field410 == null ? (field410 = method181("ip")) : field410);
        }
        if (arg0.field8781 == 3) {
            var2 = (class706) class434.method2639(arg0.field8787, arg0.field8774, arg0.field8773);
        }
        if (var2 == null) {
            arg0.field8779 = -1;
            arg0.field8775 = 0;
            arg0.field8782 = 0;
        } else {
            arg0.field8779 = var2.method861((byte) -17);
            arg0.field8782 = var2.method868((byte) -10);
            arg0.field8775 = var2.method865(30374);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IB)V")
    public final void method174(int arg0, byte arg1) {
        class714 var3 = this.field407;
        synchronized (this.field407) {
            this.field407.method4016(arg0, (byte) -73);
            if (arg1 != 17) {
                this.field401 = null;
            }
        }
        field409++;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(IB)Lcm;")
    public final class728 method175(int arg0, byte arg1) {
        field400++;
        class714 var3 = this.field407;
        class728 var4;
        synchronized (this.field407) {
            var4 = (class728) this.field407.method4022((long) arg0, (byte) -112);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field401;
        byte[] var6;
        synchronized (this.field401) {
            var6 = this.field401.method2100(class470.method2807(37, arg0), (byte) 112, class380.method2418(arg0, true));
        }
        int var7 = 113 / ((74 - arg1) / 39);
        class728 var8 = new class728();
        if (var6 != null) {
            var8.method4092(new class675(var6), 22071);
        }
        class714 var9 = this.field407;
        synchronized (this.field407) {
            this.field407.method4018((byte) 124, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public final void method176(int arg0) {
        field406++;
        class714 var2 = this.field407;
        synchronized (this.field407) {
            if (arg0 <= -29) {
                this.field407.method4023((byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
    public static void method177(int arg0) {
        if (arg0 != -1) {
            field399 = null;
        }
        field399 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V")
    public final void method178(int arg0) {
        class714 var2 = this.field407;
        synchronized (this.field407) {
            this.field407.method4024(arg0 ^ arg0);
        }
        field405++;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
    public final void method179(int arg0, int arg1) {
        field403++;
        if (arg0 != -1) {
            field404 = null;
        }
        class714 var3 = this.field407;
        synchronized (this.field407) {
            this.field407.method4023((byte) 7);
            this.field407 = new class714(arg1);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILee;)V")
    public static final void method180(int arg0, class675 arg1) {
        if (arg0 < 56) {
            method173(null, false);
        }
        field408++;
        if (arg1.field9154.length - arg1.field9146 < 1) {
            return;
        }
        int var2 = arg1.method3750((byte) 35);
        if (var2 < 0 || var2 > 1 || arg1.field9154.length - arg1.field9146 < 2) {
            return;
        }
        int var3 = arg1.method3757((byte) -65);
        if (var3 * 6 > arg1.field9154.length - arg1.field9146) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method3757((byte) -65);
            int var6 = arg1.method3703(122);
            if (var5 < class718.field9975.length && class538.field7548[var5] && (class563.field7895.method2641(var5, false).field6424 != '1' || var6 >= -1 && var6 <= 1)) {
                class718.field9975[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class30(class326 arg0, int arg1, class323 arg2) {
        this.field401 = arg2;
        if (this.field401 != null) {
            int var4 = this.field401.method2098((byte) 20) - 1;
            this.field401.method2084(var4, 0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method181(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
