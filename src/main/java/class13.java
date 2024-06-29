import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 {

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[I")
    private int[] field178;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lba;")
    public static class4 field176 = class14.method105((byte) -76, "Transportation");

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "[[[[B")
    public static byte[][][][] field180 = new byte[5][][][];

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field177;

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "Ljava/lang/String;")
    public static String field182;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "[I")
    public static int[] field181;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)I", line = 10)
    public final int method99(int arg0, int arg1) {
        if (arg1 != -1) {
            method100(41);
        }
        int var3 = this.field178.length - 2;
        int var4 = var3 & arg0 << 1;
        while (true) {
            int var5 = this.field178[var4];
            if (arg0 == var5) {
                return this.field178[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 38)
    public static void method100(int arg0) {
        field177 = null;
        if (arg0 != -1) {
            field183 = 40;
        }
        field180 = null;
        field176 = null;
        field181 = null;
        field182 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([I)V", line = 94)
    public class13(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field178 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field178[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field178[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field178[var5 + var5] = arg0[var4];
            this.field178[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(I)[Lf;", line = 131)
    public static final class11[] method101(int arg0) {
        class11[] var1 = new class11[class5.field107];
        for (int var2 = 0; var2 < class5.field107; var2++) {
            class11 var3 = var1[var2] = new class11();
            var3.field161 = class23.field281[var2];
            var3.field164 = class24.field291[var2];
            var3.field165 = class5.field104[var2];
            var3.field163 = class29.field370[var2];
            int var4 = var3.field165 * var3.field163;
            byte[] var5 = class9.field149[var2];
            var3.field162 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field162[var6] = class22.field274[class3.method25(var5[var6], 255)];
            }
        }
        if (arg0 != -27085) {
            field177 = null;
        }
        class35.method224(-6063);
        return var1;
    }
}
