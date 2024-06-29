import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class80 extends class271 {

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
    public boolean field1198 = true;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Llt;")
    public static class475 field1200 = new class475("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
    public static int field1217 = -2;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ut", name = "S", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ut", name = "U", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ut", name = "Z", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ut", name = "ab", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "Lt;")
    public class471 field1204;

    @OriginalMember(owner = "client!ut", name = "Y", descriptor = "Lri;")
    public static class73 field1218;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "[I")
    public int[] field1207;

    @OriginalMember(owner = "client!ut", name = "V", descriptor = "[I")
    private int[] field1215;

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "[Ljava/lang/String;")
    private String[] field1213;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "[[I")
    private int[][] field1206;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(FIIIIFFB)[F", line = 4)
    public static final float[] method465(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, byte arg7) {
        field1203++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[8] = var10;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[5] = 0.0F;
        float var12 = 1.0F - var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + (arg2 * arg2)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg2) / var19;
                var15 = (float) arg4 / var19;
            }
            var13[3] = -var15 * var17;
            var13[7] = -var14 * var17;
            var13[2] = var14 * var15 * var18;
            var13[1] = var15 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var13[5] = var14 * var17;
            var13[6] = var14 * var15 * var18;
            var13[8] = var15 * var15 * var18 + var16;
            var13[4] = var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[1] *= arg5;
        var9[8] *= arg0;
        var9[0] *= arg5;
        var9[6] *= arg0;
        var9[5] *= arg6;
        var9[3] *= arg6;
        var9[4] *= arg6;
        var9[7] *= arg0;
        if (arg7 >= -80) {
            return null;
        } else {
            var9[2] *= arg5;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(JI)V", line = 87)
    public static final void method466(long arg0, int arg1) {
        if (arg1 != -26750) {
            field1218 = null;
        }
        field1220++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 101)
    public static void method467(int arg0) {
        field1200 = null;
        if (arg0 == -1) {
            field1218 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)I", line = 116)
    public final int method468(int arg0) {
        field1208++;
        if (arg0 != -1) {
            this.method475(null, -27);
        }
        return this.field1215 == null ? 0 : this.field1215.length;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ldh;I[I)V", line = 135)
    public final void method469(class209 arg0, int arg1, int[] arg2) {
        field1205++;
        if (this.field1215 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field1215.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = this.method476((byte) 115, var4).field6589;
            if (var5 > 0) {
                arg0.method1446((long) arg2[var4], 5, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V", line = 160)
    public final void method470(int arg0) {
        field1199++;
        if (this.field1207 != null) {
            for (int var2 = 0; var2 < this.field1207.length; var2++) {
                this.field1207[var2] = class18.method119(this.field1207[var2], 32768);
            }
        }
        if (arg0 != 3) {
            this.method476((byte) 103, -18);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)I", line = 182)
    public final int method471(int arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            return 62;
        }
        field1197++;
        if (this.field1215 == null || arg1 < 0 || this.field1215.length < arg1) {
            return -1;
        } else if (this.field1206[arg1] == null || arg0 < 0 || this.field1206[arg1].length < arg0) {
            return -1;
        } else {
            return this.field1206[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)Ljava/lang/String;", line = 201)
    public final String method472(int arg0) {
        field1201++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1213 == null) {
            return "";
        }
        if (arg0 != -23421) {
            this.field1207 = null;
        }
        var2.append(this.field1213[0]);
        for (int var3 = 1; var3 < this.field1213.length; var3++) {
            var2.append("...");
            var2.append(this.field1213[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILdh;)V", line = 234)
    public final void method473(int arg0, class209 arg1) {
        field1210++;
        if (arg0 != -2286) {
            return;
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                return;
            }
            this.method478(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 255)
    public static final String method474(byte arg0, long arg1) {
        if (arg0 < 10) {
            field1217 = 105;
        }
        field1196++;
        class16.field182.setTime(new Date(arg1));
        int var3 = class16.field182.get(7);
        int var4 = class16.field182.get(5);
        int var5 = class16.field182.get(2);
        int var6 = class16.field182.get(1);
        int var7 = class16.field182.get(11);
        int var8 = class16.field182.get(12);
        int var9 = class16.field182.get(13);
        return class470.field6927[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class519.field7660[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ldh;I)Ljava/lang/String;", line = 284)
    public final String method475(class209 arg0, int arg1) {
        field1209++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1215 != null) {
            for (int var4 = 0; var4 < this.field1215.length; var4++) {
                var3.append(this.field1213[var4]);
                var3.append(this.field1204.method2824(this.field1206[var4], this.method476((byte) 96, var4), (byte) -104, arg0.method1460(true, class239.method1622(0, this.field1215[var4]).field6586)));
            }
        }
        var3.append(this.field1213[this.field1213.length - 1]);
        int var5 = -97 / ((arg1 - 42) / 51);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Lgo;", line = 312)
    public final class441 method476(byte arg0, int arg1) {
        field1211++;
        if (this.field1215 == null || arg1 < 0 || this.field1215.length < arg1) {
            return null;
        } else {
            if (arg0 < 87) {
                this.field1213 = null;
            }
            return class239.method1622(0, this.field1215[arg1]);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILna;)V", line = 327)
    public static final void method477(int arg0, class35 arg1) {
        class86.field1324[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZLdh;)V", line = 332)
    private final void method478(int arg0, boolean arg1, class209 arg2) {
        if (arg0 == 1) {
            this.field1213 = class93.method541(arg2.method1449(40), '<', 1);
        } else if (arg0 == 2) {
            int var9 = arg2.method1428(32122);
            this.field1207 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1207[var10] = arg2.method1450((byte) 113);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1428(32122);
            this.field1206 = new int[var4][];
            this.field1215 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1450((byte) 124);
                class441 var7 = class239.method1622(0, var6);
                if (var7 != null) {
                    this.field1215[var5] = var6;
                    this.field1206[var5] = new int[var7.field6590];
                    for (int var8 = 0; var8 < var7.field6590; var8++) {
                        this.field1206[var5][var8] = arg2.method1450((byte) 127);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field1198 = false;
        }
        field1202++;
        if (arg1) {
            this.field1215 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V", line = 422)
    public static final void method479(int arg0, int arg1, int arg2) {
        if ((class460.field6813 > class460.field6808)) {
            class460.field6808 = (float) ((double) class460.field6808 / 30.0D + (double) class460.field6808);
            if (class460.field6808 > class460.field6813) {
                class460.field6808 = class460.field6813;
            }
            class34.method194((byte) -70);
            class460.field6812 = (int) class460.field6808 >> 1;
            class460.field6811 = class48.method301((byte) -1, class460.field6812);
        } else if (class460.field6813 < class460.field6808) {
            class460.field6808 = (float) ((double) class460.field6808 - (double) class460.field6808 / 30.0D);
            if (class460.field6808 < class460.field6813) {
                class460.field6808 = class460.field6813;
            }
            class34.method194((byte) -70);
            class460.field6812 = (int) class460.field6808 >> 1;
            class460.field6811 = class48.method301((byte) -1, class460.field6812);
        }
        if (arg1 != 2) {
            return;
        }
        field1214++;
        if (class521.field7721 != -1 && class83.field1289 != -1) {
            int var3 = class521.field7721 - class271.field3940;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class83.field1289 - class335.field4715;
            class271.field3940 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class335.field4715 += var4;
            if (var3 == 0 && var4 == 0) {
                class521.field7721 = -1;
                class83.field1289 = -1;
            }
            class34.method194((byte) -70);
        }
        if (class259.field3816 <= 0) {
            class497.field7333 = -1;
            class101.field1467 = -1;
        } else {
            class116.field1759--;
            if (class116.field1759 == 0) {
                class259.field3816--;
                class116.field1759 = 100;
            }
        }
        if (!class132.field2037 || class365.field5583 == null) {
            return;
        }
        for (class325 var5 = (class325) class365.field5583.method816(123); var5 != null; var5 = (class325) class365.field5583.method812(arg1 + 111)) {
            class158 var6 = class460.field6804.method539(var5.field4640.field5459, (byte) 60);
            if (var5.method2014(arg2, Integer.MIN_VALUE, arg0)) {
                if (var6.field2316 != null) {
                    if (var6.field2316[4] != null) {
                        class496.method2976(false, var6.field2319, (long) var5.field4640.field5459, var6.field2343, -1, true, var6.field2316[4], -1, -119, 0, 1002);
                    }
                    if (var6.field2316[3] != null) {
                        class496.method2976(false, var6.field2319, (long) var5.field4640.field5459, var6.field2343, -1, true, var6.field2316[3], -1, -113, 0, 1001);
                    }
                    if (var6.field2316[2] != null) {
                        class496.method2976(false, var6.field2319, (long) var5.field4640.field5459, var6.field2343, -1, true, var6.field2316[2], -1, -117, 0, 1003);
                    }
                    if (var6.field2316[1] != null) {
                        class496.method2976(false, var6.field2319, (long) var5.field4640.field5459, var6.field2343, -1, true, var6.field2316[1], -1, -127, 0, 1010);
                    }
                    if (var6.field2316[0] != null) {
                        class496.method2976(false, var6.field2319, (long) var5.field4640.field5459, var6.field2343, -1, true, var6.field2316[0], -1, arg1 ^ -124, 0, 1009);
                    }
                }
                if (!var5.field4640.field5463) {
                    var5.field4640.field5463 = true;
                    class360.method2244(class370.field5662, var5.field4640.field5459, var6.field2319);
                }
                if (var5.field4640.field5463) {
                    class360.method2244(class363.field5567, var5.field4640.field5459, var6.field2319);
                }
            } else if (var5.field4640.field5463) {
                var5.field4640.field5463 = false;
                class360.method2244(class135.field2057, var5.field4640.field5459, var6.field2319);
            }
        }
    }
}
