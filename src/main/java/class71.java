import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class71 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field1782 = 65000;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lbc;")
    private class14 field1788 = null;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lbc;")
    private class14 field1797 = null;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field1785;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lgg;")
    public static class63 field1779 = null;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lgg;")
    public static class63 field1787 = class116.method911(43, "<img=0>");

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lgg;")
    public static class63 field1780 = class116.method911(43, "compass");

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lgg;")
    private static class63 field1781 = class116.method911(43, "Too many connections from your address)3");

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lgg;")
    public static class63 field1795 = field1781;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lgg;")
    public static class63 field1799 = class116.method911(43, "nav");

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Lgg;")
    private static class63 field1802 = class116.method911(43, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lgg;")
    public static class63 field1784 = field1802;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lgg;")
    private static class63 field1792 = class116.method911(43, " more options");

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lgg;")
    public static class63 field1783 = field1792;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[[S")
    public static short[][] field1793;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[[[B")
    public static byte[][][] field1790;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method666(byte arg0) {
        field1793 = null;
        field1792 = null;
        field1787 = null;
        field1779 = null;
        field1780 = null;
        field1781 = null;
        field1784 = null;
        field1790 = null;
        field1795 = null;
        if (arg0 <= 34) {
            method668(-105, 117, null);
        }
        field1799 = null;
        field1802 = null;
        field1783 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lgg;Lab;B)I")
    public static final int method667(class63 arg0, class3 arg1, byte arg2) {
        int var3 = arg1.field54;
        field1786++;
        arg1.method49(arg0.field1628, (byte) 89);
        arg1.field54 += class75.field1861.method989(arg0.field1602, (byte) 62, arg1.field48, 0, arg1.field54, arg0.field1628);
        if (arg2 > -74) {
            field1799 = null;
        }
        return arg1.field54 - var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILeh;)V")
    public static final void method668(int arg0, int arg1, class47 arg2) {
        class10.method132(arg2.field1141, 671674313, arg0, arg2.field1144);
        field1796++;
        if (arg1 != 6) {
            field1784 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BII)Z")
    public final boolean method669(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -89 % ((arg3 - 45) / 53);
        field1789++;
        class14 var6 = this.field1788;
        synchronized (this.field1788) {
            if (arg2 < 0 || this.field1782 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method670(true, -7922, arg2, arg1, arg0);
            if (!var7) {
                var7 = this.method670(false, -7922, arg2, arg1, arg0);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII[BI)Z")
    private final boolean method670(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field1791++;
        class14 var6 = this.field1788;
        synchronized (this.field1788) {
            try {
                int var8;
                if (arg0) {
                    if (this.field1797.method163(arg1 - 7385) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field1797.method160(54, (long) (arg4 * 6));
                    this.field1797.method157(client.field720, 6, 0, -65);
                    var8 = (client.field720[5] & 0xFF) + ((client.field720[4] & 0xFF) << 8) + ((client.field720[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field1788.method163(-15307) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1788.method163(-15307) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                client.field720[3] = (byte) (var8 >> 16);
                client.field720[2] = (byte) arg2;
                client.field720[0] = (byte) (arg2 >> 16);
                client.field720[5] = (byte) var8;
                client.field720[1] = (byte) (arg2 >> 8);
                client.field720[4] = (byte) (var8 >> 8);
                int var10 = 0;
                this.field1797.method160(arg1 ^ 0xFFFFE14E, (long) (arg4 * 6));
                this.field1797.method156(arg1 ^ 0xFFFFEA29, 0, 6, client.field720);
                int var11 = 0;
                while (true) {
                    if (arg2 > var11) {
                        label110: {
                            int var12 = 0;
                            if (arg0) {
                                label109: {
                                    this.field1788.method160(78, (long) (var8 * 520));
                                    try {
                                        this.field1788.method157(client.field720, 8, 0, arg1 + 8037);
                                    } catch (EOFException var33) {
                                        break label110;
                                    }
                                    int var13 = ((client.field720[0] & 0xFF) << 8) + (client.field720[1] & 0xFF);
                                    int var14 = ((client.field720[2] & 0xFF) << 8) + (client.field720[3] & 0xFF);
                                    var12 = (client.field720[6] & 0xFF) + ((client.field720[5] & 0xFF) << 8) + ((client.field720[4] & 0xFF) << 16);
                                    int var15 = client.field720[7] & 0xFF;
                                    if (arg4 == var13 && var10 == var14 && this.field1785 == var15) {
                                        if (var12 >= 0 && this.field1788.method163(arg1 - 7385) / 520L >= (long) var12) {
                                            break label109;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                var12 = (int) ((this.field1788.method163(arg1 ^ 0x253B) + 519L) / 520L);
                                arg0 = false;
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var8 == var12) {
                                    var12++;
                                }
                            }
                            client.field720[1] = (byte) arg4;
                            client.field720[3] = (byte) var10;
                            if (arg2 - var11 <= 512) {
                                var12 = 0;
                            }
                            client.field720[2] = (byte) (var10 >> 8);
                            client.field720[6] = (byte) var12;
                            client.field720[0] = (byte) (arg4 >> 8);
                            client.field720[5] = (byte) (var12 >> 8);
                            client.field720[4] = (byte) (var12 >> 16);
                            client.field720[7] = (byte) this.field1785;
                            var10++;
                            this.field1788.method160(arg1 ^ 0xFFFFE139, (long) (var8 * 520));
                            this.field1788.method156(2855, 0, 8, client.field720);
                            var8 = var12;
                            int var18 = arg2 - var11;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            this.field1788.method156(2855, var11, var18, arg3);
                            var11 += var18;
                            continue;
                        }
                    }
                    if (arg1 != -7922) {
                        method666((byte) 47);
                    }
                    return true;
                }
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1801++;
        return "Cache:" + this.field1785;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[B")
    public final byte[] method671(byte arg0, int arg1) {
        field1794++;
        class14 var3 = this.field1788;
        synchronized (this.field1788) {
            try {
                if (this.field1797.method163(-15307) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field1797.method160(10, (long) (arg1 * 6));
                this.field1797.method157(client.field720, 6, 0, -107);
                if (arg0 <= 80) {
                    field1802 = null;
                }
                int var5 = ((client.field720[0] & 0xFF) << 16) + (client.field720[2] & 0xFF) + ((client.field720[1] & 0xFF) << 8);
                int var6 = ((client.field720[3] & 0xFF) << 16) + (client.field720[4] << 8 & 0xFF00) + (client.field720[5] & 0xFF);
                if (var5 < 0 || var5 > this.field1782) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1788.method163(-15307) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1788.method160(-126, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1788.method157(client.field720, var13 + 8, 0, -96);
                        int var14 = ((client.field720[4] & 0xFF) << 16) + (client.field720[6] & 0xFF) + ((client.field720[5] & 0xFF) << 8);
                        int var15 = ((client.field720[0] & 0xFF) << 8) + (client.field720[1] & 0xFF);
                        int var16 = ((client.field720[2] & 0xFF) << 8) + (client.field720[3] & 0xFF);
                        int var17 = client.field720[7] & 0xFF;
                        if (arg1 == var15 && var11 == var16 && this.field1785 == var17) {
                            if (var14 >= 0 && (long) var14 <= this.field1788.method163(-15307) / 520L) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = client.field720[var20 + 8];
                                }
                                var6 = var14;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILbc;Lbc;I)V")
    public class71(int arg0, class14 arg1, class14 arg2, int arg3) {
        this.field1782 = arg3;
        this.field1785 = arg0;
        this.field1788 = arg1;
        this.field1797 = arg2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILd;Ld;IIIIJ)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, class30 arg4, class30 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class109 var12 = new class109();
        var12.field2449 = arg10;
        var12.field2455 = arg1 * 128 + 64;
        var12.field2460 = arg2 * 128 + 64;
        var12.field2452 = arg3;
        var12.field2467 = arg4;
        var12.field2463 = arg5;
        var12.field2456 = arg6;
        var12.field2448 = arg7;
        var12.field2458 = arg8;
        var12.field2462 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class148.field3117[var13][arg1][arg2] == null) {
                class148.field3117[var13][arg1][arg2] = new class96(var13, arg1, arg2);
            }
        }
        class148.field3117[arg0][arg1][arg2].field2271 = var12;
    }
}
