import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class306 extends class85 {

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field3935 = -1;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "Z")
    public static boolean field3943 = false;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field3945 = -1;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Ljava/lang/String;")
    public String field3939;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "[C")
    public char[] field3936;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "[C")
    public char[] field3940;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
    public int[] field3942;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
    public int[] field3946;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZC)I")
    public final int method1825(boolean arg0, char arg1) {
        field3947++;
        if (this.field3946 == null) {
            return -1;
        }
        if (arg0) {
            this.method1829(-55, (byte) 18, null);
        }
        for (int var3 = 0; var3 < this.field3946.length; var3++) {
            if (this.field3940[var3] == arg1) {
                return this.field3946[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
    public final void method1826(byte arg0) {
        field3944++;
        if (this.field3946 != null) {
            for (int var2 = 0; var2 < this.field3946.length; var2++) {
                this.field3946[var2] = class31.method213(this.field3946[var2], 32768);
            }
        }
        if (arg0 != -28) {
            this.field3942 = null;
        }
        if (this.field3942 != null) {
            for (int var3 = 0; var3 < this.field3942.length; var3++) {
                this.field3942[var3] = class31.method213(this.field3942[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lbt;I)V")
    public final void method1827(class88 arg0, int arg1) {
        if (arg1 != -12697) {
            return;
        }
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                field3938++;
                return;
            }
            this.method1829(var3, (byte) -31, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(CB)I")
    public final int method1828(char arg0, byte arg1) {
        field3941++;
        if (this.field3942 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3942.length; var3++) {
            if (this.field3936[var3] == arg0) {
                return this.field3942[var3];
            }
        }
        return arg1 == -51 ? -1 : -33;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLbt;)V")
    private final void method1829(int arg0, byte arg1, class88 arg2) {
        if (arg1 != -31) {
            this.method1825(true, (char) 65446);
        }
        if (arg0 == 1) {
            this.field3939 = arg2.method591(20557);
        } else if (arg0 == 2) {
            int var7 = arg2.method617(2);
            this.field3942 = new int[var7];
            this.field3936 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3942[var8] = arg2.method568((byte) 110);
                byte var9 = arg2.method575(-122);
                this.field3936[var8] = var9 == 0 ? 0 : class148.method1027(var9, (byte) -103);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method617(2);
            this.field3940 = new char[var4];
            this.field3946 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3946[var5] = arg2.method568((byte) 110);
                byte var6 = arg2.method575(-34);
                this.field3940[var5] = var6 == 0 ? 0 : class148.method1027(var6, (byte) -117);
            }
        }
        field3937++;
    }
}
