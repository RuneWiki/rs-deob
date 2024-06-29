import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class116 extends class179 {

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[B")
    public byte[] field1336;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[I")
    public static int[] field1334 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field1339 = 2;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[J")
    public static long[] field1341;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field1342;

    static {
        new class72("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field1341 = new long[256];
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1341[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lil;IIIII)V", line = 19)
    public static final void method674(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field494 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class59.field747[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class6 var11 = class349.field4761[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field494; var12++) {
                            if (arg0.field498[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field498[arg0.field494++] = var11;
                        if (arg0.field494 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field494; var13 < 4; var13++) {
            arg0.field498[var13] = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLbe;)V", line = 84)
    public static final void method675(byte arg0, class131 arg1) {
        field1335++;
        if (arg0 != -29) {
            method674((class42) null, -64, -16, 64, 89, -35);
        }
        class237 var2 = (class237) class321.field4310.method2218(1, (long) arg1.field2445);
        if (var2 == null) {
            class378.method2351(0, arg1, (byte) -6, (class446) null, (class298) null, class43.field513, arg1.field2480[0], arg1.field2482[0]);
        } else {
            var2.method1521(-18541);
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V", line = 106)
    public static void method676(byte arg0) {
        field1334 = null;
        int var1 = 28 % ((arg0 - 43) / 41);
        field1341 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 116)
    public static final int method677(String arg0, byte arg1) {
        field1333++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1 >= -90) {
            method676((byte) 7);
        }
        while (var4 < var2) {
            var3 = class376.method2343((byte) -111, arg0.charAt(var4)) + (var3 << 5) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V", line = 143)
    public class116(byte[] arg0) {
        this.field1336 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V", line = 151)
    public static final void method678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1337++;
        class12 var5 = class390.method2422(341555040, arg3, 4);
        if (arg1 > -22) {
            method678(-60, -29, 111, 29, -41);
        }
        var5.method66(-11);
        var5.field149 = arg4;
        var5.field152 = arg0;
        var5.field144 = arg2;
    }
}
