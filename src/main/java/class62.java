import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class class62 extends class417 {

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "[Lpv;")
    public class62[] field786;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "Z")
    public boolean field788;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Lpu;")
    public class483 field772;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Lpe;")
    public class524 field774;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pv", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field790;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method410(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLjava/lang/String;)V", line = 7)
    public static final void method399(byte arg0, String arg1) {
        field784++;
        if (arg0 != -48) {
            method406((byte) -20, -33);
        }
        if (!arg1.equals("")) {
            class328.field4529++;
            class402.method2367(class623.field9186, (byte) 124);
            class112.field1589.method1049(-1, class539.method3267(arg1, false));
            class112.field1589.method1050((byte) 32, arg1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lgw;II)V", line = 28)
    public void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field779++;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZI)V", line = 39)
    public void method400(int arg0, boolean arg1, int arg2) {
        field771++;
        if (!arg1) {
            this.field772 = null;
        }
        int var4 = this.field781 == 255 ? arg2 : this.field781;
        if (this.field788) {
            this.field774 = new class524(var4, arg2, arg0);
        } else {
            this.field772 = new class483(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I", line = 62)
    public int method401(int arg0) {
        if (arg0 >= -9) {
            this.method409(-36, (byte) 121);
        }
        field783++;
        return -1;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lpp;I)V", line = 77)
    public static final void method402(class332 arg0, int arg1) {
        field787++;
        if (class420.field5697 == null) {
            return;
        }
        class231 var2 = null;
        if (arg0.field4590 == 0) {
            var2 = (class231) class169.method1205(arg0.field4588, arg0.field4593, arg0.field4584);
        }
        if (arg1 != 1) {
            return;
        }
        if (arg0.field4590 == 1) {
            var2 = (class231) class420.method2476(arg0.field4588, arg0.field4593, arg0.field4584);
        }
        if (arg0.field4590 == 2) {
            var2 = (class231) class624.method3650(arg0.field4588, arg0.field4593, arg0.field4584, field790 == null ? (field790 = method410("up")) : field790);
        }
        if (arg0.field4590 == 3) {
            var2 = (class231) class440.method2560(arg0.field4588, arg0.field4593, arg0.field4584);
        }
        if (var2 == null) {
            arg0.field4585 = 0;
            arg0.field4582 = -1;
            arg0.field4586 = 0;
        } else {
            arg0.field4582 = var2.method183(-19248);
            arg0.field4586 = var2.method173((byte) 7);
            arg0.field4585 = var2.method170(-126);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I", line = 123)
    public int method403(int arg0) {
        field778++;
        if (arg0 != 0) {
            this.method409(74, (byte) 113);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(II)[I", line = 138)
    public int[] method13(int arg0, int arg1) {
        field789++;
        if (arg1 != 656024161) {
            this.field788 = false;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I", line = 150)
    public static final int method404(int arg0, int arg1, int arg2) {
        field777++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return arg1 >= -27 ? -93 : var3;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V", line = 170)
    public void method405(int arg0) {
        if (this.field788) {
            this.field774.method3090(true);
            this.field774 = null;
        } else {
            this.field772.method2909((byte) 86);
            this.field772 = null;
        }
        if (arg0 != 255) {
            this.method408(-93, 41, (byte) 81);
        }
        field785++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)Lfp;", line = 196)
    public static final class271 method406(byte arg0, int arg1) {
        field773++;
        class271[] var2 = class163.method1182((byte) -55);
        int var3 = -96 / ((arg0 - 29) / 61);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class271 var5 = var2[var4];
            if (var5.field3838 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBI)[[I", line = 222)
    public final int[][] method407(int arg0, byte arg1, int arg2) {
        if (arg1 != 41) {
            return null;
        }
        field780++;
        if (this.field786[arg0].field788) {
            int[] var4 = this.field786[arg0].method13(arg2, arg1 ^ 0x271A2248);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field786[arg0].method409(arg2, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)[I", line = 259)
    public final int[] method408(int arg0, int arg1, byte arg2) {
        field776++;
        if (arg2 != -69) {
            this.field786 = null;
        }
        return this.field786[arg1].field788 ? this.field786[arg1].method13(arg0, 656024161) : this.field786[arg1].method409(arg0, (byte) -79)[0];
    }

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "(I)V", line = 284)
    public void method395(int arg0) {
        if (arg0 <= -37) {
            field775++;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)[[I", line = 294)
    public int[][] method409(int arg0, byte arg1) {
        field782++;
        if (arg1 < -20) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IZ)V", line = 307)
    public class62(int arg0, boolean arg1) {
        this.field786 = new class62[arg0];
        this.field788 = arg1;
    }
}
