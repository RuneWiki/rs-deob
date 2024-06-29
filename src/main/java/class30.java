import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "J")
    private long field542 = -1L;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "J")
    private long field544 = -1L;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field552 = 0;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lr;")
    private class41 field534;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
    private long field529;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "J")
    private long field533;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[B")
    private byte[] field526;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[B")
    private byte[] field524;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "J")
    private long field553;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lcc;")
    private static class209 field541 = class95.method669(98, "scroll:");

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lcc;")
    public static class209 field546 = class95.method669(104, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lcc;")
    public static class209 field551 = field541;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lcc;")
    public static class209 field547 = field541;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lcc;")
    private static class209 field548 = class95.method669(127, "wave2:");

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lcc;")
    public static class209 field539 = field548;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lcc;")
    public static class209 field540 = field548;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "J")
    private long field537;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lsj;")
    public static class49 field536;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method236(int arg0, String arg1) throws ClassNotFoundException {
        field538++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            int var2 = 59 % ((arg0 - 62) / 48);
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    private final void method237(int arg0) throws IOException {
        this.field543 = 0;
        field522++;
        if (this.field553 != this.field537) {
            this.field534.method308(24028, this.field553);
            this.field537 = this.field553;
        }
        int var2 = 86 / ((-arg0 - 57) / 53);
        this.field544 = this.field553;
        while (this.field543 < this.field526.length) {
            int var3 = this.field526.length - this.field543;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field534.method304(this.field543, -1, this.field526, var3);
            if (var4 == -1) {
                break;
            }
            this.field537 += (long) var4;
            this.field543 += var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BI)V")
    public final void method238(byte[] arg0, int arg1) throws IOException {
        field528++;
        this.method249(0, arg0.length, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method239(byte arg0) {
        if (arg0 <= 68) {
            method247(false);
        }
        field530++;
        return this.field534.method309(31929);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final void method240(int arg0) throws IOException {
        field527++;
        this.method248((byte) 124);
        if (arg0 != -16777216) {
            this.method239((byte) -41);
        }
        this.field534.method307(-31335);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V")
    public static final void method241(byte arg0, int arg1) {
        class200.field3580 = arg1;
        if (arg0 == -40) {
            class279.field4919 = -1;
            field535++;
            class49.field978 = -1;
            class112.method801((byte) -102);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILcc;Lcc;BLcc;)V")
    public static final void method242(int arg0, class209 arg1, class209 arg2, byte arg3, class209 arg4) {
        class94.method655(arg4, -1, arg1, arg2, -98, arg0);
        field531++;
        if (arg3 < 11) {
            field549 = -82;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZJ)V")
    public final void method243(boolean arg0, long arg1) throws IOException {
        field532++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method239((byte) 78));
        } else if (arg0) {
            this.field553 = arg1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)J")
    public final long method244(int arg0) {
        field545++;
        if (arg0 != 7433) {
            method242(58, (class209) null, (class209) null, (byte) 126, (class209) null);
        }
        return this.field533;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[BI)V")
    public final void method245(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field523++;
        try {
            if (arg1 != -10181) {
                this.method239((byte) -114);
            }
            if (this.field533 < (long) arg3 + this.field553) {
                this.field533 = (long) arg3 + this.field553;
            }
            if (this.field542 != -1L && (this.field553 < this.field542 || this.field553 > (long) this.field552 + this.field542)) {
                this.method248((byte) 116);
            }
            if (this.field542 != -1L && (this.field542 + ((long) this.field524.length)) < ((long) arg3 + this.field553)) {
                int var5 = (int) ((long) this.field524.length - (this.field553 - this.field542));
                class270.method1847(arg2, arg0, this.field524, (int) (this.field553 - this.field542), var5);
                this.field553 += (long) var5;
                arg0 += var5;
                this.field552 = this.field524.length;
                this.method248((byte) 87);
                arg3 -= var5;
            }
            if (this.field524.length < arg3) {
                long var6 = -1L;
                if (this.field553 != this.field537) {
                    this.field534.method308(24028, this.field553);
                    this.field537 = this.field553;
                }
                this.field534.method305((byte) -36, arg3, arg0, arg2);
                if (this.field553 >= this.field544 && (this.field544 + ((long) this.field543)) > this.field553) {
                    var6 = this.field553;
                } else if (this.field553 <= this.field544 && this.field544 < (long) arg3 + this.field553) {
                    var6 = this.field544;
                }
                this.field537 += (long) arg3;
                if (this.field529 < this.field537) {
                    this.field529 = this.field537;
                }
                long var8 = -1L;
                if (((long) arg3 + this.field553) > this.field544 && ((long) arg3 + this.field553) <= ((long) this.field543 + this.field544)) {
                    var8 = this.field553 + ((long) arg3);
                } else if (((long) this.field543 + this.field544) > this.field553 && ((long) arg3 + this.field553) >= ((long) this.field543 + this.field544)) {
                    var8 = this.field544 + ((long) this.field543);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class270.method1847(arg2, (int) ((long) arg0 + var6 - this.field553), this.field526, (int) (var6 - this.field544), var10);
                }
                this.field553 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field542 == -1L) {
                    this.field542 = this.field553;
                }
                class270.method1847(arg2, arg0, this.field524, (int) (this.field553 - this.field542), arg3);
                this.field553 += (long) arg3;
                if (((long) this.field552) < (this.field553 - this.field542)) {
                    this.field552 = (int) (this.field553 - this.field542);
                }
            }
        } catch (IOException var12) {
            this.field537 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class56.field1154 = arg1;
        class277.field4879 = arg2;
        class11.field222 = arg3;
        class48.field926 = new class109[arg0][class56.field1154][class277.field4879];
        class38.field656 = new int[arg0][class56.field1154 + 1][class277.field4879 + 1];
        if (arg4) {
            class22.field412 = new class109[1][class56.field1154][class277.field4879];
            class90.field1802 = new int[class56.field1154][class277.field4879];
            class284.field4996 = new int[1][class56.field1154 + 1][class277.field4879 + 1];
        } else {
            class22.field412 = null;
            class90.field1802 = null;
            class284.field4996 = null;
        }
        class93.method654(false);
        class124.field2420 = new class53[500];
        class117.field2358 = 0;
        class251.field4512 = new class53[500];
        class153.field2772 = 0;
        class162.field2940 = new int[arg0][class56.field1154 + 1][class277.field4879 + 1];
        class122.field2410 = new class264[5000];
        class228.field4159 = 0;
        class195.field3513 = new class264[100];
        class160.field2909 = new boolean[class11.field222 + class11.field222 + 1][class11.field222 + class11.field222 + 1];
        class187.field3386 = new boolean[class11.field222 + class11.field222 + 2][class11.field222 + class11.field222 + 2];
        class110.field2222 = new byte[arg0][class56.field1154][class277.field4879];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method247(boolean arg0) {
        field539 = null;
        if (!arg0) {
            method246(-122, 56, 1, -25, true);
        }
        field548 = null;
        field551 = null;
        field547 = null;
        field546 = null;
        field541 = null;
        field536 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    private final void method248(byte arg0) throws IOException {
        field525++;
        if (arg0 <= 82 || this.field542 == -1L) {
            return;
        }
        if (this.field542 != this.field537) {
            this.field534.method308(24028, this.field542);
            this.field537 = this.field542;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field534.method305((byte) -36, this.field552, 0, this.field524);
        if ((long) this.field552 + this.field542 > this.field544 && ((long) this.field552 + this.field542) <= ((long) this.field543 + this.field544)) {
            var2 = (long) this.field552 + this.field542;
        } else if ((long) this.field543 + this.field544 > this.field542 && (long) this.field552 + this.field542 >= (long) this.field543 + this.field544) {
            var2 = this.field544 + ((long) this.field543);
        }
        this.field537 += (long) this.field552;
        if (this.field544 <= this.field542 && this.field542 < (long) this.field543 + this.field544) {
            var4 = this.field542;
        } else if (this.field542 <= this.field544 && (long) this.field552 + this.field542 > this.field544) {
            var4 = this.field544;
        }
        if (this.field529 < this.field537) {
            this.field529 = this.field537;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class270.method1847(this.field524, (int) (var4 - this.field542), this.field526, (int) (var4 - this.field544), var6);
        }
        this.field552 = 0;
        this.field542 = -1L;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[BI)V")
    public final void method249(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field550++;
        try {
            if (arg3 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field542 != -1L && this.field542 <= this.field553 && this.field542 + ((long) this.field552) >= (long) arg1 + this.field553) {
                class270.method1847(this.field524, (int) (this.field553 - this.field542), arg2, arg3, arg1);
                this.field553 += (long) arg1;
                return;
            }
            long var5 = this.field553;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field544 <= this.field553 && this.field553 < (this.field544 + ((long) this.field543))) {
                int var9 = (int) ((long) this.field543 - (this.field553 - this.field544));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class270.method1847(this.field526, (int) (this.field553 - this.field544), arg2, arg3, var9);
                this.field553 += (long) var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (this.field526.length < arg1) {
                this.field534.method308(24028, this.field553);
                this.field537 = this.field553;
                while (arg1 > 0) {
                    int var10 = this.field534.method304(arg3, -1, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field537 += (long) var10;
                    arg3 += var10;
                    this.field553 += (long) var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                this.method237(-113);
                int var11 = arg1;
                if (this.field543 < arg1) {
                    var11 = this.field543;
                }
                arg1 -= var11;
                class270.method1847(this.field526, 0, arg2, arg3, var11);
                arg3 += var11;
                this.field553 += (long) var11;
            }
            if (this.field542 != -1L) {
                if (this.field553 < this.field542 && arg1 > 0) {
                    int var12 = (int) (this.field542 - this.field553) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg1--;
                        this.field553++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field542 && (long) var8 + var5 > this.field542) {
                    var13 = this.field542;
                } else if (this.field542 <= var5 && (long) this.field552 + this.field542 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field552 + this.field542 && ((long) var8 + var5) >= ((long) this.field552 + this.field542)) {
                    var15 = (long) this.field552 + this.field542;
                } else if (this.field542 < (long) var8 + var5 && ((long) var8 + var5) <= (this.field542 + ((long) this.field552))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class270.method1847(this.field524, (int) (var13 - this.field542), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field553) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field553));
                        this.field553 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field537 = -1L;
            throw var19;
        }
        if (arg0 < arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lr;II)V")
    public class30(class41 arg0, int arg1, int arg2) throws IOException {
        this.field534 = arg0;
        this.field533 = this.field529 = arg0.method306((byte) 40);
        this.field526 = new byte[arg1];
        this.field524 = new byte[arg2];
        this.field553 = 0L;
    }
}
