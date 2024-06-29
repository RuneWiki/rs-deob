import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 {

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private int field227 = 32;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private long field216 = class214.method1416(22624);

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    private int field241 = 0;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lf;")
    private class55[] field242 = new class55[8];

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    private int field248 = 0;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    private int field243 = 0;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "J")
    private long field249 = 0L;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "[Lf;")
    private class55[] field244 = new class55[8];

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "J")
    private long field246 = 0L;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
    private boolean field240 = true;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Ldc;")
    public static class37 field217 = class185.method1233((byte) 86, " weitere Optionen");

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Ldc;")
    public static class37 field230 = class185.method1233((byte) 86, "; Max)2Age=");

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Ldc;")
    public static class37 field225 = class185.method1233((byte) 86, "Hierhin gehen");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lf;")
    private class55 field219;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    public int[] field221;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final synchronized void method96(boolean arg0) {
        field228++;
        this.field240 = true;
        try {
            this.method107();
        } catch (Exception var2) {
            this.method108();
            this.field246 = class214.method1416(22624) + 2000L;
        }
        if (arg0) {
            method100(-69);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final synchronized void method97(int arg0) {
        field224++;
        if (class65.field1176 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class65.field1176.field1306[var3] == this) {
                    class65.field1176.field1306[var3] = null;
                }
                if (class65.field1176.field1306[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class65.field1176.field1305 = true;
                while (class65.field1176.field1311) {
                    class238.method1548((byte) -110, 50L);
                }
                class65.field1176 = null;
            }
        }
        this.method108();
        if (arg0 != 0) {
            this.method96(false);
        }
        this.field221 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILf;)V")
    private final void method98(byte arg0, int arg1, class55 arg2) {
        field236++;
        int var4 = arg1 >> 5;
        class55 var5 = this.field242[var4];
        if (var5 == null) {
            this.field244[var4] = arg2;
        } else {
            var5.field1071 = arg2;
        }
        this.field242[var4] = arg2;
        if (arg0 == -41) {
            arg2.field1069 = arg1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    private final void method99(byte arg0, int arg1) {
        this.field245 -= arg1;
        field237++;
        if (this.field245 < 0) {
            this.field245 = 0;
        }
        if (this.field219 != null) {
            this.field219.method442(arg1);
        }
        if (arg0 >= -126) {
            this.field216 = 37L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method100(int arg0) {
        field230 = null;
        field233 = null;
        field225 = null;
        if (arg0 == -15675) {
            field217 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public static final void method101(int arg0, int arg1) {
        field218++;
        if (!class39.method352(-10924, arg1) || arg0 != 15532) {
            return;
        }
        class136[] var2 = class177.field3344[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class136 var4 = var2[var3];
            if (var4 != null) {
                var4.field2530 = 0;
                var4.field2610 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final void method102(int arg0) {
        this.field240 = true;
        if (arg0 == 256) {
            field229++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lf;I)V")
    public final synchronized void method103(class55 arg0, int arg1) {
        this.field219 = arg0;
        field234++;
        if (arg1 != -15878) {
            field217 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    public void method104() throws Exception {
        field235++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public int method105() throws Exception {
        field215++;
        return this.field239;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method106(Component arg0) throws Exception {
        field231++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public void method107() throws Exception {
        field232++;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
    public void method108() {
        field226++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public static final void method109(boolean arg0) {
        field223++;
        class26 var1 = class32.field657;
        synchronized (class32.field657) {
            class94.field1643++;
            class20.field334 = class43.field922;
            class80.field1416 = class227.field4185;
            if (!arg0) {
                method101(46, -81);
            }
            class235.field4271 = class222.field4119;
            class97.field1698 = class127.field2347;
            class205.field3805 = class174.field3321;
            class200.field3745 = class151.field2869;
            class139.field2702 = class242.field4450;
            class127.field2347 = 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final synchronized void method110(byte arg0) {
        field222++;
        if (this.field221 == null) {
            return;
        }
        long var2 = class214.method1416(22624);
        try {
            if (this.field246 != 0L) {
                if (this.field246 > var2) {
                    return;
                }
                this.method111(this.field239);
                this.field246 = 0L;
                this.field240 = true;
            }
            int var4 = this.method105();
            int var5 = this.field247 + this.field238;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field243 - var4 > this.field241) {
                this.field241 = this.field243 - var4;
            }
            if (var5 + 256 > this.field239) {
                this.field239 += 1024;
                var4 = 0;
                if (this.field239 > 16384) {
                    this.field239 = 16384;
                }
                this.method108();
                this.method111(this.field239);
                this.field240 = true;
                if (this.field239 < var5 + 256) {
                    var5 = this.field239 - 256;
                    this.field238 = var5 - this.field247;
                }
            }
            while (var5 > var4) {
                this.method112(this.field221, 256);
                this.method104();
                var4 += 256;
            }
            if (this.field249 < var2) {
                if (this.field240) {
                    this.field240 = false;
                } else if (this.field241 == 0 && this.field248 == 0) {
                    this.method108();
                    this.field246 = var2 + 2000L;
                    return;
                } else {
                    this.field238 = Math.min(this.field248, this.field241);
                    this.field248 = this.field241;
                }
                this.field249 = var2 + 2000L;
                this.field241 = 0;
            }
            if (arg0 != -39) {
                this.field248 = -2;
            }
            this.field243 = var4;
        } catch (Exception var7) {
            this.method108();
            this.field246 = var2 + 2000L;
        }
        try {
            if (var2 > this.field216 + 500000L) {
                var2 = this.field216;
            }
            while (var2 > this.field216 + 5000L) {
                this.method99((byte) -127, 256);
                this.field216 += 256000 / class72.field1278;
            }
        } catch (Exception var6) {
            this.field216 = var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public void method111(int arg0) throws Exception {
        field220++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([II)V")
    private final void method112(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class32.field650) {
            var3 = arg1 << 1;
        }
        class4.method33(arg0, 0, var3);
        this.field245 -= arg1;
        if (this.field219 != null && this.field245 <= 0) {
            this.field245 += class72.field1278 >> 4;
            client.method284(this.field219, true);
            this.method98((byte) -41, this.field219.method440(), this.field219);
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
                        class55 var10 = null;
                        class55 var11 = this.field244[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class47 var12 = var11.field1072;
                                if (var12 == null || var12.field954 <= var8) {
                                    var11.field1070 = true;
                                    int var13 = var11.method436();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field954 += var13;
                                    }
                                    if (var4 >= this.field227) {
                                        break label107;
                                    }
                                    class55 var14 = var11.method438();
                                    if (var14 != null) {
                                        int var15 = var11.field1069;
                                        while (var14 != null) {
                                            this.method98((byte) -41, var15 * var14.method440() >> 8, var14);
                                            var14 = var11.method437();
                                        }
                                    }
                                    class55 var16 = var11.field1071;
                                    var11.field1071 = null;
                                    if (var10 == null) {
                                        this.field244[var7] = var16;
                                    } else {
                                        var10.field1071 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field242[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1071;
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
                class55 var18 = this.field244[var17];
                this.field244[var17] = this.field242[var17] = null;
                while (var18 != null) {
                    class55 var19 = var18.field1071;
                    var18.field1071 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field245 < 0) {
            this.field245 = 0;
        }
        if (this.field219 != null) {
            this.field219.method441(arg0, 0, arg1);
        }
        this.field216 = class214.method1416(22624);
    }
}
