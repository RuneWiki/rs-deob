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

@OriginalClass("client!wm")
public class class418 implements class260 {

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lnn;")
    public static class151 field6193 = new class151("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lnn;")
    public static class151 field6198 = new class151("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[I")
    public static int[] field6199 = new int[200];

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Z")
    public static boolean field6200 = false;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
    public boolean field6187;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static final void method2599(int arg0) {
        if (arg0 >= -108) {
            field6198 = null;
        }
        class72.field937.method2307(5142);
        field6191++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljk;II)V")
    public static final void method2600(class119 arg0, int arg1, int arg2) {
        field6196++;
        if (arg2 != 0) {
            field6193 = null;
        }
        while (true) {
            class345 var3 = (class345) class414.field6154.method2514((byte) 61);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5149; var5++) {
                if (var3.field5160[var5] != null) {
                    if (var3.field5160[var5].field3172 == 2) {
                        var3.field5150[var5] = -5;
                    }
                    if (var3.field5160[var5].field3172 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5155[var5] != null) {
                    if (var3.field5155[var5].field3172 == 2) {
                        var3.field5150[var5] = -6;
                    }
                    if (var3.field5155[var5].field3172 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method716(arg1, -108);
            arg0.method2366(0, true);
            int var6 = arg0.field5666;
            arg0.method2381(var3.field5151, 0);
            for (int var7 = 0; var7 < var3.field5149; var7++) {
                if (var3.field5150[var7] == 0) {
                    try {
                        int var8 = var3.field5153[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field5160[var7].field3175;
                            int var13 = var12.getInt((Object) null);
                            arg0.method2366(0, true);
                            arg0.method2381(var13, 0);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field5160[var7].field3175;
                            var9.setInt((Object) null, var3.field5159[var7]);
                            arg0.method2366(0, true);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field5160[var7].field3175;
                            int var11 = var10.getModifiers();
                            arg0.method2366(0, true);
                            arg0.method2381(var11, arg2);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field5155[var7].field3175;
                            byte[][] var17 = var3.field5161[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method2366(0, true);
                            } else if (var21 instanceof Number) {
                                arg0.method2366(1, true);
                                arg0.method2349(((Number) var21).longValue(), (byte) -36);
                            } else if (var21 instanceof String) {
                                arg0.method2366(2, true);
                                arg0.method2375(-4, (String) var21);
                            } else {
                                arg0.method2366(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field5155[var7].field3175;
                            int var15 = var14.getModifiers();
                            arg0.method2366(0, true);
                            arg0.method2381(var15, 0);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method2366(-10, true);
                    } catch (InvalidClassException var23) {
                        arg0.method2366(-11, true);
                    } catch (StreamCorruptedException var24) {
                        arg0.method2366(-12, true);
                    } catch (OptionalDataException var25) {
                        arg0.method2366(-13, true);
                    } catch (IllegalAccessException var26) {
                        arg0.method2366(-14, true);
                    } catch (IllegalArgumentException var27) {
                        arg0.method2366(-15, true);
                    } catch (InvocationTargetException var28) {
                        arg0.method2366(-16, true);
                    } catch (SecurityException var29) {
                        arg0.method2366(-17, true);
                    } catch (IOException var30) {
                        arg0.method2366(-18, true);
                    } catch (NullPointerException var31) {
                        arg0.method2366(-19, true);
                    } catch (Exception var32) {
                        arg0.method2366(-20, true);
                    } catch (Throwable var33) {
                        arg0.method2366(-21, true);
                    }
                } else {
                    arg0.method2366(var3.field5150[var7], true);
                }
            }
            arg0.method2348(var6, (byte) 0);
            arg0.method2331(arg0.field5666 - var6, 65536);
            var3.method625((byte) -50);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILef;Lsc;)V")
    public static final void method2601(int arg0, int arg1, class385 arg2, class239 arg3) {
        int var4 = -13 / ((-arg0 - 18) / 50);
        field6189++;
        class345 var5 = new class345();
        var5.field5149 = arg2.method2343(255);
        var5.field5151 = arg2.method2354(255);
        var5.field5150 = new int[var5.field5149];
        var5.field5160 = new class211[var5.field5149];
        var5.field5153 = new int[var5.field5149];
        var5.field5159 = new int[var5.field5149];
        var5.field5161 = new byte[var5.field5149][][];
        var5.field5155 = new class211[var5.field5149];
        for (int var6 = 0; var6 < var5.field5149; var6++) {
            try {
                int var7 = arg2.method2343(255);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = arg2.method2332(122);
                    String var9 = arg2.method2332(92);
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg2.method2354(255);
                    }
                    var5.field5153[var6] = var7;
                    var5.field5159[var6] = var10;
                    var5.field5160[var6] = arg3.method1462(0, var9, class406.method2549(var8, -85));
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = arg2.method2332(122);
                    String var12 = arg2.method2332(65);
                    int var13 = arg2.method2343(255);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = arg2.method2332(56);
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg2.method2354(255);
                            var16[var17] = new byte[var18];
                            arg2.method2356((byte) 105, var16[var17], var18, 0);
                        }
                    }
                    var5.field5153[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class406.method2549(var14[var20], 117);
                    }
                    var5.field5155[var6] = arg3.method1445(0, var12, var19, class406.method2549(var11, 109));
                    var5.field5161[var6] = var16;
                }
            } catch (ClassNotFoundException var21) {
                var5.field5150[var6] = -1;
            } catch (SecurityException var22) {
                var5.field5150[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field5150[var6] = -3;
            } catch (Exception var24) {
                var5.field5150[var6] = -4;
            } catch (Throwable var25) {
                var5.field5150[var6] = -5;
            }
        }
        class414.field6154.method2504(42, var5);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lur;I)Z")
    public final boolean method1606(class260 arg0, int arg1) {
        field6190++;
        if (!(arg0 instanceof class418)) {
            return false;
        }
        class418 var3 = (class418) arg0;
        if (this.field6192 != var3.field6192) {
            return false;
        } else if (this.field6197 != var3.field6197) {
            return false;
        } else if (this.field6186 != var3.field6186) {
            return false;
        } else if (this.field6195 != var3.field6195) {
            return false;
        } else if (this.field6194 != var3.field6194) {
            return false;
        } else if (this.field6188 != var3.field6188) {
            return false;
        } else if (this.field6187 == var3.field6187) {
            int var4 = 118 / ((8 - arg1) / 39);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method2602(int arg0) {
        field6198 = null;
        if (arg0 == 10729) {
            field6199 = null;
            field6193 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
    public static final void method2603(int arg0, int arg1, int arg2, int arg3) {
        field6184++;
        int var4 = class438.field6450 * arg2 >> 8;
        if (arg1 != var4 && arg0 != -1) {
            class250.method1523(arg0, 0, class95.field1330, false, 179, var4);
            class437.field6428 = true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)J")
    public final long method1607(boolean arg0) {
        if (arg0) {
            return -92L;
        }
        field6185++;
        long[] var2 = class359.field5286;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field6192) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field6197 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field6197) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field6186 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field6186 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field6186 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field6186 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field6195 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field6194 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field6194 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field6194 >> 8)) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field6194 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field6188) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field6187 ? 1 : 0)) & 0xFFL)];
    }
}
