import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DQPGJUSB")
public class class8 {

    @OriginalMember(owner = "DQPGJUSB", name = "f", descriptor = "I")
    public int field606 = 65000;

    @OriginalMember(owner = "DQPGJUSB", name = "e", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "DQPGJUSB", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field603;

    @OriginalMember(owner = "DQPGJUSB", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field604;

    @OriginalMember(owner = "DQPGJUSB", name = "b", descriptor = "[B")
    public static byte[] field602 = new byte[520];

    @OriginalMember(owner = "DQPGJUSB", name = "a", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "DQPGJUSB", name = "<init>", descriptor = "(BILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
    public class8(byte arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
        this.field605 = arg4;
        this.field603 = arg2;
        this.field604 = arg3;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        this.field606 = arg1;
    }

    @OriginalMember(owner = "DQPGJUSB", name = "a", descriptor = "(IZ)[B")
    public synchronized byte[] method184(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        try {
            this.method187(arg0 * 6, this.field604, false);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field604.read(field602, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field602[2] & 0xFF) + ((field602[0] & 0xFF) << 16) + ((field602[1] & 0xFF) << 8);
            int var6 = (field602[5] & 0xFF) + ((field602[3] & 0xFF) << 16) + ((field602[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field606) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field603.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method187(var6 * 520, this.field603, false);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field603.read(field602, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field602[0] & 0xFF) << 8) + (field602[1] & 0xFF);
                    int var14 = ((field602[2] & 0xFF) << 8) + (field602[3] & 0xFF);
                    int var15 = (field602[6] & 0xFF) + ((field602[4] & 0xFF) << 16) + ((field602[5] & 0xFF) << 8);
                    int var16 = field602[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field605 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field603.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field602[var17 + 8];
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

    @OriginalMember(owner = "DQPGJUSB", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method185(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var5 = this.method186(arg1, true, arg3, arg2, this.field601);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method186(arg1, false, arg3, arg2, this.field601);
        }
        return var5;
    }

    @OriginalMember(owner = "DQPGJUSB", name = "a", descriptor = "(IZI[BI)Z")
    private synchronized boolean method186(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg1) {
                this.method187(arg0 * 6, this.field604, false);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field604.read(field602, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field602[5] & 0xFF) + ((field602[3] & 0xFF) << 16) + ((field602[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field603.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field603.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field602[0] = (byte) (arg2 >> 16);
            field602[1] = (byte) (arg2 >> 8);
            field602[2] = (byte) arg2;
            field602[3] = (byte) (var8 >> 16);
            field602[4] = (byte) (var8 >> 8);
            field602[5] = (byte) var8;
            this.method187(arg0 * 6, this.field604, false);
            this.field604.write(field602, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg1) {
                    this.method187(var8 * 520, this.field603, false);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field603.read(field602, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field602[0] & 0xFF) << 8) + (field602[1] & 0xFF);
                            int var15 = ((field602[2] & 0xFF) << 8) + (field602[3] & 0xFF);
                            var11 = (field602[6] & 0xFF) + ((field602[4] & 0xFF) << 16) + ((field602[5] & 0xFF) << 8);
                            int var16 = field602[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field605 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field603.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg1 = false;
                    var11 = (int) ((this.field603.length() + 519L) / 520L);
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
                field602[0] = (byte) (arg0 >> 8);
                field602[1] = (byte) arg0;
                field602[2] = (byte) (var10 >> 8);
                field602[3] = (byte) var10;
                field602[4] = (byte) (var11 >> 16);
                field602[5] = (byte) (var11 >> 8);
                field602[6] = (byte) var11;
                field602[7] = (byte) this.field605;
                this.method187(var8 * 520, this.field603, false);
                this.field603.write(field602, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field603.write(arg3, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "DQPGJUSB", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method187(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg1.seek((long) arg0);
    }
}
