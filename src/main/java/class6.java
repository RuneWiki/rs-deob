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

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field135 = 0;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lli;")
    private static class185 field145 = class245.method1649("Please remove ", -107);

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lli;")
    public static class185 field140 = field145;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lli;")
    public static class185 field141 = field145;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Ldd;")
    public static class211 field142;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILvj;B)V")
    public static final void method72(int arg0, class88 arg1, byte arg2) {
        field139++;
        if (arg2 != -46) {
            field141 = null;
        }
        while (true) {
            class17 var3 = (class17) class203.field3717.method1375(arg2 + 16305);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field273; var5++) {
                if (var3.field278[var5] != null) {
                    if (var3.field278[var5].field487 == 2) {
                        var3.field274[var5] = -5;
                    }
                    if (var3.field278[var5].field487 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field271[var5] != null) {
                    if (var3.field271[var5].field487 == 2) {
                        var3.field274[var5] = -6;
                    }
                    if (var3.field271[var5].field487 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method577(arg0, 0);
            arg1.method877((byte) 123, 0);
            int var6 = arg1.field2155;
            arg1.method842(var3.field275, -6596);
            for (int var7 = 0; var7 < var3.field273; var7++) {
                if (var3.field274[var7] == 0) {
                    try {
                        int var8 = var3.field276[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field278[var7].field486;
                            int var13 = var12.getInt((Object) null);
                            arg1.method877((byte) 117, 0);
                            arg1.method842(var13, -6596);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field278[var7].field486;
                            var11.setInt((Object) null, var3.field277[var7]);
                            arg1.method877((byte) 116, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field278[var7].field486;
                            int var10 = var9.getModifiers();
                            arg1.method877((byte) 99, 0);
                            arg1.method842(var10, -6596);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field279[var7];
                            Method var15 = (Method) var3.field271[var7].field486;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method877((byte) 118, 0);
                            } else if (var19 instanceof Number) {
                                arg1.method877((byte) 125, 1);
                                arg1.method870(((Number) var19).longValue(), (byte) 122);
                            } else if ((var19 instanceof class185)) {
                                arg1.method877((byte) 107, 2);
                                arg1.method855((byte) 110, (class185) var19);
                            } else {
                                arg1.method877((byte) 118, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field271[var7].field486;
                            int var21 = var20.getModifiers();
                            arg1.method877((byte) 117, 0);
                            arg1.method842(var21, -6596);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method877((byte) 97, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method877((byte) 106, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method877((byte) 118, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method877((byte) 99, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method877((byte) 110, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method877((byte) 125, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method877((byte) 95, -16);
                    } catch (SecurityException var29) {
                        arg1.method877((byte) 112, -17);
                    } catch (IOException var30) {
                        arg1.method877((byte) 116, -18);
                    } catch (NullPointerException var31) {
                        arg1.method877((byte) 122, -19);
                    } catch (Exception var32) {
                        arg1.method877((byte) 112, -20);
                    } catch (Throwable var33) {
                        arg1.method877((byte) 123, -21);
                    }
                } else {
                    arg1.method877((byte) 119, var3.field274[var7]);
                }
            }
            arg1.method871(var6, 124);
            arg1.method837(arg2 ^ 0xFFFFFF96, arg1.field2155 - var6);
            var3.method476(arg2 ^ 0x76);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field146++;
        int var8 = 94 % ((-arg6 - 4) / 46);
        if (arg0 >= class207.field3810 && class66.field1163 >= arg5 && arg7 >= class216.field3964 && class113.field2040 >= arg2) {
            class131.method934(arg2, 96, arg4, arg3, arg1, arg5, arg0, arg7);
        } else {
            class234.method1597(arg2, arg0, arg4, arg1, (byte) 110, arg7, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field143++;
        if (class103.field1868 == arg1 && class265.field4704 == arg4 && class111.field2009 == arg0 || class17.method125(55)) {
            return;
        }
        class103.field1868 = arg1;
        class111.field2009 = arg0;
        class265.field4704 = arg4;
        if (class17.method125(16)) {
            class111.field2009 = 0;
        }
        if (arg6) {
            class276.method1892((byte) -117, 28);
        } else {
            class276.method1892((byte) -119, 25);
        }
        class265.method1811(class228.field4146, 6, true);
        int var7 = class77.field1339;
        int var8 = class107.field1933;
        class107.field1933 = (arg4 - 6) * 8;
        class77.field1339 = arg1 * 8 - 48;
        class66.field1161 = class88.method574(true, class265.field4704 * 8, class103.field1868 * 8);
        class2.field44 = null;
        int var9 = class77.field1339 - var7;
        int var10 = class77.field1339;
        int var11 = class107.field1933 - var8;
        int var12 = class107.field1933;
        if (arg6) {
            class108.field1943 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class71 var14 = class87.field1712[var13];
                if (var14 != null) {
                    var14.field2694 -= var9 * 128;
                    var14.field2687 -= var11 * 128;
                    if (var14.field2694 >= 0 && var14.field2694 <= 13184 && var14.field2687 >= 0 && var14.field2687 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2651[var15] -= var9;
                            var14.field2720[var15] -= var11;
                        }
                        class97.field1811[class108.field1943++] = var13;
                    } else {
                        class87.field1712[var13].field1236 = null;
                        class87.field1712[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class71 var32 = class87.field1712[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2651[var33] -= var9;
                        var32.field2720[var33] -= var11;
                    }
                    var32.field2687 -= var11 * 128;
                    var32.field2694 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class188 var30 = class93.field1774[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2651[var31] -= var9;
                    var30.field2720[var31] -= var11;
                }
                var30.field2687 -= var11 * 128;
                var30.field2694 -= var9 * 128;
            }
        }
        class265.field4703 = arg0;
        class241.field4310.method1356(arg2, (byte) -85, arg3, false);
        byte var18 = 104;
        byte var19 = 0;
        byte var20 = 0;
        byte var21 = 1;
        byte var22 = 104;
        if (var9 < 0) {
            var19 = 103;
            var21 = -1;
            var18 = -1;
        }
        byte var23 = 1;
        if (var11 < 0) {
            var23 = -1;
            var20 = 103;
            var22 = -1;
        }
        for (int var24 = var19; var24 != var18; var24 += var21) {
            for (int var26 = var20; var26 != var22; var26 += var23) {
                int var27 = var24 + var9;
                int var28 = var11 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class71.field1238[var29][var24][var26] = class71.field1238[var29][var27][var28];
                    } else {
                        class71.field1238[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class79 var25 = (class79) class246.field4383.method1375(16259); var25 != null; var25 = (class79) class246.field4383.method1377(-19546)) {
            var25.field1368 -= var9;
            var25.field1369 -= var11;
            if (var25.field1368 < 0 || var25.field1369 < 0 || var25.field1368 >= 104 || var25.field1369 >= 104) {
                var25.method476(107);
            }
        }
        class185.field3453 = 0;
        class120.field2192 = -1;
        if (arg6) {
            class134.field2403 -= var11;
            class268.field4745 -= var11 * 128;
            class252.field4482 -= var11;
            class49.field807 -= var9;
            class113.field2039 -= var9 * 128;
            class119.field2179 -= var9;
        } else {
            class211.field3848 = 1;
        }
        if (class256.field4551 != arg5) {
            class24.field405 -= var11;
            class256.field4551 -= var9;
        }
        class229.field4168.method1383((byte) 18);
        class203.field3721.method1383((byte) 113);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field142 = null;
        field145 = null;
        field140 = null;
        if (arg0 <= -44) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method76(int arg0, int arg1) {
        field138++;
        if (arg1 != -22746) {
            field137 = 71;
        }
        class174 var2 = class249.method1671(8, arg0, (byte) -108);
        var2.method1234((byte) -22);
    }
}
