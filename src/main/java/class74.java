import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class74 extends class280 {

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    private final int field1155;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    private final int field1160;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    private final int field1159;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    private final int field1161;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lck;")
    public static class119 field1153 = class298.method1987((byte) 13, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1162 = new CRC32();

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V", line = 10)
    public final void method528(int arg0, int arg1, int arg2) {
        field1158++;
        int var4 = this.field1161 * arg2 >> 12;
        int var5 = this.field1155 * arg1 >> 12;
        int var6 = this.field1160 * arg2 >> 12;
        int var7 = this.field1159 * arg1 >> 12;
        if (arg0 != 12623) {
            method534((int[]) null, (int[]) null, 17, -56, -4);
        }
        class95.method647(var5, this.field4634, (byte) 98, var7, var6, var4, this.field4635, this.field4633);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 31)
    public static final void method529(int arg0) {
        class146.field2343 = arg0;
        for (int var1 = 0; var1 < class208.field3328; var1++) {
            for (int var2 = 0; var2 < class103.field1569; var2++) {
                if (class150.field2390[arg0][var1][var2] == null) {
                    class150.field2390[arg0][var1][var2] = new class104(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 54)
    public final void method530(int arg0, int arg1, int arg2) {
        field1163++;
        int var4 = this.field1161 * arg2 >> 12;
        int var5 = this.field1160 * arg2 >> 12;
        int var6 = this.field1159 * arg1 >> 12;
        int var7 = this.field1155 * arg1 >> 12;
        class295.method1967(var7, var5, this.field4633, var6, (byte) -119, var4);
        if (arg0 != 2) {
            field1153 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1155 = arg3;
        this.field1160 = arg2;
        this.field1159 = arg1;
        this.field1161 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILva;)V", line = 101)
    public static final void method531(int arg0, class36 arg1) {
        class269.field4440 = arg1;
        class82.field1255 = class269.field4440.method263(arg0, arg0 + 96);
        field1156++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V", line = 113)
    public final void method532(int arg0, byte arg1, int arg2) {
        if (arg1 >= -71) {
            field1153 = (class119) null;
        }
        field1152++;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 126)
    public static void method533(int arg0) {
        field1153 = null;
        field1162 = null;
        if (arg0 != 16777215) {
            method534((int[]) null, (int[]) null, 60, 4, 12);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([I[IIII)V", line = 138)
    public static final void method534(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field1153 = (class119) null;
        }
        field1151++;
        if (arg3 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg3) / 2;
        int var6 = arg4;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var8;
        for (int var9 = arg4; var9 < arg3; var9++) {
            if (arg0[var9] > (var9 & 0x1) + var7) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var8;
        method534(arg0, arg1, 0, var6 - 1, arg4);
        method534(arg0, arg1, arg2, arg3, var6 + 1);
    }
}
