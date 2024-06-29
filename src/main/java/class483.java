import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class483 extends class260 {

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "[[I")
    public static int[][] field6675 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6674;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6672;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Ljda;")
    public static class239 field6678;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "[Lsp;")
    public static class663[] field6682;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field6674 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field6672 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field6678 = new class239(10);
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILfca;)V", line = 4)
    public class483(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V", line = 7)
    public final void method2(boolean arg0) {
        ++field6680;
        int var2 = super.field3867.method733(-104).method3986(117);
        if (var2 < 96) {
            super.field3868 = 0;
        }
        if (~super.field3868 < -2 && var2 < 128) {
            super.field3868 = 1;
        }
        if (arg0) {
            field6675 = null;
        }
        if (super.field3868 > 2 && ~var2 > -193) {
            super.field3868 = 2;
        }
        if (~super.field3868 > -1 || super.field3868 > 3) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lfca;)V", line = 33)
    public class483(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I", line = 36)
    public final int method2806(int arg0) {
        if (arg0 < 3) {
            this.method4(-32, (byte) -111);
        }
        ++field6681;
        return super.field3868;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V", line = 50)
    public static final void method2807(int arg0, int arg1, int arg2, int arg3) {
        ++field6683;
        if (arg3 != 0) {
            method2808(-49, 27, (class668) null, -113);
        }
        class347 var4 = class73.field1031[arg0][arg2];
        class526.method3035(arg1, var4 != null ? var4 : class452.field6287, false);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I", line = 63)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field6674 = null;
        }
        ++field6679;
        return 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)I", line = 80)
    public final int method4(int arg0, byte arg1) {
        ++field6676;
        int var3 = super.field3867.method733(28).method3986(111);
        int var4 = -6 % ((arg1 - -53) / 50);
        if (var3 < 96) {
            return 3;
        } else if (arg0 > 1 && var3 < 128) {
            return 3;
        } else {
            return ~arg0 < -4 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILor;I)V", line = 150)
    public static final void method2808(int arg0, int arg1, class668 arg2, int arg3) {
        class342.field5037 = arg0;
        class709.field9941 = arg3;
        class131.field1944 = arg2;
        ++field6677;
        if (arg1 > -79) {
            field6675 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IB)V", line = 165)
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            field6672 = null;
        }
        ++field6671;
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z", line = 183)
    public final boolean method2809(int arg0) {
        ++field6673;
        int var2 = 115 / ((56 - arg0) / 53);
        int var3 = super.field3867.method733(-14).method3986(111);
        return ~var3 <= -97;
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V", line = 198)
    public static void method2810(int arg0) {
        field6682 = null;
        field6674 = null;
        field6672 = null;
        field6675 = null;
        int var1 = 29 / ((-31 - arg0) / 61);
        field6678 = null;
    }
}
