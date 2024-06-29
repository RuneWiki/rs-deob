import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class647 extends class173 {

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
    public static int field8260 = -1;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "Ljava/lang/String;")
    public String field8258;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "[C")
    public char[] field8255;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "[C")
    public char[] field8256;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "[I")
    public int[] field8254;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "[I")
    public int[] field8263;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "[[Luaa;")
    public static class391[][] field8259;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lmc;Z)V", line = 3)
    public final void method3492(class234 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field8264++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method3497(var3, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(CB)I", line = 25)
    public final int method3493(char arg0, byte arg1) {
        field8253++;
        if (this.field8263 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8263.length; var3++) {
            if (this.field8256[var3] == arg0) {
                return this.field8263[var3];
            }
        }
        return arg1 < 96 ? -127 : -1;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(CB)I", line = 52)
    public final int method3494(char arg0, byte arg1) {
        field8262++;
        if (this.field8254 == null) {
            return -1;
        } else if (arg1 == 8) {
            for (int var3 = 0; var3 < this.field8254.length; var3++) {
                if (this.field8255[var3] == arg0) {
                    return this.field8254[var3];
                }
            }
            return -1;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 85)
    public final void method3495(int arg0) {
        if (this.field8263 != null) {
            for (int var2 = 0; var2 < this.field8263.length; var2++) {
                this.field8263[var2] = class77.method473(this.field8263[var2], 32768);
            }
        }
        field8257++;
        if (this.field8254 != null) {
            for (int var3 = 0; var3 < this.field8254.length; var3++) {
                this.field8254[var3] = class77.method473(this.field8254[var3], 32768);
            }
        }
        if (arg0 < 1) {
            this.method3497(59, -82, null);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V", line = 116)
    public static void method3496(boolean arg0) {
        field8259 = null;
        if (arg0) {
            method3498((byte) 79);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILmc;)V", line = 128)
    private final void method3497(int arg0, int arg1, class234 arg2) {
        field8252++;
        if (arg0 == 1) {
            this.field8258 = arg2.method1540((byte) -104);
        } else if (arg0 == 2) {
            int var4 = arg2.method1509(true);
            this.field8255 = new char[var4];
            this.field8254 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8254[var5] = arg2.method1553((byte) 91);
                byte var6 = arg2.method1554(27806);
                this.field8255[var5] = var6 == 0 ? 0 : class752.method4080(var6, (byte) 83);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1509(true);
            this.field8256 = new char[var7];
            this.field8263 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8263[var8] = arg2.method1553((byte) 48);
                byte var9 = arg2.method1554(27806);
                this.field8256[var8] = var9 == 0 ? 0 : class752.method4080(var9, (byte) 102);
            }
        }
        if (arg1 != -1) {
            this.field8258 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lrha;", line = 192)
    public static final class614 method3498(byte arg0) {
        field8261++;
        class614 var1 = (class614) class401.field5305.method3855(arg0 - 30);
        if (var1 != null) {
            var1.method1946(-10364);
            var1.method1084((byte) -103);
            return var1;
        }
        if (arg0 != 30) {
            field8259 = null;
        }
        class614 var2;
        do {
            var2 = (class614) class41.field473.method3855(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method3281(21112) > class502.method2786(arg0 ^ 0xFFFFE428)) {
                return null;
            }
            var2.method1946(-10364);
            var2.method1084((byte) 100);
        } while ((Long.MIN_VALUE & var2.field2278) == 0L);
        return var2;
    }
}
