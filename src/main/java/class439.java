import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class439 extends class381 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lwe;")
    public class279 field6565;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field6563 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method2647(int arg0, int arg1) {
        if (arg0 >= -28) {
            method2649((byte) -1, null);
        }
        class314.field4473 = arg1;
        field6562++;
        class420.field6325.method1540(0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method2648(int arg0) {
        field6566++;
        for (int var1 = 0; var1 < class299.field4256; var1++) {
            class297 var2 = class333.field4700[var1];
            boolean var3 = false;
            if (var2.field4226 == null) {
                var2.field4234--;
                if ((var2.field4227 == 2 ? -1500 : -10) <= var2.field4234) {
                    if (var2.field4227 == 1 && var2.field4225 == null) {
                        var2.field4225 = class488.method2896(class65.field976, var2.field4222, 0);
                        if (var2.field4225 == null) {
                            continue;
                        }
                        var2.field4234 += var2.field4225.method2897();
                    } else if (var2.field4227 == 2 && (var2.field4224 == null || var2.field4223 == null)) {
                        if (var2.field4224 == null) {
                            var2.field4224 = class383.method2345(class157.field2296, var2.field4222);
                        }
                        if (var2.field4224 == null) {
                            continue;
                        }
                        if (var2.field4223 == null) {
                            var2.field4223 = var2.field4224.method2342(new int[] { 22050 });
                            if (var2.field4223 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field4234 < 0) {
                        int var4;
                        if (var2.field4220 == 0) {
                            var4 = class426.field6401.field1022 * var2.field4221 >> 8;
                        } else {
                            int var5 = (var2.field4220 & 0x3198B7A) >> 24;
                            if (class500.field7365.field1768 == var5) {
                                int var6 = var2.field4220 & 0xFF << 7;
                                int var7 = var2.field4220 >> 16 & 0xFF;
                                int var8 = (var7 << 7) - (class500.field7365.field1763 - 64);
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field4220 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class500.field7365.field1769;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var6 < var11) {
                                    var2.field4234 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class426.field6401.field996 * var2.field4221 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class319 var12 = null;
                            if (var2.field4227 == 1) {
                                var12 = var2.field4225.method2898().method1989(class158.field2320);
                            } else if (var2.field4227 == 2) {
                                var12 = var2.field4223;
                            }
                            class97 var13 = var2.field4226 = class97.method596(var12, 100, var4);
                            var13.method588(var2.field4229 - 1);
                            class366.field5591.method1792(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field4226.method2050(1)) {
                var3 = true;
            }
            if (var3) {
                class299.field4256--;
                for (int var14 = var1; var14 < class299.field4256; var14++) {
                    class333.field4700[var14] = class333.field4700[var14 + 1];
                }
                var1--;
            }
        }
        if (class104.field1515 && !class6.method40((byte) -64)) {
            if (class426.field6401.field1018 != 0 && class386.field5852 != -1) {
                class122.method799(class465.field6881, false, (byte) -16, 0, class426.field6401.field1018, class386.field5852);
            }
            class104.field1515 = false;
        } else if (class426.field6401.field1018 != 0 && class386.field5852 != -1 && !class6.method40((byte) -64)) {
            class104.field1494++;
            class291.method1861((byte) -104, class462.field6855);
            class356.field5471.method1415(class386.field5852, (byte) -56);
            class386.field5852 = -1;
        }
        if (arg0 != -16235) {
            field6563 = 81;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lod;II[B)V")
    public class439(class349 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6565 = class479.method2853(false, arg0, arg2, (byte) 86, arg1, 6406, 6406, arg3);
        this.field6565.method1730(false, 10497, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method2649(byte arg0, String arg1) {
        field6564++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        int var7 = -128 / ((-arg0 - 68) / 50);
        return var2;
    }
}
