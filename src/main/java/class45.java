import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class45 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
    public static int[] field638 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
    public static boolean field642 = false;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "J")
    public long field640;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lfb;")
    public class45 field636;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lfb;")
    public class45 field641;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method322(int arg0) {
        field635++;
        if (this.field641 == null) {
            return;
        }
        this.field641.field636 = this.field636;
        this.field636.field641 = this.field641;
        if (arg0 == 11) {
            this.field636 = null;
            this.field641 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Z")
    public final boolean method323(byte arg0) {
        field634++;
        if (arg0 != 69) {
            this.method322(-30);
        }
        return this.field641 != null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V")
    public static final void method324(int arg0, String[] arg1, short[] arg2, int arg3, int arg4) {
        field637++;
        if (arg4 < arg3) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method324(66, arg1, arg2, var6 - 1, arg4);
            method324(116, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 < 37) {
            field638 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(CB)Z")
    public static final boolean method325(char arg0, byte arg1) {
        field639++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class28.method194(arg0, -49)) {
            return true;
        } else {
            char[] var2 = class430.field6328;
            int var3 = 9 / ((-arg1 - 38) / 33);
            for (int var4 = 0; var4 < var2.length; var4++) {
                char var8 = var2[var4];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var5 = class291.field4170;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method326(int arg0) {
        field638 = null;
        if (arg0 < 71) {
            field638 = null;
        }
    }
}
