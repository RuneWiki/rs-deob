import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class77 {

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Lff;")
    private class9 field1113 = new class9(256);

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Lvh;")
    private class240 field1116;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1108 = 50;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "[I")
    public static int[] field1105 = new int[2048];

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
    public static int[] field1106 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "[I")
    public static int[] field1119 = new int[1];

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "[I")
    public static int[] field1115 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1104 = new String[field1108];

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "[I")
    public static int[] field1117 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "[I")
    public static int[] field1120 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "[I")
    public static int[] field1121 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "[I")
    public static int[] field1102 = new int[field1108];

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Luf;")
    public static class310 field1114 = new class310(16, 2);

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 8)
    public static void method566(byte arg0) {
        field1117 = null;
        int var1 = -1 % ((74 - arg0) / 51);
        field1115 = null;
        field1102 = null;
        field1105 = null;
        field1120 = null;
        field1114 = null;
        field1104 = null;
        field1119 = null;
        field1106 = null;
        field1121 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V", line = 28)
    public final void method567(int arg0, int arg1) {
        class9 var3 = this.field1113;
        synchronized (this.field1113) {
            if (arg0 != -1325) {
                method570(5, -121, -30, null);
            }
            this.field1113.method61((byte) -67, arg1);
        }
        field1109++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLkj;)[Lnq;", line = 46)
    public static final class319[] method568(boolean arg0, class397 arg1) {
        field1107++;
        if (!arg1.method2285((byte) -50)) {
            return new class319[0];
        }
        class409 var2 = arg1.method2291(false);
        while (var2.field5652 == 0) {
            class496.method2931((byte) 125, 10L);
        }
        if (var2.field5652 == 2) {
            return new class319[0];
        }
        if (!arg0) {
            field1102 = null;
        }
        int[] var3 = (int[]) var2.field5654;
        class319[] var4 = new class319[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class319 var6 = new class319();
            var4[var5] = var6;
            var6.field4405 = var3[var5 << 2];
            var6.field4407 = var3[(var5 << 2) + 1];
            var6.field4413 = var3[(var5 << 2) + 2];
            var6.field4416 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 92)
    public final void method569(int arg0) {
        field1112++;
        class9 var2 = this.field1113;
        synchronized (this.field1113) {
            this.field1113.method65(false);
            if (arg0 < 50) {
                field1104 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 144)
    public class77(class157 arg0, int arg1, class240 arg2) {
        this.field1116 = arg2;
        this.field1116.method1397((byte) -32, 26);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III[B)[B", line = 111)
    public static final byte[] method570(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -66 / (arg2 / 46);
        field1118++;
        byte[] var5 = new byte[arg1];
        class416.method2491(arg3, arg0, var5, 0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V", line = 128)
    public final void method571(boolean arg0) {
        class9 var2 = this.field1113;
        synchronized (this.field1113) {
            if (arg0) {
                return;
            }
            this.field1113.method67(-100);
        }
        field1111++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Lap;", line = 179)
    public final class332 method572(byte arg0, int arg1) {
        field1103++;
        class9 var3 = this.field1113;
        class332 var4;
        synchronized (this.field1113) {
            var4 = (class332) this.field1113.method56((long) arg1, 93);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 >= -6) {
            return null;
        } else {
            byte[] var5 = this.field1116.method1411(true, arg1, 26);
            class332 var6 = new class332();
            if (var5 != null) {
                var6.method1847(new class365(var5), (byte) 87);
            }
            class9 var7 = this.field1113;
            synchronized (this.field1113) {
                this.field1113.method73((long) arg1, var6, 26425);
                return var6;
            }
        }
    }
}
