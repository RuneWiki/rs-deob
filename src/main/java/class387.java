import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class387 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public int field5348 = 0;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public int field5350 = 2048;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public int field5352 = 0;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public int field5355 = 2048;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Lbt;")
    public static class32 field5351 = new class32(new byte[5000]);

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Lh;")
    public static class434 field5356 = new class434(40, 1);

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "Lmc;")
    public static class78 field5361 = new class78(80, 7);

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field5360;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[Z")
    public static boolean[] field5359;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lbt;I)V")
    public final void method2376(class32 arg0, int arg1) {
        field5349++;
        while (true) {
            int var3 = arg0.method201((byte) -119);
            if (var3 == 0) {
                if (arg1 == 4) {
                    return;
                } else {
                    field5361 = null;
                    return;
                }
            }
            this.method2378(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method2377(int arg0) {
        field5356 = null;
        field5361 = null;
        int var1 = -14 / ((arg0 - 8) / 63);
        field5359 = null;
        field5360 = null;
        field5351 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lbt;IZ)V")
    private final void method2378(class32 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method2378((class32) null, -4, false);
        }
        field5353++;
        if (arg1 == 1) {
            this.field5348 = arg0.method201((byte) -106);
        } else if (arg1 == 2) {
            this.field5355 = arg0.method215((byte) 113);
        } else if (arg1 == 3) {
            this.field5350 = arg0.method215((byte) 104);
        } else if (arg1 == 4) {
            this.field5352 = arg0.method209((byte) 35);
            return;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IC)Z")
    public static final boolean method2379(int arg0, char arg1) {
        if (arg0 != 28407) {
            field5356 = null;
        }
        field5357++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2380(int arg0, int arg1, String[] arg2, int arg3) {
        field5354++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg1 != 21870) {
                field5361 = null;
            }
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
