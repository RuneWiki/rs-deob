import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class108 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "J")
    public long field1942 = 0L;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    public static int[] field1944 = new int[64];

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Leb;")
    public static class230 field1954 = class68.method589(0, "::fpson");

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lhj;")
    public class70 field1950;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lhj;")
    public class70 field1951;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field1952;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
    public static final int method886(byte arg0) {
        if (arg0 > -25) {
            field1943 = 73;
        }
        field1953++;
        return class24.field467;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfh;I)V")
    public static final void method887(class129 arg0, int arg1) {
        field1948++;
        class235 var2 = null;
        try {
            class193 var3 = arg0.method1020(0, "runescape");
            if (arg1 <= 32) {
                field1944 = null;
            }
            while (var3.field3421 == 0) {
                class52.method417((byte) -115, 1L);
            }
            if (var3.field3421 == 1) {
                var2 = (class235) var3.field3423;
                class14 var4 = class113.method909((byte) 119);
                var2.method1657(28825, var4.field318, 0, var4.field269);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1654(80);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field1944 = null;
        field1952 = null;
        if (arg0 == 90) {
            field1954 = null;
        }
    }
}
