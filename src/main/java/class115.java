import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class115 {

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1468 = 2;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lim;")
    public static class353 field1465 = new class353(112, 6);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lom;")
    public static class333 field1466;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1469;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
    public static int[] field1470;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lqa;I)V")
    public static final void method614(class167 arg0, int arg1) {
        if (arg1 >= -118) {
            field1470 = null;
        }
        if (class264.field3373) {
            class171.method1042(arg0, false);
        } else {
            class633.method3664(1, arg0);
        }
        field1467++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BLge;B)V")
    public final void method615(byte[] arg0, class551 arg1, byte arg2) {
        field1464++;
        int var4 = 13 / ((arg2 - 45) / 56);
        if (arg1.field7693[arg1.field7707] != 31 || arg1.field7693[arg1.field7707 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1469 == null) {
            this.field1469 = new Inflater(true);
        }
        try {
            this.field1469.setInput(arg1.field7693, arg1.field7707 + 10, -8 - (arg1.field7707 + 10 - arg1.field7693.length));
            this.field1469.inflate(arg0);
        } catch (Exception var5) {
            this.field1469.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1469.reset();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method616(int arg0, int arg1, int arg2) {
        field1463++;
        class632 var3 = class641.method3699(-106, arg2, arg0);
        var3.method3656(0);
        var3.field9198 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method617(byte arg0) {
        field1462++;
        if (arg0 != -75) {
            method617((byte) 70);
        }
        class77.method444(0);
        class147.method802((byte) 49);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class115() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method618(byte arg0) {
        if (arg0 != 33) {
            field1465 = null;
        }
        field1470 = null;
        field1466 = null;
        field1465 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V")
    private class115(int arg0, int arg1, int arg2) {
    }
}
