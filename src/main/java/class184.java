import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class184 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Ljq;")
    private class183 field2348 = new class183();

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2337 = " has logged in.";

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Ljq;")
    private class183 field2349;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Lam;")
    public static class286 field2347;

    // $FF: synthetic field
    @OriginalMember(owner = "client!um", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2350;

    // $FF: synthetic method
    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method993(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Ljq;", line = 10)
    public final class183 method983(byte arg0) {
        field2342++;
        if (arg0 != 106) {
            this.method992((class183) null, -109);
        }
        class183 var2 = this.field2348.field2327;
        if (this.field2348 == var2) {
            return null;
        } else {
            var2.method982((byte) 87);
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Ljq;", line = 30)
    public final class183 method984(byte arg0) {
        if (arg0 < 45) {
            return null;
        }
        field2344++;
        class183 var2 = this.field2349;
        if (this.field2348 == var2) {
            this.field2349 = null;
            return null;
        } else {
            this.field2349 = var2.field2327;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Z", line = 51)
    public final boolean method985(byte arg0) {
        field2340++;
        if (arg0 >= -29) {
            this.method983((byte) -64);
        }
        return this.field2348.field2327 == this.field2348;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Ljq;", line = 63)
    public final class183 method986(byte arg0) {
        int var2 = 73 % ((arg0 - 53) / 33);
        field2341++;
        class183 var3 = this.field2348.field2327;
        if (this.field2348 == var3) {
            this.field2349 = null;
            return null;
        } else {
            this.field2349 = var3.field2327;
            return var3;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 88)
    public static void method987(int arg0) {
        field2347 = null;
        if (arg0 != 0) {
            method991();
        }
        field2337 = null;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I", line = 99)
    public final int method988(byte arg0) {
        int var2 = 69 % ((-arg0 - 45) / 58);
        field2346++;
        int var3 = 0;
        class183 var4 = this.field2348.field2327;
        while (this.field2348 != var4) {
            var4 = var4.field2327;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 121)
    public final void method989(int arg0) {
        if (arg0 != 1) {
            field2345 = -95;
        }
        field2339++;
        while (true) {
            class183 var2 = this.field2348.field2327;
            if (this.field2348 == var2) {
                this.field2349 = null;
                return;
            }
            var2.method982((byte) 74);
        }
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Ljq;", line = 146)
    public final class183 method990(byte arg0) {
        if (arg0 <= 81) {
            return null;
        }
        field2343++;
        class183 var2 = this.field2348.field2333;
        if (this.field2348 == var2) {
            this.field2349 = null;
            return null;
        } else {
            this.field2349 = var2.field2333;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 168)
    public static final void method991() {
        for (int var0 = 0; var0 < class436.field6376; var0++) {
            if (!class101.field1193[var0]) {
                class106 var1 = class227.field3090[var0];
                int var2 = var1.field1309;
                int var3 = var1.field4855 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field4853 - var3 >> 7;
                int var8 = var1.field4851 - var3 >> 7;
                int var9 = var1.field4851 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class209.field2840) {
                    var9 = class209.field2840 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field1304[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class231.field3184) {
                        var15 = class231.field3184 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class17 var18 = class165.method878(var2, var16, var10, field2350 == null ? (field2350 = method993("hd")) : field2350);
                        if (var18 != null && var18.field160 != 0) {
                            if (var18.field160 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field1304[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field1304[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field1304[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field1304[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class101.field1193[var0] = true;
                class98.field1161[var2].method270(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljq;I)V", line = 341)
    public final void method992(class183 arg0, int arg1) {
        int var3 = 126 % ((arg1 - 14) / 45);
        if (arg0.field2333 != null) {
            arg0.method982((byte) 125);
        }
        field2338++;
        arg0.field2327 = this.field2348;
        arg0.field2333 = this.field2348.field2333;
        arg0.field2333.field2327 = arg0;
        arg0.field2327.field2333 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 371)
    public class184() {
        this.field2348.field2327 = this.field2348;
        this.field2348.field2333 = this.field2348;
    }
}
