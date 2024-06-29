import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class226 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lei;")
    public class62 field3881 = new class62();

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Leg;")
    public static class37 field3878 = class174.method1167("Ablegen", 116);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[Lnk;")
    public static class280[] field3877 = new class280[50];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lei;")
    private class62 field3891;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3880;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IJZII)Leg;")
    public static final class37 method1565(int arg0, long arg1, boolean arg2, int arg3, int arg4) {
        field3887++;
        class37 var6 = class235.method1612(0, false);
        if (arg1 < 0L) {
            var6.method238(class23.field296, (byte) -75);
            arg1 = -arg1;
        }
        class37 var7 = class107.field1673;
        class37 var8 = class143.field2434;
        if (arg0 == 1) {
            var7 = class143.field2434;
            var8 = class107.field1673;
        }
        if (arg0 == 2) {
            var7 = class39.field631;
            var8 = class107.field1673;
        }
        if (arg0 == 3) {
            var8 = class107.field1673;
            var7 = class143.field2434;
        }
        class37 var9 = class235.method1612(0, false);
        if (arg4 != -27888) {
            method1571((byte) -51);
        }
        class37 var10 = class235.method1612(0, false);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method238(class163.method1096((int) (arg1 % 10L), (byte) -35), (byte) -80);
            arg1 /= 10L;
        }
        int var12 = 0;
        if (arg1 == 0L) {
            var9 = class127.field2132;
        }
        while (arg1 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method238(var7, (byte) -119);
            }
            var12++;
            var9.method238(class163.method1096((int) (arg1 % 10L), (byte) -35), (byte) -101);
            arg1 /= 10L;
        }
        if (var10.method222((byte) 116) > 0) {
            var10.method238(var8, (byte) -121);
        }
        return class156.method1061((byte) 33, new class37[] { var6, var9.method253(-1), var10.method253(-1) });
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lei;")
    public final class62 method1566(int arg0) {
        field3888++;
        if (arg0 != -3) {
            return null;
        }
        class62 var2 = this.field3881.field1013;
        if (this.field3881 == var2) {
            this.field3891 = null;
            return null;
        } else {
            this.field3891 = var2.field1013;
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILei;)V")
    public final void method1567(int arg0, class62 arg1) {
        if (arg1.field1026 != null) {
            arg1.method441(16773377);
        }
        arg1.field1026 = this.field3881;
        arg1.field1013 = this.field3881.field1013;
        if (arg0 != 0) {
            method1575(-57, true);
        }
        field3885++;
        arg1.field1026.field1013 = arg1;
        arg1.field1013.field1026 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Lei;")
    public final class62 method1568(int arg0) {
        field3875++;
        if (arg0 != -1) {
            this.field3881 = null;
        }
        class62 var2 = this.field3891;
        if (this.field3881 == var2) {
            this.field3891 = null;
            return null;
        } else {
            this.field3891 = var2.field1026;
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lei;")
    public final class62 method1569(byte arg0) {
        field3879++;
        if (arg0 != -9) {
            this.method1566(20);
        }
        class62 var2 = this.field3881.field1013;
        if (this.field3881 == var2) {
            return null;
        } else {
            var2.method441(16773377);
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lei;")
    public final class62 method1570(int arg0) {
        field3886++;
        if (arg0 != 3) {
            field3878 = null;
        }
        class62 var2 = this.field3891;
        if (this.field3881 == var2) {
            this.field3891 = null;
            return null;
        } else {
            this.field3891 = var2.field1013;
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3880 = null;
        field3877 = null;
        if (arg0 < 53) {
            field3877 = null;
        }
        field3878 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Lei;")
    public final class62 method1572(byte arg0) {
        field3889++;
        class62 var2 = this.field3881.field1026;
        if (arg0 < 5) {
            this.field3881 = null;
        }
        if (this.field3881 == var2) {
            this.field3891 = null;
            return null;
        } else {
            this.field3891 = var2.field1026;
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public final void method1573(int arg0) {
        while (true) {
            class62 var2 = this.field3881.field1013;
            if (this.field3881 == var2) {
                field3882++;
                if (arg0 <= 56) {
                    return;
                }
                this.field3891 = null;
                return;
            }
            var2.method441(16773377);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lei;I)V")
    public final void method1574(class62 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field3890++;
        if (arg0.field1026 != null) {
            arg0.method441(16773377);
        }
        arg0.field1026 = this.field3881.field1026;
        arg0.field1013 = this.field3881;
        arg0.field1026.field1013 = arg0;
        arg0.field1013.field1026 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
    public static final void method1575(int arg0, boolean arg1) {
        class154.field2600 = arg1;
        class239.field4261 = !class72.method492(-2001);
        if (arg0 > -110) {
            field3880 = null;
        }
        field3883++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)I")
    public static final int method1576(boolean arg0, int arg1) {
        long var2 = class149.method1024(-14898);
        if (arg1 != -30550) {
            field3880 = null;
        }
        field3884++;
        for (class240 var4 = arg0 ? (class240) class84.field1327.method993(arg1 + 15228) : (class240) class84.field1327.method988(4586); var4 != null; var4 = (class240) class84.field1327.method988(4586)) {
            if (var2 > (var4.field4267 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4267 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1027;
                    class153.field2571[var5] = class52.field806[var5];
                    var4.method441(16773377);
                    return var5;
                }
                var4.method441(arg1 ^ 0xFF0079AB);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class226() {
        this.field3881.field1013 = this.field3881;
        this.field3881.field1026 = this.field3881;
    }
}
