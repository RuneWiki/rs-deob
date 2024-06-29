import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class309 extends class310 {

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    private int field4920 = 0;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    private int field4928 = 2048;

    @OriginalMember(owner = "client!fo", name = "X", descriptor = "I")
    private int field4931 = 10;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "Z")
    public static boolean field4921 = false;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "[I")
    public static int[] field4923 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fo", name = "W", descriptor = "[I")
    public static int[] field4930 = new int[5];

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    public static int field4925 = 0;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!fo", name = "Y", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "[I")
    private int[] field4924;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "[I")
    private int[] field4927;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V", line = 4)
    public final void method553(byte arg0) {
        field4918++;
        this.method2196(-11223);
        if (arg0 >= -82) {
            this.field4931 = -36;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Lij;", line = 19)
    public static final class182 method2193(byte arg0, int arg1) {
        class182 var2 = (class182) class227.field3781.method2329((byte) 107, (long) arg1);
        field4922++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class316.field5034.method472(arg1, 92, 3);
        class182 var4 = new class182();
        if (var3 != null) {
            var4.method1428(new class227(var3), (byte) -3);
        }
        class227.field3781.method2333((long) arg1, 0, var4);
        if (arg0 != 93) {
            method2193((byte) -42, 35);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V", line = 42)
    public static void method2194(int arg0) {
        field4930 = null;
        field4923 = null;
        if (arg0 <= 107) {
            field4923 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIBII)V", line = 61)
    public static final void method2195(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4929++;
        int var5 = 25 % ((-arg2 - 55) / 58);
        if (class45.field704 == 0 || arg4 == 0 || class213.field3398 >= 50 || arg0 == -1) {
            return;
        }
        class252.field4269[class213.field3398] = arg0;
        class76.field1323[class213.field3398] = arg4;
        class240.field3962[class213.field3398] = arg1;
        class94.field1584[class213.field3398] = null;
        class43.field662[class213.field3398] = 0;
        class230.field3830[class213.field3398] = arg3;
        class213.field3398++;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V", line = 253)
    public class309() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V", line = 86)
    private final void method2196(int arg0) {
        this.field4924 = new int[this.field4931 + 1];
        this.field4927 = new int[this.field4931 + 1];
        field4919++;
        int var2 = 0;
        if (arg0 != -11223) {
            this.field4924 = (int[]) null;
        }
        int var3 = 4096 / this.field4931;
        int var4 = this.field4928 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4931; var5++) {
            this.field4924[var5] = var2;
            this.field4927[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4924[this.field4931] = 4096;
        this.field4927[this.field4931] = this.field4927[0] + 4096;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 != -13093) {
            this.method75((class227) null, -89, 116);
        }
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        field4932++;
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0];
            if (this.field4920 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4931; var12++) {
                    if (this.field4924[var12] <= var4 && var4 < this.field4924[var12 + 1]) {
                        if (this.field4927[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class242.method1839(var3, 0, class261.field4405, var11);
            } else {
                for (int var5 = 0; var5 < class261.field4405; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class293.field4737[var5];
                    int var9 = this.field4920;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var8 + var4 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field4931; var10++) {
                        if (this.field4924[var10] <= var7 && var7 < this.field4924[var10 + 1]) {
                            if (var7 < this.field4927[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lqm;II)V", line = 257)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field4926++;
        if (arg2 == 0) {
            this.field4931 = arg0.method1720((byte) -37);
        } else if (arg2 == 1) {
            this.field4928 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field4920 = arg0.method1720((byte) -19);
        }
        if (arg1 != -2470) {
            this.method77(-124, -101);
        }
    }
}
