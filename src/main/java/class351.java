import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class351 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    private int field4896 = 32;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Z")
    private boolean field4897 = false;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
    private long field4900 = class442.method2730(25207);

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    private int field4917 = 0;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "J")
    private long field4919 = 0L;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    private int field4916 = 0;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "[Lle;")
    private class64[] field4920 = new class64[8];

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    private int field4922 = 0;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    private int field4914 = 0;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Z")
    private boolean field4923 = true;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "J")
    private long field4924 = 0L;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[Lle;")
    private class64[] field4925 = new class64[8];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field4891 = 0;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[[[I")
    public static int[][][] field4903 = new int[2][][];

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field4913 = 0;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    private int field4915;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lle;")
    private class64 field4908;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
    public int[] field4904;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLle;I)V", line = 5)
    private final void method2147(byte arg0, class64 arg1, int arg2) {
        field4912++;
        int var4 = arg2 >> 5;
        class64 var5 = this.field4920[var4];
        if (var5 == null) {
            this.field4925[var4] = arg1;
        } else {
            var5.field669 = arg1;
        }
        if (arg0 == -6) {
            this.field4920[var4] = arg1;
            arg1.field666 = arg2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lle;I)V", line = 29)
    public final synchronized void method2148(class64 arg0, int arg1) {
        field4899++;
        if (arg1 != -28252) {
            field4903 = null;
        }
        this.field4908 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 40)
    public void method722(int arg0) throws Exception {
        field4910++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V", line = 48)
    private final void method2149(int arg0, byte arg1) {
        this.field4914 -= arg0;
        field4907++;
        if (this.field4914 < 0) {
            this.field4914 = 0;
        }
        if (this.field4908 != null) {
            this.field4908.method360(arg0);
        }
        if (arg1 <= 38) {
            this.field4917 = 60;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V", line = 69)
    public void method720() throws Exception {
        field4894++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 80)
    public final synchronized void method2150(byte arg0) {
        this.field4923 = true;
        field4898++;
        if (arg0 != -39) {
            method2152((byte) 100, 75);
        }
        try {
            this.method720();
        } catch (Exception var2) {
            this.method717();
            this.field4924 = class442.method2730(25207) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 99)
    public final synchronized void method2151(byte arg0) {
        if (class67.field696 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class67.field696.field3933[var3] == this) {
                    class67.field696.field3933[var3] = null;
                }
                if (class67.field696.field3933[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class67.field696.field3929 = true;
                while (class67.field696.field3927) {
                    class370.method2235(50L, 10);
                }
                class67.field696 = null;
            }
        }
        field4901++;
        this.method717();
        this.field4904 = null;
        this.field4897 = true;
        if (arg0 != -20) {
            this.field4922 = -8;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()V", line = 146)
    public void method717() {
        field4909++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V", line = 154)
    public static final void method2152(byte arg0, int arg1) {
        if (arg0 <= 15) {
            field4913 = -78;
        }
        class40.field414 = arg1;
        field4906++;
        class88.field995.method613(true);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 166)
    public final void method2153(int arg0) {
        this.field4923 = true;
        field4895++;
        if (arg0 >= -46) {
            this.method2151((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()I", line = 185)
    public int method719() throws Exception {
        field4905++;
        return this.field4918;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 209)
    public void method718(Component arg0) throws Exception {
        field4893++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 216)
    public static void method2154(boolean arg0) {
        if (!arg0) {
            field4903 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()V", line = 227)
    public void method721() throws Exception {
        field4902++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)V", line = 235)
    private final void method2155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class67.field689) {
            var3 = arg1 << 1;
        }
        class358.method2179(arg0, 0, var3);
        this.field4914 -= arg1;
        if (this.field4908 != null && this.field4914 <= 0) {
            this.field4914 += class432.field6338 >> 4;
            class281.method1658(-90, this.field4908);
            this.method2147((byte) -6, this.field4908, this.field4908.method362());
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
                        class64 var10 = null;
                        class64 var11 = this.field4925[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class43 var12 = var11.field667;
                                if (var12 == null || var12.field448 <= var8) {
                                    var11.field668 = true;
                                    int var13 = var11.method365();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field448 += var13;
                                    }
                                    if (var4 >= this.field4896) {
                                        break label107;
                                    }
                                    class64 var14 = var11.method363();
                                    if (var14 != null) {
                                        int var15 = var11.field666;
                                        while (var14 != null) {
                                            this.method2147((byte) -6, var14, var15 * var14.method362() >> 8);
                                            var14 = var11.method361();
                                        }
                                    }
                                    class64 var16 = var11.field669;
                                    var11.field669 = null;
                                    if (var10 == null) {
                                        this.field4925[var7] = var16;
                                    } else {
                                        var10.field669 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4920[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field669;
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
                class64 var18 = this.field4925[var17];
                this.field4925[var17] = this.field4920[var17] = null;
                while (var18 != null) {
                    class64 var19 = var18.field669;
                    var18.field669 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4914 < 0) {
            this.field4914 = 0;
        }
        if (this.field4908 != null) {
            this.field4908.method359(arg0, 0, arg1);
        }
        this.field4900 = class442.method2730(25207);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V", line = 397)
    public final synchronized void method2156(int arg0) {
        field4911++;
        if (this.field4897) {
            return;
        }
        long var2 = class442.method2730(25207);
        try {
            if (var2 > (this.field4900 + 500000L)) {
                this.field4900 = var2 - 500000L;
            }
            while ((this.field4900 + 5000L) < var2) {
                this.method2149(256, (byte) 127);
                this.field4900 += (long) (256000 / class432.field6338);
            }
        } catch (Exception var7) {
            this.field4900 = var2;
        }
        if (this.field4904 == null) {
            return;
        }
        try {
            if (this.field4924 != 0L) {
                if (var2 < this.field4924) {
                    return;
                }
                this.method722(this.field4918);
                this.field4924 = 0L;
                this.field4923 = true;
            }
            int var4 = this.method719();
            if (this.field4922 < this.field4917 - var4) {
                this.field4922 = this.field4917 - var4;
            }
            int var5 = this.field4921 + this.field4915;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field4918 < var5 + 256) {
                this.field4918 += 1024;
                if (this.field4918 > 16384) {
                    this.field4918 = 16384;
                }
                this.method717();
                this.method722(this.field4918);
                var4 = 0;
                if (this.field4918 < (var5 + 256)) {
                    var5 = this.field4918 - 256;
                    this.field4915 = var5 - this.field4921;
                }
                this.field4923 = true;
            }
            while (var5 > var4) {
                this.method2155(this.field4904, 256);
                var4 += 256;
                this.method721();
            }
            if (arg0 != 255) {
                this.field4915 = 91;
            }
            if (this.field4919 < var2) {
                if (this.field4923) {
                    this.field4923 = false;
                } else if (this.field4922 == 0 && this.field4916 == 0) {
                    this.method717();
                    this.field4924 = var2 + 2000L;
                    return;
                } else {
                    this.field4915 = Math.min(this.field4916, this.field4922);
                    this.field4916 = this.field4922;
                }
                this.field4919 = var2 + 2000L;
                this.field4922 = 0;
            }
            this.field4917 = var4;
        } catch (Exception var6) {
            this.method717();
            this.field4924 = var2 + 2000L;
        }
    }
}
