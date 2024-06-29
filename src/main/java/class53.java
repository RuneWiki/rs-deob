import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class53 extends class79 {

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "[B")
    public byte[] field852;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lck;")
    public static class119 field850 = class298.method1987((byte) 63, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lck;")
    private static class119 field857 = class298.method1987((byte) 25, "shake:");

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Lck;")
    public static class119 field855 = field857;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lck;")
    public static class119 field849 = field857;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lck;")
    public static class119 field853 = class298.method1987((byte) 47, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Lva;")
    public static class36 field856;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 6)
    public static final void method395(int arg0) {
        field851++;
        int var1 = class234.field3775 * 128 + 64;
        int var2 = class232.field3743 * 128 + 64;
        int var3 = class207.method1304(class10.field189, (byte) 123, var1, var2) - class240.field3845;
        if (class22.field313 >= 100) {
            class62.field987 = class234.field3775 * 128 + 64;
            class70.field1097 = class232.field3743 * 128 + 64;
            class281.field4638 = class207.method1304(class10.field189, (byte) 98, class62.field987, class70.field1097) - class240.field3845;
        } else {
            if (var1 > class62.field987) {
                class62.field987 += class46.field680 + ((var1 - class62.field987) * class22.field313 / 1000);
                if (var1 < class62.field987) {
                    class62.field987 = var1;
                }
            }
            if (var2 > class70.field1097) {
                class70.field1097 += (var2 - class70.field1097) * class22.field313 / 1000 + class46.field680;
                if (var2 < class70.field1097) {
                    class70.field1097 = var2;
                }
            }
            if (class281.field4638 < var3) {
                class281.field4638 += (var3 - class281.field4638) * class22.field313 / 1000 + class46.field680;
                if (var3 < class281.field4638) {
                    class281.field4638 = var3;
                }
            }
            if (class62.field987 > var1) {
                class62.field987 -= (class62.field987 - var1) * class22.field313 / 1000 + class46.field680;
                if (class62.field987 < var1) {
                    class62.field987 = var1;
                }
            }
            if (var2 < class70.field1097) {
                class70.field1097 -= (class70.field1097 - var2) * class22.field313 / 1000 + class46.field680;
                if (var2 > class70.field1097) {
                    class70.field1097 = var2;
                }
            }
            if (class281.field4638 > var3) {
                class281.field4638 -= (class281.field4638 - var3) * class22.field313 / 1000 + class46.field680;
                if (class281.field4638 < var3) {
                    class281.field4638 = var3;
                }
            }
        }
        int var4 = class266.field4364 * 128 + 64;
        int var5 = class81.field1247 * 128 + 64;
        int var6 = class207.method1304(class10.field189, (byte) 106, var5, var4) - class229.field3704;
        int var7 = var6 - class281.field4638;
        int var8 = var5 - class62.field987;
        int var9 = var4 - class70.field1097;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var11 = arg0 & (int) (Math.atan2((double) var7, (double) var10) * 325.949D);
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class140.field2251;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class86.field1290 < var11) {
            class86.field1290 += class144.field2293 + ((var11 - class86.field1290) * class147.field2369 / 1000);
            if (var11 < class86.field1290) {
                class86.field1290 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < class86.field1290) {
            class86.field1290 -= (class86.field1290 - var11) * class147.field2369 / 1000 + class144.field2293;
            if (class86.field1290 < var11) {
                class86.field1290 = var11;
            }
        }
        if (var13 > 0) {
            class140.field2251 += class144.field2293 + (class147.field2369 * var13 / 1000);
            class140.field2251 &= 0x7FF;
        }
        if (var13 < 0) {
            class140.field2251 -= -var13 * class147.field2369 / 1000 + class144.field2293;
            class140.field2251 &= 0x7FF;
        }
        int var14 = var12 - class140.field2251;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class140.field2251 = var12;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 158)
    public static void method396(int arg0) {
        field857 = null;
        field853 = null;
        field850 = null;
        if (arg0 != 4) {
            method395(-83);
        }
        field849 = null;
        field856 = null;
        field855 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lsa;", line = 178)
    public static final class179 method397(int arg0, int arg1, int arg2) {
        if (arg1 != 1000) {
            return (class179) null;
        }
        field854++;
        class179 var3 = (class179) class231.field3732.method1329((byte) 90, (long) arg2 << 32 | (long) arg0);
        if (var3 == null) {
            var3 = new class179(arg2, arg0);
            class231.field3732.method1326(var3.field1218, (byte) -108, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V", line = 214)
    public class53(byte[] arg0) {
        this.field852 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lck;Lml;I)Lck;", line = 239)
    public static final class119 method398(class119 arg0, class134 arg1, int arg2) {
        if (~arg0.method788(1, class244.field3963) != arg2) {
            label61: while (true) {
                int var3 = arg0.method788(1, class108.field1655);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method788(1, class144.field2291);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method788(arg2 + 1, class166.field2620);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method788(1, class156.field2498);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method788(1, class109.field1667);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method788(1, class195.field3128);
                                                        if (var8 == -1) {
                                                            break label61;
                                                        }
                                                        class119 var9 = class203.field3220;
                                                        if (class247.field4001 != null) {
                                                            var9 = class88.method597(class247.field4001.field4500, arg2 + 1361938307);
                                                            try {
                                                                if (class247.field4001.field4499 != null) {
                                                                    byte[] var10 = ((String) class247.field4001.field4499).getBytes("ISO-8859-1");
                                                                    var9 = class250.method1615(var10, var10.length, 0, -80);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class170.method1074(new class119[] { arg0.method762(var8, 0, 0), var9, arg0.method769(arg2 ^ 0xFFFFFFC8, var8 + 4) }, -107);
                                                    }
                                                }
                                                arg0 = class170.method1074(new class119[] { arg0.method762(var7, 0, 0), class68.method497(false, class36.method269(arg1, (byte) -37, 4)), arg0.method769(arg2 ^ 0xFFFFFFB2, var7 + 2) }, -112);
                                            }
                                        }
                                        arg0 = class170.method1074(new class119[] { arg0.method762(var6, 0, 0), class68.method497(false, class36.method269(arg1, (byte) -65, 3)), arg0.method769(-53, var6 + 2) }, -94);
                                    }
                                }
                                arg0 = class170.method1074(new class119[] { arg0.method762(var5, 0, 0), class68.method497(false, class36.method269(arg1, (byte) -89, 2)), arg0.method769(-74, var5 + 2) }, arg2 - 102);
                            }
                        }
                        arg0 = class170.method1074(new class119[] { arg0.method762(var4, arg2 ^ 0x0, 0), class68.method497(false, class36.method269(arg1, (byte) -120, 1)), arg0.method769(-128, var4 + 2) }, -68);
                    }
                }
                arg0 = class170.method1074(new class119[] { arg0.method762(var3, arg2 ^ 0x0, 0), class68.method497(false, class36.method269(arg1, (byte) -114, 0)), arg0.method769(-60, var3 + 2) }, arg2 - 72);
            }
        }
        field858++;
        return arg0;
    }
}
