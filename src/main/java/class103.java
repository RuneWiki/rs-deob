import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class103 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lub;")
    public static class227 field1803 = class257.method1749("leuchten2:", 17263);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lub;")
    public static class227 field1804 = class257.method1749("<col=80ff00>", 17263);

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lub;")
    public static class227 field1809 = class257.method1749("(Udns", 17263);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[I")
    public static int[] field1805 = new int[128];

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ln;")
    public static class138 field1801;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1807;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)V")
    public static final void method628(byte arg0, int arg1) {
        field1799++;
        class221.field3742.method1727(true, arg1);
        if (arg0 >= -87) {
            method630((byte) -10, 39, 118, -50, -96);
        }
        class193.field3290.method1727(true, arg1);
        class180.field3089.method1727(true, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method629(byte arg0) {
        field1802++;
        if (arg0 != -72) {
            return;
        }
        int var1 = class242.field4205 - ((int) ((double) class178.field3029.field1977 / class4.field58));
        int var2 = (int) ((double) class178.field3029.field1977 / class4.field58) + class242.field4205;
        if (var1 < 0) {
            class109.field2045 = -1;
            class174.field2910 = -1;
            class242.field4205 = (int) ((double) class178.field3029.field1977 / class4.field58);
        }
        int var3 = class184.field3136 - ((int) ((double) class178.field3029.field1952 / class4.field58));
        if (var2 > class249.field4322) {
            class174.field2910 = -1;
            class109.field2045 = -1;
            class242.field4205 = class249.field4322 - ((int) ((double) class178.field3029.field1977 / class4.field58));
        }
        int var4 = class184.field3136 + ((int) ((double) class178.field3029.field1952 / class4.field58));
        if (var3 < 0) {
            class174.field2910 = -1;
            class184.field3136 = (int) ((double) class178.field3029.field1952 / class4.field58);
            class109.field2045 = -1;
        }
        if (class45.field753 < var4) {
            class174.field2910 = -1;
            class184.field3136 = class45.field753 - ((int) ((double) class178.field3029.field1952 / class4.field58));
            class109.field2045 = -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIII)V")
    public static final void method630(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1810++;
        int var5 = 0;
        if (arg0 != 120) {
            return;
        }
        while (var5 < class140.field2421) {
            if (arg4 < class36.field599[var5] + class116.field2137[var5] && arg4 + arg3 > class36.field599[var5] && (class54.field940[var5] + class18.field317[var5]) > arg1 && class18.field317[var5] < (arg1 + arg2)) {
                class10.field182[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class103() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BLnj;)V")
    public final void method631(int arg0, byte[] arg1, class226 arg2) {
        field1811++;
        if (arg2.field3901[arg2.field3879] != 31 || arg2.field3901[arg2.field3879 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1807 == null) {
            this.field1807 = new Inflater(true);
        }
        if (arg0 < 41) {
            method632(-86);
        }
        try {
            this.field1807.setInput(arg2.field3901, arg2.field3879 + 10, -arg2.field3879 - 10 + arg2.field3901.length + -8);
            this.field1807.inflate(arg1);
        } catch (Exception var4) {
            this.field1807.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1807.reset();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(III)V")
    private class103(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1804 = null;
        field1801 = null;
        field1809 = null;
        if (arg0 != -1) {
            field1801 = null;
        }
        field1803 = null;
        field1805 = null;
    }
}
