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

@OriginalClass("client!aja")
public class class595 {

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    private int field8542 = -1;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "Z")
    public boolean field8546 = false;

    @OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
    private int field8551 = 0;

    @OriginalMember(owner = "client!aja", name = "t", descriptor = "I")
    private int field8559 = 128;

    @OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
    private int field8553 = 0;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    private int field8555 = 0;

    @OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
    public int field8565 = -1;

    @OriginalMember(owner = "client!aja", name = "l", descriptor = "I")
    private int field8548 = 128;

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "B")
    public byte field8564 = 0;

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8566 = new String[] { method4396(method4395("\u0017V9T")), method4396(method4395("\u0002\r{\u0016j")), method4396(method4395("\u0018I4\u0016RQ")), method4396(method4395("\u0018I4\u0016QQ")), method4396(method4395("\u000eQ")), method4396(method4395("\u0018I4\u0016VQ")), method4396(method4395("\u0018I4\u0016UQ")), method4396(method4395("\u0018I4\u0016_Q")), method4396(method4395("\u0018I4\u0016^Q")), method4396(method4395("\u0018I4\u0016TQ")), method4396(method4395("\u0018I4\u0016SQ")) };

    @OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
    private int field8543;

    @OriginalMember(owner = "client!aja", name = "w", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!aja", name = "s", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!aja", name = "o", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!aja", name = "u", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!aja", name = "x", descriptor = "I")
    public int field8558;

    @OriginalMember(owner = "client!aja", name = "v", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "Liha;")
    public class449 field8550;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "[S")
    private short[] field8549;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "[S")
    private short[] field8557;

    @OriginalMember(owner = "client!aja", name = "n", descriptor = "[S")
    private short[] field8560;

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "[S")
    private short[] field8563;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)Z")
    public static final boolean method4386(byte arg0) {
        try {
            field8547++;
            try {
                class179 var1 = new class179();
                byte[] var2 = var1.method1491(class727.field10421, 0);
                class483.method3727(var2, -73);
                if (arg0 <= 124) {
                    method4386((byte) -116);
                }
                return true;
            } catch (Exception var4) {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8566[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLs;Lqu;Ls;ZIILha;IIB)Lka;")
    public final class761 method4387(byte arg0, class751 arg1, class84 arg2, class751 arg3, boolean arg4, int arg5, int arg6, class18 arg7, int arg8, int arg9, byte arg10) {
        try {
            field8544++;
            boolean var25 = arg4 & this.field8564 != 0;
            int var12 = arg9;
            if (arg2 != null) {
                var12 = arg9 | arg2.method830(117);
            }
            if (var25) {
                var12 |= this.field8564 == 3 ? 7 : 2;
            }
            if (this.field8559 != 128) {
                var12 |= 0x2;
            }
            if (this.field8548 != 128 || this.field8555 != 0) {
                var12 |= 0x5;
            }
            class251 var13 = this.field8550.field6588;
            class761 var14;
            synchronized (this.field8550.field6588) {
                var14 = (class761) this.field8550.field6588.method2053(0, (long) (this.field8558 |= arg7.field240 << 29));
            }
            if (var14 == null || arg7.method226(var14.method395(), var12) != 0) {
                if (var14 != null) {
                    var12 = arg7.method194(var12, var14.method395());
                }
                int var15 = var12;
                if (this.field8563 != null) {
                    var15 = var12 | 0x4000;
                }
                if (this.field8557 != null) {
                    var15 |= 0x8000;
                }
                class60 var16 = class372.method2951(this.field8543, 0, (byte) -3, this.field8550.field6581);
                if (var16 == null) {
                    return null;
                }
                if (var16.field902 < 13) {
                    var16.method644(121, 2);
                }
                var14 = arg7.method197(var16, var15, this.field8550.field6589, this.field8551 + 64, this.field8553 + 850);
                if (this.field8563 != null) {
                    for (int var17 = 0; var17 < this.field8563.length; var17++) {
                        var14.method386(this.field8563[var17], this.field8560[var17]);
                    }
                }
                if (this.field8557 != null) {
                    for (int var18 = 0; var18 < this.field8557.length; var18++) {
                        var14.method376(this.field8557[var18], this.field8549[var18]);
                    }
                }
                var14.method411(var12);
                class251 var19 = this.field8550.field6588;
                synchronized (this.field8550.field6588) {
                    this.field8550.field6588.method2051((long) (this.field8558 |= arg7.field240 << 29), var14, 93);
                }
            }
            if (arg10 <= 15) {
                this.field8542 = -86;
            }
            class761 var20 = var14.method418(arg0, var12, true);
            if (arg2 != null) {
                arg2.method825((byte) -99, 0, var20);
            }
            if (this.field8548 != 128 || this.field8559 != 128) {
                var20.method392(this.field8548, this.field8559, this.field8548);
            }
            if (this.field8555 != 0) {
                if (this.field8555 == 90) {
                    var20.method419(4096);
                }
                if (this.field8555 == 180) {
                    var20.method419(8192);
                }
                if (this.field8555 == 270) {
                    var20.method419(12288);
                }
            }
            if (var25) {
                var20.method412(this.field8564, this.field8542, arg1, arg3, arg5, arg8, arg6);
            }
            var20.method411(arg9);
            return var20;
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field8566[5] + arg0 + ',' + (arg1 == null ? field8566[0] : field8566[1]) + ',' + (arg2 == null ? field8566[0] : field8566[1]) + ',' + (arg3 == null ? field8566[0] : field8566[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field8566[0] : field8566[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZLeea;)V")
    public static final void method4388(boolean arg0, class476 arg1) {
        try {
            field8562++;
            class10 var2 = (class10) class87.field1225.method3977((byte) -70);
            if (var2 != null) {
                boolean var3 = false;
                for (int var4 = 0; var4 < var2.field126; var4++) {
                    if (var2.field127[var4] != null) {
                        if (var2.field127[var4].field4486 == 2) {
                            var2.field125[var4] = -5;
                        }
                        if (var2.field127[var4].field4486 == 0) {
                            var3 = true;
                        }
                    }
                    if (var2.field124[var4] != null) {
                        if (var2.field124[var4].field4486 == 2) {
                            var2.field125[var4] = -6;
                        }
                        if (var2.field124[var4].field4486 == 0) {
                            var3 = true;
                        }
                    }
                }
                if (!var3) {
                    int var5 = arg1.field9945;
                    arg1.method5127(var2.field123, 26108);
                    if (arg0) {
                        for (int var6 = 0; var6 < var2.field126; var6++) {
                            if (var2.field125[var6] == 0) {
                                try {
                                    int var7 = var2.field119[var6];
                                    if (var7 == 0) {
                                        Field var11 = (Field) var2.field127[var6].field4487;
                                        int var12 = var11.getInt(null);
                                        arg1.method5114(255, 0);
                                        arg1.method5127(var12, 26108);
                                    } else if (var7 == 1) {
                                        Field var8 = (Field) var2.field127[var6].field4487;
                                        var8.setInt(null, var2.field120[var6]);
                                        arg1.method5114(255, 0);
                                    } else if (var7 == 2) {
                                        Field var9 = (Field) var2.field127[var6].field4487;
                                        int var10 = var9.getModifiers();
                                        arg1.method5114(255, 0);
                                        arg1.method5127(var10, 26108);
                                    }
                                    if (var7 == 3) {
                                        Method var13 = (Method) var2.field124[var6].field4487;
                                        byte[][] var14 = var2.field121[var6];
                                        Object[] var15 = new Object[var14.length];
                                        for (int var16 = 0; var16 < var14.length; var16++) {
                                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                            var15[var16] = var17.readObject();
                                        }
                                        Object var18 = var13.invoke(null, var15);
                                        if (var18 == null) {
                                            arg1.method5114(255, 0);
                                        } else if (var18 instanceof Number) {
                                            arg1.method5114(255, 1);
                                            arg1.method5083((byte) 115, ((Number) var18).longValue());
                                        } else if ((var18 instanceof String)) {
                                            arg1.method5114(255, 2);
                                            arg1.method5089((String) var18, (byte) -102);
                                        } else {
                                            arg1.method5114(255, 4);
                                        }
                                    } else if (var7 == 4) {
                                        Method var19 = (Method) var2.field124[var6].field4487;
                                        int var20 = var19.getModifiers();
                                        arg1.method5114(255, 0);
                                        arg1.method5127(var20, 26108);
                                    }
                                } catch (ClassNotFoundException var22) {
                                    arg1.method5114(255, -10);
                                } catch (InvalidClassException var23) {
                                    arg1.method5114(255, -11);
                                } catch (StreamCorruptedException var24) {
                                    arg1.method5114(255, -12);
                                } catch (OptionalDataException var25) {
                                    arg1.method5114(255, -13);
                                } catch (IllegalAccessException var26) {
                                    arg1.method5114(255, -14);
                                } catch (IllegalArgumentException var27) {
                                    arg1.method5114(255, -15);
                                } catch (InvocationTargetException var28) {
                                    arg1.method5114(255, -16);
                                } catch (SecurityException var29) {
                                    arg1.method5114(255, -17);
                                } catch (IOException var30) {
                                    arg1.method5114(255, -18);
                                } catch (NullPointerException var31) {
                                    arg1.method5114(255, -19);
                                } catch (Exception var32) {
                                    arg1.method5114(255, -20);
                                } catch (Throwable var33) {
                                    arg1.method5114(255, -21);
                                }
                            } else {
                                arg1.method5114(255, var2.field125[var6]);
                            }
                        }
                        arg1.method5129((byte) 110, var5);
                        var2.method4294(0);
                    }
                }
            }
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field8566[2] + arg0 + ',' + (arg1 == null ? field8566[0] : field8566[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
    public static final void method4389(int arg0) {
        try {
            field8545++;
            if (class321.field4374 == null) {
                int var1 = class349.field5061;
                int var2 = class232.field3346;
                int var3 = class792.field11523 - class391.field5700 - var1;
                if (arg0 == 8976) {
                    int var4 = class40.field615 - class711.field9998 - var2;
                    if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
                        try {
                            Container var5;
                            if (class543.field7942 != null) {
                                var5 = class543.field7942;
                            } else if (class290.field4091 == null) {
                                var5 = class743.field10561;
                            } else {
                                var5 = class290.field4091;
                            }
                            int var6 = 0;
                            int var7 = 0;
                            if (class543.field7942 == var5) {
                                Insets var8 = class543.field7942.getInsets();
                                var6 = var8.left;
                                var7 = var8.top;
                            }
                            Graphics var9 = var5.getGraphics();
                            var9.setColor(Color.black);
                            if (var1 > 0) {
                                var9.fillRect(var6, var7, var1, class40.field615);
                            }
                            if (var2 > 0) {
                                var9.fillRect(var6, var7, class792.field11523, var2);
                            }
                            if (var3 > 0) {
                                var9.fillRect(class792.field11523 + var6 - var3, var7, var3, class40.field615);
                            }
                            if (var4 > 0) {
                                var9.fillRect(var6, var7 + class40.field615 - var4, class792.field11523, var4);
                                return;
                            }
                        } catch (Exception var11) {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8566[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILqu;Lha;BI)Lka;")
    public final class761 method4390(int arg0, class84 arg1, class18 arg2, byte arg3, int arg4) {
        try {
            if (arg4 != 0) {
                method4392(null, 74, -85, 5, 34, -107, -74, false, false);
            }
            field8552++;
            return this.method4387(arg3, null, arg1, null, false, 0, 0, arg2, 0, arg0, (byte) 30);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8566[3] + arg0 + ',' + (arg1 == null ? field8566[0] : field8566[1]) + ',' + (arg2 == null ? field8566[0] : field8566[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljc;I)V")
    public final void method4391(class711 arg0, int arg1) {
        try {
            field8561++;
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    if (arg1 == 12026) {
                        return;
                    } else {
                        method4393(100, -127, -84, -126, -40, (byte) -73, -21, null, null, 111, null, 53, -4);
                        return;
                    }
                }
                this.method4394(arg0, var3, 116);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8566[8] + (arg0 == null ? field8566[0] : field8566[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method4392(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class531.field7699 = arg0;
        class643.field9161 = arg1;
        class335.field4851 = class643.field9161 > 1 && class531.field7699.method202();
        class179.field2328 = arg2;
        class768.field10975 = 0x1 << class179.field2328;
        class157.field2000 = class768.field10975 >> 1;
        Math.sqrt((double) (class157.field2000 * class157.field2000 + class157.field2000 * class157.field2000));
        class293.field4121 = arg3;
        class508.field7455 = arg4;
        class700.field9795 = arg5;
        class501.field7316 = arg6;
        class552.field8052 = class100.method979(false);
        class795.method5735(500);
        class596.field8568 = new class621[arg3][class508.field7455][class700.field9795];
        class213.field3124 = new class751[arg3];
        if (arg7) {
            class787.field11366 = new int[class508.field7455][class700.field9795];
            class492.field7207 = new byte[class508.field7455][class700.field9795];
            class727.field10425 = new short[class508.field7455][class700.field9795];
            class105.field1377 = new class621[1][class508.field7455][class700.field9795];
            class677.field9474 = new class751[1];
        } else {
            class787.field11366 = null;
            class492.field7207 = null;
            class727.field10425 = null;
            class105.field1377 = null;
            class677.field9474 = null;
        }
        if (arg8) {
            class502.field7334 = new long[arg3][arg4][arg5];
            class678.field9526 = new class382[65535];
            client.field9714 = new boolean[65535];
            class156.field1988 = 0;
        } else {
            class502.field7334 = null;
            class678.field9526 = null;
            client.field9714 = null;
            class156.field1988 = 0;
        }
        class526.method3999(false);
        class563.field8239 = new class202[2];
        class210.field3050 = new class202[2];
        class391.field5707 = new class202[2];
        class723.field10288 = new class202[10000];
        class643.field9160 = 0;
        class457.field6672 = new class202[5000];
        class98.field1329 = 0;
        class640.field9121 = new class604[5000];
        class433.field6273 = 0;
        class30.field385 = new boolean[class501.field7316 + class501.field7316 + 1][class501.field7316 + class501.field7316 + 1];
        class261.field3705 = new boolean[class501.field7316 + class501.field7316 + 2][class501.field7316 + class501.field7316 + 2];
        class285.field4010 = new int[class501.field7316 + class501.field7316 + 2];
        class80.field1125 = class80.field1124;
        if (class335.field4851) {
            class173.field2290 = new boolean[arg3][class501.field7316 + class501.field7316 + 1][class501.field7316 + class501.field7316 + 1];
            class725.field10313 = new boolean[arg3][][];
            if (class650.field9243 != null) {
                class177.method1485();
            }
            class650.field9243 = new class19[class643.field9161];
            class531.field7699.method203(class650.field9243.length + 1);
            class531.field7699.method205(0);
            for (int var9 = 0; var9 < class650.field9243.length; var9++) {
                class650.field9243[var9] = new class19(var9 + 1, class531.field7699);
                (new Thread(class650.field9243[var9], field8566[4] + var9)).start();
            }
            byte var10;
            if (class643.field9161 == 2) {
                var10 = 4;
                class433.field6280 = 2;
            } else if (class643.field9161 == 3) {
                var10 = 6;
                class433.field6280 = 3;
            } else {
                var10 = 8;
                class433.field6280 = 4;
            }
            class658.field9320 = new class376[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class658.field9320[var11] = new class376(class279.field3938[class643.field9161 - 2][var11]);
            }
        } else {
            class433.field6280 = 1;
        }
        class144.field1862 = new int[class433.field6280 - 1];
        class538.field7912 = new int[class433.field6280 - 1];
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIBILka;Lqu;ILha;II)Lka;")
    public static final class761 method4393(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class761 arg7, class84 arg8, int arg9, class18 arg10, int arg11, int arg12) {
        try {
            field8554++;
            if (arg7 == null) {
                return null;
            }
            int var13 = 2055;
            if (arg8 != null) {
                int var14 = var13 | arg8.method830(95);
                var13 = var14 & 0xFFFFFDFF;
            }
            long var15 = ((long) arg9 << 32) + ((long) arg12 << 48) + (long) ((arg3 << 24) + (arg6 << 16) + arg0);
            class251 var17 = class699.field9789;
            class761 var18;
            synchronized (class699.field9789) {
                var18 = (class761) class699.field9789.method2053(0, var15);
            }
            if (var18 == null || arg10.method226(var18.method395(), var13) != 0) {
                if (var18 != null) {
                    var13 = arg10.method194(var13, var18.method395());
                }
                byte var19;
                if (arg0 == 1) {
                    var19 = 9;
                } else if (arg0 == 2) {
                    var19 = 12;
                } else if (arg0 == 3) {
                    var19 = 15;
                } else if (arg0 == 4) {
                    var19 = 18;
                } else {
                    var19 = 21;
                }
                byte var20 = 3;
                int[] var21 = new int[] { 64, 96, 128 };
                class60 var22 = new class60(var19 * var20 + 1, var19 * var20 * 2 + -var19, 0);
                int var23 = var22.method655(arg5 - 100, 0, 0, 0);
                int[][] var24 = new int[var20][var19];
                for (int var25 = 0; var25 < var20; var25++) {
                    int var26 = var21[var25];
                    int var27 = var21[var25];
                    for (int var28 = 0; var28 < var19; var28++) {
                        int var29 = (var28 << 14) / var19;
                        int var30 = class487.field7151[var29] * var26 >> 14;
                        int var31 = class487.field7150[var29] * var27 >> 14;
                        var24[var25][var28] = var22.method655(0, 0, var30, var31);
                    }
                }
                for (int var32 = 0; var32 < var20; var32++) {
                    int var33 = (var32 * 256 + 128) / var20;
                    int var34 = 256 - var33;
                    byte var35 = (byte) (arg3 * var33 + arg6 * var34 >> 8);
                    short var36 = (short) (((arg9 & 0x7F) * var34 + (arg12 & 0x7F) * var33 & 0x7F00) + ((arg9 & 0x380) * var34 + (arg12 & 0x380) * var33 & 0x38000) + ((arg9 & 0xFC00) * var34 + (arg12 & 0xFC00) * var33 & 0xFC0000) >> 8);
                    for (int var37 = 0; var37 < var19; var37++) {
                        if (var32 == 0) {
                            var22.method641(var36, var24[0][var37], (byte) -1, var23, 21217, var35, (short) -1, (byte) 1, var24[0][(var37 + 1) % var19]);
                        } else {
                            var22.method641(var36, var24[var32][(var37 + 1) % var19], (byte) -1, var24[var32 - 1][var37], 21217, var35, (short) -1, (byte) 1, var24[var32 - 1][(var37 + 1) % var19]);
                            var22.method641(var36, var24[var32][var37], (byte) -1, var24[var32 - 1][var37], 21217, var35, (short) -1, (byte) 1, var24[var32][(var37 + 1) % var19]);
                        }
                    }
                }
                var18 = arg10.method197(var22, var13, class337.field4886, 64, 768);
                class251 var38 = class699.field9789;
                synchronized (class699.field9789) {
                    class699.field9789.method2051(var15, var18, 93);
                }
            }
            int var39 = arg7.method433();
            int var40 = arg7.method417();
            int var41 = arg7.method414();
            int var42 = arg7.method385();
            if (arg5 != 100) {
                return null;
            }
            class761 var43;
            if (arg8 == null) {
                var43 = var18.method418((byte) 3, var13, true);
                var43.method392(var40 - var39 >> 1, 128, var42 - var41 >> 1);
                var43.method430(var39 + var40 >> 1, 0, var41 + var42 >> 1);
            } else {
                var43 = var18.method418((byte) 3, var13, true);
                var43.method392(var40 - var39 >> 1, 128, var42 - var41 >> 1);
                var43.method430(var39 + var40 >> 1, 0, var41 + var42 >> 1);
                arg8.method834((byte) 127, var43);
            }
            if (arg2 != 0) {
                var43.method436(arg2);
            }
            if (arg1 != 0) {
                var43.method437(arg1);
            }
            if (arg11 != 0) {
                var43.method430(0, arg11, 0);
            }
            return var43;
        } catch (RuntimeException var47) {
            throw class665.method4799(var47, field8566[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field8566[0] : field8566[1]) + ',' + (arg8 == null ? field8566[0] : field8566[1]) + ',' + arg9 + ',' + (arg10 == null ? field8566[0] : field8566[1]) + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljc;II)V")
    private final void method4394(class711 arg0, int arg1, int arg2) {
        try {
            if (arg1 == 1) {
                this.field8543 = arg0.method5116((byte) -115);
            } else if (arg1 == 2) {
                this.field8565 = arg0.method5116((byte) -106);
            } else if (arg1 == 4) {
                this.field8548 = arg0.method5116((byte) -114);
            } else if (arg1 == 5) {
                this.field8559 = arg0.method5116((byte) -121);
            } else if (arg1 == 6) {
                this.field8555 = arg0.method5116((byte) -109);
            } else if (arg1 == 7) {
                this.field8551 = arg0.method5128(0);
            } else if (arg1 == 8) {
                this.field8553 = arg0.method5128(0);
            } else if (arg1 == 9) {
                this.field8542 = 8224;
                this.field8564 = 3;
            } else if (arg1 == 10) {
                this.field8546 = true;
            } else if (arg1 == 11) {
                this.field8564 = 1;
            } else if (arg1 == 12) {
                this.field8564 = 4;
            } else if (arg1 == 13) {
                this.field8564 = 5;
            } else if (arg1 == 14) {
                this.field8564 = 2;
                this.field8542 = arg0.method5128(0) * 256;
            } else if (arg1 == 15) {
                this.field8564 = 3;
                this.field8542 = arg0.method5116((byte) -105);
            } else if (arg1 == 16) {
                this.field8564 = 3;
                this.field8542 = arg0.method5113(18443);
            } else if (arg1 == 40) {
                int var6 = arg0.method5128(0);
                this.field8560 = new short[var6];
                this.field8563 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8563[var7] = (short) arg0.method5116((byte) -119);
                    this.field8560[var7] = (short) arg0.method5116((byte) -122);
                }
            } else if (arg1 == 41) {
                int var4 = arg0.method5128(0);
                this.field8557 = new short[var4];
                this.field8549 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8557[var5] = (short) arg0.method5116((byte) -106);
                    this.field8549[var5] = (short) arg0.method5116((byte) -107);
                }
            }
            field8556++;
            if (arg2 <= 113) {
                this.field8542 = 43;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8566[6] + (arg0 == null ? field8566[0] : field8566[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4395(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4396(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
