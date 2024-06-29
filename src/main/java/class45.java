import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class45 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Z")
    public boolean field564 = false;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Z")
    public static boolean field569 = true;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public static int[] field568 = new int[14];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public static int[] field565 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field572 = "Select";

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "[Lf;")
    public static class329[] field576;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lpj;", line = 7)
    public final class59 method292(int arg0, byte arg1) {
        field563++;
        class59 var3 = (class59) class183.field2734.method2180((long) (this.field573 | arg0 << 16), (byte) 31);
        if (var3 != null) {
            return var3;
        } else if (arg1 >= -127) {
            return (class59) null;
        } else {
            class311.field4729.method1431(this.field573, -20);
            class59 var4 = class11.method52(0, 0, class311.field4729, this.field573);
            if (var4 != null) {
                var4.method403(class197.field2959, class10.field103, class120.field1886);
                var4.field2361 = var4.field2350;
                var4.field2360 = var4.field2358;
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.method395();
                }
                class183.field2734.method2175((long) (this.field573 | arg0 << 16), var4, 78);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lre;IZ)V", line = 51)
    public final void method293(class263 arg0, int arg1, boolean arg2) {
        while (true) {
            int var4 = arg0.method1787(false);
            if (var4 == 0) {
                if (!arg2) {
                    return;
                }
                field566++;
                return;
            }
            this.method296(arg0, var4, -4, arg1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lgl;IBLre;)V", line = 77)
    public static final void method294(class262 arg0, int arg1, byte arg2, class263 arg3) {
        class3 var4 = new class3();
        field570++;
        var4.field11 = arg3.method1787(false);
        var4.field12 = arg3.method1826(-206227536);
        var4.field21 = new byte[var4.field11][][];
        var4.field10 = new int[var4.field11];
        if (arg2 != 113) {
            return;
        }
        var4.field6 = new class227[var4.field11];
        var4.field20 = new int[var4.field11];
        var4.field19 = new class227[var4.field11];
        var4.field7 = new int[var4.field11];
        for (int var5 = 0; var5 < var4.field11; var5++) {
            try {
                int var6 = arg3.method1787(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1801(-30054);
                    String var8 = arg3.method1801(-30054);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1826(-206227536);
                    }
                    var4.field10[var5] = var6;
                    var4.field7[var5] = var9;
                    var4.field6[var5] = arg0.method1781(class250.method1690(var7, (byte) -125), var8, (byte) -79);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1801(-30054);
                    String var11 = arg3.method1801(-30054);
                    int var12 = arg3.method1787(false);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1801(-30054);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1826(-206227536);
                            var15[var16] = new byte[var17];
                            arg3.method1812(0, 97, var17, var15[var16]);
                        }
                    }
                    var4.field10[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class250.method1690(var13[var19], (byte) -122);
                    }
                    var4.field19[var5] = arg0.method1766((byte) -126, var18, class250.method1690(var10, (byte) -123), var11);
                    var4.field21[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field20[var5] = -1;
            } catch (SecurityException var26) {
                var4.field20[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field20[var5] = -3;
            } catch (Exception var28) {
                var4.field20[var5] = -4;
            } catch (Throwable var29) {
                var4.field20[var5] = -5;
            }
        }
        class21.field251.method1108(var4, arg2 + 65167);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 205)
    public static void method295(byte arg0) {
        field576 = null;
        field568 = null;
        if (arg0 != 75) {
            method297((int[][]) ((int[][]) null), -95);
        }
        field572 = null;
        field565 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lre;III)V", line = 222)
    private final void method296(class263 arg0, int arg1, int arg2, int arg3) {
        field567++;
        if (arg2 != -4) {
            method294((class262) null, -52, (byte) 27, (class263) null);
        }
        if (arg1 == 1) {
            this.field573 = arg0.method1830((byte) -77);
        } else if (arg1 == 2) {
            this.field574 = arg0.method1824(false);
        } else if (arg1 == 3) {
            this.field564 = true;
        } else if (arg1 == 4) {
            this.field573 = -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([[II)V", line = 250)
    public static final void method297(int[][] arg0, int arg1) {
        class40.field488 = arg0;
        field571++;
        if (arg1 != 0) {
            field568 = (int[]) null;
        }
    }
}
