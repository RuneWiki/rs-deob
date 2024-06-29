import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class38 extends class94 {

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public int field473 = 0;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[I")
    public int[] field491 = new int[4];

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field474 = -1;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field479 = 1;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public int field513 = 0;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public int field515 = -32768;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field462 = 0;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public int field495 = 0;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field475 = 0;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field482 = 0;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field472 = 0;

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
    public int field527 = 0;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "[B")
    public byte[] field487 = new byte[10];

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public int field478 = 0;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public int field496 = -1;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public int field504 = 0;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public int field522 = -1;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public int field506 = 0;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "[I")
    public int[] field505 = new int[10];

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "[Loi;")
    public class262[] field523 = new class262[12];

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!te", name = "Fb", descriptor = "I")
    public int field539 = 100;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public int field507 = -1;

    @OriginalMember(owner = "client!te", name = "xb", descriptor = "I")
    public int field531 = 0;

    @OriginalMember(owner = "client!te", name = "Hb", descriptor = "I")
    public int field541 = 0;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public int field465 = -1;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public int field510 = 0;

    @OriginalMember(owner = "client!te", name = "Gb", descriptor = "I")
    public int field540 = 0;

    @OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
    private int field529 = 0;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public int field514 = 0;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "I")
    private int field525 = 0;

    @OriginalMember(owner = "client!te", name = "yb", descriptor = "I")
    public int field532 = 0;

    @OriginalMember(owner = "client!te", name = "Pb", descriptor = "[I")
    public int[] field549 = new int[4];

    @OriginalMember(owner = "client!te", name = "Kb", descriptor = "I")
    public int field544 = 0;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    private int field517 = 0;

    @OriginalMember(owner = "client!te", name = "Mb", descriptor = "I")
    public int field546 = -1;

    @OriginalMember(owner = "client!te", name = "wb", descriptor = "I")
    public int field530 = -1;

    @OriginalMember(owner = "client!te", name = "Ob", descriptor = "Ljava/lang/String;")
    public String field548 = null;

    @OriginalMember(owner = "client!te", name = "Vb", descriptor = "Z")
    private boolean field555 = false;

    @OriginalMember(owner = "client!te", name = "Xb", descriptor = "I")
    public int field557 = 0;

    @OriginalMember(owner = "client!te", name = "Ib", descriptor = "Z")
    public boolean field542 = false;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    private int field508 = 0;

    @OriginalMember(owner = "client!te", name = "Jb", descriptor = "I")
    public int field543 = 0;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public int field492 = 0;

    @OriginalMember(owner = "client!te", name = "Ab", descriptor = "I")
    public int field534 = 0;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
    public int field526 = 0;

    @OriginalMember(owner = "client!te", name = "Lb", descriptor = "I")
    public int field545 = 0;

    @OriginalMember(owner = "client!te", name = "Qb", descriptor = "I")
    public int field550 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "[I")
    public int[] field509 = new int[4];

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Z")
    public boolean field490 = false;

    @OriginalMember(owner = "client!te", name = "ac", descriptor = "Z")
    private boolean field560 = false;

    @OriginalMember(owner = "client!te", name = "bc", descriptor = "I")
    private int field561 = 0;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[I")
    public int[] field476 = new int[10];

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "Z")
    public boolean field524 = false;

    @OriginalMember(owner = "client!te", name = "Wb", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!te", name = "zb", descriptor = "I")
    public int field533 = -1000;

    @OriginalMember(owner = "client!te", name = "Rb", descriptor = "I")
    public int field551 = -1;

    @OriginalMember(owner = "client!te", name = "Yb", descriptor = "I")
    public int field558 = 0;

    @OriginalMember(owner = "client!te", name = "fc", descriptor = "I")
    public int field565 = 32;

    @OriginalMember(owner = "client!te", name = "dc", descriptor = "Z")
    public boolean field563 = true;

    @OriginalMember(owner = "client!te", name = "Cb", descriptor = "I")
    private int field536 = 0;

    @OriginalMember(owner = "client!te", name = "ub", descriptor = "Ljava/lang/String;")
    public static String field528 = "slide:";

    @OriginalMember(owner = "client!te", name = "Zb", descriptor = "[I")
    public static int[] field559 = new int[2];

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!te", name = "Bb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!te", name = "Db", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!te", name = "Eb", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!te", name = "Nb", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!te", name = "Sb", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!te", name = "Tb", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!te", name = "Ub", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!te", name = "cc", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!te", name = "ec", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!te", name = "gc", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "Lcj;")
    public class243 field521;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field463;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[Lob;")
    public static class58[] field485;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILg;I)V", line = 15)
    public final void method267(int arg0, class295 arg1, int arg2) {
        class199.field2988 = 0;
        class52.field744 = 0;
        class78.field1163 = 0;
        class309 var4 = this.method280(-73);
        int var5 = 49 / ((50 - arg2) / 36);
        field535++;
        int var6 = var4.field4889;
        int var7 = var4.field4860;
        if (var6 == 0 || var7 == 0) {
            return;
        }
        int var8 = class12.field121[arg0];
        int var9 = class12.field127[arg0];
        int var10 = -var7 / 2;
        int var11 = -var6 / 2;
        int var12 = var9 * var10 - (var8 * var11) >> 16;
        int var13 = var8 * var10 + (var9 * var11) >> 16;
        int var14 = var6 / 2;
        int var15 = -var7 / 2;
        int var16 = var8 * var15 + (var9 * var14) >> 16;
        int var17 = var9 * var15 - var8 * var14 >> 16;
        int var18 = -var6 / 2;
        int var19 = class39.method286(class77.field1154, (byte) 82, this.field537 + var13, this.field519 + var12);
        int var20 = class39.method286(class77.field1154, (byte) 82, this.field537 + var16, this.field519 + var17);
        int var21 = var7 / 2;
        int var22 = var9 * var21 - var8 * var18 >> 16;
        int var23 = var6 / 2;
        int var24 = var7 / 2;
        int var25 = var8 * var24 + (var9 * var23) >> 16;
        int var26 = var8 * var21 + var9 * var18 >> 16;
        int var27 = class39.method286(class77.field1154, (byte) 82, this.field537 + var26, this.field519 + var22);
        int var28 = var9 * var24 - (var8 * var23) >> 16;
        int var29 = var19 < var20 ? var19 : var20;
        int var30 = class39.method286(class77.field1154, (byte) 82, this.field537 + var25, this.field519 + var28);
        int var31 = var30 <= var27 ? var30 : var27;
        int var32 = var30 <= var20 ? var30 : var20;
        int var33 = var27 <= var19 ? var27 : var19;
        class199.field2988 = (int) (Math.atan2((double) (var29 - var31), (double) var7) * 325.95D) & 0x7FF;
        if (class199.field2988 != 0) {
            arg1.method956(class199.field2988);
        }
        class52.field744 = (int) (Math.atan2((double) (var33 - var32), (double) var6) * 325.95D) & 0x7FF;
        if (class52.field744 != 0) {
            arg1.method988(class52.field744);
        }
        class78.field1163 = var19 + var30;
        if (class78.field1163 > var20 + var27) {
            class78.field1163 = var20 + var27;
        }
        class78.field1163 = (class78.field1163 >> 1) - this.field493;
        if (class78.field1163 != 0) {
            arg1.method983(0, class78.field1163, 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;ZBILjava/awt/Color;)V", line = 114)
    public static final void method268(String arg0, boolean arg1, byte arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class302.field4665.getGraphics();
            if (class283.field4342 == null) {
                class283.field4342 = new Font("Helvetica", 1, 13);
                class280.field4324 = class302.field4665.getFontMetrics(class283.field4342);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class334.field5203, class174.field2644);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class185.field2831 == null) {
                    class185.field2831 = class302.field4665.createImage(304, 34);
                }
                Graphics var6 = class185.field2831.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                if (arg2 != 58) {
                    field528 = (String) null;
                }
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg3 * 3) + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class283.field4342);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class280.field4324.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class185.field2831, class334.field5203 / 2 - 152, class174.field2644 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class334.field5203 / 2 - 152;
                int var9 = class174.field2644 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var9 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class283.field4342);
                var5.setColor(Color.white);
                var5.drawString(arg0, var8 + (304 - class280.field4324.stringWidth(arg0)) / 2, var9 + 22);
            }
            if (class255.field3988 != null) {
                var5.setFont(class283.field4342);
                var5.setColor(Color.white);
                var5.drawString(class255.field3988, class334.field5203 / 2 - (class280.field4324.stringWidth(class255.field3988) / 2), class174.field2644 / 2 + -26);
            }
        } catch (Exception var12) {
            class302.field4665.repaint();
        }
        field498++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIIII)V", line = 193)
    public final void method269(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field507 != -1 && class118.method809((byte) 68, this.field507).field3531 == 1) {
            this.field507 = -1;
        }
        if (arg2 >= -112) {
            this.field541 = 2;
        }
        field470++;
        if (this.field530 != -1) {
            class148 var6 = class63.method428(false, this.field530);
            if (var6.field2344 && class118.method809((byte) 100, var6.field2355).field3531 == 1) {
                this.field530 = -1;
            }
        }
        if (!arg0) {
            int var7 = arg3 - this.field476[0];
            int var8 = arg1 - this.field505[0];
            if (var7 >= -8 && var7 <= 8 && var8 >= -8 && var8 <= 8) {
                if (this.field541 < 9) {
                    this.field541++;
                }
                for (int var9 = this.field541; var9 > 0; var9--) {
                    this.field476[var9] = this.field476[var9 - 1];
                    this.field505[var9] = this.field505[var9 - 1];
                    this.field487[var9] = this.field487[var9 - 1];
                }
                this.field476[0] = arg3;
                this.field487[0] = 1;
                this.field505[0] = arg1;
                return;
            }
        }
        this.field504 = 0;
        this.field541 = 0;
        this.field476[0] = arg3;
        this.field543 = 0;
        this.field505[0] = arg1;
        this.field519 = this.field505[0] * 128 + (arg4 * 64);
        this.field537 = this.field476[0] * 128 + arg4 * 64;
        if (class333.field5166 && class79.field1173 == this) {
            class323.method2186(-127);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BJ)V", line = 271)
    public static final void method270(byte arg0, long arg1) {
        field468++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 75) {
            method272(64, 93, 49, 106);
        }
        for (int var3 = 0; var3 < class190.field2891; var3++) {
            if (class115.field1792[var3] == arg1) {
                class190.field2891--;
                for (int var4 = var3; var4 < class190.field2891; var4++) {
                    class115.field1792[var4] = class115.field1792[var4 + 1];
                    class317.field4978[var4] = class317.field4978[var4 + 1];
                    class240.field3819[var4] = class240.field3819[var4 + 1];
                }
                class315.field4968 = class71.field1068;
                class265.field4095.method2064(255, 194);
                class265.field4095.method2023(arg1, arg0 + 34);
                class150.field2364++;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 319)
    public int method271(byte arg0) {
        if (arg0 <= 41) {
            return 98;
        } else {
            field481++;
            return this.field479;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)I", line = 346)
    public static final int method272(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 33) {
            method270((byte) 69, 78L);
        }
        int var4 = arg1 & 0x3;
        field494++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V", line = 371)
    public final void method273(int arg0, int arg1, int arg2, int arg3) {
        field497++;
        if (arg3 > -18) {
            this.field554 = 118;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.field491[var5] <= arg0) {
                this.field549[var5] = arg2;
                this.field509[var5] = arg1;
                this.field491[var5] = arg0 + 70;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V", line = 408)
    public static final void method274(int arg0, int arg1) {
        field486++;
        class75 var2 = class204.method1371(arg0, 7, arg1);
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lwf;B)V", line = 420)
    public static final void method275(class306 arg0, byte arg1) {
        if (arg1 != -122) {
            method268((String) null, false, (byte) 125, 17, (Color) null);
        }
        field562++;
        class30.field371 = class117.method805(-1, class196.field2935, arg0);
        client.field2047 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var3 = class151.field2379[var2 + 1] >> 16 & 0xFF;
            float var4 = (float) (class151.field2379[var2] >> 16 & 0xFF);
            float var5 = ((float) var3 - var4) / 64.0F;
            float var6 = (float) ((class151.field2379[var2] & 0xFF00) >> 8);
            int var7 = (class151.field2379[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) (class151.field2379[var2] & 0xFF);
            float var9 = ((float) var7 - var6) / 64.0F;
            int var10 = class151.field2379[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                client.field2047[var2 * 64 + var12] = class276.method1810(class276.method1810((int) var4 << 16, (int) var6 << 8), (int) var8);
                var4 += var5;
                var8 += var11;
                var6 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            client.field2047[var13] = class151.field2379[3];
        }
        class231.field3730 = new int[32768];
        class136.field2115 = new int[32768];
        class198.method1338((byte) -18, (class20) null);
        class172.field2613 = new int[32768];
        class237.field3801 = new int[32768];
        class220.field3501 = new class178(128, 254);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)V", line = 485)
    public final void method276(byte arg0, int arg1, int arg2) {
        field467++;
        int var4 = this.field505[0];
        int var5 = this.field476[0];
        if (arg1 == 0) {
            var5--;
            var4++;
        }
        if (this.field507 != -1 && class118.method809((byte) 55, this.field507).field3531 == 1) {
            this.field507 = -1;
        }
        if (arg1 == 1) {
            var4++;
        }
        if (this.field530 != -1) {
            class148 var6 = class63.method428(false, this.field530);
            if (var6.field2344 && class118.method809((byte) 38, var6.field2355).field3531 == 1) {
                this.field530 = -1;
            }
        }
        if (arg1 == 2) {
            var5++;
            var4++;
        }
        if (arg1 == 3) {
            var5--;
        }
        if (this.field541 < 9) {
            this.field541++;
        }
        for (int var7 = this.field541; var7 > 0; var7--) {
            this.field476[var7] = this.field476[var7 - 1];
            this.field505[var7] = this.field505[var7 - 1];
            this.field487[var7] = this.field487[var7 - 1];
        }
        this.field487[0] = (byte) arg2;
        if (arg1 == 4) {
            var5++;
        }
        if (arg1 == 5) {
            var5--;
            var4--;
        }
        if (arg1 == 6) {
            var4--;
        }
        if (arg1 == 7) {
            var5++;
            var4--;
        }
        this.field476[0] = var5;
        if (arg0 < -56) {
            this.field505[0] = var4;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 578)
    public static void method277(int arg0) {
        field485 = null;
        field559 = null;
        field528 = null;
        if (arg0 != 1) {
            field559 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I", line = 599)
    public final int method278(byte arg0) {
        field503++;
        if (this.field515 == -32768) {
            return 200;
        } else {
            int var2 = -54 % ((-arg0 - 5) / 61);
            return -this.field515;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V", line = 613)
    public final void method279(int arg0, int arg1) {
        field471++;
        this.field479 = arg0;
        if (arg1 != 17) {
            this.field477 = -20;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Lhf;", line = 624)
    public final class309 method280(int arg0) {
        field483++;
        if (arg0 > -25) {
            this.method267(-119, (class295) null, -19);
        }
        int var2 = this.method282(-580);
        return var2 == -1 ? class291.field4498 : class89.method616(var2, -123);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)Z", line = 643)
    public boolean method281(int arg0) {
        field538++;
        if (arg0 != 0) {
            this.method281(-53);
        }
        return false;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLg;)V", line = 803)
    public final void method283(byte arg0, class295 arg1) {
        if (arg0 != -65) {
            this.field530 = 112;
        }
        field500++;
        class309 var3 = this.method280(-51);
        if (var3.field4878 == 0 && var3.field4865 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (this.field490 && this.field550 != 0) {
            if (this.field550 >= 0) {
                var5 = var3.field4878;
            } else {
                var5 = -var3.field4878;
            }
            var4 = var3.field4865;
        }
        if (var3.field4868 != 0) {
            if (this.field556 != var5) {
                this.field556 = var5;
                if (this.field489 > 0 && var5 > this.field561) {
                    int var6 = this.field489 * this.field489 / (var3.field4868 * 2);
                    int var7 = var5 - this.field561;
                    if (var7 < var6) {
                        this.field555 = false;
                    } else {
                        this.field555 = true;
                        this.field517 = (this.field561 + var5 - var6) / 2;
                        int var8 = var3.field4883 * var3.field4883 / (var3.field4868 * 2);
                        int var9 = var5 - var8;
                        if (this.field517 < var9) {
                            this.field517 = var9;
                        }
                    }
                } else if (this.field489 < 0 && var5 < this.field561) {
                    int var10 = this.field489 * this.field489 / (var3.field4868 * 2);
                    int var11 = var5 - this.field561;
                    if (var10 > var11) {
                        this.field555 = false;
                    } else {
                        this.field517 = (this.field561 + var10 + var5) / 2;
                        this.field555 = true;
                        int var12 = var3.field4883 * var3.field4883 / (var3.field4868 * 2);
                        int var13 = var5 + var12;
                        if (var13 < this.field517) {
                            this.field517 = var13;
                        }
                    }
                } else {
                    this.field555 = false;
                }
            }
            if (this.field489 == 0) {
                int var14 = this.field556 - this.field561;
                if ((-var3.field4868) < var14 && var14 < var3.field4868) {
                    this.field561 = this.field556;
                } else {
                    this.field555 = true;
                    this.field517 = (this.field561 + this.field556) / 2;
                    int var15 = var3.field4883 * var3.field4883 / (var3.field4868 * 2);
                    if (var14 < 0) {
                        this.field489 = -var3.field4868;
                        int var16 = this.field556 + var15;
                        if (var16 < this.field517) {
                            this.field517 = var16;
                        }
                    } else {
                        this.field489 = var3.field4868;
                        int var17 = this.field556 - var15;
                        if (this.field517 < var17) {
                            this.field517 = var17;
                        }
                    }
                }
            } else if (this.field489 > 0) {
                if (this.field561 >= this.field517) {
                    this.field555 = false;
                }
                if (!this.field555) {
                    this.field489 -= var3.field4868;
                    if (this.field489 < 0) {
                        this.field489 = 0;
                    }
                } else if (var3.field4883 > this.field489) {
                    this.field489 += var3.field4868;
                }
            } else {
                if (this.field561 <= this.field517) {
                    this.field555 = false;
                }
                if (!this.field555) {
                    this.field489 += var3.field4868;
                    if (this.field489 > 0) {
                        this.field489 = 0;
                    }
                } else if (-var3.field4883 < this.field489) {
                    this.field489 -= var3.field4868;
                }
            }
            this.field561 += this.field489;
            if (this.field561 != 0) {
                int var18 = this.field561 >> 5 & 0x7FF;
                int var19 = arg1.method112() / 2;
                arg1.method983(0, -var19, 0);
                arg1.method988(var18);
                arg1.method983(0, var19, 0);
            }
        }
        if (var3.field4856 == 0) {
            return;
        }
        if (this.field536 != var4) {
            if (this.field508 > 0 && this.field525 < var4) {
                int var20 = this.field508 * this.field508 / (var3.field4856 * 2);
                int var21 = var4 - this.field525;
                if (var20 <= var21) {
                    this.field529 = (var4 + this.field525 - var20) / 2;
                    this.field560 = true;
                    int var22 = var3.field4888 * var3.field4888 / (var3.field4856 * 2);
                    int var23 = var4 - var22;
                    if (this.field529 < var23) {
                        this.field529 = var23;
                    }
                } else {
                    this.field560 = false;
                }
            } else if (this.field508 < 0 && var4 < this.field525) {
                int var24 = this.field508 * this.field508 / (var3.field4856 * 2);
                int var25 = var4 - this.field525;
                if (var24 <= var25) {
                    this.field529 = (this.field525 + var24 + var4) / 2;
                    int var26 = var3.field4888 * var3.field4888 / (var3.field4856 * 2);
                    this.field560 = true;
                    int var27 = var4 + var26;
                    if (this.field529 > var27) {
                        this.field529 = var27;
                    }
                } else {
                    this.field560 = false;
                }
            } else {
                this.field560 = false;
            }
            this.field536 = var4;
        }
        if (this.field508 == 0) {
            int var28 = this.field536 - this.field525;
            if (var28 > -var3.field4856 && var3.field4856 > var28) {
                this.field525 = this.field536;
            } else {
                int var29 = var3.field4888 * var3.field4888 / (var3.field4856 * 2);
                this.field560 = true;
                this.field529 = (this.field536 + this.field525) / 2;
                if (var28 < 0) {
                    int var30 = this.field536 + var29;
                    if (var30 < this.field529) {
                        this.field529 = var30;
                    }
                    this.field508 = -var3.field4856;
                } else {
                    int var31 = this.field536 - var29;
                    this.field508 = var3.field4856;
                    if (var31 > this.field529) {
                        this.field529 = var31;
                    }
                }
            }
        } else if (this.field508 <= 0) {
            if (this.field525 <= this.field529) {
                this.field560 = false;
            }
            if (!this.field560) {
                this.field508 += var3.field4856;
                if (this.field508 > 0) {
                    this.field508 = 0;
                }
            } else if (this.field508 > (-var3.field4888)) {
                this.field508 -= var3.field4856;
            }
        } else {
            if (this.field529 <= this.field525) {
                this.field560 = false;
            }
            if (!this.field560) {
                this.field508 -= var3.field4856;
                if (this.field508 < 0) {
                    this.field508 = 0;
                }
            } else if (this.field508 < var3.field4888) {
                this.field508 += var3.field4856;
            }
        }
        this.field525 += this.field508;
        if (this.field525 == 0) {
            return;
        }
        int var32 = (this.field525 & 0xFFE3) >> 5;
        int var33 = arg1.method112() / 2;
        arg1.method983(0, -var33, 0);
        arg1.method956(var32);
        arg1.method983(0, var33, 0);
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V", line = 1173)
    public final void method284(int arg0) {
        this.field541 = 0;
        this.field504 = 0;
        field499++;
        if (arg0 <= 45) {
            this.field554 = -92;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIIII)V", line = 1234)
    public static final void method285(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field512++;
        int var6 = arg2 - arg0;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class150.method1058(arg4, arg3, -116, arg0, arg5);
            }
        } else if (var7 == 0) {
            class70.method503(arg4, (byte) -113, arg2, arg0, arg3);
        } else {
            if (!arg1) {
                field559 = (int[]) null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class256.field3995 > arg2) {
                var10 = (class256.field3995 * var8 >> 12) + var9;
                var11 = class256.field3995;
            } else if (class118.field1834 < arg2) {
                var10 = (class118.field1834 * var8 >> 12) + var9;
                var11 = class118.field1834;
            } else {
                var10 = arg5;
                var11 = arg2;
            }
            int var12;
            int var13;
            if (arg0 < class256.field3995) {
                var12 = class256.field3995;
                var13 = (class256.field3995 * var8 >> 12) + var9;
            } else if (class118.field1834 >= arg0) {
                var12 = arg0;
                var13 = arg4;
            } else {
                var13 = (class118.field1834 * var8 >> 12) + var9;
                var12 = class118.field1834;
            }
            if (var13 < class323.field5030) {
                var13 = class323.field5030;
                var12 = (class323.field5030 - var9 << 12) / var8;
            } else if (class88.field1324 < var13) {
                var13 = class88.field1324;
                var12 = (class88.field1324 - var9 << 12) / var8;
            }
            if (var10 < class323.field5030) {
                var10 = class323.field5030;
                var11 = (class323.field5030 - var9 << 12) / var8;
            } else if (class88.field1324 < var10) {
                var10 = class88.field1324;
                var11 = (class88.field1324 - var9 << 12) / var8;
            }
            class148.method1048(var11, -8241, arg3, var10, var13, var12);
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I")
    public abstract int method282(int arg0);
}
