import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ENNRILHF")
public class class17 {

    @OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "Z")
    private boolean field766 = false;

    @OriginalMember(owner = "client!ENNRILHF", name = "f", descriptor = "I")
    public int field771 = 65000;

    @OriginalMember(owner = "client!ENNRILHF", name = "e", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!ENNRILHF", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field768;

    @OriginalMember(owner = "client!ENNRILHF", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field769;

    @OriginalMember(owner = "client!ENNRILHF", name = "b", descriptor = "[B")
    public static byte[] field767 = new byte[520];

    @OriginalMember(owner = "client!ENNRILHF", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;II)V")
    public class17(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field770 = arg1;
        while (arg4 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field768 = arg0;
        this.field769 = arg2;
        this.field771 = arg3;
    }

    @OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method223(byte arg0, int arg1) {
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method226(this.field769, arg1 * 6, (byte) 7);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field769.read(field767, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field767[2] & 0xFF) + ((field767[0] & 0xFF) << 16) + ((field767[1] & 0xFF) << 8);
            int var7 = (field767[5] & 0xFF) + ((field767[3] & 0xFF) << 16) + ((field767[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field771) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field768.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method226(this.field768, var7 * 520, (byte) 7);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field768.read(field767, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field767[0] & 0xFF) << 8) + (field767[1] & 0xFF);
                    int var15 = ((field767[2] & 0xFF) << 8) + (field767[3] & 0xFF);
                    int var16 = (field767[6] & 0xFF) + ((field767[4] & 0xFF) << 16) + ((field767[5] & 0xFF) << 8);
                    int var17 = field767[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field770 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field768.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field767[var18 + 8];
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

    @OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(III[B)Z")
    public synchronized boolean method224(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var5 = this.method225((byte) 25, arg0, arg3, true, arg2);
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method225((byte) 25, arg0, arg3, false, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(BI[BZI)Z")
    private synchronized boolean method225(byte arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg0 != 25) {
            this.field766 = !this.field766;
        }
        try {
            int var8;
            if (arg3) {
                this.method226(this.field769, arg4 * 6, (byte) 7);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field769.read(field767, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field767[5] & 0xFF) + ((field767[3] & 0xFF) << 16) + ((field767[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field768.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field768.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field767[0] = (byte) (arg1 >> 16);
            field767[1] = (byte) (arg1 >> 8);
            field767[2] = (byte) arg1;
            field767[3] = (byte) (var8 >> 16);
            field767[4] = (byte) (var8 >> 8);
            field767[5] = (byte) var8;
            this.method226(this.field769, arg4 * 6, (byte) 7);
            this.field769.write(field767, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg3) {
                    this.method226(this.field768, var8 * 520, (byte) 7);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field768.read(field767, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field767[0] & 0xFF) << 8) + (field767[1] & 0xFF);
                            int var15 = ((field767[2] & 0xFF) << 8) + (field767[3] & 0xFF);
                            var11 = (field767[6] & 0xFF) + ((field767[4] & 0xFF) << 16) + ((field767[5] & 0xFF) << 8);
                            int var16 = field767[7] & 0xFF;
                            if (arg4 == var14 && var10 == var15 && this.field770 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field768.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field768.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg1 - var9 <= 512) {
                    var11 = 0;
                }
                field767[0] = (byte) (arg4 >> 8);
                field767[1] = (byte) arg4;
                field767[2] = (byte) (var10 >> 8);
                field767[3] = (byte) var10;
                field767[4] = (byte) (var11 >> 16);
                field767[5] = (byte) (var11 >> 8);
                field767[6] = (byte) var11;
                field767[7] = (byte) this.field770;
                this.method226(this.field768, var8 * 520, (byte) 7);
                this.field768.write(field767, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field768.write(arg2, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ENNRILHF", name = "a", descriptor = "(Ljava/io/RandomAccessFile;IB)V")
    public synchronized void method226(RandomAccessFile arg0, int arg1, byte arg2) throws IOException {
        if (arg2 == 7) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var6) {
            }
        }
        arg0.seek((long) arg1);
    }
}
