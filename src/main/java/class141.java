import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class141 extends class520 {

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field1804 = new Object();

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field1805 = 0;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    private int field1807 = 0;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[Ler;")
    private class6[] field1810 = new class6[0];

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1806;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method755(byte arg0) {
        ++field1816;
        try {
            Object var2 = this.field1804;
            synchronized (this.field1804) {
                while (~super.field7246 != -1) {
                    this.field1804.wait();
                }
                if (arg0 >= -86) {
                    method762((byte) -7);
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLrg;)V")
    public final void method756(byte arg0, class563 arg1) {
        if (arg0 == 61) {
            Object var3 = this.field1804;
            synchronized (this.field1804) {
                super.field7241[super.field7249] = 21;
                super.field7239[super.field7249] = arg1;
                ++super.field7249;
                if (super.field7249 >= 5000) {
                    super.field7249 = 0;
                }
                ++super.field7238;
                ++super.field7246;
                if (~this.field1807 < -1) {
                    this.field1804.notifyAll();
                }
            }
            ++field1800;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public final void method757(int arg0, byte arg1) {
        Object var3 = this.field1804;
        synchronized (this.field1804) {
            super.field7241[super.field7249] = (byte) arg0;
            ++super.field7249;
            if (super.field7249 >= 5000) {
                super.field7249 = 0;
            }
            ++super.field7246;
            ++super.field7238;
            if (this.field1807 > 0) {
                this.field1804.notifyAll();
            }
        }
        ++field1811;
        if (arg1 != 11) {
            this.field1810 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILrg;)V")
    public final void method758(int arg0, class563 arg1) {
        Object var3 = this.field1804;
        synchronized (this.field1804) {
            --super.field7237;
            if (~super.field7237 > -1) {
                super.field7237 = 4999;
            }
            super.field7241[super.field7237] = 21;
            super.field7239[super.field7237] = arg1;
            ++super.field7238;
            ++super.field7246;
            if (arg0 < this.field1807) {
                this.field1804.notifyAll();
            }
        }
        ++field1803;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class400.field5480 = arg0;
        class456.field6523 = 1 << class400.field5480;
        class337.field4699 = class456.field6523 >> 1;
        class593.field8564 = (int) Math.sqrt((double) (class337.field4699 * class337.field4699 + class337.field4699 * class337.field4699));
        class590.field8521 = class456.field6523 >> 2;
        class427.field5825 = class456.field6523;
        class260.field3211 = arg2;
        class541.field7566 = arg3;
        class257.field3199 = arg4;
        class497.field6933 = new class563[arg1][class260.field3211][class541.field7566];
        class50.field672 = new class544[arg1];
        if (arg5) {
            class558.field7819 = new int[class260.field3211][class541.field7566];
            class596.field8593 = new byte[class260.field3211][class541.field7566];
            class599.field8649 = new short[class260.field3211][class541.field7566];
            class319.field4403 = new class563[1][class260.field3211][class541.field7566];
            class353.field4949 = new class544[1];
        } else {
            class558.field7819 = null;
            class596.field8593 = null;
            class599.field8649 = null;
            class319.field4403 = null;
            class353.field4949 = null;
        }
        if (arg6) {
            class238.field3050 = new long[arg1][arg2][arg3];
            class256.field3175 = new class597[65535];
            class209.field2709 = new boolean[65535];
            class444.field6143 = 0;
        } else {
            class238.field3050 = null;
            class256.field3175 = null;
            class209.field2709 = null;
            class444.field6143 = 0;
        }
        class580.method3268(false);
        class247.field3114 = new class276[1000];
        class355.field4976 = 0;
        class257.field3200 = new class276[1000];
        class483.field6746 = 0;
        class406.field5575 = new int[arg1][class260.field3211 + 1][class541.field7566 + 1];
        class315.field4364 = new class450[5000];
        class548.field7628 = 0;
        class634.field9230 = new boolean[class257.field3199 + class257.field3199 + 1][class257.field3199 + class257.field3199 + 1];
        class144.field1879 = new boolean[class257.field3199 + class257.field3199 + 2][class257.field3199 + class257.field3199 + 2];
        class171.field2196 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
    public final void method760(int arg0, int arg1) {
        ++field1808;
        int var3 = arg1;
        Object var4 = this.field1804;
        synchronized (this.field1804) {
            if (~this.field1805 == ~arg0) {
                for (int var5 = 0; ~var5 > ~this.field1805; ++var5) {
                    this.method769((byte) 93, var3++);
                }
            } else {
                for (int var6 = 0; ~this.field1805 < ~var6; ++var6) {
                    this.field1810[var6].method25((byte) 2);
                }
                this.field1805 = arg0;
                this.field1810 = new class6[this.field1805];
                for (int var7 = 0; this.field1805 > var7; ++var7) {
                    this.field1810[var7] = new class6(this);
                    this.field1810[var7].method23(32);
                    this.method769((byte) 127, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
    public static final void method761(int arg0, int arg1, int arg2, int arg3) {
        ++field1815;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 63) + "," + (arg1 & 63);
        System.out.println(var4);
        class288.method1781((byte) 99, var4, false, true);
        int var5 = -12 / (arg2 / 62);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method762(byte arg0) {
        int var1 = 23 / ((arg0 - -34) / 49);
        field1806 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILsa;)V")
    public final void method763(boolean arg0, int arg1, int arg2, class544 arg3) {
        Object var5 = this.field1804;
        synchronized (this.field1804) {
            super.field7241[super.field7249] = (byte) (arg0 ? arg1 + 40 : arg1 + 30);
            if (arg2 != 13518) {
                this.field1810 = null;
            }
            super.field7239[super.field7249] = arg3;
            ++super.field7249;
            ++super.field7238;
            ++super.field7246;
            if (super.field7249 >= 5000) {
                super.field7249 = 0;
            }
            if (this.field1807 > 0) {
                this.field1804.notifyAll();
            }
        }
        ++field1817;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ler;I)V")
    public final void method764(class6 arg0, int arg1) {
        ++field1802;
        boolean var3 = false;
        try {
            boolean var4 = false;
            Object var5 = this.field1804;
            byte var6;
            synchronized (this.field1804) {
                while (~super.field7238 == -1) {
                    ++this.field1807;
                    this.field1804.wait();
                    --this.field1807;
                }
                var6 = super.field7241[super.field7237];
                if (~arg0.field51 > -1) {
                    if (var6 >= 0 && var6 <= 3) {
                        var3 = true;
                    }
                } else if (var6 < 0 || ~var6 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field757 = super.field7239[super.field7237];
                    super.field7239[super.field7237] = null;
                    ++super.field7237;
                    --super.field7238;
                    if (super.field7237 >= 5000) {
                        super.field7237 = 0;
                    }
                }
            }
            if (var3) {
                if (arg0.field51 >= 0) {
                    if (var6 != 21) {
                        if (var6 == 20) {
                            class563 var7 = (class563) arg0.field757;
                            if (var7.field7896 != null) {
                                var7.field7896.method66(class583.field8427, 0);
                            }
                            if (var7.field7884 != null) {
                                var7.field7884.method66(class583.field8427, arg1 + 4557);
                            }
                            if (var7.field7885 != null) {
                                var7.field7885.method66(class583.field8427, 0);
                            }
                            if (var7.field7889 != null) {
                                var7.field7889.method66(class583.field8427, 0);
                            }
                            if (var7.field7891 != null) {
                                var7.field7891.method66(class583.field8427, 0);
                            }
                            for (class15 var8 = var7.field7894; var8 != null; var8 = var8.field158) {
                                var8.field161.method66(class583.field8427, 0);
                            }
                        } else if (~var6 <= -31 && ~var6 >= -34) {
                            ((class544) arg0.field757).method1045(class155.field2012, class151.field1995, class257.field3199, class634.field9230, ~(var6 + -30) == -1);
                        } else if (var6 >= 40 && var6 <= 43) {
                            ((class544) arg0.field757).method1045(class155.field2012, class151.field1995, class257.field3199, class144.field1879, var6 + -40 == 0);
                        } else if (var6 != 22) {
                            if (var6 == 23) {
                                class583.field8427.method933();
                            } else if (var6 != 24) {
                                if (~var6 <= -11 && var6 <= 13) {
                                    class583.field8427.method203(arg0.field51);
                                    arg0.field51 = -1;
                                }
                            } else {
                                class583.field8427.method972(0, (class592[]) null);
                            }
                        } else {
                            class583.field8427.method905(-1, 1583160, 40, 127);
                        }
                    } else {
                        class98.method540(arg0, (class563) arg0.field757);
                    }
                } else if (var6 >= 0 && var6 <= 3) {
                    arg0.field51 = var6;
                    class583.field8427.method198(var6);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var21) {
        } finally {
            Object var12 = null;
            if (var3) {
                Object var13 = this.field1804;
                synchronized (this.field1804) {
                    --super.field7246;
                    if (super.field7246 == 0) {
                        this.field1804.notifyAll();
                    }
                }
            }
        }
        if (arg1 != -4557) {
            this.field1804 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;)Lfc;")
    public static final class322 method765(int arg0, Component arg1) {
        ++field1809;
        if (arg0 <= 95) {
            method761(108, 73, 45, -100);
        }
        return new class507(arg1);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)V")
    private final void method766(int arg0, byte arg1) {
        super.field7241[super.field7249] = (byte) (arg0 - -10);
        ++field1801;
        ++super.field7249;
        ++super.field7238;
        if (super.field7249 >= 5000) {
            super.field7249 = 0;
        }
        if (arg1 > 3) {
            ++super.field7246;
            if (~this.field1807 < -1) {
                Object var3 = this.field1804;
                synchronized (this.field1804) {
                    this.field1804.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lrg;B)V")
    public final void method767(class563 arg0, byte arg1) {
        Object var3 = this.field1804;
        synchronized (this.field1804) {
            super.field7241[super.field7249] = 20;
            super.field7239[super.field7249] = arg0;
            ++super.field7249;
            int var4 = -122 / ((63 - arg1) / 51);
            if (super.field7249 >= 5000) {
                super.field7249 = 0;
            }
            ++super.field7238;
            ++super.field7246;
            if (~this.field1807 < -1) {
                this.field1804.notifyAll();
            }
        }
        ++field1814;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public final void method768(boolean arg0) {
        ++field1799;
        Object var2 = this.field1804;
        synchronized (this.field1804) {
            int var3 = 0;
            if (!arg0) {
                method765(-68, (Component) null);
            }
            while (this.field1805 > var3) {
                if (this.field1810[var3].field51 >= 0) {
                    this.method766(this.field1810[var3].field51, (byte) 19);
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    private final void method769(byte arg0, int arg1) {
        ++field1813;
        super.field7241[super.field7249] = (byte) arg1;
        ++super.field7249;
        if (arg0 < 45) {
            field1812 = 7;
        }
        ++super.field7246;
        if (super.field7249 >= 5000) {
            super.field7249 = 0;
        }
        ++super.field7238;
        if (~this.field1807 < -1) {
            Object var3 = this.field1804;
            synchronized (this.field1804) {
                this.field1804.notifyAll();
            }
        }
    }
}
