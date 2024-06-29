import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class178 extends class115 {

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    private int field3219 = 0;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "Z")
    public boolean field3231 = false;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    private int field3233 = -1;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "Lrg;")
    private class96 field3223;

    @OriginalMember(owner = "client!im", name = "gb", descriptor = "Z")
    private boolean field3237;

    @OriginalMember(owner = "client!im", name = "fb", descriptor = "Z")
    private boolean field3236;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "Z")
    private boolean field3221;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Z")
    private boolean field3210;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    private int field3218;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "Lud;")
    public static class279 field3228 = class130.method1024("http:)4)4", 255);

    @OriginalMember(owner = "client!im", name = "G", descriptor = "S")
    public static short field3212 = 205;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "Lvl;")
    public static class80 field3227 = null;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "Lud;")
    public static class279 field3206 = class130.method1024("<)4col>", 255);

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "Lud;")
    public static class279 field3229 = class130.method1024("hint_mapmarkers", 255);

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Lud;")
    public static class279 field3217 = class130.method1024("Hierhin gehen", 255);

    @OriginalMember(owner = "client!im", name = "eb", descriptor = "Lud;")
    public static class279 field3235 = class130.method1024(":duelstake:", 255);

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "F")
    private float field3232;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!im", name = "db", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!im", name = "hb", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!im", name = "jb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "Lia;")
    public static class206 field3226;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "Lom;")
    public static class70 field3224;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "Z")
    public static boolean field3208;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[I")
    private int[] field3207;

    @OriginalMember(owner = "client!im", name = "ib", descriptor = "[I")
    public static int[] field3239;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILok;Lkc;)Z", line = 28)
    public final boolean method1388(int arg0, class149 arg1, class36 arg2) {
        field3214++;
        if (arg0 >= 0) {
            this.field3231 = false;
        }
        return this.field3223.method801((byte) -109, arg2, arg1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLok;Lok;)V", line = 41)
    public static final void method1389(byte arg0, class149 arg1, class149 arg2) {
        field3234++;
        class92.field1744 = arg2;
        if (arg0 != 54) {
            method1392(-123, (class222) null, (byte) 108);
        }
        class115.field2101 = arg1;
    }

    @OriginalMember(owner = "client!im", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        field3220++;
        if (this.field3233 != -1) {
            class308.method2196(this.field3233, this.field3219, this.field3238);
            this.field3219 = 0;
            this.field3233 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lvh;)V", line = 571)
    public class178(class53 arg0) {
        this.field3223 = new class96(arg0);
        this.field3237 = arg0.method483(-122) == 1;
        this.field3236 = arg0.method483(-127) == 1;
        this.field3221 = arg0.method483(-125) == 1;
        this.field3210 = arg0.method483(-125) == 1;
        int var2 = arg0.method483(-105) & 0x3;
        this.field3218 = arg0.method494(false);
        this.field3211 = arg0.method494(false);
        int var3 = arg0.method483(-118);
        arg0.method483(-116);
        this.field3222 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field3230 = 2;
        } else if (var2 == 2) {
            this.field3230 = 3;
        } else if (var2 == 3) {
            this.field3230 = 4;
        } else {
            this.field3230 = 0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lkc;IZLok;)[I", line = 87)
    public final int[] method1390(class36 arg0, int arg1, boolean arg2, class149 arg3) {
        field3213++;
        if (this.field3223.method801((byte) -109, arg0, arg3)) {
            int var5 = arg2 ? 64 : 128;
            return arg1 == 128 ? this.field3223.method798(arg0, this.field3236, false, var5, var5, 67, arg3, 1.0D) : (int[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 111)
    public static void method1391(int arg0) {
        field3206 = null;
        field3239 = null;
        if (arg0 != -3) {
            method1392(-35, (class222) null, (byte) 106);
        }
        field3228 = null;
        field3229 = null;
        field3217 = null;
        field3235 = null;
        field3224 = null;
        field3226 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILfl;B)V", line = 128)
    public static final void method1392(int arg0, class222 arg1, byte arg2) {
        field3240++;
        if (arg2 < 2) {
            field3229 = (class279) null;
        }
        while (true) {
            class221 var3 = (class221) class54.field1186.method2248(-43);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3896; var5++) {
                if (var3.field3895[var5] != null) {
                    if (var3.field3895[var5].field3655 == 2) {
                        var3.field3912[var5] = -5;
                    }
                    if (var3.field3895[var5].field3655 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3897[var5] != null) {
                    if (var3.field3897[var5].field3655 == 2) {
                        var3.field3912[var5] = -6;
                    }
                    if (var3.field3897[var5].field3655 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1634(arg0, 0);
            arg1.method464(0, false);
            int var6 = arg1.field1142;
            arg1.method444((byte) 46, var3.field3906);
            for (int var7 = 0; var7 < var3.field3896; var7++) {
                if (var3.field3912[var7] == 0) {
                    try {
                        int var8 = var3.field3908[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3895[var7].field3657;
                            int var13 = var12.getInt((Object) null);
                            arg1.method464(0, false);
                            arg1.method444((byte) 46, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3895[var7].field3657;
                            var9.setInt((Object) null, var3.field3911[var7]);
                            arg1.method464(0, false);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3895[var7].field3657;
                            int var11 = var10.getModifiers();
                            arg1.method464(0, false);
                            arg1.method444((byte) 46, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3897[var7].field3657;
                            byte[][] var17 = var3.field3898[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method464(0, false);
                            } else if (var21 instanceof Number) {
                                arg1.method464(1, false);
                                arg1.method490(((Number) var21).longValue(), 14886);
                            } else if ((var21 instanceof class279)) {
                                arg1.method464(2, false);
                                arg1.method481((class279) var21, (byte) 120);
                            } else {
                                arg1.method464(4, false);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3897[var7].field3657;
                            int var15 = var14.getModifiers();
                            arg1.method464(0, false);
                            arg1.method444((byte) 46, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method464(-10, false);
                    } catch (InvalidClassException var35) {
                        arg1.method464(-11, false);
                    } catch (StreamCorruptedException var36) {
                        arg1.method464(-12, false);
                    } catch (OptionalDataException var37) {
                        arg1.method464(-13, false);
                    } catch (IllegalAccessException var38) {
                        arg1.method464(-14, false);
                    } catch (IllegalArgumentException var39) {
                        arg1.method464(-15, false);
                    } catch (InvocationTargetException var40) {
                        arg1.method464(-16, false);
                    } catch (SecurityException var41) {
                        arg1.method464(-17, false);
                    } catch (IOException var42) {
                        arg1.method464(-18, false);
                    } catch (NullPointerException var43) {
                        arg1.method464(-19, false);
                    } catch (Exception var44) {
                        arg1.method464(-20, false);
                    } catch (Throwable var45) {
                        arg1.method464(-21, false);
                    }
                } else {
                    arg1.method464(var3.field3912[var7], false);
                }
            }
            arg1.method449(var6, 46);
            arg1.method503((byte) 127, arg1.field1142 - var6);
            var3.method2221(true);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lkc;Lok;ZFB)[I", line = 327)
    public final int[] method1393(class36 arg0, class149 arg1, boolean arg2, float arg3, byte arg4) {
        field3216++;
        if (this.field3207 == null || this.field3232 != arg3) {
            if (!this.field3223.method801((byte) -109, arg0, arg1)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field3207 = this.field3223.method798(arg0, this.field3236, true, var6, var6, 78, arg1, (double) arg3);
            this.field3232 = arg3;
            if (this.field3237) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field3207[var12];
                        var8[var19] += class52.method442(var20 >> 16, 255);
                        var7[var19] += class52.method442(var20 >> 8, 255);
                        var10[var19] += class52.method442(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var24 += var10[var27];
                        var25 += var8[var27];
                        var23 += var7[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        var27--;
                        var26--;
                        int var30 = var25 / 9;
                        int var31 = var23 / 9;
                        int var32 = var24 / 9;
                        var21--;
                        var9[var21] = class301.method2139(class301.method2139(var30 << 16, var31 << 8), var32);
                        var24 += var10[var27] - var10[var26];
                        var25 += var8[var27] - var8[var26];
                        var23 += var7[var27] - var7[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field3207[var13];
                        var12--;
                        int var35 = this.field3207[var12];
                        var8[var33] += -class52.method442(var34 >> 16, 255) + class52.method442(var35 >> 16, 255);
                        var7[var33] += -(class52.method442(65329, var34) >> 8) + (class52.method442(var35, 65413) >> 8);
                        var10[var33] += -class52.method442(var34, 255) + class52.method442(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3207 = var9;
            }
        }
        if (arg4 != 29) {
            this.field3207 = (int[]) null;
        }
        return this.field3207;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V", line = 496)
    public final void method1394(boolean arg0, int arg1) {
        field3225++;
        if (this.field3207 == null) {
            return;
        }
        if (this.field3211 != 0 || this.field3218 != 0) {
            if (class239.field4204 == null || class239.field4204.length < this.field3207.length) {
                class239.field4204 = new int[this.field3207.length];
            }
            int var3 = this.field3207.length == 4096 ? 64 : 128;
            int var4 = this.field3207.length;
            int var5 = this.field3218 * arg1;
            int var6 = var3 - 1;
            int var7 = this.field3211 * arg1 * var3;
            int var8 = var4 - 1;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var10 = var7 + var9 & var8;
                for (int var11 = 0; var11 < var3; var11++) {
                    int var12 = var10 + (var5 + var11 & var6);
                    int var13 = var9 + var11;
                    class239.field4204[var13] = this.field3207[var12];
                }
            }
            int[] var14 = this.field3207;
            this.field3207 = class239.field4204;
            class239.field4204 = var14;
        }
        if (arg0) {
            this.field3207 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLkc;Lok;Z)Z", line = 612)
    public final boolean method1395(boolean arg0, class36 arg1, class149 arg2, boolean arg3) {
        field3215++;
        if (!this.field3223.method801((byte) -109, arg1, arg2)) {
            return false;
        }
        if (!arg0) {
            this.method1390((class36) null, 94, true, (class149) null);
        }
        GL var5 = class97.field1801;
        int var6 = class29.method264(0);
        int var7 = arg3 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field3233 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field3233 = var8[0];
                this.field3238 = class308.field5469;
                class97.method803(this.field3233);
                ByteBuffer var9 = ByteBuffer.wrap(this.field3223.method796(-1411, this.field3236, arg1, var7, arg2, var7, 0.7D));
                if (this.field3222 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class308.field5471 += var9.limit() * 4 / 3 - this.field3219;
                    this.field3219 = var9.limit() * 4 / 3;
                } else if (this.field3222 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class308.field5471 += var9.limit() * 4 / 3 - this.field3219;
                            this.field3219 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field3223.method796(-1411, this.field3236, arg1, var7, arg2, var7, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class308.field5471 += var9.limit() - this.field3219;
                    this.field3219 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field3221 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field3210 ? 10497 : 33071);
            } else {
                class97.method803(this.field3233);
            }
        }
        if ((var6 & 0x2) == 0) {
            class97.method835(this.field3230);
        }
        if ((var6 & 0x4) == 0) {
            class97.method811(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field3211 == 0 && this.field3218 == 0) {
                class97.method829();
            } else {
                float var12 = (float) (class97.field1816 * this.field3211) / (float) var7;
                float var13 = (float) (class97.field1816 * this.field3218) / (float) var7;
                class97.method821(var13, var12, 0.0F);
            }
        }
        return true;
    }
}
