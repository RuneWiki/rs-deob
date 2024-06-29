import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YXBFJZDP")
public class class68 {

    @OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "Z")
    private boolean field1670 = false;

    @OriginalMember(owner = "client!YXBFJZDP", name = "f", descriptor = "I")
    public int field1675 = 65000;

    @OriginalMember(owner = "client!YXBFJZDP", name = "e", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!YXBFJZDP", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1672;

    @OriginalMember(owner = "client!YXBFJZDP", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1673;

    @OriginalMember(owner = "client!YXBFJZDP", name = "b", descriptor = "[B")
    public static byte[] field1671 = new byte[520];

    @OriginalMember(owner = "client!YXBFJZDP", name = "<init>", descriptor = "(IIILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;)V")
    public class68(int arg0, int arg1, int arg2, RandomAccessFile arg3, RandomAccessFile arg4) {
        this.field1674 = arg1;
        int var6 = 95 / arg2;
        this.field1672 = arg4;
        this.field1673 = arg3;
        this.field1675 = arg0;
    }

    @OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method593(int arg0, byte arg1) {
        if (arg1 != 46) {
            this.field1670 = !this.field1670;
        }
        try {
            this.method596(this.field1673, arg0 * 6, 593);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1673.read(field1671, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1671[2] & 0xFF) + ((field1671[0] & 0xFF) << 16) + ((field1671[1] & 0xFF) << 8);
            int var6 = (field1671[5] & 0xFF) + ((field1671[3] & 0xFF) << 16) + ((field1671[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1675) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1672.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method596(this.field1672, var6 * 520, 593);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1672.read(field1671, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1671[0] & 0xFF) << 8) + (field1671[1] & 0xFF);
                    int var14 = ((field1671[2] & 0xFF) << 8) + (field1671[3] & 0xFF);
                    int var15 = (field1671[6] & 0xFF) + ((field1671[4] & 0xFF) << 16) + ((field1671[5] & 0xFF) << 8);
                    int var16 = field1671[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1674 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1672.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1671[var17 + 8];
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

    @OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(B[BII)Z")
    public synchronized boolean method594(byte arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method595(true, 699, arg2, arg3, arg1);
        if (arg0 != 56) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method595(false, 699, arg2, arg3, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(ZIII[B)Z")
    private synchronized boolean method595(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = 66 / arg1;
        try {
            int var9;
            if (arg0) {
                this.method596(this.field1673, arg3 * 6, 593);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1673.read(field1671, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1671[5] & 0xFF) + ((field1671[3] & 0xFF) << 16) + ((field1671[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1672.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1672.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1671[0] = (byte) (arg2 >> 16);
            field1671[1] = (byte) (arg2 >> 8);
            field1671[2] = (byte) arg2;
            field1671[3] = (byte) (var9 >> 16);
            field1671[4] = (byte) (var9 >> 8);
            field1671[5] = (byte) var9;
            this.method596(this.field1673, arg3 * 6, 593);
            this.field1673.write(field1671, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg2) {
                int var12 = 0;
                if (arg0) {
                    this.method596(this.field1672, var9 * 520, 593);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1672.read(field1671, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field1671[0] & 0xFF) << 8) + (field1671[1] & 0xFF);
                            int var16 = ((field1671[2] & 0xFF) << 8) + (field1671[3] & 0xFF);
                            var12 = (field1671[6] & 0xFF) + ((field1671[4] & 0xFF) << 16) + ((field1671[5] & 0xFF) << 8);
                            int var17 = field1671[7] & 0xFF;
                            if (arg3 == var15 && var11 == var16 && this.field1674 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1672.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg0 = false;
                    var12 = (int) ((this.field1672.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg2 - var10 <= 512) {
                    var12 = 0;
                }
                field1671[0] = (byte) (arg3 >> 8);
                field1671[1] = (byte) arg3;
                field1671[2] = (byte) (var11 >> 8);
                field1671[3] = (byte) var11;
                field1671[4] = (byte) (var12 >> 16);
                field1671[5] = (byte) (var12 >> 8);
                field1671[6] = (byte) var12;
                field1671[7] = (byte) this.field1674;
                this.method596(this.field1672, var9 * 520, 593);
                this.field1672.write(field1671, 0, 8);
                int var18 = arg2 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1672.write(arg4, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "client!YXBFJZDP", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method596(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }
}
