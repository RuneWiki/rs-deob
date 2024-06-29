import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class69 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljn;")
    private class117 field1089 = new class117(64);

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lvo;")
    private class345 field1095;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lvh;")
    public static class125 field1087 = new class125(57, 5);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 3)
    public static void method565(byte arg0) {
        if (arg0 != 40) {
            field1093 = -68;
        }
        field1087 = null;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V", line = 14)
    public static final void method566(byte arg0) {
        field1094++;
        int var1 = 0;
        if (class525.field7713.method2485((byte) 88, class76.field1182)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class525.field7713.field5979) {
            var1 |= 0x40;
        }
        class642.method3613(var1, (byte) -65);
        class14.field224.method2835(-1, var1);
        class430.field6132.method49(var1, false);
        class564.field8259.method3741(var1, 1);
        class554.field8108.method595(var1, 28001);
        class243.method1569(-104, var1);
        int var6 = -78 % ((-arg0 - 56) / 38);
        class400.method2428(-17979, var1);
        class400.method2431(var1, (byte) 31);
        class196.method1386((byte) -105, var1);
        class387.method2368((byte) 37);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V", line = 51)
    public static final void method567(int arg0, int arg1, int arg2, int arg3) {
        field1092++;
        if (arg2 != -1536601784) {
            method566((byte) -1);
        }
        int var4 = class525.field7713.field5991 * arg1 >> 8;
        if (arg3 == -1 && !class369.field5120) {
            class679.method3845((byte) 87);
        } else if (arg3 != -1 && (class283.field3963 != arg3 || !class154.method1162((byte) 47)) && var4 != 0 && !class369.field5120) {
            class408.method2443(arg0, var4, arg3, 1, 0, class97.field1451, false);
            class468.method2768((byte) -110);
        }
        if (class283.field3963 != arg3) {
            class453.field6518 = null;
        }
        class283.field3963 = arg3;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V", line = 81)
    public final void method568(byte arg0) {
        class117 var2 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method950((byte) -127);
        }
        field1088++;
        if (arg0 != -101) {
            this.field1095 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V", line = 108)
    public final void method569(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1089 = null;
        }
        field1090++;
        class117 var3 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 123)
    public final void method570(int arg0) {
        class117 var2 = this.field1089;
        synchronized (this.field1089) {
            if (arg0 != -21500) {
                method565((byte) 125);
            }
            this.field1089.method936(arg0 ^ 0x53D1);
        }
        field1091++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lica;", line = 140)
    public final class301 method571(int arg0, int arg1) {
        field1086++;
        class117 var3 = this.field1089;
        class301 var4;
        synchronized (this.field1089) {
            var4 = (class301) this.field1089.method941((long) arg1, arg0 ^ 0x1F);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field1095;
        byte[] var6;
        synchronized (this.field1095) {
            var6 = this.field1095.method2081(-128, arg1, arg0);
        }
        class301 var7 = new class301();
        if (var6 != null) {
            var7.method1852((byte) 120, new class465(var6));
        }
        class117 var8 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 171)
    public class69(class529 arg0, int arg1, class345 arg2) {
        this.field1095 = arg2;
        this.field1095.method2098(0, 31);
    }
}
