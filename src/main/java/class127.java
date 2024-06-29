import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class127 {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Lqt;")
    public static class459 field1989 = new class459(12, 16);

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1992;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[I")
    public static int[] field1990;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 9)
    public static void method940(byte arg0) {
        field1990 = null;
        field1989 = null;
        if (arg0 != 23) {
            method942(108, -6, 87, 78);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILwn;[B)V", line = 23)
    public final void method941(int arg0, class519 arg1, byte[] arg2) {
        field1987++;
        if (arg1.field7545[arg1.field7558] != 31 || arg1.field7545[arg1.field7558 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1992 == null) {
            this.field1992 = new Inflater(true);
        }
        try {
            this.field1992.setInput(arg1.field7545, arg1.field7558 + 10, arg1.field7545.length + arg0 + -arg1.field7558 + -10);
            this.field1992.inflate(arg2);
        } catch (Exception var4) {
            this.field1992.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1992.reset();
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V", line = 46)
    public class127() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)I", line = 55)
    public static final int method942(int arg0, int arg1, int arg2, int arg3) {
        field1988++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg1 <= 57) {
                method940((byte) 69);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(III)V", line = 85)
    private class127(int arg0, int arg1, int arg2) {
    }
}
