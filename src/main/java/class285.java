import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class285 {

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Ljv;")
    private class55 field4066 = new class55(128);

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "Ljv;")
    public class55 field4070 = new class55(64);

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lbu;")
    public class17 field4059;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lbu;")
    private class17 field4058;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lbu;")
    public static class17 field4069;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 4)
    public final void method1810(int arg0) {
        class55 var2 = this.field4066;
        synchronized (this.field4066) {
            if (arg0 < 116) {
                return;
            }
            this.field4066.method488(-3);
        }
        field4061++;
        class55 var3 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method488(-3);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)I", line = 20)
    public static final int method1811(byte arg0) {
        int var1 = 34 % ((79 - arg0) / 46);
        field4060++;
        class55 var2 = class175.field2676;
        synchronized (class175.field2676) {
            return class175.field2676.method495(0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Lgj;", line = 33)
    public final class447 method1812(byte arg0, int arg1) {
        field4065++;
        class55 var3 = this.field4066;
        class447 var4;
        synchronized (this.field4066) {
            var4 = (class447) this.field4066.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4058.method114(arg1, 36, arg0 ^ 0xFFFFFFCF);
        class447 var6 = new class447();
        var6.field6696 = arg1;
        var6.field6690 = this;
        if (arg0 != 28) {
            this.method1815((byte) -40);
        }
        if (var5 != null) {
            var6.method2673(true, new class145(var5));
        }
        var6.method2671((byte) -57);
        class55 var7 = this.field4066;
        synchronized (this.field4066) {
            this.field4066.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BII)V", line = 65)
    public final void method1813(byte arg0, int arg1, int arg2) {
        this.field4066 = new class55(arg2);
        if (arg0 != -118) {
            this.field4059 = null;
        }
        field4062++;
        this.field4070 = new class55(arg1);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIBI)V", line = 83)
    public static final void method1814(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4063++;
        if (arg5 <= 26) {
            return;
        }
        int var7 = arg3 + arg4;
        int var8 = arg6 - arg3;
        for (int var9 = arg4; var9 < var7; var9++) {
            class179.method1269(class21.field430[var9], arg1, arg2, arg0, 26985);
        }
        int var10 = arg0 - arg3;
        int var11 = arg2 + arg3;
        for (int var12 = arg6; var12 > var8; var12--) {
            class179.method1269(class21.field430[var12], arg1, arg2, arg0, 26985);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class21.field430[var13];
            class179.method1269(var14, arg1, arg2, var11, 26985);
            class179.method1269(var14, arg1, var10, arg0, 26985);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V", line = 127)
    public final void method1815(byte arg0) {
        class55 var2 = this.field4066;
        synchronized (this.field4066) {
            this.field4066.method484(115);
            if (arg0 >= -107) {
                field4068 = 45;
            }
        }
        field4064++;
        class55 var3 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method484(79);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)V", line = 144)
    public final void method1816(int arg0, byte arg1) {
        field4067++;
        int var3 = 97 / ((38 - arg1) / 58);
        class55 var4 = this.field4066;
        synchronized (this.field4066) {
            this.field4066.method493(false, arg0);
        }
        class55 var5 = this.field4070;
        synchronized (this.field4070) {
            this.field4070.method493(false, arg0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V", line = 160)
    public static void method1817(byte arg0) {
        if (arg0 == 100) {
            field4069 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Loq;ILbu;Lbu;)V", line = 182)
    public class285(class239 arg0, int arg1, class17 arg2, class17 arg3) {
        this.field4059 = arg3;
        this.field4058 = arg2;
        this.field4058.method119(29630, 36);
    }
}
