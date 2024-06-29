import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class288 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[B")
    public byte[] field4532;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    public int[] field4539;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field4538;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
    public int[] field4543;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[[[B")
    public static byte[][][] field4530;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4530 = null;
        if (arg0 != -26681) {
            method1935(57);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public final int method1936(int arg0, int arg1) {
        if (arg1 != -16363) {
            method1939(-111, 7, (String) null, false, (Color) null);
        }
        field4534++;
        return this.field4532[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method1937(byte arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        field4533++;
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class149.field2298 : class147.field2276);
        if (arg0 != 124) {
            field4530 = null;
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class239 var11 = class266.method1810((byte) 120, var8);
            if (var11.field3696 && var11.method1616(arg0 - 248).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class16.field256 = -1;
                    class98.field1571 = null;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var12 = new short[var5.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var5[var13];
                    }
                    var5 = var12;
                }
                var5[var4++] = (short) var8;
            }
        }
        class98.field1571 = var5;
        class16.field256 = var4;
        class28.field424 = 0;
        String[] var9 = new String[class16.field256];
        for (int var10 = 0; var10 < class16.field256; var10++) {
            var9[var10] = class266.method1810((byte) 122, var5[var10]).method1616(-123);
        }
        class50.method418(var9, class98.field1571, -96);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1938(long arg0, int arg1) {
        field4531++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class161.field2469[(int) (var8 - (arg0 * 37L))];
                if (var10 == '_') {
                    var10 = ' ';
                    int var11 = var6.length() - 1;
                    var6.setCharAt(var11, Character.toUpperCase(var6.charAt(var11)));
                }
                var6.append(var10);
            }
            var6.reverse();
            int var7 = -2 % ((arg1 + 44) / 38);
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjava/lang/String;ZLjava/awt/Color;)V")
    public static final void method1939(int arg0, int arg1, String arg2, boolean arg3, Color arg4) {
        field4541++;
        try {
            Graphics var5 = class189.field3021.getGraphics();
            if (class278.field4374 == null) {
                class278.field4374 = new Font("Helvetica", 1, 13);
                class173.field2574 = class189.field3021.getFontMetrics(class278.field4374);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class35.field573, class277.field4369);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class81.field1346 == null) {
                    class81.field1346 = class189.field3021.createImage(304, 34);
                }
                Graphics var6 = class81.field1346.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class278.field4374);
                var6.setColor(Color.white);
                if (arg0 != 24687) {
                    method1937((byte) -48, (String) null, false);
                }
                var6.drawString(arg2, (304 - class173.field2574.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class81.field1346, class35.field573 / 2 - 152, class277.field4369 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class277.field4369 / 2 - 18;
                int var8 = class35.field573 / 2 - 152;
                var5.setColor(arg4);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(var8 - (-(arg1 * 3) - 2), var7 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class278.field4374);
                var5.setColor(Color.white);
                var5.drawString(arg2, (304 - class173.field2574.stringWidth(arg2)) / 2 + var8, var7 + 22);
            }
            if (class63.field1009 != null) {
                var5.setFont(class278.field4374);
                var5.setColor(Color.white);
                var5.drawString(class63.field1009, class35.field573 / 2 - class173.field2574.stringWidth(class63.field1009) / 2, class277.field4369 / 2 - 26);
            }
        } catch (Exception var10) {
            class189.field3021.repaint();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1940(String arg0, byte arg1, String arg2, String arg3) {
        int var4 = arg2.indexOf(arg3);
        field4529++;
        while (var4 != -1) {
            arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg3.length() + var4);
            var4 = arg2.indexOf(arg3, arg0.length() + var4);
        }
        if (arg1 > -48) {
            field4530 = null;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z")
    public final boolean method1941(int arg0, byte arg1) {
        int var3 = -118 / ((16 - arg1) / 48);
        field4540++;
        return (this.field4532[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)Z")
    public final boolean method1942(int arg0, int arg1) {
        if (arg1 == 304) {
            field4528++;
            return (this.field4532[arg0] & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILuf;BI)La;")
    public static final class49 method1943(int arg0, class176 arg1, byte arg2, int arg3) {
        if (arg2 == -88) {
            field4537++;
            return class261.method1750(arg1, arg3, arg0, (byte) 123) ? class113.method835((byte) -52) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)Z")
    public final boolean method1944(int arg0, int arg1) {
        if (arg0 != 16765) {
            this.field4535 = 98;
        }
        field4536++;
        return (this.field4532[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
    public static final int method1945(byte arg0) {
        if (arg0 == -16) {
            field4542++;
            return 15;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
    public class288(int arg0) {
        this.field4535 = arg0;
        this.field4532 = new byte[this.field4535];
        this.field4539 = new int[this.field4535];
        this.field4538 = new String[this.field4535];
        this.field4543 = new int[this.field4535];
    }
}
