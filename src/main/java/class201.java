import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class201 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lud;")
    private static class279 field3586 = class130.method1024("Starting 3d Library", 255);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lud;")
    public static class279 field3587 = field3586;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
    public static boolean field3591 = false;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lud;")
    public static class279 field3585 = class130.method1024(" steht bereits auf Ihrer Freunde)2Liste(Q", 255);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[IB)V", line = 15)
    public static final void method1491(int[][] arg0, byte arg1) {
        if (arg1 >= -110) {
            field3591 = false;
        }
        class182.field3348 = arg0;
        field3592++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 26)
    public static void method1492(int arg0) {
        field3586 = null;
        field3587 = null;
        field3585 = null;
        if (arg0 < 123) {
            field3585 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 40)
    public static final void method1493(byte arg0) {
        field3590++;
        int var1 = class72.field1420.field86 + class307.field5446;
        int var2 = class284.field5071 + class72.field1420.field79;
        if ((class96.field1794 - var1) < -500 || (class96.field1794 - var1) > 500 || class90.field1699 - var2 < -500 || class90.field1699 - var2 > 500) {
            class96.field1794 = var1;
            class90.field1699 = var2;
        }
        if (class96.field1794 != var1) {
            class96.field1794 += (var1 - class96.field1794) / 16;
        }
        if (class90.field1699 != var2) {
            class90.field1699 += (var2 - class90.field1699) / 16;
        }
        if (class292.field5204) {
            for (int var3 = 0; var3 < class155.field2804; var3++) {
                int var4 = class207.field3663[var3];
                if (var4 == 98) {
                    class172.field3107 = class172.field3107 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class172.field3107 = class172.field3107 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class126.field2349 = class126.field2349 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class126.field2349 = class126.field2349 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class284.field5075[96]) {
                class285.field5087 += (-class285.field5087 - 24) / 2;
            } else if (class284.field5075[97]) {
                class285.field5087 += (24 - class285.field5087) / 2;
            } else {
                class285.field5087 /= 2;
            }
            class126.field2349 += class285.field5087 / 2;
            if (class284.field5075[98]) {
                class215.field3781 += (12 - class215.field3781) / 2;
            } else if (class284.field5075[99]) {
                class215.field3781 += (-class215.field3781 - 12) / 2;
            } else {
                class215.field3781 /= 2;
            }
            class172.field3107 += class215.field3781 / 2;
        }
        if (arg0 < 26) {
            method1495(true, (byte) -28);
        }
        class159.method1250(-19267);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB[BZI[Llg;)V", line = 135)
    private static final void method1494(int arg0, byte arg1, byte[] arg2, boolean arg3, int arg4, class123[] arg5) {
        field3588++;
        class53 var6 = new class53(arg2);
        if (arg1 != 4) {
            method1492(-91);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method499(1);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method472((byte) 88);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var6.method483(-114);
                int var13 = (var9 & 0xFCE) >> 6;
                int var14 = var9 & 0x3F;
                int var15 = var12 >> 2;
                int var16 = var12 & 0x3;
                int var17 = arg4 + var13;
                int var18 = arg0 + var14;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class123 var19 = null;
                    if (!arg3) {
                        int var20 = var11;
                        if ((class257.field4573[1][var17][var18] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class20.method191(var19, var17, var11, var16, var15, !arg3, (byte) -104, arg3, var11, var7, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZB)V", line = 212)
    public static final void method1495(boolean arg0, byte arg1) {
        field3584++;
        byte[][] var2;
        if (class97.field1824 && arg0) {
            var2 = class297.field5280;
        } else {
            var2 = class7.field147;
        }
        int var3 = class122.field2204.length;
        if (arg1 < 121) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class77.field1493[var4] >> 8) * 64 - class112.field2058;
                int var7 = (class77.field1493[var4] & 0xFF) * 64 - class12.field396;
                class35.method309((byte) 47);
                method1494(var7, (byte) 4, var5, arg0, var6, class90.field1702);
            }
        }
    }
}
