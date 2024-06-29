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

@OriginalClass("client!jd")
public class class74 {

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lsb;")
    public static class98 field1259 = class47.method368("mapdots", 0);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lvf;")
    public static class48 field1244 = new class48();

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lsb;")
    private static class98 field1265 = class47.method368("flash2:", 0);

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Lsb;")
    private static class98 field1268 = class47.method368("World", 0);

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lsb;")
    public static class98 field1264 = field1268;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lsb;")
    public static class98 field1267 = field1265;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[J")
    public static long[] field1270 = new long[200];

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Lsb;")
    public static class98 field1271 = field1265;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Ltg;")
    public static class75 field1266;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjf;I)V")
    public static final void method546(int arg0, class70 arg1, int arg2) {
        if (arg0 != 4) {
            return;
        }
        field1245++;
        while (true) {
            class36 var3 = (class36) field1244.method371((byte) 61);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field615; var5++) {
                if (var3.field611[var5] != null) {
                    if (var3.field611[var5].field445 == 2) {
                        var3.field605[var5] = -5;
                    }
                    if (var3.field611[var5].field445 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field612[var5] != null) {
                    if (var3.field612[var5].field445 == 2) {
                        var3.field605[var5] = -6;
                    }
                    if (var3.field612[var5].field445 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method490(arg2, arg0 - 88);
            arg1.method1477(0, -26755);
            int var6 = arg1.field3728;
            arg1.method1456(var3.field602, -23438);
            for (int var7 = 0; var7 < var3.field615; var7++) {
                if (var3.field605[var7] == 0) {
                    try {
                        int var8 = var3.field607[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field611[var7].field447;
                            int var13 = var12.getInt((Object) null);
                            arg1.method1477(0, -26755);
                            arg1.method1456(var13, -23438);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field611[var7].field447;
                            var9.setInt((Object) null, var3.field603[var7]);
                            arg1.method1477(0, -26755);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field611[var7].field447;
                            int var11 = var10.getModifiers();
                            arg1.method1477(0, -26755);
                            arg1.method1456(var11, -23438);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field613[var7];
                            Method var15 = (Method) var3.field612[var7].field447;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1477(0, -26755);
                            } else if (var19 instanceof Number) {
                                arg1.method1477(1, arg0 ^ 0xFFFF9779);
                                arg1.method1484(((Number) var19).longValue(), (byte) 38);
                            } else if (var19 instanceof class98) {
                                arg1.method1477(2, -26755);
                                arg1.method1459((class98) var19, (byte) 78);
                            } else {
                                arg1.method1477(4, arg0 - 26759);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field612[var7].field447;
                            int var21 = var20.getModifiers();
                            arg1.method1477(0, -26755);
                            arg1.method1456(var21, -23438);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1477(-10, -26755);
                    } catch (InvalidClassException var23) {
                        arg1.method1477(-11, -26755);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1477(-12, -26755);
                    } catch (OptionalDataException var25) {
                        arg1.method1477(-13, -26755);
                    } catch (IllegalAccessException var26) {
                        arg1.method1477(-14, -26755);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1477(-15, -26755);
                    } catch (InvocationTargetException var28) {
                        arg1.method1477(-16, -26755);
                    } catch (SecurityException var29) {
                        arg1.method1477(-17, -26755);
                    } catch (IOException var30) {
                        arg1.method1477(-18, arg0 - 26759);
                    } catch (NullPointerException var31) {
                        arg1.method1477(-19, arg0 ^ -26759);
                    } catch (Exception var32) {
                        arg1.method1477(-20, -26755);
                    } catch (Throwable var33) {
                        arg1.method1477(-21, -26755);
                    }
                } else {
                    arg1.method1477(var3.field605[var7], -26755);
                }
            }
            arg1.method1469(232715848, var6);
            arg1.method1476(arg1.field3728 - var6, -119);
            var3.method1611((byte) -126);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)I")
    public static final int method547(int arg0, byte arg1) {
        if (arg1 != 93) {
            method548(-117);
        }
        field1250++;
        int var2 = (arg0 & 0xCC) >> 6;
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method548(int arg0) {
        field1265 = null;
        field1270 = null;
        field1264 = null;
        field1259 = null;
        field1271 = null;
        field1266 = null;
        field1267 = null;
        if (arg0 != -12) {
            field1267 = null;
        }
        field1244 = null;
        field1268 = null;
    }
}
