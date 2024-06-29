import jaggl.OpenGL;
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

@OriginalClass("client!fd")
public class class365 extends class213 {

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lod;")
    private class349 field5580;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lrc;")
    private class374 field5582;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field5579 = 765;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lvp;")
    public static class123 field5583;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lic;")
    public static class491 field5581;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2266(String[] arg0, byte arg1) {
        int var2 = 70 % ((57 - arg1) / 52);
        field5584++;
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var3[var4] = var3[var4] + arg0[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILmv;I)V")
    public static final void method2267(int arg0, class252 arg1, int arg2) {
        if (arg0 != 1) {
            method2269(true);
        }
        field5585++;
        while (true) {
            class353 var3 = (class353) class499.field7355.method816(102);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5412; var5++) {
                if (var3.field5402[var5] != null) {
                    if (var3.field5402[var5].field4032 == 2) {
                        var3.field5410[var5] = -5;
                    }
                    if (var3.field5402[var5].field4032 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5400[var5] != null) {
                    if (var3.field5400[var5].field4032 == 2) {
                        var3.field5410[var5] = -6;
                    }
                    if (var3.field5400[var5].field4032 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1686(-4, arg2);
            arg1.method1410(0, -27645);
            int var6 = arg1.field3037;
            arg1.method1415(var3.field5411, (byte) -95);
            for (int var7 = 0; var7 < var3.field5412; var7++) {
                if (var3.field5410[var7] == 0) {
                    try {
                        int var8 = var3.field5405[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field5402[var7].field4030;
                            int var13 = var12.getInt(null);
                            arg1.method1410(0, arg0 - 27646);
                            arg1.method1415(var13, (byte) -63);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field5402[var7].field4030;
                            var11.setInt(null, var3.field5409[var7]);
                            arg1.method1410(0, -27645);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field5402[var7].field4030;
                            int var10 = var9.getModifiers();
                            arg1.method1410(0, arg0 - 27646);
                            arg1.method1415(var10, (byte) -110);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field5400[var7].field4030;
                            byte[][] var17 = var3.field5408[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method1410(0, arg0 - 27646);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1410(1, arg0 ^ 0xFFFF9402);
                                arg1.method1411(2144512464, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg1.method1410(2, -27645);
                                arg1.method1418(true, (String) var21);
                            } else {
                                arg1.method1410(4, -27645);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field5400[var7].field4030;
                            int var15 = var14.getModifiers();
                            arg1.method1410(0, -27645);
                            arg1.method1415(var15, (byte) -90);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1410(-10, -27645);
                    } catch (InvalidClassException var23) {
                        arg1.method1410(-11, -27645);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1410(-12, -27645);
                    } catch (OptionalDataException var25) {
                        arg1.method1410(-13, -27645);
                    } catch (IllegalAccessException var26) {
                        arg1.method1410(-14, arg0 ^ -27646);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1410(-15, -27645);
                    } catch (InvocationTargetException var28) {
                        arg1.method1410(-16, -27645);
                    } catch (SecurityException var29) {
                        arg1.method1410(-17, arg0 - 27646);
                    } catch (IOException var30) {
                        arg1.method1410(-18, -27645);
                    } catch (NullPointerException var31) {
                        arg1.method1410(-19, -27645);
                    } catch (Exception var32) {
                        arg1.method1410(-20, -27645);
                    } catch (Throwable var33) {
                        arg1.method1410(-21, arg0 - 27646);
                    }
                } else {
                    arg1.method1410(var3.field5410[var7], -27645);
                }
            }
            arg1.method1456(-116, var6);
            arg1.method1443(arg1.field3037 - var6, arg0 ^ 0xFFFFFFFE);
            var3.method2049(-74);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lod;I)V")
    public class365(class349 arg0, int arg1) {
        this.field5580 = arg0;
        this.field5582 = new class374(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FILrc;Lrc;)Z")
    public final boolean method2268(float arg0, int arg1, class374 arg2, class374 arg3) {
        field5578++;
        boolean var5 = true;
        class77 var6 = this.field5580.field5369;
        class77 var7 = this.field5580.field5332;
        if (this.field5580.field5297.field3828 != arg2.field5694 || this.field5580.field5297.field3831 != arg2.field5694) {
            this.field5580.field5297 = new class260(this.field5580, 3553, 6408, arg2.field5694, arg2.field5694);
        }
        if (this.field5580.field5319.field3828 != arg3.field5694 || this.field5580.field5319.field3831 != arg3.field5694) {
            this.field5580.field5319 = new class260(this.field5580, 3553, 6408, arg3.field5694, arg3.field5694);
        }
        this.field5580.method1062(class230.field3444);
        this.field5580.method1112();
        this.field5580.method2152(arg1 ^ 0xFFFFAAFD);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field5582.field5694, this.field5582.field5694);
        this.field5580.method2165(arg1 + 21793, false);
        this.field5580.method2130(73, false);
        this.field5580.method2168(60, false);
        this.field5580.method2177(3678, false);
        this.field5580.method2161(123, -2);
        if (arg1 != -21875) {
            field5581 = null;
        }
        this.field5580.method2176(1, 104);
        this.field5580.method2170(0.0F, arg1 + 21875, 0.0F, 0.0F, arg0);
        this.field5580.method2131(arg1 ^ 0xFFFF2FFF, 34165, 34165);
        this.field5580.method2200(null, (byte) 116);
        this.field5580.method2176(0, 91);
        this.field5580.method2186(1, arg1 ^ 0x551B);
        this.field5580.method2200(null, (byte) 122);
        int var8 = 0;
        while (var8 < 6) {
            int var9 = var8 + 34069;
            this.field5580.method2180(var6, (byte) 32);
            var6.method442(var9, arg2, 0, 0);
            this.field5580.method2169(var7, (byte) -101);
            var7.method448(this.field5580.field5297, 0, (byte) 108);
            if (var6.method446(arg1 ^ 0x552C) && var7.method446(-108)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5694, arg2.field5694, 0, 0, arg2.field5694, arg2.field5694, 16384, 9728);
                var6.method442(var9, arg3, arg1 + 21875, 0);
                var7.method448(this.field5580.field5319, 0, (byte) 100);
                if (var6.method446(-91) && var7.method446(-87)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field5694, arg2.field5694, 0, 0, arg2.field5694, arg2.field5694, 16384, 9728);
                    var6.method451(97, 0);
                    this.field5580.method2124(true, var6);
                    var7.method451(arg1 ^ 0xFFFFAAFE, 0);
                    this.field5580.method2134(var7, false);
                    this.field5580.method2137(var6, -7906);
                    var6.method442(var9, this.field5582, 0, 0);
                    if (!var6.method446(-120)) {
                        var6.method451(125, 0);
                        var5 = false;
                        this.field5580.method2133(var6, -83);
                        break;
                    }
                    this.field5580.method2176(1, arg1 + 21916);
                    this.field5580.method2200(this.field5580.field5319, (byte) 115);
                    this.field5580.method2176(0, 33);
                    this.field5580.method2200(this.field5580.field5297, (byte) 125);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field5580.method2176(1, 84);
                    this.field5580.method2200(null, (byte) 114);
                    this.field5580.method2176(0, arg1 + 21938);
                    this.field5580.method2200(null, (byte) 124);
                    var6.method451(27, 0);
                    this.field5580.method2133(var6, -117);
                    var8++;
                    continue;
                }
                var6.method451(arg1 ^ 0xFFFFAA9F, 0);
                this.field5580.method2124(true, var6);
                var7.method451(71, 0);
                var5 = false;
                this.field5580.method2134(var7, false);
                break;
            }
            var6.method451(69, 0);
            this.field5580.method2124(true, var6);
            var7.method451(48, 0);
            var5 = false;
            this.field5580.method2134(var7, false);
            break;
        }
        this.field5580.method2176(1, 48);
        this.field5580.method2131(arg1 + 56037, 8448, 8448);
        this.field5580.method2176(0, 65);
        OpenGL.glPopAttrib();
        this.field5580.method1098(class230.field3444[0], class230.field3444[1], class230.field3444[2], class230.field3444[3]);
        if (var5) {
            this.field5582.method2676(-13523);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Lrc;")
    public final class374 method1489(byte arg0) {
        int var2 = 30 % ((72 - arg0) / 52);
        field5587++;
        return this.field5582;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method2269(boolean arg0) {
        if (!arg0) {
            field5583 = null;
        }
        field5581 = null;
        field5583 = null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
    public final int method2270(int arg0) {
        if (arg0 > -95) {
            field5583 = null;
        }
        field5586++;
        return this.field5582.field5694;
    }
}
