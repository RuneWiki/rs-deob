import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TGFFTNFO")
public class class50 {

    @OriginalMember(owner = "TGFFTNFO", name = "b", descriptor = "I")
    private int field1443 = 511;

    @OriginalMember(owner = "TGFFTNFO", name = "c", descriptor = "Z")
    private boolean field1444 = true;

    @OriginalMember(owner = "TGFFTNFO", name = "h", descriptor = "I")
    public int field1449 = 65000;

    @OriginalMember(owner = "TGFFTNFO", name = "g", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "TGFFTNFO", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1446;

    @OriginalMember(owner = "TGFFTNFO", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1447;

    @OriginalMember(owner = "TGFFTNFO", name = "d", descriptor = "[B")
    public static byte[] field1445 = new byte[520];

    @OriginalMember(owner = "TGFFTNFO", name = "a", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "TGFFTNFO", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public class50(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        if (arg3 != 3) {
            this.field1444 = !this.field1444;
        }
        this.field1448 = arg0;
        this.field1446 = arg2;
        this.field1447 = arg4;
        this.field1449 = arg1;
    }

    @OriginalMember(owner = "TGFFTNFO", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method439(int arg0, byte arg1) {
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        try {
            this.method442(this.field1447, this.field1443, arg0 * 6);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1447.read(field1445, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1445[2] & 0xFF) + ((field1445[0] & 0xFF) << 16) + ((field1445[1] & 0xFF) << 8);
            int var7 = (field1445[5] & 0xFF) + ((field1445[3] & 0xFF) << 16) + ((field1445[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1449) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1446.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method442(this.field1446, this.field1443, var7 * 520);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1446.read(field1445, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1445[0] & 0xFF) << 8) + (field1445[1] & 0xFF);
                    int var15 = ((field1445[2] & 0xFF) << 8) + (field1445[3] & 0xFF);
                    int var16 = (field1445[6] & 0xFF) + ((field1445[4] & 0xFF) << 16) + ((field1445[5] & 0xFF) << 8);
                    int var17 = field1445[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field1448 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1446.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1445[var18 + 8];
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

    @OriginalMember(owner = "TGFFTNFO", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method440(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method441(arg2, arg3, true, arg1, 0);
        if (arg0 != -34312) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method441(arg2, arg3, false, arg1, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "TGFFTNFO", name = "a", descriptor = "(IIZ[BI)Z")
    private synchronized boolean method441(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg4 != 0) {
            this.field1442 = -474;
        }
        try {
            int var8;
            if (arg2) {
                this.method442(this.field1447, this.field1443, arg1 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1447.read(field1445, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1445[5] & 0xFF) + ((field1445[3] & 0xFF) << 16) + ((field1445[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1446.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1446.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1445[0] = (byte) (arg0 >> 16);
            field1445[1] = (byte) (arg0 >> 8);
            field1445[2] = (byte) arg0;
            field1445[3] = (byte) (var8 >> 16);
            field1445[4] = (byte) (var8 >> 8);
            field1445[5] = (byte) var8;
            this.method442(this.field1447, this.field1443, arg1 * 6);
            this.field1447.write(field1445, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg0) {
                int var11 = 0;
                if (arg2) {
                    this.method442(this.field1446, this.field1443, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1446.read(field1445, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1445[0] & 0xFF) << 8) + (field1445[1] & 0xFF);
                            int var15 = ((field1445[2] & 0xFF) << 8) + (field1445[3] & 0xFF);
                            var11 = (field1445[6] & 0xFF) + ((field1445[4] & 0xFF) << 16) + ((field1445[5] & 0xFF) << 8);
                            int var16 = field1445[7] & 0xFF;
                            if (arg1 == var14 && var10 == var15 && this.field1448 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1446.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg2 = false;
                    var11 = (int) ((this.field1446.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg0 - var9 <= 512) {
                    var11 = 0;
                }
                field1445[0] = (byte) (arg1 >> 8);
                field1445[1] = (byte) arg1;
                field1445[2] = (byte) (var10 >> 8);
                field1445[3] = (byte) var10;
                field1445[4] = (byte) (var11 >> 16);
                field1445[5] = (byte) (var11 >> 8);
                field1445[6] = (byte) var11;
                field1445[7] = (byte) this.field1448;
                this.method442(this.field1446, this.field1443, var8 * 520);
                this.field1446.write(field1445, 0, 8);
                int var17 = arg0 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1446.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "TGFFTNFO", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method442(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        int var4 = 23 / arg1;
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg2);
    }
}
