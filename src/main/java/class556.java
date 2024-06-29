import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class556 extends class497 {

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Ljt;")
    public static class489 field8245 = new class489(2);

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field8252 = -1;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Lqp;")
    public static class586 field8253 = new class586(51, 8);

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
    public static int[] field8257 = new int[4096];

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public int field8249;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public int field8250;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public int field8255;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "J")
    public long field8254;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)I")
    public final int method30(boolean arg0) {
        field8258++;
        if (!arg0) {
            this.field8249 = 76;
        }
        return 0;
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I")
    public final int method31(int arg0) {
        if (arg0 < 1) {
            field8245 = null;
        }
        field8246++;
        return this.field8249;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)I")
    public final int method34(int arg0) {
        if (arg0 != -3797) {
            method3243(-89);
        }
        field8251++;
        return this.field8255;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)J")
    public final long method33(int arg0) {
        if (arg0 != 3) {
            this.field8250 = 79;
        }
        field8248++;
        return this.field8254;
    }

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)V")
    public static void method3243(int arg0) {
        if (arg0 != -26344) {
            method3243(-61);
        }
        field8245 = null;
        field8257 = null;
        field8253 = null;
    }

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "(I)V")
    public static final void method3244(int arg0) {
        field8247++;
        class619.method3586(101, class106.field1333);
        class431.field6322++;
        if (class186.field2824 && class591.field8751) {
            if (arg0 != -2) {
                field8245 = null;
            }
            int var1 = class350.field5071.method635(arg0 ^ 0xBE);
            int var2 = class350.field5071.method633((byte) 29);
            int var3 = var2 - class465.field6732;
            int var4 = var1 - class158.field2107;
            if (var4 < class215.field3151) {
                var4 = class215.field3151;
            }
            if (var4 + class106.field1333.field4543 > class215.field3151 + class533.field7896.field4543) {
                var4 = class533.field7896.field4543 + class215.field3151 - class106.field1333.field4543;
            }
            if (class408.field5833 > var3) {
                var3 = class408.field5833;
            }
            if (class408.field5833 + class533.field7896.field4620 < class106.field1333.field4620 + var3) {
                var3 = class408.field5833 + class533.field7896.field4620 - class106.field1333.field4620;
            }
            int var5 = var4 - (class215.field3151 - class533.field7896.field4672);
            int var6 = var3 + class533.field7896.field4668 - class408.field5833;
            if (class350.field5071.method3398((byte) -113)) {
                if (class431.field6322 > class106.field1333.field4675) {
                    int var8 = var4 - class117.field1532;
                    int var9 = var3 - class2.field9;
                    if (class106.field1333.field4685 < var8 || -class106.field1333.field4685 > var8 || class106.field1333.field4685 < var9 || (-class106.field1333.field4685) > var9) {
                        class59.field711 = true;
                    }
                }
                if (class106.field1333.field4600 != null && class59.field711) {
                    class355 var10 = new class355();
                    var10.field5158 = var5;
                    var10.field5150 = class106.field1333;
                    var10.field5160 = class106.field1333.field4600;
                    var10.field5161 = var6;
                    class330.method2072(var10);
                }
            } else {
                if (class59.field711) {
                    class178.method1188((byte) -49);
                    if (class106.field1333.field4586 != null) {
                        class355 var7 = new class355();
                        var7.field5158 = var5;
                        var7.field5160 = class106.field1333.field4586;
                        var7.field5150 = class106.field1333;
                        var7.field5159 = class343.field5011;
                        var7.field5161 = var6;
                        class330.method2072(var7);
                    }
                    if (class343.field5011 != null && client.method3603(class106.field1333) != null) {
                        class536.method3154(class343.field5011, (byte) -98, class106.field1333);
                    }
                } else if ((class579.field8532 == 1 || class325.method2038(2)) && class487.field7385 > 2) {
                    class372.method2271(1, class465.field6732 + class2.field9, class158.field2107 + class117.field1532);
                } else if (class372.method2266(arg0 + 2)) {
                    class372.method2271(1, class465.field6732 + class2.field9, class158.field2107 + class117.field1532);
                }
                class106.field1333 = null;
            }
        } else if (class431.field6322 > 1) {
            class106.field1333 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
    public final int method32(byte arg0) {
        field8256++;
        int var2 = -14 / ((arg0 + 70) / 43);
        return this.field8250;
    }
}
