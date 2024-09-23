import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EEVNVHNQ")
public class class14 {

    @OriginalMember(owner = "EEVNVHNQ", name = "a", descriptor = "Z")
    private boolean field683 = false;

    @OriginalMember(owner = "EEVNVHNQ", name = "b", descriptor = "I")
    private int field684 = 258;

    @OriginalMember(owner = "EEVNVHNQ", name = "h", descriptor = "I")
    public int field689 = 65000;

    @OriginalMember(owner = "EEVNVHNQ", name = "g", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "EEVNVHNQ", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field686;

    @OriginalMember(owner = "EEVNVHNQ", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field687;

    @OriginalMember(owner = "EEVNVHNQ", name = "c", descriptor = "[B")
    public static byte[] field685 = new byte[520];

    @OriginalMember(owner = "EEVNVHNQ", name = "<init>", descriptor = "(ZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
    public class14(boolean arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field688 = arg1;
        this.field686 = arg3;
        this.field687 = arg2;
        this.field689 = arg4;
    }

    @OriginalMember(owner = "EEVNVHNQ", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method245(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method248(this.field687, arg0 * 6, (byte) 6);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field687.read(field685, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field685[2] & 0xFF) + ((field685[0] & 0xFF) << 16) + ((field685[1] & 0xFF) << 8);
            int var7 = (field685[5] & 0xFF) + ((field685[3] & 0xFF) << 16) + ((field685[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field689) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field686.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method248(this.field686, var7 * 520, (byte) 6);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field686.read(field685, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field685[0] & 0xFF) << 8) + (field685[1] & 0xFF);
                    int var15 = ((field685[2] & 0xFF) << 8) + (field685[3] & 0xFF);
                    int var16 = (field685[6] & 0xFF) + ((field685[4] & 0xFF) << 16) + ((field685[5] & 0xFF) << 8);
                    int var17 = field685[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field688 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field686.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field685[var18 + 8];
                            }
                            var7 = var16;
                            var10++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var8;
            } else {
                return null;
            }
        } catch (IOException var19) {
            return null;
        }
    }

    @OriginalMember(owner = "EEVNVHNQ", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method246(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method247((byte) 9, arg3, true, arg2, arg1);
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method247((byte) 9, arg3, false, arg2, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "EEVNVHNQ", name = "a", descriptor = "(BIZI[B)Z")
    private synchronized boolean method247(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg0 == 9) {
            boolean var6 = false;
        } else {
            this.field684 = 445;
        }
        try {
            int var9;
            if (arg2) {
                this.method248(this.field687, arg1 * 6, (byte) 6);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field687.read(field685, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field685[5] & 0xFF) + ((field685[3] & 0xFF) << 16) + ((field685[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field686.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field686.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field685[0] = (byte) (arg3 >> 16);
            field685[1] = (byte) (arg3 >> 8);
            field685[2] = (byte) arg3;
            field685[3] = (byte) (var9 >> 16);
            field685[4] = (byte) (var9 >> 8);
            field685[5] = (byte) var9;
            this.method248(this.field687, arg1 * 6, (byte) 6);
            this.field687.write(field685, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg2) {
                    this.method248(this.field686, var9 * 520, (byte) 6);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field686.read(field685, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label111: {
                            int var15 = ((field685[0] & 0xFF) << 8) + (field685[1] & 0xFF);
                            int var16 = ((field685[2] & 0xFF) << 8) + (field685[3] & 0xFF);
                            var12 = (field685[6] & 0xFF) + ((field685[4] & 0xFF) << 16) + ((field685[5] & 0xFF) << 8);
                            int var17 = field685[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field688 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field686.length() / 520L) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field686.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg3 - var10 <= 512) {
                    var12 = 0;
                }
                field685[0] = (byte) (arg1 >> 8);
                field685[1] = (byte) arg1;
                field685[2] = (byte) (var11 >> 8);
                field685[3] = (byte) var11;
                field685[4] = (byte) (var12 >> 16);
                field685[5] = (byte) (var12 >> 8);
                field685[6] = (byte) var12;
                field685[7] = (byte) this.field688;
                this.method248(this.field686, var9 * 520, (byte) 6);
                this.field686.write(field685, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field686.write(arg4, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "EEVNVHNQ", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
    public synchronized void method248(RandomAccessFile arg0, int arg1, byte arg2) throws IOException {
        if (arg2 == 6) {
            boolean var4 = false;
        } else {
            this.field683 = !this.field683;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
    }
}
