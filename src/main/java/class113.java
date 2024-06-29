import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class113 {

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    private int field1633 = 0;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field1640 = 0;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    private int field1630 = 128;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    private int field1643 = 0;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field1628 = -1;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "B")
    public byte field1642 = 0;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    private int field1641 = 128;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    private int field1649 = -1;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "Z")
    public boolean field1650 = false;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lin;")
    public static class380 field1625 = new class380(98, 3);

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Lmca;")
    public static class41 field1647 = null;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lrk;")
    public class290 field1631;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "[S")
    private short[] field1627;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[S")
    private short[] field1629;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[S")
    private short[] field1634;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[S")
    private short[] field1637;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLol;)V")
    public static final void method932(byte arg0, class431 arg1) {
        field1636++;
        if (arg0 >= -103) {
            method932((byte) 118, null);
        }
        byte[] var2 = new byte[24];
        if (class523.field7324 != null) {
            try {
                class523.field7324.method1400(0L, (byte) 2);
                class523.field7324.method1403((byte) -94, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2514(var2, 24, (byte) -113, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILol;I)V")
    private final void method933(int arg0, class431 arg1, int arg2) {
        field1632++;
        if (arg2 == 1) {
            this.field1639 = arg1.method2565((byte) -112);
        } else if (arg2 == 2) {
            this.field1628 = arg1.method2565((byte) -126);
        } else if (arg2 == 4) {
            this.field1641 = arg1.method2565((byte) -87);
        } else if (arg2 == 5) {
            this.field1630 = arg1.method2565((byte) -100);
        } else if (arg2 == 6) {
            this.field1633 = arg1.method2565((byte) -117);
        } else if (arg2 == 7) {
            this.field1643 = arg1.method2557(14929);
        } else if (arg2 == 8) {
            this.field1640 = arg1.method2557(14929);
        } else if (arg2 == 9) {
            this.field1642 = 3;
            this.field1649 = 8224;
        } else if (arg2 == 10) {
            this.field1650 = true;
        } else if (arg2 == 11) {
            this.field1642 = 1;
        } else if (arg2 == 12) {
            this.field1642 = 4;
        } else if (arg2 == 13) {
            this.field1642 = 5;
        } else if (arg2 == 14) {
            this.field1642 = 2;
            this.field1649 = arg1.method2557(14929) * 256;
        } else if (arg2 == 15) {
            this.field1642 = 3;
            this.field1649 = arg1.method2565((byte) -87);
        } else if (arg2 == 16) {
            this.field1642 = 3;
            this.field1649 = arg1.method2526(arg0 + 9);
        } else if (arg2 == 40) {
            int var6 = arg1.method2557(14929);
            this.field1634 = new short[var6];
            this.field1627 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1634[var7] = (short) arg1.method2565((byte) -92);
                this.field1627[var7] = (short) arg1.method2565((byte) -104);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method2557(arg0 ^ 0x3A59);
            this.field1637 = new short[var4];
            this.field1629 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1637[var5] = (short) arg1.method2565((byte) -115);
                this.field1629[var5] = (short) arg1.method2565((byte) -96);
            }
        }
        if (arg0 != 8) {
            this.field1637 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
    public static final void method934(int arg0, int arg1, int arg2) {
        int var3 = -86 / ((arg2 + 10) / 36);
        if (class751.field10428 > class751.field10425) {
            class751.field10425 = (float) ((double) class751.field10425 / 30.0D + (double) class751.field10425);
            if (class751.field10425 > class751.field10428) {
                class751.field10425 = class751.field10428;
            }
            class274.method1744(1);
            class751.field10424 = (int) class751.field10425 >> 1;
            class751.field10429 = class251.method1668(false, class751.field10424);
        } else if (class751.field10425 > class751.field10428) {
            class751.field10425 = (float) ((double) class751.field10425 - (double) class751.field10425 / 30.0D);
            if (class751.field10428 > class751.field10425) {
                class751.field10425 = class751.field10428;
            }
            class274.method1744(1);
            class751.field10424 = (int) class751.field10425 >> 1;
            class751.field10429 = class251.method1668(false, class751.field10424);
        }
        field1635++;
        if (class414.field5684 != -1 && class630.field8932 != -1) {
            int var4 = class414.field5684 - class761.field10553;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class630.field8932 - class488.field6705;
            class761.field10553 += var4;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            if (var4 == 0 && var5 == 0) {
                class414.field5684 = -1;
                class630.field8932 = -1;
            }
            class488.field6705 += var5;
            class274.method1744(1);
        }
        if (class33.field410 > 0) {
            class482.field6622--;
            if (class482.field6622 == 0) {
                class33.field410--;
                class482.field6622 = 100;
            }
        } else {
            class727.field10134 = -1;
            class752.field10460 = -1;
        }
        if (!class716.field9999 || class148.field2381 == null) {
            return;
        }
        for (class343 var6 = (class343) class148.field2381.method3731((byte) -111); var6 != null; var6 = (class343) class148.field2381.method3729((byte) -127)) {
            class548 var7 = class751.field10415.method4105(var6.field4875.field10634, -121);
            if (var6.method2104(arg1, arg0, -124)) {
                if (var7.field7611 != null) {
                    if (var7.field7611[4] != null) {
                        class526.method3076(-1, false, (long) var6.field4875.field10634, 500, var7.field7622, 0, var7.field7580, false, true, -1, (long) var6.field4875.field10634, 1010, var7.field7611[4]);
                    }
                    if (var7.field7611[3] != null) {
                        class526.method3076(-1, false, (long) var6.field4875.field10634, 500, var7.field7622, 0, var7.field7580, false, true, -1, (long) var6.field4875.field10634, 1004, var7.field7611[3]);
                    }
                    if (var7.field7611[2] != null) {
                        class526.method3076(-1, false, (long) var6.field4875.field10634, 500, var7.field7622, 0, var7.field7580, false, true, -1, (long) var6.field4875.field10634, 1012, var7.field7611[2]);
                    }
                    if (var7.field7611[1] != null) {
                        class526.method3076(-1, false, (long) var6.field4875.field10634, 500, var7.field7622, 0, var7.field7580, false, true, -1, (long) var6.field4875.field10634, 1003, var7.field7611[1]);
                    }
                    if (var7.field7611[0] != null) {
                        class526.method3076(-1, false, (long) var6.field4875.field10634, 500, var7.field7622, 0, var7.field7580, false, true, -1, (long) var6.field4875.field10634, 1011, var7.field7611[0]);
                    }
                }
                if (!var6.field4875.field10635) {
                    var6.field4875.field10635 = true;
                    class46.method356(class460.field6282, var6.field4875.field10634, var7.field7580);
                }
                if (var6.field4875.field10635) {
                    class46.method356(class273.field3837, var6.field4875.field10634, var7.field7580);
                }
            } else if (var6.field4875.field10635) {
                var6.field4875.field10635 = false;
                class46.method356(class285.field4202, var6.field4875.field10634, var7.field7580);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ls;Lha;IIIILbr;ZIBILs;II)Lka;")
    private final class233 method935(class419 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, class564 arg6, boolean arg7, int arg8, byte arg9, int arg10, class419 arg11, int arg12, int arg13) {
        field1646++;
        int var15 = 19 % ((arg8 + 30) / 34);
        int var16 = arg2;
        class98 var17 = this.field1628 == -1 || arg4 == -1 ? null : arg6.method3287(97, this.field1628);
        boolean var18 = arg7 & this.field1642 != 0;
        if (var17 != null) {
            var16 = arg2 | var17.method812(false, arg10, false, arg4);
        }
        if (var18) {
            var16 |= this.field1642 == 3 ? 7 : 2;
        }
        if (this.field1630 != 128) {
            var16 |= 0x2;
        }
        if (this.field1641 != 128 || this.field1633 != 0) {
            var16 |= 0x5;
        }
        class494 var19 = this.field1631.field4240;
        class233 var20;
        synchronized (this.field1631.field4240) {
            var20 = (class233) this.field1631.field4240.method2882((long) (this.field1645 |= arg1.field6448 << 29), (byte) -124);
        }
        if (var20 == null || arg1.method497(var20.method591(), var16) != 0) {
            if (var20 != null) {
                var16 = arg1.method426(var16, var20.method591());
            }
            int var21 = var16;
            if (this.field1634 != null) {
                var21 = var16 | 0x4000;
            }
            if (this.field1637 != null) {
                var21 |= 0x8000;
            }
            class678 var22 = class157.method1211(-5, this.field1631.field4235, 0, this.field1639);
            if (var22 == null) {
                return null;
            }
            if (var22.field9567 < 13) {
                var22.method3805(1, 2);
            }
            var20 = arg1.method514(var22, var21, this.field1631.field4241, this.field1643 + 64, this.field1640 - -850);
            if (this.field1634 != null) {
                for (int var23 = 0; var23 < this.field1634.length; var23++) {
                    var20.method563(this.field1634[var23], this.field1627[var23]);
                }
            }
            if (this.field1637 != null) {
                for (int var24 = 0; var24 < this.field1637.length; var24++) {
                    var20.method594(this.field1637[var24], this.field1629[var24]);
                }
            }
            var20.method523(var16);
            class494 var25 = this.field1631.field4240;
            synchronized (this.field1631.field4240) {
                this.field1631.field4240.method2890(-7307, (long) (this.field1645 |= arg1.field6448 << 29), var20);
            }
        }
        class233 var26 = var17 == null ? var20.method585(arg9, var16, true) : var17.method808(var16, 0, arg5, arg9, var20, arg10, arg4, 0);
        if (this.field1641 != 128 || this.field1630 != 128) {
            var26.method564(this.field1641, this.field1630, this.field1641);
        }
        if (this.field1633 != 0) {
            if (this.field1633 == 90) {
                var26.method599(4096);
            }
            if (this.field1633 == 180) {
                var26.method599(8192);
            }
            if (this.field1633 == 270) {
                var26.method599(12288);
            }
        }
        if (var18) {
            var26.method554(this.field1642, this.field1649, arg0, arg11, arg13, arg12, arg3);
        }
        var26.method523(arg2);
        return var26;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(BLol;)V")
    public final void method936(byte arg0, class431 arg1) {
        if (arg0 != 4) {
            return;
        }
        while (true) {
            int var3 = arg1.method2557(arg0 + 14925);
            if (var3 == 0) {
                field1648++;
                return;
            }
            this.method933(8, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method937(int arg0) {
        if (arg0 != 2) {
            field1647 = null;
        }
        field1625 = null;
        field1647 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILha;IILbr;I)Lka;")
    public final class233 method938(int arg0, int arg1, class475 arg2, int arg3, int arg4, class564 arg5, int arg6) {
        if (arg6 != 29582) {
            this.field1633 = -94;
        }
        field1626++;
        return this.method935(null, arg2, arg4, 0, arg0, arg3, arg5, false, arg6 - 29688, (byte) 2, arg1, null, 0, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;ILs;ZIIILbr;IILs;II)Lka;")
    public final class233 method939(class475 arg0, int arg1, class419 arg2, boolean arg3, int arg4, int arg5, int arg6, class564 arg7, int arg8, int arg9, class419 arg10, int arg11, int arg12) {
        if (arg4 <= 120) {
            return null;
        } else {
            field1644++;
            return this.method935(arg2, arg0, arg6, arg5, arg11, arg9, arg7, arg3, -88, (byte) 2, arg12, arg10, arg8, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBILbr;ILha;I)Lka;")
    public final class233 method940(int arg0, int arg1, byte arg2, int arg3, class564 arg4, int arg5, class475 arg6, int arg7) {
        if (arg7 != -17413) {
            this.field1642 = -108;
        }
        field1638++;
        return this.method935(null, arg6, arg3, 0, arg1, arg5, arg4, false, 123, arg2, arg0, null, 0, 0);
    }
}
