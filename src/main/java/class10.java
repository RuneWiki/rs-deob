import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!ge")
public class class10 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[Z")
    public boolean[] field123 = new boolean[256];

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[[I")
    public int[][] field129 = new int[6][258];

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[[I")
    public int[][] field137 = new int[6][258];

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[B")
    public byte[] field134 = new byte[18002];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[B")
    public byte[] field120 = new byte[18002];

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public int field144 = 0;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
    public int[] field139 = new int[6];

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[B")
    public byte[] field125 = new byte[256];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public int field142 = 0;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[Z")
    public boolean[] field151 = new boolean[16];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
    public int[] field156 = new int[257];

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "[B")
    public byte[] field147 = new byte[4096];

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[[B")
    public byte[][] field154 = new byte[6][258];

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[I")
    public int[] field146 = new int[256];

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[[I")
    public int[][] field158 = new int[6][258];

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    public int[] field135 = new int[16];

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Z")
    public static boolean field145 = true;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Ljava/lang/String;")
    public static String field138 = "white:";

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[I")
    public static int[] field155 = new int[50];

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "J")
    public static volatile long field157 = 0L;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "B")
    public byte field130;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lpk;")
    public static class237 field136;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    public byte[] field132;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[B")
    public byte[] field140;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZII)V")
    public static final void method74(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field159++;
        if (arg2) {
            field157 = -44L;
        }
        for (int var5 = 0; var5 < class123.field1818; var5++) {
            if (arg1 < (class247.field3848[var5] + class150.field2189[var5]) && arg1 + arg4 > class150.field2189[var5] && (class188.field2802[var5] + class166.field2453[var5]) > arg0 && class188.field2802[var5] < arg0 + arg3) {
                class285.field4371[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field136 = null;
        if (arg0 < 50) {
            field157 = -107L;
        }
        field138 = null;
        field155 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method76(int arg0) {
        int var1 = class208.field3118;
        int var2 = class199.field2989;
        int var3 = class145.field2099 - class126.field1854 - var1;
        int var4 = class23.field385 - var2 - class85.field1311;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                int var5 = 0;
                int var6 = 0;
                Container var7;
                if (class247.field3838 != null) {
                    var7 = class247.field3838;
                } else if (class167.field2459 == null) {
                    var7 = class217.field3338.field505;
                } else {
                    var7 = class167.field2459;
                }
                if (class167.field2459 == var7) {
                    Insets var8 = class167.field2459.getInsets();
                    var5 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var7.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var5, var1, class23.field385);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var5, class145.field2099, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class145.field2099 + var6 - var3, var5, var3, class23.field385);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, class23.field385 + var5 - var4, class145.field2099, var4);
                }
            } catch (Exception var10) {
            }
        }
        field119++;
        if (arg0 != 736) {
            method76(-124);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Luj;IB)V")
    public static final void method77(class225 arg0, int arg1, byte arg2) {
        int var3 = -50 / ((56 - arg2) / 45);
        field153++;
        while (true) {
            class157 var4 = (class157) class78.field1238.method1894((byte) -90);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field2297; var6++) {
                if (var4.field2296[var6] != null) {
                    if (var4.field2296[var6].field713 == 2) {
                        var4.field2295[var6] = -5;
                    }
                    if (var4.field2296[var6].field713 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field2294[var6] != null) {
                    if (var4.field2294[var6].field713 == 2) {
                        var4.field2295[var6] = -6;
                    }
                    if (var4.field2294[var6].field713 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1540(arg1, (byte) -2);
            arg0.method437(true, 0);
            int var7 = arg0.field887;
            arg0.method453((byte) 89, var4.field2290);
            for (int var8 = 0; var8 < var4.field2297; var8++) {
                if (var4.field2295[var8] == 0) {
                    try {
                        int var9 = var4.field2291[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field2296[var8].field709;
                            int var14 = var13.getInt((Object) null);
                            arg0.method437(true, 0);
                            arg0.method453((byte) 123, var14);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field2296[var8].field709;
                            var12.setInt((Object) null, var4.field2301[var8]);
                            arg0.method437(true, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field2296[var8].field709;
                            int var11 = var10.getModifiers();
                            arg0.method437(true, 0);
                            arg0.method453((byte) 106, var11);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field2294[var8].field709;
                            byte[][] var16 = var4.field2293[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg0.method437(true, 0);
                            } else if ((var20 instanceof Number)) {
                                arg0.method437(true, 1);
                                arg0.method440(((Number) var20).longValue(), -67);
                            } else if ((var20 instanceof String)) {
                                arg0.method437(true, 2);
                                arg0.method396((String) var20, false);
                            } else {
                                arg0.method437(true, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field2294[var8].field709;
                            int var22 = var21.getModifiers();
                            arg0.method437(true, 0);
                            arg0.method453((byte) 98, var22);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method437(true, -10);
                    } catch (InvalidClassException var24) {
                        arg0.method437(true, -11);
                    } catch (StreamCorruptedException var25) {
                        arg0.method437(true, -12);
                    } catch (OptionalDataException var26) {
                        arg0.method437(true, -13);
                    } catch (IllegalAccessException var27) {
                        arg0.method437(true, -14);
                    } catch (IllegalArgumentException var28) {
                        arg0.method437(true, -15);
                    } catch (InvocationTargetException var29) {
                        arg0.method437(true, -16);
                    } catch (SecurityException var30) {
                        arg0.method437(true, -17);
                    } catch (IOException var31) {
                        arg0.method437(true, -18);
                    } catch (NullPointerException var32) {
                        arg0.method437(true, -19);
                    } catch (Exception var33) {
                        arg0.method437(true, -20);
                    } catch (Throwable var34) {
                        arg0.method437(true, -21);
                    }
                } else {
                    arg0.method437(true, var4.field2295[var8]);
                }
            }
            arg0.method406(var7, (byte) 97);
            arg0.method413(arg0.field887 - var7, 16660);
            var4.method1193(111);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lca;B)V")
    public static final void method78(class54 arg0, byte arg1) {
        for (int var2 = 0; var2 < class66.field1095; var2++) {
            int var3 = arg0.method436(127);
            int var4 = arg0.method423(-98);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class47.field788[var3] != null) {
                class47.field788[var3].field2275 = var4;
            }
        }
        if (arg1 != 64) {
            method74(107, -13, true, -125, 54);
        }
        field152++;
    }
}
