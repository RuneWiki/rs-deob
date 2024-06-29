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

@OriginalClass("client!aka")
public class class40 extends class499 {

    @OriginalMember(owner = "client!aka", name = "v", descriptor = "Ljga;")
    private class135 field465;

    @OriginalMember(owner = "client!aka", name = "s", descriptor = "Ljc;")
    private class179 field462;

    @OriginalMember(owner = "client!aka", name = "x", descriptor = "Lvia;")
    private class494 field467;

    @OriginalMember(owner = "client!aka", name = "r", descriptor = "[Z")
    public static boolean[] field461 = new boolean[100];

    @OriginalMember(owner = "client!aka", name = "q", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!aka", name = "u", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!aka", name = "w", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!aka", name = "y", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!aka", name = "A", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!aka", name = "B", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!aka", name = "t", descriptor = "Lcr;")
    public static class310 field463;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            this.method202(true, false);
        }
        ++field469;
        return this.field467 != null;
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Ljc;Lwm;Ljga;)V", line = 17)
    public class40(class179 arg0, class30 arg1, class135 arg2) {
        super(arg0);
        this.field465 = arg2;
        this.field462 = arg0;
        if (arg1 != null && this.field465.method781(-1) && this.field462.field2457) {
            this.field467 = class113.method659((byte) 79, arg1.method142(-1, "gl", "transparent_water"), 34336, this.field462);
        } else {
            this.field467 = null;
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZZ)V", line = 34)
    public final void method202(boolean arg0, boolean arg1) {
        ++field471;
        super.field6405.method3759(arg1, class174.field2285, class177.field2325);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILsfa;I)V", line = 43)
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg2 != 26917) {
            this.field467 = null;
        }
        ++field466;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IZ)V", line = 53)
    public final void method201(int arg0, boolean arg1) {
        if (arg0 != 91) {
            field463 = null;
        }
        ++field460;
        OpenGL.glBindProgramARB(34336, this.field467.field6325);
        OpenGL.glEnable(34336);
        super.field6405.method3736(class13.field134, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)V", line = 66)
    public final void method205(int arg0) {
        ++field470;
        super.field6405.method3736(class171.field2262, 0, (byte) -88);
        OpenGL.glBindProgramARB(34336, arg0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(BII)V", line = 84)
    public final void method204(byte arg0, int arg1, int arg2) {
        ++field468;
        if (!this.field465.field1786) {
            int var4 = super.field6405.field9192 % 4000 * 16 / 4000;
            super.field6405.method3756(10, this.field465.field1787[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field6405.field9192 % 4000) / 4000.0F;
            super.field6405.method3756(10, this.field465.field1785);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg0 <= 11) {
            this.method200(false);
        }
    }

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "(I)V", line = 117)
    public static void method251(int arg0) {
        field463 = null;
        field461 = null;
        if (arg0 <= 50) {
            method251(121);
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Ltia;Z)V", line = 128)
    public static final void method252(class740 arg0, boolean arg1) {
        ++field464;
        class295 var2 = (class295) class403.field5363.method3591(0);
        if (var2 != null) {
            boolean var3 = false;
            for (int var4 = 0; ~var2.field3746 < ~var4; ++var4) {
                if (var2.field3742[var4] != null) {
                    if (var2.field3742[var4].field4144 == 2) {
                        var2.field3744[var4] = -5;
                    }
                    if (var2.field3742[var4].field4144 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field3741[var4] != null) {
                    if (var2.field3741[var4].field4144 == 2) {
                        var2.field3744[var4] = -6;
                    }
                    if (~var2.field3741[var4].field4144 == -1) {
                        var3 = true;
                    }
                }
            }
            if (!arg1) {
                field463 = null;
            }
            if (!var3) {
                int var5 = arg0.field3133;
                arg0.method1496(var2.field3740, (byte) 85);
                for (int var6 = 0; ~var2.field3746 < ~var6; ++var6) {
                    if (~var2.field3744[var6] != -1) {
                        arg0.method1491(-129, var2.field3744[var6]);
                    } else {
                        try {
                            int var7 = var2.field3749[var6];
                            if (var7 != 0) {
                                if (~var7 == -2) {
                                    Field var8 = (Field) var2.field3742[var6].field4142;
                                    var8.setInt((Object) null, var2.field3745[var6]);
                                    arg0.method1491(-129, 0);
                                } else if (~var7 == -3) {
                                    Field var9 = (Field) var2.field3742[var6].field4142;
                                    int var10 = var9.getModifiers();
                                    arg0.method1491(-129, 0);
                                    arg0.method1496(var10, (byte) -125);
                                }
                            } else {
                                Field var11 = (Field) var2.field3742[var6].field4142;
                                int var12 = var11.getInt((Object) null);
                                arg0.method1491(-129, 0);
                                arg0.method1496(var12, (byte) -123);
                            }
                            if (~var7 != -4) {
                                if (var7 == 4) {
                                    Method var13 = (Method) var2.field3741[var6].field4142;
                                    int var14 = var13.getModifiers();
                                    arg0.method1491(-129, 0);
                                    arg0.method1496(var14, (byte) 84);
                                }
                            } else {
                                Method var15 = (Method) var2.field3741[var6].field4142;
                                byte[][] var16 = var2.field3747[var6];
                                Object[] var17 = new Object[var16.length];
                                for (int var18 = 0; var16.length > var18; ++var18) {
                                    ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                    var17[var18] = var19.readObject();
                                }
                                Object var20 = var15.invoke((Object) null, var17);
                                if (var20 != null) {
                                    if (!(var20 instanceof Number)) {
                                        if (!(var20 instanceof String)) {
                                            arg0.method1491(-129, 4);
                                        } else {
                                            arg0.method1491(-129, 2);
                                            arg0.method1547((String) var20, -6457);
                                        }
                                    } else {
                                        arg0.method1491(-129, 1);
                                        arg0.method1517(false, ((Number) var20).longValue());
                                    }
                                } else {
                                    arg0.method1491(-129, 0);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg0.method1491(-129, -10);
                        } catch (InvalidClassException var22) {
                            arg0.method1491(-129, -11);
                        } catch (StreamCorruptedException var23) {
                            arg0.method1491(-129, -12);
                        } catch (OptionalDataException var24) {
                            arg0.method1491(-129, -13);
                        } catch (IllegalAccessException var25) {
                            arg0.method1491(-129, -14);
                        } catch (IllegalArgumentException var26) {
                            arg0.method1491(-129, -15);
                        } catch (InvocationTargetException var27) {
                            arg0.method1491(-129, -16);
                        } catch (SecurityException var28) {
                            arg0.method1491(-129, -17);
                        } catch (IOException var29) {
                            arg0.method1491(-129, -18);
                        } catch (NullPointerException var30) {
                            arg0.method1491(-129, -19);
                        } catch (Exception var31) {
                            arg0.method1491(-129, -20);
                        } catch (Throwable var32) {
                            arg0.method1491(-129, -21);
                        }
                    }
                }
                arg0.method1523(var5, 4055);
                var2.method1946(-10364);
            }
        }
    }
}
