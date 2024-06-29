import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 implements class1 {

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Z")
    private boolean field223 = true;

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Lh;")
    public static class15 field226 = class18.method153("Platebody Shop", 1);

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Lh;")
    public static class15 field224 = class18.method153("underlay)3dat", 1);

    @OriginalMember(owner = "mapview!h", name = "o", descriptor = "Lh;")
    public static class15 field233 = class18.method153("Estate Agent", 1);

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "Lh;")
    public static class15 field231 = class18.method153("Platelegs Shop", 1);

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "[J")
    public static long[] field221 = new long[32];

    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "I")
    public static volatile int field232 = 0;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "I")
    private int field230;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field234;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "[B")
    public byte[] field219;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BZ)V", line = 23)
    public static final void method113(byte[] arg0, boolean arg1) {
        class19 var2 = new class19(arg0);
        var2.field261 = arg0.length - 2;
        mapview.field15 = var2.method166(2);
        class10.field136 = new int[mapview.field15];
        class14.field215 = new int[mapview.field15];
        class13.field192 = new byte[mapview.field15][];
        class14.field208 = new int[mapview.field15];
        class9.field118 = new int[mapview.field15];
        var2.field261 = arg0.length - mapview.field15 * 8 - 7;
        class19.field269 = var2.method166(2);
        class35.field436 = var2.method166(2);
        int var3 = (var2.method164((byte) 62) & 0xFF) + 1;
        for (int var4 = 0; var4 < mapview.field15; var4++) {
            class14.field208[var4] = var2.method166(2);
        }
        for (int var5 = 0; var5 < mapview.field15; var5++) {
            class14.field215[var5] = var2.method166(2);
        }
        for (int var6 = 0; var6 < mapview.field15; var6++) {
            class9.field118[var6] = var2.method166(2);
        }
        for (int var7 = 0; var7 < mapview.field15; var7++) {
            class10.field136[var7] = var2.method166(2);
        }
        var2.field261 = arg0.length - mapview.field15 * 8 - (var3 - 1) * 3 - 7;
        class21.field294 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class21.field294[var8] = var2.method168((byte) 44);
            if (class21.field294[var8] == 0) {
                class21.field294[var8] = 1;
            }
        }
        var2.field261 = 0;
        if (!arg1) {
            return;
        }
        for (int var9 = 0; var9 < mapview.field15; var9++) {
            int var10 = class10.field136[var9];
            int var11 = class9.field118[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class13.field192[var9] = var13;
            int var14 = var2.method164((byte) 62);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method165((byte) -80);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method165((byte) -23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BLh;)Z", line = 142)
    public final boolean method114(byte arg0, class15 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field229 == arg1.field229) {
            if (arg0 != -46) {
                field222 = 105;
            }
            if (!this.field223 || !arg1.field223) {
                if (this.field230 == 0) {
                    this.field230 = this.method125((byte) -112);
                    if (this.field230 == 0) {
                        this.field230 = 1;
                    }
                }
                if (arg1.field230 == 0) {
                    arg1.field230 = arg1.method125((byte) -113);
                    if (arg1.field230 == 0) {
                        arg1.field230 = 1;
                    }
                }
                if (this.field230 != arg1.field230) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field229; var3++) {
                if (this.field219[var3] != arg1.field219[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II)I", line = 196)
    private final int method115(int arg0, int arg1) {
        if (arg0 != 7098) {
            this.field223 = true;
        }
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field229; var6++) {
            int var7 = this.field219[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 281)
    public final int method116(FontMetrics arg0, boolean arg1) {
        String var3;
        try {
            if (arg1) {
                return 57;
            }
            var3 = new String(this.field219, 0, this.field229, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field219, 0, this.field229);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)I", line = 308)
    public final int method117(boolean arg0) {
        if (!arg0) {
            this.method126(104, (byte) -97, -87);
        }
        return this.method115(7098, 10);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)J", line = 320)
    private final long method118(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field229; var4++) {
            var2 = (var2 << 5) + (long) (this.field219[var4] & 0xFF) - var2;
        }
        if (arg0 != 18094) {
            this.method117(true);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "toString", descriptor = "()Ljava/lang/String;", line = 339)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)Lh;", line = 351)
    public final class15 method119(int arg0) {
        class15 var2 = new class15();
        var2.field229 = this.field229;
        var2.field219 = new byte[this.field229];
        int var3 = 69 % ((64 - arg0) / 45);
        for (int var4 = 0; var4 < this.field229; var4++) {
            byte var5 = this.field219[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field219[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(II)Lh;", line = 389)
    public final class15 method120(int arg0, int arg1) {
        if (arg0 != 38) {
            field233 = null;
        }
        return this.method126(this.field229, (byte) -120, arg1);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZLg;II)Lo;", line = 417)
    public static final class29 method121(boolean arg0, class13 arg1, int arg2, int arg3) {
        if (!arg0) {
            method136(false);
        }
        return mapview.method13(true, arg3, arg1, arg2) ? class20.method172((byte) -111) : null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)Lh;", line = 444)
    public final class15 method122(byte arg0) {
        long var2 = this.method118(arg0 ^ 0x46F6);
        synchronized (field234 == null ? (field234 = method141("h")) : field234) {
            if (class33.field428 == null) {
                class33.field428 = new class18(4096);
            } else {
                for (class33 var5 = (class33) class33.field428.method157(var2, false); var5 != null; var5 = (class33) class33.field428.method149((byte) 125)) {
                    if (this.method114((byte) -46, var5.field427)) {
                        return var5.field427;
                    }
                }
            }
            class33 var6 = new class33();
            var6.field427 = this;
            this.field223 = false;
            class33.field428.method154(var6, 63, var2);
        }
        if (arg0 != 88) {
            this.field219 = null;
        }
        return this;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 445)
    public static Class method141(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)V", line = 489)
    public static final void method123(int arg0) {
        if (arg0 != 65) {
            method127(-57);
        }
        if (class19.field262 != null) {
            class20 var1 = class19.field262;
            synchronized (class19.field262) {
                class19.field262 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "hashCode", descriptor = "()I", line = 509)
    public final int hashCode() {
        return this.method125((byte) -105);
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(Z)V", line = 516)
    public static void method124(boolean arg0) {
        field221 = null;
        field231 = null;
        field224 = null;
        field233 = null;
        field226 = null;
        if (arg0) {
            field222 = 92;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)I", line = 532)
    public final int method125(byte arg0) {
        if (arg0 >= -100) {
            this.field219 = null;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field229; var3++) {
            var2 = (var2 << 5) + (this.field219[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IBI)Lh;", line = 553)
    public final class15 method126(int arg0, byte arg1, int arg2) {
        class15 var4 = new class15();
        var4.field229 = arg0 - arg2;
        if (arg1 == -120) {
            var4.field219 = new byte[arg0 - arg2];
            class2.method28(this.field219, arg2, var4.field219, 0, var4.field229);
            return var4;
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(I)I", line = 576)
    public static final int method127(int arg0) {
        if (arg0 >= -2) {
            method124(false);
        }
        if (class32.field420 == null) {
            return 0;
        } else if (class32.field420.field452 == null) {
            return class24.field324[class32.field420.field446 & 0xFF];
        } else {
            return class24.field324[class32.field420.field452[field220] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BI)Lh;", line = 619)
    public final class15 method128(byte arg0, int arg1) {
        int var3 = 80 % ((28 - arg0) / 47);
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field223) {
            this.field230 = 0;
            if (this.field219.length == this.field229) {
                int var4;
                for (var4 = 1; var4 <= this.field229; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class2.method28(this.field219, 0, var5, 0, this.field229);
                this.field219 = var5;
            }
            this.field219[this.field229++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(II)I", line = 653)
    public final int method129(int arg0, int arg1) {
        if (arg1 != 10) {
            this.method139(-21);
        }
        return this.field219[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(III)I", line = 669)
    private final int method130(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field229; var5++) {
            if (this.field219[var5] == var4) {
                return var5;
            }
        }
        if (arg0 != -1) {
            field227 = 1;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BLjava/applet/Applet;)Lh;", line = 697)
    public final class15 method131(byte arg0, Applet arg1) {
        if (arg0 == 35) {
            String var3 = new String(this.field219, 0, this.field229);
            String var4 = arg1.getParameter(var3);
            return var4 == null ? null : class13.method103(false, var4);
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IZILjava/awt/Graphics;)V", line = 717)
    public final void method132(int arg0, boolean arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field219, 0, this.field229, "ISO-8859-1");
            if (!arg1) {
                this.method118(-33);
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field219, 0, this.field229);
        }
        arg3.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!h", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 740)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(B)I", line = 759)
    public final int method133(byte arg0) {
        if (arg0 >= -12) {
            field225 = 31;
        }
        return this.field229;
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(II)V", line = 770)
    public final void method134(int arg0, int arg1) {
        this.field230 = 0;
        if (!this.field223) {
            throw new IllegalArgumentException();
        }
        int var3 = 118 % ((arg1 - 90) / 33);
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.field219.length < arg0) {
            int var4;
            for (var4 = 1; var4 < arg0; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class2.method28(this.field219, 0, var5, 0, this.field229);
            this.field219 = var5;
        }
        for (int var6 = this.field229; var6 < arg0; var6++) {
            this.field219[var6] = 32;
        }
        this.field229 = arg0;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(BLh;)I", line = 823)
    public final int method135(byte arg0, class15 arg1) {
        int var3;
        if (this.field229 > arg1.field229) {
            var3 = arg1.field229;
        } else {
            var3 = this.field229;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (this.field219[var4] < arg1.field219[var4]) {
                return -1;
            }
            if (arg1.field219[var4] < this.field219[var4]) {
                return 1;
            }
        }
        if (this.field229 < arg1.field229) {
            return -1;
        }
        if (arg0 != -88) {
            this.method126(44, (byte) 118, 26);
        }
        if (arg1.field229 >= this.field229) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(Z)B", line = 862)
    public static final byte method136(boolean arg0) {
        if (!arg0) {
            field225 = -24;
        }
        return class36.field457 == null ? 0 : class36.field457[field220];
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(III)Lh;", line = 878)
    public final class15 method137(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class15 var6 = new class15();
        var6.field229 = this.field229;
        var6.field219 = new byte[this.field229];
        int var7 = 90 % ((24 - arg0) / 59);
        for (int var8 = 0; var8 < this.field229; var8++) {
            byte var9 = this.field219[var8];
            if (var5 == var9) {
                var6.field219[var8] = var4;
            } else {
                var6.field219[var8] = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZI)I", line = 912)
    public final int method138(boolean arg0, int arg1) {
        return arg0 ? this.method130(-1, arg1, 0) : 96;
    }

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "(I)Lh;", line = 940)
    public final class15 method139(int arg0) {
        if (!this.field223) {
            throw new IllegalArgumentException();
        }
        this.field230 = 0;
        if (this.field219.length != this.field229) {
            byte[] var2 = new byte[this.field229];
            class2.method28(this.field219, 0, var2, 0, this.field229);
            this.field219 = var2;
        }
        return arg0 == 2 ? this : (class15) null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 979)
    public static final void method140(String arg0, Throwable arg1, byte arg2) {
        try {
            int var3 = 108 % ((arg2 + 32) / 46);
            String var4 = "";
            if (arg1 != null) {
                var4 = class10.method85(arg1, 116);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var4 = var4 + " | ";
                }
                var4 = var4 + arg0;
            }
            System.out.println("Error: " + var4);
            String var5 = var4.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            class27 var9 = class36.field454.method41((byte) 124, new URL(class36.field454.field68.getCodeBase(), "clienterror.ws?c=" + class24.field325 + "&u=" + class23.field312 + "&v1=" + class4.field67 + "&v2=" + class4.field76 + "&e=" + var8));
            while (var9.field353 == 0) {
                class5.method49(1L, -26);
            }
            if (var9.field353 == 1) {
                DataInputStream var10 = (DataInputStream) var9.field354;
                var10.read();
                var10.close();
            }
        } catch (Exception var12) {
        }
    }
}
