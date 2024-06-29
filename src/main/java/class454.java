import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class454 extends class71 {

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
    public int[] field6289;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
    public int[] field6295;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "[Z")
    public boolean[] field6292;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "[[I")
    public int[][] field6290;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "[I")
    public static int[] field6293;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "[I")
    public static int[] field6299;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 12)
    public static void method2780(int arg0) {
        if (arg0 != 0) {
            method2783(-75, true);
        }
        field6293 = null;
        field6299 = null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)S", line = 23)
    public static final short method2781(int arg0, int arg1) {
        if (arg0 != 10295) {
            method2780(-48);
        }
        field6296++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x385) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 51)
    public static final void method2782(byte arg0) {
        class176.field2415 = class417.method2596(true, (byte) 117, 4, 8, 2048, 35, 8, 0.4F);
        if (arg0 <= 57) {
            field6299 = null;
        }
        field6294++;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZ)I", line = 64)
    public static final int method2783(int arg0, boolean arg1) {
        field6297++;
        if (arg0 != 20320) {
            field6299 = null;
        }
        int var2 = class521.field7260;
        if (var2 == 0) {
            return arg1 ? 0 : class26.field325;
        } else if (var2 == 1) {
            return class26.field325;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(I[B)V", line = 105)
    public class454(int arg0, byte[] arg1) {
        this.field6291 = arg0;
        class63 var3 = new class63(arg1);
        this.field6298 = var3.method505((byte) -119);
        this.field6289 = new int[this.field6298];
        this.field6295 = new int[this.field6298];
        this.field6292 = new boolean[this.field6298];
        this.field6290 = new int[this.field6298][];
        for (int var4 = 0; var4 < this.field6298; var4++) {
            this.field6289[var4] = var3.method505((byte) -119);
            if (this.field6289[var4] == 6) {
                this.field6289[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field6298; var5++) {
            this.field6292[var5] = var3.method505((byte) -119) == 1;
        }
        for (int var6 = 0; var6 < this.field6298; var6++) {
            this.field6295[var6] = var3.method482(-772591672);
        }
        for (int var7 = 0; var7 < this.field6298; var7++) {
            this.field6290[var7] = new int[var3.method505((byte) -119)];
        }
        for (int var8 = 0; var8 < this.field6298; var8++) {
            for (int var9 = 0; var9 < this.field6290[var8].length; var9++) {
                this.field6290[var8][var9] = var3.method505((byte) -119);
            }
        }
    }
}
