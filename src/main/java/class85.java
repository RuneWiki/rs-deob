import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class85 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Lig;")
    public class195 field1360;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[Lwl;")
    public static class100[] field1362 = new class100[14];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lul;")
    public static class51 field1359 = new class51(5);

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lc;")
    public static class331 field1366 = new class331();

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Llg;")
    public static class137 field1364;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lwe;")
    public static class59 field1369;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "[[B")
    public static byte[][] field1367;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 12)
    public static void method764(int arg0) {
        field1364 = null;
        field1366 = null;
        if (arg0 != 5) {
            method765((byte) 66, -118);
        }
        field1362 = null;
        field1367 = (byte[][]) null;
        field1369 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)I", line = 37)
    public static final int method765(byte arg0, int arg1) {
        int var2 = 121 % ((-arg0 - 16) / 41);
        field1368++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V", line = 45)
    public class85(int arg0, int arg1, int arg2, int arg3) {
        class195 var5 = class283.method1934(arg0, 0);
        this.field1363 = arg2;
        this.field1361 = arg1;
        this.field1365 = arg3;
        if (class43.field680 || var5.field3320 == -1) {
            this.field1360 = var5;
        } else {
            this.field1360 = class283.method1934(var5.field3320, 0);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lig;III)V", line = 66)
    public class85(class195 arg0, int arg1, int arg2, int arg3) {
        this.field1363 = arg2;
        this.field1365 = arg3;
        this.field1360 = arg0;
        this.field1361 = arg1;
    }
}
