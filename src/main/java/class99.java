import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public abstract class class99 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1353 = 0;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1354 = -1;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1357 = 2;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "F")
    public static float field1361;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BILwk;ILwk;IIIII)V")
    public static final void method603(byte arg0, int arg1, class96 arg2, int arg3, class96 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1356++;
        int var10 = arg4.method130(12150);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class24 var12 = (class24) class312.field4168.method3032(3589, (long) var10);
        if (var12 == null) {
            class491[] var13 = class491.method2976(class282.field3733, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class343.field4596.method1236(var13[0], true);
            class312.field4168.method3046((long) var10, var12, 1);
        }
        class340.method1980(arg1 >> 1, 0, arg2.field3695, arg6, arg2.field3704, arg3 >> 1, 29308, arg5, arg2.method546(24273) * 64, arg2.field3694);
        int var14 = arg9 + class382.field5525[0] - 18;
        int var15 = arg8 + class382.field5525[1] - 16 - 54;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = 4 / ((-arg0 - 32) / 54);
        int var18 = arg7 % 4 * 18 + var15;
        var12.method144(var16, var18);
        if (arg2 == arg4) {
            class343.field4596.method1721(var16 - 1, 18, true, var18 - 1, -256, 18);
        }
        class440 var19 = class98.method597((byte) -43);
        var19.field6383 = var16 + 16;
        var19.field6382 = arg4;
        var19.field6385 = var18 + 16;
        var19.field6381 = var18;
        var19.field6389 = var16;
        class317.field4240.method286((byte) 124, var19);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method604(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BIILjava/awt/Component;Lfq;)Ljl;")
    public static final class179 method605(byte arg0, int arg1, int arg2, Component arg3, class137 arg4) {
        field1360++;
        if (class286.field3762 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class179 var5 = (class179) Class.forName("wj").getDeclaredConstructor().newInstance();
                var5.field2333 = arg2;
                var5.field2328 = new int[(class495.field7227 ? 2 : 1) * 256];
                var5.method53(arg3);
                var5.field2337 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field2337 > 16384) {
                    var5.field2337 = 16384;
                }
                var5.method54(var5.field2337);
                if (class124.field1610 > 0 && class34.field347 == null) {
                    class34.field347 = new class343();
                    class34.field347.field4592 = arg4;
                    arg4.method838(class34.field347, class124.field1610, (byte) -123);
                }
                if (class34.field347 != null) {
                    if (class34.field347.field4599[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class34.field347.field4599[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg0 != -85) {
                        method603((byte) -47, -52, null, 89, null, 35, -62, 19, 72, 42);
                    }
                    class8 var6 = new class8(arg4, arg1);
                    var6.field2333 = arg2;
                    var6.field2328 = new int[(class495.field7227 ? 2 : 1) * 256];
                    var6.method53(arg3);
                    var6.field2337 = 16384;
                    var6.method54(var6.field2337);
                    if (class124.field1610 > 0 && class34.field347 == null) {
                        class34.field347 = new class343();
                        class34.field347.field4592 = arg4;
                        arg4.method838(class34.field347, class124.field1610, (byte) -123);
                    }
                    if (class34.field347 != null) {
                        if (class34.field347.field4599[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class34.field347.field4599[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class179();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIZLfo;)Ltv;")
    public static final class395 method606(int arg0, int arg1, boolean arg2, class361 arg3) {
        field1359++;
        class396 var4 = new class396(arg3.method2130(arg0, arg1, -61));
        class395 var5 = new class395(arg1, var4.method2432((byte) 125), var4.method2432((byte) 125), var4.method2406((byte) -104), var4.method2406((byte) -97), var4.method2388((byte) -115) == 1, var4.method2388((byte) -126), var4.method2388((byte) -113));
        int var6 = var4.method2388((byte) -123);
        if (!arg2) {
            field1354 = -83;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field5710.method975(0, new class241(var4.method2388((byte) -115), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648), var4.method2386(-23648)));
        }
        var5.method2381((byte) 97);
        return var5;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Llr;B)V")
    public static final void method607(class531 arg0, byte arg1) {
        int var2 = -100 % ((17 - arg1) / 40);
        field1355++;
        class325 var3 = (class325) class264.field3548.method295((long) arg0.field1211, -125);
        if (var3 == null) {
            return;
        }
        if (var3.field4314 != null) {
            class465.field6928.method1114(var3.field4314);
            var3.field4314 = null;
        }
        var3.method2674(true);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
    public abstract int method608(byte arg0);

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public static final void method609(int arg0, int arg1) {
        field1358++;
        class184 var2 = class277.method1682(arg1, 6, -56);
        var2.method1075((byte) -31);
        if (arg0 < 17) {
            field1357 = -49;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method610(int arg0, Component arg1);

    static {
        new class305("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1362 = 0;
    }
}
