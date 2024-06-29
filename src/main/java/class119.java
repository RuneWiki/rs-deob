import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class119 extends class42 {

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "[B")
    public byte[] field1740;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Lvj;")
    public static class304 field1741 = new class304("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V", line = 5)
    public static final void method829(int arg0, int arg1, int arg2) {
        if (class6.field164 < class6.field170) {
            class6.field164 = (float) ((double) class6.field164 / 30.0D + (double) class6.field164);
            if (class6.field164 > class6.field170) {
                class6.field164 = class6.field170;
            }
            class268.method1614(1604);
            class6.field167 = (int) class6.field164 >> 1;
            class6.field166 = class463.method2640((byte) -39, class6.field167);
        } else if (class6.field164 > class6.field170) {
            class6.field164 = (float) ((double) class6.field164 - (double) class6.field164 / 30.0D);
            if (class6.field164 < class6.field170) {
                class6.field164 = class6.field170;
            }
            class268.method1614(1604);
            class6.field167 = (int) class6.field164 >> 1;
            class6.field166 = class463.method2640((byte) 96, class6.field167);
        }
        field1738++;
        if (class250.field3323 != -1 && class412.field5694 != -1) {
            int var3 = class250.field3323 - class5.field152;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class412.field5694 - class391.field5300;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class5.field152 += var3;
            class391.field5300 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class250.field3323 = -1;
                class412.field5694 = -1;
            }
            class268.method1614(1604);
        }
        if (class497.field6891 <= 0) {
            class491.field6838 = -1;
            class392.field5309 = -1;
        } else {
            class389.field5277--;
            if (class389.field5277 == 0) {
                class497.field6891--;
                class389.field5277 = 100;
            }
        }
        if (class433.field5905 && class224.field3022 != null) {
            for (class203 var5 = (class203) class224.field3022.method1672((byte) -114); var5 != null; var5 = (class203) class224.field3022.method1668(-1)) {
                class460 var6 = class6.field160.method1014(var5.field2805.field3078, -22947);
                if (var5.method1305(arg0, arg1, 255)) {
                    if (var6.field6351 != null) {
                        if (var6.field6351[4] != null) {
                            class70.method459(-1, var6.field6353, true, 0, 1006, 23856, var6.field6351[4], -1, (long) var5.field2805.field3078, var6.field6329, false);
                        }
                        if (var6.field6351[3] != null) {
                            class70.method459(-1, var6.field6353, true, 0, 1001, 23856, var6.field6351[3], -1, (long) var5.field2805.field3078, var6.field6329, false);
                        }
                        if (var6.field6351[2] != null) {
                            class70.method459(-1, var6.field6353, true, 0, 1008, 23856, var6.field6351[2], -1, (long) var5.field2805.field3078, var6.field6329, false);
                        }
                        if (var6.field6351[1] != null) {
                            class70.method459(-1, var6.field6353, true, 0, 1002, 23856, var6.field6351[1], -1, (long) var5.field2805.field3078, var6.field6329, false);
                        }
                        if (var6.field6351[0] != null) {
                            class70.method459(-1, var6.field6353, true, 0, 1011, 23856, var6.field6351[0], -1, (long) var5.field2805.field3078, var6.field6329, false);
                        }
                    }
                    if (!var5.field2805.field3071) {
                        var5.field2805.field3071 = true;
                        class122.method892(class96.field1459, var5.field2805.field3078, var6.field6329);
                    }
                    if (var5.field2805.field3071) {
                        class122.method892(class67.field1024, var5.field2805.field3078, var6.field6329);
                    }
                } else if (var5.field2805.field3071) {
                    var5.field2805.field3071 = false;
                    class122.method892(class507.field7045, var5.field2805.field3078, var6.field6329);
                }
            }
        }
        if (arg2 != 24474) {
            method829(-40, -58, 35);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 144)
    public static final void method830(String arg0, boolean arg1, boolean arg2) {
        field1739++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg1) {
            field1742 = -62;
        }
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class507.field7044.field5950 : class507.field7044.field5947) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class174 var11 = class507.field7044.method2504((byte) 60, var8);
            if (var11.field2541 && var11.method1172(-27972).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class215.field2897 = null;
                    class29.field491 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class245.field3255 = 0;
        class29.field491 = var5;
        class215.field2897 = var4;
        String[] var9 = new String[class29.field491];
        for (int var10 = 0; var10 < class29.field491; var10++) {
            var9[var10] = class507.field7044.method2504((byte) 60, var4[var10]).method1172(-27972);
        }
        class430.method2485(class215.field2897, (byte) -72, var9);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([B)V", line = 223)
    public class119(byte[] arg0) {
        this.field1740 = arg0;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(Z)V", line = 234)
    public static void method831(boolean arg0) {
        field1741 = null;
        if (!arg0) {
            field1743 = -121;
        }
    }
}
