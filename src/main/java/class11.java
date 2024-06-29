import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class578 {

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
    public static int field108 = -1;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "Z")
    public static boolean field113 = false;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "J")
    public static long field115;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "Ljca;")
    public static class637 field99;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "Ljava/lang/String;")
    public String field106;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "[C")
    public char[] field103;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "[C")
    public char[] field111;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "[I")
    public int[] field100;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "[I")
    public int[] field104;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lac;II)V")
    private final void method50(class501 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field106 = arg0.method2851((byte) -104);
        } else if (arg1 == 2) {
            int var7 = arg0.method2874((byte) -75);
            this.field104 = new int[var7];
            this.field111 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field104[var8] = arg0.method2845(-1);
                byte var9 = arg0.method2863(105);
                this.field111[var8] = var9 == 0 ? 0 : class435.method2490(-128, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2874((byte) -75);
            this.field100 = new int[var4];
            this.field103 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field100[var5] = arg0.method2845(-1);
                byte var6 = arg0.method2863(101);
                this.field103[var5] = var6 == 0 ? 0 : class435.method2490(arg2 - 128, var6);
            }
        }
        field105++;
        if (arg2 != 0) {
            method57(72, false, -74, 105, -38, 113, 85, 15);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLjava/awt/Component;)Ljt;")
    public static final class90 method51(byte arg0, Component arg1) {
        if (arg0 != 31) {
            field114 = -66;
        }
        field107++;
        return new class9(arg1);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IC)I")
    public final int method52(int arg0, char arg1) {
        field109++;
        if (this.field104 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field104.length; var3++) {
            if (this.field111[var3] == arg1) {
                return this.field104[var3];
            }
        }
        if (arg0 != -1) {
            this.field106 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method53(byte arg0) {
        field99 = null;
        if (arg0 != -13) {
            method53((byte) 21);
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 != 32768) {
            field114 = -17;
        }
        if (this.field100 != null) {
            for (int var2 = 0; var2 < this.field100.length; var2++) {
                this.field100[var2] = class647.method3617(this.field100[var2], 32768);
            }
        }
        field101++;
        if (this.field104 != null) {
            for (int var3 = 0; var3 < this.field104.length; var3++) {
                this.field104[var3] = class647.method3617(this.field104[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(CB)I")
    public final int method55(char arg0, byte arg1) {
        field112++;
        if (this.field100 == null) {
            return -1;
        }
        if (arg1 <= 90) {
            field99 = null;
        }
        for (int var3 = 0; var3 < this.field100.length; var3++) {
            if (this.field103[var3] == arg0) {
                return this.field100[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lac;I)V")
    public final void method56(class501 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                field102++;
                return;
            }
            this.method50(arg0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method57(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field110++;
        int var8 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg3);
        int var9 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg7);
        int var10 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg2);
        int var11 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg6);
        int var12 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg0 + arg3);
        int var13 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg7 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class470.method2660(var10, var11, class344.field4599[var14], (byte) 11, arg4);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class470.method2660(var10, var11, class344.field4599[var15], (byte) 11, arg4);
        }
        int var16 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg0 + arg2);
        if (arg1) {
            method53((byte) -102);
        }
        int var17 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg6 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class344.field4599[var18];
            class470.method2660(var10, var16, var19, (byte) 11, arg4);
            class470.method2660(var16, var17, var19, (byte) 11, arg5);
            class470.method2660(var17, var11, var19, (byte) 11, arg4);
        }
    }
}
