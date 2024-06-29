import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class542 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
    private boolean field8121 = false;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public int field8125 = 0;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field8126 = 0;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8128 = new String[] { method4106(method4105("\u000fYJa%")), method4106(method4105("\u000fYJd%")), method4106(method4105("\u000fYJ`%")), method4106(method4105("\u0010\u0019J\u000bp")), method4106(method4105("\u0005B\bI")), method4106(method4105(";V\u0011Vd\u0005PDCb\u0019\u0017")), method4106(method4105("KD\u0001Fb\u0005S\u0017\u000b#E")), method4106(method4105("\u000fYJc%")), method4106(method4105("\u001bV\u0011Vh")), method4106(method4105("7\u0018J\u001f!KhI\u000eV6I$")), method4106(method4105("\u000fYJf%")), method4106(method4105("\u000fYJg%")) };

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lel;")
    public static class573 field8119 = new class573(6, -1);

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field8108;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field8111;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field8113;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    private int field8114;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field8118;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field8120;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field8123;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public int field8127;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "J")
    public long field8109;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V", line = 7)
    public final void method4099(int arg0) {
        try {
            if (arg0 != -2086) {
                this.field8113 = 118;
            }
            field8122++;
            this.field8108 = class298.field4703[this.field8114 << 3];
            long var2 = (long) this.field8120;
            long var4 = (long) this.field8112;
            long var6 = (long) this.field8127;
            this.field8111 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
            if (this.field8123 == 0) {
                this.field8123 = 1;
            }
            if (this.field8118 == 0) {
                this.field8109 = 2147483647L;
            } else if (this.field8118 == 1) {
                this.field8109 = (this.field8111 * 8 / this.field8123);
                this.field8109 *= this.field8109;
            } else if (this.field8118 == 2) {
                this.field8109 = (this.field8111 * 8 / this.field8123);
            }
            if (this.field8121) {
                this.field8111 *= -1;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8128[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 54)
    public static void method4100(int arg0) {
        try {
            if (arg0 != -1) {
                method4103((byte) 46);
            }
            field8119 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8128[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lib;Z)V", line = 69)
    public final void method4101(class163 arg0, boolean arg1) {
        try {
            if (arg1) {
                this.field8113 = -81;
            }
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    field8117++;
                    return;
                }
                this.method4102((byte) 33, var3, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8128[10] + (arg0 == null ? field8128[4] : field8128[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BILib;)V", line = 94)
    private final void method4102(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 == 1) {
                this.field8114 = arg2.method1445((byte) 123);
            } else if (arg1 == 2) {
                arg2.method1455((byte) 62);
            } else if (arg1 == 3) {
                this.field8120 = arg2.method1453((byte) 93);
                this.field8112 = arg2.method1453((byte) 116);
                this.field8127 = arg2.method1453((byte) 106);
            } else if (arg1 == 4) {
                this.field8118 = arg2.method1455((byte) 62);
                this.field8123 = arg2.method1453((byte) 123);
            } else if (arg1 == 6) {
                this.field8113 = arg2.method1455((byte) 62);
            } else if (arg1 == 8) {
                this.field8125 = 1;
            } else if (arg1 == 9) {
                this.field8126 = 1;
            } else if (arg1 == 10) {
                this.field8121 = true;
            }
            if (arg0 > 6) {
                field8115++;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8128[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8128[4] : field8128[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 149)
    public static final void method4103(byte arg0) {
        try {
            field8110++;
            if (class597.field8757 < 102) {
                class597.field8757 += 6;
            }
            if (class457.field6649 != -1 && class430.method3299(arg0 ^ 0x1C) > class321.field5068) {
                for (int var1 = class457.field6649; var1 < class138.field1647.length; var1++) {
                    if (class138.field1647[var1].startsWith(field8128[8])) {
                        int var2 = 5;
                        try {
                            var2 = Integer.parseInt(class138.field1647[var1].substring(6));
                        } catch (Exception var14) {
                        }
                        class437.method3350(arg0 + 3, field8128[5] + var2 + field8128[6]);
                        class457.field6649 = var1 + 1;
                        class321.field5068 = class430.method3299(96) + (long) (var2 * 1000);
                        return;
                    }
                    class194.field2609 = class138.field1647[var1];
                    class251.method2128(false, 0);
                }
                class457.field6649 = -1;
            }
            if (class166.field2291 != 0) {
                class787.field11485 -= class166.field2291 * 5;
                if (class627.field9183 <= class787.field11485) {
                    class787.field11485 = class627.field9183 - 1;
                }
                if (class787.field11485 < 0) {
                    class787.field11485 = 0;
                }
                class166.field2291 = 0;
            }
            for (int var3 = 0; var3 < class486.field7011; var3++) {
                class462 var4 = class77.field889[var3];
                int var5 = var4.method3520((byte) 117);
                char var6 = var4.method3516(13112);
                int var7 = var4.method3518(-47);
                if (var5 == 84) {
                    class251.method2128(false, 0);
                }
                if (var5 == 80) {
                    class251.method2128(true, arg0 ^ 0x68);
                } else if (var5 == 66 && (var7 & 0x4) != 0) {
                    if (class755.field10983 != null) {
                        String var11 = "";
                        for (int var12 = class725.field10472.length - 1; var12 >= 0; var12--) {
                            if (class725.field10472[var12] != null && class725.field10472[var12].length() > 0) {
                                var11 = var11 + class725.field10472[var12] + '\n';
                            }
                        }
                        class755.field10983.setContents(new StringSelection(var11), null);
                    }
                } else if (var5 == 67 && (var7 & 0x4) != 0) {
                    if (class755.field10983 != null) {
                        Transferable var8 = class755.field10983.getContents(null);
                        if (var8 != null) {
                            try {
                                String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                                if (var9 != null) {
                                    String[] var10 = class350.method2878(var9, '\n', (byte) 95);
                                    class540.method4065(5, var10);
                                }
                            } catch (Exception var15) {
                            }
                        }
                    }
                } else if (var5 == 85 && class373.field5696 > 0) {
                    class194.field2609 = class194.field2609.substring(0, class373.field5696 - 1) + class194.field2609.substring(class373.field5696);
                    class373.field5696--;
                } else if (var5 == 101 && class373.field5696 < class194.field2609.length()) {
                    class194.field2609 = class194.field2609.substring(0, class373.field5696) + class194.field2609.substring(class373.field5696 + 1);
                } else if (var5 == 96 && class373.field5696 > 0) {
                    class373.field5696--;
                } else if (var5 == 97 && class373.field5696 < class194.field2609.length()) {
                    class373.field5696++;
                } else if (var5 == 102) {
                    class373.field5696 = 0;
                } else if (var5 == 103) {
                    class373.field5696 = class194.field2609.length();
                } else if (var5 == 104 && class725.field10472.length > class698.field10153) {
                    class698.field10153++;
                    class60.method440(-59);
                    class373.field5696 = class194.field2609.length();
                } else if (var5 == 105 && class698.field10153 > 0) {
                    class698.field10153--;
                    class60.method440(arg0 ^ 0x18);
                    class373.field5696 = class194.field2609.length();
                } else if (class773.method5602(695, var6) || field8128[9].indexOf(var6) != -1) {
                    class194.field2609 = class194.field2609.substring(0, class373.field5696) + class77.field889[var3].method3516(13112) + class194.field2609.substring(class373.field5696);
                    class373.field5696++;
                }
            }
            class486.field7011 = 0;
            class275.field4156 = 0;
            class649.method4771((byte) 95);
            if (arg0 != 104) {
                field8119 = null;
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field8128[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 353)
    public static final void method4104(int arg0) {
        try {
            field8124++;
            int var1 = arg0;
            if (class289.field4305 != null) {
                var1 = class289.field4305.field842.method3195(false);
            }
            if (var1 == 2) {
                int var4 = class650.field9404 <= 800 ? class650.field9404 : 800;
                class10.field103 = (class650.field9404 - var4) / 2;
                int var5 = class101.field1118 > 600 ? 600 : class101.field1118;
                class179.field2489 = var4;
                class94.field1062 = var5;
                class554.field8258 = 0;
            } else if (var1 == 1) {
                int var2 = class650.field9404 <= 1024 ? class650.field9404 : 1024;
                int var3 = class101.field1118 <= 768 ? class101.field1118 : 768;
                class179.field2489 = var2;
                class10.field103 = (class650.field9404 - var2) / 2;
                class554.field8258 = 0;
                class94.field1062 = var3;
            } else {
                class554.field8258 = 0;
                class94.field1062 = class101.field1118;
                class10.field103 = 0;
                class179.field2489 = class650.field9404;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8128[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4105(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4106(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
