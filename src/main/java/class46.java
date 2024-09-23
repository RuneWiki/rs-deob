import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RRDZGTNX")
public class class46 {

    @OriginalMember(owner = "RRDZGTNX", name = "a", descriptor = "B")
    private byte field1388 = 0;

    @OriginalMember(owner = "RRDZGTNX", name = "b", descriptor = "I")
    private int field1389 = -6346;

    @OriginalMember(owner = "RRDZGTNX", name = "h", descriptor = "I")
    public int field1395 = 65000;

    @OriginalMember(owner = "RRDZGTNX", name = "g", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "RRDZGTNX", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1392;

    @OriginalMember(owner = "RRDZGTNX", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1393;

    @OriginalMember(owner = "RRDZGTNX", name = "d", descriptor = "[B")
    public static byte[] field1391 = new byte[520];

    @OriginalMember(owner = "RRDZGTNX", name = "c", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "RRDZGTNX", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
    public class46(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
        if (arg1 != -10687) {
            this.field1389 = -36;
        }
        this.field1394 = arg0;
        this.field1392 = arg2;
        this.field1393 = arg3;
        this.field1395 = arg4;
    }

    @OriginalMember(owner = "RRDZGTNX", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method446(int arg0, byte arg1) {
        if (arg1 != 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method449((byte) 8, arg0 * 6, this.field1393);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1393.read(field1391, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1391[2] & 0xFF) + ((field1391[0] & 0xFF) << 16) + ((field1391[1] & 0xFF) << 8);
            int var7 = (field1391[5] & 0xFF) + ((field1391[3] & 0xFF) << 16) + ((field1391[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1395) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1392.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method449((byte) 8, var7 * 520, this.field1392);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1392.read(field1391, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1391[0] & 0xFF) << 8) + (field1391[1] & 0xFF);
                    int var15 = ((field1391[2] & 0xFF) << 8) + (field1391[3] & 0xFF);
                    int var16 = (field1391[6] & 0xFF) + ((field1391[4] & 0xFF) << 16) + ((field1391[5] & 0xFF) << 8);
                    int var17 = field1391[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field1394 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1392.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1391[var18 + 8];
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

    @OriginalMember(owner = "RRDZGTNX", name = "a", descriptor = "(IB[BI)Z")
    public synchronized boolean method447(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (this.field1388 != arg1) {
            throw new NullPointerException();
        }
        boolean var5 = this.method448(arg2, arg0, true, -242, arg3);
        if (!var5) {
            var5 = this.method448(arg2, arg0, false, -242, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "RRDZGTNX", name = "a", descriptor = "([BIZII)Z")
    private synchronized boolean method448(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg2) {
                this.method449((byte) 8, arg1 * 6, this.field1393);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1393.read(field1391, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1391[5] & 0xFF) + ((field1391[3] & 0xFF) << 16) + ((field1391[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1392.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1392.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1391[0] = (byte) (arg4 >> 16);
            field1391[1] = (byte) (arg4 >> 8);
            field1391[2] = (byte) arg4;
            field1391[3] = (byte) (var9 >> 16);
            field1391[4] = (byte) (var9 >> 8);
            field1391[5] = (byte) var9;
            this.method449((byte) 8, arg1 * 6, this.field1393);
            this.field1393.write(field1391, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg2) {
                    this.method449((byte) 8, var9 * 520, this.field1392);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1392.read(field1391, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field1391[0] & 0xFF) << 8) + (field1391[1] & 0xFF);
                            int var16 = ((field1391[2] & 0xFF) << 8) + (field1391[3] & 0xFF);
                            var12 = (field1391[6] & 0xFF) + ((field1391[4] & 0xFF) << 16) + ((field1391[5] & 0xFF) << 8);
                            int var17 = field1391[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field1394 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1392.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field1392.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg4 - var10 <= 512) {
                    var12 = 0;
                }
                field1391[0] = (byte) (arg1 >> 8);
                field1391[1] = (byte) arg1;
                field1391[2] = (byte) (var11 >> 8);
                field1391[3] = (byte) var11;
                field1391[4] = (byte) (var12 >> 16);
                field1391[5] = (byte) (var12 >> 8);
                field1391[6] = (byte) var12;
                field1391[7] = (byte) this.field1394;
                this.method449((byte) 8, var9 * 520, this.field1392);
                this.field1392.write(field1391, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1392.write(arg0, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "RRDZGTNX", name = "a", descriptor = "(BILjava/io/RandomAccessFile;)V")
    public synchronized void method449(byte arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg2.seek((long) arg1);
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            this.field1390 = 154;
        }
    }
}
