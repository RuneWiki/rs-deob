import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Z")
    public static volatile boolean field272 = true;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
    public static int[] field274 = new int[50];

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[B")
    public static byte[] field273 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lp;")
    private static class280 field275 = class18.method140((byte) -120, "Loaded interfaces");

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
    public static int[] field278 = new int[100];

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lp;")
    public static class280 field277 = field275;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lp;")
    public static class280 field279 = class18.method140((byte) -119, "hitmarks");

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lp;")
    public static class280 field281 = class18.method140((byte) -126, "Null");

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lda;")
    public static class184 field280;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method115(int arg0) {
        field278 = null;
        field273 = null;
        field277 = null;
        field275 = null;
        field281 = null;
        field279 = null;
        field274 = null;
        if (arg0 != 255) {
            method116(false, (byte) 103);
        }
        field280 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V")
    public static final void method116(boolean arg0, byte arg1) {
        field276++;
        class115.field2088 = arg0;
        if (class115.field2088) {
            int var2 = class20.field367.method212((byte) -50);
            class20.field367.method558(25830);
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class20.field367.method547(1, (byte) 114);
                        if (var24 == 1) {
                            class40.field684[var3][var22][var23] = class20.field367.method547(26, (byte) 33);
                        } else {
                            class40.field684[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class20.field367.method552(22535);
            int var4 = (class23.field422 - class20.field367.field481) / 16;
            class196.field3426 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class196.field3426[var5][var21] = class20.field367.method187(2);
                }
            }
            int var6 = class20.field367.method193((byte) 77);
            int var7 = class20.field367.method211(false);
            int var8 = class20.field367.method193((byte) 77);
            int var9 = class20.field367.method216(false);
            class161.field2821 = null;
            class265.field4666 = new int[var4];
            class126.field2197 = new int[var4];
            class90.field1472 = new byte[var4][];
            class267.field4697 = null;
            class29.field554 = new int[var4];
            class89.field1438 = new byte[var4][];
            class200.field3508 = new int[var4];
            class3.field93 = new int[var4];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class40.field684[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class3.field93[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class3.field93[var10] = var17;
                                int var19 = (var17 & 0xFFF2) >> 8;
                                int var20 = var17 & 0xFF;
                                class265.field4666[var10] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class228.field3948, class249.method1685((byte) -104, var19), class100.field1629, class249.method1685((byte) 112, var20) }, (byte) -87));
                                class29.field554[var10] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class103.field1717, class249.method1685((byte) 59, var19), class100.field1629, class249.method1685((byte) -117, var20) }, (byte) -87));
                                class200.field3508[var10] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class178.field3108, class249.method1685((byte) -107, var19), class100.field1629, class249.method1685((byte) -84, var20) }, (byte) -87));
                                class126.field2197[var10] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class207.field3578, class249.method1685((byte) 65, var19), class100.field1629, class249.method1685((byte) -100, var20) }, (byte) -87));
                                var10++;
                            }
                        }
                    }
                }
            }
            class178.method1222(var6, var9, var7, -47, false, var8, var2);
        } else {
            int var25 = class20.field367.method212((byte) -50);
            int var26 = class20.field367.method211(false);
            int var27 = class20.field367.method193((byte) 77);
            int var28 = class20.field367.method213((byte) 113);
            int var29 = class20.field367.method193((byte) 77);
            int var30 = (class23.field422 - class20.field367.field481) / 16;
            class196.field3426 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class196.field3426[var31][var37] = class20.field367.method208(false);
                }
            }
            class29.field554 = new int[var30];
            class126.field2197 = new int[var30];
            class161.field2821 = null;
            class90.field1472 = new byte[var30][];
            boolean var32 = false;
            class3.field93 = new int[var30];
            class265.field4666 = new int[var30];
            class200.field3508 = new int[var30];
            class89.field1438 = new byte[var30][];
            class267.field4697 = null;
            if ((var27 / 8 == 48 || (var27 / 8) == 49) && var28 / 8 == 48) {
                var32 = true;
            }
            int var33 = 0;
            if (var27 / 8 == 48 && var28 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var27 - 6) / 8; var34 <= ((var27 + 6) / 8); var34++) {
                for (int var35 = (var28 - 6) / 8; var35 <= (var28 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class3.field93[var33] = var36;
                        class265.field4666[var33] = -1;
                        class29.field554[var33] = -1;
                        class200.field3508[var33] = -1;
                        class126.field2197[var33] = -1;
                    } else {
                        class3.field93[var33] = var36;
                        class265.field4666[var33] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class228.field3948, class249.method1685((byte) -100, var34), class100.field1629, class249.method1685((byte) 41, var35) }, (byte) -87));
                        class29.field554[var33] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class103.field1717, class249.method1685((byte) -89, var34), class100.field1629, class249.method1685((byte) 64, var35) }, (byte) -87));
                        class200.field3508[var33] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class178.field3108, class249.method1685((byte) 73, var34), class100.field1629, class249.method1685((byte) -72, var35) }, (byte) -87));
                        class126.field2197[var33] = class148.field2569.method1234((byte) -88, class30.method266(new class280[] { class207.field3578, class249.method1685((byte) 38, var34), class100.field1629, class249.method1685((byte) 117, var35) }, (byte) -87));
                    }
                    var33++;
                }
            }
            class178.method1222(var27, var28, var26, -119, false, var29, var25);
        }
        if (arg1 <= 34) {
            method116(true, (byte) -79);
        }
    }
}
