import java.awt.Component;
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

@OriginalClass("client!jb")
public class class56 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Llc;")
    public static class69 field1181 = class69.method470((byte) -114, "compass");

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    public static boolean field1179 = false;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Llc;")
    public static class69 field1172 = class69.method470((byte) -105, "attack");

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Llc;")
    public static class69 field1175 = class69.method470((byte) -100, "(U5");

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Llc;")
    public static class69 field1180 = class69.method470((byte) -119, "Select");

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1173 = 1;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field1183 = -1;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[J")
    public static long[] field1186 = new long[200];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Leb;BI)V")
    public static final void method348(class27 arg0, byte arg1, int arg2) {
        field1177++;
        if (arg1 < 77) {
            method348(null, (byte) 13, -122);
        }
        while (true) {
            class40 var3 = (class40) class36.field712.method580((byte) -61);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field777; var5++) {
                if (var3.field788[var5] != null) {
                    if (var3.field788[var5].field2504 == 2) {
                        var3.field784[var5] = -5;
                    }
                    if (var3.field788[var5].field2504 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field796[var5] != null) {
                    if (var3.field796[var5].field2504 == 2) {
                        var3.field784[var5] = -6;
                    }
                    if (var3.field796[var5].field2504 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method178(-5, arg2);
            arg0.method675((byte) -111, 0);
            int var6 = arg0.field2061;
            arg0.method704(var3.field783, (byte) 116);
            for (int var7 = 0; var7 < var3.field777; var7++) {
                if (var3.field784[var7] == 0) {
                    try {
                        int var8 = var3.field778[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field788[var7].field2505;
                            int var10 = var9.getInt(null);
                            arg0.method675((byte) -103, 0);
                            arg0.method704(var10, (byte) 126);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field788[var7].field2505;
                            var13.setInt(null, var3.field795[var7]);
                            arg0.method675((byte) -74, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field788[var7].field2505;
                            int var12 = var11.getModifiers();
                            arg0.method675((byte) -28, 0);
                            arg0.method704(var12, (byte) 123);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field785[var7];
                            Method var15 = (Method) var3.field796[var7].field2505;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method675((byte) -33, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method675((byte) -79, 1);
                                arg0.method664(((Number) var19).longValue(), 49);
                            } else if (var19 instanceof class69) {
                                arg0.method675((byte) -78, 2);
                                arg0.method692((class69) var19, (byte) 90);
                            } else {
                                arg0.method675((byte) -79, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field796[var7].field2505;
                            int var21 = var20.getModifiers();
                            arg0.method675((byte) -117, 0);
                            arg0.method704(var21, (byte) 117);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method675((byte) -32, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method675((byte) -103, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method675((byte) -57, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method675((byte) -42, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method675((byte) -53, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method675((byte) -100, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method675((byte) -106, -16);
                    } catch (SecurityException var29) {
                        arg0.method675((byte) -80, -17);
                    } catch (IOException var30) {
                        arg0.method675((byte) -85, -18);
                    } catch (NullPointerException var31) {
                        arg0.method675((byte) -73, -19);
                    } catch (Exception var32) {
                        arg0.method675((byte) -30, -20);
                    } catch (Throwable var33) {
                        arg0.method675((byte) -121, -21);
                    }
                } else {
                    arg0.method675((byte) -49, var3.field784[var7]);
                }
            }
            arg0.method716(-1463569896, var6);
            arg0.method697((byte) 98, arg0.field2061 - var6);
            var3.method502(0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lkc;BLlc;Llc;)Lda;")
    public static final class20 method349(class63 arg0, byte arg1, class69 arg2, class69 arg3) {
        if (arg1 != 38) {
            field1181 = null;
        }
        field1184++;
        int var4 = arg0.method400(arg2, (byte) 114);
        int var5 = arg0.method390(var4, arg3, 104);
        return class19.method126(var4, arg0, var5, arg1 + 67);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lkc;Lkc;I)I")
    public static final int method350(class63 arg0, class63 arg1, int arg2) {
        field1182++;
        int var3 = 0;
        if (arg0.method386(class9.field193, -91, class71.field1590)) {
            var3++;
        }
        if (arg2 >= -116) {
            method351((byte) -98);
        }
        if (arg1.method386(class71.field1582, -72, class71.field1590)) {
            var3++;
        }
        if (arg1.method386(class104.field2254, -72, class71.field1590)) {
            var3++;
        }
        if (arg1.method386(class108.field2361, -124, class71.field1590)) {
            var3++;
        }
        if (arg1.method386(class98.field2154, -68, class71.field1590)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method351(byte arg0) {
        field1180 = null;
        if (arg0 <= -70) {
            field1172 = null;
            field1186 = null;
            field1181 = null;
            field1175 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLkc;Lkc;Lkc;)V")
    public static final void method352(byte arg0, class63 arg1, class63 arg2, class63 arg3) {
        field1187++;
        class71.field1589 = arg2;
        class67.field1417 = arg1;
        if (arg0 > -54) {
            method353(26, (byte) 13, null, 99);
        }
        class106.field2304 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method353(int arg0, byte arg1, byte[] arg2, int arg3) {
        field1174++;
        if (arg1 > -58) {
            field1172 = null;
        }
        boolean var4 = true;
        class94 var5 = new class94(arg2);
        int var6 = -1;
        label69: while (true) {
            int var7 = var5.method684(false);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class121 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method684(false);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var5.method703((byte) 77);
                                    }
                                    int var10 = var5.method684(false);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method703((byte) 116) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = var11 + arg3;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class110.method821(var6, 724);
                } while (var13 == 22 && class13.field264 && var16.field2608 == 0 && !var16.field2599);
                var9 = true;
                if (!var16.method892(28)) {
                    var4 = false;
                    class114.field2470++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method354(Component arg0, int arg1) {
        if (arg1 != 0) {
            field1179 = false;
        }
        try {
            Method var2 = class99.field2177;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var3) {
        }
        arg0.addKeyListener(class18.field348);
        field1185++;
        arg0.addFocusListener(class18.field348);
    }

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
    public final void run() {
        field1176++;
        try {
            while (true) {
                while (true) {
                    class80 var1 = class91.field1986;
                    class23 var2;
                    synchronized (class91.field1986) {
                        var2 = (class23) class91.field1986.method580((byte) -122);
                    }
                    if (var2 == null) {
                        class108.method814((byte) 15, 100L);
                        Object var16 = class29.field600;
                        synchronized (class29.field600) {
                            if (class53.field1133 >= 0) {
                                class53.field1133--;
                            } else {
                                class53.field1133 = 0;
                                class29.field600.notifyAll();
                            }
                            if (class53.field1133 == 0) {
                                return;
                            }
                        }
                    } else {
                        Object var3 = class29.field600;
                        synchronized (class29.field600) {
                            if (class53.field1133 < 0) {
                                class53.field1133 = 0;
                                class29.field600.notifyAll();
                                return;
                            }
                            class53.field1133 = 600;
                        }
                        class16 var4 = var2.field485;
                        if (var2.field490 == 0) {
                            var4.field285.method358(var2.field472, (byte) 25, var2.field486, var2.field486.length);
                        } else if (var2.field490 == 1) {
                            int var11 = var2.field472;
                            byte[] var12 = var4.field285.method355(var11, (byte) -82);
                            if (var12 != null) {
                                class94.field2069.reset();
                                class94.field2069.update(var12, 0, var12.length - 2);
                                int var13 = (int) class94.field2069.getValue();
                                int var14 = ((var12[var12.length - 2] & 0xFF) << 8) + (var12[var12.length - 1] & 0xFF);
                                if (var4.field1327[var11] != var13 || var4.field1312[var11] != var14) {
                                    var12 = null;
                                }
                            }
                            if (var12 == null) {
                                var4.field288[var11] = false;
                            } else {
                                var4.field1300[var11] = var12;
                            }
                        } else if (var2.field490 == 2) {
                            Object var5 = class103.field2225;
                            synchronized (class103.field2225) {
                                var4.field288 = new boolean[var4.field1300.length];
                                int var6 = 0;
                                while (true) {
                                    if (var4.field1300.length <= var6) {
                                        break;
                                    }
                                    var4.field288[var6] = false;
                                    byte[] var7 = var4.field285.method355(var6, (byte) -82);
                                    if (var7 != null && var7.length > 2) {
                                        class94.field2069.reset();
                                        class94.field2069.update(var7, 0, var7.length - 2);
                                        int var8 = (int) class94.field2069.getValue();
                                        int var9 = ((var7[var7.length - 2] & 0xFF) << 8) + (var7[var7.length - 1] & 0xFF);
                                        if (var4.field1327[var6] == var8 && var4.field1312[var6] == var9) {
                                            var4.field288[var6] = true;
                                        }
                                    }
                                    var6++;
                                }
                            }
                            Object var10 = class53.field1136;
                            synchronized (class53.field1136) {
                                var4.field309 = true;
                            }
                        }
                        class80 var15 = class91.field1986;
                        synchronized (class91.field1986) {
                            var2.method502(0);
                        }
                    }
                }
            }
        } catch (Exception var28) {
            class70.method499(null, var28, 40);
        }
    }
}
