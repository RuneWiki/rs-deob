import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class349 extends class739 {

    @OriginalMember(owner = "client!gha", name = "G", descriptor = "I")
    private int field4499 = 4096;

    @OriginalMember(owner = "client!gha", name = "I", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!gha", name = "F", descriptor = "Lcha;")
    public static class220 field4498 = new class220(8, 7);

    @OriginalMember(owner = "client!gha", name = "N", descriptor = "[I")
    public static int[] field4505 = new int[8];

    @OriginalMember(owner = "client!gha", name = "E", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!gha", name = "H", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!gha", name = "L", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!gha", name = "M", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!gha", name = "O", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!gha", name = "P", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!gha", name = "K", descriptor = "Lmca;")
    public static class31 field4502;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLvea;)I", line = 3)
    public static final int method2047(byte arg0, class277 arg1) {
        ++field4504;
        String var2 = class699.method3929(arg1, -8669);
        int[] var3 = null;
        if (class36.method228(arg1.field3478, 610)) {
            var3 = class21.field381.method1583(-95, (int) arg1.field3480).field8817;
        } else if (arg1.field3473 != -1) {
            var3 = class21.field381.method1583(-67, arg1.field3473).field8817;
        } else if (class491.method2902(arg1.field3478, 71)) {
            class592 var4 = (class592) class207.field2745.method1160((long) ((int) arg1.field3480), 121);
            if (var4 != null) {
                class733 var5 = var4.field8280;
                class131 var6 = var5.field10192;
                if (var6.field1899 != null) {
                    var6 = var6.method981(arg0 ^ -100, class516.field7236);
                }
                if (var6 != null) {
                    var3 = var6.field1863;
                }
            }
        } else if (class473.method2693(arg0 + -32, arg1.field3478)) {
            Object var7 = null;
            class543 var8;
            if (arg1.field3478 == 1003) {
                var8 = client.field3995.method3384((int) arg1.field3480, false);
            } else {
                var8 = client.field3995.method3384((int) (arg1.field3480 >>> 32 & 2147483647L), false);
            }
            if (var8.field7541 != null) {
                var8 = var8.method3111(class516.field7236, arg0 + -102);
            }
            if (var8 != null) {
                var3 = var8.field7542;
            }
        }
        if (var3 != null) {
            var2 = var2 + class339.method1949(-119, var3);
        }
        int var9 = class270.field3406.method1620(var2, class120.field1751, 118);
        if (arg0 != -19) {
            field4507 = 120;
        }
        if (arg1.field3484) {
            var9 += 4 + class745.field10382.method143();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "()V", line = 79)
    public class349() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "(I)V", line = 86)
    public static void method2048(int arg0) {
        if (arg0 == 2) {
            field4498 = null;
            field4505 = null;
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lsl;II)V", line = 112)
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field4506;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field4499 = arg0.method2566(-2);
            }
        } else {
            this.field4501 = arg0.method2566(-2);
        }
        if (arg2 != -3) {
            this.method215(7, -110);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILei;)V", line = 149)
    public static final void method2049(int arg0, class180 arg1) {
        ++field4497;
        class254 var2 = (class254) class660.field9187.method3672(-1);
        if (var2 != null) {
            boolean var3 = false;
            for (int var4 = 0; ~var4 > ~var2.field3246; ++var4) {
                if (var2.field3241[var4] != null) {
                    if (~var2.field3241[var4].field2538 == -3) {
                        var2.field3243[var4] = -5;
                    }
                    if (var2.field3241[var4].field2538 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field3242[var4] != null) {
                    if (var2.field3242[var4].field2538 == 2) {
                        var2.field3243[var4] = -6;
                    }
                    if (~var2.field3242[var4].field2538 == -1) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                if (arg0 != -17) {
                    method2049(21, (class180) null);
                }
                int var5 = arg1.field6193;
                arg1.method2568(var2.field3240, -535701016);
                for (int var6 = 0; ~var6 > ~var2.field3246; ++var6) {
                    if (var2.field3243[var6] != 0) {
                        arg1.method2578(var2.field3243[var6], -1221492240);
                    } else {
                        try {
                            int var7 = var2.field3238[var6];
                            if (var7 != 0) {
                                if (~var7 == -2) {
                                    Field var8 = (Field) var2.field3241[var6].field2540;
                                    var8.setInt((Object) null, var2.field3245[var6]);
                                    arg1.method2578(0, -1221492240);
                                } else if (~var7 == -3) {
                                    Field var9 = (Field) var2.field3241[var6].field2540;
                                    int var10 = var9.getModifiers();
                                    arg1.method2578(0, -1221492240);
                                    arg1.method2568(var10, arg0 + -535700999);
                                }
                            } else {
                                Field var11 = (Field) var2.field3241[var6].field2540;
                                int var12 = var11.getInt((Object) null);
                                arg1.method2578(0, arg0 + -1221492223);
                                arg1.method2568(var12, -535701016);
                            }
                            if (~var7 != -4) {
                                if (~var7 == -5) {
                                    Method var19 = (Method) var2.field3242[var6].field2540;
                                    int var20 = var19.getModifiers();
                                    arg1.method2578(0, -1221492240);
                                    arg1.method2568(var20, -535701016);
                                }
                            } else {
                                Method var13 = (Method) var2.field3242[var6].field2540;
                                byte[][] var14 = var2.field3239[var6];
                                Object[] var15 = new Object[var14.length];
                                for (int var16 = 0; var16 < var14.length; ++var16) {
                                    ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                    var15[var16] = var17.readObject();
                                }
                                Object var18 = var13.invoke((Object) null, var15);
                                if (var18 == null) {
                                    arg1.method2578(0, -1221492240);
                                } else if (!(var18 instanceof Number)) {
                                    if (var18 instanceof String) {
                                        arg1.method2578(2, -1221492240);
                                        arg1.method2597((String) var18, (byte) 60);
                                    } else {
                                        arg1.method2578(4, -1221492240);
                                    }
                                } else {
                                    arg1.method2578(1, -1221492240);
                                    arg1.method2586(-25417, ((Number) var18).longValue());
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg1.method2578(-10, arg0 + -1221492223);
                        } catch (InvalidClassException var22) {
                            arg1.method2578(-11, -1221492240);
                        } catch (StreamCorruptedException var23) {
                            arg1.method2578(-12, -1221492240);
                        } catch (OptionalDataException var24) {
                            arg1.method2578(-13, -1221492240);
                        } catch (IllegalAccessException var25) {
                            arg1.method2578(-14, -1221492240);
                        } catch (IllegalArgumentException var26) {
                            arg1.method2578(-15, -1221492240);
                        } catch (InvocationTargetException var27) {
                            arg1.method2578(-16, -1221492240);
                        } catch (SecurityException var28) {
                            arg1.method2578(-17, arg0 ^ 1221492255);
                        } catch (IOException var29) {
                            arg1.method2578(-18, -1221492240);
                        } catch (NullPointerException var30) {
                            arg1.method2578(-19, -1221492240);
                        } catch (Exception var31) {
                            arg1.method2578(-20, arg0 + -1221492223);
                        } catch (Throwable var32) {
                            arg1.method2578(-21, -1221492240);
                        }
                    }
                }
                arg1.method2605(var5, true);
                var2.method1175(-2);
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)[I", line = 336)
    public final int[] method215(int arg0, int arg1) {
        ++field4500;
        int[] var3 = super.field10311.method2116(arg1, (byte) 119);
        if (arg0 != -23347) {
            this.method215(3, -90);
        }
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-119, arg1, 0);
            for (int var5 = 0; ~var5 > ~class29.field523; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field4501 >= ~var6 && ~this.field4499 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
