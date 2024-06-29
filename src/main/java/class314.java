import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class314 {

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field4873 = 65000;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lad;")
    private class326 field4879 = null;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lad;")
    private class326 field4874 = null;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4868 = "white:";

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[Lwj;")
    public static class270[] field4876;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method2127(boolean arg0) {
        if (!arg0) {
            class73.field1193.method2174(-10385);
            field4880++;
            class152.field2284.method2174(-10385);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 27)
    public static void method2128(byte arg0) {
        if (arg0 <= 61) {
            method2134((int[]) null, 44, -35, -128, -63, -102);
        }
        field4868 = null;
        field4876 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2129(int arg0) {
        if (arg0 > -105) {
            method2134((int[]) null, -6, -33, -72, -37, -39);
        }
        class240.field3839.method2174(-10385);
        field4872++;
    }

    @OriginalMember(owner = "client!hf", name = "toString", descriptor = "()Ljava/lang/String;", line = 53)
    public final String toString() {
        field4871++;
        return "Cache:" + this.field4870;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BII)Z", line = 62)
    public final boolean method2130(int arg0, byte[] arg1, int arg2, int arg3) {
        field4878++;
        class326 var5 = this.field4879;
        synchronized (this.field4879) {
            if (arg2 < 0 || arg2 > this.field4873) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2133(arg1, (byte) -118, arg0, arg2, true);
            if (arg3 <= 39) {
                method2129(-82);
            }
            if (!var6) {
                var6 = this.method2133(arg1, (byte) -128, arg0, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILad;Lad;I)V", line = 326)
    public class314(int arg0, class326 arg1, class326 arg2, int arg3) {
        this.field4870 = arg0;
        this.field4879 = arg1;
        this.field4873 = arg3;
        this.field4874 = arg2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)[B", line = 95)
    public final byte[] method2131(boolean arg0, int arg1) {
        field4875++;
        class326 var3 = this.field4879;
        synchronized (this.field4879) {
            try {
                Object var10000;
                if (this.field4874.method2210(-1) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4874.method2212((byte) -50, (long) (arg1 * 6));
                this.field4874.method2215(class185.field2773, 6, 0, -1);
                int var4 = ((class185.field2773[4] & 0xFF) << 8) + ((class185.field2773[3] & 0xFF) << 16) + (class185.field2773[5] & 0xFF);
                int var5 = ((class185.field2773[0] & 0xFF) << 16) + (((class185.field2773[1] & 0xFF) << 8) + (class185.field2773[2] & 0xFF));
                if (var5 < 0 || this.field4873 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || this.field4879.method2210(-1) / 520L < (long) var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    if (arg0) {
                        method2134((int[]) null, 6, 86, 108, 14, -5);
                    }
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4879.method2212((byte) -87, (long) (var4 * 520));
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4879.method2215(class185.field2773, var9 + 8, 0, -1);
                        int var10 = (class185.field2773[6] & 0xFF) + ((class185.field2773[4] & 0xFF) << 16) + (class185.field2773[5] & 0xFF << 8);
                        int var11 = class185.field2773[7] & 0xFF;
                        int var12 = ((class185.field2773[2] & 0xFF) << 8) + (class185.field2773[3] & 0xFF);
                        int var13 = (class185.field2773[0] & 0xFF << 8) + (class185.field2773[1] & 0xFF);
                        if (arg1 != var13 || var8 != var12 || this.field4870 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var10 < 0 || this.field4879.method2210(-1) / 520L < (long) var10) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class185.field2773[var14 + 8];
                        }
                        var8++;
                        var4 = var10;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 186)
    public static final void method2132(byte arg0) {
        field4869++;
        if (class315.field4917 != null) {
            class315.field4917.method219(77);
        }
        if (class17.field243 != null) {
            class17.field243.method219(-121);
        }
        class278.method1910(22050, class188.field2815, -28160, 2);
        class315.field4917 = class251.method1740(22050, class238.field3782, 29, class32.field471, 0);
        class315.field4917.method221(101, class272.field4224);
        if (arg0 > 18) {
            class17.field243 = class251.method1740(2048, class238.field3782, -119, class32.field471, 1);
            class17.field243.method221(94, class98.field1560);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BBIIZ)Z", line = 209)
    private final boolean method2133(byte[] arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field4877++;
        class326 var6 = this.field4879;
        synchronized (this.field4879) {
            try {
                int var7 = 99 / ((arg1 + 69) / 44);
                int var8;
                boolean var10000;
                if (arg4) {
                    if (this.field4874.method2210(-1) < ((long) (arg2 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4874.method2212((byte) -102, (long) (arg2 * 6));
                    this.field4874.method2215(class185.field2773, 6, 0, -1);
                    var8 = ((class185.field2773[3] & 0xFF) << 16) + ((class185.field2773[4] & 0xFF) << 8) + (class185.field2773[5] & 0xFF);
                    if (var8 <= 0 || (this.field4879.method2210(-1) / 520L) < ((long) var8)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var8 = (int) ((this.field4879.method2210(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class185.field2773[5] = (byte) var8;
                class185.field2773[3] = (byte) (var8 >> 16);
                int var9 = 0;
                class185.field2773[2] = (byte) arg3;
                class185.field2773[4] = (byte) (var8 >> 8);
                class185.field2773[0] = (byte) (arg3 >> 16);
                class185.field2773[1] = (byte) (arg3 >> 8);
                this.field4874.method2212((byte) -81, (long) (arg2 * 6));
                int var10 = 0;
                this.field4874.method2209(-112, 0, 6, class185.field2773);
                while (true) {
                    if (arg3 > var9) {
                        label136: {
                            int var11 = 0;
                            if (arg4) {
                                this.field4879.method2212((byte) -39, (long) (var8 * 520));
                                try {
                                    this.field4879.method2215(class185.field2773, 8, 0, -1);
                                } catch (EOFException var19) {
                                    break label136;
                                }
                                var11 = (class185.field2773[6] & 0xFF) + ((class185.field2773[4] & 0xFF << 16) + (class185.field2773[5] & 0xFF << 8));
                                int var13 = (class185.field2773[2] & 0xFF << 8) + (class185.field2773[3] & 0xFF);
                                int var14 = class185.field2773[7] & 0xFF;
                                int var15 = ((class185.field2773[0] & 0xFF) << 8) + (class185.field2773[1] & 0xFF);
                                if (arg2 != var15 || var10 != var13 || this.field4870 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var11 < 0 || this.field4879.method2210(-1) / 520L < (long) var11) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var11 == 0) {
                                var11 = (int) ((this.field4879.method2210(-1) + 519L) / 520L);
                                arg4 = false;
                                if (var11 == 0) {
                                    var11++;
                                }
                                if (var8 == var11) {
                                    var11++;
                                }
                            }
                            class185.field2773[0] = (byte) (arg2 >> 8);
                            if ((arg3 - var9) <= 512) {
                                var11 = 0;
                            }
                            class185.field2773[2] = (byte) (var10 >> 8);
                            class185.field2773[3] = (byte) var10;
                            class185.field2773[4] = (byte) (var11 >> 16);
                            class185.field2773[5] = (byte) (var11 >> 8);
                            var10++;
                            class185.field2773[7] = (byte) this.field4870;
                            int var16 = arg3 - var9;
                            class185.field2773[1] = (byte) arg2;
                            class185.field2773[6] = (byte) var11;
                            if (var16 > 512) {
                                var16 = 512;
                            }
                            this.field4879.method2212((byte) -113, (long) (var8 * 520));
                            var8 = var11;
                            this.field4879.method2209(-59, 0, 8, class185.field2773);
                            this.field4879.method2209(91, var9, var16, arg0);
                            var9 += var16;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIII)V", line = 340)
    public static final void method2134(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class142 var6 = class256.field4013[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class325 var7 = var6.field2211;
        if (var7 != null) {
            int var8 = var7.field5052;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class157 var10 = var6.field2200;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2362;
        int var12 = var10.field2364;
        int var13 = var10.field2363;
        int var14 = var10.field2356;
        int[] var15 = class275.field4248[var11];
        int[] var16 = class191.field2862[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
