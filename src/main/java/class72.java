import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZLYJLLFY")
public class class72 {

    @OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "I")
    private int field1738 = 1;

    @OriginalMember(owner = "client!ZLYJLLFY", name = "f", descriptor = "I")
    public int field1743 = 65000;

    @OriginalMember(owner = "client!ZLYJLLFY", name = "e", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ZLYJLLFY", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1740;

    @OriginalMember(owner = "client!ZLYJLLFY", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1741;

    @OriginalMember(owner = "client!ZLYJLLFY", name = "b", descriptor = "[B")
    public static byte[] field1739 = new byte[520];

    @OriginalMember(owner = "client!ZLYJLLFY", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;ZII)V")
    public class72(RandomAccessFile arg0, RandomAccessFile arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            this.field1738 = -274;
        }
        this.field1742 = arg3;
        this.field1740 = arg0;
        this.field1741 = arg1;
        this.field1743 = arg4;
    }

    @OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method601(int arg0, byte arg1) {
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        try {
            this.method604((byte) -20, this.field1741, arg0 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1741.read(field1739, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1739[2] & 0xFF) + ((field1739[0] & 0xFF) << 16) + ((field1739[1] & 0xFF) << 8);
            int var6 = (field1739[5] & 0xFF) + ((field1739[3] & 0xFF) << 16) + ((field1739[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1743) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1740.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method604((byte) -20, this.field1740, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1740.read(field1739, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1739[0] & 0xFF) << 8) + (field1739[1] & 0xFF);
                    int var14 = ((field1739[2] & 0xFF) << 8) + (field1739[3] & 0xFF);
                    int var15 = (field1739[6] & 0xFF) + ((field1739[4] & 0xFF) << 16) + ((field1739[5] & 0xFF) << 8);
                    int var16 = field1739[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field1742 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1740.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1739[var17 + 8];
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

    @OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "([BIIZ)Z")
    public synchronized boolean method602(byte[] arg0, int arg1, int arg2, boolean arg3) {
        boolean var5 = this.method603(arg0, arg1, arg2, true, 10595);
        if (!arg3) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method603(arg0, arg1, arg2, false, 10595);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "([BIIZI)Z")
    private synchronized boolean method603(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 10595) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg3) {
                this.method604((byte) -20, this.field1741, arg2 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1741.read(field1739, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1739[5] & 0xFF) + ((field1739[3] & 0xFF) << 16) + ((field1739[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1740.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1740.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1739[0] = (byte) (arg1 >> 16);
            field1739[1] = (byte) (arg1 >> 8);
            field1739[2] = (byte) arg1;
            field1739[3] = (byte) (var8 >> 16);
            field1739[4] = (byte) (var8 >> 8);
            field1739[5] = (byte) var8;
            this.method604((byte) -20, this.field1741, arg2 * 6);
            this.field1741.write(field1739, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg3) {
                    this.method604((byte) -20, this.field1740, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1740.read(field1739, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1739[0] & 0xFF) << 8) + (field1739[1] & 0xFF);
                            int var15 = ((field1739[2] & 0xFF) << 8) + (field1739[3] & 0xFF);
                            var11 = (field1739[6] & 0xFF) + ((field1739[4] & 0xFF) << 16) + ((field1739[5] & 0xFF) << 8);
                            int var16 = field1739[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field1742 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1740.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field1740.length() + 519L) / 520L);
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
                field1739[0] = (byte) (arg2 >> 8);
                field1739[1] = (byte) arg2;
                field1739[2] = (byte) (var10 >> 8);
                field1739[3] = (byte) var10;
                field1739[4] = (byte) (var11 >> 16);
                field1739[5] = (byte) (var11 >> 8);
                field1739[6] = (byte) var11;
                field1739[7] = (byte) this.field1742;
                this.method604((byte) -20, this.field1740, var8 * 520);
                this.field1740.write(field1739, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1740.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ZLYJLLFY", name = "a", descriptor = "(BLjava/io/RandomAccessFile;I)V")
    public synchronized void method604(byte arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg0 != -20) {
            return;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
    }
}
