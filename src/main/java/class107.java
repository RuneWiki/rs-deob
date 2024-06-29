import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class107 {

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    private int field1572 = 32;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "J")
    private long field1573 = class18.method109(-11121);

    @OriginalMember(owner = "client!en", name = "z", descriptor = "Z")
    private boolean field1580 = true;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "[Laca;")
    private class216[] field1582 = new class216[8];

    @OriginalMember(owner = "client!en", name = "y", descriptor = "J")
    private long field1579 = 0L;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "[Laca;")
    private class216[] field1586 = new class216[8];

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "J")
    private long field1577 = 0L;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    private int field1584 = 0;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    private int field1588 = 0;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    private int field1585 = 0;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
    public static boolean field1563 = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lht;")
    public static class393 field1555 = new class393();

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Laca;")
    private class216 field1564;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "[I")
    public int[] field1567;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 4)
    public void method861() throws Exception {
        field1581++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 12)
    public final synchronized void method862(int arg0) {
        field1583++;
        if (class125.field1935 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class125.field1935.field4500[var3] == this) {
                    class125.field1935.field4500[var3] = null;
                }
                if (class125.field1935.field4500[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class125.field1935.field4502 = true;
                while (class125.field1935.field4501) {
                    class484.method2932(true, 50L);
                }
                class125.field1935 = null;
            }
        }
        this.method865();
        this.field1560 = true;
        int var4 = -61 / ((arg0 + 15) / 47);
        this.field1567 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lpe;IIII)V", line = 55)
    public static final void method863(class109 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1569++;
        class228 var5 = arg0.method885(109);
        if (arg3 > -25) {
            method863(null, 79, -89, 23, -18);
        }
        int var6 = arg0.field1659 - arg0.field1636.field7521 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg0.field1609 > 25) {
                if (arg4 < 0 && var5.field3663 != -1) {
                    arg0.field1598 = false;
                    arg0.field1679 = var5.field3663;
                } else if (arg4 <= 0 || var5.field3654 == -1) {
                    arg0.field1679 = var5.field3668;
                } else {
                    arg0.field1679 = var5.field3654;
                }
                arg0.field1598 = false;
            } else if (!arg0.field1598 || !var5.method1594((byte) 104, arg0.field1679)) {
                arg0.field1679 = var5.method1596(92);
                arg0.field1598 = arg0.field1679 != -1;
            }
        } else if (arg0.field1687 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class116.field1801[arg2] - arg0.field1636.field7521 & 0x3FFF;
            arg0.field1598 = false;
            if (arg1 == 2 && var5.field3660 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3670 != -1) {
                    arg0.field1679 = var5.field3670;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3662 != -1) {
                    arg0.field1679 = var5.field3662;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3653 == -1) {
                    arg0.field1679 = var5.field3660;
                } else {
                    arg0.field1679 = var5.field3653;
                }
            } else if (arg1 == 0 && var5.field3661 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3689 != -1) {
                    arg0.field1679 = var5.field3689;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3699 != -1) {
                    arg0.field1679 = var5.field3699;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3656 == -1) {
                    arg0.field1679 = var5.field3661;
                } else {
                    arg0.field1679 = var5.field3656;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3691 != -1) {
                arg0.field1679 = var5.field3691;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3692 != -1) {
                arg0.field1679 = var5.field3692;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3696 == -1) {
                arg0.field1679 = var5.field3668;
            } else {
                arg0.field1679 = var5.field3696;
            }
        } else if (var6 == 0 && arg0.field1609 <= 25) {
            arg0.field1598 = false;
            if (arg1 == 2 && var5.field3660 != -1) {
                arg0.field1679 = var5.field3660;
            } else if (arg1 == 0 && var5.field3661 != -1) {
                arg0.field1679 = var5.field3661;
            } else {
                arg0.field1679 = var5.field3668;
            }
        } else {
            arg0.field1598 = false;
            if (arg1 == 2 && var5.field3660 != -1) {
                if (arg4 < 0 && var5.field3697 != -1) {
                    arg0.field1679 = var5.field3697;
                } else if (arg4 <= 0 || var5.field3683 == -1) {
                    arg0.field1679 = var5.field3660;
                } else {
                    arg0.field1679 = var5.field3683;
                }
            } else if (arg1 == 0 && var5.field3661 != -1) {
                if (arg4 < 0 && var5.field3669 != -1) {
                    arg0.field1679 = var5.field3669;
                } else if (arg4 <= 0 || var5.field3659 == -1) {
                    arg0.field1679 = var5.field3661;
                } else {
                    arg0.field1679 = var5.field3659;
                }
            } else if (arg4 < 0 && var5.field3650 != -1) {
                arg0.field1679 = var5.field3650;
            } else if (arg4 <= 0 || var5.field3695 == -1) {
                arg0.field1679 = var5.field3668;
            } else {
                arg0.field1679 = var5.field3695;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 227)
    public static void method864(byte arg0) {
        field1555 = null;
        int var1 = 71 % ((arg0 - 41) / 39);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()V", line = 236)
    public void method865() {
        field1566++;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()V", line = 243)
    public void method866() throws Exception {
        field1558++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 250)
    public void method867(Component arg0) throws Exception {
        field1556++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLaca;)V", line = 258)
    public final synchronized void method868(boolean arg0, class216 arg1) {
        field1568++;
        this.field1564 = arg1;
        if (arg0) {
            field1555 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V", line = 269)
    private final void method869(boolean arg0, int arg1) {
        field1562++;
        this.field1588 -= arg1;
        if (this.field1588 < 0) {
            this.field1588 = 0;
        }
        if (arg0) {
            this.field1579 = 110L;
        }
        if (this.field1564 != null) {
            this.field1564.method568(arg1);
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()I", line = 294)
    public int method870() throws Exception {
        field1559++;
        return this.field1574;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([II)V", line = 303)
    private final void method871(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class53.field849) {
            var3 = arg1 << 1;
        }
        class571.method3311(arg0, 0, var3);
        this.field1588 -= arg1;
        if (this.field1564 != null && this.field1588 <= 0) {
            this.field1588 += class608.field8585 >> 4;
            class197.method1477(11327, this.field1564);
            this.method875(this.field1564, 1981034469, this.field1564.method558());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class216 var10 = null;
                        class216 var11 = this.field1586[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class441 var12 = var11.field3561;
                                if (var12 == null || var12.field6418 <= var8) {
                                    var11.field3562 = true;
                                    int var13 = var11.method552();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6418 += var13;
                                    }
                                    if (var4 >= this.field1572) {
                                        break label107;
                                    }
                                    class216 var14 = var11.method532();
                                    if (var14 != null) {
                                        int var15 = var11.field3563;
                                        while (var14 != null) {
                                            this.method875(var14, 1981034469, var15 * var14.method558() >> 8);
                                            var14 = var11.method531();
                                        }
                                    }
                                    class216 var16 = var11.field3564;
                                    var11.field3564 = null;
                                    if (var10 == null) {
                                        this.field1586[var7] = var16;
                                    } else {
                                        var10.field3564 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1582[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3564;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class216 var18 = this.field1586[var17];
                this.field1586[var17] = this.field1582[var17] = null;
                while (var18 != null) {
                    class216 var19 = var18.field3564;
                    var18.field3564 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1588 < 0) {
            this.field1588 = 0;
        }
        if (this.field1564 != null) {
            this.field1564.method563(arg0, 0, arg1);
        }
        this.field1573 = class18.method109(-11121);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V", line = 463)
    public final synchronized void method872(byte arg0) {
        field1565++;
        this.field1580 = true;
        try {
            this.method866();
            if (arg0 != 64) {
                this.field1560 = false;
            }
        } catch (Exception var2) {
            this.method865();
            this.field1577 = class18.method109(arg0 - 11185) + 2000L;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 484)
    public static final void method873(int arg0, String[] arg1) {
        field1561++;
        if (arg1.length > 1) {
            for (int var2 = 0; var2 < arg1.length; var2++) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class400.method2484(26852, "Pausing for " + var3 + " seconds...");
                    class7.field74 = var2 + 1;
                    class554.field7905 = arg1;
                    class130.field2126 = (long) (var3 * 1000) + class18.method109(-11121);
                    return;
                }
                class665.field9445 = arg1[var2];
                class634.method3584(false, arg0 ^ 0x3F02);
            }
        } else {
            class665.field9445 = class665.field9445 + arg1[0];
            class174.field2996 += arg1[0].length();
        }
        if (arg0 != 16128) {
            field1563 = true;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 540)
    public static final void method874(int arg0) {
        if (arg0 < 110) {
            field1555 = null;
        }
        field1587++;
        class262.method1748(-89);
        class493.method2998((byte) -105);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Laca;II)V", line = 552)
    private final void method875(class216 arg0, int arg1, int arg2) {
        if (arg1 != 1981034469) {
            this.field1572 = -113;
        }
        field1571++;
        int var4 = arg2 >> 5;
        class216 var5 = this.field1582[var4];
        if (var5 == null) {
            this.field1586[var4] = arg0;
        } else {
            var5.field3564 = arg0;
        }
        this.field1582[var4] = arg0;
        arg0.field3563 = arg2;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 582)
    public void method876(int arg0) throws Exception {
        field1557++;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V", line = 592)
    public final synchronized void method877(byte arg0) {
        field1570++;
        if (this.field1560) {
            return;
        }
        long var2 = class18.method109(-11121);
        try {
            if (arg0 <= 84) {
                return;
            }
            if (this.field1573 + 6000L < var2) {
                this.field1573 = var2 - 6000L;
            }
            while (var2 > this.field1573 + 5000L) {
                this.method869(false, 256);
                this.field1573 += (256000 / class608.field8585);
                var2 = class18.method109(-11121);
            }
        } catch (Exception var7) {
            this.field1573 = var2;
        }
        if (this.field1567 == null) {
            return;
        }
        try {
            if (this.field1577 != 0L) {
                if (this.field1577 > var2) {
                    return;
                }
                this.method876(this.field1574);
                this.field1580 = true;
                this.field1577 = 0L;
            }
            int var4 = this.method870();
            if (this.field1585 < this.field1575 - var4) {
                this.field1585 = this.field1575 - var4;
            }
            int var5 = this.field1578 + this.field1576;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field1574) {
                this.field1574 += 1024;
                if (this.field1574 > 16384) {
                    this.field1574 = 16384;
                }
                this.method865();
                this.method876(this.field1574);
                var4 = 0;
                if ((var5 + 256) > this.field1574) {
                    var5 = this.field1574 - 256;
                    this.field1576 = var5 - this.field1578;
                }
                this.field1580 = true;
            }
            while (var5 > var4) {
                this.method871(this.field1567, 256);
                this.method861();
                var4 += 256;
            }
            if (var2 > this.field1579) {
                if (this.field1580) {
                    this.field1580 = false;
                } else if (this.field1585 == 0 && this.field1584 == 0) {
                    this.method865();
                    this.field1577 = var2 + 2000L;
                    return;
                } else {
                    this.field1576 = Math.min(this.field1584, this.field1585);
                    this.field1584 = this.field1585;
                }
                this.field1579 = var2 + 2000L;
                this.field1585 = 0;
            }
            this.field1575 = var4;
        } catch (Exception var6) {
            this.method865();
            this.field1577 = var2 + 2000L;
        }
    }
}
