import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class316 extends class748 {

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    private int field4063 = 4096;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    private int field4065 = 4096;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    private int field4064 = 4096;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "Lpaa;")
    public static class712 field4062 = null;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    public static int field4068;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4069;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lvj;ILmr;B)V")
    public static final void method1828(class26 arg0, int arg1, class613 arg2, byte arg3) {
        ++field4066;
        class503 var4 = new class503();
        if (arg3 == -47) {
            var4.field7026 = arg0.method194((byte) 119);
            var4.field7027 = arg0.method189(255);
            var4.field7029 = new int[var4.field7026];
            var4.field7032 = new class436[var4.field7026];
            var4.field7025 = new byte[var4.field7026][][];
            var4.field7023 = new int[var4.field7026];
            var4.field7031 = new int[var4.field7026];
            var4.field7024 = new class436[var4.field7026];
            for (int var5 = 0; ~var5 > ~var4.field7026; ++var5) {
                try {
                    int var6 = arg0.method194((byte) 119);
                    if (var6 != 0 && var6 != 1 && var6 != 2) {
                        if (~var6 == -4 || ~var6 == -5) {
                            String var7 = arg0.method196((byte) -92);
                            String var8 = arg0.method196((byte) -92);
                            int var9 = arg0.method194((byte) 119);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; var9 > var11; ++var11) {
                                var10[var11] = arg0.method196((byte) -92);
                            }
                            byte[][] var12 = new byte[var9][];
                            if (var6 == 3) {
                                for (int var13 = 0; ~var9 < ~var13; ++var13) {
                                    int var14 = arg0.method189(255);
                                    var12[var13] = new byte[var14];
                                    arg0.method149(var12[var13], 0, (byte) -53, var14);
                                }
                            }
                            var4.field7031[var5] = var6;
                            Class[] var15 = new Class[var9];
                            for (int var16 = 0; var9 > var16; ++var16) {
                                var15[var16] = class527.method3136((byte) -101, var10[var16]);
                            }
                            var4.field7024[var5] = arg2.method3582(var15, arg3 + 47, var8, class527.method3136((byte) -101, var7));
                            var4.field7025[var5] = var12;
                        }
                    } else {
                        String var17 = arg0.method196((byte) -92);
                        String var18 = arg0.method196((byte) -92);
                        int var19 = 0;
                        if (var6 == 1) {
                            var19 = arg0.method189(arg3 ^ -210);
                        }
                        var4.field7031[var5] = var6;
                        var4.field7023[var5] = var19;
                        var4.field7032[var5] = arg2.method3592(0, class527.method3136((byte) -101, var17), var18);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field7029[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field7029[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field7029[var5] = -3;
                } catch (Exception var23) {
                    var4.field7029[var5] = -4;
                } catch (Throwable var24) {
                    var4.field7029[var5] = -5;
                }
            }
            class136.field1828.method3116(29066, var4);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZILjava/io/File;)V")
    public static final void method1829(boolean arg0, int arg1, File arg2) {
        if (class603.field8617 == null) {
            class225.method1459((byte) 49);
        }
        if (arg1 != 1) {
            method1830(19);
        }
        ++field4061;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field4069 != null ? field4069 : (field4069 = method1831("java.lang.String")), Boolean.TYPE);
            var4.invoke(class603.field8617, arg2.getAbsolutePath(), new Boolean(arg0));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
    public class316() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field4067;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field4065 = arg2.method193(2);
                }
            } else {
                this.field4064 = arg2.method193(2);
            }
        } else {
            this.field4063 = arg2.method193(2);
        }
        if (arg1) {
            method1830(5);
        }
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V")
    public static void method1830(int arg0) {
        if (arg0 != -5) {
            field4062 = null;
        }
        field4062 = null;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field4068;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[][] var4 = this.method4159(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class424.field5889; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4063 * var12 >> 12;
                    var9[var11] = this.field4064 * var13 >> 12;
                    var10[var11] = this.field4065 * var14 >> 12;
                } else {
                    var8[var11] = this.field4063;
                    var9[var11] = this.field4064;
                    var10[var11] = this.field4065;
                }
            }
        }
        if (arg1 != 0) {
            method1828((class26) null, -27, (class613) null, (byte) 83);
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1831(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
