import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class236 extends class86 {

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Lbe;")
    public class283 field3955;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Lbe;")
    private static class283 field3949 = class153.method941(22, "Loaded input handler");

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Lbe;")
    public static class283 field3952 = field3949;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[I")
    public static int[] field3957 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[Lei;")
    public static class184[] field3954 = new class184[50];

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Lbe;")
    public static class283 field3958 = class153.method941(125, ":assistreq:");

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Loh;")
    public static class15 field3951 = new class15(64);

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lek;")
    public static class172 field3950;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "[Lhe;")
    public static class87[] field3960;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 5)
    public static void method1576(int arg0) {
        field3952 = null;
        if (arg0 != 26732) {
            method1577(-43, (byte[]) null);
        }
        field3954 = null;
        field3950 = null;
        field3951 = null;
        field3958 = null;
        field3960 = null;
        field3957 = null;
        field3949 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[B)[B", line = 45)
    public static final byte[] method1577(int arg0, byte[] arg1) {
        field3959++;
        if (arg0 != 19) {
            method1577(-63, (byte[]) null);
        }
        class229 var2 = new class229(arg1);
        int var3 = var2.method1535((byte) 79);
        int var4 = var2.method1528(true);
        if (var4 < 0 || class107.field1832 != 0 && class107.field1832 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1505((byte) 77, 0, var7, var4);
            return var7;
        } else {
            int var5 = var2.method1528(true);
            if (var5 < 0 || !(class107.field1832 == 0 || class107.field1832 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class93.method594(var6, var5, arg1, var4, 9);
            } else {
                class229.field3866.method239(var6, arg0 ^ 0xFFFFFF96, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 102)
    public class236() {
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)I", line = 107)
    public static final int method1578(int arg0) {
        if (arg0 != -31624) {
            method1576(-44);
        }
        field3953++;
        return class92.field1547;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lbe;)V", line = 131)
    public class236(class283 arg0) {
        this.field3955 = arg0;
    }
}
