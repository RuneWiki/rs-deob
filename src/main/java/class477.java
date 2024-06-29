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

@OriginalClass("client!re")
public abstract class class477 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lgk;")
    public class463 field6964;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Loi;")
    public static class169 field6966 = new class169("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lhb;")
    public static class250 field6968 = new class250(27, 5);

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field6972 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLwt;)V")
    public static final void method2864(int arg0, boolean arg1, class16 arg2) {
        if (!arg1) {
            return;
        }
        field6967++;
        while (true) {
            class356 var3 = (class356) class522.field7742.method49(-114);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4573; var5++) {
                if (var3.field4580[var5] != null) {
                    if (var3.field4580[var5].field3542 == 2) {
                        var3.field4579[var5] = -5;
                    }
                    if (var3.field4580[var5].field3542 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4577[var5] != null) {
                    if (var3.field4577[var5].field3542 == 2) {
                        var3.field4579[var5] = -6;
                    }
                    if (var3.field4577[var5].field3542 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method101(false, arg0);
            arg2.method565(-89, 0);
            int var6 = arg2.field1176;
            arg2.method572(-111, var3.field4572);
            for (int var7 = 0; var7 < var3.field4573; var7++) {
                if (var3.field4579[var7] == 0) {
                    try {
                        int var8 = var3.field4576[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4580[var7].field3541;
                            int var10 = var9.getInt(null);
                            arg2.method565(80, 0);
                            arg2.method572(-120, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4580[var7].field3541;
                            var13.setInt(null, var3.field4578[var7]);
                            arg2.method565(-83, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4580[var7].field3541;
                            int var12 = var11.getModifiers();
                            arg2.method565(-63, 0);
                            arg2.method572(-119, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4577[var7].field3541;
                            byte[][] var17 = var3.field4567[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method565(38, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method565(-119, 1);
                                arg2.method554(((Number) var21).longValue(), -290082784);
                            } else if (var21 instanceof String) {
                                arg2.method565(67, 2);
                                arg2.method597(-128, (String) var21);
                            } else {
                                arg2.method565(-69, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4577[var7].field3541;
                            int var15 = var14.getModifiers();
                            arg2.method565(38, 0);
                            arg2.method572(-123, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method565(97, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method565(88, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method565(112, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method565(107, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method565(29, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method565(-76, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method565(-70, -16);
                    } catch (SecurityException var29) {
                        arg2.method565(-76, -17);
                    } catch (IOException var30) {
                        arg2.method565(-100, -18);
                    } catch (NullPointerException var31) {
                        arg2.method565(68, -19);
                    } catch (Exception var32) {
                        arg2.method565(-123, -20);
                    } catch (Throwable var33) {
                        arg2.method565(-76, -21);
                    }
                } else {
                    arg2.method565(91, var3.field4579[var7]);
                }
            }
            arg2.method593(var6, (byte) -98);
            arg2.method557(arg2.field1176 - var6, false);
            var3.method3021(-100);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
    public abstract boolean method264(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
    public abstract void method271(boolean arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public abstract void method269(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V")
    public abstract void method272(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method2865(int arg0) {
        if (arg0 == 2) {
            field6966 = null;
            field6968 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lgk;)V")
    public class477(class463 arg0) {
        this.field6964 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lrh;II)V")
    public abstract void method266(class31 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
    public abstract void method270(boolean arg0, boolean arg1);
}
