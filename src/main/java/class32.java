import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class32 extends class123 {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Ls;")
    public class288 field493;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Z")
    public static boolean field494 = false;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Ljava/lang/String;")
    public static String field495 = null;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field496 = -1;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
    public static int[] field500 = new int[2];

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 4)
    public static void method285(int arg0) {
        field500 = null;
        if (arg0 == -256) {
            field495 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[B", line = 16)
    public static final byte[] method286(byte arg0, int arg1) {
        if (arg0 < 26) {
            field498 = -115;
        }
        field499++;
        class291 var2 = (class291) class74.field1136.method1183((long) arg1, (byte) -113);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class64.method509(var7, var3, 92);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class291(var4);
            class74.field1136.method1182((byte) 98, (long) arg1, var2);
        }
        return var2.field4567;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ls;)V", line = 62)
    public class32(class288 arg0) {
        this.field493 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lpk;B)V", line = 85)
    public static final void method287(class120 arg0, byte arg1) {
        class102.field1690 = arg0;
        field497++;
        if (arg1 <= 42) {
            field494 = true;
        }
    }
}
