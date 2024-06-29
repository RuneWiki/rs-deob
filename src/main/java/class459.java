import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 {

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field6786 = 0;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "J")
    private long field6793 = -1L;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "J")
    private long field6797 = -1L;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lri;")
    private class101 field6781;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "J")
    private long field6796;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "J")
    private long field6787;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[B")
    private byte[] field6788;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "J")
    private long field6790;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[B")
    private byte[] field6779;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Lbt;")
    public static class363 field6785 = new class363(5);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    private int field6792;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "J")
    private long field6798;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIII)V")
    public final void method2845(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6791++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg0.length);
            }
            if (this.field6797 != -1L && this.field6797 <= this.field6790 && (long) this.field6786 + this.field6797 >= (long) arg1 + this.field6790) {
                class224.method1539(this.field6779, (int) (this.field6790 - this.field6797), arg0, arg3, arg1);
                this.field6790 += (long) arg1;
                return;
            }
            long var5 = this.field6790;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field6790 >= this.field6793 && ((long) this.field6792 + this.field6793) > this.field6790) {
                int var9 = (int) ((long) this.field6792 + this.field6793 - this.field6790);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class224.method1539(this.field6788, (int) (this.field6790 - this.field6793), arg0, arg3, var9);
                this.field6790 += (long) var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field6788.length) {
                this.field6781.method682(112, this.field6790);
                this.field6798 = this.field6790;
                while (arg1 > 0) {
                    int var11 = this.field6781.method683(arg3, 0, arg0, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field6790 += (long) var11;
                    arg3 += var11;
                    this.field6798 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method2854((byte) 70);
                int var10 = arg1;
                if (arg1 > this.field6792) {
                    var10 = this.field6792;
                }
                class224.method1539(this.field6788, 0, arg0, arg3, var10);
                arg3 += var10;
                arg1 -= var10;
                this.field6790 += (long) var10;
            }
            if ((long) arg2 != this.field6797) {
                if (this.field6790 < this.field6797 && arg1 > 0) {
                    int var12 = (int) (this.field6797 - this.field6790) + arg3;
                    if (var12 > (arg3 + arg1)) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field6790++;
                    }
                }
                long var13 = -1L;
                if (this.field6797 >= var5 && ((long) var8 + var5) > this.field6797) {
                    var13 = this.field6797;
                } else if (var5 >= this.field6797 && var5 < (long) this.field6786 + this.field6797) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field6786 + this.field6797 > var5 && ((long) var8 + var5) >= (this.field6797 + ((long) this.field6786))) {
                    var15 = (long) this.field6786 + this.field6797;
                } else if (this.field6797 < var5 + ((long) var8) && var5 + ((long) var8) <= (long) this.field6786 + this.field6797) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class224.method1539(this.field6779, (int) (var13 - this.field6797), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field6790 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field6790));
                        this.field6790 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6798 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    private final void method2846(int arg0) throws IOException {
        field6794++;
        if (arg0 != 31838 || this.field6797 == -1L) {
            return;
        }
        if (this.field6798 != this.field6797) {
            this.field6781.method682(104, this.field6797);
            this.field6798 = this.field6797;
        }
        this.field6781.method684(0, this.field6786, 33, this.field6779);
        this.field6798 += (long) this.field6786;
        if (this.field6798 > this.field6796) {
            this.field6796 = this.field6798;
        }
        long var2 = -1L;
        if (this.field6793 <= this.field6797 && ((long) this.field6792 + this.field6793) > this.field6797) {
            var2 = this.field6797;
        } else if (this.field6797 <= this.field6793 && (this.field6797 + ((long) this.field6786)) > this.field6793) {
            var2 = this.field6793;
        }
        long var4 = -1L;
        if (this.field6797 + ((long) this.field6786) > this.field6793 && (this.field6797 + ((long) this.field6786)) <= (this.field6793 + ((long) this.field6792))) {
            var4 = (long) this.field6786 + this.field6797;
        } else if (this.field6797 < (long) this.field6792 + this.field6793 && ((long) this.field6792 + this.field6793) <= ((long) this.field6786 + this.field6797)) {
            var4 = (long) this.field6792 + this.field6793;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class224.method1539(this.field6779, (int) (var2 - this.field6797), this.field6788, (int) (var2 - this.field6793), var6);
        }
        this.field6797 = -1L;
        this.field6786 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BI)V")
    public final void method2847(byte[] arg0, int arg1) throws IOException {
        this.method2845(arg0, arg0.length, -1, 0);
        field6800++;
        if (arg1 != 2) {
            method2852(68, (byte) 16, (class108) null);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)J")
    public final long method2848(int arg0) {
        if (arg0 == 19284) {
            field6780++;
            return this.field6787;
        } else {
            return -42L;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIBI)V")
    public final void method2849(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field6782++;
        try {
            if (arg2 > -28) {
                this.method2851(-47);
            }
            if (((long) arg1 + this.field6790) > this.field6787) {
                this.field6787 = this.field6790 + ((long) arg1);
            }
            if (this.field6797 != -1L && (this.field6797 > this.field6790 || (this.field6797 + ((long) this.field6786)) < this.field6790)) {
                this.method2846(31838);
            }
            if (this.field6797 != -1L && (this.field6797 + ((long) this.field6779.length)) < ((long) arg1 + this.field6790)) {
                int var5 = (int) ((long) this.field6779.length + this.field6797 - this.field6790);
                class224.method1539(arg0, arg3, this.field6779, (int) (this.field6790 - this.field6797), var5);
                arg1 -= var5;
                arg3 += var5;
                this.field6790 += (long) var5;
                this.field6786 = this.field6779.length;
                this.method2846(31838);
            }
            if (arg1 > this.field6779.length) {
                if (this.field6798 != this.field6790) {
                    this.field6781.method682(126, this.field6790);
                    this.field6798 = this.field6790;
                }
                this.field6781.method684(arg3, arg1, 47, arg0);
                this.field6798 += (long) arg1;
                if (this.field6796 < this.field6798) {
                    this.field6796 = this.field6798;
                }
                long var6 = -1L;
                if (this.field6793 <= this.field6790 && ((long) this.field6792 + this.field6793) > this.field6790) {
                    var6 = this.field6790;
                } else if (this.field6793 >= this.field6790 && this.field6790 + ((long) arg1) > this.field6793) {
                    var6 = this.field6793;
                }
                long var8 = -1L;
                if ((long) arg1 + this.field6790 > this.field6793 && (long) this.field6792 + this.field6793 >= (long) arg1 + this.field6790) {
                    var8 = (long) arg1 + this.field6790;
                } else if (this.field6790 < (long) this.field6792 + this.field6793 && this.field6793 + ((long) this.field6792) <= (long) arg1 + this.field6790) {
                    var8 = this.field6793 + ((long) this.field6792);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class224.method1539(arg0, (int) ((long) arg3 - (this.field6790 - var6)), this.field6788, (int) (var6 - this.field6793), var10);
                }
                this.field6790 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field6797 == -1L) {
                    this.field6797 = this.field6790;
                }
                class224.method1539(arg0, arg3, this.field6779, (int) (this.field6790 - this.field6797), arg1);
                this.field6790 += (long) arg1;
                if ((this.field6790 - this.field6797) > ((long) this.field6786)) {
                    this.field6786 = (int) (this.field6790 - this.field6797);
                }
            }
        } catch (IOException var12) {
            this.field6798 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public static void method2850(int arg0) {
        if (arg0 != 8) {
            method2852(12, (byte) 73, (class108) null);
        }
        field6785 = null;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method2851(int arg0) {
        if (arg0 != -1) {
            this.field6792 = -71;
        }
        field6789++;
        return this.field6781.method680(1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLge;)V")
    public static final void method2852(int arg0, byte arg1, class108 arg2) {
        field6784++;
        boolean var3 = arg2.method773(1, (byte) -112) == 1;
        if (var3) {
            class178.field2491[class367.field5309++] = arg0;
        }
        int var4 = arg2.method773(2, (byte) 125);
        class380 var5 = class455.field6731[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field5562 = -1;
            } else if (class420.field6085 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class393.field5727[arg0] = (var5.field784[0] + class134.field1846 >> 6) + ((var5.field4960 << 28) + (var5.field793[0] + class28.field399 >> 6 << 14));
                if (var5.field5568 == -1) {
                    class465.field6852[arg0] = var5.field705.method1672(10319);
                } else {
                    class465.field6852[arg0] = var5.field5568;
                }
                class18.field294[arg0] = var5.field709;
                if (var5.field5560 > 0) {
                    class411.method2551(var5, 2);
                }
                class455.field6731[arg0] = null;
                if (arg2.method773(1, (byte) 18) != 0) {
                    class411.method2554(arg2, -1234547605, arg0);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg2.method773(3, (byte) -125);
            int var7 = var5.field793[0];
            int var8 = var5.field784[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var8++;
                var7--;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field5562 = var7;
                var5.field5552 = var8;
            } else {
                var5.field5562 = -1;
                var5.method2411(var8, 0, class411.field5914[arg0], var7);
            }
        } else if (var4 == 2) {
            int var9 = arg2.method773(4, (byte) -120);
            int var10 = var5.field793[0];
            int var11 = var5.field784[0];
            if (var9 == 0) {
                var10 -= 2;
                var11 -= 2;
            } else if (var9 == 1) {
                var11 -= 2;
                var10--;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var11 -= 2;
                var10 += 2;
            } else if (var9 == 5) {
                var10 -= 2;
                var11--;
            } else if (var9 == 6) {
                var10 += 2;
                var11--;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var10 -= 2;
                var11++;
            } else if (var9 == 10) {
                var11++;
                var10 += 2;
            } else if (var9 == 11) {
                var11 += 2;
                var10 -= 2;
            } else if (var9 == 12) {
                var11 += 2;
                var10--;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var10++;
                var11 += 2;
            } else if (var9 == 15) {
                var11 += 2;
                var10 += 2;
            }
            if (var3) {
                var5.field5562 = var10;
                var5.field5552 = var11;
            } else {
                var5.field5562 = -1;
                var5.method2411(var11, 0, class411.field5914[arg0], var10);
            }
        } else {
            int var12 = arg2.method773(1, (byte) 123);
            if (var12 == 0) {
                int var13 = arg2.method773(12, (byte) 68);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field793[0] + var15;
                int var18 = var5.field784[0] + var16;
                if (var3) {
                    var5.field5562 = var17;
                    var5.field5552 = var18;
                } else {
                    var5.field5562 = -1;
                    var5.method2411(var18, 0, class411.field5914[arg0], var17);
                }
                var5.field4960 = (byte) (var5.field4960 + var14 & 0x3);
                if (class420.field6085 == arg0) {
                    class423.field6117 = var5.field4960;
                }
            } else {
                if (arg1 < 124) {
                    method2850(5);
                }
                int var19 = arg2.method773(30, (byte) 22);
                int var20 = var19 >> 28;
                int var21 = (var19 & 0xFFFE25C) >> 14;
                int var22 = var19 & 0x3FFF;
                int var23 = (class28.field399 + var21 + var5.field793[0] & 0x3FFF) - class28.field399;
                int var24 = (class134.field1846 + var22 + var5.field784[0] & 0x3FFF) - class134.field1846;
                if (var3) {
                    var5.field5562 = var23;
                    var5.field5552 = var24;
                } else {
                    var5.field5562 = -1;
                    var5.method2411(var24, 0, class411.field5914[arg0], var23);
                }
                var5.field4960 = (byte) (var5.field4960 + var20 & 0x3);
                if (class420.field6085 == arg0) {
                    class423.field6117 = var5.field4960;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JZ)V")
    public final void method2853(long arg0, boolean arg1) throws IOException {
        field6799++;
        if (arg1) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2851(-1));
        }
        this.field6790 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    private final void method2854(byte arg0) throws IOException {
        this.field6792 = 0;
        field6795++;
        if (this.field6798 != this.field6790) {
            this.field6781.method682(arg0 ^ 0xFFFFFF84, this.field6790);
            this.field6798 = this.field6790;
        }
        this.field6793 = this.field6790;
        if (arg0 != 70) {
            method2850(-30);
        }
        while (this.field6788.length > this.field6792) {
            int var2 = this.field6788.length - this.field6792;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6781.method683(this.field6792, arg0 - 70, this.field6788, var2);
            if (var3 == -1) {
                break;
            }
            this.field6798 += (long) var3;
            this.field6792 += var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V")
    public static final void method2855(boolean arg0, byte arg1) {
        if (arg1 >= -10) {
            return;
        }
        field6783++;
        if (class313.field4594 != arg0) {
            class313.field4594 = arg0;
            class373.method2373(19);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lri;II)V")
    public class459(class101 arg0, int arg1, int arg2) throws IOException {
        this.field6781 = arg0;
        this.field6787 = this.field6796 = arg0.method679((byte) 95);
        this.field6788 = new byte[arg1];
        this.field6790 = 0L;
        this.field6779 = new byte[arg2];
    }
}
