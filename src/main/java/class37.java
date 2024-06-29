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

@OriginalClass("client!fb")
public class class37 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lr;")
    public static class118 field929 = new class118(64);

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
    public static int[] field942 = new int[500];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Loc;")
    public static class99 field938 = class48.method402((byte) -104, "backleft1");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field945 = 0;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Loc;")
    public static class99 field948 = class48.method402((byte) -104, " ");

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Loc;")
    private static class99 field950 = class48.method402((byte) -104, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Loc;")
    private static class99 field944 = class48.method402((byte) -104, "Type");

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Loc;")
    public static class99 field949 = class48.method402((byte) -104, "(U(Y");

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Loc;")
    public static class99 field952 = field944;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Loc;")
    public static class99 field951 = field950;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lpc;")
    public static class105 field935;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ldc;")
    public static class24 field939;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lhe;")
    public static class54 field940;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljc;")
    public static class64 field946;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[Ljc;")
    public static class64[] field937;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method316(int arg0) {
        if (arg0 != 30000) {
            method317(-6, (byte) 15, null);
        }
        field939 = null;
        field929 = null;
        field951 = null;
        field950 = null;
        field942 = null;
        field938 = null;
        field952 = null;
        field937 = null;
        field944 = null;
        field935 = null;
        field948 = null;
        field949 = null;
        field940 = null;
        field946 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLod;)V")
    public static final void method317(int arg0, byte arg1, class101 arg2) {
        field947++;
        if (arg1 > -116) {
            method316(68);
        }
        while (true) {
            class91 var3 = (class91) class128.field3136.method722(115);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2221; var5++) {
                if (var3.field2219[var5] != null) {
                    if (var3.field2219[var5].field688 == 2) {
                        var3.field2225[var5] = -5;
                    }
                    if (var3.field2219[var5].field688 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2217[var5] != null) {
                    if (var3.field2217[var5].field688 == 2) {
                        var3.field2225[var5] = -6;
                    }
                    if (var3.field2217[var5].field688 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method869((byte) 11, arg0);
            arg2.method514((byte) 73, 0);
            int var6 = arg2.field1477;
            arg2.method507(25135, var3.field2215);
            for (int var7 = 0; var7 < var3.field2221; var7++) {
                if (var3.field2225[var7] == 0) {
                    try {
                        int var8 = var3.field2232[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2219[var7].field685;
                            int var13 = var12.getInt(null);
                            arg2.method514((byte) 73, 0);
                            arg2.method507(25135, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2219[var7].field685;
                            var9.setInt(null, var3.field2227[var7]);
                            arg2.method514((byte) 73, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2219[var7].field685;
                            int var11 = var10.getModifiers();
                            arg2.method514((byte) 73, 0);
                            arg2.method507(25135, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2217[var7].field685;
                            byte[][] var17 = var3.field2216[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method514((byte) 73, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method514((byte) 73, 1);
                                arg2.method490(true, ((Number) var21).longValue());
                            } else if (var21 instanceof class99) {
                                arg2.method514((byte) 73, 2);
                                arg2.method498((class99) var21, 32478);
                            } else {
                                arg2.method514((byte) 73, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2217[var7].field685;
                            int var15 = var14.getModifiers();
                            arg2.method514((byte) 73, 0);
                            arg2.method507(25135, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method514((byte) 73, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method514((byte) 73, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method514((byte) 73, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method514((byte) 73, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method514((byte) 73, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method514((byte) 73, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method514((byte) 73, -16);
                    } catch (SecurityException var29) {
                        arg2.method514((byte) 73, -17);
                    } catch (IOException var30) {
                        arg2.method514((byte) 73, -18);
                    } catch (NullPointerException var31) {
                        arg2.method514((byte) 73, -19);
                    } catch (Exception var32) {
                        arg2.method514((byte) 73, -20);
                    } catch (Throwable var33) {
                        arg2.method514((byte) 73, -21);
                    }
                } else {
                    arg2.method514((byte) 73, var3.field2225[var7]);
                }
            }
            arg2.method520(var6, (byte) -16);
            arg2.method512(76, arg2.field1477 - var6);
            var3.method394((byte) -110);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method318(int arg0, byte arg1) {
        field930++;
        if (arg0 == 100 && class135.field3368 > 0) {
            byte[] var2 = class34.field818[--class135.field3368];
            class34.field818[class135.field3368] = null;
            return var2;
        }
        if (arg1 > -17) {
            method317(22, (byte) 109, null);
        }
        if (arg0 == 5000 && class73.field1859 > 0) {
            byte[] var3 = class136.field3394[--class73.field1859];
            class136.field3394[class73.field1859] = null;
            return var3;
        } else if (arg0 == 30000 && class61.field1646 > 0) {
            byte[] var4 = class107.field2616[--class61.field1646];
            class107.field2616[class61.field1646] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
