import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class23 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lhh;")
    public static class163 field373 = class137.method1065("Freie Welt", 17);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field374 = 2;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lhh;")
    public static class163 field372 = class137.method1065(")1 ", 17);

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lhh;")
    public static class163 field379 = class137.method1065("blaugr-Un:", 17);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lhh;")
    public static class163 field371 = class137.method1065(")3runescape)3com", 17);

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
    public static int[] field375 = new int[500];

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
    public static boolean field382 = false;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Led;")
    public static class255 field378;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lqh;")
    public static class69 field380;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field381;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lpa;IB)Lne;")
    public static final class94 method154(class123 arg0, int arg1, byte arg2) {
        if (arg2 == -43) {
            field383++;
            return class131.method1038(5825, arg1, arg0) ? class196.method1415(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method155(boolean arg0) {
        field373 = null;
        field379 = null;
        if (!arg0) {
            field371 = null;
        }
        field375 = null;
        field380 = null;
        field372 = null;
        field378 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class23() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static final void method156(byte arg0) {
        class247 var1 = (class247) class21.field334.method1017(51);
        if (arg0 > -97) {
            return;
        }
        while (var1 != null) {
            if (var1.field4354) {
                var1.method1702(-19613);
            }
            var1 = (class247) class21.field334.method1016((byte) -31);
        }
        for (class247 var2 = (class247) class57.field943.method1017(117); var2 != null; var2 = (class247) class57.field943.method1016((byte) -31)) {
            if (var2.field4354) {
                var2.method1702(-19613);
            }
        }
        field376++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILpg;[B)V")
    public final void method157(int arg0, class81 arg1, byte[] arg2) {
        field377++;
        if (arg0 != 14341) {
            method155(true);
        }
        if (arg1.field1562[arg1.field1541] != 31 || arg1.field1562[arg1.field1541 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field381 == null) {
            this.field381 = new Inflater(true);
        }
        try {
            this.field381.setInput(arg1.field1562, arg1.field1541 + 10, -8 - arg1.field1541 + arg1.field1562.length + -10);
            this.field381.inflate(arg2);
        } catch (Exception var4) {
            this.field381.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field381.reset();
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(III)V")
    private class23(int arg0, int arg1, int arg2) {
    }
}
