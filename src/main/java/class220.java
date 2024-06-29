import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class220 {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public int field2710 = 43594;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public int field2711 = 443;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "Z")
    public boolean field2719 = false;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Lsw;")
    public static class641 field2716 = new class641(4);

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "[I")
    public static int[] field2720 = new int[500];

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "Lvs;")
    public static class506 field2721;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "Ljava/lang/String;")
    public String field2713;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILoca;)Z", line = 7)
    public final boolean method1266(int arg0, class220 arg1) {
        field2712++;
        if (arg0 != 29303) {
            this.method1266(95, null);
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field2715 == arg1.field2715 && this.field2713.equals(arg1.field2713);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;", line = 24)
    public static final String[] method1267(String arg0, char arg1, byte arg2) {
        field2717++;
        int var3 = class105.method618(19707, arg1, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = 76 / ((56 - arg2) / 44);
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var6; arg0.charAt(var9) != arg1; var9++) {
            }
            var4[var5++] = arg0.substring(var6, var9);
            var6 = var9 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)I", line = 60)
    public final int method1268(boolean arg0) {
        if (arg0) {
            method1271(81);
        }
        field2718++;
        return this.field2719 ? this.field2711 : this.field2710;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z", line = 75)
    public static final boolean method1269(int arg0, int arg1, int arg2) {
        int var3 = -92 % ((-arg0 - 79) / 38);
        field2714++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V", line = 88)
    public static final void method1270(int arg0, int arg1, int arg2) {
        boolean var3 = class383.field5070[0][arg1][arg2] != null && class383.field5070[0][arg1][arg2].field4494 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class383.field5070[var4][arg1][arg2] == null) {
                class349 var5 = class383.field5070[var4][arg1][arg2] = new class349(var4, arg1, arg2);
                if (var3) {
                    var5.field4495++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V", line = 108)
    public static void method1271(int arg0) {
        field2720 = null;
        field2721 = null;
        field2716 = null;
        if (arg0 != 0) {
            method1271(-82);
        }
    }
}
