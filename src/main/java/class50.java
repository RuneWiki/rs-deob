import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class50 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "J")
    private long field613 = -1L;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
    private long field620 = -1L;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field631 = 0;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lfk;")
    private class51 field616;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "J")
    private long field615;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "J")
    private long field618;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[B")
    private byte[] field621;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "J")
    private long field628;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[B")
    private byte[] field617;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    public static int[] field626 = new int[256];

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field629 = "Use";

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "J")
    private long field614;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[[[B")
    public static byte[][][] field625;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JB)V", line = 5)
    public final void method301(long arg0, byte arg1) throws IOException {
        field622++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method309(true));
        }
        this.field628 = arg0;
        if (arg1 != 45) {
            method302(false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 22)
    public static void method302(boolean arg0) {
        field626 = null;
        if (!arg0) {
            field625 = (byte[][][]) null;
            field629 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 42)
    private final void method303(byte arg0) throws IOException {
        field612++;
        if (arg0 != -87) {
            this.method306((byte) -110);
        }
        this.field630 = 0;
        if (this.field628 != this.field614) {
            this.field616.method317(this.field628, (byte) -127);
            this.field614 = this.field628;
        }
        this.field620 = this.field628;
        while (this.field621.length > this.field630) {
            int var2 = this.field621.length - this.field630;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field616.method312(var2, this.field621, this.field630, (byte) 114);
            if (var3 == -1) {
                break;
            }
            this.field614 += (long) var3;
            this.field630 += var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIILfc;)V", line = 93)
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8) {
        field634++;
        int var9 = arg1 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg8.field3489;
            var11 = arg8.field3532;
        } else {
            var10 = arg8.field3532;
            var11 = arg8.field3489;
        }
        int var12;
        int var13;
        if ((arg0 + var10) > 104) {
            var12 = arg0 + 1;
            var13 = arg0;
        } else {
            var12 = (var10 + 1 >> 1) + arg0;
            var13 = arg0 + (var10 >> 1);
        }
        int var14;
        int var15;
        if ((arg3 + var11) <= 104) {
            var14 = (var11 + 1 >> 1) + arg3;
            var15 = (var11 >> 1) + arg3;
        } else {
            var15 = arg3;
            var14 = arg3 + 1;
        }
        int var16 = (arg3 << 7) + (var11 << 6);
        int var17 = (arg0 << 7) + (var10 << 6);
        int[][] var18 = class167.field2324[arg7];
        if (arg6 != 2) {
            field629 = (String) null;
        }
        int var19 = var18[var14][var13] + var18[var15][var13] - (-var18[var15][var12] - var18[var14][var12]) >> 2;
        int var20 = 0;
        if (arg7 != 0) {
            int[][] var21 = class167.field2324[0];
            var20 = var19 - (var21[var15][var13] + var21[var15][var12] + var21[var14][var12] + var21[var14][var13] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg7 < 3) {
            var22 = class167.field2324[arg7 + 1];
        }
        class42 var23 = arg8.method1701(var22, arg2, (byte) -85, var18, arg1, false, true, (class234) null, var19, var17, var16);
        class178.method1228(var23.field497, var16 - arg4, var20, var17 - arg5);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lfk;II)V", line = 648)
    public class50(class51 arg0, int arg1, int arg2) throws IOException {
        this.field616 = arg0;
        this.field618 = this.field615 = arg0.method314(-10662);
        this.field621 = new byte[arg1];
        this.field628 = 0L;
        this.field617 = new byte[arg2];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI[B)V", line = 182)
    public final void method305(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field632++;
        try {
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field613 != -1L && this.field628 >= this.field613 && ((long) arg2 + this.field628) <= ((long) this.field631 + this.field613)) {
                class86.method509(this.field617, (int) (this.field628 - this.field613), arg3, arg0, arg2);
                this.field628 += (long) arg2;
                return;
            }
            long var5 = this.field628;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field628 >= this.field620 && this.field620 + ((long) this.field630) > this.field628) {
                int var9 = (int) ((long) this.field630 + this.field620 - this.field628);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class86.method509(this.field621, (int) (this.field628 - this.field620), arg3, arg0, var9);
                arg0 += var9;
                this.field628 += (long) var9;
                arg2 -= var9;
            }
            if (this.field621.length < arg2) {
                this.field616.method317(this.field628, (byte) -120);
                this.field614 = this.field628;
                while (arg2 > 0) {
                    int var11 = this.field616.method312(arg2, arg3, arg0, (byte) 69);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 += var11;
                    this.field614 += (long) var11;
                    this.field628 += (long) var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method303((byte) -87);
                int var10 = arg2;
                if (arg2 > this.field630) {
                    var10 = this.field630;
                }
                arg2 -= var10;
                class86.method509(this.field621, 0, arg3, arg0, var10);
                arg0 += var10;
                this.field628 += (long) var10;
            }
            if (this.field613 != -1L) {
                if (this.field613 > this.field628 && arg2 > 0) {
                    int var12 = (int) (this.field613 - this.field628) + arg0;
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg2--;
                        arg3[arg0++] = 0;
                        this.field628++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field613 && (long) var7 + var5 > this.field613) {
                    var13 = this.field613;
                } else if (this.field613 <= var5 && var5 < (long) this.field631 + this.field613) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field631 + this.field613) > var5 && var5 + ((long) var7) >= (long) this.field631 + this.field613) {
                    var15 = this.field613 + ((long) this.field631);
                } else if (this.field613 < (long) var7 + var5 && (long) var7 + var5 <= this.field613 - -((long) this.field631)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class86.method509(this.field617, (int) (var13 - this.field613), arg3, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field628) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field628));
                        this.field628 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field614 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        } else if (!arg1) {
            this.field630 = -123;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)J", line = 368)
    public final long method306(byte arg0) {
        field624++;
        int var2 = -8 % ((arg0 + 41) / 58);
        return this.field618;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BI)V", line = 395)
    public final void method307(byte[] arg0, int arg1) throws IOException {
        this.method305(0, true, arg0.length, arg0);
        if (arg1 != -18762) {
            method304(-44, -59, -29, 108, -123, 112, -58, -117, (class238) null);
        }
        field636++;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V", line = 408)
    private final void method308(boolean arg0) throws IOException {
        field635++;
        if (this.field613 != -1L) {
            if (this.field614 != this.field613) {
                this.field616.method317(this.field613, (byte) -93);
                this.field614 = this.field613;
            }
            this.field616.method313((byte) -74, this.field617, 0, this.field631);
            this.field614 += (long) this.field631;
            long var2 = -1L;
            if (this.field620 <= this.field613 && this.field613 < ((long) this.field630 + this.field620)) {
                var2 = this.field613;
            } else if (this.field613 <= this.field620 && this.field620 < (this.field613 + ((long) this.field631))) {
                var2 = this.field620;
            }
            if (this.field615 < this.field614) {
                this.field615 = this.field614;
            }
            long var4 = -1L;
            if (this.field620 < this.field613 + ((long) this.field631) && ((long) this.field631 + this.field613) <= ((long) this.field630 + this.field620)) {
                var4 = this.field613 + ((long) this.field631);
            } else if ((long) this.field630 + this.field620 > this.field613 && this.field613 + ((long) this.field631) >= (long) this.field630 + this.field620) {
                var4 = this.field620 + ((long) this.field630);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class86.method509(this.field617, (int) (var2 - this.field613), this.field621, (int) (var2 - this.field620), var6);
            }
            this.field631 = 0;
            this.field613 = -1L;
        }
        if (!arg0) {
            method304(55, 38, 43, -116, -94, 21, -115, 7, (class238) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(Z)Ljava/io/File;", line = 486)
    private final File method309(boolean arg0) {
        field627++;
        return arg0 ? this.field616.method315((byte) -67) : (File) null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIBI)V", line = 506)
    public final void method310(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field633++;
        try {
            if (arg2 == 93) {
                if ((long) arg1 + this.field628 > this.field618) {
                    this.field618 = (long) arg1 + this.field628;
                }
                if (this.field613 != -1L && (this.field613 > this.field628 || (this.field613 + ((long) this.field631)) < this.field628)) {
                    this.method308(true);
                }
                if (this.field613 != -1L && (long) arg1 + this.field628 > (long) this.field617.length + this.field613) {
                    int var5 = (int) (this.field613 + (long) this.field617.length - this.field628);
                    arg1 -= var5;
                    class86.method509(arg0, arg3, this.field617, (int) (this.field628 - this.field613), var5);
                    this.field628 += (long) var5;
                    arg3 += var5;
                    this.field631 = this.field617.length;
                    this.method308(true);
                }
                if (this.field617.length < arg1) {
                    if (this.field628 != this.field614) {
                        this.field616.method317(this.field628, (byte) 21);
                        this.field614 = this.field628;
                    }
                    this.field616.method313((byte) -74, arg0, arg3, arg1);
                    this.field614 += (long) arg1;
                    if (this.field614 > this.field615) {
                        this.field615 = this.field614;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field628 >= this.field620 && this.field628 < (long) this.field630 + this.field620) {
                        var6 = this.field628;
                    } else if (this.field628 <= this.field620 && this.field620 < (long) arg1 + this.field628) {
                        var6 = this.field620;
                    }
                    if ((this.field628 + ((long) arg1)) > this.field620 && ((long) this.field630 + this.field620) >= ((long) arg1 + this.field628)) {
                        var8 = (long) arg1 + this.field628;
                    } else if ((long) this.field630 + this.field620 > this.field628 && (long) arg1 + this.field628 >= (long) this.field630 + this.field620) {
                        var8 = (long) this.field630 + this.field620;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class86.method509(arg0, (int) ((long) arg3 + var6 - this.field628), this.field621, (int) (var6 - this.field620), var10);
                    }
                    this.field628 += (long) arg1;
                } else if (arg1 > 0) {
                    if (this.field613 == -1L) {
                        this.field613 = this.field628;
                    }
                    class86.method509(arg0, arg3, this.field617, (int) (this.field628 - this.field613), arg1);
                    this.field628 += (long) arg1;
                    if (this.field628 - this.field613 > (long) this.field631) {
                        this.field631 = (int) (this.field628 - this.field613);
                    }
                }
            }
        } catch (IOException var12) {
            this.field614 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V", line = 629)
    public static final void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field619++;
        if (arg7 >= class109.field1494 && class56.field678 >= arg0 && class272.field4273 <= arg6 && class248.field3759 >= arg3) {
            class32.method193(0, arg1, arg3, arg6, arg2, arg4, arg7, arg0);
        } else {
            class339.method2352(true, arg3, arg2, arg0, arg7, arg6, arg1, arg4);
        }
        if (arg5 != 2) {
            field629 = (String) null;
        }
    }
}
