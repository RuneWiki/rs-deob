import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class69 {

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
    private int[] field1539;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[B")
    private byte[] field1516;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lae;")
    public static class6 field1519 = class64.method474(110, "gelb:");

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lae;")
    public static class6 field1524 = class64.method474(121, "leuchten3:");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "J")
    public static long field1526 = 0L;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lae;")
    private static class6 field1518 = class64.method474(114, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lae;")
    public static class6 field1525 = field1518;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lae;")
    private static class6 field1527 = class64.method474(104, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lae;")
    public static class6 field1517 = class64.method474(113, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lae;")
    public static class6 field1536 = class64.method474(125, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lae;")
    public static class6 field1542 = class64.method474(125, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
    public static int[] field1541 = new int[256];

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Z")
    public static boolean field1544 = false;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1528 = 0;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lae;")
    public static class6 field1531 = field1527;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lbf;")
    public static class14 field1538;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lwa;", line = 4)
    public static final class134 method500(int arg0, int arg1) {
        field1521++;
        class134 var2 = (class134) class7.field151.method128((byte) -91, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 0) {
            field1536 = null;
        }
        byte[] var3 = class79.field1925.method160(30605, 13, arg1);
        class134 var4 = new class134();
        var4.field3287 = arg1;
        if (var3 != null) {
            var4.method1099(180, new class77(var3));
        }
        class7.field151.method130(var4, (long) arg1, (byte) -123);
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 42)
    public static final void method501(int arg0) {
        field1534++;
        if (arg0 < 111) {
            field1523 = 109;
        }
        if (class31.field751.toLowerCase().indexOf("microsoft") != -1) {
            class66.field1469[189] = 26;
            class66.field1469[192] = 58;
            class66.field1469[187] = 27;
            class66.field1469[186] = 57;
            class66.field1469[221] = 43;
            class66.field1469[220] = 74;
            class66.field1469[188] = 71;
            class66.field1469[190] = 72;
            class66.field1469[222] = 59;
            class66.field1469[191] = 73;
            class66.field1469[223] = 28;
            class66.field1469[219] = 42;
            return;
        }
        class66.field1469[45] = 26;
        class66.field1469[61] = 27;
        if (class31.field748 == null) {
            class66.field1469[222] = 59;
            class66.field1469[192] = 58;
        } else {
            class66.field1469[520] = 59;
            class66.field1469[192] = 28;
            class66.field1469[222] = 58;
        }
        class66.field1469[44] = 71;
        class66.field1469[91] = 42;
        class66.field1469[47] = 73;
        class66.field1469[59] = 57;
        class66.field1469[92] = 74;
        class66.field1469[46] = 72;
        class66.field1469[93] = 43;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lte;I)Z", line = 100)
    public static final boolean method502(class121 arg0, int arg1) {
        field1535++;
        if (arg0.field2855 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = -54 % ((arg1 + 52) / 53);
        while (arg0.field2855.length > var2) {
            int var4 = class135.method1105(var2, 2, arg0);
            int var5 = arg0.field2874[var2];
            if (arg0.field2855[var2] == 2) {
                if (var5 <= var4) {
                    return false;
                }
            } else if (arg0.field2855[var2] == 3) {
                if (var5 >= var4) {
                    return false;
                }
            } else if (arg0.field2855[var2] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 163)
    public static final String method503(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class25) {
            class25 var2 = (class25) arg0;
            arg0 = var2.field622;
            var3 = var2.field626 + " | ";
        } else {
            var3 = "";
        }
        field1540++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 != -27) {
            method502(null, -18);
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII[BI)I", line = 248)
    public final int method504(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1543++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = 124 / ((-arg5 - 54) / 55);
        int var10 = arg3;
        while (true) {
            byte var11 = arg4[var10];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var12;
            if ((var12 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var13;
            if ((var13 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var14;
            if ((var14 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var15;
            if ((var15 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var16;
            if ((var16 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var17;
            if ((var17 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var18;
            if ((var18 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var18;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1539[var8];
            }
            int var19;
            if ((var19 = this.field1539[var8]) < 0) {
                arg1[arg0++] = (byte) ~var19;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIII[B)I", line = 395)
    public final int method505(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg2 + arg3;
        int var8 = 0;
        field1520++;
        int var9 = arg4 << 3;
        while (var7 > arg2) {
            int var10 = arg0[arg2] & 0xFF;
            byte var11 = this.field1516[var10];
            int var12 = this.field1537[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class105.method885(var15, var12 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var8 = var12 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg2++;
        }
        if (arg1 != 255) {
            this.method505(null, 112, -98, -47, 91, null);
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 481)
    public static final void method506(byte arg0) {
        if (arg0 >= 0) {
            class85.field2062.method129(27392);
            class67.field1476.method129(27392);
            field1530++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 496)
    public static final void method507(int arg0) {
        field1545++;
        if (class136.field3309 != null) {
            class73 var1 = class136.field3309;
            synchronized (class136.field3309) {
                class136.field3309 = null;
            }
        }
        if (arg0 != 2372) {
            field1526 = 96L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V", line = 515)
    public static final void method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class136 var5 = (class136) class20.field389.method276((byte) -19, (long) arg1);
        if (var5 == null) {
            var5 = new class136();
            class20.field389.method269((long) arg1, var5, (byte) -74);
        }
        if (arg3 != 28) {
            return;
        }
        field1529++;
        if (var5.field3312.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field3312.length; var8++) {
                var6[var8] = var5.field3312[var8];
                var7[var8] = var5.field3311[var8];
            }
            for (int var9 = var5.field3312.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3311 = var7;
            var5.field3312 = var6;
        }
        var5.field3312[arg0] = arg2;
        var5.field3311[arg0] = arg4;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V", line = 571)
    public class69(byte[] arg0) {
        int var2 = arg0.length;
        this.field1539 = new int[8];
        this.field1537 = new int[var2];
        int[] var3 = new int[33];
        this.field1516 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var3[var6];
                int var8 = 0x1 << 32 - var6;
                this.field1537[var5] = var7;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var7 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class105.method885(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var7) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var7) == 0) {
                        var14++;
                    } else {
                        if (this.field1539[var14] == 0) {
                            this.field1539[var14] = var4;
                        }
                        var14 = this.field1539[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1539.length <= var14) {
                        int[] var18 = new int[this.field1539.length * 2];
                        for (int var19 = 0; var19 < this.field1539.length; var19++) {
                            var18[var19] = this.field1539[var19];
                        }
                        this.field1539 = var18;
                    }
                }
                this.field1539[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 694)
    public static void method509(boolean arg0) {
        field1525 = null;
        field1538 = null;
        field1527 = null;
        field1517 = null;
        field1536 = null;
        field1518 = null;
        field1541 = null;
        field1519 = null;
        field1524 = null;
        if (!arg0) {
            method501(13);
        }
        field1542 = null;
        field1531 = null;
    }
}
