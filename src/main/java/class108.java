import java.awt.Component;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class108 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Z")
    public static boolean field1918 = true;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lgb;")
    public static class213 field1922;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1921;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[[[Llf;")
    public static class228[][][] field1915;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 4)
    public static void method797(byte arg0) {
        field1915 = (class228[][][]) null;
        if (arg0 < -50) {
            field1922 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 19)
    public static final void method798(int arg0, int arg1, int arg2) {
        field1916++;
        if (arg1 != 22298 || class69.field1195 < 2 && class145.field2453 == 0 && !class130.field2293) {
            return;
        }
        class258 var3;
        if (class145.field2453 == 1 && class69.field1195 < 2) {
            var3 = class100.method755(arg1 - 22304, new class258[] { class218.field3770, class85.field1430, class64.field1135, class271.field4696 });
        } else if (class130.field2293 && class69.field1195 < 2) {
            var3 = class100.method755(-6, new class258[] { class109.field1924, class85.field1430, class96.field1684, class271.field4696 });
        } else {
            var3 = class63.method488(true, class69.field1195 - 1);
        }
        if (class69.field1195 > 2) {
            var3 = class100.method755(-6, new class258[] { var3, class19.field232, class218.method1481(-44, class69.field1195 - 2), class192.field3395 });
        }
        int var4 = class123.field2180.method250(var3, arg0 + 4, arg2 + 15, 16777215, 0, class193.field3407, class139.field2372);
        class93.method691(-127, class123.field2180.method252(var3) + var4, 15, arg0 + 4, arg2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILjava/awt/Component;I)Loj;", line = 60)
    public static final class261 method799(int arg0, int arg1, Component arg2, int arg3) {
        field1917++;
        try {
            if (arg0 != 15) {
                field1919 = 81;
            }
            Class var4 = Class.forName("tf");
            class261 var5 = (class261) var4.getDeclaredConstructor().newInstance();
            var5.method784(arg1, arg3, (byte) -59, arg2);
            return var5;
        } catch (Throwable var8) {
            class264 var7 = new class264();
            var7.method784(arg1, arg3, (byte) -59, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BILva;)V", line = 83)
    public final void method800(byte[] arg0, int arg1, class235 arg2) {
        field1920++;
        if (arg2.field4066[arg2.field4051] != 31 || arg2.field4066[arg2.field4051 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1921 == null) {
            this.field1921 = new Inflater(true);
        }
        try {
            this.field1921.setInput(arg2.field4066, arg2.field4051 + arg1, arg2.field4066.length + -arg2.field4051 + -18);
            this.field1921.inflate(arg0);
        } catch (Exception var5) {
            this.field1921.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1921.reset();
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 105)
    public class108() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V", line = 119)
    private class108(int arg0, int arg1, int arg2) {
    }
}
