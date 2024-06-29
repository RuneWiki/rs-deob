import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class15 {

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lna;")
    public static class26 field156 = class33.method219("uitext has incorrect number of strings", 108);

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lna;")
    public static class26 field158 = class33.method219("Farming shop", 100);

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lna;")
    public static class26 field154 = class33.method219("50(U", 124);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lna;")
    public static class26 field153 = class33.method219("Transportation", 105);

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field159;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[Lq;")
    public static class31[] field152;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 7)
    public static void method86(byte arg0) {
        field153 = null;
        field156 = null;
        field152 = null;
        field158 = null;
        field154 = null;
        if (arg0 < 50) {
            method86((byte) -122);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Lv;I[B)V", line = 23)
    public final void method87(class40 arg0, int arg1, byte[] arg2) {
        if (arg0.field530[arg0.field528] != 31 || arg0.field530[arg0.field528 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field159 == null) {
            this.field159 = new Inflater(true);
        }
        try {
            this.field159.setInput(arg0.field530, arg0.field528 + 10, -arg0.field528 + -8 + -10 + arg0.field530.length);
            this.field159.inflate(arg2);
        } catch (Exception var5) {
            this.field159.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 == -27819) {
            this.field159.reset();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "<init>", descriptor = "()V", line = 59)
    public class15() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ha", name = "<init>", descriptor = "(III)V", line = 102)
    private class15(int arg0, int arg1, int arg2) {
    }
}
