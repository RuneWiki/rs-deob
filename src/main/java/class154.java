import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class154 extends class35 {

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public int field2149 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field2145 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public int field2150 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public int field2143 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public int field2146 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field2152 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2148 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public int field2147 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "Llk;")
    public class290 field2142;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2157 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "Lgm;")
    public static class95 field2154;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)Z")
    public static final boolean method1052(int arg0) {
        field2151++;
        if (arg0 < 124) {
            field2157 = null;
        }
        try {
            if (class428.field6110 == 2) {
                if (class451.field6403 == null) {
                    class451.field6403 = class181.method1248(class415.field5986, class268.field3968, class338.field5076);
                    if (class451.field6403 == null) {
                        return false;
                    }
                }
                if (class236.field3436 == null) {
                    class236.field3436 = new class462(class50.field727, class204.field3102);
                }
                if (class245.field3510.method1140((byte) 121, class236.field3436, class451.field6403, class14.field208, 22050)) {
                    class245.field3510.method1141(-128);
                    class245.field3510.method1144(true, class372.field5600);
                    class245.field3510.method1155(class451.field6403, class346.field5283, 0);
                    class451.field6403 = null;
                    class428.field6110 = 0;
                    class415.field5986 = null;
                    class236.field3436 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class245.field3510.method1158((byte) -101);
            class428.field6110 = 0;
            class415.field5986 = null;
            class236.field3436 = null;
            class451.field6403 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        field2155++;
        if (arg0 != 4096) {
            field2157 = null;
        }
        class336.field5036.method548(class72.field971, class337.field5038.field3924 ? class337.field5039 + 256 : -1);
    }

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)V")
    public static void method1054(int arg0) {
        if (arg0 == -311) {
            field2157 = null;
            field2154 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1055(int arg0, long arg1) {
        field2156++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class391.field5760[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
    public static final void method1056(int arg0) {
        field2144++;
        if (class346.field5288 == null || class489.field6853 == null) {
            class346.field5288 = new int[256];
            class489.field6853 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class346.field5288[var1] = (int) (Math.sin(var3) * 4096.0D);
                class489.field6853[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        int var2 = 63 / ((35 - arg0) / 59);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Llk;)V")
    public class154(class290 arg0) {
        this.field2142 = arg0;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1057(int arg0, int arg1, boolean arg2) {
        field2153++;
        if (arg1 >= this.field2146 && this.field2147 >= arg1 && arg0 >= this.field2150 && arg0 <= this.field2149) {
            return true;
        } else if (arg1 >= this.field2143 && this.field2148 >= arg1 && this.field2145 <= arg0 && this.field2152 >= arg0) {
            return true;
        } else {
            if (arg2) {
                this.method1057(-66, -77, true);
            }
            return false;
        }
    }
}
