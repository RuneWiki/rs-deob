import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UEKAQTXH")
public class class56 {

    @OriginalMember(owner = "client!UEKAQTXH", name = "e", descriptor = "I")
    public int field1485 = 65000;

    @OriginalMember(owner = "client!UEKAQTXH", name = "d", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!UEKAQTXH", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1482;

    @OriginalMember(owner = "client!UEKAQTXH", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1483;

    @OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "[B")
    public static byte[] field1481 = new byte[520];

    @OriginalMember(owner = "client!UEKAQTXH", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
    public class56(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field1484 = arg2;
        this.field1482 = arg3;
        this.field1483 = arg0;
        this.field1485 = arg1;
        if (arg4 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method527(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method530(arg1 * 6, this.field1483, false);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1483.read(field1481, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1481[2] & 0xFF) + ((field1481[0] & 0xFF) << 16) + ((field1481[1] & 0xFF) << 8);
            int var7 = (field1481[5] & 0xFF) + ((field1481[3] & 0xFF) << 16) + ((field1481[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1485) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1482.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method530(var7 * 520, this.field1482, false);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1482.read(field1481, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1481[0] & 0xFF) << 8) + (field1481[1] & 0xFF);
                    int var15 = ((field1481[2] & 0xFF) << 8) + (field1481[3] & 0xFF);
                    int var16 = (field1481[6] & 0xFF) + ((field1481[4] & 0xFF) << 16) + ((field1481[5] & 0xFF) << 8);
                    int var17 = field1481[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1484 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1482.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1481[var18 + 8];
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

    @OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(IB[BI)Z")
    public synchronized boolean method528(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 74) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = this.method529(110, arg3, arg2, arg0, true);
        if (!var6) {
            var6 = this.method529(110, arg3, arg2, arg0, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(II[BIZ)Z")
    private synchronized boolean method529(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        int var6 = 35 / arg0;
        try {
            int var9;
            if (arg4) {
                this.method530(arg1 * 6, this.field1483, false);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1483.read(field1481, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1481[5] & 0xFF) + ((field1481[3] & 0xFF) << 16) + ((field1481[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1482.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1482.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1481[0] = (byte) (arg3 >> 16);
            field1481[1] = (byte) (arg3 >> 8);
            field1481[2] = (byte) arg3;
            field1481[3] = (byte) (var9 >> 16);
            field1481[4] = (byte) (var9 >> 8);
            field1481[5] = (byte) var9;
            this.method530(arg1 * 6, this.field1483, false);
            this.field1483.write(field1481, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg4) {
                    this.method530(var9 * 520, this.field1482, false);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1482.read(field1481, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field1481[0] & 0xFF) << 8) + (field1481[1] & 0xFF);
                            int var16 = ((field1481[2] & 0xFF) << 8) + (field1481[3] & 0xFF);
                            var12 = (field1481[6] & 0xFF) + ((field1481[4] & 0xFF) << 16) + ((field1481[5] & 0xFF) << 8);
                            int var17 = field1481[7] & 0xFF;
                            if (arg1 == var15 && var11 == var16 && this.field1484 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1482.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg4 = false;
                    var12 = (int) ((this.field1482.length() + 519L) / 520L);
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
                field1481[0] = (byte) (arg1 >> 8);
                field1481[1] = (byte) arg1;
                field1481[2] = (byte) (var11 >> 8);
                field1481[3] = (byte) var11;
                field1481[4] = (byte) (var12 >> 16);
                field1481[5] = (byte) (var12 >> 8);
                field1481[6] = (byte) var12;
                field1481[7] = (byte) this.field1484;
                this.method530(var9 * 520, this.field1482, false);
                this.field1482.write(field1481, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1482.write(arg2, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "client!UEKAQTXH", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method530(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg1.seek((long) arg0);
        if (arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }
}
