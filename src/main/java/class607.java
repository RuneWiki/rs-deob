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

@OriginalClass("client!raa")
public class class607 extends class362 {

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public int field8327;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "[[I")
    public int[][] field8328;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "[I")
    public int[] field8326;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "[I")
    public int[] field8329;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "[Z")
    public boolean[] field8323;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lol;")
    public static class286 field8324 = new class286();

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "J")
    public static long field8332 = 0L;

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "I")
    public static int field8336 = 0;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "J")
    public static long field8335 = 0L;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "[[[B")
    public static byte[][][] field8331;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 4)
    public static void method3450(int arg0) {
        field8324 = null;
        if (arg0 >= -74) {
            field8336 = 12;
        }
        field8331 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLua;)V", line = 21)
    public static final void method3451(byte arg0, class665 arg1) {
        field8330++;
        class688 var2 = (class688) class113.field1947.method1269(4);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field9285; var4++) {
            if (var2.field9294[var4] != null) {
                if (var2.field9294[var4].field8462 == 2) {
                    var2.field9290[var4] = -5;
                }
                if (var2.field9294[var4].field8462 == 0) {
                    var3 = true;
                }
            }
            if (var2.field9286[var4] != null) {
                if (var2.field9286[var4].field8462 == 2) {
                    var2.field9290[var4] = -6;
                }
                if (var2.field9286[var4].field8462 == 0) {
                    var3 = true;
                }
            }
        }
        if (arg0 < 37) {
            field8335 = -3L;
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field3109;
        arg1.method1539((byte) 94, var2.field9289);
        for (int var6 = 0; var6 < var2.field9285; var6++) {
            if (var2.field9290[var6] == 0) {
                try {
                    int var7 = var2.field9291[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field9294[var6].field8463;
                        int var12 = var11.getInt(null);
                        arg1.method1526(false, 0);
                        arg1.method1539((byte) 108, var12);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field9294[var6].field8463;
                        var8.setInt(null, var2.field9295[var6]);
                        arg1.method1526(false, 0);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field9294[var6].field8463;
                        int var10 = var9.getModifiers();
                        arg1.method1526(false, 0);
                        arg1.method1539((byte) 122, var10);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field9286[var6].field8463;
                        byte[][] var14 = var2.field9287[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method1526(false, 0);
                        } else if (var18 instanceof Number) {
                            arg1.method1526(false, 1);
                            arg1.method1540(((Number) var18).longValue(), (byte) -81);
                        } else if ((var18 instanceof String)) {
                            arg1.method1526(false, 2);
                            arg1.method1481((byte) -5, (String) var18);
                        } else {
                            arg1.method1526(false, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field9286[var6].field8463;
                        int var20 = var19.getModifiers();
                        arg1.method1526(false, 0);
                        arg1.method1539((byte) 95, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method1526(false, -10);
                } catch (InvalidClassException var22) {
                    arg1.method1526(false, -11);
                } catch (StreamCorruptedException var23) {
                    arg1.method1526(false, -12);
                } catch (OptionalDataException var24) {
                    arg1.method1526(false, -13);
                } catch (IllegalAccessException var25) {
                    arg1.method1526(false, -14);
                } catch (IllegalArgumentException var26) {
                    arg1.method1526(false, -15);
                } catch (InvocationTargetException var27) {
                    arg1.method1526(false, -16);
                } catch (SecurityException var28) {
                    arg1.method1526(false, -17);
                } catch (IOException var29) {
                    arg1.method1526(false, -18);
                } catch (NullPointerException var30) {
                    arg1.method1526(false, -19);
                } catch (Exception var31) {
                    arg1.method1526(false, -20);
                } catch (Throwable var32) {
                    arg1.method1526(false, -21);
                }
            } else {
                arg1.method1526(false, var2.field9290[var6]);
            }
        }
        arg1.method1492(var5, false);
        var2.method2314((byte) 46);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I[B)V", line = 220)
    public class607(int arg0, byte[] arg1) {
        this.field8327 = arg0;
        class215 var3 = new class215(arg1);
        this.field8334 = var3.method1535(255);
        this.field8328 = new int[this.field8334][];
        this.field8326 = new int[this.field8334];
        this.field8329 = new int[this.field8334];
        this.field8323 = new boolean[this.field8334];
        for (int var4 = 0; var4 < this.field8334; var4++) {
            this.field8326[var4] = var3.method1535(255);
            if (this.field8326[var4] == 6) {
                this.field8326[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field8334; var5++) {
            this.field8323[var5] = var3.method1535(255) == 1;
        }
        for (int var6 = 0; var6 < this.field8334; var6++) {
            this.field8329[var6] = var3.method1478(842397944);
        }
        for (int var7 = 0; var7 < this.field8334; var7++) {
            this.field8328[var7] = new int[var3.method1535(255)];
        }
        for (int var8 = 0; var8 < this.field8334; var8++) {
            for (int var9 = 0; var9 < this.field8328[var8].length; var9++) {
                this.field8328[var8][var9] = var3.method1535(255);
            }
        }
    }
}
