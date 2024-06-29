import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class77 extends class284 {

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "[I")
    public static int[] field1098 = new int[50];

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "Lwm;")
    public static class152 field1097 = class157.method1048("Fps:", 117);

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "[Luj;")
    public static class141[] field1100 = new class141[14];

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "I")
    public static int field1095 = 0;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!vm", name = "eb", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "Loe;")
    public static class127 field1091;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "Lah;")
    public static class205 field1089;

    @OriginalMember(owner = "client!vm", name = "db", descriptor = "Lsd;")
    public class27 field1102;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "[B")
    public byte[] field1094;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V", line = 5)
    public static final void method508(int arg0) {
        class58.method384();
        field1090++;
        int var1 = 0;
        int var2 = -23 / ((22 - arg0) / 33);
        while (var1 < 4) {
            class135.field2076[var1].method167(-77);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)I", line = 23)
    public final int method509(byte arg0) {
        field1103++;
        if (this.field4823) {
            return 0;
        } else if (arg0 >= -119) {
            return -11;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)[B", line = 39)
    public final byte[] method510(byte arg0) {
        if (arg0 != -128) {
            field1098 = (int[]) null;
        }
        field1101++;
        if (this.field4823) {
            throw new RuntimeException();
        }
        return this.field1094;
    }

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V", line = 62)
    public static void method511(int arg0) {
        field1097 = null;
        field1100 = null;
        field1091 = null;
        field1098 = null;
        field1089 = null;
        if (arg0 != 0) {
            method511(-122);
        }
    }
}
