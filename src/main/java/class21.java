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

@OriginalClass("client!cf")
public class class21 extends class87 {

    @OriginalMember(owner = "client!cf", name = "Qc", descriptor = "I")
    public int field339 = 0;

    @OriginalMember(owner = "client!cf", name = "bd", descriptor = "I")
    public int field350 = 0;

    @OriginalMember(owner = "client!cf", name = "sd", descriptor = "I")
    public int field367 = -1;

    @OriginalMember(owner = "client!cf", name = "Sc", descriptor = "I")
    public int field341 = 0;

    @OriginalMember(owner = "client!cf", name = "od", descriptor = "Z")
    public boolean field363 = false;

    @OriginalMember(owner = "client!cf", name = "qd", descriptor = "I")
    public int field365 = 0;

    @OriginalMember(owner = "client!cf", name = "Uc", descriptor = "I")
    public int field343 = 0;

    @OriginalMember(owner = "client!cf", name = "Xc", descriptor = "I")
    public int field346 = -1;

    @OriginalMember(owner = "client!cf", name = "Wc", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!cf", name = "cd", descriptor = "Lqf;")
    public static class117 field351 = class72.method514(116, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!cf", name = "Zc", descriptor = "Lqf;")
    private static class117 field348 = class72.method514(103, "Type");

    @OriginalMember(owner = "client!cf", name = "ld", descriptor = "Lqf;")
    public static class117 field360 = field348;

    @OriginalMember(owner = "client!cf", name = "nd", descriptor = "I")
    public static int field362 = 99;

    @OriginalMember(owner = "client!cf", name = "wd", descriptor = "Lqf;")
    public static class117 field371 = class72.method514(109, "ams");

    @OriginalMember(owner = "client!cf", name = "md", descriptor = "Lqf;")
    public static class117 field361 = class72.method514(109, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!cf", name = "td", descriptor = "Lqf;")
    private static class117 field368 = class72.method514(122, "Loading)3)3)3");

    @OriginalMember(owner = "client!cf", name = "pd", descriptor = "Lqf;")
    public static class117 field364 = class72.method514(99, "backright2");

    @OriginalMember(owner = "client!cf", name = "ud", descriptor = "Lqf;")
    public static class117 field369 = field368;

    @OriginalMember(owner = "client!cf", name = "Pc", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!cf", name = "Rc", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!cf", name = "Tc", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!cf", name = "Yc", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!cf", name = "ad", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!cf", name = "dd", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!cf", name = "ed", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cf", name = "jd", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!cf", name = "kd", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!cf", name = "rd", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!cf", name = "vd", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cf", name = "xd", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cf", name = "yd", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!cf", name = "zd", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cf", name = "Ad", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cf", name = "hd", descriptor = "Lqf;")
    public class117 field356;

    @OriginalMember(owner = "client!cf", name = "id", descriptor = "Lea;")
    public class30 field357;

    @OriginalMember(owner = "client!cf", name = "Vc", descriptor = "Ljb;")
    public static class64 field344;

    @OriginalMember(owner = "client!cf", name = "gd", descriptor = "Lob;")
    public class99 field355;

    @OriginalMember(owner = "client!cf", name = "fd", descriptor = "[I")
    public static int[] field354;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lla;I)V")
    public final void method159(class77 arg0, int arg1) {
        ++field372;
        arg0.field1691 = 0;
        int var3 = arg0.method570((byte) 123);
        int var4 = 70 % ((arg1 - 35) / 50);
        this.field346 = arg0.method592((byte) -103);
        int[] var5 = new int[12];
        int var6 = -1;
        this.field367 = arg0.method592((byte) -109);
        this.field365 = 0;
        for (int var7 = 0; ~var7 > -13; ++var7) {
            int var8 = arg0.method570((byte) 123);
            if (var8 == 0) {
                var5[var7] = 0;
            } else {
                int var9 = arg0.method570((byte) 123);
                var5[var7] = (var8 << 8) + var9;
                if (var7 == 0 && var5[0] == 65535) {
                    var6 = arg0.method597(39);
                    break;
                }
                if (~var5[var7] <= -513) {
                    int var13 = class27.method206(var5[var7] + -512, (byte) 90).field1559;
                    if (~var13 != -1) {
                        this.field365 = var13;
                    }
                }
            }
        }
        int[] var10 = new int[5];
        for (int var11 = 0; var11 < 5; ++var11) {
            int var12 = arg0.method570((byte) 123);
            if (~var12 > -1 || class80.field1822[var11].length <= var12) {
                var12 = 0;
            }
            var10[var11] = var12;
        }
        super.field2019 = arg0.method597(42);
        if (super.field2019 == 65535) {
            super.field2019 = -1;
        }
        super.field1975 = arg0.method597(32);
        if (~super.field1975 == -65536) {
            super.field1975 = -1;
        }
        super.field1946 = super.field1975;
        super.field1982 = arg0.method597(96);
        if (~super.field1982 == -65536) {
            super.field1982 = -1;
        }
        super.field1991 = arg0.method597(42);
        if (~super.field1991 == -65536) {
            super.field1991 = -1;
        }
        super.field1956 = arg0.method597(76);
        if (super.field1956 == 65535) {
            super.field1956 = -1;
        }
        super.field1954 = arg0.method597(87);
        if (~super.field1954 == -65536) {
            super.field1954 = -1;
        }
        super.field1995 = arg0.method597(31);
        if (super.field1995 == 65535) {
            super.field1995 = -1;
        }
        this.field356 = class116.method900(arg0.method586(-13628), 114).method945(-122);
        this.field339 = arg0.method570((byte) 123);
        this.field350 = arg0.method597(33);
        if (this.field355 == null) {
            this.field355 = new class99();
        }
        this.field355.method773(~var3 == -2, var10, var5, var6, (byte) -114);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method160(int arg0, int arg1) {
        class115.field2718 = arg1;
        if (arg0 == 23672) {
            ++field370;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILra;Z)V")
    public static final void method161(int arg0, class119 arg1, boolean arg2) {
        ++field359;
        if (!arg2) {
            field351 = null;
        }
        while (true) {
            class116 var3 = (class116) class64.field1274.method27(18823);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field2755; ++var5) {
                if (var3.field2741[var5] != null) {
                    if (~var3.field2741[var5].field108 == -3) {
                        var3.field2750[var5] = -5;
                    }
                    if (var3.field2741[var5].field108 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2744[var5] != null) {
                    if (var3.field2744[var5].field108 == 2) {
                        var3.field2750[var5] = -6;
                    }
                    if (var3.field2744[var5].field108 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method961(arg0, -1198);
            arg1.method571(0, -11124);
            int var6 = arg1.field1691;
            arg1.method600(var3.field2742, -30515);
            for (int var7 = 0; var7 < var3.field2755; ++var7) {
                if (var3.field2750[var7] != 0) {
                    arg1.method571(var3.field2750[var7], -11124);
                } else {
                    try {
                        int var8 = var3.field2754[var7];
                        if (var8 != 0) {
                            if (~var8 != -2) {
                                if (~var8 == -3) {
                                    Field var9 = (Field) var3.field2741[var7].field106;
                                    int var10 = var9.getModifiers();
                                    arg1.method571(0, -11124);
                                    arg1.method600(var10, -30515);
                                }
                            } else {
                                Field var11 = (Field) var3.field2741[var7].field106;
                                var11.setInt((Object) null, var3.field2739[var7]);
                                arg1.method571(0, -11124);
                            }
                        } else {
                            Field var12 = (Field) var3.field2741[var7].field106;
                            int var13 = var12.getInt((Object) null);
                            arg1.method571(0, -11124);
                            arg1.method600(var13, -30515);
                        }
                        if (~var8 != -4) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field2744[var7].field106;
                                int var15 = var14.getModifiers();
                                arg1.method571(0, -11124);
                                arg1.method600(var15, -30515);
                            }
                        } else {
                            Method var16 = (Method) var3.field2744[var7].field106;
                            byte[][] var17 = var3.field2743[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; ~var17.length < ~var19; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 != null) {
                                if (var21 instanceof Number) {
                                    arg1.method571(1, -11124);
                                    arg1.method606(((Number) var21).longValue(), (byte) 118);
                                } else if (var21 instanceof class117) {
                                    arg1.method571(2, -11124);
                                    arg1.method563((byte) -73, (class117) var21);
                                } else {
                                    arg1.method571(4, -11124);
                                }
                            } else {
                                arg1.method571(0, -11124);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method571(-10, -11124);
                    } catch (InvalidClassException var23) {
                        arg1.method571(-11, -11124);
                    } catch (StreamCorruptedException var24) {
                        arg1.method571(-12, -11124);
                    } catch (OptionalDataException var25) {
                        arg1.method571(-13, -11124);
                    } catch (IllegalAccessException var26) {
                        arg1.method571(-14, -11124);
                    } catch (IllegalArgumentException var27) {
                        arg1.method571(-15, -11124);
                    } catch (InvocationTargetException var28) {
                        arg1.method571(-16, -11124);
                    } catch (SecurityException var29) {
                        arg1.method571(-17, -11124);
                    } catch (IOException var30) {
                        arg1.method571(-18, -11124);
                    } catch (NullPointerException var31) {
                        arg1.method571(-19, -11124);
                    } catch (Exception var32) {
                        arg1.method571(-20, -11124);
                    } catch (Throwable var33) {
                        arg1.method571(-21, -11124);
                    }
                }
            }
            arg1.method593(var6, -115);
            arg1.method569(-1, -var6 + arg1.field1691);
            var3.method495(-76);
        }
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)Lea;")
    public final class30 method7(int arg0) {
        ++field353;
        if (this.field355 == null) {
            return null;
        } else {
            class96 var2 = super.field2017 != -1 && ~super.field1994 == -1 ? class130.method1013(super.field2017, -91) : null;
            class96 var3 = super.field1949 == -1 || this.field363 || ~super.field2019 == ~super.field1949 && var2 != null ? null : class130.method1013(super.field1949, arg0 + 6821);
            class30 var4 = this.field355.method777(super.field1952, var2, super.field1948, var3, (byte) 1);
            if (var4 == null) {
                return null;
            } else {
                var4.method232();
                if (arg0 != -6941) {
                    return null;
                } else {
                    super.field1962 = var4.field708;
                    if (!this.field363 && ~super.field2014 != 0 && ~super.field1961 != 0) {
                        class30 var5 = class126.method994((byte) 51, super.field2014).method423(super.field1961, false);
                        if (var5 != null) {
                            var5.method235(0, -super.field1981, 0);
                            class30[] var6 = new class30[] { var4, var5 };
                            var4 = new class30(var6, 2);
                        }
                    }
                    if (!this.field363 && this.field357 != null) {
                        if (~this.field343 >= ~class43.field856) {
                            this.field357 = null;
                        }
                        if (this.field341 <= class43.field856 && class43.field856 < this.field343) {
                            class30 var7 = this.field357;
                            var7.method235(this.field352 - super.field1998, -this.field358 + this.field347, -super.field1960 + this.field342);
                            class30[] var8 = new class30[] { var4, var7 };
                            if (~super.field1969 == -513) {
                                var7.method237();
                                var7.method237();
                                var7.method237();
                            } else if (~super.field1969 == -1025) {
                                var7.method237();
                                var7.method237();
                            } else if (~super.field1969 == -1537) {
                                var7.method237();
                            }
                            var4 = new class30(var8, 2);
                            if (super.field1969 == 512) {
                                var7.method237();
                            } else if (~super.field1969 == -1025) {
                                var7.method237();
                                var7.method237();
                            } else if (super.field1969 == 1536) {
                                var7.method237();
                                var7.method237();
                                var7.method237();
                            }
                            var7.method235(-this.field352 + super.field1998, this.field358 - this.field347, -this.field342 + super.field1960);
                        }
                    }
                    var4.field600 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)Z")
    public final boolean method162(boolean arg0) {
        ++field375;
        if (this.field355 == null) {
            return false;
        } else {
            return !arg0 ? true : true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
    public static void method163(byte arg0) {
        if (arg0 != 65) {
            method160(1, 119);
        }
        field351 = null;
        field368 = null;
        field348 = null;
        field361 = null;
        field369 = null;
        field354 = null;
        field364 = null;
        field371 = null;
        field344 = null;
        field360 = null;
    }
}
