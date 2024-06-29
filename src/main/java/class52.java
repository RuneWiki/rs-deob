import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class52 extends class179 {

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    private int field952 = 2;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field941 = 5;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "[B")
    private byte[] field951 = new byte[512];

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    private int field945 = 5;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    private int field958 = 0;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "[S")
    private short[] field944 = new short[512];

    @OriginalMember(owner = "client!wf", name = "nb", descriptor = "I")
    private int field963 = 1;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    private int field947 = 2048;

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "Lke;")
    public static class256 field960 = class316.method2202("leuchten2:", 27626);

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "[I")
    public static int[] field954 = new int[4096];

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "[I")
    public static int[] field956 = new int[5];

    @OriginalMember(owner = "client!wf", name = "mb", descriptor = "I")
    public static int field962 = -1;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!wf", name = "lb", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "Lhd;")
    public static class319 field953;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V", line = 11)
    public static final void method412(int arg0, byte arg1, int arg2) {
        field955++;
        class38 var3 = class58.method458((byte) -40, arg2);
        int var4 = var3.field687;
        int var5 = var3.field683;
        int var6 = var3.field688;
        int var7 = class59.field1063[var6 - var5];
        if (arg1 > -20) {
            method416(103, -6, 4, -115, (byte) 38, 28);
        }
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class17.method109(-13185, arg0 << var5 & var8 | ~var8 & class97.field1741[var4], var4);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lug;II)V", line = 38)
    public static final void method413(class238 arg0, int arg1, int arg2) {
        if (arg1 != -10) {
            field962 = 85;
        }
        field942++;
        while (true) {
            class289 var3 = (class289) class98.field1744.method1270((byte) -121);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4989; var5++) {
                if (var3.field5000[var5] != null) {
                    if (var3.field5000[var5].field1500 == 2) {
                        var3.field4994[var5] = -5;
                    }
                    if (var3.field5000[var5].field1500 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5003[var5] != null) {
                    if (var3.field5003[var5].field1500 == 2) {
                        var3.field4994[var5] = -6;
                    }
                    if (var3.field5003[var5].field1500 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1599(arg2, (byte) 78);
            arg0.method308(0, -2);
            int var6 = arg0.field738;
            arg0.method365((byte) -32, var3.field5005);
            for (int var7 = 0; var7 < var3.field4989; var7++) {
                if (var3.field4994[var7] == 0) {
                    try {
                        int var8 = var3.field5002[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field5000[var7].field1499;
                            int var10 = var9.getInt((Object) null);
                            arg0.method308(0, -2);
                            arg0.method365((byte) -32, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field5000[var7].field1499;
                            var11.setInt((Object) null, var3.field4998[var7]);
                            arg0.method308(0, -2);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field5000[var7].field1499;
                            int var13 = var12.getModifiers();
                            arg0.method308(0, arg1 + 8);
                            arg0.method365((byte) -32, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field5003[var7].field1499;
                            byte[][] var15 = var3.field4993[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method308(0, -2);
                            } else if ((var19 instanceof Number)) {
                                arg0.method308(1, -2);
                                arg0.method330(arg1 ^ 0xFFFFFF09, ((Number) var19).longValue());
                            } else if (var19 instanceof class256) {
                                arg0.method308(2, -2);
                                arg0.method361((class256) var19, 0);
                            } else {
                                arg0.method308(4, arg1 ^ 0x8);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field5003[var7].field1499;
                            int var21 = var20.getModifiers();
                            arg0.method308(0, -2);
                            arg0.method365((byte) -32, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method308(-10, arg1 + 8);
                    } catch (InvalidClassException var35) {
                        arg0.method308(-11, -2);
                    } catch (StreamCorruptedException var36) {
                        arg0.method308(-12, -2);
                    } catch (OptionalDataException var37) {
                        arg0.method308(-13, -2);
                    } catch (IllegalAccessException var38) {
                        arg0.method308(-14, -2);
                    } catch (IllegalArgumentException var39) {
                        arg0.method308(-15, arg1 + 8);
                    } catch (InvocationTargetException var40) {
                        arg0.method308(-16, -2);
                    } catch (SecurityException var41) {
                        arg0.method308(-17, -2);
                    } catch (IOException var42) {
                        arg0.method308(-18, -2);
                    } catch (NullPointerException var43) {
                        arg0.method308(-19, arg1 ^ 0x8);
                    } catch (Exception var44) {
                        arg0.method308(-20, -2);
                    } catch (Throwable var45) {
                        arg0.method308(-21, -2);
                    }
                } else {
                    arg0.method308(var3.field4994[var7], -2);
                }
            }
            arg0.method359((byte) 89, var6);
            arg0.method345(arg0.field738 - var6, 1);
            var3.method1199(21966);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V", line = 229)
    public static final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -134684116) {
            method412(-126, (byte) 103, -22);
        }
        field948++;
        int var8 = class101.method731(class274.field4748, arg0, class105.field1887, true);
        int var9 = class101.method731(class274.field4748, arg4, class105.field1887, true);
        int var10 = class101.method731(class175.field3106, arg2, class244.field4161, true);
        int var11 = class101.method731(class175.field3106, arg3, class244.field4161, true);
        int var12 = class101.method731(class274.field4748, arg0 + arg5, class105.field1887, true);
        int var13 = class101.method731(class274.field4748, arg4 - arg5, class105.field1887, true);
        for (int var14 = var8; var14 < var12; var14++) {
            class73.method550(-29903, class308.field5329[var14], var11, var10, arg6);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class73.method550(-29903, class308.field5329[var15], var11, var10, arg6);
        }
        int var16 = class101.method731(class175.field3106, arg2 + arg5, class244.field4161, true);
        int var17 = class101.method731(class175.field3106, arg3 - arg5, class244.field4161, true);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class308.field5329[var18];
            class73.method550(-29903, var19, var16, var10, arg6);
            class73.method550(-29903, var19, var17, var16, arg1);
            class73.method550(arg7 ^ 0x807691D, var19, var11, var17, arg6);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 685)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "(I)V", line = 304)
    private final void method415(int arg0) {
        field949++;
        if (arg0 != 0) {
            return;
        }
        Random var2 = new Random((long) this.field958);
        this.field944 = new short[512];
        if (this.field947 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field944[var3] = (short) class64.method494(this.field947, 0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 331)
    public final int[] method41(int arg0, int arg1) {
        field950++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(-120, arg0);
        if (this.field3157.field3081) {
            int var4 = (class292.field5049[arg0] * this.field945) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class161.field2858; var7++) {
                class48.field875 = Integer.MAX_VALUE;
                class181.field3217 = Integer.MAX_VALUE;
                class205.field3719 = Integer.MAX_VALUE;
                class161.field2856 = Integer.MAX_VALUE;
                int var8 = class290.field5017[var7] * this.field941 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field951[(this.field945 > var11 ? var11 : var11 - this.field945) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field951[var12 + (this.field941 > var13 ? var13 : var13 - this.field941) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field944[var14] - (var13 << 12);
                        int var16 = var4 - this.field944[var27] - (var11 << 12);
                        int var17 = this.field963;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 >= 0 ? var15 : -var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var18 = var25 >= var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 < 0 ? -var16 : var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class161.field2856) {
                            class48.field875 = class181.field3217;
                            class181.field3217 = class205.field3719;
                            class205.field3719 = class161.field2856;
                            class161.field2856 = var18;
                        } else if (class205.field3719 > var18) {
                            class48.field875 = class181.field3217;
                            class181.field3217 = class205.field3719;
                            class205.field3719 = var18;
                        } else if (var18 < class181.field3217) {
                            class48.field875 = class181.field3217;
                            class181.field3217 = var18;
                        } else if (var18 < class48.field875) {
                            class48.field875 = var18;
                        }
                    }
                }
                int var26 = this.field952;
                if (var26 == 0) {
                    var3[var7] = class161.field2856;
                } else if (var26 == 1) {
                    var3[var7] = class205.field3719;
                } else if (var26 == 3) {
                    var3[var7] = class181.field3217;
                } else if (var26 == 4) {
                    var3[var7] = class48.field875;
                } else if (var26 == 2) {
                    var3[var7] = class205.field3719 - class161.field2856;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIBI)V", line = 555)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg2; var6++) {
            class73.method550(-29903, class308.field5329[var6], arg0, arg3, arg1);
        }
        int var7 = -99 % ((arg4 + 64) / 39);
        field961++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILra;I)V", line = 593)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field941 = this.field945 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field958 = arg1.method357(false);
        } else if (arg2 == 2) {
            this.field947 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field952 = arg1.method357(false);
        } else if (arg2 == 4) {
            this.field963 = arg1.method357(false);
        } else if (arg2 == 5) {
            this.field941 = arg1.method357(false);
        } else if (arg2 == 6) {
            this.field945 = arg1.method357(false);
        }
        field957++;
        if (arg0 <= 108) {
            method412(1, (byte) 91, 52);
        }
    }

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "(I)V", line = 661)
    public static void method417(int arg0) {
        field956 = null;
        if (arg0 == -23223) {
            field960 = null;
            field954 = null;
            field953 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 674)
    public final void method418(byte arg0) {
        if (arg0 != -110) {
            this.field947 = 124;
        }
        field943++;
        this.field951 = class191.method1385(this.field958, arg0 ^ 0x7E39);
        this.method415(arg0 + 110);
    }
}
