import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MQOIEGDZ")
public class class33 {

    @OriginalMember(owner = "MQOIEGDZ", name = "a", descriptor = "B")
    private byte field1077 = 37;

    @OriginalMember(owner = "MQOIEGDZ", name = "b", descriptor = "I")
    private int field1078 = -296;

    @OriginalMember(owner = "MQOIEGDZ", name = "g", descriptor = "I")
    public int field1083 = 65000;

    @OriginalMember(owner = "MQOIEGDZ", name = "f", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "MQOIEGDZ", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1080;

    @OriginalMember(owner = "MQOIEGDZ", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1081;

    @OriginalMember(owner = "MQOIEGDZ", name = "c", descriptor = "[B")
    public static byte[] field1079 = new byte[520];

    @OriginalMember(owner = "MQOIEGDZ", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIBLjava/io/RandomAccessFile;)V")
    public class33(RandomAccessFile arg0, int arg1, int arg2, byte arg3, RandomAccessFile arg4) {
        this.field1082 = arg1;
        this.field1080 = arg4;
        this.field1081 = arg0;
        if (this.field1077 != arg3) {
            this.field1078 = 85;
        }
        this.field1083 = arg2;
    }

    @OriginalMember(owner = "MQOIEGDZ", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method328(int arg0, int arg1) {
        if (arg0 != -7321) {
            throw new NullPointerException();
        }
        try {
            this.method331(true, arg1 * 6, this.field1081);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field1081.read(field1079, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field1079[2] & 0xFF) + ((field1079[0] & 0xFF) << 16) + ((field1079[1] & 0xFF) << 8);
            int var6 = (field1079[5] & 0xFF) + ((field1079[3] & 0xFF) << 16) + ((field1079[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field1083) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field1080.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method331(true, var6 * 520, this.field1080);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field1080.read(field1079, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field1079[0] & 0xFF) << 8) + (field1079[1] & 0xFF);
                    int var14 = ((field1079[2] & 0xFF) << 8) + (field1079[3] & 0xFF);
                    int var15 = (field1079[6] & 0xFF) + ((field1079[4] & 0xFF) << 16) + ((field1079[5] & 0xFF) << 8);
                    int var16 = field1079[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field1082 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field1080.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field1079[var17 + 8];
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

    @OriginalMember(owner = "MQOIEGDZ", name = "a", descriptor = "(III[B)Z")
    public synchronized boolean method329(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 < 0 || arg1 > 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = this.method330(arg0, (byte) 3, true, arg2, arg3);
        if (!var6) {
            var6 = this.method330(arg0, (byte) 3, false, arg2, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "MQOIEGDZ", name = "a", descriptor = "(IBZI[B)Z")
    private synchronized boolean method330(int arg0, byte arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        try {
            int var9;
            if (arg2) {
                this.method331(true, arg0 * 6, this.field1081);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1081.read(field1079, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1079[5] & 0xFF) + ((field1079[3] & 0xFF) << 16) + ((field1079[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1080.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1080.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1079[0] = (byte) (arg3 >> 16);
            field1079[1] = (byte) (arg3 >> 8);
            field1079[2] = (byte) arg3;
            field1079[3] = (byte) (var9 >> 16);
            field1079[4] = (byte) (var9 >> 8);
            field1079[5] = (byte) var9;
            this.method331(true, arg0 * 6, this.field1081);
            this.field1081.write(field1079, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg2) {
                    this.method331(true, var9 * 520, this.field1080);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1080.read(field1079, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label112: {
                            int var15 = ((field1079[0] & 0xFF) << 8) + (field1079[1] & 0xFF);
                            int var16 = ((field1079[2] & 0xFF) << 8) + (field1079[3] & 0xFF);
                            var12 = (field1079[6] & 0xFF) + ((field1079[4] & 0xFF) << 16) + ((field1079[5] & 0xFF) << 8);
                            int var17 = field1079[7] & 0xFF;
                            if (arg0 == var15 && var11 == var16 && this.field1082 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1080.length() / 520L) {
                                    break label112;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg2 = false;
                    var12 = (int) ((this.field1080.length() + 519L) / 520L);
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
                field1079[0] = (byte) (arg0 >> 8);
                field1079[1] = (byte) arg0;
                field1079[2] = (byte) (var11 >> 8);
                field1079[3] = (byte) var11;
                field1079[4] = (byte) (var12 >> 16);
                field1079[5] = (byte) (var12 >> 8);
                field1079[6] = (byte) var12;
                field1079[7] = (byte) this.field1082;
                this.method331(true, var9 * 520, this.field1080);
                this.field1080.write(field1079, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1080.write(arg4, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "MQOIEGDZ", name = "a", descriptor = "(ZILjava/io/RandomAccessFile;)V")
    public synchronized void method331(boolean arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
        if (arg0) {
            ;
        }
    }
}
