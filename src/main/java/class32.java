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

@OriginalClass("client!e")
public class class32 {

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public int field793 = 0;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field783 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[[[Lpb;")
    public static class105[][][] field765 = new class105[4][104][104];

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lja;")
    public static class62 field776 = class30.method243(43, "null");

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lja;")
    public static class62 field775 = class30.method243(43, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lja;")
    public static class62 field786 = class30.method243(43, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lja;")
    public static class62 field777 = class30.method243(43, " )2>");

    @OriginalMember(owner = "client!e", name = "z", descriptor = "[I")
    public static int[] field789 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Z")
    public static boolean field785 = false;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lja;")
    public static class62 field788 = class30.method243(43, "Fallen lassen");

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lja;")
    private static class62 field767 = class30.method243(43, "button near the top of that page)3");

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lja;")
    public static class62 field766 = field767;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lja;")
    public static class62 field792 = class30.method243(43, "T");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Luc;")
    public class140 field774;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lpd;Lpd;Lpd;I)V")
    public static final void method250(class108 arg0, class108 arg1, class108 arg2, int arg3) {
        if (arg3 != 0) {
            method255(-105);
        }
        class27.field661 = arg0;
        class118.field2685 = arg2;
        class1.field16 = arg1;
        field794++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method251(int arg0) {
        field773++;
        if (class59.field1444 != null) {
            class59.field1444.method978(65);
            class59.field1444 = null;
        }
        class138.method1106((byte) 25);
        class119.field2703.method591();
        for (int var1 = 0; var1 < 4; var1++) {
            class131.field2991[var1].method1201((byte) 63);
        }
        System.gc();
        class17.method117((byte) 84, 2);
        class56.field1383 = false;
        client.field497 = arg0;
        class113.method930(-119);
        class62.method473((byte) 121, 10);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static final void method252(int arg0) {
        field781++;
        while (class38.field879.method804(0, class115.field2651) >= 11) {
            int var1 = class38.field879.method811(arg0 + 23407, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class52.field1200[var1] == null) {
                var2 = true;
                class52.field1200[var1] = new class115();
                if (class108.field2499[var1] != null) {
                    class52.field1200[var1].method939(class108.field2499[var1], arg0 + 23402);
                }
            }
            class141.field3311[class147.field3460++] = var1;
            class115 var3 = class52.field1200[var1];
            var3.field180 = class86.field2060;
            int var4 = class38.field879.method811(arg0 + 23407, 5);
            int var5 = class38.field879.method811(7, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class38.field879.method811(arg0 + 23407, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class153.field3562[class38.field879.method811(7, 3)];
            if (var2) {
                var3.field137 = var3.field168 = var7;
            }
            int var8 = class38.field879.method811(arg0 ^ 0xFFFFA49F, 1);
            if (var8 == 1) {
                class38.field894[class34.field814++] = var1;
            }
            var3.method64(class40.field936.field193[0] + var4, (byte) -24, class40.field936.field144[0] + var5, var6 == 1);
        }
        class38.field879.method802(-7);
        if (arg0 != -23400) {
            method257(-5, 95);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BILo;)V")
    public static final void method253(byte arg0, int arg1, class100 arg2) {
        int var3 = 92 % ((arg0 + 30) / 39);
        field771++;
        while (true) {
            class147 var4 = (class147) class12.field264.method840(true);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field3458; var6++) {
                if (var4.field3462[var6] != null) {
                    if (var4.field3462[var6].field471 == 2) {
                        var4.field3477[var6] = -5;
                    }
                    if (var4.field3462[var6].field471 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field3467[var6] != null) {
                    if (var4.field3467[var6].field471 == 2) {
                        var4.field3477[var6] = -6;
                    }
                    if (var4.field3467[var6].field471 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method810(-2, arg1);
            arg2.method1010(0, 32768);
            int var7 = arg2.field2873;
            arg2.method1040(var4.field3463, -1308601992);
            for (int var8 = 0; var8 < var4.field3458; var8++) {
                if (var4.field3477[var8] == 0) {
                    try {
                        int var9 = var4.field3461[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field3462[var8].field473;
                            int var11 = var10.getInt(null);
                            arg2.method1010(0, 32768);
                            arg2.method1040(var11, -1308601992);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field3462[var8].field473;
                            var12.setInt(null, var4.field3475[var8]);
                            arg2.method1010(0, 32768);
                        } else if (var9 == 2) {
                            Field var13 = (Field) var4.field3462[var8].field473;
                            int var14 = var13.getModifiers();
                            arg2.method1010(0, 32768);
                            arg2.method1040(var14, -1308601992);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field3467[var8].field473;
                            byte[][] var16 = var4.field3471[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke(null, var17);
                            if (var20 == null) {
                                arg2.method1010(0, 32768);
                            } else if (var20 instanceof Number) {
                                arg2.method1010(1, 32768);
                                arg2.method1008(((Number) var20).longValue(), (byte) 38);
                            } else if (var20 instanceof class62) {
                                arg2.method1010(2, 32768);
                                arg2.method1021(-92, (class62) var20);
                            } else {
                                arg2.method1010(4, 32768);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field3467[var8].field473;
                            int var22 = var21.getModifiers();
                            arg2.method1010(0, 32768);
                            arg2.method1040(var22, -1308601992);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method1010(-10, 32768);
                    } catch (InvalidClassException var24) {
                        arg2.method1010(-11, 32768);
                    } catch (StreamCorruptedException var25) {
                        arg2.method1010(-12, 32768);
                    } catch (OptionalDataException var26) {
                        arg2.method1010(-13, 32768);
                    } catch (IllegalAccessException var27) {
                        arg2.method1010(-14, 32768);
                    } catch (IllegalArgumentException var28) {
                        arg2.method1010(-15, 32768);
                    } catch (InvocationTargetException var29) {
                        arg2.method1010(-16, 32768);
                    } catch (SecurityException var30) {
                        arg2.method1010(-17, 32768);
                    } catch (IOException var31) {
                        arg2.method1010(-18, 32768);
                    } catch (NullPointerException var32) {
                        arg2.method1010(-19, 32768);
                    } catch (Exception var33) {
                        arg2.method1010(-20, 32768);
                    } catch (Throwable var34) {
                        arg2.method1010(-21, 32768);
                    }
                } else {
                    arg2.method1010(var4.field3477[var8], 32768);
                }
            }
            arg2.method998((byte) 113, var7);
            arg2.method1033(arg2.field2873 - var7, (byte) -54);
            var4.method1176((byte) -122);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method254(int arg0) {
        field788 = null;
        field776 = null;
        field777 = null;
        field775 = null;
        if (arg0 <= 116) {
            method257(-9, -33);
        }
        field765 = null;
        field767 = null;
        field766 = null;
        field792 = null;
        field786 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static final void method255(int arg0) {
        if (arg0 == 25243) {
            field782++;
            class39.field898.method127((byte) -123);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)I")
    public static final int method256(int arg0, int arg1, byte arg2) {
        int var3 = class53.method361(arg0 + 45365, 4, arg1 + 91923, 14828) + (class53.method361(arg0 - -10294, 2, arg1 + 37821, 14828) + -128 >> 1) + (class53.method361(arg0, 1, arg1, 14828) - 128 >> 2) - 128;
        field770++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = 80 / ((arg2 - 16) / 34);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public static final void method257(int arg0, int arg1) {
        field769++;
        if (arg0 == -1 && !class56.field1383) {
            class68.method539(false);
        } else if (arg0 != -1 && client.field497 != arg0 && class141.field3308 != 0 && !class56.field1383) {
            class16.method111(0, class141.field3308, arg0, class31.field761, 2, false, 1);
        }
        client.field497 = arg0;
        if (arg1 != -1) {
            method257(8, 72);
        }
    }
}
