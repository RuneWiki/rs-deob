import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class283 extends class134 {

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4456 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[C")
    public static char[] field4461 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[J")
    public static long[] field4464 = new long[100];

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "J")
    public static long field4459 = 0L;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4462 = "Loading defaults - ";

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
    public static final void method1909(int arg0, byte arg1) {
        field4460++;
        if (arg0 >= 0 && arg0 < class262.field4147.length) {
            class262.field4147[arg0] = !class262.field4147[arg0];
            if (arg1 > -96) {
                method1912((class31) null, 121);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4463++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg5 - arg2;
        int var12 = arg6 - arg2;
        int var13 = arg6 * arg6;
        int var14 = var12 * var12;
        int var15 = var11 * var11;
        if (arg4 <= 26) {
            method1910(30, -88, 42, 84, (byte) -31, 88, 51, 106);
        }
        int var16 = arg5 * arg5;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var11 << 1;
        int var21 = var14 << 1;
        int var22 = arg5 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = (1 - var20) * var14 + var19;
        int var25 = var16 - ((var22 - 1) * var18);
        int var26 = var15 - ((var20 - 1) * var21);
        int var27 = var16 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var15 << 2;
        int var32 = (var20 - 3) * var21;
        int var33 = (var22 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = var27;
        int var36 = (arg5 - 1) * var28;
        int var37 = var31;
        int var38 = (var11 - 1) * var29;
        if (arg7 >= class112.field1727 && class278.field4410 >= arg7) {
            int[] var39 = class55.field872[arg7];
            int var40 = class47.method396(class184.field2914, arg3 - arg6, -96, class2.field42);
            int var41 = class47.method396(class184.field2914, arg3 + arg6, 87, class2.field42);
            int var42 = class47.method396(class184.field2914, arg3 - var12, 103, class2.field42);
            int var43 = class47.method396(class184.field2914, arg3 + var12, -127, class2.field42);
            class173.method1240((byte) -112, var42, var39, arg1, var40);
            class173.method1240((byte) -48, var43, var39, arg0, var42);
            class173.method1240((byte) -103, var41, var39, arg1, var43);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var11;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var37;
                        var10++;
                        var37 += var31;
                        var24 += var34;
                        var34 += var31;
                    }
                }
                if (var26 < 0) {
                    var24 += var34;
                    var34 += var31;
                    var10++;
                    var26 += var37;
                    var37 += var31;
                }
                var24 += -var38;
                var38 -= var29;
                var26 += -var32;
                var32 -= var29;
            }
            var9--;
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var30;
                    var25 += var35;
                    var30 += var27;
                    var35 += var27;
                }
            }
            int var45 = arg7 + var9;
            int var46 = arg7 - var9;
            if (var25 < 0) {
                var8++;
                var23 += var30;
                var25 += var35;
                var30 += var27;
                var35 += var27;
            }
            var23 += -var36;
            var25 += -var33;
            var36 -= var28;
            if (var45 >= class112.field1727 && var46 <= class278.field4410) {
                int var47 = class47.method396(class184.field2914, arg3 + var8, -113, class2.field42);
                int var48 = class47.method396(class184.field2914, arg3 - var8, 120, class2.field42);
                if (var44) {
                    int var49 = class47.method396(class184.field2914, arg3 + var10, 24, class2.field42);
                    int var50 = class47.method396(class184.field2914, arg3 - var10, 70, class2.field42);
                    if (class112.field1727 <= var46) {
                        int[] var51 = class55.field872[var46];
                        class173.method1240((byte) -128, var50, var51, arg1, var48);
                        class173.method1240((byte) -56, var49, var51, arg0, var50);
                        class173.method1240((byte) -98, var47, var51, arg1, var49);
                    }
                    if (class278.field4410 >= var45) {
                        int[] var52 = class55.field872[var45];
                        class173.method1240((byte) -70, var50, var52, arg1, var48);
                        class173.method1240((byte) -98, var49, var52, arg0, var50);
                        class173.method1240((byte) -103, var47, var52, arg1, var49);
                    }
                } else {
                    if (class112.field1727 <= var46) {
                        class173.method1240((byte) -99, var47, class55.field872[var46], arg1, var48);
                    }
                    if (var45 <= class278.field4410) {
                        class173.method1240((byte) -65, var47, class55.field872[var45], arg1, var48);
                    }
                }
            }
            var33 -= var28;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4461 = null;
        field4462 = null;
        int var1 = -61 / ((arg0 - 46) / 59);
        field4464 = null;
        field4456 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lha;I)V")
    public static final void method1912(class31 arg0, int arg1) {
        field4458++;
        for (int var2 = 0; var2 < class278.field4413; var2++) {
            int var3 = arg0.method276((byte) 108);
            int var4 = arg0.method260((byte) -67);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class211.field3251[var3] != null) {
                class211.field3251[var3].field1998 = var4;
            }
        }
        if (arg1 <= 32) {
            field4456 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class283() {
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method1913(int arg0) {
        class189.field2961 = arg0;
        for (int var1 = 0; var1 < class235.field3716; var1++) {
            for (int var2 = 0; var2 < class291.field4515; var2++) {
                if (class149.field2210[arg0][var1][var2] == null) {
                    class149.field2210[arg0][var1][var2] = new class22(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
    public class283(int arg0) {
        this.field4457 = arg0;
    }
}
