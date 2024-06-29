import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class325 extends class17 {

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "Lsf;")
    private static class108 field5533 = class140.method973(255, "Loaded world list data");

    @OriginalMember(owner = "client!an", name = "db", descriptor = "I")
    public static int field5536 = 0;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "Lsf;")
    public static class108 field5534 = field5533;

    @OriginalMember(owner = "client!an", name = "hb", descriptor = "Lsf;")
    public static class108 field5540 = class140.method973(255, ": ");

    @OriginalMember(owner = "client!an", name = "fb", descriptor = "Lsf;")
    public static class108 field5538 = class140.method973(255, "showingVideoAd");

    @OriginalMember(owner = "client!an", name = "gb", descriptor = "Lsf;")
    public static class108 field5539 = class140.method973(255, ")1 ");

    @OriginalMember(owner = "client!an", name = "kb", descriptor = "[I")
    public static int[] field5543 = new int[1000];

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!an", name = "ib", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!an", name = "jb", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!an", name = "lb", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field5537;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)[[I", line = 8)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            this.method114((byte) 46, (class249) null, -101);
        }
        field5544++;
        int[][] var3 = this.field224.method2081(arg1, -55);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLrm;I)V", line = 53)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field5541++;
        if (arg0 != -114) {
            this.method120(-89, -42);
        }
        if (arg2 == 0) {
            this.field225 = arg1.method1731(true) == 1;
        }
    }

    @OriginalMember(owner = "client!an", name = "h", descriptor = "(I)V", line = 72)
    public static void method2227(int arg0) {
        field5538 = null;
        field5543 = null;
        field5537 = null;
        field5534 = null;
        field5539 = null;
        field5533 = null;
        field5540 = null;
        if (arg0 != 0) {
            method2227(-60);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 95)
    public class325() {
        super(1, false);
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(II)[I", line = 100)
    public final int[] method120(int arg0, int arg1) {
        field5542++;
        if (arg0 >= -95) {
            return (int[]) null;
        }
        int[] var3 = this.field217.method1698(-2, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(61, 0, arg1);
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
