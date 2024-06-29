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

@OriginalClass("client!pg")
public class class514 extends class282 {

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field7551 = 0;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public int field7553;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Ldh;")
    public class209 field7549;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "Lbs;")
    public static class483 field7555;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "[B")
    public byte[] field7547;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "[[I")
    public static int[][] field7546;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILa;)V", line = 3)
    public static final void method3022(byte arg0, int arg1, class436 arg2) {
        ++field7550;
        int var3 = -28 % ((arg0 - -64) / 60);
        while (true) {
            class257 var4 = (class257) class400.field5572.method3072((byte) 69);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var4.field3555 > var6; ++var6) {
                if (var4.field3552[var6] != null) {
                    if (var4.field3552[var6].field5652 == 2) {
                        var4.field3560[var6] = -5;
                    }
                    if (~var4.field3552[var6].field5652 == -1) {
                        var5 = true;
                    }
                }
                if (var4.field3554[var6] != null) {
                    if (var4.field3554[var6].field5652 == 2) {
                        var4.field3560[var6] = -6;
                    }
                    if (var4.field3554[var6].field5652 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method2602(arg1, (byte) 71);
            arg2.method2084(0, false);
            int var7 = arg2.field5069;
            arg2.method2074(false, var4.field3559);
            for (int var8 = 0; var8 < var4.field3555; ++var8) {
                if (~var4.field3560[var8] != -1) {
                    arg2.method2084(var4.field3560[var8], false);
                } else {
                    try {
                        int var9 = var4.field3556[var8];
                        if (var9 != 0) {
                            if (var9 == 1) {
                                Field var10 = (Field) var4.field3552[var8].field5654;
                                var10.setInt((Object) null, var4.field3553[var8]);
                                arg2.method2084(0, false);
                            } else if (var9 == 2) {
                                Field var11 = (Field) var4.field3552[var8].field5654;
                                int var12 = var11.getModifiers();
                                arg2.method2084(0, false);
                                arg2.method2074(false, var12);
                            }
                        } else {
                            Field var13 = (Field) var4.field3552[var8].field5654;
                            int var14 = var13.getInt((Object) null);
                            arg2.method2084(0, false);
                            arg2.method2074(false, var14);
                        }
                        if (var9 != 3) {
                            if (~var9 == -5) {
                                Method var15 = (Method) var4.field3554[var8].field5654;
                                int var16 = var15.getModifiers();
                                arg2.method2084(0, false);
                                arg2.method2074(false, var16);
                            }
                        } else {
                            Method var17 = (Method) var4.field3554[var8].field5654;
                            byte[][] var18 = var4.field3558[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var18.length > var20; ++var20) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg2.method2084(0, false);
                            } else if (var22 instanceof Number) {
                                arg2.method2084(1, false);
                                arg2.method2076(((Number) var22).longValue(), (byte) -123);
                            } else if (var22 instanceof String) {
                                arg2.method2084(2, false);
                                arg2.method2073(35, (String) var22);
                            } else {
                                arg2.method2084(4, false);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method2084(-10, false);
                    } catch (InvalidClassException var24) {
                        arg2.method2084(-11, false);
                    } catch (StreamCorruptedException var25) {
                        arg2.method2084(-12, false);
                    } catch (OptionalDataException var26) {
                        arg2.method2084(-13, false);
                    } catch (IllegalAccessException var27) {
                        arg2.method2084(-14, false);
                    } catch (IllegalArgumentException var28) {
                        arg2.method2084(-15, false);
                    } catch (InvocationTargetException var29) {
                        arg2.method2084(-16, false);
                    } catch (SecurityException var30) {
                        arg2.method2084(-17, false);
                    } catch (IOException var31) {
                        arg2.method2084(-18, false);
                    } catch (NullPointerException var32) {
                        arg2.method2084(-19, false);
                    } catch (Exception var33) {
                        arg2.method2084(-20, false);
                    } catch (Throwable var34) {
                        arg2.method2084(-21, false);
                    }
                }
            }
            arg2.method2104(var7, (byte) -107);
            arg2.method2107(-var7 + arg2.field5069, 113);
            var4.method2946(-119);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 192)
    public static final void method3023(boolean arg0) {
        ++field7548;
        if (class455.field6653 == null) {
            class455.field6653 = new int[65536];
            if (!arg0) {
                method3023(true);
            }
            double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
            int var3 = 0;
            for (int var4 = 0; var4 < 512; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (~var14 == -1) {
                        var9 = var8;
                        var10 = var18;
                        var11 = var16;
                    } else if (~var14 != -2) {
                        if (~var14 == -3) {
                            var9 = var16;
                            var11 = var18;
                            var10 = var8;
                        } else if (var14 == 3) {
                            var10 = var17;
                            var9 = var16;
                            var11 = var8;
                        } else if (~var14 != -5) {
                            if (var14 == 5) {
                                var9 = var8;
                                var10 = var16;
                                var11 = var17;
                            }
                        } else {
                            var9 = var18;
                            var10 = var16;
                            var11 = var8;
                        }
                    } else {
                        var10 = var8;
                        var9 = var17;
                        var11 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + (var22 << 16) + var24 + -16777216;
                    class455.field6653[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V", line = 313)
    public static void method3024(int arg0) {
        if (arg0 > 56) {
            field7555 = null;
            field7546 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)[B", line = 333)
    public final byte[] method614(int arg0) {
        ++field7554;
        if (arg0 < 20) {
            field7555 = null;
        }
        if (super.field3807) {
            throw new RuntimeException();
        } else {
            return this.field7547;
        }
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)I", line = 357)
    public final int method613(int arg0) {
        ++field7552;
        if (super.field3807) {
            return 0;
        } else {
            if (arg0 != -15473) {
                method3024(35);
            }
            return 100;
        }
    }
}
