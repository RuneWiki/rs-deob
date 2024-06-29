import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends OutputStream {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field42 = new int[2000];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field47 = new int[50];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
    public static final void method20(boolean arg0, int arg1) {
        field43++;
        class168.field2745 = 1000 / arg1;
        if (!arg0) {
            field47 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method21(int arg0) {
        int var1 = -102 % ((arg0 + 4) / 44);
        class278.field4463 = null;
        class167.field2725 = null;
        class220.field3598 = null;
        field40++;
    }

    @OriginalMember(owner = "client!de", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field44++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method22(int arg0, String arg1) {
        field45++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class169.field2755; var2++) {
            if (arg1.equalsIgnoreCase(class269.field4341[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class3.field36[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ldk;BII)Lbl;")
    public static final class146 method23(class251 arg0, byte arg1, int arg2, int arg3) {
        field49++;
        if (class290.method1932(-26, arg2, arg3, arg0)) {
            return arg1 == -47 ? class51.method357(19983) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method24(long arg0, int arg1) {
        field48++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class163.field2647[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(arg1)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method25(int arg0) {
        field42 = null;
        field47 = null;
        if (arg0 > -106) {
            method25(113);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhj;II)V")
    public static final void method26(class116 arg0, int arg1, int arg2) {
        if (arg1 != 28586) {
            method26((class116) null, -63, 113);
        }
        field41++;
        while (true) {
            class215 var3 = (class215) class176.field2880.method1643((byte) -58);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3556; var5++) {
                if (var3.field3559[var5] != null) {
                    if (var3.field3559[var5].field2814 == 2) {
                        var3.field3561[var5] = -5;
                    }
                    if (var3.field3559[var5].field2814 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3550[var5] != null) {
                    if (var3.field3550[var5].field2814 == 2) {
                        var3.field3561[var5] = -6;
                    }
                    if (var3.field3550[var5].field2814 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method828(arg1 ^ 0x6FCC, arg2);
            arg0.method1108(0, true);
            int var6 = arg0.field2568;
            arg0.method1125(var3.field3558, 255);
            for (int var7 = 0; var7 < var3.field3556; var7++) {
                if (var3.field3561[var7] == 0) {
                    try {
                        int var8 = var3.field3557[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3559[var7].field2817;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1108(0, true);
                            arg0.method1125(var13, 255);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3559[var7].field2817;
                            var9.setInt((Object) null, var3.field3565[var7]);
                            arg0.method1108(0, true);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3559[var7].field2817;
                            int var11 = var10.getModifiers();
                            arg0.method1108(0, true);
                            arg0.method1125(var11, arg1 - 28331);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3550[var7].field2817;
                            byte[][] var15 = var3.field3563[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1108(0, true);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1108(1, true);
                                arg0.method1156(-31881, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg0.method1108(2, true);
                                arg0.method1148((byte) -99, (String) var19);
                            } else {
                                arg0.method1108(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3550[var7].field2817;
                            int var21 = var20.getModifiers();
                            arg0.method1108(0, true);
                            arg0.method1125(var21, arg1 - 28331);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1108(-10, true);
                    } catch (InvalidClassException var23) {
                        arg0.method1108(-11, true);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1108(-12, true);
                    } catch (OptionalDataException var25) {
                        arg0.method1108(-13, true);
                    } catch (IllegalAccessException var26) {
                        arg0.method1108(-14, true);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1108(-15, true);
                    } catch (InvocationTargetException var28) {
                        arg0.method1108(-16, true);
                    } catch (SecurityException var29) {
                        arg0.method1108(-17, true);
                    } catch (IOException var30) {
                        arg0.method1108(-18, true);
                    } catch (NullPointerException var31) {
                        arg0.method1108(-19, true);
                    } catch (Exception var32) {
                        arg0.method1108(-20, true);
                    } catch (Throwable var33) {
                        arg0.method1108(-21, true);
                    }
                } else {
                    arg0.method1108(var3.field3561[var7], true);
                }
            }
            arg0.method1130(-4339, var6);
            arg0.method1158(arg0.field2568 - var6, arg1 + -28465);
            var3.method913(arg1 ^ 0xFFFF9D80);
        }
    }
}
