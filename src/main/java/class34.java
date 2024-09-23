import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JFFVPFLB")
public class class34 {

    @OriginalMember(owner = "JFFVPFLB", name = "f", descriptor = "I")
    public int field1183 = 65000;

    @OriginalMember(owner = "JFFVPFLB", name = "e", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "JFFVPFLB", name = "a", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "JFFVPFLB", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1180;

    @OriginalMember(owner = "JFFVPFLB", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1181;

    @OriginalMember(owner = "JFFVPFLB", name = "b", descriptor = "[B")
    public static byte[] field1179 = new byte[520];

    @OriginalMember(owner = "JFFVPFLB", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ZLjava/io/RandomAccessFile;I)V")
    public class34(int arg0, RandomAccessFile arg1, boolean arg2, RandomAccessFile arg3, int arg4) {
        this.field1182 = arg4;
        if (arg2) {
            this.field1178 = 216;
        }
        this.field1180 = arg1;
        this.field1181 = arg3;
        this.field1183 = arg0;
    }

    @OriginalMember(owner = "JFFVPFLB", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method351(int arg0, int arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method354(this.field1181, arg1 * 6, 1);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field1181.read(field1179, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field1179[2] & 0xFF) + ((field1179[0] & 0xFF) << 16) + ((field1179[1] & 0xFF) << 8);
            int var7 = (field1179[5] & 0xFF) + ((field1179[3] & 0xFF) << 16) + ((field1179[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field1183) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field1180.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method354(this.field1180, var7 * 520, 1);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field1180.read(field1179, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field1179[0] & 0xFF) << 8) + (field1179[1] & 0xFF);
                    int var15 = ((field1179[2] & 0xFF) << 8) + (field1179[3] & 0xFF);
                    int var16 = (field1179[6] & 0xFF) + ((field1179[4] & 0xFF) << 16) + ((field1179[5] & 0xFF) << 8);
                    int var17 = field1179[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field1182 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field1180.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field1179[var18 + 8];
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

    @OriginalMember(owner = "JFFVPFLB", name = "a", descriptor = "(IIB[B)Z")
    public synchronized boolean method352(int arg0, int arg1, byte arg2, byte[] arg3) {
        boolean var5 = this.method353(arg0, true, arg1, (byte) -3, arg3);
        if (arg2 != 48) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!var5) {
            var5 = this.method353(arg0, false, arg1, (byte) -3, arg3);
        }
        return var5;
    }

    @OriginalMember(owner = "JFFVPFLB", name = "a", descriptor = "(IZIB[B)Z")
    private synchronized boolean method353(int arg0, boolean arg1, int arg2, byte arg3, byte[] arg4) {
        if (arg3 != -3) {
            this.field1178 = -58;
        }
        try {
            int var8;
            if (arg1) {
                this.method354(this.field1181, arg0 * 6, 1);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field1181.read(field1179, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field1179[5] & 0xFF) + ((field1179[3] & 0xFF) << 16) + ((field1179[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field1180.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field1180.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field1179[0] = (byte) (arg2 >> 16);
            field1179[1] = (byte) (arg2 >> 8);
            field1179[2] = (byte) arg2;
            field1179[3] = (byte) (var8 >> 16);
            field1179[4] = (byte) (var8 >> 8);
            field1179[5] = (byte) var8;
            this.method354(this.field1181, arg0 * 6, 1);
            this.field1181.write(field1179, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg1) {
                    this.method354(this.field1180, var8 * 520, 1);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field1180.read(field1179, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field1179[0] & 0xFF) << 8) + (field1179[1] & 0xFF);
                            int var15 = ((field1179[2] & 0xFF) << 8) + (field1179[3] & 0xFF);
                            var11 = (field1179[6] & 0xFF) + ((field1179[4] & 0xFF) << 16) + ((field1179[5] & 0xFF) << 8);
                            int var16 = field1179[7] & 0xFF;
                            if (arg0 == var14 && var10 == var15 && this.field1182 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field1180.length() / 520L) {
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
                    var11 = (int) ((this.field1180.length() + 519L) / 520L);
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
                field1179[0] = (byte) (arg0 >> 8);
                field1179[1] = (byte) arg0;
                field1179[2] = (byte) (var10 >> 8);
                field1179[3] = (byte) var10;
                field1179[4] = (byte) (var11 >> 16);
                field1179[5] = (byte) (var11 >> 8);
                field1179[6] = (byte) var11;
                field1179[7] = (byte) this.field1182;
                this.method354(this.field1180, var8 * 520, 1);
                this.field1180.write(field1179, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field1180.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "JFFVPFLB", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method354(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 1 || arg2 > 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg0.seek((long) arg1);
    }
}
