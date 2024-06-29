import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class669 extends class659 {

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "Ljava/lang/String;")
    public static String field8960 = "";

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8962;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "Ljava/lang/String;")
    public String field8967;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "[C")
    public char[] field8959;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "[C")
    public char[] field8965;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "[I")
    public int[] field8961;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "[I")
    public int[] field8968;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(CI)I")
    public final int method3688(char arg0, int arg1) {
        field8958++;
        if (this.field8961 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8961.length; var3++) {
            if (this.field8965[var3] == arg0) {
                return this.field8961[var3];
            }
        }
        return arg1 < 93 ? -81 : -1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILdt;I)V")
    private final void method3689(int arg0, class254 arg1, int arg2) {
        field8963++;
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field8967 = arg1.method1699(arg0 ^ 0xFFFFFF92);
        } else if (arg2 == 2) {
            int var4 = arg1.method1731((byte) 64);
            this.field8959 = new char[var4];
            this.field8968 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8968[var5] = arg1.method1728((byte) 53);
                byte var6 = arg1.method1737(true);
                this.field8959[var5] = var6 == 0 ? 0 : class207.method1357(true, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1731((byte) 64);
            this.field8961 = new int[var7];
            this.field8965 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8961[var8] = arg1.method1728((byte) 59);
                byte var9 = arg1.method1737(true);
                this.field8965[var8] = var9 == 0 ? 0 : class207.method1357(true, var9);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V")
    public static final void method3690(byte arg0) {
        class8.field70 = 0;
        class15.field148 = -1;
        int var1 = -42 / ((arg0 - 59) / 41);
        class302.field4242 = -1;
        field8971++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3691(int arg0, boolean arg1) {
        field8964++;
        if (arg1) {
            return arg0 == 3 || arg0 == 7 || arg0 == 10;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLdt;)V")
    public final void method3692(byte arg0, class254 arg1) {
        if (arg0 > -95) {
            return;
        }
        field8970++;
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method3689(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IC)I")
    public final int method3693(int arg0, char arg1) {
        field8966++;
        if (this.field8968 == null) {
            return -1;
        } else if (arg0 >= -100) {
            return -95;
        } else {
            for (int var3 = 0; var3 < this.field8968.length; var3++) {
                if (this.field8959[var3] == arg1) {
                    return this.field8968[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
    public static void method3694(boolean arg0) {
        field8962 = null;
        if (!arg0) {
            field8960 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)V")
    public final void method3695(byte arg0) {
        field8969++;
        if (this.field8961 != null) {
            for (int var2 = 0; var2 < this.field8961.length; var2++) {
                this.field8961[var2] = class670.method3699(this.field8961[var2], 32768);
            }
        }
        if (arg0 >= -59) {
            this.field8959 = null;
        }
        if (this.field8968 != null) {
            for (int var3 = 0; var3 < this.field8968.length; var3++) {
                this.field8968[var3] = class670.method3699(this.field8968[var3], 32768);
            }
        }
    }
}
