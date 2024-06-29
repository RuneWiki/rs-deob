import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class23 extends class172 {

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lje;")
    public class39 field283;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field278 = 50;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    public static int[] field271;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V", line = 8)
    public static final void method149(byte arg0) {
        if (arg0 >= -120) {
            field271 = (int[]) null;
        }
        class7.field73.method2326(-4);
        field275++;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 23)
    public static final void method150(int arg0) {
        class29.field393 = null;
        class161.field2565 = null;
        field274++;
        class10.field84 = null;
        if (arg0 != 2) {
            method153((byte) 127);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 39)
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 32285) {
            this.field273 = arg2;
            this.field277 = arg0;
            this.field279 = arg1;
            field284++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 57)
    public static final void method152(int arg0) {
        if (arg0 != -1) {
            method149((byte) 18);
        }
        field286++;
        if (class123.field2114 != null || class81.field1392 != null || class142.field2323 > 0) {
            return;
        }
        int var1 = class325.field5165;
        if (!class358.field5687) {
            if (var1 == 1 && class104.field1683 > 0) {
                short var13 = class51.field810[class104.field1683 - 1];
                if (var13 == 21 || var13 == 17 || var13 == 22 || var13 == 41 || var13 == 4 || var13 == 38 || var13 == 42 || var13 == 25 || var13 == 60 || var13 == 57 || var13 == 33 || var13 == 1001) {
                    int var14 = class230.field3819[class104.field1683 - 1];
                    int var15 = class252.field4258[class104.field1683 - 1];
                    class250 var16 = class13.method74(-99, var14);
                    class105 var17 = client.method336(var16);
                    if (var17.method818(arg0 - 118) || var17.method807(1)) {
                        class43.field673 = false;
                        class90.field1542 = 0;
                        if (class123.field2114 != null) {
                            class205.method1568(class123.field2114, (byte) 122);
                        }
                        class123.field2114 = class13.method74(-55, var14);
                        class297.field4771 = var15;
                        class70.field1216 = class333.field5278;
                        class121.field2035 = class229.field3812;
                        class205.method1568(class123.field2114, (byte) 126);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class86.field1458 == 1 && class104.field1683 > 2 || class164.method1276(-16563, class104.field1683 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class104.field1683 > 0 || class117.field1960 == 1) {
                class102.method791(-8118);
            }
            if (var1 == 1 && class104.field1683 > 0 || class117.field1960 == 2) {
                class78.method646((byte) -80);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class333.field5275;
            int var3 = class77.field1343;
            if (class259.field4361 - 10 > var2 || var2 > (class259.field4361 + class92.field1556 + 10) || class178.field2858 - 10 > var3 || (class178.field2858 + class24.field289 + 10) < var3) {
                class358.field5687 = false;
                class56.method441(class259.field4361, -111, class178.field2858, class92.field1556, class24.field289);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class178.field2858;
        int var5 = class92.field1556;
        int var6 = class229.field3812;
        int var7 = -1;
        int var8 = class259.field4361;
        int var9 = class333.field5278;
        for (int var10 = 0; var10 < class104.field1683; var10++) {
            if (class253.field4271) {
                int var12 = (class104.field1683 - var10 - 1) * 15 + var4 + 33;
                if (var8 < var9 && var9 < (var8 + var5) && var12 - 13 < var6 && var12 + 3 > var6) {
                    var7 = var10;
                }
            } else {
                int var11 = (class104.field1683 - var10 - 1) * 15 + (var4 + 31);
                if (var9 > var8 && (var5 + var8) > var9 && var6 > var11 - 13 && var6 < var11 + 3) {
                    var7 = var10;
                }
            }
        }
        if (var7 != -1) {
            class151.method1169(var7, arg0 - 3);
        }
        class358.field5687 = false;
        class56.method441(class259.field4361, -100, class178.field2858, class92.field1556, class24.field289);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 204)
    public static void method153(byte arg0) {
        field271 = null;
        if (arg0 <= 31) {
            method149((byte) -30);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lje;Ldc;)V", line = 224)
    public class23(class39 arg0, class158 arg1) {
        this.field283 = arg0;
    }
}
