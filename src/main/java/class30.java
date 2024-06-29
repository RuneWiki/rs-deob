import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class30 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Ldaa;")
    public class454 field332 = new class454();

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lin;")
    public static class380 field327 = new class380(59, 0);

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lin;")
    public static class380 field335 = new class380(21, 28);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Ldaa;")
    private class454 field333;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lrt;")
    public static class470 field322;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lgga;")
    public static class513 field334;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Ldaa;", line = 5)
    public final class454 method247(int arg0) {
        field323++;
        if (arg0 != -32331) {
            method251(true, null);
        }
        class454 var2 = this.field332.field6213;
        if (this.field332 == var2) {
            return null;
        } else {
            var2.method2665(24902);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLdaa;)V", line = 26)
    public final void method248(byte arg0, class454 arg1) {
        if (arg1.field6211 != null) {
            arg1.method2665(24902);
        }
        field325++;
        arg1.field6211 = this.field332.field6211;
        arg1.field6213 = this.field332;
        arg1.field6211.field6213 = arg1;
        if (arg0 <= 42) {
            this.field332 = null;
        }
        arg1.field6213.field6211 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Ldaa;", line = 44)
    public final class454 method249(int arg0) {
        if (arg0 != 18371) {
            field334 = null;
        }
        field330++;
        class454 var2 = this.field332.field6213;
        if (this.field332 == var2) {
            this.field333 = null;
            return null;
        } else {
            this.field333 = var2.field6213;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 65)
    public static void method250(int arg0) {
        field335 = null;
        field322 = null;
        field327 = null;
        if (arg0 != 0) {
            field334 = null;
        }
        field334 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 86)
    public static final void method251(boolean arg0, String arg1) {
        field328++;
        if (class334.field4738 == null) {
            class58.method618(true);
        }
        class24.field269.setTime(new Date(class337.method2062(arg0)));
        int var2 = class24.field269.get(11);
        int var3 = class24.field269.get(12);
        int var4 = class24.field269.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class544.method3151((byte) 123, '\n', arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class442.field6126; var8 > 0; var8--) {
                class334.field4738[var8] = class334.field4738[var8 - 1];
            }
            class334.field4738[0] = var5 + ": " + var6[var7];
            if (class263.field3723 != null) {
                try {
                    class263.field3723.write(class98.method813(class334.field4738[0] + "\n", -16332));
                } catch (IOException var9) {
                }
            }
            if (class442.field6126 < class334.field4738.length - 1) {
                if (class719.field10037 > 0) {
                    class719.field10037++;
                }
                class442.field6126++;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I", line = 146)
    public final int method252(boolean arg0) {
        if (arg0) {
            field322 = null;
        }
        field324++;
        int var2 = 0;
        class454 var3 = this.field332.field6213;
        while (this.field332 != var3) {
            var3 = var3.field6213;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 173)
    public final void method253(byte arg0) {
        if (arg0 != -18) {
            this.method253((byte) -71);
        }
        field321++;
        while (true) {
            class454 var2 = this.field332.field6213;
            if (this.field332 == var2) {
                this.field333 = null;
                return;
            }
            var2.method2665(arg0 ^ 0xFFFF9EA8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Ldaa;", line = 197)
    public final class454 method254(byte arg0) {
        if (arg0 != -64) {
            return null;
        }
        field326++;
        class454 var2 = this.field333;
        if (this.field332 == var2) {
            this.field333 = null;
            return null;
        } else {
            this.field333 = var2.field6213;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BB)Z", line = 218)
    public static final boolean method255(byte arg0, byte arg1) {
        if (arg1 > -24) {
            field335 = null;
        }
        field329++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class183.field2787[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 245)
    public class30() {
        this.field332.field6213 = this.field332;
        this.field332.field6211 = this.field332;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILfja;)V", line = 258)
    public static final void method256(int arg0, class202 arg1) {
        if (arg1.field2996 != null) {
            arg1.field2996.field8287 = 0;
        }
        arg1.field2995 = false;
        field331++;
        if (arg0 != 0) {
            field335 = null;
        }
        for (class202 var2 = arg1.method1423(); var2 != null; var2 = arg1.method1420()) {
            method256(0, var2);
        }
    }
}
