import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class580 {

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "[I")
    public static int[] field7975 = new int[500];

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "[S")
    public static short[] field7979 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7980;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ldaa;[BI)V")
    public final void method3318(class11 arg0, byte[] arg1, int arg2) {
        int var4 = -59 % ((arg2 - 66) / 56);
        field7974++;
        if (arg0.field138[arg0.field165] != 31 || arg0.field138[arg0.field165 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7980 == null) {
            this.field7980 = new Inflater(true);
        }
        try {
            this.field7980.setInput(arg0.field138, arg0.field165 + 10, arg0.field138.length + -10 + -arg0.field165 + -8);
            this.field7980.inflate(arg1);
        } catch (Exception var5) {
            this.field7980.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7980.reset();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3319(int arg0) {
        field7979 = null;
        field7975 = null;
        if (arg0 != 10731) {
            method3319(-41);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)I")
    public static final int method3320(int arg0, int arg1) {
        field7977++;
        return arg1 == 1336636295 ? arg0 >>> 7 : 55;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class580() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(III)V")
    private class580(int arg0, int arg1, int arg2) {
    }
}
