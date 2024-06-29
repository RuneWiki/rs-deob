import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class394 {

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lsp;")
    public class519 field6027 = new class519();

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Llo;")
    public static class306 field6023 = new class306("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "[F")
    public static float[] field6034 = new float[4];

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lvv;")
    public static class313 field6028 = new class313(21, -1);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Lsp;")
    private class519 field6033;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I", line = 3)
    public final int method2460(byte arg0) {
        field6032++;
        int var2 = 0;
        int var3 = -58 / ((arg0 + 38) / 50);
        for (class519 var4 = this.field6027.field7660; var4 != this.field6027; var4 = var4.field7660) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V", line = 26)
    public static final void method2461(byte arg0) {
        class230.field3999.method2525(0);
        field6024++;
        if (arg0 != -34) {
            field6023 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 37)
    public static void method2462(int arg0) {
        field6034 = null;
        field6023 = null;
        field6028 = null;
        if (arg0 != -13287) {
            method2464(-21, 70, -54, 15);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 54)
    public final void method2463(int arg0) {
        if (arg0 != 27274) {
            field6034 = null;
        }
        while (true) {
            class519 var2 = this.field6027.field7660;
            if (this.field6027 == var2) {
                field6030++;
                this.field6033 = null;
                return;
            }
            var2.method3068((byte) -40);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z", line = 79)
    public static final boolean method2464(int arg0, int arg1, int arg2, int arg3) {
        if (class136.method1027(arg0, arg1, arg2)) {
            int var4 = arg1 << class276.field4534;
            int var5 = arg2 << class276.field4534;
            return class331.method2087(var4 + 1, class360.field5592[arg0].method1516(arg1, arg2) + arg3, var5 + 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg2) + arg3, var5 + 1) && class331.method2087(class70.field1217 + var4 - 1, class360.field5592[arg0].method1516(arg1 + 1, arg2 + 1) + arg3, class70.field1217 + var5 - 1) && class331.method2087(var4 + 1, class360.field5592[arg0].method1516(arg1, arg2 + 1) + arg3, class70.field1217 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 94)
    public static final void method2465(int arg0) {
        field6022++;
        class78[] var1 = class219.field3788;
        synchronized (class219.field3788) {
            if (arg0 != -22670) {
                method2462(126);
            }
            for (int var2 = 0; var2 < class219.field3788.length; var2++) {
                class219.field3788[var2] = new class78();
                class422.field6377[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILsp;)V", line = 116)
    public final void method2466(int arg0, class519 arg1) {
        field6029++;
        if (arg1.field7661 != null) {
            arg1.method3068((byte) -58);
        }
        arg1.field7661 = this.field6027.field7661;
        if (arg0 < -72) {
            arg1.field7660 = this.field6027;
            arg1.field7661.field7660 = arg1;
            arg1.field7660.field7661 = arg1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 190)
    public class394() {
        this.field6027.field7661 = this.field6027;
        this.field6027.field7660 = this.field6027;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(B)Lsp;", line = 142)
    public final class519 method2467(byte arg0) {
        int var2 = 22 % ((36 - arg0) / 59);
        field6025++;
        class519 var3 = this.field6033;
        if (this.field6027 == var3) {
            this.field6033 = null;
            return null;
        } else {
            this.field6033 = var3.field7660;
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Lsp;", line = 164)
    public final class519 method2468(int arg0) {
        field6026++;
        if (arg0 != 0) {
            field6023 = null;
        }
        class519 var2 = this.field6027.field7660;
        if (this.field6027 == var2) {
            this.field6033 = null;
            return null;
        } else {
            this.field6033 = var2.field7660;
            return var2;
        }
    }
}
