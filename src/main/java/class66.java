import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class66 {

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[B")
    private byte[] field1254 = new byte[4];

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lnc;")
    private class141 field1250;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "J")
    private long field1247;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lvd;")
    public static class222 field1243 = class212.method1357("Der Server wird gerade aktualisiert)3", 10731);

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1249 = -1;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "J")
    public static long field1245;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1252;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "[B")
    private byte[] field1257;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
    public static final void method452(int arg0, long arg1) {
        field1244++;
        if (arg0 >= -58) {
            field1248 = -102;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class86.field1630; var3++) {
            if (class116.field2210[var3] == arg1) {
                class86.field1630--;
                for (int var4 = var3; var4 < class86.field1630; var4++) {
                    class31.field657[var4] = class31.field657[var4 + 1];
                    class36.field784[var4] = class36.field784[var4 + 1];
                    class120.field2270[var4] = class120.field2270[var4 + 1];
                    class116.field2210[var4] = class116.field2210[var4 + 1];
                    class190.field3504[var4] = class190.field3504[var4 + 1];
                }
                class46.field938++;
                class68.field1283 = class28.field616;
                class42.field895.method1347((byte) -128, 233);
                class42.field895.method668(arg1, 8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1255++;
        int var6 = arg0 - arg3;
        int var7 = arg2 - arg1;
        if (arg5 != 1866) {
            field1239 = -107;
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class127.method804((byte) 114, arg2, arg4, arg3, arg1);
            }
        } else if (var7 == 0) {
            method456(arg3, arg0, arg1, false, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg0;
                arg0 = arg2;
                int var10 = arg3;
                arg2 = var9;
                arg3 = arg1;
                arg1 = var10;
            }
            if (arg0 < arg3) {
                int var11 = arg3;
                int var12 = arg1;
                arg1 = arg2;
                arg3 = arg0;
                arg2 = var12;
                arg0 = var11;
            }
            int var13 = arg1;
            int var14 = arg0 - arg3;
            int var15 = arg2 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg2 <= arg1 ? -1 : 1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg0; var18++) {
                    class156.field2981[var18][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg0; var19++) {
                    var16 += var15;
                    class156.field2981[var13][var19] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)[B")
    public final byte[] method454(boolean arg0) throws IOException {
        field1241++;
        if (class135.method849(arg0) > this.field1247) {
            throw new IOException("fdt");
        }
        if (!arg0) {
            this.field1251 = 68;
        }
        if (this.field1256 == 0) {
            if (this.field1250.field2716 == 2) {
                throw new IOException("fds");
            }
            if (this.field1250.field2716 == 1) {
                this.field1256 = 1;
                this.field1252 = (DataInputStream) this.field1250.field2714;
            }
        }
        if (this.field1256 == 1) {
            int var2 = this.field1252.available();
            if (var2 > 0) {
                if (this.field1251 + var2 > 4) {
                    var2 = 4 - this.field1251;
                }
                this.field1251 += this.field1252.read(this.field1254, this.field1251, var2);
                if (this.field1251 == 4) {
                    int var3 = (new class109(this.field1254)).method710(28908);
                    this.field1256 = 2;
                    this.field1257 = new byte[var3];
                }
            }
        }
        if (this.field1256 == 2) {
            int var4 = this.field1252.available();
            if (var4 > 0) {
                if (this.field1240 + var4 > this.field1257.length) {
                    var4 = this.field1257.length - this.field1240;
                }
                this.field1240 += this.field1252.read(this.field1257, this.field1240, var4);
                if (this.field1257.length == this.field1240) {
                    return this.field1257;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method455(int arg0, int arg1) {
        if (arg0 == 0) {
            field1242++;
            if (class27.method232(arg1, -7754)) {
                class226.method1479(true, -1, class220.field4066[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZI)V")
    public static final void method456(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field1245 = -110L;
        }
        field1246++;
        if (arg1 < arg0) {
            class81.method532(arg1, arg4, class156.field2981[arg2], arg0, -7);
        } else {
            class81.method532(arg0, arg4, class156.field2981[arg2], arg1, -7);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method457(byte arg0) {
        if (arg0 != -85) {
            method455(-81, 67);
        }
        field1243 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ld;Ljava/net/URL;)V")
    public class66(class33 arg0, URL arg1) {
        this.field1250 = arg0.method279(arg1, (byte) 124);
        this.field1256 = 0;
        this.field1247 = class135.method849(true) + 30000L;
    }
}
