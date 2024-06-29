import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class553 extends class356 {

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "Lgs;")
    public static class41 field7884 = new class41("LIVE", 0);

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "F")
    public static float field7887;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "Lsba;")
    public static class199 field7886;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Ljava/lang/String;")
    public String field7877;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "[C")
    public char[] field7881;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "[C")
    public char[] field7883;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "[I")
    public int[] field7878;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "[I")
    public int[] field7880;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CI)I", line = 4)
    public final int method3114(char arg0, int arg1) {
        if (arg1 != 3842) {
            this.method3114((char) 65530, -81);
        }
        field7885++;
        if (this.field7880 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field7880.length; var3++) {
            if (this.field7883[var3] == arg0) {
                return this.field7880[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V", line = 29)
    public static void method3115(boolean arg0) {
        if (arg0) {
            method3116((byte) -82);
        }
        field7884 = null;
        field7886 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)[Lhh;", line = 42)
    public static final class116[] method3116(byte arg0) {
        field7879++;
        if (arg0 != -87) {
            method3116((byte) -67);
        }
        return new class116[] { class19.field175, class627.field8899, class210.field2553 };
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(CI)I", line = 54)
    public final int method3117(char arg0, int arg1) {
        field7875++;
        if (this.field7878 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field7878.length; var3++) {
            if (this.field7881[var3] == arg0) {
                return this.field7878[var3];
            }
        }
        if (arg1 >= -106) {
            field7888 = -24;
        }
        return -1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILiaa;)V", line = 81)
    public final void method3118(int arg0, class452 arg1) {
        field7876++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method2541(97);
            if (var3 == 0) {
                return;
            }
            this.method3120(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)V", line = 105)
    public final void method3119(byte arg0) {
        if (this.field7880 != null) {
            for (int var2 = 0; var2 < this.field7880.length; var2++) {
                this.field7880[var2] = class139.method776(this.field7880[var2], 32768);
            }
        }
        field7882++;
        if (arg0 < -74 && this.field7878 != null) {
            for (int var3 = 0; var3 < this.field7878.length; var3++) {
                this.field7878[var3] = class139.method776(this.field7878[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZILiaa;)V", line = 149)
    private final void method3120(boolean arg0, int arg1, class452 arg2) {
        if (arg0) {
            field7884 = null;
        }
        if (arg1 == 1) {
            this.field7877 = arg2.method2516(114);
        } else if (arg1 == 2) {
            int var7 = arg2.method2541(124);
            this.field7878 = new int[var7];
            this.field7881 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7878[var8] = arg2.method2574(-1758460248);
                byte var9 = arg2.method2547(true);
                this.field7881[var8] = var9 == 0 ? 0 : class278.method1589(var9, false);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method2541(79);
            this.field7880 = new int[var4];
            this.field7883 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7880[var5] = arg2.method2574(-1758460248);
                byte var6 = arg2.method2547(true);
                this.field7883[var5] = var6 == 0 ? 0 : class278.method1589(var6, false);
            }
        }
        field7874++;
    }
}
