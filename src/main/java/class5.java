import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lol;")
    private class189 field84 = new class189();

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lju;")
    private class83 field94 = new class83();

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lmn;")
    private class249 field95;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Llf;")
    public static class160 field92 = new class160(1);

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field96 = 2;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method33(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method34((byte) -9, 78);
        }
        field88++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)I")
    public static final int method34(byte arg0, int arg1) {
        field83++;
        int var2 = -101 / ((48 - arg0) / 40);
        int var3 = arg1 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg1 & ~var8;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JILol;)V")
    public final void method35(long arg0, int arg1, class189 arg2) {
        field82++;
        if (~this.field90 == arg1) {
            class189 var5 = this.field94.method777((byte) -18);
            var5.method1676(true);
            var5.method1289((byte) 88);
            if (this.field84 == var5) {
                class189 var6 = this.field94.method777((byte) -18);
                var6.method1676(true);
                var6.method1289((byte) 110);
            }
        } else {
            this.field90--;
        }
        this.field95.method1618(arg2, arg0, -1);
        this.field94.method776(arg1 + 1, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        field89++;
        if (arg0) {
            this.field94.method783((byte) -104);
            this.field95.method1614((byte) -24);
            this.field84 = new class189();
            this.field90 = this.field91;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public static final void method37(boolean arg0) {
        class399 var1 = class262.field4002;
        synchronized (class262.field4002) {
            class262.field4002.method2477(58);
        }
        field86++;
        if (!arg0) {
            method39(-103, -2, -15);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JB)Lol;")
    public final class189 method38(long arg0, byte arg1) {
        if (arg1 != 41) {
            method40(85);
        }
        field87++;
        class189 var4 = (class189) this.field95.method1622(arg0, 26);
        if (var4 != null) {
            this.field94.method776(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
    public static final boolean method39(int arg0, int arg1, int arg2) {
        field93++;
        if (arg0 != 1447) {
            field97 = 4;
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method40(int arg0) {
        field92 = null;
        int var1 = -39 / ((33 - arg0) / 50);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method41(int arg0) {
        field85++;
        class335.field5062.method1862((byte) -115, class312.field4716.method2766((byte) 112));
        class335.field5062.method1862((byte) -115, class419.field6311.method2766((byte) 107));
        class335.field5062.method1862((byte) -115, class249.field3845.method2766((byte) 96));
        class335.field5062.method1862((byte) -115, class59.field1234.method2766((byte) 104));
        class335.field5062.method1862((byte) -115, class237.field3657.method2766((byte) 116));
        class335.field5062.method1862((byte) -115, class361.field5290.method2766((byte) 88));
        class335.field5062.method1862((byte) -115, class202.field3263.method2766((byte) 105));
        class335.field5062.method1862((byte) -115, class477.field7053.method2766((byte) 124));
        class335.field5062.method1862((byte) -115, class455.field6758.method2766((byte) 89));
        class335.field5062.method1862((byte) -115, class113.field2038.method2766((byte) 126));
        class335.field5062.method1862((byte) -115, class151.field2493.method2766((byte) 88));
        class335.field5062.method1862((byte) -115, class199.field3246.method2766((byte) 110));
        if (arg0 != -28513) {
            return;
        }
        class335.field5062.method1862((byte) -115, class510.field7434.method2766((byte) 125));
        class335.field5062.method1862((byte) -115, class483.field7117.method2766((byte) 117));
        class335.field5062.method1862((byte) -115, class219.field3448.method2766((byte) 121));
        class335.field5062.method1862((byte) -115, class388.field5702.method2766((byte) 90));
        class335.field5062.method1862((byte) -115, class444.field6595.method2766((byte) 126));
        class335.field5062.method1862((byte) -115, class374.field5483.method2766((byte) 85));
        class335.field5062.method1862((byte) -115, class324.field4929.method2766((byte) 119));
        class335.field5062.method1862((byte) -115, class127.field2169.method2766((byte) 84));
        class335.field5062.method1862((byte) -115, class100.field1927.method2766((byte) 123));
        class335.field5062.method1862((byte) -115, class454.field6753.method2766((byte) 106));
        class335.field5062.method1862((byte) -115, class230.field3570.method2766((byte) 88));
        class335.field5062.method1862((byte) -115, class449.field6678.method2766((byte) 92));
        class335.field5062.method1862((byte) -115, class199.field3243.method2766((byte) 88));
        class335.field5062.method1862((byte) -115, class267.field4056.method2766((byte) 103));
        class335.field5062.method1862((byte) -115, class534.field7760.method2766((byte) 126));
        class335.field5062.method1862((byte) -115, class192.field3103.method2766((byte) 94));
        class335.field5062.method1862((byte) -115, class58.field1222.method2766((byte) 98));
        class335.field5062.method1862((byte) -115, class41.field576.method2766((byte) 118));
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field90 = arg0;
        this.field91 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field95 = new class249(var2);
    }
}
