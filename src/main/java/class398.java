import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class398 extends class504 {

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lno;")
    public class658 field5291;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field5290 = 0;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lcu;")
    public static class206 field5287 = new class206(1, -1);

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field5296 = new String[200];

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lkca;")
    public static class76 field5294;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
    public boolean field5293;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
    public static int[] field5295;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Z", line = 7)
    public final boolean method2282(int arg0) {
        field5288++;
        int var2 = -3 % ((arg0 - 34) / 45);
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I", line = 18)
    public final int method2283(byte arg0) {
        field5285++;
        if (arg0 != -20) {
            this.method959((byte) 105);
        }
        return 1;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)Z", line = 36)
    public final boolean method2284(byte arg0) {
        field5284++;
        if (arg0 < 61) {
            method2285(-107, 101, null);
        }
        return this.field5293;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)I", line = 48)
    public int method959(byte arg0) {
        if (arg0 == 17) {
            field5292++;
            return 0;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;)V", line = 59)
    public static final void method2285(int arg0, int arg1, String arg2) {
        field5289++;
        class382 var3 = class396.method2276(126, 3, arg1);
        var3.method2232(-106);
        var3.field5103 = arg2;
        if (arg0 != 11298) {
            field5287 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V", line = 76)
    public static void method2286(int arg0) {
        field5294 = null;
        field5295 = null;
        field5287 = null;
        field5296 = null;
        if (arg0 != 0) {
            field5294 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lno;)V", line = 97)
    public class398(class658 arg0) {
        this.field5291 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
    public abstract boolean method955(int arg0);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
    public abstract boolean method954(int arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lgaa;Lgaa;BI)V")
    public abstract void method952(class275 arg0, class275 arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
    public abstract void method953(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)V")
    public abstract void method960(byte arg0, int arg1);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public abstract void method957(int arg0);
}
