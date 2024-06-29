import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class224 {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "J")
    private long field3492 = -1L;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    private int field3496 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "J")
    private long field3508 = -1L;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Lth;")
    private class125 field3511;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "J")
    private long field3491;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "J")
    private long field3505;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
    private byte[] field3510;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "J")
    private long field3489;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[B")
    private byte[] field3494;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
    public static int[] field3495 = new int[] { -2, 0, 5, 0, 0, 0, 0, 15, 0, 10, 0, 0, 0, 10, 0, 6, 3, 5, 0, 0, 0, 0, 8, 8, -2, 0, -1, 2, 3, -1, 6, 0, 0, -1, 2, 0, 7, 0, 6, 0, 8, 1, 0, 0, 6, 0, 0, 0, -1, 28, 0, 12, -1, 0, 15, 0, 0, 0, 2, 0, -1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -1, 5, 0, -1, -1, 3, 2, 0, 6, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 20, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14, 7, 0, 0, 0, 0, 0, -1, 0, 12, 8, 0, 3, 1, 0, 1, 3, 8, 8, 0, 7, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 12, 0, 0, 0, 0, 2, 8, -2, 0, 0, -2, 6, 0, 0, 0, -2, 0, 6, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, -2, 4, 14, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 6, 0, -2, 3, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, -2, 0, 0, 12, 0, 12, 0, 9, 0, 0, 0, 0, 2, 6, 0, 0, 4, 1, 6, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 3, 0, 0, 2, 10, 1, 0, 0, 8, 0, -2, 7, 3, 0, 0, 11, -1, 0, 0, 4, -1, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    private int field3497;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "J")
    private long field3506;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lim;")
    public static class178 field3487;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    private final void method1473(byte arg0) throws IOException {
        if (this.field3492 != -1L) {
            if (this.field3506 != this.field3492) {
                this.field3511.method803(1, this.field3492);
                this.field3506 = this.field3492;
            }
            this.field3511.method798(this.field3494, (byte) -39, this.field3496, 0);
            this.field3506 += (long) this.field3496;
            if (this.field3506 > this.field3491) {
                this.field3491 = this.field3506;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3508 < (long) this.field3496 + this.field3492 && (this.field3492 + ((long) this.field3496)) <= (this.field3508 + ((long) this.field3497))) {
                var4 = (long) this.field3496 + this.field3492;
            } else if (this.field3492 < ((long) this.field3497 + this.field3508) && this.field3508 + ((long) this.field3497) <= this.field3492 - -((long) this.field3496)) {
                var4 = (long) this.field3497 + this.field3508;
            }
            if (this.field3492 >= this.field3508 && this.field3492 < (long) this.field3497 + this.field3508) {
                var2 = this.field3492;
            } else if (this.field3492 <= this.field3508 && (long) this.field3496 + this.field3492 > this.field3508) {
                var2 = this.field3508;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class285.method1880(this.field3494, (int) (var2 - this.field3492), this.field3510, (int) (var2 - this.field3508), var6);
            }
            this.field3492 = -1L;
            this.field3496 = 0;
        }
        field3485++;
        if (arg0 != 35) {
            method1483((String) null, true);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        field3487 = null;
        field3495 = null;
        if (arg0 <= 118) {
            method1483((String) null, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static final void method1475(byte arg0) {
        field3486++;
        class108.method687(67, false);
        System.gc();
        if (arg0 != 87) {
            method1483((String) null, false);
        }
        class82.method519(-119, 25);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)J")
    public final long method1476(int arg0) {
        if (arg0 == 6) {
            field3490++;
            return this.field3505;
        } else {
            return 61L;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    private final void method1477(byte arg0) throws IOException {
        this.field3497 = 0;
        field3498++;
        if (this.field3506 != this.field3489) {
            this.field3511.method803(1, this.field3489);
            this.field3506 = this.field3489;
        }
        if (arg0 != 72) {
            this.field3508 = -50L;
        }
        this.field3508 = this.field3489;
        while (this.field3497 < this.field3510.length) {
            int var2 = this.field3510.length - this.field3497;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3511.method801(this.field3497, this.field3510, (byte) 88, var2);
            if (var3 == -1) {
                break;
            }
            this.field3497 += var3;
            this.field3506 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1478(int arg0) {
        if (arg0 != 0) {
            this.field3489 = -20L;
        }
        field3499++;
        return this.field3511.method800(arg0 - 77);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[B)V")
    public final void method1479(int arg0, byte[] arg1) throws IOException {
        field3507++;
        this.method1484(arg1, (byte) 91, 0, arg1.length);
        if (arg0 != -5988) {
            this.field3510 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JZ)V")
    public final void method1480(long arg0, boolean arg1) throws IOException {
        if (!arg1) {
            method1475((byte) 44);
        }
        field3502++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1478(0));
        }
        this.field3489 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class51.method312(arg3, arg2 + arg7, arg0 + arg5);
        field3509++;
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3403D3) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class240 var13 = class265.method1717(55, var12);
            if (var13.field3771 == -1) {
                int var14 = arg1;
                if (var8 > 0L) {
                    var14 = arg4;
                }
                int[] var15 = class266.field4282;
                int var16 = (103 - arg0) * 512 * 4 + arg7 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class270.method1764(var13, (byte) 76, arg0, var10, arg7, arg5, arg2)) {
                return false;
            }
        }
        long var17 = class156.method970(arg3, arg2 + arg7, arg0 - -arg5);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class240 var22 = class265.method1717(arg6 - 27714, var21);
            if (var22.field3771 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class266.field4282;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = (103 - arg0) * 2048 + arg7 * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class270.method1764(var22, (byte) 123, arg0, var19, arg7, arg5, arg2)) {
                return false;
            }
        }
        long var26 = class169.method1079(arg3, arg2 + arg7, arg0 + arg5);
        if (arg6 != 27586) {
            field3503 = 65;
        }
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3B9468) >> 20;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class240 var30 = class265.method1717(-98, var29);
            if (var30.field3771 != -1 && !class270.method1764(var30, (byte) 99, arg0, var28, arg7, arg5, arg2)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII[B)V")
    public final void method1482(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3504++;
        if (!arg0) {
            this.field3492 = 27L;
        }
        try {
            if (this.field3505 < ((long) arg1 + this.field3489)) {
                this.field3505 = (long) arg1 + this.field3489;
            }
            if (this.field3492 != -1L && (this.field3489 < this.field3492 || this.field3492 + ((long) this.field3496) < this.field3489)) {
                this.method1473((byte) 35);
            }
            if (this.field3492 != -1L && ((long) arg1 + this.field3489) > ((long) this.field3494.length + this.field3492)) {
                int var5 = (int) (this.field3492 + (long) this.field3494.length - this.field3489);
                class285.method1880(arg3, arg2, this.field3494, (int) (this.field3489 - this.field3492), var5);
                this.field3489 += (long) var5;
                this.field3496 = this.field3494.length;
                arg2 += var5;
                arg1 -= var5;
                this.method1473((byte) 35);
            }
            if (arg1 > this.field3494.length) {
                if (this.field3506 != this.field3489) {
                    this.field3511.method803(1, this.field3489);
                    this.field3506 = this.field3489;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field3511.method798(arg3, (byte) -39, arg1, arg2);
                if ((this.field3489 + ((long) arg1)) > this.field3508 && (long) this.field3497 + this.field3508 >= this.field3489 - -((long) arg1)) {
                    var8 = this.field3489 + ((long) arg1);
                } else if (this.field3489 < ((long) this.field3497 + this.field3508) && ((long) this.field3497 + this.field3508) <= ((long) arg1 + this.field3489)) {
                    var8 = (long) this.field3497 + this.field3508;
                }
                if (this.field3508 <= this.field3489 && this.field3489 < (long) this.field3497 + this.field3508) {
                    var6 = this.field3489;
                } else if (this.field3489 <= this.field3508 && ((long) arg1 + this.field3489) > this.field3508) {
                    var6 = this.field3508;
                }
                this.field3506 += (long) arg1;
                if (this.field3491 < this.field3506) {
                    this.field3491 = this.field3506;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class285.method1880(arg3, (int) ((long) arg2 + var6 - this.field3489), this.field3510, (int) (var6 - this.field3508), var10);
                }
                this.field3489 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field3492 == -1L) {
                    this.field3492 = this.field3489;
                }
                class285.method1880(arg3, arg2, this.field3494, (int) (this.field3489 - this.field3492), arg1);
                this.field3489 += (long) arg1;
                if (this.field3489 - this.field3492 > (long) this.field3496) {
                    this.field3496 = (int) (this.field3489 - this.field3492);
                }
            }
        } catch (IOException var12) {
            this.field3506 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1483(String arg0, boolean arg1) {
        field3500++;
        if (!arg1) {
            method1474((byte) 29);
        }
        byte var2 = 2;
        int var3 = arg0.length();
        char[] var4 = new char[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var2 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var2 == 2 || Character.isUpperCase(var6)) {
                var6 = class182.method1160(var6, 89);
            }
            if (Character.isLetter(var6)) {
                var2 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var2 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBII)V")
    public final void method1484(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3501++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (arg1 <= 67) {
                method1483((String) null, false);
            }
            if (this.field3492 != -1L && this.field3489 >= this.field3492 && this.field3492 + ((long) this.field3496) >= (long) arg3 + this.field3489) {
                class285.method1880(this.field3494, (int) (this.field3489 - this.field3492), arg0, arg2, arg3);
                this.field3489 += (long) arg3;
                return;
            }
            long var5 = this.field3489;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field3489 >= this.field3508 && (long) this.field3497 + this.field3508 > this.field3489) {
                int var9 = (int) ((long) this.field3497 - (this.field3489 - this.field3508));
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class285.method1880(this.field3510, (int) (this.field3489 - this.field3508), arg0, arg2, var9);
                arg2 += var9;
                this.field3489 += (long) var9;
            }
            if (this.field3510.length < arg3) {
                this.field3511.method803(1, this.field3489);
                this.field3506 = this.field3489;
                while (arg3 > 0) {
                    int var10 = this.field3511.method801(arg2, arg0, (byte) 104, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3506 += (long) var10;
                    arg3 -= var10;
                    arg2 += var10;
                    this.field3489 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method1477((byte) 72);
                int var11 = arg3;
                if (this.field3497 < arg3) {
                    var11 = this.field3497;
                }
                arg3 -= var11;
                class285.method1880(this.field3510, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field3489 += (long) var11;
            }
            if (this.field3492 != -1L) {
                if (this.field3492 > this.field3489 && arg3 > 0) {
                    int var12 = (int) (this.field3492 - this.field3489) + arg2;
                    if ((arg2 + arg3) < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg2 < var12) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field3489++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3492 && var5 + ((long) var8) > this.field3492) {
                    var13 = this.field3492;
                } else if (this.field3492 <= var5 && var5 < ((long) this.field3496 + this.field3492)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((this.field3492 + ((long) this.field3496)) > var5 && (long) var8 + var5 >= (long) this.field3496 + this.field3492) {
                    var15 = (long) this.field3496 + this.field3492;
                } else if ((long) var8 + var5 > this.field3492 && this.field3492 + ((long) this.field3496) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class285.method1880(this.field3494, (int) (var13 - this.field3492), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field3489 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field3489));
                        this.field3489 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3506 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lth;II)V")
    public class224(class125 arg0, int arg1, int arg2) throws IOException {
        this.field3511 = arg0;
        this.field3505 = this.field3491 = arg0.method799(-20975);
        this.field3510 = new byte[arg1];
        this.field3489 = 0L;
        this.field3494 = new byte[arg2];
    }
}
