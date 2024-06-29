import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class39 extends class129 {

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public int field576 = -1;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public int field580 = 12800;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public int field591 = 12800;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public int field589 = 0;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
    public boolean field586 = true;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public int field594 = 0;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public int field590 = -1;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Ljava/lang/String;")
    public String field578;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Ljava/lang/String;")
    public String field595;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lci;")
    public class60 field575;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "[I")
    public static int[] field583 = new int[5];

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Lvh;")
    public static class108 field582;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)[I")
    public final int[] method261(byte arg0, int arg1, int arg2) {
        field577++;
        for (class73 var4 = (class73) this.field575.method379(6347); var4 != null; var4 = (class73) this.field575.method378(69)) {
            if (var4.method438(arg0 ^ 0xFFFFB827, arg2, arg1)) {
                return var4.method446(arg1, 106, arg2);
            }
        }
        if (arg0 != 106) {
            this.field590 = 97;
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BZIII)V")
    public static final void method262(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class58.field1023 = 0L;
        field588++;
        int var5 = class85.method557(false);
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (class131.field2291.startsWith("mac") && arg4 > 0) {
            arg1 = true;
        }
        boolean var6 = false;
        if (var5 <= 0 == arg4 > 0) {
            var6 = true;
        }
        if (arg0 != -20) {
            field582 = null;
        }
        if (arg1 && arg4 > 0) {
            var6 = true;
        }
        class107.method725(var5, arg4, var6, arg0 ^ 0xFFFFFFED, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)[I")
    public final int[] method263(int arg0, byte arg1, int arg2) {
        if (arg1 > -41) {
            this.field586 = false;
        }
        field584++;
        for (class73 var4 = (class73) this.field575.method379(6347); var4 != null; var4 = (class73) this.field575.method378(-94)) {
            if (var4.method444(arg0, 0, arg2)) {
                return var4.method442(arg2, 26, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 != 15907) {
            field582 = null;
        }
        field582 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIII)[I")
    public final int[] method265(int arg0, int arg1, int arg2, int arg3) {
        field585++;
        for (class73 var5 = (class73) this.field575.method379(arg3 + 6342); var5 != null; var5 = (class73) this.field575.method378(-51)) {
            if (var5.method439(arg3 - 129, arg0, arg2, arg1)) {
                return var5.method442(arg1, 26, arg0);
            }
        }
        if (arg3 != 5) {
            this.field595 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Z")
    public final boolean method266(int arg0, int arg1, int arg2) {
        field592++;
        if (arg1 != 0) {
            return true;
        }
        for (class73 var4 = (class73) this.field575.method379(6347); var4 != null; var4 = (class73) this.field575.method378(-111)) {
            if (var4.method444(arg0, 0, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method267(int arg0) {
        this.field594 = 0;
        this.field580 = 12800;
        field593++;
        this.field591 = arg0;
        this.field589 = 0;
        for (class73 var2 = (class73) this.field575.method379(arg0 - 6453); var2 != null; var2 = (class73) this.field575.method378(arg0 ^ 0x3251)) {
            if (var2.field1212 > this.field594) {
                this.field594 = var2.field1212;
            }
            if (var2.field1196 < this.field591) {
                this.field591 = var2.field1196;
            }
            if (var2.field1205 > this.field589) {
                this.field589 = var2.field1205;
            }
            if (this.field580 > var2.field1193) {
                this.field580 = var2.field1193;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class39(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field586 = arg5;
        this.field576 = arg6;
        this.field578 = arg2;
        this.field579 = arg3;
        this.field590 = arg4;
        this.field595 = arg1;
        if (this.field576 == 255) {
            this.field576 = 0;
        }
        this.field581 = arg0;
        this.field575 = new class60();
    }
}
