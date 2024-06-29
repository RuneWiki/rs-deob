import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class361 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Loa;")
    public static class157 field5466 = new class157();

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lfo;")
    public static class12 field5470;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[[Lje;")
    public static class178[][] field5469;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)B")
    public static final byte method2217(int arg0, int arg1, int arg2) {
        field5467++;
        if (arg0 > -46) {
            field5466 = null;
        }
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method2218(int arg0) {
        field5468++;
        class220.field3246.method378((byte) 88);
        int var1 = class220.field3246.method369((byte) 126, 8);
        if (arg0 != -16829) {
            field5470 = null;
        }
        if (class256.field3797 > var1) {
            for (int var2 = var1; var2 < class256.field3797; var2++) {
                class3.field72[class271.field4056++] = class236.field3441[var2];
            }
        }
        if (class256.field3797 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class256.field3797 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class236.field3441[var3];
            class349 var5 = class18.field241[var4];
            int var6 = class220.field3246.method369((byte) 126, 1);
            if (var6 == 0) {
                class236.field3441[class256.field3797++] = var4;
                var5.field4595 = class452.field6418;
            } else {
                int var7 = class220.field3246.method369((byte) 126, 2);
                if (var7 == 0) {
                    class236.field3441[class256.field3797++] = var4;
                    var5.field4595 = class452.field6418;
                    class381.field5651[class345.field5250++] = var4;
                } else if (var7 == 1) {
                    class236.field3441[class256.field3797++] = var4;
                    var5.field4595 = class452.field6418;
                    int var8 = class220.field3246.method369((byte) 126, 3);
                    var5.method2153(-2, 1, var8);
                    int var9 = class220.field3246.method369((byte) 126, 1);
                    if (var9 == 1) {
                        class381.field5651[class345.field5250++] = var4;
                    }
                } else if (var7 == 2) {
                    class236.field3441[class256.field3797++] = var4;
                    var5.field4595 = class452.field6418;
                    if (class220.field3246.method369((byte) 126, 1) == 1) {
                        int var11 = class220.field3246.method369((byte) 126, 3);
                        var5.method2153(-2, 2, var11);
                        int var12 = class220.field3246.method369((byte) 126, 3);
                        var5.method2153(-2, 2, var12);
                    } else {
                        int var10 = class220.field3246.method369((byte) 126, 3);
                        var5.method2153(-2, 0, var10);
                    }
                    int var13 = class220.field3246.method369((byte) 126, 1);
                    if (var13 == 1) {
                        class381.field5651[class345.field5250++] = var4;
                    }
                } else if (var7 == 3) {
                    class3.field72[class271.field4056++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method2219(int arg0) {
        for (int var1 = 0; var1 < class401.field5864.length; var1++) {
            for (int var2 = 0; var2 < class401.field5864[var1].length; var2++) {
                class401.field5864[var1][var2] = class95.field1337;
            }
        }
        field5463++;
        if (arg0 != 2) {
            field5470 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static void method2220(int arg0) {
        if (arg0 == 26663) {
            field5469 = null;
            field5470 = null;
            field5466 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lui;III)Lis;")
    public static final class1 method2221(class451 arg0, int arg1, int arg2, int arg3) {
        field5464++;
        byte[] var4 = arg0.method2691(arg2, arg3, 0);
        if (arg1 <= 41) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            return new class1(var4);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIII)I")
    public static final int method2222(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 116) {
            field5469 = null;
        }
        field5465++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }
}
