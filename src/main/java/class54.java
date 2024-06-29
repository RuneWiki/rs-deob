import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 extends class106 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "[J")
    private long[] field1414 = new long[10];

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lwb;")
    public static class130 field1404 = class26.method212("Welt", -32376);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lge;")
    public static class41 field1401 = new class41(64);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Lge;")
    public static class41 field1417 = new class41(64);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "J")
    private long field1412;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILfe;Lsb;)V", line = 3)
    public static final void method460(int arg0, int arg1, class36 arg2, class110 arg3) {
        field1405++;
        class45 var4 = new class45();
        var4.field1205 = arg2.method365((byte) -124);
        var4.field1203 = arg2.method361((byte) 65);
        var4.field1212 = new int[var4.field1205];
        var4.field1226 = new int[var4.field1205];
        var4.field1206 = new byte[var4.field1205][][];
        var4.field1213 = new int[var4.field1205];
        var4.field1216 = new class39[var4.field1205];
        var4.field1232 = new class39[var4.field1205];
        for (int var5 = 0; var5 < var4.field1205; var5++) {
            try {
                int var6 = arg2.method365((byte) -126);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method355((byte) 64).method963((byte) 21));
                    String var18 = new String(arg2.method355((byte) 104).method963((byte) 21));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method361((byte) 62);
                    }
                    var4.field1213[var5] = var6;
                    var4.field1212[var5] = var19;
                    var4.field1232[var5] = arg3.method848(var18, 0, class106.method805(16519, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method355((byte) 78).method963((byte) 21));
                    String var8 = new String(arg2.method355((byte) 78).method963((byte) 21));
                    int var9 = arg2.method365((byte) -124);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method355((byte) 100).method963((byte) 21));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method361((byte) 68);
                            var12[var13] = new byte[var14];
                            arg2.method328(var14, var12[var13], 0, (byte) -127);
                        }
                    }
                    var4.field1213[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class106.method805(16519, var10[var16]);
                    }
                    var4.field1216[var5] = arg3.method845(class106.method805(16519, var7), true, var8, var15);
                    var4.field1206[var5] = var12;
                }
            } catch (ClassNotFoundException var21) {
                var4.field1226[var5] = -1;
            } catch (SecurityException var22) {
                var4.field1226[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field1226[var5] = -3;
            } catch (Exception var24) {
                var4.field1226[var5] = -4;
            } catch (Throwable var25) {
                var4.field1226[var5] = -5;
            }
        }
        int var20 = 7 / ((-arg0 - 48) / 61);
        class90.field2187.method819(var4, -116);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 114)
    public final void method84(int arg0) {
        field1408++;
        if (arg0 != -1450) {
            this.field1412 = -49L;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1414[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 135)
    public final void method83(byte arg0) {
        this.field1402 = 0;
        this.field1413 = 1;
        this.field1411 = 256;
        this.field1412 = class90.method668(false);
        int var2 = -101 % ((23 - arg0) / 39);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field1414[var3] = this.field1412;
        }
        field1400++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V", line = 157)
    public static final void method461(int arg0, int arg1) {
        if (arg1 != -17895) {
            field1404 = null;
        }
        class130.method955(arg0, 0, 0, null, false);
        field1407++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIILsa;II)V", line = 168)
    public static final void method462(int arg0, int arg1, int arg2, class109 arg3, int arg4, int arg5) {
        field1406++;
        class23 var6 = new class23();
        var6.field668 = arg3.field2673;
        var6.field647 = arg5;
        if (arg1 != -16395) {
            field1401 = null;
        }
        var6.field656 = arg2 * 128;
        var6.field666 = arg3.field2648 * 128;
        var6.field658 = arg3.field2691;
        var6.field654 = arg3.field2638;
        var6.field659 = arg3.field2680;
        var6.field651 = arg0 * 128;
        int var7 = arg3.field2647;
        int var8 = arg3.field2664;
        if (arg4 == 1 || arg4 == 3) {
            var8 = arg3.field2647;
            var7 = arg3.field2664;
        }
        var6.field649 = (arg0 + var7) * 128;
        var6.field665 = (arg2 + var8) * 128;
        if (arg3.field2629 != null) {
            var6.field657 = arg3;
            var6.method202(-87);
        }
        class23.field653.method819(var6, arg1 + 16325);
        if (var6.field654 != null) {
            var6.field646 = var6.field668 + (int) ((double) (var6.field658 - var6.field668) * Math.random());
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)I", line = 219)
    public final int method82(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1411;
        field1415++;
        int var5 = this.field1413;
        this.field1411 = 300;
        this.field1413 = 1;
        if (!arg0) {
            return 24;
        }
        this.field1412 = class90.method668(!arg0);
        if (this.field1414[this.field1409] == 0L) {
            this.field1411 = var4;
            this.field1413 = var5;
        } else if (this.field1412 > this.field1414[this.field1409]) {
            this.field1411 = (int) ((long) (arg1 * 2560) / (this.field1412 - this.field1414[this.field1409]));
        }
        if (this.field1411 < 25) {
            this.field1411 = 25;
        }
        if (this.field1411 > 256) {
            this.field1411 = 256;
            this.field1413 = (int) ((long) arg1 - (this.field1412 - this.field1414[this.field1409]) / 10L);
        }
        if (arg1 < this.field1413) {
            this.field1413 = arg1;
        }
        this.field1414[this.field1409] = this.field1412;
        this.field1409 = (this.field1409 + 1) % 10;
        if (this.field1413 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1414[var6] != 0L) {
                    this.field1414[var6] += this.field1413;
                }
            }
        }
        if (arg2 > this.field1413) {
            this.field1413 = arg2;
        }
        int var7 = 0;
        class37.method375(-1, (long) this.field1413);
        while (this.field1402 < 256) {
            this.field1402 += this.field1411;
            var7++;
        }
        this.field1402 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V", line = 294)
    public static void method463(boolean arg0) {
        field1417 = null;
        field1404 = null;
        field1401 = null;
        if (!arg0) {
            method461(-122, -81);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Z", line = 320)
    public static final boolean method464(int arg0) {
        if (arg0 <= 44) {
            return false;
        } else {
            field1416++;
            return class93.field2250 != null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 349)
    public class54() {
        this.method83((byte) 66);
    }
}
