import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class222 extends class283 {

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Lmfa;")
    public class562 field2794 = new class562();

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "Llb;")
    public class495 field2800 = new class495();

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lco;")
    private class106 field2799;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Lkfa;")
    public static class549 field2789 = new class549(24, -1);

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "J")
    public static long field2795 = 0L;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lcd;", line = 3)
    public final class283 method650() {
        field2792++;
        class643 var1 = (class643) this.field2794.method3174((byte) 49);
        if (var1 == null) {
            return null;
        } else if (var1.field9096 == null) {
            return this.method651();
        } else {
            return var1.field9096;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 21)
    public final void method639(int arg0) {
        this.field2800.method639(arg0);
        field2796++;
        for (class643 var2 = (class643) this.field2794.method3174((byte) 49); var2 != null; var2 = (class643) this.field2794.method3168(false)) {
            if (!this.field2799.method660(var2, -18885)) {
                int var3 = arg0;
                do {
                    if (var2.field9102 >= var3) {
                        this.method1300(var2, var3, (byte) -19);
                        var2.field9102 -= var3;
                        break;
                    }
                    this.method1300(var2, var2.field9102, (byte) 2);
                    var3 -= var2.field9102;
                } while (!this.field2799.method638(0, var2, 0, var3, null));
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 55)
    public static void method1297(int arg0) {
        int var1 = 33 % (-arg0 / 44);
        field2789 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwaa;I[IIII)V", line = 65)
    private final void method1298(class643 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -8236) {
            this.method1300(null, -83, (byte) -111);
        }
        field2790++;
        if ((this.field2799.field1157[arg0.field9095] & 0x4) != 0 && arg0.field9091 < 0) {
            int var7 = this.field2799.field1173[arg0.field9095] / class519.field7413;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field9105) / var7;
                if (arg3 < var8) {
                    arg0.field9105 += arg3 * var7;
                    break;
                }
                arg0.field9096.method657(arg2, arg5, var8);
                arg0.field9105 += var7 * var8 - 1048576;
                arg3 -= var8;
                arg5 += var8;
                int var9 = class519.field7413 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class159 var11 = arg0.field9096;
                if (this.field2799.field1170[arg0.field9095] == 0) {
                    arg0.field9096 = class159.method951(arg0.field9099, var11.method917(), var11.method919(), var11.method953());
                } else {
                    arg0.field9096 = class159.method951(arg0.field9099, var11.method917(), 0, var11.method953());
                    this.field2799.method637(arg0, 127, arg0.field9092.field711[arg0.field9108] < 0);
                    arg0.field9096.method926(var9, var11.method919());
                }
                if (arg0.field9092.field711[arg0.field9108] < 0) {
                    arg0.field9096.method941(-1);
                }
                var11.method934(var9);
                var11.method657(arg2, arg5, arg4 - arg5);
                if (var11.method927()) {
                    this.field2800.method2847(var11);
                }
            }
        }
        arg0.field9096.method657(arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLe;Ljava/awt/Canvas;I)Loa;", line = 128)
    public static final class635 method1299(byte arg0, class486 arg1, Canvas arg2, int arg3) {
        int var4 = 56 % ((-arg0 - 71) / 32);
        field2793++;
        return new class435(arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I", line = 140)
    public final int method671() {
        field2797++;
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()Lcd;", line = 158)
    public final class283 method651() {
        field2788++;
        class643 var1;
        do {
            var1 = (class643) this.field2794.method3168(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field9096 == null);
        return var1.field9096;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "([III)V", line = 182)
    public final void method657(int[] arg0, int arg1, int arg2) {
        field2798++;
        this.field2800.method657(arg0, arg1, arg2);
        for (class643 var4 = (class643) this.field2794.method3174((byte) 49); var4 != null; var4 = (class643) this.field2794.method3168(false)) {
            if (!this.field2799.method660(var4, -18885)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field9102) {
                        this.method1298(var4, -8236, arg0, var5, var5 + var6, var6);
                        var4.field9102 -= var5;
                        break;
                    }
                    this.method1298(var4, -8236, arg0, var4.field9102, var5 + var6, var6);
                    var6 += var4.field9102;
                    var5 -= var4.field9102;
                } while (!this.field2799.method638(var6, var4, 0, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwaa;IB)V", line = 225)
    private final void method1300(class643 arg0, int arg1, byte arg2) {
        field2791++;
        if ((this.field2799.field1157[arg0.field9095] & 0x4) != 0 && arg0.field9091 < 0) {
            int var4 = this.field2799.field1173[arg0.field9095] / class519.field7413;
            int var5 = (var4 + 1048575 - arg0.field9105) / var4;
            arg0.field9105 = arg1 * var4 + arg0.field9105 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field2799.field1170[arg0.field9095] == 0) {
                    arg0.field9096 = class159.method951(arg0.field9099, arg0.field9096.method917(), arg0.field9096.method919(), arg0.field9096.method953());
                } else {
                    arg0.field9096 = class159.method951(arg0.field9099, arg0.field9096.method917(), 0, arg0.field9096.method953());
                    this.field2799.method637(arg0, -9, ~arg0.field9092.field711[arg0.field9108] > -1);
                }
                if (arg0.field9092.field711[arg0.field9108] < 0) {
                    arg0.field9096.method941(-1);
                }
                arg1 = arg0.field9105 / var4;
            }
        }
        int var6 = 121 % ((arg2 - 58) / 50);
        arg0.field9096.method639(arg1);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lco;)V", line = 269)
    public class222(class106 arg0) {
        this.field2799 = arg0;
    }
}
