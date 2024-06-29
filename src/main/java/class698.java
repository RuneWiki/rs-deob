import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class698 extends class615 {

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[[B")
    private byte[][] field9821 = new byte[10][];

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Lig;")
    private class244 field9816 = new class244(null);

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "Lig;")
    private class244 field9823 = new class244(null);

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    private int field9819;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Loh;")
    private class404 field9820;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Z")
    public static boolean field9825 = false;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field9818 = 0;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    private int field9817;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lws;")
    public static class357 field9822;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
    private int[] field9815;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V")
    public static void method3922(byte arg0) {
        if (arg0 <= 51) {
            method3922((byte) 72);
        }
        field9822 = null;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public final void method3923(int arg0) {
        if (arg0 >= -73) {
            return;
        }
        field9824++;
        if (this.field9815 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9815.length <= this.field9817 + var2) {
                return;
            }
            if (this.field9821[var2] == null && this.field9820.method2493(this.field9815[this.field9817 + var2], 0, (byte) -73)) {
                this.field9821[var2] = this.field9820.method2481(this.field9815[this.field9817 + var2], 0, (byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILoh;I)V")
    public class698(int arg0, class404 arg1, int arg2) {
        super(arg0);
        this.field9819 = arg2;
        this.field9820 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BB)I")
    public final int method3490(byte[] arg0, byte arg1) throws IOException {
        field9814++;
        if (this.field9815 == null) {
            if (!this.field9820.method2493(this.field9819, 0, (byte) -122)) {
                return 0;
            }
            byte[] var3 = this.field9820.method2481(this.field9819, 0, (byte) 118);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field9823.field2903 = 0;
            this.field9823.field2912 = var3;
            int var4 = var3.length >> 1;
            this.field9815 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9815[var5] = this.field9823.method1476(-90);
            }
        }
        if (this.field9815.length <= this.field9817) {
            return -1;
        }
        this.method3923(-78);
        if (arg1 > -46) {
            this.field9823 = null;
        }
        this.field9823.field2903 = 0;
        this.field9823.field2912 = arg0;
        do {
            if (this.field9823.field2903 >= this.field9823.field2912.length) {
                this.field9823.field2912 = null;
                return arg0.length;
            }
            if (this.field9816.field2912 == null) {
                if (this.field9821[0] == null) {
                    this.field9823.field2912 = null;
                    return this.field9823.field2903;
                }
                this.field9816.field2912 = this.field9821[0];
            }
            int var6 = this.field9823.field2912.length - this.field9823.field2903;
            int var7 = this.field9816.field2912.length - this.field9816.field2903;
            if (var6 < var7) {
                this.field9816.method1461(824, this.field9823.field2903, this.field9823.field2912, var6);
                this.field9823.field2912 = null;
                return arg0.length;
            }
            this.field9823.method1430(var7, (byte) 84, this.field9816.field2903, this.field9816.field2912);
            this.field9817++;
            this.field9816.field2912 = null;
            this.field9816.field2903 = 0;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field9821[var8] = this.field9821[var8 + 1];
            }
            this.field9821[9] = null;
        } while (this.field9817 < this.field9815.length);
        this.field9823.field2912 = null;
        return this.field9823.field2903;
    }
}
