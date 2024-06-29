import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class251 extends class304 {

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    private int field3793 = 16;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    private int field3790 = 0;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    private int field3791 = 2000;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field3787 = 0;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    private int field3803 = 4096;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Lec;")
    public static class99 field3785 = new class99(50);

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "[Lcj;")
    public static class317[] field3798 = new class317[50];

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field3802 = "wave2:";

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "Lco;")
    public static class48 field3801;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "Ljd;")
    public static class95 field3799;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "[[Lfn;")
    public static class58[][] field3797;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V", line = 4)
    public static void method1717(byte arg0) {
        if (arg0 <= 35) {
            return;
        }
        field3797 = (class58[][]) null;
        field3798 = null;
        field3785 = null;
        field3799 = null;
        field3802 = null;
        field3801 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lua;", line = 23)
    public static final class304 method1718(byte arg0, int arg1) {
        field3804++;
        if (arg1 == 0) {
            return new class72();
        } else if (arg1 == 1) {
            return new class263();
        } else if (arg1 == 2) {
            return new class62();
        } else if (arg1 == 3) {
            return new class60();
        } else if (arg1 == 4) {
            return new class13();
        } else if (arg1 == 5) {
            return new class149();
        } else if (arg1 == 6) {
            return new class192();
        } else if (arg1 == 7) {
            return new class27();
        } else if (arg1 == 8) {
            return new class230();
        } else if (arg1 == 9) {
            return new class183();
        } else if (arg1 == 10) {
            return new class29();
        } else if (arg1 == 11) {
            return new class139();
        } else if (arg1 == 12) {
            return new class226();
        } else if (arg1 == 13) {
            return new class260();
        } else if (arg1 == 14) {
            return new class190();
        } else if (arg1 == 15) {
            return new class167();
        } else if (arg1 == 16) {
            return new class180();
        } else if (arg1 == 17) {
            return new class31();
        } else if (arg1 == 18) {
            return new class142();
        } else if (arg1 == 19) {
            return new class103();
        } else if (arg1 == 20) {
            return new class100();
        } else if (arg1 == 21) {
            return new class7();
        } else if (arg1 == 22) {
            return new class170();
        } else if (arg1 == 23) {
            return new class245();
        } else if (arg1 == 24) {
            return new class196();
        } else if (arg1 == 25) {
            return new class213();
        } else if (arg1 == 26) {
            return new class101();
        } else if (arg1 == 27) {
            return new class89();
        } else if (arg1 == 28) {
            return new class235();
        } else if (arg1 == 29) {
            return new class43();
        } else if (arg1 == 30) {
            return new class154();
        } else if (arg1 == 31) {
            return new class146();
        } else if (arg1 == 32) {
            return new class81();
        } else if (arg1 == 33) {
            return new class23();
        } else if (arg1 == 34) {
            return new class313();
        } else if (arg1 == 35) {
            return new class261();
        } else if (arg1 == 36) {
            return new class165();
        } else if (arg1 == 37) {
            return new class77();
        } else if (arg1 == 38) {
            return new class251();
        } else if (arg1 == 39) {
            return new class216();
        } else {
            if (arg0 > -77) {
                field3799 = (class95) null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 344)
    public final void method100(boolean arg0) {
        class32.method251(-42);
        if (!arg0) {
            this.field3793 = -13;
        }
        field3796++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lwm;II)V", line = 356)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3789++;
        if (arg1 == 0) {
            this.field3790 = arg0.method1774((byte) -96);
        } else if (arg1 == 1) {
            this.field3791 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field3793 = arg0.method1774((byte) 28);
        } else if (arg1 == 3) {
            this.field3787 = arg0.method1755(false);
        } else if (arg1 == 4) {
            this.field3803 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            method1717((byte) -99);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILbl;)V", line = 419)
    public static final void method1719(int arg0, class296 arg1) {
        field3786++;
        if (arg0 != -31) {
            method1718((byte) 53, 63);
        }
        class174.method1303(6533, arg1, 200000);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 429)
    public class251() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V", line = 445)
    public static final void method1720(int arg0) {
        field3794++;
        class67.field966.method752(false);
        class35.field509.method752(false);
        class65.field938.method752(false);
        if (arg0 >= -36) {
            method1717((byte) -77);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Lbg;", line = 469)
    public static final class209 method1721(int arg0, int arg1) {
        field3795++;
        class209 var2 = (class209) class36.field517.method747((long) arg0, (byte) 125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field2723.method696(arg0, (byte) 101, arg1);
        class209 var4 = new class209();
        if (var3 != null) {
            var4.method1499(arg0, (byte) 24, new class254(var3));
        }
        class36.field517.method744(var4, -15692, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I", line = 488)
    public final int[] method71(int arg0, int arg1) {
        field3792++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = this.field3803 >> 1;
            int[][] var5 = this.field4669.method2341((byte) -106);
            Random var6 = new Random((long) this.field3790);
            for (int var7 = 0; var7 < this.field3791; var7++) {
                int var8 = this.field3803 > 0 ? this.field3787 - (var4 - class101.method764(this.field3803, (byte) 121, var6)) : this.field3787;
                int var9 = class101.method764(class218.field3333, (byte) 121, var6);
                int var10 = (var8 & 0xFFA) >> 4;
                int var11 = class101.method764(class109.field1648, (byte) 121, var6);
                int var12 = (class264.field4074[var10] * this.field3793 >> 12) + var9;
                int var13 = (class307.field4784[var10] * this.field3793 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var12;
                        var9 = var11;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (var9 > var12) {
                        int var19 = var9;
                        int var20 = var11;
                        var9 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var9;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class101.method764(4096, (byte) 121, var6) >> 2);
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var9; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = var26 + ((var28 - var9) * var25) + 1024;
                        int var30 = var28 & class54.field721;
                        int var31 = var21 & class65.field941;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(B)Z", line = 629)
    public static final boolean method1722(byte arg0) {
        field3800++;
        class168 var1 = class121.field1857;
        synchronized (class121.field1857) {
            if (class284.field4434 == class12.field158) {
                return false;
            }
            class211.field3245 = class90.field1298[class284.field4434];
            class280.field4356 = class293.field4529[class284.field4434];
            if (arg0 < 15) {
                field3798 = (class317[]) null;
            }
            class284.field4434 = class284.field4434 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)V", line = 657)
    public static final void method1723(byte arg0, String arg1) {
        field3788++;
        class160.field2420 = arg1;
        if (class330.field5074.field95 == null) {
            return;
        }
        try {
            String var2 = class330.field5074.field95.getParameter("cookieprefix");
            String var3 = class330.field5074.field95.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class69.method494(class105.method789((byte) 55) + 94608000000L, 0) + "; Max-Age=" + 94608000L;
            }
            class199.method1444(class330.field5074.field95, "document.cookie=\"" + var5 + "\"", (byte) 127);
        } catch (Throwable var7) {
        }
        if (arg0 != 117) {
            field3798 = (class317[]) null;
        }
    }
}
