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

@OriginalClass("client!cha")
public class class226 extends class675 {

    @OriginalMember(owner = "client!cha", name = "f", descriptor = "[S")
    private static short[] field3236 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "[S")
    private static short[] field3244 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "[S")
    private static short[] field3245 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!cha", name = "k", descriptor = "[[S")
    public static short[][] field3241 = new short[][] { field3244, field3245, field3236 };

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!cha", name = "g", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZZ)V")
    public final void method1350(boolean arg0, boolean arg1) {
        if (arg1) {
            field3241 = null;
        }
        ++field3237;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BZI)V")
    public static final void method1559(byte arg0, boolean arg1, int arg2) {
        ++field3242;
        class148.method1027(arg1, true, class674.field9563.method3825((byte) -10, class526.field7494), arg2);
        if (arg0 <= 2) {
            method1562(21);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IZ)I")
    public static final int method1560(int arg0, boolean arg1) {
        ++field3234;
        double var2 = (double) ((arg0 & 16772049) >> 16) / 256.0D;
        double var4 = (double) (255 & arg0 >> 8) / 256.0D;
        double var6 = (double) (arg0 & 255) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        if (!arg1) {
            method1564(-9, (class120) null);
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (-var10 + 2.0D - var8);
            }
            if (var2 == var10) {
                var12 = (-var6 + var4) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
            } else if (var6 == var10) {
                var12 = (-var4 + var2) / (-var8 + var10) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (~var21 <= -1) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 >= 0) {
            if (~var22 < -256) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (var22 > 243) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (var22 > 192) {
                var21 >>= 2;
            } else if (~var22 < -180) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 3;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 63) << 10);
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)Z")
    public final boolean method1347(byte arg0) {
        if (arg0 <= 105) {
            field3245 = null;
        }
        ++field3232;
        return true;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V")
    public final void method1353(byte arg0) {
        super.field9618.method1876((byte) 85, false);
        if (arg0 == 52) {
            ++field3235;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Liw;I)V")
    public static final void method1561(class331 arg0, int arg1) {
        ++field3240;
        class548 var2 = (class548) class600.field8464.method2508((byte) -93);
        if (var2 != null) {
            boolean var3 = false;
            int var4 = 0;
            if (arg1 >= -38) {
                method1560(7, false);
            }
            while (var4 < var2.field7730) {
                if (var2.field7728[var4] != null) {
                    if (~var2.field7728[var4].field5314 == -3) {
                        var2.field7731[var4] = -5;
                    }
                    if (var2.field7728[var4].field5314 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field7733[var4] != null) {
                    if (var2.field7733[var4].field5314 == 2) {
                        var2.field7731[var4] = -6;
                    }
                    if (~var2.field7733[var4].field5314 == -1) {
                        var3 = true;
                    }
                }
                ++var4;
            }
            if (!var3) {
                int var5 = arg0.field1521;
                arg0.method879((byte) 73, var2.field7727);
                for (int var6 = 0; var6 < var2.field7730; ++var6) {
                    if (var2.field7731[var6] != 0) {
                        arg0.method851((byte) -2, var2.field7731[var6]);
                    } else {
                        try {
                            int var7 = var2.field7729[var6];
                            if (~var7 != -1) {
                                if (var7 != 1) {
                                    if (var7 == 2) {
                                        Field var8 = (Field) var2.field7728[var6].field5317;
                                        int var9 = var8.getModifiers();
                                        arg0.method851((byte) -2, 0);
                                        arg0.method879((byte) -55, var9);
                                    }
                                } else {
                                    Field var10 = (Field) var2.field7728[var6].field5317;
                                    var10.setInt((Object) null, var2.field7732[var6]);
                                    arg0.method851((byte) -2, 0);
                                }
                            } else {
                                Field var11 = (Field) var2.field7728[var6].field5317;
                                int var12 = var11.getInt((Object) null);
                                arg0.method851((byte) -2, 0);
                                arg0.method879((byte) 76, var12);
                            }
                            if (~var7 != -4) {
                                if (~var7 == -5) {
                                    Method var13 = (Method) var2.field7733[var6].field5317;
                                    int var14 = var13.getModifiers();
                                    arg0.method851((byte) -2, 0);
                                    arg0.method879((byte) -126, var14);
                                }
                            } else {
                                Method var15 = (Method) var2.field7733[var6].field5317;
                                byte[][] var16 = var2.field7735[var6];
                                Object[] var17 = new Object[var16.length];
                                for (int var18 = 0; ~var16.length < ~var18; ++var18) {
                                    ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                    var17[var18] = var19.readObject();
                                }
                                Object var20 = var15.invoke((Object) null, var17);
                                if (var20 != null) {
                                    if (!(var20 instanceof Number)) {
                                        if (var20 instanceof String) {
                                            arg0.method851((byte) -2, 2);
                                            arg0.method880(true, (String) var20);
                                        } else {
                                            arg0.method851((byte) -2, 4);
                                        }
                                    } else {
                                        arg0.method851((byte) -2, 1);
                                        arg0.method848(((Number) var20).longValue(), true);
                                    }
                                } else {
                                    arg0.method851((byte) -2, 0);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg0.method851((byte) -2, -10);
                        } catch (InvalidClassException var22) {
                            arg0.method851((byte) -2, -11);
                        } catch (StreamCorruptedException var23) {
                            arg0.method851((byte) -2, -12);
                        } catch (OptionalDataException var24) {
                            arg0.method851((byte) -2, -13);
                        } catch (IllegalAccessException var25) {
                            arg0.method851((byte) -2, -14);
                        } catch (IllegalArgumentException var26) {
                            arg0.method851((byte) -2, -15);
                        } catch (InvocationTargetException var27) {
                            arg0.method851((byte) -2, -16);
                        } catch (SecurityException var28) {
                            arg0.method851((byte) -2, -17);
                        } catch (IOException var29) {
                            arg0.method851((byte) -2, -18);
                        } catch (NullPointerException var30) {
                            arg0.method851((byte) -2, -19);
                        } catch (Exception var31) {
                            arg0.method851((byte) -2, -20);
                        } catch (Throwable var32) {
                            arg0.method851((byte) -2, -21);
                        }
                    }
                }
                arg0.method895(var5, 8);
                var2.method3117((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ZI)V")
    public final void method1354(boolean arg0, int arg1) {
        ++field3239;
        super.field9618.method1876((byte) 44, true);
        if (arg1 != -24765) {
            method1562(-57);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V")
    public final void method1351(int arg0, int arg1, int arg2) {
        if (arg1 != 8865) {
            method1559((byte) 98, false, 40);
        }
        ++field3243;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field3244 = null;
        field3241 = null;
        field3245 = null;
        field3236 = null;
        if (arg0 < 68) {
            method1563(-17, 27, -35, (Class) null);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1563(int arg0, int arg1, int arg2, Class arg3) {
        class379 var4 = class378.field5427[arg0][arg1][arg2];
        if (var4 != null) {
            for (class393 var5 = var4.field5437; var5 != null; var5 = var5.field5574) {
                class778 var6 = var5.field5578;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field10733 == arg1 && var6.field10730 == arg2) {
                    class6.method32(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lfia;IZ)V")
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        ++field3238;
        super.field9618.method1840(arg0, 2205);
        super.field9618.method1889(false, arg1);
        if (!arg2) {
            this.method1354(true, -69);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILrv;)V")
    public static final void method1564(int arg0, class120 arg1) {
        for (int var2 = 0; ~var2 > ~class542.field7602; ++var2) {
            int var3 = arg1.method890((byte) -59);
            int var4 = arg1.method898((byte) -101);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class541.field7585[var3] != null) {
                class541.field7585[var3].field10799 = var4;
            }
        }
        ++field3233;
        if (arg0 <= 47) {
            method1563(37, -110, 40, (Class) null);
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lkv;)V")
    public class226(class280 arg0) {
        super(arg0);
    }
}
