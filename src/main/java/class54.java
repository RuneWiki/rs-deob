import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class54 extends class206 {

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[B")
    public byte[] field888;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lwa;")
    private static class75 field895 = class66.method560("purple:", false);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lwa;")
    public static class75 field892 = field895;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lwa;")
    public static class75 field889 = field895;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lmc;")
    public static class170 field890 = new class170();

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
    public static int[] field898 = new int[1000];

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "J")
    public static long field899 = 0L;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Llj;")
    public static class46 field901 = null;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Lwa;")
    public static class75 field900 = class66.method560("Abbrechen", false);

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Lwa;")
    public static class75 field897 = class66.method560("<col=40ff00>", false);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lre;")
    public static class262 field896;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[[[S")
    public static short[][][] field887;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 4)
    public static void method392(int arg0) {
        field898 = null;
        field897 = null;
        field889 = null;
        if (arg0 != 11122) {
            return;
        }
        field900 = null;
        field895 = null;
        field901 = null;
        field890 = null;
        field896 = null;
        field887 = (short[][][]) null;
        field892 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 28)
    public static final void method393(byte arg0) {
        if (arg0 != 43) {
            method394(-92);
        }
        field891++;
        if (class176.field2965 != null) {
            class176.field2965.method1480(-117);
        }
        if (class64.field1112 != null) {
            class64.field1112.method1480(arg0 ^ 0xFFFFFFBB);
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 57)
    public static final void method394(int arg0) {
        if (arg0 != 0) {
            method394(-43);
        }
        field894++;
        class31.field451.method1201(-20111);
        class213.field3626.method1201(-20111);
        class12.field157.method1201(-20111);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lwa;Z)[Lwa;", line = 79)
    public static final class75[] method395(class75[] arg0, boolean arg1) {
        class75[] var2 = new class75[5];
        if (!arg1) {
            return (class75[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class66.method562((byte) 117, new class75[] { class67.method565(65, var3), class258.field4332 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class66.method562((byte) 118, new class75[] { var2[var3], arg0[var3] });
            }
        }
        field893++;
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([B)V", line = 102)
    public class54(byte[] arg0) {
        this.field888 = arg0;
    }
}
