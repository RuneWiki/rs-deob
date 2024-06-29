import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class119 extends class456 {

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    private int field1644 = 1024;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
    private int field1657 = 1024;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    private int field1646 = 204;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    private int field1659 = 8;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    private int field1658 = 409;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    private int field1660 = 81;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    private int field1661 = 4;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    private int field1656 = 0;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1643 = 100;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1651 = null;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "S")
    public static short field1653 = 32767;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "Lsh;")
    public static class472 field1654 = new class472(57, 12);

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "Lui;")
    public static class451 field1664;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
    private int[] field1648;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[[I")
    private int[][] field1642;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "[[I")
    private int[][] field1645;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    private final void method845(byte arg0) {
        ++field1663;
        Random var2 = new Random((long) this.field1659);
        this.field1640 = this.field1660 / 2;
        this.field1647 = 4096 / this.field1661;
        this.field1641 = 4096 / this.field1659;
        int var3 = this.field1647 / 2;
        if (arg0 == -59) {
            this.field1642 = new int[this.field1659][this.field1661 + 1];
            int var4 = this.field1641 / 2;
            this.field1648 = new int[this.field1659 + 1];
            this.field1645 = new int[this.field1659][this.field1661];
            this.field1648[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field1659; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field1641;
                    int var7 = (class318.method1957(4096, (byte) -64, var2) - 2048) * this.field1646 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1648[var5] = this.field1648[var5 + -1] + var8;
                }
                this.field1642[var5][0] = 0;
                for (int var9 = 0; ~this.field1661 < ~var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field1647;
                        int var11 = (class318.method1957(4096, (byte) -64, var2) - 2048) * this.field1658 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1642[var5][var9] = this.field1642[var5][var9 + -1] + var12;
                    }
                    this.field1645[var5][var9] = ~this.field1657 < -1 ? -class318.method1957(this.field1657, (byte) -64, var2) + 4096 : 4096;
                }
                this.field1642[var5][this.field1661] = 4096;
            }
            this.field1648[this.field1659] = 4096;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
    public static void method846(byte arg0) {
        if (arg0 < -57) {
            field1664 = null;
            field1651 = null;
            field1654 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLjava/lang/String;ZLng;B)V")
    public static final void method847(boolean arg0, String arg1, boolean arg2, class153 arg3, byte arg4) {
        ++field1665;
        if (!arg0) {
            class140.method970(arg1, arg3, (byte) 102, 3);
        } else {
            if (class153.field2123.startsWith("win") && ~class153.field2137 != -4) {
                String var5 = null;
                if (arg3.field2125 != null) {
                    var5 = arg3.field2125.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class397 var6 = class140.method970(arg1, arg3, (byte) 102, 0);
                    class5.field92 = arg1;
                    class116.field1627 = var6;
                    class255.field3783 = arg3;
                    return;
                }
            }
            if (class153.field2123.startsWith("mac")) {
                String var7 = null;
                if (arg3.field2125 != null) {
                    var7 = arg3.field2125.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class140.method970(arg1, arg3, (byte) 102, 1);
                    return;
                }
            }
            class140.method970(arg1, arg3, (byte) 102, 2);
        }
        if (arg4 != 60) {
            field1664 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field1657 = arg2.method2631(2530);
                                    }
                                } else {
                                    this.field1660 = arg2.method2631(arg1 + 2475);
                                }
                            } else {
                                this.field1656 = arg2.method2631(arg1 ^ 2517);
                            }
                        } else {
                            this.field1644 = arg2.method2631(2530);
                        }
                    } else {
                        this.field1646 = arg2.method2631(2530);
                    }
                } else {
                    this.field1658 = arg2.method2631(2530);
                }
            } else {
                this.field1659 = arg2.method2628(49152);
            }
        } else {
            this.field1661 = arg2.method2628(49152);
        }
        if (arg1 != 55) {
            this.method653(false);
        }
        ++field1650;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        this.method845((byte) -59);
        if (!arg0) {
            method848(59, (class51) null, (byte) -118);
        }
        ++field1655;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILvg;B)V")
    public static final void method848(int arg0, class51 arg1, byte arg2) {
        ++field1662;
        int var3 = -40 % ((arg2 - -69) / 35);
        while (true) {
            class450 var4 = (class450) class324.field4865.method2456(32101);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; ~var6 > ~var4.field6356; ++var6) {
                if (var4.field6361[var6] != null) {
                    if (~var4.field6361[var6].field5822 == -3) {
                        var4.field6357[var6] = -5;
                    }
                    if (var4.field6361[var6].field5822 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field6352[var6] != null) {
                    if (var4.field6352[var6].field5822 == 2) {
                        var4.field6357[var6] = -6;
                    }
                    if (~var4.field6352[var6].field5822 == -1) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method376((byte) 87, arg0);
            arg1.method2619((byte) 63, 0);
            int var7 = arg1.field6315;
            arg1.method2596((byte) -49, var4.field6353);
            for (int var8 = 0; ~var8 > ~var4.field6356; ++var8) {
                if (~var4.field6357[var8] != -1) {
                    arg1.method2619((byte) 78, var4.field6357[var8]);
                } else {
                    try {
                        int var9 = var4.field6365[var8];
                        if (~var9 != -1) {
                            if (var9 != 1) {
                                if (~var9 == -3) {
                                    Field var10 = (Field) var4.field6361[var8].field5823;
                                    int var11 = var10.getModifiers();
                                    arg1.method2619((byte) 103, 0);
                                    arg1.method2596((byte) 122, var11);
                                }
                            } else {
                                Field var12 = (Field) var4.field6361[var8].field5823;
                                var12.setInt((Object) null, var4.field6364[var8]);
                                arg1.method2619((byte) 33, 0);
                            }
                        } else {
                            Field var13 = (Field) var4.field6361[var8].field5823;
                            int var14 = var13.getInt((Object) null);
                            arg1.method2619((byte) -30, 0);
                            arg1.method2596((byte) 121, var14);
                        }
                        if (var9 != 3) {
                            if (~var9 == -5) {
                                Method var21 = (Method) var4.field6352[var8].field5823;
                                int var22 = var21.getModifiers();
                                arg1.method2619((byte) -126, 0);
                                arg1.method2596((byte) -101, var22);
                            }
                        } else {
                            Method var15 = (Method) var4.field6352[var8].field5823;
                            byte[][] var16 = var4.field6354[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; ~var18 > ~var16.length; ++var18) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg1.method2619((byte) -125, 0);
                            } else if (var20 instanceof Number) {
                                arg1.method2619((byte) 118, 1);
                                arg1.method2581(-1973283408, ((Number) var20).longValue());
                            } else if (!(var20 instanceof String)) {
                                arg1.method2619((byte) 37, 4);
                            } else {
                                arg1.method2619((byte) -125, 2);
                                arg1.method2597((String) var20, (byte) -87);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method2619((byte) -122, -10);
                    } catch (InvalidClassException var24) {
                        arg1.method2619((byte) -7, -11);
                    } catch (StreamCorruptedException var25) {
                        arg1.method2619((byte) -22, -12);
                    } catch (OptionalDataException var26) {
                        arg1.method2619((byte) -127, -13);
                    } catch (IllegalAccessException var27) {
                        arg1.method2619((byte) 84, -14);
                    } catch (IllegalArgumentException var28) {
                        arg1.method2619((byte) 58, -15);
                    } catch (InvocationTargetException var29) {
                        arg1.method2619((byte) 99, -16);
                    } catch (SecurityException var30) {
                        arg1.method2619((byte) -26, -17);
                    } catch (IOException var31) {
                        arg1.method2619((byte) -122, -18);
                    } catch (NullPointerException var32) {
                        arg1.method2619((byte) 51, -19);
                    } catch (Exception var33) {
                        arg1.method2619((byte) -126, -20);
                    } catch (Throwable var34) {
                        arg1.method2619((byte) -4, -21);
                    }
                }
            }
            arg1.method2587(var7, (byte) -53);
            arg1.method2603(arg1.field6315 - var7, -24420);
            var4.method283(2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field1652;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = 0;
            int var5;
            for (var5 = class14.field206[arg1] - -this.field1656; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field1659 && var5 >= this.field1648[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field1648[var4];
            int var9 = this.field1648[var4 - 1];
            if (var5 > this.field1640 + var9 && var5 < -this.field1640 + var8) {
                for (int var10 = 0; ~var10 > ~class156.field2169; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field1644 : this.field1644;
                    int var13;
                    for (var13 = (this.field1647 * var12 >> 12) + class288.field4397[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field1661 && var13 >= this.field1642[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1642[var6][var14];
                    int var16 = this.field1642[var6][var11];
                    if (~(var15 - -this.field1640) > ~var13 && ~var13 > ~(-this.field1640 + var16)) {
                        var3[var10] = this.field1645[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class149.method1010(var3, 0, class156.field2169, 0);
            }
        }
        if (arg0 != -1) {
            this.method653(false);
        }
        return var3;
    }
}
