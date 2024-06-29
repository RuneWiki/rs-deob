import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class398 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lwk;")
    public static class430 field5913 = new class430(1, 3);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ltm;")
    public static class334 field5917 = new class334(93, 8);

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[I")
    public static int[] field5920 = new int[1];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lkfa;")
    public static class384 field5919;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lcl;")
    public static class746 field5923;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5915;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[I")
    public static int[] field5918;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lofa;B)Lll;", line = 4)
    public static final class44 method2461(class301 arg0, byte arg1) {
        field5916++;
        if (arg1 != -20) {
            field5920 = null;
        }
        return new class44(arg0.method1977((byte) 85), arg0.method1977((byte) 45), arg0.method1977((byte) -115), arg0.method1977((byte) -120), arg0.method1977((byte) -123), arg0.method1977((byte) -115), arg0.method1977((byte) -122), arg0.method1977((byte) 17), arg0.method1952(22085), arg0.method1987(-87));
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 15)
    public static void method2462(int arg0) {
        field5923 = null;
        field5917 = null;
        field5918 = null;
        field5913 = null;
        field5920 = null;
        if (arg0 != 16217) {
            method2461(null, (byte) 98);
        }
        field5919 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B)[B", line = 30)
    public final byte[] method2463(int arg0, byte[] arg1) {
        field5912++;
        class301 var3 = new class301(arg1);
        var3.field4534 = arg1.length - 4;
        int var4 = var3.method1932(-27559);
        var3.field4534 = 0;
        byte[] var5 = new byte[var4];
        int var6 = -120 % ((arg0 + 1) / 44);
        this.method2464((byte) 125, var5, var3);
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 51)
    public class398() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[BLofa;)V", line = 58)
    public final void method2464(byte arg0, byte[] arg1, class301 arg2) {
        field5914++;
        if (arg2.field4543[arg2.field4534] != 31 || arg2.field4543[arg2.field4534 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5915 == null) {
            this.field5915 = new Inflater(true);
        }
        try {
            this.field5915.setInput(arg2.field4543, arg2.field4534 + 10, arg2.field4543.length + -8 + -arg2.field4534 + -10);
            this.field5915.inflate(arg1);
        } catch (Exception var4) {
            this.field5915.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != 125) {
            method2461(null, (byte) -90);
        }
        this.field5915.reset();
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(III)V", line = 87)
    private class398(int arg0, int arg1, int arg2) {
    }
}
