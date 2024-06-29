import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class141 extends class94 {

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    private int field1648 = 0;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Ltm;")
    private class349 field1647 = new class349(16);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    private int field1668 = 0;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Lbb;")
    private class270 field1667 = new class270();

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "J")
    private long field1672 = 0L;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lpp;")
    private class334 field1656;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Z")
    private boolean field1669;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Lbb;")
    private class270 field1670;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lpp;")
    private class334 field1635;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lsa;")
    private class381 field1637;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Lvm;")
    private class275 field1666;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
    private boolean field1673;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "Lfm;")
    private class134 field1665;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[I")
    public static int[] field1662;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lop;")
    private class258 field1659;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lbb;")
    public static class270 field1663;

    // $FF: synthetic field
    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field1674;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Z")
    private boolean field1671;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "[B")
    private byte[] field1664;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method902(byte arg0) {
        field1655++;
        class102.method615(arg0 - 118, false);
        if (class237.field3109 >= 0 && class237.field3109 != 0) {
            class373.method2338(110, class237.field3109);
            class237.field3109 = -1;
        }
        if (arg0 != 0) {
            method902((byte) -80);
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public final void method903(int arg0) {
        field1636++;
        if (arg0 != -1) {
            this.field1670 = null;
        }
        if (this.field1656 != null) {
            this.field1671 = true;
            if (this.field1670 == null) {
                this.field1670 = new class270();
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lop;")
    public final class258 method583(int arg0) {
        field1641++;
        if (this.field1659 != null) {
            return this.field1659;
        }
        if (arg0 != 10314) {
            this.field1672 = 57L;
        }
        if (this.field1665 == null) {
            if (this.field1637.method2380((byte) -32)) {
                return null;
            }
            this.field1665 = this.field1637.method2374(this.field1652, true, (byte) 0, 255, true);
        }
        if (this.field1665.field1539) {
            return null;
        }
        byte[] var2 = this.field1665.method873(arg0 - 10570);
        if (this.field1665 instanceof class201) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1659 = new class258(var2, this.field1658);
                if (this.field1659.field3332 != this.field1639) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1659 = null;
                if (this.field1637.method2380((byte) -32)) {
                    this.field1665 = null;
                } else {
                    this.field1665 = this.field1637.method2374(this.field1652, true, (byte) 0, 255, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1659 = new class258(var2, this.field1658);
            } catch (RuntimeException var4) {
                this.field1637.method2377(arg0 - 10059);
                this.field1659 = null;
                if (this.field1637.method2380((byte) -32)) {
                    this.field1665 = null;
                } else {
                    this.field1665 = this.field1637.method2374(this.field1652, true, (byte) 0, 255, true);
                }
                return null;
            }
            if (this.field1635 != null) {
                this.field1666.method1732(this.field1652, var2, false, this.field1635);
            }
        }
        if (this.field1656 != null) {
            this.field1664 = new byte[this.field1659.field3335];
            this.field1648 = 0;
        }
        this.field1665 = null;
        return this.field1659;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static final void method904(int arg0) {
        field1638++;
        int var1 = -2 / ((arg0 + 55) / 63);
        class118.field1354 = new class266(class12.field147.method434(class373.field5057, -8192), "", class46.field530, 1012, 0L, 0, 0);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public final void method905(int arg0) {
        field1645++;
        if (this.field1670 == null) {
            return;
        }
        if (arg0 != -31856) {
            this.field1672 = 121L;
        }
        if (this.method583(10314) == null) {
            return;
        }
        for (class43 var2 = this.field1667.method1690((byte) -119); var2 != null; var2 = this.field1667.method1699((byte) 63)) {
            int var3 = (int) var2.field505;
            if (var3 < 0 || var3 >= this.field1659.field3335 || this.field1659.field3331[var3] == 0) {
                var2.method263(false);
            } else {
                if (this.field1664[var3] == 0) {
                    this.method914(-251, 1, var3);
                }
                if (this.field1664[var3] == -1) {
                    this.method914(arg0 ^ 0x7C95, 2, var3);
                }
                if (this.field1664[var3] == 1) {
                    var2.method263(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method906(boolean arg0) {
        if (arg0) {
            method904(-33);
        }
        field1631++;
        try {
            Method var1 = (field1674 == null ? (field1674 = method918("java.lang.Runtime")) : field1674).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class427.field5845 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public final void method907(int arg0) {
        field1634++;
        if (this.field1670 != null) {
            if (this.method583(10314) == null) {
                return;
            }
            if (this.field1669) {
                boolean var6 = true;
                for (class43 var7 = this.field1670.method1690((byte) -110); var7 != null; var7 = this.field1670.method1699((byte) 22)) {
                    int var9 = (int) var7.field505;
                    if (this.field1664[var9] == 0) {
                        this.method914(-251, 1, var9);
                    }
                    if (this.field1664[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method263(false);
                    }
                }
                while (this.field1668 < this.field1659.field3331.length) {
                    if (this.field1659.field3331[this.field1668] == 0) {
                        this.field1668++;
                    } else {
                        if (this.field1666.field3564 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1664[this.field1668] == 0) {
                            this.method914(-251, 1, this.field1668);
                        }
                        if (this.field1664[this.field1668] == 0) {
                            class43 var8 = new class43();
                            var8.field505 = (long) this.field1668;
                            var6 = false;
                            this.field1670.method1696(false, var8);
                        }
                        this.field1668++;
                    }
                }
                if (var6) {
                    this.field1668 = 0;
                    this.field1669 = false;
                }
            } else if (this.field1671) {
                boolean var2 = true;
                for (class43 var3 = this.field1670.method1690((byte) -120); var3 != null; var3 = this.field1670.method1699((byte) 117)) {
                    int var5 = (int) var3.field505;
                    if (this.field1664[var5] != 1) {
                        this.method914(-251, 2, var5);
                    }
                    if (this.field1664[var5] == 1) {
                        var3.method263(false);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1668 < this.field1659.field3331.length) {
                    if (this.field1659.field3331[this.field1668] == 0) {
                        this.field1668++;
                    } else {
                        if (this.field1637.method2373((byte) -81)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1664[this.field1668] != 1) {
                            this.method914(-251, 2, this.field1668);
                        }
                        if (this.field1664[this.field1668] != 1) {
                            class43 var4 = new class43();
                            var4.field505 = (long) this.field1668;
                            var2 = false;
                            this.field1670.method1696(false, var4);
                        }
                        this.field1668++;
                    }
                }
                if (var2) {
                    this.field1668 = 0;
                    this.field1671 = false;
                }
            } else {
                this.field1670 = null;
            }
        }
        if (arg0 != -24611) {
            this.method584(-32, false);
        }
        if (!this.field1673 || this.field1672 > class164.method1038(8635)) {
            return;
        }
        for (class134 var10 = (class134) this.field1647.method2222(arg0 ^ 0xFFFF9FDD); var10 != null; var10 = (class134) this.field1647.method2215(false)) {
            if (!var10.field1539) {
                if (var10.field1535) {
                    if (!var10.field1538) {
                        throw new RuntimeException();
                    }
                    var10.method263(false);
                } else {
                    var10.field1535 = true;
                }
            }
        }
        this.field1672 = class164.method1038(arg0 ^ 0xFFFFBE66) + 1000L;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
    public final void method585(byte arg0, int arg1) {
        if (arg0 <= 114) {
            this.method903(-27);
        }
        field1653++;
        if (this.field1656 == null) {
            return;
        }
        for (class43 var3 = this.field1667.method1690((byte) -111); var3 != null; var3 = this.field1667.method1699((byte) 5)) {
            if ((long) arg1 == var3.field505) {
                return;
            }
        }
        class43 var4 = new class43();
        var4.field505 = (long) arg1;
        this.field1667.method1696(false, var4);
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1662 = null;
        field1663 = null;
        if (arg0 != -2) {
            method904(35);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
    public static final void method909(int arg0, int arg1) {
        if (arg1 != 23882) {
            method909(-58, 83);
        }
        class138.field1573.method2286(arg0, (byte) 36);
        field1649++;
        class325.field4342.method2286(arg0, (byte) 36);
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)I")
    public final int method910(int arg0) {
        field1657++;
        if (this.field1659 == null) {
            return 0;
        } else if (this.field1669) {
            if (arg0 != -2) {
                this.field1652 = -1;
            }
            class43 var2 = this.field1670.method1690((byte) -117);
            return var2 == null ? 0 : (int) var2.field505;
        } else {
            return this.field1659.field3324;
        }
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)V")
    public static final void method911(int arg0) {
        if (arg0 != -7448) {
            return;
        }
        if (class298.field3977 == null || class296.field3949 == null) {
            class296.field3949 = new int[256];
            class298.field3977 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class298.field3977[var1] = (int) (Math.sin(var2) * 4096.0D);
                class296.field3949[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1644++;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public static final void method912(boolean arg0) {
        if (class174.field2017 == 10 || class174.field2017 == 28) {
            class229.method1399(class287.field3784 >> 10, true, 5000, class80.field979 >> 10);
        } else {
            class229.method1399(class143.field1684.field2480[0] >> 3, arg0, 5000, class143.field1684.field2482[0] >> 3);
        }
        field1650++;
        class76.method456((byte) -29);
        class284.method1786(1);
        class20.method120((byte) 89);
        class344.method2190(-26568);
        if (!arg0) {
            field1660 = -68;
        }
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "(I)I")
    public final int method913(int arg0) {
        if (arg0 != -28947) {
            method906(false);
        }
        field1651++;
        return this.field1648;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[B")
    public final byte[] method592(int arg0, int arg1) {
        field1642++;
        if (arg1 < 95) {
            this.field1639 = -48;
        }
        class134 var3 = this.method914(-251, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method873(-256);
            var3.method263(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lfm;")
    private final class134 method914(int arg0, int arg1, int arg2) {
        if (arg0 != -251) {
            return null;
        }
        field1661++;
        class134 var4 = (class134) this.field1647.method2218(1, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field1538 && var4.field1539) {
            var4.method263(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field1656 == null || this.field1664[arg2] == -1) {
                    if (this.field1637.method2380((byte) -32)) {
                        return null;
                    }
                    var4 = this.field1637.method2374(arg2, true, (byte) 2, this.field1652, true);
                } else {
                    var4 = this.field1666.method1729(-118, this.field1656, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field1656 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1666.method1726((byte) 15, this.field1656, arg2);
            } else if (arg1 == 2) {
                if (this.field1656 == null) {
                    throw new RuntimeException();
                }
                if (this.field1664[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1637.method2373((byte) -26)) {
                    return null;
                }
                var4 = this.field1637.method2374(arg2, true, (byte) 2, this.field1652, false);
            } else {
                throw new RuntimeException();
            }
            this.field1647.method2227(var4, -8218, (long) arg2);
        }
        if (var4.field1539) {
            return null;
        }
        byte[] var5 = var4.method873(-256);
        if (!var4 instanceof class201) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class140.field1622.reset();
                class140.field1622.update(var5, 0, var5.length - 2);
                int var9 = (int) class140.field1622.getValue();
                if (this.field1659.field3330[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field1637.field5214 = 0;
                this.field1637.field5215 = 0;
            } catch (RuntimeException var12) {
                this.field1637.method2377(255);
                var4.method263(false);
                if (var4.field1538 && !this.field1637.method2380((byte) -32)) {
                    class249 var10 = this.field1637.method2374(arg2, true, (byte) 2, this.field1652, true);
                    this.field1647.method2227(var10, -8218, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1659.field3323[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field1659.field3323[arg2];
            if (this.field1656 != null) {
                this.field1666.method1732(arg2, var5, false, this.field1656);
                if (this.field1664[arg2] != 1) {
                    this.field1648++;
                    this.field1664[arg2] = 1;
                }
            }
            if (!var4.field1538) {
                var4.method263(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class140.field1622.reset();
            class140.field1622.update(var5, 0, var5.length - 2);
            int var6 = (int) class140.field1622.getValue();
            if (this.field1659.field3330[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1659.field3323[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1664[arg2] != 1) {
                this.field1648++;
                this.field1664[arg2] = 1;
            }
            if (!var4.field1538) {
                var4.method263(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field1664[arg2] = -1;
            var4.method263(false);
            if (var4.field1538 && !this.field1637.method2380((byte) -32)) {
                class249 var8 = this.field1637.method2374(arg2, true, (byte) 2, this.field1652, true);
                this.field1647.method2227(var8, arg0 ^ 0x20E3, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "(I)I")
    public final int method915(int arg0) {
        if (arg0 >= -52) {
            return 50;
        } else {
            field1643++;
            return this.field1659 == null ? 0 : this.field1659.field3324;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)I")
    public final int method584(int arg0, boolean arg1) {
        field1640++;
        class134 var3 = (class134) this.field1647.method2218(1, (long) arg0);
        if (var3 == null) {
            return arg1 ? 94 : 0;
        } else {
            return var3.method871(255);
        }
    }

    @OriginalMember(owner = "client!s", name = "m", descriptor = "(I)I")
    public final int method916(int arg0) {
        field1654++;
        if (arg0 >= -44) {
            this.method914(-79, 108, 90);
        }
        if (this.method583(10314) == null) {
            return this.field1665 == null ? 0 : this.field1665.method871(255);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Lsp;")
    public static final class438 method917(int arg0, int arg1) {
        int var2 = -42 / ((-arg1 - 45) / 61);
        field1633++;
        class438 var3 = (class438) class219.field2708.method2295((long) arg0, (byte) 74);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class157.field1831.method1794(5860, 35, arg0);
        class438 var5 = new class438();
        if (var4 != null) {
            var5.method2676(new class242(var4), 107);
        }
        var5.method2682((byte) -119);
        class219.field2708.method2294(var5, (byte) 71, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILpp;Lpp;Lsa;Lvm;IIZ)V")
    public class141(int arg0, class334 arg1, class334 arg2, class381 arg3, class275 arg4, int arg5, int arg6, boolean arg7) {
        this.field1652 = arg0;
        this.field1656 = arg1;
        if (this.field1656 == null) {
            this.field1669 = false;
        } else {
            this.field1669 = true;
            this.field1670 = new class270();
        }
        this.field1635 = arg2;
        this.field1658 = arg5;
        this.field1637 = arg3;
        this.field1666 = arg4;
        this.field1639 = arg6;
        this.field1673 = arg7;
        if (this.field1635 != null) {
            this.field1665 = this.field1666.method1729(-106, this.field1635, this.field1652);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method918(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class72("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field1662 = new int[4];
        field1660 = -1;
    }
}
