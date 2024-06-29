import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 {

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Lbu;")
    public static class21 field399 = new class21(108, 0);

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Lfba;")
    public static class27 field402 = new class27(61, 16);

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "D")
    public static double field403;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "Lqja;")
    public static class326 field400;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V", line = 5)
    public static void method242(boolean arg0) {
        field402 = null;
        field400 = null;
        if (arg0) {
            method243((byte) -126, 9, -28, null);
        }
        field399 = null;
    }

    @OriginalMember(owner = "client!fba", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field397++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;", line = 33)
    public static final String method243(byte arg0, int arg1, int arg2, String[] arg3) {
        field398++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg0 != -10) {
                method243((byte) 104, 113, 53, null);
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)I", line = 96)
    public final int method244(int arg0) {
        field394++;
        if (arg0 != 0) {
            method245((byte) 12);
        }
        return this.field401;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 110)
    public static final void method245(byte arg0) {
        field396++;
        class652 var1 = class663.field9221;
        synchronized (class663.field9221) {
            class663.field9221.method3735(2);
            if (arg0 != -121) {
                method245((byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(II)V", line = 125)
    public class27(int arg0, int arg1) {
        this.field401 = arg0;
        this.field395 = arg1;
    }
}
