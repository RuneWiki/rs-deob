import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class51 {

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    private int field928 = 32;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "J")
    private long field918 = class27.method198((byte) -118);

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    private int field940 = 0;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "J")
    private long field943 = 0L;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field942 = 0;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
    private boolean field948 = true;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "[Lii;")
    private class202[] field947 = new class202[8];

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "[Lii;")
    private class202[] field950 = new class202[8];

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "J")
    private long field949 = 0L;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    private int field944 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Le;")
    public static class191 field911 = class54.method368("<img=0>", 2047);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Le;")
    public static class191 field910 = class54.method368("details", 2047);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[Lsg;")
    public static class141[] field914 = new class141[50];

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Le;")
    public static class191 field924 = class54.method368("0", 2047);

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lng;")
    public static class121 field933;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lng;")
    public static class121 field935;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lbg;")
    public static class168 field923;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lii;")
    private class202 field915;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lqk;")
    public static class6 field926;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field909;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "[I")
    public int[] field937;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method337(byte arg0) {
        this.field948 = true;
        field917++;
        if (arg0 != -107) {
            this.field943 = 16L;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()I")
    public int method338() throws Exception {
        field913++;
        return this.field939;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method339(Component arg0) throws Exception {
        field922++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLii;)V")
    public final synchronized void method340(boolean arg0, class202 arg1) {
        if (!arg0) {
            this.method340(false, (class202) null);
        }
        field934++;
        this.field915 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    private final void method341(int arg0, int arg1) {
        if (arg1 != -11849) {
            this.method349((int[]) null, 112);
        }
        this.field942 -= arg0;
        if (this.field942 < 0) {
            this.field942 = 0;
        }
        if (this.field915 != null) {
            this.field915.method510(arg0);
        }
        field912++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public void method342(int arg0) throws Exception {
        field925++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
    public void method343() {
        field938++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
    public void method344() throws Exception {
        field920++;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
    public void method345() throws Exception {
        field921++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILii;)V")
    private final void method346(int arg0, int arg1, class202 arg2) {
        int var4 = 53 / ((arg1 - 14) / 46);
        int var5 = arg0 >> 5;
        class202 var6 = this.field950[var5];
        field936++;
        if (var6 == null) {
            this.field947[var5] = arg2;
        } else {
            var6.field3613 = arg2;
        }
        this.field950[var5] = arg2;
        arg2.field3612 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public final synchronized void method347(int arg0) {
        field931++;
        if (class32.field458 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class32.field458.field110[var3] == this) {
                    class32.field458.field110[var3] = null;
                }
                if (class32.field458.field110[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class32.field458.field106 = true;
                while (class32.field458.field109) {
                    class18.method142(true, 50L);
                }
                class32.field458 = null;
            }
        }
        this.method343();
        this.field937 = null;
        if (arg0 >= -73) {
            field911 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)V")
    public static final void method348(int arg0, int arg1, boolean arg2) {
        field927++;
        if (!arg2) {
            field911 = null;
        }
        class241 var3 = class14.method97(5, arg1, -107);
        var3.method1694((byte) -90);
        var3.field4301 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([II)V")
    private final void method349(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class85.field1399) {
            var3 = arg1 << 1;
        }
        class58.method391(arg0, 0, var3);
        this.field942 -= arg1;
        if (this.field915 != null && this.field942 <= 0) {
            this.field942 += class75.field1284 >> 4;
            class110.method704(this.field915, 0);
            this.method346(this.field915.method757(), 90, this.field915);
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
                        class202 var10 = null;
                        class202 var11 = this.field947[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class238 var12 = var11.field3615;
                                if (var12 == null || var12.field4219 <= var8) {
                                    var11.field3614 = true;
                                    int var13 = var11.method501();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4219 += var13;
                                    }
                                    if (var4 >= this.field928) {
                                        break label107;
                                    }
                                    class202 var14 = var11.method508();
                                    if (var14 != null) {
                                        int var15 = var11.field3612;
                                        while (var14 != null) {
                                            this.method346(var15 * var14.method757() >> 8, -61, var14);
                                            var14 = var11.method511();
                                        }
                                    }
                                    class202 var16 = var11.field3613;
                                    var11.field3613 = null;
                                    if (var10 == null) {
                                        this.field947[var7] = var16;
                                    } else {
                                        var10.field3613 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field950[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3613;
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
                class202 var18 = this.field947[var17];
                this.field947[var17] = this.field950[var17] = null;
                while (var18 != null) {
                    class202 var19 = var18.field3613;
                    var18.field3613 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field942 < 0) {
            this.field942 = 0;
        }
        if (this.field915 != null) {
            this.field915.method503(arg0, 0, arg1);
        }
        this.field918 = class27.method198((byte) -123);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public final synchronized void method350(boolean arg0) {
        field916++;
        this.field948 = arg0;
        try {
            this.method345();
        } catch (Exception var2) {
            this.method343();
            this.field943 = class27.method198((byte) -125) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public final synchronized void method351(boolean arg0) {
        field919++;
        if (this.field937 == null) {
            return;
        }
        long var2 = class27.method198((byte) -114);
        try {
            if (this.field943 != 0L) {
                if (var2 < this.field943) {
                    return;
                }
                this.method342(this.field939);
                this.field943 = 0L;
                this.field948 = true;
            }
            int var4 = this.method338();
            if ((this.field946 - var4) > this.field944) {
                this.field944 = this.field946 - var4;
            }
            int var5 = this.field945 + this.field941;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field939) {
                var4 = 0;
                this.field939 += 1024;
                if (this.field939 > 16384) {
                    this.field939 = 16384;
                }
                this.method343();
                this.method342(this.field939);
                this.field948 = true;
                if ((var5 + 256) > this.field939) {
                    var5 = this.field939 - 256;
                    this.field941 = var5 - this.field945;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method349(this.field937, 256);
                this.method344();
            }
            if (this.field949 < var2) {
                if (this.field948) {
                    this.field948 = false;
                } else if (this.field944 == 0 && this.field940 == 0) {
                    this.method343();
                    this.field943 = var2 + 2000L;
                    return;
                } else {
                    this.field941 = Math.min(this.field940, this.field944);
                    this.field940 = this.field944;
                }
                this.field949 = var2 + 2000L;
                this.field944 = 0;
            }
            this.field946 = var4;
        } catch (Exception var7) {
            this.method343();
            this.field943 = var2 + 2000L;
        }
        try {
            if (arg0) {
                field911 = null;
            }
            if (var2 > (this.field918 + 500000L)) {
                var2 = this.field918;
            }
            while (this.field918 + 5000L < var2) {
                this.method341(256, -11849);
                this.field918 += (long) (256000 / class75.field1284);
            }
        } catch (Exception var6) {
            this.field918 = var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public static void method352(int arg0) {
        field909 = null;
        field924 = null;
        field914 = null;
        field933 = null;
        field935 = null;
        field911 = null;
        field910 = null;
        int var1 = 74 / ((46 - arg0) / 44);
        field923 = null;
        field926 = null;
    }
}
