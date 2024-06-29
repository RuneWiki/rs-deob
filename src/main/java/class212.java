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

@OriginalClass("client!ia")
public class class212 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field3781 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Z")
    public static boolean field3783 = false;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[Lsf;")
    public static class108[] field3784 = new class108[100];

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "J")
    public static long field3782 = 0L;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lsf;")
    public static class108 field3777 = class140.method973(255, "Abbrechen");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lsf;")
    public static class108 field3774 = class140.method973(255, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lnh;")
    public static class115 field3780;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1460(byte arg0) {
        field3779++;
        if (class261.field4601 != null) {
            class261.field4601.method1408(87);
        }
        if (arg0 != -16) {
            field3782 = 127L;
        }
        if (class308.field5347 != null) {
            class308.field5347.method1408(125);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILrm;)V", line = 33)
    public final void method1461(int arg0, class249 arg1) {
        field3778++;
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                if (arg0 != -943) {
                    method1460((byte) 3);
                }
                return;
            }
            this.method1465(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)Z", line = 60)
    public static final boolean method1462(byte arg0, int arg1, int arg2) {
        if (arg0 >= -27) {
            method1460((byte) -24);
        }
        field3787++;
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I", line = 71)
    public static final int method1463(int arg0, int arg1, int arg2) {
        field3785++;
        if (arg1 <= 2) {
            field3775 = -124;
        }
        int var3 = class92.method620((byte) 64, arg0 - 1, arg2 + -1) - (-class92.method620((byte) 1, arg0 + 1, arg2 - 1) + (-class92.method620((byte) 23, arg0 - 1, arg2 + 1) - class92.method620((byte) 119, arg0 + 1, arg2 - -1)));
        int var4 = class92.method620((byte) 26, arg0 - 1, arg2) + class92.method620((byte) -121, arg0 + 1, arg2) + class92.method620((byte) 83, arg0, arg2 + -1) + class92.method620((byte) 59, arg0, arg2 + 1);
        int var5 = class92.method620((byte) 76, arg0, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lci;II)V", line = 99)
    public static final void method1464(class203 arg0, int arg1, int arg2) {
        field3788++;
        if (arg2 <= 7) {
            return;
        }
        while (true) {
            class182 var3 = (class182) class96.field1554.method13(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3338; var5++) {
                if (var3.field3354[var5] != null) {
                    if (var3.field3354[var5].field3686 == 2) {
                        var3.field3356[var5] = -5;
                    }
                    if (var3.field3354[var5].field3686 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3352[var5] != null) {
                    if (var3.field3352[var5].field3686 == 2) {
                        var3.field3356[var5] = -6;
                    }
                    if (var3.field3352[var5].field3686 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1427(arg1, 0);
            arg0.method1759(-32768, 0);
            int var6 = arg0.field4314;
            arg0.method1741(var3.field3332, -1580277072);
            for (int var7 = 0; var7 < var3.field3338; var7++) {
                if (var3.field3356[var7] == 0) {
                    try {
                        int var8 = var3.field3341[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3354[var7].field3685;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1759(-32768, 0);
                            arg0.method1741(var10, -1580277072);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3354[var7].field3685;
                            var11.setInt((Object) null, var3.field3350[var7]);
                            arg0.method1759(-32768, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3354[var7].field3685;
                            int var13 = var12.getModifiers();
                            arg0.method1759(-32768, 0);
                            arg0.method1741(var13, -1580277072);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3352[var7].field3685;
                            byte[][] var15 = var3.field3340[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1759(-32768, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method1759(-32768, 1);
                                arg0.method1735((byte) -103, ((Number) var19).longValue());
                            } else if (var19 instanceof class108) {
                                arg0.method1759(-32768, 2);
                                arg0.method1708((class108) var19, 7733);
                            } else {
                                arg0.method1759(-32768, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3352[var7].field3685;
                            int var21 = var20.getModifiers();
                            arg0.method1759(-32768, 0);
                            arg0.method1741(var21, -1580277072);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1759(-32768, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method1759(-32768, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1759(-32768, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method1759(-32768, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method1759(-32768, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1759(-32768, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method1759(-32768, -16);
                    } catch (SecurityException var41) {
                        arg0.method1759(-32768, -17);
                    } catch (IOException var42) {
                        arg0.method1759(-32768, -18);
                    } catch (NullPointerException var43) {
                        arg0.method1759(-32768, -19);
                    } catch (Exception var44) {
                        arg0.method1759(-32768, -20);
                    } catch (Throwable var45) {
                        arg0.method1759(-32768, -21);
                    }
                } else {
                    arg0.method1759(-32768, var3.field3356[var7]);
                }
            }
            arg0.method1758(var6, -94);
            arg0.method1766(0, arg0.field4314 - var6);
            var3.method1325(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILrm;I)V", line = 302)
    private final void method1465(int arg0, class249 arg1, int arg2) {
        field3786++;
        if (arg0 == 5) {
            this.field3781 = arg1.method1712(-1);
        }
        if (arg2 != 0) {
            method1466(-36);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 318)
    public static void method1466(int arg0) {
        field3777 = null;
        field3784 = null;
        field3780 = null;
        field3774 = null;
        if (arg0 != -1) {
            field3774 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 344)
    public static final void method1467(byte arg0) {
        if (arg0 <= 20) {
            field3783 = true;
        }
        field3776++;
        for (class87 var1 = (class87) class306.field5327.method13(0); var1 != null; var1 = (class87) class306.field5327.method15((byte) 47)) {
            class21 var2 = var1.field1378;
            if (class295.field5159 != var2.field314 || var2.field330 < class116.field2000) {
                var1.method1325(0);
            } else if (class116.field2000 >= var2.field339) {
                if (var2.field305 > 0) {
                    class45 var3 = class159.field2863[var2.field305 - 1];
                    if (var3 != null && var3.field4452 >= 0 && var3.field4452 < 13312 && var3.field4457 >= 0 && var3.field4457 < 13312) {
                        var2.method143(class45.method321(-88, var3.field4457, var3.field4452, var2.field314) - var2.field341, var3.field4457, -125, var3.field4452, class116.field2000);
                    }
                }
                if (var2.field305 < 0) {
                    int var4 = -var2.field305 - 1;
                    class51 var5;
                    if (class185.field3409 == var4) {
                        var5 = class95.field1513;
                    } else {
                        var5 = class96.field1558[var4];
                    }
                    if (var5 != null && var5.field4452 >= 0 && var5.field4452 < 13312 && var5.field4457 >= 0 && var5.field4457 < 13312) {
                        var2.method143(class45.method321(-33, var5.field4457, var5.field4452, var2.field314) - var2.field341, var5.field4457, -126, var5.field4452, class116.field2000);
                    }
                }
                var2.method147(79, class195.field3534);
                class146.method1018(class295.field5159, (int) var2.field328, (int) var2.field301, (int) var2.field321, 60, var2, var2.field327, -1L, false);
            }
        }
    }
}
