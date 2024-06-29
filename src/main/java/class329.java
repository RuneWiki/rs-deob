import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class329 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field4201 = 100;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lnd;")
    public static class547 field4206;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4207;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1907(int arg0, String arg1) {
        field4208++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class600.field8359; var2++) {
            if (arg1.equalsIgnoreCase(class207.field2748[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class380.field4847.field10062);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    public class329() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static void method1908(int arg0) {
        field4206 = null;
        if (arg0 <= 72) {
            field4203 = 87;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lsl;[BI)V")
    public final void method1909(class461 arg0, byte[] arg1, int arg2) {
        field4204++;
        if (arg2 != 21283) {
            return;
        }
        if (arg0.field6180[arg0.field6193] != 31 || arg0.field6180[arg0.field6193 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4207 == null) {
            this.field4207 = new Inflater(true);
        }
        try {
            this.field4207.setInput(arg0.field6180, arg0.field6193 + 10, arg0.field6180.length - 10 - (arg0.field6193 - -8));
            this.field4207.inflate(arg1);
        } catch (Exception var4) {
            this.field4207.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4207.reset();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "([BI)[B")
    public final byte[] method1910(byte[] arg0, int arg1) {
        field4202++;
        class461 var3 = new class461(arg0);
        var3.field6193 = arg0.length - 4;
        int var4 = var3.method2575(79);
        var3.field6193 = 0;
        byte[] var5 = new byte[var4];
        if (arg1 != 8) {
            this.method1910(null, -93);
        }
        this.method1909(var3, var5, 21283);
        return var5;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLbi;)V")
    public static final void method1911(byte arg0, class483 arg1) {
        if (class438.field5834 == null) {
            class126 var2 = new class126();
            byte[] var3 = var2.method948(128, 16, 128, -59072692);
            class438.field5834 = class431.method2466(-126, false, var3);
        }
        field4205++;
        if (arg0 >= -74) {
            return;
        }
        if (class702.field9766 == null) {
            class747 var4 = new class747();
            byte[] var5 = var4.method4157(128, 16, 128, 85);
            class702.field9766 = class431.method2466(124, false, var5);
        }
        class338 var6 = arg1.field6777;
        if (var6.method1946(26780) && class211.field2794 == null) {
            byte[] var7 = class287.method1706(0.6F, 0.5F, 16, 8, 4.0F, 16.0F, (byte) -18, new class737(419684), 4.0F, 128, 128);
            class211.field2794 = class431.method2466(114, false, var7);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(III)V")
    private class329(int arg0, int arg1, int arg2) {
    }
}
