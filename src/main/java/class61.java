import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VXBCLRCG")
public class class61 {

    @OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "Z")
    private boolean field1551 = true;

    @OriginalMember(owner = "client!VXBCLRCG", name = "h", descriptor = "I")
    public int field1557 = 65000;

    @OriginalMember(owner = "client!VXBCLRCG", name = "g", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!VXBCLRCG", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1554;

    @OriginalMember(owner = "client!VXBCLRCG", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1555;

    @OriginalMember(owner = "client!VXBCLRCG", name = "c", descriptor = "[B")
    public static byte[] field1553 = new byte[520];

    @OriginalMember(owner = "client!VXBCLRCG", name = "b", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!VXBCLRCG", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public class61(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field1556 = arg1;
        if (arg3 < 9 || arg3 > 9) {
            throw new NullPointerException();
        }
        this.field1554 = arg4;
        this.field1555 = arg0;
        this.field1557 = arg2;
    }

    @OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method529(byte arg0, int arg1) {
        if (arg0 != -11) {
            this.field1552 = -403;
        }
        try {
            this.method532(this.field1555, this.field1551, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1555.read(field1553, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1553[2] & 0xFF) + ((field1553[0] & 0xFF) << 16) + ((field1553[1] & 0xFF) << 8);
            int var6 = (field1553[5] & 0xFF) + ((field1553[3] & 0xFF) << 16) + ((field1553[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1557) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1554.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method532(this.field1554, this.field1551, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1554.read(field1553, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1553[0] & 0xFF) << 8) + (field1553[1] & 0xFF);
                    int var14 = ((field1553[2] & 0xFF) << 8) + (field1553[3] & 0xFF);
                    int var15 = (field1553[6] & 0xFF) + ((field1553[4] & 0xFF) << 16) + ((field1553[5] & 0xFF) << 8);
                    int var16 = field1553[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1556 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1554.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1553[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method530(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = this.method531(arg0, 0, true, arg2, arg1);
        if (!var6) {
            var6 = this.method531(arg0, 0, false, arg2, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(IIZ[BI)Z")
    private synchronized boolean method531(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg2) {
                this.method532(this.field1555, this.field1551, arg0 * 6);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1555.read(field1553, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1553[5] & 0xFF) + ((field1553[3] & 0xFF) << 16) + ((field1553[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1554.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1554.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1553[0] = (byte) (arg4 >> 16);
            field1553[1] = (byte) (arg4 >> 8);
            field1553[2] = (byte) arg4;
            field1553[3] = (byte) (var9 >> 16);
            field1553[4] = (byte) (var9 >> 8);
            field1553[5] = (byte) var9;
            this.method532(this.field1555, this.field1551, arg0 * 6);
            this.field1555.write(field1553, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg4) {
                int var12 = 0;
                if (arg2) {
                    this.method532(this.field1554, this.field1551, var9 * 520);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1554.read(field1553, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field1553[0] & 0xFF) << 8) + (field1553[1] & 0xFF);
                            int var16 = ((field1553[2] & 0xFF) << 8) + (field1553[3] & 0xFF);
                            var12 = (field1553[6] & 0xFF) + ((field1553[4] & 0xFF) << 16) + ((field1553[5] & 0xFF) << 8);
                            int var17 = field1553[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field1556 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1554.length() / 520L) {
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
                    var12 = (int) ((this.field1554.length() + 519L) / 520L);
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
                field1553[0] = (byte) (arg0 >> 8);
                field1553[1] = (byte) arg0;
                field1553[2] = (byte) (var11 >> 8);
                field1553[3] = (byte) var11;
                field1553[4] = (byte) (var12 >> 16);
                field1553[5] = (byte) (var12 >> 8);
                field1553[6] = (byte) var12;
                field1553[7] = (byte) this.field1556;
                this.method532(this.field1554, this.field1551, var9 * 520);
                this.field1554.write(field1553, 0, 8);
                int var18 = arg4 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1554.write(arg3, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "client!VXBCLRCG", name = "a", descriptor = "(Ljava/io/RandomAccessFile;ZI)V")
    public synchronized void method532(RandomAccessFile arg0, boolean arg1, int arg2) throws IOException {
        if (!arg1) {
            this.field1552 = 98;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg2);
    }
}
