import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("l")
public class class103 {

    @OriginalMember(owner = "l", name = "o", descriptor = "Lph;")
    private class147 field2039 = new class147();

    @OriginalMember(owner = "l", name = "c", descriptor = "[I")
    public static int[] field2027 = new int[1000];

    @OriginalMember(owner = "l", name = "b", descriptor = "[I")
    public static int[] field2026 = new int[1000];

    @OriginalMember(owner = "l", name = "n", descriptor = "I")
    public static int field2038 = 4;

    @OriginalMember(owner = "l", name = "j", descriptor = "[[Lrg;")
    public static class164[][] field2034 = new class164[field2038][500];

    @OriginalMember(owner = "l", name = "e", descriptor = "[I")
    public static int[] field2029 = new int[field2038];

    @OriginalMember(owner = "l", name = "r", descriptor = "Llf;")
    public static class109 field2042 = class35.method275("scrollbar", 2);

    @OriginalMember(owner = "l", name = "u", descriptor = "[I")
    public static int[] field2045 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "l", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "l", name = "d", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "l", name = "h", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "l", name = "i", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "l", name = "k", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "l", name = "l", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "l", name = "p", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "l", name = "q", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "l", name = "s", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "l", name = "f", descriptor = "Loh;")
    public static class138 field2030;

    @OriginalMember(owner = "l", name = "g", descriptor = "Lte;")
    public static class180 field2031;

    @OriginalMember(owner = "l", name = "m", descriptor = "[I")
    public static int[] field2037;

    @OriginalMember(owner = "l", name = "t", descriptor = "[I")
    public static int[] field2044;

    @OriginalMember(owner = "l", name = "a", descriptor = "(BLph;)V")
    public final void method736(byte arg0, class147 arg1) {
        field2025++;
        if (arg1.field2829 != null) {
            arg1.method1031((byte) 3);
        }
        arg1.field2829 = this.field2039;
        if (arg0 != -89) {
            field2044 = null;
        }
        arg1.field2839 = this.field2039.field2839;
        arg1.field2829.field2839 = arg1;
        arg1.field2839.field2829 = arg1;
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(I)V")
    public static void method737(int arg0) {
        field2034 = null;
        field2044 = null;
        field2042 = null;
        field2027 = null;
        field2030 = null;
        field2031 = null;
        field2037 = null;
        field2026 = null;
        field2029 = null;
        if (arg0 != 255) {
            field2045 = null;
        }
        field2045 = null;
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(ILph;)V")
    public final void method738(int arg0, class147 arg1) {
        field2028++;
        if (arg1.field2829 != null) {
            arg1.method1031((byte) 3);
        }
        arg1.field2839 = this.field2039;
        arg1.field2829 = this.field2039.field2829;
        arg1.field2829.field2839 = arg1;
        if (arg0 != 18619) {
            field2036 = 1;
        }
        arg1.field2839.field2829 = arg1;
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(II)Llf;")
    public static final class109 method739(int arg0, int arg1) {
        if (arg1 != -1665) {
            field2026 = null;
        }
        field2035++;
        return class36.method279(new class109[] { class52.method345((byte) 85, arg0 >> 24 & 0xFF), class42.field874, class52.method345((byte) 85, arg0 >> 16 & 0xFF), class42.field874, class52.method345((byte) 85, arg0 >> 8 & 0xFF), class42.field874, class52.method345((byte) 85, arg0 & 0xFF) }, arg1 ^ 0x6E2);
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(B)Lph;")
    public final class147 method740(byte arg0) {
        field2032++;
        class147 var2 = this.field2039.field2839;
        if (this.field2039 == var2) {
            return null;
        }
        var2.method1031((byte) 3);
        if (arg0 > -41) {
            this.method743(true);
        }
        return var2;
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(B[Llf;)[Llf;")
    public static final class109[] method741(byte arg0, class109[] arg1) {
        field2040++;
        class109[] var2 = new class109[5];
        if (arg0 > -72) {
            field2031 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class36.method279(new class109[] { class52.method345((byte) 85, var3), class3.field30 }, 127);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class36.method279(new class109[] { var2[var3], arg1[var3] }, 122);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(Llf;IZ)V")
    public static final void method742(class109 arg0, int arg1, boolean arg2) {
        field2033++;
        byte var3 = 4;
        int var4 = class92.field1891.method132(arg0, 250);
        int var5 = var3 + 6;
        int var6 = class92.field1891.method136(arg0, 250) * 13;
        int var7 = var3 + 6;
        class11.method76(var5 - var3, -var3 + var7, var3 + var4 + var3, var3 + var6 + var3, 0);
        class11.method69(var5 - var3, -var3 + var7, var3 + var4 + var3, var3 + var6 + var3, 16777215);
        class92.field1891.method142(arg0, var5, var7, var4, var6, 16777215, arg1, 1, 1, 0);
        class193.method1294(var3 + var6 + var3, var7 - var3, var5 - var3, var4 - (-var3 - var3), arg1 ^ 0xFFFFFF43);
        if (!arg2) {
            class182.method1240(var4, 0, var6, var5, var7);
            return;
        }
        try {
            Graphics var8 = class6.field88.getGraphics();
            class68.field1320.method328(0, (byte) -121, var8, 0);
        } catch (Exception var9) {
            class6.field88.repaint();
        }
    }

    @OriginalMember(owner = "l", name = "a", descriptor = "(Z)Lph;")
    public final class147 method743(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            class147 var2 = this.field2039.field2839;
            field2041++;
            return this.field2039 == var2 ? null : var2;
        }
    }

    @OriginalMember(owner = "l", name = "<init>", descriptor = "()V")
    public class103() {
        this.field2039.field2829 = this.field2039;
        this.field2039.field2839 = this.field2039;
    }
}
