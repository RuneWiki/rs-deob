import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class91 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[B")
    private byte[] field1731 = new byte[4];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lcd;")
    private class26 field1725;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "J")
    private long field1732;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lqe;")
    public static class179 field1727 = class206.method1380("Texturen geladen)3", (byte) 85);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public static boolean field1726 = false;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lqe;")
    public static class179 field1735 = class206.method1380("", (byte) 118);

    @OriginalMember(owner = "client!id", name = "m", descriptor = "B")
    public static byte field1737 = 0;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1736;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[B")
    private byte[] field1728;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1727 = null;
        field1735 = null;
        if (arg0 > -2) {
            field1726 = true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
    public final byte[] method600(byte arg0) throws IOException {
        field1734++;
        if (arg0 <= 90) {
            method599(85);
        }
        if (class80.method504(-1) > this.field1732) {
            throw new IOException("fdt");
        }
        if (this.field1729 == 0) {
            if (this.field1725.field595 == 2) {
                throw new IOException("fds");
            }
            if (this.field1725.field595 == 1) {
                this.field1729 = 1;
                this.field1736 = (DataInputStream) this.field1725.field591;
            }
        }
        if (this.field1729 == 1) {
            int var2 = this.field1736.available();
            if (var2 > 0) {
                if (this.field1733 + var2 > 4) {
                    var2 = 4 - this.field1733;
                }
                this.field1733 += this.field1736.read(this.field1731, this.field1733, var2);
                if (this.field1733 == 4) {
                    int var3 = (new class185(this.field1731)).method1231(-4898);
                    this.field1729 = 2;
                    this.field1728 = new byte[var3];
                }
            }
        }
        if (this.field1729 == 2) {
            int var4 = this.field1736.available();
            if (var4 > 0) {
                if (this.field1730 + var4 > this.field1728.length) {
                    var4 = this.field1728.length - this.field1730;
                }
                this.field1730 += this.field1736.read(this.field1728, this.field1730, var4);
                if (this.field1728.length == this.field1730) {
                    return this.field1728;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z")
    public static final boolean method601(int arg0, int arg1, int arg2, int arg3) {
        if (!class116.method747(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class30.field665[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class100.field1859) {
                    if (!class190.method1279(var4, var6, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class190.method1279(var4, var7, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class190.method1279(var4, var8, var5)) {
                    return false;
                }
                if (!class190.method1279(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class110.field2060) {
                    if (!class190.method1279(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class190.method1279(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class190.method1279(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class190.method1279(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class100.field1859) {
                    if (!class190.method1279(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class190.method1279(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class190.method1279(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class190.method1279(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class110.field2060) {
                    if (!class190.method1279(var4, var6, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class190.method1279(var4, var7, var5)) {
                        return false;
                    }
                    if (!class190.method1279(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class190.method1279(var4, var8, var5)) {
                    return false;
                }
                if (!class190.method1279(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class190.method1279(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class190.method1279(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class190.method1279(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class190.method1279(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class190.method1279(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(La;Ljava/net/URL;)V")
    public class91(class1 arg0, URL arg1) {
        this.field1725 = arg0.method3(arg1, (byte) 76);
        this.field1729 = 0;
        this.field1732 = class80.method504(-1) + 30000L;
    }
}
