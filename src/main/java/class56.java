import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSBCWAVP")
public class class56 {

    @OriginalMember(owner = "VSBCWAVP", name = "a", descriptor = "Z")
    private boolean field1460 = false;

    @OriginalMember(owner = "VSBCWAVP", name = "b", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "VSBCWAVP", name = "g", descriptor = "I")
    public int field1466 = 65000;

    @OriginalMember(owner = "VSBCWAVP", name = "f", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "VSBCWAVP", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1463;

    @OriginalMember(owner = "VSBCWAVP", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1464;

    @OriginalMember(owner = "VSBCWAVP", name = "c", descriptor = "[B")
    public static byte[] field1462 = new byte[520];

    @OriginalMember(owner = "VSBCWAVP", name = "<init>", descriptor = "(IBILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
    public class56(int arg0, byte arg1, int arg2, RandomAccessFile arg3, RandomAccessFile arg4) {
        this.field1465 = arg0;
        this.field1463 = arg3;
        this.field1464 = arg4;
        if (arg1 != -31) {
            throw new NullPointerException();
        }
        this.field1466 = arg2;
    }

    @OriginalMember(owner = "VSBCWAVP", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method533(byte arg0, int arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        try {
            this.method536(arg1 * 6, false, this.field1464);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1464.read(field1462, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1462[2] & 0xFF) + ((field1462[0] & 0xFF) << 16) + ((field1462[1] & 0xFF) << 8);
            int var7 = (field1462[5] & 0xFF) + ((field1462[3] & 0xFF) << 16) + ((field1462[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1466) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1463.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method536(var7 * 520, false, this.field1463);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1463.read(field1462, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1462[0] & 0xFF) << 8) + (field1462[1] & 0xFF);
                    int var15 = ((field1462[2] & 0xFF) << 8) + (field1462[3] & 0xFF);
                    int var16 = (field1462[6] & 0xFF) + ((field1462[4] & 0xFF) << 16) + ((field1462[5] & 0xFF) << 8);
                    int var17 = field1462[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1465 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1463.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1462[var18 + 8];
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

    @OriginalMember(owner = "VSBCWAVP", name = "a", descriptor = "(IB[BI)Z")
    public synchronized boolean method534(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != -124) {
            this.field1461 = !this.field1461;
        }
        boolean var5 = this.method535(arg2, arg3, arg0, this.field1460, true);
        if (!var5) {
            var5 = this.method535(arg2, arg3, arg0, this.field1460, false);
        }
        return var5;
    }

    @OriginalMember(owner = "VSBCWAVP", name = "a", descriptor = "([BIIZZ)Z")
    private synchronized boolean method535(byte[] arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg3) {
            this.field1460 = !this.field1460;
        }
        try {
            int var8;
            if (arg4) {
                this.method536(arg1 * 6, false, this.field1464);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1464.read(field1462, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1462[5] & 0xFF) + ((field1462[3] & 0xFF) << 16) + ((field1462[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1463.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1463.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1462[0] = (byte) (arg2 >> 16);
            field1462[1] = (byte) (arg2 >> 8);
            field1462[2] = (byte) arg2;
            field1462[3] = (byte) (var8 >> 16);
            field1462[4] = (byte) (var8 >> 8);
            field1462[5] = (byte) var8;
            this.method536(arg1 * 6, false, this.field1464);
            this.field1464.write(field1462, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg4) {
                    this.method536(var8 * 520, false, this.field1463);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1463.read(field1462, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field1462[0] & 0xFF) << 8) + (field1462[1] & 0xFF);
                            int var15 = ((field1462[2] & 0xFF) << 8) + (field1462[3] & 0xFF);
                            var11 = (field1462[6] & 0xFF) + ((field1462[4] & 0xFF) << 16) + ((field1462[5] & 0xFF) << 8);
                            int var16 = field1462[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field1465 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1463.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field1463.length() + 519L) / 520L);
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
                field1462[0] = (byte) (arg1 >> 8);
                field1462[1] = (byte) arg1;
                field1462[2] = (byte) (var10 >> 8);
                field1462[3] = (byte) var10;
                field1462[4] = (byte) (var11 >> 16);
                field1462[5] = (byte) (var11 >> 8);
                field1462[6] = (byte) var11;
                field1462[7] = (byte) this.field1465;
                this.method536(var8 * 520, false, this.field1463);
                this.field1463.write(field1462, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1463.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "VSBCWAVP", name = "a", descriptor = "(IZLjava/io/RandomAccessFile;)V")
    public synchronized void method536(int arg0, boolean arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg2.seek((long) arg0);
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }
}
