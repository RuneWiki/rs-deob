import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class362 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lmga;")
    private class666 field4876 = new class666(16);

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "Lbi;")
    private class449 field4882;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "Lbi;")
    public static class449 field4881;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Luu;", line = 9)
    public final class264 method2137(int arg0, int arg1) {
        field4873++;
        class666 var3 = this.field4876;
        class264 var4;
        synchronized (this.field4876) {
            var4 = (class264) this.field4876.method3750((long) arg0, false);
            if (arg1 != 28803) {
                this.method2137(-111, 51);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field4882;
        byte[] var6;
        synchronized (this.field4882) {
            var6 = this.field4882.method2537(false, 30, arg0);
        }
        class264 var7 = new class264();
        if (var6 != null) {
            var7.method1613(true, new class335(var6));
        }
        class666 var8 = this.field4876;
        synchronized (this.field4876) {
            this.field4876.method3745(arg1 - 28802, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 39)
    public final void method2138(int arg0) {
        class666 var2 = this.field4876;
        synchronized (this.field4876) {
            this.field4876.method3748(6);
            if (arg0 != 27892) {
                this.field4876 = null;
            }
        }
        field4879++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZI)V", line = 52)
    public final void method2139(boolean arg0, int arg1) {
        class666 var3 = this.field4876;
        synchronized (this.field4876) {
            this.field4876.method3740((byte) 60, arg1);
        }
        field4878++;
        if (!arg0) {
            this.method2137(66, 85);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[I[ILst;[I)V", line = 65)
    public static final void method2140(int arg0, int[] arg1, int[] arg2, class403 arg3, int[] arg4) {
        for (int var5 = arg0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field5605.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field5605[var9] = null;
                    } else {
                        class616 var10 = class636.field8570.method231(var6, -11764);
                        int var11 = var10.field8162;
                        class307 var12 = arg3.field5605[var9];
                        if (var12 != null) {
                            if (var12.field4235 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field5605[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4233 = 0;
                                    var12.field4234 = 1;
                                    var12.field4232 = var8;
                                    var12.field4236 = 0;
                                    var12.field4231 = 0;
                                    class373.method2199(arg3.field8609, arg3.field8620, (byte) 89, arg3.field8612, 0, var10, class199.field2897 == arg3);
                                } else if (var11 == 2) {
                                    var12.field4231 = 0;
                                }
                            } else if (var10.field8155 >= class636.field8570.method231(var12.field4235, arg0 - 11764).field8155) {
                                var12 = arg3.field5605[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class307 var13 = arg3.field5605[var9] = new class307();
                            var13.field4233 = 0;
                            var13.field4232 = var8;
                            var13.field4236 = 0;
                            var13.field4234 = 1;
                            var13.field4235 = var6;
                            var13.field4231 = 0;
                            class373.method2199(arg3.field8609, arg3.field8620, (byte) 100, arg3.field8612, 0, var10, class199.field2897 == arg3);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4883++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V", line = 163)
    public final void method2141(byte arg0) {
        field4875++;
        class666 var2 = this.field4876;
        synchronized (this.field4876) {
            this.field4876.method3739(0);
        }
        if (arg0 != -118) {
            this.field4876 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII[BI)Z", line = 181)
    public static final boolean method2142(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4880++;
        boolean var6 = true;
        class335 var7 = new class335(arg4);
        int var8 = arg5;
        label54: while (true) {
            int var9 = var7.method1995((byte) 118);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1997(arg5 ^ 0x80);
                    if (var13 == 0) {
                        continue label54;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFD0) >> 6;
                    int var16 = var7.method2034(255) >> 2;
                    int var17 = var15 + arg1;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < (arg0 - 1) && var18 < (arg2 - 1)) {
                        class58 var19 = class470.field6288.method1258(var8, (byte) -40);
                        if (var16 != 22 || class344.field4718.field5446 || var19.field816 != 0 || var19.field826 == 1 || var19.field890) {
                            var11 = true;
                            if (!var19.method481((byte) -116)) {
                                class687.field9654++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method1997(-129);
                if (var12 == 0) {
                    break;
                }
                var7.method2034(arg5 ^ 0xFFFFFF00);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 274)
    public class362(class671 arg0, int arg1, class449 arg2) {
        this.field4882 = arg2;
        this.field4882.method2527(0, 30);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V", line = 265)
    public static void method2143(byte arg0) {
        field4881 = null;
        if (arg0 > -115) {
            method2143((byte) 13);
        }
    }
}
