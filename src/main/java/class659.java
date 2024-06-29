import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class class659 extends class333 {

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Lvj;")
    public class422 field9248;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "S")
    public static short field9246 = 32767;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Z")
    public boolean field9252;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
    public abstract boolean method3652(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3653(int arg0, byte arg1, int arg2) {
        field9251++;
        if (arg1 != -104) {
            field9247 = 89;
        }
        return (arg2 & 0x70000) != 0 | class372.method2164(arg2, arg0, arg1 ^ 0xFFFFFF98) || class424.method2442(arg0, (byte) 111, arg2);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Z")
    public final boolean method3654(byte arg0) {
        if (arg0 > -125) {
            return true;
        } else {
            field9255++;
            return this.field9252;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public abstract void method3655(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILi;)V")
    public static final void method3656(int arg0, class274 arg1) {
        class156.field1743[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)I")
    public int method3657(int arg0) {
        if (arg0 > -105) {
            return -118;
        } else {
            field9250++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILg;Lg;)V")
    public abstract void method3658(int arg0, int arg1, class555 arg2, class555 arg3);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
    public final boolean method3659(byte arg0) {
        if (arg0 < 77) {
            this.field9252 = false;
        }
        field9253++;
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Z")
    public abstract boolean method3660(int arg0);

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lvj;)V")
    public class659(class422 arg0) {
        this.field9248 = arg0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZII)V")
    public abstract void method3661(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)I")
    public final int method3662(boolean arg0) {
        if (arg0) {
            field9254++;
            return 1;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V")
    public abstract void method3663(int arg0, int arg1);
}
