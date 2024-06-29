import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class663 extends class375 {

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "[B")
    public byte[] field9364;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "Ldg;")
    public static class376 field9366 = new class376(27, -1);

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "Lwba;")
    public static class46 field9367 = new class46();

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "[Lbba;")
    public static class98[] field9368 = new class98[14];

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)V", line = 3)
    public static final void method3666(int arg0, byte arg1, int arg2) {
        field9362++;
        if (arg1 <= -35) {
            class191 var3 = class6.method38(13, -76, arg0);
            var3.method1285((byte) -1);
            var3.field2754 = arg2;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILmo;)Lcaa;", line = 17)
    public static final class272 method3667(int arg0, class695 arg1) {
        if (arg0 != -26879) {
            method3667(110, null);
        }
        field9363++;
        return new class272(arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3814(false), arg1.method3873(255), arg1.method3873(255), arg1.method3826(false));
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 28)
    public static void method3668(int arg0) {
        field9366 = null;
        if (arg0 == 27) {
            field9368 = null;
            field9367 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 46)
    public static final void method3669(int arg0) {
        class523.field7392.method312(arg0 ^ 0x6A);
        field9365++;
        int var1 = class523.field7392.method309((byte) 57, 8);
        if (class217.field3042 > var1) {
            for (int var2 = var1; var2 < class217.field3042; var2++) {
                class84.field1392[class159.field2303++] = class85.field1396[var2];
            }
        }
        if (class217.field3042 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class217.field3042 = 0;
        int var3 = 0;
        if (arg0 != 1) {
            field9368 = null;
        }
        while (var1 > var3) {
            int var4 = class85.field1396[var3];
            class577 var5 = ((class16) class189.field2723.method1405((long) var4, (byte) -22)).field174;
            int var6 = class523.field7392.method309((byte) 57, 1);
            if (var6 == 0) {
                class85.field1396[class217.field3042++] = var4;
                var5.field6170 = class564.field7962;
            } else {
                int var7 = class523.field7392.method309((byte) 57, 2);
                if (var7 == 0) {
                    class85.field1396[class217.field3042++] = var4;
                    var5.field6170 = class564.field7962;
                    class242.field3762[class426.field6275++] = var4;
                } else if (var7 == 1) {
                    class85.field1396[class217.field3042++] = var4;
                    var5.field6170 = class564.field7962;
                    int var8 = class523.field7392.method309((byte) 57, 3);
                    var5.method3267((byte) -116, 1, var8);
                    int var9 = class523.field7392.method309((byte) 57, 1);
                    if (var9 == 1) {
                        class242.field3762[class426.field6275++] = var4;
                    }
                } else if (var7 == 2) {
                    class85.field1396[class217.field3042++] = var4;
                    var5.field6170 = class564.field7962;
                    if (class523.field7392.method309((byte) 57, 1) == 1) {
                        int var10 = class523.field7392.method309((byte) 57, 3);
                        var5.method3267((byte) -114, 2, var10);
                        int var11 = class523.field7392.method309((byte) 57, 3);
                        var5.method3267((byte) -113, 2, var11);
                    } else {
                        int var12 = class523.field7392.method309((byte) 57, 3);
                        var5.method3267((byte) -105, 0, var12);
                    }
                    int var13 = class523.field7392.method309((byte) 57, 1);
                    if (var13 == 1) {
                        class242.field3762[class426.field6275++] = var4;
                    }
                } else if (var7 == 3) {
                    class84.field1392[class159.field2303++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "([B)V", line = 158)
    public class663(byte[] arg0) {
        this.field9364 = arg0;
    }
}
