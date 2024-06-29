import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AOYWVYEX")
public class class1 {

    @OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "B")
    private byte field1 = -61;

    @OriginalMember(owner = "client!AOYWVYEX", name = "b", descriptor = "I")
    private int field2 = 287;

    @OriginalMember(owner = "client!AOYWVYEX", name = "c", descriptor = "Z")
    private boolean field3 = false;

    @OriginalMember(owner = "client!AOYWVYEX", name = "h", descriptor = "I")
    public int field8 = 65000;

    @OriginalMember(owner = "client!AOYWVYEX", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!AOYWVYEX", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field5;

    @OriginalMember(owner = "client!AOYWVYEX", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field6;

    @OriginalMember(owner = "client!AOYWVYEX", name = "d", descriptor = "[B")
    public static byte[] field4 = new byte[520];

    @OriginalMember(owner = "client!AOYWVYEX", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
    public class1(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field7 = arg1;
        this.field5 = arg0;
        this.field6 = arg3;
        if (arg4 != 14733) {
            this.field2 = -86;
        }
        this.field8 = arg2;
    }

    @OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method1(byte arg0, int arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        try {
            this.method4(arg1 * 6, (byte) -61, this.field6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field6.read(field4, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field4[2] & 0xFF) + ((field4[0] & 0xFF) << 16) + ((field4[1] & 0xFF) << 8);
            int var6 = (field4[5] & 0xFF) + ((field4[3] & 0xFF) << 16) + ((field4[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field8) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field5.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method4(var6 * 520, (byte) -61, this.field5);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field5.read(field4, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field4[0] & 0xFF) << 8) + (field4[1] & 0xFF);
                    int var14 = ((field4[2] & 0xFF) << 8) + (field4[3] & 0xFF);
                    int var15 = (field4[6] & 0xFF) + ((field4[4] & 0xFF) << 16) + ((field4[5] & 0xFF) << 8);
                    int var16 = field4[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field7 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field5.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field4[var17 + 8];
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

    @OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "([BZII)Z")
    public synchronized boolean method2(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field3 = !this.field3;
        }
        boolean var5 = this.method3(arg0, false, arg2, arg3, true);
        if (!var5) {
            var5 = this.method3(arg0, false, arg2, arg3, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "([BZIIZ)Z")
    private synchronized boolean method3(byte[] arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        try {
            int var9;
            if (arg4) {
                this.method4(arg2 * 6, (byte) -61, this.field6);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field6.read(field4, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field4[5] & 0xFF) + ((field4[3] & 0xFF) << 16) + ((field4[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field5.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field5.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field4[0] = (byte) (arg3 >> 16);
            field4[1] = (byte) (arg3 >> 8);
            field4[2] = (byte) arg3;
            field4[3] = (byte) (var9 >> 16);
            field4[4] = (byte) (var9 >> 8);
            field4[5] = (byte) var9;
            this.method4(arg2 * 6, (byte) -61, this.field6);
            this.field6.write(field4, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg3) {
                int var12 = 0;
                if (arg4) {
                    this.method4(var9 * 520, (byte) -61, this.field5);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field5.read(field4, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label117: {
                            int var15 = ((field4[0] & 0xFF) << 8) + (field4[1] & 0xFF);
                            int var16 = ((field4[2] & 0xFF) << 8) + (field4[3] & 0xFF);
                            var12 = (field4[6] & 0xFF) + ((field4[4] & 0xFF) << 16) + ((field4[5] & 0xFF) << 8);
                            int var17 = field4[7] & 0xFF;
                            if (arg2 == var15 && var11 == var16 && this.field7 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field5.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg4 = false;
                    var12 = (int) ((this.field5.length() + 519L) / 520L);
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
                field4[0] = (byte) (arg2 >> 8);
                field4[1] = (byte) arg2;
                field4[2] = (byte) (var11 >> 8);
                field4[3] = (byte) var11;
                field4[4] = (byte) (var12 >> 16);
                field4[5] = (byte) (var12 >> 8);
                field4[6] = (byte) var12;
                field4[7] = (byte) this.field7;
                this.method4(var9 * 520, (byte) -61, this.field5);
                this.field5.write(field4, 0, 8);
                int var18 = arg3 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field5.write(arg0, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "client!AOYWVYEX", name = "a", descriptor = "(IBLjava/io/RandomAccessFile;)V")
    public synchronized void method4(int arg0, byte arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg0);
        if (this.field1 == arg1) {
            ;
        }
    }
}
