import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class733 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ltja;")
    private class288 field10245 = new class288(128);

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Ltja;")
    public class288 field10256 = new class288(64);

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lbt;")
    public class48 field10246;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lbt;")
    private class48 field10243;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lhj;")
    public static class596 field10255 = new class596(8, 5);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[[I")
    public static int[][] field10258 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "[F")
    public static float[] field10260 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lbt;")
    public static class48 field10257;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Ljava/awt/Image;")
    public static Image field10259;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field10244;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 5)
    public static final void method4133(int arg0) {
        field10252++;
        class591.method3388(0, (long) class228.field2707, class363.field4526);
        if (class131.field1615 != -1) {
            class250.method1496(class131.field1615, -1394622263);
        }
        for (int var1 = 0; var1 < class104.field1332; var1++) {
            if (class255.field2977[var1]) {
                class417.field5443[var1] = true;
            }
            class704.field9908[var1] = class255.field2977[var1];
            class255.field2977[var1] = false;
        }
        class287.field3446 = class228.field2707;
        if (class131.field1615 != -1) {
            class104.field1332 = 0;
            class455.method2754((byte) -89);
        }
        class363.field4526.method634();
        class95.method830(arg0 - 2078, class363.field4526);
        int var2 = class619.method3510(-126);
        if (var2 == -1) {
            var2 = class680.field9309;
        }
        if (arg0 != 1984) {
            return;
        }
        if (var2 == -1) {
            var2 = class481.field6720;
        }
        class612.method3467(var2, (byte) 24);
        class190.field2279 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V", line = 53)
    public final void method4134(int arg0, boolean arg1) {
        field10250++;
        class288 var3 = this.field10245;
        synchronized (this.field10245) {
            this.field10245.method1694(arg0, -34);
        }
        class288 var4 = this.field10256;
        synchronized (this.field10256) {
            if (arg1) {
                field10257 = null;
            }
            this.field10256.method1694(arg0, -31);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 69)
    public static void method4135(int arg0) {
        field10260 = null;
        field10244 = null;
        field10258 = null;
        field10255 = null;
        field10257 = null;
        if (arg0 != 8) {
            field10258 = null;
        }
        field10259 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lha;I)V", line = 87)
    public static final void method4136(class66 arg0, int arg1) {
        for (class766 var2 = (class766) class148.field1836.method2447(-123); var2 != null; var2 = (class766) class148.field1836.method2439(-118)) {
            if (var2.field10556) {
                var2.method4252(arg0);
            }
        }
        if (arg1 > 47) {
            field10248++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 113)
    public final void method4137(byte arg0) {
        class288 var2 = this.field10245;
        synchronized (this.field10245) {
            if (arg0 != -31) {
                method4141(null, 56, -5, 32);
            }
            this.field10245.method1690(0);
        }
        field10251++;
        class288 var3 = this.field10256;
        synchronized (this.field10256) {
            this.field10256.method1690(0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 132)
    public final void method4138(int arg0) {
        class288 var2 = this.field10245;
        synchronized (this.field10245) {
            this.field10245.method1687((byte) 61);
        }
        field10254++;
        class288 var3 = this.field10256;
        synchronized (this.field10256) {
            if (arg0 == 5017) {
                this.field10256.method1687((byte) 61);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIB)V", line = 150)
    public final void method4139(int arg0, int arg1, byte arg2) {
        if (arg2 == 86) {
            this.field10245 = new class288(arg0);
            field10247++;
            this.field10256 = new class288(arg1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Loaa;", line = 162)
    public final class305 method4140(int arg0, int arg1) {
        field10242++;
        class288 var3 = this.field10245;
        class305 var4;
        synchronized (this.field10245) {
            var4 = (class305) this.field10245.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field10243;
        byte[] var6;
        synchronized (this.field10243) {
            var6 = this.field10243.method437(arg0, (byte) 82, arg1);
        }
        class305 var7 = new class305();
        var7.field3640 = this;
        var7.field3646 = arg1;
        if (var6 != null) {
            var7.method1765(11509, new class403(var6));
        }
        var7.method1773(68);
        class288 var8 = this.field10245;
        synchronized (this.field10245) {
            this.field10245.method1686(arg0 - 25674, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 194)
    public static final String method4141(byte[] arg0, int arg1, int arg2, int arg3) {
        field10249++;
        int var4 = -42 / ((-arg1 - 57) / 43);
        char[] var5 = new char[arg3];
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg2 + arg3;
        while (var7 < var8) {
            int var9 = arg0[var7++] & 0xFF;
            int var10;
            if (var9 >= 128) {
                if (var9 < 192) {
                    var10 = 65533;
                } else if (var9 >= 224) {
                    if (var9 < 240) {
                        if (var7 + 1 < var8 && (arg0[var7] & 0xC0) == 128 && (arg0[var7 + 1] & 0xC0) == 128) {
                            var10 = var9 & 0xF << 12 | arg0[var7++] << 6 & 0xFC0 | arg0[var7++] & 0x3F;
                            if (var10 < 2048) {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (var9 >= 248) {
                        var10 = 65533;
                    } else if ((var7 + 2) < var8 && (arg0[var7] & 0xC0) == 128 && (arg0[var7 + 1] & 0xC0) == 128 && (arg0[var7 + 2] & 0xC0) == 128) {
                        int var11 = var9 & 0x7 << 18 | arg0[var7++] << 12 & 0x3F000 | (arg0[var7++] & 0x3F) << 6 | arg0[var7++] & 0x3F;
                        if (var11 >= 65536 && var11 <= 1114111) {
                            var10 = 65533;
                        } else {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var7 < var8 && (arg0[var7] & 0xC0) == 128) {
                    var10 = arg0[var7++] & 0x3F | var9 & 0x1F << 6;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 == 0) {
                var10 = 65533;
            } else {
                var10 = var9;
            }
            var5[var6++] = (char) var10;
        }
        return new String(var5, 0, var6);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V", line = 283)
    public static final void method4142(int arg0, int arg1) {
        class580.field7912 = arg0;
        field10253++;
        class683.field9348 = arg1;
        class461.field6482 = -1;
        class448.method2641(arg1);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V", line = 302)
    public class733(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field10246 = arg3;
        this.field10243 = arg2;
        this.field10243.method431(4, 36);
    }
}
