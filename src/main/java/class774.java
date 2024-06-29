import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class774 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Ldha;")
    private class83 field10646;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field10640 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field10639;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field10641;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field10643;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field10647;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lal;")
    private class107 field10644;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[Ls;")
    public static class294[] field10642;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 4)
    public static void method4262(int arg0) {
        field10642 = null;
        if (arg0 != -13062) {
            method4265(-38, 123, -41);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lal;", line = 21)
    public final class107 method4263(int arg0) {
        field10641++;
        class107 var2 = this.field10644;
        if (this.field10646.field923 == var2) {
            this.field10644 = null;
            return null;
        }
        if (arg0 != -2900) {
            this.field10646 = null;
        }
        this.field10644 = var2.field1600;
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 46)
    public static final void method4264(int arg0, int arg1) {
        class111.field1697 = arg1;
        field10645++;
        if (arg0 == 0) {
            class225.field3465.method3735(2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)B", line = 58)
    public static final byte method4265(int arg0, int arg1, int arg2) {
        field10639++;
        if (arg0 == 9) {
            return (byte) ((arg2 & arg1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Lal;", line = 73)
    public final class107 method4266(byte arg0) {
        field10647++;
        class107 var2 = this.field10646.field923.field1600;
        if (this.field10646.field923 == var2) {
            this.field10644 = null;
            return null;
        }
        this.field10644 = var2.field1600;
        if (arg0 > -124) {
            this.method4266((byte) 39);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILwia;Ld;Ljava/awt/Canvas;I)Lha;", line = 98)
    public static final class65 method4267(byte arg0, int arg1, class791 arg2, class160 arg3, Canvas arg4, int arg5) {
        if (arg0 <= 65) {
            field10642 = null;
        }
        field10643++;
        int var6 = 0;
        int var7 = 0;
        if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        return class65.method472(false, arg4, var6, arg1, arg2, var7, arg5, arg3);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 125)
    public class774() {
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ldha;)V", line = 127)
    public class774(class83 arg0) {
        this.field10646 = arg0;
    }
}
