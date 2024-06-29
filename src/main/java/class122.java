import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class122 {

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field2041 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    private int field2038 = -1;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lfg;")
    private class203 field2032 = new class203();

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
    public boolean field2043 = false;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[Lhd;")
    private class113[] field2035;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[[I")
    private int[][] field2030;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lve;")
    public static class255 field2028 = class87.method607(114, "overlay");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lve;")
    public static class255 field2027 = class87.method607(61, " weitere Optionen");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lve;")
    public static class255 field2029 = class87.method607(99, ")3");

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/awt/Font;")
    public static Font field2042;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[[[B")
    public static byte[][][] field2037;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)I", line = 20)
    public static final int method903(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2036 = -15;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        field2025++;
        return arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)[[I", line = 53)
    public final int[][] method904(int arg0) {
        field2040++;
        if (this.field2034 != this.field2026) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 37) {
            field2036 = -63;
        }
        for (int var2 = 0; var2 < this.field2026; var2++) {
            this.field2035[var2] = class239.field3987;
        }
        return this.field2030;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Z", line = 77)
    public static final boolean method905(boolean arg0) {
        field2039++;
        if (!arg0) {
            field2028 = (class255) null;
        }
        try {
            if (class73.field1203 == 2) {
                if (class231.field3836 == null) {
                    class231.field3836 = class45.method270(class258.field4389, class15.field224, class78.field1274);
                    if (class231.field3836 == null) {
                        return false;
                    }
                }
                if (class305.field5208 == null) {
                    class305.field5208 = new class17(class303.field5190, class33.field531);
                }
                if (class242.field4080.method675(-1, class231.field3836, 22050, class305.field5208, class33.field538)) {
                    class242.field4080.method666((byte) -28);
                    class242.field4080.method647((byte) -18, class235.field3872);
                    class242.field4080.method651(class231.field3836, -76, class100.field1696);
                    class305.field5208 = null;
                    class258.field4389 = null;
                    class231.field3836 = null;
                    class73.field1203 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class242.field4080.method670(-128);
            class73.field1203 = 0;
            class258.field4389 = null;
            class305.field5208 = null;
            class231.field3836 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I", line = 146)
    public final int[] method906(int arg0, int arg1) {
        if (arg1 != 8251) {
            this.field2038 = 49;
        }
        field2031++;
        if (this.field2034 == this.field2026) {
            this.field2043 = this.field2035[arg0] == null;
            this.field2035[arg0] = class239.field3987;
            return this.field2030[arg0];
        } else if (this.field2026 == 1) {
            this.field2043 = this.field2038 != arg0;
            this.field2038 = arg0;
            return this.field2030[0];
        } else {
            class113 var3 = this.field2035[arg0];
            if (var3 == null) {
                this.field2043 = true;
                if (this.field2041 < this.field2026) {
                    var3 = new class113(arg0, this.field2041);
                    this.field2041++;
                } else {
                    class113 var4 = (class113) this.field2032.method1470(28527);
                    var3 = new class113(arg0, var4.field1909);
                    this.field2035[var4.field1906] = null;
                    var4.method1502((byte) -82);
                }
                this.field2035[arg0] = var3;
            } else {
                this.field2043 = false;
            }
            this.field2032.method1469(51, var3);
            return this.field2030[var3.field1909];
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(III)V", line = 265)
    public class122(int arg0, int arg1, int arg2) {
        this.field2034 = arg1;
        this.field2035 = new class113[this.field2034];
        this.field2026 = arg0;
        this.field2030 = new int[this.field2026][arg2];
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 222)
    public final void method907(int arg0) {
        for (int var2 = 0; var2 < this.field2026; var2++) {
            this.field2030[var2] = null;
        }
        field2033++;
        this.field2030 = (int[][]) null;
        this.field2035 = null;
        this.field2032.method1474(true);
        this.field2032 = null;
        if (arg0 != -1) {
            field2027 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 241)
    public static void method908(int arg0) {
        field2027 = null;
        field2037 = (byte[][][]) null;
        field2029 = null;
        field2028 = null;
        field2042 = null;
        if (arg0 != 0) {
            method903(-47, 70, true);
        }
    }
}
