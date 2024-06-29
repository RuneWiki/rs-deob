import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class12 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Laq;")
    private class494 field147 = new class494(64);

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field158 = 0;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lgga;")
    private class513 field148;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Lgga;")
    public static class513 field151;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "[I")
    public static int[] field156;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public final void method156(byte arg0) {
        field153++;
        class494 var2 = this.field147;
        synchronized (this.field147) {
            this.field147.method2893((byte) 106);
            if (arg0 != 96) {
                this.method161(true);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIII)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= class742.field10301 && arg5 <= class435.field6058 && class515.field7102 <= arg0 && class698.field9801 >= arg2) {
            class592.method3467(arg1, arg0, arg2, arg3, arg4 ^ 0x7150, arg5);
        } else {
            class308.method1895(arg1, arg0, arg5, arg2, arg3, 107);
        }
        if (arg4 != 4) {
            field146 = 43;
        }
        field152++;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
    public static void method158(byte arg0) {
        field156 = null;
        field151 = null;
        if (arg0 != -60) {
            field156 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Lhca;")
    public final class405 method159(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field154++;
        class494 var3 = this.field147;
        class405 var4;
        synchronized (this.field147) {
            var4 = (class405) this.field147.method2882((long) arg0, (byte) -63);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field148;
        byte[] var6;
        synchronized (this.field148) {
            var6 = this.field148.method3019(4, arg0, 58);
        }
        class405 var7 = new class405();
        var7.field5578 = arg0;
        var7.field5575 = this;
        if (var6 != null) {
            var7.method2399(new class431(var6), (byte) 119);
        }
        var7.method2400((byte) -126);
        class494 var8 = this.field147;
        synchronized (this.field147) {
            this.field147.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)V")
    public static final void method160(byte arg0) {
        if (arg0 < 85) {
            field146 = -109;
        }
        field149++;
        if (class425.field5910) {
            return;
        }
        class360.method2169(class723.field10084, (byte) 124);
        if (class410.field5618 != null) {
            class360.method2169(class410.field5618, (byte) 123);
        }
        class425.field5910 = true;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        field155++;
        if (arg0) {
            class494 var2 = this.field147;
            synchronized (this.field147) {
                this.field147.method2881((byte) -64);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)V")
    public final void method162(int arg0, byte arg1) {
        class494 var3 = this.field147;
        synchronized (this.field147) {
            this.field147.method2888(arg0, 119);
        }
        field150++;
        int var4 = 111 % ((7 - arg1) / 58);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class12(class41 arg0, int arg1, class513 arg2) {
        this.field148 = arg2;
        this.field157 = this.field148.method3007(-1, 4);
    }
}
