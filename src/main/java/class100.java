import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class100 extends class273 {

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field1547 = 0;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    private int field1550 = 409;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field1554 = 204;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    private int field1548 = 8;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    private int field1556 = 1024;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private int field1555 = 4;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    private int field1557 = 81;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    private int field1567 = 1024;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Lwf;")
    public static class306 field1558;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "[I")
    private int[] field1549;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "[[I")
    private int[][] field1553;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "[[I")
    private int[][] field1563;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 5)
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lgn;B)V", line = 27)
    public static final void method681(class303 arg0, byte arg1) {
        field1551++;
        byte[] var2 = new byte[24];
        if (class122.field1901 != null) {
            try {
                class122.field1901.method498((byte) -69, 0L);
                class122.field1901.method502(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        if (arg1 != -84) {
            field1558 = (class306) null;
        }
        arg0.method2060(var2, arg1 - 1927867012, 24, 0);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 73)
    public final void method349(int arg0) {
        if (arg0 != 1) {
            this.field1548 = -45;
        }
        field1565++;
        this.method682(122);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V", line = 86)
    private final void method682(int arg0) {
        field1552++;
        int var2 = 51 / ((arg0 - 37) / 61);
        Random var3 = new Random((long) this.field1548);
        this.field1564 = this.field1557 / 2;
        this.field1563 = new int[this.field1548][this.field1555 + 1];
        this.field1546 = 4096 / this.field1548;
        this.field1553 = new int[this.field1548][this.field1555];
        this.field1549 = new int[this.field1548 + 1];
        this.field1549[0] = 0;
        this.field1560 = 4096 / this.field1555;
        int var4 = this.field1560 / 2;
        int var5 = this.field1546 / 2;
        for (int var6 = 0; var6 < this.field1548; var6++) {
            if (var6 > 0) {
                int var7 = this.field1546;
                int var8 = (class7.method39((byte) 57, var3, 4096) - 2048) * this.field1554 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field1549[var6] = this.field1549[var6 - 1] + var9;
            }
            this.field1563[var6][0] = 0;
            for (int var10 = 0; var10 < this.field1555; var10++) {
                if (var10 > 0) {
                    int var11 = this.field1560;
                    int var12 = (class7.method39((byte) 57, var3, 4096) - 2048) * this.field1550 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field1563[var6][var10] = this.field1563[var6][var10 - 1] + var13;
                }
                this.field1553[var6][var10] = this.field1567 <= 0 ? 4096 : 4096 - class7.method39((byte) 57, var3, this.field1567);
            }
            this.field1563[var6][this.field1555] = 4096;
        }
        this.field1549[this.field1548] = 4096;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V", line = 154)
    public static void method683(boolean arg0) {
        if (arg0) {
            method684(-14, 24, (byte[]) null, 119);
        }
        field1558 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 172)
    public static final String method684(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 31122) {
            return (String) null;
        }
        field1566++;
        int var4 = 0;
        char[] var5 = new char[arg0];
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class4.field44[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BILgn;)V", line = 237)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field1555 = arg2.method2043((byte) -114);
        } else if (arg1 == 1) {
            this.field1548 = arg2.method2043((byte) -118);
        } else if (arg1 == 2) {
            this.field1550 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field1554 = arg2.method1994(false);
        } else if (arg1 == 4) {
            this.field1556 = arg2.method1994(false);
        } else if (arg1 == 5) {
            this.field1547 = arg2.method1994(false);
        } else if (arg1 == 6) {
            this.field1557 = arg2.method1994(false);
        } else if (arg1 == 7) {
            this.field1567 = arg2.method1994(false);
        }
        if (arg0 <= 27) {
            method681((class303) null, (byte) 110);
        }
        field1559++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 311)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            return (int[]) null;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        field1562++;
        if (this.field4204.field792) {
            int var4 = 0;
            int var5;
            for (var5 = class96.field1473[arg0] + this.field1547; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field1548 && var5 >= this.field1549[var4]) {
                var4++;
            }
            int var6 = this.field1549[var4 - 1];
            int var7 = this.field1549[var4];
            boolean var8 = (var4 & 0x1) == 0;
            int var9 = var4 - 1;
            if ((this.field1564 + var6) < var5 && var7 - this.field1564 > var5) {
                for (int var10 = 0; var10 < class27.field346; var10++) {
                    int var11 = var8 ? this.field1556 : -this.field1556;
                    int var12 = class151.field2384[var10] + (this.field1560 * var11 >> 12);
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (var13 < this.field1555 && var12 >= this.field1563[var9][var13]) {
                        var13++;
                    }
                    int var14 = this.field1563[var9][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field1563[var9][var15];
                    if (this.field1564 + var16 < var12 && var14 - this.field1564 > var12) {
                        var3[var10] = this.field1553[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class223.method1500(var3, 0, class27.field346, 0);
            }
        }
        return var3;
    }
}
