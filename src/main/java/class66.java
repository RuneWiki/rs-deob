import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YFAYUBGF")
public class class66 {

    @OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "Z")
    private boolean field1707 = false;

    @OriginalMember(owner = "client!YFAYUBGF", name = "h", descriptor = "I")
    public int field1713 = 65000;

    @OriginalMember(owner = "client!YFAYUBGF", name = "g", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!YFAYUBGF", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1710;

    @OriginalMember(owner = "client!YFAYUBGF", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1711;

    @OriginalMember(owner = "client!YFAYUBGF", name = "c", descriptor = "[B")
    public static byte[] field1709 = new byte[520];

    @OriginalMember(owner = "client!YFAYUBGF", name = "b", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!YFAYUBGF", name = "<init>", descriptor = "(IZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
    public class66(int arg0, boolean arg1, int arg2, RandomAccessFile arg3, RandomAccessFile arg4) {
        this.field1712 = arg2;
        this.field1710 = arg3;
        this.field1711 = arg4;
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1713 = arg0;
    }

    @OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method568(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method571(arg0 * 6, this.field1711, 0);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1711.read(field1709, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1709[2] & 0xFF) + ((field1709[0] & 0xFF) << 16) + ((field1709[1] & 0xFF) << 8);
            int var7 = (field1709[5] & 0xFF) + ((field1709[3] & 0xFF) << 16) + ((field1709[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1713) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1710.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method571(var7 * 520, this.field1710, 0);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1710.read(field1709, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1709[0] & 0xFF) << 8) + (field1709[1] & 0xFF);
                    int var15 = ((field1709[2] & 0xFF) << 8) + (field1709[3] & 0xFF);
                    int var16 = (field1709[6] & 0xFF) + ((field1709[4] & 0xFF) << 16) + ((field1709[5] & 0xFF) << 8);
                    int var17 = field1709[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field1712 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1710.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1709[var18 + 8];
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

    @OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(Z[BII)Z")
    public synchronized boolean method569(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = this.method570(arg3, true, arg2, (byte) -43, arg1);
        if (!var6) {
            var6 = this.method570(arg3, false, arg2, (byte) -43, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(IZIB[B)Z")
    private synchronized boolean method570(int arg0, boolean arg1, int arg2, byte arg3, byte[] arg4) {
        if (arg3 != -43) {
            this.field1707 = !this.field1707;
        }
        try {
            int var8;
            if (arg1) {
                this.method571(arg0 * 6, this.field1711, 0);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1711.read(field1709, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1709[5] & 0xFF) + ((field1709[3] & 0xFF) << 16) + ((field1709[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1710.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1710.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1709[0] = (byte) (arg2 >> 16);
            field1709[1] = (byte) (arg2 >> 8);
            field1709[2] = (byte) arg2;
            field1709[3] = (byte) (var8 >> 16);
            field1709[4] = (byte) (var8 >> 8);
            field1709[5] = (byte) var8;
            this.method571(arg0 * 6, this.field1711, 0);
            this.field1711.write(field1709, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg1) {
                    this.method571(var8 * 520, this.field1710, 0);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1710.read(field1709, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field1709[0] & 0xFF) << 8) + (field1709[1] & 0xFF);
                            int var15 = ((field1709[2] & 0xFF) << 8) + (field1709[3] & 0xFF);
                            var11 = (field1709[6] & 0xFF) + ((field1709[4] & 0xFF) << 16) + ((field1709[5] & 0xFF) << 8);
                            int var16 = field1709[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field1712 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1710.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg1 = false;
                    var11 = (int) ((this.field1710.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg2 - var9 <= 512) {
                    var11 = 0;
                }
                field1709[0] = (byte) (arg0 >> 8);
                field1709[1] = (byte) arg0;
                field1709[2] = (byte) (var10 >> 8);
                field1709[3] = (byte) var10;
                field1709[4] = (byte) (var11 >> 16);
                field1709[5] = (byte) (var11 >> 8);
                field1709[6] = (byte) var11;
                field1709[7] = (byte) this.field1712;
                this.method571(var8 * 520, this.field1710, 0);
                this.field1710.write(field1709, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1710.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!YFAYUBGF", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
    public synchronized void method571(int arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
        if (this.field1708 != arg2) {
            this.field1708 = 129;
        }
    }
}
