import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class275 {

    @OriginalMember(owner = "client!os", name = "g", descriptor = "[B")
    public static byte[] field3974;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[I")
    public static int[] field3976;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[B")
    public byte[] field3973;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "[S")
    public short[] field3968;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[S")
    public short[] field3975;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
    public short[] field3977;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIILha;III)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, class473 arg4, int arg5, int arg6, int arg7) {
        class377.field5424 = arg4;
        field3971++;
        class747.field10317 = class377.field5424.method159();
        class579.field8132 = class377.field5424.method159();
        class221.field3034 = class377.field5424.method159();
        class395.field5608 = 0;
        class333.field4768 = arg5;
        class618.field8685 = arg7;
        class750.field10361 = arg1;
        class96.field1127 = null;
        class166.field2118 = 1;
        class616.field8644 = 0;
        class300.field4356 = arg3;
        class100.method714(arg2, (byte) 83, arg6);
        if (arg0 != -31504) {
            field3974 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBII)V")
    public static final void method1792(int arg0, byte arg1, int arg2, int arg3) {
        field3972++;
        if (class593.field8350 == arg2 && class635.field8863 == arg0 && class535.field7400 == arg3) {
            return;
        }
        class593.field8350 = arg2;
        class535.field7400 = arg3;
        class282.field4043 = true;
        class635.field8863 = arg0;
        double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        client.field1289 = var8 * var12;
        class93.field1087 = var10;
        class384.field5500 = var8;
        class300.field4368 = var12;
        class69.field766 = var10 * var14;
        if (arg1 != -31) {
            field3979 = -64;
        }
        class407.field5731 = 0.0D;
        class402.field5671 = var14;
        class22.field200 = -var8 * var14;
        class547.field7641 = -var10 * var12;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1793(int arg0, boolean arg1, int arg2) {
        field3970++;
        if (!arg1) {
            method1791(13, -100, 67, -83, null, -85, 96, 54);
        }
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Luba;")
    public static final class330 method1794(boolean arg0, int arg1) {
        field3969++;
        if (arg0) {
            field3974 = null;
        }
        if (arg1 == 0) {
            return new class752();
        } else if (arg1 == 1) {
            return new class72();
        } else if (arg1 == 2) {
            return new class423();
        } else if (arg1 == 3) {
            return new class380();
        } else if (arg1 == 4) {
            return new class363();
        } else if (arg1 == 5) {
            return new class535();
        } else if (arg1 == 6) {
            return new class367();
        } else if (arg1 == 7) {
            return new class336();
        } else if (arg1 == 8) {
            return new class360();
        } else if (arg1 == 9) {
            return new class79();
        } else if (arg1 == 10) {
            return new class451();
        } else if (arg1 == 11) {
            return new class457();
        } else if (arg1 == 12) {
            return new class538();
        } else if (arg1 == 13) {
            return new class585();
        } else if (arg1 == 14) {
            return new class55();
        } else if (arg1 == 15) {
            return new class518();
        } else if (arg1 == 16) {
            return new class169();
        } else if (arg1 == 17) {
            return new class665();
        } else if (arg1 == 18) {
            return new class605();
        } else if (arg1 == 19) {
            return new class699();
        } else if (arg1 == 20) {
            return new class188();
        } else if (arg1 == 21) {
            return new class572();
        } else if (arg1 == 22) {
            return new class185();
        } else if (arg1 == 23) {
            return new class595();
        } else if (arg1 == 24) {
            return new class219();
        } else if (arg1 == 25) {
            return new class448();
        } else if (arg1 == 26) {
            return new class635();
        } else if (arg1 == 27) {
            return new class310();
        } else if (arg1 == 28) {
            return new class775();
        } else if (arg1 == 29) {
            return new class673();
        } else if (arg1 == 30) {
            return new class243();
        } else if (arg1 == 31) {
            return new class694();
        } else if (arg1 == 32) {
            return new class456();
        } else if (arg1 == 33) {
            return new class139();
        } else if (arg1 == 34) {
            return new class618();
        } else if (arg1 == 35) {
            return new class170();
        } else if (arg1 == 36) {
            return new class458();
        } else if (arg1 == 37) {
            return new class412();
        } else if (arg1 == 38) {
            return new class88();
        } else if (arg1 == 39) {
            return new class108();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static final void method1795(int arg0) {
        class433.field6018.method3672(0);
        if (arg0 != 24001) {
            method1793(66, false, 7);
        }
        field3978++;
        class557.field7839.method1143(arg0 - 24095);
        class695.field9695.method1143(-125);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public static void method1796(byte arg0) {
        field3974 = null;
        if (arg0 > -113) {
            field3974 = null;
        }
        field3976 = null;
    }

    static {
        int var0 = 0;
        field3974 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3974[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3976 = new int[1];
        field3979 = 0;
    }
}
