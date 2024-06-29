import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class103 extends class67 {

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[I")
    private int[] field1333 = new int[this.field869];

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[Lk;")
    public static class249[] field1329 = new class249[50];

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1336 = "Ok";

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[B")
    private byte[] field1335;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 18)
    public final void method212(int arg0, int arg1, int arg2) {
        field1330++;
        this.field1331 += this.field1333[arg1] * arg0 >> 12;
        if (arg2 <= 44) {
            field1336 = (String) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIF)V", line = 29)
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field869; var7++) {
            this.field1333[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V", line = 56)
    public static void method607(boolean arg0) {
        field1336 = null;
        field1329 = null;
        if (!arg0) {
            method607(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 68)
    public void method516(int arg0, byte arg1) {
        field1327++;
        this.field1335[this.field1328++] = (byte) (class229.method1613(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 80)
    public final void method213(int arg0) {
        if (arg0 <= 69) {
            this.field1335 = (byte[]) null;
        }
        field1332++;
        this.field1328 = 0;
        this.field1331 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 92)
    public final void method214(int arg0) {
        this.field1331 = Math.abs(this.field1331);
        if (arg0 > -48) {
            this.field1328 = -34;
        }
        if (this.field1331 >= 4096) {
            this.field1331 = 4095;
        }
        this.method516(this.field1328++, (byte) (this.field1331 >> 4));
        this.field1331 = 0;
        field1337++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILen;JZ)V", line = 108)
    public static final void method608(int arg0, int arg1, int arg2, int arg3, class47 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class138 var8 = new class138();
        var8.field1935 = arg4;
        var8.field1932 = arg1 * 128 + 64;
        var8.field1927 = arg2 * 128 + 64;
        var8.field1933 = arg3;
        var8.field1937 = arg5;
        var8.field1929 = arg6;
        if (class158.field2184[arg0][arg1][arg2] == null) {
            class158.field2184[arg0][arg1][arg2] = new class225(arg0, arg1, arg2);
        }
        class158.field2184[arg0][arg1][arg2].field3209 = var8;
    }
}
