import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class130 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lma;")
    public static class5 field1951 = class12.method119("Angreifen", (byte) 55);

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field1954 = 2;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field1955 = 127;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[I")
    public static int[] field1953 = new int[32];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lfi;")
    public static class222[] field1943;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLii;)V", line = 8)
    public final void method859(byte arg0, class221 arg1) {
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                if (arg0 != 11) {
                    field1951 = (class5) null;
                }
                field1952++;
                return;
            }
            this.method862(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhf;I)V", line = 40)
    public static final void method860(class154 arg0, int arg1) {
        field1950++;
        class291 var2 = null;
        try {
            class32 var3 = arg0.method990("runescape", true);
            if (arg1 != 0) {
                field1951 = (class5) null;
            }
            while (var3.field497 == 0) {
                class116.method759(-1, 1L);
            }
            if (var3.field497 == 1) {
                var2 = (class291) var3.field496;
                class221 var4 = class21.method167(0);
                var2.method1965(-1, 0, var4.field3610, var4.field3617);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1966(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 86)
    public static void method861(int arg0) {
        field1951 = null;
        field1953 = null;
        field1943 = null;
        if (arg0 != 127) {
            field1955 = -68;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLii;)V", line = 104)
    private final void method862(int arg0, boolean arg1, class221 arg2) {
        field1944++;
        if (arg0 == 1) {
            this.field1949 = arg2.method1524((byte) 115);
            this.field1946 = arg2.method1509(arg1);
            this.field1945 = arg2.method1509(true);
        }
        if (!arg1) {
            field1954 = 32;
        }
    }
}
