import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class113 implements Runnable {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lv;")
    public static class122 field2757 = class55.method425(-74, "Lade Konfig )2 ");

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2755 = 10;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2765 = -1;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lv;")
    private static class122 field2766 = class55.method425(-58, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
    public static byte[] field2756 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lv;")
    public static class122 field2767 = class55.method425(-59, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lv;")
    public static class122 field2763 = field2766;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljb;")
    public static class56 field2754;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Lm;")
    public static class72 field2759;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method863(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method864(true, null);
        }
        class44.field1151 = arg1;
        field2758++;
        if (!class44.field1151) {
            int var25 = (class74.field1969 - class14.field372.field1617) / 16;
            class102.field2526 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class102.field2526[var26][var37] = class14.field372.method485((byte) -114);
                }
            }
            int var27 = class14.field372.method506((byte) -90);
            boolean var28 = false;
            int var29 = class14.field372.method502((byte) 44);
            int var30 = class14.field372.method530((byte) 92);
            int var31 = class14.field372.method508(-103);
            int var32 = class14.field372.method502((byte) 44);
            class127.field3076 = new int[var25];
            class33.field831 = new byte[var25][];
            class23.field608 = new int[var25];
            class37.field971 = new byte[var25][];
            class51.field1328 = new int[var25];
            int var33 = 0;
            if ((var31 / 8 == 48 || var31 / 8 == 49) && var27 / 8 == 48) {
                var28 = true;
            }
            if (var31 / 8 == 48 && var27 / 8 == 148) {
                var28 = true;
            }
            for (int var34 = (var31 - 6) / 8; var34 <= (var31 + 6) / 8; var34++) {
                for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var28 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class23.field608[var33] = var36;
                        class51.field1328[var33] = class59.field1531.method628(class59.method454(new class122[] { client.field446, class119.method914(var34, 10), class45.field1171, class119.method914(var35, class32.method290(arg0, -11)) }, class32.method290(arg0, -5177)), true);
                        class127.field3076[var33] = class59.field1531.method628(class59.method454(new class122[] { class11.field313, class119.method914(var34, arg0 + 11), class45.field1171, class119.method914(var35, 10) }, 5176), true);
                        var33++;
                    }
                }
            }
            class36.method325(arg0 ^ 0x65CC, var30, var31, var29, var27, var32);
            return;
        }
        int var2 = class14.field372.method506((byte) -90);
        class14.field372.method988((byte) -63);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class14.field372.method994(1, (byte) -103);
                    if (var24 == 1) {
                        class122.field2938[var3][var22][var23] = class14.field372.method994(26, (byte) -89);
                    } else {
                        class122.field2938[var3][var22][var23] = -1;
                    }
                }
            }
        }
        class14.field372.method995(false);
        int var4 = (class74.field1969 - class14.field372.field1617) / 16;
        class102.field2526 = new int[var4][4];
        for (int var5 = 0; var5 < var4; var5++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class102.field2526[var5][var21] = class14.field372.method485((byte) -114);
            }
        }
        int var6 = class14.field372.method494(255);
        int var7 = class14.field372.method506((byte) -90);
        int var8 = class14.field372.method508(-111);
        int var9 = class14.field372.method508(-102);
        class127.field3076 = new int[var4];
        class51.field1328 = new int[var4];
        class23.field608 = new int[var4];
        class33.field831 = new byte[var4][];
        class37.field971 = new byte[var4][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class122.field2938[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class23.field608[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            int var19 = var17 >> 8 & 0xFF;
                            class23.field608[var10] = var17;
                            int var20 = var17 & 0xFF;
                            class51.field1328[var10] = class59.field1531.method628(class59.method454(new class122[] { client.field446, class119.method914(var19, 10), class45.field1171, class119.method914(var20, 10) }, 5176), true);
                            class127.field3076[var10] = class59.field1531.method628(class59.method454(new class122[] { class11.field313, class119.method914(var19, 10), class45.field1171, class119.method914(var20, 10) }, 5176), true);
                            var10++;
                        }
                    }
                }
            }
        }
        class36.method325(-26061, var6, var9, var8, var2, var7);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I", line = 231)
    public static final int method864(boolean arg0, KeyEvent arg1) {
        field2753++;
        if (!arg0) {
            method864(true, null);
        }
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 276)
    public static void method865(int arg0) {
        field2767 = null;
        field2766 = null;
        if (arg0 > -44) {
            field2763 = null;
        }
        field2759 = null;
        field2754 = null;
        field2757 = null;
        field2763 = null;
        field2756 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 298)
    public static final void method866(Component arg0, int arg1) {
        if (arg1 != 7840) {
            method866(null, 16);
        }
        arg0.removeKeyListener(class16.field406);
        field2762++;
        arg0.removeFocusListener(class16.field406);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 310)
    public static final void method867(boolean arg0) {
        class14.field372.method988((byte) -63);
        if (arg0) {
            method867(false);
        }
        int var1 = class14.field372.method994(1, (byte) -81);
        field2764++;
        if (var1 == 0) {
            return;
        }
        int var2 = class14.field372.method994(2, (byte) -103);
        if (var2 == 0) {
            class118.field2859[class107.field2661++] = 2047;
        } else if (var2 == 1) {
            int var3 = class14.field372.method994(3, (byte) -75);
            class70.field1828.method113(7, var3, false);
            int var4 = class14.field372.method994(1, (byte) -121);
            if (var4 == 1) {
                class118.field2859[class107.field2661++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class14.field372.method994(3, (byte) -102);
            class70.field1828.method113(-123, var5, true);
            int var6 = class14.field372.method994(3, (byte) -120);
            class70.field1828.method113(21, var6, true);
            int var7 = class14.field372.method994(1, (byte) -121);
            if (var7 == 1) {
                class118.field2859[class107.field2661++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class14.field372.method994(1, (byte) -81);
            int var9 = class14.field372.method994(1, (byte) -107);
            if (var9 == 1) {
                class118.field2859[class107.field2661++] = 2047;
            }
            class34.field848 = class14.field372.method994(2, (byte) -119);
            int var10 = class14.field372.method994(7, (byte) -92);
            int var11 = class14.field372.method994(7, (byte) -88);
            class70.field1828.method109(var10, var11, (byte) -116, var8 == 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "run", descriptor = "()V", line = 384)
    public final void run() {
        field2768++;
        try {
            while (true) {
                class34 var1 = class54.field1409;
                class95 var2;
                synchronized (class54.field1409) {
                    var2 = (class95) class54.field1409.method311((byte) 91);
                }
                if (var2 == null) {
                    class30.method282((byte) -64, 100L);
                    Object var6 = class90.field2310;
                    synchronized (class90.field2310) {
                        if (class58.field1511 <= 1) {
                            class58.field1511 = 0;
                            class90.field2310.notifyAll();
                            return;
                        }
                        class58.field1511--;
                    }
                } else {
                    if (var2.field2431 == 0) {
                        var2.field2445.method671(var2.field2441.length, 0, var2.field2441, (int) var2.field644);
                        class34 var3 = class54.field1409;
                        synchronized (class54.field1409) {
                            var2.method249(0);
                        }
                    } else if (var2.field2431 == 1) {
                        var2.field2441 = var2.field2445.method673((int) var2.field644, (byte) 18);
                        class34 var4 = class54.field1409;
                        synchronized (class54.field1409) {
                            class47.field1211.method312(false, var2);
                        }
                    }
                    Object var5 = class90.field2310;
                    synchronized (class90.field2310) {
                        if (class58.field1511 <= 1) {
                            class58.field1511 = 0;
                            class90.field2310.notifyAll();
                            return;
                        }
                        class58.field1511 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class84.method678(null, var17, 1);
        }
    }
}
