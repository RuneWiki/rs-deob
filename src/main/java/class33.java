import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 {

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "I")
    public static volatile int field451 = -1;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "La;")
    private static class1 field452 = class3.method36("POH Portal", -87);

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "La;")
    private static class1 field457 = class3.method36("Hunter Training", -95);

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "La;")
    private static class1 field455 = class3.method36("Herbalist", -116);

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "La;")
    private static class1 field453 = class3.method36("Sword Shop", -89);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "La;")
    private static class1 field449 = class3.method36("Guide", -123);

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "La;")
    private static class1 field461 = class3.method36("Mining Shop", -90);

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "La;")
    private static class1 field462 = class3.method36("Transportation", -82);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "La;")
    private static class1 field454 = class3.method36("Platelegs Shop", -124);

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "La;")
    private static class1 field463 = class3.method36("Tannery", -88);

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "Lv;")
    public static class40 field464;

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field460;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "[B")
    public static byte[] field450;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "[[Lv;")
    public static class40[][] field459;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)La;", line = 14)
    public static final class1 method220(int arg0, int arg1) {
        class1 var2 = new class1();
        if (arg1 == -26968) {
            var2.field5 = new byte[arg0];
            var2.field6 = 0;
            return var2;
        } else {
            return (class1) null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "()V", line = 29)
    public class33() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BI)Lka;", line = 35)
    public static final class20 method221(byte[] arg0, int arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg1 <= 11) {
            return (class20) null;
        } else {
            class20 var2 = new class20(arg0, class2.field22, class30.field411, class29.field403, class30.field410, class27.field378, class13.field123);
            class25.method171((byte) 119);
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B[BLua;)V", line = 54)
    public final void method222(byte arg0, byte[] arg1, class39 arg2) {
        if (arg2.field497[arg2.field493] != 31 || arg2.field497[arg2.field493 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg0 != -107) {
            method223((byte) -120, null, null, null, null);
        }
        if (this.field460 == null) {
            this.field460 = new Inflater(true);
        }
        try {
            this.field460.setInput(arg2.field497, arg2.field493 + 10, arg2.field497.length + -8 + -arg2.field493 + -10);
            this.field460.inflate(arg1);
        } catch (Exception var5) {
            this.field460.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field460.reset();
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BLq;La;Lq;La;)Lka;", line = 84)
    public static final class20 method223(byte arg0, class31 arg1, class1 arg2, class31 arg3, class1 arg4) {
        if (arg0 != 46) {
            method225(-105);
        }
        int var5 = arg1.method196(-2, arg4);
        int var6 = arg1.method201(arg0 - 46, var5, arg2);
        return class31.method195(-86, var5, var6, arg3, arg1);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 103)
    public static void method224(int arg0) {
        field449 = null;
        if (arg0 <= 62) {
            field463 = null;
        }
        field452 = null;
        field463 = null;
        field461 = null;
        field457 = null;
        field453 = null;
        field462 = null;
        field455 = null;
        field450 = null;
        field464 = null;
        field459 = null;
        field454 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)[La;", line = 166)
    public static final class1[] method225(int arg0) {
        if (arg0 != 10114) {
            field459 = null;
        }
        class1[] var10000 = new class1[] { class9.field94, field453, class3.field27, class1.field10, class10.field107, class13.field120, class5.field53, class30.field418, class7.field71, class25.field335, class2.field18, class26.field364, mapview.field254, class21.field198, class1.field9, field454, class28.field394, class40.field513, class6.field67, class40.field510, field455, class1.field8, class27.field384, class9.field89, class3.field30, class40.field511, class21.field193, class31.field425, class13.field122, class24.field229, class29.field404, class2.field24, class41.field527, field463, class30.field407, class27.field379, class3.field34, class26.field370, class27.field377, class8.field83, class6.field61, class9.field93, class25.field326, class14.field131, field461, mapview.field312, class10.field98, class11.field113, class39.field492, class14.field129, class9.field92, class10.field105, class30.field406, class27.field375, class30.field419, field449, field462, field452, class35.field474, class40.field503, class21.field202, class2.field21, class31.field429, field457, class31.field429, class39.field500, class31.field429, class14.field125, class26.field368, class31.field429, mapview.field232, class7.field73, class31.field429, class8.field79, class5.field52, class31.field429, class31.field429 };
        if (class28.field397) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "(III)V", line = 195)
    private class33(int arg0, int arg1, int arg2) {
    }
}
