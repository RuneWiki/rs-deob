import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class121 extends class86 {

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[Z")
    public boolean[] field1870;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
    public int[] field1863;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "[[I")
    public int[][] field1865;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "[I")
    public int[] field1869;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
    public static boolean field1859 = true;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[I")
    public static int[] field1862 = new int[2];

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1867 = " from your friend list first.";

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[Lkd;")
    public static class209[] field1868 = new class209[0];

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)I")
    public static final int method863(int arg0) {
        if (arg0 <= 69) {
            return -65;
        } else {
            field1871++;
            return class167.field2523.method1775(17216);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method864(int arg0) {
        field1862 = null;
        if (arg0 != 512) {
            method864(-26);
        }
        field1868 = null;
        field1867 = null;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static final void method865(int arg0) {
        field1864++;
        int var1 = 100 % ((arg0 - 45) / 45);
        int var2 = class79.method624((byte) 36);
        if (var2 == 0) {
            class140.field2150 = null;
            class171.method1132((byte) -122, 0);
        } else if (var2 == 1) {
            class172.method1138((byte) 0, (byte) -126);
            class171.method1132((byte) -52, 512);
            if (class191.field3041 != null) {
                class211.method1411((byte) -110);
                return;
            }
        } else {
            class172.method1138((byte) (class17.field278 - 4 & 0xFF), (byte) -126);
            class171.method1132((byte) -109, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Leb;")
    public static final class247 method866(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = var3.field356;
            var3.field356 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3) {
        class23 var4 = class255.field3907[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class247 var5 = var4.field356;
        if (var5 != null) {
            var5.field3809 = var5.field3809 * arg3 / 16;
            var5.field3810 = var5.field3810 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I[B)V")
    public class121(int arg0, byte[] arg1) {
        this.field1866 = arg0;
        class37 var3 = new class37(arg1);
        this.field1860 = var3.method333((byte) -59);
        this.field1870 = new boolean[this.field1860];
        this.field1863 = new int[this.field1860];
        this.field1865 = new int[this.field1860][];
        this.field1869 = new int[this.field1860];
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1869[var4] = var3.method333((byte) -59);
        }
        for (int var5 = 0; var5 < this.field1860; var5++) {
            this.field1870[var5] = var3.method333((byte) -59) == 1;
        }
        for (int var6 = 0; var6 < this.field1860; var6++) {
            this.field1863[var6] = var3.method293(103);
        }
        for (int var7 = 0; var7 < this.field1860; var7++) {
            this.field1865[var7] = new int[var3.method333((byte) -59)];
        }
        for (int var8 = 0; var8 < this.field1860; var8++) {
            for (int var9 = 0; var9 < this.field1865[var8].length; var9++) {
                this.field1865[var8][var9] = var3.method333((byte) -59);
            }
        }
    }
}
