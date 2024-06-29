import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class194 extends class307 {

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public int field3208 = 0;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "Z")
    public boolean field3197 = false;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Lil;")
    private class30 field3195 = new class30();

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    private int field3223 = 0;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "Lo;")
    public class227 field3220 = new class227();

    @OriginalMember(owner = "client!bn", name = "ab", descriptor = "Z")
    private boolean field3232 = false;

    @OriginalMember(owner = "client!bn", name = "Z", descriptor = "Z")
    private boolean field3231 = false;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    private int field3229 = 0;

    @OriginalMember(owner = "client!bn", name = "gb", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!bn", name = "bb", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "[Lrc;")
    public class11[] field3200;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "J")
    private long field3210;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field3193 = 0;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field3198 = 0;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
    public static boolean field3207 = false;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Z")
    public static boolean field3201 = false;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field3206 = 0;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Llf;")
    public static class319 field3199 = new class319(8);

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field3211 = 2;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    private static int field3214 = 0;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "[Z")
    private static boolean[] field3212 = new boolean[8];

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "[Z")
    private static boolean[] field3222 = new boolean[8];

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "Lhb;")
    private static class164 field3217 = new class164(131056);

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!bn", name = "cb", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!bn", name = "db", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!bn", name = "fb", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!bn", name = "hb", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "J")
    public long field3203;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "J")
    private long field3219;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Lil;")
    private static class30 field3209;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3196;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "[I")
    public static int[] field3213;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "[I")
    public static int[] field3215;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "[Lrc;")
    public static class11[] field3202;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "[[S")
    public static short[][] field3216;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "[[S")
    public static short[][] field3218;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Lgg;Z[I[I[I)V", line = 9)
    private final void method1355(class138[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3222[var6] = false;
        }
        label64: for (class168 var7 = (class168) this.field3195.method231((byte) -75); var7 != null; var7 = (class168) this.field3195.method232((byte) 11)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field2758) {
                        field3222[var8] = true;
                        var7.field2755 = false;
                        continue label64;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2784 == 0) {
                    var7.method2075(6204);
                    this.field3223--;
                } else {
                    var7.field2755 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field3223 != 8; var9++) {
                if (!field3222[var9]) {
                    class168 var10 = new class168(arg0[var9], this, this.field3203);
                    this.field3195.method235(false, var10);
                    this.field3223++;
                }
            }
        }
        for (class168 var11 = (class168) this.field3195.method231((byte) -75); var11 != null; var11 = (class168) this.field3195.method232((byte) 11)) {
            var11.method1235(arg2[var11.field2758.field2241], arg4[var11.field2758.field2229], arg4[var11.field2758.field2241], arg2[var11.field2758.field2234], (byte) 125, arg2[var11.field2758.field2229], arg3[var11.field2758.field2229], arg3[var11.field2758.field2241], arg4[var11.field2758.field2234], arg3[var11.field2758.field2234]);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V", line = 88)
    public static void method1356() {
        field3209 = null;
        field3202 = null;
        field3199 = null;
        field3222 = null;
        field3212 = null;
        field3216 = (short[][]) null;
        field3218 = (short[][]) null;
        field3213 = null;
        field3215 = null;
        field3217 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V", line = 100)
    public final void method1357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1370(arg0, arg1, class244.field4035 + arg2, class129.field2111 + arg3, class255.field4266 + arg4);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(J)Z", line = 107)
    private final boolean method1358(long arg0) {
        long var3;
        if (this.field3210 > this.field3219) {
            var3 = this.field3210;
        } else {
            var3 = this.field3219;
        }
        int var5 = (int) (this.field3203 - var3);
        if (var5 > 750) {
            this.method1375();
            return false;
        }
        if (this.field3219 > 0L) {
            this.field3236 = this.field3224 - (this.field3238 << 6) >> 7;
            this.field3235 = ((this.field3238 << 6) + this.field3224 >> 7) - 1;
            this.field3237 = this.field3239 - (this.field3233 << 6) >> 7;
            this.field3228 = ((this.field3233 << 6) + this.field3239 >> 7) - 1;
            this.field3225 = this.field3227;
            if (this.field3226 < 3) {
                this.field3230 = class192.field3174[this.field3226 + 1][this.field3236][this.field3237] + class192.field3174[this.field3226 + 1][this.field3235][this.field3237] + class192.field3174[this.field3226 + 1][this.field3236][this.field3228] + class192.field3174[this.field3226 + 1][this.field3235][this.field3228] >> 2;
            } else {
                this.field3230 = this.field3225 - 1024;
            }
            this.field3231 = true;
            int var6 = class310.field5199[this.field3234];
            int var7 = class310.field5197[this.field3234];
            this.method1369(var6, var7);
            if (this.field3232) {
                class168 var8 = (class168) this.field3195.method231((byte) -75);
                while (true) {
                    if (var8 == null) {
                        this.field3232 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2745.field1166; var9++) {
                        var8.method1231(var7, 1, true, (byte) 120, var6, this.field3203);
                    }
                    var8 = (class168) this.field3195.method232((byte) 11);
                }
            }
            int var10 = (int) (arg0 - this.field3203);
            for (class168 var11 = (class168) this.field3195.method231((byte) -75); var11 != null; var11 = (class168) this.field3195.method232((byte) 11)) {
                var11.method1231(var7, var10, var5 < 10, (byte) 120, var6, arg0);
            }
        }
        this.field3203 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(J)V", line = 177)
    public static final void method1359(long arg0) {
        field3206 = 0;
        field3198 = 0;
        long var2 = class130.method935(false);
        for (class194 var4 = (class194) field3209.method231((byte) -75); var4 != null; var4 = (class194) field3209.method232((byte) 11)) {
            if (var4.method1358(arg0)) {
                field3206++;
            }
        }
        if (field3201 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field3209.method234(-107) + ", running: " + field3206 + ". Particles: " + field3198 + ". Time taken: " + (class130.method935(false) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V", line = 199)
    public final void method1360() {
        this.field3232 = true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIII)V", line = 203)
    public final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field3197 || !this.field3231 || !class99.field1675) {
            return;
        }
        GL var10 = class99.field1682;
        int var11 = class244.field4035;
        int var12 = class129.field2111;
        int var13 = class255.field4266;
        method1373(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16;
        if (this.field3236 == this.field3235 && this.field3237 == this.field3228) {
            var16 = 92;
        } else {
            int var17 = this.field3236 << 7;
            int var18 = (this.field3235 << 7) + 128;
            int var19 = this.field3237 << 7;
            int var20 = (this.field3228 << 7) + 128;
            int var21 = this.field3224 - var17;
            int var22 = var18 - this.field3224;
            if (var21 > var22) {
                int var23 = this.field3239 - var19;
                int var24 = var20 - this.field3239;
                if (var23 > var24) {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var23 * var23)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var24 * var24)) + 0.99D);
                }
            } else {
                int var25 = this.field3239 - var19;
                int var26 = var20 - this.field3239;
                if (var25 > var26) {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var25 * var25)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var26 * var26)) + 0.99D);
                }
            }
        }
        int var27 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var28 = (-var16 * arg2 - (this.field3225 - this.field3230) * arg1 >> 16) + var15;
        int var29 = var27 + 2 - var28;
        if (var29 >= 1600) {
            if (field3201) {
                System.out.println("Model too big for particles - radixsize:" + var29 + " maxmodelsize:" + 1600);
            }
            var10.glDepthMask(true);
            var10.glColorMaterial(1028, 5634);
            return;
        }
        class307 var30 = this.field3195.field490;
        for (class307 var31 = var30.field5176; var31 != var30; var31 = var31.field5176) {
            class168 var32 = (class168) var31;
            for (int var33 = 0; var33 < var29; var33++) {
                field3213[var33] = 0;
            }
            for (int var34 = 0; var34 < 32; var34++) {
                field3215[var34] = 0;
            }
            field3221 = 0;
            class307 var35 = var32.field2770.field490;
            for (class307 var36 = var35.field5176; var36 != var35; var36 = var36.field5176) {
                class11 var37 = (class11) var36;
                if (!var37.field161) {
                    int var38 = (var37.field153 >> 12) - var11;
                    int var39 = (var37.field152 >> 12) - var12;
                    int var40 = (var37.field156 >> 12) - var13;
                    int var41 = arg4 * var40 - arg3 * var38 >> 16;
                    int var42 = (arg1 * var39 + arg2 * var41 >> 16) - var28;
                    if (var42 < 0) {
                        var42 = 0;
                    } else if (var42 >= var29) {
                        var42 = var29 - 1;
                    }
                    if (field3213[var42] < 32) {
                        field3216[var42][field3213[var42]++] = var37.field155;
                    } else {
                        if (field3213[var42] == 32) {
                            if (field3221 == 32) {
                                if (field3201) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field3213[var42] += field3221++ + 1;
                        }
                        short[] var10000 = field3218[field3213[var42] - 32 - 1];
                        int var10002 = field3213[var42] - 32 - 1;
                        int var10004 = field3215[field3213[var42] - 32 - 1];
                        field3215[var10002] = field3215[field3213[var42] - 32 - 1] + 1;
                        var10000[var10004] = var37.field155;
                    }
                }
            }
            boolean var43 = false;
            if (field3207 && var32.field2745.field1130 != -1) {
                class310.field5207.method111(-59, var32.field2745.field1130);
                var43 = true;
            } else {
                class99.method749(-1);
            }
            var10.glPointSize((float) var32.field2745.field1153);
            this.method1367(var10, var29, var43, var32.field2745.field1117);
        }
        method1365();
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()V", line = 388)
    public static final void method1362() {
        field3199 = new class319(8);
        field3214 = 0;
        for (class194 var0 = (class194) field3209.method231((byte) -75); var0 != null; var0 = (class194) field3209.method232((byte) 11)) {
            var0.method1375();
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()V", line = 402)
    public static final void method1363() {
        field3216 = new short[1600][32];
        field3218 = new short[32][768];
        field3213 = new int[1600];
        field3215 = new int[32];
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 409)
    public static final void method1364(int arg0) {
        field3211 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "()V", line = 413)
    public static final void method1365() {
        GL var0 = class99.field1682;
        var0.glEnableClientState(32885);
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Lik;Z[I[I[I)V", line = 423)
    private final void method1366(class330[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3212[var6] = false;
        }
        label73: for (class239 var7 = (class239) this.field3220.method1580((byte) -39); var7 != null; var7 = (class239) this.field3220.method1579((byte) 28)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field3962) {
                        field3212[var8] = true;
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var7.method598(92);
                this.field3229--;
                if (var7.method227(false)) {
                    var7.method224(128);
                    field3214--;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field3229 != 8; var9++) {
                if (!field3212[var9]) {
                    class239 var10 = null;
                    if (arg0[var9].field5624.field2840 == 1 && field3214 < 32) {
                        var10 = new class239(arg0[var9], this);
                        field3199.method2159((byte) -106, (long) arg0[var9].field5624.field2851, var10);
                        field3214++;
                    }
                    if (var10 == null) {
                        var10 = new class239(arg0[var9], this);
                    }
                    this.field3220.method1582(var10, 4);
                    this.field3229++;
                }
            }
        }
        for (class239 var11 = (class239) this.field3220.method1580((byte) -39); var11 != null; var11 = (class239) this.field3220.method1579((byte) 28)) {
            var11.method1687(arg3[var11.field3962.field5626], arg4[var11.field3962.field5626], arg2[var11.field3962.field5626], false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 517)
    public final void method1367(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            arg0.glDisable(2896);
        }
        field3217.field2670 = 0;
        if (class99.field1678) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field3213[var5] > 32 ? 32 : field3213[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class11 var8 = this.field3200[field3216[var5][var7]];
                        field3217.method1195(94, (float) (var8.field153 >> 12));
                        field3217.method1195(124, (float) (var8.field152 >> 12));
                        field3217.method1195(116, (float) (var8.field156 >> 12));
                        int var9 = var8.field158;
                        field3217.method1188(-72, (byte) (var9 >> 16));
                        field3217.method1188(-98, (byte) (var9 >> 8));
                        field3217.method1188(-128, (byte) var9);
                        field3217.method1188(-97, (byte) (var9 >> 24));
                    }
                    if (field3213[var5] > 32) {
                        int var10 = field3213[var5] - 32 - 1;
                        for (int var11 = field3215[var10] - 1; var11 >= 0; var11--) {
                            class11 var12 = this.field3200[field3218[var10][var11]];
                            field3217.method1195(95, (float) (var12.field153 >> 12));
                            field3217.method1195(121, (float) (var12.field152 >> 12));
                            field3217.method1195(101, (float) (var12.field156 >> 12));
                            int var13 = var12.field158;
                            field3217.method1188(-76, (byte) (var13 >> 16));
                            field3217.method1188(-77, (byte) (var13 >> 8));
                            field3217.method1188(-77, (byte) var13);
                            field3217.method1188(-91, (byte) (var13 >> 24));
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field3213[var14] > 32 ? 32 : field3213[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class11 var17 = this.field3200[field3216[var14][var16]];
                        field3217.method1158((float) (var17.field153 >> 12), (byte) 69);
                        field3217.method1158((float) (var17.field152 >> 12), (byte) -113);
                        field3217.method1158((float) (var17.field156 >> 12), (byte) 123);
                        int var18 = var17.field158;
                        field3217.method1188(-111, (byte) (var18 >> 16));
                        field3217.method1188(-85, (byte) (var18 >> 8));
                        field3217.method1188(-71, (byte) var18);
                        field3217.method1188(-72, (byte) (var18 >> 24));
                    }
                    if (field3213[var14] > 32) {
                        int var19 = field3213[var14] - 32 - 1;
                        for (int var20 = field3215[var19] - 1; var20 >= 0; var20--) {
                            class11 var21 = this.field3200[field3218[var19][var20]];
                            field3217.method1158((float) (var21.field153 >> 12), (byte) -120);
                            field3217.method1158((float) (var21.field152 >> 12), (byte) -123);
                            field3217.method1158((float) (var21.field156 >> 12), (byte) -112);
                            int var22 = var21.field158;
                            field3217.method1188(-117, (byte) (var22 >> 16));
                            field3217.method1188(-116, (byte) (var22 >> 8));
                            field3217.method1188(-75, (byte) var22);
                            field3217.method1188(-80, (byte) (var22 >> 24));
                        }
                    }
                }
            }
        }
        if (field3217.field2670 != 0) {
            if (class99.field1689) {
                arg0.glBindBufferARB(34962, 0);
            }
            this.field3196 = ByteBuffer.allocateDirect(field3217.field2670).order(ByteOrder.nativeOrder());
            this.field3196.put(field3217.field2668, 0, field3217.field2670);
            this.field3196.flip();
            this.field3196.position(0);
            arg0.glVertexPointer(3, 5126, 16, this.field3196);
            this.field3196.position(12);
            arg0.glColorPointer(4, 5121, 16, this.field3196);
            arg0.glDrawArrays(0, 0, field3217.field2670 >> 4);
        }
        if (!arg3) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lsi;)V", line = 665)
    public static final void method1368(class66 arg0) {
        field3193 = 0;
        field3204 = 0;
        field3209 = new class30();
        field3202 = new class11[1024];
        class126.method925(false, arg0);
        class319.method2155(-924, arg0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V", line = 675)
    private final void method1369(int arg0, int arg1) {
        for (class239 var3 = (class239) this.field3220.method1580((byte) -39); var3 != null; var3 = (class239) this.field3220.method1579((byte) 28)) {
            var3.field3953 = this.field3224 + var3.field3959;
            var3.field3961 = this.field3227 + var3.field3943;
            var3.field3948 = this.field3239 + var3.field3944;
            if (this.field3234 == 0) {
                var3.field3951 = var3.field3962.field5624.field2856;
                var3.field3957 = var3.field3962.field5624.field2842;
            } else {
                int var4 = var3.field3962.field5624.field2856;
                int var5 = var3.field3962.field5624.field2842;
                var3.field3951 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3957 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IIIII)V", line = 705)
    public final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3197) {
            return;
        }
        if (this.field3234 != arg0) {
            for (class168 var6 = (class168) this.field3195.method231((byte) -75); var6 != null; var6 = (class168) this.field3195.method232((byte) 11)) {
                var6.field2754 = true;
            }
        }
        this.field3219 = this.field3203;
        this.field3234 = arg0;
        this.field3226 = arg1;
        this.field3224 = arg2;
        this.field3227 = arg3;
        this.field3239 = arg4;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "()I", line = 731)
    public static final int method1371() {
        return field3211;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(III)V", line = 866)
    public class194(int arg0, int arg1, int arg2) {
        this.field3238 = arg1;
        this.field3233 = arg2;
        this.field3200 = new class11[8192];
        this.field3210 = (long) arg0;
        this.field3232 = true;
        field3209.method235(false, this);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Lgg;[Lik;Z[I[I[I)V", line = 744)
    public final void method1372(class138[] arg0, class330[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field3197) {
            this.method1355(arg0, arg2, arg3, arg4, arg5);
            this.method1366(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V", line = 752)
    public static final void method1373(int arg0, int arg1, int arg2) {
        GL var3 = class99.field1682;
        var3.glDepthMask(false);
        class285.method1964(123, 0, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class221.field3631, 0);
        var3.glDisableClientState(32885);
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "()V", line = 769)
    public static final void method1374() {
        field3216 = (short[][]) null;
        field3218 = (short[][]) null;
        field3213 = null;
        field3215 = null;
    }

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "()V", line = 775)
    public final void method1375() {
        this.field3197 = true;
        for (class239 var1 = (class239) this.field3220.method1580((byte) -39); var1 != null; var1 = (class239) this.field3220.method1579((byte) 28)) {
            if (var1.field3962.field5624.field2840 == 1) {
                var1.method224(128);
            }
        }
        this.field3200 = new class11[8192];
        this.field3208 = 0;
        this.field3195 = new class30();
        this.field3223 = 0;
        this.field3220 = new class227();
        this.field3229 = 0;
        this.method2075(6204);
    }
}
