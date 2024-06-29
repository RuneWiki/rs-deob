import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class103 {

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lgi;")
    public class583 field1561;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Z")
    private boolean field1564;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1566 = -1;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Lej;")
    public static class104 field1557 = new class104("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Loca;")
    public static class221 field1567 = new class221(0, 2, 2, 1);

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "J")
    public static long field1569 = 0L;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field1570 = -1;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1561.method3364((byte) 32, this.field1565, this.field1568);
        field1559++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lan;IB)Lpu;")
    public static final class483 method728(class21 arg0, int arg1, byte arg2) {
        field1562++;
        if (arg2 >= -64) {
            field1569 = 86L;
        }
        byte[] var3 = arg0.method242(arg1, (byte) -114);
        return var3 == null ? null : new class483(var3);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/Object;Ldj;I)V")
    public static final void method729(Object arg0, class288 arg1, int arg2) {
        field1558++;
        if (arg1.field3969 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field3969.peekEvent() != null; var3++) {
            class21.method220(0, 1L);
        }
        if (arg2 != -3) {
            method728(null, -72, (byte) 37);
        }
        if (arg0 != null) {
            arg1.field3969.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
    public abstract void method730(int arg0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public static void method731(byte arg0) {
        if (arg0 < 72) {
            method732(-36, -71, -55, -59, -18, 15);
        }
        field1557 = null;
        field1567 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1563++;
        int var6 = arg4;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg4 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (arg4 + 1) * var16;
        if (arg5 >= class264.field3687 && class591.field8435 >= arg5) {
            int var20 = class646.method3722(arg0 + arg3, class326.field4387, class596.field8621, false);
            int var21 = class646.method3722(arg3 - arg0, class326.field4387, class596.field8621, false);
            class266.method1742(26844, class182.field2580[arg5], var20, arg2, var21);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var22 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class264.field3687 <= var24 && class591.field8435 >= var23) {
                int var25 = class646.method3722(arg3 + var6, class326.field4387, class596.field8621, false);
                int var26 = class646.method3722(arg3 - var6, class326.field4387, class596.field8621, false);
                if (var23 >= class264.field3687) {
                    class266.method1742(26844, class182.field2580[var23], var25, arg2, var26);
                }
                if (class591.field8435 >= var24) {
                    class266.method1742(26844, class182.field2580[var24], var25, arg2, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([BII)V")
    public final void method733(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method732(-8, -98, -47, -91, -19, -78);
        }
        this.method730(255);
        field1560++;
        if (arg1 > this.field1568) {
            OpenGL.glBufferDataARBub(this.field1556, arg1, arg0, 0, this.field1564 ? 35040 : 35044);
            this.field1561.field8215 += arg1 - this.field1568;
            this.field1568 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field1556, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lgi;I[BIZ)V")
    public class103(class583 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1568 = arg3;
        this.field1561 = arg0;
        this.field1564 = arg4;
        this.field1556 = arg1;
        OpenGL.glGenBuffersARB(1, class151.field2291, 0);
        this.field1565 = class151.field2291[0];
        this.method730(255);
        OpenGL.glBufferDataARBub(arg1, this.field1568, arg2, 0, this.field1564 ? 35040 : 35044);
        this.field1561.field8215 += this.field1568;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lgi;ILjaclib/memory/Buffer;IZ)V")
    public class103(class583 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1568 = arg3;
        this.field1561 = arg0;
        this.field1556 = arg1;
        this.field1564 = arg4;
        OpenGL.glGenBuffersARB(1, class151.field2291, 0);
        this.field1565 = class151.field2291[0];
        this.method730(255);
        OpenGL.glBufferDataARBa(arg1, this.field1568, arg2.getAddress(), this.field1564 ? 35040 : 35044);
        this.field1561.field8215 += this.field1568;
    }
}
