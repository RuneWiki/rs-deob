import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class45 extends class61 {

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Leb;")
    public class230 field804;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Leb;")
    public static class230 field799 = class68.method589(0, "sch-Utteln:");

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[Led;")
    public static class177[] field793 = new class177[4];

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Leb;")
    public static class230 field798 = class68.method589(0, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[[B")
    public static byte[][] field797 = new byte[1000][];

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "Leb;")
    public static class230 field802 = class68.method589(0, "_");

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "Leb;")
    public static class230 field795 = class68.method589(0, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Lv;")
    public static class147 field803 = new class147(64);

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Leh;")
    public static class80 field800;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)Z")
    public static final boolean method384(int arg0, int arg1) {
        field794++;
        int var2 = 44 / ((arg0 + 64) / 54);
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Leh;")
    public static final class80 method385(int arg0) {
        field801++;
        byte[] var1 = class215.field3725[0];
        int var2 = class7.field124[0] * class273.field4806[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class263.field4676[class189.method1350(255, var1[var4])];
        }
        if (arg0 >= -61) {
            field802 = null;
        }
        class10 var5 = new class10(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[0], var3);
        class78.method650(true);
        return var5;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field803 = null;
        field802 = null;
        field799 = null;
        field793 = null;
        field797 = null;
        field798 = null;
        field800 = null;
        if (arg0 != -40) {
            method386((byte) -99);
        }
        field795 = null;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Leb;I)V")
    public class45(class230 arg0, int arg1) {
        this.field804 = arg0;
    }
}
