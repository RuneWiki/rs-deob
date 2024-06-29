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

@OriginalClass("client!me")
public class class717 extends class551 {

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Lwo;")
    public static class314 field10115 = new class314();

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Z")
    public static boolean field10117 = false;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "B")
    public byte field10111;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public int field10109;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Ltn;")
    public class179 field10114;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I", line = 5)
    public final int method3140(byte arg0) {
        if (arg0 != -92) {
            return -82;
        } else {
            ++field10112;
            return this.field10114 == null ? 0 : this.field10114.field2354 * 100 / (this.field10114.field2325.length + -this.field10111);
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V", line = 21)
    public static void method3982(int arg0) {
        field10115 = null;
        if (arg0 != 1) {
            method3983((class757) null, true);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)[B", line = 33)
    public final byte[] method3138(int arg0) {
        ++field10113;
        if (!super.field7751 && ~this.field10114.field2354 <= ~(this.field10114.field2325.length + -this.field10111)) {
            if (arg0 != 1) {
                this.field10109 = 115;
            }
            return this.field10114.field2325;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ldfa;Z)V", line = 57)
    public static final void method3983(class757 arg0, boolean arg1) {
        ++field10110;
        class325 var2 = (class325) class508.field7185.method3111(69);
        if (var2 != null) {
            boolean var3 = arg1;
            for (int var4 = 0; var2.field4148 > var4; ++var4) {
                if (var2.field4142[var4] != null) {
                    if (var2.field4142[var4].field6124 == 2) {
                        var2.field4144[var4] = -5;
                    }
                    if (~var2.field4142[var4].field6124 == -1) {
                        var3 = true;
                    }
                }
                if (var2.field4145[var4] != null) {
                    if (var2.field4145[var4].field6124 == 2) {
                        var2.field4144[var4] = -6;
                    }
                    if (var2.field4145[var4].field6124 == 0) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                int var5 = arg0.field2354;
                arg0.method1112(var2.field4140, -117);
                for (int var6 = 0; ~var6 > ~var2.field4148; ++var6) {
                    if (var2.field4144[var6] != 0) {
                        arg0.method1141(var2.field4144[var6], 87);
                    } else {
                        try {
                            int var7 = var2.field4149[var6];
                            if (~var7 != -1) {
                                if (var7 == 1) {
                                    Field var8 = (Field) var2.field4142[var6].field6123;
                                    var8.setInt((Object) null, var2.field4141[var6]);
                                    arg0.method1141(0, -121);
                                } else if (~var7 == -3) {
                                    Field var9 = (Field) var2.field4142[var6].field6123;
                                    int var10 = var9.getModifiers();
                                    arg0.method1141(0, -74);
                                    arg0.method1112(var10, -124);
                                }
                            } else {
                                Field var11 = (Field) var2.field4142[var6].field6123;
                                int var12 = var11.getInt((Object) null);
                                arg0.method1141(0, -94);
                                arg0.method1112(var12, -125);
                            }
                            if (var7 != 3) {
                                if (var7 == 4) {
                                    Method var19 = (Method) var2.field4145[var6].field6123;
                                    int var20 = var19.getModifiers();
                                    arg0.method1141(0, 38);
                                    arg0.method1112(var20, -116);
                                }
                            } else {
                                Method var13 = (Method) var2.field4145[var6].field6123;
                                byte[][] var14 = var2.field4147[var6];
                                Object[] var15 = new Object[var14.length];
                                for (int var16 = 0; var14.length > var16; ++var16) {
                                    ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                    var15[var16] = var17.readObject();
                                }
                                Object var18 = var13.invoke((Object) null, var15);
                                if (var18 != null) {
                                    if (var18 instanceof Number) {
                                        arg0.method1141(1, -72);
                                        arg0.method1104(81, ((Number) var18).longValue());
                                    } else if (!(var18 instanceof String)) {
                                        arg0.method1141(4, -89);
                                    } else {
                                        arg0.method1141(2, -62);
                                        arg0.method1110((String) var18, -30452);
                                    }
                                } else {
                                    arg0.method1141(0, -68);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg0.method1141(-10, -103);
                        } catch (InvalidClassException var22) {
                            arg0.method1141(-11, 27);
                        } catch (StreamCorruptedException var23) {
                            arg0.method1141(-12, -51);
                        } catch (OptionalDataException var24) {
                            arg0.method1141(-13, -56);
                        } catch (IllegalAccessException var25) {
                            arg0.method1141(-14, 53);
                        } catch (IllegalArgumentException var26) {
                            arg0.method1141(-15, -80);
                        } catch (InvocationTargetException var27) {
                            arg0.method1141(-16, 121);
                        } catch (SecurityException var28) {
                            arg0.method1141(-17, -55);
                        } catch (IOException var29) {
                            arg0.method1141(-18, 49);
                        } catch (NullPointerException var30) {
                            arg0.method1141(-19, -84);
                        } catch (Exception var31) {
                            arg0.method1141(-20, -76);
                        } catch (Throwable var32) {
                            arg0.method1141(-21, 50);
                        }
                    }
                }
                arg0.method1150((byte) -91, var5);
                var2.method3426((byte) -20);
            }
        }
    }
}
