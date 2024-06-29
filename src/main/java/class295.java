import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class295 extends class193 {

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public int field4938 = 0;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "Z")
    public boolean field4943 = false;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lk;")
    private class245 field4934 = new class245();

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    private int field4952 = 0;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Lam;")
    public class277 field4951 = new class277();

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "Z")
    private boolean field4969 = false;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
    private int field4971 = 0;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "Z")
    private boolean field4974 = false;

    @OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[Lkf;")
    public class103[] field4936;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "J")
    private long field4946;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field4932 = 0;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field4942 = 0;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Z")
    public static boolean field4944 = false;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field4947 = 0;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Z")
    public static boolean field4950 = false;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field4948 = 0;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Loi;")
    public static class33 field4941 = new class33(8);

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[Z")
    private static boolean[] field4953 = new boolean[8];

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field4959 = 0;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "[Z")
    private static boolean[] field4958 = new boolean[8];

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    private static int field4954 = 0;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field4961 = 2;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lbc;")
    private static class153 field4956 = new class153(131056);

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!ab", name = "pb", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "J")
    private long field4935;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "J")
    public long field4940;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lk;")
    private static class245 field4937;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4945;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "[I")
    public static int[] field4957;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[I")
    public static int[] field4960;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[Lkf;")
    public static class103[] field4933;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[[S")
    public static short[][] field4955;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "[[S")
    public static short[][] field4966;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 8)
    public static final void method2023() {
        GL var0 = class147.field2479;
        var0.glEnableClientState(32885);
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 16)
    public static final void method2024(int arg0) {
        field4961 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 19)
    public final void method2025() {
        this.field4943 = true;
        for (class112 var1 = (class112) this.field4951.method1936(16173); var1 != null; var1 = (class112) this.field4951.method1926((byte) 90)) {
            if (var1.field2015.field4638.field4570 == 1) {
                var1.method358((byte) 52);
            }
        }
        this.field4936 = new class103[8192];
        this.field4938 = 0;
        this.field4934 = new class245();
        this.field4952 = 0;
        this.field4951 = new class277();
        this.field4971 = 0;
        this.method1339(0);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V", line = 41)
    public static final void method2026() {
        field4955 = (short[][]) null;
        field4966 = (short[][]) null;
        field4960 = null;
        field4957 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)V", line = 48)
    public final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field4943 || !this.field4974 || !class147.field2485) {
            return;
        }
        GL var10 = class147.field2479;
        int var11 = class129.field2252;
        int var12 = class191.field3210;
        int var13 = class37.field621;
        method2041(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16;
        if (this.field4967 == this.field4962 && this.field4964 == this.field4963) {
            var16 = 92;
        } else {
            int var17 = this.field4967 << 7;
            int var18 = (this.field4962 << 7) + 128;
            int var19 = this.field4963 << 7;
            int var20 = (this.field4964 << 7) + 128;
            int var21 = this.field4976 - var17;
            int var22 = var18 - this.field4976;
            if (var21 > var22) {
                int var23 = this.field4965 - var19;
                int var24 = var20 - this.field4965;
                if (var23 > var24) {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var23 * var23)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var24 * var24)) + 0.99D);
                }
            } else {
                int var25 = this.field4965 - var19;
                int var26 = var20 - this.field4965;
                if (var25 > var26) {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var25 * var25)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var26 * var26)) + 0.99D);
                }
            }
        }
        int var27 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var28 = (-var16 * arg2 - (this.field4975 - this.field4970) * arg1 >> 16) + var15;
        int var29 = var27 + 2 - var28;
        if (var29 >= 1600) {
            if (field4944) {
                System.out.println("Model too big for particles - radixsize:" + var29 + " maxmodelsize:" + 1600);
            }
            var10.glDepthMask(true);
            var10.glColorMaterial(1028, 5634);
            return;
        }
        class193 var30 = this.field4934.field4250;
        for (class193 var31 = var30.field3274; var31 != var30; var31 = var31.field3274) {
            class306 var32 = (class306) var31;
            for (int var33 = 0; var33 < var29; var33++) {
                field4960[var33] = 0;
            }
            for (int var34 = 0; var34 < 32; var34++) {
                field4957[var34] = 0;
            }
            field4959 = 0;
            class193 var35 = var32.field5203.field4250;
            for (class193 var36 = var35.field3274; var36 != var35; var36 = var36.field3274) {
                class103 var37 = (class103) var36;
                if (!var37.field1827) {
                    int var38 = (var37.field1831 >> 12) - var11;
                    int var39 = (var37.field1830 >> 12) - var12;
                    int var40 = (var37.field1833 >> 12) - var13;
                    int var41 = arg4 * var40 - arg3 * var38 >> 16;
                    int var42 = (arg1 * var39 + arg2 * var41 >> 16) - var28;
                    if (var42 < 0) {
                        var42 = 0;
                    } else if (var42 >= var29) {
                        var42 = var29 - 1;
                    }
                    if (field4960[var42] < 32) {
                        field4955[var42][field4960[var42]++] = var37.field1825;
                    } else {
                        if (field4960[var42] == 32) {
                            if (field4959 == 32) {
                                if (field4944) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field4960[var42] += field4959++ + 1;
                        }
                        short[] var10000 = field4966[field4960[var42] - 32 - 1];
                        int var10002 = field4960[var42] - 32 - 1;
                        int var10004 = field4957[field4960[var42] - 32 - 1];
                        field4957[var10002] = field4957[field4960[var42] - 32 - 1] + 1;
                        var10000[var10004] = var37.field1825;
                    }
                }
            }
            boolean var43 = false;
            if (field4950 && var32.field5195.field4980 != -1) {
                class102.field1821.method621(128, var32.field5195.field4980);
                var43 = true;
            } else {
                class147.method1002(-1);
            }
            var10.glPointSize((float) var32.field5195.field5033);
            this.method2030(var10, var29, var43, var32.field5195.field5028);
        }
        method2023();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(J)Z", line = 227)
    private final boolean method2028(long arg0) {
        long var3;
        if (this.field4946 > this.field4935) {
            var3 = this.field4946;
        } else {
            var3 = this.field4935;
        }
        int var5 = (int) (this.field4940 - var3);
        if (var5 > 750) {
            this.method2025();
            return false;
        }
        if (this.field4935 > 0L) {
            this.field4967 = this.field4976 - (this.field4977 << 6) >> 7;
            this.field4962 = ((this.field4977 << 6) + this.field4976 >> 7) - 1;
            this.field4963 = this.field4965 - (this.field4972 << 6) >> 7;
            this.field4964 = ((this.field4972 << 6) + this.field4965 >> 7) - 1;
            this.field4975 = this.field4978;
            if (this.field4973 < 3) {
                this.field4970 = class245.field4255[this.field4973 + 1][this.field4967][this.field4963] + class245.field4255[this.field4973 + 1][this.field4962][this.field4963] + class245.field4255[this.field4973 + 1][this.field4967][this.field4964] + class245.field4255[this.field4973 + 1][this.field4962][this.field4964] >> 2;
            } else {
                this.field4970 = this.field4975 - 1024;
            }
            this.field4974 = true;
            int var6 = class102.field1813[this.field4968];
            int var7 = class102.field1819[this.field4968];
            this.method2042(var6, var7);
            if (this.field4969) {
                class306 var8 = (class306) this.field4934.method1755((byte) -96);
                while (true) {
                    if (var8 == null) {
                        this.field4969 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field5195.field5027; var9++) {
                        var8.method2117(1, var7, this.field4940, 255, true, var6);
                    }
                    var8 = (class306) this.field4934.method1754(0);
                }
            }
            int var10 = (int) (arg0 - this.field4940);
            for (class306 var11 = (class306) this.field4934.method1755((byte) -96); var11 != null; var11 = (class306) this.field4934.method1754(0)) {
                var11.method2117(var10, var7, arg0, 255, var5 < 10, var6);
            }
        }
        this.field4940 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([Lbf;[Lmh;Z[I[I[I)V", line = 297)
    public final void method2029(class228[] arg0, class276[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field4943) {
            this.method2032(arg0, arg2, arg3, arg4, arg5);
            this.method2040(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 304)
    public final void method2030(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            arg0.glDisable(2896);
        }
        field4956.field2611 = 0;
        if (class147.field2482) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field4960[var5] > 32 ? 32 : field4960[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class103 var8 = this.field4936[field4955[var5][var7]];
                        field4956.method1047((float) (var8.field1831 >> 12), -100);
                        field4956.method1047((float) (var8.field1830 >> 12), -88);
                        field4956.method1047((float) (var8.field1833 >> 12), -70);
                        int var9 = var8.field1828;
                        field4956.method1075((byte) (var9 >> 16), -1);
                        field4956.method1075((byte) (var9 >> 8), -1);
                        field4956.method1075((byte) var9, -1);
                        field4956.method1075((byte) (var9 >> 24), -1);
                    }
                    if (field4960[var5] > 32) {
                        int var10 = field4960[var5] - 32 - 1;
                        for (int var11 = field4957[var10] - 1; var11 >= 0; var11--) {
                            class103 var12 = this.field4936[field4966[var10][var11]];
                            field4956.method1047((float) (var12.field1831 >> 12), -87);
                            field4956.method1047((float) (var12.field1830 >> 12), -124);
                            field4956.method1047((float) (var12.field1833 >> 12), -92);
                            int var13 = var12.field1828;
                            field4956.method1075((byte) (var13 >> 16), -1);
                            field4956.method1075((byte) (var13 >> 8), -1);
                            field4956.method1075((byte) var13, -1);
                            field4956.method1075((byte) (var13 >> 24), -1);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field4960[var14] > 32 ? 32 : field4960[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class103 var17 = this.field4936[field4955[var14][var16]];
                        field4956.method1081((float) (var17.field1831 >> 12), true);
                        field4956.method1081((float) (var17.field1830 >> 12), true);
                        field4956.method1081((float) (var17.field1833 >> 12), true);
                        int var18 = var17.field1828;
                        field4956.method1075((byte) (var18 >> 16), -1);
                        field4956.method1075((byte) (var18 >> 8), -1);
                        field4956.method1075((byte) var18, -1);
                        field4956.method1075((byte) (var18 >> 24), -1);
                    }
                    if (field4960[var14] > 32) {
                        int var19 = field4960[var14] - 32 - 1;
                        for (int var20 = field4957[var19] - 1; var20 >= 0; var20--) {
                            class103 var21 = this.field4936[field4966[var19][var20]];
                            field4956.method1081((float) (var21.field1831 >> 12), true);
                            field4956.method1081((float) (var21.field1830 >> 12), true);
                            field4956.method1081((float) (var21.field1833 >> 12), true);
                            int var22 = var21.field1828;
                            field4956.method1075((byte) (var22 >> 16), -1);
                            field4956.method1075((byte) (var22 >> 8), -1);
                            field4956.method1075((byte) var22, -1);
                            field4956.method1075((byte) (var22 >> 24), -1);
                        }
                    }
                }
            }
        }
        if (field4956.field2611 != 0) {
            if (class147.field2510) {
                arg0.glBindBufferARB(34962, 0);
            }
            this.field4945 = ByteBuffer.allocateDirect(field4956.field2611).order(ByteOrder.nativeOrder());
            this.field4945.put(field4956.field2598, 0, field4956.field2611);
            this.field4945.flip();
            this.field4945.position(0);
            arg0.glVertexPointer(3, 5126, 16, this.field4945);
            this.field4945.position(12);
            arg0.glColorPointer(4, 5121, 16, this.field4945);
            arg0.glDrawArrays(0, 0, field4956.field2611 >> 4);
        }
        if (!arg3) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()I", line = 451)
    public static final int method2031() {
        return field4961;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([Lbf;Z[I[I[I)V", line = 456)
    private final void method2032(class228[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4958[var6] = false;
        }
        label64: for (class306 var7 = (class306) this.field4934.method1755((byte) -96); var7 != null; var7 = (class306) this.field4934.method1754(0)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field5220) {
                        field4958[var8] = true;
                        var7.field5186 = false;
                        continue label64;
                    }
                }
            }
            if (!arg1) {
                if (var7.field5192 == 0) {
                    var7.method1339(0);
                    this.field4952--;
                } else {
                    var7.field5186 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field4952 != 8; var9++) {
                if (!field4958[var9]) {
                    class306 var10 = new class306(arg0[var9], this, this.field4940);
                    this.field4934.method1753(var10, (byte) -34);
                    this.field4952++;
                }
            }
        }
        for (class306 var11 = (class306) this.field4934.method1755((byte) -96); var11 != null; var11 = (class306) this.field4934.method1754(0)) {
            var11.method2115(-117, arg4[var11.field5220.field3944], arg4[var11.field5220.field3942], arg3[var11.field5220.field3944], arg4[var11.field5220.field3947], arg2[var11.field5220.field3947], arg3[var11.field5220.field3947], arg2[var11.field5220.field3942], arg3[var11.field5220.field3942], arg2[var11.field5220.field3944]);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lum;)V", line = 537)
    public static final void method2033(class222 arg0) {
        field4948 = 0;
        field4932 = 0;
        field4937 = new class245();
        field4933 = new class103[1024];
        class289.method2000(arg0, 255);
        class256.method1837((byte) 57, arg0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 545)
    public final void method2034(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4943) {
            return;
        }
        if (this.field4968 != arg0) {
            for (class306 var6 = (class306) this.field4934.method1755((byte) -96); var6 != null; var6 = (class306) this.field4934.method1754(0)) {
                var6.field5197 = true;
            }
        }
        this.field4935 = this.field4940;
        this.field4968 = arg0;
        this.field4973 = arg1;
        this.field4976 = arg2;
        this.field4978 = arg3;
        this.field4965 = arg4;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 571)
    public static void method2035() {
        field4937 = null;
        field4933 = null;
        field4941 = null;
        field4958 = null;
        field4953 = null;
        field4955 = (short[][]) null;
        field4966 = (short[][]) null;
        field4960 = null;
        field4957 = null;
        field4956 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(J)V", line = 587)
    public static final void method2036(long arg0) {
        field4947 = 0;
        field4942 = 0;
        long var2 = class57.method391(19211);
        for (class295 var4 = (class295) field4937.method1755((byte) -96); var4 != null; var4 = (class295) field4937.method1754(0)) {
            if (var4.method2028(arg0)) {
                field4947++;
            }
        }
        if (field4944 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field4937.method1757(false) + ", running: " + field4947 + ". Particles: " + field4942 + ". Time taken: " + (class57.method391(19211) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V", line = 886)
    public class295(int arg0, int arg1, int arg2) {
        this.field4977 = arg1;
        this.field4972 = arg2;
        this.field4936 = new class103[8192];
        this.field4946 = (long) arg0;
        this.field4969 = true;
        field4937.method1753(this, (byte) -34);
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 616)
    public static final void method2037() {
        field4941 = new class33(8);
        field4954 = 0;
        for (class295 var0 = (class295) field4937.method1755((byte) -96); var0 != null; var0 = (class295) field4937.method1754(0)) {
            var0.method2025();
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()V", line = 629)
    public final void method2038() {
        this.field4969 = true;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)V", line = 634)
    public final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2034(arg0, arg1, class129.field2252 + arg2, class191.field3210 + arg3, class37.field621 + arg4);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([Lmh;Z[I[I[I)V", line = 650)
    private final void method2040(class276[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4953[var6] = false;
        }
        label73: for (class112 var7 = (class112) this.field4951.method1936(16173); var7 != null; var7 = (class112) this.field4951.method1926((byte) 90)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field2015) {
                        field4953[var8] = true;
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var7.method961((byte) 119);
                this.field4971--;
                if (var7.method360(4)) {
                    var7.method358((byte) 52);
                    field4954--;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field4971 != 8; var9++) {
                if (!field4953[var9]) {
                    class112 var10 = null;
                    if (arg0[var9].field4638.field4570 == 1 && field4954 < 32) {
                        var10 = new class112(arg0[var9], this);
                        field4941.method253((long) arg0[var9].field4638.field4554, -1, var10);
                        field4954++;
                    }
                    if (var10 == null) {
                        var10 = new class112(arg0[var9], this);
                    }
                    this.field4951.method1940((byte) 43, var10);
                    this.field4971++;
                }
            }
        }
        for (class112 var11 = (class112) this.field4951.method1936(16173); var11 != null; var11 = (class112) this.field4951.method1926((byte) 90)) {
            var11.method775(arg3[var11.field2015.field4644], 30697, arg2[var11.field2015.field4644], arg4[var11.field2015.field4644]);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V", line = 743)
    public static final void method2041(int arg0, int arg1, int arg2) {
        GL var3 = class147.field2479;
        var3.glDepthMask(false);
        class171.method1211(0, 0, false);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class331.field5645, 0);
        var3.glDisableClientState(32885);
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 759)
    private final void method2042(int arg0, int arg1) {
        for (class112 var3 = (class112) this.field4951.method1936(16173); var3 != null; var3 = (class112) this.field4951.method1926((byte) 90)) {
            var3.field2027 = this.field4976 + var3.field2026;
            var3.field2023 = this.field4978 + var3.field2011;
            var3.field2021 = this.field4965 + var3.field2022;
            if (this.field4968 == 0) {
                var3.field2020 = var3.field2015.field4638.field4552;
                var3.field2012 = var3.field2015.field4638.field4567;
            } else {
                int var4 = var3.field2015.field4638.field4552;
                int var5 = var3.field2015.field4638.field4567;
                var3.field2020 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field2012 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()V", line = 789)
    public static final void method2043() {
        GL var0 = class147.field2479;
        var0.glEnable(34913);
        float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
        var0.glPointParameterfvARB(33065, var1, 0);
        FloatBuffer var2 = FloatBuffer.allocate(1);
        var0.glGetFloatv(33063, var2);
        float var3 = var2.get(0);
        if (var3 > 64.0F) {
            var3 = 64.0F;
        }
        var0.glPointParameterfARB(33062, 1.0F);
        var0.glPointParameterfARB(33063, var3);
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
            field4950 = true;
            var0.glTexEnvi(34913, 34914, 1);
        }
        field4955 = new short[1600][32];
        field4966 = new short[32][768];
        field4960 = new int[1600];
        field4957 = new int[32];
    }
}
