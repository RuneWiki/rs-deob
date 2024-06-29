import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class551 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field7916 = -1;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ldt;")
    public static class252 field7918 = new class252("game4", "Game 4", 3);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7917;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field7919;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BI)[B", line = 4)
    public final byte[] method3287(byte[] arg0, int arg1) {
        field7920++;
        class494 var3 = new class494(arg0);
        if (arg1 != 10329) {
            return null;
        }
        var3.field7042 = arg0.length - 4;
        int var4 = var3.method2980((byte) -33);
        var3.field7042 = 0;
        byte[] var5 = new byte[var4];
        this.method3289(var5, 124, var3);
        return var5;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 24)
    public static void method3288(byte arg0) {
        if (arg0 == -117) {
            field7918 = null;
            field7919 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BILso;)V", line = 41)
    public final void method3289(byte[] arg0, int arg1, class494 arg2) {
        field7915++;
        if (arg2.field7050[arg2.field7042] != 31 || arg2.field7050[arg2.field7042 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7917 == null) {
            this.field7917 = new Inflater(true);
        }
        if (arg1 < 54) {
            return;
        }
        try {
            this.field7917.setInput(arg2.field7050, arg2.field7042 + 10, -10 - (8 - arg2.field7050.length) + -arg2.field7042);
            this.field7917.inflate(arg0);
        } catch (Exception var4) {
            this.field7917.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7917.reset();
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 75)
    public class551() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(III)V", line = 81)
    private class551(int arg0, int arg1, int arg2) {
    }
}
