import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class625 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field8395 = -1;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Ljava/lang/String;")
    public String field8431 = null;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field8422 = 0;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field8430 = 0;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public int field8434 = -1;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Lmga;")
    public static class739 field8435 = new class739(79, -1);

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "B")
    public byte field8406;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "B")
    public byte field8414;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "B")
    public byte field8417;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "B")
    public byte field8429;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field8408;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public int field8438;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "J")
    public long field8442;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lee;")
    private class706 field8420;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
    private boolean field8403;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Z")
    public boolean field8412;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
    private boolean field8426;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[B")
    public byte[] field8421;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
    private int[] field8424;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
    private int[] field8443;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[J")
    private long[] field8402;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "[J")
    private long[] field8436;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field8398;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field8404;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "[[[B")
    public static byte[][][] field8439;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Ljava/lang/Integer;")
    public final Integer method3420(int arg0, int arg1) {
        field8419++;
        if (this.field8420 == null) {
            return null;
        }
        if (arg1 != 1) {
            this.method3441(20, -54, -3, true, -47);
        }
        class101 var3 = this.field8420.method3953((long) arg0, 14);
        return var3 != null && var3 instanceof class119 ? Integer.valueOf(((class119) var3).field1725) : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/io/File;I[BI)V")
    public static final void method3421(File arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field8428++;
        if (arg3 != -365) {
            return;
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg2, 0, arg1);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public final boolean method3422(int arg0, int arg1, int arg2) {
        field8401++;
        if (this.field8420 == null) {
            this.field8420 = new class706(4);
        } else {
            class101 var4 = this.field8420.method3953((long) arg0, 14);
            if (var4 != null) {
                if (var4 instanceof class119) {
                    class119 var5 = (class119) var4;
                    if (var5.field1725 == arg2) {
                        return false;
                    }
                    var5.field1725 = arg2;
                    return true;
                }
                var4.method792((byte) -117);
            }
        }
        if (arg1 != 14500) {
            this.field8431 = null;
        }
        this.field8420.method3962((long) arg0, new class119(arg2), -104);
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZII)I")
    public final int method3423(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field8415++;
        int var6 = (0x1 << arg1) - 1;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = var7 ^ var6;
        if (!arg2) {
            this.field8431 = null;
        }
        int var9 = arg4 << arg1;
        int var10 = var9 & var8;
        int var11 = this.field8443[arg0];
        if ((var11 & var8) == var10) {
            return -1;
        } else {
            int var12 = var11 & ~var8;
            this.field8443[arg0] = class213.method1409(var12, var10);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)[I")
    public final int[] method3424(int arg0) {
        field8396++;
        if (arg0 > -112) {
            this.field8421 = null;
        }
        if (this.field8424 == null) {
            this.field8424 = new int[this.field8408];
            String[] var2 = new String[this.field8408];
            int var3 = 0;
            while (var3 < this.field8408) {
                var2[var3] = this.field8404[var3];
                this.field8424[var3] = var3++;
            }
            class288.method1833(this.field8424, true, var2);
        }
        return this.field8424;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZII)Ljava/lang/Integer;")
    public final Integer method3425(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field8414 = 29;
        }
        field8416++;
        if (this.field8420 == null) {
            return null;
        }
        class101 var5 = this.field8420.method3953((long) arg3, 14);
        if (var5 != null && var5 instanceof class119) {
            int var6 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
            return Integer.valueOf((var6 & ((class119) var5).field1725) >>> arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BJLjava/lang/String;)V")
    public final void method3426(byte arg0, long arg1, String arg2) {
        field8440++;
        if (arg2 != null && arg2.length() == 0) {
            arg2 = null;
        }
        if (arg1 > 0L != this.field8403) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field8403 + " but userhash:" + arg1);
        } else if (this.field8426 == (arg2 != null)) {
            if (arg1 > 0L && (this.field8436 == null || this.field8408 >= this.field8436.length) || arg2 != null && (this.field8404 == null || this.field8408 >= this.field8404.length)) {
                this.method3443(this.field8408 + 5, 0);
            }
            if (arg0 > 115) {
                if (this.field8436 != null) {
                    this.field8436[this.field8408] = arg1;
                }
                if (this.field8404 != null) {
                    this.field8404[this.field8408] = arg2;
                }
                if (this.field8395 == -1) {
                    this.field8395 = this.field8408;
                    this.field8421[this.field8408] = 126;
                } else {
                    this.field8421[this.field8408] = 0;
                }
                this.field8443[this.field8408] = 0;
                this.field8408++;
                this.field8424 = null;
            }
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field8426 + " but displayname:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    private final void method3427(int arg0) {
        field8437++;
        if (this.field8408 == 0) {
            this.field8434 = -1;
            this.field8395 = -1;
            return;
        }
        this.field8434 = -1;
        this.field8395 = -1;
        int var2 = 0;
        byte var3 = this.field8421[0];
        for (int var4 = 1; var4 < this.field8408; var4++) {
            if (var3 < this.field8421[var4]) {
                if (var3 == 125) {
                    this.field8434 = var2;
                }
                var2 = var4;
                var3 = this.field8421[var4];
            } else if (this.field8434 == -1 && this.field8421[var4] == 125) {
                this.field8434 = var4;
            }
        }
        this.field8395 = var2;
        if (this.field8395 != -1) {
            this.field8421[this.field8395] = 126;
        }
        if (arg0 != -5321) {
            this.field8426 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Ljava/lang/Long;")
    public final Long method3428(int arg0, int arg1) {
        field8400++;
        if (arg1 >= -19) {
            this.method3435(-72, (byte) -104);
        }
        if (this.field8420 == null) {
            return null;
        } else {
            class101 var3 = this.field8420.method3953((long) arg0, 14);
            return var3 != null && var3 instanceof class536 ? Long.valueOf(((class536) var3).field7300) : null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;I)Z")
    public final boolean method3429(int arg0, String arg1, int arg2) {
        field8413++;
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field8420 == null) {
            this.field8420 = new class706(4);
        } else {
            class101 var4 = this.field8420.method3953((long) arg2, 14);
            if (var4 != null) {
                if (var4 instanceof class482) {
                    class482 var5 = (class482) var4;
                    if (var5.field6664.equals(arg1)) {
                        return false;
                    }
                    var5.field6664 = arg1;
                    return true;
                }
                var4.method792((byte) -102);
            }
        }
        this.field8420.method3962((long) arg2, new class482(arg1), -123);
        if (arg0 != -24303) {
            this.method3423(43, 27, false, 42, -90);
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public final void method3430(byte arg0, int arg1) {
        field8411++;
        this.field8438--;
        if (this.field8438 == 0) {
            this.field8402 = null;
            this.field8398 = null;
        } else {
            if (this.field8402 != null) {
                class278.method1801(this.field8402, arg1 + 1, this.field8402, arg1, this.field8438 - arg1);
            }
            if (this.field8398 != null) {
                class278.method1799(this.field8398, arg1 + 1, this.field8398, arg1, this.field8438 - arg1);
            }
        }
        int var3 = -95 % ((-arg0 - 58) / 32);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjp;)V")
    private final void method3431(int arg0, class376 arg1) {
        field8410++;
        int var3 = arg1.method2398(-1372747256);
        if (var3 < 1 || var3 > 4) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg1.method2398(-1372747256);
        if ((var4 & 0x2) != 0) {
            this.field8426 = true;
        }
        int var5 = 31 % ((6 - arg0) / 44);
        if ((var4 & 0x1) != 0) {
            this.field8403 = true;
        }
        if (!this.field8426) {
            this.field8404 = null;
            this.field8398 = null;
        }
        if (!this.field8403) {
            this.field8436 = null;
            this.field8402 = null;
        }
        this.field8430 = arg1.method2384(77);
        this.field8422 = arg1.method2384(9);
        if (var3 <= 3 && this.field8422 != 0) {
            this.field8422 += 16912800;
        }
        this.field8408 = arg1.method2359(-1);
        this.field8438 = arg1.method2398(-1372747256);
        this.field8431 = arg1.method2379((byte) 85);
        if (var3 >= 4) {
            arg1.method2384(110);
        }
        this.field8412 = arg1.method2398(-1372747256) == 1;
        this.field8417 = arg1.method2387((byte) 66);
        this.field8414 = arg1.method2387((byte) -118);
        this.field8429 = arg1.method2387((byte) -116);
        this.field8406 = arg1.method2387((byte) 15);
        if (this.field8408 > 0) {
            if (this.field8403 && (this.field8436 == null || this.field8408 > this.field8436.length)) {
                this.field8436 = new long[this.field8408];
            }
            if (this.field8426 && (this.field8404 == null || this.field8404.length < this.field8408)) {
                this.field8404 = new String[this.field8408];
            }
            if (this.field8421 == null || this.field8421.length < this.field8408) {
                this.field8421 = new byte[this.field8408];
            }
            if (this.field8443 == null || this.field8408 > this.field8443.length) {
                this.field8443 = new int[this.field8408];
            }
            for (int var6 = 0; var6 < this.field8408; var6++) {
                if (this.field8403) {
                    this.field8436[var6] = arg1.method2366(true);
                }
                if (this.field8426) {
                    this.field8404[var6] = arg1.method2383((byte) 117);
                }
                this.field8421[var6] = arg1.method2387((byte) -99);
                if (var3 >= 2) {
                    this.field8443[var6] = arg1.method2384(64);
                }
            }
            this.method3427(-5321);
        }
        if (this.field8438 > 0) {
            if (this.field8403 && (this.field8402 == null || this.field8438 > this.field8402.length)) {
                this.field8402 = new long[this.field8438];
            }
            if (this.field8426 && (this.field8398 == null || this.field8398.length < this.field8438)) {
                this.field8398 = new String[this.field8438];
            }
            for (int var7 = 0; var7 < this.field8438; var7++) {
                if (this.field8403) {
                    this.field8402[var7] = arg1.method2366(true);
                }
                if (this.field8426) {
                    this.field8398[var7] = arg1.method2383((byte) 106);
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var8 = arg1.method2359(-1);
        if (var8 <= 0) {
            return;
        }
        this.field8420 = new class706(var8 < 16 ? class719.method4014(var8, (byte) -100) : 16);
        while (var8-- > 0) {
            int var9 = arg1.method2384(79);
            int var10 = var9 & 0x3FFFFFFF;
            int var11 = var9 >>> 30;
            if (var11 == 0) {
                int var15 = arg1.method2384(94);
                this.field8420.method3962((long) var10, new class119(var15), -118);
            } else if (var11 == 1) {
                long var12 = arg1.method2366(true);
                this.field8420.method3962((long) var10, new class536(var12), -104);
            } else if (var11 == 2) {
                String var14 = arg1.method2379((byte) 85);
                this.field8420.method3962((long) var10, new class482(var14), -115);
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    private final void method3432(int arg0, int arg1) {
        if (this.field8403) {
            if (this.field8402 == null) {
                this.field8402 = new long[arg0];
            } else {
                class278.method1801(this.field8402, 0, this.field8402 = new long[arg0], 0, this.field8438);
            }
        }
        if (arg1 > -103) {
            this.method3433(25, 88, 48, 93);
        }
        field8433++;
        if (!this.field8426) {
            return;
        }
        if (this.field8398 == null) {
            this.field8398 = new String[arg0];
        } else {
            class278.method1799(this.field8398, 0, this.field8398 = new String[arg0], 0, this.field8438);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
    public final int method3433(int arg0, int arg1, int arg2, int arg3) {
        field8405++;
        if (arg2 > -21) {
            return 116;
        } else {
            int var5 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
            return (this.field8443[arg1] & var5) >>> arg3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static final void method3434(int arg0) {
        field8399++;
        class469.field6507.method823(-6009);
        class304.field4371.method775(-24712);
        class627.field8774.method1928((byte) 112);
        class706.field9894.setBackground(Color.black);
        class655.field9073 = -1;
        if (arg0 == 0) {
            class469.field6507 = class631.method3540((byte) 24, class706.field9894);
            class304.field4371 = class491.method2853(true, class706.field9894, arg0 - 49);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method3435(int arg0, byte arg1) {
        field8432++;
        if (this.field8420 == null) {
            return null;
        }
        class101 var3 = this.field8420.method3953((long) arg0, 14);
        if (var3 != null && var3 instanceof class482) {
            if (arg1 != 29) {
                this.method3437((byte) 42, null);
            }
            return ((class482) var3).field6664;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JII)Z")
    public final boolean method3436(long arg0, int arg1, int arg2) {
        if (arg1 <= 61) {
            this.field8436 = null;
        }
        field8397++;
        if (this.field8420 == null) {
            this.field8420 = new class706(4);
        } else {
            class101 var5 = this.field8420.method3953((long) arg2, 14);
            if (var5 != null) {
                if (var5 instanceof class536) {
                    class536 var6 = (class536) var5;
                    if (var6.field7300 == arg0) {
                        return false;
                    }
                    var6.field7300 = arg0;
                    return true;
                }
                var5.method792((byte) -93);
            }
        }
        this.field8420.method3962((long) arg2, new class536(arg0), -123);
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method3437(byte arg0, String arg1) {
        if (arg0 != -47) {
            method3439(19);
        }
        field8444++;
        if (arg1 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8408; var3++) {
            if (this.field8404[var3].equals(arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method3438(byte arg0) {
        field8439 = null;
        if (arg0 < -70) {
            field8435 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public static final void method3439(int arg0) {
        class9.field138.method1555((byte) -3);
        field8418++;
        if (arg0 != 1) {
            method3434(104);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    public final void method3440(int arg0, boolean arg1) {
        field8425++;
        if (arg0 < 0 || this.field8408 <= arg0) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.field8408);
        }
        this.field8424 = null;
        this.field8408--;
        if (this.field8408 == 0) {
            this.field8434 = -1;
            this.field8404 = null;
            this.field8421 = null;
            this.field8436 = null;
            this.field8443 = null;
            this.field8395 = -1;
        } else {
            class278.method1796(this.field8421, arg0 + 1, this.field8421, arg0, this.field8408 - arg0);
            class278.method1798(this.field8443, arg0 + 1, this.field8443, arg0, this.field8408 - arg0);
            if (this.field8436 != null) {
                class278.method1801(this.field8436, arg0 + 1, this.field8436, arg0, this.field8408 - arg0);
            }
            if (this.field8404 != null) {
                class278.method1799(this.field8404, arg0 + 1, this.field8404, arg0, this.field8408 - arg0);
            }
            if (this.field8395 == arg0 || this.field8434 == arg0) {
                this.method3427(-5321);
            }
        }
        if (arg1) {
            this.method3423(-104, -120, false, -36, 41);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZI)Z")
    public final boolean method3441(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field8409++;
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        int var8 = arg1 << arg4;
        if (!arg3) {
            method3434(29);
        }
        int var9 = var7 ^ var6;
        int var10 = var8 & var9;
        if (this.field8420 == null) {
            this.field8420 = new class706(4);
        } else {
            class101 var11 = this.field8420.method3953((long) arg0, 14);
            if (var11 != null) {
                if (var11 instanceof class119) {
                    class119 var12 = (class119) var11;
                    if ((var12.field1725 & var9) == var10) {
                        return false;
                    }
                    var12.field1725 &= ~var9;
                    var12.field1725 |= var10;
                    return true;
                }
                var11.method792((byte) -104);
            }
        }
        this.field8420.method3962((long) arg0, new class119(var10), -122);
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
    public final void method3442(String arg0, int arg1, long arg2) {
        field8427++;
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        if (arg1 > -95) {
            field8435 = null;
        }
        if (this.field8403 == arg2 <= 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field8403 + " but userhash:" + arg2);
        } else if (arg0 != null == this.field8426) {
            if (arg2 > 0L && (this.field8402 == null || this.field8402.length <= this.field8438) || arg0 != null && (this.field8398 == null || this.field8438 >= this.field8398.length)) {
                this.method3432(this.field8438 + 5, -122);
            }
            if (this.field8402 != null) {
                this.field8402[this.field8438] = arg2;
            }
            if (this.field8398 != null) {
                this.field8398[this.field8438] = arg0;
            }
            this.field8438++;
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field8426 + " but displayname:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)V")
    private final void method3443(int arg0, int arg1) {
        field8441++;
        if (arg1 != 0) {
            return;
        }
        if (this.field8403) {
            if (this.field8436 == null) {
                this.field8436 = new long[arg0];
            } else {
                class278.method1801(this.field8436, 0, this.field8436 = new long[arg0], 0, this.field8408);
            }
        }
        if (this.field8426) {
            if (this.field8404 == null) {
                this.field8404 = new String[arg0];
            } else {
                class278.method1799(this.field8404, 0, this.field8404 = new String[arg0], 0, this.field8408);
            }
        }
        if (this.field8421 == null) {
            this.field8421 = new byte[arg0];
        } else {
            class278.method1796(this.field8421, 0, this.field8421 = new byte[arg0], 0, this.field8408);
        }
        if (this.field8443 == null) {
            this.field8443 = new int[arg0];
        } else {
            class278.method1798(this.field8443, 0, this.field8443 = new int[arg0], 0, this.field8408);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBB)I")
    public final int method3444(int arg0, byte arg1, byte arg2) {
        field8407++;
        if (arg2 != 125) {
            method3438((byte) 14);
        }
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field8395 == arg0 && (this.field8434 == -1 || this.field8421[this.field8434] < 125)) {
            return -1;
        } else if (this.field8421[arg0] == arg1) {
            return -1;
        } else {
            this.field8421[arg0] = arg1;
            this.method3427(arg2 - 5446);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljp;)V")
    public class625(class376 arg0) {
        this.method3431(127, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    private class625() {
    }
}
