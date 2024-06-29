import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class121 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method780(int arg0, String arg1, Throwable arg2) {
        field1728++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class71.method472(arg2, 84);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class109.method698((byte) -17, var3);
            String var4 = class290.method1947((byte) 64, "%3a", var3, ":");
            if (arg0 == 160) {
                String var5 = class290.method1947((byte) 64, "%40", var4, "@");
                String var6 = class290.method1947((byte) 64, "%26", var5, "&");
                String var7 = class290.method1947((byte) 64, "%23", var6, "#");
                if (class231.field3609.field744 != null) {
                    class286 var8 = class231.field3609.method328(new URL(class231.field3609.field744.getCodeBase(), "clienterror.ws?c=" + class47.field684 + "&u=" + class131.field1832 + "&v1=" + class52.field739 + "&v2=" + class52.field742 + "&e=" + var7), 0);
                    while (var8.field4570 == 0) {
                        class17.method116(98, 1L);
                    }
                    if (var8.field4570 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field4567;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public static final byte[] method781(String arg0, boolean arg1) {
        field1727++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        if (!arg1) {
            method785(-30, (byte) -105, (class178[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)I")
    public static final int method782(int arg0, boolean arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        field1724++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1) {
            method780(66, (String) null, (Throwable) null);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public static final void method783(int arg0, int arg1) {
        field1726++;
        if (!class311.method2104(57, arg0)) {
            return;
        }
        class178[] var2 = class262.field4214[arg0];
        if (arg1 >= -97) {
            method780(127, (String) null, (Throwable) null);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class178 var4 = var2[var3];
            if (var4 != null) {
                var4.field2566 = 0;
                var4.field2681 = 1;
                var4.field2562 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Lga;")
    public static final class149 method784(int arg0, int arg1) {
        field1722++;
        class149 var2 = (class149) class143.field1964.method950((long) arg1, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field806.method2050(106, 36, arg1);
        class149 var4 = new class149();
        var4.field2029 = arg1;
        int var5 = -127 % ((-arg0 - 1) / 54);
        if (var3 != null) {
            var4.method934(126, new class215(var3));
        }
        class143.field1964.method942((long) arg1, (byte) 39, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB[Lim;)V")
    public static final void method785(int arg0, byte arg1, class178[] arg2) {
        int var3 = -101 / ((-arg1 - 70) / 43);
        for (int var4 = 0; var4 < arg2.length; var4++) {
            class178 var5 = arg2[var4];
            if (var5 != null && var5.field2675 == arg0 && (!var5.field2611 || !client.method2032(var5))) {
                if (var5.field2608 == 0) {
                    if (!var5.field2611 && client.method2032(var5) && class271.field4315 != var5) {
                        continue;
                    }
                    method785(var5.field2545, (byte) -125, arg2);
                    if (var5.field2642 != null) {
                        method785(var5.field2545, (byte) -120, var5.field2642);
                    }
                    class60 var6 = (class60) class186.field2821.method1453(true, (long) var5.field2545);
                    if (var6 != null) {
                        class198.method1250(var6.field831, 121);
                    }
                }
                if (var5.field2608 == 6) {
                    if (var5.field2558 != -1 || var5.field2678 != -1) {
                        boolean var7 = class250.method1628(-33, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field2678;
                        } else {
                            var8 = var5.field2558;
                        }
                        if (var8 != -1) {
                            class195 var9 = class280.method1815(var8, 124);
                            if (var9 != null) {
                                var5.field2566 += class208.field3094;
                                while (var9.field2966[var5.field2562] < var5.field2566) {
                                    var5.field2566 -= var9.field2966[var5.field2562];
                                    var5.field2562++;
                                    if (var5.field2562 >= var9.field2989.length) {
                                        var5.field2562 -= var9.field2984;
                                        if (var5.field2562 < 0 || var5.field2562 >= var9.field2989.length) {
                                            var5.field2562 = 0;
                                        }
                                    }
                                    var5.field2681 = var5.field2562 + 1;
                                    if (var5.field2681 >= var9.field2989.length) {
                                        var5.field2681 -= var9.field2984;
                                        if (var5.field2681 < 0 || var5.field2681 >= var9.field2989.length) {
                                            var5.field2681 = -1;
                                        }
                                    }
                                    class312.method2108(false, var5);
                                }
                            }
                        }
                    }
                    if (var5.field2596 != 0 && !var5.field2611) {
                        int var10 = var5.field2596 >> 16;
                        int var11 = class208.field3094 * var10;
                        var5.field2627 = var5.field2627 + var11 & 0x7FF;
                        int var12 = var5.field2596 << 16 >> 16;
                        int var13 = class208.field3094 * var12;
                        var5.field2569 = var5.field2569 + var13 & 0x7FF;
                        class312.method2108(false, var5);
                    }
                }
            }
        }
        field1723++;
    }
}
