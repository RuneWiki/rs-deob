import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lqk;")
    private class65 field129 = new class65();

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lqk;")
    private class65 field143 = new class65();

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lqk;")
    private class65 field149 = new class65();

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lqk;")
    private class65 field151 = new class65();

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lcg;")
    private class316 field152 = new class316(4);

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "B")
    private byte field157 = 0;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public volatile int field158 = 0;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public volatile int field159 = 0;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lcg;")
    private class316 field156 = new class316(8);

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[J")
    public static long[] field137 = new long[1000];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lqc;")
    public static class99 field139 = new class99(64);

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lik;")
    public static class17 field150 = new class17(512);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "J")
    private long field155;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lnj;")
    private class223 field153;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lqf;")
    private class59 field160;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 11)
    public final void method72(byte arg0) {
        field146++;
        if (this.field153 == null) {
            return;
        }
        try {
            int var2 = -21 / ((-arg0 - 43) / 51);
            this.field152.field4777 = 0;
            this.field152.method2184((byte) 89, 7);
            this.field152.method2205(-1544895920, 0);
            this.field153.method1575(4, 0, 5000, this.field152.field4798);
        } catch (IOException var6) {
            try {
                this.field153.method1577((byte) -8);
            } catch (Exception var5) {
            }
            this.field153 = null;
            this.field158++;
            this.field159 = -2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 39)
    public static final void method73(int arg0, int arg1, int arg2) {
        field141++;
        class143 var3 = class163.method1176((byte) 114, arg0, 6);
        var3.method1032((byte) 124);
        if (arg2 > 39) {
            var3.field1965 = arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 54)
    private final void method74(byte arg0) {
        field144++;
        if (this.field153 == null) {
            return;
        }
        try {
            this.field152.field4777 = 0;
            this.field152.method2184((byte) 89, 6);
            this.field152.method2205(-1544895920, 3);
            if (arg0 != 1) {
                return;
            }
            this.field153.method1575(4, 0, 5000, this.field152.field4798);
        } catch (IOException var5) {
            try {
                this.field153.method1577((byte) -10);
            } catch (Exception var4) {
            }
            this.field158++;
            this.field159 = -2;
            this.field153 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Z", line = 83)
    public final boolean method75(byte arg0) {
        field147++;
        if (this.field153 != null) {
            long var2 = class29.method174(27763);
            int var4 = (int) (var2 - this.field155);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field155 = var2;
            this.field154 += var4;
            if (this.field154 > 30000) {
                try {
                    this.field153.method1577((byte) -121);
                } catch (Exception var31) {
                }
                this.field153 = null;
            }
        }
        if (this.field153 == null) {
            return this.method84((byte) 68) == 0 && this.method76((byte) -104) == 0;
        }
        try {
            this.field153.method1576(-124);
            for (class59 var6 = (class59) this.field129.method442(-67); var6 != null; var6 = (class59) this.field129.method444((byte) -126)) {
                this.field152.field4777 = 0;
                this.field152.method2184((byte) 89, 1);
                this.field152.method2205(-1544895920, (int) var6.field414);
                this.field153.method1575(4, 0, 5000, this.field152.field4798);
                this.field143.method443(true, var6);
            }
            int var7 = -3 % ((24 - arg0) / 45);
            for (class59 var8 = (class59) this.field149.method442(-84); var8 != null; var8 = (class59) this.field149.method444((byte) -89)) {
                this.field152.field4777 = 0;
                this.field152.method2184((byte) 89, 0);
                this.field152.method2205(-1544895920, (int) var8.field414);
                this.field153.method1575(4, 0, 5000, this.field152.field4798);
                this.field151.method443(true, var8);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field153.method1572(0);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                byte var11 = 0;
                if (this.field160 == null) {
                    var11 = 8;
                } else if (this.field160.field803 == 0) {
                    var11 = 1;
                }
                this.field154 = 0;
                if (var11 > 0) {
                    int var12 = var11 - this.field156.field4777;
                    if (var12 > var10) {
                        var12 = var10;
                    }
                    this.field153.method1573(this.field156.field4798, var12, -19451, this.field156.field4777);
                    if (this.field157 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field156.field4798[this.field156.field4777 + var13] = (byte) client.method823(this.field156.field4798[this.field156.field4777 + var13], this.field157);
                        }
                    }
                    this.field156.field4777 += var12;
                    if (var11 <= this.field156.field4777) {
                        if (this.field160 == null) {
                            this.field156.field4777 = 0;
                            int var14 = this.field156.method2219(16448);
                            int var15 = this.field156.method2220((byte) 106);
                            int var16 = this.field156.method2219(16448);
                            int var17 = var16 & 0x7F;
                            boolean var18 = (var16 & 0x80) != 0;
                            Object var19 = null;
                            long var20 = (long) ((var14 << 16) + var15);
                            int var22 = this.field156.method2172((byte) 71);
                            class59 var23;
                            if (var18) {
                                for (var23 = (class59) this.field151.method442(-118); var23 != null && var23.field414 != var20; var23 = (class59) this.field151.method444((byte) 81)) {
                                }
                            } else {
                                for (var23 = (class59) this.field143.method442(-98); var23 != null && var23.field414 != var20; var23 = (class59) this.field143.method444((byte) 65)) {
                                }
                            }
                            if (var23 == null) {
                                throw new IOException();
                            }
                            this.field160 = var23;
                            int var24 = var17 == 0 ? 5 : 9;
                            this.field160.field798 = new class316(var22 + var24 + this.field160.field802);
                            this.field160.field798.method2184((byte) 89, var17);
                            this.field160.field798.method2188(255, var22);
                            this.field160.field803 = 8;
                            this.field156.field4777 = 0;
                        } else if (this.field160.field803 != 0) {
                            throw new IOException();
                        } else if (this.field156.field4798[0] == -1) {
                            this.field160.field803 = 1;
                            this.field156.field4777 = 0;
                        } else {
                            this.field160 = null;
                        }
                    }
                } else {
                    int var25 = this.field160.field798.field4798.length - this.field160.field802;
                    int var26 = 512 - this.field160.field803;
                    if (var25 - this.field160.field798.field4777 < var26) {
                        var26 = var25 - this.field160.field798.field4777;
                    }
                    if (var26 > var10) {
                        var26 = var10;
                    }
                    this.field153.method1573(this.field160.field798.field4798, var26, -19451, this.field160.field798.field4777);
                    if (this.field157 != 0) {
                        for (int var27 = 0; var27 < var26; var27++) {
                            this.field160.field798.field4798[this.field160.field798.field4777 + var27] = (byte) client.method823(this.field160.field798.field4798[this.field160.field798.field4777 + var27], this.field157);
                        }
                    }
                    this.field160.field803 += var26;
                    this.field160.field798.field4777 += var26;
                    if (this.field160.field798.field4777 == var25) {
                        this.field160.method206(-1);
                        this.field160.field115 = false;
                        this.field160 = null;
                    } else if (this.field160.field803 == 512) {
                        this.field160.field803 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var32) {
            try {
                this.field153.method1577((byte) 104);
            } catch (Exception var30) {
            }
            this.field159 = -2;
            this.field153 = null;
            this.field158++;
            return this.method84((byte) 113) == 0 && this.method76((byte) -77) == 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)I", line = 365)
    private final int method76(byte arg0) {
        if (arg0 >= -75) {
            this.method82(false);
        }
        field145++;
        return this.field149.method447((byte) 11) + this.field151.method447((byte) 11);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBZIZ)Lqf;", line = 382)
    public final class59 method77(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field148++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class59 var8 = new class59();
        var8.field120 = arg4;
        var8.field414 = var6;
        var8.field802 = arg1;
        if (arg4) {
            if (this.method84((byte) 54) >= 20) {
                throw new RuntimeException();
            }
            this.field129.method443(true, var8);
        } else if (this.method76((byte) -93) < 20) {
            this.field149.method443(true, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg2) {
            method86(60);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 425)
    public final void method78(boolean arg0) {
        if (!arg0) {
            this.method75((byte) -102);
        }
        field136++;
        try {
            this.field153.method1577((byte) 79);
        } catch (Exception var3) {
        }
        this.field157 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field158++;
        this.field153 = null;
        this.field159 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 443)
    public static final void method79(int arg0) {
        field131++;
        class259.field3812 = 0;
        class252.field3614 = 0;
        class253.method1727(87);
        class316.method2201(5);
        class338.method2341((byte) -42);
        for (int var1 = 0; var1 < class259.field3812; var1++) {
            int var2 = class290.field4323[var1];
            if (class329.field4966 != class42.field484[var2].field3697) {
                if (class42.field484[var2].field4961.method1254(991)) {
                    class230.method1598(9707, class42.field484[var2]);
                }
                class42.field484[var2].method2301((class181) null, (byte) -6);
                class42.field484[var2] = null;
            }
        }
        if (class199.field2833 != class157.field2165.field4777) {
            throw new RuntimeException("gnp1 pos:" + class157.field2165.field4777 + " psize:" + class199.field2833);
        } else if (arg0 == -1) {
            for (int var3 = 0; var3 < class338.field5084; var3++) {
                if (class42.field484[class257.field3807[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class338.field5084);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z", line = 497)
    public final boolean method80(int arg0) {
        field138++;
        if (arg0 != -17907) {
            this.method72((byte) -25);
        }
        return this.method84((byte) 97) >= 20;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 509)
    public final void method81(int arg0) {
        field135++;
        if (this.field153 != null) {
            this.field153.method1578((byte) -75);
        }
        if (arg0 != -1) {
            this.method83((byte) 55);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)Z", line = 522)
    public final boolean method82(boolean arg0) {
        field130++;
        if (arg0) {
            return this.method76((byte) -107) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V", line = 536)
    public final void method83(byte arg0) {
        if (arg0 != -5) {
            method86(103);
        }
        field142++;
        if (this.field153 != null) {
            this.field153.method1577((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)I", line = 550)
    public final int method84(byte arg0) {
        field133++;
        if (arg0 < 50) {
            this.field149 = (class65) null;
        }
        return this.field129.method447((byte) 11) + this.field143.method447((byte) 11);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lnj;ZI)V", line = 563)
    public final void method85(class223 arg0, boolean arg1, int arg2) {
        if (this.field153 != null) {
            try {
                this.field153.method1577((byte) 1);
            } catch (Exception var11) {
            }
            this.field153 = null;
        }
        field134++;
        this.field153 = arg0;
        this.method74((byte) 1);
        this.method87(2, arg1);
        this.field156.field4777 = 0;
        this.field160 = null;
        while (true) {
            class59 var5 = (class59) this.field143.method445((byte) 120);
            if (var5 == null) {
                while (true) {
                    class59 var6 = (class59) this.field151.method445((byte) 120);
                    if (var6 == null) {
                        if (this.field157 != 0) {
                            try {
                                this.field152.field4777 = 0;
                                this.field152.method2184((byte) 89, 4);
                                this.field152.method2184((byte) 89, this.field157);
                                this.field152.method2189(-1, 0);
                                this.field153.method1575(4, 0, 5000, this.field152.field4798);
                            } catch (IOException var10) {
                                try {
                                    this.field153.method1577((byte) 52);
                                } catch (Exception var9) {
                                }
                                this.field153 = null;
                                this.field159 = -2;
                                this.field158++;
                            }
                        }
                        if (arg2 == -1) {
                            this.field154 = 0;
                            this.field155 = class29.method174(27763);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field149.method443(true, var6);
                }
            }
            this.field129.method443(true, var5);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 638)
    public static void method86(int arg0) {
        field137 = null;
        field150 = null;
        if (arg0 != -24143) {
            field140 = -47;
        }
        field139 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V", line = 650)
    public final void method87(int arg0, boolean arg1) {
        field132++;
        if (this.field153 == null || arg0 != 2) {
            return;
        }
        try {
            this.field152.field4777 = 0;
            this.field152.method2184((byte) 89, arg1 ? 2 : 3);
            this.field152.method2205(-1544895920, 0);
            this.field153.method1575(4, 0, 5000, this.field152.field4798);
        } catch (IOException var6) {
            try {
                this.field153.method1577((byte) 52);
            } catch (Exception var5) {
            }
            this.field158++;
            this.field153 = null;
            this.field159 = -2;
        }
    }
}
