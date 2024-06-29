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

@OriginalClass("client!rc")
public class class69 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1025 = "Created gameworld";

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method488(byte arg0) {
        field1025 = null;
        if (arg0 != -115) {
            field1023 = -74;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method489(int arg0, int arg1) {
        field1026++;
        if (arg0 < 0) {
            return 0;
        }
        int var2 = -77 / ((arg1 - 78) / 42);
        class83 var3 = (class83) class67.field991.method1034((long) arg0, (byte) 21);
        if (var3 == null) {
            return class94.method736(5, arg0).field3216;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field1206.length; var5++) {
            if (var3.field1206[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class94.method736(5, arg0).field3216 - var3.field1206.length);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILpg;)V")
    public static final void method490(int arg0, int arg1, class77 arg2) {
        field1022++;
        if (arg0 != -13) {
            method488((byte) -13);
        }
        while (true) {
            class44 var3 = (class44) class42.field590.method1384(2);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field644; var5++) {
                if (var3.field633[var5] != null) {
                    if (var3.field633[var5].field4450 == 2) {
                        var3.field630[var5] = -5;
                    }
                    if (var3.field633[var5].field4450 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field640[var5] != null) {
                    if (var3.field640[var5].field4450 == 2) {
                        var3.field630[var5] = -6;
                    }
                    if (var3.field640[var5].field4450 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method557(arg1, 8);
            arg2.method1074(0, 99);
            int var6 = arg2.field2511;
            arg2.method1119(var3.field641, (byte) -119);
            for (int var7 = 0; var7 < var3.field644; var7++) {
                if (var3.field630[var7] == 0) {
                    try {
                        int var8 = var3.field635[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field633[var7].field4449;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1074(0, 75);
                            arg2.method1119(var13, (byte) 97);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field633[var7].field4449;
                            var11.setInt((Object) null, var3.field639[var7]);
                            arg2.method1074(0, 69);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field633[var7].field4449;
                            int var10 = var9.getModifiers();
                            arg2.method1074(0, 62);
                            arg2.method1119(var10, (byte) -124);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field640[var7].field4449;
                            byte[][] var15 = var3.field637[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1074(0, 58);
                            } else if (var19 instanceof Number) {
                                arg2.method1074(1, 88);
                                arg2.method1069(((Number) var19).longValue(), -99);
                            } else if (var19 instanceof String) {
                                arg2.method1074(2, 55);
                                arg2.method1073((String) var19, false);
                            } else {
                                arg2.method1074(4, 122);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field640[var7].field4449;
                            int var21 = var20.getModifiers();
                            arg2.method1074(0, 84);
                            arg2.method1119(var21, (byte) 94);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1074(-10, 60);
                    } catch (InvalidClassException var23) {
                        arg2.method1074(-11, 98);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1074(-12, 103);
                    } catch (OptionalDataException var25) {
                        arg2.method1074(-13, 92);
                    } catch (IllegalAccessException var26) {
                        arg2.method1074(-14, arg0 + 113);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1074(-15, 102);
                    } catch (InvocationTargetException var28) {
                        arg2.method1074(-16, 53);
                    } catch (SecurityException var29) {
                        arg2.method1074(-17, 123);
                    } catch (IOException var30) {
                        arg2.method1074(-18, 51);
                    } catch (NullPointerException var31) {
                        arg2.method1074(-19, arg0 + 90);
                    } catch (Exception var32) {
                        arg2.method1074(-20, arg0 ^ -63);
                    } catch (Throwable var33) {
                        arg2.method1074(-21, 54);
                    }
                } else {
                    arg2.method1074(var3.field630[var7], arg0 + 111);
                }
            }
            arg2.method1076((byte) -117, var6);
            arg2.method1114(arg2.field2511 - var6, true);
            var3.method1922(arg0 ^ 0xC);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Z")
    public static final boolean method491(byte arg0) {
        if (arg0 != -81) {
            return true;
        }
        field1024++;
        try {
            return class252.method1790((byte) 77);
        } catch (IOException var4) {
            class17.method121((byte) 104);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class102.field1501 + "," + class277.field4442 + "," + class291.field4613 + " - " + class221.field3534 + "," + (class186.field2993.field1917[0] + class282.field4487) + "," + (class186.field2993.field1974[0] + class99.field1465) + " - ";
            for (int var3 = 0; class221.field3534 > var3 && var3 < 50; var3++) {
                var2 = var2 + class50.field732.field2523[var3] + ",";
            }
            class191.method1422(var5, var2, (byte) -85);
            class225.method1612((byte) 109);
            return true;
        }
    }
}
