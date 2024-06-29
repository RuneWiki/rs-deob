import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class421 extends class689 {

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "[I")
    public static int[] field5525 = new int[5];

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[Lre;")
    public static class633[] field5524 = null;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Z")
    public static boolean field5526 = false;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lrr;")
    public static class408 field5527;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lf;")
    public static class532 field5522;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method2374(int arg0) {
        if (arg0 == -15190) {
            field5524 = null;
            field5527 = null;
            field5525 = null;
            field5522 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)Z")
    public static final boolean method2375(byte arg0, int arg1, int arg2) {
        if (arg0 == -126) {
            field5530++;
            return (arg2 & 0x70000) != 0 | class425.method2408((byte) -120, arg1, arg2) || class581.method3204(arg2, arg1, -16711936);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ltl;Lfn;IIIIIIIII)V")
    public class421(class566 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5529 = arg9;
        this.field5528 = arg10;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        if (arg0 != 4) {
            field5522 = null;
        }
        field5523++;
        return class98.field1188;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lir;Z[[[BIB)Z")
    public static final boolean method2376(class27 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class505.field6963) {
            return false;
        }
        int var5 = arg0.field398 >> class62.field762;
        int var6 = arg0.field397 >> class62.field762;
        if (var5 < class153.field2165 || var5 >= class78.field923 || var6 < class151.field2067 || var6 >= class156.field2191) {
            return true;
        } else if ((arg2 == null || arg0.field385 < arg3 || arg2[arg0.field385][var5][var6] != arg4) && arg0.method171(false) && !arg0.method164(-114)) {
            return false;
        } else {
            if (!arg1 && var5 >= class501.field6888 - 16 && var5 <= class501.field6888 + 16 && var6 >= class377.field4997 - 16 && var6 <= class377.field4997 + 16) {
                if (class115.field1477) {
                    class99.field1197[class391.field5235++].method3356((byte) -101, arg0);
                    class391.field5235 %= class105.field1252;
                } else {
                    arg0.method177(class377.field4985, true);
                }
            }
            return true;
        }
    }
}
