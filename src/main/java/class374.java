import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class374 extends class476 {

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public int field5381 = 0;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    public static int field5376 = 0;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5373 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "[I")
    public static int[] field5383 = new int[13];

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "Lkc;")
    public static class157 field5385 = new class157("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public int field5361;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public int field5382;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "Lpm;")
    public class103 field5371;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Ljm;")
    public class209 field5360;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Les;")
    public class477 field5367;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Les;")
    public class477 field5369;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lpf;")
    public class487 field5364;

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "Lc;")
    public static class512 field5384;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "Z")
    public boolean field5379;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "[I")
    public int[] field5363;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Liq;")
    public static final class151 method2240(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = var3.field7825;
            var3.field7825 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
    public static final int method2241(int arg0, boolean arg1, String arg2, boolean arg3) {
        field5374++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (arg0 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (var10 / arg0 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIZII)I")
    public static final int method2242(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            return -32;
        }
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg5 & 0x3;
        field5362++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 8 - arg3 - arg6;
        } else {
            return 1 + 7 - arg2 - arg1;
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
    public static void method2243(byte arg0) {
        field5383 = null;
        field5384 = null;
        if (arg0 <= -45) {
            field5373 = null;
            field5385 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)V")
    public final void method2244(byte arg0) {
        field5372++;
        if (arg0 < 22) {
            return;
        }
        int var2 = this.field5361;
        if (this.field5371 != null) {
            class103 var5 = this.field5371.method795(-31036, class309.field4200);
            if (var5 == null) {
                this.field5363 = null;
                this.field5359 = 0;
                this.field5366 = 0;
                this.field5378 = 0;
                this.field5368 = 0;
                this.field5361 = -1;
            } else {
                this.field5378 = var5.field1657 << 7;
                this.field5361 = var5.field1680;
                this.field5366 = var5.field1637;
                this.field5359 = var5.field1688;
                this.field5363 = var5.field1675;
                this.field5368 = var5.field1642;
            }
        } else if (this.field5360 != null) {
            int var3 = class7.method45(20215, this.field5360);
            if (var2 != var3) {
                this.field5361 = var3;
                class83 var4 = this.field5360.field2976;
                if (var4.field1272 != null) {
                    var4 = var4.method655(class309.field4200, (byte) 123);
                }
                if (var4 == null) {
                    this.field5366 = this.field5378 = 0;
                } else {
                    this.field5378 = var4.field1275 << 7;
                    this.field5366 = var4.field1254;
                }
            }
        } else if (this.field5364 != null) {
            this.field5361 = class273.method1598(this.field5364, (byte) 122);
            this.field5366 = this.field5364.field7018;
            this.field5378 = this.field5364.field7043 << 7;
        }
        if (this.field5361 != var2 && this.field5367 != null) {
            class290.field3924.method298(this.field5367);
            this.field5367 = null;
        }
    }
}
