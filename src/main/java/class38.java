import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 implements class17 {

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Z")
    private boolean field490 = true;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lu;")
    private static class38 field491 = class9.method45(-41, "Loom");

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Lu;")
    public static class38 field493 = class9.method45(-41, "fonts");

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lu;")
    private static class38 field488 = class9.method45(-41, "Platebody Shop");

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "Lu;")
    public static class38 field494 = class9.method45(-41, "Requesting");

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lu;")
    private static class38 field484 = class9.method45(-41, "Hair Dressers");

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "I")
    public int field492;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field495;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "[B")
    public byte[] field487;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IIB)Lu;", line = 11)
    public final class38 method217(int arg0, int arg1, byte arg2) {
        class38 var4 = new class38();
        var4.field487 = new byte[arg1 - arg0];
        if (arg2 >= -12) {
            return (class38) null;
        } else {
            var4.field492 = arg1 - arg0;
            class21.method99(this.field487, arg0, var4.field487, 0, var4.field492);
            return var4;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)I", line = 25)
    public final int method218(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field492; var6++) {
            int var7 = this.field487[var6] & 0xFF;
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
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        int var9 = 9 / ((-arg0 - 24) / 58);
        return var5;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)B", line = 115)
    public static final byte method219(byte arg0) {
        if (arg0 != 34) {
            method219((byte) 68);
        }
        return class19.field181 == null ? 0 : class19.field181[class14.field139];
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lu;B)Z", line = 129)
    public final boolean method220(class38 arg0, byte arg1) {
        if (this.field492 < arg0.field492) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field492; var3++) {
            if (this.field487[var3] != arg0.field487[var3]) {
                return false;
            }
        }
        if (arg1 > -51) {
            field486 = -123;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lw;III)[Ld;", line = 157)
    public static final class7[] method221(class41 arg0, int arg1, int arg2, int arg3) {
        if (class5.method12(arg1, arg3, (byte) -119, arg0)) {
            if (arg2 > -8) {
                method224(-98);
            }
            return class8.method32(126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)Lu;", line = 193)
    public final class38 method222(int arg0) {
        long var2 = this.method225(arg0 ^ 0x3135);
        synchronized (field495 == null ? (field495 = method246("u")) : field495) {
            if (class13.field127 == null) {
                class13.field127 = new class18(4096);
            } else {
                for (class8 var5 = (class8) class13.field127.method92(arg0 + 29956, var2); var5 != null; var5 = (class8) class13.field127.method91((byte) 106)) {
                    if (this.method227(121, var5.field71)) {
                        return var5.field71;
                    }
                }
            }
            if (arg0 != -29955) {
                return (class38) null;
            }
            class8 var6 = new class8();
            var6.field71 = this;
            this.field490 = false;
            class13.field127.method93(var2, var6, (byte) -114);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 194)
    public static Class method246(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lu;I)I", line = 235)
    public final int method223(class38 arg0, int arg1) {
        int var3;
        if (this.field492 <= arg0.field492) {
            var3 = this.field492;
        } else {
            var3 = arg0.field492;
        }
        int var4 = 76 % ((arg1 + 13) / 40);
        for (int var5 = 0; var5 < var3; var5++) {
            if ((arg0.field487[var5] & 0xFF) > (this.field487[var5] & 0xFF)) {
                return -1;
            }
            if ((arg0.field487[var5] & 0xFF) < (this.field487[var5] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field492 > this.field492) {
            return -1;
        } else if (arg0.field492 >= this.field492) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)[Lu;", line = 271)
    public static final class38[] method224(int arg0) {
        if (arg0 != 0) {
            method221(null, 94, -125, -35);
        }
        class38[] var10000 = new class38[] { class31.field382, class19.field179, class34.field438, class19.field184, class9.field87, class16.field150, class5.field27, class18.field165, class22.field205, class40.field501, class18.field166, class9.field85, class30.field367, class19.field182, field488, class8.field70, class35.field448, class8.field68, class9.field88, class28.field345, class30.field369, class10.field99, class10.field102, class20.field187, class19.field174, class10.field101, class14.field131, class33.field431, class22.field200, class10.field100, class28.field343, class16.field147, class2.field7, class11.field105, class14.field137, class39.field499, class11.field107, class32.field397, class11.field104, class5.field25, class28.field344, class25.field226, class23.field219, class1.field6, class14.field134, class28.field351, class28.field349, class31.field376, class16.field152, mapview.field239, class34.field441, mapview.field283, field484, class30.field372, class39.field498, class31.field378, class11.field113, class14.field133, class13.field125, field491, class33.field426, class28.field346, class13.field124, class11.field106, class13.field124, class25.field223, class13.field124, class22.field208, class33.field428, class13.field124, class5.field35, class34.field440, class13.field124, class2.field9, class35.field450, class13.field124, class13.field124 };
        if (class30.field375) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!u", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 281)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class38)) {
            throw new IllegalArgumentException();
        }
        return this.method227(117, (class38) arg0);
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(I)J", line = 303)
    private final long method225(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field492; var4++) {
            var2 = (var2 << 5) + (long) (this.field487[var4] & 0xFF) - var2;
        }
        if (arg0 != -17464) {
            this.field489 = -61;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IB)I", line = 329)
    public final int method226(int arg0, byte arg1) {
        if (arg1 != -31) {
            this.method220(null, (byte) 27);
        }
        return this.method232(arg0, (byte) 125, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(ILu;)Z", line = 342)
    public final boolean method227(int arg0, class38 arg1) {
        if (arg0 <= 115) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else if (this.field492 == arg1.field492) {
            if (!this.field490 || !arg1.field490) {
                if (this.field489 == 0) {
                    this.field489 = this.method245(0);
                    if (this.field489 == 0) {
                        this.field489 = 1;
                    }
                }
                if (arg1.field489 == 0) {
                    arg1.field489 = arg1.method245(0);
                    if (arg1.field489 == 0) {
                        arg1.field489 = 1;
                    }
                }
                if (this.field489 != arg1.field489) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field492; var3++) {
                if (this.field487[var3] != arg1.field487[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 395)
    public static final void method228(Throwable arg0, int arg1, String arg2) {
        try {
            String var3 = "";
            if (arg1 != 21219) {
                method224(15);
            }
            if (arg0 != null) {
                var3 = class13.method71(-13665, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class31.field377.field50 == null) {
                return;
            }
            class3 var8 = class31.field377.method25((byte) 71, new URL(class31.field377.field50.getCodeBase(), "clienterror.ws?c=" + class18.field168 + "&u=" + class5.field23 + "&v1=" + class6.field40 + "&v2=" + class6.field38 + "&e=" + var7));
            while (var8.field18 == 0) {
                class34.method197(21282, 1L);
            }
            if (var8.field18 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field16;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 452)
    public final int method229(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field487, 0, this.field492, "ISO-8859-1");
            int var4 = -11 % ((89 - arg1) / 36);
        } catch (UnsupportedEncodingException var6) {
            var3 = new String(this.field487, 0, this.field492);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(BI)Lu;", line = 470)
    public final class38 method230(byte arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (!this.field490) {
            throw new IllegalArgumentException();
        } else if (arg0 == -93) {
            this.field489 = 0;
            if (this.field487.length == this.field492) {
                int var3;
                for (var3 = 1; var3 <= this.field492; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class21.method99(this.field487, 0, var4, 0, this.field492);
                this.field487 = var4;
            }
            this.field487[this.field492++] = (byte) arg1;
            return this;
        } else {
            return (class38) null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(III)Lu;", line = 512)
    public final class38 method231(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg0;
        class38 var6 = new class38();
        var6.field492 = this.field492;
        var6.field487 = new byte[this.field492];
        for (int var7 = 0; var7 < this.field492; var7++) {
            byte var8 = this.field487[var7];
            if (var4 == var8) {
                var6.field487[var7] = var5;
            } else {
                var6.field487[var7] = var8;
            }
        }
        if (arg1 < 22) {
            field486 = 17;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IBI)I", line = 551)
    private final int method232(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field492; var5++) {
            if (this.field487[var5] == var4) {
                return var5;
            }
        }
        if (arg1 < 31) {
            this.hashCode();
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(B)Lu;", line = 578)
    public final class38 method233(byte arg0) {
        class38 var2 = new class38();
        var2.field492 = this.field492;
        var2.field487 = new byte[this.field492];
        if (arg0 != 44) {
            field493 = null;
        }
        for (int var3 = 0; var3 < this.field492; var3++) {
            byte var4 = this.field487[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field487[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(B)V", line = 626)
    public static void method234(byte arg0) {
        field494 = null;
        if (arg0 != 61) {
            field494 = null;
        }
        field491 = null;
        field484 = null;
        field488 = null;
        field493 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(I)I", line = 640)
    public final int method235(int arg0) {
        return arg0 == -21452 ? this.method218(arg0 + 21369, 10) : -37;
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)V", line = 659)
    public final void method236(int arg0, int arg1) {
        this.field489 = 0;
        if (!this.field490) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field487.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class21.method99(this.field487, 0, var4, 0, this.field492);
                this.field487 = var4;
            }
            if (arg1 <= 42) {
                method244((byte) -113);
            }
            for (int var5 = this.field492; var5 < arg0; var5++) {
                this.field487[var5] = 32;
            }
            this.field492 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "toString", descriptor = "()Ljava/lang/String;", line = 718)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!u", name = "hashCode", descriptor = "()I", line = 728)
    public final int hashCode() {
        return this.method245(0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 754)
    public final void method237(int arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field487, 0, this.field492, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field487, 0, this.field492);
        }
        if (arg1 != 227) {
            this.method232(-90, (byte) -16, -105);
        }
        arg2.drawString(var5, arg0, arg3);
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(II)I", line = 783)
    public final int method238(int arg0, int arg1) {
        if (arg1 >= -90) {
            this.field487 = null;
        }
        return this.field487[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(I)I", line = 795)
    public final int method239(int arg0) {
        if (arg0 != -6588) {
            this.method243((byte) 39);
        }
        return this.field492;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Z)V", line = 806)
    public static final void method240(boolean arg0) {
        if (class13.field126 != null) {
            class16 var1 = class13.field126;
            synchronized (class13.field126) {
                class13.field126 = null;
            }
        }
        if (!arg0) {
            field486 = 5;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(II)Lu;", line = 824)
    public final class38 method241(int arg0, int arg1) {
        return arg0 == 0 ? this.method217(arg1, this.field492, (byte) -83) : (class38) null;
    }

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "(I)Lu;", line = 834)
    public final class38 method242(int arg0) {
        if (!this.field490) {
            throw new IllegalArgumentException();
        }
        this.field489 = 0;
        if (this.field487.length != this.field492) {
            byte[] var2 = new byte[this.field492];
            class21.method99(this.field487, 0, var2, 0, this.field492);
            this.field487 = var2;
        }
        if (arg0 != 23463) {
            this.field492 = 101;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(B)V", line = 863)
    public final void method243(byte arg0) {
        if (arg0 < 92) {
            field494 = null;
        }
        String var2;
        try {
            var2 = new String(this.field487, 0, this.field492, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field487, 0, this.field492);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(B)[Loa;", line = 892)
    public static final class29[] method244(byte arg0) {
        class29[] var1 = new class29[class10.field90];
        for (int var2 = 0; var2 < class10.field90; var2++) {
            class29 var3 = var1[var2] = new class29();
            var3.field358 = class9.field78[var2];
            var3.field359 = class26.field326[var2];
            var3.field360 = class11.field112[var2];
            var3.field357 = class26.field333[var2];
            int var4 = var3.field360 * var3.field357;
            byte[] var5 = mapview.field249[var2];
            var3.field356 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field356[var6] = class11.field109[class18.method90(255, var5[var6])];
            }
        }
        class22.method102(false);
        if (arg0 >= -51) {
            field486 = -86;
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "(I)I", line = 944)
    public final int method245(int arg0) {
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field492; var3++) {
            var2 = (var2 << 5) + (this.field487[var3] & 0xFF) - var2;
        }
        return var2;
    }
}
