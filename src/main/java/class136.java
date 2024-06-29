import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class136 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "[[[I")
    public static int[][][] field2001 = new int[2][][];

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "J")
    public static long field2004 = 0L;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        if (arg0 > -84) {
            method1066(null, 119);
        }
        field2001 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLgk;Lgk;)V")
    public static final void method1065(boolean arg0, class503 arg1, class503 arg2) {
        if (!arg0) {
            method1064((byte) 88);
        }
        field2000++;
        if (arg2.field6967 != null) {
            arg2.method2922((byte) -76);
        }
        arg2.field6967 = arg1.field6967;
        arg2.field6970 = arg1;
        arg2.field6967.field6970 = arg2;
        arg2.field6970.field6967 = arg2;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljp;I)Lkv;")
    public static final class284 method1066(class376 arg0, int arg1) {
        field2002++;
        int var2 = arg0.method2398(-1372747256);
        if (arg1 != 0) {
            return null;
        }
        class564 var3 = class706.method3954(arg1 + 87)[arg0.method2398(-1372747256)];
        class631 var4 = class709.method3970(-1)[arg0.method2398(arg1 ^ 0xAE2D8A08)];
        int var5 = arg0.method2355(3);
        int var6 = arg0.method2355(arg1 + 3);
        int var7 = arg0.method2359(arg1 - 1);
        int var8 = arg0.method2359(-1);
        int var9 = arg0.method2384(arg1 + 6);
        int var10 = arg0.method2384(120);
        int var11 = arg0.method2384(125);
        boolean var12 = arg0.method2398(-1372747256) == 1;
        return new class284(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }
}
