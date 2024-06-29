import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class514 {

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Z")
    public boolean field7060 = false;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Laf;")
    private class39 field7051 = new class39(64);

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Laf;")
    public class39 field7064 = new class39(500);

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Laf;")
    public class39 field7065 = new class39(30);

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Laf;")
    public class39 field7066 = new class39(50);

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lae;")
    private class283 field7054;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Z")
    public boolean field7045;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lae;")
    public class283 field7059;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Z")
    public static boolean field7056 = false;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "F")
    public static float field7053 = 1024.0F;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lqk;")
    public static class1 field7057 = new class1(90, -1);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field7067;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lnf;")
    public static class136 field7050;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[B")
    public static byte[] field7063;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZ)V", line = 5)
    public final void method3058(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field7064 = null;
        }
        field7055++;
        if (this.field7060 != arg0) {
            this.field7060 = arg0;
            this.method3059((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 21)
    public final void method3059(byte arg0) {
        class39 var2 = this.field7051;
        synchronized (this.field7051) {
            this.field7051.method314(-2);
        }
        field7061++;
        class39 var3 = this.field7064;
        synchronized (this.field7064) {
            if (arg0 >= -39) {
                return;
            }
            this.field7064.method314(-2);
        }
        class39 var4 = this.field7065;
        synchronized (this.field7065) {
            this.field7065.method314(-2);
        }
        class39 var5 = this.field7066;
        synchronized (this.field7066) {
            this.field7066.method314(-2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V", line = 53)
    public final void method3060(boolean arg0, int arg1) {
        field7049++;
        this.field7067 = arg1;
        class39 var3 = this.field7064;
        synchronized (this.field7064) {
            if (!arg0) {
                return;
            }
            this.field7064.method314(-2);
        }
        class39 var4 = this.field7065;
        synchronized (this.field7065) {
            this.field7065.method314(-2);
        }
        class39 var5 = this.field7066;
        synchronized (this.field7066) {
            this.field7066.method314(-2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 75)
    public final void method3061(int arg0, int arg1) {
        field7058++;
        class39 var3 = this.field7051;
        synchronized (this.field7051) {
            this.field7051.method308(arg1, arg0);
        }
        class39 var4 = this.field7064;
        synchronized (this.field7064) {
            this.field7064.method308(-1, arg0);
        }
        class39 var5 = this.field7065;
        synchronized (this.field7065) {
            this.field7065.method308(arg1, arg0);
        }
        class39 var6 = this.field7066;
        synchronized (this.field7066) {
            this.field7066.method308(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLsha;I)V", line = 95)
    public static final void method3062(int arg0, byte arg1, class115 arg2, int arg3) {
        field7044++;
        if (class773.field10644) {
            class771 var4 = class358.field5156 == -1 ? null : class734.field10126.method709((byte) 121, class358.field5156);
            if (client.method779(arg2).method1114(false) && (class774.field10657 & 0x20) != 0 && (var4 == null || arg2.method841(var4.field10602, class358.field5156, 2) != var4.field10602)) {
                class86.method647((long) (arg2.field1482 << 0 | arg2.field1446), class56.field656, arg2.field1446, false, 0L, class523.field7205 + " -> " + arg2.field1504, 22, class50.field602, arg2.field1458, 92, true, arg2.field1482, false);
                class545.field7580++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class188.method1175(arg2, -1, var5);
            if (var9 != null) {
                class148.field1933++;
                class86.method647((long) (arg2.field1446 | arg2.field1482 << 0), var9, arg2.field1446, false, (long) (var5 + 1), arg2.field1504, 1008, class725.method4036(-1, var5, arg2), arg2.field1458, 69, true, arg2.field1482, false);
            }
        }
        String var6 = class548.method3244(arg2, 11969);
        if (var6 != null) {
            class86.method647((long) (arg2.field1482 << 0 | arg2.field1446), var6, arg2.field1446, false, 0L, arg2.field1504, 57, arg2.field1413, arg2.field1458, 100, true, arg2.field1482, false);
            class237.field3568++;
        }
        if (arg1 >= -11) {
            method3066(-6, 14);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class188.method1175(arg2, -1, var7);
            if (var8 != null) {
                class86.method647((long) (arg2.field1446 | arg2.field1482 << 0), var8, arg2.field1446, false, (long) (var7 + 1), arg2.field1504, 20, class725.method4036(-1, var7, arg2), arg2.field1458, 55, true, arg2.field1482, false);
                class148.field1933++;
            }
        }
        if (!client.method779(arg2).method1116(-18824)) {
            return;
        }
        class357.field5145++;
        if (arg2.field1528 == null) {
            class86.method647((long) (arg2.field1482 << 0 | arg2.field1446), class712.field9863.method3999(class553.field7667, (byte) -39), arg2.field1446, false, 0L, "", 11, -1, arg2.field1458, 62, true, arg2.field1482, false);
        } else {
            class86.method647((long) (arg2.field1446 | arg2.field1482 << 0), arg2.field1528, arg2.field1446, false, 0L, "", 11, -1, arg2.field1458, 76, true, arg2.field1482, false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 170)
    public final void method3063(int arg0) {
        field7047++;
        class39 var2 = this.field7051;
        synchronized (this.field7051) {
            this.field7051.method319(-85);
        }
        class39 var3 = this.field7064;
        synchronized (this.field7064) {
            this.field7064.method319(-79);
        }
        class39 var4 = this.field7065;
        synchronized (this.field7065) {
            if (arg0 != -12087) {
                this.field7051 = null;
            }
            this.field7065.method319(-97);
        }
        class39 var5 = this.field7066;
        synchronized (this.field7066) {
            this.field7066.method319(-117);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZB)V", line = 194)
    public final void method3064(boolean arg0, byte arg1) {
        field7062++;
        if (arg0 != this.field7045) {
            this.field7045 = arg0;
            this.method3059((byte) -55);
            int var3 = 87 % ((arg1 + 32) / 38);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lro;", line = 209)
    public final class286 method3065(int arg0, int arg1) {
        field7052++;
        class39 var3 = this.field7051;
        class286 var4;
        synchronized (this.field7051) {
            var4 = (class286) this.field7051.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field7054;
        byte[] var6;
        synchronized (this.field7054) {
            var6 = this.field7054.method1849(class562.method3327(arg1, 255), (byte) -113, class253.method1694(-1, arg1));
        }
        class286 var7 = new class286();
        var7.field4124 = arg1;
        var7.field4193 = this;
        if (var6 != null) {
            var7.method1899((byte) 119, new class511(var6));
        }
        var7.method1887(104);
        if (!this.field7045 && var7.field4195) {
            var7.field4174 = null;
            var7.field4181 = null;
        }
        if (var7.field4150) {
            var7.field4178 = false;
            var7.field4138 = 0;
        }
        class39 var8 = this.field7051;
        synchronized (this.field7051) {
            int var9 = 43 / ((arg0 + 57) / 61);
            this.field7051.method305(var7, (long) arg1, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Z", line = 257)
    public static final boolean method3066(int arg0, int arg1) {
        if (arg1 == -4) {
            field7046++;
            return arg0 == 2 || arg0 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 268)
    public final void method3067(int arg0, byte arg1) {
        this.field7051 = new class39(arg0);
        if (arg1 >= 92) {
            field7048++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljk;IZLae;Lae;)V", line = 325)
    public class514(class788 arg0, int arg1, boolean arg2, class283 arg3, class283 arg4) {
        this.field7054 = arg3;
        this.field7045 = arg2;
        this.field7059 = arg4;
        if (this.field7054 != null) {
            int var6 = this.field7054.method1866((byte) 98) - 1;
            this.field7054.method1867(var6, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 294)
    public static void method3068(int arg0) {
        field7063 = null;
        field7050 = null;
        field7057 = null;
        if (arg0 != 1008) {
            field7057 = null;
        }
    }
}
