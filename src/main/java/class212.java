import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class212 extends class303 {

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    private int field3383 = 4;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    private int field3384 = 4;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Z")
    public static boolean field3387 = true;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "[[[B")
    public static byte[][][] field3381;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 4)
    public static void method1536(byte arg0) {
        field3381 = (byte[][][]) null;
        if (arg0 <= 124) {
            field3387 = false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 14)
    public static final void method1537(int arg0, String arg1, String arg2, int arg3) {
        class68.field1095 = arg2;
        class168.field2602 = arg0;
        field3385++;
        class202.field3181 = arg1;
        if (class68.field1095.equals("") || class202.field3181.equals("")) {
            class307.field4839 = 3;
        } else if (class193.field3072 == -1) {
            class307.field4839 = -3;
            class198.field3132 = 1;
            class126.field2013 = 0;
            class147.field2373 = 0;
            class101 var4 = new class101(128);
            var4.method772((byte) -114, 10);
            var4.method784(arg3 ^ 0x7E16, (int) (Math.random() * 9.9999999E7D));
            var4.method760(class36.method281(50, class68.field1095), true);
            var4.method784(-98, (int) (Math.random() * 9.9999999E7D));
            var4.method754((byte) 103, class202.field3181);
            var4.method784(117, (int) (Math.random() * 9.9999999E7D));
            var4.method750(class127.field2019, class256.field3958, (byte) 83);
            class269.field4191.field1667 = 0;
            class269.field4191.method772((byte) -78, 24);
            if (arg3 != -32309) {
                method1538(false, (class305) null, -94, -27);
            }
            class269.field4191.method772((byte) -90, var4.field1667 + 2);
            class269.field4191.method728(533, 1234856744);
            class269.field4191.method743(var4.field1661, var4.field1667, 0, arg3 ^ 0x7E4B);
        } else {
            class272.method1965(false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I", line = 70)
    public final int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            field3387 = true;
        }
        int[][] var3 = this.field4772.method1175(-111, arg0);
        if (this.field4772.field2488) {
            int var4 = class247.field3815 / this.field3384;
            int var5 = class70.field1108 / this.field3383;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method2106(0, 0, 125);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method2106(class247.field3815 * var7 / var4, 0, arg1 - 7);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[0];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class70.field1108; var14++) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class70.field1108 * var16 / var5;
                }
                var11[var14] = var9[var15];
                var12[var14] = var8[var15];
                var13[var14] = var10[var15];
            }
        }
        field3377++;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILpe;I)V", line = 136)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field3379++;
        if (arg2 == 0) {
            this.field3383 = arg1.method741(63);
        } else if (arg2 == 1) {
            this.field3384 = arg1.method741(73);
        }
        if (arg0 != -4004) {
            method1539((class64) null, 89, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLhk;II)V", line = 172)
    public static final void method1538(boolean arg0, class305 arg1, int arg2, int arg3) {
        field3382++;
        if (arg0) {
            method1536((byte) 127);
        }
        if (arg1.field1458 == arg2 && arg2 != -1) {
            class269 var4 = class6.method28(arg2, 2);
            int var5 = var4.field4168;
            if (var5 == 1) {
                arg1.field1398 = arg3;
                arg1.field1414 = 0;
                arg1.field1422 = 1;
                arg1.field1401 = 0;
                arg1.field1410 = 0;
                class89.method632(var4, arg1.field1442, (byte) 100, arg1.field1369, false, arg1.field1414);
            }
            if (var5 == 2) {
                arg1.field1410 = 0;
            }
        } else if (arg2 == -1 || arg1.field1458 == -1 || class6.method28(arg2, 2).field4187 >= class6.method28(arg1.field1458, 2).field4187) {
            arg1.field1398 = arg3;
            arg1.field1434 = arg1.field1365;
            arg1.field1410 = 0;
            arg1.field1422 = 1;
            arg1.field1458 = arg2;
            arg1.field1414 = 0;
            arg1.field1401 = 0;
            if (arg1.field1458 != -1) {
                class89.method632(class6.method28(arg1.field1458, 2), arg1.field1442, (byte) 94, arg1.field1369, false, arg1.field1414);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lja;IB)Lbh;", line = 228)
    public static final class274 method1539(class64 arg0, int arg1, byte arg2) {
        if (arg2 > -113) {
            field3380 = 48;
        }
        field3388++;
        return class289.method2030(arg0, 128, arg1) ? class28.method182((byte) 115) : null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I", line = 246)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            method1538(true, (class305) null, -68, -89);
        }
        field3386++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class70.field1108 / this.field3383;
            int var5 = class247.field3815 / this.field3384;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2107(0, arg0 + 3, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2107(class247.field3815 * var7 / var5, arg0 ^ 0xFFFFFFFD, 0);
            }
            for (int var8 = 0; var8 < class70.field1108; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class70.field1108 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIBIII)V", line = 300)
    public static final void method1540(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg2;
        field3378++;
        int var8 = arg2 + arg4;
        int var9 = arg0 - arg2;
        for (int var10 = arg1; var10 < var7; var10++) {
            class86.method614(arg5, -24891, arg6, arg4, class102.field1729[var10]);
        }
        int var11 = -100 % ((arg3 + 56) / 55);
        int var12 = arg6 - arg2;
        for (int var13 = arg0; var13 > var9; var13--) {
            class86.method614(arg5, -24891, arg6, arg4, class102.field1729[var13]);
        }
        for (int var14 = var7; var14 <= var9; var14++) {
            int[] var15 = class102.field1729[var14];
            class86.method614(arg5, -24891, var8, arg4, var15);
            class86.method614(arg5, -24891, arg6, var12, var15);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)V", line = 342)
    public static final void method1541(int arg0, int arg1) {
        if (!field3387) {
            arg0 = -1;
        }
        field3376++;
        if (arg1 != -10658) {
            method1538(true, (class305) null, 77, 48);
        }
        if (class327.field5068 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class249 var2 = class104.method807(arg0, arg1 + 10658);
            class7 var3 = var2.method1765(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class83.field1235.method2222(var3.field2003, var3.field2004, class2.field7, 2, var3.method44(), new Point(var2.field3847, var2.field3844));
                class327.field5068 = arg0;
            }
        }
        if (arg0 == -1 && class327.field5068 != -1) {
            class83.field1235.method2222(-1, -1, class2.field7, 2, (int[]) null, new Point());
            class327.field5068 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 389)
    public class212() {
        super(1, false);
    }
}
