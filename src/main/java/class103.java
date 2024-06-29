import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class103 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lnh;")
    private class55 field1723 = null;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    private int field1715 = 65000;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lnh;")
    private class55 field1729 = null;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
    public static int[] field1725 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lhc;")
    public static class235 field1730;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public static int[] field1713;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method742(boolean arg0, String arg1) {
        if (arg0) {
            field1730 = null;
        }
        field1719++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (var2 << 5) + (long) arg1.charAt(var5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLwc;)V")
    public static final void method743(byte arg0, class236 arg1) {
        if (arg0 != -92) {
            method743((byte) 14, (class236) null);
        }
        field1728++;
        class11 var2 = (class11) class30.field444.method285(class148.method1000(arg1.field3803, 934), 13821);
        if (var2 == null) {
            return;
        }
        if (var2.field206 != null) {
            class257.field4118.method1205(var2.field206);
            var2.field206 = null;
        }
        var2.method1123(0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[B)Z")
    public final boolean method744(int arg0, int arg1, int arg2, byte[] arg3) {
        field1716++;
        class55 var5 = this.field1723;
        synchronized (this.field1723) {
            if (arg2 < 0) {
                return false;
            } else if (arg0 >= 0 && this.field1715 >= arg0) {
                boolean var7 = this.method746(arg0, arg3, arg1, true, true);
                if (!var7) {
                    var7 = this.method746(arg0, arg3, arg1, false, true);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILai;ILna;)V")
    public static final void method745(int arg0, class88 arg1, int arg2, class32 arg3) {
        field1718++;
        class98 var4 = new class98();
        var4.field1636 = arg1.method633(110);
        var4.field1654 = arg1.method641(arg0 ^ 0xFFFF8AC1);
        if (arg0 != 30014) {
            method750(59);
        }
        var4.field1641 = new int[var4.field1636];
        var4.field1633 = new int[var4.field1636];
        var4.field1653 = new byte[var4.field1636][][];
        var4.field1634 = new class76[var4.field1636];
        var4.field1659 = new class76[var4.field1636];
        var4.field1638 = new int[var4.field1636];
        for (int var5 = 0; var5 < var4.field1636; var5++) {
            try {
                int var6 = arg1.method633(75);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method675((byte) 16);
                    int var8 = 0;
                    String var9 = arg1.method675((byte) 16);
                    if (var6 == 1) {
                        var8 = arg1.method641(arg0 - 30015);
                    }
                    var4.field1638[var5] = var6;
                    var4.field1641[var5] = var8;
                    var4.field1634[var5] = arg3.method247(var9, class39.method289(false, var7), arg0 - 30014);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method675((byte) 16);
                    String var11 = arg1.method675((byte) 16);
                    int var12 = arg1.method633(arg0 - 29896);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method675((byte) 16);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method641(-1);
                            var15[var16] = new byte[var17];
                            arg1.method662(var15[var16], var17, 0, (byte) 124);
                        }
                    }
                    var4.field1638[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class39.method289(false, var13[var19]);
                    }
                    var4.field1659[var5] = arg3.method248(var18, var11, (byte) -55, class39.method289(false, var10));
                    var4.field1653[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1633[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1633[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1633[var5] = -3;
            } catch (Exception var23) {
                var4.field1633[var5] = -4;
            } catch (Throwable var24) {
                var4.field1633[var5] = -5;
            }
        }
        class296.field4684.method1219(false, var4);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[BIZZ)Z")
    private final boolean method746(int arg0, byte[] arg1, int arg2, boolean arg3, boolean arg4) {
        field1720++;
        class55 var6 = this.field1723;
        synchronized (this.field1723) {
            try {
                if (!arg4) {
                    return true;
                }
                int var9;
                if (arg3) {
                    if (this.field1729.method423(104) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field1729.method424((long) (arg2 * 6), 0);
                    this.field1729.method416(0, (byte) 35, 6, class277.field4395);
                    var9 = ((class277.field4395[4] & 0xFF) << 8) + ((class277.field4395[3] & 0xFF) << 16) + (class277.field4395[5] & 0xFF);
                    if (var9 <= 0 || (this.field1723.method423(-77) / 520L) < ((long) var9)) {
                        return false;
                    }
                } else {
                    var9 = (int) ((this.field1723.method423(127) + 519L) / 520L);
                    if (var9 == 0) {
                        var9 = 1;
                    }
                }
                class277.field4395[5] = (byte) var9;
                class277.field4395[0] = (byte) (arg0 >> 16);
                class277.field4395[1] = (byte) (arg0 >> 8);
                class277.field4395[4] = (byte) (var9 >> 8);
                class277.field4395[3] = (byte) (var9 >> 16);
                class277.field4395[2] = (byte) arg0;
                int var11 = 0;
                int var12 = 0;
                this.field1729.method424((long) (arg2 * 6), 0);
                this.field1729.method421(-1, class277.field4395, 6, 0);
                while (arg0 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label111: {
                            this.field1723.method424((long) (var9 * 520), 0);
                            try {
                                this.field1723.method416(0, (byte) 35, 8, class277.field4395);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class277.field4395[6] & 0xFF) + ((class277.field4395[5] & 0xFF) << 8) + (class277.field4395[4] & 0xFF << 16);
                            int var14 = ((class277.field4395[0] & 0xFF) << 8) + (class277.field4395[1] & 0xFF);
                            int var15 = (class277.field4395[2] & 0xFF << 8) + (class277.field4395[3] & 0xFF);
                            int var16 = class277.field4395[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field1731 == var16) {
                                if (var13 >= 0 && this.field1723.method423(-14) / 520L >= (long) var13) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1723.method423(107) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var9 == var13) {
                            var13++;
                        }
                    }
                    class277.field4395[3] = (byte) var12;
                    int var19 = arg0 - var11;
                    class277.field4395[7] = (byte) this.field1731;
                    if (arg0 - var11 <= 512) {
                        var13 = 0;
                    }
                    class277.field4395[2] = (byte) (var12 >> 8);
                    class277.field4395[5] = (byte) (var13 >> 8);
                    class277.field4395[6] = (byte) var13;
                    class277.field4395[1] = (byte) arg2;
                    var12++;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class277.field4395[4] = (byte) (var13 >> 16);
                    class277.field4395[0] = (byte) (arg2 >> 8);
                    this.field1723.method424((long) (var9 * 520), 0);
                    this.field1723.method421(-1, class277.field4395, 8, 0);
                    this.field1723.method421(-1, arg1, var19, var11);
                    var11 += var19;
                    var9 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method747(int arg0, int arg1) {
        field1727++;
        int var2 = 53 / ((arg1 + 33) / 32);
        class8.field163.method1897(true, arg0);
        class57.field944.method1897(true, arg0);
        class171.field2664.method1897(true, arg0);
        class161.field2504.method1897(true, arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method748(Object arg0, boolean arg1, int arg2) {
        field1726++;
        if (arg2 != 520) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class161.method1094(0, var3) : var3;
        } else if (arg0 instanceof class245) {
            class245 var4 = (class245) arg0;
            return var4.method109(-14208);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[B")
    public final byte[] method749(boolean arg0, int arg1) {
        field1722++;
        class55 var3 = this.field1723;
        synchronized (this.field1723) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1729.method423(97)) {
                    return null;
                }
                this.field1729.method424((long) (arg1 * 6), 0);
                this.field1729.method416(0, (byte) 35, 6, class277.field4395);
                int var5 = ((class277.field4395[3] & 0xFF) << 16) + ((class277.field4395[4] & 0xFF) << 8) + (class277.field4395[5] & 0xFF);
                int var6 = (class277.field4395[2] & 0xFF) + ((class277.field4395[0] & 0xFF) << 16) + (class277.field4395[1] & 0xFF << 8);
                if (var6 < 0 || this.field1715 < var6) {
                    return null;
                } else if (var5 > 0 && (this.field1723.method423(-36) / 520L) >= ((long) var5)) {
                    if (!arg0) {
                        this.field1723 = null;
                    }
                    int var9 = 0;
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    while (var9 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1723.method424((long) (var5 * 520), 0);
                        this.field1723.method416(0, (byte) 35, var13 + 8, class277.field4395);
                        int var14 = ((class277.field4395[0] & 0xFF) << 8) + (class277.field4395[1] & 0xFF);
                        int var15 = ((class277.field4395[2] & 0xFF) << 8) + (class277.field4395[3] & 0xFF);
                        int var16 = class277.field4395[7] & 0xFF;
                        int var17 = ((class277.field4395[4] & 0xFF) << 16) + (class277.field4395[5] & 0xFF << 8) + (class277.field4395[6] & 0xFF);
                        if (arg1 == var14 && var11 == var15 && this.field1731 == var16) {
                            if (var17 >= 0 && this.field1723.method423(-18) / 520L >= (long) var17) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class277.field4395[var20 + 8];
                                }
                                var5 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1730 = null;
        if (arg0 != -14676) {
            field1725 = null;
        }
        field1713 = null;
        field1725 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(ILnh;Lnh;I)V")
    public class103(int arg0, class55 arg1, class55 arg2, int arg3) {
        this.field1715 = arg3;
        this.field1731 = arg0;
        this.field1723 = arg1;
        this.field1729 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1721++;
        return "Cache:" + this.field1731;
    }
}
