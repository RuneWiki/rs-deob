import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class238 {

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field11 = 52;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "Ljo;")
    public static class351 field7 = new class351(47, 3);

    @OriginalMember(owner = "client!us", name = "I", descriptor = "F")
    private float field15;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "F")
    private float field17;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "Lrb;")
    public static class370 field19;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "Ljava/lang/String;")
    private String field10;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "Ljava/lang/String;")
    private String field6;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "Ljava/lang/String;")
    private String field9;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public static void method1(int arg0) {
        field19 = null;
        field7 = null;
        if (arg0 != -1) {
            field19 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method2(int arg0, OggPacket arg1) {
        ++field1;
        if (~super.field3438 >= -1 || "SUB".equals(this.field9)) {
            if (arg0 != 0) {
                method8();
            }
            class120 var3 = new class120(arg1.getData());
            int var4 = var3.method842(arg0 + 2384);
            if (~super.field3438 >= -9) {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field3438 == 0) {
                    var3.field1521 += 23;
                    this.field2 = var3.method853((byte) 66);
                    this.field13 = var3.method853((byte) 66);
                    if (~this.field2 != -1 && this.field13 != 0) {
                        class120 var5 = new class120(16);
                        var3.method850(255, 0, 16, var5.field1556);
                        this.field6 = var5.method861(true);
                        var5.field1521 = 0;
                        var3.method850(255, 0, 16, var5.field1556);
                        this.field9 = var5.method861(true);
                        return;
                    }
                    throw new IllegalStateException();
                }
            } else {
                if (~var4 == -1) {
                    long var6 = var3.method872((byte) -104);
                    long var8 = var3.method872((byte) -119);
                    long var10 = var3.method872((byte) -43);
                    if (~var6 > -1L || var8 < 0L || var10 < 0L || ~var6 > ~var10) {
                        throw new IllegalStateException();
                    }
                    this.field15 = (float) ((var6 + var8) * (long) this.field13) / (float) this.field2;
                    this.field17 = (float) ((long) this.field13 * var6) / (float) this.field2;
                    int var12 = var3.method853((byte) 66);
                    if (~var12 > -1 || ~var12 < ~(var3.field1556.length + -var3.field1521)) {
                        throw new IllegalStateException();
                    }
                    this.field10 = class767.method4230(var3.field1556, var3.field1521, 240, var12);
                }
                if ((var4 | 128) != 0) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method3(int arg0) {
        ++field12;
        return arg0 < 27 ? null : this.field6;
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)V")
    public static final void method4(int arg0) {
        ++field3;
        if (!class367.field5288) {
            class318.field4733 += (-24.0F - class318.field4733) / 2.0F;
            class367.field5288 = true;
            if (arg0 != 0) {
                field19 = null;
            }
            class452.field6508 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)F")
    public final float method5(boolean arg0) {
        ++field8;
        if (arg0) {
            this.field13 = -37;
        }
        return this.field15;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class1(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)F")
    public final float method6(byte arg0) {
        ++field4;
        if (arg0 != -34) {
            this.field17 = 0.74607944F;
        }
        return this.field17;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method7(byte arg0) {
        ++field5;
        if (arg0 <= 6) {
            method1(-76);
        }
        return this.field10;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
    public static final void method8() {
        if (class358.field5208 != null) {
            for (int var0 = 0; var0 < class358.field5208.length; ++var0) {
                for (int var1 = 0; var1 < class151.field2074; ++var1) {
                    for (int var2 = 0; var2 < class12.field249; ++var2) {
                        if (class358.field5208[var0][var1][var2] != null) {
                            class358.field5208[var0][var1][var2].method2339(-100);
                        }
                        class358.field5208[var0][var1][var2] = null;
                    }
                }
            }
        }
        class358.field5208 = null;
        class750.field10395 = null;
        if (class262.field3697 != null) {
            for (int var3 = 0; var3 < class262.field3697.length; ++var3) {
                for (int var4 = 0; var4 < class151.field2074; ++var4) {
                    for (int var5 = 0; var5 < class12.field249; ++var5) {
                        if (class262.field3697[var3][var4][var5] != null) {
                            class262.field3697[var3][var4][var5].method2339(-102);
                        }
                        class262.field3697[var3][var4][var5] = null;
                    }
                }
            }
        }
        class262.field3697 = null;
        class311.field4628 = null;
        class378.field5427 = null;
        class622.field8777 = null;
        class457.field6551 = null;
        class250.field3544 = null;
        class663.field9310 = null;
        class377.field5419 = null;
        class361.field5238 = null;
        class712.method4026((byte) 122);
        if (class296.field4465 != null) {
            for (int var6 = 0; var6 < class592.field8357; ++var6) {
                class296.field4465[var6] = null;
            }
            class592.field8357 = 0;
        }
        class472.field6734 = null;
        class110.field1365 = null;
        class511.field7305 = null;
        if (class372.field5364 != null) {
            for (int var7 = 0; var7 < class372.field5364.length; ++var7) {
                class372.field5364[var7] = null;
            }
            class709.field9996 = 0;
        }
        if (class564.field8010 != null) {
            for (int var8 = 0; var8 < class564.field8010.length; ++var8) {
                class564.field8010[var8] = null;
            }
            class761.field10492 = 0;
        }
        if (class238.field3437 != null) {
            for (int var9 = 0; var9 < class540.field7582; ++var9) {
                class238.field3437[var9] = null;
            }
            for (int var10 = 0; var10 < class456.field6545; ++var10) {
                for (int var11 = 0; var11 < class151.field2074; ++var11) {
                    for (int var12 = 0; var12 < class12.field249; ++var12) {
                        class555.field7896[var10][var11][var12] = 0L;
                    }
                }
            }
            class540.field7582 = 0;
        }
        class201.method1447(-106);
        class619.field8726 = class619.field8727;
        class619.field8726.method3719(0);
        class322.field4766 = null;
        class689.field9755 = null;
        class135.field1748 = null;
        if (class468.field6693 != null) {
            class339.method2174();
            class711.field10005.method489(1);
            class711.field10005.method441(0);
        }
        if (class137.field1790 != null) {
            class137.field1790 = null;
        }
        class711.field10005 = null;
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(B)Ldd;")
    public static final class731 method9(byte arg0) {
        if (arg0 != -96) {
            field11 = 12;
        }
        ++field16;
        return ~class325.field4865 == -1 ? new class731() : class257.field3606[--class325.field4865];
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public final void method10(int arg0) {
        ++field14;
        if (arg0 != 12056) {
            method4(-128);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method11(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field18;
        int var8 = arg4 + -334;
        if (~var8 <= -1) {
            if (var8 > 100) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = (-class576.field8142 + class609.field8600) * var8 / 100 + class576.field8142;
        int var10 = arg2 * var9 >> 8;
        class412.field5822 = class412.field5823 * var9 >> 8;
        int var11 = 16383 & -arg6 + 16384;
        int var12 = 16383 & -arg0 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class601.field8476[var11] * -var10 >> 14;
            var15 = class601.field8473[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class601.field8476[var12] * var15 >> 14;
            var15 = class601.field8473[var12] * var15 >> 14;
        }
        int var16 = 12 % ((-61 - arg1) / 39);
        class666.field9380 = 0;
        class655.field9241 = -var14 + arg7;
        class359.field5216 = arg3 - var15;
        class277.field3866 = -var13 + arg5;
        class689.field9757 = arg6;
        class118.field1478 = arg0;
    }
}
