import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XEGQQHIM")
public class class64 {

    @OriginalMember(owner = "XEGQQHIM", name = "a", descriptor = "B")
    private byte field1626 = 7;

    @OriginalMember(owner = "XEGQQHIM", name = "b", descriptor = "Z")
    private boolean field1627 = true;

    @OriginalMember(owner = "XEGQQHIM", name = "h", descriptor = "I")
    public int field1632 = 65000;

    @OriginalMember(owner = "XEGQQHIM", name = "g", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "XEGQQHIM", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1629;

    @OriginalMember(owner = "XEGQQHIM", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1630;

    @OriginalMember(owner = "XEGQQHIM", name = "c", descriptor = "[B")
    public static byte[] field1628 = new byte[520];

    @OriginalMember(owner = "XEGQQHIM", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;IBLjava/io/RandomAccessFile;)V")
    public class64(int arg0, RandomAccessFile arg1, int arg2, byte arg3, RandomAccessFile arg4) {
        this.field1631 = arg0;
        this.field1629 = arg4;
        this.field1630 = arg1;
        this.field1632 = arg2;
        if (arg3 != -128) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "XEGQQHIM", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method549(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        try {
            this.method552(this.field1630, arg0 * 6, (byte) 101);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1630.read(field1628, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1628[2] & 0xFF) + ((field1628[0] & 0xFF) << 16) + ((field1628[1] & 0xFF) << 8);
            int var6 = (field1628[5] & 0xFF) + ((field1628[3] & 0xFF) << 16) + ((field1628[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1632) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1629.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method552(this.field1629, var6 * 520, (byte) 101);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1629.read(field1628, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1628[0] & 0xFF) << 8) + (field1628[1] & 0xFF);
                    int var14 = ((field1628[2] & 0xFF) << 8) + (field1628[3] & 0xFF);
                    int var15 = (field1628[6] & 0xFF) + ((field1628[4] & 0xFF) << 16) + ((field1628[5] & 0xFF) << 8);
                    int var16 = field1628[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1631 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1629.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1628[var17 + 8];
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

    @OriginalMember(owner = "XEGQQHIM", name = "a", descriptor = "(I[BBI)Z")
    public synchronized boolean method550(int arg0, byte[] arg1, byte arg2, int arg3) {
        boolean var5 = this.method551(arg0, arg1, arg3, (byte) 3, true);
        if (this.field1626 != arg2) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (!var5) {
            var5 = this.method551(arg0, arg1, arg3, (byte) 3, false);
        }
        return var5;
    }

    @OriginalMember(owner = "XEGQQHIM", name = "a", descriptor = "(I[BIBZ)Z")
    private synchronized boolean method551(int arg0, byte[] arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 != 3) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg4) {
                this.method552(this.field1630, arg0 * 6, (byte) 101);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1630.read(field1628, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1628[5] & 0xFF) + ((field1628[3] & 0xFF) << 16) + ((field1628[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1629.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1629.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1628[0] = (byte) (arg2 >> 16);
            field1628[1] = (byte) (arg2 >> 8);
            field1628[2] = (byte) arg2;
            field1628[3] = (byte) (var8 >> 16);
            field1628[4] = (byte) (var8 >> 8);
            field1628[5] = (byte) var8;
            this.method552(this.field1630, arg0 * 6, (byte) 101);
            this.field1630.write(field1628, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg4) {
                    this.method552(this.field1629, var8 * 520, (byte) 101);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1629.read(field1628, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1628[0] & 0xFF) << 8) + (field1628[1] & 0xFF);
                            int var15 = ((field1628[2] & 0xFF) << 8) + (field1628[3] & 0xFF);
                            var11 = (field1628[6] & 0xFF) + ((field1628[4] & 0xFF) << 16) + ((field1628[5] & 0xFF) << 8);
                            int var16 = field1628[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field1631 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1629.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field1629.length() + 519L) / 520L);
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
                field1628[0] = (byte) (arg0 >> 8);
                field1628[1] = (byte) arg0;
                field1628[2] = (byte) (var10 >> 8);
                field1628[3] = (byte) var10;
                field1628[4] = (byte) (var11 >> 16);
                field1628[5] = (byte) (var11 >> 8);
                field1628[6] = (byte) var11;
                field1628[7] = (byte) this.field1631;
                this.method552(this.field1629, var8 * 520, (byte) 101);
                this.field1629.write(field1628, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1629.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "XEGQQHIM", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
    public synchronized void method552(RandomAccessFile arg0, int arg1, byte arg2) throws IOException {
        if (arg2 != 101) {
            this.field1627 = !this.field1627;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
    }
}
