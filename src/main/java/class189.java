import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class189 extends class16 {

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    private int field3066 = 4096;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    private int field3069 = 3216;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    private int field3076 = 3216;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "[I")
    private int[] field3080 = new int[3];

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "Lpm;")
    public static class111 field3070 = new class111(64);

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "Ltl;")
    public static class222 field3075 = new class222(20);

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "Lkb;")
    public static class39 field3077;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V", line = 4)
    public static void method1330(byte arg0) {
        if (arg0 < -26) {
            field3077 = null;
            field3070 = null;
            field3075 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 15)
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLim;I)V", line = 41)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3066 = arg1.method1396(-113);
        } else if (arg2 == 1) {
            this.field3076 = arg1.method1396(-94);
        } else if (arg2 == 2) {
            this.field3069 = arg1.method1396(arg0 - 34);
        }
        if (arg0 != -7) {
            this.field3076 = 87;
        }
        field3065++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 76)
    public static final void method1331(boolean arg0, int arg1, String arg2) {
        field3078++;
        String var3 = arg2.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class239.field3786; var6++) {
            class74 var7 = class31.method198(false, var6);
            if ((!arg0 || var7.field946) && var7.field928 == -1 && var7.field974 == -1 && var7.field986 == 0 && var7.field996.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class103.field1579 = null;
                    class91.field1393 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class242.field3837 = 0;
        class91.field1393 = var4;
        String[] var10 = new String[class91.field1393];
        class103.field1579 = var5;
        for (int var11 = 0; var11 < class91.field1393; var11++) {
            var10[var11] = class31.method198(false, var5[var11]).field996;
        }
        if (arg1 < 123) {
            field3075 = (class222) null;
        }
        class260.method1862(var10, (byte) 118, class103.field1579);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Ltj;", line = 148)
    public static final class191 method1332(int arg0, int arg1) {
        field3072++;
        class191 var2 = (class191) class119.field1834.method768((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class327.field5099.method250(true, 11, arg1);
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1342(new class192(var3), 85);
        }
        if (arg0 == 1178651532) {
            class119.field1834.method770(var4, 0, (long) arg1);
            return var4;
        } else {
            return (class191) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V", line = 179)
    public static final void method1333(byte arg0) {
        field3079++;
        int var1 = -50 / ((29 - arg0) / 46);
        try {
            if (class37.field497 == 1) {
                int var2 = class188.field3056.method1194((byte) -112);
                if (var2 > 0 && class188.field3056.method1215(true)) {
                    int var3 = var2 - class226.field3585;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class188.field3056.method1203(var3, 0);
                    return;
                }
                class188.field3056.method1205(-24516);
                class188.field3056.method1225(127);
                class327.field5100 = null;
                class255.field4050 = null;
                if (class64.field853 == null) {
                    class37.field497 = 0;
                } else {
                    class37.field497 = 2;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class188.field3056.method1205(-24516);
            class255.field4050 = null;
            class327.field5100 = null;
            class64.field853 = null;
            class37.field497 = 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 223)
    public final void method55(byte arg0) {
        field3073++;
        this.method1334(116);
        if (arg0 != 0) {
            this.method55((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V", line = 241)
    private final void method1334(int arg0) {
        double var2 = Math.cos((double) ((float) this.field3069 / 4096.0F));
        this.field3080[0] = (int) (var2 * Math.sin((double) ((float) this.field3076 / 4096.0F)) * 4096.0D);
        field3067++;
        if (arg0 < 106) {
            return;
        }
        this.field3080[1] = (int) (Math.cos((double) ((float) this.field3076 / 4096.0F)) * var2 * 4096.0D);
        this.field3080[2] = (int) (Math.sin((double) ((float) this.field3069 / 4096.0F)) * 4096.0D);
        int var4 = this.field3080[1] * this.field3080[1] >> 12;
        int var5 = this.field3080[0] * this.field3080[0] >> 12;
        int var6 = this.field3080[2] * this.field3080[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3080[0] = (this.field3080[0] << 12) / var7;
            this.field3080[1] = (this.field3080[1] << 12) / var7;
            this.field3080[2] = (this.field3080[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZI)[I", line = 274)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            this.field3069 = 84;
        }
        field3063++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class74.field935 * this.field3066 >> 12;
            int[] var5 = this.method103(0, 4389, arg1 - 1 & class240.field3798);
            int[] var6 = this.method103(0, 4389, arg1);
            int[] var7 = this.method103(0, 4389, arg1 + 1 & class240.field3798);
            for (int var8 = 0; var8 < class276.field4376; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[var8 - 1 & class148.field2215] - var6[var8 + 1 & class148.field2215]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class19.field268[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = this.field3080[1] * var14 >> 12;
                int var16 = var11 * var13 >> 8;
                int var17 = this.field3080[0] * var16 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field3080[2] * var18 >> 12;
                var3[var8] = var15 + var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;)J", line = 349)
    public static final long method1335(int arg0, String arg1) {
        field3071++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (long) arg1.charAt(var5) + ((var2 << 5) - var2);
        }
        if (arg0 != 1082969068) {
            method1335(-42, (String) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)V", line = 376)
    public static final void method1336(int arg0, int arg1, int arg2) {
        field3064++;
        class341 var3 = class234.method1680(arg2, 0);
        int var4 = var3.field5318;
        int var5 = var3.field5308;
        int var6 = var3.field5306;
        int var7 = class86.field1308[var4 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        if (arg0 != 1082969068) {
            field3077 = (class39) null;
        }
        int var8 = var7 << var6;
        class42.method289(var5, 76, class29.field422[var5] & ~var8 | var8 & arg1 << var6);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIIIII)V", line = 412)
    public static final void method1337(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -29 / ((-arg1 - 80) / 40);
        class160 var8 = class241.method1709(arg0, 69, arg4);
        if (var8 != null && var8.field2577 != null) {
            class247 var9 = new class247();
            var9.field3931 = var8;
            var9.field3925 = var8.field2577;
            class69.method455(var9, (byte) -64);
        }
        class24.field344 = arg6;
        class131.field1933 = arg4;
        class297.field4656 = arg5;
        field3074++;
        class313.field4874 = true;
        class288.field4531 = arg0;
        class26.field374 = arg3;
        class239.field3778 = arg2;
        class219.method1600(var8, 110);
    }
}
