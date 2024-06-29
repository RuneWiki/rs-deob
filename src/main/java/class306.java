import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class306 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Ltq;")
    private class536 field3846 = new class536(64);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lwm;")
    private class30 field3848;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ltq;")
    public static class536 field3845 = new class536(64);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ldl;")
    public static class725 field3851;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Llca;", line = 4)
    public final class57 method1804(int arg0, int arg1) {
        field3847++;
        if (arg0 != -6396) {
            this.field3846 = null;
        }
        class536 var3 = this.field3846;
        class57 var4;
        synchronized (this.field3846) {
            var4 = (class57) this.field3846.method2931((long) arg1, (byte) -113);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field3848;
        byte[] var6;
        synchronized (this.field3848) {
            var6 = this.field3848.method139(35, (byte) -94, arg1);
        }
        class57 var7 = new class57();
        if (var6 != null) {
            var7.method344(new class234(var6), (byte) -51);
        }
        var7.method349(arg0 ^ 0xFFFFE76A);
        class536 var8 = this.field3846;
        synchronized (this.field3846) {
            this.field3846.method2918((long) arg1, var7, 126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V", line = 37)
    public final void method1805(int arg0, int arg1) {
        field3852++;
        class536 var3 = this.field3846;
        synchronized (this.field3846) {
            this.field3846.method2928(true, arg1);
        }
        if (arg0 != -19424) {
            this.method1805(53, -77);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 50)
    public static void method1806(byte arg0) {
        field3851 = null;
        field3845 = null;
        if (arg0 <= 34) {
            method1806((byte) -56);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 67)
    public final void method1807(int arg0) {
        if (arg0 != -23924) {
            return;
        }
        field3850++;
        class536 var2 = this.field3846;
        synchronized (this.field3846) {
            this.field3846.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1808(int arg0) {
        if (arg0 <= 20) {
            field3851 = null;
        }
        class403.field5363 = new class661();
        field3844++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 95)
    public static final void method1809(String arg0, int arg1) {
        field3853++;
        if (!class47.field549 || (class610.field7710 & 0x18) == 0) {
            return;
        }
        if (arg1 != 35) {
            method1808(101);
        }
        boolean var2 = false;
        int var3 = class20.field189;
        int[] var4 = class503.field6451;
        for (int var5 = 0; var5 < var3; var5++) {
            class33 var6 = class263.field3508[var4[var5]];
            if (var6.field375 != null && var6.field375.equalsIgnoreCase(arg0) && (class422.field5564 == var6 && (class610.field7710 & 0x10) != 0 || var6 != null && (class610.field7710 & 0x8) != 0)) {
                class148.field1886++;
                class13 var7 = class659.method3587(class68.field909, 98, class491.field6311);
                var7.field130.method1521(var4[var5], true);
                var7.field130.method1502(class777.field10600, 65280);
                var7.field130.method1496(class170.field2260, (byte) -126);
                var7.field130.method1543(0, 79);
                var7.field130.method1502(class358.field4377, arg1 + 65245);
                class116.method679(var7, 0);
                var2 = true;
                class11.method48(-88, var6.field4758[0], 0, var6.field4767[0], var6.method190((byte) 91), -2, 0, var6.method190((byte) 124), true);
                break;
            }
        }
        if (!var2) {
            class648.method3504(arg1 - 150, 4, class659.field8565.method3589(class496.field6338, arg1 ^ 0xFFFFA8A6) + arg0);
        }
        if (class47.field549) {
            class38.method230((byte) 72);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 149)
    public final void method1810(byte arg0) {
        field3849++;
        class536 var2 = this.field3846;
        synchronized (this.field3846) {
            this.field3846.method2919(0);
            int var3 = -114 / ((-arg0 - 27) / 62);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 168)
    public class306(class473 arg0, int arg1, class30 arg2) {
        this.field3848 = arg2;
        if (this.field3848 != null) {
            this.field3848.method138(0, 35);
        }
    }
}
