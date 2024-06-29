import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class359 extends class157 implements ImageProducer {

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lwt;")
    public static class194 field5320 = new class194("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "[I")
    public static int[] field5331 = new int[32];

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5330 = 0;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "[C")
    public static char[] field5337 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "F")
    public static float field5336;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5328;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field5317;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5324;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5322;

    @OriginalMember(owner = "client!rc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5334;
    }

    @OriginalMember(owner = "client!rc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5318;
        return this.field5322 == arg0;
    }

    @OriginalMember(owner = "client!rc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5322 == arg0) {
            this.field5322 = null;
        }
        ++field5327;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public final void method1004(Graphics arg0, byte arg1, int arg2, int arg3) {
        this.method2181((byte) -112);
        ++field5329;
        arg0.drawImage(this.field5317, arg2, arg3, this.field5328);
        int var5 = 43 % ((arg1 - 74) / 44);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5323;
        if (this.field5322 != null) {
            this.field5322.setPixels(arg1, arg4, arg2, arg0, this.field5324, super.field2052, super.field2049 * arg4 + arg1, super.field2049);
            this.field5322.imageComplete(arg3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public final void method1001(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -6) {
            this.field5322 = null;
        }
        this.method2177(arg5, arg1, arg4, arg2 ^ -8, arg3);
        ++field5325;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg4, arg5);
        arg0.drawImage(this.field5317, 0, 0, this.field5328);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([FFFIIIIIIIIFZ)V")
    public static final void method2178(float[] arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float arg11, boolean arg12) {
        int var13 = arg4 - arg8;
        int var14 = arg10 - arg9;
        int var15 = arg5 - arg7;
        ++field5333;
        float var16 = arg0[2] * (float) var15 + arg0[0] * (float) var14 + arg0[1] * (float) var13;
        if (!arg12) {
            float var17 = arg0[5] * (float) var15 + arg0[4] * (float) var13 + arg0[3] * (float) var14;
            float var18 = arg0[8] * (float) var15 + arg0[7] * (float) var13 + arg0[6] * (float) var14;
            float var19;
            float var20;
            if (arg6 == 0) {
                var19 = arg11 + var16 + 0.5F;
                var20 = -var18 + arg2 + 0.5F;
            } else if (~arg6 != -2) {
                if (arg6 != 2) {
                    if (~arg6 != -4) {
                        if (~arg6 == -5) {
                            var19 = arg2 + var18 + 0.5F;
                            var20 = -var17 + arg1 + 0.5F;
                        } else {
                            var20 = -var17 + arg1 + 0.5F;
                            var19 = -var18 + arg2 + 0.5F;
                        }
                    } else {
                        var20 = -var17 + arg1 + 0.5F;
                        var19 = arg11 + var16 + 0.5F;
                    }
                } else {
                    var19 = -var16 + arg11 + 0.5F;
                    var20 = -var17 + arg1 + 0.5F;
                }
            } else {
                var19 = arg11 + var16 + 0.5F;
                var20 = arg2 + var18 + 0.5F;
            }
            if (arg3 != 1) {
                if (arg3 != 2) {
                    if (~arg3 == -4) {
                        float var21 = var19;
                        var19 = var20;
                        var20 = -var21;
                    }
                } else {
                    var20 = -var20;
                    var19 = -var19;
                }
            } else {
                float var22 = var19;
                var19 = -var20;
                var20 = var22;
            }
            class122.field1597 = var19;
            class225.field3172 = var20;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILmd;)V")
    public static final void method2179(int arg0, int arg1, class364 arg2) {
        ++field5319;
        int var3 = 81 / ((40 - arg0) / 60);
        while (true) {
            class116 var4 = (class116) class305.field4419.method2096(-21400);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; ~var6 > ~var4.field1489; ++var6) {
                if (var4.field1498[var6] != null) {
                    if (~var4.field1498[var6].field6417 == -3) {
                        var4.field1496[var6] = -5;
                    }
                    if (var4.field1498[var6].field6417 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1495[var6] != null) {
                    if (~var4.field1495[var6].field6417 == -3) {
                        var4.field1496[var6] = -6;
                    }
                    if (var4.field1495[var6].field6417 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method2230(arg1, false);
            arg2.method947(-93, 0);
            int var7 = arg2.field2018;
            arg2.method969(19869, var4.field1493);
            for (int var8 = 0; var8 < var4.field1489; ++var8) {
                if (~var4.field1496[var8] != -1) {
                    arg2.method947(-77, var4.field1496[var8]);
                } else {
                    try {
                        int var9 = var4.field1490[var8];
                        if (var9 != 0) {
                            if (var9 != 1) {
                                if (var9 == 2) {
                                    Field var10 = (Field) var4.field1498[var8].field6416;
                                    int var11 = var10.getModifiers();
                                    arg2.method947(-116, 0);
                                    arg2.method969(19869, var11);
                                }
                            } else {
                                Field var12 = (Field) var4.field1498[var8].field6416;
                                var12.setInt((Object) null, var4.field1492[var8]);
                                arg2.method947(-44, 0);
                            }
                        } else {
                            Field var13 = (Field) var4.field1498[var8].field6416;
                            int var14 = var13.getInt((Object) null);
                            arg2.method947(-30, 0);
                            arg2.method969(19869, var14);
                        }
                        if (~var9 != -4) {
                            if (~var9 == -5) {
                                Method var21 = (Method) var4.field1495[var8].field6416;
                                int var22 = var21.getModifiers();
                                arg2.method947(-38, 0);
                                arg2.method969(19869, var22);
                            }
                        } else {
                            Method var15 = (Method) var4.field1495[var8].field6416;
                            byte[][] var16 = var4.field1488[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var16.length > var18; ++var18) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 != null) {
                                if (var20 instanceof Number) {
                                    arg2.method947(-70, 1);
                                    arg2.method983(((Number) var20).longValue(), (byte) -102);
                                } else if (var20 instanceof String) {
                                    arg2.method947(-29, 2);
                                    arg2.method956(true, (String) var20);
                                } else {
                                    arg2.method947(-65, 4);
                                }
                            } else {
                                arg2.method947(-80, 0);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method947(-107, -10);
                    } catch (InvalidClassException var24) {
                        arg2.method947(-107, -11);
                    } catch (StreamCorruptedException var25) {
                        arg2.method947(-94, -12);
                    } catch (OptionalDataException var26) {
                        arg2.method947(-31, -13);
                    } catch (IllegalAccessException var27) {
                        arg2.method947(-53, -14);
                    } catch (IllegalArgumentException var28) {
                        arg2.method947(-112, -15);
                    } catch (InvocationTargetException var29) {
                        arg2.method947(-125, -16);
                    } catch (SecurityException var30) {
                        arg2.method947(-55, -17);
                    } catch (IOException var31) {
                        arg2.method947(-29, -18);
                    } catch (NullPointerException var32) {
                        arg2.method947(-50, -19);
                    } catch (Exception var33) {
                        arg2.method947(-72, -20);
                    } catch (Throwable var34) {
                        arg2.method947(-127, -21);
                    }
                }
            }
            arg2.method997(var7, -123);
            arg2.method966((byte) -121, -var7 + arg2.field2018);
            var4.method536(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method1007(Canvas arg0, byte arg1) {
        ++field5321;
        this.field5328 = arg0;
        super.field2049 = this.field5328.getSize().width;
        super.field2054 = this.field5328.getSize().height;
        super.field2052 = new int[super.field2054 * super.field2049];
        this.field5324 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5317 = this.field5328.createImage(this);
        this.method2181((byte) 72);
        this.field5328.prepareImage(this.field5317, this.field5328);
        this.method2181((byte) 89);
        if (arg1 >= 55) {
            this.field5328.prepareImage(this.field5317, this.field5328);
            this.method2181((byte) 109);
            this.field5328.prepareImage(this.field5317, this.field5328);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public static void method2180(int arg0) {
        if (arg0 != 2) {
            method2179(-93, 61, (class364) null);
        }
        field5320 = null;
        field5337 = null;
        field5331 = null;
    }

    @OriginalMember(owner = "client!rc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5316;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    private final synchronized void method2181(byte arg0) {
        ++field5335;
        if (this.field5322 != null) {
            this.field5322.setPixels(0, 0, super.field2049, super.field2054, this.field5324, super.field2052, 0, super.field2049);
            int var2 = -68 % ((1 - arg0) / 58);
            this.field5322.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5326;
        this.field5322 = arg0;
        arg0.setDimensions(super.field2049, super.field2054);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5324);
        arg0.setHints(14);
    }
}
