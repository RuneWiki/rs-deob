import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class479 {

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Z")
    public static boolean field6773 = false;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
    public static int[] field6770 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!up", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field6786 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public int field6769;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Lis;")
    public class42 field6788;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[I")
    public int[] field6771;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
    public int[] field6774;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "[I")
    public int[] field6776;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "[I")
    public int[] field6777;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
    public int[] field6780;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
    public int[] field6787;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "[Lis;")
    public class42[] field6778;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "[[I")
    public int[][] field6775;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "[[I")
    public int[][] field6782;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BB)V")
    private final void method2832(byte[] arg0, byte arg1) {
        field6781++;
        class179 var3 = new class179(class79.method398(arg0, (byte) 120));
        int var4 = var3.method895((byte) -86);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field6779 = 0;
        } else {
            this.field6779 = var3.method939((byte) -81);
        }
        int var5 = var3.method895((byte) -97);
        this.field6769 = var3.method916(21933);
        int var6 = 0;
        this.field6771 = new int[this.field6769];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field6769; var8++) {
            this.field6771[var8] = var6 += var3.method916(21933);
            if (var7 < this.field6771[var8]) {
                var7 = this.field6771[var8];
            }
        }
        this.field6783 = var7 + 1;
        this.field6787 = new int[this.field6783];
        this.field6775 = new int[this.field6783][];
        this.field6780 = new int[this.field6783];
        this.field6776 = new int[this.field6783];
        this.field6777 = new int[this.field6783];
        if (var5 != 0) {
            this.field6774 = new int[this.field6783];
            for (int var9 = 0; var9 < this.field6783; var9++) {
                this.field6774[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field6769; var10++) {
                this.field6774[this.field6771[var10]] = var3.method939((byte) 97);
            }
            this.field6788 = new class42(this.field6774);
        }
        for (int var11 = 0; var11 < this.field6769; var11++) {
            this.field6777[this.field6771[var11]] = var3.method939((byte) -105);
        }
        for (int var12 = 0; var12 < this.field6769; var12++) {
            this.field6776[this.field6771[var12]] = var3.method939((byte) -85);
        }
        for (int var13 = 0; var13 < this.field6769; var13++) {
            this.field6787[this.field6771[var13]] = var3.method916(21933);
        }
        int var14 = 34 / ((arg1 - 49) / 41);
        for (int var15 = 0; var15 < this.field6769; var15++) {
            int var22 = this.field6771[var15];
            int var23 = this.field6787[var22];
            int var24 = 0;
            this.field6775[var22] = new int[var23];
            int var25 = -1;
            for (int var26 = 0; var26 < var23; var26++) {
                int var27 = this.field6775[var22][var26] = var24 += var3.method916(21933);
                if (var25 < var27) {
                    var25 = var27;
                }
            }
            this.field6780[var22] = var25 + 1;
            if ((var25 + 1) == var23) {
                this.field6775[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field6778 = new class42[var7 + 1];
        this.field6782 = new int[var7 + 1][];
        for (int var16 = 0; var16 < this.field6769; var16++) {
            int var17 = this.field6771[var16];
            int var18 = this.field6787[var17];
            this.field6782[var17] = new int[this.field6780[var17]];
            for (int var19 = 0; var19 < this.field6780[var17]; var19++) {
                this.field6782[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field6775[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field6775[var17][var20];
                }
                this.field6782[var17][var21] = var3.method939((byte) -98);
            }
            this.field6778[var17] = new class42(this.field6782[var17]);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2833(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZZIIII)V")
    public static final void method2834(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class317.field4626 = arg0;
        class90.field1130 = arg4;
        class258.field3729 = arg5;
        field6785++;
        class47.field625 = arg3;
        class233.field3241 = arg6;
        if (arg2 && class317.field4626 >= 100) {
            class58.field734 = class90.field1130 * 128 + 64;
            class351.field5047 = class233.field3241 * 128 + 64;
            class427.field6145 = class375.method2264(-1547, class351.field5047, class100.field1217, class58.field734) - class258.field3729;
        }
        if (arg1) {
            field6772 = -28;
        }
        class358.field5167 = 2;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public static void method2835(int arg0) {
        field6786 = null;
        field6770 = null;
        if (arg0 >= -21) {
            field6773 = true;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "([BI)V")
    public class479(byte[] arg0, int arg1) {
        this.field6784 = class218.method1223((byte) -94, arg0.length, arg0);
        if (this.field6784 != arg1) {
            throw new RuntimeException();
        }
        this.method2832(arg0, (byte) -59);
    }
}
