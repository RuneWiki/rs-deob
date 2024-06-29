import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class173 extends class112 {

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    private int field2762 = 3072;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    private int field2766 = 1024;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    private int field2773 = 2048;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lwm;")
    public static class152 field2772 = class157.method1048("Regarder dans cette direction", 115);

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2764 = new CRC32();

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Loe;IBI)V", line = 8)
    public static final void method1157(class127 arg0, int arg1, byte arg2, int arg3) {
        field2769++;
        if (arg2 <= 52 || class33.field537 != null || class70.field1016 || arg0 == null || class147.method927(arg0, 113) == null) {
            return;
        }
        class33.field537 = arg0;
        class15.field207 = class147.method927(arg0, 46);
        class323.field5645 = 0;
        class179.field2864 = false;
        class305.field5245 = arg1;
        class253.field4377 = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 36)
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 44)
    public final void method673(int arg0) {
        if (arg0 != 8) {
            this.field2766 = -54;
        }
        this.field2773 = this.field2762 - this.field2766;
        field2763++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[[I", line = 62)
    public final int[][] method55(int arg0, boolean arg1) {
        int[][] var3 = this.field1594.method656((byte) -4, arg0);
        if (arg1) {
            method1157((class127) null, 5, (byte) -13, -108);
        }
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                var9[var11] = (var7[var11] * this.field2773 >> 12) + this.field2766;
                var10[var11] = (var5[var11] * this.field2773 >> 12) + this.field2766;
                var8[var11] = (var6[var11] * this.field2773 >> 12) + this.field2766;
            }
        }
        field2765++;
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V", line = 114)
    public static void method1158(int arg0) {
        field2772 = null;
        if (arg0 != 0) {
            field2764 = (CRC32) null;
        }
        field2764 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[I", line = 128)
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = this.field1585.method1952(arg1, (byte) 58);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 111, 0);
            for (int var5 = 0; var5 < class58.field889; var5++) {
                var3[var5] = (var4[var5] * this.field2773 >> 12) + this.field2766;
            }
        }
        if (arg0 != -3) {
            this.method53((byte) -81, 86);
        }
        field2770++;
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILhi;)V", line = 179)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field2766 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field2762 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field1591 = arg2.method2011(-122) == 1;
        }
        if (arg0 != 31164) {
            field2772 = (class152) null;
        }
        field2768++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZLah;III)V", line = 217)
    public static final void method1159(int arg0, int arg1, boolean arg2, class205 arg3, int arg4, int arg5, int arg6) {
        class325.field5667 = arg5;
        class89.field1252 = arg0;
        class45.field717 = arg1;
        class65.field986 = arg3;
        class193.field3072 = arg4;
        field2771++;
        class312.field5357 = arg2;
        class275.field4720 = arg6;
    }
}
