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

@OriginalClass("client!dc")
public class class34 extends class186 {

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lca;")
    private class22 field768;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Ljd;")
    public static class92 field771 = class202.method1325((byte) 90, "Neuer Benutzer");

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Ljd;")
    public static class92 field770 = null;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Ljd;")
    public static class92 field781 = class202.method1325((byte) 90, ":chalreq:");

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field775 = 3;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "Ljd;")
    private static class92 field787 = class202.method1325((byte) 90, "New User");

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[Ljd;")
    public static class92[] field776 = new class92[200];

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Ljd;")
    public static class92 field767 = field787;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Ljd;")
    public static final class92 method219(byte arg0, int arg1) {
        if (arg0 != -40) {
            return null;
        }
        field786++;
        if (arg1 < 100000) {
            return class77.method529(-3, new class92[] { class110.field2243, class142.method938(arg1, false), class180.field3442 });
        } else if (arg1 < 10000000) {
            return class77.method529(-3, new class92[] { class198.field3866, class142.method938(arg1 / 1000, false), class151.field2986, class180.field3442 });
        } else {
            return class77.method529(-3, new class92[] { class157.field3130, class142.method938(arg1 / 1000000, false), class195.field3811, class180.field3442 });
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)Lv;")
    public static final class197 method220(int arg0) {
        if (arg0 != -1) {
            method222(33);
        }
        if (class66.field1347 == null) {
            class66.field1347 = new class197();
        }
        field766++;
        return class66.field1347;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Ldg;")
    public final class38 method221(int arg0) {
        if (this.field768 != null) {
            int var2 = class158.field3150 - this.field784;
            if (var2 > 100 && this.field768.field529 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field768.field515[this.field778]) {
                            break label51;
                        }
                        var2 -= this.field768.field515[this.field778];
                        this.field778++;
                    } while (this.field768.field530.length > this.field778);
                    this.field778 -= this.field768.field529;
                } while (this.field778 >= 0 && this.field768.field530.length > this.field778);
                this.field768 = null;
            }
            this.field784 = class158.field3150 - var2;
        }
        field772++;
        class214 var3 = class126.method846(0, this.field779);
        if (var3.field4134 != null) {
            var3 = var3.method1391((byte) 103);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field780 == 1 || this.field780 == 3) {
            var4 = var3.field4197;
            var5 = var3.field4191;
        } else {
            var4 = var3.field4191;
            var5 = var3.field4197;
        }
        int var6 = this.field783 + (var5 >> 1);
        int var7 = (var4 >> 1) + this.field769;
        int var8 = (var4 + 1 >> 1) + this.field769;
        int[][] var9 = class125.field2538[this.field773];
        int var10 = (this.field783 << 7) + (var5 << 6);
        int var11 = (var5 + 1 >> 1) + this.field783;
        int var12 = (this.field769 << 7) + (var4 << 6);
        if (arg0 > -51) {
            return null;
        } else {
            int var13 = var9[var6][var8] + var9[var11][var7] + var9[var6][var7] + var9[var11][var8] >> 2;
            return var3.method1395(this.field774, var13, this.field780, var10, this.field768, var12, this.field778, var9, true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
    public static void method222(int arg0) {
        field767 = null;
        if (arg0 != -302882431) {
            return;
        }
        field770 = null;
        field787 = null;
        field771 = null;
        field781 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Z")
    public static final boolean method223(int arg0, byte arg1) {
        if (arg1 != 120) {
            field775 = 103;
        }
        field765++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLgh;)V")
    public static final void method224(int arg0, byte arg1, class68 arg2) {
        field785++;
        if (arg1 > -13) {
            field764 = -11;
        }
        while (true) {
            class152 var3 = (class152) class16.field446.method103(57);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3021; var5++) {
                if (var3.field3013[var5] != null) {
                    if (var3.field3013[var5].field3476 == 2) {
                        var3.field3009[var5] = -5;
                    }
                    if (var3.field3013[var5].field3476 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3012[var5] != null) {
                    if (var3.field3012[var5].field3476 == 2) {
                        var3.field3009[var5] = -6;
                    }
                    if (var3.field3012[var5].field3476 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method405(arg0, 7);
            arg2.method428(0, 100);
            int var6 = arg2.field1472;
            arg2.method446(var3.field3018, -26751);
            for (int var7 = 0; var7 < var3.field3021; var7++) {
                if (var3.field3009[var7] == 0) {
                    try {
                        int var8 = var3.field3020[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3013[var7].field3474;
                            int var10 = var9.getInt(null);
                            arg2.method428(0, 114);
                            arg2.method446(var10, -26751);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3013[var7].field3474;
                            var11.setInt(null, var3.field3025[var7]);
                            arg2.method428(0, 124);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3013[var7].field3474;
                            int var13 = var12.getModifiers();
                            arg2.method428(0, 121);
                            arg2.method446(var13, -26751);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3012[var7].field3474;
                            byte[][] var17 = var3.field3008[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method428(0, 109);
                            } else if (var21 instanceof Number) {
                                arg2.method428(1, 98);
                                arg2.method459(false, ((Number) var21).longValue());
                            } else if (var21 instanceof class92) {
                                arg2.method428(2, 118);
                                arg2.method466((class92) var21, 81);
                            } else {
                                arg2.method428(4, 89);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3012[var7].field3474;
                            int var15 = var14.getModifiers();
                            arg2.method428(0, 111);
                            arg2.method446(var15, -26751);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method428(-10, 93);
                    } catch (InvalidClassException var23) {
                        arg2.method428(-11, 123);
                    } catch (StreamCorruptedException var24) {
                        arg2.method428(-12, 89);
                    } catch (OptionalDataException var25) {
                        arg2.method428(-13, 124);
                    } catch (IllegalAccessException var26) {
                        arg2.method428(-14, 113);
                    } catch (IllegalArgumentException var27) {
                        arg2.method428(-15, 125);
                    } catch (InvocationTargetException var28) {
                        arg2.method428(-16, 127);
                    } catch (SecurityException var29) {
                        arg2.method428(-17, 99);
                    } catch (IOException var30) {
                        arg2.method428(-18, 100);
                    } catch (NullPointerException var31) {
                        arg2.method428(-19, 94);
                    } catch (Exception var32) {
                        arg2.method428(-20, 118);
                    } catch (Throwable var33) {
                        arg2.method428(-21, 123);
                    }
                } else {
                    arg2.method428(var3.field3009[var7], 107);
                }
            }
            arg2.method447(var6, -106);
            arg2.method421((byte) 101, arg2.field1472 - var6);
            var3.method1370(-24);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIZLtg;)V")
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class186 arg8) {
        this.field780 = arg2;
        this.field769 = arg5;
        this.field774 = arg1;
        this.field773 = arg3;
        this.field783 = arg4;
        this.field779 = arg0;
        if (arg6 != -1) {
            this.field768 = class153.method978(arg6, -109);
            this.field784 = class158.field3150 - 1;
            this.field778 = 0;
            if (this.field768.field522 == 0 && arg8 != null && arg8 instanceof class34) {
                class34 var10 = (class34) arg8;
                if (this.field768 == var10.field768) {
                    this.field778 = var10.field778;
                    this.field784 = var10.field784;
                    return;
                }
            }
            if (arg7 && this.field768.field529 != -1) {
                this.field778 = (int) ((double) this.field768.field530.length * Math.random());
                this.field784 -= (int) (Math.random() * (double) this.field768.field515[this.field778]);
                return;
            }
        }
    }
}
