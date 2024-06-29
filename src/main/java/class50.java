import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class50 extends class475 {

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "[I")
    private int[] field739 = new int[512];

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field736++;
        int var5 = arg1;
        int var6 = arg2;
        int var7 = -arg2;
        class217.method1448(class436.field6332[arg0], arg4 - arg2, arg3, 4, arg2 + arg4);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class436.field6332[arg0 + var6];
                int[] var10 = class436.field6332[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class217.method1448(var9, var12, arg3, arg1 + 4, var11);
                class217.method1448(var10, var12, arg3, arg1 + 4, var11);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class436.field6332[arg0 + var5];
            int[] var16 = class436.field6332[arg0 - var5];
            class217.method1448(var15, var14, arg3, 4, var13);
            class217.method1448(var16, var14, arg3, 4, var13);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[FFIIIIFFIF)V", line = 56)
    public final void method363(int arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, int arg9, float arg10) {
        if (arg0 != 7) {
            this.field739 = null;
        }
        field737++;
        int var12 = (int) ((float) arg3 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg7 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg9 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg6 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class192.method1315(true, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field739[var25];
        int var27 = this.field739[var24];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg7;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class192.method1315(true, var32);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field739[var26 + var36];
            int var38 = this.field739[var35 + var26];
            int var39 = this.field739[var27 + var36];
            int var40 = this.field739[var27 + var35];
            for (int var41 = 0; var41 < arg3; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class192.method1315(true, var45);
                arg1[arg5++] = class163.method1180(var23, class163.method1180(var34, class163.method1180(var49, class98.method772(class388.method2441(7, this.field739[var37 + var48]), var33, var22, var46, 10200), class98.method772(class388.method2441(7, this.field739[var37 + var47]), var33, var22, var45, 10200), false), class163.method1180(var49, class98.method772(class388.method2441(7, this.field739[var38 + var48]), var32, var22, var46, 10200), class98.method772(class388.method2441(this.field739[var47 + var38], 7), var32, var22, var45, 10200), false), false), class163.method1180(var34, class163.method1180(var49, class98.method772(class388.method2441(7, this.field739[var39 + var48]), var33, var21, var46, arg0 + 10193), class98.method772(class388.method2441(7, this.field739[var39 + var47]), var33, var21, var45, 10200), false), class163.method1180(var49, class98.method772(class388.method2441(this.field739[var40 + var48], 7), var32, var21, var46, 10200), class98.method772(class388.method2441(this.field739[var40 + var47], 7), var32, var21, var45, class113.method838(arg0, 10207)), false), false), false) * arg2;
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 147)
    public static final void method364(byte arg0) {
        if (class214.field3083 != 0) {
            class337.field5142 -= class214.field3083 * 5;
            if (class337.field5142 >= class227.field3337) {
                class337.field5142 = class227.field3337 - 1;
            }
            if (class337.field5142 < 0) {
                class337.field5142 = 0;
            }
            class214.field3083 = 0;
        }
        if (arg0 >= -67) {
            method364((byte) 98);
        }
        field738++;
        if (class134.field2069 < 102) {
            class134.field2069 += 6;
        }
        for (int var1 = 0; var1 < class42.field643; var1++) {
            int var2 = class125.field1922[var1].method244((byte) -123);
            char var3 = class125.field1922[var1].method233((byte) 112);
            if (var2 == 84) {
                class55.method396(81);
            } else if (class351.field5334.method1767(82, (byte) -104) && var2 == 66) {
                if (class107.field1671 != null) {
                    String var8 = "";
                    for (int var9 = class82.field1358.length - 1; var9 >= 0; var9--) {
                        if (class82.field1358[var9] != null && class82.field1358[var9].length() > 0) {
                            var8 = var8 + class82.field1358[var9] + '\n';
                        }
                    }
                    class107.field1671.setContents(new StringSelection(var8), null);
                }
            } else if (class351.field5334.method1767(82, (byte) -30) && var2 == 67) {
                if (class107.field1671 != null) {
                    Transferable var4 = class107.field1671.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class82.method650(false, '\n', var5);
                                if (var6.length <= 1) {
                                    class41.field633 = class41.field633 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class41.field633 = var6[var7];
                                        class55.method396(87);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class192.field2812 > 0) {
                class41.field633 = class41.field633.substring(0, class192.field2812 - 1) + class41.field633.substring(class192.field2812);
                class192.field2812--;
            } else if (var2 == 101 && class192.field2812 < class41.field633.length()) {
                class41.field633 = class41.field633.substring(0, class192.field2812) + class41.field633.substring(class192.field2812 + 1);
            } else if (var2 == 96 && class192.field2812 > 0) {
                class192.field2812--;
            } else if (var2 == 97 && class192.field2812 < class41.field633.length()) {
                class192.field2812++;
            } else if (var2 == 102) {
                class192.field2812 = 0;
            } else if (var2 == 103) {
                class192.field2812 = class41.field633.length();
            } else if (var2 == 104 && class82.field1358.length > class348.field5285) {
                class348.field5285++;
                class49.method359(0);
                class192.field2812 = class41.field633.length();
            } else if (var2 == 105 && class348.field5285 > 0) {
                class348.field5285--;
                class49.method359(0);
                class192.field2812 = class41.field633.length();
            } else if (class165.method1186(var3, true) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class41.field633 = class41.field633.substring(0, class192.field2812) + class125.field1922[var1].method233((byte) 104) + class41.field633.substring(class192.field2812);
                class192.field2812++;
            }
        }
        class42.field643 = 0;
        class67.method582(-25099);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V", line = 313)
    public class50(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field739[var3] = this.field739[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field739[var5];
            this.field739[var5] = this.field739[var5 + 256] = this.field739[var4];
            this.field739[var4] = this.field739[var4 + 256] = var6;
        }
    }
}
