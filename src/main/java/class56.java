import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class56 {

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public static int[] field966 = new int[2];

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lmb;")
    private static class96 field961 = class243.method1708("Aug", (byte) 93);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lmb;")
    private static class96 field967 = class243.method1708("Feb", (byte) 118);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lmb;")
    private static class96 field973 = class243.method1708("May", (byte) 99);

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lmb;")
    private static class96 field974 = class243.method1708("Jul", (byte) 103);

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lmb;")
    private static class96 field965 = class243.method1708("Apr", (byte) 117);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lmb;")
    public static class96 field969 = class243.method1708("Fertigkeit: ", (byte) 119);

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lmb;")
    public static class96 field981 = class243.method1708(" <col=00ff80>", (byte) 95);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lmb;")
    private static class96 field964 = class243.method1708("Dec", (byte) 104);

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Z")
    public static boolean field979 = false;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field972 = 0;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Lmb;")
    private static class96 field983 = class243.method1708(" has logged in)3", (byte) 97);

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lmb;")
    public static class96 field976 = field983;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lmb;")
    private static class96 field971 = class243.method1708("Oct", (byte) 91);

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lmb;")
    private static class96 field984 = class243.method1708("Jun", (byte) 116);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lmb;")
    private static class96 field959 = class243.method1708("Jan", (byte) 94);

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "Lmb;")
    public static class96 field989 = class243.method1708("Spielwelt erstellt)3", (byte) 115);

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lmb;")
    public static class96 field987 = class243.method1708("Schlie-8en", (byte) 93);

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lmb;")
    private static class96 field975 = class243.method1708("Mar", (byte) 99);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lmb;")
    private static class96 field960 = class243.method1708("Nov", (byte) 122);

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "Lmb;")
    private static class96 field978 = class243.method1708("Sep", (byte) 111);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[Lmb;")
    public static class96[] field962 = new class96[] { field959, field967, field975, field965, field973, field984, field974, field961, field978, field971, field960, field964 };

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[B")
    public byte[] field980;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "[B")
    public byte[] field990;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method415(int arg0, Component arg1) {
        field977++;
        if (arg0 != 2) {
            field972 = -103;
        }
        Method var2 = class123.field2291;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class60.field1037);
        arg1.addFocusListener(class60.field1037);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method416(byte arg0) {
        field971 = null;
        field976 = null;
        field975 = null;
        field959 = null;
        if (arg0 != 62) {
            method416((byte) 93);
        }
        field978 = null;
        field983 = null;
        field966 = null;
        field967 = null;
        field974 = null;
        field965 = null;
        field981 = null;
        field960 = null;
        field989 = null;
        field962 = null;
        field973 = null;
        field987 = null;
        field984 = null;
        field964 = null;
        field961 = null;
        field969 = null;
    }
}
