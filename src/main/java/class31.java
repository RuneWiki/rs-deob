import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class31 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method173(int arg0) {
        field411++;
        if (class86.field1396 == -1 || class176.field2634 == -1) {
            return;
        }
        int var1 = class222.field3396 + ((class518.field7501 - class222.field3396) * class63.field1091 >> 16);
        class63.field1091 += var1;
        if (class63.field1091 >= 65535) {
            class63.field1091 = 65535;
            if (class296.field4429) {
                class11.field112 = false;
            } else {
                class11.field112 = true;
            }
            class296.field4429 = true;
        } else {
            class296.field4429 = false;
            class11.field112 = false;
        }
        float var2 = (float) class63.field1091 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class89.field1438 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class25.field359[class86.field1396][var4][var5] * 3;
            int var22 = class25.field359[class86.field1396][var4 + 1][var5] * 3;
            int var23 = (class25.field359[class86.field1396][var4 + 2][var5] + class25.field359[class86.field1396][var4 + 2][var5] - class25.field359[class86.field1396][var4 + 3][var5]) * 3;
            int var24 = class25.field359[class86.field1396][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class25.field359[class86.field1396][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class315.field4688 = (int) var3[0] - (class82.field1315 * 128);
        class397.field5649 = (int) var3[2] - (class501.field7240 * 128);
        class62.field1086 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class530.field7830 * 2;
        if (arg0 != -19900) {
            return;
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class25.field359[class176.field2634][var7][var8] * 3;
            int var15 = class25.field359[class176.field2634][var7 + 1][var8] * 3;
            int var16 = (class25.field359[class176.field2634][var7 + 2][var8] + class25.field359[class176.field2634][var7 + 2][var8] - class25.field359[class176.field2634][var7 + 3][var8]) * 3;
            int var17 = class25.field359[class176.field2634][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class25.field359[class176.field2634][var7 + 2][var8] - var17 - (-var15 + var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class254.field3756 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class171.field2548 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class39.field835 = ((class25.field359[class86.field1396][var4 + 2][3] - class25.field359[class86.field1396][var4][3]) * class63.field1091 >> 16) + class25.field359[class86.field1396][var4][3];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IF)F")
    public static final float method174(int arg0, float arg1) {
        if (arg0 >= -119) {
            return -0.3020137F;
        } else {
            field410++;
            return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method175(String arg0, int arg1) {
        field412++;
        class394.field5615 = arg0;
        if (class280.field4173.field5824 == null) {
            return;
        }
        try {
            String var2 = class280.field4173.field5824.getParameter("cookieprefix");
            String var3 = class280.field4173.field5824.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            if (arg1 == -1) {
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class28.method166(class165.method1188((byte) 26) + 94608000000L, 10) + "; Max-Age=" + 94608000L;
                }
                class325.method2067(15, class280.field4173.field5824, "document.cookie=\"" + var5 + "\"");
            }
        } catch (Throwable var6) {
        }
    }
}
