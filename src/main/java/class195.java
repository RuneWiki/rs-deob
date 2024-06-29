import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class195 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lmb;")
    public static class96 field3352 = class243.method1708("Lade Liste der Welten", (byte) 102);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lmb;")
    public static class96 field3356 = class243.method1708("1", (byte) 121);

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
    public static boolean field3359 = false;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Luc;")
    public static class11 field3358 = new class11(200);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3360;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[Lsa;")
    public static class70[] field3351;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B[BLrg;)V")
    public final void method1357(byte arg0, byte[] arg1, class239 arg2) {
        field3353++;
        if (arg2.field4144[arg2.field4124] != 31 || arg2.field4144[arg2.field4124 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3360 == null) {
            this.field3360 = new Inflater(true);
        }
        try {
            this.field3360.setInput(arg2.field4144, arg2.field4124 + 10, arg2.field4144.length + -8 + -arg2.field4124 + -10);
            this.field3360.inflate(arg1);
        } catch (Exception var4) {
            this.field3360.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != 118) {
            field3358 = null;
        }
        this.field3360.reset();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3351 = null;
        if (arg0 == -3288) {
            field3358 = null;
            field3356 = null;
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public static final void method1359(int arg0, byte arg1) {
        field3355++;
        if (arg1 != -18 || arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class242.method1702((byte) 94);
        } else if (arg0 == 2) {
            class235.method1596(3);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method1360(int arg0) {
        if (arg0 != 0) {
            method1359(32, (byte) 10);
        }
        class241.field4183.method96(false);
        field3354++;
        class77.field1315.method96(false);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class195() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(III)V")
    private class195(int arg0, int arg1, int arg2) {
    }
}
