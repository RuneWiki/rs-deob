import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class97 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lpw;")
    public static class705 field1166 = new class705();

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lct;")
    public static class144 field1170;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1165;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[I")
    public static int[] field1172;

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
    public class97() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIII)I")
    public static final int method710(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -30) {
            field1166 = null;
        }
        field1167++;
        int var4 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        int var5 = 255 - arg0;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z[BLee;)V")
    public final void method711(boolean arg0, byte[] arg1, class675 arg2) {
        field1164++;
        if (arg2.field9154[arg2.field9146] != 31 || arg2.field9154[arg2.field9146 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1165 == null) {
            this.field1165 = new Inflater(true);
        }
        try {
            this.field1165.setInput(arg2.field9154, arg2.field9146 + 10, arg2.field9154.length - 8 - 10 - arg2.field9146);
            if (arg0) {
                method710(44, -10, 65, 26);
            }
            this.field1165.inflate(arg1);
        } catch (Exception var4) {
            this.field1165.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1165.reset();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([BB)[B")
    public final byte[] method712(byte[] arg0, byte arg1) {
        field1169++;
        class675 var3 = new class675(arg0);
        if (arg1 != -73) {
            return null;
        }
        var3.field9146 = arg0.length - 4;
        int var4 = var3.method3738((byte) 105);
        byte[] var5 = new byte[var4];
        var3.field9146 = 0;
        this.method711(false, var5, var3);
        return var5;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method713(int arg0) {
        field1170 = null;
        field1166 = null;
        if (arg0 != 16711680) {
            field1172 = null;
        }
        field1172 = null;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method714(int arg0) {
        field1171++;
        if (class436.field6192 || class231.field3108 == null) {
            return "";
        } else if (arg0 <= 116) {
            return null;
        } else if ((class231.field3108.field470 == null || class231.field3108.field470.length() == 0) && class231.field3108.field467 != null && class231.field3108.field467.length() > 0) {
            return class231.field3108.field467;
        } else {
            return class231.field3108.field470;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(III)V")
    private class97(int arg0, int arg1, int arg2) {
    }
}
