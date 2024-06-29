import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class268 extends class264 {

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    private int field4603 = 2048;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    private int field4607 = 5;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "[B")
    private byte[] field4609 = new byte[512];

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    private int field4606 = 1;

    @OriginalMember(owner = "client!pb", name = "vb", descriptor = "I")
    private int field4617 = 2;

    @OriginalMember(owner = "client!pb", name = "yb", descriptor = "[S")
    private short[] field4620 = new short[512];

    @OriginalMember(owner = "client!pb", name = "wb", descriptor = "I")
    private int field4618 = 5;

    @OriginalMember(owner = "client!pb", name = "ub", descriptor = "I")
    private int field4616 = 0;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lma;")
    public static class5 field4611 = class12.method119("settings", (byte) 55);

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lma;")
    public static class5 field4613 = class12.method119("<col=ff0000>", (byte) 86);

    @OriginalMember(owner = "client!pb", name = "Ab", descriptor = "Lbf;")
    public static class209 field4622 = new class209(4096);

    @OriginalMember(owner = "client!pb", name = "Bb", descriptor = "Lma;")
    public static class5 field4623 = class12.method119("Verbindung abgebrochen)3", (byte) 95);

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pb", name = "xb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!pb", name = "zb", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "[I")
    public static int[] field4610;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 10)
    public class268() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)V", line = 22)
    public static final void method1842(int arg0) {
        class286.field4820 = arg0;
        for (int var1 = 0; var1 < class115.field1721; var1++) {
            for (int var2 = 0; var2 < class179.field2708; var2++) {
                if (class43.field646[arg0][var1][var2] == null) {
                    class43.field646[arg0][var1][var2] = new class198(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)V", line = 51)
    private final void method1843(int arg0) {
        field4602++;
        Random var2 = new Random((long) this.field4616);
        this.field4620 = new short[arg0];
        if (this.field4603 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4620[var3] = (short) class81.method555((byte) -57, this.field4603, var2);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([JB[I)V", line = 76)
    public static final void method1844(long[] arg0, byte arg1, int[] arg2) {
        if (arg1 == -59) {
            method1847(arg0, arg1 - 5320, arg2, 0, arg0.length - 1);
            field4612++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILii;)V", line = 94)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            this.field4617 = 18;
        }
        if (arg0 == 0) {
            this.field4618 = this.field4607 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field4616 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field4603 = arg2.method1524((byte) 117);
        } else if (arg0 == 3) {
            this.field4617 = arg2.method1509(true);
        } else if (arg0 == 4) {
            this.field4606 = arg2.method1509(true);
        } else if (arg0 == 5) {
            this.field4618 = arg2.method1509(true);
        } else if (arg0 == 6) {
            this.field4607 = arg2.method1509(true);
        }
        field4608++;
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V", line = 179)
    public final void method111(int arg0) {
        int var2 = 110 % ((66 - arg0) / 44);
        field4605++;
        this.field4609 = class196.method1290(108, this.field4616);
        this.method1843(512);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[I", line = 195)
    public final int[] method5(int arg0, int arg1) {
        field4619++;
        int[] var3 = this.field4501.method1176(arg1, 122);
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1] * this.field4607 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class226.field3716; var7++) {
                client.field1761 = Integer.MAX_VALUE;
                class68.field1085 = Integer.MAX_VALUE;
                class253.field4331 = Integer.MAX_VALUE;
                class213.field3386 = Integer.MAX_VALUE;
                int var8 = class251.field4159[var7] * this.field4618 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4609[(this.field4607 <= var11 ? var11 - this.field4607 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4609[var12 + (this.field4618 <= var13 ? var13 - this.field4618 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = -this.field4620[var14] - ((var13 << 12) - var8);
                        int var16 = var4 - (var11 << 12) - this.field4620[var27];
                        int var17 = this.field4606;
                        int var21;
                        if (var17 == 1) {
                            var21 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var21 = var25 > var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var18 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var19 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var20 = var18 + var19;
                            var21 = var20 * var20 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var15 * var15;
                            int var23 = var16 * var16;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var21 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class213.field3386 > var21) {
                            client.field1761 = class68.field1085;
                            class68.field1085 = class253.field4331;
                            class253.field4331 = class213.field3386;
                            class213.field3386 = var21;
                        } else if (var21 < class253.field4331) {
                            client.field1761 = class68.field1085;
                            class68.field1085 = class253.field4331;
                            class253.field4331 = var21;
                        } else if (var21 < class68.field1085) {
                            client.field1761 = class68.field1085;
                            class68.field1085 = var21;
                        } else if (client.field1761 > var21) {
                            client.field1761 = var21;
                        }
                    }
                }
                int var26 = this.field4617;
                if (var26 == 0) {
                    var3[var7] = class213.field3386;
                } else if (var26 == 1) {
                    var3[var7] = class253.field4331;
                } else if (var26 == 3) {
                    var3[var7] = class68.field1085;
                } else if (var26 == 4) {
                    var3[var7] = client.field1761;
                } else if (var26 == 2) {
                    var3[var7] = class253.field4331 - class213.field3386;
                }
            }
        }
        return arg0 > -58 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V", line = 409)
    public static void method1845(byte arg0) {
        field4623 = null;
        field4613 = null;
        field4622 = null;
        field4611 = null;
        field4610 = null;
        if (arg0 < 112) {
            field4623 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(III)V", line = 431)
    public static final void method1846(int arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        var4[0] = arg1;
        int var5 = 1;
        field4621++;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class166.field2535[var6] != arg2) {
                var3[var5] = class166.field2535[var6];
                var4[var5] = class267.field4596[var6];
                var5++;
            }
        }
        class166.field2535 = var3;
        if (arg0 != 2) {
            field4610 = (int[]) null;
        }
        class267.field4596 = var4;
        class210.method1393(class266.field4549, arg0 ^ 0x7A, 0, class266.field4549.length - 1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([JI[III)V", line = 478)
    private static final void method1847(long[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 != -5379) {
            return;
        }
        field4601++;
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        long var6 = arg0[var5];
        arg0[var5] = arg0[arg4];
        int var8 = arg3;
        arg0[arg4] = var6;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var9;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg0[var10] < ((long) (var10 & 0x1) + var6)) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var8];
                arg0[var8] = var11;
                int var13 = arg2[var10];
                arg2[var10] = arg2[var8];
                arg2[var8++] = var13;
            }
        }
        arg0[arg4] = arg0[var8];
        arg0[var8] = var6;
        arg2[arg4] = arg2[var8];
        arg2[var8] = var9;
        method1847(arg0, -5379, arg2, arg3, var8 - 1);
        method1847(arg0, -5379, arg2, var8 + 1, arg4);
    }

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "(I)V", line = 540)
    public static final void method1848(int arg0) {
        field4614++;
        if (arg0 != 0) {
            return;
        }
        if (class179.field2721 == 2) {
            if (class200.field3179 == class176.field2683 && class51.field808 == class151.field2198) {
                class179.field2721 = 0;
                class90.method593(class282.field4794 - 1, 0);
            }
        } else if (class176.field2683 == class104.field1545 && class51.field808 == class289.field4915) {
            class179.field2721 = 0;
            class90.method593(class282.field4794 - 1, 0);
        } else {
            class179.field2721 = 2;
            class151.field2198 = class289.field4915;
            class200.field3179 = class104.field1545;
        }
    }
}
