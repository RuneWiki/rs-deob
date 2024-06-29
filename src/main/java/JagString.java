import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class JagString implements StringInterface {

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Z")
    private boolean field473 = true;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lv;")
    public static JagString field467 = class1.method2(255, "mapfunction");

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lv;")
    public static JagString field471 = class1.method2(255, "???");

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Z")
    public static boolean field475 = false;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Lv;")
    public static JagString field470 = class1.method2(255, "Saw Mill");

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Lna;")
    public static PixMap field466;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field477;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Z")
    public static boolean field472;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "[B")
    public byte[] field474;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "[I")
    public static int[] field476;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BI)Lv;", line = 15)
    public final JagString method230(byte arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field473) {
            if (arg0 <= 82) {
                this.method243(-38, 36);
            }
            this.field469 = 0;
            if (this.field474.length == this.field468) {
                int var3;
                for (var3 = 1; var3 <= this.field468; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                ByteArrayCopier.copy(this.field474, 0, var4, 0, this.field468);
                this.field474 = var4;
            }
            this.field474[this.field468++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)Lv;", line = 54)
    public final JagString method231(int arg0) {
        if (!this.field473) {
            throw new IllegalArgumentException();
        } else if (arg0 == 122) {
            this.field469 = 0;
            if (this.field474.length != this.field468) {
                byte[] var2 = new byte[this.field468];
                ByteArrayCopier.copy(this.field474, 0, var2, 0, this.field468);
                this.field474 = var2;
            }
            return this;
        } else {
            return (JagString) null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II)V", line = 83)
    public final void method232(int arg0, int arg1) {
        this.field469 = 0;
        if (!this.field473) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field474.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                ByteArrayCopier.copy(this.field474, 0, var4, 0, this.field468);
                this.field474 = var4;
            }
            if (arg1 <= -119) {
                for (int var5 = this.field468; var5 < arg0; var5++) {
                    this.field474[var5] = 32;
                }
                this.field468 = arg0;
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)Lv;", line = 132)
    public final JagString method233(int arg0) {
        long var2 = this.method244(arg0 - 4096);
        synchronized (field477 == null ? (field477 = method251("v")) : field477) {
            if (ByteArrayPool.field180 == null) {
                ByteArrayPool.field180 = new HashTable(4096);
            } else {
                for (StringNode var5 = (StringNode) ByteArrayPool.field180.get(-1, var2); var5 != null; var5 = (StringNode) ByteArrayPool.field180.method29((byte) -12)) {
                    if (this.method245(var5.value, -87)) {
                        return var5.value;
                    }
                }
            }
            StringNode var6 = new StringNode();
            var6.value = this;
            if (arg0 == 4096) {
                this.field473 = false;
                ByteArrayPool.field180.put(arg0 - 17831, var2, var6);
                return this;
            } else {
                return (JagString) null;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 133)
    public static Class method251(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(BI)I", line = 201)
    public final int method234(byte arg0, int arg1) {
        if (arg0 != 26) {
            this.method235(21, 115, 64);
        }
        return this.method235(0, arg1, -1);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(III)I", line = 226)
    private final int method235(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        int var5 = arg0;
        if (arg2 != -1) {
            this.method247(12, 68, -10, null);
        }
        while (this.field468 > var5) {
            if (this.field474[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)Lv;", line = 250)
    public final JagString method236(byte arg0) {
        JagString var2 = new JagString();
        var2.field468 = this.field468;
        var2.field474 = new byte[this.field468];
        for (int var3 = 0; var3 < this.field468; var3++) {
            byte var4 = this.field474[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field474[var3] = var4;
        }
        if (arg0 != 92) {
            this.method230((byte) 107, -101);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 283)
    public static final void method237(int arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = ByteArrayPool.method64(-1, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (GameCanvas.field33.field452 == null) {
                return;
            }
            PrivilegedRequest var8 = GameCanvas.field33.method229(new URL(GameCanvas.field33.field452.getCodeBase(), "clienterror.ws?c=" + Timer.field406 + "&u=" + PixMap.field305 + "&v1=" + Signlink.field461 + "&v2=" + Signlink.field457 + "&e=" + var7), arg0 ^ 0xFFEFFFFE);
            while (var8.field172 == 0) {
                ByteArray.method55(1L, (byte) 12);
            }
            if (~var8.field172 == arg0) {
                DataInputStream var9 = (DataInputStream) var8.field175;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lv;B)I", line = 330)
    public final int method238(JagString arg0, byte arg1) {
        int var3;
        if (this.field468 <= arg0.field468) {
            var3 = this.field468;
        } else {
            var3 = arg0.field468;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field474[var4] & 0xFF) < (arg0.field474[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field474[var4] & 0xFF) < (this.field474[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field468 < arg0.field468) {
            return -1;
        } else if (this.field468 > arg0.field468) {
            return 1;
        } else {
            int var5 = 34 / ((arg1 - 40) / 59);
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)I", line = 376)
    public final int method239(int arg0) {
        return arg0 == 25305 ? this.field468 : -121;
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(III)Lv;", line = 391)
    public final JagString method240(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        JagString var6 = new JagString();
        var6.field468 = this.field468;
        var6.field474 = new byte[this.field468];
        int var7 = 0;
        int var8 = -117 % ((arg2 - 19) / 40);
        while (this.field468 > var7) {
            byte var9 = this.field474[var7];
            if (var5 == var9) {
                var6.field474[var7] = var4;
            } else {
                var6.field474[var7] = var9;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ZII)Lv;", line = 437)
    public final JagString method241(boolean arg0, int arg1, int arg2) {
        JagString var4 = new JagString();
        var4.field468 = arg2 - arg1;
        if (!arg0) {
            this.method232(-116, -52);
        }
        var4.field474 = new byte[arg2 - arg1];
        ByteArrayCopier.copy(this.field474, arg1, var4.field474, 0, var4.field468);
        return var4;
    }

    @OriginalMember(owner = "mapview!v", name = "toString", descriptor = "()Ljava/lang/String;", line = 455)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 466)
    public final int method242(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            if (arg0 != -32) {
                return -88;
            }
            var3 = new String(this.field474, 0, this.field468, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field474, 0, this.field468);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(II)Lv;", line = 488)
    public final JagString method243(int arg0, int arg1) {
        int var3 = -91 % ((arg1 + 50) / 45);
        return this.method241(true, arg0, this.field468);
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(I)J", line = 520)
    private final long method244(int arg0) {
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field468; var4++) {
            var2 = (var2 << 5) + (long) (this.field474[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lv;I)Z", line = 536)
    public final boolean method245(JagString arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field468 == arg0.field468) {
            if (!this.field473 || !arg0.field473) {
                if (this.field469 == 0) {
                    this.field469 = this.method246(false);
                    if (this.field469 == 0) {
                        this.field469 = 1;
                    }
                }
                if (arg0.field469 == 0) {
                    arg0.field469 = arg0.method246(false);
                    if (arg0.field469 == 0) {
                        arg0.field469 = 1;
                    }
                }
                if (this.field469 != arg0.field469) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg1 > -84) {
                return false;
            }
            while (var3 < this.field468) {
                if (this.field474[var3] != arg0.field474[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "hashCode", descriptor = "()I", line = 597)
    public final int hashCode() {
        return this.method246(false);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)I", line = 619)
    public final int method246(boolean arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field468; var3++) {
            var2 = (var2 << 5) + (this.field474[var3] & 0xFF) - var2;
        }
        if (arg0) {
            this.field469 = 52;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 657)
    public final void method247(int arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            if (arg2 > -54) {
                this.field474 = null;
            }
            var5 = new String(this.field474, 0, this.field468, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field474, 0, this.field468);
        }
        arg3.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 681)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof JagString)) {
            throw new IllegalArgumentException();
        }
        return this.method245((JagString) arg0, -125);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(B)V", line = 701)
    public static void method248(byte arg0) {
        field467 = null;
        field466 = null;
        field471 = null;
        int var1 = 74 / ((arg0 + 5) / 37);
        field476 = null;
        field470 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "(I)V", line = 718)
    public final void method249(int arg0) {
        String var2;
        try {
            var2 = new String(this.field474, 0, this.field468, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field474, 0, this.field468);
        }
        System.out.println(var2);
        if (arg0 != -1) {
            this.method244(-92);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(BI)I", line = 739)
    public final int method250(byte arg0, int arg1) {
        if (arg0 != 98) {
            field476 = null;
        }
        return this.field474[arg1] & 0xFF;
    }
}
