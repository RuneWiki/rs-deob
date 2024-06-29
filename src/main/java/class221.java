import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class221 implements class737 {

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Z")
    private boolean field2856 = false;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "Lac;")
    public class541 field2851;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Z")
    private boolean field2848;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "S")
    public static short field2861 = 1;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    private final void method1254(int arg0) {
        this.field2851.method3006(1, this);
        field2854++;
        if (this.field2856) {
            OpenGL.glTexParameteri(this.field2849, 10241, this.field2848 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2849, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2849, 10241, this.field2848 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2849, 10240, 9728);
        }
        int var2 = -52 % ((43 - arg0) / 43);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
    public final int method1255(boolean arg0) {
        if (!arg0) {
            this.method1263(57, 44);
        }
        field2847++;
        return this.field2859;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    private final int method1256(int arg0) {
        field2858++;
        int var2 = this.field2851.method3009(arg0 + 6368, this.field2860) * this.field2845;
        if (arg0 != -6462) {
            method1262((byte) 56, null);
        }
        return this.field2848 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Z")
    public final boolean method1257(int arg0) {
        if (arg0 <= 31) {
            this.method1256(108);
        }
        field2855++;
        if (!this.field2851.field7671) {
            return false;
        }
        int var2 = this.method1256(-6462);
        this.field2851.method3006(1, this);
        OpenGL.glGenerateMipmapEXT(this.field2849);
        this.field2848 = true;
        this.method1254(-114);
        this.method1263(113, var2);
        return true;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
    public final void method1258(int arg0, boolean arg1) {
        if (arg1 != this.field2856) {
            this.field2856 = arg1;
            this.method1254(102);
        }
        field2846++;
        if (arg0 != -28003) {
            field2861 = 21;
        }
    }

    @OriginalMember(owner = "client!cu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2863++;
        this.method1261(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)V")
    public final void method1259(boolean arg0, boolean arg1) {
        if (this.field2848 != arg1) {
            int var3 = this.method1256(-6462);
            this.field2848 = true;
            this.method1254(-38);
            this.method1263(100, var3);
        }
        if (!arg0) {
            this.field2849 = 51;
        }
        field2857++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lms;I[[B)V")
    public static final void method1260(class760 arg0, int arg1, byte[][] arg2) {
        field2853++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = arg1; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class611 var11 = new class611(var10);
                int var12 = class519.field6991[var5] >> 8;
                int var13 = class519.field6991[var5] & 0xFF;
                int var14 = var12 * 64 - class99.field1313;
                int var15 = var13 * 64 - class133.field1704;
                class7.method18(arg1 ^ 0x58A8);
                arg0.method1710((byte) 117, var15, class133.field1704, class99.field1313, var11, var14, class171.field2130);
                arg0.method4220(arg1 + 17685, var15, var14, class21.field142, var11, var3);
                if (!arg0.field3769 && (class505.field6855 / 8) == var12 && class539.field7309 / 8 == var13 && var3[0] != -1) {
                    class257.field3343 = class147.field1893.method2797(0, var3[0], var3[2], var3[1], class278.field3718, var3[3]);
                    class604.field8422 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class519.field6991[var6] >> 8) * 64 - class99.field1313;
            int var8 = (class519.field6991[var6] & 0xFF) * 64 - class133.field1704;
            byte[] var9 = arg2[var6];
            if (var9 == null && class539.field7309 < 800) {
                class7.method18(22696);
                arg0.method1705(64, true, var8, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
    public final void method1261(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field2859 > 0) {
            this.field2851.method3016(this.method1256(-6462), 4, this.field2859);
            this.field2859 = 0;
        }
        field2850++;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lac;IIIZ)V")
    public class221(class541 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2851 = arg0;
        this.field2849 = arg1;
        this.field2848 = arg4;
        this.field2860 = arg2;
        this.field2845 = arg3;
        OpenGL.glGenTextures(1, class272.field3590, 0);
        this.field2859 = class272.field3590[0];
        this.method1263(122, 0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLji;)Lsh;")
    public static final class71 method1262(byte arg0, class611 arg1) {
        if (arg0 != -12) {
            field2861 = -15;
        }
        field2852++;
        class71 var2 = new class71();
        var2.field765 = arg1.method3402((byte) 127);
        var2.field768 = class511.field6912.method1603(var2.field765, 96);
        return var2;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)V")
    private final void method1263(int arg0, int arg1) {
        this.field2851.field7548 -= arg1;
        if (arg0 <= 88) {
            this.field2849 = 38;
        }
        field2862++;
        this.field2851.field7548 += this.method1256(-6462);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public abstract void method832(byte arg0);
}
