import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class252 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lqd;")
    private static class40 field4179 = class147.method1106("Loading fonts )2 ", (byte) -89);

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lqd;")
    public static class40 field4180 = field4179;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lqd;")
    public static class40 field4183 = class147.method1106("3D)2Softwarebibliothek gestartet)3", (byte) -70);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lqd;")
    public static class40 field4182 = class147.method1106("p11_full", (byte) -67);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lqd;")
    public static class40 field4175 = class147.method1106("Lade Titelbild )2 ", (byte) -84);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lcm;")
    public static class185 field4189;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lce;")
    public static class239 field4184;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lhl;")
    public static class61 field4181;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4176;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field4178;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[I")
    public static int[][][] field4188;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BLsd;I)V", line = 11)
    public final void method1778(byte[] arg0, class26 arg1, int arg2) {
        field4187++;
        if (arg1.field472[arg1.field478] != 31 || arg1.field472[arg1.field478 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4176 == null) {
            this.field4176 = new Inflater(true);
        }
        try {
            this.field4176.setInput(arg1.field472, arg1.field478 + 10, arg1.field472.length + -arg1.field478 + -18);
            if (arg2 != -8779) {
                method1780(95);
            }
            this.field4176.inflate(arg0);
        } catch (Exception var5) {
            this.field4176.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4176.reset();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 36)
    public class252() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method1779(boolean arg0) {
        field4177++;
        class156.field2616.method1349(true);
        if (arg0) {
            field4183 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 71)
    public static void method1780(int arg0) {
        field4178 = null;
        field4175 = null;
        if (arg0 != 0) {
            field4180 = (class40) null;
        }
        field4182 = null;
        field4189 = null;
        field4183 = null;
        field4180 = null;
        field4181 = null;
        field4184 = null;
        field4179 = null;
        field4188 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V", line = 108)
    private class252(int arg0, int arg1, int arg2) {
    }
}
