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

@OriginalClass("client!ha")
public class class318 extends class29 {

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Z")
    public boolean field4935 = true;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public int field4936 = 0;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public int field4938 = 12800;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public int field4934 = -1;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public int field4947 = -1;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public int field4945 = 12800;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public int field4942 = 0;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Ljava/lang/String;")
    public String field4926;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Ljava/lang/String;")
    public String field4931;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lqg;")
    public class256 field4940;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4930 = null;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field4928 = -2;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lqg;")
    public static class256 field4939 = new class256();

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
    public static int[] field4946 = new int[2048];

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)[I", line = 6)
    public final int[] method2210(int arg0, int arg1, int arg2) {
        field4948++;
        if (arg0 != 7696) {
            method2218((byte) 81);
        }
        for (class296 var4 = (class296) this.field4940.method1807((byte) 54); var4 != null; var4 = (class296) this.field4940.method1808(18051)) {
            if (var4.method2062(1, arg2, arg1)) {
                return var4.method2066(true, arg2, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)Z", line = 30)
    public static final boolean method2211(byte arg0) {
        field4929++;
        if (class114.field1706) {
            try {
                return !(Boolean) class72.method470("showingVideoAd", (byte) -122, class264.field4183.field68);
            } catch (Throwable var2) {
            }
        }
        if (arg0 > -3) {
            field4930 = (String) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 50)
    public static final void method2212(int arg0) {
        field4941++;
        if (arg0 != 1) {
            field4930 = (String) null;
        }
        class271.field4298++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)[I", line = 63)
    public final int[] method2213(int arg0, int arg1, int arg2, int arg3) {
        field4937++;
        int var5 = 37 % ((-arg1 - 72) / 42);
        for (class296 var6 = (class296) this.field4940.method1807((byte) 118); var6 != null; var6 = (class296) this.field4940.method1808(18051)) {
            if (var6.method2060(true, arg0, arg3, arg2)) {
                return var6.method2064(arg2, true, arg3);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)Z", line = 94)
    public final boolean method2214(byte arg0, int arg1, int arg2) {
        field4933++;
        class296 var4 = (class296) this.field4940.method1807((byte) 6);
        if (arg0 != -78) {
            this.field4940 = (class256) null;
        }
        while (var4 != null) {
            if (var4.method2061((byte) -63, arg1, arg2)) {
                return true;
            }
            var4 = (class296) this.field4940.method1808(arg0 ^ 0xFFFFB931);
        }
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 117)
    public final void method2215(int arg0) {
        this.field4945 = 12800;
        this.field4936 = 0;
        if (arg0 != -3731) {
            this.field4935 = true;
        }
        this.field4942 = 0;
        this.field4938 = 12800;
        field4943++;
        for (class296 var2 = (class296) this.field4940.method1807((byte) 80); var2 != null; var2 = (class296) this.field4940.method1808(18051)) {
            if (this.field4938 > var2.field4650) {
                this.field4938 = var2.field4650;
            }
            if (this.field4942 < var2.field4637) {
                this.field4942 = var2.field4637;
            }
            if (this.field4936 < var2.field4649) {
                this.field4936 = var2.field4649;
            }
            if (var2.field4648 < this.field4945) {
                this.field4945 = var2.field4648;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkn;IZ)V", line = 159)
    public static final void method2216(class210 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2216((class210) null, 6, true);
        }
        field4949++;
        while (true) {
            class226 var3 = (class226) class59.field775.method1807((byte) 78);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3593; var5++) {
                if (var3.field3588[var5] != null) {
                    if (var3.field3588[var5].field3488 == 2) {
                        var3.field3590[var5] = -5;
                    }
                    if (var3.field3588[var5].field3488 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3592[var5] != null) {
                    if (var3.field3592[var5].field3488 == 2) {
                        var3.field3590[var5] = -6;
                    }
                    if (var3.field3592[var5].field3488 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1541(-82, arg1);
            arg0.method1365(-32769, 0);
            int var6 = arg0.field3129;
            arg0.method1350(var3.field3596, -98);
            for (int var7 = 0; var7 < var3.field3593; var7++) {
                if (var3.field3590[var7] == 0) {
                    try {
                        int var8 = var3.field3595[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3588[var7].field3490;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1365(-32769, 0);
                            arg0.method1350(var10, -104);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field3588[var7].field3490;
                            var13.setInt((Object) null, var3.field3599[var7]);
                            arg0.method1365(-32769, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field3588[var7].field3490;
                            int var12 = var11.getModifiers();
                            arg0.method1365(-32769, 0);
                            arg0.method1350(var12, -98);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3592[var7].field3490;
                            byte[][] var17 = var3.field3594[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1365(-32769, 0);
                            } else if ((var21 instanceof Number)) {
                                arg0.method1365(-32769, 1);
                                arg0.method1375(((Number) var21).longValue(), 115);
                            } else if (var21 instanceof String) {
                                arg0.method1365(-32769, 2);
                                arg0.method1374((String) var21, (byte) -128);
                            } else {
                                arg0.method1365(-32769, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3592[var7].field3490;
                            int var15 = var14.getModifiers();
                            arg0.method1365(-32769, 0);
                            arg0.method1350(var15, -76);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1365(-32769, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method1365(-32769, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1365(-32769, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method1365(-32769, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method1365(-32769, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1365(-32769, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method1365(-32769, -16);
                    } catch (SecurityException var41) {
                        arg0.method1365(-32769, -17);
                    } catch (IOException var42) {
                        arg0.method1365(-32769, -18);
                    } catch (NullPointerException var43) {
                        arg0.method1365(-32769, -19);
                    } catch (Exception var44) {
                        arg0.method1365(-32769, -20);
                    } catch (Throwable var45) {
                        arg0.method1365(-32769, -21);
                    }
                } else {
                    arg0.method1365(-32769, var3.field3590[var7]);
                }
            }
            arg0.method1358(false, var6);
            arg0.method1371(arg0.field3129 - var6, -96);
            var3.method465((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 427)
    public class318(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4934 = arg4;
        this.field4935 = arg5;
        this.field4944 = arg3;
        this.field4927 = arg0;
        this.field4926 = arg1;
        this.field4947 = arg6;
        if (this.field4947 == 255) {
            this.field4947 = 0;
        }
        this.field4931 = arg2;
        this.field4940 = new class256();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZII)[I", line = 352)
    public final int[] method2217(boolean arg0, int arg1, int arg2) {
        field4932++;
        for (class296 var4 = (class296) this.field4940.method1807((byte) 59); var4 != null; var4 = (class296) this.field4940.method1808(18051)) {
            if (var4.method2061((byte) -119, arg2, arg1)) {
                return var4.method2064(arg1, !arg0, arg2);
            }
        }
        if (arg0) {
            return (int[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V", line = 392)
    public static void method2218(byte arg0) {
        field4930 = null;
        field4939 = null;
        field4946 = null;
        if (arg0 != 62) {
            method2218((byte) -74);
        }
    }
}
