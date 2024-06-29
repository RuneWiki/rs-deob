import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class386 extends class346 {

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "F")
    public float field5073;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "F")
    public float field5069;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "Z")
    public boolean field5072;

    @OriginalMember(owner = "client!cw", name = "Q", descriptor = "[I")
    public static int[] field5077;

    @OriginalMember(owner = "client!cw", name = "R", descriptor = "J")
    public static long field5078;

    @OriginalMember(owner = "client!cw", name = "N", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!cw", name = "P", descriptor = "Lqd;")
    public static class277 field5076;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(Z)V")
    public static void method2302(boolean arg0) {
        field5077 = null;
        field5076 = null;
        if (!arg0) {
            field5076 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(II)V")
    public static final void method2303(int arg0, int arg1) {
        class63.field808 = new int[arg0];
        if (arg1 <= -127) {
            ++field5075;
            class438.field6106 = new int[arg0];
            class138.field1840 = new int[arg0];
            class261.field3306 = new int[arg0];
            class78.field998 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIII[I)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5070 = arg1;
        this.field5071 = arg2;
        this.method2035(arg5, arg1, 0, 0, 0, 0, (byte) 90, true, arg2);
        this.field5073 = (float) arg2 / (float) arg4;
        this.field5069 = (float) arg1 / (float) arg3;
        this.field5072 = false;
        this.method2040(false, (byte) 89, false);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z")
    public static final boolean method2304(int arg0, int arg1, int arg2) {
        ++field5074;
        if (!class428.method2535((byte) 65, arg1, arg0)) {
            return false;
        } else {
            return ~(45056 & arg1) != arg2 | class255.method1593(arg1, arg2 + 111, arg0) | class420.method2481(arg1, 107, arg0) ? true : (class127.method810(arg0, arg1, 80) | class276.method1701(arg0, arg1, arg2)) & ~(arg0 & 55) == -1;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIIII[BI)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5071 = arg3;
        this.field5070 = arg2;
        this.method2037(arg3, arg2, arg7, 0, arg6, true, 0, 0, 0, 0);
        this.field5073 = (float) arg3 / (float) arg5;
        this.field5072 = false;
        this.field5069 = (float) arg2 / (float) arg4;
        this.method2040(false, (byte) 89, false);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIIIZ[BI)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field521 != 34037) {
            this.field5069 = this.field5073 = 1.0F;
            this.field5072 = true;
        } else {
            this.field5069 = (float) arg3;
            this.field5073 = (float) arg4;
            this.field5072 = false;
        }
        this.field5071 = arg4;
        this.field5070 = arg3;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIIIIIZ)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5071 = arg4;
        this.field5072 = false;
        this.field5070 = arg3;
        this.field5069 = (float) arg3 / (float) arg5;
        this.field5073 = (float) arg4 / (float) arg6;
        this.method2040(false, (byte) 89, false);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIIZ[I)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5071 = arg3;
        if (super.field521 == 34037) {
            this.field5073 = (float) arg3;
            this.field5069 = (float) arg2;
            this.field5072 = false;
        } else {
            this.field5069 = this.field5073 = 1.0F;
            this.field5072 = true;
        }
        this.field5070 = arg2;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lgk;IIIIIZ)V")
    public class386(class463 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field5071 = arg5;
        if (~super.field521 == -34038) {
            this.field5073 = (float) arg5;
            this.field5072 = false;
            this.field5069 = (float) arg4;
        } else {
            this.field5069 = this.field5073 = 1.0F;
            this.field5072 = true;
        }
        this.field5070 = arg4;
    }

    static {
        new class169("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field5077 = new int[500];
        field5078 = 0L;
    }
}
