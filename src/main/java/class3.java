import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public abstract class class3 extends class149 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Loaa;")
    public static class290 field24 = new class290(1, 2, 2, 0);

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field26;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Lq;")
    public abstract class429 method9(byte arg0);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIB)I")
    public static final int method10(int arg0, int arg1, byte arg2) {
        field25++;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        double var5 = Math.log((double) arg1) / Math.log(2.0D);
        int var7 = -43 % ((arg2 - 11) / 59);
        double var8 = (var3 - var5) * Math.random() + var5;
        return (int) (Math.pow(2.0D, var8) + 0.5D);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field24 = null;
        if (arg0 < -119) {
            field26 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
    public static final boolean method12(int arg0, int arg1, int arg2) {
        field23++;
        if (arg0 != 0) {
            field24 = null;
        }
        return (arg2 & 0x34) != 0;
    }
}
