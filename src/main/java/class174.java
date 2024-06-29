import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
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

@OriginalClass("client!ae")
public class class174 {

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "J")
    private long field2440 = -1L;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "J")
    private long field2450 = -1L;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private int field2437 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lub;")
    private class91 field2434;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "J")
    private long field2454;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "J")
    private long field2448;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "J")
    private long field2442;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[B")
    private byte[] field2449;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[B")
    private byte[] field2432;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    public static int[] field2439 = new int[50];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
    private long field2435;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lhc;")
    public static class235 field2455;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[[[I")
    public static int[][][] field2446;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method1137(byte arg0) {
        field2457++;
        int var1 = class40.field593;
        int var2 = class180.field2516;
        int var3 = class175.field2458;
        int var4 = class224.field3406;
        int var5 = 6116423;
        int var6 = 118 % ((arg0 - 15) / 59);
        class64.method401(var1, var2, var3, var4, var5);
        class64.method401(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class64.method393(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class54.field787.method842(class92.field1277, var1 + 3, var2 + 14, var5, -1);
        int var7 = class287.field4543;
        int var8 = class12.field124;
        for (int var9 = 0; var9 < class68.field925; var9++) {
            int var10 = (class68.field925 - var9 - 1) * 15 + var2 + 31;
            int var11 = 16777215;
            if (var1 < var8 && var8 < (var1 + var3) && var7 > (var10 - 13) && var7 < (var10 + 3)) {
                var11 = 16776960;
            }
            class54.field787.method842(class41.method273(0, var9), var1 + 3, var10, var11, 0);
        }
        class107.method692(class224.field3406, class175.field2458, (byte) -117, class180.field2516, class40.field593);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB[B)V")
    public final void method1138(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field2452++;
        try {
            if ((long) arg1 + this.field2442 > this.field2448) {
                this.field2448 = (long) arg1 + this.field2442;
            }
            if (arg2 != 30) {
                this.field2450 = -42L;
            }
            if (this.field2450 != -1L && (this.field2442 < this.field2450 || this.field2442 > ((long) this.field2437 + this.field2450))) {
                this.method1148(-1);
            }
            if (this.field2450 != -1L && (long) arg1 + this.field2442 > (long) this.field2449.length + this.field2450) {
                int var5 = (int) (this.field2450 + (long) this.field2449.length - this.field2442);
                arg1 -= var5;
                class115.method775(arg3, arg0, this.field2449, (int) (this.field2442 - this.field2450), var5);
                arg0 += var5;
                this.field2442 += (long) var5;
                this.field2437 = this.field2449.length;
                this.method1148(arg2 - 31);
            }
            if (this.field2449.length < arg1) {
                if (this.field2442 != this.field2435) {
                    this.field2434.method595(this.field2442, -1);
                    this.field2435 = this.field2442;
                }
                this.field2434.method592(arg1, (byte) -110, arg0, arg3);
                long var6 = -1L;
                this.field2435 += (long) arg1;
                long var8 = -1L;
                if (this.field2435 > this.field2454) {
                    this.field2454 = this.field2435;
                }
                if (this.field2442 >= this.field2440 && this.field2442 < (long) this.field2444 + this.field2440) {
                    var8 = this.field2442;
                } else if (this.field2442 <= this.field2440 && (long) arg1 + this.field2442 > this.field2440) {
                    var8 = this.field2440;
                }
                if ((long) arg1 + this.field2442 > this.field2440 && (long) arg1 + this.field2442 <= (long) this.field2444 + this.field2440) {
                    var6 = (long) arg1 + this.field2442;
                } else if ((long) this.field2444 + this.field2440 > this.field2442 && ((long) arg1 + this.field2442) >= ((long) this.field2444 + this.field2440)) {
                    var6 = (long) this.field2444 + this.field2440;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class115.method775(arg3, (int) ((long) arg0 + var8 - this.field2442), this.field2432, (int) (var8 - this.field2440), var10);
                }
                this.field2442 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field2450 == -1L) {
                    this.field2450 = this.field2442;
                }
                class115.method775(arg3, arg0, this.field2449, (int) (this.field2442 - this.field2450), arg1);
                this.field2442 += (long) arg1;
                if ((this.field2442 - this.field2450) > ((long) this.field2437)) {
                    this.field2437 = (int) (this.field2442 - this.field2450);
                }
            }
        } catch (IOException var12) {
            this.field2435 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method1139(byte arg0) {
        field2433++;
        if (arg0 >= 0) {
            this.field2450 = -21L;
        }
        return this.field2434.method596((byte) 58);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)J")
    public final long method1140(byte arg0) {
        if (arg0 != 37) {
            this.field2454 = 29L;
        }
        field2451++;
        return this.field2448;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILh;)V")
    public static final void method1141(int arg0, int arg1, class278 arg2) {
        field2438++;
        if (arg0 >= -1) {
            method1144(62);
        }
        while (true) {
            class49 var3 = (class49) class20.field286.method990(-119);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field708; var5++) {
                if (var3.field706[var5] != null) {
                    if (var3.field706[var5].field1663 == 2) {
                        var3.field717[var5] = -5;
                    }
                    if (var3.field706[var5].field1663 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field711[var5] != null) {
                    if (var3.field711[var5].field1663 == 2) {
                        var3.field717[var5] = -6;
                    }
                    if (var3.field711[var5].field1663 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1864(arg1, (byte) -69);
            arg2.method1447(0, 17363472);
            int var6 = arg2.field3402;
            arg2.method1435(-128, var3.field718);
            for (int var7 = 0; var7 < var3.field708; var7++) {
                if (var3.field717[var7] == 0) {
                    try {
                        int var8 = var3.field707[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field706[var7].field1665;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1447(0, 17363472);
                            arg2.method1435(-112, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field706[var7].field1665;
                            var13.setInt((Object) null, var3.field705[var7]);
                            arg2.method1447(0, 17363472);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field706[var7].field1665;
                            int var12 = var11.getModifiers();
                            arg2.method1447(0, 17363472);
                            arg2.method1435(-103, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field711[var7].field1665;
                            byte[][] var15 = var3.field712[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1447(0, 17363472);
                            } else if (var19 instanceof Number) {
                                arg2.method1447(1, 17363472);
                                arg2.method1451(((Number) var19).longValue(), (byte) -24);
                            } else if ((var19 instanceof String)) {
                                arg2.method1447(2, 17363472);
                                arg2.method1472((byte) 67, (String) var19);
                            } else {
                                arg2.method1447(4, 17363472);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field711[var7].field1665;
                            int var21 = var20.getModifiers();
                            arg2.method1447(0, 17363472);
                            arg2.method1435(-91, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1447(-10, 17363472);
                    } catch (InvalidClassException var23) {
                        arg2.method1447(-11, 17363472);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1447(-12, 17363472);
                    } catch (OptionalDataException var25) {
                        arg2.method1447(-13, 17363472);
                    } catch (IllegalAccessException var26) {
                        arg2.method1447(-14, 17363472);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1447(-15, 17363472);
                    } catch (InvocationTargetException var28) {
                        arg2.method1447(-16, 17363472);
                    } catch (SecurityException var29) {
                        arg2.method1447(-17, 17363472);
                    } catch (IOException var30) {
                        arg2.method1447(-18, 17363472);
                    } catch (NullPointerException var31) {
                        arg2.method1447(-19, 17363472);
                    } catch (Exception var32) {
                        arg2.method1447(-20, 17363472);
                    } catch (Throwable var33) {
                        arg2.method1447(-21, 17363472);
                    }
                } else {
                    arg2.method1447(var3.field717[var7], 17363472);
                }
            }
            arg2.method1444(var6, 101);
            arg2.method1466(arg2.field3402 - var6, (byte) 75);
            var3.method1115(-123);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BII)V")
    public final void method1142(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2456++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (arg3 <= 40) {
                this.field2437 = -57;
            }
            if (this.field2450 != -1L && this.field2450 <= this.field2442 && (long) this.field2437 + this.field2450 >= this.field2442 - -((long) arg0)) {
                class115.method775(this.field2449, (int) (this.field2442 - this.field2450), arg1, arg2, arg0);
                this.field2442 += (long) arg0;
                return;
            }
            long var5 = this.field2442;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field2440 <= this.field2442 && this.field2440 + ((long) this.field2444) > this.field2442) {
                int var9 = (int) ((long) this.field2444 + this.field2440 - this.field2442);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class115.method775(this.field2432, (int) (this.field2442 - this.field2440), arg1, arg2, var9);
                this.field2442 += (long) var9;
                arg2 += var9;
                arg0 -= var9;
            }
            if (arg0 > this.field2432.length) {
                this.field2434.method595(this.field2442, -1);
                this.field2435 = this.field2442;
                while (arg0 > 0) {
                    int var10 = this.field2434.method591(arg0, arg2, 79, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    this.field2442 += (long) var10;
                    arg2 += var10;
                    this.field2435 += (long) var10;
                }
            } else if (arg0 > 0) {
                int var11 = arg0;
                this.method1147(59);
                if (this.field2444 < arg0) {
                    var11 = this.field2444;
                }
                arg0 -= var11;
                class115.method775(this.field2432, 0, arg1, arg2, var11);
                arg2 += var11;
                this.field2442 += (long) var11;
            }
            if (this.field2450 != -1L) {
                if (this.field2450 > this.field2442 && arg0 > 0) {
                    int var12 = (int) (this.field2450 - this.field2442) + arg2;
                    if (var12 > (arg2 + arg0)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1[arg2++] = 0;
                        this.field2442++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2450 && ((long) var8 + var5) > this.field2450) {
                    var13 = this.field2450;
                } else if (var5 >= this.field2450 && (long) this.field2437 + this.field2450 > var5) {
                    var13 = var5;
                }
                if ((long) this.field2437 + this.field2450 > var5 && var5 + ((long) var8) >= (long) this.field2437 + this.field2450) {
                    var15 = (long) this.field2437 + this.field2450;
                } else if (((long) var8 + var5) > this.field2450 && (long) var8 + var5 <= (long) this.field2437 + this.field2450) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class115.method775(this.field2449, (int) (var13 - this.field2450), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field2442) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2442));
                        this.field2442 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2435 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
    public final void method1143(long arg0, int arg1) throws IOException {
        field2447++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1139((byte) -92));
        } else if (arg1 <= -38) {
            this.field2442 = arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2439 = null;
        if (arg0 == -16777216) {
            field2446 = null;
            field2455 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BB)V")
    public final void method1145(byte[] arg0, byte arg1) throws IOException {
        this.method1142(arg0.length, arg0, 0, 105);
        field2453++;
        if (arg1 < 44) {
            this.method1140((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method1146(boolean arg0) {
        if (class244.field3719.toLowerCase().indexOf("microsoft") == -1) {
            class135.field1895[46] = 72;
            class135.field1895[61] = 27;
            class135.field1895[44] = 71;
            class135.field1895[45] = 26;
            class135.field1895[93] = 43;
            class135.field1895[47] = 73;
            class135.field1895[92] = 74;
            class135.field1895[91] = 42;
            if (class244.field3735 == null) {
                class135.field1895[192] = 58;
                class135.field1895[222] = 59;
            } else {
                class135.field1895[520] = 59;
                class135.field1895[192] = 28;
                class135.field1895[222] = 58;
            }
            class135.field1895[59] = 57;
        } else {
            class135.field1895[189] = 26;
            class135.field1895[223] = 28;
            class135.field1895[221] = 43;
            class135.field1895[191] = 73;
            class135.field1895[220] = 74;
            class135.field1895[187] = 27;
            class135.field1895[190] = 72;
            class135.field1895[222] = 59;
            class135.field1895[188] = 71;
            class135.field1895[219] = 42;
            class135.field1895[186] = 57;
            class135.field1895[192] = 58;
        }
        if (!arg0) {
            method1146(true);
        }
        field2445++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    private final void method1147(int arg0) throws IOException {
        field2436++;
        int var2 = 116 / ((25 - arg0) / 33);
        this.field2444 = 0;
        if (this.field2442 != this.field2435) {
            this.field2434.method595(this.field2442, -1);
            this.field2435 = this.field2442;
        }
        this.field2440 = this.field2442;
        while (this.field2432.length > this.field2444) {
            int var3 = this.field2432.length - this.field2444;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2434.method591(var3, this.field2444, 68, this.field2432);
            if (var4 == -1) {
                break;
            }
            this.field2435 += (long) var4;
            this.field2444 += var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    private final void method1148(int arg0) throws IOException {
        if (arg0 != -1) {
            method1141(-81, -81, (class278) null);
        }
        if (this.field2450 != -1L) {
            if (this.field2450 != this.field2435) {
                this.field2434.method595(this.field2450, arg0);
                this.field2435 = this.field2450;
            }
            this.field2434.method592(this.field2437, (byte) -125, 0, this.field2449);
            long var2 = -1L;
            this.field2435 += (long) this.field2437;
            long var4 = -1L;
            if (this.field2435 > this.field2454) {
                this.field2454 = this.field2435;
            }
            if (this.field2450 + ((long) this.field2437) > this.field2440 && ((long) this.field2444 + this.field2440) >= ((long) this.field2437 + this.field2450)) {
                var2 = (long) this.field2437 + this.field2450;
            } else if (((long) this.field2444 + this.field2440) > this.field2450 && (long) this.field2437 + this.field2450 >= this.field2440 - -((long) this.field2444)) {
                var2 = (long) this.field2444 + this.field2440;
            }
            if (this.field2450 >= this.field2440 && (long) this.field2444 + this.field2440 > this.field2450) {
                var4 = this.field2450;
            } else if (this.field2450 <= this.field2440 && this.field2440 < (long) this.field2437 + this.field2450) {
                var4 = this.field2440;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class115.method775(this.field2449, (int) (var4 - this.field2450), this.field2432, (int) (var4 - this.field2440), var6);
            }
            this.field2450 = -1L;
            this.field2437 = 0;
        }
        field2441++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lub;II)V")
    public class174(class91 arg0, int arg1, int arg2) throws IOException {
        this.field2434 = arg0;
        this.field2448 = this.field2454 = arg0.method594(76);
        this.field2442 = 0L;
        this.field2449 = new byte[arg2];
        this.field2432 = new byte[arg1];
    }
}
