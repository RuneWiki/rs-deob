import java.awt.Component;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static volatile int field8 = 0;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Z")
    public static boolean field11 = true;

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "I")
    public static int field16 = 0;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Lt;")
    public static class36 field13 = class3.method8(13631, "overlay)3dat");

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "I")
    public static int field19 = -1;

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "I")
    public static int field18 = 0;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lv;")
    public static class40 field9;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field15;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IB)Lt;", line = 14)
    public static final class36 method2(int arg0, byte arg1) {
        class36 var2 = new class36();
        var2.field491 = new byte[arg0];
        var2.field492 = 0;
        if (arg1 != -67) {
            field14 = -51;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 34)
    public static void method3(byte arg0) {
        if (arg0 < 37) {
            method4(null, (byte) 54, 3, -92);
        }
        field9 = null;
        field13 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/awt/Component;BII)Lv;", line = 52)
    public static final class40 method4(Component arg0, byte arg1, int arg2, int arg3) {
        int var4 = 118 / ((47 - arg1) / 57);
        try {
            Class var5 = Class.forName("oa");
            class40 var6 = (class40) var5.getDeclaredConstructor().newInstance();
            var6.method167(arg2, arg3, 0, arg0);
            return var6;
        } catch (Throwable var9) {
            class28 var8 = new class28();
            var8.method167(arg2, arg3, 0, arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "(III)V", line = 102)
    private class2(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lua;[BB)V", line = 126)
    public final void method5(class39 arg0, byte[] arg1, byte arg2) {
        if (arg0.field514[arg0.field519] != 31 || arg0.field514[arg0.field519 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field15 == null) {
            this.field15 = new Inflater(true);
        }
        try {
            this.field15.setInput(arg0.field514, arg0.field519 + 10, arg0.field514.length + -arg0.field519 + -10 + -8);
            int var4 = -82 % ((arg2 - 23) / 62);
            this.field15.inflate(arg1);
        } catch (Exception var6) {
            this.field15.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field15.reset();
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "()V", line = 151)
    public class2() {
        this(-1, 1000000, 1000000);
    }
}
