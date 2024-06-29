import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class257 extends class389 {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Z")
    private boolean field3137 = false;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Z")
    public boolean field3136 = false;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field3141 = 0;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lgt;")
    private class454 field3139 = new class454();

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private int field3144 = 0;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lbq;")
    public class289 field3143 = new class289();

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field3146 = 0;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
    private boolean field3148 = false;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
    public boolean field3147 = false;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lpca;")
    public class713 field3145 = new class713();

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lfi;")
    public class554[] field3134 = new class554[8192];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[Z")
    private static boolean[] field3138 = new boolean[32];

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[Z")
    private static boolean[] field3142 = new boolean[8];

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "J")
    private long field3135;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
    private long field3140;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public final void method1529() {
        this.field3137 = true;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
    private final void method1530() {
        this.field3137 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
    private final void method1531(int arg0, boolean arg1) {
        class125.field1310.method2792((byte) -13, this);
        this.field3135 = arg0;
        this.field3140 = arg0;
        this.field3148 = true;
        this.field3147 = arg1;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V")
    public static void method1532() {
        field3138 = null;
        field3142 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;J[Lnda;[Loia;Z)V")
    public final void method1533(class58 arg0, long arg1, class555[] arg2, class88[] arg3, boolean arg4) {
        if (!this.field3136) {
            this.method1540(arg0, arg2, arg4);
            this.method1534(arg3, arg4);
            this.field3135 = arg1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([Loia;Z)V")
    private final void method1534(class88[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3142[var3] = false;
        }
        label76: for (class570 var4 = (class570) this.field3143.method1719(65280); var4 != null; var4 = (class570) this.field3143.method1723(-20665)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8089 || arg0[var7].field922 == var4.field8089) {
                        field3142[var7] = true;
                        var4.method3310(-21280);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method864(12983);
                this.field3146--;
                if (var4.method3565(118)) {
                    var4.method3562((byte) -47);
                    class623.field8920--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field3146 != 8; var5++) {
            if (!field3142[var5]) {
                class570 var6 = null;
                if (arg0[var5].method609(0).field453 == 1 && class623.field8920 < 32) {
                    var6 = new class570(arg0[var5], this);
                    class629.field9032.method1955((byte) 86, (long) arg0[var5].field924, var6);
                    class623.field8920++;
                }
                if (var6 == null) {
                    var6 = new class570(arg0[var5], this);
                }
                this.field3143.method1721((byte) -67, var6);
                this.field3146++;
                field3142[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
    public final void method1535() {
        this.field3136 = true;
        for (class570 var1 = (class570) this.field3143.method1719(65280); var1 != null; var1 = (class570) this.field3143.method1723(-20665)) {
            if (var1.field8092.field453 == 1) {
                var1.method3562((byte) -67);
            }
        }
        for (int var2 = 0; var2 < this.field3134.length; var2++) {
            if (this.field3134[var2] != null) {
                this.field3134[var2].method3245();
                this.field3134[var2] = null;
            }
        }
        this.field3141 = 0;
        this.field3139 = new class454();
        this.field3144 = 0;
        this.field3143 = new class289();
        this.field3146 = 0;
        this.method2401((byte) -57);
        class44.field497[class38.field431] = this;
        class38.field431 = class38.field431 + 1 & class20.field180[class518.field7364];
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V")
    public final void method1536(long arg0) {
        this.field3135 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method1537(class58 arg0, long arg1) {
        if (this.field3140 == this.field3135) {
            this.method1530();
        } else {
            this.method1529();
        }
        if (arg1 - this.field3135 > 750L) {
            this.method1535();
            return false;
        }
        int var4 = (int) (arg1 - this.field3140);
        if (this.field3148) {
            for (class119 var5 = (class119) this.field3139.method2790(124); var5 != null; var5 = (class119) this.field3139.method2794(120)) {
                for (int var6 = 0; var6 < var5.field1232.field1916; var6++) {
                    var5.method774(!this.field3137, 1, arg1, arg0, (byte) -128);
                }
            }
            this.field3148 = false;
        }
        for (class119 var7 = (class119) this.field3139.method2790(107); var7 != null; var7 = (class119) this.field3139.method2794(23)) {
            var7.method774(!this.field3137, var4, arg1, arg0, (byte) -125);
        }
        this.field3140 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()Lpca;")
    public final class713 method1538() {
        return this.field3145;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()Lpca;")
    public final class713 method1539() {
        this.field3145.field10032.method1072((byte) 82);
        for (int var1 = 0; var1 < this.field3134.length; var1++) {
            if (this.field3134[var1] != null && this.field3134[var1].field7934 != null) {
                this.field3145.field10032.method1076(this.field3134[var1], -26776);
            }
        }
        return this.field3145;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;[Lnda;Z)V")
    private final void method1540(class58 arg0, class555[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field3138[var4] = false;
        }
        label67: for (class119 var5 = (class119) this.field3139.method2790(107); var5 != null; var5 = (class119) this.field3139.method2794(89)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1231 || arg1[var8].field7943 == var5.field1231) {
                        field3138[var8] = true;
                        var5.method770(-102);
                        var5.field1224 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1225 == 0) {
                    var5.method2401((byte) -57);
                    this.field3144--;
                } else {
                    var5.field1224 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field3144 != 32; var6++) {
            if (!field3138[var6]) {
                class119 var7 = new class119(arg0, arg1[var6], this, this.field3135);
                this.field3139.method2792((byte) -13, var7);
                this.field3144++;
                field3138[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "()V")
    public final void method1541() {
        this.field3148 = true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public final void method1542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3149 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IZ)Lpd;")
    public static final class257 method1543(int arg0, boolean arg1) {
        if (class38.field431 == class323.field4127) {
            return new class257(arg0, arg1);
        } else {
            class257 var2 = class44.field497[class323.field4127];
            class323.field4127 = class323.field4127 + 1 & class20.field180[class518.field7364];
            var2.method1531(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;)V")
    public final void method1544(class58 arg0) {
        this.field3145.field10032.method1072((byte) 82);
        for (class119 var2 = (class119) this.field3139.method2790(122); var2 != null; var2 = (class119) this.field3139.method2794(69)) {
            var2.method775(arg0, 1430383297, this.field3140);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IZ)V")
    private class257(int arg0, boolean arg1) {
        this.method1531(arg0, arg1);
    }
}
