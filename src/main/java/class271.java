import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class271 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public static int[] field4320 = new int[50];

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4318 = "slide:";

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "F")
    public static float field4322;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field4321;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[[[B")
    public static byte[][][] field4319;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)J", line = 8)
    public static final long method1850(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null || var3.field4140 == null ? 0L : var3.field4140.field5260;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Loc;", line = 25)
    public static final class158 method1851(int arg0, int arg1) {
        field4316++;
        class158 var2 = (class158) class230.field3836.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class338.field5412.method441(false, class133.method1090(-1213575384, arg0), class328.method2278(255, arg0));
        class158 var4 = new class158();
        var4.field2792 = arg0;
        if (arg1 != 0) {
            method1850(-19, 112, 34);
        }
        if (var3 != null) {
            var4.method1264(new class336(var3), arg1 + 65);
        }
        class230.field3836.method465(var4, (long) arg0, (byte) 45);
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 56)
    public static void method1852(byte arg0) {
        field4318 = null;
        field4321 = null;
        field4320 = null;
        if (arg0 > 111) {
            field4319 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 70)
    public static final void method1853(int arg0) {
        field4317++;
        class247.field4011++;
        class341.field5443.method26(105, 7);
        for (class228 var1 = (class228) class172.field2972.method736(2); var1 != null; var1 = (class228) class172.field2972.method727((byte) -110)) {
            if (var1.field3824 == 0) {
                class58.method529(true, var1, 50);
            }
        }
        if (class107.field1783 != null) {
            class258.method1793(class107.field1783, 0);
            class107.field1783 = null;
        }
        int var2 = -34 / ((arg0 + 40) / 63);
    }
}
