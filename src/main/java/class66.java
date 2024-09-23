import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YAQQZUCW")
public class class66 {

    @OriginalMember(owner = "YAQQZUCW", name = "a", descriptor = "I")
    private int field1621 = -356;

    @OriginalMember(owner = "YAQQZUCW", name = "g", descriptor = "I")
    public int field1627 = 65000;

    @OriginalMember(owner = "YAQQZUCW", name = "f", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "YAQQZUCW", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1624;

    @OriginalMember(owner = "YAQQZUCW", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field1625;

    @OriginalMember(owner = "YAQQZUCW", name = "c", descriptor = "[B")
    public static byte[] field1623 = new byte[520];

    @OriginalMember(owner = "YAQQZUCW", name = "b", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "YAQQZUCW", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;Z)V")
    public class66(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3, boolean arg4) {
        this.field1626 = arg2;
        this.field1624 = arg3;
        if (!arg4) {
            throw new NullPointerException();
        }
        this.field1625 = arg0;
        this.field1627 = arg1;
    }

    @OriginalMember(owner = "YAQQZUCW", name = "a", descriptor = "(BI)[B")
    public synchronized byte[] method559(byte arg0, int arg1) {
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        try {
            this.method562(0, arg1 * 6, this.field1625);
            int var6;
            for (int var5 = 0; var5 < 6; var5 += var6) {
                var6 = this.field1625.read(field1623, var5, 6 - var5);
                if (var6 == -1) {
                    return null;
                }
            }
            int var7 = (field1623[2] & 0xFF) + ((field1623[0] & 0xFF) << 16) + ((field1623[1] & 0xFF) << 8);
            int var8 = (field1623[5] & 0xFF) + ((field1623[3] & 0xFF) << 16) + ((field1623[4] & 0xFF) << 8);
            if (var7 < 0 || var7 > this.field1627) {
                return null;
            } else if (var8 > 0 && (long) var8 <= this.field1624.length() / 520L) {
                byte[] var9 = new byte[var7];
                int var10 = 0;
                int var11 = 0;
                while (var10 < var7) {
                    if (var8 == 0) {
                        return null;
                    }
                    this.method562(0, var8 * 520, this.field1624);
                    int var12 = 0;
                    int var13 = var7 - var10;
                    if (var13 > 512) {
                        var13 = 512;
                    }
                    while (var12 < var13 + 8) {
                        int var14 = this.field1624.read(field1623, var12, var13 + 8 - var12);
                        if (var14 == -1) {
                            return null;
                        }
                        var12 += var14;
                    }
                    int var15 = ((field1623[0] & 0xFF) << 8) + (field1623[1] & 0xFF);
                    int var16 = ((field1623[2] & 0xFF) << 8) + (field1623[3] & 0xFF);
                    int var17 = (field1623[6] & 0xFF) + ((field1623[4] & 0xFF) << 16) + ((field1623[5] & 0xFF) << 8);
                    int var18 = field1623[7] & 0xFF;
                    if (arg1 == var15 && var11 == var16 && this.field1626 == var18) {
                        if (var17 >= 0 && (long) var17 <= this.field1624.length() / 520L) {
                            for (int var19 = 0; var19 < var13; var19++) {
                                var9[var10++] = field1623[var19 + 8];
                            }
                            var8 = var17;
                            var11++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var9;
            } else {
                return null;
            }
        } catch (IOException var20) {
            return null;
        }
    }

    @OriginalMember(owner = "YAQQZUCW", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method560(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method561(39, arg1, arg0, arg2, true);
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method561(39, arg1, arg0, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "YAQQZUCW", name = "a", descriptor = "(I[BIIZ)Z")
    private synchronized boolean method561(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 7 / arg0;
        try {
            int var9;
            if (arg4) {
                this.method562(0, arg3 * 6, this.field1625);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field1625.read(field1623, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field1623[5] & 0xFF) + ((field1623[3] & 0xFF) << 16) + ((field1623[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field1624.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field1624.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field1623[0] = (byte) (arg2 >> 16);
            field1623[1] = (byte) (arg2 >> 8);
            field1623[2] = (byte) arg2;
            field1623[3] = (byte) (var9 >> 16);
            field1623[4] = (byte) (var9 >> 8);
            field1623[5] = (byte) var9;
            this.method562(0, arg3 * 6, this.field1625);
            this.field1625.write(field1623, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg2) {
                int var12 = 0;
                if (arg4) {
                    this.method562(0, var9 * 520, this.field1624);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field1624.read(field1623, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field1623[0] & 0xFF) << 8) + (field1623[1] & 0xFF);
                            int var16 = ((field1623[2] & 0xFF) << 8) + (field1623[3] & 0xFF);
                            var12 = (field1623[6] & 0xFF) + ((field1623[4] & 0xFF) << 16) + ((field1623[5] & 0xFF) << 8);
                            int var17 = field1623[7] & 0xFF;
                            if (arg3 == var15 && var11 == var16 && this.field1626 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field1624.length() / 520L) {
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
                    var12 = (int) ((this.field1624.length() + 519L) / 520L);
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
                field1623[0] = (byte) (arg3 >> 8);
                field1623[1] = (byte) arg3;
                field1623[2] = (byte) (var11 >> 8);
                field1623[3] = (byte) var11;
                field1623[4] = (byte) (var12 >> 16);
                field1623[5] = (byte) (var12 >> 8);
                field1623[6] = (byte) var12;
                field1623[7] = (byte) this.field1626;
                this.method562(0, var9 * 520, this.field1624);
                this.field1624.write(field1623, 0, 8);
                int var18 = arg2 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field1624.write(arg1, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "YAQQZUCW", name = "a", descriptor = "(IILjava/io/RandomAccessFile;)V")
    public synchronized void method562(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
        if (arg0 != 0) {
            this.field1622 = -295;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg2.seek((long) arg1);
    }
}
