import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class332 implements Runnable {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    private int field4612 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
    private boolean field4606 = false;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Z")
    private boolean field4625 = false;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private int field4629 = 0;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field4620;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lis;")
    private class65 field4615;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field4626;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4621;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field4628 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lor;")
    private class275 field4611;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lab;")
    public static class400 field4613;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[B")
    private byte[] field4623;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[[B")
    public static byte[][] field4610;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method2085(int arg0) throws IOException {
        field4622++;
        if (this.field4606) {
            return;
        }
        if (this.field4625) {
            this.field4625 = false;
            throw new IOException();
        } else if (arg0 != 3) {
            method2086(-56);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method2086(int arg0) {
        if (arg0 != 20898) {
            field4610 = null;
        }
        field4610 = null;
        field4613 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwe;Lid;ILvc;)V")
    public static final void method2087(class76 arg0, class266 arg1, int arg2, class89 arg3) {
        field4619++;
        class417 var4 = arg0.method676(30764, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1293();
        if (var4.method1287() > var5) {
            var5 = var4.method1287();
        }
        byte var6 = 10;
        if (arg2 != -1) {
            return;
        }
        int var7 = arg1.field3830;
        int var8 = arg1.field3827;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field1102 != null) {
            var9 = class473.field6660.method1353((int[]) null, class200.field2970, (class417[]) null, (byte) 84, arg0.field1102);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class200.field2970[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class145.field2005.method1538(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class145.field2005.method1539() * var9 + (class145.field2005.method1540() / 2);
        }
        int var15 = var5 / 2 + arg1.field3830;
        if ((class330.field4592 + var5) > var7) {
            var15 = var10 / 2 + var5 / 2 + class330.field4592 + var6 + 5;
            var7 = class330.field4592;
        } else if ((class330.field4594 - var5) < var7) {
            var7 = class330.field4594 - var5;
            var15 = class330.field4594 - (var5 / 2) - (var10 / 2) - var6 - 5;
        }
        int var16 = arg1.field3827;
        if (var8 < class330.field4587 + var5) {
            var16 = class330.field4587 + (var5 / 2) + var6;
            var8 = class330.field4587;
        } else if (class330.field4595 - var5 < var8) {
            var8 = class330.field4595 - var5;
            var16 = class330.field4595 - (var5 / 2) - (var6 + var11);
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field3830), (double) (var8 - arg1.field3827)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2492((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field1102 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = class145.field2005.method1539() * var9 + var16 + 3;
            if (arg0.field1105 != 0) {
                arg3.method742(11, var16, var21 - var16, -var18 + var20, arg0.field1105, var18);
            }
            if (arg0.field1099 != 0) {
                arg3.method751(var20 - var18, -var16 + var21, var18, arg0.field1099, 68, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class200.field2970[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class145.field2005.method1541(arg3, var23, var15, var16, arg0.field1126, true);
                var16 += class145.field2005.method1539();
            }
        }
        if (arg0.field1086 == -1 && arg0.field1102 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class88 var25 = new class88(arg1);
        var25.field1237 = var7 + var24;
        var25.field1235 = var18;
        var25.field1247 = var7 - var24;
        var25.field1241 = var20;
        var25.field1249 = var19;
        var25.field1242 = var8 + var24;
        var25.field1244 = var8 - var24;
        var25.field1240 = var21;
        class135.field1887.method766(var25, -1);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
    public final int method2088(int arg0) throws IOException {
        field4617++;
        if (this.field4606) {
            return 0;
        } else {
            int var2 = -23 % ((arg0 + 49) / 50);
            return this.field4626.read();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)I")
    public final int method2089(boolean arg0) throws IOException {
        if (arg0) {
            return 62;
        } else {
            field4607++;
            return this.field4606 ? 0 : this.field4626.available();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BBI)V")
    public final void method2090(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != -45) {
            return;
        }
        field4616++;
        if (this.field4606) {
            return;
        }
        if (this.field4625) {
            this.field4625 = false;
            throw new IOException();
        }
        if (this.field4623 == null) {
            this.field4623 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4623[this.field4612] = arg1[arg0 + var6];
                this.field4612 = (this.field4612 + 1) % 5000;
                if (((this.field4629 + 4900) % 5000) == this.field4612) {
                    throw new IOException();
                }
            }
            if (this.field4611 == null) {
                this.field4611 = this.field4615.method616(this, 1, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public final void method2091(int arg0) {
        field4614++;
        if (!this.field4606) {
            this.field4626 = new class176();
            int var2 = -38 % ((arg0 - 32) / 63);
            this.field4621 = new class232();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method2092(int arg0, int arg1, byte arg2) {
        field4624++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (arg2 >= -56) {
            return null;
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
    public static final int method2093(byte arg0) {
        field4608++;
        try {
            if (class303.field4305 == 0) {
                if ((class10.method51(-3183) - 5000L) < class384.field5270) {
                    return 0;
                }
                class477.field6785 = class436.field6206.method595(class118.field1643, (byte) 87, class419.field5818);
                class79.field1164 = class10.method51(-3183);
                class303.field4305 = 1;
            }
            if (class10.method51(arg0 ^ 0xC2D) > class79.field1164 + 30000L) {
                return class380.method2322(arg0 + 12320, 1000);
            } else if (arg0 == -68) {
                if (class303.field4305 == 1) {
                    if (class477.field6785.field3979 == 2) {
                        return class380.method2322(arg0 ^ 0xFFFFD060, 1001);
                    }
                    if (class477.field6785.field3979 != 1) {
                        return -1;
                    }
                    class394.field5440 = new class332((Socket) class477.field6785.field3984, class436.field6206);
                    class477.field6785 = null;
                    int var1 = 0;
                    if (class6.field36) {
                        var1 = class37.field454;
                    }
                    class311.field4403.field2298 = 0;
                    class311.field4403.method1180((byte) -110, class433.field6131.field60);
                    class311.field4403.method1177(var1, -36);
                    class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, class311.field4403.field2298);
                    if (class205.field3009 != null) {
                        class205.field3009.method1067((byte) 107);
                    }
                    if (class411.field5619 != null) {
                        class411.field5619.method1067((byte) 107);
                    }
                    int var2 = class394.field5440.method2088(-104);
                    if (class205.field3009 != null) {
                        class205.field3009.method1067((byte) 107);
                    }
                    if (class411.field5619 != null) {
                        class411.field5619.method1067((byte) 107);
                    }
                    if (var2 != 0) {
                        return class380.method2322(12252, var2);
                    }
                    class303.field4305 = 2;
                }
                if (class303.field4305 == 2) {
                    if (class394.field5440.method2089(false) < 2) {
                        return -1;
                    }
                    class271.field3943 = class394.field5440.method2088(-125);
                    class271.field3943 <<= 0x8;
                    class271.field3943 += class394.field5440.method2088(-121);
                    class208.field3053 = 0;
                    class303.field4305 = 3;
                    class454.field6428 = new byte[class271.field3943];
                }
                if (class303.field4305 != 3) {
                    return -1;
                }
                int var3 = class394.field5440.method2089(false);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class271.field3943 - class208.field3053) {
                    var3 = class271.field3943 - class208.field3053;
                }
                class394.field5440.method2094(class208.field3053, var3, arg0 - 47, class454.field6428);
                class208.field3053 += var3;
                if (class271.field3943 > class208.field3053) {
                    return -1;
                } else if (class363.method2229(class454.field6428, -10400)) {
                    class361.field4975 = new class21[class267.field3921];
                    int var4 = 0;
                    for (int var5 = class262.field3772; var5 <= class150.field2079; var5++) {
                        class21 var6 = class406.method2432(-28, var5);
                        if (var6 != null) {
                            class361.field4975[var4++] = var6;
                        }
                    }
                    class407.field5563 = null;
                    class268.field3926 = 0;
                    class394.field5440.method2095(false);
                    class416.field5715 = 0;
                    class454.field6428 = null;
                    class303.field4305 = 0;
                    class394.field5440 = null;
                    class384.field5270 = class10.method51(-3183);
                    return 0;
                } else {
                    return class380.method2322(arg0 ^ 0xFFFFD060, 1002);
                }
            } else {
                return 101;
            }
        } catch (IOException var7) {
            return class380.method2322(12252, 1003);
        }
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2095(false);
        field4609++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[B)V")
    public final void method2094(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4627++;
        if (this.field4606) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field4626.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
        if (arg2 > -90) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4629 == this.field4612) {
                            if (this.field4606) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4629;
                        if (this.field4629 > this.field4612) {
                            var3 = 5000 - this.field4629;
                        } else {
                            var3 = this.field4612 - this.field4629;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4621.write(this.field4623, var2, var3);
                    } catch (IOException var9) {
                        this.field4625 = true;
                    }
                    this.field4629 = (this.field4629 + var3) % 5000;
                    try {
                        if (this.field4629 == this.field4612) {
                            this.field4621.flush();
                        }
                    } catch (IOException var8) {
                        this.field4625 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4626 != null) {
                        this.field4626.close();
                    }
                    if (this.field4621 != null) {
                        this.field4621.close();
                    }
                    if (this.field4620 != null) {
                        this.field4620.close();
                    }
                } catch (IOException var7) {
                }
                this.field4623 = null;
                break;
            }
        } catch (Exception var12) {
            class83.method704((byte) 96, var12, (String) null);
        }
        field4618++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public final void method2095(boolean arg0) {
        field4605++;
        if (arg0) {
            field4628 = -51;
        }
        if (this.field4606) {
            return;
        }
        synchronized (this) {
            this.field4606 = true;
            this.notifyAll();
        }
        if (this.field4611 != null) {
            while (this.field4611.field3979 == 0) {
                class89.method752(0, 1L);
            }
            if (this.field4611.field3979 == 1) {
                try {
                    ((Thread) this.field4611.field3984).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4611 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/net/Socket;Lis;)V")
    public class332(Socket arg0, class65 arg1) throws IOException {
        this.field4620 = arg0;
        this.field4615 = arg1;
        this.field4620.setSoTimeout(30000);
        this.field4620.setTcpNoDelay(true);
        this.field4626 = this.field4620.getInputStream();
        this.field4621 = this.field4620.getOutputStream();
    }
}
