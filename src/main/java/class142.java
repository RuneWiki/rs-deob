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

@OriginalClass("client!rd")
public class class142 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field2742 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public static int[] field2741 = new int[2000];

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Z")
    public static boolean field2749 = true;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[[[I")
    public static int[][][] field2751 = new int[2][][];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lwb;")
    public class127 field2745;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[I")
    public int[] field2748;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
    public static int[] field2752;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[Lsg;")
    public class30[] field2743;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1054(int arg0, int arg1) {
        field2739++;
        class68 var2 = class103.method830(arg0, 4, 11);
        if (arg1 != 0) {
            field2741 = null;
        }
        var2.method610(2141640544);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method1055(boolean arg0) {
        field2752 = null;
        field2751 = null;
        if (!arg0) {
            field2741 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)I")
    public static final int method1056(int arg0, int arg1) {
        field2738++;
        if (arg1 <= 20) {
            field2752 = null;
        }
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILhh;I)V")
    public static final void method1057(int arg0, class173 arg1, int arg2) {
        field2740++;
        if (arg2 <= 58) {
            method1054(-74, 118);
        }
        while (true) {
            class61 var3 = (class61) class29.field553.method478(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1314; var5++) {
                if (var3.field1319[var5] != null) {
                    if (var3.field1319[var5].field493 == 2) {
                        var3.field1321[var5] = -5;
                    }
                    if (var3.field1319[var5].field493 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1311[var5] != null) {
                    if (var3.field1311[var5].field493 == 2) {
                        var3.field1321[var5] = -6;
                    }
                    if (var3.field1311[var5].field493 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1267(arg0, -9);
            arg1.method76(5305, 0);
            int var6 = arg1.field146;
            arg1.method57(var3.field1316, 118);
            for (int var7 = 0; var7 < var3.field1314; var7++) {
                if (var3.field1321[var7] == 0) {
                    try {
                        int var8 = var3.field1313[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1319[var7].field492;
                            int var13 = var12.getInt((Object) null);
                            arg1.method76(5305, 0);
                            arg1.method57(var13, 107);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1319[var7].field492;
                            var9.setInt((Object) null, var3.field1312[var7]);
                            arg1.method76(5305, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1319[var7].field492;
                            int var11 = var10.getModifiers();
                            arg1.method76(5305, 0);
                            arg1.method57(var11, 96);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1311[var7].field492;
                            byte[][] var17 = var3.field1317[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method76(5305, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method76(5305, 1);
                                arg1.method72(-1033389592, ((Number) var21).longValue());
                            } else if (var21 instanceof class30) {
                                arg1.method76(5305, 2);
                                arg1.method85((class30) var21, (byte) 25);
                            } else {
                                arg1.method76(5305, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1311[var7].field492;
                            int var15 = var14.getModifiers();
                            arg1.method76(5305, 0);
                            arg1.method57(var15, 120);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method76(5305, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method76(5305, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method76(5305, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method76(5305, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method76(5305, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method76(5305, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method76(5305, -16);
                    } catch (SecurityException var29) {
                        arg1.method76(5305, -17);
                    } catch (IOException var30) {
                        arg1.method76(5305, -18);
                    } catch (NullPointerException var31) {
                        arg1.method76(5305, -19);
                    } catch (Exception var32) {
                        arg1.method76(5305, -20);
                    } catch (Throwable var33) {
                        arg1.method76(5305, -21);
                    }
                } else {
                    arg1.method76(5305, var3.field1321[var7]);
                }
            }
            arg1.method95(var6, -127);
            arg1.method66(arg1.field146 - var6, -5012);
            var3.method1681(false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Z")
    public static final boolean method1058(int arg0, byte arg1) {
        if (arg1 == -61) {
            field2747++;
            return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
    public static final boolean method1059(byte arg0, int arg1) {
        field2744++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 < 112) {
            method1055(false);
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILdl;)Ldl;")
    public static final class31 method1060(int arg0, class31 arg1) {
        field2746++;
        if (~arg1.field798 != arg0) {
            return class272.method1858(arg1.field798, arg0 + 65535);
        }
        int var2 = arg1.field638 >>> 16;
        class178 var3 = new class178(class143.field2762);
        for (class180 var4 = (class180) var3.method1302(-26676); var4 != null; var4 = (class180) var3.method1297((byte) -14)) {
            if (var4.field3335 == var2) {
                return class272.method1858((int) var4.field4215, 65535);
            }
        }
        return null;
    }
}
