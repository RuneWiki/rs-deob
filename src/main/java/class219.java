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

@OriginalClass("client!vi")
public class class219 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
    public boolean field3704 = false;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    private int field3709 = 0;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field3713 = -1;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field3716 = 0;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private int field3721 = 0;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field3718 = 128;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    private int field3714 = 128;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lia;")
    private static class257 field3698 = class28.method234(95, "K");

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lia;")
    public static class257 field3705 = class28.method234(119, ":tradereq:");

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lia;")
    public static class257 field3712 = field3698;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "S")
    public static short field3711 = 256;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lia;")
    public static class257 field3701 = field3698;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lia;")
    public static class257 field3707 = class28.method234(-32, "<col=ff7000>");

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[S")
    private short[] field3702;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[S")
    private short[] field3706;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[S")
    private short[] field3717;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[S")
    private short[] field3719;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lk;II)V")
    private final void method1444(class152 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            return;
        }
        field3699++;
        if (arg2 == 1) {
            this.field3710 = arg0.method1063(-17162);
        } else if (arg2 == 2) {
            this.field3713 = arg0.method1063(-17162);
        } else if (arg2 == 4) {
            this.field3718 = arg0.method1063(-17162);
        } else if (arg2 == 5) {
            this.field3714 = arg0.method1063(-17162);
        } else if (arg2 == 6) {
            this.field3716 = arg0.method1063(arg1 ^ 0xFFFFBCF2);
        } else if (arg2 == 7) {
            this.field3721 = arg0.method1051((byte) 98);
        } else if (arg2 == 8) {
            this.field3709 = arg0.method1051((byte) -54);
        } else if (arg2 == 9) {
            this.field3704 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1051((byte) 99);
            this.field3706 = new short[var6];
            this.field3702 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3702[var7] = (short) arg0.method1063(-17162);
                this.field3706[var7] = (short) arg0.method1063(-17162);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method1051((byte) 117);
            this.field3719 = new short[var4];
            this.field3717 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3719[var5] = (short) arg0.method1063(arg1 - 17166);
                this.field3717[var5] = (short) arg0.method1063(arg1 - 17166);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLk;)V")
    public final void method1445(byte arg0, class152 arg1) {
        field3708++;
        while (true) {
            int var3 = arg1.method1051((byte) 112);
            if (var3 == 0) {
                if (arg0 <= 111) {
                    this.field3710 = -24;
                    return;
                } else {
                    return;
                }
            }
            this.method1444(arg1, 4, var3);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3707 = null;
        if (arg0 != -1) {
            field3701 = null;
        }
        field3705 = null;
        field3698 = null;
        field3712 = null;
        field3701 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lei;")
    public final class168 method1447(int arg0, int arg1) {
        field3703++;
        class168 var3 = (class168) class81.field1589.method836(-94, (long) this.field3720);
        if (var3 == null) {
            class67 var4 = class67.method495(class19.field409, this.field3710, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3702 != null) {
                for (int var5 = 0; var5 < this.field3702.length; var5++) {
                    var4.method489(this.field3702[var5], this.field3706[var5]);
                }
            }
            if (this.field3719 != null) {
                for (int var6 = 0; var6 < this.field3719.length; var6++) {
                    var4.method487(this.field3719[var6], this.field3717[var6]);
                }
            }
            var3 = var4.method506(this.field3721 + 64, this.field3709 + 850, -30, -50, -30);
            class81.field1589.method832(var3, (long) this.field3720, 0);
        }
        class168 var7;
        if (this.field3713 == -1 || arg1 == -1) {
            var7 = var3.method1140(true, true);
        } else {
            var7 = class186.method1263(0, this.field3713).method262(false, arg1, var3);
        }
        if (this.field3718 != 128 || this.field3714 != 128) {
            var7.method1146(this.field3718, this.field3714, this.field3718);
        }
        if (this.field3716 != 0) {
            if (this.field3716 == 90) {
                var7.method1152();
            }
            if (this.field3716 == 180) {
                var7.method1145();
            }
            if (this.field3716 == 270) {
                var7.method1148();
            }
        }
        if (arg0 <= 70) {
            this.field3721 = 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
    public static final void method1448(int arg0, byte arg1) {
        field3715++;
        if (arg1 <= 105) {
            return;
        }
        for (class220 var2 = (class220) class137.field2448.method427((byte) 58); var2 != null; var2 = (class220) class137.field2448.method428(false)) {
            if ((var2.field573 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method254(1);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILwi;I)V")
    public static final void method1449(int arg0, class131 arg1, int arg2) {
        if (arg2 != 25508) {
            return;
        }
        field3722++;
        while (true) {
            class36 var3 = (class36) class93.field1765.method288(26111);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field725; var5++) {
                if (var3.field714[var5] != null) {
                    if (var3.field714[var5].field3000 == 2) {
                        var3.field728[var5] = -5;
                    }
                    if (var3.field714[var5].field3000 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field722[var5] != null) {
                    if (var3.field722[var5].field3000 == 2) {
                        var3.field728[var5] = -6;
                    }
                    if (var3.field722[var5].field3000 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method908(false, arg0);
            arg1.method1023(13195, 0);
            int var6 = arg1.field2677;
            arg1.method1066(-1687589720, var3.field727);
            for (int var7 = 0; var7 < var3.field725; var7++) {
                if (var3.field728[var7] == 0) {
                    try {
                        int var8 = var3.field717[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field714[var7].field3001;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1023(13195, 0);
                            arg1.method1066(-1687589720, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field714[var7].field3001;
                            var13.setInt((Object) null, var3.field716[var7]);
                            arg1.method1023(13195, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field714[var7].field3001;
                            int var12 = var11.getModifiers();
                            arg1.method1023(13195, 0);
                            arg1.method1066(-1687589720, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field722[var7].field3001;
                            byte[][] var17 = var3.field715[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1023(13195, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method1023(13195, 1);
                                arg1.method1044(false, ((Number) var21).longValue());
                            } else if (var21 instanceof class257) {
                                arg1.method1023(13195, 2);
                                arg1.method1068((class257) var21, 0);
                            } else {
                                arg1.method1023(13195, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field722[var7].field3001;
                            int var15 = var14.getModifiers();
                            arg1.method1023(13195, 0);
                            arg1.method1066(-1687589720, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1023(arg2 - 12313, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1023(13195, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1023(13195, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1023(13195, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1023(13195, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1023(13195, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1023(13195, -16);
                    } catch (SecurityException var29) {
                        arg1.method1023(arg2 - 12313, -17);
                    } catch (IOException var30) {
                        arg1.method1023(arg2 ^ 0x502F, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1023(13195, -19);
                    } catch (Exception var32) {
                        arg1.method1023(13195, -20);
                    } catch (Throwable var33) {
                        arg1.method1023(arg2 - 12313, -21);
                    }
                } else {
                    arg1.method1023(arg2 - 12313, var3.field728[var7]);
                }
            }
            arg1.method1040(1584, var6);
            arg1.method1074(95, arg1.field2677 - var6);
            var3.method254(1);
        }
    }
}
