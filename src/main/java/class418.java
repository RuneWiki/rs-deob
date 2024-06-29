import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class418 extends class406 {

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Z")
    public boolean field5971;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public int field5982;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[Z")
    public static boolean[] field5974 = new boolean[100];

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "[Z")
    public static boolean[] field5985 = new boolean[8];

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "[I")
    public static int[] field5981 = new int[50];

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[B")
    public static byte[] field5984 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 9)
    public static final void method2652(String arg0, byte arg1) {
        field5980++;
        if (arg0 == null || arg1 > -56) {
            return;
        }
        if (!(class247.field3533 < 100 || class429.field6198) || class247.field3533 >= 200) {
            class105.method578(class132.field1605.method2331(25, class271.field3836), (byte) -45);
            return;
        }
        String var2 = class255.method1720((byte) 74, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class247.field3533; var3++) {
            String var7 = class255.method1720((byte) 74, class334.field4733[var3]);
            if (var7 != null && var7.equals(var2)) {
                class105.method578(arg0 + class4.field30.method2331(25, class271.field3836), (byte) -45);
                return;
            }
            if (class300.field4216[var3] != null) {
                String var8 = class255.method1720((byte) 74, class300.field4216[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class105.method578(arg0 + class4.field30.method2331(25, class271.field3836), (byte) -45);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class97.field1170; var4++) {
            String var5 = class255.method1720((byte) 74, class138.field1724[var4]);
            if (var5 != null && var5.equals(var2)) {
                class105.method578(class376.field5307.method2331(25, class271.field3836) + arg0 + class241.field3431.method2331(25, class271.field3836), (byte) -45);
                return;
            }
            if (class56.field680[var4] != null) {
                String var6 = class255.method1720((byte) 74, class56.field680[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class105.method578(class376.field5307.method2331(25, class271.field3836) + arg0 + class241.field3431.method2331(25, class271.field3836), (byte) -45);
                    return;
                }
            }
        }
        if (class255.method1720((byte) 74, class384.field5422.field487).equals(var2)) {
            class105.method578(class112.field1379.method2331(25, class271.field3836), (byte) -45);
        } else {
            class452.field6474++;
            class62.field718.method2143(224, -2);
            class62.field718.method1583(class81.method457(arg0, (byte) -49), (byte) -46);
            class62.field718.method1596(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 104)
    public static final void method2653(int arg0) {
        if (class200.field2847 != 0) {
            class101.field1235 -= class200.field2847 * 5;
            if (class101.field1235 >= class345.field4888) {
                class101.field1235 = class345.field4888 - 1;
            }
            if (class101.field1235 < 0) {
                class101.field1235 = 0;
            }
            class200.field2847 = 0;
        }
        if (class405.field5843 < 102) {
            class405.field5843 += 6;
        }
        field5977++;
        if (arg0 != -16777216) {
            return;
        }
        for (int var1 = 0; var1 < class82.field949; var1++) {
            int var2 = class114.field1402[var1].method161(-1);
            char var3 = class114.field1402[var1].method162(0);
            if (var2 == 84) {
                class451.method2795(false);
            } else if (class441.field6334.method2208(false, 82) && var2 == 66) {
                if (class176.field2402 != null) {
                    String var8 = "";
                    for (int var9 = class411.field5899.length - 1; var9 >= 0; var9--) {
                        if (class411.field5899[var9] != null && class411.field5899[var9].length() > 0) {
                            var8 = var8 + class411.field5899[var9] + '\n';
                        }
                    }
                    class176.field2402.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class441.field6334.method2208(false, 82) && var2 == 67) {
                if (class176.field2402 != null) {
                    Transferable var4 = class176.field2402.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class409.method2618(1, var5, '\n');
                                if (var6.length <= 1) {
                                    class377.field5318 = class377.field5318 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class377.field5318 = var6[var7];
                                        class451.method2795(false);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class18.field209 > 0) {
                class377.field5318 = class377.field5318.substring(0, class18.field209 - 1) + class377.field5318.substring(class18.field209);
                class18.field209--;
            } else if (var2 == 101 && class18.field209 < class377.field5318.length()) {
                class377.field5318 = class377.field5318.substring(0, class18.field209) + class377.field5318.substring(class18.field209 + 1);
            } else if (var2 == 96 && class18.field209 > 0) {
                class18.field209--;
            } else if (var2 == 97 && class18.field209 < class377.field5318.length()) {
                class18.field209++;
            } else if (var2 == 102) {
                class18.field209 = 0;
            } else if (var2 == 103) {
                class18.field209 = class377.field5318.length();
            } else if (var2 == 104 && class69.field790 < class411.field5899.length) {
                class69.field790++;
                class279.method1839((byte) 89);
                class18.field209 = class377.field5318.length();
            } else if (var2 == 105 && class69.field790 > 0) {
                class69.field790--;
                class279.method1839((byte) 89);
                class18.field209 = class377.field5318.length();
            } else if (class245.method1665(var3, 127) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class377.field5318 = class377.field5318.substring(0, class18.field209) + class114.field1402[var1].method162(0) + class377.field5318.substring(class18.field209);
                class18.field209++;
            }
        }
        class82.field949 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class447.field6410[var10]) {
                var10002 = class202.field2908[var10]++;
                if (class202.field2908[var10] > 102) {
                    class447.field6410[var10] = false;
                }
            } else {
                var10002 = class202.field2908[var10]--;
                if (class202.field2908[var10] < 0) {
                    class255.field3673[var10] = (int) (Math.random() * (double) class330.field4671);
                    class210.field2989[var10] = (int) (Math.random() * 350.0D);
                    class202.field2908[var10] = 0;
                    class447.field6410[var10] = true;
                }
            }
        }
        class406.method2593(false);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 304)
    public static final void method2654(int arg0) {
        class82.method460((byte) -83, class433.field6227);
        field5976++;
        int var1 = (class334.field4730 >> 10) + (class114.field1403 >> 3);
        if (arg0 != 13511) {
            field5984 = null;
        }
        int var2 = (class41.field496 >> 3) + (class265.field3774 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class254.field3657 = new int[var6];
        class366.field5187 = new byte[var6][];
        class112.field1371 = new int[var6];
        class36.field418 = new int[var6];
        class260.field3711 = new int[var6];
        class14.field182 = new int[var6][4];
        class33.field380 = new int[var6];
        class109.field1346 = new byte[var6][];
        class340.field4822 = new byte[var6][];
        class193.field2798 = new byte[var6][];
        class56.field678 = new int[var6];
        class212.field3019 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - (class176.field2403 >> 4)) / 8; var8 <= ((var1 + (class176.field2403 >> 4)) / 8); var8++) {
            for (int var10 = (var2 - (class383.field5395 >> 4)) / 8; var10 <= ((class383.field5395 >> 4) + var2) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class33.field380[var7] = var11;
                class36.field418[var7] = class311.field4389.method2418("m" + var8 + "_" + var10, (byte) -23);
                class254.field3657[var7] = class311.field4389.method2418("l" + var8 + "_" + var10, (byte) -23);
                class56.field678[var7] = class311.field4389.method2418("n" + var8 + "_" + var10, (byte) -23);
                class260.field3711[var7] = class311.field4389.method2418("um" + var8 + "_" + var10, (byte) -23);
                class112.field1371[var7] = class311.field4389.method2418("ul" + var8 + "_" + var10, (byte) -23);
                if (class56.field678[var7] == -1) {
                    class36.field418[var7] = -1;
                    class254.field3657[var7] = -1;
                    class260.field3711[var7] = -1;
                    class112.field1371[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class56.field678.length; var9++) {
            class56.field678[var9] = -1;
            class36.field418[var9] = -1;
            class254.field3657[var9] = -1;
            class260.field3711[var9] = -1;
            class112.field1371[var9] = -1;
        }
        class50.method292((byte) 89, var4, var5, var1, true, var3, var2, false);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 393)
    public static final void method2655(byte arg0) {
        field5975++;
        if (class113.field1391 != null) {
            return;
        }
        class113.field1391 = new int[65536];
        if (arg0 != -68) {
            field5981 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class113.field1391[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIZ)V", line = 519)
    public class418(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5971 = arg5;
        this.field5979 = arg1;
        this.field5972 = arg0;
        this.field5973 = arg2;
        this.field5983 = arg3;
        this.field5982 = arg4;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 533)
    public static void method2656(int arg0) {
        field5984 = null;
        field5985 = null;
        if (arg0 != 0) {
            field5981 = null;
        }
        field5981 = null;
        field5974 = null;
    }
}
