import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class278 {

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "J")
    private long field4031 = -1L;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "J")
    private long field4044 = -1L;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    private int field4050 = 0;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "Lim;")
    private class350 field4025;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "J")
    private long field4034;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "J")
    private long field4043;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "[B")
    private byte[] field4030;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "[B")
    private byte[] field4033;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "J")
    private long field4051;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "J")
    public static long field4047 = 0L;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4027 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "Lvk;")
    public static class56 field4045 = new class56(16);

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "Lcr;")
    public static class189 field4052 = new class189(20);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "J")
    private long field4035;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Llm;")
    public static class347 field4028;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Lad;")
    public static class400 field4053;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1917(boolean arg0) {
        field4037++;
        class350 var1 = null;
        try {
            class429 var2 = class76.field1085.method243(0);
            while (var2.field6308 == 0) {
                class144.method918(1L, true);
            }
            if (var2.field6308 == 1) {
                var1 = (class350) var2.field6309;
                class228 var3 = new class228(class117.field1648 * 6 + 3);
                var3.method1346(1, 32767);
                var3.method1326(class117.field1648, -93);
                for (int var4 = 0; var4 < class43.field594.length; var4++) {
                    if (class63.field842[var4]) {
                        var3.method1326(var4, -91);
                        var3.method1330(class43.field594[var4], -126);
                    }
                }
                var1.method2306(arg0, var3.field3040, var3.field3029, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2304(-17644);
            }
        } catch (Exception var5) {
        }
        class295.field4227 = class114.method735(118);
        class257.field3768 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 70)
    private final void method1918(int arg0) throws IOException {
        if (this.field4031 != -1L) {
            if (this.field4035 != this.field4031) {
                this.field4025.method2309(0, this.field4031);
                this.field4035 = this.field4031;
            }
            this.field4025.method2306(false, this.field4033, this.field4050, 0);
            this.field4035 += (long) this.field4050;
            if (this.field4035 > this.field4034) {
                this.field4034 = this.field4035;
            }
            long var2 = -1L;
            if (this.field4044 <= this.field4031 && this.field4044 + ((long) this.field4032) > this.field4031) {
                var2 = this.field4031;
            } else if (this.field4031 <= this.field4044 && this.field4031 + ((long) this.field4050) > this.field4044) {
                var2 = this.field4044;
            }
            long var4 = -1L;
            if (this.field4044 < ((long) this.field4050 + this.field4031) && ((long) this.field4050 + this.field4031) <= (this.field4044 + ((long) this.field4032))) {
                var4 = (long) this.field4050 + this.field4031;
            } else if ((this.field4044 + ((long) this.field4032)) > this.field4031 && ((long) this.field4032 + this.field4044) <= ((long) this.field4050 + this.field4031)) {
                var4 = (long) this.field4032 + this.field4044;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class60.method421(this.field4033, (int) (var2 - this.field4031), this.field4030, (int) (var2 - this.field4044), var6);
            }
            this.field4050 = 0;
            this.field4031 = -1L;
        }
        field4040++;
        int var7 = 7 % ((-arg0 - 44) / 49);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILdr;)I", line = 145)
    public static final int method1919(int arg0, class212 arg1) {
        field4049++;
        String var2 = class397.method2556((byte) 111, arg1);
        if (arg0 != 1) {
            method1917(true);
        }
        int[] var3 = null;
        if (class355.method2331(-124, arg1.field2836)) {
            var3 = class9.method74((int) arg1.field2830, (byte) 67).field1140;
        } else if (class56.method386(arg1.field2836, (byte) -93)) {
            class43 var4 = class306.field4496[(int) arg1.field2830];
            if (var4 != null) {
                var3 = var4.field606.field3388;
            }
        } else if (class379.method2462(arg1.field2836, (byte) 44)) {
            if (arg1.field2836 == 1008) {
                var3 = class329.method2190((byte) 63, (int) arg1.field2830).field1484;
            } else {
                var3 = class329.method2190((byte) 63, (int) (arg1.field2830 >>> 32 & 0x7FFFFFFFL)).field1484;
            }
        }
        if (var3 != null) {
            var2 = var2 + class110.method727(false, var3);
        }
        return class191.field2562.method2123(class363.field5240, var2, (byte) 103);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BI)V", line = 190)
    public final void method1920(byte[] arg0, int arg1) throws IOException {
        this.method1930(0, arg0, arg0.length, 0);
        field4026++;
        if (arg1 <= 22) {
            method1922(-90);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lwd;B)[Lvi;", line = 204)
    public static final class309[] method1921(class36 arg0, byte arg1) {
        field4039++;
        if (!arg0.method265(18)) {
            return new class309[0];
        }
        class429 var2 = arg0.method256(1503);
        if (arg1 < 72) {
            return null;
        }
        while (var2.field6308 == 0) {
            class144.method918(10L, true);
        }
        if (var2.field6308 == 2) {
            return new class309[0];
        }
        int[] var3 = (int[]) var2.field6309;
        class309[] var4 = new class309[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class309 var6 = new class309();
            var4[var5] = var6;
            var6.field4549 = var3[var5 << 2];
            var6.field4554 = var3[(var5 << 2) + 1];
            var6.field4550 = var3[(var5 << 2) + 2];
            var6.field4555 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 247)
    public static final void method1922(int arg0) {
        field4038++;
        class189 var1 = class240.field3217;
        synchronized (class240.field3217) {
            class240.field3217.method1136((byte) -112);
        }
        class189 var2 = class284.field4133;
        synchronized (class284.field4133) {
            class284.field4133.method1136((byte) -98);
        }
        class189 var3 = class33.field469;
        synchronized (class33.field469) {
            class33.field469.method1136((byte) -117);
        }
        class189 var4 = class398.field5926;
        synchronized (class398.field5926) {
            class398.field5926.method1136((byte) -67);
            if (arg0 != -1) {
                field4047 = 13L;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 269)
    public static final void method1923(int arg0) {
        if (arg0 != 0) {
            field4047 = 116L;
        }
        field4036++;
        class55.field735.method1141(arg0 + 256);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III[B)V", line = 280)
    public final void method1924(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4048++;
        try {
            if (this.field4043 < (long) arg1 + this.field4051) {
                this.field4043 = (long) arg1 + this.field4051;
            }
            if (this.field4031 != -1L && (this.field4051 < this.field4031 || this.field4051 > (long) this.field4050 + this.field4031)) {
                this.method1918(-94);
            }
            if (this.field4031 != -1L && this.field4051 + ((long) arg1) > (long) this.field4033.length + this.field4031) {
                int var5 = (int) ((long) this.field4033.length + this.field4031 - this.field4051);
                class60.method421(arg3, arg0, this.field4033, (int) (this.field4051 - this.field4031), var5);
                arg0 += var5;
                arg1 -= var5;
                this.field4051 += (long) var5;
                this.field4050 = this.field4033.length;
                this.method1918(-127);
            }
            if (this.field4033.length >= arg1) {
                int var11 = -120 % ((-arg2 - 59) / 40);
                if (arg1 > 0) {
                    if (this.field4031 == -1L) {
                        this.field4031 = this.field4051;
                    }
                    class60.method421(arg3, arg0, this.field4033, (int) (this.field4051 - this.field4031), arg1);
                    this.field4051 += (long) arg1;
                    if ((this.field4051 - this.field4031) > ((long) this.field4050)) {
                        this.field4050 = (int) (this.field4051 - this.field4031);
                    }
                }
            } else {
                if (this.field4051 != this.field4035) {
                    this.field4025.method2309(0, this.field4051);
                    this.field4035 = this.field4051;
                }
                this.field4025.method2306(false, arg3, arg1, arg0);
                this.field4035 += (long) arg1;
                if (this.field4035 > this.field4034) {
                    this.field4034 = this.field4035;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field4051 >= this.field4044 && (long) this.field4032 + this.field4044 > this.field4051) {
                    var6 = this.field4051;
                } else if (this.field4051 <= this.field4044 && (long) arg1 + this.field4051 > this.field4044) {
                    var6 = this.field4044;
                }
                if ((long) arg1 + this.field4051 > this.field4044 && (long) this.field4032 + this.field4044 >= (long) arg1 + this.field4051) {
                    var8 = this.field4051 + ((long) arg1);
                } else if (this.field4051 < ((long) this.field4032 + this.field4044) && ((long) arg1 + this.field4051) >= ((long) this.field4032 + this.field4044)) {
                    var8 = (long) this.field4032 + this.field4044;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class60.method421(arg3, (int) ((long) arg0 + var6 - this.field4051), this.field4030, (int) (var6 - this.field4044), var10);
                }
                this.field4051 += (long) arg1;
            }
        } catch (IOException var13) {
            this.field4035 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V", line = 399)
    private final void method1925(int arg0) throws IOException {
        field4029++;
        this.field4032 = 0;
        if (this.field4051 != this.field4035) {
            this.field4025.method2309(0, this.field4051);
            this.field4035 = this.field4051;
        }
        this.field4044 = this.field4051;
        while (this.field4030.length > this.field4032) {
            int var2 = this.field4030.length - this.field4032;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4025.method2308(this.field4030, var2, -5921, this.field4032);
            if (var3 == -1) {
                break;
            }
            this.field4035 += (long) var3;
            this.field4032 += var3;
        }
        if (arg0 != -9536) {
            field4047 = 14L;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 442)
    public static void method1926(byte arg0) {
        field4052 = null;
        field4053 = null;
        field4045 = null;
        field4027 = null;
        int var1 = 27 / ((79 - arg0) / 41);
        field4028 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BJ)V", line = 457)
    public final void method1927(byte arg0, long arg1) throws IOException {
        field4024++;
        if (arg0 != -24) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1929(arg0 + 44));
        }
        this.field4051 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)J", line = 471)
    public final long method1928(int arg0) {
        if (arg0 == 1) {
            field4041++;
            return this.field4043;
        } else {
            return 48L;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lim;II)V", line = 952)
    public class278(class350 arg0, int arg1, int arg2) throws IOException {
        this.field4025 = arg0;
        this.field4043 = this.field4034 = arg0.method2307((byte) -39);
        this.field4030 = new byte[arg1];
        this.field4033 = new byte[arg2];
        this.field4051 = 0L;
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)Ljava/io/File;", line = 497)
    private final File method1929(int arg0) {
        if (arg0 != 20) {
            field4052 = null;
        }
        field4046++;
        return this.field4025.method2305(arg0 ^ 0xFFFFFFEB);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[BII)V", line = 509)
    public final void method1930(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4023++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field4031 != -1L && this.field4031 <= this.field4051 && this.field4031 + ((long) this.field4050) >= this.field4051 - -((long) arg2)) {
                class60.method421(this.field4033, (int) (this.field4051 - this.field4031), arg1, arg0, arg2);
                this.field4051 += (long) arg2;
                return;
            }
            long var5 = this.field4051;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field4051 >= this.field4044 && this.field4051 < ((long) this.field4032 + this.field4044)) {
                int var9 = (int) (this.field4044 - (this.field4051 - (long) this.field4032));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class60.method421(this.field4030, (int) (this.field4051 - this.field4044), arg1, arg0, var9);
                arg0 += var9;
                arg2 -= var9;
                this.field4051 += (long) var9;
            }
            if (arg3 != 0) {
                return;
            }
            if (this.field4030.length < arg2) {
                this.field4025.method2309(0, this.field4051);
                this.field4035 = this.field4051;
                while (arg2 > 0) {
                    int var10 = this.field4025.method2308(arg1, arg2, -5921, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4051 += (long) var10;
                    arg2 -= var10;
                    arg0 += var10;
                    this.field4035 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method1925(arg3 - 9536);
                int var11 = arg2;
                if (this.field4032 < arg2) {
                    var11 = this.field4032;
                }
                class60.method421(this.field4030, 0, arg1, arg0, var11);
                this.field4051 += (long) var11;
                arg2 -= var11;
                arg0 += var11;
            }
            if (this.field4031 != -1L) {
                if (this.field4051 < this.field4031 && arg2 > 0) {
                    int var12 = (int) (this.field4031 - this.field4051) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg1[arg0++] = 0;
                        this.field4051++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field4031 >= var5 && ((long) var8 + var5) > this.field4031) {
                    var13 = this.field4031;
                } else if (this.field4031 <= var5 && var5 < ((long) this.field4050 + this.field4031)) {
                    var13 = var5;
                }
                if (((long) this.field4050 + this.field4031) > var5 && (long) this.field4050 + this.field4031 <= (long) var8 + var5) {
                    var15 = (long) this.field4050 + this.field4031;
                } else if ((var5 + ((long) var8)) > this.field4031 && (long) this.field4050 + this.field4031 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class60.method421(this.field4033, (int) (var13 - this.field4031), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (this.field4051 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field4051));
                        this.field4051 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4035 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V", line = 706)
    public static final void method1931() {
        class307.field4522 = 0;
        label191: for (int var0 = 0; var0 < class395.field5826; var0++) {
            class432 var1 = class194.field2604[var0];
            if (class367.field5306 != null) {
                for (int var2 = 0; var2 < class367.field5306.length; var2++) {
                    if (class367.field5306[var2] != -1000000 && (var1.field6357 <= class367.field5306[var2] || var1.field6343 <= class367.field5306[var2]) && (var1.field6356 <= class424.field6251[var2] || var1.field6355 <= class424.field6251[var2]) && (var1.field6356 >= class442.field6474[var2] || var1.field6355 >= class442.field6474[var2]) && (var1.field6353 <= class122.field1688[var2] || var1.field6361 <= class122.field1688[var2]) && (var1.field6353 >= class438.field6416[var2] || var1.field6361 >= class438.field6416[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field6349 == 1) {
                int var3 = var1.field6345 + class264.field3838 - class104.field1491;
                if (var3 >= 0 && var3 <= class264.field3838 + class264.field3838) {
                    int var4 = var1.field6358 + class264.field3838 - class428.field6302;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field6340 + class264.field3838 - class428.field6302;
                    if (var5 > class264.field3838 + class264.field3838) {
                        var5 = class264.field3838 + class264.field3838;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class211.field2799[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class422.field6230 - var1.field6356;
                        if (var7 > 32) {
                            var1.field6351 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field6351 = 2;
                            var7 = -var7;
                        }
                        var1.field6344 = (var1.field6353 - class432.field6360 << 8) / var7;
                        var1.field6362 = (var1.field6361 - class432.field6360 << 8) / var7;
                        var1.field6341 = (var1.field6357 - class281.field4095 << 8) / var7;
                        var1.field6339 = (var1.field6343 - class281.field4095 << 8) / var7;
                        class411.field6073[class307.field4522++] = var1;
                    }
                }
            } else if (var1.field6349 == 2) {
                int var8 = var1.field6358 + class264.field3838 - class428.field6302;
                if (var8 >= 0 && var8 <= class264.field3838 + class264.field3838) {
                    int var9 = var1.field6345 + class264.field3838 - class104.field1491;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field6352 + class264.field3838 - class104.field1491;
                    if (var10 > class264.field3838 + class264.field3838) {
                        var10 = class264.field3838 + class264.field3838;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class211.field2799[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class432.field6360 - var1.field6353;
                        if (var12 > 32) {
                            var1.field6351 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field6351 = 4;
                            var12 = -var12;
                        }
                        var1.field6354 = (var1.field6356 - class422.field6230 << 8) / var12;
                        var1.field6347 = (var1.field6355 - class422.field6230 << 8) / var12;
                        var1.field6341 = (var1.field6357 - class281.field4095 << 8) / var12;
                        var1.field6339 = (var1.field6343 - class281.field4095 << 8) / var12;
                        class411.field6073[class307.field4522++] = var1;
                    }
                }
            } else if (var1.field6349 == 4) {
                int var13 = var1.field6357 - class281.field4095;
                if (var13 > 128) {
                    int var14 = var1.field6358 + class264.field3838 - class428.field6302;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field6340 + class264.field3838 - class428.field6302;
                    if (var15 > class264.field3838 + class264.field3838) {
                        var15 = class264.field3838 + class264.field3838;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field6345 + class264.field3838 - class104.field1491;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field6352 + class264.field3838 - class104.field1491;
                        if (var17 > class264.field3838 + class264.field3838) {
                            var17 = class264.field3838 + class264.field3838;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class211.field2799[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field6351 = 5;
                            var1.field6354 = (var1.field6356 - class422.field6230 << 8) / var13;
                            var1.field6347 = (var1.field6355 - class422.field6230 << 8) / var13;
                            var1.field6344 = (var1.field6353 - class432.field6360 << 8) / var13;
                            var1.field6362 = (var1.field6361 - class432.field6360 << 8) / var13;
                            class411.field6073[class307.field4522++] = var1;
                        }
                    }
                }
            }
        }
    }
}
