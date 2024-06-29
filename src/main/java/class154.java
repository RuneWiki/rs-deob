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

@OriginalClass("client!bj")
public class class154 extends class242 {

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    private int field2666 = -1;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field2664 = 0;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "Lp;")
    public static class280 field2668 = class18.method140((byte) -117, "clignotant3:");

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "Lsb;")
    public static class221 field2674 = new class221(64);

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "Lp;")
    public static class280 field2676 = class18.method140((byte) -117, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!bj", name = "jb", descriptor = "[I")
    public static int[] field2677 = new int[1000];

    @OriginalMember(owner = "client!bj", name = "kb", descriptor = "I")
    public static int field2678 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!bj", name = "lb", descriptor = "Lp;")
    public static class280 field2679 = class18.method140((byte) -128, "Kampfstufe: ");

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "Ltg;")
    public static class180 field2659;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)Z")
    public final boolean method1088(int arg0) {
        ++field2661;
        if (this.field2669 != null) {
            return true;
        } else if (arg0 > -97) {
            return false;
        } else if (this.field2666 >= 0) {
            class223 var2 = class19.field363 >= 0 ? class51.method374(24479, class19.field363, class182.field3205, this.field2666) : class68.method463((byte) 46, this.field2666, class182.field3205);
            var2.method1499();
            this.field2669 = var2.field3858;
            this.field2662 = var2.field1785;
            this.field2675 = var2.field1791;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(III)V")
    public static final void method1089(int arg0, int arg1, int arg2) {
        if (arg0 != -10) {
            method1093(-112);
        }
        class183.field3225[arg2] = arg1;
        ++field2663;
        class116 var3 = (class116) class176.field3063.method150((long) arg2, arg0 + -36);
        if (var3 == null) {
            class116 var4 = new class116(4611686018427387905L);
            class176.field3063.method148(-1, var4, (long) arg2);
        } else if (var3.field2095 != 4611686018427387905L) {
            var3.field2095 = 500L + class77.method569((byte) -126) | 4611686018427387904L;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lgd;II)V")
    public static final void method1090(class74 arg0, int arg1, int arg2) {
        ++field2671;
        int var3 = -124 % ((arg1 - -16) / 49);
        while (true) {
            class252 var4 = (class252) class21.field383.method651(12916);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field4412; ++var6) {
                if (var4.field4404[var6] != null) {
                    if (var4.field4404[var6].field3025 == 2) {
                        var4.field4418[var6] = -5;
                    }
                    if (var4.field4404[var6].field3025 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field4399[var6] != null) {
                    if (var4.field4399[var6].field3025 == 2) {
                        var4.field4418[var6] = -6;
                    }
                    if (var4.field4399[var6].field3025 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method551(arg2, true);
            arg0.method227(-20435, 0);
            int var7 = arg0.field481;
            arg0.method231(11510, var4.field4403);
            for (int var8 = 0; var8 < var4.field4412; ++var8) {
                if (~var4.field4418[var8] != -1) {
                    arg0.method227(-20435, var4.field4418[var8]);
                } else {
                    try {
                        int var9 = var4.field4414[var8];
                        if (~var9 != -1) {
                            if (~var9 == -2) {
                                Field var10 = (Field) var4.field4404[var8].field3028;
                                var10.setInt((Object) null, var4.field4411[var8]);
                                arg0.method227(-20435, 0);
                            } else if (var9 == 2) {
                                Field var11 = (Field) var4.field4404[var8].field3028;
                                int var12 = var11.getModifiers();
                                arg0.method227(-20435, 0);
                                arg0.method231(11510, var12);
                            }
                        } else {
                            Field var13 = (Field) var4.field4404[var8].field3028;
                            int var14 = var13.getInt((Object) null);
                            arg0.method227(-20435, 0);
                            arg0.method231(11510, var14);
                        }
                        if (var9 != 3) {
                            if (var9 == 4) {
                                Method var15 = (Method) var4.field4399[var8].field3028;
                                int var16 = var15.getModifiers();
                                arg0.method227(-20435, 0);
                                arg0.method231(11510, var16);
                            }
                        } else {
                            byte[][] var17 = var4.field4419[var8];
                            Method var18 = (Method) var4.field4399[var8].field3028;
                            Object[] var19 = new Object[var17.length];
                            for (int var20 = 0; ~var17.length < ~var20; ++var20) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var17[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var18.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg0.method227(-20435, 0);
                            } else if (var22 instanceof Number) {
                                arg0.method227(-20435, 1);
                                arg0.method219(((Number) var22).longValue(), 101);
                            } else if (var22 instanceof class280) {
                                arg0.method227(-20435, 2);
                                arg0.method195((class280) var22, -66);
                            } else {
                                arg0.method227(-20435, 4);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method227(-20435, -10);
                    } catch (InvalidClassException var24) {
                        arg0.method227(-20435, -11);
                    } catch (StreamCorruptedException var25) {
                        arg0.method227(-20435, -12);
                    } catch (OptionalDataException var26) {
                        arg0.method227(-20435, -13);
                    } catch (IllegalAccessException var27) {
                        arg0.method227(-20435, -14);
                    } catch (IllegalArgumentException var28) {
                        arg0.method227(-20435, -15);
                    } catch (InvocationTargetException var29) {
                        arg0.method227(-20435, -16);
                    } catch (SecurityException var30) {
                        arg0.method227(-20435, -17);
                    } catch (IOException var31) {
                        arg0.method227(-20435, -18);
                    } catch (NullPointerException var32) {
                        arg0.method227(-20435, -19);
                    } catch (Exception var33) {
                        arg0.method227(-20435, -20);
                    } catch (Throwable var34) {
                        arg0.method227(-20435, -21);
                    }
                }
            }
            arg0.method183(var7, (byte) -21);
            arg0.method184((byte) 112, -var7 + arg0.field481);
            var4.method1146(26159);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public final void method1091(int arg0) {
        super.method1091(arg0);
        this.field2669 = null;
        ++field2670;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)[[I")
    public int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            field2679 = null;
        }
        ++field2667;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357 && this.method1088(-113)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class25.field486 == this.field2675 ? arg1 : this.field2675 * arg1 / class25.field486) * this.field2662;
            int[] var7 = var3[2];
            if (class264.field4654 != this.field2662) {
                for (int var8 = 0; var8 < class264.field4654; ++var8) {
                    int var9 = this.field2662 * var8 / class264.field4654;
                    int var10 = this.field2669[var6 + var9];
                    var7[var8] = class214.method1432(var10 << 4, 4080);
                    var5[var8] = class214.method1432(var10 >> 4, 4080);
                    var4[var8] = class214.method1432(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class264.field4654; ++var11) {
                    int var12 = this.field2669[var6++];
                    var7[var11] = class214.method1432(255, var12) << 4;
                    var5[var11] = class214.method1432(4080, var12 >> 4);
                    var4[var11] = class214.method1432(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        int var1 = 75 / ((arg0 - -67) / 57);
        field2674 = null;
        field2676 = null;
        field2677 = null;
        field2668 = null;
        field2679 = null;
        field2659 = null;
    }

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        if (arg0 != -31371) {
            method1090((class74) null, -27, 84);
        }
        ++field2665;
        class188.field3297.method1485((byte) -115);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 == -1) {
            this.field2666 = arg2.method193((byte) 77);
        }
        if (arg0 < -119) {
            ++field2660;
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)I")
    public final int method1094(int arg0) {
        if (arg0 != 5727) {
            field2673 = 127;
        }
        ++field2672;
        return this.field2666;
    }
}
