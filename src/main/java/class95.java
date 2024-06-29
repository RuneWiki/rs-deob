import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class95 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field1243 = new String[0];

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    private int field1249 = -1;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
    private boolean field1244 = false;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "[S")
    public static short[] field1248 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lsu;")
    public static class192 field1241 = new class192();

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1255 = 0;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "F")
    public static float field1254;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)V", line = 4)
    public final void method691(byte arg0, String arg1) {
        this.method694(false, this.field1249 + 1, arg1);
        int var3 = -119 / ((arg0 - 39) / 35);
        field1252++;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 17)
    public static void method692(int arg0) {
        field1241 = null;
        field1248 = null;
        if (arg0 >= -66) {
            method692(-120);
        }
    }

    @OriginalMember(owner = "client!rv", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field1247++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field1249; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field1243[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)[Ljava/lang/String;", line = 56)
    public final String[] method693(int arg0) {
        field1245++;
        String[] var2 = new String[this.field1249 + 1];
        if (arg0 != -27166) {
            field1241 = null;
        }
        class282.method1708(this.field1243, 0, var2, 0, this.field1249 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 70)
    private final void method694(boolean arg0, int arg1, String arg2) {
        if (arg1 > this.field1249) {
            this.field1249 = arg1;
        }
        field1253++;
        if (arg0) {
            this.method693(96);
        }
        if (arg1 >= this.field1243.length) {
            this.method696(-106, arg1);
        }
        this.field1243[arg1] = arg2;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(IZ)V", line = 162)
    public class95(int arg0, boolean arg1) {
        this.field1250 = arg0;
        this.field1244 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I", line = 93)
    private final int method695(int arg0, int arg1) {
        field1246++;
        int var3 = this.field1243.length;
        if (arg1 <= 100) {
            return -65;
        }
        while (var3 <= arg0) {
            if (!this.field1244) {
                var3 += this.field1250;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field1250 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V", line = 130)
    private final void method696(int arg0, int arg1) {
        field1251++;
        String[] var3 = new String[this.method695(arg1, 125)];
        if (arg0 >= -91) {
            field1241 = null;
        }
        class282.method1708(this.field1243, 0, var3, 0, this.field1243.length);
        this.field1243 = var3;
    }
}
