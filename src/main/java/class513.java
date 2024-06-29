import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class513 extends class313 {

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "[[B")
    private byte[][] field7235 = new byte[10][];

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "Ltn;")
    private class179 field7226 = new class179(null);

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "Ltn;")
    private class179 field7238 = new class179(null);

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "Lkha;")
    private class687 field7227;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    private int field7228;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "Z")
    public static boolean field7225 = false;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "[I")
    public static int[] field7233 = new int[14];

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field7234 = -60;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "Lan;")
    public static class182 field7231 = new class182(0, 4);

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    private int field7236;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "[I")
    private int[] field7229;

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILkha;I)V")
    public class513(int arg0, class687 arg1, int arg2) {
        super(arg0);
        this.field7227 = arg1;
        this.field7228 = arg2;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)V")
    public static void method2950(byte arg0) {
        field7231 = null;
        field7233 = null;
        int var1 = 24 / ((6 - arg0) / 46);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([BB)I")
    public final int method1830(byte[] arg0, byte arg1) throws IOException {
        field7230++;
        if (this.field7229 == null) {
            if (!this.field7227.method3811(0, (byte) 101, this.field7228)) {
                return 0;
            }
            byte[] var3 = this.field7227.method3810(this.field7228, -23360, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field7238.field2325 = var3;
            this.field7238.field2354 = 0;
            int var4 = var3.length >> 1;
            this.field7229 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7229[var5] = this.field7238.method1107(false);
            }
        }
        if (this.field7229.length <= this.field7236) {
            return -1;
        }
        this.method2951(false);
        if (arg1 != -116) {
            this.method2951(true);
        }
        this.field7238.field2325 = arg0;
        this.field7238.field2354 = 0;
        do {
            if (this.field7238.field2354 >= this.field7238.field2325.length) {
                this.field7238.field2325 = null;
                return arg0.length;
            }
            if (this.field7226.field2325 == null) {
                if (this.field7235[0] == null) {
                    this.field7238.field2325 = null;
                    return this.field7238.field2354;
                }
                this.field7226.field2325 = this.field7235[0];
            }
            int var6 = this.field7238.field2325.length - this.field7238.field2354;
            int var7 = this.field7226.field2325.length - this.field7226.field2354;
            if (var7 > var6) {
                this.field7226.method1096(var6, this.field7238.field2354, this.field7238.field2325, 12050);
                this.field7238.field2325 = null;
                return arg0.length;
            }
            this.field7238.method1123(var7, (byte) -98, this.field7226.field2354, this.field7226.field2325);
            this.field7226.field2354 = 0;
            this.field7236++;
            this.field7226.field2325 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field7235[var8] = this.field7235[var8 + 1];
            }
            this.field7235[9] = null;
        } while (this.field7236 < this.field7229.length);
        this.field7238.field2325 = null;
        return this.field7238.field2354;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public final void method2951(boolean arg0) {
        field7237++;
        if (arg0) {
            this.field7236 = 119;
        }
        if (this.field7229 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7236 + var2 >= this.field7229.length) {
                return;
            }
            if (this.field7235[var2] == null && this.field7227.method3811(0, (byte) 101, this.field7229[this.field7236 + var2])) {
                this.field7235[var2] = this.field7227.method3810(this.field7229[this.field7236 + var2], -23360, 0);
            }
        }
    }
}
