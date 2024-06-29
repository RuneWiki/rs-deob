import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class93 extends class80 {

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "[I")
    public static int[] field1399 = new int[4096];

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "B")
    public byte field1398;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Lre;")
    public class263 field1402;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "[I")
    public static int[] field1396;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I", line = 8)
    public static final int method660(int arg0) {
        if (arg0 == 6) {
            field1403++;
            return 6;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I", line = 21)
    public final int method76(byte arg0) {
        field1397++;
        if (arg0 > -56) {
            this.field1398 = 121;
        }
        return this.field1402 == null ? 0 : this.field1402.field4025 * 100 / (this.field1402.field3986.length - this.field1398);
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V", line = 38)
    public static void method661(int arg0) {
        field1396 = null;
        field1399 = null;
        if (arg0 > -108) {
            method661(-17);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IJ)V", line = 49)
    public static final void method662(int arg0, long arg1) {
        field1404++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class286.method1990(arg1 - 1L, 1);
            class286.method1990(1L, 1);
        } else {
            class286.method1990(arg1, 1);
        }
        if (arg0 != -553) {
            method663(-113, 14, (int[]) null, -51, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)[B", line = 79)
    public final byte[] method75(int arg0) {
        if (arg0 != 954) {
            method660(78);
        }
        field1400++;
        if (this.field1129 || this.field1402.field4025 < this.field1402.field3986.length - this.field1398) {
            throw new RuntimeException();
        }
        return this.field1402.field3986;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[II[I)V", line = 108)
    public static final void method663(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field1395++;
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (arg2[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method663(17948, arg1, arg2, var6 - 1, arg4);
            method663(17948, var6 + 1, arg2, arg3, arg4);
        }
        if (arg0 != 17948) {
            method661(-124);
        }
    }
}
