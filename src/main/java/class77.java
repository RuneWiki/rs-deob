import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class77 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private int field1049 = 0;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    private int field1053 = -1;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lsj;")
    private class48 field1054 = new class48();

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Z")
    public boolean field1059 = false;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[[I")
    private int[][] field1056;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[Lka;")
    private class169[] field1051;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1047 = "Unable to find ";

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Ljj;")
    public static class134 field1058;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)[I")
    public final int[] method579(byte arg0, int arg1) {
        field1060++;
        if (arg0 != -62) {
            this.method580(110);
        }
        if (this.field1052 == this.field1048) {
            this.field1059 = this.field1051[arg1] == null;
            this.field1051[arg1] = class93.field1322;
            return this.field1056[arg1];
        } else if (this.field1052 == 1) {
            this.field1059 = this.field1053 != arg1;
            this.field1053 = arg1;
            return this.field1056[0];
        } else {
            class169 var3 = this.field1051[arg1];
            if (var3 == null) {
                this.field1059 = true;
                if (this.field1052 <= this.field1049) {
                    class169 var4 = (class169) this.field1054.method369(arg0 + 171);
                    var3 = new class169(arg1, var4.field2738);
                    this.field1051[var4.field2746] = null;
                    var4.method544(arg0 + 184);
                } else {
                    var3 = new class169(arg1, this.field1049);
                    this.field1049++;
                }
                this.field1051[arg1] = var3;
            } else {
                this.field1059 = false;
            }
            this.field1054.method368(var3, 76);
            return this.field1056[var3.field2738];
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method580(int arg0) {
        field1062++;
        for (int var2 = 0; var2 < this.field1052; var2++) {
            this.field1056[var2] = null;
        }
        if (arg0 == 64) {
            this.field1056 = null;
            this.field1051 = null;
            this.field1054.method371(arg0 ^ 0x43);
            this.field1054 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method581(int arg0) {
        if (arg0 <= 49) {
            method582(true, false);
        }
        field1047 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)V")
    public static final void method582(boolean arg0, boolean arg1) {
        if (!arg0) {
            method582(true, false);
        }
        byte[][] var2 = class67.field948;
        byte var3 = 4;
        field1055++;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class69.field958[var5] >> 8;
            int var14 = var13 * 64 - class296.field4685;
            int var15 = class69.field958[var5] & 0xFF;
            int var16 = var15 * 64 - class93.field1321;
            if (var12 != null) {
                class280.method1873((byte) -54);
                var11 = class58.method447(class296.field4685, class93.field1321, class61.field839, var14, var16, var12, (byte) 89, arg1);
            }
            if (!arg1 && class263.field4159 / 8 == var13 && (class103.field1675 / 8) == var15) {
                if (var11 == null) {
                    class233.field3713 = -1;
                } else {
                    class230.field3661 = var11[3];
                    class241.field3879 = var11[2];
                    class236.field3778 = var11[4];
                    class6.field70 = var11[1];
                    class233.field3713 = var11[0];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class69.field958[var6] >> 8) * 64 - class296.field4685;
            int var8 = (class69.field958[var6] & 0xFF) * 64 - class93.field1321;
            byte[] var9 = var2[var6];
            if (var9 == null && class103.field1675 < 800) {
                class280.method1873((byte) -54);
                for (int var10 = 0; var10 < var3; var10++) {
                    class25.method177((byte) 51, 64, var7, var8, var10, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)[[I")
    public final int[][] method583(int arg0) {
        field1057++;
        if (this.field1052 != this.field1048) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1052; var2++) {
            this.field1051[var2] = class93.field1322;
        }
        if (arg0 != 9115) {
            this.method583(-28);
        }
        return this.field1056;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(III)V")
    public class77(int arg0, int arg1, int arg2) {
        this.field1052 = arg0;
        this.field1056 = new int[this.field1052][arg2];
        this.field1048 = arg1;
        this.field1051 = new class169[this.field1048];
    }
}
