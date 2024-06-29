import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
    public static boolean field2316 = false;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lwb;")
    private static class130 field2322 = class26.method212("Accept challenge", -32376);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lwb;")
    private static class130 field2324 = class26.method212("(U5", -32376);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2317 = 1;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lwb;")
    public static class130 field2319 = field2322;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lwb;")
    public static class130 field2325 = class26.method212("Weiter", -32376);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2314 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2332 = 0;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lwb;")
    public static class130 field2335 = class26.method212("backright2", -32376);

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[B")
    public static byte[] field2334 = new byte[520];

    @OriginalMember(owner = "client!q", name = "x", descriptor = "[I")
    public static int[] field2336 = new int[25];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "J")
    public long field2329;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lda;")
    public static class20 field2333;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lq;")
    public class96 field2315;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lq;")
    public class96 field2327;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 20)
    public final void method714(byte arg0) {
        field2330++;
        int var2 = -96 % ((-arg0 - 24) / 57);
        if (this.field2315 != null) {
            this.field2315.field2327 = this.field2327;
            this.field2327.field2315 = this.field2315;
            this.field2315 = null;
            this.field2327 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Z", line = 40)
    public final boolean method715(byte arg0) {
        if (arg0 <= 84) {
            return false;
        } else {
            field2313++;
            return this.field2315 != null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 55)
    public static void method716(boolean arg0) {
        field2314 = null;
        field2333 = null;
        field2334 = null;
        field2319 = null;
        field2325 = null;
        field2322 = null;
        field2335 = null;
        if (arg0) {
            field2324 = null;
            field2336 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lec;", line = 73)
    public static final class28 method717(int arg0) {
        class28 var1 = new class28();
        field2320++;
        var1.field795 = class97.field2352;
        var1.field792 = class106.field2580;
        var1.field794 = class31.field876[0];
        var1.field793 = client.field548[0];
        var1.field797 = class115.field2839[0];
        var1.field791 = class26.field758[0];
        byte[] var2 = class119.field2920[0];
        int var3 = var1.field797 * var1.field791;
        var1.field796 = new int[var3];
        if (arg0 != 2) {
            field2333 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field796[var4] = class31.field869[class32.method257(var2[var4], 255)];
        }
        class15.method116((byte) -55);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILk;)V", line = 129)
    public static final void method718(int arg0, class60 arg1) {
        class124.field3000 = arg1;
        if (arg0 >= 24) {
            field2323++;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 140)
    public static final void method719(int arg0) {
        field2321++;
        try {
            Graphics var1 = class84.field2003.getGraphics();
            int var2 = -69 % ((-arg0 - 81) / 37);
            class105.field2548.method187(357, var1, -26826, 17);
        } catch (Exception var3) {
            class84.field2003.repaint();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILab;Lwb;)Lwb;", line = 169)
    public static final class130 method720(int arg0, class3 arg1, class130 arg2) {
        if (arg0 < 79) {
            return null;
        }
        if (arg2.method973(class105.field2539, -31451) != -1) {
            label62: while (true) {
                int var3 = arg2.method973(class129.field3046, -31451);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method973(class130.field3135, -31451);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method973(class113.field2789, -31451);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method973(class30.field853, -31451);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method973(field2324, -31451);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method973(class29.field803, -31451);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class130 var9 = class9.field295;
                                                        if (class4.field194 != null) {
                                                            var9 = class18.method146(-27912, class4.field194.field1103);
                                                            try {
                                                                if (class4.field194.field1100 != null) {
                                                                    byte[] var10 = ((String) class4.field194.field1100).getBytes("ISO-8859-1");
                                                                    var9 = class4.method36(var10, var10.length, 0, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class15.method114(new class130[] { arg2.method970(true, var8, 0), var9, arg2.method977(var8 + 4, true) }, -20349);
                                                    }
                                                }
                                                arg2 = class15.method114(new class130[] { arg2.method970(true, var7, 0), class116.method898((byte) 84, class132.method1019(4, (byte) -84, arg1)), arg2.method977(var7 + 2, true) }, -20349);
                                            }
                                        }
                                        arg2 = class15.method114(new class130[] { arg2.method970(true, var6, 0), class116.method898((byte) 84, class132.method1019(3, (byte) -84, arg1)), arg2.method977(var6 + 2, true) }, -20349);
                                    }
                                }
                                arg2 = class15.method114(new class130[] { arg2.method970(true, var5, 0), class116.method898((byte) 84, class132.method1019(2, (byte) -84, arg1)), arg2.method977(var5 + 2, true) }, -20349);
                            }
                        }
                        arg2 = class15.method114(new class130[] { arg2.method970(true, var4, 0), class116.method898((byte) 84, class132.method1019(1, (byte) -84, arg1)), arg2.method977(var4 + 2, true) }, -20349);
                    }
                }
                arg2 = class15.method114(new class130[] { arg2.method970(true, var3, 0), class116.method898((byte) 84, class132.method1019(0, (byte) -84, arg1)), arg2.method977(var3 + 2, true) }, -20349);
            }
        }
        field2326++;
        return arg2;
    }
}
