import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class117 extends class128 {

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "[Lol;")
    public class117[] field1891;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Z")
    public boolean field1885;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1890 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Z")
    public static boolean field1896 = false;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Lec;")
    public class62 field1886;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Lqa;")
    public class78 field1883;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "[[B")
    public static byte[][] field1893;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "[[I")
    public static int[][] field1887;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
    public int[] method46(int arg0, int arg1) {
        field1879++;
        if (arg0 != 2) {
            method833(-114);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    public void method64(int arg0) {
        field1881++;
        if (arg0 != 1) {
            field1892 = 29;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
    public int method832(byte arg0) {
        field1889++;
        if (arg0 > -106) {
            this.method654(-41);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V")
    public static final void method833(int arg0) {
        field1878++;
        if (class11.field110 != null || client.field4857 != null) {
            return;
        }
        if (arg0 != -3) {
            field1890 = null;
        }
        if (class143.field2270 > 0) {
            return;
        }
        int var1 = class20.field257;
        if (!class286.field4537) {
            if (var1 == 1 && class83.field1384 > 0) {
                short var2 = class192.field3103[class83.field1384 - 1];
                if (var2 == 34 || var2 == 43 || var2 == 13 || var2 == 28 || var2 == 40 || var2 == 29 || var2 == 18 || var2 == 22 || var2 == 51 || var2 == 36 || var2 == 58 || var2 == 1002) {
                    int var3 = class64.field1076[class83.field1384 - 1];
                    int var4 = class255.field4124[class83.field1384 - 1];
                    class211 var5 = class17.method87(var4, -20055);
                    class223 var6 = client.method2015(var5);
                    if (var6.method1537(false) || var6.method1535(arg0 ^ 0x7767)) {
                        class43.field644 = false;
                        class15.field161 = 0;
                        if (class11.field110 != null) {
                            method834(class11.field110, (byte) -57);
                        }
                        class11.field110 = class17.method87(var4, arg0 - 20052);
                        class9.field90 = var3;
                        class49.field813 = class309.field4941;
                        class3.field39 = class42.field609;
                        method834(class11.field110, (byte) -57);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class2.field21 == 1 && class83.field1384 > 2 || class33.method219(false, class83.field1384 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class83.field1384 > 0 || class46.field775 == 1) {
                class14.method65(arg0 ^ 0x6E);
            }
            if (var1 == 1 && class83.field1384 > 0 || class46.field775 == 2) {
                class180.method1312((byte) -120);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class77.field1281;
            int var8 = class269.field4344;
            if ((class169.field2756 - 10) > var8 || (class96.field1543 + class169.field2756 + 10) < var8 || var7 < class67.field1114 - 10 || (class72.field1211 + class67.field1114 + 10) < var7) {
                class286.field4537 = false;
                class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class169.field2756;
        int var10 = class67.field1114;
        int var11 = class96.field1543;
        int var12 = class309.field4941;
        int var13 = -1;
        int var14 = class42.field609;
        for (int var15 = 0; var15 < class83.field1384; var15++) {
            if (class65.field1078) {
                int var16 = (class83.field1384 - var15 - 1) * 15 + var10 + 33;
                if (var9 < var12 && var9 + var11 > var12 && var16 - 13 < var14 && var14 < var16 + 3) {
                    var13 = var15;
                }
            } else {
                int var17 = (class83.field1384 - var15 - 1) * 15 + var10 + 31;
                if (var12 > var9 && var12 < (var9 + var11) && var14 > var17 - 13 && var14 < var17 + 3) {
                    var13 = var15;
                }
            }
        }
        if (var13 != -1) {
            class233.method1575(123, var13);
        }
        class286.field4537 = false;
        class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)I")
    public int method654(int arg0) {
        if (arg0 != -1) {
            method834((class211) null, (byte) 93);
        }
        field1880++;
        return -1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lag;B)V")
    public static final void method834(class211 arg0, byte arg1) {
        field1875++;
        if (arg1 != -57) {
            method834((class211) null, (byte) 82);
        }
        if (class159.field2536 == arg0.field3439) {
            class73.field1227[arg0.field3406] = true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[[I")
    public int[][] method47(int arg0, int arg1) {
        int var3 = 66 / ((arg1 - 37) / 38);
        field1876++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public void method655(byte arg0) {
        if (this.field1885) {
            this.field1883.method535((byte) 26);
            this.field1883 = null;
        } else {
            this.field1886.method420((byte) -116);
            this.field1886 = null;
        }
        if (arg0 > -54) {
            this.field1888 = -64;
        }
        field1895++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)V")
    public final void method835(int arg0, byte arg1, int arg2) {
        field1884++;
        if (arg1 != 53) {
            this.method654(95);
        }
        int var4 = this.field1888 == 255 ? arg0 : this.field1888;
        if (this.field1885) {
            this.field1883 = new class78(var4, arg0, arg2);
        } else {
            this.field1886 = new class62(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)V")
    public static void method836(int arg0) {
        if (arg0 == -35) {
            field1887 = null;
            field1890 = null;
            field1893 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)[I")
    public final int[] method837(int arg0, int arg1, int arg2) {
        field1894++;
        if (arg0 != 0) {
            this.field1888 = 47;
        }
        return this.field1891[arg1].field1885 ? this.field1891[arg1].method46(arg0 ^ 0x2, arg2) : this.field1891[arg1].method47(arg2, arg0 + 79)[0];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lwd;II)V")
    public void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            method836(77);
        }
        field1877++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)[[I")
    public final int[][] method838(int arg0, int arg1, int arg2) {
        field1882++;
        if (arg1 != 0) {
            this.field1886 = null;
        }
        if (this.field1891[arg0].field1885) {
            int[] var4 = this.field1891[arg0].method46(arg1 + 2, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1891[arg0].method47(arg2, -1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IZ)V")
    public class117(int arg0, boolean arg1) {
        this.field1891 = new class117[arg0];
        this.field1885 = arg1;
    }
}
