import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class124 extends class107 {

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ldf;")
    public static class51 field2099 = class46.method233("Zugewiesener Speicher)3", 100);

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lbf;")
    public class188 field2102;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lja;")
    public class55 field2100;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[B")
    public byte[] field2098;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldf;I)Ldf;")
    public static final class51 method927(class51 arg0, int arg1) {
        if (arg1 >= -4) {
            field2099 = null;
        }
        field2108++;
        int var2 = class90.method678((byte) -73, arg0);
        return var2 == -1 ? class36.field562 : class259.field4530.field2342[var2].method306(class85.field1423, class125.field2118, 0);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static final void method928(byte arg0) {
        if (arg0 != 83) {
            method928((byte) 63);
        }
        class166.field2697.method1353(-104);
        field2097++;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public static final void method929(byte arg0) {
        field2103++;
        class45.field718 = null;
        class161.field2642 = null;
        class3.field25 = null;
        if (arg0 != -106) {
            field2104 = 31;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static final void method930(byte arg0) {
        if (class115.field1952 == null || class118.field1975 == null) {
            class115.field1952 = new int[256];
            class118.field1975 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class115.field1952[var1] = (int) (Math.sin(var2) * 4096.0D);
                class118.field1975[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2101++;
        if (arg0 > -58) {
            field2105 = -34;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2099 = null;
        if (arg0 < 19) {
            field2104 = 76;
        }
    }
}
