import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class296 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4443 = 100;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lmg;")
    public static class488 field4445;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4444;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1855(int arg0) {
        field4445 = null;
        if (arg0 != 31) {
            field4443 = -50;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILje;)V", line = 21)
    public static final void method1856(int arg0, class178 arg1) {
        if (arg1.field2655 == 5 && arg1.field2605 != -1) {
            class201.method1366(class138.field1976, 95, arg1);
        }
        if (arg0 == 28214) {
            field4440++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lre;[BI)V", line = 39)
    public final void method1857(class446 arg0, byte[] arg1, int arg2) {
        if (arg2 != -1) {
            this.field4444 = null;
        }
        field4441++;
        if (arg0.field6316[arg0.field6315] != 31 || arg0.field6316[arg0.field6315 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4444 == null) {
            this.field4444 = new Inflater(true);
        }
        try {
            this.field4444.setInput(arg0.field6316, arg0.field6315 + 10, -arg0.field6315 + -8 - (10 - arg0.field6316.length));
            this.field4444.inflate(arg1);
        } catch (Exception var4) {
            this.field4444.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4444.reset();
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 69)
    public class296() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 73)
    public static final void method1858(boolean arg0) {
        field4442++;
        if (arg0) {
            field4445 = null;
        }
        boolean var1 = class100.field1419 != null || class346.field5284 > 0;
        if (var1) {
            class486.field6833 = 1;
        }
        if (class193.field2944 && field4445.method1100(false, 81) && class186.field2817 > 2) {
            if (var1) {
                class340.field5102 = (class146) class451.field6377.field5951.field435.field435;
            } else {
                class401.method2404(class260.field3872.method912(-14721), 0, (class146) class451.field6377.field5951.field435.field435, class260.field3872.method907(-83));
            }
        } else if (var1) {
            class340.field5102 = (class146) class451.field6377.field5951.field435;
        } else {
            class401.method2404(class260.field3872.method912(-14721), 0, (class146) class451.field6377.field5951.field435, class260.field3872.method907(-123));
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(III)V", line = 107)
    private class296(int arg0, int arg1, int arg2) {
    }
}
