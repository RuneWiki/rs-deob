import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class154 extends class106 {

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public int field3192 = -1;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "Z")
    public boolean field3197 = false;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
    private int[] field3201 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lrf;")
    public static class163 field3185 = class53.method392(-75, "(U0a )2 via: ");

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Lrf;")
    private static class163 field3193 = class53.method392(-65, "Please remove ");

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lrf;")
    public static class163 field3186 = field3193;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Lrf;")
    public static class163 field3194 = field3193;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Lfc;")
    public static class54 field3191 = new class54(200);

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lrf;")
    public static class163 field3200 = class53.method392(-91, ")4lang)4de");

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "[I")
    public static int[] field3203 = new int[2000];

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "[[[I")
    public static int[][][] field3199 = new int[4][105][105];

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lrf;")
    public static class163 field3205 = class53.method392(62, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "Ljava/awt/Image;")
    public static Image field3202;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[I")
    private int[] field3178;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[S")
    private short[] field3188;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "[S")
    private short[] field3189;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "[S")
    private short[] field3190;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "[S")
    private short[] field3195;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILfa;)V")
    public final void method983(int arg0, class52 arg1) {
        while (true) {
            int var3 = arg1.method344(255);
            if (var3 == 0) {
                field3182++;
                if (arg0 >= -4) {
                    field3202 = null;
                    return;
                }
                return;
            }
            this.method991(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Lei;")
    public final class50 method984(byte arg0) {
        class50[] var2 = new class50[5];
        field3177++;
        if (arg0 != -54) {
            this.method984((byte) 15);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3201[var4] != -1) {
                var2[var3++] = class50.method317(class127.field2617, this.field3201[var4], 0);
            }
        }
        class50 var5 = new class50(var2, var3);
        if (this.field3190 != null) {
            for (int var6 = 0; var6 < this.field3190.length; var6++) {
                var5.method319(this.field3190[var6], this.field3195[var6]);
            }
        }
        if (this.field3189 != null) {
            for (int var7 = 0; var7 < this.field3189.length; var7++) {
                var5.method322(this.field3189[var7], this.field3188[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method985(boolean arg0) {
        field3205 = null;
        field3200 = null;
        field3185 = null;
        field3193 = null;
        field3191 = null;
        field3199 = null;
        field3203 = null;
        field3194 = null;
        if (arg0) {
            field3186 = null;
            field3202 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        if (arg0 >= -121) {
            field3203 = null;
        }
        boolean var2 = true;
        field3183++;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3201[var3] != -1 && !class127.field2617.method1248(this.field3201[var3], 0, -96)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILbe;[BB)V")
    public static final void method987(int arg0, class16 arg1, byte[] arg2, byte arg3) {
        field3187++;
        class82 var4 = new class82();
        var4.field1666 = 0;
        var4.field1663 = arg1;
        var4.field1657 = arg2;
        var4.field1950 = arg0;
        if (arg3 < 41) {
            return;
        }
        class5 var5 = class96.field2046;
        synchronized (class96.field2046) {
            class96.field2046.method51(0, var4);
        }
        class22.method133(-25294);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Lei;")
    public final class50 method988(int arg0) {
        field3184++;
        if (this.field3178 == null) {
            return null;
        }
        class50[] var2 = new class50[this.field3178.length];
        for (int var3 = arg0; var3 < this.field3178.length; var3++) {
            var2[var3] = class50.method317(class127.field2617, this.field3178[var3], 0);
        }
        class50 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class50(var2, var2.length);
        }
        if (this.field3190 != null) {
            for (int var5 = 0; var5 < this.field3190.length; var5++) {
                var4.method319(this.field3190[var5], this.field3195[var5]);
            }
        }
        if (this.field3189 != null) {
            for (int var6 = 0; var6 < this.field3189.length; var6++) {
                var4.method322(this.field3189[var6], this.field3188[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        field3179++;
        if (arg0 != 9759) {
            this.method986(109);
        }
        if (this.field3178 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3178.length; var3++) {
            if (!class127.field2617.method1248(this.field3178[var3], 0, arg0 - 9643)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)I")
    public static final int method990(byte arg0, int arg1, int arg2) {
        field3196++;
        if (arg0 <= 101) {
            method987(-26, null, null, (byte) -93);
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILfa;)V")
    private final void method991(int arg0, int arg1, class52 arg2) {
        if (arg1 != 0) {
            return;
        }
        field3181++;
        if (arg0 == 1) {
            this.field3192 = arg2.method344(255);
        } else if (arg0 == 2) {
            int var4 = arg2.method344(255);
            this.field3178 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3178[var5] = arg2.method390((byte) 93);
            }
        } else if (arg0 == 3) {
            this.field3197 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method344(255);
            this.field3195 = new short[var8];
            this.field3190 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3190[var9] = (short) arg2.method390((byte) 118);
                this.field3195[var9] = (short) arg2.method390((byte) 94);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method344(arg1 ^ 0xFF);
            this.field3189 = new short[var6];
            this.field3188 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3189[var7] = (short) arg2.method390((byte) 90);
                this.field3188[var7] = (short) arg2.method390((byte) 114);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3201[arg0 - 60] = arg2.method390((byte) 119);
            return;
        }
    }
}
