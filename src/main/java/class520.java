import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class520 extends class626 {

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[[I")
    public int[][] field7373;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
    public int[] field7378;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Z")
    public boolean[] field7372;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
    public int[] field7379;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3085(int arg0, String arg1) {
        field7376++;
        if (class20.field259 == null) {
            return;
        }
        if (arg0 <= 101) {
            method3085(-128, null);
        }
        class581.field8212++;
        class135 var2 = class273.method1801(class459.field6629, class510.field7263, 2);
        var2.field2109.method263((byte) -94, class552.method3233((byte) -73, arg1));
        var2.field2109.method287((byte) 0, arg1);
        class539.method3178(var2, -18925);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[B)V")
    public class520(int arg0, byte[] arg1) {
        this.field7375 = arg0;
        class35 var3 = new class35(arg1);
        this.field7377 = var3.method273(255);
        this.field7373 = new int[this.field7377][];
        this.field7378 = new int[this.field7377];
        this.field7372 = new boolean[this.field7377];
        this.field7379 = new int[this.field7377];
        for (int var4 = 0; var4 < this.field7377; var4++) {
            this.field7379[var4] = var3.method273(255);
            if (this.field7379[var4] == 6) {
                this.field7379[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field7377; var5++) {
            this.field7372[var5] = var3.method273(255) == 1;
        }
        for (int var6 = 0; var6 < this.field7377; var6++) {
            this.field7378[var6] = var3.method253(-13900);
        }
        for (int var7 = 0; var7 < this.field7377; var7++) {
            this.field7373[var7] = new int[var3.method273(255)];
        }
        for (int var8 = 0; var8 < this.field7377; var8++) {
            for (int var9 = 0; var9 < this.field7373[var8].length; var9++) {
                this.field7373[var8][var9] = var3.method273(255);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
    public static final boolean method3086(int arg0, int arg1, int arg2) {
        field7374++;
        if (arg0 <= 77) {
            return false;
        } else {
            boolean var3 = (arg1 & 0x37) == 0 ? class189.method1330(arg2, 21721, arg1) : class561.method3285(arg1, -30969, arg2);
            return var3 | class452.method2693(-545, arg2, arg1) | (arg2 & 0x10000) != 0;
        }
    }
}
