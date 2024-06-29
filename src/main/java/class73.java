import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class73 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "J")
    private long field1153 = -1L;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "J")
    private long field1158 = -1L;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    private int field1162 = 0;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Ldg;")
    private class168 field1161;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "J")
    private long field1160;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "J")
    private long field1163;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[B")
    private byte[] field1148;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[B")
    private byte[] field1150;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "J")
    private long field1147;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "J")
    private long field1146;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lmh;")
    public static class263 field1141;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI[BI)V")
    public final void method542(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1149++;
        try {
            if (arg3 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (!arg0) {
                method545(true, 26);
            }
            if (this.field1153 != -1L && this.field1147 >= this.field1153 && (long) arg1 + this.field1147 <= (long) this.field1162 + this.field1153) {
                class117.method880(this.field1150, (int) (this.field1147 - this.field1153), arg2, arg3, arg1);
                this.field1147 += (long) arg1;
                return;
            }
            long var5 = this.field1147;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field1147 >= this.field1158 && this.field1147 < (long) this.field1140 + this.field1158) {
                int var9 = (int) ((long) this.field1140 - (this.field1147 - this.field1158));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class117.method880(this.field1148, (int) (this.field1147 - this.field1158), arg2, arg3, var9);
                arg1 -= var9;
                this.field1147 += (long) var9;
                arg3 += var9;
            }
            if (this.field1148.length < arg1) {
                this.field1161.method1198(this.field1147, 0);
                this.field1146 = this.field1147;
                while (arg1 > 0) {
                    int var10 = this.field1161.method1201(arg3, false, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1146 += (long) var10;
                    arg1 -= var10;
                    this.field1147 += (long) var10;
                    arg3 += var10;
                }
            } else if (arg1 > 0) {
                this.method548(arg0);
                int var11 = arg1;
                if (this.field1140 < arg1) {
                    var11 = this.field1140;
                }
                arg1 -= var11;
                class117.method880(this.field1148, 0, arg2, arg3, var11);
                this.field1147 += (long) var11;
                arg3 += var11;
            }
            if (this.field1153 != -1L) {
                if (this.field1147 < this.field1153 && arg1 > 0) {
                    int var12 = (int) (this.field1153 - this.field1147) + arg3;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg1--;
                        this.field1147++;
                    }
                }
                long var13 = -1L;
                if (var5 < this.field1153 + ((long) this.field1162) && (long) this.field1162 + this.field1153 <= (long) var7 + var5) {
                    var13 = (long) this.field1162 + this.field1153;
                } else if (((long) var7 + var5) > this.field1153 && (long) var7 + var5 <= (long) this.field1162 + this.field1153) {
                    var13 = (long) var7 + var5;
                }
                long var15 = -1L;
                if (var5 <= this.field1153 && this.field1153 < ((long) var7 + var5)) {
                    var15 = this.field1153;
                } else if (this.field1153 <= var5 && var5 < (long) this.field1162 + this.field1153) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class117.method880(this.field1150, (int) (var15 - this.field1153), arg2, (int) (var15 - var5) + var8, var17);
                    if (var13 > this.field1147) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field1147));
                        this.field1147 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1146 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method543(int arg0) {
        field1151++;
        return arg0 == 0 ? this.field1161.method1199((byte) 98) : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method544(byte arg0) {
        if (arg0 != 67) {
            field1154 = -88;
        }
        class276.field4464.method1422((byte) -60);
        field1145++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V")
    public static final void method545(boolean arg0, int arg1) {
        class52.method316((byte) -125);
        field1159++;
        if (class98.field1677 != arg1 && class98.field1677 != 25) {
            return;
        }
        class258.field4003++;
        if (class258.field4003 < 50 && !arg0) {
            return;
        }
        class258.field4003 = 0;
        if (!class194.field2858 && class281.field4537 != null) {
            class293.field4650++;
            class144.field2338.method683(true, 137);
            try {
                class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                class144.field2338.field735 = 0;
            } catch (IOException var2) {
                class194.field2858 = true;
            }
        }
        class52.method316((byte) -110);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(JB)V")
    public final void method546(long arg0, byte arg1) throws IOException {
        field1155++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method543(0));
        }
        this.field1147 = arg0;
        if (arg1 < 125) {
            method550(-28);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    private final void method547(int arg0) throws IOException {
        if (this.field1153 != -1L) {
            if (this.field1153 != this.field1146) {
                this.field1161.method1198(this.field1153, 0);
                this.field1146 = this.field1153;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field1161.method1200(this.field1162, arg0 + 22977, this.field1150, 0);
            if ((long) this.field1162 + this.field1153 > this.field1158 && (long) this.field1140 + this.field1158 >= this.field1153 - -((long) this.field1162)) {
                var2 = this.field1153 + ((long) this.field1162);
            } else if (this.field1153 < ((long) this.field1140 + this.field1158) && ((long) this.field1140 + this.field1158) <= (this.field1153 + ((long) this.field1162))) {
                var2 = (long) this.field1140 + this.field1158;
            }
            this.field1146 += (long) this.field1162;
            if (this.field1160 < this.field1146) {
                this.field1160 = this.field1146;
            }
            if (this.field1153 >= this.field1158 && this.field1153 < this.field1158 + ((long) this.field1140)) {
                var4 = this.field1153;
            } else if (this.field1153 <= this.field1158 && ((long) this.field1162 + this.field1153) > this.field1158) {
                var4 = this.field1158;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class117.method880(this.field1150, (int) (var4 - this.field1153), this.field1148, (int) (var4 - this.field1158), var6);
            }
            this.field1153 = -1L;
            this.field1162 = 0;
        }
        if (arg0 == -22896) {
            field1157++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    private final void method548(boolean arg0) throws IOException {
        this.field1140 = 0;
        if (this.field1147 != this.field1146) {
            this.field1161.method1198(this.field1147, 0);
            this.field1146 = this.field1147;
        }
        if (!arg0) {
            this.field1161 = null;
        }
        this.field1158 = this.field1147;
        field1142++;
        while (this.field1148.length > this.field1140) {
            int var2 = this.field1148.length - this.field1140;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1161.method1201(this.field1140, false, this.field1148, var2);
            if (var3 == -1) {
                break;
            }
            this.field1140 += var3;
            this.field1146 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)J")
    public final long method549(byte arg0) {
        if (arg0 <= 121) {
            method544((byte) 2);
        }
        field1143++;
        return this.field1163;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1141 = null;
        if (arg0 >= -47) {
            field1154 = -124;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII)V")
    public final void method551(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1152++;
        try {
            if (this.field1163 < (this.field1147 + ((long) arg2))) {
                this.field1163 = this.field1147 + ((long) arg2);
            }
            if (this.field1153 != -1L && (this.field1147 < this.field1153 || ((long) this.field1162 + this.field1153) < this.field1147)) {
                this.method547(-22896);
            }
            if (this.field1153 != -1L && (long) arg2 + this.field1147 > (long) this.field1150.length + this.field1153) {
                int var5 = (int) (this.field1153 - (this.field1147 - (long) this.field1150.length));
                class117.method880(arg0, arg3, this.field1150, (int) (this.field1147 - this.field1153), var5);
                arg3 += var5;
                this.field1147 += (long) var5;
                arg2 -= var5;
                this.field1162 = this.field1150.length;
                this.method547(-22896);
            }
            if (arg1 > 121) {
                if (this.field1150.length < arg2) {
                    if (this.field1147 != this.field1146) {
                        this.field1161.method1198(this.field1147, 0);
                        this.field1146 = this.field1147;
                    }
                    long var6 = -1L;
                    this.field1161.method1200(arg2, 104, arg0, arg3);
                    this.field1146 += (long) arg2;
                    long var8 = -1L;
                    if (this.field1160 < this.field1146) {
                        this.field1160 = this.field1146;
                    }
                    if (this.field1147 >= this.field1158 && this.field1147 < ((long) this.field1140 + this.field1158)) {
                        var6 = this.field1147;
                    } else if (this.field1158 >= this.field1147 && this.field1158 < (long) arg2 + this.field1147) {
                        var6 = this.field1158;
                    }
                    if (this.field1147 + ((long) arg2) > this.field1158 && ((long) arg2 + this.field1147) <= ((long) this.field1140 + this.field1158)) {
                        var8 = (long) arg2 + this.field1147;
                    } else if (((long) this.field1140 + this.field1158) > this.field1147 && ((long) arg2 + this.field1147) >= (this.field1158 + ((long) this.field1140))) {
                        var8 = (long) this.field1140 + this.field1158;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class117.method880(arg0, (int) ((long) arg3 + var6 - this.field1147), this.field1148, (int) (var6 - this.field1158), var10);
                    }
                    this.field1147 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field1153 == -1L) {
                        this.field1153 = this.field1147;
                    }
                    class117.method880(arg0, arg3, this.field1150, (int) (this.field1147 - this.field1153), arg2);
                    this.field1147 += (long) arg2;
                    if (((long) this.field1162) < (this.field1147 - this.field1153)) {
                        this.field1162 = (int) (this.field1147 - this.field1153);
                    }
                }
            }
        } catch (IOException var12) {
            this.field1146 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)V")
    public final void method552(byte[] arg0, byte arg1) throws IOException {
        this.method542(true, arg0.length, arg0, 0);
        if (arg1 < -85) {
            field1139++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ldg;II)V")
    public class73(class168 arg0, int arg1, int arg2) throws IOException {
        this.field1161 = arg0;
        this.field1163 = this.field1160 = arg0.method1197(-125);
        this.field1148 = new byte[arg1];
        this.field1150 = new byte[arg2];
        this.field1147 = 0L;
    }
}
