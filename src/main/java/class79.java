import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class79 extends class270 {

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
    private boolean field825;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    private int field826;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
    private boolean field828;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "[I")
    public static int[] field816 = new int[14];

    @OriginalMember(owner = "client!in", name = "B", descriptor = "[I")
    public static int[] field827 = new int[2048];

    @OriginalMember(owner = "client!in", name = "o", descriptor = "Lhv;")
    public static class474 field814 = new class474();

    @OriginalMember(owner = "client!in", name = "D", descriptor = "F")
    public static float field829;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
    public static int[] field820;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 17)
    public static final void method506(byte arg0) {
        field821++;
        if (arg0 <= -94) {
            class294.field3865.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLiaa;)V", line = 32)
    public final void method507(boolean arg0, class452 arg1) {
        arg1.method2525(2, -81849);
        field822++;
        arg1.method2525(this.field818, -81849);
        arg1.method2525(this.field825 ? 1 : 0, -81849);
        arg1.method2525(this.field812, -81849);
        arg1.method2525(this.field826, -81849);
        arg1.method2525(this.field819, -81849);
        arg1.method2525(this.field817, -81849);
        arg1.method2525(this.field828 ? 1 : 0, -81849);
        arg1.method2537(18244, this.field824);
        arg1.method2525(this.field815, -81849);
        arg1.method2512(this.field823, arg0);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V", line = 57)
    public static void method508(byte arg0) {
        field814 = null;
        field816 = null;
        field827 = null;
        if (arg0 >= 68) {
            field820 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ZLpe;)V", line = 74)
    public class79(boolean arg0, class556 arg1) {
        if (arg0) {
            if (class556.field7916.startsWith("win")) {
                this.field818 = 1;
            } else if (class556.field7916.startsWith("mac")) {
                this.field818 = 2;
            } else if (class556.field7916.startsWith("linux")) {
                this.field818 = 3;
            } else {
                this.field818 = 4;
            }
            if (class556.field7915.startsWith("amd64") || class556.field7915.startsWith("x86_64")) {
                this.field825 = true;
            } else {
                this.field825 = false;
            }
            if (class556.field7919.toLowerCase().indexOf("sun") != -1) {
                this.field812 = 1;
            } else if (class556.field7919.toLowerCase().indexOf("microsoft") != -1) {
                this.field812 = 2;
            } else if (class556.field7919.toLowerCase().indexOf("apple") == -1) {
                this.field812 = 4;
            } else {
                this.field812 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class556.field7918.length()) {
                    char var5 = class556.field7918.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field826 = var4;
            int var6 = class556.field7918.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class556.field7918.length() > var6) {
                    char var8 = class556.field7918.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + (var8 - '0');
                }
            } catch (Exception var14) {
            }
            this.field819 = var7;
            int var9 = class556.field7918.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class556.field7918.length() > var9) {
                    char var11 = class556.field7918.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var13) {
            }
            if (arg1.field7924) {
                this.field828 = false;
            } else {
                this.field828 = true;
            }
            this.field824 = class145.field1630;
            if (this.field826 <= 3) {
                this.field815 = 0;
            } else {
                this.field815 = class277.field3513;
            }
            this.field817 = var10;
            try {
                this.field823 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field823 = 0;
            }
        }
    }
}
