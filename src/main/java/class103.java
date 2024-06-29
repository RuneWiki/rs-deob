import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class103 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lhh;")
    public volatile class73[] field1957 = new class73[2];

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
    public volatile boolean field1952 = false;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    public volatile boolean field1966 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Led;")
    public static class43 field1951 = class191.method1219("<col=ffff00>*V", false);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
    public static long field1959 = 0L;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Led;")
    public static class43 field1958 = class191.method1219("weiss:", false);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Led;")
    public static class43 field1961 = class191.method1219("rot:", false);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Led;")
    public static class43 field1954 = class191.method1219("Sichtbare Karte vorbereitet)3", false);

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Led;")
    public static class43 field1967 = class191.method1219("::errortest", false);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[Lea;")
    public static class40[] field1965 = new class40[16];

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lbc;")
    public static class14 field1955;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lrf;")
    public class160 field1964;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static final void method636(byte arg0) {
        class67.field1351 = null;
        class82.field1615 = null;
        class172.field3435 = null;
        class159.field3213 = null;
        if (arg0 < 28) {
            return;
        }
        class201.field3955 = null;
        field1969++;
        class175.field3477 = null;
        class12.field182 = null;
        class161.field3256 = null;
        class26.field473 = null;
        class49.field987 = null;
        class39.field749 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method637(byte arg0, KeyEvent arg1) {
        field1960++;
        if (arg0 > -45) {
            method638(true, -21);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
    public static final void method638(boolean arg0, int arg1) {
        class88.field1721 += arg1 * 128;
        field1962++;
        if (class83.field1639.length < class88.field1721) {
            class88.field1721 -= class83.field1639.length;
            int var2 = (int) (Math.random() * 12.0D);
            class128.method828(!arg0, class59.field1225[var2]);
        }
        if (!arg0) {
            field1954 = null;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var3 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class17.field288[var4 + var5] - class83.field1639[class83.field1639.length - 1 & class88.field1721 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class17.field288[var4++] = var27;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class17.field288[var24 + var25] = 255;
                } else {
                    class17.field288[var25 + var24] = 0;
                }
            }
        }
        if (class35.field643 > 0) {
            class35.field643 -= arg1 * 4;
        }
        if (class102.field1948 > 0) {
            class102.field1948 -= arg1 * 4;
        }
        if (class102.field1948 == 0 && class35.field643 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 0) {
                class102.field1948 = 1024;
            }
            if (var9 == 1) {
                class35.field643 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class156.field3160[var10] = class156.field3160[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class156.field3160[var11] = (int) (Math.sin((double) class167.field3308 / 14.0D) * 16.0D + Math.sin((double) class167.field3308 / 15.0D) * 14.0D + Math.sin((double) class167.field3308 / 16.0D) * 12.0D);
            class167.field3308++;
        }
        int var12 = ((client.field559 & 0x1) + arg1) / 2;
        class143.field2948 += arg1;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class143.field2948 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class17.field288[(var23 << 7) + var22] = 192;
        }
        class143.field2948 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class17.field288[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class17.field288[var19 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class174.field3471[var21 + var19] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var12 + var17) {
                    var16 += class174.field3471[var15 + var18 + var12 * 128];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class174.field3471[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class17.field288[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        this.field1966 = true;
        field1953++;
        try {
            while (!this.field1952) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class73 var2 = this.field1957[var1];
                    if (var2 != null) {
                        var2.method449(2000);
                    }
                }
                class38.method209(10L, -7296);
                class52.method318((byte) 113, this.field1964, null);
            }
        } catch (Exception var9) {
            class171.method1086(null, -2929, var9);
        } finally {
            Object var6 = null;
            this.field1966 = false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static final void method639(byte arg0) {
        if (arg0 != -72) {
            field1963 = -115;
        }
        class22.field366 = null;
        class108.field2079 = null;
        field1968++;
        class61.field1245 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1961 = null;
        field1954 = null;
        field1951 = null;
        field1955 = null;
        field1965 = null;
        field1958 = null;
        field1967 = null;
        if (arg0 != 2) {
            field1967 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method641(int arg0) {
        class185.field3645.method1108((byte) -90);
        field1956++;
        class76.field1528.method1108((byte) -90);
        class106.field2032.method1108((byte) -90);
        class38.field720.method1108((byte) -90);
        if (arg0 == -19335) {
            class157.field3168.method1108((byte) -90);
        }
    }
}
