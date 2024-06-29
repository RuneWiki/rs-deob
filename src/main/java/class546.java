import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class546 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field7398 = -1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7403 = 1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lia;")
    public class546 field7399;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lia;")
    public class546 field7404;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I", line = 3)
    public static final int method3073(int arg0) {
        field7400++;
        return arg0 == 2 ? class139.field1970 : 67;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 25)
    public final void method3074(byte arg0) {
        field7397++;
        if (this.field7404 == null) {
            return;
        }
        this.field7404.field7399 = this.field7399;
        this.field7399.field7404 = this.field7404;
        this.field7404 = null;
        this.field7399 = null;
        if (arg0 != 48) {
            method3073(-125);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 43)
    public static final void method3075(boolean arg0, int arg1) {
        field7402++;
        class198.method1313(arg0, class222.field3096, class631.field8758, arg1 + 15961, class340.field4553);
        if (arg1 != 0) {
            field7398 = -40;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILmw;)V", line = 57)
    public static final void method3076(int arg0, class455 arg1) {
        field7401++;
        int var2 = 0;
        arg1.method2594(true);
        for (int var3 = 0; var3 < class528.field7160; var3++) {
            int var15 = class439.field6091[var3];
            if ((class518.field7055[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class518.field7055[var15] = (byte) class647.method3617(class518.field7055[var15], 2);
                } else {
                    int var16 = arg1.method2592((byte) -91, 1);
                    if (var16 == 0) {
                        var2 = class410.method2389(arg1, arg0 - 125);
                        class518.field7055[var15] = (byte) class647.method3617(class518.field7055[var15], 2);
                    } else {
                        class178.method1237(var15, (byte) 109, arg1);
                    }
                }
            }
        }
        arg1.method2595(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2594(true);
        for (int var4 = 0; var4 < class528.field7160; var4++) {
            int var13 = class439.field6091[var4];
            if ((class518.field7055[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class518.field7055[var13] = (byte) class647.method3617(class518.field7055[var13], 2);
                } else {
                    int var14 = arg1.method2592((byte) -120, 1);
                    if (var14 == 0) {
                        var2 = class410.method2389(arg1, -121);
                        class518.field7055[var13] = (byte) class647.method3617(class518.field7055[var13], 2);
                    } else {
                        class178.method1237(var13, (byte) 109, arg1);
                    }
                }
            }
        }
        if (arg0 != -1) {
            field7398 = -12;
        }
        arg1.method2595(arg0 + 1);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2594(true);
        for (int var5 = 0; var5 < class33.field413; var5++) {
            int var11 = class254.field3463[var5];
            if ((class518.field7055[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class518.field7055[var11] = (byte) class647.method3617(class518.field7055[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2592((byte) 94, 1);
                    if (var12 == 0) {
                        var2 = class410.method2389(arg1, arg0 ^ 0x7A);
                        class518.field7055[var11] = (byte) class647.method3617(class518.field7055[var11], 2);
                    } else if (class674.method3824(var11, (byte) 125, arg1)) {
                        class518.field7055[var11] = (byte) class647.method3617(class518.field7055[var11], 2);
                    }
                }
            }
        }
        arg1.method2595(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2594(true);
        for (int var6 = 0; var6 < class33.field413; var6++) {
            int var9 = class254.field3463[var6];
            if ((class518.field7055[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class518.field7055[var9] = (byte) class647.method3617(class518.field7055[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method2592((byte) -109, 1);
                    if (var10 == 0) {
                        var2 = class410.method2389(arg1, -123);
                        class518.field7055[var9] = (byte) class647.method3617(class518.field7055[var9], 2);
                    } else if (class674.method3824(var9, (byte) -38, arg1)) {
                        class518.field7055[var9] = (byte) class647.method3617(class518.field7055[var9], 2);
                    }
                }
            }
        }
        arg1.method2595(0);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class33.field413 = 0;
        class528.field7160 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class518.field7055[var7] = (byte) (class518.field7055[var7] >> 1);
            class677 var8 = class671.field9407[var7];
            if (var8 == null) {
                class254.field3463[class33.field413++] = var7;
            } else {
                class439.field6091[class528.field7160++] = var7;
            }
        }
    }
}
