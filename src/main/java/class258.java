import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class258 {

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    private int field4210 = 32;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Z")
    private boolean field4221 = false;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "J")
    private long field4220 = class232.method1544((byte) -91);

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    private int field4226 = 0;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field4228 = 0;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "J")
    private long field4224 = 0L;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[Lok;")
    private class40[] field4237 = new class40[8];

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "Z")
    private boolean field4235 = true;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "[Lok;")
    private class40[] field4227 = new class40[8];

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "J")
    private long field4232 = 0L;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    private int field4231 = 0;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    private int field4240 = 0;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4208 = null;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[I")
    public static int[] field4213 = new int[5];

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4214 = "flash1:";

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    private int field4233;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lvh;")
    public static class108 field4219;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lok;")
    private class40 field4206;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public int[] field4207;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1707(int arg0) {
        field4205++;
        if (arg0 != 0) {
            field4219 = null;
        }
        class100.field1714.method53(true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public final synchronized void method1708(byte arg0) {
        field4216++;
        this.field4235 = true;
        if (arg0 <= 123) {
            this.method1710(39);
        }
        try {
            this.method1595();
        } catch (Exception var2) {
            this.method1599();
            this.field4224 = class232.method1544((byte) -66) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public void method1598(int arg0) throws Exception {
        field4204++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([II)V")
    private final void method1709(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class74.field1215) {
            var3 = arg1 << 1;
        }
        class235.method1554(arg0, 0, var3);
        this.field4231 -= arg1;
        if (this.field4206 != null && this.field4231 <= 0) {
            this.field4231 += class81.field1478 >> 4;
            class158.method1083((byte) 79, this.field4206);
            this.method1711(this.field4206.method268(), -89, this.field4206);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class40 var10 = null;
                        class40 var11 = this.field4227[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class249 var12 = var11.field597;
                                if (var12 == null || var12.field4085 <= var8) {
                                    var11.field596 = true;
                                    int var13 = var11.method256();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4085 += var13;
                                    }
                                    if (var4 >= this.field4210) {
                                        break label107;
                                    }
                                    class40 var14 = var11.method251();
                                    if (var14 != null) {
                                        int var15 = var11.field599;
                                        while (var14 != null) {
                                            this.method1711(var15 * var14.method268() >> 8, -101, var14);
                                            var14 = var11.method252();
                                        }
                                    }
                                    class40 var16 = var11.field598;
                                    var11.field598 = null;
                                    if (var10 == null) {
                                        this.field4227[var7] = var16;
                                    } else {
                                        var10.field598 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4237[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field598;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class40 var18 = this.field4227[var17];
                this.field4227[var17] = this.field4237[var17] = null;
                while (var18 != null) {
                    class40 var19 = var18.field598;
                    var18.field598 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4231 < 0) {
            this.field4231 = 0;
        }
        if (this.field4206 != null) {
            this.field4206.method257(arg0, 0, arg1);
        }
        this.field4220 = class232.method1544((byte) -113);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public final synchronized void method1710(int arg0) {
        if (class99.field1708 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class99.field1708.field1082[var3] == this) {
                    class99.field1708.field1082[var3] = null;
                }
                if (class99.field1708.field1082[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class99.field1708.field1081 = true;
                while (class99.field1708.field1073) {
                    class245.method1636(false, 50L);
                }
                class99.field1708 = null;
            }
        }
        field4211++;
        this.method1599();
        if (arg0 != 0) {
            this.method1715(98);
        }
        this.field4207 = null;
        this.field4221 = true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
    public void method1599() {
        field4225++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILok;)V")
    private final void method1711(int arg0, int arg1, class40 arg2) {
        field4229++;
        int var4 = arg0 >> 5;
        if (arg1 > -80) {
            this.field4240 = -83;
        }
        class40 var5 = this.field4237[var4];
        if (var5 == null) {
            this.field4227[var4] = arg2;
        } else {
            var5.field598 = arg2;
        }
        this.field4237[var4] = arg2;
        arg2.field599 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public final void method1712(byte arg0) {
        if (arg0 == 32) {
            field4209++;
            this.field4235 = true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V")
    public void method1594() throws Exception {
        field4215++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1597(Component arg0) throws Exception {
        field4230++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    private final void method1713(int arg0, int arg1) {
        field4218++;
        this.field4231 -= arg0;
        if (this.field4231 < 0) {
            this.field4231 = 0;
        }
        if (this.field4206 != null) {
            this.field4206.method253(arg0);
        }
        if (arg1 != 8) {
            method1707(-21);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "()V")
    public void method1595() throws Exception {
        field4236++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILok;)V")
    public final synchronized void method1714(int arg0, class40 arg1) {
        field4203++;
        if (arg0 != 50) {
            method1716(false);
        }
        this.field4206 = arg1;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public final synchronized void method1715(int arg0) {
        field4239++;
        if (this.field4221) {
            return;
        }
        long var2 = class232.method1544((byte) -124);
        try {
            if ((this.field4220 + 500000L) < var2) {
                this.field4220 = var2 - 500000L;
            }
            while (this.field4220 + 5000L < var2) {
                this.method1713(256, 8);
                this.field4220 += (long) (256000 / class81.field1478);
            }
        } catch (Exception var7) {
            this.field4220 = var2;
        }
        if (this.field4207 == null) {
            return;
        }
        try {
            if (arg0 == 0) {
                if (this.field4224 != 0L) {
                    if (this.field4224 > var2) {
                        return;
                    }
                    this.method1598(this.field4234);
                    this.field4224 = 0L;
                    this.field4235 = true;
                }
                int var4 = this.method1596();
                if ((this.field4228 - var4) > this.field4226) {
                    this.field4226 = this.field4228 - var4;
                }
                int var5 = this.field4238 + this.field4233;
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if (this.field4234 < var5 + 256) {
                    this.field4234 += 1024;
                    var4 = 0;
                    if (this.field4234 > 16384) {
                        this.field4234 = 16384;
                    }
                    this.method1599();
                    this.method1598(this.field4234);
                    if (this.field4234 < (var5 + 256)) {
                        var5 = this.field4234 - 256;
                        this.field4233 = var5 - this.field4238;
                    }
                    this.field4235 = true;
                }
                while (var4 < var5) {
                    var4 += 256;
                    this.method1709(this.field4207, 256);
                    this.method1594();
                }
                if (var2 > this.field4232) {
                    if (this.field4235) {
                        this.field4235 = false;
                    } else if (this.field4226 == 0 && this.field4240 == 0) {
                        this.method1599();
                        this.field4224 = var2 + 2000L;
                        return;
                    } else {
                        this.field4233 = Math.min(this.field4240, this.field4226);
                        this.field4240 = this.field4226;
                    }
                    this.field4232 = var2 + 2000L;
                    this.field4226 = 0;
                }
                this.field4228 = var4;
            }
        } catch (Exception var6) {
            this.method1599();
            this.field4224 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1716(boolean arg0) {
        field4213 = null;
        field4214 = null;
        if (arg0) {
            method1716(false);
        }
        field4208 = null;
        field4219 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1717(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4223++;
        int var8 = class160.method1090(arg1, (byte) 16, class89.field1582, class118.field2094);
        int var9 = class160.method1090(arg7, (byte) 16, class89.field1582, class118.field2094);
        if (!arg2) {
            field4208 = null;
        }
        int var10 = class160.method1090(arg0, (byte) 16, class118.field2098, class126.field2222);
        int var11 = class160.method1090(arg3, (byte) 16, class118.field2098, class126.field2222);
        int var12 = class160.method1090(arg1 + arg6, (byte) 16, class89.field1582, class118.field2094);
        int var13 = class160.method1090(arg7 - arg6, (byte) 16, class89.field1582, class118.field2094);
        for (int var14 = var8; var14 < var12; var14++) {
            class93.method598(-7, var11, var10, class167.field2735[var14], arg5);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class93.method598(-7, var11, var10, class167.field2735[var15], arg5);
        }
        int var16 = class160.method1090(arg0 + arg6, (byte) 16, class118.field2098, class126.field2222);
        int var17 = class160.method1090(arg3 - arg6, (byte) 16, class118.field2098, class126.field2222);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class167.field2735[var18];
            class93.method598(-7, var16, var10, var19, arg5);
            class93.method598(-7, var17, var16, var19, arg4);
            class93.method598(-7, var11, var17, var19, arg5);
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "()I")
    public int method1596() throws Exception {
        field4217++;
        return this.field4234;
    }
}
