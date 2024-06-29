import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 {

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "I")
    public static volatile int field239 = 0;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Lna;")
    public static class26 field242 = class6.method40("Spinning Wheel", 48);

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Lna;")
    public static class26 field243 = class6.method40("Axe Shop", 48);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field241;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Z")
    public static boolean field237;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "[B")
    public static byte[] field238;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BLfa;[B)V", line = 5)
    public final void method133(byte arg0, class10 arg1, byte[] arg2) {
        if (arg1.field122[arg1.field119] != 31 || arg1.field122[arg1.field119 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field241 == null) {
            this.field241 = new Inflater(true);
        }
        try {
            this.field241.setInput(arg1.field122, arg1.field119 + 10, -arg1.field119 - 10 + arg1.field122.length + -8);
            if (arg0 != -56) {
                field236 = -61;
            }
            this.field241.inflate(arg2);
        } catch (Exception var5) {
            this.field241.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field241.reset();
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IBILa;)Z", line = 31)
    public static final boolean method134(int arg0, byte arg1, int arg2, class1 arg3) {
        byte[] var4 = arg3.method9(arg2, arg0, false);
        if (var4 == null) {
            return false;
        }
        class1.method4(var4, (byte) 77);
        if (arg1 != 61) {
            field236 = 55;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IJ)V", line = 51)
    public static final void method135(int arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 != -24879) {
            method135(104, -62L);
        }
        if (arg1 % 10L == 0L) {
            class7.method46(arg1 - 1L, (byte) -101);
            class7.method46(1L, (byte) -69);
        } else {
            class7.method46(arg1, (byte) -84);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)V", line = 90)
    public static void method136(byte arg0) {
        field243 = null;
        field238 = null;
        field242 = null;
        if (arg0 != -24) {
            field242 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "()V", line = 110)
    public class23() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(III)V", line = 136)
    private class23(int arg0, int arg1, int arg2) {
    }
}
