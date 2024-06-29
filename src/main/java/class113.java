import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class113 {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Ltq;")
    private class536 field1503 = new class536(256);

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ld;")
    private class284 field1501;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lgd;")
    private class696 field1495;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lrn;")
    public static class633 field1500 = new class633(4, -1);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1502 = -1;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B[BILjc;)Lvia;", line = 3)
    public static final class494 method659(byte arg0, byte[] arg1, int arg2, class179 arg3) {
        field1498++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg1);
        if (arg0 < 10) {
            field1500 = null;
        }
        OpenGL.glGetIntegerv(34379, class510.field6507, 0);
        if (class510.field6507[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class494(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lw;", line = 34)
    public final class471 method660(int arg0, int arg1) {
        if (arg1 >= -37) {
            this.field1495 = null;
        }
        field1499++;
        Object var3 = this.field1503.method2931((long) arg0, (byte) -104);
        if (var3 != null) {
            return (class471) var3;
        } else if (this.field1501.method1733(-1852, arg0)) {
            class191 var4 = this.field1501.method1732((byte) -12, arg0);
            int var5 = var4.field2673 ? 64 : this.field1495.field9138;
            class471 var7;
            if (var4.field2668 && this.field1495.method899()) {
                float[] var6 = this.field1501.method1735(0.7F, arg0, var5, var5, false, 108);
                var7 = this.field1495.method3713(class417.field5505, var6, false, var5, var5, var4.field2671 != 0);
            } else {
                int[] var8;
                if (var4.field2682 != 2 && class176.method1134(14031, var4.field2678)) {
                    var8 = this.field1501.method1737(arg0, var5, 0.7F, true, var5, (byte) 45);
                } else {
                    var8 = this.field1501.method1734(-25886, false, var5, var5, arg0, 0.7F);
                }
                var7 = this.field1495.method3719(var5, var8, (byte) -117, var5, var4.field2671 != 0);
            }
            var7.method1131(var4.field2660, var4.field2663, 72);
            this.field1503.method2918((long) arg0, var7, 100);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 81)
    public final void method661(int arg0) {
        this.field1503.method2928(true, 5);
        field1504++;
        if (arg0 != -1) {
            method662((byte) 48);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 102)
    public static void method662(byte arg0) {
        int var1 = 72 / ((74 - arg0) / 48);
        field1500 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 111)
    public final void method663(int arg0) {
        if (arg0 != -1) {
            this.field1501 = null;
        }
        field1497++;
        this.field1503.method2919(0);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lgd;Ld;)V", line = 130)
    public class113(class696 arg0, class284 arg1) {
        this.field1501 = arg1;
        this.field1495 = arg0;
    }
}
