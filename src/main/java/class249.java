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

@OriginalClass("client!l")
public class class249 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3912 = -1;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ljh;")
    public static class207 field3915;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lgn;B)Ltj;", line = 10)
    public static final class273 method1691(class303 arg0, byte arg1) {
        field3916++;
        arg0.method2043((byte) -112);
        int var2 = arg0.method2043((byte) -112);
        class273 var3 = class40.method295(13, var2);
        var3.field4190 = arg0.method2043((byte) -110);
        int var4 = arg0.method2043((byte) -112);
        if (arg1 != 35) {
            return (class273) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2043((byte) -125);
            var3.method167((byte) 71, var6, arg0);
        }
        var3.method349(1);
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 50)
    public static void method1692(byte arg0) {
        field3915 = null;
        if (arg0 != -97) {
            field3912 = 64;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 75)
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3917++;
        if (class81.field1199 == 0) {
            int var7 = class27.field345;
            int var8 = class54.field763;
            int var9 = class234.field3757;
            int var10 = class6.field65;
            int var11 = (arg1 - arg2) * (var8 - var7) / arg0 + var7;
            int var12 = (arg4 - arg6) * (var10 - var9) / arg5 + var9;
            if (class120.field1841 && (class310.field4920 & 0x40) != 0) {
                class207 var13 = class276.method1812(true, class197.field2954, class253.field3934);
                if (var13 == null) {
                    class175.method1189(arg3 + 20177);
                } else {
                    class85.method584(0L, (short) 39, var12, (byte) -111, " ->", var11, class227.field3638, class139.field2150);
                }
            } else {
                class294.field4517++;
                if (class2.field25 == 1) {
                    class85.method584(0L, (short) 38, var12, (byte) -120, "", var11, class282.field4336, -1);
                }
                class85.method584(0L, (short) 37, var12, (byte) -110, "", var11, class23.field291, -1);
            }
        }
        if (arg3 != -20178) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class77.field1152; var16++) {
            long var17 = class74.field1105[var16];
            int var19 = (int) var17 >> 29 & 0x3;
            int var20 = ((int) var17 & 0x3FC2) >> 7;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var17 & 0x7F;
            if (var14 != var17) {
                var14 = var17;
                if (var19 == 2 && class170.method1156(class77.field1154, var22, var20, var17)) {
                    class17 var23 = class277.method1819((byte) 126, var21);
                    if (var23.field195 != null) {
                        var23 = var23.method139(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class81.field1199 == 1) {
                        class85.method584(var17, (short) 24, var20, (byte) -119, class86.field1299 + " -> <col=00ffff>" + var23.field199, var22, class82.field1217, class165.field2545);
                        class181.field2775++;
                    } else if (class120.field1841) {
                        class280 var24 = class133.field2097 == -1 ? null : class27.method209(11, class133.field2097);
                        if ((class310.field4920 & 0x4) != 0 && (var24 == null || var23.method127(class133.field2097, var24.field4315, (byte) 93) != var24.field4315)) {
                            class203.field3064++;
                            class85.method584(var17, (short) 49, var20, (byte) -115, class302.field4663 + " -> <col=00ffff>" + var23.field199, var22, class227.field3638, class139.field2150);
                        }
                    } else {
                        class33.field415++;
                        String[] var25 = var23.field217;
                        if (class30.field375) {
                            var25 = class288.method1876(var25, (byte) 119);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 6;
                                    }
                                    if (var26 == 1) {
                                        var27 = 21;
                                    }
                                    class322.field5025++;
                                    if (var26 == 2) {
                                        var27 = 46;
                                    }
                                    int var28 = -1;
                                    if (var26 == 3) {
                                        var27 = 51;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    if (var23.field179 == var26) {
                                        var28 = var23.field178;
                                    }
                                    if (var23.field198 == var26) {
                                        var28 = var23.field211;
                                    }
                                    class85.method584(var17, var27, var20, (byte) -109, "<col=00ffff>" + var23.field199, var22, var25[var26], var28);
                                }
                            }
                        }
                        class85.method584((long) var23.field196, (short) 1006, var20, (byte) -111, "<col=00ffff>" + var23.field199, var22, class280.field4326, class261.field4044);
                    }
                }
                if (var19 == 1) {
                    class80 var29 = class208.field3313[var21];
                    if ((var29.field1178.field4609 & 0x1) == 0 && (var29.field537 & 0x7F) == 0 && (var29.field519 & 0x7F) == 0 || (var29.field1178.field4609 & 0x1) == 1 && (var29.field537 & 0x7F) == 64 && (var29.field519 & 0x7F) == 64) {
                        int var30 = 64 - (var29.field1178.field4609 * 64 - var29.field537);
                        int var31 = var29.field519 - ((var29.field1178.field4609 - 1) * 64);
                        for (int var32 = 0; var32 < class155.field2439; var32++) {
                            class80 var33 = class208.field3313[class144.field2286[var32]];
                            if (var33 != null && !var33.field524 && var29 != var33 && var33.field563) {
                                int var34 = var33.field537 + 64 - (var33.field1178.field4609 * 64);
                                int var35 = var33.field519 - (var33.field1178.field4609 - 1) * 64;
                                if (var30 <= var34 && var33.field1178.field4609 <= (var29.field1178.field4609 - (var34 - var30 >> 7)) && var35 >= var31 && (var29.field1178.field4609 - (var35 - var31 >> 7)) >= var33.field1178.field4609) {
                                    class175.method1185(class144.field2286[var32], var22, var33.field1178, (byte) -76, var20);
                                    var33.field524 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class175.field2678; var36++) {
                            class82 var37 = class64.field966[class174.field2645[var36]];
                            if (var37 != null && !var37.field524 && var37.field563) {
                                int var38 = var37.field537 - ((var37.method271((byte) 92) - 1) * 64);
                                int var39 = var37.field519 - ((var37.method271((byte) 55) - 1) * 64);
                                if (var38 >= var30 && var37.method271((byte) 66) <= (var29.field1178.field4609 - (var38 - var30 >> 7)) && var31 <= var39 && var37.method271((byte) 99) <= (var29.field1178.field4609 - (var39 - var31 >> 7))) {
                                    class233.method1590(class174.field2645[var36], var22, var20, 1455928772, var37);
                                    var37.field524 = true;
                                }
                            }
                        }
                    }
                    if (var29.field524) {
                        continue;
                    }
                    class175.method1185(var21, var22, var29.field1178, (byte) -76, var20);
                    var29.field524 = true;
                }
                if (var19 == 0) {
                    class82 var40 = class64.field966[var21];
                    if ((var40.field537 & 0x7F) == 64 && (var40.field519 & 0x7F) == 64) {
                        int var41 = var40.field537 + 64 - var40.method271((byte) 82) * 64;
                        int var42 = var40.field519 - ((var40.method271((byte) 114) - 1) * 64);
                        for (int var43 = 0; var43 < class155.field2439; var43++) {
                            class80 var44 = class208.field3313[class144.field2286[var43]];
                            if (var44 != null && !var44.field524 && var44.field563) {
                                int var45 = var44.field537 + 64 - (var44.field1178.field4609 * 64);
                                int var46 = var44.field519 + 64 - (var44.field1178.field4609 * 64);
                                if (var45 >= var41 && var44.field1178.field4609 <= (var40.method271((byte) 96) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field1178.field4609 <= var40.method271((byte) 66) - (var46 - var42 >> 7)) {
                                    class175.method1185(class144.field2286[var43], var22, var44.field1178, (byte) -76, var20);
                                    var44.field524 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class175.field2678; var47++) {
                            class82 var48 = class64.field966[class174.field2645[var47]];
                            if (var48 != null && !var48.field524 && var40 != var48 && var48.field563) {
                                int var49 = var48.field537 - (var48.method271((byte) 75) * 64 - 64);
                                int var50 = var48.field519 - (var48.method271((byte) 82) * 64 - 64);
                                if (var41 <= var49 && var48.method271((byte) 94) <= var40.method271((byte) 46) - (var49 - var41 >> 7) && var50 >= var42 && var48.method271((byte) 127) <= var40.method271((byte) 111) - (var50 - var42 >> 7)) {
                                    class233.method1590(class174.field2645[var47], var22, var20, 1455928772, var48);
                                    var48.field524 = true;
                                }
                            }
                        }
                    }
                    if (var40.field524) {
                        continue;
                    }
                    class233.method1590(var21, var22, var20, 1455928772, var40);
                    var40.field524 = true;
                }
                if (var19 == 3) {
                    class2 var51 = class274.field4221[class77.field1154][var22][var20];
                    if (var51 != null) {
                        for (class286 var52 = (class286) var51.method6(true); var52 != null; var52 = (class286) var51.method8(18820)) {
                            int var53 = var52.field4378.field141;
                            class291 var54 = class160.method1106(var53, 105);
                            if (class81.field1199 == 1) {
                                class85.method584((long) var53, (short) 16, var20, (byte) -122, class86.field1299 + " -> <col=ff9040>" + var54.field4468, var22, class82.field1217, class165.field2545);
                                class307.field4833++;
                            } else if (class120.field1841) {
                                class280 var55 = class133.field2097 == -1 ? null : class27.method209(11, class133.field2097);
                                if ((class310.field4920 & 0x1) != 0 && (var55 == null || var54.method1893(var55.field4315, (byte) -100, class133.field2097) != var55.field4315)) {
                                    class85.method584((long) var53, (short) 4, var20, (byte) -110, class302.field4663 + " -> <col=ff9040>" + var54.field4468, var22, class227.field3638, class139.field2150);
                                    class106.field1625++;
                                }
                            } else {
                                String[] var56 = var54.field4441;
                                if (class30.field375) {
                                    var56 = class288.method1876(var56, (byte) 117);
                                }
                                class283.field4352++;
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        byte var58 = 0;
                                        if (var57 == 0) {
                                            var58 = 25;
                                        }
                                        if (var57 == 1) {
                                            var58 = 33;
                                        }
                                        int var59 = -1;
                                        class309.field4870++;
                                        if (var57 == 2) {
                                            var58 = 57;
                                        }
                                        if (var57 == 3) {
                                            var58 = 30;
                                        }
                                        if (var54.field4491 == var57) {
                                            var59 = var54.field4489;
                                        }
                                        if (var57 == 4) {
                                            var58 = 14;
                                        }
                                        if (var54.field4464 == var57) {
                                            var59 = var54.field4447;
                                        }
                                        class85.method584((long) var53, var58, var20, (byte) -122, "<col=ff9040>" + var54.field4468, var22, var56[var57], var59);
                                    }
                                }
                                class85.method584((long) var53, (short) 1002, var20, (byte) -118, "<col=ff9040>" + var54.field4468, var22, class280.field4326, class261.field4044);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILs;Z)V", line = 478)
    public static final void method1694(int arg0, class304 arg1, boolean arg2) {
        field3913++;
        if (arg2) {
            method1694(26, (class304) null, false);
        }
        while (true) {
            class43 var3 = (class43) class152.field2395.method10((byte) 116);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field608; var5++) {
                if (var3.field614[var5] != null) {
                    if (var3.field614[var5].field3931 == 2) {
                        var3.field604[var5] = -5;
                    }
                    if (var3.field614[var5].field3931 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field599[var5] != null) {
                    if (var3.field599[var5].field3931 == 2) {
                        var3.field604[var5] = -6;
                    }
                    if (var3.field599[var5].field3931 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method2064(255, arg0);
            arg1.method2034(-71, 0);
            int var6 = arg1.field4679;
            arg1.method2013(var3.field605, -121);
            for (int var7 = 0; var7 < var3.field608; var7++) {
                if (var3.field604[var7] == 0) {
                    try {
                        int var8 = var3.field609[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field614[var7].field3929;
                            int var13 = var12.getInt((Object) null);
                            arg1.method2034(-57, 0);
                            arg1.method2013(var13, -117);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field614[var7].field3929;
                            var11.setInt((Object) null, var3.field601[var7]);
                            arg1.method2034(-123, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field614[var7].field3929;
                            int var10 = var9.getModifiers();
                            arg1.method2034(-76, 0);
                            arg1.method2013(var10, -112);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field599[var7].field3929;
                            byte[][] var15 = var3.field600[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method2034(-94, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method2034(-81, 1);
                                arg1.method2023(((Number) var19).longValue(), 120);
                            } else if (var19 instanceof String) {
                                arg1.method2034(-69, 2);
                                arg1.method2057(-124, (String) var19);
                            } else {
                                arg1.method2034(-116, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field599[var7].field3929;
                            int var21 = var20.getModifiers();
                            arg1.method2034(-86, 0);
                            arg1.method2013(var21, -118);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method2034(-48, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method2034(-111, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method2034(-4, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method2034(-114, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method2034(-83, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method2034(-118, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method2034(-125, -16);
                    } catch (SecurityException var41) {
                        arg1.method2034(-22, -17);
                    } catch (IOException var42) {
                        arg1.method2034(-17, -18);
                    } catch (NullPointerException var43) {
                        arg1.method2034(-112, -19);
                    } catch (Exception var44) {
                        arg1.method2034(-53, -20);
                    } catch (Throwable var45) {
                        arg1.method2034(-38, -21);
                    }
                } else {
                    arg1.method2034(-53, var3.field604[var7]);
                }
            }
            arg1.method2048((byte) 19, var6);
            arg1.method2019(arg1.field4679 - var6, -16870);
            var3.method1284(0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 671)
    public static final void method1695(int arg0) {
        field3914++;
        if (class237.field3796 || class208.field3307 == 2) {
            return;
        }
        try {
            if (arg0 < 106) {
                field3912 = -49;
            }
            class254.method1715("tbrefresh", (byte) -88, class236.field3790);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 700)
    public class249() {
        new class29();
    }
}
