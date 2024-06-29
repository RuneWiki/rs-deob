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

@OriginalClass("client!gaa")
public class class277 {

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lcb;")
    public static class78 field4041 = new class78(16);

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lgaa;")
    public class277 field4045;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Ltv;")
    public class360 field4044;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "[[[Lbr;")
    public static class184[][][] field4051;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1781(int arg0, int arg1, byte[] arg2, int arg3) {
        field4038++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class609.field8662[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 != -19) {
            method1783((byte) -44, -43);
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public final void method1782(byte arg0) {
        field4047++;
        if (class413.field6112 >= 500) {
            return;
        }
        this.field4049 = 0;
        if (arg0 > 43) {
            this.field4045 = class596.field8490;
            this.field4044 = null;
            class413.field6112++;
            class596.field8490 = this;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)V")
    public static final void method1783(byte arg0, int arg1) {
        if (class594.field8452 == null || class594.field8452.length < arg1) {
            class594.field8452 = new int[arg1];
        }
        if (arg0 <= -101) {
            field4042++;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
    public static final void method1784(int arg0, int arg1) {
        class444.field6479 = -1;
        class161.field2392 = false;
        if (arg0 >= -63) {
            field4041 = null;
        }
        class66.field1086 = -1;
        class617.field8732 = 0;
        class69.field1309 = null;
        class442.field6468 = arg1;
        class376.field5531 = 1;
        field4043++;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        int var1 = -60 % ((arg0 - 63) / 53);
        field4041 = null;
        field4051 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
    public static final void method1786(byte arg0) {
        field4039++;
        int var1 = 12 / ((arg0 - 19) / 48);
        class134.field2161.method569(((float) class202.field2854.field7904 * 0.1F + 0.7F) * 1.1523438F);
        class134.field2161.method600(class616.field8714, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class134.field2161.method562(class274.field3997, -1, 256);
        class134.field2161.method556(class139.field2188);
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V")
    public static final void method1787(byte arg0) {
        field4046++;
        class127.field2088.field3913 = 0;
        class240.field3487 = null;
        class464.field6699 = 0;
        class541.field7525 = 0;
        class370.field5320 = null;
        class393.field5881 = null;
        class338.field4853 = null;
        class189.field2717 = 0;
        class52.field761.field3913 = 0;
        class577.method3299(-6551);
        class266.method1684(false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class39.field536[var1] = null;
        }
        class644.field9367 = null;
        for (int var2 = 0; var2 < class313.field4570; var2++) {
            class170 var4 = class629.field8848[var2].field2623;
            if (var4 != null) {
                var4.field1526 = -1;
            }
        }
        class254.method1601(-113);
        class377.field5547 = 1;
        class307.method1904(true, 9);
        if (arg0 <= 38) {
            return;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class509.field7067[var3] = true;
        }
        class542.method3039(26111);
        class547.field7610 = null;
        class307.field4421 = 0L;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Laj;II)V")
    public static final void method1788(class261 arg0, int arg1, int arg2) {
        field4048++;
        if (arg2 != -939) {
            field4050 = -43;
        }
        while (true) {
            class418 var3 = (class418) class611.field8683.method427(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field6155; var5++) {
                if (var3.field6147[var5] != null) {
                    if (var3.field6147[var5].field4739 == 2) {
                        var3.field6151[var5] = -5;
                    }
                    if (var3.field6147[var5].field4739 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field6148[var5] != null) {
                    if (var3.field6148[var5].field4739 == 2) {
                        var3.field6151[var5] = -6;
                    }
                    if (var3.field6148[var5].field4739 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1663(arg1, (byte) 124);
            arg0.method1710(0, 27);
            int var6 = arg0.field3913;
            arg0.method1702(var3.field6152, false);
            for (int var7 = 0; var7 < var3.field6155; var7++) {
                if (var3.field6151[var7] == 0) {
                    try {
                        int var8 = var3.field6150[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field6147[var7].field4737;
                            int var13 = var12.getInt(null);
                            arg0.method1710(0, arg2 + 953);
                            arg0.method1702(var13, false);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field6147[var7].field4737;
                            var11.setInt(null, var3.field6146[var7]);
                            arg0.method1710(0, 71);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field6147[var7].field4737;
                            int var10 = var9.getModifiers();
                            arg0.method1710(0, arg2 + 1062);
                            arg0.method1702(var10, false);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field6148[var7].field4737;
                            byte[][] var15 = var3.field6156[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method1710(0, 61);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1710(1, arg2 + 1018);
                                arg0.method1721(((Number) var19).longValue(), true);
                            } else if (var19 instanceof String) {
                                arg0.method1710(2, 57);
                                arg0.method1726((byte) -52, (String) var19);
                            } else {
                                arg0.method1710(4, arg2 ^ 0xFFFFFC44);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field6148[var7].field4737;
                            int var21 = var20.getModifiers();
                            arg0.method1710(0, 17);
                            arg0.method1702(var21, false);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1710(-10, 54);
                    } catch (InvalidClassException var23) {
                        arg0.method1710(-11, 38);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1710(-12, 19);
                    } catch (OptionalDataException var25) {
                        arg0.method1710(-13, 80);
                    } catch (IllegalAccessException var26) {
                        arg0.method1710(-14, arg2 + 1061);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1710(-15, 85);
                    } catch (InvocationTargetException var28) {
                        arg0.method1710(-16, 89);
                    } catch (SecurityException var29) {
                        arg0.method1710(-17, 71);
                    } catch (IOException var30) {
                        arg0.method1710(-18, 67);
                    } catch (NullPointerException var31) {
                        arg0.method1710(-19, 15);
                    } catch (Exception var32) {
                        arg0.method1710(-20, 60);
                    } catch (Throwable var33) {
                        arg0.method1710(-21, arg2 ^ -904);
                    }
                } else {
                    arg0.method1710(var3.field6151[var7], 18);
                }
            }
            arg0.method1734(-19161, var6);
            arg0.method1688(arg0.field3913 - var6, -58);
            var3.method911(-52);
        }
    }
}
