import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class106 extends class786 {

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lvha;")
    public static class71 field1447 = new class71("RC", 1);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1448 = 1;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
    public static int[] field1449 = new int[50];

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "B")
    public byte field1446;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lmc;")
    public class234 field1443;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lwm;")
    public static class30 field1439;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)[B")
    public final byte[] method629(int arg0) {
        if (arg0 != 0) {
            method633(69);
        }
        ++field1441;
        if (!super.field10779 && ~this.field1443.field3133 <= ~(this.field1443.field3193.length + -this.field1446)) {
            return this.field1443.field3193;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public final int method630(boolean arg0) {
        if (!arg0) {
            field1439 = null;
        }
        ++field1440;
        return this.field1443 == null ? 0 : this.field1443.field3133 * 100 / (this.field1443.field3193.length + -this.field1446);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfda;I)I")
    public static final int method631(class381 arg0, int arg1) {
        int var2 = 88 / ((arg1 - -34) / 59);
        ++field1444;
        if (arg0.field4750 == 0) {
            return 0;
        } else {
            if (~arg0.field4723 != 0) {
                class381 var3 = null;
                if (~arg0.field4723 > -32769) {
                    class232 var4 = (class232) class444.field5811.method2616((long) arg0.field4723, (byte) 32);
                    if (var4 != null) {
                        var3 = var4.field3125;
                    }
                } else if (arg0.field4723 >= 32768) {
                    var3 = class263.field3508[arg0.field4723 - 32768];
                }
                if (var3 != null) {
                    int var5 = -var3.field2896 + arg0.field2896;
                    int var6 = -var3.field2900 + arg0.field2900;
                    if (var5 != 0 || var6 != 0) {
                        arg0.method2171((int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 16383, false);
                    }
                }
            }
            if (!(arg0 instanceof class33)) {
                if (arg0 instanceof class727) {
                    class727 var7 = (class727) arg0;
                    if (~var7.field9536 != 0 && (~var7.field4764 == -1 || var7.field4759 > 0)) {
                        int var8 = -((var7.field9536 - class714.field9407 + -class714.field9407) * 256) + var7.field2896;
                        int var9 = -((-class240.field3293 + var7.field9549 + -class240.field3293) * 256) + var7.field2900;
                        if (var8 != 0 || ~var9 != -1) {
                            var7.method2171(16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var9)), false);
                        }
                        var7.field9536 = -1;
                    }
                }
            } else {
                class33 var10 = (class33) arg0;
                if (~var10.field347 != 0 && (var10.field4764 == 0 || var10.field4759 > 0)) {
                    var10.method2171(var10.field347, false);
                    var10.field347 = -1;
                }
            }
            return arg0.method2178(true);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public static final void method632(int arg0, int arg1) {
        class736 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class358 var4 = class383.field4790[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class559.field7102; ++var5) {
                    for (int var6 = 0; var6 < class330.field4039; ++var6) {
                        var2 = var4.method2065(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class88.field1221;
                            int var8 = var5 << class88.field1221;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class358 var10 = class383.field4790[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2060(var5, -116, var6) - var10.method2060(var5, -119, var6);
                                    int var12 = var4.method2060(var5, -128, var6 + 1) - var10.method2060(var5, -95, var6 + 1);
                                    int var13 = var4.method2060(var5 + 1, -112, var6 + 1) - var10.method2060(var5 + 1, -127, var6 + 1);
                                    int var14 = var4.method2060(var5 + 1, -95, var6) - var10.method2060(var5 + 1, -100, var6);
                                    var10.method2067(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1439 = null;
        field1449 = null;
        if (arg0 != -9801) {
            field1449 = null;
        }
        field1447 = null;
    }
}
