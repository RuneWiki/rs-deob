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

@OriginalClass("client!of")
public class class574 extends class386 {

    @OriginalMember(owner = "client!of", name = "C", descriptor = "[Z")
    public static boolean[] field8410 = new boolean[200];

    @OriginalMember(owner = "client!of", name = "F", descriptor = "[I")
    public static int[] field8413 = new int[13];

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public static void method3361(int arg0) {
        field8413 = null;
        int var1 = -95 / ((53 - arg0) / 49);
        field8410 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        int var3 = 121 % ((13 - arg1) / 40);
        field8411++;
        return class152.field1879;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILi;)V")
    public static final void method3362(int arg0, class37 arg1) {
        class155.field1899[arg0] = arg1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class574() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILr;)V")
    public static final void method3363(int arg0, class165 arg1) {
        class681.field9746 = new class431[class171.field2093.length];
        field8414++;
        for (int var2 = arg0; var2 < class171.field2093.length; var2++) {
            int var3 = class171.field2093[var2];
            class50 var4 = class217.method1321(class660.field9374, true, var3);
            class419 var5 = arg1.method258(var4, class495.method2878(class62.field1012, var3), true);
            class681.field9746[var2] = new class431(var5, var4);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldc;B)V")
    public static final void method3364(class5 arg0, byte arg1) {
        field8412++;
        class77 var2 = (class77) class521.field7637.method1132((byte) 121);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field1134; var4++) {
            if (var2.field1135[var4] != null) {
                if (var2.field1135[var4].field6693 == 2) {
                    var2.field1130[var4] = -5;
                }
                if (var2.field1135[var4].field6693 == 0) {
                    var3 = true;
                }
            }
            if (var2.field1126[var4] != null) {
                if (var2.field1126[var4].field6693 == 2) {
                    var2.field1130[var4] = -6;
                }
                if (var2.field1126[var4].field6693 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field5195;
        arg0.method2233((byte) -51, var2.field1125);
        for (int var6 = 0; var6 < var2.field1134; var6++) {
            if (var2.field1130[var6] == 0) {
                try {
                    int var7 = var2.field1128[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field1135[var6].field6695;
                        int var9 = var8.getInt(null);
                        arg0.method2281((byte) 58, 0);
                        arg0.method2233((byte) -101, var9);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field1135[var6].field6695;
                        var12.setInt(null, var2.field1129[var6]);
                        arg0.method2281((byte) 58, 0);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field1135[var6].field6695;
                        int var11 = var10.getModifiers();
                        arg0.method2281((byte) 58, 0);
                        arg0.method2233((byte) -99, var11);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field1126[var6].field6695;
                        byte[][] var14 = var2.field1131[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg0.method2281((byte) 58, 0);
                        } else if (var18 instanceof Number) {
                            arg0.method2281((byte) 58, 1);
                            arg0.method2230((byte) 23, ((Number) var18).longValue());
                        } else if ((var18 instanceof String)) {
                            arg0.method2281((byte) 58, 2);
                            arg0.method2269((String) var18, -28);
                        } else {
                            arg0.method2281((byte) 58, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field1126[var6].field6695;
                        int var20 = var19.getModifiers();
                        arg0.method2281((byte) 58, 0);
                        arg0.method2233((byte) 67, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method2281((byte) 58, -10);
                } catch (InvalidClassException var22) {
                    arg0.method2281((byte) 58, -11);
                } catch (StreamCorruptedException var23) {
                    arg0.method2281((byte) 58, -12);
                } catch (OptionalDataException var24) {
                    arg0.method2281((byte) 58, -13);
                } catch (IllegalAccessException var25) {
                    arg0.method2281((byte) 58, -14);
                } catch (IllegalArgumentException var26) {
                    arg0.method2281((byte) 58, -15);
                } catch (InvocationTargetException var27) {
                    arg0.method2281((byte) 58, -16);
                } catch (SecurityException var28) {
                    arg0.method2281((byte) 58, -17);
                } catch (IOException var29) {
                    arg0.method2281((byte) 58, -18);
                } catch (NullPointerException var30) {
                    arg0.method2281((byte) 58, -19);
                } catch (Exception var31) {
                    arg0.method2281((byte) 58, -20);
                } catch (Throwable var32) {
                    arg0.method2281((byte) 58, -21);
                }
            } else {
                arg0.method2281((byte) 58, var2.field1130[var6]);
            }
        }
        arg0.method2252(var5, -2295);
        var2.method3045(true);
        if (arg1 == 78) {
            ;
        }
    }
}
