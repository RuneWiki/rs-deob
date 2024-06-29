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

@OriginalClass("client!td")
public class class71 extends class255 {

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[B")
    public byte[] field1302;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Leb;")
    public static class230 field1297 = class68.method589(0, ")1 ");

    @OriginalMember(owner = "client!td", name = "P", descriptor = "[Z")
    public static boolean[] field1300 = new boolean[100];

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Leb;")
    public static class230 field1296 = class68.method589(0, "");

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field1298 = 128;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Lha;")
    public static class30 field1304 = new class30(128);

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Leb;")
    public static class230 field1306 = class68.method589(0, "; Max)2Age=");

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
    public static void method609(byte arg0) {
        field1306 = null;
        field1296 = null;
        field1300 = null;
        field1304 = null;
        if (arg0 != 96) {
            field1299 = 71;
        }
        field1297 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public static final void method610(byte arg0, int arg1) {
        if (arg0 < 75) {
            return;
        }
        for (class244 var2 = (class244) class115.field2062.method392(0); var2 != null; var2 = (class244) class115.field2062.method390(-1)) {
            if (((long) arg1) == (var2.field1166 >> 48 & 0xFFFFL)) {
                var2.method518(91);
            }
        }
        field1305++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpb;II)V")
    public static final void method611(class124 arg0, int arg1, int arg2) {
        field1303++;
        if (arg2 != -1) {
            method612(-49, -24, -16, 111);
        }
        while (true) {
            class44 var3 = (class44) class113.field2026.method839(128);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field775; var5++) {
                if (var3.field780[var5] != null) {
                    if (var3.field780[var5].field3421 == 2) {
                        var3.field777[var5] = -5;
                    }
                    if (var3.field780[var5].field3421 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field784[var5] != null) {
                    if (var3.field784[var5].field3421 == 2) {
                        var3.field777[var5] = -6;
                    }
                    if (var3.field784[var5].field3421 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method978(arg2 - 126, arg1);
            arg0.method170((byte) 121, 0);
            int var6 = arg0.field318;
            arg0.method165(var3.field789, 1380186760);
            for (int var7 = 0; var7 < var3.field775; var7++) {
                if (var3.field777[var7] == 0) {
                    try {
                        int var8 = var3.field790[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field780[var7].field3423;
                            int var10 = var9.getInt((Object) null);
                            arg0.method170((byte) 118, 0);
                            arg0.method165(var10, arg2 ^ 0xADBC0577);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field780[var7].field3423;
                            var13.setInt((Object) null, var3.field783[var7]);
                            arg0.method170((byte) 113, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field780[var7].field3423;
                            int var12 = var11.getModifiers();
                            arg0.method170((byte) 111, 0);
                            arg0.method165(var12, 1380186760);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field784[var7].field3423;
                            byte[][] var17 = var3.field786[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method170((byte) 112, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method170((byte) 116, 1);
                                arg0.method148(((Number) var21).longValue(), (byte) 108);
                            } else if ((var21 instanceof class230)) {
                                arg0.method170((byte) 111, 2);
                                arg0.method197(0, (class230) var21);
                            } else {
                                arg0.method170((byte) 119, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field784[var7].field3423;
                            int var15 = var14.getModifiers();
                            arg0.method170((byte) 120, 0);
                            arg0.method165(var15, 1380186760);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method170((byte) 124, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method170((byte) 121, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method170((byte) 111, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method170((byte) 123, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method170((byte) 115, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method170((byte) 118, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method170((byte) 114, -16);
                    } catch (SecurityException var29) {
                        arg0.method170((byte) 125, -17);
                    } catch (IOException var30) {
                        arg0.method170((byte) 112, -18);
                    } catch (NullPointerException var31) {
                        arg0.method170((byte) 126, -19);
                    } catch (Exception var32) {
                        arg0.method170((byte) 125, -20);
                    } catch (Throwable var33) {
                        arg0.method170((byte) 115, -21);
                    }
                } else {
                    arg0.method170((byte) 115, var3.field777[var7]);
                }
            }
            arg0.method193(var6, 21014);
            arg0.method179(arg0.field318 - var6, -75);
            var3.method518(116);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)I")
    public static final int method612(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 23921) {
            method610((byte) 89, 118);
        }
        int var4 = arg0 & 0x3;
        field1301++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    public class71(byte[] arg0) {
        this.field1302 = arg0;
    }
}
