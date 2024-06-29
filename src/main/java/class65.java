import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class65 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    private int[] field865;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
    public static long field863 = -1L;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[[I")
    public static int[][] field860;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public final int method390(int arg0, int arg1) {
        field862++;
        int var3 = (this.field865.length >> 1) - 1;
        int var4 = var3 & arg0;
        int var5 = 88 % ((-arg1 - 40) / 54);
        while (true) {
            int var6 = this.field865[var4 + var4 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field865[var4 + var4] == arg0) {
                return var6;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method391(byte arg0) {
        if (arg0 <= -117) {
            field860 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method392(int arg0) {
        class485.field6555 = 0;
        class658.field9278 = new class578[arg0];
        field864++;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V")
    public class65(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field865 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field865[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field865[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field865[var5 + var5] = arg0[var4];
            this.field865[var5 + var5 + 1] = var4++;
        }
    }
}
