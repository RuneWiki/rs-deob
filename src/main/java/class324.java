import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class324 {

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Luc;")
    public static class27 field4790 = new class27(32, -1);

    @OriginalMember(owner = "client!du", name = "h", descriptor = "Z")
    public static boolean field4791 = false;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "F")
    public static float field4792;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Lfc;")
    public static class235 field4794;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lqba;")
    public static class371 field4784;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "[Lpu;")
    public static class517[] field4793;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)Z")
    public static final boolean method1964(int arg0, byte arg1) {
        if (arg1 < 33) {
            method1966(-112);
        }
        field4787++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!du", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4785++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljr;B)Lks;")
    public static final class402 method1965(class96 arg0, byte arg1) {
        field4788++;
        class80 var2 = class496.method2772((byte) -53, arg0);
        int var3 = arg0.method743((byte) -95);
        int var4 = -57 / ((arg1 + 69) / 44);
        int var5 = arg0.method743((byte) -8);
        int var6 = arg0.method743((byte) -41);
        int var7 = arg0.method743((byte) -82);
        int var8 = arg0.method743((byte) -85);
        int var9 = arg0.method743((byte) -69);
        return new class402(var2.field1108, var2.field1117, var2.field1116, var2.field1118, var2.field1113, var2.field1109, var2.field1110, var3, var5, var6, var7, var8, var9);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1966(int arg0) {
        if (arg0 != -3) {
            field4794 = null;
        }
        field4790 = null;
        field4794 = null;
        field4784 = null;
        field4793 = null;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
    public final int method1967(int arg0) {
        if (arg0 != -16946) {
            method1966(-43);
        }
        field4786++;
        return this.field4789;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class324(String arg0, int arg1) {
        this.field4789 = arg1;
    }
}
