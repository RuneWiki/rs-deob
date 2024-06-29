import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class45 implements class20 {

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Ljn;")
    public class322 field767;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lnha;")
    public class686 field763;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Z")
    public boolean field766;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[I")
    public static int[] field758 = new int[1024];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lcb;")
    public static class631 field765 = new class631(47, 3);

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Ltm;")
    public static class334 field768 = new class334(102, -1);

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Ltm;")
    public static class334 field769 = new class334(64, 3);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lvj;")
    public final class26 method117(int arg0) {
        field764++;
        if (arg0 != 1) {
            method467(127);
        }
        return class263.field4077;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method466(byte arg0) {
        int var1 = 104 % ((arg0 + 27) / 54);
        field758 = null;
        field769 = null;
        field768 = null;
        field765 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILnha;Ljn;IIIIIIIZ)V")
    public class45(int arg0, class686 arg1, class322 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field759 = arg5;
        this.field767 = arg2;
        this.field763 = arg1;
        this.field760 = arg7;
        this.field754 = arg0;
        this.field755 = arg3;
        this.field756 = arg4;
        this.field766 = arg10;
        this.field761 = arg6;
        this.field762 = arg8;
        this.field753 = arg9;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static final void method467(int arg0) {
        field757++;
        if (class701.field9908) {
            return;
        }
        class263.method1752(class475.field6899, 0);
        if (class576.field8160 != null) {
            class263.method1752(class576.field8160, 0);
        }
        if (arg0 <= -67) {
            class701.field9908 = true;
        }
    }
}
