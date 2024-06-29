import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class720 extends class683 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    private int field10052;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private int field10057;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    private int field10053;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field10054;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[[I")
    public static int[][] field10050 = new int[6][];

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field10059 = 0;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lgga;")
    public static class513 field10061;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZII)V", line = 7)
    public final void method268(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field10053 = 14;
        }
        ++field10056;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z", line = 19)
    public static final boolean method4005(int arg0) {
        ++field10062;
        try {
            class631 var1 = new class631();
            byte[] var2 = var1.method3604((byte) -89, class578.field8329);
            class590.method3461(var2, -6394);
            if (arg0 <= 38) {
                field10061 = null;
            }
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method4006(boolean arg0) {
        ++field10055;
        if (arg0) {
            field10061 = null;
        }
        if (!class239.field3450) {
            class239.field3450 = true;
            class322.field4582 += (12.0F - class322.field4582) / 2.0F;
            class438.field6083 = true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIII)V", line = 65)
    public class720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field10052 = arg3;
        this.field10057 = arg0;
        this.field10053 = arg2;
        this.field10054 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZI)V", line = 76)
    public final void method269(int arg0, boolean arg1, int arg2) {
        ++field10060;
        if (!arg1) {
            this.field10052 = 92;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 87)
    public static void method4007(byte arg0) {
        field10061 = null;
        if (arg0 == -126) {
            field10050 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V", line = 103)
    public final void method267(int arg0, int arg1, int arg2) {
        ++field10058;
        int var4 = this.field10057 * arg2 >> 12;
        int var5 = this.field10053 * arg2 >> 12;
        if (arg1 != 1) {
            method4006(true);
        }
        int var6 = this.field10054 * arg0 >> 12;
        int var7 = this.field10052 * arg0 >> 12;
        class769.method4247(0, var6, var5, super.field9679, var7, var4);
    }
}
